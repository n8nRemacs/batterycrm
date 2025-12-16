package com.avito.android.advert_core.contactbar;

import com.avito.android.advert_core.contactbar.C28266e;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.SellerOnlineStatus;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertContactsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/contactbar/w;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface w {

    /* compiled from: AdvertContactsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> Cz(@Y61.k List<? extends ContactBar.ContainerClickType> list);

    @Y61.l
    io.reactivex.rxjava3.core.z<G0> H70(boolean z12);

    void LW(@Y61.l ContactBarData contactBarData, @Y61.k List list, @Y61.k List list2, @Y61.l LinkedHashMap linkedHashMap, @Y61.l ContactBar.b bVar, @Y61.k Y41.p pVar, @Y61.k Y41.l lVar, @Y61.k C28266e.h hVar);

    @Y61.k
    com.jakewharton.rxrelay3.c Q1();

    void W6(boolean z12, boolean z13, boolean z14);

    void op(@Y61.k String str, @Y61.k String str2, @Y61.k SellerOnlineStatus sellerOnlineStatus);

    int va();
}
