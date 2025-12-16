package defpackage;

import android.graphics.SurfaceTexture;

/* loaded from: classes2.dex */
public final /* synthetic */ class qld implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sld b;

    public /* synthetic */ qld(sld sldVar, int i) {
        this.a = i;
        this.b = sldVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                sld sldVar = this.b;
                sldVar.f++;
                sldVar.b.C(new qld(sldVar, 0));
                sldVar.b();
                return qqg.a;
            default:
                this.b.a();
                return qqg.a;
        }
        while (true) {
            sld sldVar2 = this.b;
            if (sldVar2.f <= 0) {
                return qqg.a;
            }
            lk6 lk6Var = sldVar2.g;
            lk6Var.getClass();
            try {
                SurfaceTexture surfaceTexture = (SurfaceTexture) lk6Var.c;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
                if (((SurfaceTexture) lk6Var.c) != null) {
                    sldVar2.e = true;
                }
            } catch (RuntimeException unused) {
            }
            sldVar2.f--;
        }
    }
}
