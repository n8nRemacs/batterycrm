package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import n41.InterfaceC44186c;
import s41.C47998a;

/* compiled from: FlowableSingleSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41906z1<T> extends io.reactivex.rxjava3.core.I<T> implements InterfaceC44186c<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41777j<T> f403120b;

    /* compiled from: FlowableSingleSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z1$a */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f403121b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f403122c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f403123d;

        /* renamed from: e, reason: collision with root package name */
        public T f403124e;

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f403121b = l12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403122c, eVar)) {
                this.f403122c = eVar;
                this.f403121b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403122c.cancel();
            this.f403122c = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f403123d) {
                return;
            }
            this.f403123d = true;
            this.f403122c = SubscriptionHelper.f404813b;
            T t12 = this.f403124e;
            this.f403124e = null;
            if (t12 == null) {
                t12 = null;
            }
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f403121b;
            if (t12 != null) {
                l12.onSuccess(t12);
            } else {
                l12.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403122c == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f403123d) {
                C47998a.b(th2);
                return;
            }
            this.f403123d = true;
            this.f403122c = SubscriptionHelper.f404813b;
            this.f403121b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f403123d) {
                return;
            }
            if (this.f403124e == null) {
                this.f403124e = t12;
                return;
            }
            this.f403123d = true;
            this.f403122c.cancel();
            this.f403122c = SubscriptionHelper.f404813b;
            this.f403121b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public C41906z1(AbstractC41777j abstractC41777j) {
        this.f403120b = abstractC41777j;
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<T> f() {
        return new C41900x1(this.f403120b, true);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f403120b.q(new a(l12));
    }
}
