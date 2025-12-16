package com.avito.android.profile.user_profile.cards.service_booking.items;

import Zt0.C19608c;
import Zt0.C19609d;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info.ServiceBookingsDetailedInfoItem;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/b;", "Lcom/avito/android/profile/user_profile/cards/service_booking/items/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f225412a;

    @Inject
    public b(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f225412a = interfaceC35863o4;
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.a
    @Y61.k
    public final ArrayList a(@Y61.l List list, @Y61.l C19608c c19608c) {
        ArrayList arrayList = new ArrayList();
        InterfaceC35863o4 interfaceC35863o4 = this.f225412a;
        if (list != null) {
            List<C19609d> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (C19609d c19609d : list2) {
                String strA = interfaceC35863o4.a();
                String title = c19609d.getTitle();
                String subtitle = c19609d.getSubtitle();
                arrayList2.add(new com.avito.android.profile.user_profile.cards.service_booking.items.order.ServiceBookingItem(c19609d.getImage(), c19609d.getUri(), strA, c19609d.getAdditionalText(), title, subtitle));
            }
            arrayList.addAll(arrayList2);
        }
        if (c19608c != null) {
            arrayList.add(new ServiceBookingsDetailedInfoItem(interfaceC35863o4.a(), c19608c.getTitle(), c19608c.getUri(), new ServiceBookingsDetailedInfoItem.Icon(Integer.valueOf(R.attr.ic_arrowRight16), Integer.valueOf(R.attr.black))));
        }
        return arrayList;
    }
}
