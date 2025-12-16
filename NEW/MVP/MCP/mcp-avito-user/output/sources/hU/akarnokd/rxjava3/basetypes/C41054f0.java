package hu.akarnokd.rxjava3.basetypes;

/* compiled from: NonoTimer.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41054f0 extends AbstractC41062i {

    /* compiled from: NonoTimer.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.f0$a */
    public static final class a extends AbstractC41050e<Void, io.reactivex.rxjava3.disposables.d> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397708b;

        public a(org.reactivestreams.d<? super Void> dVar) {
            this.f397708b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f397708b.e();
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        dVar.K(new a(dVar));
        throw null;
    }
}
