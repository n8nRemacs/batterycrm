package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: CompletableFromPublisher.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41828t<T> extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final org.reactivestreams.c<T> f402264b;

    public C41828t(org.reactivestreams.c<T> cVar) {
        this.f402264b = cVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        ((AbstractC41777j) this.f402264b).d(new a(interfaceC41771d));
    }

    /* compiled from: CompletableFromPublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.t$a */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402265b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402266c;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402265b = interfaceC41771d;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402266c, eVar)) {
                this.f402266c = eVar;
                this.f402265b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402266c.cancel();
            this.f402266c = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402265b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402266c == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402265b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
        }
    }
}
