package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: NonoSubscribeOn.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41045c0 extends AbstractC41062i {

    /* compiled from: NonoSubscribeOn.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.c0$a */
    public static final class a extends AbstractC41050e<Void, org.reactivestreams.e> implements org.reactivestreams.d<Void>, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397687b;

        public a(org.reactivestreams.d dVar) {
            this.f397687b = dVar;
            new m41.d();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.f(this, eVar);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397687b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397687b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        dVar.K(new a(dVar));
        throw null;
    }
}
