package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o92 extends t92 {
    private volatile /* synthetic */ int consumed$volatile;
    public final ccd d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(o92.class, "consumed$volatile");
    }

    public /* synthetic */ o92(ccd ccdVar) {
        this(ccdVar, bd5.a, -3, 1);
    }

    @Override // defpackage.t92, defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) throws Throwable {
        int i = this.b;
        g84 g84Var = g84.a;
        if (i == -3) {
            Object objA = mw0.a(z26Var, this.d, false, continuation);
            if (objA == g84Var) {
                return objA;
            }
        } else {
            Object objD = super.d(z26Var, continuation);
            if (objD == g84Var) {
                return objD;
            }
        }
        return qqg.a;
    }

    @Override // defpackage.t92
    public final String f() {
        return "channel=" + this.d;
    }

    @Override // defpackage.t92
    public final Object j(sac sacVar, Continuation continuation) throws Throwable {
        Object objA = mw0.a(new xde(sacVar), this.d, false, continuation);
        return objA == g84.a ? objA : qqg.a;
    }

    @Override // defpackage.t92
    public final t92 k(x74 x74Var, int i, int i2) {
        return new o92(this.d, x74Var, i, i2);
    }

    @Override // defpackage.t92
    public final x26 l() {
        return new o92(this.d);
    }

    @Override // defpackage.t92
    public final ccd m(f84 f84Var) {
        return this.b == -3 ? this.d : super.m(f84Var);
    }

    public o92(ccd ccdVar, x74 x74Var, int i, int i2) {
        super(x74Var, i, i2);
        this.d = ccdVar;
        this.consumed$volatile = 0;
    }
}
