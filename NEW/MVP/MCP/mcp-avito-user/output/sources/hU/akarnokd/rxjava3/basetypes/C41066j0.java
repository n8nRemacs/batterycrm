package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: NonoUsing.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41066j0<R> extends AbstractC41062i {

    /* compiled from: NonoUsing.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.j0$a */
    public static final class a<R> extends AbstractC41041b implements org.reactivestreams.d<Void> {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f397720b;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397720b, eVar)) {
                this.f397720b = eVar;
                throw null;
            }
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

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
