package edu.unisabana.tyvs.domain.service;

import edu.unisabana.tyvs.domain.model.*;

public class Registry {

    public RegisterResult registerVoter(Person p) {

        if (p == null) {
            return RegisterResult.INVALID;
        }

        if (!p.isAlive()) {
            return RegisterResult.DEAD;
        }

        return RegisterResult.VALID;
    }
}