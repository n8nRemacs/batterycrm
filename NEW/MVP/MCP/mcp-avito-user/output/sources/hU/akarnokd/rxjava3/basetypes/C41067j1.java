package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PerhapsZipArray.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41067j1<T, R> extends AbstractC41069k0<R> {

    /* compiled from: PerhapsZipArray.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.j1$a */
    public static final class a<T, R> extends o41.f<R> {
        private static final long serialVersionUID = 278835184144033561L;

        /* compiled from: PerhapsZipArray.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.j1$a$a, reason: collision with other inner class name */
        public static final class C11305a<T, R> extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<T> {
            private static final long serialVersionUID = 2125487621013035317L;

            public C11305a() {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
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

        public a() {
            throw null;
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            throw null;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super R> dVar) {
        throw null;
    }
}
