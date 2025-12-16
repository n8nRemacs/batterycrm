package com.avito.android.bxcontent;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bxcontent.model.AdvertListAdditionalTopics;
import com.avito.android.bxcontent.model.AdvertListData;
import com.avito.android.deep_linking.links.AdvertListLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpSpaceType;
import ev.AbstractC40162b;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;

/* compiled from: ItemListLinkHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/I1;", "Lev/b;", "Lcom/avito/android/deep_linking/links/AdvertListLink$ItemList;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I1 extends AbstractC40162b<AdvertListLink.ItemList> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BxContentIntentFactory f109347d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f109348e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f109349f;

    @Inject
    public I1(@Y61.k BxContentIntentFactory bxContentIntentFactory, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.location.r rVar) {
        this.f109347d = bxContentIntentFactory;
        this.f109348e = interfaceC4053a;
        this.f109349f = rVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        AdvertListAdditionalTopics advertListAdditionalTopics;
        List<String> list;
        List<String> list2;
        AdvertListLink.ItemList itemList = (AdvertListLink.ItemList) deepLink;
        String str2 = itemList.f132977f;
        AdvertListData advertListData = (str2 == null || (list2 = itemList.f132979h) == null || C43066x.K(str2) || list2.isEmpty()) ? null : new AdvertListData(str2, list2, itemList.f132978g);
        String str3 = itemList.f132980i;
        AdvertListData advertListData2 = (str3 == null || (list = itemList.f132982k) == null || C43066x.K(str3) || list.isEmpty()) ? null : new AdvertListData(str3, list, itemList.f132981j);
        if (advertListData == null) {
            advertListData = advertListData2;
        }
        if (advertListData != null) {
            if (advertListData.equals(advertListData2)) {
                advertListData2 = null;
            }
            advertListAdditionalTopics = new AdvertListAdditionalTopics(advertListData, advertListData2);
        } else {
            advertListAdditionalTopics = null;
        }
        SerpDisplayType serpDisplayType = itemList.f132985n ? SerpDisplayType.Rich : null;
        String id2 = itemList.f132988q;
        if (id2 == null) {
            Location locationF = this.f109349f.f();
            id2 = locationF != null ? locationF.getId() : null;
            if (!itemList.f132990s) {
                id2 = null;
            }
        }
        this.f109348e.R(this.f109347d.b(new SearchParams(itemList.f132986o, null, id2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, serpDisplayType, null, null, null, null, null, null, -67108870, 1, null), (8355838 & 2) != 0 ? null : itemList.f132991t, (8355838 & 8) != 0 ? null : itemList.f132989r, (8355838 & 16) != 0 ? PresentationType.INSTANCE.defaultValue() : PresentationType.PUSH, (8355838 & 64) != 0 ? null : null, (8355838 & 128) != 0 ? SerpSpaceType.Default : null, (8355838 & 256) != 0 ? false : false, (8355838 & 512) != 0 ? null : null, (8355838 & 1024) != 0 ? null : itemList.f132976e, (8355838 & 2048) != 0 ? null : bundle != null ? com.avito.android.util.H.a(bundle) : null, (8355838 & 4096) != 0 ? null : itemList.f132974c, (8355838 & 8192) != 0 ? null : itemList.f132975d, (8355838 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : advertListAdditionalTopics, kotlin.jvm.internal.L.f(itemList.f132984m, Boolean.TRUE), (65536 & 8355838) != 0 ? null : itemList.f132983l, (131072 & 8355838) != 0 ? null : itemList.f132987p, (262144 & 8355838) != 0 ? null : null, (524288 & 8355838) != 0 ? null : null, (1048576 & 8355838) != 0 ? null : null, (2097152 & 8355838) != 0 ? null : null, (8355838 & 4194304) != 0 ? NavigationScreenAction.f107100b : null), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
