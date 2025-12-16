package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public final class TimeOptions implements Serializable {
    private Long arrivalTime;
    private Long departureTime;

    public TimeOptions(@P Long l12, @P Long l13) {
        this.departureTime = l12;
        this.arrivalTime = l13;
    }

    @P
    public Long getArrivalTime() {
        return this.arrivalTime;
    }

    @P
    public Long getDepartureTime() {
        return this.departureTime;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.departureTime = archive.add(this.departureTime, true);
        this.arrivalTime = archive.add(this.arrivalTime, true);
    }

    public TimeOptions setArrivalTime(@P Long l12) {
        this.arrivalTime = l12;
        return this;
    }

    public TimeOptions setDepartureTime(@P Long l12) {
        this.departureTime = l12;
        return this;
    }

    public TimeOptions() {
    }
}
