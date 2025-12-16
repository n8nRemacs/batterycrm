package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import n41.InterfaceC44186c;
import s41.C47998a;

/* compiled from: FlowableCollectWithCollectorSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.jdk8.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41798d<T, A, R> extends I<R> implements InterfaceC44186c<R> {

    /* compiled from: FlowableCollectWithCollectorSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.d$a */
    public static final class a<T, A, R> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402036b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402037c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(@j41.e org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402036b, eVar)) {
                this.f402036b = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402036b.cancel();
            this.f402036b = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402036b == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402037c) {
                C47998a.b(th2);
            } else {
                this.f402037c = true;
                this.f402036b = SubscriptionHelper.f404813b;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402037c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402036b.cancel();
                onError(th2);
            }
        }
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<R> f() {
        return new C41797c();
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(@j41.e L<? super R> l12) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.e(th2, l12);
        }
    }
}
