package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: FlowableReduceSeedSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41847f1<T, R> extends io.reactivex.rxjava3.core.I<R> {

    /* compiled from: FlowableReduceSeedSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.f1$a */
    public static final class a<T, R> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public R f402769b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402770c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402770c, eVar)) {
                this.f402770c = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402770c.cancel();
            this.f402770c = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402769b == null) {
                return;
            }
            this.f402769b = null;
            this.f402770c = SubscriptionHelper.f404813b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402770c == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402769b == null) {
                C47998a.b(th2);
            } else {
                this.f402769b = null;
                this.f402770c = SubscriptionHelper.f404813b;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402769b == null) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402770c.cancel();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        throw null;
    }
}
