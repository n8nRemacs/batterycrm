package hu.akarnokd.rxjava3.expr;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: FlowableWhileDoWhile.java */
/* loaded from: classes8.dex */
final class e<T> extends AbstractC41777j<T> {

    /* compiled from: FlowableWhileDoWhile.java */
    public static final class a<T> extends o41.h implements org.reactivestreams.d<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -5255585317630843019L;

        /* renamed from: j, reason: collision with root package name */
        public long f397876j;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f397876j++;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
