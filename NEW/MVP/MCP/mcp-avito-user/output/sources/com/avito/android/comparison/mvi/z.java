package com.avito.android.comparison.mvi;

import Rq.b;
import Rq.d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComparisonReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comparison/mvi/z;", "Lcom/avito/android/arch/mvi/u;", "LRq/b;", "LRq/d;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class z implements com.avito.android.arch.mvi.u<Rq.b, Rq.d> {
    @Inject
    public z() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Rq.d a(Rq.b bVar, Rq.d dVar) {
        Rq.b bVar2 = bVar;
        Rq.d dVar2 = dVar;
        return bVar2 instanceof b.c ? new Rq.d(false, null, ((b.c) bVar2).f14677a) : bVar2 instanceof b.k ? Rq.d.a(dVar2, null, 6) : bVar2 instanceof b.f ? Rq.d.a(dVar2, new d.b(((b.f) bVar2).f14679a), 4) : dVar2;
    }
}
