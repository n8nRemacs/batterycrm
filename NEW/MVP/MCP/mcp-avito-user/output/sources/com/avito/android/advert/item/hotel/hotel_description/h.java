package com.avito.android.advert.item.hotel.hotel_description;

import Y61.l;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.util.D6;
import com.avito.android.util.ExpandablePanelLayout;
import kotlin.Metadata;

/* compiled from: AdvertHotelDescriptionView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_description/h;", "Lcom/avito/android/util/ExpandablePanelLayout$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements ExpandablePanelLayout.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f75857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f75858b;

    public h(c cVar, i iVar) {
        this.f75857a = cVar;
        this.f75858b = iVar;
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.a
    public final void d(@l View view) {
        D6.w(view);
        c cVar = this.f75857a;
        Parcelable parcelableD0 = cVar.f75853b.d0();
        AdvertHotelDescriptionItem advertHotelDescriptionItem = cVar.f75852a;
        advertHotelDescriptionItem.f75847i = parcelableD0;
        d dVar = cVar.f75854c;
        String str = advertHotelDescriptionItem.f75845g;
        if (str == null) {
            str = "";
        }
        dVar.f75855b.t(str);
        i iVar = this.f75858b;
        ExpandablePanelLayout expandablePanelLayout = iVar.f75860c;
        int paddingBottom = expandablePanelLayout.getPaddingBottom();
        ExpandablePanelLayout expandablePanelLayout2 = iVar.f75860c;
        D6.f(expandablePanelLayout, 0, 0, 0, D6.j(expandablePanelLayout2, 3) + paddingBottom, 7);
        expandablePanelLayout2.invalidate();
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.a
    public final void a() {
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.a
    public final void c() {
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.a
    public final void b(@l View view) {
    }
}
