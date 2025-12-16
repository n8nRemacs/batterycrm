package com.avito.android.btob_business_trip.screens.selectItemScreen.mvi;

import Bk.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.btob_business_trip.models.SelectItemInfo;
import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: B2bBusinessTripSelectReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "LBk/c;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements u<B2bBusinessTripSelectInternalAction, Bk.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f108227b;

    @Inject
    public j(@Y61.k l lVar) {
        this.f108227b = lVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Bk.c a(B2bBusinessTripSelectInternalAction b2bBusinessTripSelectInternalAction, Bk.c cVar) {
        B2bBusinessTripSelectInternalAction b2bBusinessTripSelectInternalAction2 = b2bBusinessTripSelectInternalAction;
        Bk.c cVar2 = cVar;
        boolean z12 = b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.Init;
        l lVar = this.f108227b;
        if (!z12) {
            return b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.OnCheckedChanged ? lVar.a(Bk.c.a(cVar2, null, null, ((B2bBusinessTripSelectInternalAction.OnCheckedChanged) b2bBusinessTripSelectInternalAction2).f108220b, false, null, 59)) : b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.Loading ? lVar.a(Bk.c.a(cVar2, null, null, null, true, null, 47)) : b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.Error ? lVar.a(Bk.c.a(cVar2, null, null, null, false, null, 47)) : b2bBusinessTripSelectInternalAction2 instanceof B2bBusinessTripSelectInternalAction.LoadInfoForSuccessScreen ? Bk.c.a(cVar2, null, null, null, false, ((B2bBusinessTripSelectInternalAction.LoadInfoForSuccessScreen) b2bBusinessTripSelectInternalAction2).f108216b, 31) : cVar2;
        }
        c.b.a aVar = c.b.a.f1659a;
        SelectItemsInfo selectItemsInfo = ((B2bBusinessTripSelectInternalAction.Init) b2bBusinessTripSelectInternalAction2).f108215b;
        ArrayList arrayList = selectItemsInfo.f107870d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((SelectItemInfo) it.next()).f107865c));
        }
        return lVar.a(Bk.c.a(cVar2, aVar, selectItemsInfo, arrayList2, false, null, 32));
    }
}
