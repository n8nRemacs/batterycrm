package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: NonoFromMaybe.java */
/* loaded from: classes8.dex */
final class F extends AbstractC41062i {

    /* compiled from: NonoFromMaybe.java */
    public static final class a extends AbstractC41038a implements io.reactivex.rxjava3.core.t<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397572b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397573c;

        public a(org.reactivestreams.d<? super Void> dVar) {
            this.f397572b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397573c, dVar)) {
                this.f397573c = dVar;
                this.f397572b.K(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f397572b.e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f397572b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(Object obj) {
            this.f397572b.e();
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
