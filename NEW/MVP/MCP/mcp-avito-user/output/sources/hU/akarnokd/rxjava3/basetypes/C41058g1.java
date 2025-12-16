package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: PerhapsToObservable.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.g1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41058g1<T> extends io.reactivex.rxjava3.core.z<T> {

    /* compiled from: PerhapsToObservable.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.g1$a */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.n<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -1626180231890768109L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397714d;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397714d, eVar)) {
                this.f397714d = eVar;
                this.f402118b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            T t12 = this.f402119c;
            if (t12 != null) {
                a(t12);
            } else {
                this.f402118b.e();
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.n, org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402118b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402119c = t12;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        new a(g12);
        throw null;
    }
}
