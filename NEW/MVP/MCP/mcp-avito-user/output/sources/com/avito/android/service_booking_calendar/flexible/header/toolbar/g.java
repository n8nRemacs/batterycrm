package com.avito.android.service_booking_calendar.flexible.header.toolbar;

import Ax0.C13097a;
import Ax0.InterfaceC13098b;
import Ky0.C14362a;
import Ky0.b;
import Vx0.AbstractC15725a;
import Y41.l;
import Y41.r;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.search.HeaderSubtitle;
import com.avito.android.remote.model.search.HeaderSubtitleAction;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.models.SparePartsGroup;
import com.avito.android.service_booking_calendar.domain.ToolbarAction;
import com.avito.android.service_booking_common.blueprints.check_price_list.p;
import com.avito.android.service_booking_common.blueprints.date.s;
import com.avito.android.service_order_widget.item.form.i;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import com.avito.android.service_orders.list.blueprints.snippet_item.m;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListState;
import com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem;
import com.avito.android.services_transportation_widget.item.fields.select.ServicesTransportationWidgetSelectItem;
import com.avito.android.services_transportation_widget.item.k;
import com.avito.android.shift_list.ui.list.time_item.Action;
import com.avito.android.short_term_rent.bookingform.mvi.entity.FooterButtonItem;
import com.avito.android.short_term_rent.common.entity.PromoCode;
import com.avito.android.shortcut_navigation_bar.C34999p;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import com.avito.android.str_booking.network.models.sections.InfoPlaque;
import com.avito.android.str_booking.network.models.sections.PlaqueAction;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a;
import com.avito.android.str_calendar.seller.last_minute_offer.n;
import com.avito.android.str_calendar.seller.last_minute_offer.ui.LastMinuteOfferFragment;
import com.avito.android.success.SuccessFragment;
import com.avito.android.sx_address.new_address.view.C35196c;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import eA0.InterfaceC39979a;
import kotlin.G0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import nw0.InterfaceC44484a;
import qt0.C47438b;
import qt0.C47439c;
import qt0.C47440d;
import qt0.j;
import sx0.C48428a;
import sx0.InterfaceC48429b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f276086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f276087c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f276088d;

    public /* synthetic */ g(int i12, l lVar, Parcelable parcelable) {
        this.f276086b = i12;
        this.f276088d = parcelable;
        this.f276087c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r1v9, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v10, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v8, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink uri;
        DeepLink deepLink;
        InlineFiltersGeo.FromPage fromPage = null;
        Object[] objArr = 0;
        Object obj = this.f276087c;
        Object obj2 = this.f276088d;
        switch (this.f276086b) {
            case 0:
                int i12 = h.f276089d;
                ((l) obj).invoke(((ToolbarAction) obj2).f275534d);
                break;
            case 1:
                ((com.avito.android.service_booking_common.blueprints.any_specialist.d) obj).f276240b.K5((C47438b) obj2);
                break;
            case 2:
                int i13 = p.f276262h;
                ((l) obj).invoke((C47439c.a) obj2);
                break;
            case 3:
                int i14 = p.f276262h;
                ((N) obj).invoke((C47439c.a) obj2);
                break;
            case 4:
                C47440d.a aVar = (C47440d.a) obj;
                if (aVar == null) {
                    int i15 = s.f276370p;
                    break;
                } else {
                    ?? r62 = ((s) obj2).f276384o;
                    if (r62 != 0) {
                        r62.invoke(aVar);
                        break;
                    }
                }
                break;
            case 5:
                ((com.avito.android.service_booking_common.blueprints.specialist.d) obj).f276487b.K5((j) obj2);
                break;
            case 6:
                ((com.avito.android.service_order_map.serviceordermap.suggests.b) obj).f278822e.invoke((AddressSuggestion) obj2);
                break;
            case 7:
                int i16 = i.f278906k;
                ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = ((com.avito.android.service_order_widget.item.form.c) obj).f278892g;
                if (serviceOrderWidgetAction != null) {
                    ((com.avito.android.service_order_widget.item.delegate.d) obj2).k(serviceOrderWidgetAction.getUri(), serviceOrderWidgetAction.getTitle());
                    break;
                }
                break;
            case 8:
                int i17 = m.f279352m;
                ((N) obj).invoke((ServiceOrdersListSnippetItem.a) obj2);
                break;
            case 9:
                int i18 = com.avito.android.service_orders.list.toolbar.g.f279440d;
                DeepLink deepLink2 = ((ServiceOrdersListState.ServiceOrdersListToolbar.ServiceOrdersButtonAction) obj2).f279585c;
                if (deepLink2 != null) {
                    ((l) obj).invoke(deepLink2);
                    break;
                }
                break;
            case 10:
                int i19 = k.f280653l;
                ServiceTransportationWidget.Action action = (ServiceTransportationWidget.Action) obj;
                if (!(action != null ? L.f(action.getEnabled(), Boolean.FALSE) : false) && action != null && (uri = action.getUri()) != null) {
                    k kVar = (k) obj2;
                    l<? super DeepLink, G0> lVar = kVar.f280662j;
                    if (lVar != null) {
                        lVar.invoke(uri);
                    }
                    l<? super ServiceTransportationWidgetItem, G0> lVar2 = kVar.f280663k;
                    if (lVar2 != null) {
                        lVar2.invoke(kVar.f280661i);
                        break;
                    }
                }
                break;
            case 11:
                int i22 = com.avito.android.services_transportation_widget.item.fields.select.b.f280596c;
                ((com.avito.android.services_transportation_widget.item.l) obj).f1(((ServicesTransportationWidgetSelectItem) obj2).f280590b);
                break;
            case 12:
                ((com.avito.android.services_transportation_widget.select_sheet.a) obj).f280681c.invoke((ServiceTransportationWidget.SelectField.SelectValue) obj2);
                break;
            case 13:
                int i23 = com.avito.android.shift_list.ui.list.time_item.d.f281160e;
                ((l) obj).invoke(((Action) obj2).f281151c);
                break;
            case 14:
                ((com.avito.android.short_term_rent.bookingform.j) obj).f281742c.invoke(((FooterButtonItem) obj2).f281823a);
                break;
            case 15:
                String str = ((nw0.c) obj).f419242e;
                if (str != null && str.length() != 0) {
                    ((com.avito.android.short_term_rent.promo_codes.ui.e) obj2).f282524c.accept(new InterfaceC44484a.C12152a(str));
                    break;
                }
                break;
            case 16:
                ((com.avito.android.short_term_rent.promo_codes.ui.e) obj).f282524c.accept(new InterfaceC44484a.f((PromoCode) obj2));
                break;
            case 17:
                l<? super DeepLink, G0> lVar3 = ((com.avito.android.short_term_rent.soft_booking.view.g) obj).f282903g;
                if (lVar3 != null) {
                    lVar3.invoke(((rw0.p) obj2).f437244b);
                    break;
                }
                break;
            case 18:
                HeaderSubtitleAction action2 = ((HeaderSubtitle) obj2).getAction();
                String filterId = action2 != null ? action2.getFilterId() : null;
                if (filterId == null) {
                    filterId = "";
                }
                ((C34999p) obj).f283480e0.accept(new InlineFiltersGeo(filterId, fromPage, 2, objArr == true ? 1 : 0));
                break;
            case 19:
                int i24 = com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3.g.f284787f;
                SparePartsGroup sparePartsGroup = ((com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3.e) obj).f284786f;
                if (sparePartsGroup != null) {
                    ((InterfaceC48429b) obj2).a(new C48428a(sparePartsGroup));
                    break;
                }
                break;
            case 20:
                ((com.avito.android.status_doc.helpers.a) obj).f284872i.invoke(new InterfaceC13098b.a((C13097a) obj2));
                break;
            case 21:
                int i25 = com.avito.android.str_booking.ui.info.k.f286060l;
                PlaqueAction plaqueActionC = ((InfoPlaque) obj2).getAction();
                if (plaqueActionC != null && (deepLink = plaqueActionC.getDeepLink()) != null) {
                    ((l) obj).invoke(deepLink);
                    break;
                }
                break;
            case 22:
                int i26 = com.avito.android.str_booking.ui.item_info.h.f286086g;
                ((r) obj).invoke((AbstractC15725a) obj2, null, null, null);
                break;
            case 23:
                com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount.g gVar = (com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount.g) obj2;
                ListItemSwitcher listItemSwitcher = gVar.f287177b;
                ((l) obj).invoke(Boolean.valueOf(listItemSwitcher.isChecked()));
                ViewGroup viewGroup = gVar.f287178c;
                Q.b(viewGroup);
                Q.a(viewGroup, null);
                viewGroup.setVisibility(listItemSwitcher.isChecked() ? 0 : 8);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                LastMinuteOfferFragment.a aVar2 = LastMinuteOfferFragment.f287978s0;
                n nVarR5 = ((LastMinuteOfferFragment) obj).r5();
                C14362a c14362a = ((a.C8652a) obj2).f287954d;
                nVarR5.accept(new b.f(c14362a.f9725e, c14362a.f9721a));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                SuccessFragment.a aVar3 = SuccessFragment.f291545y0;
                ((SuccessFragment) obj).q5().accept(new InterfaceC39979a.C11056a((DeepLink) obj2));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i27 = com.avito.android.suggest_institutes_bottom_sheet.blueprints.h.f291991c;
                ((l) obj).invoke(Integer.valueOf(((com.avito.android.suggest_institutes_bottom_sheet.blueprints.h) obj2).getBindingAdapterPosition()));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((N) obj).invoke((String) obj2);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((l) obj).invoke(((C35196c) obj2).f293879c.getDeformattedText());
                break;
            default:
                int i28 = com.avito.android.tariff.cpa.info.ui.items.alert.i.f294806g;
                ((l) obj).invoke(((com.avito.android.tariff.remote.model.edit.a) obj2).getDeeplink());
                break;
        }
    }

    public /* synthetic */ g(int i12, Object obj, Object obj2) {
        this.f276086b = i12;
        this.f276087c = obj;
        this.f276088d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(l lVar, ServiceOrdersListSnippetItem.a aVar) {
        this.f276086b = 8;
        this.f276087c = (N) lVar;
        this.f276088d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(l lVar, C47439c.a aVar) {
        this.f276086b = 3;
        this.f276087c = (N) lVar;
        this.f276088d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(String str, l lVar) {
        this.f276086b = 27;
        this.f276087c = (N) lVar;
        this.f276088d = str;
    }
}
