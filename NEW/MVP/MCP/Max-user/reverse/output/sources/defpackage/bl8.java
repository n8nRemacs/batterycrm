package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class bl8 extends xfh {
    public final tcf X;
    public final hbd Y;
    public final ci5 Z;
    public final boolean b;
    public final Context c;
    public final oo9 d;
    public final k18 o;

    public bl8(k18 k18Var, boolean z, Context context, oo9 oo9Var) {
        this.b = z;
        this.c = context;
        this.d = oo9Var;
        this.o = k18Var;
        tcf tcfVarA = ucf.a(new cl8(1, hd5.a));
        this.X = tcfVarA;
        this.Y = new hbd(tcfVarA);
        this.Z = new ci5(0);
    }

    public static void t(bl8 bl8Var, int i) {
        xfh.o(bl8Var, ((q2b) ((lzf) bl8Var.o.getValue())).a(), new al8(bl8Var, ((cl8) bl8Var.X.getValue()).a, i, null), 2);
    }
}
