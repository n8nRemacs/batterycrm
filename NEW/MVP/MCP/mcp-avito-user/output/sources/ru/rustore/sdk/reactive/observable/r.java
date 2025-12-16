package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: ObservableDoOnComplete.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/observable/r;", "T", "Lru/rustore/sdk/reactive/observable/c;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class r<T> extends AbstractC47883c<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f436923a = 0;

    /* compiled from: ObservableDoOnComplete.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/observable/r$a", "Lru/rustore/sdk/reactive/observable/K;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements K<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436924a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436925b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f436926c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r<T> f436927d;

        public a(K<T> k12, r<T> rVar) {
            this.f436926c = k12;
            this.f436927d = rVar;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            ru.rustore.sdk.reactive.core.g andSet;
            AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436925b;
            while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
            }
            if (this.f436924a.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.f436926c.a(this);
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            ru.rustore.sdk.reactive.core.g andSet;
            if (!this.f436924a.compareAndSet(false, true) || (andSet = this.f436925b.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onComplete() {
            AtomicBoolean atomicBoolean = this.f436924a;
            if (atomicBoolean.compareAndSet(false, true)) {
                r<T> rVar = this.f436927d;
                try {
                    int i12 = Z.f406624c;
                    int i13 = r.f436923a;
                    rVar.getClass();
                    throw null;
                } catch (Throwable th2) {
                    int i14 = Z.f406624c;
                    Z.b bVar = new Z.b(th2);
                    ?? r32 = this.f436926c;
                    Throwable thB = Z.b(bVar);
                    if (thB == null || !atomicBoolean.compareAndSet(false, true)) {
                        return;
                    }
                    ru.rustore.sdk.reactive.core.g andSet = this.f436925b.getAndSet(null);
                    if (andSet != null) {
                        andSet.dispose();
                    }
                    r32.onError(thB);
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onError(Throwable th2) {
            if (this.f436924a.compareAndSet(false, true)) {
                this.f436926c.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
        @Override // ru.rustore.sdk.reactive.observable.K
        public final void onNext(T t12) {
            if (this.f436924a.get()) {
                return;
            }
            this.f436926c.onNext(t12);
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.AbstractC47883c
    public final void a(@Y61.k K<T> k12) {
        new a(k12, this);
        throw null;
    }
}
