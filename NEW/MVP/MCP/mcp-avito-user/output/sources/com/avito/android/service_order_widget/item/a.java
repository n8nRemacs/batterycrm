package com.avito.android.service_order_widget.item;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: ServiceOrderWidgetItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/a;", "Lcom/avito/android/service_order_widget/item/delegate/a;", "Lqs0/a;", "Lis0/h;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.android.service_order_widget.item.delegate.a, InterfaceC47435a, is0.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f278843b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f278844c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ServiceOrderWidget.ServiceOrderWidgetAction f278845d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ServiceOrderWidget.ServiceOrderWidgetAction f278846e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AttributedText f278847f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f278848g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final UxFeedbackStartCampaignLink f278849h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final DeepLink f278850i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final ServiceOrderWidget.AnalyticsParams f278851j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Analytics f278852k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Settings f278853l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final h.b f278854m;

    /* renamed from: n, reason: collision with root package name */
    public final long f278855n = getF270622b().hashCode();

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f278856o = SerpViewType.f268585e;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.l ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction, @Y61.l ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction2, @Y61.l AttributedText attributedText, @Y61.l UniversalImage universalImage, @Y61.l UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink, @Y61.l DeepLink deepLink, @Y61.l ServiceOrderWidget.AnalyticsParams analyticsParams, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f278843b = str;
        this.f278844c = str2;
        this.f278845d = serviceOrderWidgetAction;
        this.f278846e = serviceOrderWidgetAction2;
        this.f278847f = attributedText;
        this.f278848g = universalImage;
        this.f278849h = uxFeedbackStartCampaignLink;
        this.f278850i = deepLink;
        this.f278851j = analyticsParams;
        this.f278852k = analytics;
        this.f278853l = settings;
        this.f278854m = new h.b("serviceOrderWidget", null, null, null, null, analytics, 30, null);
    }

    @Override // com.avito.android.service_order_widget.item.delegate.a
    @Y61.l
    /* renamed from: K1, reason: from getter */
    public final DeepLink getF278894i() {
        return this.f278850i;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // com.avito.android.service_order_widget.item.delegate.a
    @Y61.l
    public final DeepLink M0() {
        return this.f278849h;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f278843b, aVar.f278843b) && L.f(this.f278844c, aVar.f278844c) && L.f(this.f278845d, aVar.f278845d) && L.f(this.f278846e, aVar.f278846e) && L.f(this.f278847f, aVar.f278847f) && L.f(this.f278848g, aVar.f278848g) && L.f(this.f278849h, aVar.f278849h) && L.f(this.f278850i, aVar.f278850i) && L.f(this.f278851j, aVar.f278851j) && L.f(this.f278852k, aVar.f278852k) && L.f(this.f278853l, aVar.f278853l);
    }

    @Override // com.avito.android.service_order_widget.item.delegate.a
    @Y61.l
    /* renamed from: getAnalyticParams, reason: from getter */
    public final ServiceOrderWidget.AnalyticsParams getF278895j() {
        return this.f278851j;
    }

    @Override // com.avito.android.service_order_widget.item.delegate.a
    @Y61.l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF278896k() {
        return this.f278852k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF162543g() {
        return this.f278853l;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public final int getF270628h() {
        return 2;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270622b() {
        return this.f278843b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF162546j() {
        return this.f278855n;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270627g() {
        return this.f278856o;
    }

    public final int hashCode() {
        int iD2 = H.d(r.e(2, this.f278843b.hashCode() * 31, 31), 31, this.f278844c);
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = this.f278845d;
        int iHashCode = (iD2 + (serviceOrderWidgetAction == null ? 0 : serviceOrderWidgetAction.hashCode())) * 31;
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction2 = this.f278846e;
        int iHashCode2 = (iHashCode + (serviceOrderWidgetAction2 == null ? 0 : serviceOrderWidgetAction2.hashCode())) * 31;
        AttributedText attributedText = this.f278847f;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f278848g;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink = this.f278849h;
        int iHashCode5 = (iHashCode4 + (uxFeedbackStartCampaignLink == null ? 0 : uxFeedbackStartCampaignLink.hashCode())) * 31;
        DeepLink deepLink = this.f278850i;
        int iHashCode6 = (iHashCode5 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ServiceOrderWidget.AnalyticsParams analyticsParams = this.f278851j;
        int iHashCode7 = (iHashCode6 + (analyticsParams == null ? 0 : analyticsParams.hashCode())) * 31;
        Analytics analytics = this.f278852k;
        int iHashCode8 = (iHashCode7 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f278853l;
        return iHashCode8 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF162545i() {
        return this.f278854m;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrderWidgetItem(stringId=");
        sb2.append(this.f278843b);
        sb2.append(", spanCount=2, title=");
        sb2.append(this.f278844c);
        sb2.append(", primaryAction=");
        sb2.append(this.f278845d);
        sb2.append(", secondaryAction=");
        sb2.append(this.f278846e);
        sb2.append(", description=");
        sb2.append(this.f278847f);
        sb2.append(", image=");
        sb2.append(this.f278848g);
        sb2.append(", redirectDeeplink=");
        sb2.append(this.f278849h);
        sb2.append(", descriptionPromoLink=");
        sb2.append(this.f278850i);
        sb2.append(", analyticParams=");
        sb2.append(this.f278851j);
        sb2.append(", analytics=");
        sb2.append(this.f278852k);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f278853l, ')');
    }
}
