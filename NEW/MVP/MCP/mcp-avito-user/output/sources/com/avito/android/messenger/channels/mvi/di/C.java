package com.avito.android.messenger.channels.mvi.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.app.task.InterfaceC28580o;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.analytics.InterfaceC31662s;
import com.avito.android.messenger.channels.adapter.konveyor.channel.c;
import com.avito.android.messenger.channels.adapter.konveyor.channel.global.c;
import com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner.c;
import com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.e;
import com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.m;
import com.avito.android.messenger.channels.adapter.konveyor.support_channel.c;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.messenger.channels.mvi.data.C31699g;
import com.avito.android.messenger.channels.mvi.data.C31705m;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31693a;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31697e;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31706n;
import com.avito.android.messenger.channels.mvi.data.c0;
import com.avito.android.messenger.channels.mvi.data.e0;
import com.avito.android.messenger.channels.mvi.di.InterfaceC31741i;
import com.avito.android.messenger.channels.mvi.di.InterfaceC31746n;
import com.avito.android.messenger.channels.mvi.header_feature.C31756h;
import com.avito.android.messenger.channels.mvi.interactor.C31765c;
import com.avito.android.messenger.channels.mvi.interactor.C31770h;
import com.avito.android.messenger.channels.mvi.interactor.C31771i;
import com.avito.android.messenger.channels.mvi.interactor.InterfaceC31763a;
import com.avito.android.messenger.channels.mvi.list_feature.Z0;
import com.avito.android.messenger.channels.mvi.list_feature.a1;
import com.avito.android.messenger.channels.mvi.list_feature.e1;
import com.avito.android.messenger.channels.mvi.list_feature.h1;
import com.avito.android.messenger.channels.mvi.list_feature.j1;
import com.avito.android.messenger.channels.mvi.list_feature.n1;
import com.avito.android.messenger.channels.mvi.list_feature.p1;
import com.avito.android.messenger.channels.mvi.list_feature.s1;
import com.avito.android.messenger.channels.mvi.list_feature.v1;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.channels.mvi.sync.G0;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0;
import com.avito.android.messenger.channels.mvi.sync.z0;
import com.avito.android.messenger.channels.mvi.view.C31895y;
import com.avito.android.messenger.channels.mvi.view.C31896z;
import com.avito.android.messenger.channels.mvi.view.ChannelsFragment;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import com.avito.android.messenger.channels.mvi.view.Z;
import com.avito.android.messenger.channels.mvi.view.g0;
import com.avito.android.messenger.conversation.mvi.data.C32023l;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32019h;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32021j;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.messenger.di.M1;
import com.avito.android.messenger.di.N1;
import com.avito.android.messenger.di.O1;
import com.avito.android.messenger.di.Q1;
import com.avito.android.messenger.di.S1;
import com.avito.android.messenger.di.V1;
import com.avito.android.messenger.di.o2;
import com.avito.android.messenger.di.p2;
import com.avito.android.messenger.w0;
import com.avito.android.persistence.messenger.C33126v0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.q;
import hz.InterfaceC41196a;
import iP.InterfaceC41329a;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import oW.InterfaceC44697a;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.internal.connection.InterfaceC47748a;
import ur.InterfaceC49101b;

/* compiled from: DaggerChannelsComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class C {

    /* compiled from: DaggerChannelsComponent.java */
    public static final class b implements InterfaceC31741i.a {

        /* renamed from: a, reason: collision with root package name */
        public ChannelsFragment f187274a;

        /* renamed from: b, reason: collision with root package name */
        public C28478k f187275b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC30106l7 f187276c;

        /* renamed from: d, reason: collision with root package name */
        public Resources f187277d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC31742j f187278e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC44697a f187279f;

        /* renamed from: g, reason: collision with root package name */
        public InterfaceC39417a f187280g;

        /* renamed from: h, reason: collision with root package name */
        public ChannelsFragment f187281h;

        public b() {
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        public final InterfaceC31741i.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f187280g = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        public final InterfaceC31741i.a b(Resources resources) {
            this.f187277d = resources;
            return this;
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        public final InterfaceC31741i build() {
            dagger.internal.t.a(Fragment.class, this.f187274a);
            dagger.internal.t.a(C28478k.class, this.f187275b);
            dagger.internal.t.a(InterfaceC30106l7.class, this.f187276c);
            dagger.internal.t.a(Resources.class, this.f187277d);
            dagger.internal.t.a(InterfaceC31742j.class, this.f187278e);
            dagger.internal.t.a(InterfaceC44697a.class, this.f187279f);
            dagger.internal.t.a(cv.b.class, this.f187280g);
            dagger.internal.t.a(InterfaceC22983P.class, this.f187281h);
            return new c(this.f187278e, this.f187279f, this.f187276c, this.f187280g, this.f187274a, this.f187275b, this.f187277d, this.f187281h, null);
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        @Deprecated
        public final InterfaceC31741i.a c(o2 o2Var) {
            o2Var.getClass();
            return this;
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        public final InterfaceC31741i.a d(ChannelsFragment channelsFragment) {
            this.f187274a = channelsFragment;
            return this;
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        public final InterfaceC31741i.a e(InterfaceC31742j interfaceC31742j) {
            this.f187278e = interfaceC31742j;
            return this;
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        public final InterfaceC31741i.a f(InterfaceC44697a interfaceC44697a) {
            this.f187279f = interfaceC44697a;
            return this;
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        public final InterfaceC31741i.a g(C28478k c28478k) {
            this.f187275b = c28478k;
            return this;
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        public final InterfaceC31741i.a h(ChannelsFragment channelsFragment) {
            this.f187281h = channelsFragment;
            return this;
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i.a
        public final InterfaceC31741i.a l(InterfaceC30106l7 interfaceC30106l7) {
            this.f187276c = interfaceC30106l7;
            return this;
        }
    }

    /* compiled from: DaggerChannelsComponent.java */
    public static final class c implements InterfaceC31741i {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC41329a> f187282A;

        /* renamed from: B, reason: collision with root package name */
        public final cZ.d f187283B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32208e> f187284C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<WY.a> f187285D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31763a> f187286E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<C30277e1> f187287F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<R0> f187288G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC41196a> f187289H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.filter.j> f187290I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<GY.c> f187291J;

        /* renamed from: K, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.header_feature.L f187292K;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.header_feature.N f187293L;

        /* renamed from: M, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.di.y f187294M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<MessengerDatabase> f187295N;

        /* renamed from: O, reason: collision with root package name */
        public final M1 f187296O;

        /* renamed from: P, reason: collision with root package name */
        public final Q1 f187297P;

        /* renamed from: Q, reason: collision with root package name */
        public final V1 f187298Q;

        /* renamed from: R, reason: collision with root package name */
        public final S1 f187299R;

        /* renamed from: S, reason: collision with root package name */
        public final O1 f187300S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32019h> f187301T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32021j> f187302U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31706n> f187303V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<c0> f187304W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31693a> f187305X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31697e> f187306Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.mvi.data.r> f187307Z;

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC31742j f187308a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.service.user_last_activity.a> f187309a0;

        /* renamed from: b, reason: collision with root package name */
        public final Fragment f187310b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f187311b0;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f187312c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31700h> f187313c0;

        /* renamed from: d, reason: collision with root package name */
        public final c f187314d = this;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35741a1> f187315d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f187316e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31857r0> f187317e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.statsd.F> f187318f;

        /* renamed from: f0, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.interactor.I f187319f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.filter.a> f187320g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<ChannelSyncAgent> f187321g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f187322h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<G0> f187323h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f187324i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service.short_task.j> f187325i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.analytics.b> f187326j;

        /* renamed from: j0, reason: collision with root package name */
        public final com.avito.android.messenger.service.r f187327j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<z0> f187328k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.a> f187329k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<MessengerStatsdEventFactory> f187330l;

        /* renamed from: l0, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.di.u f187331l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.analytics.d> f187332m;

        /* renamed from: m0, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.di.v f187333m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<w0> f187334n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.analytics.i> f187335n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47842z> f187336o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.action_banner.g> f187337o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f187338p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.action_banner.a> f187339p0;

        /* renamed from: q, reason: collision with root package name */
        public final C31771i f187340q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31662s> f187341q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.f f187342r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<Context> f187343r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f187344s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f187345s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<SharedPreferences> f187346t;

        /* renamed from: t0, reason: collision with root package name */
        public final s1 f187347t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<u3.g<MessengerFolderTabsTestGroup>> f187348u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.f> f187349u0;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.presenter.d f187350v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<Locale> f187351v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<JY.a> f187352w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.date_time_formatter.o> f187353w0;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.interactor.y f187354x;

        /* renamed from: x0, reason: collision with root package name */
        public final e1 f187355x0;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.di.t f187356y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47748a> f187357y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.blacklist_reasons.y> f187358z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49101b> f187359z0;

        /* compiled from: DaggerChannelsComponent.java */
        public static final class A implements dagger.internal.u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187360a;

            public A(InterfaceC31742j interfaceC31742j) {
                this.f187360a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f187360a.d0();
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class B implements dagger.internal.u<MessengerDatabase> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187361a;

            public B(InterfaceC31742j interfaceC31742j) {
                this.f187361a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerDatabase messengerDatabaseW0 = this.f187361a.W0();
                dagger.internal.t.c(messengerDatabaseW0);
                return messengerDatabaseW0;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$C, reason: collision with other inner class name */
        public static final class C5490C implements dagger.internal.u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187362a;

            public C5490C(InterfaceC31742j interfaceC31742j) {
                this.f187362a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f187362a.C();
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class D implements dagger.internal.u<u3.g<MessengerFolderTabsTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187363a;

            public D(InterfaceC31742j interfaceC31742j) {
                this.f187363a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<MessengerFolderTabsTestGroup> gVarP6 = this.f187363a.P6();
                dagger.internal.t.c(gVarP6);
                return gVarP6;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class E implements dagger.internal.u<G0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187364a;

            public E(InterfaceC31742j interfaceC31742j) {
                this.f187364a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G0 g0Dm = this.f187364a.Dm();
                dagger.internal.t.c(g0Dm);
                return g0Dm;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class F implements dagger.internal.u<WY.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187365a;

            public F(InterfaceC31742j interfaceC31742j) {
                this.f187365a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WY.a aVarWh = this.f187365a.Wh();
                dagger.internal.t.c(aVarWh);
                return aVarWh;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class G implements dagger.internal.u<MessengerStatsdEventFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187366a;

            public G(InterfaceC31742j interfaceC31742j) {
                this.f187366a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerStatsdEventFactory messengerStatsdEventFactoryYj = this.f187366a.yj();
                dagger.internal.t.c(messengerStatsdEventFactoryYj);
                return messengerStatsdEventFactoryYj;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class H implements dagger.internal.u<InterfaceC32208e> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187367a;

            public H(InterfaceC31742j interfaceC31742j) {
                this.f187367a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32208e interfaceC32208eI7 = this.f187367a.I7();
                dagger.internal.t.c(interfaceC32208eI7);
                return interfaceC32208eI7;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class I implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187368a;

            public I(InterfaceC31742j interfaceC31742j) {
                this.f187368a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f187368a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class J implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f187369a;

            public J(InterfaceC30106l7 interfaceC30106l7) {
                this.f187369a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f187369a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class K implements dagger.internal.u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187370a;

            public K(InterfaceC31742j interfaceC31742j) {
                this.f187370a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f187370a.l();
                dagger.internal.t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class L implements dagger.internal.u<SharedPreferences> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187371a;

            public L(InterfaceC31742j interfaceC31742j) {
                this.f187371a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SharedPreferences sharedPreferencesR1 = this.f187371a.R1();
                dagger.internal.t.c(sharedPreferencesR1);
                return sharedPreferencesR1;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class M implements dagger.internal.u<com.avito.android.service.short_task.j> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187372a;

            public M(InterfaceC31742j interfaceC31742j) {
                this.f187372a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.service.short_task.j jVarA2 = this.f187372a.A2();
                dagger.internal.t.c(jVarA2);
                return jVarA2;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class N implements dagger.internal.u<com.avito.android.analytics.statsd.F> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187373a;

            public N(InterfaceC31742j interfaceC31742j) {
                this.f187373a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.statsd.F fN02 = this.f187373a.N0();
                dagger.internal.t.c(fN02);
                return fN02;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class O implements dagger.internal.u<w0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187374a;

            public O(InterfaceC31742j interfaceC31742j) {
                this.f187374a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                w0 w0VarK0 = this.f187374a.k0();
                dagger.internal.t.c(w0VarK0);
                return w0VarK0;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class P implements dagger.internal.u<com.avito.android.messenger.service.user_last_activity.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187375a;

            public P(InterfaceC31742j interfaceC31742j) {
                this.f187375a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.service.user_last_activity.a aVarR6 = this.f187375a.R6();
                dagger.internal.t.c(aVarR6);
                return aVarR6;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$a, reason: case insensitive filesystem */
        public static final class C31718a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187376a;

            public C31718a(InterfaceC31742j interfaceC31742j) {
                this.f187376a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f187376a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$b, reason: case insensitive filesystem */
        public static final class C31719b implements dagger.internal.u<InterfaceC47748a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187377a;

            public C31719b(InterfaceC31742j interfaceC31742j) {
                this.f187377a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC47748a interfaceC47748aQa = this.f187377a.qa();
                dagger.internal.t.c(interfaceC47748aQa);
                return interfaceC47748aQa;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$c, reason: collision with other inner class name */
        public static final class C5491c implements dagger.internal.u<InterfaceC49101b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187378a;

            public C5491c(InterfaceC31742j interfaceC31742j) {
                this.f187378a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f187378a.G();
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$d, reason: case insensitive filesystem */
        public static final class C31720d implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187379a;

            public C31720d(InterfaceC31742j interfaceC31742j) {
                this.f187379a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f187379a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$e, reason: case insensitive filesystem */
        public static final class C31721e implements dagger.internal.u<JY.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187380a;

            public C31721e(InterfaceC31742j interfaceC31742j) {
                this.f187380a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                JY.a aVarZ6 = this.f187380a.Z6();
                dagger.internal.t.c(aVarZ6);
                return aVarZ6;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$f, reason: case insensitive filesystem */
        public static final class C31722f implements dagger.internal.u<com.avito.android.messenger.blacklist_reasons.y> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187381a;

            public C31722f(InterfaceC31742j interfaceC31742j) {
                this.f187381a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.blacklist_reasons.y yVarF2 = this.f187381a.F2();
                dagger.internal.t.c(yVarF2);
                return yVarF2;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$g, reason: case insensitive filesystem */
        public static final class C31723g implements dagger.internal.u<InterfaceC31693a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187382a;

            public C31723g(InterfaceC31742j interfaceC31742j) {
                this.f187382a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f187382a.x3();
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$h, reason: case insensitive filesystem */
        public static final class C31724h implements dagger.internal.u<InterfaceC31706n> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187383a;

            public C31724h(InterfaceC31742j interfaceC31742j) {
                this.f187383a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f187383a.P3();
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$i, reason: case insensitive filesystem */
        public static final class C31725i implements dagger.internal.u<com.avito.android.messenger.channels.action_banner.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187384a;

            public C31725i(InterfaceC31742j interfaceC31742j) {
                this.f187384a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.channels.action_banner.a aVarTl = this.f187384a.tl();
                dagger.internal.t.c(aVarTl);
                return aVarTl;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$j, reason: case insensitive filesystem */
        public static final class C31726j implements dagger.internal.u<GY.c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187385a;

            public C31726j(InterfaceC31742j interfaceC31742j) {
                this.f187385a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                GY.c cVarRc = this.f187385a.rc();
                dagger.internal.t.c(cVarRc);
                return cVarRc;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$k, reason: case insensitive filesystem */
        public static final class C31727k implements dagger.internal.u<com.avito.android.messenger.channels.filter.j> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187386a;

            public C31727k(InterfaceC31742j interfaceC31742j) {
                this.f187386a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.channels.filter.j jVarNl = this.f187386a.Nl();
                dagger.internal.t.c(jVarNl);
                return jVarNl;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$l, reason: case insensitive filesystem */
        public static final class C31728l implements dagger.internal.u<com.avito.android.messenger.channels.action_banner.g> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187387a;

            public C31728l(InterfaceC31742j interfaceC31742j) {
                this.f187387a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.channels.action_banner.g gVarCi = this.f187387a.Ci();
                dagger.internal.t.c(gVarCi);
                return gVarCi;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$m, reason: case insensitive filesystem */
        public static final class C31729m implements dagger.internal.u<com.avito.android.messenger.channels.analytics.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187388a;

            public C31729m(InterfaceC31742j interfaceC31742j) {
                this.f187388a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.channels.analytics.b bVarDl = this.f187388a.dl();
                dagger.internal.t.c(bVarDl);
                return bVarDl;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$n, reason: case insensitive filesystem */
        public static final class C31730n implements dagger.internal.u<ChannelSyncAgent> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187389a;

            public C31730n(InterfaceC31742j interfaceC31742j) {
                this.f187389a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ChannelSyncAgent channelSyncAgentGj = this.f187389a.gj();
                dagger.internal.t.c(channelSyncAgentGj);
                return channelSyncAgentGj;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$o, reason: case insensitive filesystem */
        public static final class C31731o implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187390a;

            public C31731o(InterfaceC31742j interfaceC31742j) {
                this.f187390a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f187390a.g();
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        /* renamed from: com.avito.android.messenger.channels.mvi.di.C$c$p, reason: case insensitive filesystem */
        public static final class C31732p implements dagger.internal.u<InterfaceC41329a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187391a;

            public C31732p(InterfaceC31742j interfaceC31742j) {
                this.f187391a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41329a interfaceC41329aR2 = this.f187391a.r2();
                dagger.internal.t.c(interfaceC41329aR2);
                return interfaceC41329aR2;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class q implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f187392a;

            public q(cv.b bVar) {
                this.f187392a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f187392a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class r implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187393a;

            public r(InterfaceC31742j interfaceC31742j) {
                this.f187393a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f187393a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class s implements dagger.internal.u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187394a;

            public s(InterfaceC31742j interfaceC31742j) {
                this.f187394a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f187394a.E0();
                dagger.internal.t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class t implements dagger.internal.u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187395a;

            public t(InterfaceC31742j interfaceC31742j) {
                this.f187395a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f187395a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class u implements dagger.internal.u<com.avito.android.server_time.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187396a;

            public u(InterfaceC31742j interfaceC31742j) {
                this.f187396a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.a aVarT = this.f187396a.T();
                dagger.internal.t.c(aVarT);
                return aVarT;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class v implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187397a;

            public v(InterfaceC31742j interfaceC31742j) {
                this.f187397a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f187397a.locale();
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class w implements dagger.internal.u<InterfaceC31857r0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187398a;

            public w(InterfaceC31742j interfaceC31742j) {
                this.f187398a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC31857r0 interfaceC31857r0Q7 = this.f187398a.q7();
                dagger.internal.t.c(interfaceC31857r0Q7);
                return interfaceC31857r0Q7;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class x implements dagger.internal.u<InterfaceC32019h> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187399a;

            public x(InterfaceC31742j interfaceC31742j) {
                this.f187399a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f187399a.p1();
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class y implements dagger.internal.u<z0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187400a;

            public y(InterfaceC31742j interfaceC31742j) {
                this.f187400a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                z0 z0VarC2 = this.f187400a.C2();
                dagger.internal.t.c(z0VarC2);
                return z0VarC2;
            }
        }

        /* compiled from: DaggerChannelsComponent.java */
        public static final class z implements dagger.internal.u<InterfaceC31662s> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31742j f187401a;

            public z(InterfaceC31742j interfaceC31742j) {
                this.f187401a = interfaceC31742j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC31662s interfaceC31662sUj = this.f187401a.Uj();
                dagger.internal.t.c(interfaceC31662sUj);
                return interfaceC31662sUj;
            }
        }

        public c(InterfaceC31742j interfaceC31742j, InterfaceC44697a interfaceC44697a, InterfaceC30106l7 interfaceC30106l7, cv.b bVar, Fragment fragment, C28478k c28478k, Resources resources, InterfaceC22983P interfaceC22983P, a aVar) {
            this.f187308a = interfaceC31742j;
            this.f187310b = fragment;
            this.f187312c = bVar;
            C31718a c31718a = new C31718a(interfaceC31742j);
            this.f187316e = c31718a;
            this.f187320g = dagger.internal.g.d(new com.avito.android.messenger.channels.filter.c(c31718a, new N(interfaceC31742j)));
            this.f187322h = new J(interfaceC30106l7);
            dagger.internal.u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new com.avito.android.messenger.channels.mvi.di.A(dagger.internal.l.a(c28478k), this.f187322h));
            this.f187324i = uVarD;
            C31729m c31729m = new C31729m(interfaceC31742j);
            this.f187326j = c31729m;
            this.f187332m = dagger.internal.g.d(new com.avito.android.messenger.channels.analytics.f(uVarD, c31729m, new y(interfaceC31742j), new G(interfaceC31742j), this.f187316e));
            O o12 = new O(interfaceC31742j);
            this.f187334n = o12;
            this.f187336o = new A(interfaceC31742j);
            I i12 = new I(interfaceC31742j);
            this.f187338p = i12;
            this.f187340q = new C31771i(o12, i12);
            this.f187342r = new dagger.internal.f();
            dagger.internal.l lVarA = dagger.internal.l.a(fragment);
            this.f187344s = lVarA;
            com.avito.android.messenger.channels.mvi.di.w wVar = new com.avito.android.messenger.channels.mvi.di.w(this.f187342r, lVarA);
            com.avito.android.messenger.channels.mvi.di.x xVar = new com.avito.android.messenger.channels.mvi.di.x(new L(interfaceC31742j));
            D d12 = new D(interfaceC31742j);
            dagger.internal.u<InterfaceC35745a5> uVar = this.f187338p;
            this.f187350v = new com.avito.android.messenger.channels.mvi.presenter.d(uVar, wVar, xVar, d12, this.f187316e);
            C31721e c31721e = new C31721e(interfaceC31742j);
            this.f187352w = c31721e;
            this.f187354x = new com.avito.android.messenger.channels.mvi.interactor.y(uVar, d12, this.f187336o, c31721e);
            q.b bVarA = dagger.internal.q.a(3);
            bVarA.a(C31770h.class, this.f187340q);
            bVarA.a(com.avito.android.messenger.channels.mvi.presenter.b.class, this.f187350v);
            bVarA.a(com.avito.android.messenger.channels.mvi.interactor.l.class, this.f187354x);
            dagger.internal.f.a(this.f187342r, dagger.internal.B.a(new com.avito.android.messenger.channels.mvi.di.P(bVarA.b())));
            this.f187356y = new com.avito.android.messenger.channels.mvi.di.t(this.f187342r, this.f187344s);
            this.f187358z = new C31722f(interfaceC31742j);
            this.f187283B = new cZ.d(new C31732p(interfaceC31742j));
            this.f187284C = new H(interfaceC31742j);
            F f12 = new F(interfaceC31742j);
            this.f187285D = f12;
            dagger.internal.u<InterfaceC31763a> uVarD2 = dagger.internal.g.d(new C31765c(f12));
            this.f187286E = uVarD2;
            C5490C c5490c = new C5490C(interfaceC31742j);
            this.f187287F = c5490c;
            r rVar = new r(interfaceC31742j);
            this.f187288G = rVar;
            s sVar = new s(interfaceC31742j);
            C31727k c31727k = new C31727k(interfaceC31742j);
            this.f187290I = c31727k;
            dagger.internal.u<w0> uVar2 = this.f187334n;
            dagger.internal.u<InterfaceC47842z> uVar3 = this.f187336o;
            com.avito.android.messenger.channels.mvi.di.t tVar = this.f187356y;
            dagger.internal.u<com.avito.android.messenger.blacklist_reasons.y> uVar4 = this.f187358z;
            cZ.d dVar = this.f187283B;
            dagger.internal.u<InterfaceC32208e> uVar5 = this.f187284C;
            com.avito.android.messenger.channels.mvi.header_feature.E e12 = new com.avito.android.messenger.channels.mvi.header_feature.E(uVar2, uVar3, tVar, uVar4, dVar, uVar5, uVarD2, c5490c, rVar, sVar, c31727k, this.f187352w);
            C31756h c31756h = new C31756h(uVar3, uVar5, rVar, c31727k);
            C31726j c31726j = new C31726j(interfaceC31742j);
            this.f187291J = c31726j;
            this.f187292K = new com.avito.android.messenger.channels.mvi.header_feature.L(c31726j);
            this.f187293L = new com.avito.android.messenger.channels.mvi.header_feature.N(new com.avito.android.messenger.channels.mvi.header_feature.H(e12, c31756h, com.avito.android.messenger.channels.mvi.header_feature.J.a(), this.f187292K, this.f187290I, this.f187291J));
            this.f187294M = new com.avito.android.messenger.channels.mvi.di.y(this.f187342r, this.f187344s);
            B b12 = new B(interfaceC31742j);
            this.f187295N = b12;
            this.f187296O = new M1(b12);
            this.f187297P = new Q1(b12);
            this.f187298Q = new V1(b12);
            this.f187299R = new S1(b12);
            this.f187300S = new O1(b12);
            this.f187302U = dagger.internal.B.a(new C32023l(new x(interfaceC31742j)));
            C31724h c31724h = new C31724h(interfaceC31742j);
            this.f187303V = c31724h;
            dagger.internal.u<c0> uVarA = dagger.internal.B.a(new e0(c31724h));
            this.f187304W = uVarA;
            dagger.internal.u<InterfaceC31697e> uVarA2 = dagger.internal.B.a(new C31699g(uVarA, new C31723g(interfaceC31742j), this.f187302U, this.f187303V));
            this.f187306Y = uVarA2;
            this.f187307Z = dagger.internal.B.a(new com.avito.android.messenger.channels.mvi.data.K(uVarA2, this.f187296O, this.f187297P, this.f187298Q, this.f187299R, this.f187300S));
            this.f187309a0 = new P(interfaceC31742j);
            this.f187311b0 = new q(bVar);
            dagger.internal.u<InterfaceC31700h> uVarA3 = dagger.internal.B.a(new C31705m(new N1(this.f187295N)));
            this.f187313c0 = uVarA3;
            t tVar2 = new t(interfaceC31742j);
            this.f187315d0 = tVar2;
            this.f187319f0 = new com.avito.android.messenger.channels.mvi.interactor.I(uVarA3, tVar2, this.f187316e, this.f187338p, new w(interfaceC31742j), this.f187334n);
            this.f187321g0 = new C31730n(interfaceC31742j);
            this.f187323h0 = new E(interfaceC31742j);
            this.f187327j0 = new com.avito.android.messenger.service.r(new M(interfaceC31742j));
            u uVar6 = new u(interfaceC31742j);
            dagger.internal.u<InterfaceC28373a> uVar7 = this.f187316e;
            this.f187331l0 = new com.avito.android.messenger.channels.mvi.di.u(uVar7, uVar6);
            this.f187333m0 = new com.avito.android.messenger.channels.mvi.di.v(uVar7, uVar6);
            this.f187335n0 = dagger.internal.g.d(new com.avito.android.messenger.channels.mvi.di.z(this.f187287F, new com.avito.android.messenger.channels.analytics.l(uVar7, this.f187338p, this.f187326j)));
            this.f187337o0 = new C31728l(interfaceC31742j);
            this.f187339p0 = new C31725i(interfaceC31742j);
            this.f187341q0 = new z(interfaceC31742j);
            C31731o c31731o = new C31731o(interfaceC31742j);
            this.f187343r0 = c31731o;
            this.f187347t0 = new s1(c31731o, new C31720d(interfaceC31742j));
            this.f187349u0 = new K(interfaceC31742j);
            this.f187351v0 = new v(interfaceC31742j);
            dagger.internal.u<com.avito.android.date_time_formatter.o> uVarA4 = dagger.internal.B.a(new p2(dagger.internal.l.a(resources), this.f187349u0, this.f187351v0));
            this.f187353w0 = uVarA4;
            this.f187355x0 = new e1(this.f187344s, this.f187347t0, this.f187349u0, uVarA4, new v1(this.f187343r0));
            this.f187357y0 = new C31719b(interfaceC31742j);
            this.f187359z0 = new C5491c(interfaceC31742j);
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i
        public final InterfaceC31746n.a a() {
            return new d(this.f187314d, null);
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31741i
        public final void b(ChannelsFragment channelsFragment) {
            InterfaceC31742j interfaceC31742j = this.f187308a;
            InterfaceC28580o interfaceC28580oGf = interfaceC31742j.Gf();
            dagger.internal.t.c(interfaceC28580oGf);
            channelsFragment.f188613t0 = interfaceC28580oGf;
            InterfaceC28373a interfaceC28373aA = interfaceC31742j.a();
            dagger.internal.t.c(interfaceC28373aA);
            channelsFragment.f188614u0 = interfaceC28373aA;
            channelsFragment.f188615v0 = this.f187320g.get();
            channelsFragment.f188616w0 = interfaceC31742j.C();
            channelsFragment.f188617x0 = this.f187332m.get();
            channelsFragment.f188618y0 = this.f187293L;
            channelsFragment.f188595A0 = interfaceC31742j.h();
            channelsFragment.f188596B0 = interfaceC31742j.x();
            channelsFragment.f188597C0 = interfaceC31742j.j1();
            MessengerDatabase messengerDatabaseW0 = interfaceC31742j.W0();
            dagger.internal.t.c(messengerDatabaseW0);
            channelsFragment.f188598D0 = messengerDatabaseW0;
            h31.e eVarA = dagger.internal.g.a(this.f187294M);
            u3.g<MessengerFolderTabsTestGroup> gVarP6 = interfaceC31742j.P6();
            dagger.internal.t.c(gVarP6);
            C30277e1 c30277e1C = interfaceC31742j.C();
            com.avito.android.messenger.channels.mvi.di.r.f187438a.getClass();
            MessengerFolderTabsTestGroup messengerFolderTabsTestGroup = gVarP6.f439742a.f439749b;
            messengerFolderTabsTestGroup.getClass();
            MessengerFolderTabsTestGroup messengerFolderTabsTestGroup2 = MessengerFolderTabsTestGroup.f67952d;
            Fragment fragment = this.f187310b;
            channelsFragment.f188599E0 = messengerFolderTabsTestGroup == messengerFolderTabsTestGroup2 ? new g0((com.avito.android.messenger.channels.mvi.presenter.a) eVarA.get(), fragment, c30277e1C) : new Z(fragment);
            InterfaceC32572u interfaceC32572uX0 = interfaceC31742j.x0();
            dagger.internal.t.c(interfaceC32572uX0);
            channelsFragment.f188600F0 = interfaceC32572uX0;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f187312c.u4();
            dagger.internal.t.c(aVarU4);
            channelsFragment.f188601G0 = aVarU4;
            JY.a aVarZ6 = interfaceC31742j.Z6();
            dagger.internal.t.c(aVarZ6);
            channelsFragment.f188602H0 = aVarZ6;
        }
    }

    /* compiled from: DaggerChannelsComponent.java */
    public static final class d implements InterfaceC31746n.a {

        /* renamed from: a, reason: collision with root package name */
        public final c f187402a;

        public d(c cVar, a aVar) {
            this.f187402a = cVar;
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31746n.a
        public final InterfaceC31746n a(C33126v0 c33126v0, C33126v0 c33126v02, C33126v0 c33126v03, com.avito.android.messenger.channels.mvi.view.D d12, C31895y c31895y, C31896z c31896z, com.avito.android.messenger.channels.mvi.view.C c12, com.avito.android.messenger.channels.mvi.view.B b12, com.avito.android.messenger.channels.mvi.view.A a12, String str, Boolean bool) {
            return new e(this.f187402a, c33126v0, c33126v02, c33126v03, d12, c31895y, c31896z, c12, b12, a12, str, bool, null);
        }
    }

    /* compiled from: DaggerChannelsComponent.java */
    public static final class e implements InterfaceC31746n {

        /* renamed from: a, reason: collision with root package name */
        public final c f187403a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f187404b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f187405c;

        /* renamed from: d, reason: collision with root package name */
        public final Z0 f187406d;

        /* renamed from: e, reason: collision with root package name */
        public final CY.e f187407e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f187408f;

        /* renamed from: g, reason: collision with root package name */
        public final n1 f187409g;

        /* renamed from: h, reason: collision with root package name */
        public final p1 f187410h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.b<?, ?>>> f187411i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f187412j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f187413k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.adapter.konveyor.common.swipable.b> f187414l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f187415m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f187416n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f187417o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f187418p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f187419q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f187420r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f187421s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f187422t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f187423u;

        public e(c cVar, C33126v0 c33126v0, C33126v0 c33126v02, C33126v0 c33126v03, c.a aVar, c.a aVar2, c.a aVar3, m.a aVar4, c.a aVar5, e.a aVar6, String str, Boolean bool, a aVar7) {
            this.f187403a = cVar;
            this.f187404b = dagger.internal.l.a(c33126v0);
            dagger.internal.l lVarB = dagger.internal.l.b(c33126v02);
            this.f187405c = lVarB;
            dagger.internal.u<w0> uVar = cVar.f187334n;
            dagger.internal.u<InterfaceC47842z> uVar2 = cVar.f187336o;
            dagger.internal.u<com.avito.android.messenger.channels.mvi.data.r> uVar3 = cVar.f187307Z;
            dagger.internal.u<com.avito.android.messenger.service.user_last_activity.a> uVar4 = cVar.f187309a0;
            dagger.internal.u<R0> uVar5 = cVar.f187288G;
            dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> uVar6 = cVar.f187311b0;
            dagger.internal.u<InterfaceC28373a> uVar7 = cVar.f187316e;
            this.f187406d = new Z0(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, cVar.f187287F, this.f187404b, lVarB, cVar.f187319f0, cVar.f187290I, cVar.f187285D);
            this.f187407e = new CY.e(uVar7);
            this.f187408f = dagger.internal.l.b(str);
            dagger.internal.l lVarB2 = dagger.internal.l.b(bool);
            Z0 z02 = this.f187406d;
            dagger.internal.u<com.avito.android.messenger.channels.mvi.data.r> uVar8 = cVar.f187307Z;
            dagger.internal.u<ChannelSyncAgent> uVar9 = cVar.f187321g0;
            dagger.internal.u<G0> uVar10 = cVar.f187323h0;
            com.avito.android.messenger.service.r rVar = cVar.f187327j0;
            dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> uVar11 = cVar.f187311b0;
            u uVar12 = cVar.f187331l0;
            v vVar = cVar.f187333m0;
            dagger.internal.u<com.avito.android.messenger.channels.analytics.i> uVar13 = cVar.f187335n0;
            CY.e eVar = this.f187407e;
            dagger.internal.u<com.avito.android.messenger.channels.analytics.d> uVar14 = cVar.f187332m;
            a1 a1Var = new a1(z02, uVar8, uVar9, uVar10, rVar, uVar11, uVar12, vVar, uVar13, eVar, uVar14, cVar.f187316e, cVar.f187356y, cVar.f187288G, this.f187404b, this.f187405c, cVar.f187319f0, cVar.f187287F, this.f187408f, lVarB2, cVar.f187290I, cVar.f187337o0, cVar.f187339p0, cVar.f187341q0);
            this.f187409g = new n1(cVar.f187315d0, uVar14, cVar.f187355x0);
            this.f187410h = new p1(new h1(a1Var, j1.a(), this.f187409g), cVar.f187357y0);
            this.f187411i = dagger.internal.B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f187412j = dagger.internal.g.d(new com.avito.android.messenger.channels.adapter.konveyor.support_channel.b(new com.avito.android.messenger.channels.adapter.konveyor.support_channel.e(dagger.internal.l.a(aVar))));
            this.f187413k = dagger.internal.l.a(aVar2);
            dagger.internal.u<com.avito.android.messenger.channels.adapter.konveyor.common.swipable.b> uVarD = dagger.internal.g.d(new C31745m(cVar.f187316e));
            this.f187414l = uVarD;
            this.f187415m = dagger.internal.g.d(new com.avito.android.messenger.channels.adapter.konveyor.channel.b(new com.avito.android.messenger.channels.adapter.konveyor.channel.j(this.f187413k, uVarD), cVar.f187287F, cVar.f187352w));
            this.f187416n = dagger.internal.g.d(new com.avito.android.messenger.channels.adapter.konveyor.channel.global.b(new com.avito.android.messenger.channels.adapter.konveyor.channel.global.f(dagger.internal.l.a(aVar3)), cVar.f187287F, cVar.f187352w));
            this.f187417o = dagger.internal.g.d(new com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.l(new com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.p(dagger.internal.l.a(aVar4)), cVar.f187359z0, cVar.f187287F));
            this.f187418p = dagger.internal.g.d(new com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner.b(new com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner.f(dagger.internal.l.a(aVar5)), cVar.f187287F, cVar.f187359z0));
            this.f187419q = dagger.internal.g.d(new com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.d(new com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.h(dagger.internal.l.a(aVar6))));
            this.f187420r = dagger.internal.g.d(com.avito.android.messenger.channels.adapter.konveyor.pagination.b.a());
            A.b bVarA = dagger.internal.A.a(7, 1);
            bVarA.f393938b.add(this.f187411i);
            dagger.internal.u<TV0.b<?, ?>> uVar15 = this.f187412j;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar15);
            list.add(this.f187415m);
            list.add(this.f187416n);
            list.add(this.f187417o);
            list.add(this.f187418p);
            list.add(this.f187419q);
            list.add(this.f187420r);
            dagger.internal.u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f187421s = uVarK;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f187422t = uVarH;
            this.f187423u = dagger.internal.g.d(new C31744l(uVarH, this.f187421s));
        }

        @Override // com.avito.android.messenger.channels.mvi.di.InterfaceC31746n
        public final void a(ChannelsListFragment channelsListFragment) {
            c cVar = this.f187403a;
            InterfaceC28373a interfaceC28373aA = cVar.f187308a.a();
            dagger.internal.t.c(interfaceC28373aA);
            channelsListFragment.f188629n0 = interfaceC28373aA;
            channelsListFragment.f188630o0 = cVar.f187332m.get();
            channelsListFragment.f188631p0 = this.f187410h;
            channelsListFragment.f188633r0 = this.f187423u.get();
            InterfaceC31742j interfaceC31742j = cVar.f187308a;
            InterfaceC32572u interfaceC32572uX0 = interfaceC31742j.x0();
            dagger.internal.t.c(interfaceC32572uX0);
            channelsListFragment.f188634s0 = interfaceC32572uX0;
            InterfaceC35745a5 interfaceC35745a5D = interfaceC31742j.d();
            dagger.internal.t.c(interfaceC35745a5D);
            InterfaceC32208e interfaceC32208eI7 = interfaceC31742j.I7();
            dagger.internal.t.c(interfaceC32208eI7);
            C31747o.f187435a.getClass();
            channelsListFragment.f188635t0 = new C31748p(interfaceC32208eI7, interfaceC35745a5D);
            channelsListFragment.f188636u0 = interfaceC31742j.C();
            channelsListFragment.f188637v0 = interfaceC31742j.o2();
        }
    }

    public static InterfaceC31741i.a a() {
        return new b();
    }
}
