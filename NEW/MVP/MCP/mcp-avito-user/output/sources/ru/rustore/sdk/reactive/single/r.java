package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: SingleFlatMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/reactive/single/r;", "Lru/rustore/sdk/reactive/single/B;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class r implements B<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s<Object, Object>.a f436979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B<Object> f436980b;

    public r(s<Object, Object>.a aVar, B<Object> b12) {
        this.f436979a = aVar;
        this.f436980b = b12;
    }

    @Override // ru.rustore.sdk.reactive.single.B
    public final void a(ru.rustore.sdk.reactive.core.g gVar) {
        ru.rustore.sdk.reactive.core.g andSet;
        s<Object, Object>.a aVar = this.f436979a;
        AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = aVar.f436984b;
        while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
        }
        if (!aVar.f436983a.get() || (andSet = aVar.f436984b.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // ru.rustore.sdk.reactive.single.B
    public final void onError(Throwable th2) {
        if (this.f436979a.f436983a.compareAndSet(false, true)) {
            this.f436980b.onError(th2);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.B
    public final void onSuccess(Object obj) {
        if (this.f436979a.f436983a.compareAndSet(false, true)) {
            this.f436980b.onSuccess(obj);
        }
    }
}
