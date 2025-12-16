package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class e5f implements le9 {
    public final long a;
    public final br2 b;
    public final lzf c;
    public final long d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final AtomicInteger h;
    public final tcf i;
    public final tcf j;
    public final hbd k;
    public final hbd l;

    public e5f(long j, br2 br2Var, pb3 pb3Var, k18 k18Var, k18 k18Var2, k18 k18Var3, lzf lzfVar, k18 k18Var4) {
        this.a = j;
        this.b = br2Var;
        this.c = lzfVar;
        this.d = ((w4e) pb3Var).s();
        this.e = k18Var;
        this.f = k18Var2;
        this.g = k18Var3;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.h = atomicInteger;
        tcf tcfVarA = ucf.a(Integer.valueOf(atomicInteger.get()));
        this.i = tcfVarA;
        q2b q2bVar = (q2b) lzfVar;
        ContextScope contextScopeA = d7j.a(q2bVar.a());
        tcf tcfVarA2 = ucf.a(null);
        this.j = tcfVarA2;
        tcf tcfVarA3 = ucf.a(null);
        this.k = new hbd(tcfVarA3);
        this.l = gw0.C(gw0.E(tcfVarA, new mo1((Continuation) null, this, 8)), contextScopeA, yve.a, hd5.a);
        svi.e(contextScopeA, null, null, new c5f(k18Var, this, k18Var4, null), 3);
        gw0.w(gw0.u(new g56(new uxb(gw0.m(gw0.k(tcfVarA2, 200L)), this, 18), new ir9(2, tcfVarA3, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), 1), q2bVar.b()), contextScopeA);
    }

    @Override // defpackage.le9
    public final void a(String str) {
        this.j.setValue(str);
    }

    @Override // defpackage.le9
    public final x26 b() {
        return this.k;
    }

    @Override // defpackage.le9
    public final boolean d() {
        return false;
    }

    @Override // defpackage.le9
    public final hbd e() {
        return this.l;
    }

    @Override // defpackage.le9
    public final void f() {
        this.i.m(null, Integer.valueOf(this.h.incrementAndGet()));
    }
}
