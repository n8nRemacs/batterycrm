package hu.akarnokd.rxjava3.basetypes;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PerhapsCache.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41081o0<T> extends AbstractC41069k0<T> implements org.reactivestreams.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public T f397736b;

    /* compiled from: PerhapsCache.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.o0$a */
    public static final class a<T> extends o41.f<T> {
        private static final long serialVersionUID = -44000898247441619L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<Object> f397737d;

        public a(org.reactivestreams.d<? super T> dVar, C41081o0<T> c41081o0) {
            super(dVar);
            this.f397737d = new AtomicReference<>(c41081o0);
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            AtomicReference<Object> atomicReference = this.f397737d;
            Object obj = atomicReference.get();
            if (obj != null) {
                while (!atomicReference.compareAndSet(obj, null)) {
                    if (atomicReference.get() != obj) {
                        return;
                    }
                }
                throw null;
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        eVar.request(Long.MAX_VALUE);
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a(dVar, this));
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void e() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        this.f397736b = t12;
    }
}
