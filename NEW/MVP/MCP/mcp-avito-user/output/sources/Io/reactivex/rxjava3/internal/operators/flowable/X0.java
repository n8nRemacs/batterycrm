package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import s41.C47998a;

/* compiled from: FlowableOnErrorNext.java */
/* loaded from: classes8.dex */
public final class X0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableOnErrorNext.java */
    public static final class a<T> extends o41.h implements InterfaceC41782o<T> {
        private static final long serialVersionUID = 4063763155303814625L;

        /* renamed from: j, reason: collision with root package name */
        public final InterfaceC41782o f402575j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f402576k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f402577l;

        /* renamed from: m, reason: collision with root package name */
        public long f402578m;

        public a(InterfaceC41782o interfaceC41782o) {
            super(false);
            this.f402575j = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402577l) {
                return;
            }
            this.f402577l = true;
            this.f402576k = true;
            this.f402575j.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            boolean z12 = this.f402576k;
            InterfaceC41782o interfaceC41782o = this.f402575j;
            if (z12) {
                if (this.f402577l) {
                    C47998a.b(th2);
                    return;
                } else {
                    interfaceC41782o.onError(th2);
                    return;
                }
            }
            this.f402576k = true;
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                interfaceC41782o.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402577l) {
                return;
            }
            if (!this.f402576k) {
                this.f402578m++;
            }
            this.f402575j.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        dVar.K(aVar);
        this.f402624c.q(aVar);
    }
}
