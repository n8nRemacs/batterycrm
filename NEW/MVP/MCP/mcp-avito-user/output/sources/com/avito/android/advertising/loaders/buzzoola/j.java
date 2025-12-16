package com.avito.android.advertising.loaders.buzzoola;

import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import com.avito.android.remote.model.advertising.BuzzoolaPromoType;
import kotlin.Metadata;

/* compiled from: BuzzoolaBannerLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "loadedBanner", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f88319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaNetworkBannerItem f88320c;

    public j(l lVar, BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItem) {
        this.f88319b = lVar;
        this.f88320c = buzzoolaNetworkBannerItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BuzzoolaBanner buzzoolaBanner = (BuzzoolaBanner) obj;
        l lVar = this.f88319b;
        lVar.f88323b.c(buzzoolaBanner.getF88278i());
        if ((buzzoolaBanner instanceof BuzzoolaBanner.BuzzoolaDirect) || (((buzzoolaBanner instanceof BuzzoolaBanner.BuzzoolaCredit) && ((BuzzoolaBanner.BuzzoolaCredit) buzzoolaBanner).f88213g.f88287h == BuzzoolaPromoType.EXTERNAL) || ((buzzoolaBanner instanceof BuzzoolaBanner.BuzzoolaPremium) && ((BuzzoolaBanner.BuzzoolaPremium) buzzoolaBanner).f88245j.f88309g == BuzzoolaPromoType.EXTERNAL))) {
            String strW = buzzoolaBanner.W();
            boolean z12 = !(strW == null || strW.length() == 0);
            BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItem = this.f88320c;
            String bannerCode = buzzoolaNetworkBannerItem.getBannerCode();
            if (bannerCode == null) {
                bannerCode = "unknown";
            }
            lVar.f88325d.e("buzzoola", bannerCode, buzzoolaNetworkBannerItem.getBlockId(), z12);
        }
    }
}
