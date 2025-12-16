package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: NonoFromPublisher.java */
/* loaded from: classes8.dex */
final class H extends AbstractC41062i {

    /* compiled from: NonoFromPublisher.java */
    public static final class a extends AbstractC41044c {
        public a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41044c, org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397686c, eVar)) {
                this.f397686c = eVar;
                this.f397685b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397685b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397685b.onError(th2);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
