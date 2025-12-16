package hu.akarnokd.rxjava3.basetypes;

import java.util.concurrent.atomic.AtomicBoolean;
import s41.C47998a;

/* compiled from: PerhapsAmbArray.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41072l0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsAmbArray.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.l0$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -5477345444871880990L;

        /* renamed from: d, reason: collision with root package name */
        public final hu.akarnokd.rxjava3.util.a f397724d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f397725e;

        public a(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
            this.f397724d = new hu.akarnokd.rxjava3.util.a();
            this.f397725e = new AtomicBoolean();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (this.f397724d.a(eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397724d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397725e.compareAndSet(false, true)) {
                this.f397724d.cancel();
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!this.f397725e.compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                this.f397724d.cancel();
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f397725e.compareAndSet(false, true)) {
                this.f397724d.cancel();
                l(t12);
            }
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a(dVar));
        throw null;
    }
}
