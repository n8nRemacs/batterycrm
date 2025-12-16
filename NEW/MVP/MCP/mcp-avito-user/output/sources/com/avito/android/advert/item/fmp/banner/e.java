package com.avito.android.advert.item.fmp.banner;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.fmp.AnalyticsEvent;
import com.avito.android.remote.fmp.FMPBannerButton;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFmpBannerItem f75438l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f75439m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AdvertDetailsFmpBannerItem advertDetailsFmpBannerItem, f fVar) {
        super(0);
        this.f75438l = advertDetailsFmpBannerItem;
        this.f75439m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink;
        List<AnalyticsEvent> listC;
        AdvertDetailsFmpBannerItem advertDetailsFmpBannerItem = this.f75438l;
        FMPBannerButton fMPBannerButton = advertDetailsFmpBannerItem.f75419h;
        f fVar = this.f75439m;
        if (fMPBannerButton != null && (listC = fMPBannerButton.c()) != null) {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                fVar.f75441c.c(h.a((AnalyticsEvent) it.next()));
            }
        }
        FMPBannerButton fMPBannerButton2 = advertDetailsFmpBannerItem.f75419h;
        if (fMPBannerButton2 != null && (deeplink = fMPBannerButton2.getDeeplink()) != null) {
            b.a.a(fVar.f75440b, deeplink, null, null, 6);
        }
        return G0.f406611a;
    }
}
