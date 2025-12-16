package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class ve7 extends oj0 {
    public final /* synthetic */ xe7 a;
    public final /* synthetic */ rf7 b;
    public final /* synthetic */ ye7 c;

    public ve7(ye7 ye7Var, xe7 xe7Var, rf7 rf7Var) {
        this.c = ye7Var;
        this.a = xe7Var;
        this.b = rf7Var;
    }

    @Override // defpackage.oj0
    public final void e(pe4 pe4Var) {
        this.c.c(this.a);
    }

    @Override // defpackage.oj0
    public final void f(r0 r0Var) {
        ye7 ye7Var = this.c;
        k18 k18Var = ye7Var.a;
        if (r0Var.g()) {
            vc3 vc3Var = (vc3) r0Var.d();
            xe7 xe7Var = this.a;
            if (vc3Var == null) {
                ye7Var.c(xe7Var);
                return;
            }
            z5c z5cVar = new z5c((nf9) vc3Var.Z());
            try {
                try {
                    Object obj = ne7.d;
                    String str = jfi.c(z5cVar).b;
                    if ("webp".equalsIgnoreCase(str)) {
                        qx5 qx5Var = (qx5) k18Var.getValue();
                        ((r0) zk6.e().b(this.b, null)).l(new we7(ye7Var, xe7Var, qx5Var), yu1.a);
                    } else {
                        File fileA = ((qx5) k18Var.getValue()).a(str);
                        gbj.g(fileA, z5cVar);
                        ye7Var.d(new qz5(xe7Var, 13, fileA.getAbsolutePath()));
                    }
                } catch (Exception e) {
                    wqi.e("ye7", "onNewResultImpl: failed to save image", e);
                    ye7Var.c(xe7Var);
                }
                xc3.b(z5cVar);
                vc3Var.close();
            } catch (Throwable th) {
                xc3.b(z5cVar);
                vc3Var.close();
                throw th;
            }
        }
    }
}
