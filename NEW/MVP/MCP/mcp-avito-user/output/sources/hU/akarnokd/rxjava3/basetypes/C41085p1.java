package hu.akarnokd.rxjava3.basetypes;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloCache.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.p1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41085p1<T> extends AbstractC41073l1<T> implements org.reactivestreams.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public T f397743b;

    /* compiled from: SoloCache.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.p1$a */
    public static final class a<T> extends o41.f<T> {
        private static final long serialVersionUID = -44000898247441619L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<Object> f397744d;

        public a(org.reactivestreams.d<? super T> dVar, C41085p1<T> c41085p1) {
            super(dVar);
            this.f397744d = new AtomicReference<>(c41085p1);
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            AtomicReference<Object> atomicReference = this.f397744d;
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

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a(dVar, this));
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        this.f397743b = t12;
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void e() {
    }
}
