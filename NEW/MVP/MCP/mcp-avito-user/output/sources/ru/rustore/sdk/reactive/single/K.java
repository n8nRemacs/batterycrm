package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import ru.rustore.sdk.reactive.observable.AbstractC47883c;

/* compiled from: SingleToObservable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/K;", "T", "Lru/rustore/sdk/reactive/observable/c;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class K<T> extends AbstractC47883c<T> {

    /* compiled from: SingleToObservable.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/single/K$a", "Lru/rustore/sdk/reactive/single/B;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements B<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436965a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436966b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f436967c;

        public a(ru.rustore.sdk.reactive.observable.K<T> k12) {
            this.f436967c = k12;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.single.B
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            ru.rustore.sdk.reactive.core.g andSet;
            AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436966b;
            while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
            }
            if (this.f436965a.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.f436967c.a(this);
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            ru.rustore.sdk.reactive.core.g andSet;
            if (!this.f436965a.compareAndSet(false, true) || (andSet = this.f436966b.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.single.B
        public final void onError(Throwable th2) {
            if (this.f436965a.compareAndSet(false, true)) {
                this.f436967c.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.single.B
        public final void onSuccess(T t12) {
            if (this.f436965a.compareAndSet(false, true)) {
                ?? r02 = this.f436967c;
                r02.onNext(t12);
                r02.onComplete();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.AbstractC47883c
    public final void a(@Y61.k ru.rustore.sdk.reactive.observable.K<T> k12) {
        new a(k12);
        throw null;
    }
}
