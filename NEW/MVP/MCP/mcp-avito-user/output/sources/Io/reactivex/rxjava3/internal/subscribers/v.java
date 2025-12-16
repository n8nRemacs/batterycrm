package io.reactivex.rxjava3.internal.subscribers;

import androidx.compose.foundation.text.selection.C21030p;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: StrictSubscriber.java */
/* loaded from: classes8.dex */
public class v<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: b, reason: collision with root package name */
    public final org.reactivestreams.d<? super T> f404805b;

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.internal.util.b f404806c = new io.reactivex.rxjava3.internal.util.b();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f404807d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.e> f404808e = new AtomicReference<>();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f404809f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f404810g;

    public v(org.reactivestreams.d<? super T> dVar) {
        this.f404805b = dVar;
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (this.f404809f.compareAndSet(false, true)) {
            this.f404805b.K(this);
            SubscriptionHelper.c(this.f404808e, this.f404807d, eVar);
        } else {
            eVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        if (this.f404810g) {
            return;
        }
        SubscriptionHelper.a(this.f404808e);
    }

    @Override // org.reactivestreams.d
    public final void e() {
        this.f404810g = true;
        io.reactivex.rxjava3.internal.util.i.b(this.f404805b, this, this.f404806c);
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        this.f404810g = true;
        io.reactivex.rxjava3.internal.util.i.d(this.f404805b, th2, this, this.f404806c);
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        io.reactivex.rxjava3.internal.util.i.f(this.f404805b, t12, this, this.f404806c);
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        if (j12 > 0) {
            SubscriptionHelper.b(this.f404808e, this.f404807d, j12);
        } else {
            cancel();
            onError(new IllegalArgumentException(C21030p.a(j12, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}
