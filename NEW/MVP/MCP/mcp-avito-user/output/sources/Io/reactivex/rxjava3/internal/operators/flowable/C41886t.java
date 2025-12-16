package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import n41.InterfaceC44186c;
import s41.C47998a;

/* compiled from: FlowableCollectSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41886t<T, U> extends io.reactivex.rxjava3.core.I<U> implements InterfaceC44186c<U> {

    /* renamed from: b, reason: collision with root package name */
    public final C41849g0 f402970b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.s<? extends U> f402971c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.messenger.service.user_last_activity.f f402972d;

    /* compiled from: FlowableCollectSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.t$a */
    public static final class a<T, U> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super U> f402973b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.messenger.service.user_last_activity.f f402974c;

        /* renamed from: d, reason: collision with root package name */
        public final U f402975d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402976e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f402977f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.reactivex.rxjava3.core.L l12, Object obj, com.avito.android.messenger.service.user_last_activity.f fVar) {
            this.f402973b = l12;
            this.f402974c = fVar;
            this.f402975d = obj;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402976e, eVar)) {
                this.f402976e = eVar;
                this.f402973b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402976e.cancel();
            this.f402976e = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402977f) {
                return;
            }
            this.f402977f = true;
            this.f402976e = SubscriptionHelper.f404813b;
            this.f402973b.onSuccess(this.f402975d);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402976e == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402977f) {
                C47998a.b(th2);
                return;
            }
            this.f402977f = true;
            this.f402976e = SubscriptionHelper.f404813b;
            this.f402973b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402977f) {
                return;
            }
            try {
                this.f402974c.accept(this.f402975d, t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402976e.cancel();
                onError(th2);
            }
        }
    }

    public C41886t(C41849g0 c41849g0, l41.s sVar, com.avito.android.messenger.service.user_last_activity.f fVar) {
        this.f402970b = c41849g0;
        this.f402971c = sVar;
        this.f402972d = fVar;
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<U> f() {
        return new C41883s(this.f402970b, this.f402971c, this.f402972d);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super U> l12) {
        try {
            U u12 = this.f402971c.get();
            Objects.requireNonNull(u12, "The initialSupplier returned a null value");
            this.f402970b.q(new a(l12, u12, this.f402972d));
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.e(th2, l12);
        }
    }
}
