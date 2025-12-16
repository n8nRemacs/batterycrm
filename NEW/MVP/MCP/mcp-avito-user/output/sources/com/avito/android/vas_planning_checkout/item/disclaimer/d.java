package com.avito.android.vas_planning_checkout.item.disclaimer;

import Y61.k;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanningDisclaimerItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/disclaimer/d;", "Lcom/avito/android/vas_planning_checkout/item/disclaimer/c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f322960b;

    @Inject
    public d(@k w wVar) {
        this.f322960b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AttributedText attributedText = ((VasPlanningDisclaimerItem) aVar).f322951c;
        ((f) eVar).r(attributedText);
        attributedText.setOnDeepLinkClickListener(this.f322960b);
    }
}
