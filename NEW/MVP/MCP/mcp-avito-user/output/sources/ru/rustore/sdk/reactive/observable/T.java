package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import ru.rustore.sdk.reactive.core.TakeCountException;

/* compiled from: ObservableTakeFirst.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/observable/T;", "T", "Lru/rustore/sdk/reactive/observable/c;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class T<T> extends AbstractC47883c<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f436900a = 0;

    /* compiled from: ObservableTakeFirst.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/observable/T$a", "Lru/rustore/sdk/reactive/observable/K;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements K<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436901a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f436902b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436903c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f436904d;

        public a(T<T> t12, K<T> k12) {
            this.f436904d = k12;
            int i12 = T.f436900a;
            t12.getClass();
            this.f436902b = new AtomicInteger(0);
            this.f436903c = new AtomicReference<>(null);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            ru.rustore.sdk.reactive.core.g andSet;
            AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436903c;
            while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
            }
            if (this.f436901a.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.f436904d.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        public final void b() {
            if (this.f436901a.compareAndSet(false, true)) {
                this.f436904d.onComplete();
            }
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            ru.rustore.sdk.reactive.core.g andSet;
            if (!this.f436901a.compareAndSet(false, true) || (andSet = this.f436903c.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onComplete() {
            if (this.f436901a.compareAndSet(false, true)) {
                if (this.f436902b.get() <= 0) {
                    b();
                } else {
                    this.f436904d.onError(new TakeCountException("onComplete() called before all emits reached"));
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onError(Throwable th2) {
            if (this.f436901a.compareAndSet(false, true)) {
                this.f436904d.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onNext(T t12) {
            int iDecrementAndGet = this.f436902b.decrementAndGet();
            ?? r12 = this.f436904d;
            if (iDecrementAndGet != 0) {
                r12.onNext(t12);
            } else {
                r12.onNext(t12);
                b();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.AbstractC47883c
    public final void a(@Y61.k K<T> k12) {
        new a(this, k12);
        throw null;
    }
}
