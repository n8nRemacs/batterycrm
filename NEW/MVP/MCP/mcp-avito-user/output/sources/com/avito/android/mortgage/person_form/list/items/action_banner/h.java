package com.avito.android.mortgage.person_form.list.items.action_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.deeplink.MortgageConsultationLink;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ActionBannerVisibilityTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/action_banner/h;", "LWV0/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f200581e;

    @Inject
    public h(@k InterfaceC28373a interfaceC28373a) {
        super(true, false, 0.001f, 1L);
        this.f200581e = interfaceC28373a;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof ActionBannerItem;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        DeepLink deepLink;
        ActionBannerItem actionBannerItem = interfaceC10495b instanceof ActionBannerItem ? (ActionBannerItem) interfaceC10495b : null;
        if (actionBannerItem == null || (deepLink = actionBannerItem.f200567f) == null || !(deepLink instanceof MortgageConsultationLink)) {
            return;
        }
        MortgageConsultationLink mortgageConsultationLink = (MortgageConsultationLink) deepLink;
        this.f200581e.c(new com.avito.android.mortgage.person_form.analytics.g(mortgageConsultationLink.f198695b, mortgageConsultationLink.f198697d));
    }
}
