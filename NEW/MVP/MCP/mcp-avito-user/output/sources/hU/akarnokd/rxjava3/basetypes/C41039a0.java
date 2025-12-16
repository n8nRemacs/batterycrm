package hu.akarnokd.rxjava3.basetypes;

import hu.akarnokd.rxjava3.basetypes.Y;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: NonoRetryWhen.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41039a0 extends AbstractC41062i {

    /* compiled from: NonoRetryWhen.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.a0$a */
    public static final class a extends AbstractC41041b implements org.reactivestreams.d<Void>, Y.b {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.d(null, eVar);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new io.reactivex.rxjava3.processors.e().z();
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
