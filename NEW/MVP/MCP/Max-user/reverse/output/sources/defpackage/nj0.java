package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class nj0 implements oe4 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public nj0(Context context, String str) {
        fn4 fn4Var = new fn4();
        fn4Var.c = str;
        fn4Var.b = wha.z0.m(context).c;
        fn4Var.d = 8000;
        fn4Var.e = 8000;
        this.b = fn4Var;
    }

    @Override // defpackage.oe4
    public final se4 a() {
        switch (this.a) {
            case 0:
                fn4 fn4Var = (fn4) this.b;
                jn4 jn4Var = new jn4(fn4Var.c, fn4Var.d, fn4Var.e, fn4Var.a);
                wgg wggVar = fn4Var.b;
                if (wggVar != null) {
                    jn4Var.I(wggVar);
                }
                return jn4Var;
            default:
                return ((jy0) ((bwf) this.b).getValue()).a();
        }
    }

    public nj0(w5 w5Var) {
        this.b = new bwf(new b31(w5Var, 9));
    }
}
