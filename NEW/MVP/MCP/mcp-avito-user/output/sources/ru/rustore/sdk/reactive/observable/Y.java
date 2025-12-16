package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ObservableSwitchMap.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/rustore/sdk/reactive/observable/Y;", "T", "R", "Lru/rustore/sdk/reactive/observable/K;", "Lru/rustore/sdk/reactive/core/g;", "a", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class Y<T, R> implements K<T>, ru.rustore.sdk.reactive.core.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f436910a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f436911b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436912c = new AtomicReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436913d = new AtomicReference<>(null);

    /* compiled from: ObservableSwitchMap.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/reactive/observable/Y$a;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class a implements ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436914a = new AtomicReference<>(null);

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AtomicBoolean f436915b = new AtomicBoolean();

        public a() {
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            if (this.f436915b.compareAndSet(false, true)) {
                Y.this.getClass();
                throw null;
            }
        }
    }

    public Y(@Y61.k K k12) {
        this.f436910a = k12;
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
    @Override // ru.rustore.sdk.reactive.observable.K
    public final void a(@Y61.k ru.rustore.sdk.reactive.core.g gVar) {
        ru.rustore.sdk.reactive.core.g andSet;
        AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436913d;
        while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
        }
        if (this.f436911b.get() && (andSet = atomicReference.getAndSet(null)) != null) {
            andSet.dispose();
        }
        this.f436910a.a(this);
    }

    @Override // ru.rustore.sdk.reactive.core.g
    public final void dispose() {
        if (this.f436911b.compareAndSet(false, true)) {
            ru.rustore.sdk.reactive.core.g andSet = this.f436913d.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            ru.rustore.sdk.reactive.core.g andSet2 = this.f436912c.getAndSet(null);
            if (andSet2 != null) {
                andSet2.dispose();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onComplete() {
        throw null;
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onError(@Y61.k Throwable th2) {
        if (this.f436911b.compareAndSet(false, true)) {
            ru.rustore.sdk.reactive.core.g andSet = this.f436912c.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            throw null;
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onNext(T t12) {
        if (!this.f436911b.get()) {
            throw null;
        }
    }
}
