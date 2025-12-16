package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: SingleFromPublisher.java */
/* loaded from: classes8.dex */
public final class H<T> extends io.reactivex.rxjava3.core.I<T> {

    /* compiled from: SingleFromPublisher.java */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404504b;

        /* renamed from: c, reason: collision with root package name */
        public T f404505c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f404506d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404507e;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404504b, eVar)) {
                this.f404504b = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404507e = true;
            this.f404504b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404506d) {
                return;
            }
            this.f404506d = true;
            this.f404505c = null;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404507e;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404506d) {
                C47998a.b(th2);
            } else {
                this.f404506d = true;
                this.f404505c = null;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404506d) {
                return;
            }
            if (this.f404505c == null) {
                this.f404505c = t12;
                return;
            }
            this.f404504b.cancel();
            this.f404506d = true;
            this.f404505c = null;
            new IndexOutOfBoundsException("Too many elements in the Publisher");
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        throw null;
    }
}
