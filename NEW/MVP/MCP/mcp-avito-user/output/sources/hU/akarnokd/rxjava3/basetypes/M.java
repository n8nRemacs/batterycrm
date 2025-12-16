package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: NonoMapError.java */
/* loaded from: classes8.dex */
final class M extends AbstractC41062i {

    /* compiled from: NonoMapError.java */
    public static final class a extends AbstractC41044c {
        @Override // org.reactivestreams.d
        public final void e() {
            this.f397685b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f397685b.onError(new CompositeException(th2, th3));
            }
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
