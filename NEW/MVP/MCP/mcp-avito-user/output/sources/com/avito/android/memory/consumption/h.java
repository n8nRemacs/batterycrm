package com.avito.android.memory.consumption;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MemoryMetricsCollector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/memory/consumption/h;", "Lcom/avito/android/memory/consumption/i;", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f186134a;

    public h() {
        this(null, 1, null);
    }

    @Override // com.avito.android.memory.consumption.i
    @Y61.k
    public final g b() {
        this.f186134a.getClass();
        return l.a();
    }

    public h(l lVar, int i12, C42822w c42822w) {
        this.f186134a = (i12 & 1) != 0 ? new l() : lVar;
    }

    @Override // com.avito.android.memory.consumption.i
    public final void a() {
    }
}
