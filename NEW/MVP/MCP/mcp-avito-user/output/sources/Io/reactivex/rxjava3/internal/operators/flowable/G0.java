package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import java.util.Objects;
import q41.InterfaceC47198a;

/* compiled from: FlowableMap.java */
/* loaded from: classes8.dex */
public final class G0<T, U> extends AbstractC41833b<T, U> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super T, ? extends U> f402343d;

    /* compiled from: FlowableMap.java */
    public static final class a<T, U> extends io.reactivex.rxjava3.internal.subscribers.a<T, U> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.o<? super T, ? extends U> f402344g;

        public a(InterfaceC47198a<? super U> interfaceC47198a, l41.o<? super T, ? extends U> oVar) {
            super(interfaceC47198a);
            this.f402344g = oVar;
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404772e) {
                return true;
            }
            int i12 = this.f404773f;
            InterfaceC47198a<? super R> interfaceC47198a = this.f404769b;
            if (i12 != 0) {
                interfaceC47198a.P(null);
                return true;
            }
            try {
                U uApply = this.f402344g.apply(t12);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                return interfaceC47198a.P(uApply);
            } catch (Throwable th2) {
                a(th2);
                return true;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404772e) {
                return;
            }
            int i12 = this.f404773f;
            InterfaceC41782o interfaceC41782o = this.f404769b;
            if (i12 != 0) {
                interfaceC41782o.onNext(null);
                return;
            }
            try {
                U uApply = this.f402344g.apply(t12);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                interfaceC41782o.onNext(uApply);
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final U poll() {
            T tPoll = this.f404771d.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f402344g.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    /* compiled from: FlowableMap.java */
    public static final class b<T, U> extends io.reactivex.rxjava3.internal.subscribers.b<T, U> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.o<? super T, ? extends U> f402345g;

        public b(InterfaceC41782o interfaceC41782o, l41.o oVar) {
            super(interfaceC41782o);
            this.f402345g = oVar;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404777e) {
                return;
            }
            int i12 = this.f404778f;
            org.reactivestreams.d<? super R> dVar = this.f404774b;
            if (i12 != 0) {
                dVar.onNext(null);
                return;
            }
            try {
                U uApply = this.f402345g.apply(t12);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                dVar.onNext(uApply);
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final U poll() {
            T tPoll = this.f404776d.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f402345g.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public G0(AbstractC41777j<T> abstractC41777j, l41.o<? super T, ? extends U> oVar) {
        super(abstractC41777j);
        this.f402343d = oVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super U> dVar) {
        boolean z12 = dVar instanceof InterfaceC47198a;
        l41.o<? super T, ? extends U> oVar = this.f402343d;
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        if (z12) {
            abstractC41777j.q(new a((InterfaceC47198a) dVar, oVar));
        } else {
            abstractC41777j.q(new b((InterfaceC41782o) dVar, oVar));
        }
    }
}
