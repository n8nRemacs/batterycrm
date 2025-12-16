package com.avito.android.str_booking.ui.promo_banner;

import Jx0.C14258a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.str_booking.network.models.sections.ClickstreamAnalyticsEventModel;
import com.avito.android.str_booking.network.models.sections.PromoBannerContent;
import com.avito.android.str_booking.network.models.sections.VisibleActions;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StrBookingPromoBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/promo_banner/e;", "LTV0/d;", "Lcom/avito/android/str_booking/ui/promo_banner/g;", "Lcom/avito/android/str_booking/ui/promo_banner/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f286156b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f286157c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<com.avito.android.str_booking.mvi.entity.a, G0> f286158d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k com.avito.android.util.text.a aVar, @k InterfaceC28373a interfaceC28373a, @k l<? super com.avito.android.str_booking.mvi.entity.a, G0> lVar) {
        this.f286156b = aVar;
        this.f286157c = interfaceC28373a;
        this.f286158d = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        PromoBannerContent promoBannerContent = ((a) aVar).f286150c;
        gVar.hg(promoBannerContent.getPreset());
        gVar.b(promoBannerContent.getTitle());
        gVar.r5(this.f286156b.c(gVar.getContext(), promoBannerContent.getDescription()));
        gVar.mY(promoBannerContent.c(), new d(this));
        gVar.M(promoBannerContent.getImage());
        VisibleActions visibleActions = promoBannerContent.getVisibleActions();
        ClickstreamAnalyticsEventModel clickstreamEvent = visibleActions != null ? visibleActions.getClickstreamEvent() : null;
        if (clickstreamEvent != null) {
            C14258a.f9179c.getClass();
            this.f286157c.c(new C14258a(clickstreamEvent.getId(), clickstreamEvent.getVersion(), clickstreamEvent.d(), null));
        }
    }
}
