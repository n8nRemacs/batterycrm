package ru.rustore.sdk.reactive.backpressure.processor;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.rustore.sdk.reactive.observable.K;
import tb1.C48644a;
import tb1.b;

/* compiled from: BufferDropOldestEmitProcessor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/backpressure/processor/b;", "T", "Lru/rustore/sdk/reactive/backpressure/processor/c;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b<T> extends c<T> {
    public b() {
        throw null;
    }

    public b(K k12, int i12, ru.rustore.sdk.reactive.core.a aVar, int i13, C42822w c42822w) {
        super(k12, i12, (i13 & 4) != 0 ? null : aVar);
    }

    @Override // ru.rustore.sdk.reactive.backpressure.processor.c
    public final void e(@k C48644a<T> c48644a, @k b.c<T> cVar) {
        c48644a.b();
        c48644a.a(cVar);
    }
}
