package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: NonoDoOnLifecycle.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41109y extends AbstractC41062i {

    /* compiled from: NonoDoOnLifecycle.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.y$a */
    public final class a extends AbstractC41044c {
        public a(org.reactivestreams.d<? super Void> dVar) {
            super(dVar);
        }

        @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41044c, org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397686c, eVar)) {
                this.f397686c = eVar;
                try {
                    C41109y.this.getClass();
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    eVar.cancel();
                    this.f397685b.K(EmptySubscription.f404811b);
                    onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            C41109y.this.getClass();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            C41109y.this.getClass();
            C47998a.b(th2);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
