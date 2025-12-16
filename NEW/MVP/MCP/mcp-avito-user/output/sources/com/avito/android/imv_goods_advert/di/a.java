package com.avito.android.imv_goods_advert.di;

import Ax.InterfaceC13095a;
import Hr.InterfaceC14024a;
import Id.InterfaceC14060a;
import Zb.C19530b;
import ac.C19864a;
import android.app.Application;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.S0;
import cN.C27069b;
import cN.C27071d;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.C34161r;
import com.avito.android.J0;
import com.avito.android.V;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.advert_core.contactbar.InterfaceC28262a;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_core.contactbar.SourceScreen;
import com.avito.android.advert_details_items.sellerprofile.C28272b;
import com.avito.android.advert_details_items.sellerprofile.C28276f;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28273c;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.features.auto.ab_tests.configs.AutoMediaMotoWaterTestGroup;
import com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment;
import com.avito.android.imv_goods_advert.ImvGoodsAdvertParams;
import com.avito.android.imv_goods_advert.di.b;
import com.avito.android.imv_goods_advert.di.m;
import com.avito.android.imv_goods_advert.di.n;
import com.avito.android.imv_goods_advert.di.p;
import com.avito.android.imv_goods_advert.di.q;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.remote.InterfaceC34398y;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.util.C35801g6;
import com.avito.android.util.C35865p;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.q;
import ga.InterfaceC40639a;
import java.util.Locale;
import lD.C43617a;
import lE.C43624b;
import la.C43715c;
import ru.avito.messenger.MessengerApi;
import t9.C48522c;
import t9.InterfaceC48520a;
import t9.InterfaceC48523d;
import u9.C48866b;
import u9.C48867c;
import u9.C48868d;
import ur.InterfaceC49101b;
import wv.C49686b;
import xu.C50000c;

/* compiled from: DaggerImvGoodsAdvertComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerImvGoodsAdvertComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.imv_goods_advert.di.b.a
        public final com.avito.android.imv_goods_advert.di.b a(ImvGoodsAdvertFragment imvGoodsAdvertFragment, S0 s02, Resources resources, ImvGoodsAdvertParams imvGoodsAdvertParams, C28478k c28478k, com.avito.android.analytics.screens.r rVar, String str, e eVar, InterfaceC39417a interfaceC39417a) {
            imvGoodsAdvertParams.getClass();
            str.getClass();
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, imvGoodsAdvertFragment, s02, resources, imvGoodsAdvertParams, c28478k, rVar, str, null, null, null);
        }
    }

    /* compiled from: DaggerImvGoodsAdvertComponent.java */
    public static final class c implements com.avito.android.imv_goods_advert.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<V> f170334A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.photogallery.d> f170335A0;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<TreeClickStreamParent> f170336B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35845m2> f170337B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<C29640d> f170338C;

        /* renamed from: C0, reason: collision with root package name */
        public final com.avito.android.advert_details_items.photogallery.b f170339C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.z> f170340D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.price_hint.a> f170341D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<C34161r> f170342E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.price_hint.f> f170343E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<C19864a> f170344F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.buyer_bonuses.c> f170345F0;

        /* renamed from: G, reason: collision with root package name */
        public final c8.f f170346G;

        /* renamed from: G0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.price.j> f170347G0;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.analytics.a> f170348H;

        /* renamed from: H0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.price.c> f170349H0;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35945t1<AdvertPrice>> f170350I;

        /* renamed from: I0, reason: collision with root package name */
        public final com.avito.android.advert_details_items.price.b f170351I0;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<B2> f170352J;

        /* renamed from: J0, reason: collision with root package name */
        public final com.avito.android.advert_core.discount.item.title.c f170353J0;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<SourceScreen> f170354K;

        /* renamed from: K0, reason: collision with root package name */
        public final com.avito.android.advert_core.discount.item.subtitle.c f170355K0;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f170356L;

        /* renamed from: L0, reason: collision with root package name */
        public final com.avito.android.advert_core.discount.item.discount.c f170357L0;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34398y> f170358M;

        /* renamed from: M0, reason: collision with root package name */
        public final com.avito.android.advert_core.discount.item.group_title.g f170359M0;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deal_confirmation.a> f170360N;

        /* renamed from: N0, reason: collision with root package name */
        public final com.avito.android.advert_core.discount.item.dotted_discount.c f170361N0;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f170362O;

        /* renamed from: O0, reason: collision with root package name */
        public final com.avito.android.advert_core.discount.item.divider.c f170363O0;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f170364P;

        /* renamed from: P0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f170365P0;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deal_confirmation.d> f170366Q;

        /* renamed from: Q0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f170367Q0;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f170368R;

        /* renamed from: R0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f170369R0;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<SK0.b> f170370S;

        /* renamed from: S0, reason: collision with root package name */
        public final dagger.internal.u<t9.g> f170371S0;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<W9.c> f170372T;

        /* renamed from: T0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48523d> f170373T0;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<ProgressInfoToastBarPresenter> f170374U;

        /* renamed from: U0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48520a> f170375U0;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC13095a> f170376V;

        /* renamed from: V0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.price_discount.c> f170377V0;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<Application> f170378W;

        /* renamed from: W0, reason: collision with root package name */
        public final com.avito.android.advert_details_items.price_discount.b f170379W0;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28262a> f170380X;

        /* renamed from: X0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.title.c> f170381X0;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.safedeal.trust_factors.a> f170382Y;

        /* renamed from: Y0, reason: collision with root package name */
        public final com.avito.android.advert_details_items.title.b f170383Y0;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deep_linking.x> f170384Z;

        /* renamed from: Z0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.description.c> f170385Z0;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f170386a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<C43617a> f170387a0;

        /* renamed from: a1, reason: collision with root package name */
        public final com.avito.android.advert_details_items.description.b f170388a1;

        /* renamed from: b, reason: collision with root package name */
        public final e f170389b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.credits.installments.d> f170390b0;

        /* renamed from: b1, reason: collision with root package name */
        public final com.avito.android.advert_details_items.description.gig_redesign.b f170391b1;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<Gson> f170392c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.price_with_delivery.c> f170393c0;

        /* renamed from: c1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.georeference.c> f170394c1;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.imv_goods_advert.mvi.f f170395d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49101b> f170396d0;

        /* renamed from: d1, reason: collision with root package name */
        public final com.avito.android.advert_details_items.georeference.b f170397d1;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.imv_goods_advert.mvi.d f170398e;

        /* renamed from: e0, reason: collision with root package name */
        public final com.avito.android.advert_core.contactbar.G f170399e0;

        /* renamed from: e1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.address.c> f170400e1;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<J0> f170401f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.l f170402f0;

        /* renamed from: f1, reason: collision with root package name */
        public final com.avito.android.advert_details_items.address.b f170403f1;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<hJ.i> f170404g;

        /* renamed from: g0, reason: collision with root package name */
        public final com.avito.android.delayed_ux_feedback.g f170405g0;

        /* renamed from: g1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.flats.c> f170406g1;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f170407h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<Cd.D> f170408h0;

        /* renamed from: h1, reason: collision with root package name */
        public final com.avito.android.advert_details_items.flats.b f170409h1;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<hJ.h> f170410i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14060a> f170411i0;

        /* renamed from: i1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.carousel_photogallery.c> f170412i1;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.imv_goods_advert.q> f170413j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<R0> f170414j0;

        /* renamed from: j1, reason: collision with root package name */
        public final com.avito.android.advert_details_items.carousel_photogallery.b f170415j1;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<Locale> f170416k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.progress_info_toast_bar.interactor.g> f170417k0;

        /* renamed from: k1, reason: collision with root package name */
        public final dagger.internal.u<u3.l<AutoMediaMotoWaterTestGroup>> f170418k1;

        /* renamed from: l, reason: collision with root package name */
        public final C35865p f170419l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14024a> f170420l0;

        /* renamed from: l1, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28273c> f170421l1;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35945t1<AdvertPrice>> f170422m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28265d> f170423m0;

        /* renamed from: m1, reason: collision with root package name */
        public final C28272b f170424m1;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35945t1<AdvertPrice>> f170425n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.u<C43624b> f170426n0;

        /* renamed from: n1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.show_description_button.c> f170427n1;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35945t1<AdvertPrice>> f170428o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.short_term_rent.a> f170429o0;

        /* renamed from: o1, reason: collision with root package name */
        public final com.avito.android.advert_details_items.show_description_button.b f170430o1;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC40639a> f170431p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.toast_item_popularity.a> f170432p0;

        /* renamed from: p1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.gap.d> f170433p1;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.sellerprofile.E> f170434q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28280j> f170435q0;

        /* renamed from: q1, reason: collision with root package name */
        public final com.avito.android.advert_core.gap.b f170436q1;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<l90.n> f170437r;

        /* renamed from: r0, reason: collision with root package name */
        public final com.avito.android.imv_goods_advert.mvi.m f170438r0;

        /* renamed from: r1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_details_items.status_badge.c> f170439r1;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<MessengerApi> f170440s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f170441s0;

        /* renamed from: s1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f170442s1;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.account.E> f170443t;

        /* renamed from: t0, reason: collision with root package name */
        public final com.avito.android.imv_goods_advert.u f170444t0;

        /* renamed from: t1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f170445t1;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f170446u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.imv_goods_advert.n> f170447u0;

        /* renamed from: u1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f170448u1;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.messenger.a> f170449v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35741a1> f170450v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<WL.a> f170451w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.advert.l> f170452w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f170453x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.pinch_to_zoom.b> f170454x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f170455y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f170456y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<Kundle> f170457z;

        /* renamed from: z0, reason: collision with root package name */
        public final com.avito.android.advert_details_items.photogallery.l f170458z0;

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class A implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170459a;

            public A(e eVar) {
                this.f170459a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170459a.r();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class B implements dagger.internal.u<com.avito.android.advert_core.price_with_delivery.c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170460a;

            public B(e eVar) {
                this.f170460a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advert_core.price_with_delivery.c cVarZ2 = this.f170460a.Z2();
                dagger.internal.t.c(cVarZ2);
                return cVarZ2;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class C implements dagger.internal.u<l90.n> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170461a;

            public C(e eVar) {
                this.f170461a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                l90.n nVarE1 = this.f170461a.e1();
                dagger.internal.t.c(nVarE1);
                return nVarE1;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class D implements dagger.internal.u<ProgressInfoToastBarPresenter> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170462a;

            public D(e eVar) {
                this.f170462a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170462a.s1();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class E implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170463a;

            public E(e eVar) {
                this.f170463a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f170463a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class F implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170464a;

            public F(e eVar) {
                this.f170464a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f170464a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class G implements dagger.internal.u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170465a;

            public G(e eVar) {
                this.f170465a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170465a.D();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class H implements dagger.internal.u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170466a;

            public H(e eVar) {
                this.f170466a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170466a.J();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class I implements dagger.internal.u<com.avito.android.progress_info_toast_bar.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170467a;

            public I(e eVar) {
                this.f170467a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.progress_info_toast_bar.interactor.g gVarO3 = this.f170467a.O3();
                dagger.internal.t.c(gVarO3);
                return gVarO3;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        /* renamed from: com.avito.android.imv_goods_advert.di.a$c$a, reason: collision with other inner class name */
        public static final class C5045a implements dagger.internal.u<com.avito.android.account.E> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170468a;

            public C5045a(e eVar) {
                this.f170468a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.account.E eI2 = this.f170468a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        /* renamed from: com.avito.android.imv_goods_advert.di.a$c$b, reason: case insensitive filesystem */
        public static final class C30987b implements dagger.internal.u<C29640d> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170469a;

            public C30987b(e eVar) {
                this.f170469a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170469a.Q();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        /* renamed from: com.avito.android.imv_goods_advert.di.a$c$c, reason: collision with other inner class name */
        public static final class C5046c implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170470a;

            public C5046c(e eVar) {
                this.f170470a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f170470a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        /* renamed from: com.avito.android.imv_goods_advert.di.a$c$d, reason: case insensitive filesystem */
        public static final class C30988d implements dagger.internal.u<InterfaceC49101b> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170471a;

            public C30988d(e eVar) {
                this.f170471a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170471a.G();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        /* renamed from: com.avito.android.imv_goods_advert.di.a$c$e, reason: case insensitive filesystem */
        public static final class C30989e implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170472a;

            public C30989e(e eVar) {
                this.f170472a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f170472a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        /* renamed from: com.avito.android.imv_goods_advert.di.a$c$f, reason: case insensitive filesystem */
        public static final class C30990f implements dagger.internal.u<InterfaceC14060a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170473a;

            public C30990f(e eVar) {
                this.f170473a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14060a interfaceC14060aK1 = this.f170473a.k1();
                dagger.internal.t.c(interfaceC14060aK1);
                return interfaceC14060aK1;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        /* renamed from: com.avito.android.imv_goods_advert.di.a$c$g, reason: case insensitive filesystem */
        public static final class C30991g implements dagger.internal.u<C43617a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170474a;

            public C30991g(e eVar) {
                this.f170474a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170474a.C0();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        /* renamed from: com.avito.android.imv_goods_advert.di.a$c$h, reason: case insensitive filesystem */
        public static final class C30992h implements dagger.internal.u<u3.l<AutoMediaMotoWaterTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170475a;

            public C30992h(e eVar) {
                this.f170475a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<AutoMediaMotoWaterTestGroup> lVarG5 = this.f170475a.G5();
                dagger.internal.t.c(lVarG5);
                return lVarG5;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        /* renamed from: com.avito.android.imv_goods_advert.di.a$c$i, reason: case insensitive filesystem */
        public static final class C30993i implements dagger.internal.u<C34161r> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170476a;

            public C30993i(e eVar) {
                this.f170476a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C34161r c34161rC6 = this.f170476a.c6();
                dagger.internal.t.c(c34161rC6);
                return c34161rC6;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class j implements dagger.internal.u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170477a;

            public j(e eVar) {
                this.f170477a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f170477a.p();
                dagger.internal.t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class k implements dagger.internal.u<WL.a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170478a;

            public k(e eVar) {
                this.f170478a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WL.a aVarA1 = this.f170478a.a1();
                dagger.internal.t.c(aVarA1);
                return aVarA1;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class l implements dagger.internal.u<InterfaceC14024a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170479a;

            public l(e eVar) {
                this.f170479a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14024a interfaceC14024aL = this.f170479a.L();
                dagger.internal.t.c(interfaceC14024aL);
                return interfaceC14024aL;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class m implements dagger.internal.u<InterfaceC34398y> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170480a;

            public m(e eVar) {
                this.f170480a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34398y interfaceC34398yL2 = this.f170480a.l2();
                dagger.internal.t.c(interfaceC34398yL2);
                return interfaceC34398yL2;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class n implements dagger.internal.u<com.avito.android.deep_linking.x> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170481a;

            public n(e eVar) {
                this.f170481a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deep_linking.x xVarT = this.f170481a.t();
                dagger.internal.t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class o implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f170482a;

            public o(cv.b bVar) {
                this.f170482a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f170482a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class p implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170483a;

            public p(e eVar) {
                this.f170483a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f170483a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class q implements dagger.internal.u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170484a;

            public q(e eVar) {
                this.f170484a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f170484a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class r implements dagger.internal.u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170485a;

            public r(e eVar) {
                this.f170485a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f170485a.s();
                dagger.internal.t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class s implements dagger.internal.u<hJ.i> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170486a;

            public s(e eVar) {
                this.f170486a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.i iVarY = this.f170486a.Y();
                dagger.internal.t.c(iVarY);
                return iVarY;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class t implements dagger.internal.u<InterfaceC35845m2> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170487a;

            public t(e eVar) {
                this.f170487a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170487a.h();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class u implements dagger.internal.u<com.avito.android.credits.installments.d> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170488a;

            public u(e eVar) {
                this.f170488a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.credits.installments.d dVarV3 = this.f170488a.v3();
                dagger.internal.t.c(dVarV3);
                return dVarV3;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class v implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170489a;

            public v(e eVar) {
                this.f170489a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<SimpleTestGroupWithNone> lVarR6 = this.f170489a.r6();
                dagger.internal.t.c(lVarR6);
                return lVarR6;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class w implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170490a;

            public w(e eVar) {
                this.f170490a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170490a.locale();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class x implements dagger.internal.u<MessengerApi> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170491a;

            public x(e eVar) {
                this.f170491a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170491a.t5();
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class y implements dagger.internal.u<com.avito.android.permissions.z> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170492a;

            public y(e eVar) {
                this.f170492a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.permissions.z zVarA = this.f170492a.A();
                dagger.internal.t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerImvGoodsAdvertComponent.java */
        public static final class z implements dagger.internal.u<com.avito.android.pinch_to_zoom.b> {

            /* renamed from: a, reason: collision with root package name */
            public final e f170493a;

            public z(e eVar) {
                this.f170493a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.pinch_to_zoom.b bVarT1 = this.f170493a.t1();
                dagger.internal.t.c(bVarT1);
                return bVarT1;
            }
        }

        public c(e eVar, cv.b bVar, Fragment fragment, S0 s02, Resources resources, ImvGoodsAdvertParams imvGoodsAdvertParams, C28478k c28478k, com.avito.android.analytics.screens.r rVar, String str, Kundle kundle, Kundle kundle2, C5044a c5044a) {
            this.f170386a = bVar;
            this.f170389b = eVar;
            this.f170392c = new r(eVar);
            dagger.internal.l lVarA = dagger.internal.l.a(imvGoodsAdvertParams);
            dagger.internal.u<Gson> uVar = this.f170392c;
            this.f170395d = new com.avito.android.imv_goods_advert.mvi.f(lVarA, uVar);
            this.f170398e = new com.avito.android.imv_goods_advert.mvi.d(lVarA, uVar);
            this.f170401f = dagger.internal.g.d(m.a.f170511a);
            this.f170404g = new s(eVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(resources);
            this.f170407h = lVarA2;
            this.f170410i = dagger.internal.g.d(new C43715c(lVarA2));
            this.f170413j = dagger.internal.g.d(new com.avito.android.imv_goods_advert.s(this.f170407h));
            w wVar = new w(eVar);
            this.f170416k = wVar;
            C35865p c35865p = new C35865p(wVar);
            this.f170419l = c35865p;
            this.f170422m = dagger.internal.g.d(c35865p);
            this.f170425n = dagger.internal.g.d(new C27069b(this.f170416k));
            this.f170428o = dagger.internal.g.d(new C27071d(this.f170416k));
            dagger.internal.u<InterfaceC40639a> uVarD = dagger.internal.g.d(new ga.c(this.f170407h));
            this.f170431p = uVarD;
            this.f170434q = dagger.internal.g.d(new com.avito.android.advert_details_items.sellerprofile.G(uVarD));
            this.f170437r = new C(eVar);
            x xVar = new x(eVar);
            C5045a c5045a = new C5045a(eVar);
            this.f170443t = c5045a;
            E e12 = new E(eVar);
            this.f170446u = e12;
            this.f170449v = dagger.internal.g.d(new com.avito.android.advert_core.messenger.g(xVar, c5045a, e12));
            this.f170451w = new k(eVar);
            this.f170453x = new C5046c(eVar);
            this.f170455y = dagger.internal.l.a(str);
            dagger.internal.u<Kundle> uVarD2 = dagger.internal.g.d(q.a.f170528a);
            this.f170457z = uVarD2;
            this.f170334A = dagger.internal.g.d(new com.avito.android.credits.d(this.f170455y, this.f170453x, C35801g6.f318887a, uVarD2));
            this.f170336B = dagger.internal.g.d(n.a.f170512a);
            this.f170338C = new C30987b(eVar);
            this.f170340D = new y(eVar);
            C30993i c30993i = new C30993i(eVar);
            C19530b.f20265b.getClass();
            this.f170344F = dagger.internal.B.a(new C19530b(c30993i));
            dagger.internal.u<InterfaceC28373a> uVar2 = this.f170453x;
            this.f170346G = new c8.f(uVar2);
            this.f170348H = dagger.internal.g.d(new c8.c(uVar2, com.avito.android.advertising.di.y.a(), this.f170334A, com.avito.android.advert_core.offers.analytics.e.a(), this.f170443t, com.avito.android.analytics.provider.f.a(), this.f170336B, this.f170338C, this.f170340D, this.f170344F, this.f170346G));
            this.f170350I = dagger.internal.g.d(this.f170419l);
            this.f170352J = new G(eVar);
            this.f170354K = dagger.internal.g.d(p.a.f170527a);
            this.f170356L = new A(eVar);
            this.f170360N = dagger.internal.B.a(new com.avito.android.deal_confirmation.c(new m(eVar), this.f170446u));
            this.f170362O = new F(eVar);
            this.f170364P = dagger.internal.B.a(new C50000c(dagger.internal.l.a(rVar), this.f170362O));
            this.f170366Q = dagger.internal.B.a(new com.avito.android.deal_confirmation.i(dagger.internal.l.b(kundle), this.f170360N, this.f170446u, this.f170443t, this.f170364P));
            this.f170368R = new o(bVar);
            j jVar = new j(eVar);
            this.f170370S = jVar;
            this.f170372T = dagger.internal.g.d(new W9.e(jVar));
            this.f170374U = new D(eVar);
            this.f170376V = dagger.internal.g.d(new Ax.c(dagger.internal.l.b(kundle2)));
            this.f170380X = dagger.internal.g.d(new i(new C30989e(eVar)));
            dagger.internal.u<com.avito.android.advert_core.safedeal.trust_factors.a> uVarD3 = dagger.internal.g.d(com.avito.android.advert_core.safedeal.trust_factors.c.a());
            this.f170382Y = uVarD3;
            n nVar = new n(eVar);
            C30991g c30991g = new C30991g(eVar);
            this.f170387a0 = c30991g;
            u uVar3 = new u(eVar);
            this.f170390b0 = uVar3;
            B b12 = new B(eVar);
            this.f170393c0 = b12;
            C30988d c30988d = new C30988d(eVar);
            this.f170396d0 = c30988d;
            this.f170399e0 = new com.avito.android.advert_core.contactbar.G(uVarD3, nVar, c30991g, c30988d, this.f170380X, this.f170338C, uVar3, b12);
            this.f170402f0 = dagger.internal.l.a(s02);
            this.f170405g0 = new com.avito.android.delayed_ux_feedback.g(this.f170370S, this.f170387a0);
            q.b bVarA = dagger.internal.q.a(1);
            bVarA.a(com.avito.android.delayed_ux_feedback.f.class, this.f170405g0);
            dagger.internal.u<Cd.D> uVarA = dagger.internal.B.a(new Cd.F(bVarA.b()));
            this.f170408h0 = uVarA;
            C49686b c49686b = new C49686b(uVarA, this.f170402f0);
            C30990f c30990f = new C30990f(eVar);
            p pVar = new p(eVar);
            this.f170414j0 = pVar;
            this.f170423m0 = dagger.internal.g.d(new com.avito.android.advert_core.contactbar.u(this.f170437r, this.f170449v, this.f170451w, this.f170348H, this.f170443t, this.f170350I, this.f170453x, this.f170446u, this.f170338C, this.f170352J, this.f170354K, this.f170356L, this.f170366Q, this.f170368R, this.f170372T, this.f170374U, this.f170376V, this.f170399e0, c49686b, this.f170344F, c30990f, this.f170382Y, pVar, new I(eVar), new l(eVar)));
            this.f170429o0 = dagger.internal.g.d(new com.avito.android.advert_core.short_term_rent.c(new H(eVar)));
            dagger.internal.u<com.avito.android.advert_details_items.toast_item_popularity.a> uVarD4 = dagger.internal.g.d(com.avito.android.advert_details_items.toast_item_popularity.c.a());
            this.f170432p0 = uVarD4;
            dagger.internal.u<InterfaceC28280j> uVarD5 = dagger.internal.g.d(new com.avito.android.imv_goods_advert.di.j(uVarD4, this.f170434q, this.f170423m0, this.f170348H, this.f170390b0, this.f170393c0, this.f170429o0, this.f170446u));
            this.f170435q0 = uVarD5;
            this.f170438r0 = new com.avito.android.imv_goods_advert.mvi.m(new com.avito.android.imv_goods_advert.b(uVarD5, this.f170401f, this.f170404g, this.f170410i, this.f170413j, this.f170422m, this.f170425n, this.f170428o));
            this.f170441s0 = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f170362O);
            this.f170444t0 = new com.avito.android.imv_goods_advert.u(new com.avito.android.imv_goods_advert.mvi.i(this.f170395d, this.f170398e, com.avito.android.imv_goods_advert.mvi.k.a(), this.f170438r0, this.f170441s0));
            this.f170447u0 = dagger.internal.g.d(com.avito.android.imv_goods_advert.p.a());
            dagger.internal.u<com.avito.android.advert_core.advert.l> uVarD6 = dagger.internal.g.d(new com.avito.android.imv_goods_advert.di.l(dagger.internal.l.a(fragment), new q(eVar)));
            this.f170452w0 = uVarD6;
            z zVar = new z(eVar);
            v vVar = new v(eVar);
            dagger.internal.u<com.avito.android.imv_goods_advert.n> uVar4 = this.f170447u0;
            this.f170458z0 = new com.avito.android.advert_details_items.photogallery.l(uVar4, uVar4, uVarD6, this.f170453x, this.f170414j0, zVar, this.f170443t, vVar, this.f170368R);
            dagger.internal.u<com.avito.android.advert_details_items.photogallery.d> uVarD7 = dagger.internal.g.d(this.f170458z0);
            this.f170335A0 = uVarD7;
            t tVar = new t(eVar);
            this.f170337B0 = tVar;
            this.f170339C0 = new com.avito.android.advert_details_items.photogallery.b(uVarD7, tVar, this.f170338C);
            dagger.internal.u<com.avito.android.advert_details_items.price_hint.a> uVarD8 = dagger.internal.g.d(com.avito.android.advert_details_items.price_hint.c.a());
            this.f170341D0 = uVarD8;
            this.f170343E0 = dagger.internal.g.d(new com.avito.android.advert_details_items.price_hint.i(uVarD8, this.f170453x));
            this.f170345F0 = dagger.internal.g.d(new com.avito.android.advert_details_items.buyer_bonuses.e(this.f170368R));
            dagger.internal.u<com.avito.android.advert_details_items.price.j> uVarD9 = dagger.internal.g.d(new com.avito.android.advert_details_items.price.l(this.f170368R));
            this.f170347G0 = uVarD9;
            dagger.internal.u<com.avito.android.advert_details_items.price.c> uVarD10 = dagger.internal.g.d(new com.avito.android.advert_details_items.price.f(uVarD9, this.f170343E0, this.f170345F0));
            this.f170349H0 = uVarD10;
            this.f170351I0 = new com.avito.android.advert_details_items.price.b(uVarD10);
            this.f170353J0 = new com.avito.android.advert_core.discount.item.title.c(com.avito.android.advert_core.discount.item.title.e.a());
            this.f170355K0 = new com.avito.android.advert_core.discount.item.subtitle.c(com.avito.android.advert_core.discount.item.subtitle.e.a());
            this.f170357L0 = new com.avito.android.advert_core.discount.item.discount.c(com.avito.android.advert_core.discount.item.discount.e.a());
            this.f170359M0 = new com.avito.android.advert_core.discount.item.group_title.g(com.avito.android.advert_core.discount.item.group_title.c.a());
            this.f170361N0 = new com.avito.android.advert_core.discount.item.dotted_discount.c(com.avito.android.advert_core.discount.item.dotted_discount.e.a());
            this.f170363O0 = new com.avito.android.advert_core.discount.item.divider.c(com.avito.android.advert_core.discount.item.divider.e.a());
            dagger.internal.u<com.avito.konveyor.a> uVarD11 = dagger.internal.g.d(new C48868d(this.f170353J0, this.f170355K0, this.f170357L0, this.f170359M0, this.f170361N0, this.f170363O0, new com.avito.android.advert_core.discount.item.information.c(com.avito.android.advert_core.discount.item.information.e.a()), new com.avito.android.advert_core.discount.item.contact.c(new com.avito.android.advert_core.discount.item.contact.f(this.f170423m0))));
            this.f170365P0 = uVarD11;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD12 = dagger.internal.g.d(new C48867c(uVarD11));
            this.f170367Q0 = uVarD12;
            this.f170369R0 = dagger.internal.g.d(new C48866b(uVarD12, this.f170365P0));
            dagger.internal.u<t9.g> uVarD13 = dagger.internal.g.d(new t9.i(this.f170387a0));
            this.f170371S0 = uVarD13;
            dagger.internal.u<InterfaceC48523d> uVarD14 = dagger.internal.g.d(new t9.f(uVarD13, this.f170367Q0));
            this.f170373T0 = uVarD14;
            dagger.internal.u<InterfaceC48520a> uVarD15 = dagger.internal.g.d(new C48522c(uVarD14, this.f170369R0));
            this.f170375U0 = uVarD15;
            dagger.internal.u<com.avito.android.advert_details_items.price_discount.c> uVarD16 = dagger.internal.g.d(new com.avito.android.advert_details_items.price_discount.f(this.f170455y, uVarD15, this.f170453x, this.f170343E0, this.f170345F0));
            this.f170377V0 = uVarD16;
            this.f170379W0 = new com.avito.android.advert_details_items.price_discount.b(uVarD16);
            dagger.internal.u<com.avito.android.advert_details_items.title.c> uVarD17 = dagger.internal.g.d(com.avito.android.advert_details_items.title.e.a());
            this.f170381X0 = uVarD17;
            this.f170383Y0 = new com.avito.android.advert_details_items.title.b(uVarD17);
            dagger.internal.u<com.avito.android.advert_details_items.description.c> uVarD18 = dagger.internal.g.d(com.avito.android.advert_details_items.description.e.a());
            this.f170385Z0 = uVarD18;
            this.f170388a1 = new com.avito.android.advert_details_items.description.b(uVarD18);
            this.f170391b1 = new com.avito.android.advert_details_items.description.gig_redesign.b(uVarD18);
            dagger.internal.u<com.avito.android.advert_details_items.georeference.c> uVarD19 = dagger.internal.g.d(com.avito.android.advert_details_items.georeference.e.a());
            this.f170394c1 = uVarD19;
            this.f170397d1 = new com.avito.android.advert_details_items.georeference.b(uVarD19);
            dagger.internal.u<com.avito.android.advert_details_items.address.c> uVarD20 = dagger.internal.g.d(com.avito.android.advert_details_items.address.e.a());
            this.f170400e1 = uVarD20;
            this.f170403f1 = new com.avito.android.advert_details_items.address.b(uVarD20);
            dagger.internal.u<com.avito.android.advert_details_items.flats.c> uVarD21 = dagger.internal.g.d(new com.avito.android.advert_details_items.flats.e(this.f170447u0));
            this.f170406g1 = uVarD21;
            dagger.internal.u<com.avito.android.imv_goods_advert.n> uVar5 = this.f170447u0;
            this.f170409h1 = new com.avito.android.advert_details_items.flats.b(this.f170387a0, uVarD21, uVar5);
            dagger.internal.u<com.avito.android.advert_details_items.carousel_photogallery.c> uVarD22 = dagger.internal.g.d(new com.avito.android.advert_details_items.carousel_photogallery.f(this.f170453x, uVar5, uVar5));
            this.f170412i1 = uVarD22;
            this.f170415j1 = new com.avito.android.advert_details_items.carousel_photogallery.b(uVarD22, this.f170337B0, this.f170453x);
            this.f170418k1 = new C30992h(eVar);
            dagger.internal.u<InterfaceC28273c> uVarD23 = dagger.internal.g.d(new C28276f(this.f170418k1, this.f170396d0, this.f170435q0));
            this.f170421l1 = uVarD23;
            this.f170424m1 = new C28272b(uVarD23);
            dagger.internal.u<com.avito.android.advert_details_items.show_description_button.c> uVarD24 = dagger.internal.g.d(new com.avito.android.advert_details_items.show_description_button.f(this.f170447u0));
            this.f170427n1 = uVarD24;
            this.f170430o1 = new com.avito.android.advert_details_items.show_description_button.b(uVarD24);
            dagger.internal.u<com.avito.android.advert_core.gap.d> uVarD25 = dagger.internal.g.d(com.avito.android.advert_core.gap.f.a());
            this.f170433p1 = uVarD25;
            this.f170436q1 = new com.avito.android.advert_core.gap.b(uVarD25);
            dagger.internal.u<com.avito.android.advert_details_items.status_badge.c> uVarD26 = dagger.internal.g.d(com.avito.android.advert_details_items.status_badge.e.a());
            this.f170439r1 = uVarD26;
            dagger.internal.u<com.avito.konveyor.a> uVarD27 = dagger.internal.g.d(new com.avito.android.imv_goods_advert.di.o(this.f170339C0, this.f170351I0, this.f170379W0, this.f170383Y0, this.f170388a1, this.f170391b1, this.f170397d1, this.f170403f1, this.f170409h1, this.f170415j1, this.f170424m1, this.f170430o1, this.f170436q1, new com.avito.android.advert_details_items.status_badge.b(uVarD26)));
            this.f170442s1 = uVarD27;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD28 = dagger.internal.g.d(new h(uVarD27));
            this.f170445t1 = uVarD28;
            this.f170448u1 = dagger.internal.g.d(new g(uVarD28, this.f170442s1));
        }

        @Override // com.avito.android.imv_goods_advert.di.b
        public final void a(ImvGoodsAdvertFragment imvGoodsAdvertFragment) {
            imvGoodsAdvertFragment.f170277h0 = this.f170444t0;
            imvGoodsAdvertFragment.f170279j0 = this.f170448u1.get();
            imvGoodsAdvertFragment.f170280k0 = this.f170445t1.get();
            imvGoodsAdvertFragment.f170281l0 = this.f170441s0.get();
            imvGoodsAdvertFragment.f170282m0 = this.f170394c1.get();
            imvGoodsAdvertFragment.f170283n0 = this.f170400e1.get();
            imvGoodsAdvertFragment.f170284o0 = this.f170385Z0.get();
            com.avito.android.deeplink_handler.view.d dVarC = this.f170386a.c();
            dagger.internal.t.c(dVarC);
            imvGoodsAdvertFragment.f170285p0 = dVarC;
            e eVar = this.f170389b;
            imvGoodsAdvertFragment.f170286q0 = eVar.F0();
            InterfaceC35745a5 interfaceC35745a5D = eVar.d();
            dagger.internal.t.c(interfaceC35745a5D);
            imvGoodsAdvertFragment.f170287r0 = interfaceC35745a5D;
            imvGoodsAdvertFragment.f170288s0 = this.f170447u0.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
