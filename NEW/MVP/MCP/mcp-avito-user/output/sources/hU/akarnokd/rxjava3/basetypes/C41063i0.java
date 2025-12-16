package hu.akarnokd.rxjava3.basetypes;

/* compiled from: NonoUnsubscribeOn.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41063i0 extends AbstractC41062i {

    /* compiled from: NonoUnsubscribeOn.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.i0$a */
    public static final class a extends AbstractC41044c implements Runnable {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397685b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397685b.onError(th2);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f397686c.cancel();
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
