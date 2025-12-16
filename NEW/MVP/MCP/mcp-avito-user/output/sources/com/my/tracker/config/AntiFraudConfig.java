package com.my.tracker.config;

import com.my.tracker.obfuscated.w0;

/* loaded from: classes7.dex */
public final class AntiFraudConfig {
    public final boolean useGyroscope;
    public final boolean useLightSensor;
    public final boolean useMagneticFieldSensor;
    public final boolean usePressureSensor;
    public final boolean useProximitySensor;

    public static final class Builder {
        boolean useLightSensor = w0.f365847a;
        boolean useMagneticFieldSensor = true;
        boolean useGyroscope = true;
        boolean usePressureSensor = true;
        boolean useProximitySensor = w0.f365848b;

        public AntiFraudConfig build() {
            return new AntiFraudConfig(this.useLightSensor, this.useMagneticFieldSensor, this.useGyroscope, this.usePressureSensor, this.useProximitySensor);
        }

        public Builder useGyroscopeSensor(boolean z12) {
            this.useGyroscope = z12;
            return this;
        }

        public Builder useLightSensor(boolean z12) {
            this.useLightSensor = z12;
            return this;
        }

        public Builder useMagneticFieldSensor(boolean z12) {
            this.useMagneticFieldSensor = z12;
            return this;
        }

        public Builder usePressureSensor(boolean z12) {
            this.usePressureSensor = z12;
            return this;
        }

        public Builder useProximitySensor(boolean z12) {
            this.useProximitySensor = z12;
            return this;
        }
    }

    public AntiFraudConfig(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.useLightSensor = z12;
        this.useMagneticFieldSensor = z13;
        this.useGyroscope = z14;
        this.usePressureSensor = z15;
        this.useProximitySensor = z16;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
