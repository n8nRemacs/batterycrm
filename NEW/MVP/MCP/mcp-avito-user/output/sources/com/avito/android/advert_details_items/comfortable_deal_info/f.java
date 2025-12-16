package com.avito.android.advert_details_items.comfortable_deal_info;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.comfortable_deal_info.dto.Action;
import com.avito.android.comfortable_deal_info.dto.Screen;
import com.avito.android.remote.model.ComfortableDealInfo;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealInfoPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/comfortable_deal_info/f;", "LTV0/d;", "Lcom/avito/android/advert_details_items/comfortable_deal_info/i;", "Lcom/avito/android/advert_details_items/comfortable_deal_info/ComfortableDealInfoItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements TV0.d<i, ComfortableDealInfoItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f84586b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f84587c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84588d;

    @Inject
    public f(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f84586b = aVar;
        this.f84587c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        ComfortableDealInfoItem comfortableDealInfoItem = (ComfortableDealInfoItem) aVar;
        ComfortableDealInfo comfortableDealInfo = comfortableDealInfoItem.f84575f;
        iVar.b(comfortableDealInfo.getTitle());
        iVar.j(comfortableDealInfo.getSubtitle());
        List<ComfortableDealInfo.Screen> screens = comfortableDealInfo.getScreens();
        ArrayList arrayList = new ArrayList(C42745f0.q(screens, 10));
        for (ComfortableDealInfo.Screen screen : screens) {
            arrayList.add(new Screen(screen.getImage(), screen.getContent(), new Action(screen.getButton().getText(), screen.getButton().getStyle()), screen.getPageType()));
        }
        iVar.BF(new d(arrayList, this), comfortableDealInfo.getBanners());
        iVar.P20(comfortableDealInfo.getButton(), new e(this, comfortableDealInfoItem));
        if (this.f84588d) {
            return;
        }
        this.f84587c.c(new h());
        this.f84588d = true;
    }
}
