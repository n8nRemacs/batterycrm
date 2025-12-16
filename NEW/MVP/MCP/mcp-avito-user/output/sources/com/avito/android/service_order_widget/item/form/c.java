package com.avito.android.service_order_widget.item.form;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import com.avito.conveyor_item.a;
import is0.h;
import j.InterfaceC42156l;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: ServiceOrderFormWidgetItem.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_order_widget/item/form/c;", "Lcom/avito/android/service_order_widget/item/delegate/a;", "Lqs0/a;", "Lis0/h;", "a", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c implements com.avito.android.service_order_widget.item.delegate.a, InterfaceC47435a, is0.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f278887b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f278888c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f278889d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ArrayList f278890e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Float f278891f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ServiceOrderWidget.ServiceOrderWidgetAction f278892g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final UxFeedbackStartCampaignLink f278893h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final DeepLink f278894i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final ServiceOrderWidget.AnalyticsParams f278895j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Analytics f278896k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Settings f278897l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final h.b f278898m;

    /* renamed from: n, reason: collision with root package name */
    public final long f278899n = getF244870b().hashCode();

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f278900o = SerpViewType.f268585e;

    /* compiled from: ServiceOrderFormWidgetItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_widget/item/form/c$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CharSequence f278901b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f278902c;

        public a(@Y61.k CharSequence charSequence, @Y61.k DeepLink deepLink) {
            this.f278901b = charSequence;
            this.f278902c = deepLink;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            if ((obj instanceof a ? (a) obj : null) == null) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f278901b, aVar.f278901b) && L.f(this.f278902c, aVar.f278902c);
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W, reason: from getter */
        public final CharSequence getF202417b() {
            return this.f278901b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f278901b, aVar.f278901b) && L.f(this.f278902c, aVar.f278902c);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF249891e() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return this.f278902c.hashCode() + (this.f278901b.hashCode() * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF249892f() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FormChip(chipTitle=");
            sb2.append((Object) this.f278901b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f278902c, ')');
        }
    }

    public c(@Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText, @Y61.l ArrayList arrayList, @Y61.l Float f12, @Y61.l ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction, @Y61.l UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink, @Y61.l DeepLink deepLink, @Y61.l ServiceOrderWidget.AnalyticsParams analyticsParams, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f278887b = str;
        this.f278888c = str2;
        this.f278889d = attributedText;
        this.f278890e = arrayList;
        this.f278891f = f12;
        this.f278892g = serviceOrderWidgetAction;
        this.f278893h = uxFeedbackStartCampaignLink;
        this.f278894i = deepLink;
        this.f278895j = analyticsParams;
        this.f278896k = analytics;
        this.f278897l = settings;
        this.f278898m = new h.b("serviceOrderWidget", null, null, null, null, analytics, 30, null);
    }

    @Override // com.avito.android.service_order_widget.item.delegate.a
    @Y61.l
    /* renamed from: K1, reason: from getter */
    public final DeepLink getF278850i() {
        return this.f278894i;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // com.avito.android.service_order_widget.item.delegate.a
    @Y61.l
    public final DeepLink M0() {
        return this.f278893h;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f278887b, cVar.f278887b) && L.f(this.f278888c, cVar.f278888c) && L.f(this.f278889d, cVar.f278889d) && L.f(this.f278890e, cVar.f278890e) && L.f(this.f278891f, cVar.f278891f) && L.f(this.f278892g, cVar.f278892g) && L.f(this.f278893h, cVar.f278893h) && L.f(this.f278894i, cVar.f278894i) && L.f(this.f278895j, cVar.f278895j) && L.f(this.f278896k, cVar.f278896k) && L.f(this.f278897l, cVar.f278897l);
    }

    @Override // com.avito.android.service_order_widget.item.delegate.a
    @Y61.l
    /* renamed from: getAnalyticParams, reason: from getter */
    public final ServiceOrderWidget.AnalyticsParams getF278851j() {
        return this.f278895j;
    }

    @Override // com.avito.android.service_order_widget.item.delegate.a
    @Y61.l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF278852k() {
        return this.f278896k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF268928f() {
        return this.f278897l;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public final int getF268932j() {
        return 2;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF268926d() {
        return this.f278887b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF268930h() {
        return this.f278899n;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF268931i() {
        return this.f278900o;
    }

    public final int hashCode() {
        int iD2 = H.d(r.e(2, this.f278887b.hashCode() * 31, 31), 31, this.f278888c);
        AttributedText attributedText = this.f278889d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ArrayList arrayList = this.f278890e;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Float f12 = this.f278891f;
        int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = this.f278892g;
        int iHashCode4 = (iHashCode3 + (serviceOrderWidgetAction == null ? 0 : serviceOrderWidgetAction.hashCode())) * 31;
        UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink = this.f278893h;
        int iHashCode5 = (iHashCode4 + (uxFeedbackStartCampaignLink == null ? 0 : uxFeedbackStartCampaignLink.hashCode())) * 31;
        DeepLink deepLink = this.f278894i;
        int iHashCode6 = (iHashCode5 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ServiceOrderWidget.AnalyticsParams analyticsParams = this.f278895j;
        int iHashCode7 = (iHashCode6 + (analyticsParams == null ? 0 : analyticsParams.hashCode())) * 31;
        Analytics analytics = this.f278896k;
        int iHashCode8 = (iHashCode7 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f278897l;
        return iHashCode8 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF268929g() {
        return this.f278898m;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrderFormWidgetItem(stringId=");
        sb2.append(this.f278887b);
        sb2.append(", spanCount=2, title=");
        sb2.append(this.f278888c);
        sb2.append(", description=");
        sb2.append(this.f278889d);
        sb2.append(", formChips=");
        sb2.append(this.f278890e);
        sb2.append(", progress=");
        sb2.append(this.f278891f);
        sb2.append(", primaryAction=");
        sb2.append(this.f278892g);
        sb2.append(", redirectDeeplink=");
        sb2.append(this.f278893h);
        sb2.append(", descriptionPromoLink=");
        sb2.append(this.f278894i);
        sb2.append(", analyticParams=");
        sb2.append(this.f278895j);
        sb2.append(", analytics=");
        sb2.append(this.f278896k);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f278897l, ')');
    }
}
