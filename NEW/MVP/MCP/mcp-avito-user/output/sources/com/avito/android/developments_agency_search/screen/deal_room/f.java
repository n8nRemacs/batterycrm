package com.avito.android.developments_agency_search.screen.deal_room;

import Cw.C13364c;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.screen.deal_room.adapter.document.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DealRoomConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/f;", "Lcom/avito/android/developments_agency_search/screen/deal_room/e;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.e
    @Y61.k
    public final ArrayList a(@Y61.k String str, @Y61.k List list, @Y61.k GetDealRoomInfoResponse.Deal.Revenue.Status status, @Y61.k Set set) {
        a.InterfaceC4144a bVar;
        a.b cVar;
        List<GetDealRoomInfoResponse.Deal.Revenue.Document> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (GetDealRoomInfoResponse.Deal.Revenue.Document document : list2) {
            if (document.getDownloadUrl() == null) {
                Set set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    bVar = a.InterfaceC4144a.c.f137353a;
                } else {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (L.f(((C13364c.b) it.next()).f2786b, document.getType())) {
                            bVar = a.InterfaceC4144a.C4145a.f137351a;
                            break;
                        }
                    }
                    bVar = a.InterfaceC4144a.c.f137353a;
                }
            } else {
                bVar = new a.InterfaceC4144a.b(document.getDownloadUrl());
            }
            a.InterfaceC4144a interfaceC4144a = bVar;
            if (document.getDownloadUrl() == null) {
                Set set3 = set;
                if ((set3 instanceof Collection) && set3.isEmpty()) {
                    cVar = a.b.d.f137357a;
                } else {
                    Iterator it2 = set3.iterator();
                    while (it2.hasNext()) {
                        if (L.f(((C13364c.b) it2.next()).f2786b, document.getType())) {
                            cVar = a.b.C4147b.f137355a;
                            break;
                        }
                    }
                    cVar = a.b.d.f137357a;
                }
            } else {
                cVar = status == GetDealRoomInfoResponse.Deal.Revenue.Status.CREATED ? new a.b.c(str) : new a.b.C4146a(document.getDownloadUrl());
            }
            a.b bVar2 = cVar;
            arrayList.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.document.a("deal-stage-block-doc-" + document.getType(), document.getFileId(), (document.getDownloadUrl() == null || document.getShortTypeName() == null) ? document.getTypeName() : document.getShortTypeName(), document.getTypeDescription(), document.getType(), interfaceC4144a, bVar2, 0.0f, 128, null));
        }
        return arrayList;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.e
    @Y61.k
    public final ArrayList b(@Y61.k List list) {
        String color;
        String color2;
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo.BindingColoredText text;
        String color3;
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo.BindingColoredText text2;
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo.BindingColoredText subtitle;
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo.BindingColoredText subtitle2;
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo.BindingColoredText title;
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo.BindingColoredText title2;
        List<GetDealRoomInfoResponse.Deal.SelectionHistory.Item> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (GetDealRoomInfoResponse.Deal.SelectionHistory.Item item : list2) {
            String str = "selection-development-item-" + item.getDevelopmentId();
            String strValueOf = String.valueOf(item.getDevelopmentId());
            List<Image> images = item.getImages();
            Image image = images != null ? (Image) C42745f0.G(images) : null;
            GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo bindingInfo = item.getBindingInfo();
            String text3 = (bindingInfo == null || (title2 = bindingInfo.getTitle()) == null) ? null : title2.getText();
            String str2 = text3 == null ? "" : text3;
            GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo bindingInfo2 = item.getBindingInfo();
            String str3 = AvitoMapMarkerKt.AMENITY_TYPE_BLACK;
            if (bindingInfo2 == null || (title = bindingInfo2.getTitle()) == null || (color = title.getColor()) == null) {
                color = AvitoMapMarkerKt.AMENITY_TYPE_BLACK;
            }
            UniversalColor universalColorUniversalColorOf$default = UniversalColorKt.universalColorOf$default(color, 0, 2, null);
            GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo bindingInfo3 = item.getBindingInfo();
            String text4 = (bindingInfo3 == null || (subtitle2 = bindingInfo3.getSubtitle()) == null) ? null : subtitle2.getText();
            String str4 = text4 == null ? "" : text4;
            GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo bindingInfo4 = item.getBindingInfo();
            if (bindingInfo4 == null || (subtitle = bindingInfo4.getSubtitle()) == null || (color2 = subtitle.getColor()) == null) {
                color2 = AvitoMapMarkerKt.AMENITY_TYPE_BLACK;
            }
            UniversalColor universalColorUniversalColorOf$default2 = UniversalColorKt.universalColorOf$default(color2, 0, 2, null);
            GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo bindingInfo5 = item.getBindingInfo();
            String text5 = (bindingInfo5 == null || (text2 = bindingInfo5.getText()) == null) ? null : text2.getText();
            String str5 = text5 == null ? "" : text5;
            GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo bindingInfo6 = item.getBindingInfo();
            if (bindingInfo6 != null && (text = bindingInfo6.getText()) != null && (color3 = text.getColor()) != null) {
                str3 = color3;
            }
            arrayList.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.development.c(str, strValueOf, image, str2, universalColorUniversalColorOf$default, str4, universalColorUniversalColorOf$default2, str5, UniversalColorKt.universalColorOf$default(str3, 0, 2, null)));
        }
        return arrayList;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.e
    @Y61.k
    public final ArrayList c(@Y61.k List list) {
        List<GetDealRoomInfoResponse.Deal.Progress.Step> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (GetDealRoomInfoResponse.Deal.Progress.Step step : list2) {
            arrayList.add(new com.avito.android.lib.compose.design.shared.stepsbar.b(step.getTitle(), step.getText()));
        }
        return arrayList;
    }
}
