package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectBusinessVrfActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_passport_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {
    @Y61.k
    public static final ArrayList a(@Y61.k List list, @Y61.l Integer num) {
        List<K50.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (K50.a aVar : list2) {
            boolean z12 = true;
            AttributedText attributedText = new AttributedText(C42745f0.O(aVar.a(), null, null, null, null, 63), C42784z0.f406748b, 1);
            int userIdFrom = aVar.getUserIdFrom();
            int userIdFrom2 = aVar.getUserIdFrom();
            if (num == null || userIdFrom2 != num.intValue()) {
                z12 = false;
            }
            arrayList.add(new PassportSelectBusinessItem(attributedText, userIdFrom, z12, false, String.valueOf(aVar.getUserIdFrom())));
        }
        return arrayList;
    }
}
