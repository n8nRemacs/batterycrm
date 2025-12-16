package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes8.dex */
public class BarometerSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public BarometerSubscription(NativeObject nativeObject, int i12) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 6, i12);
    }

    private static native void barometerUnavailable(NativeObject nativeObject);

    public static boolean isBarometerAvailable() {
        return SensorSubscription.isSensorAvailable(6);
    }

    private static native void pressureChanged(NativeObject nativeObject, float f12, int i12, long j12, long j13);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        pressureChanged(this.nativeObject, sensorEvent.values[0], sensorEvent.accuracy, TimeHelpers.eventNanosToTimestampMills(sensorEvent.timestamp), TimeHelpers.eventNanosToMills(sensorEvent.timestamp));
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        barometerUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
