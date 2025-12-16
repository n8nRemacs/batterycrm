package com.avito.android.virtual_deal_room.client_room.mvi.builder;

import EN0.d;
import Y61.k;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Settings;

/* compiled from: ClientRoomViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/builder/b;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/builder/a;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.virtual_deal_room.client_room.mvi.builder.a
    @k
    public final EN0.c a(@k EN0.c cVar) {
        d bVar;
        d bVar2;
        DN0.a aVar;
        String str = cVar.f3971g;
        boolean z12 = cVar.f3979o;
        DN0.b bVar3 = cVar.f3968d;
        List<DN0.b> list = cVar.f3966b;
        if (!z12 || (str != null && list != null && bVar3 != null)) {
            List<DN0.b> list2 = list;
            if (list2 != null && !list2.isEmpty() && str != null && bVar3 != null && (aVar = cVar.f3970f) != null) {
                List<DN0.b> list3 = cVar.f3966b;
                List<DN0.b> list4 = list3;
                ArrayList arrayList = new ArrayList(C42745f0.q(list4, 10));
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(((DN0.b) it.next()).f3169c), null, false, 6, null));
                }
                bVar2 = new d.a(list3, cVar.f3968d, cVar.f3978n, cVar.f3979o, str, cVar.f3972h, aVar, arrayList, list.indexOf(bVar3));
            } else if (z12) {
                bVar = d.c.f3993a;
            } else {
                ApiError apiError = cVar.f3980p;
                if (apiError != null) {
                    bVar2 = new d.b(apiError);
                } else {
                    V2.f318762a.d("VDRCategoryScreen", "unknown view state config for " + cVar);
                    bVar = new d.b(new ApiError.UnknownError("", null, null, 6, null));
                }
            }
            return EN0.c.a(cVar, null, null, null, null, null, null, null, null, null, null, false, false, null, bVar2, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        bVar = d.c.f3993a;
        bVar2 = bVar;
        return EN0.c.a(cVar, null, null, null, null, null, null, null, null, null, null, false, false, null, bVar2, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }
}
