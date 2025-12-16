package defpackage;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class ye7 {
    public static final /* synthetic */ int c = 0;
    public final k18 a;
    public final k18 b;

    public ye7(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final void a(String str, xe7 xe7Var) {
        if (TextUtils.isEmpty(str)) {
            c(xe7Var);
            return;
        }
        ((q2b) ((lzf) this.b.getValue())).b().mo13dispatch(bd5.a, new se5(this, str, xe7Var, 15));
    }

    public final void b(String str, xe7 xe7Var) {
        if (pbj.c(null)) {
            d(new qz5(xe7Var, 13, (Object) null));
        } else {
            if (TextUtils.isEmpty(str)) {
                c(xe7Var);
                return;
            }
            d(new ue7(xe7Var, 1));
            rf7 rf7VarB = rf7.b(str);
            zk6.e().c(rf7VarB).l(new ve7(this, xe7Var, rf7VarB), yu1.a);
        }
    }

    public final void c(xe7 xe7Var) {
        if (xe7Var != null) {
            d(new ue7(xe7Var, 0));
        }
    }

    public final void d(Runnable runnable) {
        ((q2b) ((lzf) this.b.getValue())).c().getImmediate().mo13dispatch(bd5.a, runnable);
    }
}
