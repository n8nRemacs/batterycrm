package com.yandex.runtime.sensors.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes8.dex */
public class GnssClock implements Serializable {
    private Double biasNanos;
    private boolean biasNanos__is_initialized;
    private Double biasUncertaintyNanos;
    private boolean biasUncertaintyNanos__is_initialized;
    private Double driftNanosPerSecond;
    private boolean driftNanosPerSecond__is_initialized;
    private Double driftNanosUncertaintyPerSecond;
    private boolean driftNanosUncertaintyPerSecond__is_initialized;
    private Long fullBiasNanos;
    private boolean fullBiasNanos__is_initialized;
    private int hardwareClockDiscontinuityCount;
    private boolean hardwareClockDiscontinuityCount__is_initialized;
    private Integer leapSecond;
    private boolean leapSecond__is_initialized;
    private NativeObject nativeObject;
    private long timeNanos;
    private boolean timeNanos__is_initialized;
    private Double timeUncertaintyNanos;
    private boolean timeUncertaintyNanos__is_initialized;

    public GnssClock() {
        this.timeNanos__is_initialized = false;
        this.timeUncertaintyNanos__is_initialized = false;
        this.leapSecond__is_initialized = false;
        this.fullBiasNanos__is_initialized = false;
        this.biasNanos__is_initialized = false;
        this.biasUncertaintyNanos__is_initialized = false;
        this.driftNanosPerSecond__is_initialized = false;
        this.driftNanosUncertaintyPerSecond__is_initialized = false;
        this.hardwareClockDiscontinuityCount__is_initialized = false;
    }

    private native Double getBiasNanos__Native();

    private native Double getBiasUncertaintyNanos__Native();

    private native Double getDriftNanosPerSecond__Native();

    private native Double getDriftNanosUncertaintyPerSecond__Native();

    private native Long getFullBiasNanos__Native();

    private native int getHardwareClockDiscontinuityCount__Native();

    private native Integer getLeapSecond__Native();

    public static String getNativeName() {
        return "yandex::maps::runtime::sensors::internal::GnssClock";
    }

    private native long getTimeNanos__Native();

    private native Double getTimeUncertaintyNanos__Native();

    private native NativeObject init(long j12, Double d12, Integer num, Long l12, Double d13, Double d14, Double d15, Double d16, int i12);

    @P
    public synchronized Double getBiasNanos() {
        try {
            if (!this.biasNanos__is_initialized) {
                this.biasNanos = getBiasNanos__Native();
                this.biasNanos__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.biasNanos;
    }

    @P
    public synchronized Double getBiasUncertaintyNanos() {
        try {
            if (!this.biasUncertaintyNanos__is_initialized) {
                this.biasUncertaintyNanos = getBiasUncertaintyNanos__Native();
                this.biasUncertaintyNanos__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.biasUncertaintyNanos;
    }

    @P
    public synchronized Double getDriftNanosPerSecond() {
        try {
            if (!this.driftNanosPerSecond__is_initialized) {
                this.driftNanosPerSecond = getDriftNanosPerSecond__Native();
                this.driftNanosPerSecond__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.driftNanosPerSecond;
    }

    @P
    public synchronized Double getDriftNanosUncertaintyPerSecond() {
        try {
            if (!this.driftNanosUncertaintyPerSecond__is_initialized) {
                this.driftNanosUncertaintyPerSecond = getDriftNanosUncertaintyPerSecond__Native();
                this.driftNanosUncertaintyPerSecond__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.driftNanosUncertaintyPerSecond;
    }

    @P
    public synchronized Long getFullBiasNanos() {
        try {
            if (!this.fullBiasNanos__is_initialized) {
                this.fullBiasNanos = getFullBiasNanos__Native();
                this.fullBiasNanos__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.fullBiasNanos;
    }

    public synchronized int getHardwareClockDiscontinuityCount() {
        try {
            if (!this.hardwareClockDiscontinuityCount__is_initialized) {
                this.hardwareClockDiscontinuityCount = getHardwareClockDiscontinuityCount__Native();
                this.hardwareClockDiscontinuityCount__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.hardwareClockDiscontinuityCount;
    }

    @P
    public synchronized Integer getLeapSecond() {
        try {
            if (!this.leapSecond__is_initialized) {
                this.leapSecond = getLeapSecond__Native();
                this.leapSecond__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.leapSecond;
    }

    public synchronized long getTimeNanos() {
        try {
            if (!this.timeNanos__is_initialized) {
                this.timeNanos = getTimeNanos__Native();
                this.timeNanos__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.timeNanos;
    }

    @P
    public synchronized Double getTimeUncertaintyNanos() {
        try {
            if (!this.timeUncertaintyNanos__is_initialized) {
                this.timeUncertaintyNanos = getTimeUncertaintyNanos__Native();
                this.timeUncertaintyNanos__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.timeUncertaintyNanos;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getTimeNanos());
            archive.add(getTimeUncertaintyNanos(), true);
            archive.add(getLeapSecond(), true);
            archive.add(getFullBiasNanos(), true);
            archive.add(getBiasNanos(), true);
            archive.add(getBiasUncertaintyNanos(), true);
            archive.add(getDriftNanosPerSecond(), true);
            archive.add(getDriftNanosUncertaintyPerSecond(), true);
            archive.add(getHardwareClockDiscontinuityCount());
            return;
        }
        this.timeNanos = archive.add(this.timeNanos);
        this.timeNanos__is_initialized = true;
        this.timeUncertaintyNanos = archive.add(this.timeUncertaintyNanos, true);
        this.timeUncertaintyNanos__is_initialized = true;
        this.leapSecond = archive.add(this.leapSecond, true);
        this.leapSecond__is_initialized = true;
        this.fullBiasNanos = archive.add(this.fullBiasNanos, true);
        this.fullBiasNanos__is_initialized = true;
        this.biasNanos = archive.add(this.biasNanos, true);
        this.biasNanos__is_initialized = true;
        this.biasUncertaintyNanos = archive.add(this.biasUncertaintyNanos, true);
        this.biasUncertaintyNanos__is_initialized = true;
        this.driftNanosPerSecond = archive.add(this.driftNanosPerSecond, true);
        this.driftNanosPerSecond__is_initialized = true;
        this.driftNanosUncertaintyPerSecond = archive.add(this.driftNanosUncertaintyPerSecond, true);
        this.driftNanosUncertaintyPerSecond__is_initialized = true;
        int iAdd = archive.add(this.hardwareClockDiscontinuityCount);
        this.hardwareClockDiscontinuityCount = iAdd;
        this.hardwareClockDiscontinuityCount__is_initialized = true;
        this.nativeObject = init(this.timeNanos, this.timeUncertaintyNanos, this.leapSecond, this.fullBiasNanos, this.biasNanos, this.biasUncertaintyNanos, this.driftNanosPerSecond, this.driftNanosUncertaintyPerSecond, iAdd);
    }

    public GnssClock(long j12, @P Double d12, @P Integer num, @P Long l12, @P Double d13, @P Double d14, @P Double d15, @P Double d16, int i12) {
        this.timeNanos__is_initialized = false;
        this.timeUncertaintyNanos__is_initialized = false;
        this.leapSecond__is_initialized = false;
        this.fullBiasNanos__is_initialized = false;
        this.biasNanos__is_initialized = false;
        this.biasUncertaintyNanos__is_initialized = false;
        this.driftNanosPerSecond__is_initialized = false;
        this.driftNanosUncertaintyPerSecond__is_initialized = false;
        this.hardwareClockDiscontinuityCount__is_initialized = false;
        this.nativeObject = init(j12, d12, num, l12, d13, d14, d15, d16, i12);
        this.timeNanos = j12;
        this.timeNanos__is_initialized = true;
        this.timeUncertaintyNanos = d12;
        this.timeUncertaintyNanos__is_initialized = true;
        this.leapSecond = num;
        this.leapSecond__is_initialized = true;
        this.fullBiasNanos = l12;
        this.fullBiasNanos__is_initialized = true;
        this.biasNanos = d13;
        this.biasNanos__is_initialized = true;
        this.biasUncertaintyNanos = d14;
        this.biasUncertaintyNanos__is_initialized = true;
        this.driftNanosPerSecond = d15;
        this.driftNanosPerSecond__is_initialized = true;
        this.driftNanosUncertaintyPerSecond = d16;
        this.driftNanosUncertaintyPerSecond__is_initialized = true;
        this.hardwareClockDiscontinuityCount = i12;
        this.hardwareClockDiscontinuityCount__is_initialized = true;
    }

    private GnssClock(NativeObject nativeObject) {
        this.timeNanos__is_initialized = false;
        this.timeUncertaintyNanos__is_initialized = false;
        this.leapSecond__is_initialized = false;
        this.fullBiasNanos__is_initialized = false;
        this.biasNanos__is_initialized = false;
        this.biasUncertaintyNanos__is_initialized = false;
        this.driftNanosPerSecond__is_initialized = false;
        this.driftNanosUncertaintyPerSecond__is_initialized = false;
        this.hardwareClockDiscontinuityCount__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
