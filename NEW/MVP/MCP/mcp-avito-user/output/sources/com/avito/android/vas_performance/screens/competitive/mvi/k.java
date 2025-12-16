package com.avito.android.vas_performance.screens.competitive.mvi;

import JL0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import com.avito.android.vas_performance.screens.competitive.mvi.entity.CompetitiveVasV2InternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CompetitiveVasV2Reducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "LJL0/c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements u<CompetitiveVasV2InternalAction, JL0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f320465b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f320466c;

    @Inject
    public k(@Y61.k InterfaceC28373a interfaceC28373a, @com.avito.android.vas_performance.screens.competitive.di.h @Y61.k String str) {
        this.f320465b = str;
        this.f320466c = interfaceC28373a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JL0.c b(JL0.c cVar, List list, ArrayList arrayList) {
        c.a aVarC = c(list);
        ArrayList arrayList2 = new ArrayList(cVar.f8902i);
        arrayList2.add(aVarC.f8907a);
        wZ.g gVar = cVar.f8905l;
        return JL0.c.a(cVar, false, false, null, 0, null, arrayList == null ? cVar.f8900g : arrayList, list, arrayList2, aVarC, null, gVar != null ? gVar.b(aVarC.f8920n, true) : null, null, 2591);
    }

    public static c.a c(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((c.a) next).f8914h) {
                break;
            }
        }
        c.a aVar = (c.a) next;
        return aVar == null ? (c.a) C42745f0.E(list) : aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final JL0.c a(com.avito.android.vas_performance.screens.competitive.mvi.entity.CompetitiveVasV2InternalAction r32, JL0.c r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.competitive.mvi.k.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
