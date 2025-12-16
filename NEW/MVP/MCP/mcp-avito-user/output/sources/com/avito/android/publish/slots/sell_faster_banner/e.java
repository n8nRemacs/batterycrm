package com.avito.android.publish.slots.sell_faster_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellFasterBannerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/sell_faster_banner/e;", "Lcom/avito/android/publish/slots/sell_faster_banner/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f244851b;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f244851b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        SellFasterBannerItem sellFasterBannerItem = (SellFasterBannerItem) aVar;
        hVar.b(sellFasterBannerItem.f244842c);
        hVar.j(sellFasterBannerItem.f244843d);
        hVar.RH(new d(this, sellFasterBannerItem));
    }
}
