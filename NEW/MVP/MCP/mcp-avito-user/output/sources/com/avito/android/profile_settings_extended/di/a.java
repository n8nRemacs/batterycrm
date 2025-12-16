package com.avito.android.profile_settings_extended.di;

import Ac0.InterfaceC13011d;
import Hb0.C13949c;
import Hb0.InterfaceC13947a;
import Wb0.C15741c;
import Y41.l;
import Za0.InterfaceC19524a;
import Zd.InterfaceC19542a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22983P;
import com.avito.android.C30277e1;
import com.avito.android.N1;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ExtendedProfileSettingsScreen;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.profile_settings_extended.C33471e;
import com.avito.android.profile_settings_extended.C33477k;
import com.avito.android.profile_settings_extended.C33510x;
import com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment;
import com.avito.android.profile_settings_extended.InterfaceC33467a;
import com.avito.android.profile_settings_extended.InterfaceC33475i;
import com.avito.android.profile_settings_extended.InterfaceC33507u;
import com.avito.android.profile_settings_extended.O;
import com.avito.android.profile_settings_extended.S;
import com.avito.android.profile_settings_extended.T;
import com.avito.android.profile_settings_extended.di.b;
import com.avito.android.profile_settings_extended.di.f;
import com.avito.android.profile_settings_extended.mvi.N;
import com.avito.android.profile_settings_extended.mvi.P;
import com.avito.android.profile_settings_extended.mvi.V;
import com.avito.android.remote.A1;
import com.avito.android.remote.D0;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.O3;
import com.avito.android.util.R0;
import com.avito.android.util.W;
import com.avito.beduin.v2.engine.component.B;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.A;
import gF.InterfaceC40577a;
import java.util.List;
import java.util.Set;
import jb0.C42347b;
import jb0.C42348c;
import jb0.C42349d;
import jc0.C42356b;
import jc0.C42357c;
import vK0.C49228b;
import w80.C49468b;

/* compiled from: DaggerExtendedProfileSettingsComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerExtendedProfileSettingsComponent.java */
    public static final class b implements com.avito.android.profile_settings_extended.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f230084A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230085A0;

        /* renamed from: A1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.extended_profile_ui_components.universal_widget.a> f230086A1;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.connection_quality.connectivity.a> f230087B;

        /* renamed from: B0, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.adapter.gallery.image.f f230088B0;

        /* renamed from: B1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.universal.section.c> f230089B1;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<E> f230090C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.gallery.image.c> f230091C0;

        /* renamed from: C1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230092C1;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f230093D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230094D0;

        /* renamed from: D1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f230095D1;

        /* renamed from: E, reason: collision with root package name */
        public final N f230096E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.gallery.appending.c> f230097E0;

        /* renamed from: E1, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.adapter.gallery.image.k f230098E1;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<T> f230099F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230100F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34401z0> f230101G;

        /* renamed from: G0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.banner.c> f230102G0;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33475i> f230103H;

        /* renamed from: H0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230104H0;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.carousel.a> f230105I;

        /* renamed from: I0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.setting.f> f230106I0;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC19524a> f230107J;

        /* renamed from: J0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230108J0;

        /* renamed from: K, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.adapter.universal.section.o f230109K;

        /* renamed from: K0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.geo.g> f230110K0;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.phones.d> f230111L;

        /* renamed from: L0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230112L0;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<C30277e1> f230113M;

        /* renamed from: M0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.geo_v2.header.e> f230114M0;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.phones.a> f230115N;

        /* renamed from: N0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230116N0;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33467a> f230117O;

        /* renamed from: O0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.geo_v2.address.c> f230118O0;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.item_selections.a> f230119P;

        /* renamed from: P0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230120P0;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f230121Q;

        /* renamed from: Q0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.geo_v2.footer.e> f230122Q0;

        /* renamed from: R, reason: collision with root package name */
        public final W f230123R;

        /* renamed from: R0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230124R0;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f230125S;

        /* renamed from: S0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.link_edit.c> f230126S0;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC13947a> f230127T;

        /* renamed from: T0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230128T0;

        /* renamed from: U, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.mvi.x f230129U;

        /* renamed from: U0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.phones.c> f230130U0;

        /* renamed from: V, reason: collision with root package name */
        public final P f230131V;

        /* renamed from: V0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230132V0;

        /* renamed from: W, reason: collision with root package name */
        public final V f230133W;

        /* renamed from: W0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.carousel.c> f230134W0;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f230135X;

        /* renamed from: X0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.carousel.adapter.c> f230136X0;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.l f230137Y;

        /* renamed from: Y0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f230138Y0;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<C28478k> f230139Z;

        /* renamed from: Z0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230140Z0;

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC29970g f230141a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f230142a0;

        /* renamed from: a1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.item_selections.g> f230143a1;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<D0> f230144b;

        /* renamed from: b0, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.mvi.A f230145b0;

        /* renamed from: b1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.c> f230146b1;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<Application> f230147c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<n.a> f230148c0;

        /* renamed from: c1, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.b f230149c1;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<Context> f230150d;

        /* renamed from: d0, reason: collision with root package name */
        public final O f230151d0;

        /* renamed from: d1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create.c> f230152d1;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.converter.b> f230153e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<com.jakewharton.rxrelay3.d<com.avito.android.promoblock.a>> f230154e0;

        /* renamed from: e1, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create.b f230155e1;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<Gson> f230156f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.l f230157f0;

        /* renamed from: f1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.item_selections.adapter.empty.c> f230158f1;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.converter.f> f230159g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.l f230160g0;

        /* renamed from: g1, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.adapter.item_selections.adapter.empty.b f230161g1;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_cache.b> f230162h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC40577a> f230163h0;

        /* renamed from: h1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f230164h1;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.photo_storage.f f230165i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC19542a> f230166i0;

        /* renamed from: i1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230167i1;

        /* renamed from: j, reason: collision with root package name */
        public final C49468b f230168j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<N1> f230169j0;

        /* renamed from: j1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230170j1;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<R0> f230171k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<PhotoPickerIntentFactory> f230172k0;

        /* renamed from: k1, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.b f230173k1;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f230174l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.extended_profile_personal_link_edit.e> f230175l0;

        /* renamed from: l1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230176l1;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<String> f230177m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<HA.a> f230178m0;

        /* renamed from: m1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230179m1;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_management_core.images.a> f230180n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.extended_profile_image_edit.t> f230181n0;

        /* renamed from: n1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230182n1;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<B> f230183o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.extended_profile_universal_widget_edit.a> f230184o0;

        /* renamed from: o1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230185o1;

        /* renamed from: p, reason: collision with root package name */
        public final C31144q0 f230186p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC13011d> f230187p0;

        /* renamed from: p1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.badge_bar.c> f230188p1;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<A1> f230189q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.b<?, ?>>> f230190q0;

        /* renamed from: q1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230191q1;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.setting.c> f230192r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.util.groupable_item.b> f230193r0;

        /* renamed from: r1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.section_header.c> f230194r1;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.P> f230195s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.promoblock.e> f230196s0;

        /* renamed from: s1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230197s1;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.geo.a> f230198t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.promoblock.m> f230199t0;

        /* renamed from: t1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.basic_info_v2.c> f230200t1;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.edit_carousel.w> f230201u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230202u0;

        /* renamed from: u1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230203u1;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.extended_profile_universal_widget_edit.f> f230204v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.toggle.c> f230205v0;

        /* renamed from: v1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.universal.header.c> f230206v1;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<gD.f> f230207w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230208w0;

        /* renamed from: w1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230209w1;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.converter.a> f230210x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.about.c> f230211x0;

        /* renamed from: x1, reason: collision with root package name */
        public final com.avito.android.profile_settings_extended.adapter.universal.create.f f230212x1;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.converter.g> f230213y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230214y0;

        /* renamed from: y1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.universal.create.c> f230215y1;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33507u> f230216z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings_extended.adapter.gallery.gallery_header.c> f230217z0;

        /* renamed from: z1, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f230218z1;

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class A implements dagger.internal.u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230219a;

            public A(InterfaceC29970g interfaceC29970g) {
                this.f230219a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1S0 = this.f230219a.s0();
                dagger.internal.t.c(a1S0);
                return a1S0;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        /* renamed from: com.avito.android.profile_settings_extended.di.a$b$a, reason: collision with other inner class name */
        public static final class C7005a implements dagger.internal.u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230220a;

            public C7005a(InterfaceC29970g interfaceC29970g) {
                this.f230220a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f230220a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        /* renamed from: com.avito.android.profile_settings_extended.di.a$b$b, reason: collision with other inner class name */
        public static final class C7006b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230221a;

            public C7006b(InterfaceC29970g interfaceC29970g) {
                this.f230221a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f230221a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class c implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230222a;

            public c(InterfaceC29970g interfaceC29970g) {
                this.f230222a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f230222a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC19542a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230223a;

            public d(InterfaceC29970g interfaceC29970g) {
                this.f230223a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230223a.x();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class e implements dagger.internal.u<InterfaceC19524a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230224a;

            public e(InterfaceC29970g interfaceC29970g) {
                this.f230224a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19524a interfaceC19524aQf = this.f230224a.Qf();
                dagger.internal.t.c(interfaceC19524aQf);
                return interfaceC19524aQf;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class f implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230225a;

            public f(InterfaceC29970g interfaceC29970g) {
                this.f230225a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230225a.g();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f230226a;

            public g(cv.b bVar) {
                this.f230226a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f230226a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class h implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230227a;

            public h(InterfaceC29970g interfaceC29970g) {
                this.f230227a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f230227a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class i implements dagger.internal.u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230228a;

            public i(InterfaceC29970g interfaceC29970g) {
                this.f230228a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f230228a.b7();
                dagger.internal.t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class j implements dagger.internal.u<InterfaceC40577a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230229a;

            public j(InterfaceC29970g interfaceC29970g) {
                this.f230229a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230229a.g1();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class k implements dagger.internal.u<com.avito.android.extended_profile_image_edit.t> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230230a;

            public k(InterfaceC29970g interfaceC29970g) {
                this.f230230a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230230a.u2();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class l implements dagger.internal.u<HA.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230231a;

            public l(InterfaceC29970g interfaceC29970g) {
                this.f230231a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230231a.ce();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class m implements dagger.internal.u<com.avito.android.extended_profile_universal_widget_edit.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230232a;

            public m(InterfaceC29970g interfaceC29970g) {
                this.f230232a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230232a.vd();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class n implements dagger.internal.u<com.avito.android.extended_profile_personal_link_edit.e> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230233a;

            public n(InterfaceC29970g interfaceC29970g) {
                this.f230233a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230233a.E9();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class o implements dagger.internal.u<com.avito.android.extended_profile_universal_widget_edit.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230234a;

            public o(InterfaceC29970g interfaceC29970g) {
                this.f230234a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230234a.Mi();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class p implements dagger.internal.u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230235a;

            public p(InterfaceC29970g interfaceC29970g) {
                this.f230235a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f230235a.s();
                dagger.internal.t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class q implements dagger.internal.u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230236a;

            public q(InterfaceC29970g interfaceC29970g) {
                this.f230236a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230236a.C();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class r implements dagger.internal.u<N1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230237a;

            public r(InterfaceC29970g interfaceC29970g) {
                this.f230237a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230237a.T3();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class s implements dagger.internal.u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230238a;

            public s(InterfaceC29970g interfaceC29970g) {
                this.f230238a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f230238a.F();
                dagger.internal.t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class t implements dagger.internal.u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230239a;

            public t(InterfaceC29970g interfaceC29970g) {
                this.f230239a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230239a.X();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class u implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230240a;

            public u(InterfaceC29970g interfaceC29970g) {
                this.f230240a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230240a.r();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class v implements dagger.internal.u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230241a;

            public v(InterfaceC29970g interfaceC29970g) {
                this.f230241a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f230241a.B();
                dagger.internal.t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class w implements dagger.internal.u<gD.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230242a;

            public w(InterfaceC29970g interfaceC29970g) {
                this.f230242a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230242a.v1();
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class x implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230243a;

            public x(InterfaceC29970g interfaceC29970g) {
                this.f230243a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f230243a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class y implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230244a;

            public y(InterfaceC29970g interfaceC29970g) {
                this.f230244a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f230244a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerExtendedProfileSettingsComponent.java */
        public static final class z implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f230245a;

            public z(InterfaceC29970g interfaceC29970g) {
                this.f230245a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f230245a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(C42347b c42347b, C31138n0 c31138n0, InterfaceC29970g interfaceC29970g, cv.b bVar, Activity activity, Fragment fragment, Resources resources, Screen screen, List list, Y41.l lVar, InterfaceC22983P interfaceC22983P, com.avito.android.analytics.screens.r rVar, FragmentManager fragmentManager, C7004a c7004a) {
            this.f230141a = interfaceC29970g;
            this.f230144b = new i(interfaceC29970g);
            this.f230147c = new c(interfaceC29970g);
            f fVar = new f(interfaceC29970g);
            this.f230150d = fVar;
            this.f230153e = dagger.internal.B.a(new C42348c(c42347b, this.f230147c, com.avito.android.photo_storage.k.a(fVar)));
            p pVar = new p(interfaceC29970g);
            this.f230156f = pVar;
            this.f230159g = dagger.internal.B.a(new C42349d(c42347b, this.f230153e, N70.d.a(pVar)));
            this.f230162h = new s(interfaceC29970g);
            this.f230165i = com.avito.android.photo_storage.f.a(this.f230150d);
            this.f230168j = C49468b.a(this.f230165i, com.avito.android.photo_storage.h.a(this.f230150d));
            this.f230171k = new h(interfaceC29970g);
            this.f230174l = new x(interfaceC29970g);
            dagger.internal.u<String> uVarD = dagger.internal.g.d(f.a.f230249a);
            this.f230177m = uVarD;
            this.f230180n = dagger.internal.g.d(new com.avito.android.profile_management_core.images.m(uVarD, this.f230144b, this.f230159g, this.f230162h, this.f230168j, this.f230171k, this.f230174l, this.f230156f));
            this.f230183o = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f230186p = C31144q0.a(c31138n0);
            this.f230189q = new A(interfaceC29970g);
            this.f230192r = dagger.internal.g.d(com.avito.android.profile_settings_extended.adapter.setting.e.a());
            dagger.internal.u<com.avito.android.profile_settings_extended.P> uVarD2 = dagger.internal.g.d(new S(dagger.internal.l.a(resources)));
            this.f230195s = uVarD2;
            this.f230198t = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.geo.d(uVarD2, this.f230174l));
            dagger.internal.u<com.avito.android.edit_carousel.w> uVarD3 = dagger.internal.g.d(com.avito.android.edit_carousel.y.a());
            this.f230201u = uVarD3;
            o oVar = new o(interfaceC29970g);
            w wVar = new w(interfaceC29970g);
            this.f230207w = wVar;
            this.f230210x = dagger.internal.g.d(new com.avito.android.profile_settings_extended.converter.d(this.f230192r, this.f230198t, uVarD3, new com.avito.android.profile_settings_extended.converter.f(oVar, wVar), this.f230174l, wVar));
            dagger.internal.u<com.avito.android.profile_settings_extended.converter.g> uVarD4 = dagger.internal.g.d(com.avito.android.profile_settings_extended.converter.i.a());
            this.f230213y = uVarD4;
            this.f230216z = dagger.internal.g.d(new C33510x(uVarD4, this.f230144b, this.f230189q, this.f230210x, this.f230171k));
            dagger.internal.u<com.avito.android.connection_quality.connectivity.a> uVarA = dagger.internal.B.a(new com.avito.android.connection_quality.connectivity.i(this.f230150d, new y(interfaceC29970g)));
            this.f230087B = uVarA;
            C7005a c7005a = new C7005a(interfaceC29970g);
            this.f230090C = c7005a;
            C7006b c7006b = new C7006b(interfaceC29970g);
            this.f230093D = c7006b;
            this.f230096E = new N(uVarA, this.f230180n, this.f230195s, c7005a, c7006b);
            this.f230099F = dagger.internal.g.d(new com.avito.android.profile_settings_extended.W(this.f230144b, this.f230156f));
            this.f230103H = dagger.internal.g.d(new C33477k(new v(interfaceC29970g)));
            this.f230105I = dagger.internal.g.d(new com.avito.android.profile_settings_extended.carousel.d(this.f230144b, this.f230156f, this.f230093D));
            this.f230109K = new com.avito.android.profile_settings_extended.adapter.universal.section.o(new e(interfaceC29970g), this.f230171k);
            dagger.internal.u<com.avito.android.profile_settings_extended.phones.d> uVarD5 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.phones.h(this.f230144b, this.f230156f, this.f230174l));
            this.f230111L = uVarD5;
            this.f230115N = dagger.internal.g.d(new com.avito.android.profile_settings_extended.phones.c(uVarD5, this.f230195s, new q(interfaceC29970g), O3.f318703a, this.f230171k));
            this.f230117O = dagger.internal.g.d(new C33471e(this.f230144b, this.f230156f));
            this.f230119P = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.item_selections.c(this.f230144b, this.f230156f, this.f230171k));
            this.f230121Q = new g(bVar);
            this.f230123R = W.a(C49228b.a(this.f230147c), com.avito.android.util.T.f318740a);
            dagger.internal.u<InterfaceC13947a> uVarD6 = dagger.internal.g.d(new C13949c(new u(interfaceC29970g)));
            this.f230127T = uVarD6;
            dagger.internal.u<InterfaceC33507u> uVar = this.f230216z;
            N n12 = this.f230096E;
            dagger.internal.u<T> uVar2 = this.f230099F;
            dagger.internal.u<InterfaceC33475i> uVar3 = this.f230103H;
            dagger.internal.u<com.avito.android.profile_settings_extended.carousel.a> uVar4 = this.f230105I;
            com.avito.android.profile_settings_extended.adapter.universal.section.o oVar2 = this.f230109K;
            dagger.internal.u<com.avito.android.profile_settings_extended.phones.a> uVar5 = this.f230115N;
            dagger.internal.u<InterfaceC33467a> uVar6 = this.f230117O;
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.item_selections.a> uVar7 = this.f230119P;
            dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> uVar8 = this.f230121Q;
            dagger.internal.u<E> uVar9 = this.f230090C;
            dagger.internal.u<com.avito.android.profile_settings_extended.P> uVar10 = this.f230195s;
            dagger.internal.u<InterfaceC28373a> uVar11 = this.f230093D;
            this.f230129U = new com.avito.android.profile_settings_extended.mvi.x(uVar, n12, uVar2, uVar3, uVar4, oVar2, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, this.f230171k, this.f230123R, uVarD6);
            this.f230131V = new P(uVar9, uVar11);
            this.f230133W = new V(uVar4);
            this.f230135X = new z(interfaceC29970g);
            this.f230137Y = dagger.internal.l.a(screen);
            dagger.internal.u<C28478k> uVarD7 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.di.e(this.f230137Y, dagger.internal.l.a(rVar)));
            this.f230139Z = uVarD7;
            this.f230142a0 = com.avito.android.advert.item.delivery_suggests.l.i(this.f230135X, uVarD7);
            this.f230145b0 = new com.avito.android.profile_settings_extended.mvi.A(this.f230129U, this.f230131V, this.f230133W, this.f230142a0, dagger.internal.l.a(list));
            dagger.internal.u<n.a> uVarA2 = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f230148c0 = uVarA2;
            this.f230151d0 = new O(this.f230180n, this.f230183o, this.f230186p, this.f230145b0, uVarA2, this.f230207w);
            this.f230154e0 = dagger.internal.g.d(com.avito.android.promoblock.di.d.a());
            this.f230157f0 = dagger.internal.l.a(fragment);
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f230160g0 = lVarA;
            this.f230187p0 = dagger.internal.g.d(new Ac0.o(this.f230157f0, lVarA, new j(interfaceC29970g), new d(interfaceC29970g), new r(interfaceC29970g), this.f230121Q, new t(interfaceC29970g), new n(interfaceC29970g), new l(interfaceC29970g), new k(interfaceC29970g), new m(interfaceC29970g), this.f230177m));
            this.f230190q0 = dagger.internal.B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.u<com.avito.android.lib.util.groupable_item.b> uVarD8 = dagger.internal.g.d(com.avito.android.lib.util.groupable_item.d.a());
            this.f230193r0 = uVarD8;
            this.f230196s0 = dagger.internal.g.d(new com.avito.android.promoblock.j(uVarD8, this.f230154e0));
            dagger.internal.u<com.avito.android.promoblock.m> uVarD9 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.di.g(this.f230157f0));
            this.f230199t0 = uVarD9;
            this.f230202u0 = dagger.internal.g.d(new com.avito.android.promoblock.c(uVarD9, this.f230196s0));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.toggle.c> uVarD10 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.toggle.f(this.f230160g0));
            this.f230205v0 = uVarD10;
            this.f230208w0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.toggle.b(uVarD10));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.about.c> uVarD11 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.about.h(this.f230160g0));
            this.f230211x0 = uVarD11;
            this.f230214y0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.about.b(uVarD11));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.gallery.gallery_header.c> uVarD12 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.gallery.gallery_header.f(this.f230160g0));
            this.f230217z0 = uVarD12;
            this.f230085A0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.gallery.gallery_header.b(uVarD12));
            com.avito.android.profile_settings_extended.adapter.gallery.image.f fVar2 = new com.avito.android.profile_settings_extended.adapter.gallery.image.f(this.f230160g0, com.avito.android.profile_management_core.images.entity.e.a());
            this.f230088B0 = fVar2;
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.gallery.image.c> uVarD13 = dagger.internal.g.d(fVar2);
            this.f230091C0 = uVarD13;
            this.f230094D0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.gallery.image.b(uVarD13));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.gallery.appending.c> uVarD14 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.gallery.appending.f(this.f230160g0));
            this.f230097E0 = uVarD14;
            this.f230100F0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.gallery.appending.b(uVarD14));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.banner.c> uVarD15 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.banner.h(this.f230160g0));
            this.f230102G0 = uVarD15;
            this.f230104H0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.banner.b(uVarD15));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.setting.f> uVarD16 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.setting.j(this.f230160g0));
            this.f230106I0 = uVarD16;
            this.f230108J0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.setting.b(uVarD16));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.geo.g> uVarD17 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.geo.k(this.f230160g0));
            this.f230110K0 = uVarD17;
            this.f230112L0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.geo.f(uVarD17));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.geo_v2.header.e> uVarD18 = dagger.internal.g.d(com.avito.android.profile_settings_extended.adapter.geo_v2.header.g.a());
            this.f230114M0 = uVarD18;
            this.f230116N0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.geo_v2.header.b(uVarD18));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.geo_v2.address.c> uVarD19 = dagger.internal.g.d(com.avito.android.profile_settings_extended.adapter.geo_v2.address.e.a());
            this.f230118O0 = uVarD19;
            this.f230120P0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.geo_v2.address.b(uVarD19));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.geo_v2.footer.e> uVarD20 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.geo_v2.footer.h(this.f230160g0));
            this.f230122Q0 = uVarD20;
            this.f230124R0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.geo_v2.footer.b(uVarD20));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.link_edit.c> uVarD21 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.link_edit.g(this.f230160g0));
            this.f230126S0 = uVarD21;
            this.f230128T0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.link_edit.b(uVarD21));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.phones.c> uVarD22 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.phones.j(this.f230160g0, this.f230090C, this.f230093D));
            this.f230130U0 = uVarD22;
            this.f230132V0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.phones.b(uVarD22));
            this.f230134W0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.carousel.k(this.f230160g0));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.carousel.adapter.c> uVarD23 = dagger.internal.g.d(com.avito.android.profile_settings_extended.adapter.carousel.adapter.e.a());
            this.f230136X0 = uVarD23;
            dagger.internal.u<com.avito.konveyor.a> uVarD24 = dagger.internal.g.d(new Wb0.d(new com.avito.android.profile_settings_extended.adapter.carousel.adapter.b(uVarD23)));
            this.f230138Y0 = uVarD24;
            this.f230140Z0 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.carousel.b(this.f230134W0, uVarD24, new C15741c(uVarD24)));
            this.f230143a1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.item_selections.j(this.f230160g0));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.c> uVarD25 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.f(this.f230160g0));
            this.f230146b1 = uVarD25;
            this.f230149c1 = new com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.b(uVarD25);
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create.c> uVarD26 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create.f(this.f230160g0));
            this.f230152d1 = uVarD26;
            this.f230155e1 = new com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create.b(uVarD26);
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.item_selections.adapter.empty.c> uVarD27 = dagger.internal.g.d(com.avito.android.profile_settings_extended.adapter.item_selections.adapter.empty.e.a());
            this.f230158f1 = uVarD27;
            this.f230161g1 = new com.avito.android.profile_settings_extended.adapter.item_selections.adapter.empty.b(uVarD27);
            A.b bVarA = dagger.internal.A.a(3, 0);
            com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.b bVar2 = this.f230149c1;
            List<dagger.internal.u<T>> list2 = bVarA.f393937a;
            list2.add(bVar2);
            list2.add(this.f230155e1);
            list2.add(this.f230161g1);
            dagger.internal.u<com.avito.konveyor.a> uVarD28 = dagger.internal.g.d(new C42357c(bVarA.b()));
            this.f230164h1 = uVarD28;
            this.f230167i1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.item_selections.f(this.f230143a1, new C42356b(uVarD28), uVarD28));
            this.f230170j1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.popup_banner.b(new com.avito.android.profile_settings_extended.adapter.popup_banner.e(this.f230160g0)));
            this.f230173k1 = new com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.b(new com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.f(this.f230160g0, this.f230093D));
            this.f230176l1 = dagger.internal.g.d(this.f230173k1);
            this.f230179m1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner.b(new com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner.e(this.f230160g0, this.f230093D)));
            this.f230182n1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.select.b(new com.avito.android.profile_settings_extended.adapter.select.e(this.f230160g0)));
            this.f230185o1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.count.b(new com.avito.android.profile_settings_extended.adapter.count.e(this.f230160g0)));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.badge_bar.c> uVarD29 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.badge_bar.f(this.f230160g0));
            this.f230188p1 = uVarD29;
            this.f230191q1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.badge_bar.b(uVarD29));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.section_header.c> uVarD30 = dagger.internal.g.d(com.avito.android.profile_settings_extended.adapter.section_header.e.a());
            this.f230194r1 = uVarD30;
            this.f230197s1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.section_header.b(uVarD30));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.basic_info_v2.c> uVarD31 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.basic_info_v2.g(this.f230160g0));
            this.f230200t1 = uVarD31;
            this.f230203u1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.basic_info_v2.b(uVarD31));
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.universal.header.c> uVarD32 = dagger.internal.g.d(com.avito.android.profile_settings_extended.adapter.universal.header.e.a());
            this.f230206v1 = uVarD32;
            this.f230209w1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.universal.header.b(uVarD32));
            this.f230212x1 = new com.avito.android.profile_settings_extended.adapter.universal.create.f(this.f230160g0);
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.universal.create.c> uVarD33 = dagger.internal.g.d(this.f230212x1);
            this.f230215y1 = uVarD33;
            this.f230218z1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.universal.create.b(uVarD33));
            dagger.internal.u<com.avito.android.extended_profile_ui_components.universal_widget.a> uVarD34 = dagger.internal.g.d(com.avito.android.profile_settings_extended.adapter.universal.section.di.b.a());
            this.f230086A1 = uVarD34;
            dagger.internal.u<com.avito.android.profile_settings_extended.adapter.universal.section.c> uVarD35 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.universal.section.i(this.f230160g0, uVarD34));
            this.f230089B1 = uVarD35;
            this.f230092C1 = dagger.internal.g.d(new com.avito.android.profile_settings_extended.adapter.universal.section.b(uVarD35));
            A.b bVarA2 = dagger.internal.A.a(27, 1);
            bVarA2.f393938b.add(this.f230190q0);
            dagger.internal.u<TV0.b<?, ?>> uVar12 = this.f230202u0;
            List<dagger.internal.u<T>> list3 = bVarA2.f393937a;
            list3.add(uVar12);
            list3.add(this.f230208w0);
            list3.add(this.f230214y0);
            list3.add(this.f230085A0);
            list3.add(this.f230094D0);
            list3.add(this.f230100F0);
            list3.add(this.f230104H0);
            list3.add(this.f230108J0);
            list3.add(this.f230112L0);
            list3.add(this.f230116N0);
            list3.add(this.f230120P0);
            list3.add(this.f230124R0);
            list3.add(this.f230128T0);
            list3.add(this.f230132V0);
            list3.add(this.f230140Z0);
            list3.add(this.f230167i1);
            list3.add(this.f230170j1);
            list3.add(this.f230176l1);
            list3.add(this.f230179m1);
            list3.add(this.f230182n1);
            list3.add(this.f230185o1);
            list3.add(this.f230191q1);
            list3.add(this.f230197s1);
            list3.add(this.f230203u1);
            list3.add(this.f230209w1);
            list3.add(this.f230218z1);
            list3.add(this.f230092C1);
            this.f230095D1 = com.avito.android.advert.item.delivery_suggests.l.k(bVarA2.b());
            this.f230098E1 = new com.avito.android.profile_settings_extended.adapter.gallery.image.k(this.f230088B0);
        }

        @Override // com.avito.android.profile_settings_extended.di.b
        public final void a(ExtendedProfileSettingsFragment extendedProfileSettingsFragment) {
            extendedProfileSettingsFragment.f229007t0 = this.f230151d0;
            extendedProfileSettingsFragment.f229009v0 = this.f230154e0.get();
            extendedProfileSettingsFragment.f229010w0 = this.f230187p0.get();
            extendedProfileSettingsFragment.f229011x0 = this.f230095D1.get();
            extendedProfileSettingsFragment.f229012y0 = dagger.internal.g.a(this.f230098E1);
            InterfaceC29970g interfaceC29970g = this.f230141a;
            extendedProfileSettingsFragment.f229013z0 = interfaceC29970g.h();
            com.avito.android.util.text.a aVarE = interfaceC29970g.e();
            dagger.internal.t.c(aVarE);
            extendedProfileSettingsFragment.f228998A0 = aVarE;
            com.avito.android.profile_settings.u uVarS3 = interfaceC29970g.s3();
            dagger.internal.t.c(uVarS3);
            extendedProfileSettingsFragment.f228999B0 = uVarS3;
        }
    }

    /* compiled from: DaggerExtendedProfileSettingsComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.profile_settings_extended.di.b.a
        public final com.avito.android.profile_settings_extended.di.b a(ActivityC22955m activityC22955m, ExtendedProfileSettingsFragment extendedProfileSettingsFragment, Resources resources, ExtendedProfileSettingsScreen extendedProfileSettingsScreen, List list, l lVar, ExtendedProfileSettingsFragment extendedProfileSettingsFragment2, r rVar, FragmentManager fragmentManager, C31138n0 c31138n0, InterfaceC29970g interfaceC29970g, InterfaceC39417a interfaceC39417a) {
            extendedProfileSettingsScreen.getClass();
            list.getClass();
            interfaceC39417a.getClass();
            return new b(new C42347b(), c31138n0, interfaceC29970g, interfaceC39417a, activityC22955m, extendedProfileSettingsFragment, resources, extendedProfileSettingsScreen, list, lVar, extendedProfileSettingsFragment2, rVar, fragmentManager, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
