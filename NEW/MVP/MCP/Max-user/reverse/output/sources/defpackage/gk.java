package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class gk {
    public static final /* synthetic */ yy7[] j;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final ContextScope g;
    public final t9f h = c7j.c();
    public final boolean i;

    static {
        z8a z8aVar = new z8a(gk.class, "invalidateCacheJob", "getInvalidateCacheJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        j = new yy7[]{z8aVar};
    }

    public gk(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, lv4 lv4Var, lzf lzfVar, a84 a84Var) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = d7j.a(((q2b) lzfVar).a().plus(a84Var));
        this.i = lv4Var.b().compareTo(nv4.AVERAGE) >= 0;
    }

    public final boolean a() {
        return ((sxg) this.a.getValue()).g.getBoolean("app.media.animoji.enabled", this.i);
    }
}
