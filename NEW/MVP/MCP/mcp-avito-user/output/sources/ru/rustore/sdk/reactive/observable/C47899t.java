package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: ObservableDoOnDispose.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/observable/t;", "T", "Lru/rustore/sdk/reactive/observable/c;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: ru.rustore.sdk.reactive.observable.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47899t<T> extends AbstractC47883c<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f436928a = 0;

    /* compiled from: ObservableDoOnDispose.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/observable/t$a", "Lru/rustore/sdk/reactive/observable/K;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: ru.rustore.sdk.reactive.observable.t$a */
    public static final class a implements K<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436929a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436930b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f436931c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C47899t<T> f436932d;

        public a(K<T> k12, C47899t<T> c47899t) {
            this.f436931c = k12;
            this.f436932d = c47899t;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            ru.rustore.sdk.reactive.core.g andSet;
            AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436930b;
            while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
            }
            if (this.f436929a.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.f436931c.a(this);
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            if (this.f436929a.compareAndSet(false, true)) {
                C47899t<T> c47899t = this.f436932d;
                try {
                    int i12 = Z.f406624c;
                    int i13 = C47899t.f436928a;
                    c47899t.getClass();
                    throw null;
                } catch (Throwable th2) {
                    Object bVar = new Z.b(th2);
                    Throwable thB = Z.b(bVar);
                    AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436930b;
                    if (thB != null) {
                        ru.rustore.sdk.reactive.core.g andSet = atomicReference.getAndSet(null);
                        if (andSet != null) {
                            andSet.dispose();
                        }
                        onError(thB);
                    }
                    if (bVar instanceof Z.b) {
                        return;
                    }
                    ru.rustore.sdk.reactive.core.g andSet2 = atomicReference.getAndSet(null);
                    if (andSet2 != null) {
                        andSet2.dispose();
                    }
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onComplete() {
            if (this.f436929a.compareAndSet(false, true)) {
                this.f436931c.onComplete();
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onError(Throwable th2) {
            if (this.f436929a.compareAndSet(false, true)) {
                this.f436931c.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onNext(T t12) {
            if (this.f436929a.get()) {
                return;
            }
            this.f436931c.onNext(t12);
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.AbstractC47883c
    public final void a(@Y61.k K<T> k12) {
        new a(k12, this);
        throw null;
    }
}
