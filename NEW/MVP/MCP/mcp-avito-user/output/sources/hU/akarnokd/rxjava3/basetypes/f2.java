package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloZipArray.java */
/* loaded from: classes8.dex */
final class f2<T, R> extends AbstractC41073l1<R> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super R> dVar) {
        throw null;
    }

    /* compiled from: SoloZipArray.java */
    public static final class a<T, R> extends o41.f<R> {
        private static final long serialVersionUID = -4130106888008958190L;

        public a() {
            throw null;
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            throw null;
        }

        /* compiled from: SoloZipArray.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.f2$a$a, reason: collision with other inner class name */
        public static final class C11304a<T, R> extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<T> {
            private static final long serialVersionUID = -4715238780191248967L;

            public C11304a() {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onNext(T t12) {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void e() {
            }
        }
    }
}
