package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class y92 extends t92 {
    public final x26 d;
    public final int o;

    public y92(int i, int i2, int i3, x74 x74Var, x26 x26Var) {
        super(x74Var, i2, i3);
        this.d = x26Var;
        this.o = i;
    }

    @Override // defpackage.t92
    public final String f() {
        return "concurrency=" + this.o;
    }

    @Override // defpackage.t92
    public final Object j(sac sacVar, Continuation continuation) {
        int i = xce.a;
        Object objD = this.d.d(new x92((qt7) ((q44) continuation).b.get(wha.w0), new wce(this.o), sacVar, new xde(sacVar), 0), continuation);
        return objD == g84.a ? objD : qqg.a;
    }

    @Override // defpackage.t92
    public final t92 k(x74 x74Var, int i, int i2) {
        return new y92(this.o, i, i2, x74Var, this.d);
    }

    @Override // defpackage.t92
    public final ccd m(f84 f84Var) {
        s92 s92Var = new s92(this, null);
        pac pacVar = new pac(z6j.c(f84Var, this.a), gzi.a(this.b, 1, 4));
        pacVar.start(i84.a, pacVar, s92Var);
        return pacVar;
    }
}
