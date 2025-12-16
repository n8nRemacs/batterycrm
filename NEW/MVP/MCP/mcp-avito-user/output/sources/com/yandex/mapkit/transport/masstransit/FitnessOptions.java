package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class FitnessOptions implements Serializable {
    private boolean avoidSteep;

    public FitnessOptions(boolean z12) {
        this.avoidSteep = z12;
    }

    public boolean getAvoidSteep() {
        return this.avoidSteep;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.avoidSteep = archive.add(this.avoidSteep);
    }

    public FitnessOptions() {
        this.avoidSteep = false;
    }
}
