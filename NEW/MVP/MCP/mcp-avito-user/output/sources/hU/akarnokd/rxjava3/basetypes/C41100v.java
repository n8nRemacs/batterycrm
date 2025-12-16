package hu.akarnokd.rxjava3.basetypes;

/* compiled from: NonoDelay.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41100v extends AbstractC41062i {

    /* compiled from: NonoDelay.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.v$a */
    public static final class a extends AbstractC41047d<io.reactivex.rxjava3.disposables.d> implements Runnable {

        /* renamed from: d, reason: collision with root package name */
        public Throwable f397788d;

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397788d = th2;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f397788d;
            if (th2 == null) {
                this.f397696b.e();
            } else {
                this.f397788d = null;
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
