package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: NonoTakeUntil.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41048d0 extends AbstractC41062i {

    /* compiled from: NonoTakeUntil.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.d0$a */
    public static final class a extends AbstractC41050e<Void, org.reactivestreams.e> implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397698b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f397699c = new AtomicBoolean();

        /* renamed from: d, reason: collision with root package name */
        public final C11302a f397700d = new C11302a();

        /* compiled from: NonoTakeUntil.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.d0$a$a, reason: collision with other inner class name */
        public final class C11302a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = 9056087023210091030L;

            public C11302a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a aVar = a.this;
                if (aVar.f397699c.compareAndSet(false, true)) {
                    SubscriptionHelper.a(aVar);
                    aVar.f397698b.e();
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                if (!aVar.f397699c.compareAndSet(false, true)) {
                    C47998a.b(th2);
                } else {
                    SubscriptionHelper.a(aVar);
                    aVar.f397698b.onError(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                get().cancel();
                a aVar = a.this;
                if (aVar.f397699c.compareAndSet(false, true)) {
                    SubscriptionHelper.a(aVar);
                    aVar.f397698b.e();
                }
            }
        }

        public a(org.reactivestreams.d<? super Void> dVar) {
            this.f397698b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.f(this, eVar);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397699c.compareAndSet(false, true)) {
                SubscriptionHelper.a(this.f397700d);
                this.f397698b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!this.f397699c.compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                SubscriptionHelper.a(this.f397700d);
                this.f397698b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        dVar.K(new a(dVar));
        throw null;
    }
}
