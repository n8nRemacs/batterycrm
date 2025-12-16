package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: NonoMerge.java */
/* loaded from: classes8.dex */
final class N extends AbstractC41062i {

    /* compiled from: NonoMerge.java */
    public static final class a extends AbstractC41041b implements org.reactivestreams.d<AbstractC41062i> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397584b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f397585c = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f397586d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397587e;

        /* compiled from: NonoMerge.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.N$a$a, reason: collision with other inner class name */
        public final class C11290a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Void>, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -2042478764098922486L;

            public C11290a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.f(this, eVar);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                SubscriptionHelper.a(this);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a aVar = a.this;
                aVar.f397585c.c(this);
                if (aVar.decrementAndGet() != 0) {
                    aVar.f397587e.request(1L);
                    return;
                }
                io.reactivex.rxjava3.internal.util.b bVar = aVar.f397586d;
                bVar.getClass();
                Throwable thD = io.reactivex.rxjava3.internal.util.h.d(bVar);
                if (thD != null) {
                    aVar.f397584b.onError(thD);
                } else {
                    aVar.f397584b.e();
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return SubscriptionHelper.f404813b == get();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f397585c.c(this);
                if (aVar.f397586d.b(th2)) {
                    aVar.f397585c.dispose();
                    io.reactivex.rxjava3.internal.util.b bVar = aVar.f397586d;
                    bVar.getClass();
                    Throwable thD = io.reactivex.rxjava3.internal.util.h.d(bVar);
                    if (thD != io.reactivex.rxjava3.internal.util.h.f404834a) {
                        aVar.f397584b.onError(thD);
                    }
                }
            }

            @Override // org.reactivestreams.d
            public final /* bridge */ /* synthetic */ void onNext(Void r12) {
            }
        }

        public a(org.reactivestreams.d dVar) {
            this.f397584b = dVar;
            lazySet(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397587e, eVar)) {
                this.f397587e = eVar;
                this.f397584b.K(this);
                eVar.request(0);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (decrementAndGet() == 0) {
                this.f397586d.g(this.f397584b);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.internal.util.b bVar = this.f397586d;
            bVar.getClass();
            if (!io.reactivex.rxjava3.internal.util.h.a(bVar, th2)) {
                C47998a.b(th2);
            } else {
                this.f397585c.dispose();
                this.f397586d.g(this.f397584b);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(AbstractC41062i abstractC41062i) {
            getAndIncrement();
            C11290a c11290a = new C11290a();
            this.f397585c.b(c11290a);
            abstractC41062i.d(c11290a);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
