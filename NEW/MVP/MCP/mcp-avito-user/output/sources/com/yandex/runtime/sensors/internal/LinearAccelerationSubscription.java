package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes8.dex */
public class LinearAccelerationSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public LinearAccelerationSubscription(NativeObject nativeObject, int i12) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 10, i12);
    }

    public static boolean isLinearAccelerationAvailable() {
        return SensorSubscription.isSensorAvailable(10);
    }

    private static native void linearAccelerationChanged(NativeObject nativeObject, float f12, float f13, float f14, int i12, long j12, long j13);

    private static native void linearAccelerationUnavailable(NativeObject nativeObject);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventNanosToTimestampMills = TimeHelpers.eventNanosToTimestampMills(sensorEvent.timestamp);
        long jEventNanosToMills = TimeHelpers.eventNanosToMills(sensorEvent.timestamp);
        NativeObject nativeObject = this.nativeObject;
        float[] fArr = sensorEvent.values;
        linearAccelerationChanged(nativeObject, fArr[0], fArr[1], fArr[2], sensorEvent.accuracy, jEventNanosToTimestampMills, jEventNanosToMills);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        linearAccelerationUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
