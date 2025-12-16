package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes8.dex */
public class AccelerometerUncalibratedSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public AccelerometerUncalibratedSubscription(NativeObject nativeObject, int i12) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 35, i12);
    }

    private static native void accelerationChanged(NativeObject nativeObject, float f12, float f13, float f14, float f15, float f16, float f17, int i12, long j12, long j13);

    private static native void accelerometerUncalibratedUnavailable(NativeObject nativeObject);

    public static boolean isAccelerometerUncalibratedAvailable() {
        return SensorSubscription.isSensorAvailable(35);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventNanosToTimestampMills = TimeHelpers.eventNanosToTimestampMills(sensorEvent.timestamp);
        long jEventNanosToMills = TimeHelpers.eventNanosToMills(sensorEvent.timestamp);
        NativeObject nativeObject = this.nativeObject;
        float[] fArr = sensorEvent.values;
        accelerationChanged(nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], sensorEvent.accuracy, jEventNanosToTimestampMills, jEventNanosToMills);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        accelerometerUncalibratedUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
