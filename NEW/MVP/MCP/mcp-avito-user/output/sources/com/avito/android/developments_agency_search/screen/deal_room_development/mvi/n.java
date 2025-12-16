package com.avito.android.developments_agency_search.screen.deal_room_development.mvi;

import Dw.InterfaceC13446b;
import Dw.e;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.domain.Metro;
import com.avito.android.remote.model.Image;
import com.avito.android.util.P2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: DealRoomDevelopmentReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LDw/b;", "LDw/d;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements u<InterfaceC13446b, Dw.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_room_development.a f137952b;

    /* compiled from: DealRoomDevelopmentReducer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/mvi/n$a;", "", "<init>", "()V", "", "GALLERY_ITEM_HORIZONTAL_PADDING_DP", "I", "", "GALLERY_ITEM_STRING_ID", "Ljava/lang/String;", "NO_PRESENTATION_BLOCK_ITEM_ID", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public n(@Y61.k com.avito.android.developments_agency_search.screen.deal_room_development.a aVar) {
        this.f137952b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Dw.d a(InterfaceC13446b interfaceC13446b, Dw.d dVar) {
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo.BindingColoredText subtitle;
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo.BindingColoredText title;
        InterfaceC13446b interfaceC13446b2 = interfaceC13446b;
        Dw.d dVar2 = dVar;
        if (!(interfaceC13446b2 instanceof InterfaceC13446b.C0203b)) {
            return dVar2;
        }
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item item = ((InterfaceC13446b.C0203b) interfaceC13446b2).f3529a;
        P2.b bVar = new P2.b(item);
        ArrayList arrayList = new ArrayList();
        List<Image> images = item.getImages();
        if (images == null) {
            images = C42784z0.f406748b;
        }
        com.avito.android.developments_agency_search.adapter.gallery.a aVar = new com.avito.android.developments_agency_search.adapter.gallery.a("gallery-item", images, 16, 0.0f, 8, null);
        com.avito.android.developments_agency_search.adapter.spacer.a aVar2 = new com.avito.android.developments_agency_search.adapter.spacer.a(22);
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo bindingInfo = item.getBindingInfo();
        String text = null;
        String text2 = (bindingInfo == null || (title = bindingInfo.getTitle()) == null) ? null : title.getText();
        String str = text2 == null ? "" : text2;
        String developerName = item.getDeveloperName();
        String str2 = developerName == null ? "" : developerName;
        String developmentAddress = item.getDevelopmentAddress();
        List<Metro> metro = item.getMetro();
        Metro metro2 = metro != null ? (Metro) C42745f0.G(metro) : null;
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo bindingInfo2 = item.getBindingInfo();
        if (bindingInfo2 != null && (subtitle = bindingInfo2.getSubtitle()) != null) {
            text = subtitle.getText();
        }
        arrayList.addAll(C42745f0.U(aVar, aVar2, new com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content.c(str, str2, developmentAddress, metro2, text == null ? "" : text), new com.avito.android.developments_agency_search.adapter.spacer.a(16)));
        List<GetDealRoomInfoResponse.Deal.SelectionHistory.Item.Lot> lots = item.getLots();
        if (lots == null || lots.isEmpty()) {
            arrayList.add(new com.avito.android.developments_agency_search.adapter.error_layout.a("no-presentation-item", com.avito.android.printable_text.b.c(R.string.das_deal_room_development_no_presentation_block_title, new Serializable[0]), R.attr.textH25, com.avito.android.printable_text.b.c(R.string.das_deal_room_development_no_presentation_block_description, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.das_deal_room_development_no_presentation_block_find_flat_button, new Serializable[0]), false, 32, null));
        } else {
            arrayList.addAll(this.f137952b.a(item.getLots()));
        }
        GetDealRoomInfoResponse.Deal.SelectionHistory.Item.BindingInfo bindingInfo3 = item.getBindingInfo();
        return new Dw.d(bVar, new e.a(arrayList, (bindingInfo3 == null || bindingInfo3.isBound()) ? false : true));
    }
}
