package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class tpc implements SensorEventListener {
    public final /* synthetic */ vpc a;

    public tpc(vpc vpcVar) {
        this.a = vpcVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        vpc vpcVar = this.a;
        if (vpcVar.f == null) {
            return;
        }
        boolean z = ((double) sensorEvent.values[0]) < Math.min((double) sensorEvent.sensor.getMaximumRange(), 3.0d);
        if (z == vpcVar.e) {
            return;
        }
        vpcVar.e = z;
        if (z) {
            Iterator it = vpcVar.h.iterator();
            while (it.hasNext()) {
                ((upc) it.next()).a();
            }
        } else {
            Iterator it2 = vpcVar.h.iterator();
            while (it2.hasNext()) {
                ((upc) it2.next()).b();
            }
        }
    }
}
