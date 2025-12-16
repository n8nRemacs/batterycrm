package defpackage;

/* loaded from: classes2.dex */
public final class dy9 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public dy9(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
    }

    public static /* synthetic */ Object b(dy9 dy9Var, long j, CharSequence charSequence, Long l, vf6 vf6Var, dtf dtfVar, int i) {
        if ((i & 8) != 0) {
            vf6Var = null;
        }
        return dy9Var.a(j, charSequence, l, vf6Var, false, dtfVar);
    }

    public final Object a(long j, CharSequence charSequence, Long l, vf6 vf6Var, boolean z, dtf dtfVar) {
        Object objI = svi.i(((q2b) ((lzf) this.a.getValue())).b(), new cy9(this, j, charSequence, l, z, vf6Var, null), dtfVar);
        return objI == g84.a ? objI : qqg.a;
    }
}
