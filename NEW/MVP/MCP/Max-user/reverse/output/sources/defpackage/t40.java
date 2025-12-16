package defpackage;

import android.os.PowerManager;

/* loaded from: classes.dex */
public final class t40 implements upc {
    public final /* synthetic */ v40 a;

    public t40(v40 v40Var) {
        this.a = v40Var;
    }

    @Override // defpackage.upc
    public final void a() {
        v40 v40Var = this.a;
        l7a l7aVar = v40Var.a;
        if (v40.c(v40Var)) {
            return;
        }
        b8a b8aVar = (b8a) l7aVar;
        b8aVar.getClass();
        k20 k20Var = new k20(1, 0, 2, 1, 0, false);
        px8 px8Var = b8aVar.w0;
        if (px8Var != null) {
            px8Var.B(k20Var, false);
        }
        vpc vpcVar = v40Var.b;
        vpcVar.getClass();
        try {
            PowerManager.WakeLock wakeLock = vpcVar.f;
            if (wakeLock != null) {
                wakeLock.acquire();
            }
        } catch (Exception e) {
            wqi.g("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
        long jLongValue = ((Number) ((b8a) l7aVar).D0.a.getValue()).longValue() - 1000;
        b8a b8aVar2 = (b8a) l7aVar;
        svi.e(b8aVar2.Z, null, null, new x7a(jLongValue, b8aVar2, null), 3);
    }

    @Override // defpackage.upc
    public final void b() {
        v40 v40Var = this.a;
        l7a l7aVar = v40Var.a;
        if (v40.c(v40Var)) {
            return;
        }
        b8a b8aVar = (b8a) l7aVar;
        b8aVar.getClass();
        k20 k20Var = new k20(1, 0, 1, 1, 0, false);
        px8 px8Var = b8aVar.w0;
        if (px8Var != null) {
            px8Var.B(k20Var, false);
        }
        v40Var.b.c();
        ((b8a) l7aVar).o();
    }
}
