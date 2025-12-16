package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class Summary implements Serializable {
    private Flags flags;
    private NonAvoidedFeatures nonAvoidedFeatures;
    private Weight weight;

    public Summary(@N Weight weight, @N Flags flags, @N NonAvoidedFeatures nonAvoidedFeatures) {
        if (weight == null) {
            throw new IllegalArgumentException("Required field \"weight\" cannot be null");
        }
        if (flags == null) {
            throw new IllegalArgumentException("Required field \"flags\" cannot be null");
        }
        if (nonAvoidedFeatures == null) {
            throw new IllegalArgumentException("Required field \"nonAvoidedFeatures\" cannot be null");
        }
        this.weight = weight;
        this.flags = flags;
        this.nonAvoidedFeatures = nonAvoidedFeatures;
    }

    @N
    public Flags getFlags() {
        return this.flags;
    }

    @N
    public NonAvoidedFeatures getNonAvoidedFeatures() {
        return this.nonAvoidedFeatures;
    }

    @N
    public Weight getWeight() {
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.flags = (Flags) archive.add((Archive) this.flags, false, (Class<Archive>) Flags.class);
        this.nonAvoidedFeatures = (NonAvoidedFeatures) archive.add((Archive) this.nonAvoidedFeatures, false, (Class<Archive>) NonAvoidedFeatures.class);
    }

    public Summary() {
    }
}
