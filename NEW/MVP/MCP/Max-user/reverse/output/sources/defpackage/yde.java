package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class yde implements SensorEventListener {
    public static final /* synthetic */ int d = 0;
    public final SensorManager a;
    public final Sensor b;
    public final Set c = Collections.synchronizedSet(new LinkedHashSet());

    public yde(Context context) {
        Collections.synchronizedSet(new LinkedHashSet());
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(8);
        sensorManager.getDefaultSensor(5);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this.c) {
            try {
                if (sensorEvent.sensor.getType() == 8) {
                    boolean z = sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange();
                    for (e30 e30Var : this.c) {
                        if (z) {
                            e30Var.getClass();
                            wqi.c("e30", "onDeviceNextToEar", new Object[0]);
                            b8a b8aVar = e30Var.c;
                            if (b8aVar.H0) {
                                if (!e30Var.k()) {
                                    ((PowerManager.WakeLock) e30Var.i.getValue()).acquire();
                                }
                                if (b8aVar.H0) {
                                    b8aVar.k();
                                }
                            }
                        } else {
                            e30Var.m();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
