package com.avito.android.advertising.loaders;

import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommercialBannersAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BannerInfo f88388l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CommercialBannersAnalyticsInteractorImpl f88389m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f88390n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BannerInfo bannerInfo, CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl, int i12) {
        super(0);
        BannerEvent.Type type = BannerEvent.Type.f87773b;
        this.f88388l = bannerInfo;
        this.f88389m = commercialBannersAnalyticsInteractorImpl;
        this.f88390n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        BannerInfo bannerInfo = this.f88388l;
        if (!bannerInfo.f87890u) {
            bannerInfo.f87890u = true;
            if (bannerInfo.e()) {
                CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl = this.f88389m;
                InterfaceC28373a interfaceC28373a = commercialBannersAnalyticsInteractorImpl.f87903c;
                commercialBannersAnalyticsInteractorImpl.f87904d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                BannerEvent.Type type = BannerEvent.Type.f87773b;
                interfaceC28373a.c(new com.avito.android.advertising.analytics.events.c(this.f88388l, commercialBannersAnalyticsInteractorImpl.f87902b, commercialBannersAnalyticsInteractorImpl.f87906f, this.f88390n, jCurrentTimeMillis, commercialBannersAnalyticsInteractorImpl.f87908h));
            }
        }
        return G0.f406611a;
    }
}
