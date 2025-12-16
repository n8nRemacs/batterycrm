package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: NonoAndThen.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41071l extends AbstractC41062i {

    /* compiled from: NonoAndThen.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.l$a */
    public static final class a extends AbstractC41050e<Void, org.reactivestreams.e> implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397723b;

        /* compiled from: NonoAndThen.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.l$a$a, reason: collision with other inner class name */
        public final class C11306a implements org.reactivestreams.d<Void> {
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
            this.f397723b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this, eVar)) {
                this.f397723b.K(this);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397723b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
