package com.avito.android.advert.item.auto_credits;

import Me.i;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.auto_credits.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.CompositeBrokerEventParams;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutoLoansPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/auto_credits/e;", "Lcom/avito/android/advert/item/auto_credits/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f72897b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c.a f72898c;

    @Inject
    public e(@k i iVar, @k c.a aVar) {
        this.f72897b = iVar;
        this.f72898c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        final AdvertDetailsAutoLoansItem advertDetailsAutoLoansItem = (AdvertDetailsAutoLoansItem) aVar;
        final AdvertDetailsAutoLoansData advertDetailsAutoLoansData = advertDetailsAutoLoansItem.f72883d;
        CompositeBrokerEventParams renderEventParams = advertDetailsAutoLoansData.getRenderEventParams();
        this.f72897b.b(renderEventParams != null ? renderEventParams.getFromPage() : null);
        AttributedText subtitle = advertDetailsAutoLoansData.getSubtitle();
        if (subtitle != null) {
            subtitle.setOnDeepLinkClickListener(new w() { // from class: com.avito.android.advert.item.auto_credits.d
                @Override // com.avito.android.deep_linking.links.w
                public final void i7(DeepLink deepLink) {
                    e eVar2 = this;
                    AdvertDetailsAutoLoansItem advertDetailsAutoLoansItem2 = advertDetailsAutoLoansItem;
                    boolean z12 = advertDetailsAutoLoansItem2.f72885f;
                    i iVar = eVar2.f72897b;
                    if (z12) {
                        iVar.c();
                    } else {
                        CompositeBrokerEventParams clickEventParams = advertDetailsAutoLoansData.getClickEventParams();
                        iVar.d(clickEventParams != null ? clickEventParams.getFromPage() : null);
                    }
                    eVar2.f72898c.A0(advertDetailsAutoLoansItem2, deepLink);
                }
            });
        }
        gVar.b(advertDetailsAutoLoansData.getTitle());
        gVar.R(advertDetailsAutoLoansData.getSubtitle());
        gVar.L60(advertDetailsAutoLoansData.getUniversalIcons(), advertDetailsAutoLoansData.getFallbackIcons());
    }
}
