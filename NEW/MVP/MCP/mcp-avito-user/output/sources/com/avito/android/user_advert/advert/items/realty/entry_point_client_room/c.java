package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import android.content.Context;
import com.avito.android.R;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EntryPointToAccountOwnerBottomSheetDialogFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/c;", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/a;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {
    @Inject
    public c() {
    }

    @Override // com.avito.android.user_advert.advert.items.realty.entry_point_client_room.a
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d a(@Y61.k Context context, @Y61.k ArrayList arrayList, @Y61.k Y41.l lVar, @Y61.k Y41.a aVar) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 3);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.C(R.layout.user_advert_entry_point_bottom_sheet_layout, new b(context, arrayList, aVar, dVar, lVar));
        return dVar;
    }
}
