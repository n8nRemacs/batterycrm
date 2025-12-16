package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: ObservableMap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/observable/G;", "T", "R", "Lru/rustore/sdk/reactive/observable/c;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class G<T, R> extends AbstractC47883c<R> {

    /* compiled from: ObservableMap.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/observable/G$a", "Lru/rustore/sdk/reactive/observable/K;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements K<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436888a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436889b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f436890c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ G<T, R> f436891d;

        public a(K<R> k12, G<T, R> g12) {
            this.f436890c = k12;
            this.f436891d = g12;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            ru.rustore.sdk.reactive.core.g andSet;
            AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436889b;
            while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
            }
            if (this.f436888a.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.f436890c.a(this);
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            ru.rustore.sdk.reactive.core.g andSet;
            if (!this.f436888a.compareAndSet(false, true) || (andSet = this.f436889b.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onComplete() {
            if (this.f436888a.compareAndSet(false, true)) {
                this.f436890c.onComplete();
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onError(Throwable th2) {
            if (this.f436888a.compareAndSet(false, true)) {
                this.f436890c.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onNext(T t12) {
            G<T, R> g12 = this.f436891d;
            try {
                int i12 = Z.f406624c;
                g12.getClass();
                throw null;
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                Z.b bVar = new Z.b(th2);
                boolean z12 = bVar instanceof Z.b;
                ?? r22 = this.f436890c;
                AtomicBoolean atomicBoolean = this.f436888a;
                if (!z12 && !atomicBoolean.get()) {
                    r22.onNext(bVar);
                }
                Throwable thB = Z.b(bVar);
                if (thB == null || !atomicBoolean.compareAndSet(false, true)) {
                    return;
                }
                ru.rustore.sdk.reactive.core.g andSet = this.f436889b.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                r22.onError(thB);
            }
        }
    }

    public G() {
        throw null;
    }

    @Override // ru.rustore.sdk.reactive.observable.AbstractC47883c
    public final void a(@Y61.k K<R> k12) {
        new a(k12, this);
        throw null;
    }
}
