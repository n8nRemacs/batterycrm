package com.avito.android.publish.screen.objects.view.actions;

import Gy0.InterfaceC13931a;
import Jy0.InterfaceC14261a;
import Ow0.InterfaceC14743a;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.rating_form.select_item.adapter.advert.ComposeUncutTextView;
import com.avito.android.rating_ui.aspects.view.RatingAspectsView;
import com.avito.android.return_checkout.DeliveryReturnCheckoutFragment;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.DeliveryUniversalCheckoutFragment;
import com.avito.android.safety.password_setting.PasswordSettingFragment;
import com.avito.android.sbc.create.mvi.M0;
import com.avito.android.search.filter.adapter.category_group.C34541e;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.seller_promotions.n;
import com.avito.android.serp.adapter.carousel_widget.C34699i;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.L;
import com.avito.android.similar_adverts.SimilarAdvertsDialog;
import com.avito.android.similar_adverts.p;
import com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment;
import com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarView;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarView$flatInfoLayoutManager$1;
import com.avito.android.universal_map.map.UniversalMapFragment;
import com.avito.android.user_adverts.root_screen.adverts_host.b0;
import com.avito.android.util.C35976x4;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.text.C43066x;
import org.chromium.net.CronetEngine;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f240267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f240268c;

    public /* synthetic */ h(Object obj, int i12) {
        this.f240267b = i12;
        this.f240268c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        Y41.a<G0> aVar;
        com.avito.android.lib.design.tooltip.k kVar;
        int i12 = 1;
        switch (this.f240267b) {
            case 0:
                int i13 = i.f240269f;
                i iVar = (i) this.f240268c;
                iVar.f240271b.removeCallbacks(iVar.f240272c);
                com.avito.android.publish.screen.step.params.view.actions.a aVar2 = iVar.f240274e;
                if (aVar2 != null) {
                    aVar2.b();
                    aVar2.Fc();
                    break;
                }
                break;
            case 1:
                com.avito.android.quic.c cVar = (com.avito.android.quic.c) this.f240268c;
                CronetEngine cronetEngineA = cVar.f246168c.a();
                cVar.f246177l = cronetEngineA != null ? cVar.f246169d.a(cronetEngineA) : null;
                cVar.f246176k = true;
                break;
            case 2:
                int i14 = com.avito.android.quic.performance.a.f246287m;
                com.avito.android.quic.performance.a aVar3 = (com.avito.android.quic.performance.a) this.f240268c;
                aVar3.b();
                aVar3.f246298k = null;
                break;
            case 3:
                ((com.avito.android.rating_form.item.singleLineInput.k) this.f240268c).f248632c.v();
                break;
            case 4:
                ComposeUncutTextView composeUncutTextView = (ComposeUncutTextView) this.f240268c;
                if (composeUncutTextView.b(composeUncutTextView.f248900b).getLineCount() != 2) {
                    if (composeUncutTextView.f248901c.length() != 0) {
                        if (composeUncutTextView.b(composeUncutTextView.f248900b + composeUncutTextView.f248901c).getLineCount() != 2) {
                            composeUncutTextView.f(composeUncutTextView.f248900b, composeUncutTextView.f248901c);
                            break;
                        } else {
                            composeUncutTextView.f(composeUncutTextView.f248900b, "\n" + C43066x.G0(composeUncutTextView.f248901c).toString());
                            break;
                        }
                    } else {
                        composeUncutTextView.f(composeUncutTextView.f248900b, composeUncutTextView.f248901c);
                        break;
                    }
                } else if (composeUncutTextView.f248901c.length() != 0) {
                    int ellipsisCount = composeUncutTextView.b(composeUncutTextView.f248900b + composeUncutTextView.f248901c).getEllipsisCount(1);
                    if (ellipsisCount != 0) {
                        int i15 = ellipsisCount + 3;
                        if (i15 <= composeUncutTextView.f248900b.length() - 1) {
                            composeUncutTextView.f(((Object) composeUncutTextView.f248900b.subSequence(0, new kotlin.ranges.l(0, composeUncutTextView.f248900b.length() - i15, 1).f406906c + 1)) + "...", composeUncutTextView.f248901c);
                            break;
                        } else {
                            composeUncutTextView.f("", composeUncutTextView.f248901c);
                            break;
                        }
                    } else {
                        composeUncutTextView.f(composeUncutTextView.f248900b, composeUncutTextView.f248901c);
                        break;
                    }
                } else {
                    composeUncutTextView.f(composeUncutTextView.f248900b, composeUncutTextView.f248901c);
                    break;
                }
            case 5:
                int i16 = RatingAspectsView.f249894J0;
                RecyclerView.Adapter adapter = ((RatingAspectsView) this.f240268c).getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    break;
                }
                break;
            case 6:
                DeliveryReturnCheckoutFragment deliveryReturnCheckoutFragment = (DeliveryReturnCheckoutFragment) this.f240268c;
                RecyclerView recyclerView = deliveryReturnCheckoutFragment.f255215D0;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                RecyclerView recyclerView2 = deliveryReturnCheckoutFragment.f255216E0;
                com.avito.android.delivery_common.j.a(recyclerView, recyclerView2 != null ? recyclerView2 : null);
                break;
            case 7:
                DeliveryUniversalCheckoutFragment deliveryUniversalCheckoutFragment = (DeliveryUniversalCheckoutFragment) this.f240268c;
                RecyclerView recyclerView3 = deliveryUniversalCheckoutFragment.f256867E0;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                RecyclerView recyclerView4 = deliveryUniversalCheckoutFragment.f256868F0;
                com.avito.android.delivery_common.j.a(recyclerView3, recyclerView4 != null ? recyclerView4 : null);
                break;
            case 8:
                PasswordSettingFragment.a aVar4 = PasswordSettingFragment.f257418v0;
                ((PasswordSettingFragment) this.f240268c).q5().e();
                break;
            case 9:
                M0 m02 = (M0) this.f240268c;
                m02.f259386g.p(m02.f259404p.getTop());
                break;
            case 10:
                C34541e c34541e = (C34541e) this.f240268c;
                c34541e.f262056a.setData(c34541e.f262058c);
                break;
            case 11:
                ((Toolbar23SearchView) this.f240268c).f264474h.requestFocus();
                break;
            case 12:
                ((com.avito.android.select.bottom_sheet.g) this.f240268c).f265296h.A0(0);
                break;
            case 13:
                n nVar = (n) this.f240268c;
                com.avito.android.delivery_common.j.a(nVar.f268084l, nVar.f268085m);
                break;
            case 14:
                ((C34699i) this.f240268c).f269391t.notifyDataSetChanged();
                break;
            case 15:
                int i17 = L.f273402s;
                ((L) this.f240268c).C80();
                break;
            case 16:
                com.avito.android.service_order_widget.item.form.i iVar2 = (com.avito.android.service_order_widget.item.form.i) this.f240268c;
                iVar2.f278909d.setData(iVar2.f278914i);
                break;
            case 17:
                SimilarAdvertsDialog.a aVar5 = SimilarAdvertsDialog.f283776w0;
                ((p) ((SimilarAdvertsDialog) this.f240268c).f283778i0.getValue()).accept(InterfaceC14743a.b.f12725a);
                break;
            case 18:
                StrCalendarParametersFragment.a aVar6 = StrCalendarParametersFragment.f286684D0;
                ((Y41.l) this.f240268c).invoke(InterfaceC13931a.v.f6834a);
                break;
            case 19:
                com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.e eVar = ((com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.c) this.f240268c).f286739c;
                if (eVar != null && (aVar = eVar.f286745G) != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 20:
                com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.c cVar2 = (com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.c) this.f240268c;
                int lineHeight = cVar2.f287271c.getLineHeight();
                Switcher switcher = cVar2.f287270b;
                int height = lineHeight - switcher.getHeight();
                switcher.setPadding(switcher.getPaddingLeft(), (height >= 0 ? height : 0) / 2, switcher.getPaddingRight(), switcher.getPaddingBottom());
                break;
            case 21:
                StrSellerCalendarFragment.a aVar7 = StrSellerCalendarFragment.f287476x0;
                ((StrSellerCalendarFragment) this.f240268c).q5().accept(InterfaceC14261a.e.f9186a);
                break;
            case 22:
                ((com.avito.android.str_seller_orders.orders_seller.items.filters.g) this.f240268c).f289456c.A0(0);
                break;
            case 23:
                StrOrdersCalendarView strOrdersCalendarView = (StrOrdersCalendarView) this.f240268c;
                StrOrdersCalendarView$flatInfoLayoutManager$1 strOrdersCalendarView$flatInfoLayoutManager$1 = strOrdersCalendarView.f290542B;
                int iK1 = strOrdersCalendarView$flatInfoLayoutManager$1.K1();
                strOrdersCalendarView$flatInfoLayoutManager$1.b2(iK1, 0);
                RecyclerView recyclerView5 = strOrdersCalendarView.f290545E;
                (recyclerView5 != null ? recyclerView5 : null).post(new com.avito.android.str_seller_orders_calendar.strorderscalendar.d(strOrdersCalendarView, iK1, i12));
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info.l lVar = (com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info.l) this.f240268c;
                com.avito.android.lib.design.tooltip.k kVar2 = lVar.f290958g;
                if (kVar2 != null) {
                    kVar2.dismiss();
                }
                lVar.f290958g = null;
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.suggest_institutes_bottom_sheet.ui.c) this.f240268c).f292099d.v();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                C35976x4.b((RecyclerView) this.f240268c);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                UniversalMapFragment universalMapFragment = (UniversalMapFragment) this.f240268c;
                Button button = universalMapFragment.f304854P0;
                if (button != null && (kVar = universalMapFragment.f304855Q0) != null) {
                    kVar.f(button);
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                com.avito.android.universal_map.map_mvi.point_filters.d dVar = (com.avito.android.universal_map.map_mvi.point_filters.d) this.f240268c;
                com.avito.android.lib.design.tooltip.k kVar3 = dVar.f306271w;
                if (kVar3 != null) {
                    kVar3.f(dVar.f306262n);
                    break;
                }
                break;
            default:
                b0.a.C9534a c9534a = (b0.a.C9534a) this.f240268c;
                if (c9534a.f312401a.isAttachedToWindow()) {
                    c9534a.f312401a.p(c9534a.f312403c.f180737b, 0.0f, true, true);
                    break;
                }
                break;
        }
    }
}
