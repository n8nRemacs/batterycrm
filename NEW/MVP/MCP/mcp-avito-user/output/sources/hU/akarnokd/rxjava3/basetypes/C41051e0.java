package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: NonoTimeout.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41051e0 extends AbstractC41062i {

    /* compiled from: NonoTimeout.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.e0$a */
    public static final class a extends AbstractC41050e<Void, org.reactivestreams.e> implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397702b;

        /* renamed from: c, reason: collision with root package name */
        public final b f397703c = new b();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f397704d = new AtomicBoolean();

        /* compiled from: NonoTimeout.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.e0$a$a, reason: collision with other inner class name */
        public final class C11303a implements org.reactivestreams.d<Void> {
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
            public final /* bridge */ /* synthetic */ void onNext(Void r12) {
            }
        }

        /* compiled from: NonoTimeout.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.e0$a$b */
        public final class b extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = -7257274632636068061L;

            public b() {
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
                aVar.getClass();
                SubscriptionHelper.a(aVar);
                if (aVar.f397704d.compareAndSet(false, true)) {
                    aVar.f397702b.onError(new TimeoutException());
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.getClass();
                SubscriptionHelper.a(aVar);
                if (aVar.f397704d.compareAndSet(false, true)) {
                    aVar.f397702b.onError(th2);
                } else {
                    C47998a.b(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                SubscriptionHelper.a(this);
                e();
            }
        }

        public a(org.reactivestreams.d dVar) {
            this.f397702b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.f(this, eVar);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            SubscriptionHelper.a(this.f397703c);
            if (this.f397704d.compareAndSet(false, true)) {
                this.f397702b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            SubscriptionHelper.a(this.f397703c);
            if (this.f397704d.compareAndSet(false, true)) {
                this.f397702b.onError(th2);
            } else {
                C47998a.b(th2);
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
