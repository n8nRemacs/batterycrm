package com.avito.android.pagination.mvi;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import r50.AbstractC47493a;
import r50.c;
import r50.f;

/* compiled from: PaginationReducer.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/pagination/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lr50/f;", "Lr50/c;", "Lr50/d;", "_common_pagination_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements com.avito.android.arch.mvi.u<r50.f, r50.c<r50.d>> {
    @Override // com.avito.android.arch.mvi.u
    public final r50.c<r50.d> a(r50.f fVar, r50.c<r50.d> cVar) {
        r50.f fVar2 = fVar;
        r50.c<r50.d> cVar2 = cVar;
        if (!(fVar2 instanceof f.c)) {
            boolean z12 = fVar2 instanceof f.d;
            throw null;
        }
        if (cVar2 instanceof c.d) {
            return cVar2;
        }
        if (cVar2 instanceof c.C12355c) {
            return ((f.c) fVar2).f429610a ? new c.C12355c(((c.C12355c) cVar2).f429600a, true) : new c.d();
        }
        if (!(cVar2 instanceof c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        List<com.avito.conveyor_item.a> list = ((c.b) cVar2).f429599a.f429602a;
        if (list == null || list.isEmpty()) {
            return new c.d();
        }
        r50.d dVarA = com.avito.android.pagination.b.a(cVar2);
        AbstractC47493a.b bVar = AbstractC47493a.b.f429597a;
        r50.d dVarC = com.avito.android.pagination.b.c(dVarA, bVar);
        AbstractC47493a.C12353a c12353a = AbstractC47493a.C12353a.f429596a;
        return new c.b(r50.d.a(r50.d.a(com.avito.android.pagination.b.b(com.avito.android.pagination.b.b(com.avito.android.pagination.b.c(dVarC, c12353a), bVar), c12353a), null, false, null, null, -1L, 15), null, ((f.c) fVar2).f429610a, null, null, 0L, 29));
    }
}
