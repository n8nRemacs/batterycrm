package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BasicMergeSubscription.java */
/* renamed from: hu.akarnokd.rxjava3.operators.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41143b<T> extends AtomicInteger implements org.reactivestreams.e, io.reactivex.rxjava3.internal.subscribers.m<T> {
    private static final long serialVersionUID = -8467324377226330554L;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f397999b;

    public C41143b() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.m
    public final void a(io.reactivex.rxjava3.internal.subscribers.l<T> lVar, Throwable th2) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.m
    public final void b(io.reactivex.rxjava3.internal.subscribers.l<T> lVar, T t12) {
        lVar.queue().offer(t12);
        c();
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.m
    public final void c() {
        if (getAndIncrement() == 0) {
            throw null;
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        if (this.f397999b) {
            return;
        }
        this.f397999b = true;
        throw null;
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.m
    public final void d(io.reactivex.rxjava3.internal.subscribers.l<T> lVar) {
        lVar.f404788c = true;
        c();
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        if (SubscriptionHelper.h(j12)) {
            io.reactivex.rxjava3.internal.util.c.a(null, j12);
            throw null;
        }
    }
}
