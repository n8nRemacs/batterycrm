package com.avito.android.advert.item.consultation.dynamic_content;

import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.advert_details.realty.LandingInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DynamicConsultationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DynamicConsultationAfterIceBreakersItem f74744l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f74745m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DynamicConsultationAfterIceBreakersItem dynamicConsultationAfterIceBreakersItem, f fVar) {
        super(0);
        this.f74744l = dynamicConsultationAfterIceBreakersItem;
        this.f74745m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink url;
        InterfaceC28130g0 interfaceC28130g0;
        LandingInfo landing = this.f74744l.f74739e.getLanding();
        if (landing != null && (url = landing.getUrl()) != null && (interfaceC28130g0 = this.f74745m.f74749c) != null) {
            interfaceC28130g0.P(url);
        }
        return G0.f406611a;
    }
}
