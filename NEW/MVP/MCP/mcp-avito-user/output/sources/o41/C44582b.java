package o41;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsyncSubscription.java */
/* renamed from: o41.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44582b extends AtomicLong implements org.reactivestreams.e, io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = 7028635084060361255L;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f419375c = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.e> f419374b = new AtomicReference<>();

    @Override // org.reactivestreams.e
    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        SubscriptionHelper.a(this.f419374b);
        DisposableHelper.a(this.f419375c);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return this.f419374b.get() == SubscriptionHelper.f404813b;
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        SubscriptionHelper.b(this.f419374b, this, j12);
    }
}
