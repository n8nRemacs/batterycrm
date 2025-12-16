package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* loaded from: classes.dex */
public class ikb extends gkb {
    @Override // defpackage.gkb
    public Object a() {
        Object obj = this.a;
        z5j.b(obj instanceof hkb);
        return ((hkb) obj).a;
    }

    @Override // defpackage.gkb
    public final String b() {
        return null;
    }

    @Override // defpackage.gkb
    public void d(long j) {
        ((hkb) this.a).b = j;
    }

    @Override // defpackage.gkb
    public final void f(String str) {
        ((OutputConfiguration) a()).setPhysicalCameraId(str);
    }
}
