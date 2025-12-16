package com.avito.android.user_adverts.tab_screens.adverts;

import Cd.C13243a;
import W60.d;
import Z60.a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.platform.C22491k0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU.s;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.UserAdvertsScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deep_linking.links.MyDraftAdvertDetailsLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.ownership.Owners;
import com.avito.android.personal_banner.feature.factory.b;
import com.avito.android.personal_selections.mvi.o;
import com.avito.android.user_adverts.root_screen.adverts_host.h0;
import com.avito.android.user_adverts.root_screen.adverts_host.i0;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListData;
import com.avito.android.user_adverts.tab_screens.advert_list.progress.d;
import com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.a;
import com.avito.android.user_adverts.tab_screens.adverts.C35662a;
import com.avito.android.user_adverts.tab_screens.adverts.F;
import com.avito.android.user_adverts.tab_screens.adverts.j;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35695e;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.P;
import com.avito.android.user_adverts.tab_screens.di.l;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import com.avito.android.user_adverts_views_pub.a;
import com.avito.android.util.R0;
import com.google.common.collect.H1;
import cv.InterfaceC39417a;
import fJ0.InterfaceC40301a;
import java.util.Collection;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import l70.InterfaceC43570a;
import nE.C44240b;
import pI0.C46965a;
import pI0.h;
import wJ0.InterfaceC49523d;
import z1.AbstractC50339a;

/* compiled from: UserAdvertsListMviFragment.kt */
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/UserAdvertsListMviFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/h0;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "Lcom/avito/android/user_adverts_views_pub/a;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/shortcut_title/b;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/loading/b;", "LwJ0/d;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/d$a;", "Lcom/avito/android/analytics/screens/j$b;", "LFV0/c;", "<init>", "()V", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsListMviFragment extends BaseBeduinHostFragment implements h0, com.avito.android.bottom_navigation.ui.fragment.g, com.avito.android.user_adverts_views_pub.a, com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.b, com.avito.android.user_adverts.tab_screens.advert_list.loading.b, InterfaceC49523d, d.a, InterfaceC28477j.b, FV0.c {

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public static final C35649a f314828R0 = new C35649a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public i0 f314829A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_adverts.tab_screens.adverts.o f314830B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public C35662a.b f314831C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile_settings.u f314832D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_add.l f314833E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.personal_selections.view.d f314834F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public C44240b f314835G0;

    /* renamed from: H0, reason: collision with root package name */
    public cU.s f314836H0;

    /* renamed from: I0, reason: collision with root package name */
    public ScreenPerformanceTracker f314837I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final O0 f314838J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final O0 f314839K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final O0 f314840L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final O0 f314841M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public final O0 f314842N0;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public final Object f314843O0;

    /* renamed from: P0, reason: collision with root package name */
    public RecyclerView f314844P0;

    /* renamed from: Q0, reason: collision with root package name */
    public View f314845Q0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public F.a f314846o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public j.a f314847p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public d.a f314848q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public o.a f314849r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f314850s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public H1 f314851t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_adverts.tab_screens.adverts.n f314852u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f314853v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_adverts.tab_actions.host.e f314854w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public R0 f314855x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public P f314856y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public C35695e f314857z0;

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A extends N implements Y41.a<Fragment> {
        public A() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UserAdvertsListMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ A f314859l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(A a12) {
            super(0);
            this.f314859l = a12;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f314859l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314860l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314860l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f314860l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314861l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314861l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f314861l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f314862l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(Y41.a aVar) {
            super(0);
            this.f314862l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f314862l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F extends N implements Y41.a<Fragment> {
        public F() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UserAdvertsListMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class G extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ F f314864l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(F f12) {
            super(0);
            this.f314864l = f12;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f314864l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314865l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314865l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f314865l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "androidx/fragment/app/j0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class I extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f314866l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(Y41.a aVar) {
            super(0);
            this.f314866l = aVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f314866l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/f0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class J extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314867l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314867l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f314867l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/g0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class K extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314868l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314868l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f314868l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class L extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f314870m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314870m = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final P0.c invoke() {
            P0.c defaultViewModelProviderFactory;
            T0 t02 = (T0) this.f314870m.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return (interfaceC22969B == null || (defaultViewModelProviderFactory = interfaceC22969B.getDefaultViewModelProviderFactory()) == null) ? UserAdvertsListMviFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListData;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class M extends N implements Y41.a<UserAdvertsListData> {
        public M() {
            super(0);
        }

        @Override // Y41.a
        public final UserAdvertsListData invoke() {
            Bundle bundleRequireArguments = UserAdvertsListMviFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_user_adverts_list_data", UserAdvertsListData.class) : bundleRequireArguments.getParcelable("key_user_adverts_list_data");
            if (parcelable != null) {
                return (UserAdvertsListData) parcelable;
            }
            throw new IllegalArgumentException("UserAdvertsListData not provided");
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/UserAdvertsListMviFragment$a;", "", "<init>", "()V", "", "ARGS_NOT_PROVIDER_MESSAGE", "Ljava/lang/String;", "BANNER_DEFAULT_PLACEMENT", "BANNER_PLACE", "BANNER_POSITION", "BEDUIN_SCENARIO_NAME", "KEY_USER_ADVERTS_LIST_DATA", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$a, reason: case insensitive filesystem */
    public static final class C35649a {
        public /* synthetic */ C35649a(C42822w c42822w) {
            this();
        }

        public C35649a() {
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LW60/d;", "invoke", "()LW60/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$b, reason: case insensitive filesystem */
    public static final class C35650b extends N implements Y41.a<W60.d> {
        public C35650b() {
            super(0);
        }

        @Override // Y41.a
        public final W60.d invoke() {
            UserAdvertsListMviFragment userAdvertsListMviFragment = UserAdvertsListMviFragment.this;
            d.a aVar = userAdvertsListMviFragment.f314848q0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(((com.avito.android.user_adverts.tab_screens.adverts.E) userAdvertsListMviFragment.f314838J0.getValue()).f314824J);
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/j;", "invoke", "()Lcom/avito/android/user_adverts/tab_screens/adverts/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$c, reason: case insensitive filesystem */
    public static final class C35651c extends N implements Y41.a<j> {
        public C35651c() {
            super(0);
        }

        @Override // Y41.a
        public final j invoke() {
            j.a aVar = UserAdvertsListMviFragment.this.f314847p0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.create();
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/F;", "invoke", "()Lcom/avito/android/user_adverts/tab_screens/adverts/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$d, reason: case insensitive filesystem */
    public static final class C35652d extends N implements Y41.a<com.avito.android.user_adverts.tab_screens.adverts.F> {
        public C35652d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.user_adverts.tab_screens.adverts.F invoke() {
            UserAdvertsListMviFragment userAdvertsListMviFragment = UserAdvertsListMviFragment.this;
            F.a aVar = userAdvertsListMviFragment.f314846o0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(((com.avito.android.user_adverts.tab_screens.adverts.E) userAdvertsListMviFragment.f314838J0.getValue()).f314825K);
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$onViewCreated$2", f = "UserAdvertsListMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$e, reason: case insensitive filesystem */
    public static final class C35653e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f314875q;

        public C35653e(Continuation<? super C35653e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C35653e c35653e = UserAdvertsListMviFragment.this.new C35653e(continuation);
            c35653e.f314875q = obj;
            return c35653e;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C35653e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f314875q;
            C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.t(UserAdvertsListMviFragment.this, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$onViewCreated$3", f = "UserAdvertsListMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$f, reason: case insensitive filesystem */
    public static final class C35654f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f314877q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListMviFragment f314878r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C35662a f314879s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35654f(C35662a c35662a, UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation continuation) {
            super(2, continuation);
            this.f314878r = userAdvertsListMviFragment;
            this.f314879s = c35662a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C35654f c35654f = new C35654f(this.f314879s, this.f314878r, continuation);
            c35654f.f314877q = obj;
            return c35654f;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C35654f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f314877q;
            C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f314878r;
            C35662a c35662a = this.f314879s;
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.B(c35662a, userAdvertsListMviFragment, null), 3);
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.s(c35662a, null), 3);
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.A(userAdvertsListMviFragment, null), 3);
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.r(userAdvertsListMviFragment, null), 3);
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.u(userAdvertsListMviFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$onViewCreated$4", f = "UserAdvertsListMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$g, reason: case insensitive filesystem */
    public static final class C35655g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f314880q;

        public C35655g(Continuation<? super C35655g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C35655g c35655g = UserAdvertsListMviFragment.this.new C35655g(continuation);
            c35655g.f314880q = obj;
            return c35655g;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C35655g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f314880q;
            C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            UserAdvertsListMviFragment userAdvertsListMviFragment = UserAdvertsListMviFragment.this;
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.y(userAdvertsListMviFragment, null), 3);
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.z(userAdvertsListMviFragment, null), 3);
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.w(userAdvertsListMviFragment, null), 3);
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.x(userAdvertsListMviFragment, null), 3);
            C43259k.d(t12, null, null, new com.avito.android.user_adverts.tab_screens.adverts.v(userAdvertsListMviFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$h, reason: case insensitive filesystem */
    public static final class C35656h extends N implements Y41.a<T0> {
        public C35656h() {
            super(0);
        }

        @Override // Y41.a
        public final T0 invoke() {
            UserAdvertsListMviFragment userAdvertsListMviFragment = UserAdvertsListMviFragment.this;
            Fragment parentFragment = userAdvertsListMviFragment.getParentFragment();
            return parentFragment == null ? userAdvertsListMviFragment : parentFragment;
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/personal_selections/mvi/o;", "invoke", "()Lcom/avito/android/personal_selections/mvi/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$i, reason: case insensitive filesystem */
    public static final class C35657i extends N implements Y41.a<com.avito.android.personal_selections.mvi.o> {
        public C35657i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.personal_selections.mvi.o invoke() {
            UserAdvertsListMviFragment userAdvertsListMviFragment = UserAdvertsListMviFragment.this;
            o.a aVar = userAdvertsListMviFragment.f314849r0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(((com.avito.android.user_adverts.tab_screens.adverts.E) userAdvertsListMviFragment.f314838J0.getValue()).f314823E);
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$j, reason: case insensitive filesystem */
    public static final class C35658j extends N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {
        public C35658j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            return (com.avito.android.lib.beduin_v2.feature.mvi.x) ((j) UserAdvertsListMviFragment.this.f314840L0.getValue()).f315161L.getValue();
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/F;", "invoke", "()Lcom/avito/android/user_adverts/tab_screens/adverts/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$k, reason: case insensitive filesystem */
    public static final class C35659k extends N implements Y41.a<com.avito.android.user_adverts.tab_screens.adverts.F> {
        public C35659k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.user_adverts.tab_screens.adverts.F invoke() {
            C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            return UserAdvertsListMviFragment.this.u5();
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LnE/b;", "invoke", "()LnE/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$l, reason: case insensitive filesystem */
    public static final class C35660l extends N implements Y41.a<C44240b> {
        public C35660l() {
            super(0);
        }

        @Override // Y41.a
        public final C44240b invoke() {
            C44240b c44240b = UserAdvertsListMviFragment.this.f314835G0;
            if (c44240b != null) {
                return c44240b;
            }
            return null;
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/F;", "invoke", "()Lcom/avito/android/user_adverts/tab_screens/adverts/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$m, reason: case insensitive filesystem */
    public static final class C35661m extends N implements Y41.a<com.avito.android.user_adverts.tab_screens.adverts.F> {
        public C35661m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.user_adverts.tab_screens.adverts.F invoke() {
            C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            return UserAdvertsListMviFragment.this.u5();
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LnE/b;", "invoke", "()LnE/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<C44240b> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final C44240b invoke() {
            C44240b c44240b = UserAdvertsListMviFragment.this.f314835G0;
            if (c44240b != null) {
                return c44240b;
            }
            return null;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314889l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314889l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f314889l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f314890l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Y41.a aVar) {
            super(0);
            this.f314890l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f314890l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<Fragment> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UserAdvertsListMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f314892l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(q qVar) {
            super(0);
            this.f314892l = qVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f314892l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314893l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314893l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f314893l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314894l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314894l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f314894l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f314895l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Y41.a aVar) {
            super(0);
            this.f314895l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f314895l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends N implements Y41.a<Fragment> {
        public v() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UserAdvertsListMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ v f314897l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(v vVar) {
            super(0);
            this.f314897l = vVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f314897l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314898l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314898l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f314898l.getValue()).getF42820b();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f314899l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Y41.a aVar) {
            super(0);
            this.f314899l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f314899l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f314900l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f314900l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f314900l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public UserAdvertsListMviFragment() {
        C35656h c35656h = new C35656h();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new I(c35656h));
        n0 n0Var = m0.f406844a;
        this.f314838J0 = new O0(n0Var.b(com.avito.android.user_adverts.tab_screens.adverts.E.class), new J(interfaceC42726CB), new L(interfaceC42726CB), new K(interfaceC42726CB));
        y yVar = new y(new C35652d());
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new B(new A()));
        this.f314839K0 = new O0(n0Var.b(com.avito.android.user_adverts.tab_screens.adverts.F.class), new C(interfaceC42726CB2), yVar, new D(interfaceC42726CB2));
        E e12 = new E(new C35651c());
        InterfaceC42726C interfaceC42726CB3 = C42727D.b(lazyThreadSafetyMode, new G(new F()));
        this.f314840L0 = new O0(n0Var.b(j.class), new H(interfaceC42726CB3), e12, new o(interfaceC42726CB3));
        p pVar = new p(new C35650b());
        InterfaceC42726C interfaceC42726CB4 = C42727D.b(lazyThreadSafetyMode, new r(new q()));
        this.f314841M0 = new O0(n0Var.b(W60.d.class), new s(interfaceC42726CB4), pVar, new t(interfaceC42726CB4));
        u uVar = new u(new C35657i());
        InterfaceC42726C interfaceC42726CB5 = C42727D.b(lazyThreadSafetyMode, new w(new v()));
        this.f314842N0 = new O0(n0Var.b(com.avito.android.personal_selections.mvi.o.class), new x(interfaceC42726CB5), uVar, new z(interfaceC42726CB5));
        this.f314843O0 = C42727D.b(lazyThreadSafetyMode, new M());
    }

    @Override // com.avito.android.user_adverts_views_pub.a
    public final void K(@Y61.k DeepLink deepLink) {
        t5(deepLink);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        RecyclerView recyclerView = this.f314844P0;
        RecyclerView recyclerView2 = recyclerView == null ? null : recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView2.scrollBy(0, -recyclerView.computeVerticalScrollOffset());
    }

    @Override // wJ0.InterfaceC49523d
    public final void R2(@Y61.k DeepLink deepLink) {
        t5(deepLink);
    }

    @Override // com.avito.android.user_adverts_views_pub.a
    public final void U3(@Y61.k DeepLink deepLink) {
        t5(deepLink);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.user_adverts_views_pub.a
    public final void X(@Y61.k a.InterfaceC9834a interfaceC9834a) {
        h.a cVar;
        DeepLink f316729a;
        Q q12;
        com.avito.android.user_adverts.tab_screens.adverts.o oVar = this.f314830B0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.getClass();
        InterfaceC28373a interfaceC28373a = oVar.f315530a;
        a.InterfaceC9834a.d dVar = (a.InterfaceC9834a.d) interfaceC9834a;
        if (dVar.getF316729a() != null) {
            DeepLink f316729a2 = dVar.getF316729a();
            if (f316729a2 instanceof MyAdvertLink.EditLink) {
                MyAdvertLink.EditLink editLink = (MyAdvertLink.EditLink) f316729a2;
                if (editLink instanceof MyAdvertLink.Edit) {
                    q12 = new Q(((MyAdvertLink.Edit) editLink).f133489c, Boolean.valueOf(((MyAdvertLink.Edit) editLink).f133492f));
                } else {
                    if (!(editLink instanceof MyAdvertLink.EditV1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q12 = new Q(((MyAdvertLink.EditV1) editLink).f133499c, Boolean.valueOf(((MyAdvertLink.EditV1) editLink).f133502f));
                }
                String str = (String) q12.f406619b;
                if (((Boolean) q12.f406620c).booleanValue()) {
                    interfaceC28373a.c(new C46965a(str));
                }
            }
        }
        boolean z12 = interfaceC9834a instanceof a.InterfaceC9834a.C9835a;
        if (z12) {
            cVar = h.a.C12264a.f428495a;
        } else if (interfaceC9834a instanceof a.InterfaceC9834a.b) {
            cVar = h.a.b.f428496a;
        } else {
            if (!(interfaceC9834a instanceof a.InterfaceC9834a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new h.a.c(((a.InterfaceC9834a.c) interfaceC9834a).f316731a.getF316663d());
        }
        String f419716c = interfaceC9834a.getF316732b().getF393800c();
        String f393797p = interfaceC9834a.getF316732b().getF393797P();
        if (f393797p == null) {
            f393797p = "";
        }
        interfaceC28373a.c(new pI0.h(f419716c, cVar, f393797p));
        if (z12) {
            f316729a = ((a.InterfaceC9834a.d) interfaceC9834a).getF316729a();
            if (f316729a == null) {
                return;
            }
        } else if (interfaceC9834a instanceof a.InterfaceC9834a.b) {
            f316729a = ((a.InterfaceC9834a.d) interfaceC9834a).getF316729a();
            if (f316729a == null) {
                return;
            }
        } else {
            if (!(interfaceC9834a instanceof a.InterfaceC9834a.c)) {
                return;
            }
            if (((a.InterfaceC9834a.c) interfaceC9834a).f316731a instanceof UserAdvertItem.RightAction.b) {
                u5().accept(new InterfaceC40301a.d.C11143a(((a.InterfaceC9834a.c) interfaceC9834a).f316732b.getF393800c()));
                return;
            } else {
                f316729a = ((a.InterfaceC9834a.d) interfaceC9834a).getF316729a();
                if (f316729a == null) {
                    return;
                }
            }
        }
        t5(f316729a);
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.h0
    public final void Z3() {
        ((W60.d) this.f314841M0.getValue()).accept(a.b.f19919a);
        u5().accept(InterfaceC40301a.b.d.f395817a);
        v5().accept(InterfaceC43570a.c.f413537a);
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.b
    public final void b4(@Y61.k com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.a aVar) {
        if (!(aVar instanceof a.C9734a)) {
            boolean z12 = aVar instanceof a.b;
            return;
        }
        a.C9734a c9734a = (a.C9734a) aVar;
        u5().accept(new InterfaceC40301a.c.b(c9734a.f314763a, c9734a.f314764b));
    }

    @Override // FV0.d
    public final void close() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.loading.b
    public final void o4() {
        u5().accept(InterfaceC40301a.b.C11140b.f395814a);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f314837I0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.user_adverts_mvi_list, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f314845Q0 = view.findViewById(R.id.user_adverts_overlay_view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        this.f314844P0 = recyclerView;
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = 0L;
        }
        H1 h12 = this.f314851t0;
        if (h12 == null) {
            h12 = null;
        }
        RecyclerView recyclerView2 = this.f314844P0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        Iterator<E> it = h12.iterator();
        while (it.hasNext()) {
            recyclerView2.l((RecyclerView.l) it.next(), -1);
        }
        RecyclerView recyclerView3 = this.f314844P0;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        com.avito.konveyor.adapter.d dVar = this.f314850s0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView3.setAdapter(dVar);
        C35662a.b bVar = this.f314831C0;
        if (bVar == null) {
            bVar = null;
        }
        C35662a c35662a = new C35662a(bVar.f314913a, u5(), (W60.d) this.f314841M0.getValue(), (j) this.f314840L0.getValue(), v5(), bVar.f314914b, bVar.f314915c, null);
        s5(Lifecycle.State.f46681d, new C35653e(null));
        s5(Lifecycle.State.f46682e, new C35654f(c35662a, this, null));
        s5(Lifecycle.State.f46683f, new C35655g(null));
        ScreenPerformanceTracker screenPerformanceTracker = this.f314837I0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        C28478k c28478k;
        String str;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        com.avito.android.user_adverts.tab_screens.di.m mVar = (com.avito.android.user_adverts.tab_screens.di.m) C29972i.a(C29972i.b(this), com.avito.android.user_adverts.tab_screens.di.m.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        if (w5().f314695h) {
            Screen screen = w5().f314694g;
            UserAdvertsScreen.f90543d.getClass();
            c28478k = new C28478k(screen, rVarC, UserAdvertsScreen.f90545f);
        } else {
            c28478k = new C28478k(w5().f314694g, rVarC, null, 4, null);
        }
        this.f314837I0 = mVar.b().a(c28478k);
        ZS.b bVar = new ZS.b(w5().f314694g, Owners.f210450U2, "personal-banner-in-user-adverts");
        H.a aVarEd = mVar.ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f314837I0;
        com.avito.android.lib.beduin_v2.feature.di.H hA2 = com.avito.android.lib.beduin_v2.feature.di.K.a(aVarEd, screenPerformanceTracker != null ? screenPerformanceTracker : null, bVar, cv.c.d(this), null, null, null, 56);
        com.avito.android.position_in_search.storage.provider.c cVarA = mVar.u3().a(mVar);
        nI0.i iVar = nI0.i.f414995a;
        String str2 = w5().f314689b;
        iVar.getClass();
        if (str2.equals("sellervation")) {
            str = "my-items." + w5().f314689b;
        } else {
            str = "my-items.top";
        }
        b.InterfaceC6452b interfaceC6452bM3 = mVar.m3();
        W60.a aVar = new W60.a(str, C22026a.c(C22491k0.b(str, '['), w5().f314689b, ']'));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new C35658j());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f314837I0;
        com.avito.android.personal_banner.feature.factory.b bVarA = interfaceC6452bM3.a(aVar, interfaceC42726CC, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, new com.avito.android.user_adverts.tab_screens.adverts.dataProvider.a(C42727D.c(new C35659k()), C42727D.c(new C35660l())), mVar, hA2);
        com.avito.android.personal_selections.di.c cVarA2 = mVar.pm().a(mVar, interfaceC39417aB, new com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h(C42727D.c(new n()), C42727D.c(new C35661m())), new com.avito.android.personal_selections.mvi.a(C22026a.c(new StringBuilder("UserAdverts["), w5().f314689b, ']')));
        l.a aVarA = com.avito.android.user_adverts.tab_screens.di.a.a();
        UserAdvertsListData userAdvertsListDataW5 = w5();
        Resources resources = getResources();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f314837I0;
        aVarA.a(userAdvertsListDataW5, this, resources, c28478k, screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null, mVar, interfaceC39417aB, cVarA, bVarA, hA2, cVarA2).a(this);
        s.a aVarFd = mVar.fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f314837I0;
        ScreenPerformanceTracker screenPerformanceTracker5 = screenPerformanceTracker4 != null ? screenPerformanceTracker4 : null;
        O0 o02 = this.f314840L0;
        this.f314836H0 = aVarFd.a(contextRequireContext, screenPerformanceTracker5, ((j) o02.getValue()).f315160K, cU.v.f57891a, ((j) o02.getValue()).f315159J);
        ScreenPerformanceTracker screenPerformanceTracker6 = this.f314837I0;
        if (screenPerformanceTracker6 == null) {
            screenPerformanceTracker6 = null;
        }
        screenPerformanceTracker6.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker7 = this.f314837I0;
        if (screenPerformanceTracker7 == null) {
            screenPerformanceTracker7 = null;
        }
        screenPerformanceTracker7.c(this, g5());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final cU.s q5() {
        cU.s sVar = this.f314836H0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return ((j) this.f314840L0.getValue()).f315158E;
    }

    @Override // com.avito.android.user_adverts.tab_screens.advert_list.progress.d.a
    public final void s4() {
        u5().accept(InterfaceC40301a.b.e.f395818a);
        ((W60.d) this.f314841M0.getValue()).accept(a.b.f19919a);
        v5().accept(InterfaceC43570a.c.f413537a);
    }

    public final void s5(Lifecycle.State state, Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar) {
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.user_adverts.tab_screens.adverts.q(this, state, pVar, null), 3);
    }

    public final void t5(DeepLink deepLink) {
        Bundle bundle;
        if (deepLink instanceof MyDraftAdvertDetailsLink ? true : deepLink instanceof MyAdvertDetailsLink) {
            bundle = new Bundle();
            bundle.putParcelable("up_intent", null);
        } else {
            bundle = null;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f314853v0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, bundle, 2);
    }

    @Override // com.avito.android.user_adverts_views_pub.a
    public final void u3(@Y61.k String str, @Y61.l String str2, boolean z12) {
        u5().accept(new InterfaceC40301a.c.C11141a(str, str2, z12));
    }

    public final com.avito.android.user_adverts.tab_screens.adverts.F u5() {
        return (com.avito.android.user_adverts.tab_screens.adverts.F) this.f314839K0.getValue();
    }

    public final com.avito.android.personal_selections.mvi.o v5() {
        return (com.avito.android.personal_selections.mvi.o) this.f314842N0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final UserAdvertsListData w5() {
        return (UserAdvertsListData) this.f314843O0.getValue();
    }

    @Override // com.avito.android.user_adverts_views_pub.a
    public final void x3(@Y61.k DeepLink deepLink) {
        t5(deepLink);
    }
}
