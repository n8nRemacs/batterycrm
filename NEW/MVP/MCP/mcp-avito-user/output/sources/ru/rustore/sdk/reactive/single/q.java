package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SingleEmitterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/single/q;", "T", "Lru/rustore/sdk/reactive/single/p;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class q<T> implements p<T>, ru.rustore.sdk.reactive.core.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B<T> f436976a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f436977b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Y41.a<G0>> f436978c = new AtomicReference<>(null);

    public q(@Y61.k B<T> b12) {
        this.f436976a = b12;
    }

    @Override // ru.rustore.sdk.reactive.single.p
    public final void a(@Y61.k Throwable th2) {
        if (this.f436977b.compareAndSet(false, true)) {
            Y41.a<G0> aVar = this.f436978c.get();
            if (aVar != null) {
                aVar.invoke();
            }
            this.f436976a.onError(th2);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.p
    public final void b(T t12) {
        if (this.f436977b.compareAndSet(false, true)) {
            Y41.a<G0> aVar = this.f436978c.get();
            if (aVar != null) {
                aVar.invoke();
            }
            this.f436976a.onSuccess(t12);
        }
    }

    @Override // ru.rustore.sdk.reactive.core.g
    public final void dispose() {
        Y41.a<G0> aVar;
        if (!this.f436977b.compareAndSet(false, true) || (aVar = this.f436978c.get()) == null) {
            return;
        }
        aVar.invoke();
    }
}
