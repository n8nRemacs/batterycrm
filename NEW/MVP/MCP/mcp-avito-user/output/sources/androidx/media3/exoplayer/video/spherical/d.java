package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import j.InterfaceC42151g;

/* compiled from: OrientationListener.java */
/* loaded from: classes.dex */
final class d implements SensorEventListener {

    /* compiled from: OrientationListener.java */
    public interface a {
    }

    @Override // android.hardware.SensorEventListener
    @InterfaceC42151g
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(null, sensorEvent.values);
        throw null;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i12) {
    }
}
