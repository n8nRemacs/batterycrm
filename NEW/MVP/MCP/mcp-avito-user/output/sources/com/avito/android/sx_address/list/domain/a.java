package com.avito.android.sx_address.list.domain;

import RA0.h;
import RA0.i;
import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sx_address.list.domain.AddressItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ScreenData.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_sx-address_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    @k
    public static final ScreenData a(@k RA0.e eVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        AddressItem.Status status;
        String title = eVar.getTitle();
        List<RA0.a> listB = eVar.b();
        int i12 = 10;
        if (listB != null) {
            List<RA0.a> list = listB;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RA0.a aVar = (RA0.a) it.next();
                if (C43066x.u(aVar.getStatus(), "BASE")) {
                    status = AddressItem.Status.f293139b;
                } else if (C43066x.u(aVar.getStatus(), "REJECTED")) {
                    status = AddressItem.Status.f293142e;
                } else if (C43066x.u(aVar.getStatus(), "COMPLETED")) {
                    status = AddressItem.Status.f293140c;
                } else if (C43066x.u(aVar.getStatus(), "INPROGRESS")) {
                    status = AddressItem.Status.f293141d;
                } else {
                    if (!C43066x.u(aVar.getStatus(), "VALIDATED")) {
                        throw new IllegalStateException();
                    }
                    status = AddressItem.Status.f293143f;
                }
                String id2 = aVar.getId();
                String description = aVar.getDescription();
                boolean isDisabled = aVar.getIsDisabled();
                boolean isRevalidateAvailable = aVar.getIsRevalidateAvailable();
                String title2 = aVar.getTitle();
                AddressItem.LocalizedStatus localizedStatus = new AddressItem.LocalizedStatus(status, aVar.getStatusText(), aVar.getStatusAction());
                RA0.b bottomSheet = aVar.getBottomSheet();
                String title3 = bottomSheet.getTitle();
                AttributedText description2 = bottomSheet.getDescription();
                List<RA0.c> listA = bottomSheet.a();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(listA, i12));
                for (RA0.c cVar : listA) {
                    arrayList4.add(new AddressItem.AddressListItemBottomSheetButtonsItem(cVar.getTitle(), cVar.getType(), cVar.getUrl(), cVar.getHandleOutside()));
                    it = it;
                }
                arrayList3.add(new AddressItem(id2, new AddressItem.AddressListItemBottomSheet(description2, title3, arrayList4), description, isDisabled, isRevalidateAvailable, localizedStatus, aVar.getSubtitle(), title2));
                it = it;
                i12 = 10;
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        AttributedText description3 = eVar.getDescription();
        RA0.f infoBanner = eVar.getInfoBanner();
        InfoBannerData infoBannerDataB = infoBanner != null ? b(infoBanner) : null;
        RA0.f innMigratedAddressesPopup = eVar.getInnMigratedAddressesPopup();
        InfoBannerData infoBannerDataB2 = innMigratedAddressesPopup != null ? b(innMigratedAddressesPopup) : null;
        boolean isAddAvailable = eVar.getIsAddAvailable();
        Boolean isUploadFileAvailable = eVar.getIsUploadFileAvailable();
        Boolean isEditButtonAvailable = eVar.getIsEditButtonAvailable();
        Boolean shouldShowFilters = eVar.getShouldShowFilters();
        List<h> listG = eVar.g();
        if (listG != null) {
            List<h> list2 = listG;
            arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (h hVar : list2) {
                AttributedText description4 = hVar.getDescription();
                String title4 = hVar.getTitle();
                i image = hVar.getImage();
                arrayList2.add(new PromotionData(description4, new PromotionImageData(image.getDarkImage(), image.getLightImage()), title4, UUID.randomUUID().toString()));
            }
        } else {
            arrayList2 = null;
        }
        return new ScreenData(arrayList, description3, infoBannerDataB, infoBannerDataB2, isAddAvailable, isUploadFileAvailable, isEditButtonAvailable, arrayList2, shouldShowFilters, title, "", eVar.b() != null && eVar.b().size() >= 10, Filter.f293146c, true, eVar.getAddUnavailableMessage());
    }

    public static final InfoBannerData b(RA0.f fVar) {
        RA0.g button = fVar.getButton();
        return new InfoBannerData(button != null ? new InfoBannerButtonData(button.getTitle(), button.getUrl()) : null, fVar.getDescription(), fVar.getIsClosable(), fVar.getTitle(), fVar.getType());
    }
}
