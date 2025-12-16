package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import n41.InterfaceC44186c;
import n41.InterfaceC44192i;
import s41.C47998a;

/* compiled from: FlowableReduceMaybe.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41844e1<T> extends io.reactivex.rxjava3.core.q<T> implements InterfaceC44192i<T>, InterfaceC44186c<T> {

    /* compiled from: FlowableReduceMaybe.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.e1$a */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public T f402740b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402741c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402742d;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402741c, eVar)) {
                this.f402741c = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402741c.cancel();
            this.f402742d = true;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402742d) {
                return;
            }
            this.f402742d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402742d;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402742d) {
                C47998a.b(th2);
            } else {
                this.f402742d = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402742d) {
                return;
            }
            if (this.f402740b == null) {
                this.f402740b = t12;
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402741c.cancel();
                onError(th2);
            }
        }
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<T> f() {
        return new C41841d1(null);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        throw null;
    }
}
