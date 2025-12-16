package com.yandex.mapkit.transport.masstransit;

/* loaded from: classes7.dex */
public enum FilterVehicleTypes {
    NONE(0),
    BUS(1),
    MINIBUS(2),
    RAILWAY(4),
    SUBURBAN(8),
    TRAMWAY(16),
    TROLLEYBUS(32),
    UNDERGROUND(64);

    public final int value;

    FilterVehicleTypes(int i12) {
        this.value = i12;
    }
}
