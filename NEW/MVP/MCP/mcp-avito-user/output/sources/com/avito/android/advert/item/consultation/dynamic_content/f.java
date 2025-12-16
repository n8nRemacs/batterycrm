package com.avito.android.advert.item.consultation.dynamic_content;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.advert_details.realty.LandingInfo;
import com.avito.android.remote.model.advert_details.realty.TeaserBanner;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DynamicConsultationItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/consultation/dynamic_content/f;", "Lcom/avito/android/advert/item/consultation/dynamic_content/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public h f74748b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public InterfaceC28130g0 f74749c;

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        LandingInfo landing;
        LandingInfo landing2;
        DeepLink entryPointShowEvent;
        InterfaceC28130g0 interfaceC28130g0;
        h hVar = (h) eVar;
        DynamicConsultationAfterIceBreakersItem dynamicConsultationAfterIceBreakersItem = (DynamicConsultationAfterIceBreakersItem) aVar;
        this.f74748b = hVar;
        TeaserBanner teaserBanner = dynamicConsultationAfterIceBreakersItem.f74739e;
        if (teaserBanner != null && (entryPointShowEvent = teaserBanner.getEntryPointShowEvent()) != null && (interfaceC28130g0 = this.f74749c) != null) {
            interfaceC28130g0.t(entryPointShowEvent);
        }
        if (teaserBanner != null) {
            hVar.Ps(teaserBanner);
        }
        String linkText = (teaserBanner == null || (landing2 = teaserBanner.getLanding()) == null) ? null : landing2.getLinkText();
        if (linkText == null) {
            linkText = "";
        }
        hVar.Jr(new AttributedText("{{title}}", Collections.singletonList(new DeepLinkAttribute("title", linkText, (teaserBanner == null || (landing = teaserBanner.getLanding()) == null) ? null : landing.getUrl(), null, null, C42745f0.U(new FontParameter.TextStyleParameter(null, "m1"), new FontParameter.ColorParameter(null, null, "gray54")), 24, null)), 1), new d(dynamicConsultationAfterIceBreakersItem, this));
        ButtonAction button = teaserBanner.getButton();
        hVar.Y0(button != null ? button.getTitle() : null, new e(dynamicConsultationAfterIceBreakersItem, this));
    }

    @Override // com.avito.android.advert.item.consultation.dynamic_content.c
    public final void s(@k InterfaceC28130g0 interfaceC28130g0) {
        this.f74749c = interfaceC28130g0;
    }
}
