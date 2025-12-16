package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: NonoConcatArray.java */
/* loaded from: classes8.dex */
final class r extends AbstractC41062i {

    /* compiled from: NonoConcatArray.java */
    public static final class a extends AbstractC41050e<Void, org.reactivestreams.e> implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397759b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f397760c = null;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f397761d = new AtomicInteger();

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f397762e;

        public a(org.reactivestreams.d dVar) {
            this.f397759b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.d(this, eVar);
        }

        public final void a() {
            if (this.f397761d.getAndIncrement() != 0) {
                return;
            }
            while (SubscriptionHelper.f404813b != get()) {
                if (!this.f397762e) {
                    throw null;
                }
                if (this.f397761d.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397762e = false;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.internal.util.b bVar = this.f397760c;
            if (bVar == null) {
                this.f397759b.onError(th2);
            } else if (bVar.b(th2)) {
                this.f397762e = false;
                a();
            }
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hu.akarnokd.rxjava3.basetypes.r$a, org.reactivestreams.e] */
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        ?? aVar = new a(dVar);
        dVar.K(aVar);
        aVar.a();
    }
}
