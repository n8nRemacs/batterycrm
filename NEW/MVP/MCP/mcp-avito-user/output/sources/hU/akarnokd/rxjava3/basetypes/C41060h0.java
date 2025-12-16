package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: NonoToPerhaps.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41060h0<T> extends AbstractC41069k0<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }

    /* compiled from: NonoToPerhaps.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.h0$a */
    public static final class a<T> extends AbstractC41038a implements org.reactivestreams.d<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super T> f397718b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f397719c;

        public a(org.reactivestreams.d<? super T> dVar) {
            this.f397718b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397719c, eVar)) {
                this.f397719c = eVar;
                this.f397718b.K(this);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397718b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397718b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
        }
    }
}
