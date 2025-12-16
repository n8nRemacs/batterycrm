package hu.akarnokd.rxjava3.basetypes;

import o41.AbstractC44583c;
import s41.C47998a;

/* compiled from: NonoAmbIterable.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41068k extends AbstractC41062i {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        a aVar = new a(dVar);
        dVar.K(aVar);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            aVar.onError(th2);
        }
    }

    /* compiled from: NonoAmbIterable.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.k$a */
    public static final class a extends AbstractC44583c<Void> implements org.reactivestreams.d<Void> {
        private static final long serialVersionUID = 3576466667528056758L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397721b;

        /* renamed from: c, reason: collision with root package name */
        public final hu.akarnokd.rxjava3.util.a f397722c = new hu.akarnokd.rxjava3.util.a();

        public a(org.reactivestreams.d<? super Void> dVar) {
            this.f397721b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            this.f397722c.a(eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (compareAndSet(0, 1)) {
                this.f397722c.cancel();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (compareAndSet(0, 1)) {
                this.f397722c.cancel();
                this.f397721b.e();
            }
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!compareAndSet(0, 1)) {
                C47998a.b(th2);
            } else {
                this.f397722c.cancel();
                this.f397721b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final /* bridge */ /* synthetic */ void onNext(Void r12) {
        }

        @Override // q41.g
        public final /* bridge */ /* synthetic */ Object poll() {
            return null;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return i12 & 2;
        }

        @Override // q41.g
        public final void clear() {
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
        }
    }
}
