package hu.akarnokd.rxjava3.basetypes;

/* compiled from: NonoOnErrorComplete.java */
/* loaded from: classes8.dex */
final class T extends AbstractC41062i {

    /* compiled from: NonoOnErrorComplete.java */
    public static final class a extends AbstractC41044c {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397685b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397685b.e();
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
