package hu.akarnokd.rxjava3.basetypes;

import hu.akarnokd.rxjava3.basetypes.W;

/* compiled from: NonoRetry.java */
/* loaded from: classes8.dex */
final class Z extends AbstractC41062i {

    /* compiled from: NonoRetry.java */
    public static final class a extends W.a {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397647b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397650e = false;
            a(th2);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
