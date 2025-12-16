package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObservableSubscribe.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/observable/N;", "T", "Lru/rustore/sdk/reactive/observable/K;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class N<T> implements K<T>, ru.rustore.sdk.reactive.core.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Throwable, G0> f436892a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f436893b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, G0> f436894c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f436895d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436896e = new AtomicReference<>(null);

    public N(@Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        this.f436892a = lVar;
        this.f436893b = aVar;
        this.f436894c = lVar2;
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void a(@Y61.k ru.rustore.sdk.reactive.core.g gVar) {
        ru.rustore.sdk.reactive.core.g andSet;
        AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436896e;
        while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
        }
        if (!this.f436895d.get() || (andSet = atomicReference.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // ru.rustore.sdk.reactive.core.g
    public final void dispose() {
        ru.rustore.sdk.reactive.core.g andSet;
        if (!this.f436895d.compareAndSet(false, true) || (andSet = this.f436896e.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onComplete() {
        if (this.f436895d.compareAndSet(false, true)) {
            this.f436893b.invoke();
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onError(@Y61.k Throwable th2) {
        if (this.f436895d.compareAndSet(false, true)) {
            this.f436892a.invoke(th2);
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onNext(T t12) {
        if (this.f436895d.get()) {
            return;
        }
        this.f436894c.invoke(t12);
    }
}
