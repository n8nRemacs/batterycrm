package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* compiled from: SingleFlatMap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lru/rustore/sdk/reactive/single/s;", "T", "R", "Lru/rustore/sdk/reactive/single/a;", "a", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class s<T, R> extends AbstractC47905a<R> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC47905a<T> f436981b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N f436982c;

    /* compiled from: SingleFlatMap.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/reactive/single/s$a;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class a implements ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AtomicBoolean f436983a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436984b = new AtomicReference<>(null);

        public a(s sVar) {
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            ru.rustore.sdk.reactive.core.g andSet;
            if (!this.f436983a.compareAndSet(false, true) || (andSet = this.f436984b.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }
    }

    /* compiled from: SingleFlatMap.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/single/s$b", "Lru/rustore/sdk/reactive/single/B;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class b implements B<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436985a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436986b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436987c = new AtomicReference<>(null);

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ B<R> f436988d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s<T, R> f436989e;

        public b(B<R> b12, s<T, R> sVar) {
            this.f436988d = b12;
            this.f436989e = sVar;
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436986b;
            while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
            }
            if (this.f436985a.get()) {
                ru.rustore.sdk.reactive.core.g andSet = atomicReference.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                ru.rustore.sdk.reactive.core.g andSet2 = this.f436987c.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
            this.f436988d.a(this);
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            if (this.f436985a.compareAndSet(false, true)) {
                ru.rustore.sdk.reactive.core.g andSet = this.f436986b.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                ru.rustore.sdk.reactive.core.g andSet2 = this.f436987c.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onError(Throwable th2) {
            if (this.f436985a.compareAndSet(false, true)) {
                this.f436988d.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r1v7, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // ru.rustore.sdk.reactive.single.B
        public final void onSuccess(T t12) {
            Object bVar;
            if (this.f436985a.compareAndSet(false, true)) {
                s<T, R> sVar = this.f436989e;
                a aVar = new a(sVar);
                this.f436987c.set(aVar);
                r rVar = new r(aVar, this.f436988d);
                AtomicBoolean atomicBoolean = aVar.f436983a;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    int i12 = Z.f406624c;
                    bVar = (AbstractC47905a) sVar.f436982c.invoke(t12);
                } catch (Throwable th2) {
                    int i13 = Z.f406624c;
                    bVar = new Z.b(th2);
                }
                if (!(bVar instanceof Z.b)) {
                    AbstractC47905a abstractC47905a = (AbstractC47905a) bVar;
                    if (!atomicBoolean.get()) {
                        abstractC47905a.a(rVar);
                    }
                }
                Throwable thB = Z.b(bVar);
                if (thB == null || atomicBoolean.get()) {
                    return;
                }
                rVar.onError(thB);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(@Y61.k AbstractC47905a<T> abstractC47905a, @Y61.k Y41.l<? super T, ? extends AbstractC47905a<R>> lVar) {
        this.f436981b = abstractC47905a;
        this.f436982c = (N) lVar;
    }

    @Override // ru.rustore.sdk.reactive.single.AbstractC47905a
    public final void a(@Y61.k B<R> b12) {
        this.f436981b.a(new b(b12, this));
    }
}
