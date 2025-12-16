package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* compiled from: SingleFrom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/u;", "T", "Lru/rustore/sdk/reactive/single/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class u<T> extends AbstractC47905a<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f436990b;

    /* JADX WARN: Multi-variable type inference failed */
    public u(@Y61.k Y41.a<? extends T> aVar) {
        this.f436990b = (N) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // ru.rustore.sdk.reactive.single.AbstractC47905a
    public final void a(@Y61.k B<T> b12) {
        Object bVar;
        ru.rustore.sdk.reactive.core.k kVar = new ru.rustore.sdk.reactive.core.k();
        b12.a(kVar);
        if (kVar.f436877a) {
            return;
        }
        try {
            int i12 = Z.f406624c;
            bVar = this.f436990b.invoke();
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (!(bVar instanceof Z.b) && !kVar.f436877a) {
            b12.onSuccess(bVar);
        }
        Throwable thB = Z.b(bVar);
        if (thB == null || kVar.f436877a) {
            return;
        }
        b12.onError(thB);
    }
}
