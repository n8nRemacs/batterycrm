package com.avito.android.user_advert.advert;

import Ju.InterfaceC14249c;
import SK0.b;
import aL0.InterfaceC19789b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import bI0.InterfaceC25514b;
import com.avito.android.B2;
import com.avito.android.C30566f2;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.advert.InterfaceC27793e;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.analytics.event.auto_select.FromPage;
import com.avito.android.analytics.statsd.y;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.app_rater.events.AppRaterEventSourcePage;
import com.avito.android.auto_evidence_request_public.AutoEvidenceRequestDeepLink;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.cv_actualization_bottom_sheet_dialog.deeplink.JsxCvActualizationBottomSheetDeeplink;
import com.avito.android.cv_bottom_sheet_dialog.deeplink.JobCvBottomSheetLink;
import com.avito.android.deep_linking.ItemRatingsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.DraftPublicationLink;
import com.avito.android.deep_linking.links.InstallmentsOnboardingShowLink;
import com.avito.android.deep_linking.links.InterfaceC29688n;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deep_linking.links.O;
import com.avito.android.deep_linking.links.RefreshLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.entry_point_client_room.deeplink.SendReportDeepLink;
import com.avito.android.evidence_request_public.EvidenceRequestLink;
import com.avito.android.fees_methods.deeplink.FeesByPackageDeeplink;
import com.avito.android.fees_methods.deeplink.FeesMethodsV3DeepLink;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.job.cv_info_actualization.deeplink.JsxCvInfoActualizationDeeplink;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.paid_services.PaidServicesLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.AdvertSellerShortTermRent;
import com.avito.android.remote.model.CarMarketPrice;
import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.MyAdvertAutoSelect;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.model.MyAdvertSafeDealKt;
import com.avito.android.remote.model.ReservationMessageResult;
import com.avito.android.remote.model.Service;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.adverts.PremierPartner;
import com.avito.android.remote.model.adverts.PremierPartnerStatus;
import com.avito.android.remote.model.installments.InstallmentsPromoBlockData;
import com.avito.android.remote.model.installments.InstallmentsSwitcherData;
import com.avito.android.remote.model.my_advert.AppliedServicesInfo;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.str_calendar.deeplink.StrSellerCalendarLink;
import com.avito.android.str_core.toggle_booking.ToggleOnlineBookingDeepLink;
import com.avito.android.success_screen_after_apply.SuccessScreenAfterApplyDeeplink;
import com.avito.android.trx_promo_goods.deeplink.TrxPromoGoodsConfigureLink;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureLink;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.user_advert.AdvertActionTransferData;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertPostAction;
import com.avito.android.user_advert.advert.delegate.PresenterDelegateNotFoundException;
import com.avito.android.user_advert.advert.delegate.auto_publish.f;
import com.avito.android.user_advert.advert.delegate.auto_select_close.i;
import com.avito.android.user_advert.advert.delegate.deliverySettings.a;
import com.avito.android.user_advert.advert.delegate.description.b;
import com.avito.android.user_advert.advert.delegate.gallery.b;
import com.avito.android.user_advert.advert.delegate.installments.b;
import com.avito.android.user_advert.advert.delegate.job_select_dialog.b;
import com.avito.android.user_advert.advert.delegate.machinery_rental_banner.b;
import com.avito.android.user_advert.advert.delegate.multi_items.f;
import com.avito.android.user_advert.advert.delegate.multi_urgency.e;
import com.avito.android.user_advert.advert.delegate.multiaddress.b;
import com.avito.android.user_advert.advert.delegate.promo_block_feed.b;
import com.avito.android.user_advert.advert.delegate.realty_verification.b;
import com.avito.android.user_advert.advert.delegate.safe_deal_services.b;
import com.avito.android.user_advert.advert.delegate.safe_show.b;
import com.avito.android.user_advert.advert.delegate.service_booking.b;
import com.avito.android.user_advert.advert.delegate.short_term_rent.b;
import com.avito.android.user_advert.advert.delegate.user_advert_action.i;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import com.avito.android.user_advert.advert.items.installments_promoblock.a;
import com.avito.android.user_advert.advert.items.realty.entry_point_client_room.EntryPointToAccountOwnerItem;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import com.avito.android.user_advert.advert.s1;
import com.avito.android.user_advert.advert.t1;
import com.avito.android.user_advert.di.InterfaceC35536o;
import com.avito.android.user_advert.di.InterfaceC35537p;
import com.avito.android.user_advert.soa_with_price.SoaWithPriceArguments;
import com.avito.android.user_advert.soa_with_price.SoaWithPriceSheetDialogFragment;
import com.avito.android.user_adverts_common.ux_feedback.a;
import com.avito.android.util.C35974x2;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K5;
import com.avito.android.util.Kundle;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35896f0;
import com.avito.android.vas_performance.deeplink.PerformanceVasLink;
import dI0.InterfaceC39586b;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import fI0.C40296a;
import fI0.C40297b;
import gH0.AbstractC40584b;
import gH0.InterfaceC40583a;
import gj.InterfaceC40691b;
import hH0.InterfaceC40824a;
import hc.C40912b;
import i90.InterfaceC41254b;
import iH0.InterfaceC41288a;
import iI0.C41292B;
import iI0.C41293C;
import iI0.C41295E;
import iI0.C41305j;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.io.Serializable;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kH0.AbstractC42582a;
import kI0.InterfaceC42585a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.internal.C43238h;
import kv.C43501a;
import l41.InterfaceC43543a;
import lD.C43617a;
import lH0.InterfaceC43637a;
import lH0.b;
import mH0.AbstractC43967b;
import mH0.InterfaceC43966a;
import nC.InterfaceC44228a;
import nI0.InterfaceC44261b;
import nM.InterfaceC44291a;
import oO.f;
import oz.InterfaceC44959a;
import qH0.InterfaceC47296a;
import qH0.InterfaceC47297b;
import tH0.InterfaceC48556a;
import tz.InterfaceC48743a;
import uH0.InterfaceC48899a;
import vH0.InterfaceC49213a;
import wH0.InterfaceC49511a;
import yc.C50213a;

/* compiled from: MyAdvertDetailsPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/m0;", "Lcom/avito/android/user_advert/advert/j0;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35435m0 implements InterfaceC35426j0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39586b f310431A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final XH0.b f310432B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f310433C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final B2 f310434D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44228a f310435E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final C43617a f310436F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44291a f310437G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final C35398i0 f310438H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f310439I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19789b f310440J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Yo.w f310441K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Z0 f310442L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f310443M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48743a f310444N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44959a f310445O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notifications_permission_messenger.b f310446P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C30566f2 f310447Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final iI0.t f310448R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C40297b f310449S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final TH0.a f310450T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ab_tests.f0 f310451U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_advert.advert.faq.a f310452V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_advert.advert.faq.e f310453W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f310454X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final RH0.b f310455Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final v1 f310456Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35449s f310457a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public AbstractC35385e f310458b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC9795a f310459b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f310460c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f310461c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f310462d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public C35436m1 f310463d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f310464e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsItem f310465e0;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f310466f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.l
    public String f310467f0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f310468g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f310469g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f310470h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f310471h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35461y f310472i;

    /* renamed from: i0, reason: collision with root package name */
    public int f310473i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final M f310474j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f310475j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final S f310476k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f310477k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final I1 f310478l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public String f310479l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f310480m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f310481m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C50213a f310482n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f310483n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f310484o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f310485o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42585a f310486p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f310487p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.charity.a f310488q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f310489q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts_common.safety.b f310490r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f310491r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f310492s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final AK0.l f310493t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_persistence.b f310494u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Set<AbstractC40291a> f310495v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41254b f310496w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final VH0.b f310497x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25514b f310498y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final ZH0.b f310499z;

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$a */
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            T next;
            T next2;
            MyAdvertDetailsActivity myAdvertDetailsActivity;
            C35436m1 c35436m1;
            C35436m1 c35436m12;
            C43501a c43501a = (C43501a) obj;
            Object obj2 = c43501a.f413261b;
            boolean z12 = obj2 instanceof EvidenceRequestLink.b.C4379b;
            C35435m0 c35435m0 = C35435m0.this;
            if (z12) {
                InterfaceC35426j0.a.a(c35435m0, false, null, 7);
                String str = ((EvidenceRequestLink.b.C4379b) obj2).f149215b;
                if (str == null || (c35436m12 = c35435m0.f310463d0) == null) {
                    return;
                }
                c35436m12.f(str);
                return;
            }
            if (obj2 instanceof AutoEvidenceRequestDeepLink.b.C2825b) {
                InterfaceC35426j0.a.a(c35435m0, false, null, 7);
                String str2 = ((AutoEvidenceRequestDeepLink.b.C2825b) obj2).f95290b;
                if (str2 == null || (c35436m1 = c35435m0.f310463d0) == null) {
                    return;
                }
                c35436m1.g(com.avito.android.printable_text.b.f(str2));
                return;
            }
            if (obj2 instanceof MyAdvertLink.Edit.Result.Success) {
                MyAdvertLink.Edit.Result.Success success = (MyAdvertLink.Edit.Result.Success) obj2;
                C35435m0.e(c35435m0, success.f133495b, success.f133496c, success.f133497d);
                return;
            }
            if (obj2 instanceof SuccessScreenAfterApplyDeeplink.b.C8830b) {
                c35435m0.w9(((SuccessScreenAfterApplyDeeplink.b.C8830b) obj2).f291696b);
                return;
            }
            if (obj2 instanceof SuccessScreenAfterApplyDeeplink.b.a) {
                DeepLink deepLink = ((SuccessScreenAfterApplyDeeplink.b.a) obj2).f291695b;
                if (deepLink == null || (myAdvertDetailsActivity = c35435m0.f310461c0) == null) {
                    return;
                }
                myAdvertDetailsActivity.a(deepLink);
                return;
            }
            if (obj2 instanceof DraftPublicationLink.b.C3997b) {
                DraftPublicationLink.b.C3997b c3997b = (DraftPublicationLink.b.C3997b) obj2;
                C35435m0.e(c35435m0, c3997b.f133292b, c3997b.f133293c, c3997b.f133294d);
                return;
            }
            if (obj2 instanceof InterfaceC29688n.b) {
                C40297b c40297b = c35435m0.f310449S;
                C30566f2 c30566f2 = c40297b.f395807b;
                c30566f2.getClass();
                kotlin.reflect.n<Object> nVar = C30566f2.f155067o[9];
                if (((Boolean) c30566f2.f155077k.a().invoke()).booleanValue()) {
                    b.a.a(c40297b.f395806a, new C40296a(), null, null, null, 14);
                    return;
                }
                return;
            }
            boolean z13 = obj2 instanceof PaidServicesLink.a.b;
            com.avito.android.deeplink_handler.handler.bundle.a aVar = c43501a.f413260a;
            if (z13) {
                DeepLink deepLink2 = aVar.f134520a;
                if (deepLink2 instanceof FeesMethodsV3DeepLink ? true : deepLink2 instanceof FeesByPackageDeeplink) {
                    InterfaceC35426j0.a.a(c35435m0, false, InterfaceC35426j0.b.a.f310419a, 5);
                    c35435m0.f310473i0 = 7;
                    return;
                } else if (deepLink2 instanceof PerformanceVasLink) {
                    InterfaceC35426j0.a.a(c35435m0, false, InterfaceC35426j0.b.d.f310422a, 5);
                    c35435m0.f310473i0 = 7;
                    return;
                } else {
                    if (deepLink2 instanceof TrxPromoConfigureLink ? true : deepLink2 instanceof TrxPromoGoodsConfigureLink) {
                        InterfaceC35426j0.a.a(c35435m0, false, InterfaceC35426j0.b.C9510b.f310420a, 5);
                        c35435m0.f310473i0 = 7;
                        return;
                    }
                    return;
                }
            }
            if (obj2 instanceof StrSellerCalendarLink.b.C8587b) {
                InterfaceC35426j0.a.a(c35435m0, false, null, 7);
                return;
            }
            if (obj2 instanceof InstallmentsOnboardingShowLink.b) {
                c35435m0.v();
                return;
            }
            if (obj2 instanceof JobCvBottomSheetLink.b.a) {
                MyAdvertDetailsActivity myAdvertDetailsActivity2 = c35435m0.f310461c0;
                if (myAdvertDetailsActivity2 != null) {
                    String str3 = ((JobCvBottomSheetLink.b.a) obj2).f131582b;
                    Bt.c cVar = myAdvertDetailsActivity2.f308331s0;
                    (cVar != null ? cVar : null).a(new G(myAdvertDetailsActivity2), new H(myAdvertDetailsActivity2, str3), myAdvertDetailsActivity2);
                    return;
                }
                return;
            }
            if (obj2 instanceof O.b) {
                InterfaceC35426j0.a.a(c35435m0, false, null, 7);
                return;
            }
            if (obj2 instanceof JsxCvActualizationBottomSheetDeeplink.b) {
                JsxCvActualizationBottomSheetDeeplink.b bVar = (JsxCvActualizationBottomSheetDeeplink.b) obj2;
                c35435m0.getClass();
                if (!(bVar instanceof JsxCvActualizationBottomSheetDeeplink.b.c)) {
                    MyAdvertDetailsActivity myAdvertDetailsActivity3 = c35435m0.f310461c0;
                    if (myAdvertDetailsActivity3 != null) {
                        C35436m1 c35436m13 = myAdvertDetailsActivity3.f308279H0;
                        if (c35436m13 == null) {
                            c35436m13 = null;
                        }
                        c35436m13.d(null, myAdvertDetailsActivity3.getString(R.string.bottom_sheet_cv_actualization_error));
                        return;
                    }
                    return;
                }
                DeepLink deepLink3 = ((JsxCvActualizationBottomSheetDeeplink.b.c) bVar).f131569b;
                if (deepLink3 == null) {
                    return;
                }
                Iterator<T> it = c35435m0.f310495v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = (T) null;
                        break;
                    } else {
                        next2 = it.next();
                        if (next2 instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a) {
                            break;
                        }
                    }
                }
                com.avito.android.user_advert.advert.delegate.user_advert_action.a aVar2 = (com.avito.android.user_advert.advert.delegate.user_advert_action.a) (next2 instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a ? next2 : null);
                if (aVar2 == null) {
                    throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.user_advert_action.a.class);
                }
                aVar2.v(deepLink3, c35435m0.f310465e0, true);
                return;
            }
            if (obj2 instanceof ToggleOnlineBookingDeepLink.c.b) {
                InterfaceC35426j0.a.a(c35435m0, false, null, 7);
                return;
            }
            if (obj2 instanceof JsxCvInfoActualizationDeeplink.b) {
                JsxCvInfoActualizationDeeplink.b bVar2 = (JsxCvInfoActualizationDeeplink.b) obj2;
                c35435m0.getClass();
                if (!(bVar2 instanceof JsxCvInfoActualizationDeeplink.b.C5126b)) {
                    kotlin.jvm.internal.L.f(bVar2, JsxCvInfoActualizationDeeplink.b.a.f174026b);
                    return;
                }
                DeepLink deepLink4 = ((JsxCvInfoActualizationDeeplink.b.C5126b) bVar2).f174027b;
                if (deepLink4 == null) {
                    return;
                }
                Iterator<T> it2 = c35435m0.f310495v.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = (T) null;
                        break;
                    } else {
                        next = it2.next();
                        if (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a) {
                            break;
                        }
                    }
                }
                com.avito.android.user_advert.advert.delegate.user_advert_action.a aVar3 = (com.avito.android.user_advert.advert.delegate.user_advert_action.a) (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a ? next : null);
                if (aVar3 == null) {
                    throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.user_advert_action.a.class);
                }
                aVar3.v(deepLink4, c35435m0.f310465e0, true);
                return;
            }
            if (obj2 instanceof RefreshLink.c.a) {
                InterfaceC35426j0.a.a(c35435m0, false, null, 7);
                return;
            }
            if (obj2 instanceof SendReportDeepLink.b.C4315b) {
                C35436m1 c35436m14 = c35435m0.f310463d0;
                if (c35436m14 != null) {
                    c35436m14.g(com.avito.android.printable_text.b.f(((SendReportDeepLink.b.C4315b) obj2).f147630b));
                    return;
                }
                return;
            }
            boolean z14 = obj2 instanceof m.c;
            String str4 = aVar.f134521b;
            if (!z14) {
                if (obj2 instanceof m.a) {
                    if (kotlin.jvm.internal.L.f(str4, "portfolio_projects")) {
                        InterfaceC35426j0.a.a(c35435m0, false, null, 7);
                        return;
                    }
                    return;
                } else {
                    if (obj2 instanceof InterfaceC14249c.a) {
                        return;
                    }
                    boolean z15 = obj2 instanceof InterfaceC14249c.b;
                    return;
                }
            }
            if (kotlin.jvm.internal.L.f(str4, "portfolio_create")) {
                InterfaceC35426j0.a.a(c35435m0, false, null, 7);
                return;
            }
            if (kotlin.jvm.internal.L.f(str4, "faq_deeplink_request_key")) {
                c35435m0.f310453W.a();
                C35436m1 c35436m15 = c35435m0.f310463d0;
                if (c35436m15 != null) {
                    c35436m15.g(com.avito.android.printable_text.b.c(R.string.faq_saved_toast, new Serializable[0]));
                }
            }
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_ui/badge_score/b;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/rating_ui/badge_score/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$b */
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str;
            C35435m0 c35435m0 = C35435m0.this;
            c35435m0.getClass();
            DeepLink deepLink = ((com.avito.android.rating_ui.badge_score.b) obj).f249952a;
            ItemRatingsLink itemRatingsLink = deepLink instanceof ItemRatingsLink ? (ItemRatingsLink) deepLink : null;
            if (itemRatingsLink != null && (str = itemRatingsLink.f132847c) != null) {
                c35435m0.f310480m.c(new Uc.h(str, ReviewsOpenPageFrom.Item.f91256d, null, null, null, 28, null));
            }
            MyAdvertDetailsActivity myAdvertDetailsActivity = c35435m0.f310461c0;
            if (myAdvertDetailsActivity != null) {
                myAdvertDetailsActivity.a(deepLink);
            }
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWi/b$a;", "it", "Lkotlin/G0;", "accept", "(LWi/b$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$c */
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C35435m0.this.j0();
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.m0$d */
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[SimpleTestGroupWithNone.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SimpleTestGroupWithNone simpleTestGroupWithNone = SimpleTestGroupWithNone.f67969c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SimpleTestGroupWithNone simpleTestGroupWithNone2 = SimpleTestGroupWithNone.f67969c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$e */
    public static final class e<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35426j0.b f310504c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f310505d;

        public e(InterfaceC35426j0.b bVar, boolean z12) {
            this.f310504c = bVar;
            this.f310505d = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str;
            MyAdvertDetails myAdvertDetails = (MyAdvertDetails) obj;
            C35435m0 c35435m0 = C35435m0.this;
            c35435m0.f310486p.l();
            InterfaceC42585a interfaceC42585a = c35435m0.f310486p;
            interfaceC42585a.t();
            MyAdvertDetailsItem myAdvertDetailsItemA = c35435m0.f310474j.a(myAdvertDetails);
            c35435m0.f310465e0 = myAdvertDetailsItemA;
            c35435m0.f310439I.getF103564j().c("UserAdvertDetails_" + myAdvertDetailsItemA.f309129b);
            c35435m0.f(myAdvertDetailsItemA, this.f310504c, this.f310505d);
            c35435m0.u();
            MyAdvertDetails.PublishWarningBanner publishWarningBanner = myAdvertDetails.getPublishWarningBanner();
            String description = publishWarningBanner != null ? publishWarningBanner.getDescription() : null;
            String buttonTitle = publishWarningBanner != null ? publishWarningBanner.getButtonTitle() : null;
            if (description != null && buttonTitle != null) {
                MyAdvertDetailsItem myAdvertDetailsItem = c35435m0.f310465e0;
                if (myAdvertDetailsItem != null && (str = myAdvertDetailsItem.f309129b) != null) {
                    c35435m0.f310480m.c(new iI0.y(str));
                }
                MyAdvertDetailsActivity myAdvertDetailsActivity = c35435m0.f310461c0;
                if (myAdvertDetailsActivity != null) {
                    C35436m1 c35436m1 = myAdvertDetailsActivity.f308279H0;
                    C35436m1 c35436m12 = c35436m1 == null ? null : c35436m1;
                    InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
                    J j12 = new J(0, interfaceC35426j0 != null ? interfaceC35426j0 : null, InterfaceC35426j0.class, "onPublishWarningToastClosed", "onPublishWarningToastClosed()V", 0);
                    c35436m12.getClass();
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, c35436m12.f310546a, com.avito.android.printable_text.b.f(description), null, Collections.singletonList(new c.a.C3719a(buttonTitle, true, null, q1.f310584l, 4, null)), null, f.a.f125253a, -1, null, null, false, true, new s1.a(j12), null, 2506);
                }
            }
            c35435m0.f310457a0.M8(myAdvertDetails.getBannerFromSxBanners());
            interfaceC42585a.k();
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$f */
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            V2.f318762a.a("MyAdvertDetailsPresenter", "onInitialize", th2);
            C35435m0 c35435m0 = C35435m0.this;
            c35435m0.f310486p.n(th2);
            InterfaceC42585a interfaceC42585a = c35435m0.f310486p;
            interfaceC42585a.t();
            c35435m0.f310457a0.M8(null);
            C0 c02 = new C0(c35435m0, th2);
            if (K5.a(th2)) {
                c35435m0.f310487p0 = false;
                C35436m1 c35436m1 = c35435m0.f310463d0;
                if (c35436m1 != null) {
                    D6.H(c35436m1.f310561p);
                    c35436m1.f310562q.a("");
                }
                MyAdvertDetailsActivity myAdvertDetailsActivity = c35435m0.f310461c0;
                if (myAdvertDetailsActivity != null) {
                    myAdvertDetailsActivity.k2();
                }
            } else if (K5.f(th2)) {
                AbstractC35385e abstractC35385e = c35435m0.f310458b;
                if (abstractC35385e instanceof C35382d) {
                    MyAdvertDetailsActivity myAdvertDetailsActivity2 = c35435m0.f310461c0;
                    if (myAdvertDetailsActivity2 != null) {
                        String str = ((C35382d) abstractC35385e).f308519a;
                        InterfaceC27793e interfaceC27793e = myAdvertDetailsActivity2.f308334u;
                        if (interfaceC27793e == null) {
                            interfaceC27793e = null;
                        }
                        myAdvertDetailsActivity2.startActivity(interfaceC27793e.a(null, null));
                    }
                } else if (abstractC35385e instanceof C35388f) {
                    c02.invoke();
                }
            } else {
                c02.invoke();
            }
            interfaceC42585a.A(th2);
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "dialogShown", "Lkotlin/G0;", "apply", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$g */
    public static final class g<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CloseReason f310508c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f310509d;

        public g(CloseReason closeReason, String str) {
            this.f310508c = closeReason;
            this.f310509d = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                C35435m0.this.h(this.f310508c, this.f310509d);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "advertId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertParameters.Button f310511m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f310512n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AdvertParameters.Button button, String str) {
            super(1);
            this.f310511m = button;
            this.f310512n = str;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            Object next;
            String str2 = str;
            Iterator<T> it = C35435m0.this.f310495v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof InterfaceC47296a) {
                    break;
                }
            }
            InterfaceC47296a interfaceC47296a = (InterfaceC47296a) (next instanceof InterfaceC47296a ? next : null);
            if (interfaceC47296a == null) {
                throw new PresenterDelegateNotFoundException(InterfaceC47296a.class);
            }
            interfaceC47296a.w(this.f310511m, str2, this.f310512n);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MyAdvertDetailsItem f310514m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MyAdvertDetailsItem myAdvertDetailsItem) {
            super(0);
            this.f310514m = myAdvertDetailsItem;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
            DeepLink deepLink = this.f310514m.f309107N0;
            C35435m0 c35435m0 = C35435m0.this;
            if (!c35435m0.f310483n0 && deepLink != null) {
                C30566f2 c30566f2 = c35435m0.f310447Q;
                c30566f2.getClass();
                kotlin.reflect.n<Object> nVar = C30566f2.f155067o[1];
                if (((Boolean) c30566f2.f155069c.a().invoke()).booleanValue()) {
                    c35435m0.f310483n0 = true;
                    MyAdvertDetailsActivity myAdvertDetailsActivity = c35435m0.f310461c0;
                    if (myAdvertDetailsActivity != null) {
                        myAdvertDetailsActivity.a(deepLink);
                    }
                    return io.reactivex.rxjava3.core.I.q(Boolean.TRUE);
                }
            }
            return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MyAdvertDetailsItem f310516m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MyAdvertDetailsItem myAdvertDetailsItem) {
            super(0);
            this.f310516m = myAdvertDetailsItem;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
            C35435m0 c35435m0 = C35435m0.this;
            c35435m0.getClass();
            MyAdvertDetailsItem myAdvertDetailsItem = this.f310516m;
            if (kotlin.jvm.internal.L.f(myAdvertDetailsItem.f309100K, "active")) {
                B2 b22 = c35435m0.f310434D;
                b22.getClass();
                kotlin.reflect.n<Object> nVar = B2.f67184X[34];
                if (((Boolean) b22.f67191G.a().invoke()).booleanValue()) {
                    List<DeepLink> list = myAdvertDetailsItem.f309083B0;
                    List<DeepLink> list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
                        AbstractC43129d1 abstractC43129d1 = kotlinx.coroutines.internal.K.f411877a;
                        final C43238h c43238hA = kotlinx.coroutines.U.a(abstractC43129d1);
                        com.avito.android.user_adverts_common.ux_feedback.a aVarA = c35435m0.f310459b0.a(c43238hA);
                        aVarA.a(list);
                        return new C42017o(kotlinx.coroutines.rx3.Q.a(abstractC43129d1, new U0(aVarA, null)), new InterfaceC43543a() { // from class: com.avito.android.user_advert.advert.k0
                            @Override // l41.InterfaceC43543a
                            public final void run() {
                                kotlinx.coroutines.U.b(c43238hA, null);
                            }
                        }).u(new com.avito.android.analytics.clickstream.I(5));
                    }
                }
            }
            return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$k */
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T> f310517b = new k<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$l */
    public static final class l<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final l<T> f310518b = new l<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to show dialog", (Throwable) obj);
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$m */
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MyAdvertDetailsItem f310520m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35426j0.b f310521n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar) {
            super(0);
            this.f310520m = myAdvertDetailsItem;
            this.f310521n = bVar;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
            C35435m0 c35435m0 = C35435m0.this;
            c35435m0.getClass();
            MyAdvertDetailsItem myAdvertDetailsItem = this.f310520m;
            boolean zF2 = kotlin.jvm.internal.L.f(myAdvertDetailsItem.f309100K, "active");
            InterfaceC35426j0.b bVar = this.f310521n;
            return C35435m0.q(C35435m0.q(C35435m0.q(C35435m0.q(C35435m0.q((zF2 && c35435m0.n(bVar)) ? c35435m0.f310497x.a() : io.reactivex.rxjava3.core.I.q(Boolean.FALSE), new V0(c35435m0, myAdvertDetailsItem, bVar)), new W0(c35435m0, myAdvertDetailsItem, bVar)), new X0(c35435m0, myAdvertDetailsItem, bVar)), new Y0(c35435m0, myAdvertDetailsItem, bVar)), new Z0(c35435m0, myAdvertDetailsItem, bVar));
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$n */
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MyAdvertDetailsItem f310523m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35426j0.b f310524n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar) {
            super(0);
            this.f310523m = myAdvertDetailsItem;
            this.f310524n = bVar;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
            MyAdvertDetails.BuyoutPhone.BottomSheet bottomSheet;
            C35435m0 c35435m0 = C35435m0.this;
            c35435m0.getClass();
            MyAdvertDetails.BuyoutPhone buyoutPhone = this.f310523m.f309168u0;
            if (buyoutPhone == null || (bottomSheet = buyoutPhone.getBottomSheet()) == null) {
                return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
            }
            if (bottomSheet.getOnlyForNewItem() && !c35435m0.n(this.f310524n)) {
                return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
            }
            C35436m1 c35436m1 = c35435m0.f310463d0;
            if (c35436m1 != null) {
                c35436m1.a(bottomSheet.getActions());
            }
            return io.reactivex.rxjava3.core.I.q(Boolean.TRUE);
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$o */
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35426j0.b f310526m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC35426j0.b bVar) {
            super(0);
            this.f310526m = bVar;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
            C35435m0 c35435m0 = C35435m0.this;
            return !c35435m0.n(this.f310526m) ? io.reactivex.rxjava3.core.I.q(Boolean.FALSE) : c35435m0.f310446P.a().s(c35435m0.f310470h.e()).r(new R0(c35435m0));
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$p */
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MyAdvertDetailsItem f310528m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35426j0.b f310529n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar) {
            super(0);
            this.f310528m = myAdvertDetailsItem;
            this.f310529n = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.reactivex.rxjava3.core.I<java.lang.Boolean> invoke() {
            /*
                r9 = this;
                com.avito.android.user_advert.advert.m0 r0 = com.avito.android.user_advert.advert.C35435m0.this
                r0.getClass()
                com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem r1 = r9.f310528m
                java.util.List<com.avito.android.beduin_models.BeduinAction> r1 = r1.f309170v0
                if (r1 != 0) goto L13
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                io.reactivex.rxjava3.internal.operators.single.M r0 = io.reactivex.rxjava3.core.I.q(r0)
                goto L87
            L13:
                com.avito.android.user_advert.advert.j0$b r2 = r9.f310529n
                boolean r3 = r2 instanceof com.avito.android.user_advert.advert.InterfaceC35426j0.b.c
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L38
                r6 = r2
                com.avito.android.user_advert.advert.j0$b$c r6 = (com.avito.android.user_advert.advert.InterfaceC35426j0.b.c) r6
                com.avito.android.deep_linking.links.DeepLink r6 = r6.f310421a
                if (r6 != 0) goto L24
            L22:
                r6 = r5
                goto L34
            L24:
                boolean r7 = r6 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
                if (r7 == 0) goto L2a
                r6 = r4
                goto L34
            L2a:
                boolean r7 = r6 instanceof com.avito.android.deep_linking.links.ConditionChainLink
                if (r7 == 0) goto L22
                com.avito.android.deep_linking.links.ConditionChainLink r6 = (com.avito.android.deep_linking.links.ConditionChainLink) r6
                com.avito.android.deep_linking.links.DeepLink r6 = r6.f133112b
                boolean r6 = r6 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
            L34:
                if (r6 == 0) goto L38
                r6 = r4
                goto L39
            L38:
                r6 = r5
            L39:
                if (r3 == 0) goto L58
                r3 = r2
                com.avito.android.user_advert.advert.j0$b$c r3 = (com.avito.android.user_advert.advert.InterfaceC35426j0.b.c) r3
                com.avito.android.deep_linking.links.DeepLink r3 = r3.f310421a
                if (r3 != 0) goto L44
            L42:
                r3 = r5
                goto L54
            L44:
                boolean r7 = r3 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
                if (r7 == 0) goto L4a
                r3 = r4
                goto L54
            L4a:
                boolean r7 = r3 instanceof com.avito.android.deep_linking.links.ConditionChainLink
                if (r7 == 0) goto L42
                com.avito.android.deep_linking.links.ConditionChainLink r3 = (com.avito.android.deep_linking.links.ConditionChainLink) r3
                com.avito.android.deep_linking.links.DeepLink r3 = r3.f133112b
                boolean r3 = r3 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
            L54:
                if (r3 != 0) goto L58
                r3 = r4
                goto L59
            L58:
                r3 = r5
            L59:
                boolean r7 = r2 instanceof com.avito.android.user_advert.advert.InterfaceC35426j0.b.a
                boolean r8 = r0.n(r2)
                if (r7 != 0) goto L65
                if (r6 == 0) goto L64
                goto L65
            L64:
                r4 = r5
            L65:
                com.avito.android.user_advert.advert.j0$b$d r5 = com.avito.android.user_advert.advert.InterfaceC35426j0.b.d.f310422a
                boolean r2 = kotlin.jvm.internal.L.f(r2, r5)
                if (r8 != 0) goto L71
                if (r4 != 0) goto L71
                if (r2 == 0) goto L73
            L71:
                if (r3 == 0) goto L7a
            L73:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                io.reactivex.rxjava3.internal.operators.single.M r0 = io.reactivex.rxjava3.core.I.q(r0)
                goto L87
            L7a:
                com.avito.android.user_advert.advert.m1 r0 = r0.f310463d0
                if (r0 == 0) goto L81
                r0.a(r1)
            L81:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                io.reactivex.rxjava3.internal.operators.single.M r0 = io.reactivex.rxjava3.core.I.q(r0)
            L87:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.C35435m0.p.invoke():java.lang.Object");
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$q */
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MyAdvertDetailsItem f310531m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35426j0.b f310532n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar) {
            super(0);
            this.f310531m = myAdvertDetailsItem;
            this.f310532n = bVar;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
            C35435m0 c35435m0 = C35435m0.this;
            if (!c35435m0.n(this.f310532n)) {
                return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
            }
            MyAdvertDetailsItem myAdvertDetailsItem = this.f310531m;
            if (!myAdvertDetailsItem.f309169v) {
                return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
            }
            String id2 = CategoryIds.PERSONAL_BELONGINGS.CLOTHES_SHOES_ACCESSORIES.getId();
            String str = myAdvertDetailsItem.f309139g;
            if (!kotlin.jvm.internal.L.f(str, id2) && !kotlin.jvm.internal.L.f(str, CategoryIds.PERSONAL_BELONGINGS.KIDS_CLOTHES_AND_SHOES.getId())) {
                return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
            }
            com.avito.android.ab_tests.f0 f0Var = c35435m0.f310451U;
            int iOrdinal = f0Var.a().f439742a.f439749b.ordinal();
            InterfaceC28373a interfaceC28373a = c35435m0.f310480m;
            if (iOrdinal == 0) {
                interfaceC28373a.c(new y.a("itemFaqSellers.none", 0L, 2, null));
            } else if (iOrdinal == 1) {
                interfaceC28373a.c(new y.a("itemFaqSellers.control", 0L, 2, null));
            } else if (iOrdinal == 2) {
                interfaceC28373a.c(new y.a("itemFaqSellers.test", 0L, 2, null));
            }
            if (!f0Var.a().f439742a.f439749b.a()) {
                return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
            }
            f0Var.a().b();
            SimpleTestGroupWithNone simpleTestGroupWithNone = f0Var.a().f439742a.f439749b;
            simpleTestGroupWithNone.getClass();
            if (simpleTestGroupWithNone == SimpleTestGroupWithNone.f67970d) {
                return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
            }
            b.a.a(c35435m0.f310454X, c35435m0.f310452V.a(myAdvertDetailsItem.f309129b, str), "faq_deeplink_request_key", null, 4);
            return io.reactivex.rxjava3.core.I.q(Boolean.TRUE);
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$r */
    public static final class r extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MyAdvertDetailsItem f310534m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35426j0.b f310535n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar) {
            super(0);
            this.f310534m = myAdvertDetailsItem;
            this.f310535n = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.reactivex.rxjava3.core.I<java.lang.Boolean> invoke() {
            /*
                r12 = this;
                com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem r0 = r12.f310534m
                java.lang.String r1 = r0.f309139g
                java.lang.String r0 = r0.f309100K
                com.avito.android.user_advert.advert.m0 r2 = com.avito.android.user_advert.advert.C35435m0.this
                r2.getClass()
                com.avito.android.user_advert.advert.j0$b r3 = r12.f310535n
                boolean r4 = r3 instanceof com.avito.android.user_advert.advert.InterfaceC35426j0.b.c
                r5 = 1
                r6 = 0
                if (r4 == 0) goto L30
                r7 = r3
                com.avito.android.user_advert.advert.j0$b$c r7 = (com.avito.android.user_advert.advert.InterfaceC35426j0.b.c) r7
                com.avito.android.deep_linking.links.DeepLink r7 = r7.f310421a
                if (r7 != 0) goto L1c
            L1a:
                r7 = r6
                goto L2c
            L1c:
                boolean r8 = r7 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
                if (r8 == 0) goto L22
                r7 = r5
                goto L2c
            L22:
                boolean r8 = r7 instanceof com.avito.android.deep_linking.links.ConditionChainLink
                if (r8 == 0) goto L1a
                com.avito.android.deep_linking.links.ConditionChainLink r7 = (com.avito.android.deep_linking.links.ConditionChainLink) r7
                com.avito.android.deep_linking.links.DeepLink r7 = r7.f133112b
                boolean r7 = r7 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
            L2c:
                if (r7 == 0) goto L30
                r7 = r5
                goto L31
            L30:
                r7 = r6
            L31:
                if (r4 == 0) goto L50
                r4 = r3
                com.avito.android.user_advert.advert.j0$b$c r4 = (com.avito.android.user_advert.advert.InterfaceC35426j0.b.c) r4
                com.avito.android.deep_linking.links.DeepLink r4 = r4.f310421a
                if (r4 != 0) goto L3c
            L3a:
                r4 = r6
                goto L4c
            L3c:
                boolean r8 = r4 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
                if (r8 == 0) goto L42
                r4 = r5
                goto L4c
            L42:
                boolean r8 = r4 instanceof com.avito.android.deep_linking.links.ConditionChainLink
                if (r8 == 0) goto L3a
                com.avito.android.deep_linking.links.ConditionChainLink r4 = (com.avito.android.deep_linking.links.ConditionChainLink) r4
                com.avito.android.deep_linking.links.DeepLink r4 = r4.f133112b
                boolean r4 = r4 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
            L4c:
                if (r4 != 0) goto L50
                r4 = r5
                goto L51
            L50:
                r4 = r6
            L51:
                boolean r3 = r3 instanceof com.avito.android.user_advert.advert.InterfaceC35426j0.b.a
                boolean r8 = r2.f310462d
                if (r3 != 0) goto L5b
                if (r7 == 0) goto L5a
                goto L5b
            L5a:
                r5 = r6
            L5b:
                if (r8 != 0) goto L5f
                if (r5 == 0) goto Lbb
            L5f:
                java.lang.String r3 = "active"
                boolean r0 = kotlin.jvm.internal.L.f(r0, r3)
                if (r0 == 0) goto Lbb
                if (r4 == 0) goto L6a
                goto Lbb
            L6a:
                if (r1 != 0) goto L73
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                io.reactivex.rxjava3.internal.operators.single.M r0 = io.reactivex.rxjava3.core.I.q(r0)
                goto Lc1
            L73:
                com.avito.android.account.E r0 = r2.f310492s
                java.lang.String r0 = r0.a()
                if (r0 != 0) goto L7d
                java.lang.String r0 = ""
            L7d:
                com.avito.android.user_adverts_common.safety.b r3 = r2.f310490r
                io.reactivex.rxjava3.internal.operators.maybe.d0 r5 = r3.a(r1, r0)
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
                com.avito.android.util.a5 r1 = r2.f310470h
                io.reactivex.rxjava3.core.H r9 = r1.c()
                java.lang.String r3 = "unit is null"
                java.util.Objects.requireNonNull(r8, r3)
                io.reactivex.rxjava3.internal.operators.maybe.l r3 = new io.reactivex.rxjava3.internal.operators.maybe.l
                r6 = 0
                r10 = 600(0x258, double:2.964E-321)
                long r6 = java.lang.Math.max(r6, r10)
                r4 = r3
                r4.<init>(r5, r6, r8, r9)
                io.reactivex.rxjava3.core.H r1 = r1.e()
                io.reactivex.rxjava3.internal.operators.maybe.c0 r1 = r3.k(r1)
                com.avito.android.user_advert.advert.S0 r3 = new com.avito.android.user_advert.advert.S0
                r3.<init>(r2, r0)
                io.reactivex.rxjava3.internal.operators.maybe.g0 r0 = r1.c(r3)
                io.reactivex.rxjava3.internal.operators.maybe.V r1 = new io.reactivex.rxjava3.internal.operators.maybe.V
                r1.<init>(r0)
                com.avito.android.user_advert.advert.T0<T, R> r0 = com.avito.android.user_advert.advert.T0.f308429b
                io.reactivex.rxjava3.internal.operators.single.O r0 = r1.r(r0)
                goto Lc1
            Lbb:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                io.reactivex.rxjava3.internal.operators.single.M r0 = io.reactivex.rxjava3.core.I.q(r0)
            Lc1:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.C35435m0.r.invoke():java.lang.Object");
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$s */
    public static final class s extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f310537m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(boolean z12) {
            super(0);
            this.f310537m = z12;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
            Fragment fragment;
            ActivityC22955m activityC22955mL1;
            boolean z12 = this.f310537m;
            C35435m0 c35435m0 = C35435m0.this;
            if (z12) {
                C35436m1 c35436m1 = c35435m0.f310463d0;
                if (c35436m1 != null && (fragment = (Fragment) C42745f0.S(c35436m1.f310547b.P())) != null && (activityC22955mL1 = fragment.l1()) != null) {
                    c35436m1.f310553h.a(activityC22955mL1, AppRaterEventSourcePage.f91794c);
                }
            } else {
                c35435m0.getClass();
            }
            return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$t */
    public static final class t extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MyAdvertDetailsItem f310539m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35426j0.b f310540n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar) {
            super(0);
            this.f310539m = myAdvertDetailsItem;
            this.f310540n = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.reactivex.rxjava3.core.I<java.lang.Boolean> invoke() {
            /*
                r7 = this;
                com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem r0 = r7.f310539m
                java.lang.String r1 = r0.f309129b
                java.lang.String r0 = r0.f309100K
                com.avito.android.user_advert.advert.m0 r2 = com.avito.android.user_advert.advert.C35435m0.this
                r2.getClass()
                com.avito.android.user_advert.advert.j0$b r3 = r7.f310540n
                boolean r4 = r3 instanceof com.avito.android.user_advert.advert.InterfaceC35426j0.b.c
                r5 = 0
                if (r4 == 0) goto L2e
                com.avito.android.user_advert.advert.j0$b$c r3 = (com.avito.android.user_advert.advert.InterfaceC35426j0.b.c) r3
                com.avito.android.deep_linking.links.DeepLink r3 = r3.f310421a
                r4 = 1
                if (r3 != 0) goto L1b
            L19:
                r3 = r5
                goto L2b
            L1b:
                boolean r6 = r3 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
                if (r6 == 0) goto L21
                r3 = r4
                goto L2b
            L21:
                boolean r6 = r3 instanceof com.avito.android.deep_linking.links.ConditionChainLink
                if (r6 == 0) goto L19
                com.avito.android.deep_linking.links.ConditionChainLink r3 = (com.avito.android.deep_linking.links.ConditionChainLink) r3
                com.avito.android.deep_linking.links.DeepLink r3 = r3.f133112b
                boolean r3 = r3 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
            L2b:
                if (r3 == 0) goto L2e
                r5 = r4
            L2e:
                boolean r3 = r2.f310462d
                if (r3 == 0) goto L64
                if (r5 != 0) goto L64
                java.lang.String r3 = "active"
                boolean r0 = kotlin.jvm.internal.L.f(r0, r3)
                if (r0 != 0) goto L3d
                goto L64
            L3d:
                com.avito.android.charity.CharitySource r0 = com.avito.android.charity.CharitySource.f118046c
                com.avito.android.charity.a r3 = r2.f310488q
                io.reactivex.rxjava3.internal.operators.maybe.h0 r0 = r3.a(r1, r0)
                com.avito.android.util.a5 r1 = r2.f310470h
                io.reactivex.rxjava3.core.H r1 = r1.e()
                io.reactivex.rxjava3.internal.operators.maybe.c0 r0 = r0.k(r1)
                com.avito.android.user_advert.advert.P0 r1 = new com.avito.android.user_advert.advert.P0
                r1.<init>(r2)
                io.reactivex.rxjava3.internal.operators.maybe.g0 r0 = r0.c(r1)
                io.reactivex.rxjava3.internal.operators.maybe.V r1 = new io.reactivex.rxjava3.internal.operators.maybe.V
                r1.<init>(r0)
                com.avito.android.user_advert.advert.Q0<T, R> r0 = com.avito.android.user_advert.advert.Q0.f308422b
                io.reactivex.rxjava3.internal.operators.single.O r0 = r1.r(r0)
                goto L6a
            L64:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                io.reactivex.rxjava3.internal.operators.single.M r0 = io.reactivex.rxjava3.core.I.q(r0)
            L6a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.C35435m0.t.invoke():java.lang.Object");
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.m0$u */
    public static final class u extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MyAdvertDetailsItem f310542m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35426j0.b f310543n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar) {
            super(0);
            this.f310542m = myAdvertDetailsItem;
            this.f310543n = bVar;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
            DeepLink deepLink = this.f310542m.f309091F0;
            C35435m0 c35435m0 = C35435m0.this;
            c35435m0.getClass();
            if (!(deepLink instanceof DetailsSheetLink) || !c35435m0.n(this.f310543n)) {
                return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
            }
            MyAdvertDetailsActivity myAdvertDetailsActivity = c35435m0.f310461c0;
            if (myAdvertDetailsActivity != null) {
                myAdvertDetailsActivity.a(deepLink);
            }
            return io.reactivex.rxjava3.core.I.q(Boolean.TRUE);
        }
    }

    @Inject
    public C35435m0(@Y61.k AbstractC35385e abstractC35385e, @Y61.l String str, @com.avito.android.user_advert.di.Z boolean z12, @InterfaceC35537p boolean z13, @InterfaceC35536o boolean z14, @com.avito.android.user_advert.di.X boolean z15, @com.avito.android.user_advert.di.a0 boolean z16, @com.avito.android.user_advert.di.Y boolean z17, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35461y interfaceC35461y, @Y61.k M m12, @Y61.k S s5, @Y61.k I1 i12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC42585a interfaceC42585a, @Y61.k com.avito.android.charity.a aVar, @Y61.k com.avito.android.user_adverts_common.safety.b bVar, @Y61.k com.avito.android.account.E e12, @Y61.k AK0.l lVar, @Y61.k com.avito.android.service_booking_persistence.b bVar2, @Y61.l @com.avito.android.user_advert.di.b0 String str2, @Y61.l Kundle kundle, @Y61.k Set<AbstractC40291a> set, @Y61.k InterfaceC41254b interfaceC41254b, @Y61.k VH0.b bVar3, @Y61.k InterfaceC25514b interfaceC25514b, @Y61.k ZH0.b bVar4, @Y61.k InterfaceC39586b interfaceC39586b, @Y61.k XH0.b bVar5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k io.reactivex.rxjava3.core.z<com.avito.android.rating_ui.badge_score.b> zVar, @Y61.k B2 b22, @Y61.k InterfaceC44228a interfaceC44228a, @Y61.k C43617a c43617a, @Y61.k InterfaceC44291a interfaceC44291a, @Y61.k C35398i0 c35398i0, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k InterfaceC19789b interfaceC19789b, @Y61.k Wi.b bVar6, @Y61.k Yo.w wVar, @Y61.k com.avito.android.Z0 z02, @Y61.k com.avito.android.clientEventBus.a aVar3, @Y61.k InterfaceC48743a interfaceC48743a, @Y61.k InterfaceC44959a interfaceC44959a, @Y61.k com.avito.android.notifications_permission_messenger.b bVar7, @Y61.k C30566f2 c30566f2, @Y61.k iI0.t tVar, @Y61.k C40297b c40297b, @Y61.k TH0.a aVar4, @Y61.k com.avito.android.ab_tests.f0 f0Var, @Y61.k com.avito.android.user_advert.advert.faq.a aVar5, @Y61.k com.avito.android.user_advert.advert.faq.e eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar6, @Y61.k RH0.b bVar8, @Y61.k v1 v1Var, @Y61.k InterfaceC35449s interfaceC35449s, @Y61.k a.InterfaceC9795a interfaceC9795a) {
        String strG;
        Boolean boolA;
        Integer numB;
        this.f310458b = abstractC35385e;
        this.f310460c = str;
        this.f310462d = z13;
        this.f310464e = z14;
        this.f310466f = z15;
        this.f310468g = z16;
        this.f310470h = interfaceC35745a5;
        this.f310472i = interfaceC35461y;
        this.f310474j = m12;
        this.f310476k = s5;
        this.f310478l = i12;
        this.f310480m = interfaceC28373a;
        this.f310482n = c50213a;
        this.f310484o = interfaceC35741a1;
        this.f310486p = interfaceC42585a;
        this.f310488q = aVar;
        this.f310490r = bVar;
        this.f310492s = e12;
        this.f310493t = lVar;
        this.f310494u = bVar2;
        this.f310495v = set;
        this.f310496w = interfaceC41254b;
        this.f310497x = bVar3;
        this.f310498y = interfaceC25514b;
        this.f310499z = bVar4;
        this.f310431A = interfaceC39586b;
        this.f310432B = bVar5;
        this.f310433C = aVar2;
        this.f310434D = b22;
        this.f310435E = interfaceC44228a;
        this.f310436F = c43617a;
        this.f310437G = interfaceC44291a;
        this.f310438H = c35398i0;
        this.f310439I = interfaceC40691b;
        this.f310440J = interfaceC19789b;
        this.f310441K = wVar;
        this.f310442L = z02;
        this.f310443M = aVar3;
        this.f310444N = interfaceC48743a;
        this.f310445O = interfaceC44959a;
        this.f310446P = bVar7;
        this.f310447Q = c30566f2;
        this.f310448R = tVar;
        this.f310449S = c40297b;
        this.f310450T = aVar4;
        this.f310451U = f0Var;
        this.f310452V = aVar5;
        this.f310453W = eVar;
        this.f310454X = aVar6;
        this.f310455Y = bVar8;
        this.f310456Z = v1Var;
        this.f310457a0 = interfaceC35449s;
        this.f310459b0 = interfaceC9795a;
        this.f310465e0 = c35398i0.f308949E;
        this.f310467f0 = kundle != null ? kundle.g("result_message") : null;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f310469g0 = cVar;
        this.f310473i0 = (kundle == null || (numB = kundle.b("parent_activity_result")) == null) ? 0 : numB.intValue();
        this.f310475j0 = z17;
        this.f310477k0 = (kundle == null || (boolA = kundle.a("show_activate_dialog")) == null) ? z12 : boolA.booleanValue();
        this.f310479l0 = (kundle == null || (strG = kundle.g("key_message")) == null) ? str2 : strG;
        this.f310481m0 = kundle != null ? kundle.f318647b.getBoolean("key_status_shown", false) : false;
        this.f310483n0 = kundle != null ? kundle.f318647b.getBoolean("key_sbc_onboarding_shown", false) : false;
        this.f310485o0 = true;
        this.f310487p0 = true;
        this.f310489q0 = C42784z0.f406748b;
        this.f310491r0 = new io.reactivex.rxjava3.disposables.c();
        cVar.b(aVar2.d9().t0(new a()));
        cVar.b(zVar.t0(new b()));
        cVar.b(bVar6.f18020b.t0(new c()));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.avito.android.user_advert.advert.C35435m0 r7, java.lang.String r8, com.avito.android.deep_linking.links.DeepLink r9, java.lang.String r10) {
        /*
            if (r8 == 0) goto L3a
            r7.getClass()
            int r0 = r8.length()
            if (r0 != 0) goto Lc
            goto L3a
        Lc:
            com.avito.android.user_advert.advert.e r0 = r7.f310458b
            boolean r1 = r0 instanceof com.avito.android.user_advert.advert.C35382d
            if (r1 == 0) goto L1d
            com.avito.android.user_advert.advert.d r0 = (com.avito.android.user_advert.advert.C35382d) r0
            java.lang.String r0 = r0.f308519a
            boolean r0 = kotlin.jvm.internal.L.f(r0, r8)
            if (r0 != 0) goto L3a
            goto L21
        L1d:
            boolean r9 = r0 instanceof com.avito.android.user_advert.advert.C35388f
            if (r9 == 0) goto L34
        L21:
            com.avito.android.user_advert.advert.MyAdvertDetailsActivity r9 = r7.f310461c0
            if (r9 == 0) goto L48
            com.avito.android.deep_linking.links.MyAdvertDetailsLink r6 = new com.avito.android.deep_linking.links.MyAdvertDetailsLink
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r9.a(r6)
            goto L48
        L34:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L3a:
            r8 = 9
            r7.f310473i0 = r8
            com.avito.android.user_advert.advert.j0$b$c r8 = new com.avito.android.user_advert.advert.j0$b$c
            r8.<init>(r9)
            r9 = 5
            r0 = 0
            com.avito.android.user_advert.advert.InterfaceC35426j0.a.a(r7, r0, r8, r9)
        L48:
            if (r10 == 0) goto L52
            com.avito.android.user_advert.advert.m1 r7 = r7.f310463d0
            if (r7 == 0) goto L55
            r7.f(r10)
            goto L55
        L52:
            r7.getClass()
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.C35435m0.e(com.avito.android.user_advert.advert.m0, java.lang.String, com.avito.android.deep_linking.links.DeepLink, java.lang.String):void");
    }

    public static void i(C35435m0 c35435m0, String str, boolean z12, String str2, DeepLink deepLink, int i12) {
        AdvertActionTransferData.Type type = AdvertActionTransferData.Type.f308190b;
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        boolean z13 = z12;
        String str3 = (i12 & 4) != 0 ? null : str2;
        if ((i12 & 8) != 0) {
            type = AdvertActionTransferData.Type.f308191c;
        }
        DeepLink deepLink2 = (i12 & 16) != 0 ? null : deepLink;
        MyAdvertDetailsActivity myAdvertDetailsActivity = c35435m0.f310461c0;
        if (myAdvertDetailsActivity != null) {
            int i13 = c35435m0.f310473i0;
            String str4 = c35435m0.f310467f0;
            MyAdvertDetailsItem myAdvertDetailsItem = c35435m0.f310465e0;
            myAdvertDetailsActivity.k0(i13, z13, str3, new AdvertActionTransferData(str, str4, myAdvertDetailsItem != null ? myAdvertDetailsItem.f309139g : null, type), deepLink2);
        }
    }

    public static C42026y q(io.reactivex.rxjava3.core.I i12, Y41.a aVar) {
        return i12.n(new N0(aVar));
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void B1(@Y61.k OH0.e eVar, boolean z12) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.short_term_rent.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.short_term_rent.a aVar = (com.avito.android.user_advert.advert.delegate.short_term_rent.a) (next instanceof com.avito.android.user_advert.advert.delegate.short_term_rent.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.short_term_rent.a.class);
        }
        aVar.B1(eVar, z12);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void F9(@Y61.k com.avito.android.user_advert.advert.items.realty.verification.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.realty_verification.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.realty_verification.a aVar2 = (com.avito.android.user_advert.advert.delegate.realty_verification.a) (next instanceof com.avito.android.user_advert.advert.delegate.realty_verification.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.realty_verification.a.class);
        }
        aVar2.L(aVar.f309950c);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void G1(@Y61.k DeepLink deepLink, @Y61.k String str) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.portfolio.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.portfolio.a aVar = (com.avito.android.user_advert.advert.delegate.portfolio.a) (next instanceof com.avito.android.user_advert.advert.delegate.portfolio.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.portfolio.a.class);
        }
        aVar.G1(deepLink, str);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void Hb(@Y61.k InterfaceC35426j0.b bVar) {
        this.f310473i0 = 9;
        InterfaceC35426j0.a.a(this, false, bVar, 1);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void I6(@Y61.k CloseReason closeReason, @Y61.l String str) {
        Object next;
        C43617a c43617a = this.f310436F;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[22];
        boolean zH2 = false;
        if (((Boolean) c43617a.f413632x.a().invoke()).booleanValue()) {
            Iterator<T> it = this.f310495v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next instanceof com.avito.android.user_advert.advert.delegate.auto_select_close.h) {
                        break;
                    }
                }
            }
            com.avito.android.user_advert.advert.delegate.auto_select_close.h hVar = (com.avito.android.user_advert.advert.delegate.auto_select_close.h) (next instanceof com.avito.android.user_advert.advert.delegate.auto_select_close.h ? next : null);
            if (hVar != null) {
                zH2 = hVar.H(closeReason, str);
            }
        }
        this.f310469g0.b(io.reactivex.rxjava3.core.I.q(Boolean.valueOf(zH2)).r(new g(closeReason, str)).x(io.reactivex.rxjava3.internal.functions.a.f401994d, io.reactivex.rxjava3.internal.functions.a.f401996f));
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void J1(@Y61.k com.avito.android.user_advert.advert.items.alert_banner.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC40824a) {
                    break;
                }
            }
        }
        InterfaceC40824a interfaceC40824a = (InterfaceC40824a) (next instanceof InterfaceC40824a ? next : null);
        if (interfaceC40824a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC40824a.class);
        }
        interfaceC40824a.J1(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void J2(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310461c0 = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void Jb(@Y61.k com.avito.android.user_advert.advert.items.stats.a aVar, @Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC49213a) {
                    break;
                }
            }
        }
        InterfaceC49213a interfaceC49213a = (InterfaceC49213a) (next instanceof InterfaceC49213a ? next : null);
        if (interfaceC49213a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC49213a.class);
        }
        interfaceC49213a.u(aVar, deepLink);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void K0(@Y61.k com.avito.android.user_advert.advert.items.alert_banner.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC40824a) {
                    break;
                }
            }
        }
        InterfaceC40824a interfaceC40824a = (InterfaceC40824a) (next instanceof InterfaceC40824a ? next : null);
        if (interfaceC40824a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC40824a.class);
        }
        interfaceC40824a.K0(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void L1(@Y61.k com.avito.android.user_advert.advert.items.auto_publish.a aVar, boolean z12) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.auto_publish.e) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.auto_publish.e eVar = (com.avito.android.user_advert.advert.delegate.auto_publish.e) (next instanceof com.avito.android.user_advert.advert.delegate.auto_publish.e ? next : null);
        if (eVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.auto_publish.e.class);
        }
        eVar.L1(aVar, z12);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void Nb(boolean z12) {
        Object next;
        Object next2;
        Iterator<T> it = this.f310489q0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.items.multi_urgency.c) {
                    break;
                }
            }
        }
        if (!(next instanceof com.avito.android.user_advert.advert.items.multi_urgency.c)) {
            next = null;
        }
        com.avito.android.user_advert.advert.items.multi_urgency.c cVar = (com.avito.android.user_advert.advert.items.multi_urgency.c) next;
        if (cVar != null) {
            Iterator<T> it2 = this.f310495v.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (next2 instanceof com.avito.android.user_advert.advert.delegate.multi_urgency.d) {
                        break;
                    }
                }
            }
            com.avito.android.user_advert.advert.delegate.multi_urgency.d dVar = (com.avito.android.user_advert.advert.delegate.multi_urgency.d) (next2 instanceof com.avito.android.user_advert.advert.delegate.multi_urgency.d ? next2 : null);
            if (dVar == null) {
                throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.multi_urgency.d.class);
            }
            dVar.b(cVar, z12);
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void O1(@Y61.k com.avito.android.user_advert.advert.items.services.a aVar, @Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.services.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.services.a aVar2 = (com.avito.android.user_advert.advert.delegate.services.a) (next instanceof com.avito.android.user_advert.advert.delegate.services.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.services.a.class);
        }
        aVar2.O1(aVar, deepLink);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void O7(@Y61.k com.avito.android.user_advert.advert.items.service_booking_reminder.c cVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.service_booking.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.service_booking.a aVar = (com.avito.android.user_advert.advert.delegate.service_booking.a) (next instanceof com.avito.android.user_advert.advert.delegate.service_booking.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.service_booking.a.class);
        }
        aVar.j(cVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void P0(@Y61.k com.avito.android.user_advert.advert.items.installments_promoblock.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.installments.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.installments.a aVar2 = (com.avito.android.user_advert.advert.delegate.installments.a) (next instanceof com.avito.android.user_advert.advert.delegate.installments.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.installments.a.class);
        }
        aVar2.P0(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void P1(@Y61.k c.b.a aVar, boolean z12) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.safe_deal_services.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.safe_deal_services.a aVar2 = (com.avito.android.user_advert.advert.delegate.safe_deal_services.a) (next instanceof com.avito.android.user_advert.advert.delegate.safe_deal_services.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.safe_deal_services.a.class);
        }
        aVar2.P1(aVar, z12);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void Qa(@Y61.k ActionsItem.Action action) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem != null) {
            Long lZ02 = C43066x.z0(myAdvertDetailsItem.f309129b);
            this.f310480m.c(new C41295E(lZ02 != null ? lZ02.longValue() : 0L, myAdvertDetailsItem.f309100K, action));
        }
        boolean z12 = action instanceof ActionsItem.a;
        Set<AbstractC40291a> set = this.f310495v;
        if (z12) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                } else {
                    next4 = it.next();
                    if (next4 instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a) {
                        break;
                    }
                }
            }
            com.avito.android.user_advert.advert.delegate.user_advert_action.a aVar = (com.avito.android.user_advert.advert.delegate.user_advert_action.a) (next4 instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a ? next4 : null);
            if (aVar == null) {
                throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.user_advert_action.a.class);
            }
            aVar.B((ActionsItem.a) action, this.f310465e0);
            return;
        }
        if (action instanceof ActionsItem.c) {
            Iterator<T> it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                } else {
                    next3 = it2.next();
                    if (next3 instanceof InterfaceC43966a) {
                        break;
                    }
                }
            }
            InterfaceC43966a interfaceC43966a = (InterfaceC43966a) (next3 instanceof InterfaceC43966a ? next3 : null);
            if (interfaceC43966a == null) {
                throw new PresenterDelegateNotFoundException(InterfaceC43966a.class);
            }
            interfaceC43966a.f((ActionsItem.c) action);
            return;
        }
        if (action instanceof ActionsItem.d) {
            Iterator<T> it3 = set.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    if (next2 instanceof InterfaceC49511a) {
                        break;
                    }
                }
            }
            InterfaceC49511a interfaceC49511a = (InterfaceC49511a) (next2 instanceof InterfaceC49511a ? next2 : null);
            if (interfaceC49511a == null) {
                throw new PresenterDelegateNotFoundException(InterfaceC49511a.class);
            }
            interfaceC49511a.M((ActionsItem.d) action);
            return;
        }
        if (action instanceof ActionsItem.b) {
            Iterator<T> it4 = set.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it4.next();
                    if (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a) {
                        break;
                    }
                }
            }
            if (!(next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a)) {
                next = null;
            }
            com.avito.android.user_advert.advert.delegate.user_advert_action.a aVar2 = (com.avito.android.user_advert.advert.delegate.user_advert_action.a) next;
            if (aVar2 == null) {
                throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.user_advert_action.a.class);
            }
            aVar2.v(((ActionsItem.b) action).f309015b, null, false);
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void R3(@Y61.k com.avito.android.user_advert.advert.items.machinery_rental_banner.e eVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a aVar = (com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a) (next instanceof com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a.class);
        }
        aVar.z(eVar.f309583c);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void S1(@Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC47296a) {
                    break;
                }
            }
        }
        InterfaceC47296a interfaceC47296a = (InterfaceC47296a) (next instanceof InterfaceC47296a ? next : null);
        if (interfaceC47296a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC47296a.class);
        }
        interfaceC47296a.S1(deepLink);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void T1(@Y61.k com.avito.android.user_advert.advert.items.auto_publish.a aVar, @Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.auto_publish.e) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.auto_publish.e eVar = (com.avito.android.user_advert.advert.delegate.auto_publish.e) (next instanceof com.avito.android.user_advert.advert.delegate.auto_publish.e ? next : null);
        if (eVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.auto_publish.e.class);
        }
        eVar.T1(aVar, deepLink);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void U0(@Y61.k com.avito.android.user_advert.advert.items.gallery.c cVar, int i12) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.gallery.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.gallery.a aVar = (com.avito.android.user_advert.advert.delegate.gallery.a) (next instanceof com.avito.android.user_advert.advert.delegate.gallery.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.gallery.a.class);
        }
        aVar.U0(cVar, i12);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void U1(@Y61.k com.avito.android.user_advert.advert.items.address.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC40583a) {
                    break;
                }
            }
        }
        InterfaceC40583a interfaceC40583a = (InterfaceC40583a) (next instanceof InterfaceC40583a ? next : null);
        if (interfaceC40583a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC40583a.class);
        }
        interfaceC40583a.U1(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    @Y61.k
    public final Kundle Ua() {
        Object next;
        Object next2;
        Object next3;
        MyAdvertDetails.DeliverySettings deliverySettings;
        Object next4;
        Kundle kundle;
        Kundle kundle2 = new Kundle();
        kundle2.i(Integer.valueOf(this.f310473i0), "parent_activity_result");
        kundle2.h(Boolean.valueOf(this.f310477k0), "show_activate_dialog");
        kundle2.m("result_message", this.f310467f0);
        kundle2.m("key_message", this.f310479l0);
        kundle2.h(Boolean.valueOf(this.f310481m0), "key_status_shown");
        kundle2.h(Boolean.valueOf(this.f310483n0), "key_sbc_onboarding_shown");
        Set<AbstractC40291a> set = this.f310495v;
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC43637a) {
                break;
            }
        }
        if (!(next instanceof InterfaceC43637a)) {
            next = null;
        }
        InterfaceC43637a interfaceC43637a = (InterfaceC43637a) next;
        if (interfaceC43637a != null) {
            kundle2.f318647b.putParcelable("imv_poll_state", interfaceC43637a.d0());
        }
        Iterator<T> it2 = set.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (next2 instanceof AbstractC42582a) {
                break;
            }
        }
        if (!(next2 instanceof AbstractC42582a)) {
            next2 = null;
        }
        AbstractC42582a abstractC42582a = (AbstractC42582a) next2;
        if (abstractC42582a != null && (kundle = abstractC42582a.f406221d) != null) {
            kundle.h(Boolean.valueOf(abstractC42582a.f406224g), "banner_was_tracked");
        }
        Iterator<T> it3 = set.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (next3 instanceof com.avito.android.user_advert.advert.delegate.multi_items.d) {
                break;
            }
        }
        if (!(next3 instanceof com.avito.android.user_advert.advert.delegate.multi_items.d)) {
            next3 = null;
        }
        com.avito.android.user_advert.advert.delegate.multi_items.d dVar = (com.avito.android.user_advert.advert.delegate.multi_items.d) next3;
        if (dVar != null) {
            kundle2.h(Boolean.valueOf(dVar.f308678e), "KEY_SHOULD_TRACK_MULTI_ITEMS_SHOWN");
        }
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem != null && (deliverySettings = myAdvertDetailsItem.f309099J0) != null) {
            Iterator<T> it4 = set.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it4.next();
                if (next4 instanceof com.avito.android.user_advert.advert.delegate.deliverySettings.b) {
                    break;
                }
            }
            com.avito.android.user_advert.advert.delegate.deliverySettings.b bVar = (com.avito.android.user_advert.advert.delegate.deliverySettings.b) (next4 instanceof com.avito.android.user_advert.advert.delegate.deliverySettings.b ? next4 : null);
            if (bVar != null) {
                bVar.I(this.f310489q0, deliverySettings);
            }
        }
        this.f310438H.f308949E = this.f310465e0;
        return kundle2;
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void V1(@Y61.k List<MultiAddressesItem> list) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.multiaddress.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.multiaddress.a aVar = (com.avito.android.user_advert.advert.delegate.multiaddress.a) (next instanceof com.avito.android.user_advert.advert.delegate.multiaddress.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.multiaddress.a.class);
        }
        aVar.V1(list);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void Vd(@Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.bbl.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.bbl.a aVar = (com.avito.android.user_advert.advert.delegate.bbl.a) (next instanceof com.avito.android.user_advert.advert.delegate.bbl.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.bbl.a.class);
        }
        aVar.q(deepLink);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void W0(@Y61.k OH0.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.short_term_rent.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.short_term_rent.a aVar2 = (com.avito.android.user_advert.advert.delegate.short_term_rent.a) (next instanceof com.avito.android.user_advert.advert.delegate.short_term_rent.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.short_term_rent.a.class);
        }
        aVar2.W0(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void W5(@Y61.k DeepLink deepLink) {
        Object next;
        Object next2;
        Iterator<T> it = this.f310489q0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.items.multi_urgency.c) {
                    break;
                }
            }
        }
        if (!(next instanceof com.avito.android.user_advert.advert.items.multi_urgency.c)) {
            next = null;
        }
        com.avito.android.user_advert.advert.items.multi_urgency.c cVar = (com.avito.android.user_advert.advert.items.multi_urgency.c) next;
        if (cVar != null) {
            Iterator<T> it2 = this.f310495v.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (next2 instanceof com.avito.android.user_advert.advert.delegate.multi_urgency.d) {
                        break;
                    }
                }
            }
            com.avito.android.user_advert.advert.delegate.multi_urgency.d dVar = (com.avito.android.user_advert.advert.delegate.multi_urgency.d) (next2 instanceof com.avito.android.user_advert.advert.delegate.multi_urgency.d ? next2 : null);
            if (dVar == null) {
                throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.multi_urgency.d.class);
            }
            dVar.P(cVar, deepLink);
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void X0(@Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.safe_deal_services.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.safe_deal_services.a aVar = (com.avito.android.user_advert.advert.delegate.safe_deal_services.a) (next instanceof com.avito.android.user_advert.advert.delegate.safe_deal_services.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.safe_deal_services.a.class);
        }
        aVar.X0(deepLink);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void X1(@Y61.k OH0.e eVar, @Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.short_term_rent.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.short_term_rent.a aVar = (com.avito.android.user_advert.advert.delegate.short_term_rent.a) (next instanceof com.avito.android.user_advert.advert.delegate.short_term_rent.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.short_term_rent.a.class);
        }
        aVar.X1(eVar, deepLink);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void X3() {
        i(this, null, false, null, null, 31);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void X4(@Y61.k DeepLink deepLink) {
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f310461c0;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.a(deepLink);
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void X5(@Y61.k com.avito.android.user_advert.advert.items.multi_urgency.l lVar) {
        Object next;
        Object next2;
        Iterator<T> it = this.f310489q0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.items.multi_urgency.c) {
                    break;
                }
            }
        }
        if (!(next instanceof com.avito.android.user_advert.advert.items.multi_urgency.c)) {
            next = null;
        }
        com.avito.android.user_advert.advert.items.multi_urgency.c cVar = (com.avito.android.user_advert.advert.items.multi_urgency.c) next;
        if (cVar != null) {
            Iterator<T> it2 = this.f310495v.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (next2 instanceof com.avito.android.user_advert.advert.delegate.multi_urgency.d) {
                        break;
                    }
                }
            }
            com.avito.android.user_advert.advert.delegate.multi_urgency.d dVar = (com.avito.android.user_advert.advert.delegate.multi_urgency.d) (next2 instanceof com.avito.android.user_advert.advert.delegate.multi_urgency.d ? next2 : null);
            if (dVar == null) {
                throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.multi_urgency.d.class);
            }
            dVar.K(cVar, lVar);
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void Yd() {
        Integer numValueOf;
        Object next;
        MyAdvertDetails.EntryPointToAccountOwnerBanner entryPointToAccountOwnerBanner;
        this.f310444N.b();
        Iterator<T> it = this.f310489q0.iterator();
        while (true) {
            numValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof EntryPointToAccountOwnerItem) {
                    break;
                }
            }
        }
        if (!(next instanceof EntryPointToAccountOwnerItem)) {
            next = null;
        }
        EntryPointToAccountOwnerItem entryPointToAccountOwnerItem = (EntryPointToAccountOwnerItem) next;
        if (entryPointToAccountOwnerItem != null) {
            r(entryPointToAccountOwnerItem);
        }
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        String str = myAdvertDetailsItem != null ? myAdvertDetailsItem.f309129b : null;
        if (myAdvertDetailsItem != null && (entryPointToAccountOwnerBanner = myAdvertDetailsItem.f309103L0) != null) {
            numValueOf = Integer.valueOf(entryPointToAccountOwnerBanner.getDealId());
        }
        if (str == null || numValueOf == null) {
            return;
        }
        this.f310445O.b(numValueOf.intValue(), str);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void Z1(@Y61.k com.avito.android.user_advert.advert.items.address.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC40583a) {
                    break;
                }
            }
        }
        InterfaceC40583a interfaceC40583a = (InterfaceC40583a) (next instanceof InterfaceC40583a ? next : null);
        if (interfaceC40583a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC40583a.class);
        }
        interfaceC40583a.Z1(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void Z8() {
        C35436m1 c35436m1;
        this.f310485o0 = true;
        if (!this.f310487p0 || (c35436m1 = this.f310463d0) == null) {
            return;
        }
        c35436m1.b();
    }

    @Override // com.avito.android.user_advert.advert.z1.a
    public final void a(int i12, int i13, int i14) {
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem == null) {
            return;
        }
        this.f310480m.c(new C41293C(myAdvertDetailsItem.f309129b, myAdvertDetailsItem.f309100K, i12, i13, i14));
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void a1(@Y61.k com.avito.android.user_advert.advert.items.description.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.description.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.description.a aVar2 = (com.avito.android.user_advert.advert.delegate.description.a) (next instanceof com.avito.android.user_advert.advert.delegate.description.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.description.a.class);
        }
        aVar2.a1(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void a2(@Y61.k com.avito.android.user_advert.advert.items.safe_show.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.safe_show.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.safe_show.a aVar2 = (com.avito.android.user_advert.advert.delegate.safe_show.a) (next instanceof com.avito.android.user_advert.advert.delegate.safe_show.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.safe_show.a.class);
        }
        aVar2.a2(aVar);
    }

    @Override // com.avito.android.user_advert.advert.z1.a
    public final void b(boolean z12) {
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem == null) {
            return;
        }
        this.f310480m.c(new C41292B(myAdvertDetailsItem.f309129b, myAdvertDetailsItem.f309100K, z12));
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void bb(@Y61.k com.avito.android.user_advert.advert.items.realty.verification.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.realty_verification.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.realty_verification.a aVar2 = (com.avito.android.user_advert.advert.delegate.realty_verification.a) (next instanceof com.avito.android.user_advert.advert.delegate.realty_verification.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.realty_verification.a.class);
        }
        aVar2.e(aVar);
    }

    @Override // com.avito.android.user_advert.advert.t1
    public final void c(@Y61.k InterfaceC35426j0.b bVar, boolean z12) {
        MyAdvertDetailsActivity myAdvertDetailsActivity;
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem == null) {
            return;
        }
        boolean zN2 = n(bVar);
        InterfaceC44291a interfaceC44291a = this.f310437G;
        boolean z13 = zN2 && interfaceC44291a.c();
        if (z13 && (myAdvertDetailsActivity = this.f310461c0) != null) {
            myAdvertDetailsActivity.a(interfaceC44291a.b());
        }
        this.f310469g0.b(q(q(q(q(q(q(q(q(q(q(q(io.reactivex.rxjava3.core.I.q(Boolean.valueOf(z13)), new m(myAdvertDetailsItem, bVar)), new n(myAdvertDetailsItem, bVar)), new o(bVar)), new p(myAdvertDetailsItem, bVar)), new q(myAdvertDetailsItem, bVar)), new r(myAdvertDetailsItem, bVar)), new s(z12)), new t(myAdvertDetailsItem, bVar)), new u(myAdvertDetailsItem, bVar)), new i(myAdvertDetailsItem)), new j(myAdvertDetailsItem)).x(k.f310517b, l.f310518b));
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void c0() {
        this.f310461c0 = null;
    }

    @Override // com.avito.android.user_advert.advert.items.support_automation.d.a
    public final void d(@Y61.k DeepLink deepLink) {
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f310461c0;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.a(deepLink);
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void d4(@Y61.k C35436m1 c35436m1) {
        this.f310463d0 = c35436m1;
        for (AbstractC40291a abstractC40291a : this.f310495v) {
            abstractC40291a.f395802c.b(abstractC40291a.f395801b.t0(new l41.g() { // from class: com.avito.android.user_advert.advert.l0
                @Override // l41.g
                public final void accept(Object obj) {
                    MyAdvertDetailsItem myAdvertDetailsItem;
                    String str;
                    String str2;
                    C35436m1 c35436m12;
                    Object next;
                    MyAdvertDetailsActivity myAdvertDetailsActivity;
                    C35436m1 c35436m13;
                    com.avito.android.user_advert.advert.items.installments_promoblock.a aVar;
                    InstallmentsPromoBlockData installmentsPromoBlockData;
                    C35436m1 c35436m14;
                    com.avito.android.user_advert.advert.items.auto_publish.a aVar2;
                    c.b.a aVar3;
                    MyAdvertSafeDeal myAdvertSafeDeal;
                    List<MyAdvertSafeDeal.Service> services;
                    List<MyAdvertSafeDeal.Service.Content.Switcher> listSwitchers;
                    AdvertSellerShortTermRent advertSellerShortTermRent;
                    AdvertSellerShortTermRent advertSellerShortTermRent2;
                    MyAdvertDetailsActivity myAdvertDetailsActivity2;
                    C35436m1 c35436m15;
                    C35436m1 c35436m16;
                    C35436m1 c35436m17;
                    InterfaceC40292b interfaceC40292b = (InterfaceC40292b) obj;
                    C35435m0 c35435m0 = this.f310427b;
                    c35435m0.getClass();
                    if (interfaceC40292b instanceof InterfaceC40292b.a) {
                        MyAdvertDetailsActivity myAdvertDetailsActivity3 = c35435m0.f310461c0;
                        if (myAdvertDetailsActivity3 != null) {
                            myAdvertDetailsActivity3.a(((InterfaceC40292b.a) interfaceC40292b).f395803a);
                            return;
                        }
                        return;
                    }
                    onlineBookingField = null;
                    AdvertSellerShortTermRent.Switcher onlineBookingField = null;
                    onlineBookingField = null;
                    AdvertSellerShortTermRent.Switcher onlineBookingField2 = null;
                    if (interfaceC40292b instanceof InterfaceC40292b.C11136b) {
                        MyAdvertDetailsActivity myAdvertDetailsActivity4 = c35435m0.f310461c0;
                        if (myAdvertDetailsActivity4 != null) {
                            Uri uri = ((InterfaceC40292b.C11136b) interfaceC40292b).f395804a;
                            InterfaceC35845m2 interfaceC35845m2 = myAdvertDetailsActivity4.f308328r;
                            if (interfaceC35845m2 == null) {
                                interfaceC35845m2 = null;
                            }
                            Intent intentU = interfaceC35845m2.u(uri, (6 & 2) == 0, (6 & 4) == 0);
                            C35974x2.d(intentU);
                            try {
                                myAdvertDetailsActivity4.startActivity(intentU);
                                return;
                            } catch (Exception unused) {
                                C35436m1 c35436m18 = myAdvertDetailsActivity4.f308279H0;
                                (c35436m18 != null ? c35436m18 : null).f(myAdvertDetailsActivity4.getString(R.string.no_application_installed_to_perform_this_action));
                                return;
                            }
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.i) {
                        com.avito.android.user_advert.advert.delegate.user_advert_action.i iVar = (com.avito.android.user_advert.advert.delegate.user_advert_action.i) interfaceC40292b;
                        if (iVar instanceof i.b) {
                            c35435m0.j(((i.b) iVar).f308864a);
                            return;
                        }
                        if (iVar instanceof i.c) {
                            c35435m0.p(((i.c) iVar).f308865a, c35435m0.f310475j0);
                            return;
                        }
                        if (iVar instanceof i.d) {
                            c35435m0.p(((i.d) iVar).f308866a, false);
                            return;
                        }
                        if (iVar instanceof i.l) {
                            ReservationMessageResult reservationMessageResult = ((i.l) iVar).f308880a;
                            c35435m0.f310473i0 = 9;
                            C35436m1 c35436m19 = c35435m0.f310463d0;
                            if (c35436m19 != null) {
                                String title = reservationMessageResult.getTitle();
                                String description = reservationMessageResult.getDescription();
                                if ((title != null && title.length() != 0) || (description != null && description.length() != 0)) {
                                    com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(c35436m19.f310558m, 0, 0, 6, null);
                                    kVar.f181224j = new r.d(new i.a(new b.a()));
                                    kVar.f181230p = 2000L;
                                    int i12 = kVar.f181229o;
                                    kVar.f181228n = -1;
                                    kVar.f181229o = i12;
                                    kVar.f181225k = false;
                                    com.avito.android.lib.design.tooltip.p.a(kVar, new r1(title, description));
                                    kVar.f(c35436m19.f310560o);
                                }
                            }
                            InterfaceC35426j0.a.b(c35435m0, InterfaceC35426j0.b.C9510b.f310420a, 2);
                            return;
                        }
                        if (iVar instanceof i.e) {
                            MyAdvertDetailsActivity myAdvertDetailsActivity5 = c35435m0.f310461c0;
                            if (myAdvertDetailsActivity5 != null) {
                                i.e eVar = (i.e) iVar;
                                String str3 = eVar.f308867a;
                                Fragment fragmentH = myAdvertDetailsActivity5.getSupportFragmentManager().H("SoaWithPriceDialog");
                                if (fragmentH == null || !fragmentH.isAdded()) {
                                    SoaWithPriceArguments soaWithPriceArguments = new SoaWithPriceArguments(eVar.f308868b, str3);
                                    SoaWithPriceSheetDialogFragment soaWithPriceSheetDialogFragment = new SoaWithPriceSheetDialogFragment();
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelable("arguments", soaWithPriceArguments);
                                    soaWithPriceSheetDialogFragment.setArguments(bundle);
                                    soaWithPriceSheetDialogFragment.show(myAdvertDetailsActivity5.getSupportFragmentManager(), "SoaWithPriceDialog");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (iVar instanceof i.f) {
                            c35435m0.j(((i.f) iVar).f308869a);
                            return;
                        }
                        if (iVar instanceof i.g) {
                            i.g gVar = (i.g) iVar;
                            c35435m0.f310467f0 = gVar.f308870a;
                            c35435m0.f310473i0 = 6;
                            K0 k02 = new K0(c35435m0, gVar.f308872c, gVar.f308871b, gVar.f308873d, gVar.f308875f);
                            String str4 = gVar.f308874e;
                            if (str4 == null || str4.length() == 0) {
                                k02.invoke();
                                return;
                            } else {
                                c35435m0.f310450T.a(str4, k02);
                                return;
                            }
                        }
                        if (iVar instanceof i.h) {
                            c35435m0.j(((i.h) iVar).f308876a);
                            return;
                        }
                        if (iVar instanceof i.C9481i) {
                            c35435m0.f310473i0 = 8;
                            String message = ((i.C9481i) iVar).f308877a.getMessage();
                            if (message != null && message.length() != 0 && (c35436m17 = c35435m0.f310463d0) != null) {
                                L5.b(c35436m17.f310558m, message, 0);
                            }
                            C35435m0.i(c35435m0, null, false, null, null, 8);
                            return;
                        }
                        if (iVar instanceof i.j) {
                            c35435m0.j(((i.j) iVar).f308878a);
                            return;
                        }
                        if (iVar instanceof i.k) {
                            c35435m0.f310473i0 = 8;
                            String str5 = ((i.k) iVar).f308879a;
                            if (str5 != null && str5.length() != 0 && (c35436m16 = c35435m0.f310463d0) != null) {
                                L5.b(c35436m16.f310558m, str5, 0);
                            }
                            C35435m0.i(c35435m0, null, false, null, null, 8);
                            return;
                        }
                        if (iVar instanceof i.m) {
                            c35435m0.j(((i.m) iVar).f308881a);
                            return;
                        }
                        if (iVar instanceof i.n) {
                            C35436m1 c35436m110 = c35435m0.f310463d0;
                            if (c35436m110 != null) {
                                c35436m110.c(com.avito.android.printable_text.b.f(((i.n) iVar).f308882a));
                                return;
                            }
                            return;
                        }
                        if (!(iVar instanceof i.o)) {
                            boolean z12 = iVar instanceof i.a;
                            return;
                        }
                        c35435m0.f310473i0 = 10;
                        String str6 = ((i.o) iVar).f308883a;
                        if (str6 != null && str6.length() != 0 && (c35436m15 = c35435m0.f310463d0) != null) {
                            L5.b(c35436m15.f310558m, str6, 0);
                        }
                        C35435m0.i(c35435m0, null, false, null, null, 31);
                        MyAdvertDetailsActivity myAdvertDetailsActivity6 = c35435m0.f310461c0;
                        if (myAdvertDetailsActivity6 != null) {
                            Intent intent = myAdvertDetailsActivity6.getIntent();
                            intent.removeExtra("key_extra_action");
                            myAdvertDetailsActivity6.startActivity(intent);
                            return;
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.gallery.b) {
                        com.avito.android.user_advert.advert.delegate.gallery.b bVar = (com.avito.android.user_advert.advert.delegate.gallery.b) interfaceC40292b;
                        if (!(bVar instanceof b.a)) {
                            if (bVar instanceof b.C9466b) {
                                c35435m0.s(((b.C9466b) bVar).f308591a);
                                return;
                            }
                            return;
                        } else {
                            MyAdvertDetailsActivity myAdvertDetailsActivity7 = c35435m0.f310461c0;
                            if (myAdvertDetailsActivity7 != null) {
                                b.a aVar4 = (b.a) bVar;
                                com.avito.android.user_advert.advert.items.gallery.c cVar = aVar4.f308589a;
                                myAdvertDetailsActivity7.f308291N0.b(new com.avito.android.user_advert.advert.request_launcher.e(cVar.f309414f, cVar.f309415g, cVar.f309413e, aVar4.f308590b, cVar.f309416h));
                                return;
                            }
                            return;
                        }
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.verification.a) {
                        com.avito.android.user_advert.advert.delegate.verification.a aVar5 = (com.avito.android.user_advert.advert.delegate.verification.a) interfaceC40292b;
                        MyAdvertDetailsActivity myAdvertDetailsActivity8 = c35435m0.f310461c0;
                        if (myAdvertDetailsActivity8 != null) {
                            aVar5.getClass();
                            String strSubstring = new URL("https://support.avito.ru/request/341").getPath().substring(1);
                            InterfaceC30751h interfaceC30751h = myAdvertDetailsActivity8.f308338w;
                            myAdvertDetailsActivity8.startActivity((interfaceC30751h != null ? interfaceC30751h : null).a(strSubstring));
                            return;
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof AbstractC40584b) {
                        AbstractC40584b abstractC40584b = (AbstractC40584b) interfaceC40292b;
                        if (abstractC40584b instanceof AbstractC40584b.a) {
                            C35436m1 c35436m111 = c35435m0.f310463d0;
                            if (c35436m111 != null) {
                                Context context = c35436m111.f310558m;
                                L5.b(context, context.getResources().getString(R.string.advert_core_address_is_copied), 0);
                                return;
                            }
                            return;
                        }
                        if (!(abstractC40584b instanceof AbstractC40584b.C11202b) || (myAdvertDetailsActivity2 = c35435m0.f310461c0) == null) {
                            return;
                        }
                        AbstractC40584b.C11202b c11202b = (AbstractC40584b.C11202b) abstractC40584b;
                        String str7 = c11202b.f396418e;
                        oO.f fVar = myAdvertDetailsActivity2.f308330s;
                        if (fVar == null) {
                            fVar = null;
                        }
                        FindLocationPage findLocationPage = FindLocationPage.f181725c;
                        myAdvertDetailsActivity2.startActivity(f.a.a(fVar, c11202b.f396416c, true, null, null, null, c11202b.f396414a, null, c11202b.f396417d, c11202b.f396415b, null, str7, null, null, true, null, null, null, null, null, false, null, false, false, 134063288));
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.short_term_rent.b) {
                        com.avito.android.user_advert.advert.delegate.short_term_rent.b bVar2 = (com.avito.android.user_advert.advert.delegate.short_term_rent.b) interfaceC40292b;
                        if (bVar2 instanceof b.a) {
                            b.a aVar6 = (b.a) bVar2;
                            c35435m0.s(aVar6.f308818a);
                            MyAdvertDetailsItem myAdvertDetailsItem2 = c35435m0.f310465e0;
                            if (myAdvertDetailsItem2 != null && (advertSellerShortTermRent2 = myAdvertDetailsItem2.f309126Y) != null) {
                                onlineBookingField = advertSellerShortTermRent2.getOnlineBookingField();
                            }
                            if (onlineBookingField == null) {
                                return;
                            }
                            onlineBookingField.setEnabled(aVar6.f308818a.f12165e);
                            return;
                        }
                        if (bVar2 instanceof b.C9478b) {
                            C35436m1 c35436m112 = c35435m0.f310463d0;
                            if (c35436m112 != null) {
                                b.C9478b c9478b = (b.C9478b) bVar2;
                                c35436m112.d(c9478b.f308821c, c9478b.f308820b);
                            }
                            b.C9478b c9478b2 = (b.C9478b) bVar2;
                            c35435m0.s(c9478b2.f308819a);
                            MyAdvertDetailsItem myAdvertDetailsItem3 = c35435m0.f310465e0;
                            if (myAdvertDetailsItem3 != null && (advertSellerShortTermRent = myAdvertDetailsItem3.f309126Y) != null) {
                                onlineBookingField2 = advertSellerShortTermRent.getOnlineBookingField();
                            }
                            if (onlineBookingField2 == null) {
                                return;
                            }
                            onlineBookingField2.setEnabled(c9478b2.f308819a.f12165e);
                            return;
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.safe_deal_services.b) {
                        com.avito.android.user_advert.advert.delegate.safe_deal_services.b bVar3 = (com.avito.android.user_advert.advert.delegate.safe_deal_services.b) interfaceC40292b;
                        if (bVar3 instanceof b.a) {
                            b.a aVar7 = (b.a) bVar3;
                            aVar3 = aVar7.f308798a;
                            c35435m0.s(aVar3);
                            c.b.a aVar8 = aVar7.f308798a;
                            if (!aVar8.f310042j && aVar8.f310043k) {
                                c35435m0.v();
                            }
                        } else {
                            if (!(bVar3 instanceof b.C9477b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b.C9477b c9477b = (b.C9477b) bVar3;
                            aVar3 = c9477b.f308799a;
                            c35435m0.s(aVar3);
                            C35436m1 c35436m113 = c35435m0.f310463d0;
                            if (c35436m113 != null) {
                                c35436m113.f(c9477b.f308800b);
                            }
                        }
                        MyAdvertDetailsItem myAdvertDetailsItem4 = c35435m0.f310465e0;
                        if (myAdvertDetailsItem4 == null || (myAdvertSafeDeal = myAdvertDetailsItem4.f309138f0) == null || (services = myAdvertSafeDeal.getServices()) == null || (listSwitchers = MyAdvertSafeDealKt.switchers(services)) == null) {
                            return;
                        }
                        for (MyAdvertSafeDeal.Service.Content.Switcher switcher : listSwitchers) {
                            if (kotlin.jvm.internal.L.f(switcher.getId(), aVar3.f310040h)) {
                                switcher.setSwitchOn(Boolean.valueOf(aVar3.f310041i));
                            }
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.auto_publish.f) {
                        com.avito.android.user_advert.advert.delegate.auto_publish.f fVar2 = (com.avito.android.user_advert.advert.delegate.auto_publish.f) interfaceC40292b;
                        if (fVar2 instanceof f.a) {
                            aVar2 = ((f.a) fVar2).f308526a;
                            c35435m0.s(aVar2);
                        } else {
                            if (!(fVar2 instanceof f.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f.b bVar4 = (f.b) fVar2;
                            com.avito.android.user_advert.advert.items.auto_publish.a aVar9 = bVar4.f308527a;
                            c35435m0.s(aVar9);
                            C35436m1 c35436m114 = c35435m0.f310463d0;
                            if (c35436m114 != null) {
                                c35436m114.f(bVar4.f308528b);
                            }
                            aVar2 = aVar9;
                        }
                        MyAdvertDetailsItem myAdvertDetailsItem5 = c35435m0.f310465e0;
                        MyAdvertDetails.AutoPublishSwitcher autoPublishSwitcher = myAdvertDetailsItem5 != null ? myAdvertDetailsItem5.f309144i0 : null;
                        if (autoPublishSwitcher == null) {
                            return;
                        }
                        autoPublishSwitcher.setValue(Boolean.valueOf(aVar2.f309241g));
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.safe_show.b) {
                        com.avito.android.user_advert.advert.delegate.safe_show.b bVar5 = (com.avito.android.user_advert.advert.delegate.safe_show.b) interfaceC40292b;
                        if (!(bVar5 instanceof b.a) || (c35436m14 = c35435m0.f310463d0) == null) {
                            return;
                        }
                        b.a aVar10 = (b.a) bVar5;
                        c35436m14.f310563r.a(c35436m14.f310558m, aVar10.f308812a, aVar10.f308813b);
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.description.b) {
                        com.avito.android.user_advert.advert.delegate.description.b bVar6 = (com.avito.android.user_advert.advert.delegate.description.b) interfaceC40292b;
                        if (bVar6 instanceof b.a) {
                            c35435m0.s(((b.a) bVar6).f308587a);
                            return;
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.realty_verification.b) {
                        com.avito.android.user_advert.advert.delegate.realty_verification.b bVar7 = (com.avito.android.user_advert.advert.delegate.realty_verification.b) interfaceC40292b;
                        if (bVar7 instanceof b.a) {
                            c35435m0.s(((b.a) bVar7).f308779a);
                            return;
                        }
                        if (bVar7 instanceof b.c) {
                            b.c cVar2 = (b.c) bVar7;
                            c35435m0.s(cVar2.f308781a);
                            C35436m1 c35436m115 = c35435m0.f310463d0;
                            if (c35436m115 != null) {
                                c35436m115.f(cVar2.f308782b);
                                return;
                            }
                            return;
                        }
                        if (bVar7 instanceof b.d) {
                            c35435m0.j0();
                            return;
                        } else {
                            if (bVar7 instanceof b.C9476b) {
                                c35435m0.r(((b.C9476b) bVar7).f308780a);
                                return;
                            }
                            return;
                        }
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.installments.b) {
                        com.avito.android.user_advert.advert.delegate.installments.b bVar8 = (com.avito.android.user_advert.advert.delegate.installments.b) interfaceC40292b;
                        if (bVar8 instanceof b.a) {
                            aVar = ((b.a) bVar8).f308601a;
                            c35435m0.s(aVar);
                        } else {
                            if (!(bVar8 instanceof b.C9467b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b.C9467b c9467b = (b.C9467b) bVar8;
                            com.avito.android.user_advert.advert.items.installments_promoblock.a aVar11 = c9467b.f308602a;
                            c35435m0.s(aVar11);
                            C35436m1 c35436m116 = c35435m0.f310463d0;
                            if (c35436m116 != null) {
                                c35436m116.f(c9467b.f308603b);
                            }
                            aVar = aVar11;
                        }
                        MyAdvertDetailsItem myAdvertDetailsItem6 = c35435m0.f310465e0;
                        InstallmentsSwitcherData switcher2 = (myAdvertDetailsItem6 == null || (installmentsPromoBlockData = myAdvertDetailsItem6.f309136e0) == null) ? null : installmentsPromoBlockData.getSwitcher();
                        if (switcher2 == null) {
                            return;
                        }
                        a.C9491a c9491a = aVar.f309495g;
                        switcher2.setSwitchOn(c9491a != null ? Boolean.valueOf(c9491a.f309502d) : null);
                        return;
                    }
                    if (interfaceC40292b instanceof InterfaceC47297b) {
                        InterfaceC47297b interfaceC47297b = (InterfaceC47297b) interfaceC40292b;
                        if (!(interfaceC47297b instanceof InterfaceC47297b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MyAdvertDetailsActivity myAdvertDetailsActivity9 = c35435m0.f310461c0;
                        if (myAdvertDetailsActivity9 != null) {
                            AdvertParameters.Button.Description description2 = ((InterfaceC47297b.a) interfaceC47297b).f429150a;
                            DetailsSheetLinkBody detailsSheetLinkBody = new DetailsSheetLinkBody(description2.getHeader(), null, null, null, new AttributedText(description2.getText(), C42784z0.f406748b, 0, 4, null), null, new DetailsSheetButton(myAdvertDetailsActivity9.getString(R.string.close), "secondaryLarge", null, null, null, null, 60, null), null, null, null, null, null, null, null, null, null, null, false, null, 524206, null);
                            com.avito.android.deeplink_handler.handler.composite.a aVar12 = myAdvertDetailsActivity9.f308324p;
                            if (aVar12 == null) {
                                aVar12 = null;
                            }
                            b.a.a(aVar12, new DetailsSheetLink(detailsSheetLinkBody, null, 2, null), null, null, 6);
                            kotlin.G0 g02 = kotlin.G0.f406611a;
                            return;
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof lH0.b) {
                        lH0.b bVar9 = (lH0.b) interfaceC40292b;
                        if (bVar9 instanceof b.a) {
                            ((b.a) bVar9).getClass();
                            c35435m0.h(null, null);
                            return;
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof AbstractC43967b) {
                        AbstractC43967b abstractC43967b = (AbstractC43967b) interfaceC40292b;
                        if (!(abstractC43967b instanceof AbstractC43967b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c35435m0.f310493t.putBoolean("key_sbc_trx_onboarding_is_shown", true);
                        c35435m0.s(((AbstractC43967b.a) abstractC43967b).f414445a);
                        kotlin.G0 g03 = kotlin.G0.f406611a;
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.promo_block_feed.b) {
                        com.avito.android.user_advert.advert.delegate.promo_block_feed.b bVar10 = (com.avito.android.user_advert.advert.delegate.promo_block_feed.b) interfaceC40292b;
                        if (bVar10 instanceof b.a) {
                            c35435m0.r(((b.a) bVar10).f308777a);
                            return;
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.auto_select_close.i) {
                        com.avito.android.user_advert.advert.delegate.auto_select_close.i iVar2 = (com.avito.android.user_advert.advert.delegate.auto_select_close.i) interfaceC40292b;
                        if (iVar2 instanceof i.a) {
                            l0.a aVar13 = new l0.a();
                            C35441o0 c35441o0 = new C35441o0(c35435m0, iVar2, aVar13);
                            i.a aVar14 = (i.a) iVar2;
                            MyAdvertAutoSelect.MyAdvertAutoSelectButton button = aVar14.f308555a.getButton();
                            C35438n0 c35438n0 = button != null ? new C35438n0(iVar2, aVar13, c35435m0, button) : null;
                            MyAdvertAutoSelect.MyAdvertAutoSelectDialog myAdvertAutoSelectDialog = aVar14.f308555a;
                            String title2 = myAdvertAutoSelectDialog.getTitle();
                            InterfaceC28373a interfaceC28373a = c35435m0.f310480m;
                            if (title2 != null) {
                                if (kotlin.jvm.internal.L.f(myAdvertAutoSelectDialog.getTitle(), "Кешбэк от Авито за покупку автомобиля")) {
                                    C40912b.f397290g.getClass();
                                    interfaceC28373a.c(new C40912b(null, FromPage.f90018h, title2, "select_entrypoint", 1, null));
                                } else {
                                    C40912b.f397290g.getClass();
                                    interfaceC28373a.c(new C40912b(null, FromPage.f90017g, title2, "select_entrypoint", 1, null));
                                }
                            }
                            C35436m1 c35436m117 = c35435m0.f310463d0;
                            if (c35436m117 != null) {
                                com.avito.android.lib.util.g.a(c35436m117.f310552g.a(c35436m117.f310558m, myAdvertAutoSelectDialog, c35438n0, c35441o0));
                            }
                            interfaceC28373a.c(new C41305j());
                            return;
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.multi_urgency.e) {
                        com.avito.android.user_advert.advert.delegate.multi_urgency.e eVar2 = (com.avito.android.user_advert.advert.delegate.multi_urgency.e) interfaceC40292b;
                        if (eVar2 instanceof e.a) {
                            c35435m0.s(((e.a) eVar2).f308685a);
                            return;
                        } else {
                            if (!(eVar2 instanceof e.b) || (c35436m13 = c35435m0.f310463d0) == null) {
                                return;
                            }
                            e.b bVar11 = (e.b) eVar2;
                            c35436m13.d(bVar11.f308686a, bVar11.f308687b);
                            return;
                        }
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.multiaddress.b) {
                        com.avito.android.user_advert.advert.delegate.multiaddress.b bVar12 = (com.avito.android.user_advert.advert.delegate.multiaddress.b) interfaceC40292b;
                        if (!(bVar12 instanceof b.C9474b)) {
                            if (!(bVar12 instanceof b.a) || (myAdvertDetailsActivity = c35435m0.f310461c0) == null) {
                                return;
                            }
                            List<MultiAddressesItem> list = ((b.a) bVar12).f308755a;
                            com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.a aVar15 = myAdvertDetailsActivity.f308332t;
                            myAdvertDetailsActivity.startActivity((aVar15 != null ? aVar15 : null).a(list));
                            return;
                        }
                        MyAdvertDetailsActivity myAdvertDetailsActivity10 = c35435m0.f310461c0;
                        if (myAdvertDetailsActivity10 != null) {
                            List<MultiAddressesItem> list2 = ((b.C9474b) bVar12).f308756a;
                            oO.f fVar3 = myAdvertDetailsActivity10.f308330s;
                            oO.f fVar4 = fVar3 != null ? fVar3 : null;
                            MultiAddressesInfo multiAddressesInfo = new MultiAddressesInfo(null, list2, null, null);
                            FindLocationPage findLocationPage2 = FindLocationPage.f181725c;
                            myAdvertDetailsActivity10.startActivity(f.a.a(fVar4, null, true, null, null, null, null, multiAddressesInfo, "Адреса", null, null, null, null, null, false, null, null, null, null, null, false, null, false, false, 134065785));
                            return;
                        }
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.machinery_rental_banner.b) {
                        com.avito.android.user_advert.advert.delegate.machinery_rental_banner.b bVar13 = (com.avito.android.user_advert.advert.delegate.machinery_rental_banner.b) interfaceC40292b;
                        if (bVar13 instanceof b.a) {
                            Iterator<T> it = c35435m0.f310489q0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (next instanceof com.avito.android.user_advert.advert.items.machinery_rental_banner.e) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            com.avito.conveyor_item.a aVar16 = (com.avito.android.user_advert.advert.items.machinery_rental_banner.e) (next instanceof com.avito.android.user_advert.advert.items.machinery_rental_banner.e ? next : null);
                            if (aVar16 != null) {
                                c35435m0.r(aVar16);
                                return;
                            }
                            return;
                        }
                        if (bVar13 instanceof b.C9470b) {
                            InterfaceC35426j0.a.a(c35435m0, false, null, 7);
                            return;
                        }
                        if (!(bVar13 instanceof b.c)) {
                            if (bVar13 instanceof b.d) {
                                c35435m0.s(((b.d) bVar13).f308655a);
                                return;
                            }
                            return;
                        }
                        b.c cVar3 = (b.c) bVar13;
                        c35435m0.s(cVar3.f308654b);
                        String str8 = cVar3.f308653a;
                        if (str8 == null || str8.length() == 0 || (c35436m12 = c35435m0.f310463d0) == null) {
                            return;
                        }
                        L5.b(c35436m12.f310558m, str8, 0);
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.deliverySettings.a) {
                        com.avito.android.user_advert.advert.delegate.deliverySettings.a aVar17 = (com.avito.android.user_advert.advert.delegate.deliverySettings.a) interfaceC40292b;
                        if (aVar17 instanceof a.b) {
                            MyAdvertDetailsItem myAdvertDetailsItem7 = c35435m0.f310465e0;
                            MyAdvertDetails.DeliverySettings deliverySettings = myAdvertDetailsItem7 != null ? myAdvertDetailsItem7.f309099J0 : null;
                            if (deliverySettings != null) {
                                deliverySettings.setForm(((a.b) aVar17).f308562a);
                            }
                            c35435m0.t(((a.b) aVar17).f308562a.getF105312b(), c35435m0.f310489q0, false);
                            return;
                        }
                        if (aVar17 instanceof a.C9464a) {
                            c35435m0.t(((a.C9464a) aVar17).f308561a, c35435m0.f310489q0, false);
                            return;
                        } else {
                            if (aVar17 instanceof a.c) {
                                c35435m0.t(((a.c) aVar17).f308563a, c35435m0.f310489q0, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.multi_items.f) {
                        com.avito.android.user_advert.advert.delegate.multi_items.f fVar5 = (com.avito.android.user_advert.advert.delegate.multi_items.f) interfaceC40292b;
                        boolean z13 = fVar5 instanceof f.a;
                        iI0.t tVar = c35435m0.f310448R;
                        if (!z13) {
                            if (!kotlin.jvm.internal.L.f(fVar5, f.b.f308682a) || (myAdvertDetailsItem = c35435m0.f310465e0) == null || (str = myAdvertDetailsItem.f309129b) == null) {
                                return;
                            }
                            tVar.a(str);
                            return;
                        }
                        MyAdvertDetailsItem myAdvertDetailsItem8 = c35435m0.f310465e0;
                        if (myAdvertDetailsItem8 != null && (str2 = myAdvertDetailsItem8.f309129b) != null) {
                            tVar.b(str2, ((f.a) fVar5).f308681a);
                        }
                        c35435m0.f310458b = new C35382d(((f.a) fVar5).f308681a.getF85953c());
                        C35436m1 c35436m118 = c35435m0.f310463d0;
                        if (c35436m118 != null) {
                            c35436m118.e(new UV0.c<>(C42784z0.f406748b));
                        }
                        InterfaceC35426j0.a.a(c35435m0, false, null, 3);
                        return;
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.job_select_dialog.b) {
                        com.avito.android.user_advert.advert.delegate.job_select_dialog.b bVar14 = (com.avito.android.user_advert.advert.delegate.job_select_dialog.b) interfaceC40292b;
                        if (bVar14 instanceof b.c) {
                            c35435m0.f310487p0 = false;
                            C35436m1 c35436m119 = c35435m0.f310463d0;
                            if (c35436m119 != null) {
                                c35436m119.i();
                                return;
                            }
                            return;
                        }
                        if (bVar14 instanceof b.C9468b) {
                            c35435m0.u();
                            c35435m0.j(((b.C9468b) bVar14).f308628a);
                            return;
                        } else {
                            if (bVar14 instanceof b.a) {
                                C35436m1 c35436m120 = c35435m0.f310463d0;
                                if (c35436m120 != null) {
                                    c35436m120.e(new UV0.c<>(C42784z0.f406748b));
                                }
                                c35435m0.j0();
                                return;
                            }
                            return;
                        }
                    }
                    if (interfaceC40292b instanceof com.avito.android.user_advert.advert.delegate.service_booking.b) {
                        com.avito.android.user_advert.advert.delegate.service_booking.b bVar15 = (com.avito.android.user_advert.advert.delegate.service_booking.b) interfaceC40292b;
                        if (bVar15 instanceof b.a) {
                            com.avito.android.user_advert.advert.items.service_booking_reminder.c cVar4 = ((b.a) bVar15).f308815a;
                            if (cVar4.f310158k != null) {
                                String str9 = "pref_sb_reminder_banner_" + cVar4.f310157j;
                                long epochSecond = LocalDateTime.now().truncatedTo(ChronoUnit.DAYS).toEpochSecond(ZoneOffset.UTC);
                                com.avito.android.service_booking_persistence.b bVar16 = c35435m0.f310494u;
                                bVar16.b(epochSecond, str9);
                                Long l12 = cVar4.f310158k;
                                if (l12 != null && l12.longValue() == 0) {
                                    bVar16.d(str9, true);
                                }
                            }
                            c35435m0.r(cVar4);
                        }
                    }
                }
            }));
            this.f310491r0.b(abstractC40291a);
        }
        this.f310469g0.b(C35896f0.g(new io.reactivex.rxjava3.internal.operators.observable.C(new C35396h1(c35436m1, 1)).j0(this.f310470h.e()), new C35375a1(this)));
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void e0() {
        this.f310463d0 = null;
        this.f310469g0.e();
        io.reactivex.rxjava3.internal.observers.y yVar = this.f310471h0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f310491r0.e();
        this.f310439I.onCleared();
    }

    public final void f(MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar, boolean z12) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        MyAdvertDetails.DeliverySettings deliverySettings;
        String requestUrl;
        Object next6;
        String f105312b;
        String str;
        MyAdvertDetails.DeliverySettings deliverySettings2;
        BeduinForm form;
        CarMarketPrice carMarketPrice;
        int i12;
        kotlin.G0 g02;
        PremierPartnerStatus status;
        C35436m1 c35436m1;
        this.f310489q0 = this.f310474j.b(myAdvertDetailsItem, this.f310458b);
        C35436m1 c35436m12 = this.f310463d0;
        if (c35436m12 != null) {
            c35436m12.h(myAdvertDetailsItem.f309151m);
        }
        C35436m1 c35436m13 = this.f310463d0;
        InterfaceC35745a5 interfaceC35745a5 = this.f310470h;
        io.reactivex.rxjava3.disposables.c cVar = this.f310469g0;
        if (c35436m13 != null) {
            boolean z13 = kotlin.jvm.internal.L.f(myAdvertDetailsItem.f309100K, "active") && myAdvertDetailsItem.f309161r != null;
            InterfaceC35461y interfaceC35461y = this.f310472i;
            List<Action> list = myAdvertDetailsItem.f309163s;
            ArrayList arrayListA = interfaceC35461y.a(list, z13);
            cVar.b(io.reactivex.rxjava3.core.z.c0(arrayListA).j0(interfaceC35745a5.e()).K(new C35444p0(c35436m13)).K(new C35447q0(this, myAdvertDetailsItem)).N(C35448r0.f310588b).T(new C35450s0(c35436m13), Integer.MAX_VALUE).G0(BackpressureStrategy.f401954c).p(new C35452t0(this, arrayListA, z13, myAdvertDetailsItem, list), C35454u0.f310648b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
        if (this.f310466f) {
            w(new L0(this));
        }
        if (this.f310477k0) {
            this.f310477k0 = false;
            w(new J0(this));
        }
        if (!this.f310481m0) {
            String str2 = this.f310479l0;
            if (str2 != null && (c35436m1 = this.f310463d0) != null) {
                c35436m1.f(str2);
            }
            this.f310481m0 = true;
        }
        MyAdvertDetailsItem myAdvertDetailsItem2 = this.f310465e0;
        InterfaceC28373a interfaceC28373a = this.f310480m;
        if (myAdvertDetailsItem2 != null && kotlin.jvm.internal.L.f(bVar, InterfaceC35426j0.b.C9510b.f310420a) && kotlin.jvm.internal.L.f(myAdvertDetailsItem2.f309100K, "active") && this.f310462d) {
            interfaceC28373a.c(new iI0.w(myAdvertDetailsItem2.f309129b, this.f310482n.c()));
        }
        AppliedServicesInfo appliedServicesInfo = myAdvertDetailsItem.f309127Z;
        List<Service> servicesIcons = appliedServicesInfo != null ? appliedServicesInfo.getServicesIcons() : null;
        String str3 = myAdvertDetailsItem.f309129b;
        if (servicesIcons != null && !servicesIcons.isEmpty()) {
            interfaceC28373a.c(new iI0.J(str3));
        }
        MyAdvertDetails.EntryPointToAccountOwnerBanner entryPointToAccountOwnerBanner = myAdvertDetailsItem.f309103L0;
        if (entryPointToAccountOwnerBanner != null && this.f310444N.a()) {
            this.f310445O.d(entryPointToAccountOwnerBanner.getDealId(), str3);
        }
        PremierPartner premierPartner = myAdvertDetailsItem.f309178z0;
        if (premierPartner != null && (status = premierPartner.getStatus()) != null) {
            if (!status.shouldShowCard()) {
                status = null;
            }
            if (status != null) {
                this.f310441K.a(str3);
            }
        }
        if (bVar instanceof InterfaceC35426j0.b.C9510b) {
            MyAdvertDetailsActivity myAdvertDetailsActivity = this.f310461c0;
            if (myAdvertDetailsActivity != null) {
                Intent intent = (Intent) myAdvertDetailsActivity.getIntent().getParcelableExtra("nested_intent");
                if (intent != null) {
                    myAdvertDetailsActivity.f308289M0.postDelayed(new A(myAdvertDetailsActivity, intent, 0), 700L);
                    i12 = 1;
                } else {
                    InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
                    if (interfaceC35426j0 == null) {
                        interfaceC35426j0 = null;
                    }
                    i12 = 1;
                    t1.a.a(interfaceC35426j0, z12, 1);
                }
                g02 = kotlin.G0.f406611a;
            } else {
                i12 = 1;
                g02 = null;
            }
            if (g02 == null) {
                t1.a.a(this, z12, i12);
            }
        } else {
            c(bVar, z12);
        }
        Set<AbstractC40291a> set = this.f310495v;
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC43637a) {
                    break;
                }
            }
        }
        if (!(next instanceof InterfaceC43637a)) {
            next = null;
        }
        if (((InterfaceC43637a) next) != null && (carMarketPrice = myAdvertDetailsItem.f309152m0) != null) {
            carMarketPrice.getClosePoll();
        }
        Iterator<T> it2 = set.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (next2 instanceof com.avito.android.user_advert.advert.delegate.auto_select_close.h) {
                    break;
                }
            }
        }
        if (!(next2 instanceof com.avito.android.user_advert.advert.delegate.auto_select_close.h)) {
            next2 = null;
        }
        com.avito.android.user_advert.advert.delegate.auto_select_close.h hVar = (com.avito.android.user_advert.advert.delegate.auto_select_close.h) next2;
        if (hVar != null) {
            hVar.x(myAdvertDetailsItem.f309176y0);
        }
        Iterator<T> it3 = set.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it3.next();
                if (next3 instanceof InterfaceC40824a) {
                    break;
                }
            }
        }
        if (!(next3 instanceof InterfaceC40824a)) {
            next3 = null;
        }
        InterfaceC40824a interfaceC40824a = (InterfaceC40824a) next3;
        if (interfaceC40824a != null) {
            interfaceC40824a.a(myAdvertDetailsItem);
        }
        Iterator<T> it4 = set.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            } else {
                next4 = it4.next();
                if (next4 instanceof InterfaceC41288a) {
                    break;
                }
            }
        }
        if (!(next4 instanceof InterfaceC41288a)) {
            next4 = null;
        }
        InterfaceC41288a interfaceC41288a = (InterfaceC41288a) next4;
        if (interfaceC41288a != null) {
            interfaceC41288a.a(myAdvertDetailsItem);
        }
        Iterator<T> it5 = set.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            } else {
                next5 = it5.next();
                if (next5 instanceof com.avito.android.user_advert.advert.delegate.job_select_dialog.a) {
                    break;
                }
            }
        }
        if (!(next5 instanceof com.avito.android.user_advert.advert.delegate.job_select_dialog.a)) {
            next5 = null;
        }
        com.avito.android.user_advert.advert.delegate.job_select_dialog.a aVar = (com.avito.android.user_advert.advert.delegate.job_select_dialog.a) next5;
        if (aVar != null) {
            aVar.a(myAdvertDetailsItem);
        }
        g();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f310433C;
        cVar.b(aVar2.d9().N(H0.f308240b).j0(interfaceC35745a5.e()).t0(new I0(this)));
        cVar.b(aVar2.d9().N(F0.f308231b).t0(new G0(this)));
        MyAdvertDetailsItem myAdvertDetailsItem3 = this.f310465e0;
        if (myAdvertDetailsItem3 != null && (deliverySettings = myAdvertDetailsItem3.f309099J0) != null && (requestUrl = deliverySettings.getRequestUrl()) != null) {
            Iterator<T> it6 = set.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next6 = null;
                    break;
                } else {
                    next6 = it6.next();
                    if (next6 instanceof com.avito.android.user_advert.advert.delegate.deliverySettings.b) {
                        break;
                    }
                }
            }
            com.avito.android.user_advert.advert.delegate.deliverySettings.b bVar2 = (com.avito.android.user_advert.advert.delegate.deliverySettings.b) (next6 instanceof com.avito.android.user_advert.advert.delegate.deliverySettings.b ? next6 : null);
            if (bVar2 == null) {
                throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.deliverySettings.b.class);
            }
            MyAdvertDetailsItem myAdvertDetailsItem4 = this.f310465e0;
            String str4 = "";
            if (myAdvertDetailsItem4 == null || (deliverySettings2 = myAdvertDetailsItem4.f309099J0) == null || (form = deliverySettings2.getForm()) == null || (f105312b = form.getF105312b()) == null) {
                f105312b = "";
            }
            MyAdvertDetailsItem myAdvertDetailsItem5 = this.f310465e0;
            if (myAdvertDetailsItem5 != null && (str = myAdvertDetailsItem5.f309129b) != null) {
                str4 = str;
            }
            bVar2.n(requestUrl, f105312b, str4);
        }
        cVar.b(aVar2.d9().N(D0.f308226b).j0(interfaceC35745a5.e()).t0(new E0(this)));
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void f1(@Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC41288a) {
                    break;
                }
            }
        }
        InterfaceC41288a interfaceC41288a = (InterfaceC41288a) (next instanceof InterfaceC41288a ? next : null);
        if (interfaceC41288a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC41288a.class);
        }
        interfaceC41288a.f1(deepLink);
    }

    public final void g() {
        C35436m1 c35436m1 = this.f310463d0;
        if (c35436m1 != null) {
            c35436m1.e(new UV0.c<>(this.f310489q0));
        }
    }

    public final void h(CloseReason closeReason, String str) {
        String str2;
        String value;
        Object next;
        MyAdvertDetails.Price price;
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem == null || (str2 = myAdvertDetailsItem.f309129b) == null) {
            return;
        }
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            value = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a) {
                    break;
                }
            }
        }
        if (!(next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a)) {
            next = null;
        }
        com.avito.android.user_advert.advert.delegate.user_advert_action.a aVar = (com.avito.android.user_advert.advert.delegate.user_advert_action.a) next;
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.user_advert_action.a.class);
        }
        MyAdvertDetailsItem myAdvertDetailsItem2 = this.f310465e0;
        if (myAdvertDetailsItem2 != null && (price = myAdvertDetailsItem2.f309102L) != null) {
            value = price.getValue();
        }
        aVar.D(str2, closeReason, str, value);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void i0() {
        i(this, null, false, null, null, 31);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void i1(@Y61.k com.avito.android.user_advert.advert.items.auction_banner.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC41288a) {
                    break;
                }
            }
        }
        InterfaceC41288a interfaceC41288a = (InterfaceC41288a) (next instanceof InterfaceC41288a ? next : null);
        if (interfaceC41288a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC41288a.class);
        }
        interfaceC41288a.i1(aVar);
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.user_advert_action.a aVar = (com.avito.android.user_advert.advert.delegate.user_advert_action.a) (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.user_advert_action.a.class);
        }
        aVar.v(deepLink, this.f310465e0, false);
    }

    public final void j(ApiError apiError) {
        com.avito.android.error.z.g(apiError, new C35456v0(this), null, new C35458w0(this), new C35460x0(this), null, 18);
    }

    @Override // com.avito.android.user_advert.advert.t1
    public final void j0() {
        InterfaceC35426j0.a.a(this, false, null, 7);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void k3(@Y61.k com.avito.android.user_advert.advert.items.promo_block_feed.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.promo_block_feed.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.promo_block_feed.a aVar2 = (com.avito.android.user_advert.advert.delegate.promo_block_feed.a) (next instanceof com.avito.android.user_advert.advert.delegate.promo_block_feed.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.promo_block_feed.a.class);
        }
        aVar2.c(aVar);
    }

    @Override // com.avito.android.advert_core.expand_items_button.f
    public final void l(@Y61.k ExpandItemsButtonItem expandItemsButtonItem) {
        List<? extends com.avito.conveyor_item.a> list = this.f310489q0;
        List<PersistableSpannedItem> list2 = expandItemsButtonItem.f83565i;
        int iIndexOf = list.indexOf(C42745f0.E(list2));
        int iIndexOf2 = this.f310489q0.indexOf(expandItemsButtonItem);
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f310489q0.subList(0, iIndexOf));
        arrayList.addAll(list2);
        List<? extends com.avito.conveyor_item.a> list3 = this.f310489q0;
        arrayList.addAll(list3.subList(iIndexOf2 + 1, list3.size()));
        this.f310489q0 = arrayList;
        g();
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void l8(int i12) {
        Object next;
        Object next2;
        Iterator<T> it = this.f310489q0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.L.f(((com.avito.conveyor_item.a) next).getF128578h(), "user_advert.advert.items.my_advert_gallery_item_id")) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.items.gallery.c cVar = next instanceof com.avito.android.user_advert.advert.items.gallery.c ? (com.avito.android.user_advert.advert.items.gallery.c) next : null;
        if (cVar != null) {
            Iterator<T> it2 = this.f310495v.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (next2 instanceof com.avito.android.user_advert.advert.delegate.gallery.a) {
                        break;
                    }
                }
            }
            com.avito.android.user_advert.advert.delegate.gallery.a aVar = (com.avito.android.user_advert.advert.delegate.gallery.a) (next2 instanceof com.avito.android.user_advert.advert.delegate.gallery.a ? next2 : null);
            if (aVar == null) {
                throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.gallery.a.class);
            }
            aVar.U0(cVar, i12);
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void lb() {
        C35436m1 c35436m1 = this.f310463d0;
        if (c35436m1 != null) {
            c35436m1.i();
        }
        this.f310485o0 = false;
    }

    public final boolean n(InterfaceC35426j0.b bVar) {
        return this.f310462d && (bVar instanceof InterfaceC35426j0.b.C9510b);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void n4(boolean z12, @Y61.k InterfaceC35426j0.b bVar, boolean z13) {
        this.f310486p.x();
        C35436m1 c35436m1 = this.f310463d0;
        if (c35436m1 != null) {
            c35436m1.h("");
        }
        if (z13) {
            this.f310487p0 = false;
            C35436m1 c35436m12 = this.f310463d0;
            if (c35436m12 != null) {
                c35436m12.i();
            }
        }
        o(bVar, z12);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void n5(boolean z12) {
        com.avito.android.Z0 z02 = this.f310442L;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.Z0.f67595D[2];
        if (((Boolean) z02.f67602e.a().invoke()).booleanValue()) {
            com.avito.android.clientEventBus.a aVar = this.f310443M;
            this.f310469g0.b(aVar.a().y0(new A0(aVar)).j0(this.f310470h.e()).d0(new B0(this)).s0());
        }
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem == null) {
            InterfaceC35426j0.a.a(this, z12, null, 6);
        } else {
            f(myAdvertDetailsItem, InterfaceC35426j0.b.C9510b.f310420a, false);
            u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.avito.android.user_advert.advert.InterfaceC35426j0.b r6, boolean r7) {
        /*
            r5 = this;
            io.reactivex.rxjava3.internal.observers.y r0 = r5.f310471h0
            if (r0 == 0) goto L7
            io.reactivex.rxjava3.internal.disposables.DisposableHelper.a(r0)
        L7:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.avito.android.fakedoor_dialog.storage.FakeDoorScreen r1 = com.avito.android.fakedoor_dialog.storage.FakeDoorScreen.f155150c
            nC.a r2 = r5.f310435E
            kotlin.Q r1 = r2.b(r1)
            if (r1 == 0) goto L1d
            A r2 = r1.f406619b
            B r1 = r1.f406620c
            r0.put(r2, r1)
        L1d:
            com.avito.android.user_advert.advert.e r1 = r5.f310458b
            boolean r2 = r1 instanceof com.avito.android.user_advert.advert.C35382d
            if (r2 == 0) goto L5c
            com.avito.android.user_advert.advert.d r1 = (com.avito.android.user_advert.advert.C35382d) r1
            java.lang.String r1 = r1.f308519a
            boolean r2 = r5.f310462d
            r6.getClass()
            boolean r3 = r6 instanceof com.avito.android.user_advert.advert.InterfaceC35426j0.b.a
            if (r3 == 0) goto L33
            java.lang.String r2 = "itemActivation"
            goto L4b
        L33:
            boolean r3 = r6 instanceof com.avito.android.user_advert.advert.InterfaceC35426j0.b.d
            if (r3 == 0) goto L3a
            java.lang.String r2 = "paidService"
            goto L4b
        L3a:
            boolean r3 = r6 instanceof com.avito.android.user_advert.advert.InterfaceC35426j0.b.c
            java.lang.String r4 = "publish"
            if (r3 == 0) goto L42
        L40:
            r2 = r4
            goto L4b
        L42:
            boolean r3 = r6 instanceof com.avito.android.user_advert.advert.InterfaceC35426j0.b.C9510b
            if (r3 == 0) goto L56
            if (r2 == 0) goto L49
            goto L40
        L49:
            java.lang.String r2 = "other"
        L4b:
            com.avito.android.user_advert.advert.S r3 = r5.f310476k
            io.reactivex.rxjava3.internal.operators.single.W r0 = r3.h(r1, r2, r0)
            io.reactivex.rxjava3.core.z r0 = r0.F()
            goto L6a
        L56:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L5c:
            boolean r0 = r1 instanceof com.avito.android.user_advert.advert.C35388f
            if (r0 == 0) goto L89
            com.avito.android.user_advert.advert.f r1 = (com.avito.android.user_advert.advert.C35388f) r1
            java.lang.String r0 = r1.f308897a
            com.avito.android.user_advert.advert.I1 r1 = r5.f310478l
            io.reactivex.rxjava3.internal.operators.observable.b0 r0 = r1.a(r0)
        L6a:
            com.avito.android.util.a5 r1 = r5.f310470h
            io.reactivex.rxjava3.core.H r1 = r1.e()
            io.reactivex.rxjava3.internal.operators.observable.I0 r0 = r0.j0(r1)
            com.avito.android.user_advert.advert.m0$e r1 = new com.avito.android.user_advert.advert.m0$e
            r1.<init>(r6, r7)
            com.avito.android.user_advert.advert.m0$f r6 = new com.avito.android.user_advert.advert.m0$f
            r6.<init>()
            l41.a r7 = io.reactivex.rxjava3.internal.functions.a.f401993c
            io.reactivex.rxjava3.disposables.d r6 = r0.v0(r1, r6, r7)
            io.reactivex.rxjava3.internal.observers.y r6 = (io.reactivex.rxjava3.internal.observers.y) r6
            r5.f310471h0 = r6
            return
        L89:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.C35435m0.o(com.avito.android.user_advert.advert.j0$b, boolean):void");
    }

    public final void p(SuccessResult successResult, boolean z12) {
        C35436m1 c35436m1;
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem != null) {
            myAdvertDetailsItem.f309100K = "active";
        }
        if (!z12) {
            String message = successResult.getMessage();
            if (message != null && (c35436m1 = this.f310463d0) != null) {
                c35436m1.f(message);
            }
            InterfaceC35426j0.a.b(this, InterfaceC35426j0.b.a.f310419a, 2);
            return;
        }
        this.f310473i0 = 7;
        this.f310467f0 = successResult.getMessage();
        if (!this.f310468g) {
            AdvertActionTransferData.Type type = AdvertActionTransferData.Type.f308190b;
            i(this, null, false, null, null, 23);
            return;
        }
        AdvertActionTransferData.Type type2 = AdvertActionTransferData.Type.f308190b;
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f310461c0;
        if (myAdvertDetailsActivity != null) {
            String str = this.f310467f0;
            MyAdvertDetailsItem myAdvertDetailsItem2 = this.f310465e0;
            AdvertActionTransferData advertActionTransferData = new AdvertActionTransferData(null, str, myAdvertDetailsItem2 != null ? myAdvertDetailsItem2.f309139g : null, type2, 1, null);
            InterfaceC44261b interfaceC44261b = myAdvertDetailsActivity.f308342y;
            myAdvertDetailsActivity.startActivity(InterfaceC44261b.a.a(interfaceC44261b != null ? interfaceC44261b : null, null, advertActionTransferData, null, null, 28));
        }
        i(this, null, false, null, null, 31);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void q7(@Y61.k AdvertParameters.Button button, @Y61.l String str) {
        w(new h(button, str));
    }

    public final void r(com.avito.conveyor_item.a aVar) {
        List<? extends com.avito.conveyor_item.a> list = this.f310489q0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!kotlin.jvm.internal.L.f(((com.avito.conveyor_item.a) obj).getF128578h(), aVar.getF128578h())) {
                arrayList.add(obj);
            }
        }
        this.f310489q0 = arrayList;
        g();
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void rc(@Y61.k com.avito.android.user_advert.advert.items.machinery_rental_banner.e eVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a aVar = (com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a) (next instanceof com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a.class);
        }
        aVar.J(eVar);
    }

    public final void s(com.avito.conveyor_item.a aVar) {
        List<? extends com.avito.conveyor_item.a> list = this.f310489q0;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (com.avito.conveyor_item.a aVar2 : list) {
            if (kotlin.jvm.internal.L.f(aVar2.getF128578h(), aVar.getF128578h())) {
                aVar2 = aVar;
            }
            arrayList.add(aVar2);
        }
        this.f310489q0 = arrayList;
        g();
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void s0() {
        MyAdvertDetails.Portfolio portfolio;
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (((myAdvertDetailsItem == null || (portfolio = myAdvertDetailsItem.f309113Q0) == null) ? null : portfolio.getEmptyPortfolio()) != null) {
            this.f310455Y.a();
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void sd(@Y61.k ActionsItem.Action action) {
        Object next;
        if (action instanceof ActionsItem.c) {
            Iterator<T> it = this.f310495v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next instanceof InterfaceC43966a) {
                        break;
                    }
                }
            }
            InterfaceC43966a interfaceC43966a = (InterfaceC43966a) (next instanceof InterfaceC43966a ? next : null);
            if (interfaceC43966a == null) {
                throw new PresenterDelegateNotFoundException(InterfaceC43966a.class);
            }
            interfaceC43966a.F();
        }
    }

    public final void t(String str, List list, boolean z12) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) next;
            if ((aVar instanceof com.avito.android.beduin_items.item_with_loader.a) && kotlin.jvm.internal.L.f(((com.avito.android.beduin_items.item_with_loader.a) aVar).f105254b, str)) {
                break;
            }
        }
        com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) next;
        if (aVar2 != null) {
            s(com.avito.android.beduin_items.item_with_loader.a.a((com.avito.android.beduin_items.item_with_loader.a) aVar2, z12));
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void t7(@Y61.k DeepLink deepLink) {
        String str;
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem != null && (str = myAdvertDetailsItem.f309129b) != null) {
            this.f310480m.c(new iI0.p(str));
        }
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f310461c0;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.a(deepLink);
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void t9(@Y61.k String str, boolean z12) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.portfolio.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.portfolio.a aVar = (com.avito.android.user_advert.advert.delegate.portfolio.a) (next instanceof com.avito.android.user_advert.advert.delegate.portfolio.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.portfolio.a.class);
        }
        aVar.h(str, z12);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void tc(@Y61.k com.avito.android.user_advert.advert.items.realty.verification.a aVar, @Y61.k String str) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.realty_verification.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.realty_verification.a aVar2 = (com.avito.android.user_advert.advert.delegate.realty_verification.a) (next instanceof com.avito.android.user_advert.advert.delegate.realty_verification.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.realty_verification.a.class);
        }
        aVar2.g(aVar, str);
    }

    public final void u() {
        C35436m1 c35436m1;
        if (this.f310464e) {
            this.f310469g0.b(io.reactivex.rxjava3.kotlin.A1.h(this.f310440J.a(), null, null, 7));
        }
        this.f310487p0 = true;
        if (!this.f310485o0 || (c35436m1 = this.f310463d0) == null) {
            return;
        }
        c35436m1.b();
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void u6(@Y61.k ActionsItem.Action action, @Y61.k ActionsItem actionsItem) {
        Object next;
        if (!(action instanceof ActionsItem.c)) {
            if ((action instanceof ActionsItem.a) || (action instanceof ActionsItem.d)) {
                return;
            }
            boolean z12 = action instanceof ActionsItem.b;
            return;
        }
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC43966a) {
                    break;
                }
            }
        }
        InterfaceC43966a interfaceC43966a = (InterfaceC43966a) (next instanceof InterfaceC43966a ? next : null);
        if (interfaceC43966a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC43966a.class);
        }
        interfaceC43966a.o(actionsItem);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void u7(@Y61.k com.avito.android.user_advert.advert.items.realty.verification.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.realty_verification.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.realty_verification.a aVar2 = (com.avito.android.user_advert.advert.delegate.realty_verification.a) (next instanceof com.avito.android.user_advert.advert.delegate.realty_verification.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.realty_verification.a.class);
        }
        aVar2.y(aVar.f309950c);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void ud(@Y61.k com.avito.android.user_advert.advert.items.reject.a aVar, @Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC48556a) {
                    break;
                }
            }
        }
        InterfaceC48556a interfaceC48556a = (InterfaceC48556a) (next instanceof InterfaceC48556a ? next : null);
        if (interfaceC48556a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC48556a.class);
        }
        interfaceC48556a.N(deepLink);
    }

    public final void v() {
        Object next;
        Object next2;
        Iterator<T> it = this.f310489q0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.items.installments_promoblock.a) {
                    break;
                }
            }
        }
        if (!(next instanceof com.avito.android.user_advert.advert.items.installments_promoblock.a)) {
            next = null;
        }
        com.avito.android.user_advert.advert.items.installments_promoblock.a aVar = (com.avito.android.user_advert.advert.items.installments_promoblock.a) next;
        if (aVar == null) {
            return;
        }
        Iterator<T> it2 = this.f310495v.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (next2 instanceof com.avito.android.user_advert.advert.delegate.installments.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.installments.a aVar2 = (com.avito.android.user_advert.advert.delegate.installments.a) (next2 instanceof com.avito.android.user_advert.advert.delegate.installments.a ? next2 : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.installments.a.class);
        }
        aVar2.G(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void v0(@Y61.k DeepLink deepLink, @Y61.k String str) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.portfolio.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.portfolio.a aVar = (com.avito.android.user_advert.advert.delegate.portfolio.a) (next instanceof com.avito.android.user_advert.advert.delegate.portfolio.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.portfolio.a.class);
        }
        aVar.v0(deepLink, str);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void v1(@Y61.k com.avito.android.user_advert.advert.items.sales_contract.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC48899a) {
                    break;
                }
            }
        }
        InterfaceC48899a interfaceC48899a = (InterfaceC48899a) (next instanceof InterfaceC48899a ? next : null);
        if (interfaceC48899a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC48899a.class);
        }
        interfaceC48899a.v1(aVar);
    }

    public final void w(Y41.l<? super String, kotlin.G0> lVar) {
        AbstractC35385e abstractC35385e = this.f310458b;
        if (abstractC35385e instanceof C35382d) {
            lVar.invoke(((C35382d) abstractC35385e).f308519a);
        } else {
            boolean z12 = abstractC35385e instanceof C35388f;
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void w9(@Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.user_advert_action.a aVar = (com.avito.android.user_advert.advert.delegate.user_advert_action.a) (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.user_advert_action.a.class);
        }
        if (deepLink instanceof MyAdvertLink.Deactivate) {
            deepLink = new MyAdvertLink.Deactivate(((MyAdvertLink.Deactivate) deepLink).f133474c, true);
        }
        aVar.v(deepLink, this.f310465e0, false);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void wd(@Y61.k AbstractC35385e abstractC35385e, @Y61.l String str, @Y61.l String str2, @Y61.l MyAdvertPostAction myAdvertPostAction, boolean z12, boolean z13) {
        this.f310458b = abstractC35385e;
        this.f310460c = str;
        this.f310479l0 = str2;
        this.f310462d = z12;
        this.f310481m0 = false;
        this.f310477k0 = false;
        this.f310475j0 = z13;
        if (myAdvertPostAction instanceof MyAdvertPostAction.Activate) {
            InterfaceC35426j0.a.b(this, null, 3);
            w(new J0(this));
        } else if (myAdvertPostAction instanceof MyAdvertPostAction.Allow) {
            w(new M0(this));
        } else if (myAdvertPostAction instanceof MyAdvertPostAction.Reserve) {
            w(new O0(this, ((MyAdvertPostAction.Reserve) myAdvertPostAction).f308369b));
        } else {
            InterfaceC35426j0.a.b(this, null, 3);
        }
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void x0(@Y61.k com.avito.android.user_advert.advert.items.gallery.c cVar, int i12) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.gallery.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.gallery.a aVar = (com.avito.android.user_advert.advert.delegate.gallery.a) (next instanceof com.avito.android.user_advert.advert.delegate.gallery.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.gallery.a.class);
        }
        aVar.x0(cVar, i12);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void x7(@Y61.k com.avito.android.user_advert.advert.items.multiaddresses.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.multiaddress.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.multiaddress.a aVar2 = (com.avito.android.user_advert.advert.delegate.multiaddress.a) (next instanceof com.avito.android.user_advert.advert.delegate.multiaddress.a ? next : null);
        if (aVar2 == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.multiaddress.a.class);
        }
        aVar2.A(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void x9() {
        this.f310480m.c(new BannerEvent.h("parameters_refilling", "item", null, 4, null));
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void y0(@Y61.k com.avito.android.user_advert.advert.items.verification.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.verification.b) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.verification.b bVar = (com.avito.android.user_advert.advert.delegate.verification.b) (next instanceof com.avito.android.user_advert.advert.delegate.verification.b ? next : null);
        if (bVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.verification.b.class);
        }
        bVar.y0(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void y1(@Y61.k com.avito.android.user_advert.advert.items.alert_banner.a aVar) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof InterfaceC40824a) {
                    break;
                }
            }
        }
        InterfaceC40824a interfaceC40824a = (InterfaceC40824a) (next instanceof InterfaceC40824a ? next : null);
        if (interfaceC40824a == null) {
            throw new PresenterDelegateNotFoundException(InterfaceC40824a.class);
        }
        interfaceC40824a.y1(aVar);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void z0(@Y61.k OH0.b bVar, @Y61.k DeepLink deepLink) {
        Object next;
        Iterator<T> it = this.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.user_advert.advert.delegate.short_term_rent.a) {
                    break;
                }
            }
        }
        com.avito.android.user_advert.advert.delegate.short_term_rent.a aVar = (com.avito.android.user_advert.advert.delegate.short_term_rent.a) (next instanceof com.avito.android.user_advert.advert.delegate.short_term_rent.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.short_term_rent.a.class);
        }
        aVar.z0(bVar, deepLink);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35426j0
    public final void z7() {
        String str;
        MyAdvertDetailsItem myAdvertDetailsItem = this.f310465e0;
        if (myAdvertDetailsItem == null || (str = myAdvertDetailsItem.f309129b) == null) {
            return;
        }
        this.f310480m.c(new iI0.x(str));
    }

    @Override // com.avito.android.advert_core.expand_items_button.f
    public final void Y0(@Y61.k ExpandItemsButtonItem expandItemsButtonItem) {
    }
}
