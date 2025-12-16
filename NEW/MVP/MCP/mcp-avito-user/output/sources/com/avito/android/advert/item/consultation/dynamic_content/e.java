package com.avito.android.advert.item.consultation.dynamic_content;

import android.os.Bundle;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.advert_details.realty.TeaserBanner;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DynamicConsultationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DynamicConsultationAfterIceBreakersItem f74746l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f74747m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DynamicConsultationAfterIceBreakersItem dynamicConsultationAfterIceBreakersItem, f fVar) {
        super(0);
        this.f74746l = dynamicConsultationAfterIceBreakersItem;
        this.f74747m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink;
        InterfaceC28130g0 interfaceC28130g0;
        DynamicConsultationAfterIceBreakersItem dynamicConsultationAfterIceBreakersItem = this.f74746l;
        ButtonAction button = dynamicConsultationAfterIceBreakersItem.f74739e.getButton();
        if (button != null && (deeplink = button.getDeeplink()) != null && (interfaceC28130g0 = this.f74747m.f74749c) != null) {
            Bundle bundle = new Bundle();
            TeaserBanner teaserBanner = dynamicConsultationAfterIceBreakersItem.f74739e;
            String title = teaserBanner.getTitle();
            String description = teaserBanner.getDescription();
            bundle.putString("consultation_start_link_argument_form_title", title);
            bundle.putString("consultation_start_link_argument_form_subtitle", description);
            bundle.putBoolean("consultation_start_link_track_submit_event", true);
            G0 g02 = G0.f406611a;
            interfaceC28130g0.l0(deeplink, bundle);
        }
        return G0.f406611a;
    }
}
