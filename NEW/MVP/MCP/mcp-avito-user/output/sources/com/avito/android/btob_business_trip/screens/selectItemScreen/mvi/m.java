package com.avito.android.btob_business_trip.screens.selectItemScreen.mvi;

import Bk.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.btob_business_trip.models.SelectActionInfo;
import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: B2bBusinessTripSelectViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/m;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/l;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements l {
    @Inject
    public m() {
    }

    @Override // com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.l
    @Y61.k
    public final Bk.c a(@Y61.k Bk.c cVar) {
        c.b c0071b;
        SelectItemsInfo selectItemsInfo = cVar.f1654c;
        if (selectItemsInfo != null) {
            SelectActionInfo selectActionInfo = selectItemsInfo.f107868b;
            c0071b = new c.b.C0071b(selectItemsInfo.f107869c, selectItemsInfo.f107871e, selectActionInfo.f107863c, selectItemsInfo.f107870d, selectActionInfo.f107862b, cVar.f1655d, cVar.f1657f);
        } else {
            c0071b = cVar.f1653b;
        }
        return Bk.c.a(cVar, c0071b, null, null, false, null, 62);
    }
}
