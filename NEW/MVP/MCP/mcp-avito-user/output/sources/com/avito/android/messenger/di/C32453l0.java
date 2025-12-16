package com.avito.android.messenger.di;

import Oq.InterfaceC14725a;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.view.ActionMode;
import androidx.view.InterfaceC22983P;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyer2TestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup;
import com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup;
import com.avito.android.ab_tests.configs.MessengerQuickRepliesWithTitleTestGroup;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ChannelScreen;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.InterfaceC32575x;
import com.avito.android.messenger.analytics.graphite_counter.ChatLoadingResult;
import com.avito.android.messenger.channels.mvi.data.C31699g;
import com.avito.android.messenger.channels.mvi.data.C31705m;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31693a;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31697e;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31706n;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import com.avito.android.messenger.conversation.ChannelActivityFragment;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.OpenedFrom;
import com.avito.android.messenger.conversation.adapter.C31915a;
import com.avito.android.messenger.conversation.mvi.channel_feature.message_list.InterfaceC31954a;
import com.avito.android.messenger.conversation.mvi.context.C31988b;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.context.d0;
import com.avito.android.messenger.conversation.mvi.data.C32017f;
import com.avito.android.messenger.conversation.mvi.data.C32023l;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32012a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32019h;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32021j;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.C32043g;
import com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.menu.C32115g;
import com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a;
import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.platform_actions.InterfaceC32187a;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.messenger.conversation.mvi.quick_replies.InterfaceC32188a;
import com.avito.android.messenger.conversation.mvi.send.C32230p;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32218j;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.messenger.conversation.mvi.sync.InterfaceC32291u0;
import com.avito.android.messenger.conversation.mvi.voice.C32306a;
import com.avito.android.messenger.conversation.mvi.voice.C32330z;
import com.avito.android.messenger.di.InterfaceC32419a;
import com.avito.android.messenger.di.InterfaceC32428d;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import com.avito.android.permissions.C33032b;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import cv.InterfaceC39417a;
import dagger.internal.q;
import java.util.List;
import java.util.Locale;
import ru.avito.messenger.C47743i;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.api.entity.UserLastActivity;
import ur.InterfaceC49101b;
import vN.C49237a;
import w80.C49468b;

/* compiled from: DaggerChannelActivityComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.messenger.di.l0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32453l0 {

    /* compiled from: DaggerChannelActivityComponent.java */
    /* renamed from: com.avito.android.messenger.di.l0$b */
    public static final class b implements InterfaceC32419a {

        /* renamed from: A, reason: collision with root package name */
        public final V1 f195821A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.U0> f195822A0;

        /* renamed from: B, reason: collision with root package name */
        public final O1 f195823B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49101b> f195824B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31706n> f195825C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.u<C49237a> f195826C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31693a> f195827D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<u3.g<AssistantUxImprovementsSellerTestGroup>> f195828D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<ChannelSyncAgent> f195829E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<u3.g<AssistantUxImprovementsBuyer2TestGroup>> f195830E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.blacklist_reasons.y> f195831F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f195832F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32208e> f195833G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.blacklist_reasons.m> f195834H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35741a1> f195835I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f195836J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<JY.a> f195837K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<u3.g<MessengerFolderTabsTestGroup>> f195838L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<XL.a> f195839M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<LL.b> f195840N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.account.E> f195841O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.q0> f195842P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_cache.b> f195843Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32200a> f195844R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32575x> f195845S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deep_linking.x> f195846T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.common.a> f195847U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<u3.l<MultiMessageSendTestGroup>> f195848V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f> f195849W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.B> f195850X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32021j> f195851Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32012a> f195852Z;

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC32422b f195853a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32024m> f195854a0;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f195855b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<Y81.c> f195856b0;

        /* renamed from: c, reason: collision with root package name */
        public final b f195857c = this;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<Locale> f195858c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<ru.avito.messenger.F0> f195859d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.statsd.F> f195860d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<C30277e1> f195861e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_attachment.n> f195862e0;

        /* renamed from: f, reason: collision with root package name */
        public final C47743i f195863f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.notification.m> f195864f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<MessengerDatabase> f195865g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.u> f195866g0;

        /* renamed from: h, reason: collision with root package name */
        public final S1 f195867h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.sync.K> f195868h0;

        /* renamed from: i, reason: collision with root package name */
        public final T1 f195869i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.a> f195870i0;

        /* renamed from: j, reason: collision with root package name */
        public final U1 f195871j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f195872j0;

        /* renamed from: k, reason: collision with root package name */
        public final N1 f195873k;

        /* renamed from: k0, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.data.W f195874k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32019h> f195875l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<u3.g<MessengerQuickRepliesWithTitleTestGroup>> f195876l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<Context> f195877m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<WY.a> f195878m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f195879n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.R0> f195880n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f195881o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.u<u3.g<AssistantUxImprovementsBuyerTestGroup>> f195882o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.mvi.sync.E0> f195883p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<u3.g<SimpleTestGroupWithNone>> f195884p0;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.f> f195885q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<Application> f195886q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.w0> f195887r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.multi_message_send.domain.a> f195888r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47842z> f195889s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.multi_message_send.domain.g> f195890s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.service.user_last_activity.a> f195891t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.multi_message_send.domain.n> f195892t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service.short_task.j> f195893u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.multi_message.u> f195894u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f195895v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.multi_message.a> f195896v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.mvi.sync.z0> f195897w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<u3.l<MessengerEmptyBuyerChatKeyboardTestGroup>> f195898w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<MessengerSuccessRateTracker> f195899x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32291u0> f195900x0;

        /* renamed from: y, reason: collision with root package name */
        public final M1 f195901y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<C31915a> f195902y0;

        /* renamed from: z, reason: collision with root package name */
        public final Q1 f195903z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.adapter.C> f195904z0;

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$A */
        public static final class A implements dagger.internal.u<XL.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195905a;

            public A(InterfaceC32422b interfaceC32422b) {
                this.f195905a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                XL.a aVarZl = this.f195905a.Zl();
                dagger.internal.t.c(aVarZl);
                return aVarZl;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$B */
        public static final class B implements dagger.internal.u<LL.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195906a;

            public B(InterfaceC32422b interfaceC32422b) {
                this.f195906a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                LL.b bVarDf = this.f195906a.df();
                dagger.internal.t.c(bVarDf);
                return bVarDf;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$C */
        public static final class C implements dagger.internal.u<C49237a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195907a;

            public C(InterfaceC32422b interfaceC32422b) {
                this.f195907a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195907a.h1();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$D */
        public static final class D implements dagger.internal.u<com.avito.android.server_time.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195908a;

            public D(InterfaceC32422b interfaceC32422b) {
                this.f195908a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.a aVarT = this.f195908a.T();
                dagger.internal.t.c(aVarT);
                return aVarT;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$E */
        public static final class E implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195909a;

            public E(InterfaceC32422b interfaceC32422b) {
                this.f195909a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195909a.locale();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$F */
        public static final class F implements dagger.internal.u<com.avito.android.U0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195910a;

            public F(InterfaceC32422b interfaceC32422b) {
                this.f195910a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195910a.X0();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$G */
        public static final class G implements dagger.internal.u<InterfaceC32019h> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195911a;

            public G(InterfaceC32422b interfaceC32422b) {
                this.f195911a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195911a.p1();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$H */
        public static final class H implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195912a;

            public H(InterfaceC32422b interfaceC32422b) {
                this.f195912a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f fVarUk = this.f195912a.Uk();
                dagger.internal.t.c(fVarUk);
                return fVarUk;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$I */
        public static final class I implements dagger.internal.u<InterfaceC32575x> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195913a;

            public I(InterfaceC32422b interfaceC32422b) {
                this.f195913a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32575x interfaceC32575xXm = this.f195913a.xm();
                dagger.internal.t.c(interfaceC32575xXm);
                return interfaceC32575xXm;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$J */
        public static final class J implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.sync.K> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195914a;

            public J(InterfaceC32422b interfaceC32422b) {
                this.f195914a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.sync.K kGj = this.f195914a.Gj();
                dagger.internal.t.c(kGj);
                return kGj;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$K */
        public static final class K implements dagger.internal.u<com.avito.android.messenger.channels.mvi.sync.z0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195915a;

            public K(InterfaceC32422b interfaceC32422b) {
                this.f195915a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.channels.mvi.sync.z0 z0VarC2 = this.f195915a.C2();
                dagger.internal.t.c(z0VarC2);
                return z0VarC2;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$L */
        public static final class L implements dagger.internal.u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195916a;

            public L(InterfaceC32422b interfaceC32422b) {
                this.f195916a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195916a.d0();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$M */
        public static final class M implements dagger.internal.u<Y81.c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195917a;

            public M(InterfaceC32422b interfaceC32422b) {
                this.f195917a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195917a.kb();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$N */
        public static final class N implements dagger.internal.u<MessengerDatabase> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195918a;

            public N(InterfaceC32422b interfaceC32422b) {
                this.f195918a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerDatabase messengerDatabaseW0 = this.f195918a.W0();
                dagger.internal.t.c(messengerDatabaseW0);
                return messengerDatabaseW0;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$O */
        public static final class O implements dagger.internal.u<com.avito.android.messenger.B> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195919a;

            public O(InterfaceC32422b interfaceC32422b) {
                this.f195919a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.B bL1 = this.f195919a.L1();
                dagger.internal.t.c(bL1);
                return bL1;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$P */
        public static final class P implements dagger.internal.u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195920a;

            public P(InterfaceC32422b interfaceC32422b) {
                this.f195920a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195920a.C();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$Q */
        public static final class Q implements dagger.internal.u<u3.g<MessengerFolderTabsTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195921a;

            public Q(InterfaceC32422b interfaceC32422b) {
                this.f195921a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<MessengerFolderTabsTestGroup> gVarP6 = this.f195921a.P6();
                dagger.internal.t.c(gVarP6);
                return gVarP6;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$R */
        public static final class R implements dagger.internal.u<com.avito.android.messenger.channels.mvi.sync.E0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195922a;

            public R(InterfaceC32422b interfaceC32422b) {
                this.f195922a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.channels.mvi.sync.E0 e0Im = this.f195922a.im();
                dagger.internal.t.c(e0Im);
                return e0Im;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$S */
        public static final class S implements dagger.internal.u<WY.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195923a;

            public S(InterfaceC32422b interfaceC32422b) {
                this.f195923a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WY.a aVarTh = this.f195923a.th();
                dagger.internal.t.c(aVarTh);
                return aVarTh;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$T */
        public static final class T implements dagger.internal.u<InterfaceC32200a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195924a;

            public T(InterfaceC32422b interfaceC32422b) {
                this.f195924a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32200a interfaceC32200aB5 = this.f195924a.B5();
                dagger.internal.t.c(interfaceC32200aB5);
                return interfaceC32200aB5;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$U */
        public static final class U implements dagger.internal.u<MessengerSuccessRateTracker> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195925a;

            public U(InterfaceC32422b interfaceC32422b) {
                this.f195925a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                MessengerSuccessRateTracker messengerSuccessRateTrackerQ7 = this.f195925a.Q7();
                dagger.internal.t.c(messengerSuccessRateTrackerQ7);
                return messengerSuccessRateTrackerQ7;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$V */
        public static final class V implements dagger.internal.u<InterfaceC32291u0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195926a;

            public V(InterfaceC32422b interfaceC32422b) {
                this.f195926a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32291u0 interfaceC32291u0Tk = this.f195926a.tk();
                dagger.internal.t.c(interfaceC32291u0Tk);
                return interfaceC32291u0Tk;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$W */
        public static final class W implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.multi_message.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195927a;

            public W(InterfaceC32422b interfaceC32422b) {
                this.f195927a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.multi_message.a aVarJj = this.f195927a.Jj();
                dagger.internal.t.c(aVarJj);
                return aVarJj;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$X */
        public static final class X implements dagger.internal.u<u3.l<MultiMessageSendTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195928a;

            public X(InterfaceC32422b interfaceC32422b) {
                this.f195928a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<MultiMessageSendTestGroup> lVarGi = this.f195928a.gi();
                dagger.internal.t.c(lVarGi);
                return lVarGi;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$Y */
        public static final class Y implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.multi_message.u> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195929a;

            public Y(InterfaceC32422b interfaceC32422b) {
                this.f195929a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.multi_message.u uVarYi = this.f195929a.Yi();
                dagger.internal.t.c(uVarYi);
                return uVarYi;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$Z */
        public static final class Z implements dagger.internal.u<com.avito.android.notification.m> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195930a;

            public Z(InterfaceC32422b interfaceC32422b) {
                this.f195930a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.notification.m mVarA0 = this.f195930a.A0();
                dagger.internal.t.c(mVarA0);
                return mVarA0;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$a, reason: case insensitive filesystem */
        public static final class C32454a implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.common.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195931a;

            public C32454a(InterfaceC32422b interfaceC32422b) {
                this.f195931a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.common.a aVarEe = this.f195931a.ee();
                dagger.internal.t.c(aVarEe);
                return aVarEe;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$a0 */
        public static final class a0 implements dagger.internal.u<InterfaceC32208e> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195932a;

            public a0(InterfaceC32422b interfaceC32422b) {
                this.f195932a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC32208e interfaceC32208eI7 = this.f195932a.I7();
                dagger.internal.t.c(interfaceC32208eI7);
                return interfaceC32208eI7;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$b, reason: collision with other inner class name */
        public static final class C5771b implements dagger.internal.u<com.avito.android.account.E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195933a;

            public C5771b(InterfaceC32422b interfaceC32422b) {
                this.f195933a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.account.E eI2 = this.f195933a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$b0 */
        public static final class b0 implements dagger.internal.u<com.avito.android.permissions.u> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195934a;

            public b0(InterfaceC32422b interfaceC32422b) {
                this.f195934a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195934a.V();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$c, reason: case insensitive filesystem */
        public static final class C32455c implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195935a;

            public C32455c(InterfaceC32422b interfaceC32422b) {
                this.f195935a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f195935a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$c0 */
        public static final class c0 implements dagger.internal.u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195936a;

            public c0(InterfaceC32422b interfaceC32422b) {
                this.f195936a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f195936a.F();
                dagger.internal.t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$d, reason: case insensitive filesystem */
        public static final class C32456d implements dagger.internal.u<InterfaceC49101b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195937a;

            public C32456d(InterfaceC32422b interfaceC32422b) {
                this.f195937a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195937a.G();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$d0 */
        public static final class d0 implements dagger.internal.u<u3.g<MessengerQuickRepliesWithTitleTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195938a;

            public d0(InterfaceC32422b interfaceC32422b) {
                this.f195938a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<MessengerQuickRepliesWithTitleTestGroup> gVarPb = this.f195938a.pb();
                dagger.internal.t.c(gVarPb);
                return gVarPb;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$e, reason: case insensitive filesystem */
        public static final class C32457e implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195939a;

            public C32457e(InterfaceC32422b interfaceC32422b) {
                this.f195939a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f195939a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$e0 */
        public static final class e0 implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195940a;

            public e0(InterfaceC32422b interfaceC32422b) {
                this.f195940a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f195940a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$f, reason: case insensitive filesystem */
        public static final class C32458f implements dagger.internal.u<u3.g<AssistantUxImprovementsBuyer2TestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195941a;

            public C32458f(InterfaceC32422b interfaceC32422b) {
                this.f195941a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<AssistantUxImprovementsBuyer2TestGroup> gVarZk = this.f195941a.Zk();
                dagger.internal.t.c(gVarZk);
                return gVarZk;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$f0 */
        public static final class f0 implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195942a;

            public f0(InterfaceC32422b interfaceC32422b) {
                this.f195942a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f195942a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$g, reason: case insensitive filesystem */
        public static final class C32459g implements dagger.internal.u<u3.g<AssistantUxImprovementsBuyerTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195943a;

            public C32459g(InterfaceC32422b interfaceC32422b) {
                this.f195943a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<AssistantUxImprovementsBuyerTestGroup> gVarPi = this.f195943a.pi();
                dagger.internal.t.c(gVarPi);
                return gVarPi;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$g0 */
        public static final class g0 implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f195944a;

            public g0(InterfaceC30106l7 interfaceC30106l7) {
                this.f195944a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f195944a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$h, reason: case insensitive filesystem */
        public static final class C32460h implements dagger.internal.u<u3.g<AssistantUxImprovementsSellerTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195945a;

            public C32460h(InterfaceC32422b interfaceC32422b) {
                this.f195945a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<AssistantUxImprovementsSellerTestGroup> gVarIi = this.f195945a.Ii();
                dagger.internal.t.c(gVarIi);
                return gVarIi;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$h0 */
        public static final class h0 implements dagger.internal.u<com.avito.android.multi_message_send.domain.n> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195946a;

            public h0(InterfaceC32422b interfaceC32422b) {
                this.f195946a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195946a.Ld();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$i, reason: case insensitive filesystem */
        public static final class C32461i implements dagger.internal.u<JY.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195947a;

            public C32461i(InterfaceC32422b interfaceC32422b) {
                this.f195947a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                JY.a aVarZ6 = this.f195947a.Z6();
                dagger.internal.t.c(aVarZ6);
                return aVarZ6;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$i0 */
        public static final class i0 implements dagger.internal.u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195948a;

            public i0(InterfaceC32422b interfaceC32422b) {
                this.f195948a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f195948a.l();
                dagger.internal.t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$j, reason: case insensitive filesystem */
        public static final class C32462j implements dagger.internal.u<com.avito.android.messenger.blacklist_reasons.m> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195949a;

            public C32462j(InterfaceC32422b interfaceC32422b) {
                this.f195949a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.blacklist_reasons.m mVarM7 = this.f195949a.m7();
                dagger.internal.t.c(mVarM7);
                return mVarM7;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$j0 */
        public static final class j0 implements dagger.internal.u<com.avito.android.service.short_task.j> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195950a;

            public j0(InterfaceC32422b interfaceC32422b) {
                this.f195950a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.service.short_task.j jVarA2 = this.f195950a.A2();
                dagger.internal.t.c(jVarA2);
                return jVarA2;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$k, reason: case insensitive filesystem */
        public static final class C32463k implements dagger.internal.u<com.avito.android.messenger.blacklist_reasons.y> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195951a;

            public C32463k(InterfaceC32422b interfaceC32422b) {
                this.f195951a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.blacklist_reasons.y yVarF2 = this.f195951a.F2();
                dagger.internal.t.c(yVarF2);
                return yVarF2;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$k0 */
        public static final class k0 implements dagger.internal.u<com.avito.android.analytics.statsd.F> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195952a;

            public k0(InterfaceC32422b interfaceC32422b) {
                this.f195952a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.statsd.F fN02 = this.f195952a.N0();
                dagger.internal.t.c(fN02);
                return fN02;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$l, reason: case insensitive filesystem */
        public static final class C32464l implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195953a;

            public C32464l(InterfaceC32422b interfaceC32422b) {
                this.f195953a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.C cJ2 = this.f195953a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$l0, reason: collision with other inner class name */
        public static final class C5772l0 implements dagger.internal.u<com.avito.android.messenger.q0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195954a;

            public C5772l0(InterfaceC32422b interfaceC32422b) {
                this.f195954a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.q0 q0VarJm = this.f195954a.jm();
                dagger.internal.t.c(q0VarJm);
                return q0VarJm;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$m, reason: case insensitive filesystem */
        public static final class C32465m implements dagger.internal.u<InterfaceC31693a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195955a;

            public C32465m(InterfaceC32422b interfaceC32422b) {
                this.f195955a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195955a.x3();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$m0 */
        public static final class m0 implements dagger.internal.u<ru.avito.messenger.F0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195956a;

            public m0(InterfaceC32422b interfaceC32422b) {
                this.f195956a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195956a.B0();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$n, reason: case insensitive filesystem */
        public static final class C32466n implements dagger.internal.u<InterfaceC31706n> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195957a;

            public C32466n(InterfaceC32422b interfaceC32422b) {
                this.f195957a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195957a.P3();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$n0 */
        public static final class n0 implements dagger.internal.u<com.avito.android.messenger.w0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195958a;

            public n0(InterfaceC32422b interfaceC32422b) {
                this.f195958a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.w0 w0VarK0 = this.f195958a.k0();
                dagger.internal.t.c(w0VarK0);
                return w0VarK0;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$o, reason: case insensitive filesystem */
        public static final class C32467o implements dagger.internal.u<ChannelSyncAgent> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195959a;

            public C32467o(InterfaceC32422b interfaceC32422b) {
                this.f195959a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ChannelSyncAgent channelSyncAgentL6 = this.f195959a.L6();
                dagger.internal.t.c(channelSyncAgentL6);
                return channelSyncAgentL6;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$o0 */
        public static final class o0 implements dagger.internal.u<com.avito.android.messenger.service.user_last_activity.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195960a;

            public o0(InterfaceC32422b interfaceC32422b) {
                this.f195960a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.service.user_last_activity.a aVarR6 = this.f195960a.R6();
                dagger.internal.t.c(aVarR6);
                return aVarR6;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$p, reason: case insensitive filesystem */
        public static final class C32468p implements dagger.internal.u<com.avito.android.multi_message_send.domain.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195961a;

            public C32468p(InterfaceC32422b interfaceC32422b) {
                this.f195961a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195961a.me();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$p0 */
        public static final class p0 implements dagger.internal.u<com.avito.android.messenger.conversation.adapter.C> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195962a;

            public p0(InterfaceC32422b interfaceC32422b) {
                this.f195962a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.adapter.C cSg = this.f195962a.sg();
                dagger.internal.t.c(cSg);
                return cSg;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$q, reason: case insensitive filesystem */
        public static final class C32469q implements dagger.internal.u<u3.g<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195963a;

            public C32469q(InterfaceC32422b interfaceC32422b) {
                this.f195963a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<SimpleTestGroupWithNone> gVarO7 = this.f195963a.O7();
                dagger.internal.t.c(gVarO7);
                return gVarO7;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$r, reason: case insensitive filesystem */
        public static final class C32470r implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195964a;

            public C32470r(InterfaceC32422b interfaceC32422b) {
                this.f195964a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195964a.g();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$s, reason: case insensitive filesystem */
        public static final class C32471s implements dagger.internal.u<com.avito.android.deep_linking.x> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195965a;

            public C32471s(InterfaceC32422b interfaceC32422b) {
                this.f195965a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deep_linking.x xVarT = this.f195965a.t();
                dagger.internal.t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$t, reason: case insensitive filesystem */
        public static final class C32472t implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f195966a;

            public C32472t(cv.b bVar) {
                this.f195966a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f195966a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$u, reason: case insensitive filesystem */
        public static final class C32473u implements dagger.internal.u<com.avito.android.util.R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195967a;

            public C32473u(InterfaceC32422b interfaceC32422b) {
                this.f195967a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.R0 r0C = this.f195967a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$v, reason: case insensitive filesystem */
        public static final class C32474v implements dagger.internal.u<u3.l<MessengerEmptyBuyerChatKeyboardTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195968a;

            public C32474v(InterfaceC32422b interfaceC32422b) {
                this.f195968a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<MessengerEmptyBuyerChatKeyboardTestGroup> lVarQi = this.f195968a.qi();
                dagger.internal.t.c(lVarQi);
                return lVarQi;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$w, reason: case insensitive filesystem */
        public static final class C32475w implements dagger.internal.u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195969a;

            public C32475w(InterfaceC32422b interfaceC32422b) {
                this.f195969a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f195969a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$x, reason: case insensitive filesystem */
        public static final class C32476x implements dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_attachment.n> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195970a;

            public C32476x(InterfaceC32422b interfaceC32422b) {
                this.f195970a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.messenger.conversation.mvi.file_attachment.n nVarA2 = this.f195970a.a2();
                dagger.internal.t.c(nVarA2);
                return nVarA2;
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$y, reason: case insensitive filesystem */
        public static final class C32477y implements dagger.internal.u<com.avito.android.multi_message_send.domain.g> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195971a;

            public C32477y(InterfaceC32422b interfaceC32422b) {
                this.f195971a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f195971a.Hf();
            }
        }

        /* compiled from: DaggerChannelActivityComponent.java */
        /* renamed from: com.avito.android.messenger.di.l0$b$z, reason: case insensitive filesystem */
        public static final class C32478z implements dagger.internal.u<C31915a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC32422b f195972a;

            public C32478z(InterfaceC32422b interfaceC32422b) {
                this.f195972a = interfaceC32422b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C31915a c31915aCl = this.f195972a.Cl();
                dagger.internal.t.c(c31915aCl);
                return c31915aCl;
            }
        }

        public b(InterfaceC32422b interfaceC32422b, InterfaceC30106l7 interfaceC30106l7, cv.b bVar, Screen screen, InterfaceC22983P interfaceC22983P, a aVar) {
            this.f195853a = interfaceC32422b;
            this.f195855b = bVar;
            m0 m0Var = new m0(interfaceC32422b);
            P p12 = new P(interfaceC32422b);
            this.f195861e = p12;
            this.f195863f = new C47743i(m0Var, p12);
            N n12 = new N(interfaceC32422b);
            this.f195865g = n12;
            this.f195867h = new S1(n12);
            this.f195869i = new T1(n12);
            this.f195871j = new U1(n12);
            this.f195873k = new N1(n12);
            G g12 = new G(interfaceC32422b);
            this.f195875l = g12;
            this.f195877m = new C32470r(interfaceC32422b);
            this.f195879n = new f0(interfaceC32422b);
            this.f195881o = new C32455c(interfaceC32422b);
            this.f195883p = new R(interfaceC32422b);
            this.f195885q = new i0(interfaceC32422b);
            this.f195887r = new n0(interfaceC32422b);
            this.f195889s = new L(interfaceC32422b);
            this.f195891t = new o0(interfaceC32422b);
            this.f195893u = new j0(interfaceC32422b);
            this.f195895v = new g0(interfaceC30106l7);
            this.f195897w = new K(interfaceC32422b);
            this.f195899x = new U(interfaceC32422b);
            this.f195901y = new M1(n12);
            this.f195903z = new Q1(n12);
            this.f195821A = new V1(n12);
            this.f195823B = new O1(n12);
            this.f195825C = new C32466n(interfaceC32422b);
            this.f195827D = new C32465m(interfaceC32422b);
            this.f195829E = new C32467o(interfaceC32422b);
            this.f195831F = new C32463k(interfaceC32422b);
            this.f195833G = new a0(interfaceC32422b);
            this.f195834H = new C32462j(interfaceC32422b);
            this.f195835I = new C32475w(interfaceC32422b);
            this.f195836J = new C32472t(bVar);
            this.f195837K = new C32461i(interfaceC32422b);
            this.f195838L = new Q(interfaceC32422b);
            this.f195839M = new A(interfaceC32422b);
            this.f195840N = new B(interfaceC32422b);
            this.f195841O = new C5771b(interfaceC32422b);
            this.f195842P = new C5772l0(interfaceC32422b);
            this.f195843Q = new c0(interfaceC32422b);
            this.f195844R = new T(interfaceC32422b);
            this.f195845S = new I(interfaceC32422b);
            this.f195846T = new C32471s(interfaceC32422b);
            this.f195847U = new C32454a(interfaceC32422b);
            this.f195848V = new X(interfaceC32422b);
            this.f195849W = new H(interfaceC32422b);
            this.f195850X = new O(interfaceC32422b);
            this.f195851Y = dagger.internal.B.a(new C32023l(g12));
            dagger.internal.u<InterfaceC32012a> uVarA = dagger.internal.B.a(new C32017f(this.f195877m, this.f195861e, this.f195881o, this.f195865g, this.f195879n));
            this.f195852Z = uVarA;
            this.f195854a0 = dagger.internal.B.a(new com.avito.android.messenger.conversation.mvi.data.e0(this.f195867h, this.f195869i, this.f195871j, this.f195873k, this.f195851Y, uVarA));
            this.f195856b0 = new M(interfaceC32422b);
            this.f195858c0 = new E(interfaceC32422b);
            this.f195860d0 = new k0(interfaceC32422b);
            this.f195862e0 = new C32476x(interfaceC32422b);
            this.f195864f0 = new Z(interfaceC32422b);
            this.f195866g0 = new b0(interfaceC32422b);
            this.f195868h0 = new J(interfaceC32422b);
            this.f195870i0 = new D(interfaceC32422b);
            this.f195872j0 = new e0(interfaceC32422b);
            this.f195874k0 = new com.avito.android.messenger.channels.mvi.data.W(this.f195903z, this.f195852Z);
            this.f195876l0 = new d0(interfaceC32422b);
            this.f195878m0 = new S(interfaceC32422b);
            this.f195880n0 = new C32473u(interfaceC32422b);
            this.f195882o0 = new C32459g(interfaceC32422b);
            this.f195884p0 = new C32469q(interfaceC32422b);
            this.f195886q0 = new C32457e(interfaceC32422b);
            this.f195888r0 = new C32468p(interfaceC32422b);
            this.f195890s0 = new C32477y(interfaceC32422b);
            this.f195892t0 = new h0(interfaceC32422b);
            this.f195894u0 = new Y(interfaceC32422b);
            this.f195896v0 = new W(interfaceC32422b);
            this.f195898w0 = new C32474v(interfaceC32422b);
            this.f195900x0 = new V(interfaceC32422b);
            this.f195902y0 = new C32478z(interfaceC32422b);
            this.f195904z0 = new p0(interfaceC32422b);
            this.f195822A0 = new F(interfaceC32422b);
            this.f195824B0 = new C32456d(interfaceC32422b);
            this.f195826C0 = new C(interfaceC32422b);
            this.f195828D0 = new C32460h(interfaceC32422b);
            this.f195830E0 = new C32458f(interfaceC32422b);
            this.f195832F0 = new C32464l(interfaceC32422b);
        }

        @Override // com.avito.android.messenger.di.InterfaceC32419a
        public final void a(ChannelActivityFragment channelActivityFragment) {
            InterfaceC32422b interfaceC32422b = this.f195853a;
            channelActivityFragment.f188915t0 = interfaceC32422b.Pd();
            channelActivityFragment.f188916u0 = interfaceC32422b.F0();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f195855b.u4();
            dagger.internal.t.c(aVarU4);
            channelActivityFragment.f188917v0 = aVarU4;
            channelActivityFragment.f188918w0 = interfaceC32422b.C();
            channelActivityFragment.f188919x0 = interfaceC32422b.H();
            channelActivityFragment.f188920y0 = new com.avito.android.analytics.provider.e();
            InterfaceC32572u interfaceC32572uX0 = interfaceC32422b.x0();
            dagger.internal.t.c(interfaceC32572uX0);
            channelActivityFragment.f188921z0 = interfaceC32572uX0;
            channelActivityFragment.f188909A0 = interfaceC32422b.o2();
            channelActivityFragment.f188910B0 = this.f195863f;
        }

        @Override // com.avito.android.messenger.di.InterfaceC32419a
        public final InterfaceC32428d.a b() {
            return new c(this.f195857c, null);
        }
    }

    /* compiled from: DaggerChannelActivityComponent.java */
    /* renamed from: com.avito.android.messenger.di.l0$c */
    public static final class c implements InterfaceC32428d.a {

        /* renamed from: a, reason: collision with root package name */
        public final b f195973a;

        public c(b bVar, a aVar) {
            this.f195973a = bVar;
        }

        @Override // com.avito.android.messenger.di.InterfaceC32428d.a
        public final InterfaceC32428d a(ChannelFragment channelFragment, C28478k c28478k, Resources resources, com.avito.android.messenger.conversation.W1 w12, OpenedFrom openedFrom, SendMessagePresenter.State state, InterfaceC31987a.C5631a c5631a, d0.c.a aVar, C33032b c33032b, com.avito.android.messenger.conversation.A1 a12, String str, String str2, String str3, String str4, String str5) {
            c5631a.getClass();
            return new d(this.f195973a, new C32431e(), new G0(), channelFragment, c28478k, resources, w12, openedFrom, state, c5631a, aVar, c33032b, a12, str, str2, str3, str4, str5, null);
        }
    }

    /* compiled from: DaggerChannelActivityComponent.java */
    /* renamed from: com.avito.android.messenger.di.l0$d */
    public static final class d implements InterfaceC32428d {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.menu.r f195974A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<CY.m> f195975A0;

        /* renamed from: A1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.multi_message.m> f195976A1;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.in_app_calls.g f195977B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<CY.n> f195978B0;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.in_app_calls.j f195979C;

        /* renamed from: C0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_suggests.G f195980C0;

        /* renamed from: D, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.c f195981D;

        /* renamed from: D0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.f f195982D0;

        /* renamed from: E, reason: collision with root package name */
        public final com.avito.android.photo_storage.f f195983E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.a> f195984E0;

        /* renamed from: F, reason: collision with root package name */
        public final C49468b f195985F;

        /* renamed from: F0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.m f195986F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32218j> f195987G;

        /* renamed from: G0, reason: collision with root package name */
        public final C32330z f195988G0;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32232q> f195989H;

        /* renamed from: H0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.mvi.data.f0> f195990H0;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32187a> f195991I;

        /* renamed from: I0, reason: collision with root package name */
        public final dagger.internal.u<LY.b> f195992I0;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32129a> f195993J;

        /* renamed from: J0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.voice.q0 f195994J0;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.mvi.rx3.with_monolithic_state.t<f.InterfaceC5732f>> f195995K;

        /* renamed from: K0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.multi_message.j> f195996K0;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.platform_actions.q f195997L;

        /* renamed from: L0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.multi_message.t f195998L0;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.i> f195999M;

        /* renamed from: M0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.k f196000M0;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.elements.i f196001N;

        /* renamed from: N0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.a> f196002N0;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32188a> f196003O;

        /* renamed from: O0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.sync.W0> f196004O0;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.f> f196005P;

        /* renamed from: P0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_download.N> f196006P0;

        /* renamed from: Q, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.e f196007Q;

        /* renamed from: Q0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.video.h> f196008Q0;

        /* renamed from: R, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.elements.c f196009R;

        /* renamed from: R0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.channel_feature.message_list.H0 f196010R0;

        /* renamed from: S, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.elements.o f196011S;

        /* renamed from: S0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.channel_feature.message_list.M> f196012S0;

        /* renamed from: T, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.elements.e f196013T;

        /* renamed from: T0, reason: collision with root package name */
        public final dagger.internal.u<String> f196014T0;

        /* renamed from: U, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.e f196015U;

        /* renamed from: U0, reason: collision with root package name */
        public final DY.c f196016U0;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.e> f196017V;

        /* renamed from: V0, reason: collision with root package name */
        public final dagger.internal.u<DY.a> f196018V0;

        /* renamed from: W, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.d f196019W;

        /* renamed from: W0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.voice.A> f196020W0;

        /* renamed from: X, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.elements.quote.c f196021X;

        /* renamed from: X0, reason: collision with root package name */
        public final dagger.internal.u<LY.d> f196022X0;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<List<com.avito.android.messenger.conversation.mvi.message_menu.c>> f196023Y;

        /* renamed from: Y0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.messages.builders.h f196024Y0;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f196025Z;

        /* renamed from: Z0, reason: collision with root package name */
        public final dagger.internal.l f196026Z0;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.permissions.x f196027a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.e> f196028a0;

        /* renamed from: a1, reason: collision with root package name */
        public final dagger.internal.l f196029a1;

        /* renamed from: b, reason: collision with root package name */
        public final b f196030b;

        /* renamed from: b0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_menu.r f196031b0;

        /* renamed from: b1, reason: collision with root package name */
        public final dagger.internal.l f196032b1;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f196033c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.l f196034c0;

        /* renamed from: c1, reason: collision with root package name */
        public final dagger.internal.u<GeoMarker> f196035c1;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<String> f196036d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35945t1<UserLastActivity>> f196037d0;

        /* renamed from: d1, reason: collision with root package name */
        public final dagger.internal.u<String> f196038d1;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<String> f196039e;

        /* renamed from: e0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.context.b0 f196040e0;

        /* renamed from: e1, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.messages.builders.j f196041e1;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f196042f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32038b> f196043f0;

        /* renamed from: f1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.messages.builders.q> f196044f1;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32021j> f196045g;

        /* renamed from: g0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.file_download.U f196046g0;

        /* renamed from: g1, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.messages.builders.b f196047g1;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32012a> f196048h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.voice.P> f196049h0;

        /* renamed from: h1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.messages.b0> f196050h1;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32024m> f196051i;

        /* renamed from: i0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.voice.K f196052i0;

        /* renamed from: i1, reason: collision with root package name */
        public final dagger.internal.u<CY.k> f196053i1;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.f f196054j;

        /* renamed from: j0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.video.l f196055j0;

        /* renamed from: j1, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14725a> f196056j1;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31987a> f196057k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.timer.a<ChatLoadingResult>> f196058k0;

        /* renamed from: k1, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31954a> f196059k1;

        /* renamed from: l, reason: collision with root package name */
        public final K f196060l;

        /* renamed from: l0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.messages.Z f196061l0;

        /* renamed from: l1, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.channel_feature.o f196062l1;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.service.p> f196063m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_attachment.a> f196064m0;

        /* renamed from: m1, reason: collision with root package name */
        public final dagger.internal.u<SendMessagePresenter> f196065m1;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f196066n;

        /* renamed from: n0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.video.n f196067n0;

        /* renamed from: n1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.context.V> f196068n1;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f196069o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.l f196070o0;

        /* renamed from: o1, reason: collision with root package name */
        public final com.avito.android.photo_download.feature.mvi.k f196071o1;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.analytics.b> f196072p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<Boolean> f196073p0;

        /* renamed from: p1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.menu.l> f196074p1;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.mvi.data.c0> f196075q;

        /* renamed from: q0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.messages.y0 f196076q0;

        /* renamed from: q1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.in_app_calls.h> f196077q1;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31697e> f196078r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.sync.Q0> f196079r0;

        /* renamed from: r1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_suggests.s> f196080r1;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.messenger.channels.mvi.data.K f196081s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.voice.s0> f196082s0;

        /* renamed from: s1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g> f196083s1;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.channels.mvi.data.r> f196084t;

        /* renamed from: t0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.send.N0 f196085t0;

        /* renamed from: t1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.l> f196086t1;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.context.U f196087u;

        /* renamed from: u0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.quick_replies.p f196088u0;

        /* renamed from: u1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.new_messages.a> f196089u1;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31700h> f196090v;

        /* renamed from: v0, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.message_suggests.r f196091v0;

        /* renamed from: v1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.voice.Q> f196092v1;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.messenger.conversation.mvi.menu.j f196093w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32119a> f196094w0;

        /* renamed from: w1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.quick_replies.d> f196095w1;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC32109a> f196096x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.platform_actions.f> f196097x0;

        /* renamed from: x1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.quick_replies.adapter.b> f196098x1;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<ChannelIacInteractor> f196099y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.messenger.conversation.mvi.platform_actions.A> f196100y0;

        /* renamed from: y1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f196101y1;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.l f196102z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<CY.o> f196103z0;

        /* renamed from: z1, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f196104z1;

        public d(b bVar, C32431e c32431e, G0 g02, ChannelFragment channelFragment, C28478k c28478k, Resources resources, com.avito.android.messenger.conversation.W1 w12, OpenedFrom openedFrom, SendMessagePresenter.State state, InterfaceC31987a.C5631a c5631a, d0.c cVar, com.avito.android.permissions.x xVar, ActionMode.Callback callback, String str, String str2, String str3, String str4, String str5, a aVar) {
            this.f196030b = bVar;
            this.f196027a = xVar;
            dagger.internal.l lVarA = dagger.internal.l.a(w12);
            this.f196033c = lVarA;
            this.f196036d = dagger.internal.g.d(new C32483n(c32431e, lVarA));
            this.f196039e = dagger.internal.g.d(new C32509w(c32431e, this.f196033c));
            this.f196042f = dagger.internal.l.a(channelFragment);
            this.f196045g = dagger.internal.B.a(new C32023l(bVar.f195875l));
            dagger.internal.u<InterfaceC32012a> uVarA = dagger.internal.B.a(new C32017f(bVar.f195877m, bVar.f195861e, bVar.f195881o, bVar.f195865g, bVar.f195879n));
            this.f196048h = uVarA;
            this.f196051i = dagger.internal.B.a(new com.avito.android.messenger.conversation.mvi.data.e0(bVar.f195867h, bVar.f195869i, bVar.f195871j, bVar.f195873k, this.f196045g, uVarA));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f196054j = fVar;
            dagger.internal.u<InterfaceC31987a> uVarD = dagger.internal.g.d(new C32446j(c32431e, this.f196042f, this.f196033c, fVar));
            this.f196057k = uVarD;
            this.f196060l = new K(c32431e, this.f196033c, this.f196051i, uVarD, bVar.f195879n, bVar.f195883p, bVar.f195861e, bVar.f195885q);
            this.f196063m = dagger.internal.g.d(new com.avito.android.messenger.service.r(bVar.f195893u));
            this.f196066n = dagger.internal.l.a(openedFrom);
            dagger.internal.u<ScreenPerformanceTracker> uVarD2 = dagger.internal.g.d(new T(c32431e, bVar.f195895v, dagger.internal.l.a(c28478k)));
            this.f196069o = uVarD2;
            this.f196072p = dagger.internal.g.d(new com.avito.android.messenger.conversation.analytics.d(this.f196033c, uVarD2, bVar.f195897w, bVar.f195899x));
            dagger.internal.u<com.avito.android.messenger.channels.mvi.data.c0> uVarA2 = dagger.internal.B.a(new com.avito.android.messenger.channels.mvi.data.e0(bVar.f195825C));
            this.f196075q = uVarA2;
            dagger.internal.u<InterfaceC31697e> uVarA3 = dagger.internal.B.a(new C31699g(uVarA2, bVar.f195827D, this.f196045g, bVar.f195825C));
            this.f196078r = uVarA3;
            this.f196081s = new com.avito.android.messenger.channels.mvi.data.K(uVarA3, bVar.f195901y, bVar.f195903z, bVar.f195821A, bVar.f195867h, bVar.f195823B);
            dagger.internal.u<com.avito.android.messenger.channels.mvi.data.r> uVarA4 = dagger.internal.B.a(this.f196081s);
            this.f196084t = uVarA4;
            dagger.internal.u<String> uVar = this.f196036d;
            b bVar2 = this.f196030b;
            this.f196087u = new com.avito.android.messenger.conversation.mvi.context.U(this.f196066n, this.f196033c, uVarA4, uVar, bVar2.f195879n, bVar2.f195887r, bVar2.f195889s, bVar2.f195891t, bVar2.f195881o, this.f196063m, this.f196072p, bVar2.f195829E, bVar2.f195861e);
            dagger.internal.u<InterfaceC31700h> uVarA5 = dagger.internal.B.a(new C31705m(bVar2.f195873k));
            this.f196090v = uVarA5;
            this.f196093w = new com.avito.android.messenger.conversation.mvi.menu.j(uVarA5, this.f196036d, bVar2.f195831F, bVar2.f195881o, bVar2.f195879n, this.f196057k, bVar2.f195829E);
            this.f196096x = dagger.internal.g.d(new C32486o(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196099y = dagger.internal.g.d(new C32452l(c32431e, this.f196042f, this.f196033c, this.f196054j));
            dagger.internal.l lVarA2 = dagger.internal.l.a(resources);
            this.f196102z = lVarA2;
            dagger.internal.u<InterfaceC32109a> uVar2 = this.f196096x;
            dagger.internal.u<ChannelIacInteractor> uVar3 = this.f196099y;
            dagger.internal.u<InterfaceC32208e> uVar4 = bVar2.f195833G;
            dagger.internal.u<com.avito.android.messenger.blacklist_reasons.m> uVar5 = bVar2.f195834H;
            dagger.internal.u<InterfaceC35741a1> uVar6 = bVar2.f195835I;
            dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> uVar7 = bVar2.f195836J;
            dagger.internal.u<JY.a> uVar8 = bVar2.f195837K;
            dagger.internal.u<InterfaceC35745a5> uVar9 = bVar2.f195879n;
            this.f195974A = new com.avito.android.messenger.conversation.mvi.menu.r(uVar2, uVar3, uVar4, uVar5, lVarA2, uVar6, uVar7, uVar8, uVar9, bVar2.f195838L);
            dagger.internal.u<InterfaceC31987a> uVar10 = this.f196057k;
            this.f195977B = new com.avito.android.messenger.conversation.mvi.in_app_calls.g(this.f196033c, uVar10, bVar2.f195839M, bVar2.f195840N, uVar7, bVar2.f195881o, bVar2.f195841O, uVar9);
            this.f195979C = new com.avito.android.messenger.conversation.mvi.in_app_calls.j(uVar3, uVar9);
            this.f195981D = new com.avito.android.messenger.conversation.mvi.c(bVar2.f195831F, uVar10, uVar9);
            this.f195983E = com.avito.android.photo_storage.f.a(bVar2.f195877m);
            C49468b c49468bA = C49468b.a(this.f195983E, com.avito.android.photo_storage.h.a(bVar2.f195877m));
            this.f195985F = c49468bA;
            dagger.internal.u<InterfaceC32218j> uVarD3 = dagger.internal.g.d(new C32230p(bVar2.f195843Q, bVar2.f195844R, c49468bA, bVar2.f195879n, bVar2.f195881o));
            this.f195987G = uVarD3;
            dagger.internal.u<InterfaceC32232q> uVarD4 = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.send.B(this.f196033c, uVarD3, this.f196036d, bVar2.f195889s, bVar2.f195842P, bVar2.f195845S, bVar2.f195885q, this.f196051i, bVar2.f195879n));
            this.f195989H = uVarD4;
            this.f195991I = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.platform_actions.d(uVarD4, bVar2.f195889s, bVar2.f195829E, bVar2.f195879n));
            this.f195993J = dagger.internal.g.d(new C(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f195995K = dagger.internal.g.d(new M(c32431e, bVar2.f195879n));
            this.f195997L = new com.avito.android.messenger.conversation.mvi.platform_actions.q(this.f195991I, this.f196057k, this.f196099y, this.f195993J, bVar2.f195846T, bVar2.f195836J, bVar2.f195835I, bVar2.f195881o, bVar2.f195847U, bVar2.f195848V, bVar2.f195879n, this.f195995K);
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.i> uVarD5 = dagger.internal.g.d(new O0(this.f196054j, this.f196042f, this.f196033c));
            this.f195999M = uVarD5;
            b bVar3 = this.f196030b;
            this.f196001N = new com.avito.android.messenger.conversation.mvi.message_menu.elements.i(uVarD5, bVar3.f195881o);
            this.f196003O = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.quick_replies.c(bVar3.f195889s));
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.f> uVarD6 = dagger.internal.g.d(com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.h.a());
            this.f196005P = uVarD6;
            dagger.internal.u<InterfaceC32188a> uVar11 = this.f196003O;
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.i> uVar12 = this.f195999M;
            this.f196007Q = new com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.e(uVarD6, uVar11, uVar12);
            com.avito.android.util.T t12 = com.avito.android.util.T.f318740a;
            dagger.internal.u<InterfaceC28373a> uVar13 = bVar3.f195881o;
            this.f196009R = new com.avito.android.messenger.conversation.mvi.message_menu.elements.c(t12, uVar13, uVar12, bVar3.f195842P);
            dagger.internal.u<InterfaceC32024m> uVar14 = this.f196051i;
            dagger.internal.u<com.avito.android.server_time.f> uVar15 = bVar3.f195885q;
            dagger.internal.u<InterfaceC35745a5> uVar16 = bVar3.f195879n;
            this.f196011S = new com.avito.android.messenger.conversation.mvi.message_menu.elements.o(uVar14, uVar15, uVar13, uVar16, uVar12);
            this.f196013T = new com.avito.android.messenger.conversation.mvi.message_menu.elements.e(uVar12, uVar13, bVar3.f195861e);
            this.f196015U = new com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.e(bVar3.f195849W, uVar13, uVar16, uVar12);
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.e> uVarD7 = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.h(bVar3.f195889s, bVar3.f195850X, bVar3.f195854a0));
            this.f196017V = uVarD7;
            dagger.internal.l lVar = this.f196102z;
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.i> uVar17 = this.f195999M;
            this.f196019W = new com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.d(lVar, uVarD7, uVar17, bVar3.f195885q, bVar3.f195837K);
            this.f196021X = new com.avito.android.messenger.conversation.mvi.message_menu.elements.quote.c(uVar17);
            this.f196023Y = dagger.internal.g.d(new P0(com.avito.android.messenger.conversation.mvi.message_menu.elements.g.a(), this.f196001N, this.f196007Q, this.f196009R, this.f196011S, this.f196013T, this.f196015U, this.f196019W, this.f196021X));
            dagger.internal.u<com.avito.android.util.text.a> uVarA6 = dagger.internal.B.a(new I0(g02));
            this.f196025Z = uVarA6;
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.e> uVarD8 = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.message_menu.g(uVarA6, bVar3.f195877m));
            this.f196028a0 = uVarD8;
            this.f196031b0 = new com.avito.android.messenger.conversation.mvi.message_menu.r(uVarD8, this.f196023Y, bVar3.f195856b0, this.f196057k, bVar3.f195837K, bVar3.f195879n);
            this.f196034c0 = dagger.internal.l.a(cVar);
            dagger.internal.u<InterfaceC35945t1<UserLastActivity>> uVarD9 = dagger.internal.g.d(new C32423b0(c32431e, this.f196102z, bVar3.f195885q, bVar3.f195858c0));
            this.f196037d0 = uVarD9;
            this.f196040e0 = new com.avito.android.messenger.conversation.mvi.context.b0(this.f196034c0, bVar3.f195879n, this.f196057k, bVar3.f195833G, this.f196099y, uVarD9, bVar3.f195881o, bVar3.f195846T, this.f196072p, bVar3.f195885q, bVar3.f195860d0, bVar3.f195837K, bVar3.f195861e);
            dagger.internal.u<InterfaceC32038b> uVarA7 = dagger.internal.B.a(new C32043g(bVar3.f195877m, bVar3.f195861e, bVar3.f195864f0, bVar3.f195879n, this.f196051i, bVar3.f195862e0));
            this.f196043f0 = uVarA7;
            this.f196046g0 = new com.avito.android.messenger.conversation.mvi.file_download.U(uVarA7, this.f196036d, bVar3.f195885q, bVar3.f195862e0, bVar3.f195849W, bVar3.f195866g0, bVar3.f195879n);
            this.f196049h0 = dagger.internal.g.d(new C32432e0(c32431e));
            dagger.internal.u<String> uVar18 = this.f196036d;
            b bVar4 = this.f196030b;
            dagger.internal.u<com.avito.android.server_time.f> uVar19 = bVar4.f195885q;
            dagger.internal.u<InterfaceC32038b> uVar20 = this.f196043f0;
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_attachment.n> uVar21 = bVar4.f195862e0;
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f> uVar22 = bVar4.f195849W;
            dagger.internal.u<com.avito.android.permissions.u> uVar23 = bVar4.f195866g0;
            dagger.internal.u<InterfaceC35745a5> uVar24 = bVar4.f195879n;
            dagger.internal.u<InterfaceC32024m> uVar25 = this.f196051i;
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.voice.P> uVar26 = this.f196049h0;
            dagger.internal.u<C30277e1> uVar27 = bVar4.f195861e;
            this.f196052i0 = new com.avito.android.messenger.conversation.mvi.voice.K(uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27);
            dagger.internal.u<InterfaceC47842z> uVar28 = bVar4.f195889s;
            dagger.internal.u<InterfaceC28373a> uVar29 = bVar4.f195881o;
            this.f196055j0 = new com.avito.android.messenger.conversation.mvi.video.l(uVar28, uVar18, uVar22, uVar29, uVar24, uVar27);
            dagger.internal.u<com.avito.android.analytics.timer.a<ChatLoadingResult>> uVarD10 = dagger.internal.g.d(new r(c32431e, uVar29, bVar4.f195870i0));
            this.f196058k0 = uVarD10;
            dagger.internal.u<InterfaceC32024m> uVar30 = this.f196051i;
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.sync.K> uVar31 = bVar4.f195868h0;
            dagger.internal.u<InterfaceC47842z> uVar32 = bVar4.f195889s;
            dagger.internal.u<InterfaceC28373a> uVar33 = bVar4.f195881o;
            dagger.internal.u<C30277e1> uVar34 = bVar4.f195861e;
            dagger.internal.l lVar2 = this.f196033c;
            dagger.internal.u<InterfaceC35745a5> uVar35 = bVar4.f195879n;
            this.f196061l0 = new com.avito.android.messenger.conversation.mvi.messages.Z(lVar2, uVarD10, uVar30, uVar31, uVar32, uVar33, uVar34, uVar35);
            this.f196064m0 = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.file_attachment.k(bVar4.f195862e0, uVar35));
            this.f196067n0 = new com.avito.android.messenger.conversation.mvi.video.n(bVar4.f195881o, bVar4.f195861e);
            this.f196070o0 = dagger.internal.l.a(state);
            this.f196073p0 = dagger.internal.g.d(new U(c32431e, this.f196033c));
            this.f196076q0 = new com.avito.android.messenger.conversation.mvi.messages.y0(this.f196025Z);
            this.f196079r0 = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.sync.V0(this.f196036d, bVar4.f195879n, bVar4.f195889s));
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.voice.s0> uVarD11 = dagger.internal.g.d(com.avito.android.messenger.conversation.mvi.voice.v0.a());
            this.f196082s0 = uVarD11;
            dagger.internal.u<InterfaceC32232q> uVar36 = this.f195989H;
            dagger.internal.u<InterfaceC31987a> uVar37 = this.f196057k;
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.file_attachment.a> uVar38 = this.f196064m0;
            dagger.internal.u<InterfaceC32024m> uVar39 = this.f196051i;
            dagger.internal.u<InterfaceC35863o4> uVar40 = bVar4.f195872j0;
            dagger.internal.l lVar3 = this.f196102z;
            dagger.internal.u<InterfaceC28373a> uVar41 = bVar4.f195881o;
            com.avito.android.messenger.conversation.mvi.video.n nVar = this.f196067n0;
            dagger.internal.u<String> uVar42 = this.f196036d;
            dagger.internal.u<InterfaceC35745a5> uVar43 = bVar4.f195879n;
            dagger.internal.l lVar4 = this.f196070o0;
            dagger.internal.u<InterfaceC32208e> uVar44 = bVar4.f195833G;
            dagger.internal.l lVar5 = this.f196066n;
            com.avito.android.messenger.channels.mvi.data.W w13 = bVar4.f195874k0;
            dagger.internal.u<C30277e1> uVar45 = bVar4.f195861e;
            this.f196085t0 = new com.avito.android.messenger.conversation.mvi.send.N0(uVar36, uVar37, uVar38, uVar39, uVar40, lVar3, uVar41, nVar, uVar42, uVar43, lVar4, uVar44, lVar5, w13, uVar45, this.f196073p0, this.f196076q0, this.f196079r0, bVar4.f195866g0, uVarD11, bVar4.f195862e0, this.f196003O, bVar4.f195876l0, bVar4.f195878m0, bVar4.f195880n0, uVar45, bVar4.f195885q, bVar4.f195837K);
            this.f196088u0 = new com.avito.android.messenger.conversation.mvi.quick_replies.p(this.f196057k, this.f196003O, bVar4.f195835I, bVar4.f195879n);
            this.f196091v0 = new com.avito.android.messenger.conversation.mvi.message_suggests.r(this.f196036d, this.f196057k, bVar4.f195889s, this.f196090v, bVar4.f195861e, bVar4.f195882o0, bVar4.f195879n);
            this.f196094w0 = dagger.internal.g.d(new F(c32431e, bVar4.f195837K, this.f196091v0));
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.platform_actions.f> uVarD12 = dagger.internal.g.d(new L(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196097x0 = uVarD12;
            this.f196100y0 = dagger.internal.g.d(new C32440h(c32431e, uVarD12));
            this.f196103z0 = dagger.internal.g.d(new C32420a0(c32431e, bVar4.f195881o));
            this.f195975A0 = dagger.internal.g.d(new Y(c32431e, bVar4.f195881o));
            this.f195978B0 = dagger.internal.g.d(new Z(c32431e, bVar4.f195881o));
            this.f195980C0 = new com.avito.android.messenger.conversation.mvi.message_suggests.G(bVar4.f195879n, this.f196094w0, this.f196100y0, bVar4.f195847U, this.f195989H, this.f196103z0, this.f195975A0, this.f195978B0, bVar4.f195881o, this.f196036d, bVar4.f195861e, bVar4.f195884p0, bVar4.f195848V);
            this.f195982D0 = new com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.f(this.f196036d, bVar4.f195889s, this.f196057k, bVar4.f195879n);
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.a> uVarD13 = dagger.internal.g.d(this.f195982D0);
            this.f195984E0 = uVarD13;
            dagger.internal.u<String> uVar46 = this.f196036d;
            b bVar5 = this.f196030b;
            this.f195986F0 = new com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.m(uVarD13, uVar46, bVar5.f195881o, bVar5.f195879n);
            this.f195988G0 = new C32330z(dagger.internal.l.a(str2), bVar5.f195886q0, bVar5.f195879n, this.f196049h0, bVar5.f195887r, this.f196051i, bVar5.f195861e);
            this.f195990H0 = dagger.internal.B.a(new com.avito.android.messenger.channels.mvi.data.m0(bVar5.f195821A, this.f196075q));
            this.f195992I0 = dagger.internal.g.d(new A(c32431e, this.f196102z, bVar5.f195885q, bVar5.f195858c0));
            this.f195994J0 = new com.avito.android.messenger.conversation.mvi.voice.q0(dagger.internal.l.a(str), bVar5.f195886q0, bVar5.f195879n, this.f196049h0, this.f195990H0, this.f195992I0, bVar5.f195861e);
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.multi_message.j> uVarD14 = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.multi_message.l(bVar5.f195894u0, bVar5.f195885q));
            this.f195996K0 = uVarD14;
            this.f195998L0 = new com.avito.android.messenger.conversation.mvi.multi_message.t(uVarD14, bVar5.f195888r0, bVar5.f195890s0, bVar5.f195892t0, bVar5.f195847U, bVar5.f195896v0, bVar5.f195836J, bVar5.f195881o, bVar5.f195848V, this.f196057k, bVar5.f195879n);
            this.f196000M0 = new com.avito.android.messenger.conversation.mvi.message_menu.k(this.f196102z);
            q.b bVarA = dagger.internal.q.a(22);
            bVarA.a(com.avito.android.messenger.conversation.mvi.new_messages.g.class, this.f196060l);
            bVarA.a(C31988b.class, this.f196087u);
            bVarA.a(C32115g.class, this.f196093w);
            bVarA.a(com.avito.android.messenger.conversation.mvi.menu.m.class, this.f195974A);
            bVarA.a(com.avito.android.messenger.conversation.mvi.in_app_calls.a.class, this.f195977B);
            bVarA.a(com.avito.android.messenger.conversation.mvi.in_app_calls.i.class, this.f195979C);
            bVarA.a(com.avito.android.messenger.conversation.mvi.b.class, this.f195981D);
            bVarA.a(com.avito.android.messenger.conversation.mvi.platform_actions.g.class, this.f195997L);
            bVarA.a(com.avito.android.messenger.conversation.mvi.message_menu.m.class, this.f196031b0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.context.W.class, this.f196040e0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.file_download.O.class, this.f196046g0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.voice.E.class, this.f196052i0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.video.j.class, this.f196055j0);
            bVarA.a(C32141e.class, this.f196061l0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.send.D.class, this.f196085t0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.quick_replies.f.class, this.f196088u0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.message_suggests.t.class, this.f195980C0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.l.class, this.f195986F0);
            bVarA.a(C32306a.class, this.f195988G0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.voice.a0.class, this.f195994J0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.multi_message.n.class, this.f195998L0);
            bVarA.a(com.avito.android.messenger.conversation.mvi.message_menu.j.class, this.f196000M0);
            dagger.internal.f.a(this.f196054j, dagger.internal.B.a(new com.avito.android.messenger.channels.mvi.di.P(bVarA.b())));
            this.f196002N0 = dagger.internal.g.d(new E(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196004O0 = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.sync.d1(bVar5.f195879n, bVar5.f195889s, bVar5.f195854a0));
            this.f196006P0 = dagger.internal.g.d(new C32506v(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196008Q0 = dagger.internal.g.d(new C32426c0(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196010R0 = new com.avito.android.messenger.conversation.mvi.channel_feature.message_list.H0(this.f196036d, this.f196039e, this.f196002N0, bVar5.f195880n0, bVar5.f195835I, bVar5.f195881o, this.f196079r0, this.f196004O0, this.f196006P0, this.f196057k, bVar5.f195885q, this.f196008Q0, bVar5.f195861e, this.f195993J, this.f196043f0, bVar5.f195883p, bVar5.f195878m0, bVar5.f195846T, bVar5.f195898w0);
            this.f196012S0 = dagger.internal.g.d(this.f196010R0);
            this.f196014T0 = dagger.internal.g.d(new B(c32431e, this.f196033c));
            this.f196016U0 = new DY.c(bVar5.f195881o);
            this.f196018V0 = dagger.internal.g.d(this.f196016U0);
            this.f196020W0 = dagger.internal.g.d(new C32429d0(c32431e, this.f196042f, this.f196033c, this.f196054j));
            b bVar6 = this.f196030b;
            this.f196022X0 = dagger.internal.g.d(new H(c32431e, bVar6.f195858c0, this.f196102z));
            this.f196024Y0 = new com.avito.android.messenger.conversation.mvi.messages.builders.h(bVar6.f195881o);
            this.f196026Z0 = dagger.internal.l.a(str3);
            this.f196029a1 = dagger.internal.l.a(str4);
            this.f196032b1 = dagger.internal.l.a(str5);
            this.f196035c1 = dagger.internal.g.d(new C32512x(c32431e, bVar6.f195824B0));
            dagger.internal.u<String> uVarD15 = dagger.internal.g.d(new C32515y(c32431e, bVar6.f195824B0));
            this.f196038d1 = uVarD15;
            this.f196041e1 = new com.avito.android.messenger.conversation.mvi.messages.builders.j(this.f196026Z0, this.f196029a1, this.f196032b1, uVarD15, bVar6.f195902y0, bVar6.f195904z0, bVar6.f195822A0, this.f196035c1);
            this.f196044f1 = dagger.internal.B.a(com.avito.android.messenger.conversation.mvi.messages.builders.r.a());
            this.f196047g1 = new com.avito.android.messenger.conversation.mvi.messages.builders.b(bVar6.f195826C0);
            this.f196050h1 = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.messages.d0(this.f195992I0, this.f196022X0, this.f196076q0, this.f196024Y0, com.avito.android.messenger.conversation.mvi.messages.builders.n.a(), this.f196041e1, com.avito.android.messenger.conversation.mvi.messages.builders.p.a(), this.f196044f1, com.avito.android.messenger.conversation.mvi.messages.builders.f.a(), this.f196047g1, com.avito.android.messenger.conversation.mvi.messages.builders.l.a(), com.avito.android.messenger.conversation.mvi.messages.builders.d.a(), bVar6.f195861e, bVar6.f195828D0, bVar6.f195882o0, bVar6.f195830E0, this.f196102z));
            this.f196053i1 = dagger.internal.g.d(new C32492q(c32431e, bVar6.f195881o));
            dagger.internal.u<InterfaceC14725a> uVarA8 = dagger.internal.B.a(new C32503u(c32431e, bVar6.f195881o, bVar6.f195861e));
            this.f196056j1 = uVarA8;
            dagger.internal.u<InterfaceC31954a> uVarD16 = dagger.internal.g.d(new com.avito.android.messenger.conversation.mvi.channel_feature.message_list.K(this.f196036d, this.f196039e, this.f196014T0, bVar6.f195880n0, this.f195993J, bVar6.f195846T, bVar6.f195861e, this.f196099y, this.f196018V0, bVar6.f195836J, bVar6.f195900x0, this.f196006P0, this.f196020W0, this.f196008Q0, this.f196050h1, bVar6.f195881o, bVar6.f195885q, this.f196053i1, this.f196057k, this.f196002N0, this.f196072p, uVarA8, bVar6.f195882o0));
            this.f196059k1 = uVarD16;
            this.f196062l1 = new com.avito.android.messenger.conversation.mvi.channel_feature.o(new com.avito.android.messenger.conversation.mvi.channel_feature.i(new com.avito.android.messenger.conversation.mvi.channel_feature.f(uVarD16, this.f196036d, this.f196039e, this.f196012S0, bVar6.f195880n0), com.avito.android.messenger.conversation.mvi.channel_feature.k.a(), com.avito.android.messenger.conversation.mvi.channel_feature.m.a(), bVar6.f195880n0, this.f196036d));
            this.f196065m1 = dagger.internal.g.d(new V(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196068n1 = dagger.internal.g.d(new C32449k(c32431e, this.f196042f, this.f196033c, this.f196054j));
            C49468b c49468b = this.f195985F;
            com.avito.android.photo_download.c cVar2 = com.avito.android.photo_download.c.f216431a;
            dagger.internal.u<com.avito.android.util.R0> uVar47 = bVar6.f195880n0;
            com.avito.android.photo_download.f.f216440d.getClass();
            com.avito.android.photo_download.f fVar2 = new com.avito.android.photo_download.f(c49468b, cVar2, uVar47);
            dagger.internal.u<com.avito.android.permissions.u> uVar48 = bVar6.f195866g0;
            dagger.internal.u<com.avito.android.util.C> uVar49 = bVar6.f195832F0;
            com.avito.android.photo_download.feature.mvi.d.f216453d.getClass();
            com.avito.android.photo_download.feature.mvi.d dVar = new com.avito.android.photo_download.feature.mvi.d(fVar2, uVar48, uVar49);
            com.avito.android.photo_download.feature.mvi.i iVar = com.avito.android.photo_download.feature.mvi.i.f216462a;
            com.avito.android.photo_download.feature.mvi.g.f216459c.getClass();
            com.avito.android.photo_download.feature.mvi.g gVar = new com.avito.android.photo_download.feature.mvi.g(dVar, iVar);
            com.avito.android.photo_download.feature.mvi.k.f216463b.getClass();
            this.f196071o1 = new com.avito.android.photo_download.feature.mvi.k(gVar);
            this.f196074p1 = dagger.internal.g.d(new C32489p(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196077q1 = dagger.internal.g.d(new C32480m(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196080r1 = dagger.internal.g.d(new G(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196083s1 = dagger.internal.g.d(new D(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196086t1 = dagger.internal.g.d(new C32518z(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196089u1 = dagger.internal.g.d(new J(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196092v1 = dagger.internal.g.d(new C32435f0(c32431e, this.f196042f, this.f196054j));
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.quick_replies.d> uVarD17 = dagger.internal.g.d(new P(c32431e, this.f196042f, this.f196033c, this.f196054j));
            this.f196095w1 = uVarD17;
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.quick_replies.adapter.b> uVarD18 = dagger.internal.g.d(new Q(c32431e, new com.avito.android.messenger.conversation.mvi.quick_replies.adapter.h(uVarD17)));
            this.f196098x1 = uVarD18;
            dagger.internal.u<com.avito.konveyor.a> uVarD19 = dagger.internal.g.d(new O(c32431e, uVarD18));
            this.f196101y1 = uVarD19;
            this.f196104z1 = dagger.internal.g.d(new N(c32431e, uVarD19));
            this.f195976A1 = dagger.internal.g.d(new I(c32431e, this.f196042f, this.f196033c, this.f196054j));
        }

        @Override // com.avito.android.messenger.di.InterfaceC32428d
        public final void a(ChannelFragment channelFragment) throws BlueprintCollisionException {
            dagger.internal.u<com.avito.android.messenger.conversation.mvi.platform_actions.f> uVar = this.f196097x0;
            b bVar = this.f196030b;
            InterfaceC28373a interfaceC28373aA = bVar.f195853a.a();
            dagger.internal.t.c(interfaceC28373aA);
            channelFragment.f189006t0 = interfaceC28373aA;
            InterfaceC32422b interfaceC32422b = bVar.f195853a;
            channelFragment.f189008u0 = interfaceC32422b.j1();
            channelFragment.f189009v0 = interfaceC32422b.Dk();
            channelFragment.f189010w0 = interfaceC32422b.M0();
            channelFragment.f189011x0 = interfaceC32422b.h();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.f195855b.u4();
            dagger.internal.t.c(aVarU4);
            channelFragment.f189012y0 = aVarU4;
            channelFragment.f189013z0 = interfaceC32422b.C();
            interfaceC32422b.C0();
            channelFragment.f188933A0 = interfaceC32422b.D();
            channelFragment.f188934B0 = this.f196062l1;
            channelFragment.f188936D0 = dagger.internal.g.a(uVar);
            h31.e eVarA = dagger.internal.g.a(uVar);
            int i12 = TY.b.f15698a;
            com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.d dVar = new com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.d(new com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.h(eVarA));
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(dVar);
            com.avito.konveyor.a aVarA = c10493a.a();
            channelFragment.f188937E0 = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
            com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.d dVar2 = new com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.d(new com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.h(dagger.internal.g.a(uVar)));
            a.C10493a c10493a2 = new a.C10493a();
            c10493a2.b(dVar2);
            channelFragment.f188938F0 = c10493a2.a();
            channelFragment.f188939G0 = this.f196065m1.get();
            channelFragment.f188940H0 = this.f196068n1.get();
            channelFragment.f188943I0 = this.f196071o1;
            channelFragment.f188945K0 = this.f196074p1.get();
            channelFragment.f188946L0 = this.f196077q1.get();
            channelFragment.f188947M0 = this.f196080r1.get();
            channelFragment.f188948N0 = dagger.internal.g.a(this.f196083s1);
            channelFragment.f188949O0 = this.f196086t1.get();
            channelFragment.f188950P0 = this.f195999M.get();
            channelFragment.f188952Q0 = this.f196089u1.get();
            channelFragment.f188954R0 = this.f196092v1.get();
            channelFragment.f188956S0 = this.f196104z1.get();
            channelFragment.f188958T0 = this.f196101y1.get();
            channelFragment.f188960U0 = this.f196095w1.get();
            com.avito.android.connection_quality.connectivity.a aVarU = interfaceC32422b.U();
            dagger.internal.t.c(aVarU);
            channelFragment.f188962V0 = aVarU;
            com.avito.android.util.C cJ2 = interfaceC32422b.j();
            dagger.internal.t.c(cJ2);
            channelFragment.f188964W0 = cJ2;
            channelFragment.f188966X0 = this.f196072p.get();
            channelFragment.f188969Y0 = this.f196027a;
            channelFragment.f188971Z0 = interfaceC32422b.N();
            InterfaceC32572u interfaceC32572uX0 = interfaceC32422b.x0();
            dagger.internal.t.c(interfaceC32572uX0);
            channelFragment.f188973a1 = interfaceC32572uX0;
            com.avito.android.messenger.notification.e eVarCg = interfaceC32422b.Cg();
            dagger.internal.t.c(eVarCg);
            channelFragment.f188975b1 = eVarCg;
            com.avito.android.util.R0 r0C = interfaceC32422b.c();
            dagger.internal.t.c(r0C);
            channelFragment.f188977c1 = new com.avito.android.messenger.conversation.mvi.messages.utils.p(r0C, this.f196044f1.get());
            com.avito.android.util.R0 r0C2 = interfaceC32422b.c();
            dagger.internal.t.c(r0C2);
            channelFragment.f188979d1 = new com.avito.android.messenger.conversation.mvi.messages.utils.d(r0C2);
            u3.g<MessengerQuickRepliesWithTitleTestGroup> gVarPb = interfaceC32422b.pb();
            dagger.internal.t.c(gVarPb);
            channelFragment.f188981e1 = gVarPb;
            InterfaceC31987a interfaceC31987a = this.f196057k.get();
            SK0.b bVarP = interfaceC32422b.p();
            dagger.internal.t.c(bVarP);
            channelFragment.f188983f1 = new com.avito.android.messenger.conversation.uxf.a(interfaceC31987a, bVarP);
            channelFragment.f188985g1 = this.f196099y.get();
            com.avito.android.util.R0 r0C3 = interfaceC32422b.c();
            dagger.internal.t.c(r0C3);
            channelFragment.f188987h1 = r0C3;
            com.avito.android.deep_linking.x xVarT = interfaceC32422b.t();
            dagger.internal.t.c(xVarT);
            channelFragment.f188989i1 = xVarT;
            channelFragment.f188991j1 = this.f196025Z.get();
            channelFragment.f188993k1 = this.f195976A1.get();
            com.avito.android.messenger.conversation.mvi.common.a aVarEe = interfaceC32422b.ee();
            dagger.internal.t.c(aVarEe);
            channelFragment.f188995l1 = aVarEe;
            u3.g<SimpleTestGroupWithNone> gVarO7 = interfaceC32422b.O7();
            dagger.internal.t.c(gVarO7);
            channelFragment.f188997m1 = gVarO7;
            JY.a aVarZ6 = interfaceC32422b.Z6();
            dagger.internal.t.c(aVarZ6);
            channelFragment.f188999n1 = aVarZ6;
        }
    }

    /* compiled from: DaggerChannelActivityComponent.java */
    /* renamed from: com.avito.android.messenger.di.l0$e */
    public static final class e implements InterfaceC32419a.InterfaceC5770a {
        public e() {
        }

        @Override // com.avito.android.messenger.di.InterfaceC32419a.InterfaceC5770a
        public final InterfaceC32419a a(InterfaceC32422b interfaceC32422b, InterfaceC30106l7 interfaceC30106l7, InterfaceC39417a interfaceC39417a, ChannelScreen channelScreen, ChannelActivityFragment channelActivityFragment) {
            interfaceC39417a.getClass();
            channelScreen.getClass();
            return new b(interfaceC32422b, interfaceC30106l7, interfaceC39417a, channelScreen, channelActivityFragment, null);
        }
    }

    public static InterfaceC32419a.InterfaceC5770a a() {
        return new e();
    }
}
