package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: NonoFlatMapSignal.java */
/* loaded from: classes8.dex */
final class B<T> extends AbstractC41777j<T> {

    /* compiled from: NonoFlatMapSignal.java */
    public static final class a<T> extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Void>, org.reactivestreams.e {
        private static final long serialVersionUID = -1838187298176717779L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397544b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f397545c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397546d;

        /* compiled from: NonoFlatMapSignal.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.B$a$a, reason: collision with other inner class name */
        public final class C11284a implements org.reactivestreams.d<T> {
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
            this.f397544b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397546d, eVar)) {
                this.f397546d = eVar;
                this.f397544b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397546d.cancel();
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397544b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f397544b.onError(th3);
            }
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this, this.f397545c, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
