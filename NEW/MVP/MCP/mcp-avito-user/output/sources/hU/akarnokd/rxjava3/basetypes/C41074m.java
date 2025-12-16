package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: NonoAndThenPublisher.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41074m<T> extends AbstractC41777j<T> {

    /* compiled from: NonoAndThenPublisher.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.m$a */
    public static final class a<T> extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Void>, org.reactivestreams.e {
        private static final long serialVersionUID = -1295251708496517979L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397726b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f397727c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397728d;

        /* compiled from: NonoAndThenPublisher.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.m$a$a, reason: collision with other inner class name */
        public final class C11307a implements org.reactivestreams.d<T> {
            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void e() {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onNext(T t12) {
                throw null;
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397726b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397728d, eVar)) {
                this.f397728d = eVar;
                this.f397726b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397728d.cancel();
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397726b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this, this.f397727c, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
