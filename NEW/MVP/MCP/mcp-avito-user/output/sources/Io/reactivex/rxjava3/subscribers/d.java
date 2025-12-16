package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: SafeSubscriber.java */
/* loaded from: classes8.dex */
public final class d<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

    /* renamed from: b, reason: collision with root package name */
    public org.reactivestreams.e f405042b;

    @Override // org.reactivestreams.d
    public final void K(@j41.e org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f405042b, eVar)) {
            this.f405042b = eVar;
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                try {
                    eVar.cancel();
                    C47998a.b(th2);
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    C47998a.b(new CompositeException(th2, th3));
                }
            }
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        try {
            this.f405042b.cancel();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(@j41.e Throwable th2) {
        C47998a.b(th2);
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        try {
            this.f405042b.request(j12);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            try {
                this.f405042b.cancel();
                C47998a.b(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                C47998a.b(new CompositeException(th2, th3));
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
    }

    @Override // org.reactivestreams.d
    public final void onNext(@j41.e T t12) {
    }
}
