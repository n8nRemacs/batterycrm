package hu.akarnokd.rxjava3.operators;

import hu.akarnokd.rxjava3.operators.C41160t;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41783p;

/* compiled from: FlowableFlatMapAsync.java */
/* renamed from: hu.akarnokd.rxjava3.operators.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41159s<T, R> extends AbstractC41777j<R> implements InterfaceC41783p<T, R> {

    /* compiled from: FlowableFlatMapAsync.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.s$a */
    public static final class a<T, R> extends C41160t.a<T, R> implements Runnable {
        private static final long serialVersionUID = -5109342841608286301L;

        @Override // hu.akarnokd.rxjava3.operators.C41160t.c
        public final void c() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // hu.akarnokd.rxjava3.operators.C41160t.c
        public final void d(C41160t.b<T, R> bVar) {
            bVar.f398152d = true;
            c();
        }

        @Override // hu.akarnokd.rxjava3.operators.C41160t.c
        public final void f(C41160t.b<T, R> bVar, R r12) {
            C41160t.b.b();
            throw null;
        }

        @Override // hu.akarnokd.rxjava3.operators.C41160t.c
        public final void g(C41160t.b<T, R> bVar, Throwable th2) {
            i(bVar);
            if (this.f398143f.b(th2)) {
                bVar.f398152d = true;
                this.f398145h = true;
                this.f398147j.cancel();
                b();
                c();
            }
        }

        @Override // hu.akarnokd.rxjava3.operators.C41160t.a
        public final void h() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        throw null;
    }
}
