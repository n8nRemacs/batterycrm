package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import n41.InterfaceC44186c;

/* compiled from: FlowableIgnoreElementsCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41902y0<T> extends AbstractC41768a implements InterfaceC44186c<T> {

    /* renamed from: b, reason: collision with root package name */
    public final S f403104b;

    public C41902y0(S s5) {
        this.f403104b = s5;
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<T> f() {
        return new C41899x0(this.f403104b);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f403104b.q(new a(interfaceC41771d));
    }

    /* compiled from: FlowableIgnoreElementsCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.y0$a */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f403105b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f403106c;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f403105b = interfaceC41771d;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403106c, eVar)) {
                this.f403106c = eVar;
                this.f403105b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403106c.cancel();
            this.f403106c = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403106c = SubscriptionHelper.f404813b;
            this.f403105b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403106c == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f403106c = SubscriptionHelper.f404813b;
            this.f403105b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
        }
    }
}
