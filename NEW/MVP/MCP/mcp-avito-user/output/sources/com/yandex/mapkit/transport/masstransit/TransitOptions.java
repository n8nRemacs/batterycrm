package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class TransitOptions implements Serializable {
    private int avoid;
    private TimeOptions timeOptions;

    public TransitOptions(int i12, @N TimeOptions timeOptions) {
        this.avoid = FilterVehicleTypes.NONE.value;
        if (timeOptions == null) {
            throw new IllegalArgumentException("Required field \"timeOptions\" cannot be null");
        }
        this.avoid = i12;
        this.timeOptions = timeOptions;
    }

    public int getAvoid() {
        return this.avoid;
    }

    @N
    public TimeOptions getTimeOptions() {
        return this.timeOptions;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.avoid = archive.add(Integer.valueOf(this.avoid), false).intValue();
        this.timeOptions = (TimeOptions) archive.add((Archive) this.timeOptions, false, (Class<Archive>) TimeOptions.class);
    }

    public TransitOptions() {
        this.avoid = FilterVehicleTypes.NONE.value;
    }
}
