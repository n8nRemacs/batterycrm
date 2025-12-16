package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class RouteOptions implements Serializable {
    private FitnessOptions fitnessOptions;

    public RouteOptions(@N FitnessOptions fitnessOptions) {
        if (fitnessOptions == null) {
            throw new IllegalArgumentException("Required field \"fitnessOptions\" cannot be null");
        }
        this.fitnessOptions = fitnessOptions;
    }

    @N
    public FitnessOptions getFitnessOptions() {
        return this.fitnessOptions;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.fitnessOptions = (FitnessOptions) archive.add((Archive) this.fitnessOptions, false, (Class<Archive>) FitnessOptions.class);
    }

    public RouteOptions() {
    }
}
