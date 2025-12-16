package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o41.AbstractC44583c;

/* compiled from: NonoMergeArray.java */
/* loaded from: classes8.dex */
final class O extends AbstractC41062i {

    /* compiled from: NonoMergeArray.java */
    public interface c {
        void h(a aVar, Throwable th2);

        void k(a aVar);
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        b bVar = new b(dVar);
        dVar.K(bVar);
        bVar.l(0);
    }

    /* compiled from: NonoMergeArray.java */
    public static final class b extends AbstractC44583c<Void> implements c {
        private static final long serialVersionUID = -58058606508277827L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397597b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f397598c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final hu.akarnokd.rxjava3.util.a f397599d = new hu.akarnokd.rxjava3.util.a();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f397600e = new AtomicInteger();

        public b(org.reactivestreams.d dVar) {
            this.f397597b = dVar;
            lazySet(1);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397599d.cancel();
            this.f397598c.c();
        }

        @Override // hu.akarnokd.rxjava3.basetypes.O.c
        public final void h(a aVar, Throwable th2) {
            hu.akarnokd.rxjava3.util.a aVar2 = this.f397599d;
            aVar2.b(aVar);
            io.reactivex.rxjava3.internal.util.b bVar = this.f397598c;
            if (bVar.b(th2)) {
                aVar2.cancel();
                bVar.g(this.f397597b);
            }
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return true;
        }

        @Override // hu.akarnokd.rxjava3.basetypes.O.c
        public final void k(a aVar) {
            this.f397599d.b(aVar);
            l(1);
            if (decrementAndGet() == 0) {
                io.reactivex.rxjava3.internal.util.b bVar = this.f397598c;
                bVar.getClass();
                Throwable thD = io.reactivex.rxjava3.internal.util.h.d(bVar);
                org.reactivestreams.d<? super Void> dVar = this.f397597b;
                if (thD != null) {
                    dVar.onError(thD);
                } else {
                    dVar.e();
                }
            }
        }

        public final void l(int i12) {
            AtomicInteger atomicInteger;
            int i13;
            int i14;
            do {
                atomicInteger = this.f397600e;
                i13 = atomicInteger.get();
                if (i13 == Integer.MAX_VALUE) {
                    return;
                } else {
                    i14 = i13 + i12;
                }
            } while (!atomicInteger.compareAndSet(i13, i14 >= 0 ? i14 : Integer.MAX_VALUE));
            if (i13 == 0) {
                throw null;
            }
        }

        @Override // q41.g
        public final /* bridge */ /* synthetic */ Object poll() {
            return null;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return i12 & 2;
        }

        @Override // q41.g
        public final void clear() {
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
        }
    }

    /* compiled from: NonoMergeArray.java */
    public static final class a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Void>, org.reactivestreams.e {
        private static final long serialVersionUID = -7172670778151490886L;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.f(this, eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this);
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
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
        }
    }
}
