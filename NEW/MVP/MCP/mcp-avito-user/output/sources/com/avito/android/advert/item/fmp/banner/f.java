package com.avito.android.advert.item.fmp.banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.fmp.AnalyticsEvent;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpBannerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fmp/banner/f;", "Lcom/avito/android/advert/item/fmp/banner/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f75440b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f75441c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f75442d;

    @Inject
    public f(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f75440b = aVar;
        this.f75441c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        AdvertDetailsFmpBannerItem advertDetailsFmpBannerItem = (AdvertDetailsFmpBannerItem) aVar;
        iVar.e(advertDetailsFmpBannerItem.f75413b);
        iVar.k(advertDetailsFmpBannerItem.f75414c);
        iVar.i(advertDetailsFmpBannerItem.f75415d);
        iVar.x4(advertDetailsFmpBannerItem.f75417f);
        iVar.P50(advertDetailsFmpBannerItem.f75418g);
        iVar.B30(advertDetailsFmpBannerItem.f75419h);
        iVar.a(new d(advertDetailsFmpBannerItem, this));
        iVar.Y(new e(advertDetailsFmpBannerItem, this));
        if (this.f75442d) {
            return;
        }
        List<AnalyticsEvent> list = advertDetailsFmpBannerItem.f75422k;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f75441c.c(h.a((AnalyticsEvent) it.next()));
            }
        }
        this.f75442d = true;
    }
}
