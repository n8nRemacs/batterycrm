package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hj4 implements oa8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rch b;

    public /* synthetic */ hj4(hd hdVar, rch rchVar) {
        this.b = rchVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [i3, t39] */
    @Override // defpackage.oa8
    public final void invoke(Object obj) {
        int i = this.a;
        rch rchVar = this.b;
        switch (i) {
            case 0:
                fl5 fl5Var = (fl5) obj;
                fl5Var.getClass();
                wqi.c("fl5", "videoDebugListener.onVideoSizeChanged: %s", rchVar);
                int i2 = rchVar.c;
                int i3 = rchVar.b;
                int i4 = rchVar.a;
                if (i2 == 90 || i2 == 270) {
                    fl5Var.t0 = i3;
                    fl5Var.u0 = i4;
                } else {
                    fl5Var.t0 = i4;
                    fl5Var.u0 = i3;
                }
                fl5Var.v0 = i2;
                if (fl5Var.Y != null) {
                    if (fl5Var.Z - (1.0f / (i4 / i3)) == 0.0f || Math.abs(r0) <= 1.0E-4d) {
                        fl5Var.t0 = i3;
                        fl5Var.u0 = i4;
                    }
                }
                xd8 xd8Var = fl5Var.X;
                if (xd8Var != null) {
                    int i5 = fl5Var.t0;
                    int i6 = fl5Var.u0;
                    int i7 = fl5Var.v0;
                    ?? r0 = xd8Var.e;
                    if (r0 != 0) {
                        r0.K(i5, i6, i7);
                        break;
                    }
                }
                break;
            default:
                ((q3c) obj).z(rchVar);
                break;
        }
    }

    public /* synthetic */ hj4(rch rchVar) {
        this.b = rchVar;
    }
}
