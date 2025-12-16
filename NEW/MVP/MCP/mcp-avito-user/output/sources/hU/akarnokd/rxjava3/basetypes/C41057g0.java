package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: NonoToMaybe.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41057g0<T> extends io.reactivex.rxjava3.core.q<T> {

    /* compiled from: NonoToMaybe.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.g0$a */
    public static final class a<T> implements org.reactivestreams.d<Void>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f397713b;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397713b, eVar)) {
                this.f397713b = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f397713b.cancel();
            this.f397713b = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f397713b == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        throw null;
    }
}
