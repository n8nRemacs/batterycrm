package hu.akarnokd.rxjava3.basetypes;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloTimer.java */
/* loaded from: classes8.dex */
final class Z1 extends AbstractC41073l1<Long> {

    /* compiled from: SoloTimer.java */
    public static final class a extends o41.f<Long> implements Runnable {
        private static final long serialVersionUID = -4937102843159363918L;

        public a(org.reactivestreams.d<? super Long> dVar) {
            super(dVar);
            new AtomicReference();
        }

        @Override // java.lang.Runnable
        public final void run() {
            l(0L);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super Long> dVar) {
        dVar.K(new a(dVar));
        throw null;
    }
}
