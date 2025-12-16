package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import s41.C47998a;

/* compiled from: FlowableCollect.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41883s<T, U> extends AbstractC41833b<T, U> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.s<? extends U> f402959d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.messenger.service.user_last_activity.f f402960e;

    /* compiled from: FlowableCollect.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.s$a */
    public static final class a<T, U> extends o41.f<U> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -3589550218733891694L;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.messenger.service.user_last_activity.f f402961d;

        /* renamed from: e, reason: collision with root package name */
        public final U f402962e;

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f402963f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f402964g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC41782o interfaceC41782o, Object obj, com.avito.android.messenger.service.user_last_activity.f fVar) {
            super(interfaceC41782o);
            this.f402961d = fVar;
            this.f402962e = obj;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402963f, eVar)) {
                this.f402963f = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402963f.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402964g) {
                return;
            }
            this.f402964g = true;
            l(this.f402962e);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402964g) {
                C47998a.b(th2);
            } else {
                this.f402964g = true;
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402964g) {
                return;
            }
            try {
                this.f402961d.accept(this.f402962e, t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402963f.cancel();
                onError(th2);
            }
        }
    }

    public C41883s(C41849g0 c41849g0, l41.s sVar, com.avito.android.messenger.service.user_last_activity.f fVar) {
        super(c41849g0);
        this.f402959d = sVar;
        this.f402960e = fVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super U> dVar) {
        try {
            U u12 = this.f402959d.get();
            Objects.requireNonNull(u12, "The initial value supplied is null");
            this.f402624c.q(new a((InterfaceC41782o) dVar, u12, this.f402960e));
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
