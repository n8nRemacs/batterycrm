package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class o41 {
    public final Context a;
    public final Object b = ipi.b(3, new i6(20, this));

    public o41(Context context) {
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    public final d51 a(n41 n41Var) {
        Long l = n41Var.a;
        Long l2 = n41Var.e;
        CharSequence charSequence = n41Var.f;
        yd0 yd0Var = null;
        wd0 wd0Var = new wd0((l2 == null || charSequence == null) ? null : fui.a(charSequence, Long.valueOf(l2.longValue())), n41Var.d);
        CharSequence charSequence2 = n41Var.c;
        if (n41Var.g) {
            yd0Var = (yd0) this.b.getValue();
        }
        return new d51(l, charSequence2, wd0Var, yd0Var, n41Var.g);
    }
}
