package hu.akarnokd.rxjava3.basetypes;

/* compiled from: NonoObserveOn.java */
/* loaded from: classes8.dex */
final class S extends AbstractC41062i {

    /* compiled from: NonoObserveOn.java */
    public static final class a extends AbstractC41047d<io.reactivex.rxjava3.disposables.d> implements Runnable {

        /* renamed from: d, reason: collision with root package name */
        public Throwable f397617d;

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397617d = th2;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f397617d;
            if (th2 == null) {
                this.f397696b.e();
            } else {
                this.f397617d = null;
                this.f397696b.onError(th2);
            }
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
