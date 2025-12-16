package com.avito.android.advert.item;

import Ds.InterfaceC13437a;
import KV.a;
import LV.c;
import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import cU.s;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.advert.InterfaceC28243x;
import com.avito.android.advert.item.Z1;
import com.avito.android.advert.item.advert_badge_bar_light.AdvertDetailsBadgeBarLightItem;
import com.avito.android.advert.item.anchor_trust_factors.AdvertDetailsAnchorTrustFactorsItem;
import com.avito.android.advert.item.beduin.v2.g;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.advert.item.d2;
import com.avito.android.advert.item.delivery_suggests.AdvertDetailsDeliverySuggestsItem;
import com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.AdvertDetailsHotelOfferItem;
import com.avito.android.advert.item.mortgage_calculator.MortgageCalculatorItem;
import com.avito.android.advert.item.select.controls.AutoSelectControlsItem;
import com.avito.android.advert.item.short_term_rent.str_buttons.AdvertDetailsShortTermRentStrButtonsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.advert_badge_bar.AdvertBadgeBarItem;
import com.avito.android.advert_core.contactbar.InterfaceC28264c;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_core.item_showed_observer.c;
import com.avito.android.advert_core.map.AdvertMapItem;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.app_rater.events.AppRaterEventSourcePage;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.credits.CreditCalculatorItem;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import com.avito.android.paranja.ParanjaState;
import com.avito.android.paranja.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.GeoZones;
import com.avito.android.remote.model.LocationMap;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.remote.model.service_seller_type.Onboarding;
import com.avito.android.section.title.SectionTitleItem;
import com.avito.android.section.title.with_action.SectionTitleWithActionItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.recomendations.ExpandableSectionItem;
import com.avito.android.util.C35976x4;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.L5;
import com.avito.android.util.bottom_gap.e;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.BeduinView;
import com.avito.konveyor.exception.BlueprintNotSupportedException;
import dd0.InterfaceC39708a;
import dd0.InterfaceC39709b;
import g7.C40540a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Provider;
import k4.C42501e;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlinx.coroutines.C43259k;
import y7.InterfaceC50074a;

/* compiled from: AdvertDetailsView.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/I1;", "Lcom/avito/android/advert/item/i1;", "Landroidx/lifecycle/O;", "Lcom/avito/android/advert_core/contactbar/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I1 implements InterfaceC28137i1, InterfaceC22982O, InterfaceC28264c {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.autoteka.teaser_v3.c f71639A;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final TextView f71640A0;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.autoteka_select.teaser.c f71641B;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final TextView f71642B0;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.note.c f71643C;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public LinearLayout f71644C0;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13437a f71645D;

    /* renamed from: D0, reason: collision with root package name */
    public final int f71646D0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.h1 f71647E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public BeduinView f71648E0;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.Y0 f71649F;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.beduin.v2.i f71650F0;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f71651G;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_core.advert.q f71652G0;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final C14700d f71653H;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.commercials.e f71654H0;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.L0 f71655I;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public C40540a f71656I0;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f71657J;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.advert_badge_bar_light.a f71658J0;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.item_visibility_tracker.b f71659K;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final ArrayList f71660K0;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.beduin.v2.b f71661L;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final UV0.c<com.avito.android.serp.adapter.i1> f71662L0;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.closable.c f71663M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.l
    public RecyclerView f71664M0;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite_apprater.g f71665N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.beduin.v2.a f71666N0;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N f71667O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public List<C42501e.a> f71668O0;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final Ax.e f71669P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f71670P0;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final A7.b f71671Q;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.l
    public androidx.appcompat.app.l f71672Q0;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39709b f71673R;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f71674R0;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27811a f71675S;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public final GridLayoutManager f71676S0;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.price_list.preview.f f71677T;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f71678T0;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.map.d f71679U;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.component.snackbar.d f71680U0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.a f71681V;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f71682V0;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.floating_view.a f71683W;

    /* renamed from: W0, reason: collision with root package name */
    public boolean f71684W0;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.commercials.f f71685X;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.l
    public String f71686X0;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final ProgressInfoToastBar.a f71687Y;

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.l
    public Boolean f71688Y0;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.services_review_volunteers.e f71689Z;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.l
    public Boolean f71690Z0;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C27814a2 f71691a0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.l
    public Parcelable f71692a1;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f71693b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsFragment f71694b0;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f71695b1;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.advert.item.complementary.b> f71696c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.neighboring_dates.d f71697c0;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f71698c1;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.l f71699d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.video_snippets.g f71700d0;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.l
    public Integer f71701d1;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z0 f71702e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final ZS.b f71703e0;

    /* renamed from: e1, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f71704e1;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50074a f71705f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f71706f0;

    /* renamed from: f1, reason: collision with root package name */
    @Y61.k
    public final C28217v1 f71707f1;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f71708g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.beduin.v2.di.a f71709g0;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f71710g1;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFragment f71711h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f71712h0;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f71713h1;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.short_term_rent.str_buttons.c f71714i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_rater.a f71715i0;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f71716i1;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.interiorPhotos.g f71717j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final C29640d f71718j0;

    /* renamed from: j1, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.complementary.b f71719j1;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f71720k;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f71721k0;

    /* renamed from: k1, reason: collision with root package name */
    @Y61.l
    public cU.s f71722k1;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.f f71723l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.O0 f71724l0;

    /* renamed from: l1, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.navbar.c f71725l1;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.section.action.b f71726m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f71727m0;

    /* renamed from: m1, reason: collision with root package name */
    @Y61.k
    public final X1 f71728m1;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final S f71729n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.internal.S0 f71730n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.sellersubscription.p f71731o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.bottom_gap.e f71732o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28130g0 f71733p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.bottom_gap.c f71734p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f71735q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Z0 f71736q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28280j f71737r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.sellerprofile.a0 f71738r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f71739s;

    /* renamed from: s0, reason: collision with root package name */
    public final Context f71740s0;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final z7.b f71741t;

    /* renamed from: t0, reason: collision with root package name */
    public final Resources f71742t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.anchor_trust_factors.topbar.a f71743u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f71744u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.anchor_trust_factors.l f71745v;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_core.contactbar.A f71746v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28243x f71747w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.hotel.hotel_offer.floating_view.i f71748w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14698b f71749x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f71750x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.autoteka.teaser.i f71751y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final ViewStub f71752y0;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.autoteka.teaser_v2.c f71753z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final View f71754z0;

    /* compiled from: AdvertDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            I1.this.f71731o.d();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ApiError.ErrorDialog f71756l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f71757m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ApiError.ErrorDialog errorDialog, Y41.a<kotlin.G0> aVar) {
            super(2);
            this.f71756l = errorDialog;
            this.f71757m = aVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            Action action;
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            ApiError.ErrorDialog errorDialog = this.f71756l;
            bVar2.setTitle(errorDialog.getUserDialog().getTitle());
            bVar2.setSubtitle(errorDialog.getUserDialog().getMessage());
            bVar2.setCloseButtonVisible(errorDialog.getUserDialog().getCancelable());
            List<Action> actions = errorDialog.getUserDialog().getActions();
            if (actions != null && (action = (Action) C42745f0.G(actions)) != null) {
                bVar2.L3(action.getTitle(), new J1(this.f71757m, dialogInterface2));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/paranja/ParanjaState$ClickPosition;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/paranja/ParanjaState$ClickPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<ParanjaState.ClickPosition, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f71758l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a<kotlin.G0> aVar) {
            super(1);
            this.f71758l = aVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(ParanjaState.ClickPosition clickPosition) {
            this.f71758l.invoke();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.paranja.h f71759l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.paranja.h hVar) {
            super(0);
            this.f71759l = hVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f71759l.setState(new ParanjaState(ParanjaState.State.f210856c, null, null, 6, null));
            return kotlin.G0.f406611a;
        }
    }

    public I1(@Y61.k View view, @Y61.k Provider provider, @Y61.k com.avito.android.advert_core.advert.l lVar, @Y61.k Z0 z02, @Y61.k InterfaceC50074a interfaceC50074a, @Y61.k com.avito.android.util.R0 r02, @Y61.l AdvertDetailsFragment advertDetailsFragment, @Y61.k com.avito.android.advert.item.short_term_rent.str_buttons.c cVar, @Y61.k com.avito.android.advert.item.interiorPhotos.g gVar, @Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.advert.viewed.f fVar, @Y61.k com.avito.android.section.action.b bVar, @Y61.k S s5, @Y61.k com.avito.android.advert.item.sellersubscription.p pVar, @Y61.k InterfaceC28130g0 interfaceC28130g0, @Y61.k InterfaceC35945t1 interfaceC35945t1, @Y61.k InterfaceC28280j interfaceC28280j, @Y61.k InterfaceC28265d interfaceC28265d, @Y61.k z7.b bVar2, @Y61.k com.avito.android.advert.item.anchor_trust_factors.topbar.a aVar, @Y61.k com.avito.android.advert.item.anchor_trust_factors.l lVar2, @Y61.k InterfaceC28243x interfaceC28243x, @Y61.k InterfaceC14698b interfaceC14698b, @Y61.k com.avito.android.advert.item.autoteka.teaser.i iVar, @Y61.k com.avito.android.advert.item.autoteka.teaser_v2.c cVar2, @Y61.k com.avito.android.advert.item.autoteka.teaser_v3.c cVar3, @Y61.k com.avito.android.advert.item.autoteka_select.teaser.c cVar4, @Y61.k com.avito.android.advert.item.note.c cVar5, @Y61.k InterfaceC13437a interfaceC13437a, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.serp.adapter.h1 h1Var, @Y61.k GridLayoutManager.c cVar6, @Y61.k com.avito.android.serp.adapter.Y0 y02, @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k C14700d c14700d, @Y61.k com.avito.android.util.L0 l02, @Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.konveyor.item_visibility_tracker.b bVar3, @Y61.k com.avito.android.advert.item.beduin.v2.b bVar4, @Y61.k com.avito.android.serp.adapter.closable.c cVar7, @Y61.k com.avito.android.favorite_apprater.g gVar2, @Y61.k com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n12, @Y61.k Ax.e eVar, @Y61.k A7.b bVar5, @Y61.k InterfaceC39709b interfaceC39709b, @Y61.k InterfaceC27811a interfaceC27811a, @Y61.k com.avito.android.advert_core.price_list.preview.f fVar2, @Y61.k com.avito.android.advert_core.map.d dVar, @Y61.k com.avito.android.advert.item.similars.a aVar3, @Y61.k com.avito.android.advert.item.hotel.hotel_offer.floating_view.a aVar4, @Y61.k com.avito.android.advert.item.commercials.f fVar3, @Y61.k ProgressInfoToastBar.a aVar5, @Y61.k com.avito.android.advert.item.services_review_volunteers.e eVar2, @Y61.k C27814a2 c27814a2, @Y61.k AdvertDetailsFragment advertDetailsFragment2, @Y61.k com.avito.android.advert.item.neighboring_dates.d dVar2, @Y61.k com.avito.android.video_snippets.g gVar3, @Y61.k ZS.b bVar6, @Y61.k com.avito.android.advert_core.analytics.a aVar6, @Y61.k com.avito.android.advert.item.beduin.v2.di.a aVar7, @Y61.k com.avito.android.util.text.a aVar8, @Y61.k com.avito.android.app_rater.a aVar9, @Y61.k C29640d c29640d, boolean z12, @Y61.k com.avito.android.util.O0 o02, @Y61.k com.avito.konveyor.a aVar10, @Y61.k com.avito.android.mortgage_calculator.internal.S0 s02, @Y61.k com.avito.android.util.bottom_gap.e eVar3, @Y61.k com.avito.android.util.bottom_gap.c cVar8, @Y61.k com.avito.android.Z0 z03, @Y61.k com.avito.android.advert_details_items.sellerprofile.a0 a0Var) throws BlueprintNotSupportedException {
        this.f71693b = view;
        this.f71696c = provider;
        this.f71699d = lVar;
        this.f71702e = z02;
        this.f71705f = interfaceC50074a;
        this.f71708g = r02;
        this.f71711h = advertDetailsFragment;
        this.f71714i = cVar;
        this.f71717j = gVar;
        this.f71720k = nVar;
        this.f71723l = fVar;
        this.f71726m = bVar;
        this.f71729n = s5;
        this.f71731o = pVar;
        this.f71733p = interfaceC28130g0;
        this.f71735q = interfaceC35945t1;
        this.f71737r = interfaceC28280j;
        this.f71739s = interfaceC28265d;
        this.f71741t = bVar2;
        this.f71743u = aVar;
        this.f71745v = lVar2;
        this.f71747w = interfaceC28243x;
        this.f71749x = interfaceC14698b;
        this.f71751y = iVar;
        this.f71753z = cVar2;
        this.f71639A = cVar3;
        this.f71641B = cVar4;
        this.f71643C = cVar5;
        this.f71645D = interfaceC13437a;
        this.f71647E = h1Var;
        this.f71649F = y02;
        this.f71651G = aVar2;
        this.f71653H = c14700d;
        this.f71655I = l02;
        this.f71657J = jVar;
        this.f71659K = bVar3;
        this.f71661L = bVar4;
        this.f71663M = cVar7;
        this.f71665N = gVar2;
        this.f71667O = n12;
        this.f71669P = eVar;
        this.f71671Q = bVar5;
        this.f71673R = interfaceC39709b;
        this.f71675S = interfaceC27811a;
        this.f71677T = fVar2;
        this.f71679U = dVar;
        this.f71681V = aVar3;
        this.f71683W = aVar4;
        this.f71685X = fVar3;
        this.f71687Y = aVar5;
        this.f71689Z = eVar2;
        this.f71691a0 = c27814a2;
        this.f71694b0 = advertDetailsFragment2;
        this.f71697c0 = dVar2;
        this.f71700d0 = gVar3;
        this.f71703e0 = bVar6;
        this.f71706f0 = aVar6;
        this.f71709g0 = aVar7;
        this.f71712h0 = aVar8;
        this.f71715i0 = aVar9;
        this.f71718j0 = c29640d;
        this.f71721k0 = z12;
        this.f71724l0 = o02;
        this.f71727m0 = aVar10;
        this.f71730n0 = s02;
        this.f71732o0 = eVar3;
        this.f71734p0 = cVar8;
        this.f71736q0 = z03;
        this.f71738r0 = a0Var;
        this.f71740s0 = view.getContext();
        this.f71742t0 = view.getResources();
        this.f71744u0 = (FrameLayout) view.findViewById(R.id.advert_details_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.advert_details_recycler);
        this.f71750x0 = recyclerView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.contact_bar_container);
        View viewFindViewById = view.findViewById(R.id.toast_item_popularity_stub);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
        }
        this.f71752y0 = (ViewStub) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_details_preload_skeleton_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f71754z0 = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.preload_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f71640A0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.preload_price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f71642B0 = (TextView) viewFindViewById4;
        this.f71646D0 = recyclerView.getResources().getDimensionPixelSize(R.dimen.contact_bar_glow_padding);
        ArrayList arrayList = new ArrayList();
        this.f71660K0 = arrayList;
        this.f71662L0 = new UV0.c<>(arrayList);
        this.f71668O0 = C42784z0.f406748b;
        this.f71670P0 = C42727D.c(new C28229z1(this));
        this.f71704e1 = new io.reactivex.rxjava3.disposables.c();
        this.f71707f1 = new C28217v1(this);
        ((androidx.recyclerview.widget.O) recyclerView.getItemAnimator()).f53727g = false;
        recyclerView.getRecycledViewPool().e(aVar10.Y(com.avito.android.advert.item.mortgage_calculator.a.class), 1);
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(jVar.a(), 1);
        this.f71676S0 = gridLayoutManager;
        gridLayoutManager.f53667M = cVar6;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.o(new C28163r1(this));
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.avito.android.advert.item.j1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                I1 i110 = this.f77195b;
                if (i110.G()) {
                    BeduinView beduinView = i110.f71648E0;
                    i110.y(beduinView != null ? Z1.b(beduinView) : null);
                } else {
                    i110.x(!r2.getF83165I(), i110.f71739s.getF83165I());
                }
            }
        });
        eVar.e(recyclerView);
        recyclerView.o(dVar.D4());
        interfaceC13437a.getF3511Q().observe(interfaceC22983P, new Z1.a(new C28172s1(this)));
        bVar5.b(recyclerView);
        com.avito.android.arch.mvi.android.f.a(c27814a2, advertDetailsFragment2.getViewLifecycleOwner(), Lifecycle.State.f46682e, new C1(1, this, I1.class, "handleEvent", "handleEvent(Ljava/lang/Object;)V", 0), new E1(this));
        InterfaceC22983P viewLifecycleOwner = advertDetailsFragment2.getViewLifecycleOwner();
        C43259k.d(C22984Q.a(viewLifecycleOwner), null, null, new B1(viewLifecycleOwner, this, null), 3);
        this.f71728m1 = new X1(this);
    }

    public static Integer B(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, View view) {
        View viewY;
        if (view == null || (viewY = linearLayoutManager.Y(view)) == null) {
            return null;
        }
        recyclerView.getClass();
        int iU2 = RecyclerView.U(viewY);
        Integer numValueOf = Integer.valueOf(iU2);
        if (iU2 != -1) {
            return numValueOf;
        }
        return null;
    }

    public static final kotlin.Q u(I1 i12, RecyclerView recyclerView, View view) {
        View view2;
        i12.getClass();
        ViewParent parent = view.getParent();
        while (true) {
            view2 = view;
            view = parent;
            if (view == null || view.equals(recyclerView) || !(view instanceof View)) {
                break;
            }
            parent = view.getParent();
        }
        int layoutPosition = recyclerView.W(view2).getLayoutPosition();
        Integer numValueOf = Integer.valueOf(layoutPosition);
        if (layoutPosition == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new kotlin.Q(Integer.valueOf(numValueOf.intValue()), view2);
        }
        return null;
    }

    public final void A(int i12, @Y61.k ArrayList arrayList, boolean z12) {
        com.avito.android.advert.item.advert_badge_bar_light.a aVar;
        Object next;
        Object objPrevious;
        com.avito.android.advert_core.contactbar.A a12;
        Iterator it = arrayList.iterator();
        while (true) {
            aVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            com.avito.android.serp.adapter.i1 i1Var = (com.avito.android.serp.adapter.i1) next;
            if ((i1Var instanceof AdvertDetailsContactBarItem) || (i1Var instanceof AutoSelectControlsItem) || (i1Var instanceof AdvertDetailsShortTermRentStrButtonsItem)) {
                break;
            }
        }
        if (next == null && (a12 = this.f71746v0) != null) {
            a12.a().hide();
        }
        Iterator it2 = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            } else if (((com.avito.android.serp.adapter.i1) it2.next()) instanceof AdvertMapItem) {
                break;
            } else {
                i13++;
            }
        }
        com.avito.android.advert_core.map.d dVar = this.f71679U;
        com.avito.android.advert_core.map.l lVarD4 = dVar.D4();
        boolean z13 = lVarD4.f83778c != -1;
        boolean z14 = i13 <= -1;
        if (!z13 && !z14) {
            lVarD4.f83778c = i13;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f71660K0;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        RecyclerView recyclerView = this.f71750x0;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f71659K;
        C14700d c14700d = this.f71653H;
        UV0.c<com.avito.android.serp.adapter.i1> cVar = this.f71662L0;
        if (adapter == null) {
            C28211t1 c28211t1 = new C28211t1();
            com.avito.android.serp.adapter.Y0 y02 = this.f71649F;
            y02.f(c28211t1);
            y02.c(cVar);
            this.f71647E.c(cVar);
            this.f71720k.c(cVar);
            this.f71723l.c(cVar);
            this.f71651G.c(cVar);
            this.f71663M.c(cVar);
            recyclerView.setAdapter(c14700d);
            if (!G()) {
                bVar.a(recyclerView, null);
            }
        } else {
            C23424o.e eVarA = C23424o.a(new C28214u1(arrayList2, arrayList), true);
            if (z12) {
                eVarA.b(c14700d);
            } else {
                RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
                recyclerView.setItemAnimator(null);
                eVarA.b(c14700d);
                recyclerView.post(new RunnableC28146l1(this, itemAnimator, 0));
            }
        }
        if (!G()) {
            bVar.c(cVar);
        }
        if (i12 >= 0) {
            com.avito.android.advert_core.advert.q qVar = this.f71652G0;
            if (qVar != null) {
                recyclerView.r0(qVar);
            }
            com.avito.android.advert.item.commercials.e eVar = this.f71654H0;
            if (eVar != null) {
                recyclerView.r0(eVar);
            }
            C40540a c40540a = this.f71656I0;
            if (c40540a != null) {
                recyclerView.r0(c40540a);
            }
            com.avito.android.advert.item.advert_badge_bar_light.a aVar2 = this.f71658J0;
            if (aVar2 != null) {
                recyclerView.r0(aVar2);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            int i14 = 0;
            while (it3.hasNext()) {
                Object next2 = it3.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.android.serp.adapter.i1 i1Var2 = (com.avito.android.serp.adapter.i1) next2;
                if ((i1Var2 instanceof SectionTitleItem) || (i1Var2 instanceof SectionTitleWithActionItem) || (i1Var2 instanceof ExpandableSectionItem)) {
                    arrayList4.add(Integer.valueOf(i14));
                }
                i14 = i15;
            }
            List listA0 = C42745f0.A0(arrayList4);
            com.avito.android.advert.item.similars.j jVar = this.f71657J;
            int iA2 = jVar.a();
            View view = this.f71693b;
            com.avito.android.advert_core.advert.q qVar2 = new com.avito.android.advert_core.advert.q(iA2, view.getResources(), this.f71655I, 0, 8, null);
            com.avito.android.advert.item.commercials.e eVar2 = new com.avito.android.advert.item.commercials.e(jVar.a(), view.getResources(), this.f71655I);
            ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((com.avito.android.serp.adapter.i1) objPrevious) instanceof ExpandableSectionItem) {
                        break;
                    }
                }
            }
            ExpandableSectionItem expandableSectionItem = objPrevious instanceof ExpandableSectionItem ? (ExpandableSectionItem) objPrevious : null;
            C40540a c40540a2 = new C40540a(listA0, expandableSectionItem != null ? expandableSectionItem.f270543e : false, view.getResources());
            com.avito.android.advert.item.advert_badge_bar_light.a aVar3 = new com.avito.android.advert.item.advert_badge_bar_light.a();
            if (arrayList3 == null || !arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    com.avito.android.serp.adapter.i1 i1Var3 = (com.avito.android.serp.adapter.i1) it4.next();
                    if ((i1Var3 instanceof AdvertDetailsBadgeBarLightItem) && ((AdvertDetailsBadgeBarLightItem) i1Var3).f72680e) {
                        aVar = aVar3;
                        break;
                    }
                }
            }
            this.f71652G0 = qVar2;
            this.f71654H0 = eVar2;
            this.f71656I0 = c40540a2;
            this.f71658J0 = aVar;
            recyclerView.l(qVar2, -1);
            recyclerView.l(eVar2, -1);
            recyclerView.l(c40540a2, -1);
            if (aVar != null) {
                recyclerView.l(aVar, -1);
            }
        }
        com.avito.android.advert_core.map.l lVarD42 = dVar.D4();
        if (lVarD42.f83778c == -1 || lVarD42.f83777b.B4()) {
            return;
        }
        recyclerView.postDelayed(new J11.c(23, lVarD42, recyclerView), 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean C() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.I1.C():java.lang.Boolean");
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f71750x0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Y61.l
    public final Integer D(@Y61.k String str) {
        kotlin.reflect.d dVarB;
        kotlin.jvm.internal.n0 n0Var;
        Class cls;
        int iNextIndex;
        Integer numValueOf;
        ArrayList arrayList;
        int iNextIndex2;
        if (G()) {
            com.avito.android.advert.item.beduin.v2.i iVar = this.f71650F0;
            if (iVar == null || (arrayList = iVar.f73358e) == null) {
                return null;
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex2 = -1;
                    break;
                }
                if (kotlin.jvm.internal.L.f(((com.avito.android.advert.item.beduin.v2.g) listIterator.previous()).f73347o, str)) {
                    iNextIndex2 = listIterator.nextIndex();
                    break;
                }
            }
            numValueOf = Integer.valueOf(iNextIndex2);
            if (iNextIndex2 == -1) {
                return null;
            }
        } else {
            switch (str.hashCode()) {
                case -862612386:
                    if (str.equals(AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS)) {
                        n0Var = kotlin.jvm.internal.m0.f406844a;
                        cls = AdvertDetailsAnchorTrustFactorsItem.class;
                        dVarB = n0Var.b(cls);
                        break;
                    }
                    dVarB = null;
                    break;
                case 139848659:
                    if (str.equals(AdvertDetailsBlockIdKt.BLOCK_ID_CONTACT_BAR)) {
                        n0Var = kotlin.jvm.internal.m0.f406844a;
                        cls = AdvertDetailsContactBarItem.class;
                        dVarB = n0Var.b(cls);
                        break;
                    }
                    dVarB = null;
                    break;
                case 458736106:
                    if (str.equals(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)) {
                        n0Var = kotlin.jvm.internal.m0.f406844a;
                        cls = AdvertDetailsFlatsItem.class;
                        dVarB = n0Var.b(cls);
                        break;
                    }
                    dVarB = null;
                    break;
                case 1708969347:
                    if (str.equals(AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_DELIVERY_SUGGESTS)) {
                        n0Var = kotlin.jvm.internal.m0.f406844a;
                        cls = AdvertDetailsDeliverySuggestsItem.class;
                        dVarB = n0Var.b(cls);
                        break;
                    }
                    dVarB = null;
                    break;
                case 2047851034:
                    if (str.equals(AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR)) {
                        n0Var = kotlin.jvm.internal.m0.f406844a;
                        cls = CreditCalculatorItem.class;
                        dVarB = n0Var.b(cls);
                        break;
                    }
                    dVarB = null;
                    break;
                case 2146345328:
                    if (str.equals(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)) {
                        n0Var = kotlin.jvm.internal.m0.f406844a;
                        cls = AdvertBadgeBarItem.class;
                        dVarB = n0Var.b(cls);
                        break;
                    }
                    dVarB = null;
                    break;
                default:
                    dVarB = null;
                    break;
            }
            ArrayList arrayList2 = this.f71660K0;
            ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    iNextIndex = -1;
                } else if (kotlin.jvm.internal.m0.f406844a.b(((com.avito.android.serp.adapter.i1) listIterator2.previous()).getClass()).equals(dVarB)) {
                    iNextIndex = listIterator2.nextIndex();
                }
            }
            numValueOf = Integer.valueOf(iNextIndex);
            if (iNextIndex == -1) {
                return null;
            }
        }
        return numValueOf;
    }

    public final int E() {
        View viewFindViewById = this.f71693b.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        int[] iArr = new int[2];
        toolbar.getLocationOnScreen(iArr);
        return toolbar.getHeight() + iArr[1];
    }

    public final void F(@Y61.l BlockItem blockItem, int i12) {
        if (i12 >= 0) {
            ArrayList arrayList = this.f71660K0;
            if (i12 >= arrayList.size()) {
                return;
            }
            arrayList.add(i12, blockItem);
            this.f71653H.notifyItemInserted(i12);
        }
    }

    public final boolean G() {
        return (this.f71648E0 == null || this.f71716i1) ? false : true;
    }

    public final void H(int i12) {
        this.f71693b.performHapticFeedback(i12);
    }

    public final void I(@Y61.k MortgageCalculatorItem mortgageCalculatorItem) {
        this.f71730n0.accept(new b.C32744a(mortgageCalculatorItem.f77659b));
    }

    @Y61.k
    public final cU.s Iv() {
        cU.s sVar = this.f71722k1;
        if (sVar != null) {
            return sVar;
        }
        Context context = this.f71740s0;
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(context), s.b.class)).fd();
        cU.m mVar = new cU.m(this.f71709g0);
        C27814a2 c27814a2 = this.f71691a0;
        cU.t tVarA = aVarFd.a(context, this.f71671Q, c27814a2.f72496J, mVar, c27814a2.f72497K.f398526b.a());
        this.f71722k1 = tVarA;
        return tVarA;
    }

    public final void J() {
        com.avito.android.advert_core.item_showed_observer.c cVar = (com.avito.android.advert_core.item_showed_observer.c) this.f71670P0.getValue();
        c.a aVar = cVar.f83710d;
        if (aVar != null) {
            cVar.f83707a.v0(aVar);
        }
        cVar.f83710d = null;
        io.reactivex.rxjava3.internal.observers.y yVar = cVar.f83708b;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        cVar.f83711e.clear();
    }

    @Y61.l
    public final Parcelable K() {
        RecyclerView recyclerViewB;
        RecyclerView.m layoutManager;
        BeduinView beduinView = this.f71648E0;
        if (beduinView == null || (recyclerViewB = Z1.b(beduinView)) == null || (layoutManager = recyclerViewB.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.Y0();
    }

    public final void L(int i12, int i13) {
        if (G()) {
            Z(i12, i13, true);
        } else {
            d2.a.b(i12, i13, 4, this);
        }
    }

    public final void O(int i12, int i13) {
        this.f71676S0.b2(i12, i13);
    }

    public final void P(boolean z12) {
        this.f71698c1 = z12;
        h0();
    }

    public final void R(boolean z12, boolean z13) {
        if (z13) {
            this.f71693b.postDelayed(new D.b(3, this, z12), 500L);
            return;
        }
        InterfaceC50074a interfaceC50074a = this.f71705f;
        if (z12) {
            interfaceC50074a.a();
        } else {
            interfaceC50074a.q1();
        }
    }

    public final void S() throws Resources.NotFoundException {
        L5.b(this.f71740s0, this.f71742t0.getString(R.string.advert_core_address_is_copied), 0);
    }

    public final void T(@Y61.l String str, @Y61.k String str2, @Y61.l MultiAddressesInfo multiAddressesInfo, @Y61.k Coordinates coordinates, @Y61.k String str3, @Y61.l List<GeoReference> list, @Y61.l SellerAddressesInfo sellerAddressesInfo, @Y61.l RouteButtons routeButtons, @Y61.l List<AmenityButton> list2, boolean z12, @Y61.l ContactBarData contactBarData, @Y61.l AdvertActions advertActions, @Y61.l String str4, @Y61.l LocationMap locationMap, @Y61.l String str5, @Y61.l String str6, @Y61.l Boolean bool, @Y61.l GeoZones geoZones, boolean z13, boolean z14) {
        this.f71702e.p(str, str2, multiAddressesInfo, coordinates, str3, list, sellerAddressesInfo, routeButtons, list2, z12, contactBarData, advertActions, str4, locationMap, str6, bool, geoZones, z13, z14);
    }

    public final void U() {
        ru.avito.component.dialog.c cVar = ru.avito.component.dialog.c.f430348a;
        Context context = this.f71693b.getContext();
        a aVar = new a();
        cVar.getClass();
        ru.avito.component.dialog.c.a(context, aVar);
    }

    public final void V(@Y61.k ApiError.ErrorDialog errorDialog, @Y61.k Y41.a<kotlin.G0> aVar) {
        com.avito.android.lib.design.modal.a aVar2 = this.f71674R0;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this.f71693b.getContext(), new b(errorDialog, aVar));
        this.f71674R0 = aVarC;
        com.avito.android.lib.util.g.a(aVarC);
    }

    public final void W(@Y61.k ApiError apiError) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f71750x0, com.avito.android.printable_text.b.f(com.avito.android.error.z.k(apiError)), null, null, null, new f.c(apiError), 0, null, null, false, false, null, null, 4078);
    }

    public final void X(@Y61.k PrintableText printableText, @Y61.l PrintableText printableText2, @Y61.l Y41.a<kotlin.G0> aVar) {
        Context context = this.f71740s0;
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f71693b, printableText, null, (printableText2 == null || aVar == null) ? null : Collections.singletonList(new c.a.C3719a(printableText2.k0(context), false, null, aVar, 6, null)), null, null, 0, null, null, false, false, null, new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23), 2042);
    }

    public final void Y(@Y61.k Class cls, int i12, boolean z12) {
        if (G()) {
            C29640d c29640d = this.f71718j0;
            c29640d.getClass();
            kotlin.reflect.n<Object> nVar = C29640d.f132175X[21];
            if (((Boolean) c29640d.f132219v.a().invoke()).booleanValue()) {
                d0(i12, z12, null, new S1(cls));
                return;
            } else {
                b0(i12, z12, new T1(cls));
                return;
            }
        }
        Iterator it = this.f71660K0.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (cls.isInstance((com.avito.android.serp.adapter.i1) it.next())) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            Z(i13, i12, z12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(int r4, int r5, boolean r6) {
        /*
            r3 = this;
            boolean r0 = r3.G()
            if (r0 == 0) goto L17
            com.avito.beduin.v2.render.android_view.BeduinView r0 = r3.f71648E0
            if (r0 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = com.avito.android.advert.item.Z1.b(r0)
            if (r0 == 0) goto L15
        L10:
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            goto L1a
        L15:
            r0 = 0
            goto L1a
        L17:
            androidx.recyclerview.widget.RecyclerView r0 = r3.f71750x0
            goto L10
        L1a:
            if (r0 == 0) goto L28
            com.avito.android.advert.item.U1 r1 = new com.avito.android.advert.item.U1
            android.content.Context r2 = r3.f71740s0
            r1.<init>(r2, r5, r6)
            r1.f53878a = r4
            r0.x1(r1)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.I1.Z(int, int, boolean):void");
    }

    @Override // com.avito.android.component.toast.util.g
    public final void a(@Y61.k PrintableText printableText, int i12, @Y61.l String str, @Y61.l Y41.a aVar, @Y61.k ToastBarPosition toastBarPosition, @Y61.k com.avito.android.component.toast.f fVar) {
        com.avito.android.lib.design.toast_bar.k kVar = this.f71682V0;
        if (kVar != null) {
            kVar.f();
        }
        this.f71682V0 = com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f71693b, i12 != 0 ? com.avito.android.printable_text.b.c(i12, new Serializable[0]) : printableText, null, (str == null || aVar == null) ? null : Collections.singletonList(new c.a.C3719a(str, false, null, aVar, 6, null)), null, fVar, 2750, toastBarPosition, null, false, false, null, null, 3978);
    }

    public final void b0(int i12, boolean z12, Y41.l lVar) {
        RecyclerView recyclerViewB;
        RecyclerView.m layoutManager;
        com.avito.android.advert.item.beduin.v2.i iVar;
        C28220w1 c28220w1;
        Object next;
        com.avito.konveyor.adapter.b bVar;
        View view;
        RecyclerView recyclerViewB2;
        RecyclerView.Adapter adapter;
        BeduinView beduinView = this.f71648E0;
        if (beduinView == null || (recyclerViewB = Z1.b(beduinView)) == null || (layoutManager = recyclerViewB.getLayoutManager()) == null || (iVar = this.f71650F0) == null) {
            return;
        }
        Iterator it = iVar.o().iterator();
        while (true) {
            c28220w1 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Boolean) lVar.invoke(((g.b) next).f73352a)).booleanValue()) {
                    break;
                }
            }
        }
        g.b bVar2 = (g.b) next;
        if (bVar2 == null || (bVar = bVar2.f73353b) == null || (view = bVar.itemView) == null) {
            return;
        }
        V1 v12 = new V1(this, recyclerViewB, view);
        BeduinView beduinView2 = this.f71648E0;
        if (beduinView2 != null && (recyclerViewB2 = Z1.b(beduinView2)) != null && (adapter = recyclerViewB2.getAdapter()) != null) {
            c28220w1 = new C28220w1(v12, adapter, i12, z12, this.f71740s0);
        }
        layoutManager.x1(c28220w1);
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28264c
    public final void c() {
        this.f71678T0 = true;
        if (!G()) {
            x(true, false);
        } else {
            BeduinView beduinView = this.f71648E0;
            y(beduinView != null ? Z1.b(beduinView) : null);
        }
    }

    @Override // com.avito.android.advert.item.d2
    public final void d(int i12, @Y61.k String str) {
        if (G()) {
            b0(i12, false, new R1(str));
            return;
        }
        Iterator it = this.f71660K0.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (kotlin.jvm.internal.L.f(((com.avito.android.serp.adapter.i1) it.next()).getF72678c(), str)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            Z(i13, i12, false);
        }
    }

    public final void d0(final int i12, final boolean z12, View view, final Y41.l lVar) {
        RecyclerView recyclerViewB;
        RecyclerView.m layoutManager;
        com.avito.android.advert.item.beduin.v2.i iVar;
        C28220w1 c28220w1;
        Object next;
        final View view2;
        View view3;
        RecyclerView recyclerViewB2;
        RecyclerView.Adapter adapter;
        com.avito.konveyor.adapter.b bVar;
        View view4;
        BeduinView beduinView = this.f71648E0;
        if (beduinView == null || (recyclerViewB = Z1.b(beduinView)) == null || (layoutManager = recyclerViewB.getLayoutManager()) == null || (iVar = this.f71650F0) == null) {
            return;
        }
        Iterator it = iVar.o().iterator();
        while (true) {
            c28220w1 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Boolean) ((S1) lVar).invoke(((g.b) next).f73352a)).booleanValue()) {
                    break;
                }
            }
        }
        g.b bVar2 = (g.b) next;
        if (bVar2 == null || (bVar = bVar2.f73353b) == null || (view4 = bVar.itemView) == null) {
            view2 = ((g.b) C42745f0.Q(iVar.o())).f73353b.itemView;
            view3 = view;
        } else {
            view3 = view;
            view2 = view4;
        }
        if (view2.equals(view3)) {
            return;
        }
        W1 w12 = new W1(this, recyclerViewB, view2);
        BeduinView beduinView2 = this.f71648E0;
        if (beduinView2 != null && (recyclerViewB2 = Z1.b(beduinView2)) != null && (adapter = recyclerViewB2.getAdapter()) != null) {
            c28220w1 = new C28220w1(w12, adapter, i12, z12, this.f71740s0);
        }
        layoutManager.x1(c28220w1);
        BeduinView beduinView3 = this.f71648E0;
        if (beduinView3 != null) {
            beduinView3.postDelayed(new Runnable() { // from class: com.avito.android.advert.item.n1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77739b.d0(i12, z12, view2, lVar);
                }
            }, 200L);
        }
    }

    @Override // qK0.d
    public final void destroy() {
        ArrayList arrayList;
        RecyclerView recyclerView = this.f71750x0;
        recyclerView.setAdapter(null);
        this.f71669P.a();
        com.avito.android.util.N0.a(this.f71719j1);
        InterfaceC28130g0 interfaceC28130g0 = this.f71733p;
        interfaceC28130g0.c0();
        InterfaceC28280j interfaceC28280j = this.f71737r;
        interfaceC28280j.c0();
        interfaceC28280j.I();
        this.f71683W.e0();
        this.f71726m.c0();
        this.f71720k.I();
        this.f71723l.e0();
        this.f71749x.destroy();
        com.avito.android.advert.item.autoteka.teaser.i iVar = this.f71751y;
        iVar.e0();
        iVar.c0();
        this.f71753z.c0();
        this.f71639A.c0();
        this.f71729n.e0();
        this.f71665N.e0();
        interfaceC28130g0.D8();
        com.avito.android.advert.item.note.c cVar = this.f71643C;
        cVar.e0();
        cVar.c0();
        com.avito.android.advert.item.anchor_trust_factors.topbar.a aVar = this.f71743u;
        aVar.b();
        aVar.c();
        com.avito.android.advert.item.anchor_trust_factors.l lVar = this.f71745v;
        lVar.b();
        lVar.c();
        lVar.c0();
        com.avito.android.advert.item.sellersubscription.p pVar = this.f71731o;
        pVar.e0();
        pVar.c0();
        this.f71677T.c0();
        this.f71689Z.c0();
        this.f71704e1.e();
        com.avito.android.component.snackbar.d dVar = this.f71680U0;
        if (dVar != null) {
            dVar.a();
        }
        com.avito.android.lib.design.toast_bar.k kVar = this.f71682V0;
        if (kVar != null) {
            kVar.f();
        }
        RecyclerView recyclerView2 = this.f71664M0;
        if (recyclerView2 != null) {
            recyclerView2.v0(this.f71707f1);
            this.f71661L.a();
        }
        this.f71664M0 = null;
        this.f71675S.e0();
        this.f71681V.onCleared();
        this.f71685X.onCleared();
        this.f71697c0.e0();
        com.avito.android.util.bottom_gap.e eVar = this.f71732o0;
        Iterator it = eVar.f318833a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = eVar.f318834b;
            if (!zHasNext) {
                break;
            }
            e.a aVar2 = (e.a) it.next();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                aVar2.b((View) it2.next());
            }
        }
        arrayList.clear();
        com.avito.android.advert.navbar.c cVar2 = this.f71725l1;
        if (cVar2 != null) {
            recyclerView.v0(cVar2);
        }
        this.f71738r0.e0();
    }

    public final void f0() {
        RecyclerView recyclerView = this.f71750x0;
        X1 x12 = this.f71728m1;
        recyclerView.t0(x12);
        recyclerView.m(x12);
        x12.a(null, false);
    }

    public final boolean g0(int i12, @Y61.k Onboarding onboarding) {
        View viewFindViewById = this.f71693b.findViewById(i12);
        if (viewFindViewById != null) {
            Rect rect = new Rect();
            if (!viewFindViewById.getLocalVisibleRect(rect) || rect.width() != viewFindViewById.getWidth() || rect.height() != viewFindViewById.getHeight()) {
                viewFindViewById = null;
            }
            if (viewFindViewById != null) {
                com.avito.android.paranja.h hVar = new com.avito.android.paranja.h(viewFindViewById);
                d dVar = new d(hVar);
                androidx.appcompat.view.d dVar2 = new androidx.appcompat.view.d(hVar.getContext(), R.style.Theme_DesignSystem_Re23);
                int iB2 = y6.b(8);
                f.a aVar = new f.a(iB2, iB2, iB2, iB2);
                float fB2 = y6.b(8);
                a.C0572a c0572a = KV.a.f9464v;
                c0572a.getClass();
                hVar.setStyle(new com.avito.android.paranja.f(aVar, dVar2.getColor(R.color.overlayBackground), fB2, KV.a.a((KV.a) c.a.a(c0572a, dVar2, R.attr.tooltipInverse), -1, 0, 0, 2097150)));
                hVar.setState(new ParanjaState(ParanjaState.State.f210855b, new c(dVar), new com.avito.android.paranja.g(new r.d(new i.a(new b.a())), false, onboarding.getTitle(), onboarding.getSubtitle(), null, null, null, null, true, 240, null)));
                return true;
            }
        }
        return false;
    }

    public final void h0() {
        Boolean boolC = C();
        if (boolC != null) {
            boolean zBooleanValue = boolC.booleanValue();
            com.avito.android.advert_core.contactbar.A a12 = this.f71746v0;
            if (a12 != null) {
                if (zBooleanValue) {
                    a12.c();
                } else {
                    a12.a().hide();
                }
            }
        }
    }

    @Override // com.avito.android.bottom_navigation.z
    public final void i(boolean z12) {
        this.f71684W0 = z12;
        if (G()) {
            BeduinView beduinView = this.f71648E0;
            y(beduinView != null ? Z1.b(beduinView) : null);
        } else {
            h0();
            z();
        }
    }

    public final void i0(@Y61.l PersistableSpannedItem persistableSpannedItem) {
        if (persistableSpannedItem != null) {
            ArrayList arrayList = this.f71660K0;
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (kotlin.jvm.internal.L.f(((com.avito.android.serp.adapter.i1) it.next()).getF72678c(), persistableSpannedItem.getF72678c())) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 >= 0) {
                arrayList.remove(i12);
                arrayList.add(i12, persistableSpannedItem);
                this.f71653H.notifyItemChanged(i12);
            }
        }
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ia(@Y61.k ProgressInfoToastBarData progressInfoToastBarData) {
        Parcelable.Creator<ProgressInfoToastBar.InitialFlow> creator = ProgressInfoToastBar.InitialFlow.CREATOR;
        InterfaceC39708a interfaceC39708aA = this.f71673R.a(progressInfoToastBarData);
        com.avito.android.progress_info_toast_bar.d dVarA = this.f71687Y.a(this.f71740s0, progressInfoToastBarData, interfaceC39708aA);
        dVarA.f231502d = this.f71693b;
        dVarA.a();
    }

    @Override // com.avito.android.progress_overlay.g
    public final void j0() {
        this.f71733p.p0();
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ja(@Y61.k PhoneLink phoneLink) {
        androidx.appcompat.app.l lVar = this.f71672Q0;
        if (lVar == null || !lVar.isShowing()) {
            this.f71699d.d(new Q1(this, phoneLink));
        }
    }

    public final void k0(@Y61.l PersistableSpannedItem persistableSpannedItem) {
        if (persistableSpannedItem == null) {
            return;
        }
        RecyclerView recyclerView = this.f71750x0;
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        recyclerView.setItemAnimator(null);
        i0(persistableSpannedItem);
        recyclerView.post(new RunnableC28146l1(this, itemAnimator, 1));
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ka(@Y61.k Throwable th2) {
        this.f71699d.c(th2);
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void la() {
        this.f71705f.q1();
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ma() {
        ActivityC22955m activityC22955mL1 = this.f71699d.getF71777a().l1();
        if (activityC22955mL1 == null) {
            return;
        }
        this.f71715i0.a(activityC22955mL1, AppRaterEventSourcePage.f91796e);
    }

    @Override // com.avito.android.favorite_apprater.k
    public final void n() {
        ActivityC22955m activityC22955mL1 = this.f71699d.getF71777a().l1();
        if (activityC22955mL1 == null) {
            return;
        }
        this.f71715i0.a(activityC22955mL1, AppRaterEventSourcePage.f91797f);
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void na() throws Resources.NotFoundException {
        L5.b(this.f71740s0, this.f71742t0.getString(R.string.advert_core_advert_seller_notified_about_call), 0);
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void t2() {
        this.f71705f.a();
    }

    public final void v(int i12, @Y61.k Y41.a aVar) {
        ((com.avito.android.advert_core.item_showed_observer.c) this.f71670P0.getValue()).a(i12, aVar);
    }

    public final void w(@Y61.k ArrayList arrayList, @Y61.k Y41.a aVar) {
        ((com.avito.android.advert_core.item_showed_observer.c) this.f71670P0.getValue()).b(arrayList, aVar);
    }

    public final void x(boolean z12, boolean z13) {
        com.avito.android.advert_core.contactbar.A a12 = this.f71746v0;
        if (a12 == null) {
            return;
        }
        Boolean boolC = C();
        if (boolC == null) {
            a12.a().hide();
            return;
        }
        boolean zBooleanValue = boolC.booleanValue();
        if (zBooleanValue) {
            a12.c();
        }
        a12.W6(zBooleanValue, z12, z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        r4 = com.avito.android.advert.item.k2.f77245a.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        r4 = com.avito.android.advert.item.s2.f78722a.b(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(androidx.recyclerview.widget.RecyclerView r10) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.I1.y(androidx.recyclerview.widget.RecyclerView):void");
    }

    public final void z() {
        Boolean boolValueOf;
        Object next;
        com.avito.android.advert.item.hotel.hotel_offer.floating_view.i iVar = this.f71748w0;
        if (iVar == null) {
            return;
        }
        ArrayList arrayList = this.f71660K0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((com.avito.android.serp.adapter.i1) next) instanceof AdvertDetailsHotelOfferItem) {
                    break;
                }
            }
        }
        if (next != null) {
            p2 p2Var = p2.f78131a;
            Integer numB = p2Var.b(arrayList);
            if (numB != null) {
                int iIntValue = numB.intValue();
                int iK1 = this.f71676S0.K1();
                int iA2 = p2Var.a(iIntValue, this.f71750x0);
                boolValueOf = Boolean.valueOf((iIntValue < iK1 || (iA2 != 0 && iA2 < E())) && !this.f71684W0);
            }
        } else {
            boolValueOf = Boolean.FALSE;
        }
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        com.avito.android.advert.item.hotel.hotel_offer.floating_view.a aVar = this.f71683W;
        aVar.a(zBooleanValue);
        if (zBooleanValue && aVar.getF75985j()) {
            iVar.d();
        } else {
            iVar.c();
        }
    }
}
