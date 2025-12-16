package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SingleSubscribe.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/single/F;", "T", "Lru/rustore/sdk/reactive/single/B;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class F<T> implements B<T>, ru.rustore.sdk.reactive.core.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N f436949a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f436950b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f436951c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436952d = new AtomicReference<>(null);

    /* JADX WARN: Multi-variable type inference failed */
    public F(@Y61.k Y41.l<? super Throwable, G0> lVar, @Y61.k Y41.l<? super T, G0> lVar2) {
        this.f436949a = (N) lVar;
        this.f436950b = (N) lVar2;
    }

    @Override // ru.rustore.sdk.reactive.single.B
    public final void a(@Y61.k ru.rustore.sdk.reactive.core.g gVar) {
        ru.rustore.sdk.reactive.core.g andSet;
        AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436952d;
        while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
        }
        if (!this.f436951c.get() || (andSet = atomicReference.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // ru.rustore.sdk.reactive.core.g
    public final void dispose() {
        ru.rustore.sdk.reactive.core.g andSet;
        if (!this.f436951c.compareAndSet(false, true) || (andSet = this.f436952d.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // ru.rustore.sdk.reactive.single.B
    public final void onError(@Y61.k Throwable th2) {
        if (this.f436951c.compareAndSet(false, true)) {
            this.f436949a.invoke(th2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // ru.rustore.sdk.reactive.single.B
    public final void onSuccess(T t12) {
        if (this.f436951c.compareAndSet(false, true)) {
            this.f436950b.invoke(t12);
        }
    }
}
