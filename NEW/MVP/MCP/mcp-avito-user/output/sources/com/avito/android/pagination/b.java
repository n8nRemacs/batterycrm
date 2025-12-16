package com.avito.android.pagination;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import r50.AbstractC47493a;
import r50.AbstractC47494b;
import r50.c;

/* compiled from: LceUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_pagination_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {
    @Y61.k
    public static final r50.d a(@Y61.k r50.c<r50.d> cVar) {
        r50.d dVar;
        c.b bVar = cVar instanceof c.b ? (c.b) cVar : null;
        if (bVar != null && (dVar = bVar.f429599a) != null) {
            return dVar;
        }
        C42784z0 c42784z0 = C42784z0.f406748b;
        AbstractC47494b.c cVar2 = AbstractC47494b.c.f429598a;
        return new r50.d(c42784z0, false, cVar2, cVar2, -1L);
    }

    @Y61.k
    public static final r50.d b(@Y61.k r50.d dVar, @Y61.k AbstractC47493a abstractC47493a) {
        ArrayList arrayList;
        boolean z12 = abstractC47493a instanceof AbstractC47493a.b;
        List<com.avito.conveyor_item.a> list = dVar.f429602a;
        if (z12) {
            arrayList = new ArrayList(list);
            if (C42745f0.E(arrayList) instanceof a) {
                arrayList.remove(0);
            }
        } else {
            if (!(abstractC47493a instanceof AbstractC47493a.C12353a)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList(list);
            if (C42745f0.Q(arrayList) instanceof a) {
                C22026a.e(1, arrayList);
            }
        }
        return r50.d.a(dVar, arrayList, false, z12 ? AbstractC47494b.c.f429598a : dVar.f429604c, abstractC47493a instanceof AbstractC47493a.C12353a ? AbstractC47494b.c.f429598a : dVar.f429605d, 0L, 18);
    }

    @Y61.k
    public static final r50.d c(@Y61.k r50.d dVar, @Y61.k AbstractC47493a abstractC47493a) {
        ArrayList arrayList;
        boolean z12 = abstractC47493a instanceof AbstractC47493a.b;
        List<com.avito.conveyor_item.a> list = dVar.f429602a;
        if (z12) {
            arrayList = new ArrayList(list);
            if (C42745f0.E(arrayList) instanceof c) {
                arrayList.remove(0);
            }
        } else {
            if (!(abstractC47493a instanceof AbstractC47493a.C12353a)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList(list);
            if (C42745f0.Q(arrayList) instanceof c) {
                C22026a.e(1, arrayList);
            }
        }
        return r50.d.a(dVar, arrayList, false, z12 ? AbstractC47494b.c.f429598a : dVar.f429604c, abstractC47493a instanceof AbstractC47493a.C12353a ? AbstractC47494b.c.f429598a : dVar.f429605d, 0L, 18);
    }
}
