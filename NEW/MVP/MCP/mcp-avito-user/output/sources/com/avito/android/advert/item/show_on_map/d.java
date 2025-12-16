package com.avito.android.advert.item.show_on_map;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsShowOnMapPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/show_on_map/d;", "Lcom/avito/android/advert/item/show_on_map/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f80194b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC28130g0 f80195c;

    @Inject
    public d(@k f fVar) {
        this.f80194b = fVar;
    }

    @Override // com.avito.android.advert.item.show_on_map.c
    public final void B3(@k InterfaceC28130g0 interfaceC28130g0) {
        this.f80195c = interfaceC28130g0;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem = (AdvertDetailsShowOnMapItem) aVar;
        String strB = advertDetailsShowOnMapItem.f80186g;
        if (strB == null || C43066x.K(strB)) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            boolean zF2 = L.f(advertDetailsShowOnMapItem.f80181b, String.valueOf(12));
            f fVar = this.f80194b;
            strB = zF2 ? fVar.b() : fVar.a();
        }
        InterfaceC28130g0 interfaceC28130g0 = this.f80195c;
        if (interfaceC28130g0 == null) {
            interfaceC28130g0 = null;
        }
        iVar.ZI(advertDetailsShowOnMapItem, interfaceC28130g0, strB);
        iVar.gS(strB);
    }
}
