package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: FlowableCollectWithCollector.java */
/* renamed from: io.reactivex.rxjava3.internal.jdk8.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41797c<T, A, R> extends AbstractC41777j<R> {

    /* compiled from: FlowableCollectWithCollector.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.c$a */
    public static final class a<T, A, R> extends o41.f<R> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -229544830565448758L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402033d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402034e;

        /* renamed from: f, reason: collision with root package name */
        public A f402035f;

        @Override // org.reactivestreams.d
        public final void K(@j41.e org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402033d, eVar)) {
                this.f402033d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402033d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402034e) {
                return;
            }
            this.f402034e = true;
            this.f402033d = SubscriptionHelper.f404813b;
            this.f402035f = null;
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402034e) {
                C47998a.b(th2);
                return;
            }
            this.f402034e = true;
            this.f402033d = SubscriptionHelper.f404813b;
            this.f402035f = null;
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402034e) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402033d.cancel();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(@j41.e org.reactivestreams.d<? super R> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
