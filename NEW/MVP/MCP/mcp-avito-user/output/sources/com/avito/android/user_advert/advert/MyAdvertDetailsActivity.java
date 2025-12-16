package com.avito.android.user_advert.advert;

import Cd.C13243a;
import W60.d;
import Zd.InterfaceC19542a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.P0;
import com.avito.android.N2;
import com.avito.android.R;
import com.avito.android.advert.InterfaceC27793e;
import com.avito.android.advert_core.advert_badge_bar.e;
import com.avito.android.advert_core.body_condition.f;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MyAdvertDetailsScreen;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.deep_linking.links.ChannelsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ownership.Owners;
import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.user_advert.AdvertActionTransferData;
import com.avito.android.user_advert.advert.B;
import com.avito.android.user_advert.advert.C35453u;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertPostAction;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import com.avito.android.user_advert.advert.items.actions_item.c;
import com.avito.android.user_advert.advert.items.address.d;
import com.avito.android.user_advert.advert.items.alert_banner.d;
import com.avito.android.user_advert.advert.items.auction_banner.d;
import com.avito.android.user_advert.advert.items.auto_publish.d;
import com.avito.android.user_advert.advert.items.bbl_contact_history.g;
import com.avito.android.user_advert.advert.items.contacts_bbl.f;
import com.avito.android.user_advert.advert.items.credit_info.d;
import com.avito.android.user_advert.advert.items.description.d;
import com.avito.android.user_advert.advert.items.fill_parameters_banner.e;
import com.avito.android.user_advert.advert.items.gallery.h;
import com.avito.android.user_advert.advert.items.installments_promoblock.d;
import com.avito.android.user_advert.advert.items.machinery_rental_banner.f;
import com.avito.android.user_advert.advert.items.multi_urgency.d;
import com.avito.android.user_advert.advert.items.multiaddresses.d;
import com.avito.android.user_advert.advert.items.parameters.c;
import com.avito.android.user_advert.advert.items.portfolio_empty_widget.d;
import com.avito.android.user_advert.advert.items.portfolio_filled_widget.d;
import com.avito.android.user_advert.advert.items.premier_partner_promo.e;
import com.avito.android.user_advert.advert.items.promo_block_feed.d;
import com.avito.android.user_advert.advert.items.realty.entry_point_client_room.i;
import com.avito.android.user_advert.advert.items.realty.verification.d;
import com.avito.android.user_advert.advert.items.reject.h;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import com.avito.android.user_advert.advert.items.safe_deal_services.switcher.c;
import com.avito.android.user_advert.advert.items.safe_show.d;
import com.avito.android.user_advert.advert.items.sales_contract.d;
import com.avito.android.user_advert.advert.items.service_booking.d;
import com.avito.android.user_advert.advert.items.service_booking_reminder.d;
import com.avito.android.user_advert.advert.items.service_subscription_banner.d;
import com.avito.android.user_advert.advert.items.services.d;
import com.avito.android.user_advert.advert.items.short_term_rent.action.c;
import com.avito.android.user_advert.advert.items.short_term_rent.switcher.c;
import com.avito.android.user_advert.advert.items.short_term_rent.switcher.k;
import com.avito.android.user_advert.advert.items.stats.f;
import com.avito.android.user_advert.advert.items.verification.b;
import com.avito.android.user_advert.advert.request_launcher.i;
import com.avito.android.user_advert.advert.t1;
import com.avito.android.user_advert.di.C35484k;
import com.avito.android.user_advert.di.C35509l;
import com.avito.android.user_advert.di.InterfaceC35534m;
import com.avito.android.user_advert.di.InterfaceC35542v;
import com.avito.android.user_advert.di.InterfaceC35544x;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.Kundle;
import com.avito.android.util.V2;
import cv.InterfaceC39417a;
import gj.InterfaceC40691b;
import gj.o;
import iR.C41336a;
import javax.inject.Inject;
import kI0.InterfaceC42585a;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;
import nI0.InterfaceC44261b;
import q8.InterfaceC47250a;
import z1.AbstractC50339a;

/* compiled from: MyAdvertDetailsActivity.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001b2\u00020\u001c2\u00020\u001d2\u00020\u001e2\u00020\u001f2\u00020 2\u00020!2\u00020\"2\u00020#2\u00020$2\u00020%2\u00020&2\u00020'2\u00020(2\u00020)2\u00020*B\u0007¢\u0006\u0004\b+\u0010,¨\u00063²\u0006&\u00102\u001a\u000201\"\b\b\u0000\u0010.*\u00020-\"\u000e\b\u0001\u00100*\b\u0012\u0004\u0012\u00028\u00000/8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/MyAdvertDetailsActivity;", "Lcom/avito/android/beduin/v2/page/a;", "Lcom/avito/android/user_advert/advert/u1;", "Lcom/avito/android/user_advert/soa_with_price/n;", "Lcom/avito/android/advert_core/advert_badge_bar/e$a;", "Lcom/avito/android/user_advert/advert/items/reject/h$a;", "Lcom/avito/android/user_advert/advert/items/stats/f$a;", "Lcom/avito/android/user_advert/advert/items/services/d$a;", "Lcom/avito/android/user_advert/advert/items/actions_item/c$a;", "Lcom/avito/android/user_advert/advert/items/alert_banner/d$a;", "Lcom/avito/android/user_advert/advert/items/auction_banner/d$a;", "Lcom/avito/android/user_advert/advert/items/gallery/h$a;", "Lcom/avito/android/user_advert/advert/items/verification/b$a;", "Lcom/avito/android/user_advert/advert/items/address/d$a;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/k$a;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/c$a;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/action/c$a;", "Lcom/avito/android/user_advert/advert/items/installments_promoblock/d$a;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/switcher/c$a;", "Lcom/avito/android/user_advert/advert/items/credit_info/d$a;", "Lcom/avito/android/user_advert/advert/items/service_booking/d$a;", "Lcom/avito/android/user_advert/advert/items/service_booking_reminder/d$a;", "Lcom/avito/android/user_advert/advert/items/auto_publish/d$a;", "Lcom/avito/android/user_advert/advert/items/safe_show/d$a;", "Lcom/avito/android/user_advert/advert/items/description/d$a;", "Lcom/avito/android/user_advert/advert/items/sales_contract/d$a;", "Lcom/avito/android/user_advert/advert/items/realty/verification/d$a;", "Lcom/avito/android/advert_core/body_condition/f$a;", "Lcom/avito/android/user_advert/advert/items/parameters/c$a;", "Lcom/avito/android/user_advert/advert/items/promo_block_feed/d$a;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/user_advert/advert/items/premier_partner_promo/e$a;", "Lcom/avito/android/user_advert/advert/items/fill_parameters_banner/e$a;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/d$a;", "Lcom/avito/android/user_advert/advert/items/machinery_rental_banner/f$a;", "Lcom/avito/android/user_advert/advert/items/multi_urgency/d$a;", "Lcom/avito/android/user_advert/advert/items/portfolio_empty_widget/d$a;", "Lcom/avito/android/user_advert/advert/items/portfolio_filled_widget/d$a;", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/i$a;", "Lcom/avito/android/user_advert/advert/items/service_subscription_banner/d$a;", "Lcom/avito/android/user_advert/advert/items/contacts_bbl/f$a;", "Lcom/avito/android/user_advert/advert/items/bbl_contact_history/g$a;", "Lgj/i;", "<init>", "()V", "", "K", "Lcom/avito/android/user_advert/di/m;", "T", "Lcom/avito/android/user_advert/advert/t;", "bannerContextInfoProvider", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MyAdvertDetailsActivity extends com.avito.android.beduin.v2.page.a implements u1, com.avito.android.user_advert.soa_with_price.n, e.a, h.a, f.a, d.a, c.a, d.a, d.a, h.a, b.a, d.a, k.a, c.a, c.a, d.a, c.a, d.a, d.a, d.a, d.a, d.a, d.a, d.a, d.a, f.a, c.a, d.a, InterfaceC28477j.b, e.a, e.a, d.a, f.a, d.a, d.a, d.a, i.a, d.a, f.a, g.a, gj.i {

    /* renamed from: Q0, reason: collision with root package name */
    public static final /* synthetic */ int f308263Q0 = 0;

    /* renamed from: A, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.body_condition.f f308264A;

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.R0 f308265A0;

    /* renamed from: B, reason: collision with root package name */
    @Inject
    public S f308266B;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public C35453u.a f308267B0;

    /* renamed from: C, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f308268C;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public d.a f308269C0;

    /* renamed from: D, reason: collision with root package name */
    @Inject
    public InterfaceC42585a f308270D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f308271D0;

    /* renamed from: E, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.reject.h f308272E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f308273E0;

    /* renamed from: F, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.stats.f f308274F;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f308275F0;

    /* renamed from: G, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.service_subscription_banner.d f308276G;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final ZS.b f308277G0;

    /* renamed from: H, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.services.d f308278H;

    /* renamed from: H0, reason: collision with root package name */
    public C35436m1 f308279H0;

    /* renamed from: I, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.actions_item.c f308280I;

    /* renamed from: I0, reason: collision with root package name */
    public Object f308281I0;

    /* renamed from: J, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.alert_banner.d f308282J;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f308283J0;

    /* renamed from: K, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.auction_banner.d f308284K;

    /* renamed from: K0, reason: collision with root package name */
    public AbstractC35385e f308285K0;

    /* renamed from: L, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.gallery.h f308286L;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.l
    public String f308287L0;

    /* renamed from: M, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.verification.b f308288M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final Handler f308289M0;

    /* renamed from: N, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.address.d f308290N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<com.avito.android.user_advert.advert.request_launcher.e> f308291N0;

    /* renamed from: O, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.short_term_rent.switcher.k f308292O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f308293O0;

    /* renamed from: P, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.short_term_rent.switcher.c f308294P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<kotlin.G0> f308295P0;

    /* renamed from: Q, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.short_term_rent.action.c f308296Q;

    /* renamed from: R, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.safe_deal_services.switcher.c f308297R;

    /* renamed from: S, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.safe_deal_services.list.c f308298S;

    /* renamed from: T, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.installments_promoblock.d f308299T;

    /* renamed from: U, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.credit_info.d f308300U;

    /* renamed from: V, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.service_booking.d f308301V;

    /* renamed from: W, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.service_booking_reminder.d f308302W;

    /* renamed from: X, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.auto_publish.d f308303X;

    /* renamed from: Y, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.safe_show.d f308304Y;

    /* renamed from: Z, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.description.d f308305Z;

    /* renamed from: a0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.sales_contract.d f308306a0;

    /* renamed from: b0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.realty.verification.d f308307b0;

    /* renamed from: c0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.realty.reliable_owner.d f308308c0;

    /* renamed from: d0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f308309d0;

    /* renamed from: e0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f308310e0;

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.parameters.c f308311f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.advert_badge_bar.e f308312g0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.google.common.collect.H1 f308313h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.d0 f308314i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public gj.n f308315j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public InterfaceC40691b f308316k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.promo_block_feed.d f308317l0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f308318m;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.premier_partner_promo.e f308319m0;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.analytics.sharing.a f308320n;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.delegate.auto_select_close.c f308321n0;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC47250a f308322o;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.fill_parameters_banner.e f308323o0;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f308324p;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.multi_urgency.d f308325p0;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC35426j0 f308326q;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.portfolio_filled_widget.d f308327q0;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f308328r;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.portfolio_empty_widget.d f308329r0;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public oO.f f308330s;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public Bt.c f308331s0;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.a f308332t;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.multiaddresses.d f308333t0;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public InterfaceC27793e f308334u;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.machinery_rental_banner.f f308335u0;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public PhotoGalleryIntentFactory f308336v;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.realty.entry_point_client_room.i f308337v0;

    /* renamed from: w, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f308338w;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.contacts_bbl.f f308339w0;

    /* renamed from: x, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f308340x;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_advert.advert.items.bbl_contact_history.g f308341x0;

    /* renamed from: y, reason: collision with root package name */
    @Inject
    public InterfaceC44261b f308342y;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.app_rater.b f308343y0;

    /* renamed from: z, reason: collision with root package name */
    @Inject
    public l90.o f308344z;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public N2 f308345z0;

    /* compiled from: MyAdvertDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LW60/d;", "invoke", "()LW60/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<W60.d> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final W60.d invoke() {
            d.a aVar = MyAdvertDetailsActivity.this.f308269C0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(null);
        }
    }

    /* compiled from: MyAdvertDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/u;", "invoke", "()Lcom/avito/android/user_advert/advert/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<C35453u> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C35453u invoke() {
            C35453u.a aVar = MyAdvertDetailsActivity.this.f308267B0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.create();
        }
    }

    /* compiled from: MyAdvertDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.MyAdvertDetailsActivity$onCreate$1", f = "MyAdvertDetailsActivity.kt", i = {}, l = {517}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308348q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return MyAdvertDetailsActivity.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308348q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f308348q = 1;
                int i13 = MyAdvertDetailsActivity.f308263Q0;
                MyAdvertDetailsActivity myAdvertDetailsActivity = MyAdvertDetailsActivity.this;
                InterfaceC43160i interfaceC43160iR = C43175k.r(new C(new D(((W60.d) myAdvertDetailsActivity.f308275F0.getValue()).getState())));
                com.avito.android.util.R0 r02 = myAdvertDetailsActivity.f308265A0;
                if (r02 == null) {
                    r02 = null;
                }
                Object objCollect = C43175k.I(r02.c(), interfaceC43160iR).collect(new E(myAdvertDetailsActivity), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = kotlin.G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: MyAdvertDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.MyAdvertDetailsActivity$onCreate$2", f = "MyAdvertDetailsActivity.kt", i = {}, l = {518}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308350q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return MyAdvertDetailsActivity.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308350q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f308350q = 1;
                int i13 = MyAdvertDetailsActivity.f308263Q0;
                MyAdvertDetailsActivity myAdvertDetailsActivity = MyAdvertDetailsActivity.this;
                Object objCollect = ((W60.d) myAdvertDetailsActivity.f308275F0.getValue()).getEvents().collect(new F(myAdvertDetailsActivity), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = kotlin.G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f308352l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f308352l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f308352l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return MyAdvertDetailsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return MyAdvertDetailsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: MyAdvertDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "Lcom/avito/android/user_advert/di/m;", "T", "Lcom/avito/android/user_advert/advert/t;", "invoke", "()Lcom/avito/android/user_advert/advert/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<C35451t> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35544x f308355l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC35544x interfaceC35544x) {
            super(0);
            this.f308355l = interfaceC35544x;
        }

        @Override // Y41.a
        public final C35451t invoke() {
            return new C35451t(this.f308355l.m());
        }
    }

    /* compiled from: MyAdvertDetailsActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "K", "Lcom/avito/android/user_advert/di/m;", "T", "Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            int i12 = MyAdvertDetailsActivity.f308263Q0;
            return (com.avito.android.lib.beduin_v2.feature.mvi.x) ((C35453u) MyAdvertDetailsActivity.this.f308273E0.getValue()).f310642L.getValue();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f308357l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f308357l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f308357l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return MyAdvertDetailsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return MyAdvertDetailsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f308360l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Y41.a aVar) {
            super(0);
            this.f308360l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f308360l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return MyAdvertDetailsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return MyAdvertDetailsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/activity/f", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<P0.c> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return MyAdvertDetailsActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/activity/c", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return MyAdvertDetailsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/activity/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return MyAdvertDetailsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public MyAdvertDetailsActivity() {
        p pVar = new p();
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        this.f308271D0 = new androidx.view.O0(n0Var.b(C35398i0.class), new q(), pVar, new r());
        this.f308273E0 = new androidx.view.O0(n0Var.b(C35453u.class), new k(), new j(new b()), new l());
        this.f308275F0 = new androidx.view.O0(n0Var.b(W60.d.class), new n(), new m(new a()), new o());
        this.f308277G0 = new ZS.b(MyAdvertDetailsScreen.f90434d, Owners.f210450U2, "ProfileAdvertisement");
        this.f308289M0 = new Handler(Looper.getMainLooper());
        B b12 = new B(this, 0);
        final B b13 = new B(this, 1);
        final int i12 = 0;
        this.f308291N0 = registerForActivityResult(new com.avito.android.user_advert.advert.request_launcher.g(b12), new androidx.view.result.a() { // from class: com.avito.android.user_advert.advert.request_launcher.f
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        i iVar = (i) obj;
                        if (!(iVar instanceof i.a) && (iVar instanceof i.b)) {
                            ((InterfaceC35426j0) ((B) b13).get()).l8(((i.b) iVar).f310608a);
                            break;
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        B b14 = (B) b13;
                        if (!zBooleanValue) {
                            ((InterfaceC35426j0) b14.get()).X3();
                            break;
                        } else {
                            InterfaceC35426j0.a.a((InterfaceC35426j0) b14.get(), false, null, 7);
                            break;
                        }
                    default:
                        t1.a.a((t1) ((B) b13).get(), false, 3);
                        break;
                }
            }
        });
        final B b14 = new B(this, 2);
        final int i13 = 2;
        this.f308293O0 = registerForActivityResult(new com.avito.android.user_advert.advert.request_launcher.c(), new androidx.view.result.a() { // from class: com.avito.android.user_advert.advert.request_launcher.f
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        i iVar = (i) obj;
                        if (!(iVar instanceof i.a) && (iVar instanceof i.b)) {
                            ((InterfaceC35426j0) ((B) b14).get()).l8(((i.b) iVar).f310608a);
                            break;
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        B b142 = (B) b14;
                        if (!zBooleanValue) {
                            ((InterfaceC35426j0) b142.get()).X3();
                            break;
                        } else {
                            InterfaceC35426j0.a.a((InterfaceC35426j0) b142.get(), false, null, 7);
                            break;
                        }
                    default:
                        t1.a.a((t1) ((B) b14).get(), false, 3);
                        break;
                }
            }
        });
        B b15 = new B(this, 3);
        final B b16 = new B(this, 4);
        final int i14 = 1;
        this.f308295P0 = registerForActivityResult(new com.avito.android.user_advert.advert.request_launcher.a(b15), new androidx.view.result.a() { // from class: com.avito.android.user_advert.advert.request_launcher.f
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i14) {
                    case 0:
                        i iVar = (i) obj;
                        if (!(iVar instanceof i.a) && (iVar instanceof i.b)) {
                            ((InterfaceC35426j0) ((B) b16).get()).l8(((i.b) iVar).f310608a);
                            break;
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        B b142 = (B) b16;
                        if (!zBooleanValue) {
                            ((InterfaceC35426j0) b142.get()).X3();
                            break;
                        } else {
                            InterfaceC35426j0.a.a((InterfaceC35426j0) b142.get(), false, null, 7);
                            break;
                        }
                    default:
                        t1.a.a((t1) ((B) b16).get(), false, 3);
                        break;
                }
            }
        });
    }

    public static AbstractC35385e h2(Intent intent) {
        AbstractC35385e c35388f;
        String stringExtra = intent.getStringExtra("itemId");
        if (stringExtra != null) {
            c35388f = new C35382d(stringExtra);
        } else {
            String stringExtra2 = intent.getStringExtra("key_draft_id");
            c35388f = stringExtra2 != null ? new C35388f(stringExtra2) : null;
        }
        if (c35388f != null) {
            return c35388f;
        }
        throw new IllegalArgumentException("no itemId or draftId as require param");
    }

    public static final <K, T extends InterfaceC35534m<K>> K m2(MyAdvertDetailsActivity myAdvertDetailsActivity, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str, l0.h<Kundle> hVar, T t12) {
        InterfaceC35544x interfaceC35544x = (InterfaceC35544x) C29972i.a(C29972i.b(myAdvertDetailsActivity), InterfaceC35544x.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(myAdvertDetailsActivity);
        com.avito.android.analytics.screens.r rVarA = com.avito.android.analytics.screens.s.a(myAdvertDetailsActivity);
        com.avito.android.analytics.screens.tracker.F fA2 = interfaceC35544x.b().a(new C28478k(MyAdvertDetailsScreen.f90434d, rVarA, null, 4, null));
        com.avito.android.lib.beduin_v2.feature.di.H hA2 = com.avito.android.lib.beduin_v2.feature.di.K.a(interfaceC35544x.ed(), fA2, myAdvertDetailsActivity.f308277G0, new cv.d(interfaceC39417aA), null, null, null, 56);
        androidx.view.O0 o02 = new androidx.view.O0(kotlin.jvm.internal.m0.f406844a.b(C35451t.class), myAdvertDetailsActivity.new f(), new e(new h(interfaceC35544x)), myAdvertDetailsActivity.new g());
        InterfaceC35534m interfaceC35534mB = t12.q(interfaceC35544x).t(interfaceC39417aA).c(((com.avito.android.personal_banner.feature.factory.c) interfaceC35544x.m3()).a(new W60.a("seller-card.top", "ProfileAdvertisement_seller-card.top"), C42727D.c(myAdvertDetailsActivity.new i()), fA2, (C35451t) o02.getValue(), interfaceC35544x, hA2)).g(hA2).s(myAdvertDetailsActivity).l(myAdvertDetailsActivity).u(myAdvertDetailsActivity).w(myAdvertDetailsActivity).e(rVarA).b(myAdvertDetailsActivity.getResources());
        AbstractC35385e abstractC35385e = myAdvertDetailsActivity.f308285K0;
        if (abstractC35385e == null) {
            abstractC35385e = null;
        }
        return (K) interfaceC35534mB.n(abstractC35385e).v(myAdvertDetailsActivity.f308287L0).j(z12).a(z13).i(z14).o(z15).d(z16).r(z17).k(str).f(hVar.f406842b).m((C35398i0) myAdvertDetailsActivity.f308271D0.getValue()).h(fA2).p((C35451t) o02.getValue()).build();
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        return (RecyclerView) K1().findViewById(R.id.my_advert_recycler_view);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.my_adverts_details;
    }

    @Override // com.avito.android.ui.activity.a
    @Y61.k
    public final a.g O1() {
        return new com.avito.android.employee_stub_impl.view.a(this, new com.avito.android.deeplink_handler.view.impl.i(this), 4);
    }

    @Override // com.avito.android.user_advert.soa_with_price.n
    public final void W(@Y61.k CloseReason closeReason, @Y61.l String str) {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.I6(closeReason, str);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [T, com.avito.android.util.Kundle] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Object objM2;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("status_message");
        boolean booleanExtra = intent.getBooleanExtra("key_should_finish_after_activation", false);
        boolean z12 = getCallingActivity() == null;
        MyAdvertPostAction myAdvertPostAction = (MyAdvertPostAction) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_extra_action", MyAdvertPostAction.class) : intent.getParcelableExtra("key_extra_action"));
        boolean z13 = myAdvertPostAction == MyAdvertPostAction.Restore.f308370b;
        boolean z14 = myAdvertPostAction == MyAdvertPostAction.Activate.f308366b;
        boolean booleanExtra2 = intent.getBooleanExtra("key_is_new_advert", false);
        boolean booleanExtra3 = intent.getBooleanExtra("key_advert_with_video", false);
        l0.h hVar = new l0.h();
        if (bundle != null) {
            hVar.f406842b = com.avito.android.util.G.a(bundle, "presenter_state");
        }
        AbstractC35385e abstractC35385e = this.f308285K0;
        if (abstractC35385e == null) {
            abstractC35385e = null;
        }
        if (abstractC35385e instanceof C35382d) {
            objM2 = m2(this, booleanExtra2, booleanExtra3, z14, z12, booleanExtra, z13, stringExtra, hVar, C35484k.a());
            ((InterfaceC35542v) objM2).a(this);
        } else {
            if (!(abstractC35385e instanceof C35388f)) {
                throw new NoWhenBranchMatchedException();
            }
            objM2 = m2(this, booleanExtra2, booleanExtra3, z14, z12, booleanExtra, z13, stringExtra, hVar, C35509l.a());
            ((com.avito.android.user_advert.di.V) objM2).a(this);
        }
        this.f308281I0 = objM2;
        InterfaceC42585a interfaceC42585a = this.f308270D;
        if (interfaceC42585a == null) {
            interfaceC42585a = null;
        }
        interfaceC42585a.a(fA2.b());
        InterfaceC42585a interfaceC42585a2 = this.f308270D;
        (interfaceC42585a2 != null ? interfaceC42585a2 : null).w(this, Q1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.user_advert.advert.u1
    public final void a(@Y61.k DeepLink deepLink) {
        kotlin.Q q12;
        String str;
        String str2;
        if ((deepLink instanceof ChannelDetailsLink) || (deepLink instanceof ChannelsLink)) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f308324p;
            if (aVar == null) {
                aVar = null;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("with_up_intent", false);
            kotlin.G0 g02 = kotlin.G0.f406611a;
            b.a.a(aVar, deepLink, null, bundle, 2);
            return;
        }
        boolean z12 = deepLink instanceof BeduinUniversalPageLink;
        if (z12 && (str2 = ((BeduinUniversalPageLink) deepLink).f133038b) != null && C43066x.q(str2, "1/delivery/switchers", false) && C43066x.q(str2, "toggleType", false)) {
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f308324p;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, deepLink, "switcher_deeplink_request_safedeal_key", null, 4);
            return;
        }
        if (z12 && (str = ((BeduinUniversalPageLink) deepLink).f133038b) != null && C43066x.q(str, "1/delivery/switchers", false)) {
            com.avito.android.deeplink_handler.handler.composite.a aVar3 = this.f308324p;
            if (aVar3 == null) {
                aVar3 = null;
            }
            b.a.a(aVar3, deepLink, "switcher_deeplink_request_key", null, 4);
            return;
        }
        if (!(deepLink instanceof MyAdvertLink.EditLink)) {
            com.avito.android.deeplink_handler.handler.composite.a aVar4 = this.f308324p;
            if (aVar4 == null) {
                aVar4 = null;
            }
            b.a.a(aVar4, deepLink, null, null, 6);
            return;
        }
        MyAdvertLink.EditLink editLink = (MyAdvertLink.EditLink) deepLink;
        if (editLink instanceof MyAdvertLink.Edit) {
            q12 = new kotlin.Q(((MyAdvertLink.Edit) editLink).f133489c, Boolean.valueOf(((MyAdvertLink.Edit) editLink).f133492f));
        } else {
            if (!(editLink instanceof MyAdvertLink.EditV1)) {
                throw new NoWhenBranchMatchedException();
            }
            q12 = new kotlin.Q(((MyAdvertLink.EditV1) editLink).f133499c, Boolean.valueOf(((MyAdvertLink.EditV1) editLink).f133502f));
        }
        String str3 = (String) q12.f406619b;
        if (((Boolean) q12.f406620c).booleanValue()) {
            InterfaceC28373a interfaceC28373a = this.f308318m;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new iI0.q(str3));
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar5 = this.f308324p;
        if (aVar5 == null) {
            aVar5 = null;
        }
        b.a.a(aVar5, deepLink, null, null, 6);
    }

    public final void a2(@Y61.k ActionsItem.Action action) {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.Qa(action);
    }

    public final void b2(@Y61.k com.avito.android.user_advert.advert.items.auto_publish.a aVar, boolean z12) {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.L1(aVar, z12);
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        o.a aVar = new o.a(K1(), ToastBarPosition.f181047e);
        C35436m1 c35436m1 = this.f308279H0;
        if (c35436m1 == null) {
            c35436m1 = null;
        }
        return new gj.o(aVar, new o.a(c35436m1.f310565t, ToastBarPosition.f181045c));
    }

    public final void c2(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f308324p;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
    }

    @Override // androidx.core.app.ActivityC22757o, FV0.d
    public final void close() {
        k0(-1, false, null, null, null);
    }

    public final void d2(@Y61.k com.avito.android.user_advert.advert.items.reject.a aVar, @Y61.k DeepLink deepLink) {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.ud(aVar, deepLink);
    }

    public final void e2(@Y61.k DeepLink deepLink) {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.X0(deepLink);
    }

    @Override // com.avito.android.advert_core.advert_badge_bar.e.a, com.avito.android.advert_core.body_condition.f.a
    public final void f(@Y61.k DeepLink deepLink) {
        a(deepLink);
    }

    public final void f2(@Y61.l DeepLink deepLink) {
        if (deepLink != null) {
            a(deepLink);
        }
    }

    public final void g2(@Y61.k com.avito.android.user_advert.advert.items.gallery.c cVar, int i12) {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.U0(cVar, i12);
    }

    public final void i2(@Y61.k com.avito.android.user_advert.advert.items.installments_promoblock.a aVar) {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.P0(aVar);
    }

    @Override // com.avito.android.user_advert.advert.u1
    public final void k0(int i12, boolean z12, @Y61.l String str, @Y61.l AdvertActionTransferData advertActionTransferData, @Y61.l DeepLink deepLink) {
        V2.f318762a.c("MyAdvertDetailsActivity", "setActivityResult: resultCode=" + i12, null);
        Intent intent = this.f304538c;
        if (intent == null) {
            Intent intent2 = new Intent();
            intent2.putExtra("advert_action", advertActionTransferData);
            intent2.putExtra("soa_update_message", str);
            intent2.putExtra("should_show_app_rater", z12);
            intent2.putExtra("delivery_restriction", deepLink);
            setResult(i12, intent2);
        } else {
            startActivity(intent);
            Intent intent3 = new Intent();
            intent3.putExtra("advert_action", advertActionTransferData);
            intent3.putExtra("soa_update_message", str);
            intent3.putExtra("should_show_app_rater", z12);
            intent3.putExtra("delivery_restriction", deepLink);
            intent3.setAction("com.avito.android.USER_ADVERT_STATUS_CHANGE");
            this.f308289M0.postDelayed(new A(this, intent3, 1), 500L);
        }
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        (interfaceC35426j0 != null ? interfaceC35426j0 : null).s0();
        finish();
    }

    public final void k2() {
        this.f308295P0.b(kotlin.G0.f406611a);
    }

    public final void l2(@Y61.k c.b.a aVar, boolean z12) {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.P1(aVar, z12);
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    public final void n2(@Y61.k OH0.e eVar, boolean z12) {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.B1(eVar, z12);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        C41336a.C11375a.a();
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.i0();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        this.f308285K0 = h2(getIntent());
        this.f308287L0 = getIntent().getStringExtra("skipCpt");
        Intent intent = getIntent();
        this.f304538c = (Intent) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("up_intent", Intent.class) : intent.getParcelableExtra("up_intent"));
        if (bundle != null) {
            this.f308283J0 = bundle.getBoolean("advert_status_updated", false);
        }
        super.onCreate(bundle);
        InterfaceC42585a interfaceC42585a = this.f308270D;
        if (interfaceC42585a == null) {
            interfaceC42585a = null;
        }
        interfaceC42585a.e();
        View viewK1 = K1();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        InterfaceC35426j0 interfaceC35426j02 = interfaceC35426j0 != null ? interfaceC35426j0 : null;
        InterfaceC28373a interfaceC28373a = this.f308318m;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.konveyor.adapter.a aVar = this.f308310e0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.j jVar = this.f308309d0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.google.common.collect.H1 h12 = this.f308313h0;
        com.google.common.collect.H1 h13 = h12 != null ? h12 : null;
        InterfaceC40691b interfaceC40691b = this.f308316k0;
        InterfaceC40691b interfaceC40691b2 = interfaceC40691b != null ? interfaceC40691b : null;
        com.avito.android.user_advert.advert.delegate.auto_select_close.c cVar = this.f308321n0;
        com.avito.android.user_advert.advert.delegate.auto_select_close.c cVar2 = cVar != null ? cVar : null;
        InterfaceC42585a interfaceC42585a2 = this.f308270D;
        InterfaceC42585a interfaceC42585a3 = interfaceC42585a2 != null ? interfaceC42585a2 : null;
        com.avito.android.app_rater.b bVar = this.f308343y0;
        com.avito.android.app_rater.b bVar2 = bVar != null ? bVar : null;
        N2 n22 = this.f308345z0;
        N2 n23 = n22 != null ? n22 : null;
        n2<BannerState> state = ((W60.d) this.f308275F0.getValue()).getState();
        n2<com.avito.android.lib.beduin_v2.beduin_item.a> state2 = ((C35453u) this.f308273E0.getValue()).getState();
        com.avito.android.util.R0 r02 = this.f308265A0;
        C35436m1 c35436m1 = new C35436m1(viewK1, supportFragmentManager, interfaceC35426j02, aVar2, interfaceC28373a2, jVar2, h13, interfaceC40691b2, cVar2, interfaceC42585a3, bVar2, n23, state, state2, r02 != null ? r02 : null, C22981N.a(getLifecycle()));
        this.f308279H0 = c35436m1;
        InterfaceC35426j0 interfaceC35426j03 = this.f308326q;
        if (interfaceC35426j03 == null) {
            interfaceC35426j03 = null;
        }
        interfaceC35426j03.d4(c35436m1);
        InterfaceC35426j0 interfaceC35426j04 = this.f308326q;
        if (interfaceC35426j04 == null) {
            interfaceC35426j04 = null;
        }
        interfaceC35426j04.n5(getIntent().getBooleanExtra("show_app_rater", false));
        gj.n nVar = this.f308315j0;
        if (nVar == null) {
            nVar = null;
        }
        com.avito.android.beduin.view.c cVarA = nVar.a(this, this, this, null);
        InterfaceC40691b interfaceC40691b3 = this.f308316k0;
        if (interfaceC40691b3 == null) {
            interfaceC40691b3 = null;
        }
        cVarA.l(interfaceC40691b3);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
        InterfaceC42585a interfaceC42585a4 = this.f308270D;
        (interfaceC42585a4 != null ? interfaceC42585a4 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.e0();
        if (!isChangingConfigurations()) {
            InterfaceC40691b interfaceC40691b = this.f308316k0;
            (interfaceC40691b != null ? interfaceC40691b : null).onCleared();
        }
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f308285K0 = h2(intent);
        this.f308287L0 = intent.getStringExtra("skipCpt");
        MyAdvertPostAction myAdvertPostAction = (MyAdvertPostAction) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_extra_action", MyAdvertPostAction.class) : intent.getParcelableExtra("key_extra_action"));
        boolean booleanExtra = intent.getBooleanExtra("key_is_new_advert", false);
        boolean booleanExtra2 = intent.getBooleanExtra("key_should_finish_after_activation", false);
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        InterfaceC35426j0 interfaceC35426j02 = interfaceC35426j0 != null ? interfaceC35426j0 : null;
        AbstractC35385e abstractC35385e = this.f308285K0;
        interfaceC35426j02.wd(abstractC35385e == null ? null : abstractC35385e, this.f308287L0, getIntent().getStringExtra("status_message"), myAdvertPostAction, booleanExtra, booleanExtra2);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_invoke_action", DeepLink.class) : intent.getParcelableExtra("key_invoke_action"));
        getIntent().removeExtra("key_invoke_action");
        if (deepLink != null) {
            InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.w9(deepLink);
        }
        String stringExtra = getIntent().getStringExtra("key_instant_message");
        getIntent().removeExtra("key_instant_message");
        if (stringExtra != null) {
            C35436m1 c35436m1 = this.f308279H0;
            (c35436m1 != null ? c35436m1 : null).f(stringExtra);
        }
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        com.avito.android.util.G.c(bundle, "presenter_state", interfaceC35426j0.Ua());
        bundle.putBoolean("advert_status_updated", this.f308283J0);
        bundle.putBundle("key_screen_tracker_state", Bundle.EMPTY);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.J2(this);
        com.avito.android.user_advert.advert.items.reject.h hVar = this.f308272E;
        if (hVar == null) {
            hVar = null;
        }
        hVar.Z4(this);
        com.avito.android.user_advert.advert.items.stats.f fVar = this.f308274F;
        if (fVar == null) {
            fVar = null;
        }
        fVar.Y1(this);
        com.avito.android.user_advert.advert.items.services.d dVar = this.f308278H;
        if (dVar == null) {
            dVar = null;
        }
        dVar.T5(this);
        com.avito.android.user_advert.advert.items.service_subscription_banner.d dVar2 = this.f308276G;
        if (dVar2 == null) {
            dVar2 = null;
        }
        dVar2.a6(this);
        com.avito.android.user_advert.advert.items.actions_item.c cVar = this.f308280I;
        if (cVar == null) {
            cVar = null;
        }
        cVar.v2(this);
        com.avito.android.user_advert.advert.items.alert_banner.d dVar3 = this.f308282J;
        if (dVar3 == null) {
            dVar3 = null;
        }
        dVar3.H2(this);
        com.avito.android.user_advert.advert.items.auction_banner.d dVar4 = this.f308284K;
        if (dVar4 == null) {
            dVar4 = null;
        }
        dVar4.s4(this);
        com.avito.android.user_advert.advert.items.gallery.h hVar2 = this.f308286L;
        if (hVar2 == null) {
            hVar2 = null;
        }
        hVar2.p2(this);
        com.avito.android.user_advert.advert.items.verification.b bVar = this.f308288M;
        if (bVar == null) {
            bVar = null;
        }
        bVar.I1(this);
        com.avito.android.user_advert.advert.items.address.d dVar5 = this.f308290N;
        if (dVar5 == null) {
            dVar5 = null;
        }
        dVar5.B2(this);
        com.avito.android.user_advert.advert.items.short_term_rent.switcher.k kVar = this.f308292O;
        if (kVar == null) {
            kVar = null;
        }
        kVar.c1(this);
        com.avito.android.user_advert.advert.items.short_term_rent.switcher.c cVar2 = this.f308294P;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.j1(this);
        com.avito.android.user_advert.advert.items.short_term_rent.action.c cVar3 = this.f308296Q;
        if (cVar3 == null) {
            cVar3 = null;
        }
        cVar3.L5(this);
        com.avito.android.user_advert.advert.items.safe_deal_services.switcher.c cVar4 = this.f308297R;
        if (cVar4 == null) {
            cVar4 = null;
        }
        cVar4.N4(this);
        com.avito.android.user_advert.advert.items.safe_deal_services.list.c cVar5 = this.f308298S;
        if (cVar5 == null) {
            cVar5 = null;
        }
        cVar5.U4(this);
        com.avito.android.user_advert.advert.items.credit_info.d dVar6 = this.f308300U;
        if (dVar6 == null) {
            dVar6 = null;
        }
        dVar6.n1(this);
        com.avito.android.user_advert.advert.items.service_booking.d dVar7 = this.f308301V;
        if (dVar7 == null) {
            dVar7 = null;
        }
        dVar7.q5(this);
        com.avito.android.user_advert.advert.items.service_booking_reminder.d dVar8 = this.f308302W;
        if (dVar8 == null) {
            dVar8 = null;
        }
        dVar8.l5(this);
        com.avito.android.user_advert.advert.items.installments_promoblock.d dVar9 = this.f308299T;
        if (dVar9 == null) {
            dVar9 = null;
        }
        dVar9.m2(this);
        com.avito.android.user_advert.advert.items.auto_publish.d dVar10 = this.f308303X;
        if (dVar10 == null) {
            dVar10 = null;
        }
        dVar10.N2(this);
        com.avito.android.user_advert.advert.items.safe_show.d dVar11 = this.f308304Y;
        if (dVar11 == null) {
            dVar11 = null;
        }
        dVar11.E5(this);
        com.avito.android.user_advert.advert.items.description.d dVar12 = this.f308305Z;
        if (dVar12 == null) {
            dVar12 = null;
        }
        dVar12.p1(this);
        com.avito.android.user_advert.advert.items.sales_contract.d dVar13 = this.f308306a0;
        if (dVar13 == null) {
            dVar13 = null;
        }
        dVar13.w5(this);
        com.avito.android.user_advert.advert.items.realty.verification.d dVar14 = this.f308307b0;
        if (dVar14 == null) {
            dVar14 = null;
        }
        dVar14.Y2(this);
        com.avito.android.user_advert.advert.items.parameters.c cVar6 = this.f308311f0;
        if (cVar6 == null) {
            cVar6 = null;
        }
        cVar6.Q2(this);
        com.avito.android.advert_core.body_condition.f fVar2 = this.f308264A;
        if (fVar2 == null) {
            fVar2 = null;
        }
        fVar2.z6(this);
        com.avito.android.advert_core.advert_badge_bar.e eVar = this.f308312g0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.M2(this);
        com.avito.android.user_advert.advert.items.promo_block_feed.d dVar15 = this.f308317l0;
        if (dVar15 == null) {
            dVar15 = null;
        }
        dVar15.b3(this);
        com.avito.android.user_advert.advert.items.premier_partner_promo.e eVar2 = this.f308319m0;
        if (eVar2 == null) {
            eVar2 = null;
        }
        eVar2.s2(this);
        com.avito.android.user_advert.advert.items.fill_parameters_banner.e eVar3 = this.f308323o0;
        if (eVar3 == null) {
            eVar3 = null;
        }
        eVar3.u1(this);
        com.avito.android.user_advert.advert.items.multi_urgency.d dVar16 = this.f308325p0;
        if (dVar16 == null) {
            dVar16 = null;
        }
        dVar16.j2(this);
        com.avito.android.user_advert.advert.items.portfolio_filled_widget.d dVar17 = this.f308327q0;
        if (dVar17 == null) {
            dVar17 = null;
        }
        dVar17.y2(this);
        com.avito.android.user_advert.advert.items.portfolio_empty_widget.d dVar18 = this.f308329r0;
        if (dVar18 == null) {
            dVar18 = null;
        }
        dVar18.E2(this);
        com.avito.android.user_advert.advert.items.multiaddresses.d dVar19 = this.f308333t0;
        if (dVar19 == null) {
            dVar19 = null;
        }
        dVar19.e2(this);
        com.avito.android.user_advert.advert.items.machinery_rental_banner.f fVar3 = this.f308335u0;
        if (fVar3 == null) {
            fVar3 = null;
        }
        fVar3.S3(this);
        com.avito.android.user_advert.advert.items.realty.entry_point_client_room.i iVar = this.f308337v0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.Y3(this);
        com.avito.android.user_advert.advert.items.contacts_bbl.f fVar4 = this.f308339w0;
        if (fVar4 == null) {
            fVar4 = null;
        }
        fVar4.h1(this);
        com.avito.android.user_advert.advert.items.bbl_contact_history.g gVar = this.f308341x0;
        (gVar != null ? gVar : null).b1(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        InterfaceC35426j0 interfaceC35426j0 = this.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.c0();
        com.avito.android.user_advert.advert.items.reject.h hVar = this.f308272E;
        if (hVar == null) {
            hVar = null;
        }
        hVar.c0();
        com.avito.android.user_advert.advert.items.stats.f fVar = this.f308274F;
        if (fVar == null) {
            fVar = null;
        }
        fVar.c0();
        com.avito.android.user_advert.advert.items.services.d dVar = this.f308278H;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c0();
        com.avito.android.user_advert.advert.items.actions_item.c cVar = this.f308280I;
        if (cVar == null) {
            cVar = null;
        }
        cVar.c0();
        com.avito.android.user_advert.advert.items.alert_banner.d dVar2 = this.f308282J;
        if (dVar2 == null) {
            dVar2 = null;
        }
        dVar2.c0();
        com.avito.android.user_advert.advert.items.auction_banner.d dVar3 = this.f308284K;
        if (dVar3 == null) {
            dVar3 = null;
        }
        dVar3.e();
        com.avito.android.user_advert.advert.items.gallery.h hVar2 = this.f308286L;
        if (hVar2 == null) {
            hVar2 = null;
        }
        hVar2.c0();
        com.avito.android.user_advert.advert.items.verification.b bVar = this.f308288M;
        if (bVar == null) {
            bVar = null;
        }
        bVar.c0();
        com.avito.android.user_advert.advert.items.address.d dVar4 = this.f308290N;
        if (dVar4 == null) {
            dVar4 = null;
        }
        dVar4.c0();
        com.avito.android.user_advert.advert.items.short_term_rent.switcher.k kVar = this.f308292O;
        if (kVar == null) {
            kVar = null;
        }
        kVar.c0();
        com.avito.android.user_advert.advert.items.short_term_rent.switcher.c cVar2 = this.f308294P;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.c0();
        com.avito.android.user_advert.advert.items.short_term_rent.action.c cVar3 = this.f308296Q;
        if (cVar3 == null) {
            cVar3 = null;
        }
        cVar3.c0();
        com.avito.android.user_advert.advert.items.safe_deal_services.switcher.c cVar4 = this.f308297R;
        if (cVar4 == null) {
            cVar4 = null;
        }
        cVar4.c0();
        com.avito.android.user_advert.advert.items.safe_deal_services.list.c cVar5 = this.f308298S;
        if (cVar5 == null) {
            cVar5 = null;
        }
        cVar5.c0();
        com.avito.android.user_advert.advert.items.credit_info.d dVar5 = this.f308300U;
        if (dVar5 == null) {
            dVar5 = null;
        }
        dVar5.c0();
        com.avito.android.user_advert.advert.items.service_booking.d dVar6 = this.f308301V;
        if (dVar6 == null) {
            dVar6 = null;
        }
        dVar6.c0();
        com.avito.android.user_advert.advert.items.service_booking_reminder.d dVar7 = this.f308302W;
        if (dVar7 == null) {
            dVar7 = null;
        }
        dVar7.c0();
        com.avito.android.user_advert.advert.items.installments_promoblock.d dVar8 = this.f308299T;
        if (dVar8 == null) {
            dVar8 = null;
        }
        dVar8.c0();
        com.avito.android.user_advert.advert.items.auto_publish.d dVar9 = this.f308303X;
        if (dVar9 == null) {
            dVar9 = null;
        }
        dVar9.c0();
        com.avito.android.user_advert.advert.items.safe_show.d dVar10 = this.f308304Y;
        if (dVar10 == null) {
            dVar10 = null;
        }
        dVar10.c0();
        com.avito.android.user_advert.advert.items.description.d dVar11 = this.f308305Z;
        if (dVar11 == null) {
            dVar11 = null;
        }
        dVar11.c0();
        com.avito.android.user_advert.advert.items.sales_contract.d dVar12 = this.f308306a0;
        if (dVar12 == null) {
            dVar12 = null;
        }
        dVar12.c0();
        com.avito.android.user_advert.advert.items.realty.verification.d dVar13 = this.f308307b0;
        if (dVar13 == null) {
            dVar13 = null;
        }
        dVar13.c0();
        com.avito.android.user_advert.advert.items.parameters.c cVar6 = this.f308311f0;
        if (cVar6 == null) {
            cVar6 = null;
        }
        cVar6.c0();
        com.avito.android.advert_core.body_condition.f fVar2 = this.f308264A;
        if (fVar2 == null) {
            fVar2 = null;
        }
        fVar2.c0();
        com.avito.android.advert_core.advert_badge_bar.e eVar = this.f308312g0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.c0();
        com.avito.android.user_advert.advert.items.promo_block_feed.d dVar14 = this.f308317l0;
        if (dVar14 == null) {
            dVar14 = null;
        }
        dVar14.c0();
        com.avito.android.user_advert.advert.items.premier_partner_promo.e eVar2 = this.f308319m0;
        if (eVar2 == null) {
            eVar2 = null;
        }
        eVar2.c0();
        com.avito.android.user_advert.advert.items.fill_parameters_banner.e eVar3 = this.f308323o0;
        if (eVar3 == null) {
            eVar3 = null;
        }
        eVar3.c0();
        com.avito.android.user_advert.advert.items.multi_urgency.d dVar15 = this.f308325p0;
        if (dVar15 == null) {
            dVar15 = null;
        }
        dVar15.c0();
        com.avito.android.user_advert.advert.items.portfolio_filled_widget.d dVar16 = this.f308327q0;
        if (dVar16 == null) {
            dVar16 = null;
        }
        dVar16.c0();
        com.avito.android.user_advert.advert.items.portfolio_empty_widget.d dVar17 = this.f308329r0;
        if (dVar17 == null) {
            dVar17 = null;
        }
        dVar17.c0();
        com.avito.android.user_advert.advert.items.multiaddresses.d dVar18 = this.f308333t0;
        if (dVar18 == null) {
            dVar18 = null;
        }
        dVar18.c0();
        com.avito.android.user_advert.advert.items.machinery_rental_banner.f fVar3 = this.f308335u0;
        if (fVar3 == null) {
            fVar3 = null;
        }
        fVar3.e();
        com.avito.android.user_advert.advert.items.realty.entry_point_client_room.i iVar = this.f308337v0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.e();
        com.avito.android.user_advert.advert.items.contacts_bbl.f fVar4 = this.f308339w0;
        if (fVar4 == null) {
            fVar4 = null;
        }
        fVar4.c0();
        com.avito.android.user_advert.advert.items.bbl_contact_history.g gVar = this.f308341x0;
        (gVar != null ? gVar : null).c0();
        super.onStop();
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
    }
}
