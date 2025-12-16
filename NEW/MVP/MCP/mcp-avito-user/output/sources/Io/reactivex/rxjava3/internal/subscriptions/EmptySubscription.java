package io.reactivex.rxjava3.internal.subscriptions;

import j41.f;
import q41.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class EmptySubscription implements d<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final EmptySubscription f404811b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EmptySubscription[] f404812c;

    static {
        EmptySubscription emptySubscription = new EmptySubscription("INSTANCE", 0);
        f404811b = emptySubscription;
        f404812c = new EmptySubscription[]{emptySubscription};
    }

    public EmptySubscription() {
        throw null;
    }

    public static void a(org.reactivestreams.d<?> dVar) {
        dVar.K(f404811b);
        dVar.e();
    }

    public static void b(Throwable th2, org.reactivestreams.d<?> dVar) {
        dVar.K(f404811b);
        dVar.onError(th2);
    }

    public static EmptySubscription valueOf(String str) {
        return (EmptySubscription) Enum.valueOf(EmptySubscription.class, str);
    }

    public static EmptySubscription[] values() {
        return (EmptySubscription[]) f404812c.clone();
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // q41.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // q41.g
    @f
    public final Object poll() {
        return null;
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        SubscriptionHelper.h(j12);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // q41.InterfaceC47200c
    public final int v(int i12) {
        return i12 & 2;
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
    }

    @Override // q41.g
    public final void clear() {
    }
}
