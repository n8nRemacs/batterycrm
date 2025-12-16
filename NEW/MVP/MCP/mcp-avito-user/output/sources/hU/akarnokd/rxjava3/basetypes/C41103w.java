package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: NonoDelaySubscription.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41103w extends AbstractC41062i {

    /* compiled from: NonoDelaySubscription.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.w$a */
    public static final class a extends AbstractC41050e<Object, org.reactivestreams.e> implements org.reactivestreams.d<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397793b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f397794c;

        /* compiled from: NonoDelaySubscription.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.w$a$a, reason: collision with other inner class name */
        public final class C11316a implements org.reactivestreams.d<Void> {
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

        public a(org.reactivestreams.d dVar) {
            this.f397793b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this, eVar)) {
                this.f397793b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397794c) {
                return;
            }
            this.f397794c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397794c) {
                C47998a.b(th2);
            } else {
                this.f397793b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            if (this.f397794c) {
                return;
            }
            get().cancel();
            e();
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
