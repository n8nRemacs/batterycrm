package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.Time;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class TravelEstimation implements Serializable {
    private Time arrivalTime;
    private Time departureTime;

    public TravelEstimation(@N Time time, @N Time time2) {
        if (time == null) {
            throw new IllegalArgumentException("Required field \"departureTime\" cannot be null");
        }
        if (time2 == null) {
            throw new IllegalArgumentException("Required field \"arrivalTime\" cannot be null");
        }
        this.departureTime = time;
        this.arrivalTime = time2;
    }

    @N
    public Time getArrivalTime() {
        return this.arrivalTime;
    }

    @N
    public Time getDepartureTime() {
        return this.departureTime;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.departureTime = (Time) archive.add((Archive) this.departureTime, false, (Class<Archive>) Time.class);
        this.arrivalTime = (Time) archive.add((Archive) this.arrivalTime, false, (Class<Archive>) Time.class);
    }

    public TravelEstimation() {
    }
}
