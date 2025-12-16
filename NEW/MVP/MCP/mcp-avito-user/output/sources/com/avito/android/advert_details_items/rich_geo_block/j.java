package com.avito.android.advert_details_items.rich_geo_block;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.advert_details_items.rich_geo_block.c;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.rich_geo_block.RichGeoBlock;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsRichGeoBlockPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/rich_geo_block/j;", "Lcom/avito/android/advert_details_items/rich_geo_block/e;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InterfaceC28130g0 f85430b;

    @Inject
    public j() {
    }

    @Override // com.avito.android.advert_details_items.rich_geo_block.e
    public final void N6(@Y61.k InterfaceC28130g0 interfaceC28130g0) {
        this.f85430b = interfaceC28130g0;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ArrayList arrayList;
        l lVar = (l) eVar;
        RichGeoBlock richGeoBlock = ((AdvertDetailsRichGeoBlockItem) aVar).f85412e;
        String title = richGeoBlock.getTitle();
        String address = richGeoBlock.getAddress();
        List<GeoReference> geoReferenceList = richGeoBlock.getGeoReferenceList();
        if (geoReferenceList != null) {
            List<GeoReference> list = geoReferenceList;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (GeoReference geoReference : list) {
                List<String> colors = geoReference.getColors();
                String content = geoReference.getContent();
                AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
                String iconName = afterWithIcon != null ? afterWithIcon.getIconName() : null;
                AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
                arrayList.add(new c.a(colors, content, iconName, afterWithIcon2 != null ? afterWithIcon2.getText() : null));
            }
        } else {
            arrayList = null;
        }
        lVar.ht(new c(title, address, arrayList, richGeoBlock.getPinImage(), L.f(richGeoBlock.getStr(), Boolean.TRUE)), new f(this), new g(this), new h(this), new i(this));
    }
}
