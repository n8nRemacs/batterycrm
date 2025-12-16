package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class kv0 implements ojh {
    public Object a = rv0.p;
    public l42 b;
    public final /* synthetic */ pv0 c;

    public kv0(pv0 pv0Var) {
        this.c = pv0Var;
    }

    @Override // defpackage.ojh
    public final void a(Segment segment, int i) {
        l42 l42Var = this.b;
        if (l42Var != null) {
            l42Var.a(segment, i);
        }
    }

    public final Object b(q44 q44Var) throws Throwable {
        oa2 oa2VarO;
        Boolean bool;
        Object obj = this.a;
        boolean z = true;
        if (obj == rv0.p || obj == rv0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pv0.Y;
            pv0 pv0Var = this.c;
            oa2 oa2Var = (oa2) atomicReferenceFieldUpdater.get(pv0Var);
            while (true) {
                if (pv0Var.v()) {
                    this.a = rv0.l;
                    Throwable thP = pv0Var.p();
                    if (thP != null) {
                        throw StackTraceRecoveryKt.recoverStackTrace(thP);
                    }
                    z = false;
                } else {
                    long andIncrement = pv0.c.getAndIncrement(pv0Var);
                    long j = rv0.b;
                    long j2 = andIncrement / j;
                    int i = (int) (andIncrement % j);
                    if (oa2Var.id != j2) {
                        oa2VarO = pv0Var.o(j2, oa2Var);
                        if (oa2VarO == null) {
                            continue;
                        }
                    } else {
                        oa2VarO = oa2Var;
                    }
                    Object objG = pv0Var.G(oa2VarO, i, andIncrement, null);
                    Symbol symbol = rv0.m;
                    if (objG == symbol) {
                        throw new IllegalStateException("unreachable");
                    }
                    Symbol symbol2 = rv0.o;
                    if (objG == symbol2) {
                        if (andIncrement < pv0Var.s()) {
                            oa2VarO.cleanPrev();
                        }
                        oa2Var = oa2VarO;
                    } else {
                        if (objG == rv0.n) {
                            pv0 pv0Var2 = this.c;
                            l42 l42VarA = nyi.a(hni.f(q44Var));
                            try {
                                this.b = l42VarA;
                                Object objG2 = pv0Var2.G(oa2VarO, i, andIncrement, this);
                                if (objG2 == symbol) {
                                    a(oa2VarO, i);
                                } else {
                                    if (objG2 == symbol2) {
                                        if (andIncrement < pv0Var2.s()) {
                                            oa2VarO.cleanPrev();
                                        }
                                        oa2 oa2Var2 = (oa2) pv0.Y.get(pv0Var2);
                                        while (true) {
                                            if (pv0Var2.v()) {
                                                l42 l42Var = this.b;
                                                this.b = null;
                                                this.a = rv0.l;
                                                Throwable thP2 = pv0Var.p();
                                                if (thP2 == null) {
                                                    l42Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    l42Var.resumeWith(new ipd(thP2));
                                                }
                                            } else {
                                                long andIncrement2 = pv0.c.getAndIncrement(pv0Var2);
                                                long j3 = rv0.b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (oa2Var2.id != j4) {
                                                    oa2 oa2VarO2 = pv0Var2.o(j4, oa2Var2);
                                                    if (oa2VarO2 != null) {
                                                        oa2Var2 = oa2VarO2;
                                                    }
                                                }
                                                Object objG3 = pv0Var2.G(oa2Var2, i2, andIncrement2, this);
                                                if (objG3 == rv0.m) {
                                                    a(oa2Var2, i2);
                                                    break;
                                                }
                                                if (objG3 == rv0.o) {
                                                    if (andIncrement2 < pv0Var2.s()) {
                                                        oa2Var2.cleanPrev();
                                                    }
                                                } else {
                                                    if (objG3 == rv0.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    oa2Var2.cleanPrev();
                                                    this.a = objG3;
                                                    this.b = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        oa2VarO.cleanPrev();
                                        this.a = objG2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                    }
                                    l42VarA.f(bool, null);
                                }
                                return l42VarA.n();
                            } catch (Throwable th) {
                                l42VarA.v();
                                throw th;
                            }
                        }
                        oa2VarO.cleanPrev();
                        this.a = objG;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.a;
        Symbol symbol = rv0.p;
        if (obj == symbol) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = symbol;
        if (obj != rv0.l) {
            return obj;
        }
        throw StackTraceRecoveryKt.recoverStackTrace(this.c.q());
    }
}
