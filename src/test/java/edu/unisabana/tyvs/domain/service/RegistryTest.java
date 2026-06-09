package edu.unisabana.tyvs.domain.service;

import edu.unisabana.tyvs.domain.model.*;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    @Test
    public void shouldRegisterValidPerson() {
        // Arrange: preparar los datos y el objeto a probar
        Registry registry = new Registry();
        Person person = new Person("Ana", 1, 30, Gender.FEMALE, true);

        // Act: ejecutar la acción que queremos probar
        RegisterResult result = registry.registerVoter(person);

        // Assert: verificar el resultado esperado
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void shouldRejectDeadPerson() {

        Registry registry = new Registry();

        Person person = new Person(
                "John",
                123,
                30,
                Gender.MALE,
                false); // dead

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.DEAD, result);
    }


    @Test
    public void shouldReturnInvalidWhenPersonIsNull() {

        Registry registry = new Registry();

        RegisterResult result = registry.registerVoter(null);

        assertEquals(RegisterResult.INVALID, result);
    }

    @Test
    public void shouldRejectWhenIdIsZeroOrNegative() {

        Registry registry = new Registry();

        Person person = new Person(
                "Juan",
                0,
                25,
                Gender.MALE,
                true);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.INVALID, result);
    }

    @Test
    public void shouldRejectUnderageAt17() {

        Registry registry = new Registry();

        Person person = new Person(
                "Juan",
                1,
                17,
                Gender.MALE,
                true);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void shouldAcceptAdultAt18() {

        Registry registry = new Registry();

        Person person = new Person(
                "Juan",
                1,
                18,
                Gender.MALE,
                true);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void shouldAcceptMaxAge120() {

        Registry registry = new Registry();

        Person person = new Person(
                "Juan",
                1,
                120,
                Gender.MALE,
                true);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.VALID, result);
    }

}

