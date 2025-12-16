package com.avito.android.memory.consumption;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MemoryMetricsCollector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/memory/consumption/j;", "Lcom/avito/android/memory/consumption/i;", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f186135a;

    /* renamed from: b, reason: collision with root package name */
    public g f186136b;

    public j() {
        this(null, 1, null);
    }

    @Override // com.avito.android.memory.consumption.i
    public final void a() {
        this.f186135a.getClass();
        this.f186136b = l.a();
    }

    @Override // com.avito.android.memory.consumption.i
    @Y61.k
    public final g b() throws NumberFormatException {
        this.f186135a.getClass();
        g gVarA = l.a();
        g gVar = this.f186136b;
        if (gVar == null) {
            gVar = null;
        }
        return new g(gVarA.f186124a - gVar.f186124a, gVarA.f186125b - gVar.f186125b, gVarA.f186126c - gVar.f186126c, gVarA.f186127d - gVar.f186127d, gVarA.f186128e - gVar.f186128e, gVarA.f186129f - gVar.f186129f, gVarA.f186130g - gVar.f186130g, gVarA.f186131h - gVar.f186131h, gVarA.f186132i - gVar.f186132i, gVarA.f186133j - gVar.f186133j);
    }

    public j(l lVar, int i12, C42822w c42822w) {
        this.f186135a = (i12 & 1) != 0 ? new l() : lVar;
    }
}
