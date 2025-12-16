package hu.akarnokd.rxjava3.basetypes;

import java.util.NoSuchElementException;
import s41.C47998a;

/* compiled from: SoloFromPublisher.java */
/* loaded from: classes8.dex */
final class F1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloFromPublisher.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.h<T, T> {
        private static final long serialVersionUID = 1473656799413159020L;

        /* renamed from: f, reason: collision with root package name */
        public boolean f397574f;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void e() {
            if (this.f397574f) {
                return;
            }
            if (!this.f404783e) {
                onError(new NoSuchElementException());
            } else {
                this.f397574f = true;
                l(this.f419377c);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397574f) {
                C47998a.b(th2);
                return;
            }
            this.f419377c = null;
            this.f397574f = true;
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f397574f) {
                return;
            }
            if (this.f404783e) {
                this.f404782d.cancel();
                onError(new IndexOutOfBoundsException());
            } else {
                this.f404783e = true;
                this.f419377c = t12;
            }
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
