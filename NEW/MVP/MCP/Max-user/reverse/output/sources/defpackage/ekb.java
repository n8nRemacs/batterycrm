package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class ekb {
    public final gkb a;

    public ekb(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.a = new jkb(new OutputConfiguration(i, surface));
        } else if (i2 >= 28) {
            this.a = new ikb(new hkb(new OutputConfiguration(i, surface)));
        } else {
            this.a = new gkb(new fkb(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ekb)) {
            return false;
        }
        return this.a.equals(((ekb) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public ekb(gkb gkbVar) {
        this.a = gkbVar;
    }
}
