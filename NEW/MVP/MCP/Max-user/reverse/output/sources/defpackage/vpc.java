package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class vpc {
    public final bwf a;
    public final bwf b;
    public final bwf c;
    public final bwf d;
    public boolean e;
    public PowerManager.WakeLock f;
    public iv6 g;
    public final LinkedHashSet h = new LinkedHashSet();

    public vpc(k18 k18Var) {
        this.a = new bwf(new nz(k18Var, 28));
        final int i = 0;
        this.b = new bwf(new cm6(this) { // from class: spc
            public final /* synthetic */ vpc b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((SensorManager) this.b.a.getValue()).getDefaultSensor(8);
                    default:
                        return new tpc(this.b);
                }
            }
        });
        this.c = new bwf(new nz(k18Var, 29));
        final int i2 = 1;
        this.d = new bwf(new cm6(this) { // from class: spc
            public final /* synthetic */ vpc b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((SensorManager) this.b.a.getValue()).getDefaultSensor(8);
                    default:
                        return new tpc(this.b);
                }
            }
        });
    }

    public final void a() {
        Sensor sensor = (Sensor) this.b.getValue();
        if (sensor == null) {
            return;
        }
        try {
            this.f = ((PowerManager) this.c.getValue()).newWakeLock(32, "max:proximity_helper");
            ((SensorManager) this.a.getValue()).registerListener((SensorEventListener) this.d.getValue(), sensor, 3);
        } catch (Exception e) {
            wqi.g("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
    }

    public final void b() {
        if (((Sensor) this.b.getValue()) == null) {
            return;
        }
        PowerManager.WakeLock wakeLock = this.f;
        try {
            ((SensorManager) this.a.getValue()).unregisterListener((SensorEventListener) this.d.getValue());
            if (wakeLock == null || !wakeLock.isHeld()) {
                return;
            }
            wakeLock.release(1);
        } catch (Exception e) {
            wqi.g("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
    }

    public final void c() {
        Object value;
        PowerManager.WakeLock wakeLock = this.f;
        if (wakeLock == null) {
            return;
        }
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release(1);
                iv6 iv6Var = this.g;
                if (iv6Var != null) {
                    qv1 qv1Var = (qv1) iv6Var.b;
                    f9a f9aVar = (f9a) qv1Var.q.getValue();
                    do {
                        value = f9aVar.getValue();
                    } while (!f9aVar.c(value, ((w21) qv1Var.b).b()));
                }
            }
        } catch (Exception e) {
            wqi.g("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
    }
}
