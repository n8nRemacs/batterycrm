package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* loaded from: classes.dex */
public final class jkb extends ikb {
    @Override // defpackage.ikb, defpackage.gkb
    public final Object a() {
        Object obj = this.a;
        z5j.b(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // defpackage.ikb, defpackage.gkb
    public final void d(long j) {
        ((OutputConfiguration) a()).setDynamicRangeProfile(j);
    }

    @Override // defpackage.gkb
    public final void e(int i) {
        ((OutputConfiguration) a()).setMirrorMode(i);
    }

    @Override // defpackage.gkb
    public final void g(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) a()).setStreamUseCase(j);
    }
}
