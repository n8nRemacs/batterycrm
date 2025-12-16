package com.avito.android.advert.item.blocks.items_factories;

import android.os.Parcelable;
import com.avito.android.advert.advert_details_style.b;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.AdvertDetails;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsSimpleContactBarItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/W4;", "Lcom/avito/android/advert/item/blocks/items_factories/V4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class W4 implements V4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73874a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f73875b;

    @Inject
    public W4(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k InterfaceC28265d interfaceC28265d) {
        this.f73874a = jVar;
        this.f73875b = interfaceC28265d;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.V4
    @Y61.l
    public final AdvertDetailsContactBarItem a(@Y61.k AdvertDetails advertDetails, @Y61.k AdvertDetailsStyle advertDetailsStyle) {
        b.C2146b c2146b = com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle).f68638g;
        ShowSellersProfileSource showSellersProfileSource = c2146b.f68647c;
        InterfaceC28265d interfaceC28265d = this.f73875b;
        if (showSellersProfileSource != null) {
            interfaceC28265d.Na(showSellersProfileSource);
        }
        interfaceC28265d.Sa(c2146b.f68648d);
        List<ContactBar.Button> listTb = interfaceC28265d.tb();
        ArrayList arrayList = new ArrayList(C42745f0.q(listTb, 10));
        for (Parcelable parcelableD : listTb) {
            if (parcelableD instanceof ContactBar.Button.Action) {
                parcelableD = ContactBar.Button.Action.d((ContactBar.Button.Action) parcelableD, false, 1048063);
            }
            arrayList.add(parcelableD);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new AdvertDetailsContactBarItem(0L, null, null, null, arrayList, V9.a.c(advertDetails, c2146b.f68646b, true, false, false, false, false, 240), null, advertDetails.isRedesign(), advertDetails.isRestyle(), null, this.f73874a.a(), null, null, 6735, null);
    }
}
