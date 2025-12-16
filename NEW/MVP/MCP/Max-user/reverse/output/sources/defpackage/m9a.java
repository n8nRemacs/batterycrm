package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class m9a implements k42, ojh {
    public final l42 a;
    public final Object b;
    public final /* synthetic */ n9a c;

    public m9a(n9a n9aVar, l42 l42Var, Object obj) {
        this.c = n9aVar;
        this.a = l42Var;
        this.b = obj;
    }

    @Override // defpackage.ojh
    public final void a(Segment segment, int i) {
        this.a.a(segment, i);
    }

    @Override // defpackage.k42
    public final void d(z74 z74Var) {
        this.a.d(z74Var);
    }

    @Override // defpackage.k42
    public final void e(em6 em6Var) {
        this.a.e(em6Var);
    }

    @Override // defpackage.k42
    public final void f(Object obj, um6 um6Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n9a.h;
        Object obj2 = this.b;
        n9a n9aVar = this.c;
        atomicReferenceFieldUpdater.set(n9aVar, obj2);
        ia iaVar = new ia(n9aVar, 23, this);
        l42 l42Var = this.a;
        l42Var.w((qqg) obj, l42Var.resumeMode, new js0(1, iaVar));
    }

    @Override // kotlin.coroutines.Continuation
    public final x74 getContext() {
        return this.a.b;
    }

    @Override // defpackage.k42
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.k42
    public final Symbol j(Object obj, um6 um6Var) {
        final n9a n9aVar = this.c;
        um6 um6Var2 = new um6() { // from class: l9a
            @Override // defpackage.um6
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n9a.h;
                m9a m9aVar = this;
                Object obj5 = m9aVar.b;
                n9a n9aVar2 = n9aVar;
                atomicReferenceFieldUpdater.set(n9aVar2, obj5);
                n9aVar2.g(m9aVar.b);
                return qqg.a;
            }
        };
        Symbol symbolY = this.a.y((qqg) obj, um6Var2);
        if (symbolY != null) {
            n9a.h.set(n9aVar, this.b);
        }
        return symbolY;
    }

    @Override // defpackage.k42
    public final void m(Object obj) {
        this.a.m(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
