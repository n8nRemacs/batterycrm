package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class Weight implements Serializable {
    private LocalizedValue time;
    private int transfersCount;
    private LocalizedValue walkingDistance;

    public Weight(@N LocalizedValue localizedValue, @N LocalizedValue localizedValue2, int i12) {
        if (localizedValue == null) {
            throw new IllegalArgumentException("Required field \"time\" cannot be null");
        }
        if (localizedValue2 == null) {
            throw new IllegalArgumentException("Required field \"walkingDistance\" cannot be null");
        }
        this.time = localizedValue;
        this.walkingDistance = localizedValue2;
        this.transfersCount = i12;
    }

    @N
    public LocalizedValue getTime() {
        return this.time;
    }

    public int getTransfersCount() {
        return this.transfersCount;
    }

    @N
    public LocalizedValue getWalkingDistance() {
        return this.walkingDistance;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.time = (LocalizedValue) archive.add((Archive) this.time, false, (Class<Archive>) LocalizedValue.class);
        this.walkingDistance = (LocalizedValue) archive.add((Archive) this.walkingDistance, false, (Class<Archive>) LocalizedValue.class);
        this.transfersCount = archive.add(this.transfersCount);
    }

    public Weight() {
    }
}
