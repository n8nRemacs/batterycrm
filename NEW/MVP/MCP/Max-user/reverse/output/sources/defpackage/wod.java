package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class wod implements mje, ui8 {
    public final k18 a;
    public final k18 b;
    public final ContextScope c;
    public final tcf d = ucf.a(0);
    public final String o = "RestoreScheduledTaskExecutor";

    public wod(k18 k18Var, k18 k18Var2, lzf lzfVar, a84 a84Var) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = d7j.a(((q2b) lzfVar).a().limitedParallelism(1, "restore-tasks-on-connect").plus(a84Var));
    }

    @Override // defpackage.ui8
    public final void c() {
    }

    @Override // defpackage.mje
    public final void d(int i) {
        this.d.m(null, Integer.valueOf(i));
    }
}
