package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: NonoConcatIterable.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41091s extends AbstractC41062i {

    /* compiled from: NonoConcatIterable.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.s$a */
    public static final class a extends AbstractC41050e<Void, org.reactivestreams.e> implements org.reactivestreams.d<Void> {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.d(this, eVar);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            Object obj = null;
            obj.getClass();
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
