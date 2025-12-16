package com.avito.android.advert.item.additionalSeller;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.additionalSeller.analytics.ButtonItemAnalyticsInfo;
import d4.C39502a;
import d4.C39503b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdditionalSellerButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/f;", "Lcom/avito/android/advert/item/additionalSeller/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C39503b f72569b;

    @Inject
    public f(@Y61.k C39503b c39503b) {
        this.f72569b = c39503b;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ButtonItemAnalyticsInfo buttonItemAnalyticsInfo;
        AdditionalSellerButtonItem additionalSellerButtonItem = (AdditionalSellerButtonItem) aVar;
        ((l) eVar).GE(additionalSellerButtonItem.f72536g);
        C39503b c39503b = this.f72569b;
        if (c39503b.f393660c || (buttonItemAnalyticsInfo = additionalSellerButtonItem.f72540k) == null) {
            return;
        }
        String strA = c39503b.f393659b.a();
        if (strA == null) {
            strA = "";
        }
        c39503b.f393658a.c(new C39502a(buttonItemAnalyticsInfo.f72554c, buttonItemAnalyticsInfo.f72555d, strA, buttonItemAnalyticsInfo.f72553b));
        c39503b.f393660c = true;
    }
}
