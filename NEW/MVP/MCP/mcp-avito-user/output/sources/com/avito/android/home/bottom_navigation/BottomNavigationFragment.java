package com.avito.android.home.bottom_navigation;

import Cd.C13243a;
import Oj.InterfaceC14702a;
import Rj.C15047a;
import Zd.InterfaceC19542a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.CalledFrom;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.ab_tests.InterfaceC27661y;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.AuthSource;
import com.avito.android.bottom_navigation.BottomNavigationControllerState;
import com.avito.android.bottom_navigation.C28885g;
import com.avito.android.bottom_navigation.C28899v;
import com.avito.android.bottom_navigation.InterfaceC28879a;
import com.avito.android.bottom_navigation.InterfaceC28880b;
import com.avito.android.bottom_navigation.InterfaceC28881c;
import com.avito.android.bottom_navigation.InterfaceC28886h;
import com.avito.android.bottom_navigation.InterfaceC28891m;
import com.avito.android.bottom_navigation.K;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.bottom_navigation.ab_tests.configs.AvitoBusiness360NavbarTestGroup;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.BottomNavigationLayout;
import com.avito.android.bottom_navigation.ui.GlobalBottomNavigationLayout;
import com.avito.android.bottom_navigation.ui.RedesignBottomNavigationLayout;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.bxcontent.InterfaceC28960a;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.di.C29972i;
import com.avito.android.di.component.InterfaceC29903j;
import com.avito.android.di.component.InterfaceC29904k;
import com.avito.android.favorites.InterfaceC30662g1;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.ui.status_bar.d;
import com.avito.android.util.C35952u1;
import com.avito.android.util.C35968w3;
import com.avito.android.util.H2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import iR.C41336a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import ur.InterfaceC49101b;
import z1.AbstractC50339a;

/* compiled from: BottomNavigationFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/home/bottom_navigation/BottomNavigationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/home/bottom_navigation/p;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]"})
/* loaded from: classes13.dex */
public final class BottomNavigationFragment extends BaseFragment implements com.avito.android.home.bottom_navigation.p, InterfaceC28477j.a, com.avito.android.ui.status_bar.a {

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public static final a f162243V0;

    /* renamed from: W0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f162244W0;

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public InterfaceC30662g1 f162245A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f162246B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public InterfaceC28960a f162247C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public SK0.b f162248D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.home.navbar.i f162249E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public InterfaceC49101b f162250F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f162251G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public C28885g f162252H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public H2 f162253I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f162254J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f162255K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f162256L0;

    /* renamed from: M0, reason: collision with root package name */
    public final Set<com.avito.android.bottom_navigation.ui.fragment.f> f162257M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public InterfaceC28891m f162258N0;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.l
    public BottomNavigationLayout f162259O0;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.l
    public RedesignBottomNavigationLayout f162260P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.l
    public GlobalBottomNavigationLayout f162261Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f162262R0;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public final C35952u1 f162263S0;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f162264T0;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f162265U0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f162266n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public L f162267o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public TabFragmentFactory f162268p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.i f162269q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f162270r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ED.a f162271s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f162272t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public G f162273u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f162274v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f162275w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC27661y f162276x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.bottom_navigation.G f162277y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC14702a f162278z0;

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/home/bottom_navigation/BottomNavigationFragment$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/home/navbar/a;", "invoke", "()Lcom/avito/android/home/navbar/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.home.navbar.a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.home.navbar.a invoke() {
            return ((com.avito.android.di.component.I) C29972i.a(C29972i.b(BottomNavigationFragment.this), com.avito.android.di.component.I.class)).Ih();
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/home/navbar/d;", "invoke", "()Lcom/avito/android/home/navbar/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.home.navbar.d> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.home.navbar.d invoke() {
            return new com.avito.android.home.navbar.d(BottomNavigationFragment.this.d1());
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/F;", "invoke", "()Lcom/avito/android/bottom_navigation/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.bottom_navigation.F> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.bottom_navigation.F invoke() {
            BottomNavigationFragment bottomNavigationFragment = BottomNavigationFragment.this;
            com.avito.android.bottom_navigation.G g12 = bottomNavigationFragment.f162277y0;
            if (g12 == null) {
                g12 = null;
            }
            return g12.a(bottomNavigationFragment.v5().f162304c);
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/saved_searches/model/SubscriptionUnreadCount;", "apply", "(J)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements l41.o {
        public f() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Number) obj).longValue();
            com.avito.android.ui.i iVar = BottomNavigationFragment.this.f162269q0;
            if (iVar == null) {
                iVar = null;
            }
            return iVar.j();
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f162283l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.a("HomeActivity", "updateUserFavoritesCounters error", th2);
            return G0.f406611a;
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).longValue();
            com.avito.android.ui.i iVar = BottomNavigationFragment.this.f162269q0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.c();
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f162285b = new i<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("HomeActivity", "updateFavoriteSalesItemsCounter error", (Throwable) obj);
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC28891m f162286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC28891m interfaceC28891m) {
            super(1);
            this.f162286l = interfaceC28891m;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            this.f162286l.i(bool.booleanValue());
            return G0.f406611a;
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f162287l = new k();

        public k() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/home/bottom_navigation/BottomNavigationFragment$l", "Lcom/avito/android/bottom_navigation/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements InterfaceC28881c {
        public l() {
        }

        public final boolean a() {
            com.avito.android.ui.i iVar = BottomNavigationFragment.this.f162269q0;
            if (iVar == null) {
                iVar = null;
            }
            return iVar.d();
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/home/bottom_navigation/BottomNavigationFragment$m", "Lcom/avito/android/bottom_navigation/h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements InterfaceC28886h {
        public m() {
        }

        public final void a(@Y61.k NavigationTabSetItem navigationTabSetItem) {
            a aVar = BottomNavigationFragment.f162243V0;
            BottomNavigationFragment bottomNavigationFragment = BottomNavigationFragment.this;
            int iIndexOf = bottomNavigationFragment.u5().indexOf(navigationTabSetItem);
            L l12 = bottomNavigationFragment.f162267o0;
            if (l12 == null) {
                l12 = null;
            }
            BottomNavigationFragment.q5(bottomNavigationFragment, l12.c(iIndexOf), navigationTabSetItem);
        }

        public final void b(@Y61.l C28899v c28899v) {
            ((com.avito.android.home.bottom_navigation.n) BottomNavigationFragment.this.requireActivity()).f1(c28899v);
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/home/bottom_navigation/BottomNavigationFragment$n", "Lcom/avito/android/bottom_navigation/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements InterfaceC28879a {
        public n() {
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/home/bottom_navigation/BottomNavigationFragment$o", "Lcom/avito/android/bottom_navigation/K;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o implements K {
        public o() {
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/home/bottom_navigation/BottomNavigationFragment$p", "Lcom/avito/android/bottom_navigation/I;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p implements com.avito.android.bottom_navigation.I {
        public p() {
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState$NavbarBusiness360;", "navbarBusiness360", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bottom_navigation/ui/fragment/factory/NavigationState$NavbarBusiness360;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.l<NavigationState.NavbarBusiness360, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.home.navbar.f f162293l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BottomNavigationFragment f162294m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(com.avito.android.home.navbar.f fVar, BottomNavigationFragment bottomNavigationFragment) {
            super(1);
            this.f162293l = fVar;
            this.f162294m = bottomNavigationFragment;
        }

        @Override // Y41.l
        public final G0 invoke(NavigationState.NavbarBusiness360 navbarBusiness360) {
            boolean z12;
            boolean z13;
            com.avito.android.ui.status_bar.d dVar;
            NavigationState.NavbarBusiness360 navbarBusiness3602 = navbarBusiness360;
            com.avito.android.home.navbar.f fVar = this.f162293l;
            boolean z14 = navbarBusiness3602.f107151b;
            boolean z15 = false;
            boolean z16 = fVar.f162447a && z14;
            int i12 = 8;
            fVar.f162452f.setVisibility(z16 ? 0 : 8);
            fVar.f162455i.setVisibility(z16 ? 0 : 8);
            boolean z17 = navbarBusiness3602 instanceof NavigationState.NavbarBusiness360.Hide;
            if (z17) {
                z12 = false;
            } else {
                if (!(navbarBusiness3602 instanceof NavigationState.NavbarBusiness360.Show)) {
                    throw new NoWhenBranchMatchedException();
                }
                z12 = ((NavigationState.NavbarBusiness360.Show) navbarBusiness3602).f107153c;
            }
            if (fVar.f162457k && z12) {
                i12 = 0;
            }
            fVar.f162456j.setVisibility(i12);
            if (z17) {
                z13 = false;
            } else {
                if (!(navbarBusiness3602 instanceof NavigationState.NavbarBusiness360.Show)) {
                    throw new NoWhenBranchMatchedException();
                }
                z13 = ((NavigationState.NavbarBusiness360.Show) navbarBusiness3602).f107154d;
            }
            fVar.f162453g.setClickable(z13);
            a aVar = BottomNavigationFragment.f162243V0;
            com.avito.android.home.navbar.d dVar2 = (com.avito.android.home.navbar.d) this.f162294m.f162265U0.getValue();
            if (dVar2.f162440b && z14) {
                z15 = true;
            }
            Z1<com.avito.android.ui.status_bar.d> z18 = dVar2.f162441c;
            if (z15) {
                ThemeAppearance themeAppearance = ThemeAppearance.f181334b;
                com.avito.android.home.navbar.f.f162445l.getClass();
                dVar = new com.avito.android.ui.status_bar.d(themeAppearance, new d.a.C9356a(com.avito.android.home.navbar.f.f162446m));
            } else {
                dVar = null;
            }
            z18.setValue(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class r extends N implements Y41.a<String> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            Fragment fragmentPrevious;
            InterfaceC23487e interfaceC23487ePrevious;
            List<Fragment> listP = BottomNavigationFragment.this.getChildFragmentManager().P();
            ListIterator<Fragment> listIterator = listP.listIterator(listP.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fragmentPrevious = null;
                    break;
                }
                fragmentPrevious = listIterator.previous();
                if (fragmentPrevious.isResumed()) {
                    break;
                }
            }
            Fragment fragment = fragmentPrevious;
            if (!(fragment instanceof TabContainerFragment)) {
                return null;
            }
            List<Fragment> listP2 = ((TabContainerFragment) fragment).getChildFragmentManager().P();
            ListIterator<Fragment> listIterator2 = listP2.listIterator(listP2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    interfaceC23487ePrevious = null;
                    break;
                }
                interfaceC23487ePrevious = listIterator2.previous();
                if (((Fragment) interfaceC23487ePrevious).isResumed()) {
                    break;
                }
            }
            InterfaceC23487e interfaceC23487e = (Fragment) interfaceC23487ePrevious;
            InterfaceC28880b interfaceC28880b = interfaceC23487e instanceof InterfaceC28880b ? (InterfaceC28880b) interfaceC23487e : null;
            if (interfaceC28880b != null) {
                return interfaceC28880b.f2();
            }
            return null;
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<G0> {
        public s() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C28885g c28885g = BottomNavigationFragment.this.f162252H0;
            if (c28885g != null) {
                c28885g.f107010f.b(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f162297l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Y41.a aVar) {
            super(0);
            this.f162297l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f162297l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends N implements Y41.a<Fragment> {
        public u() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BottomNavigationFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u f162299l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(u uVar) {
            super(0);
            this.f162299l = uVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f162299l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f162300l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f162300l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f162300l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f162301l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f162301l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f162301l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BottomNavigationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/home/bottom_navigation/F;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/home/bottom_navigation/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends N implements Y41.a<F> {
        public y() {
            super(0);
        }

        @Override // Y41.a
        public final F invoke() {
            G g12 = BottomNavigationFragment.this.f162273u0;
            if (g12 == null) {
                g12 = null;
            }
            return (F) g12.get();
        }
    }

    static {
        Y y12 = new Y(BottomNavigationFragment.class, "openParams", "getOpenParams()Lcom/avito/android/home/bottom_navigation/BottomNavigationOpenParams;", 0);
        n0 n0Var = m0.f406844a;
        f162244W0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BottomNavigationFragment.class, "bottomNavigationControllerState", "getBottomNavigationControllerState()Lcom/avito/android/bottom_navigation/BottomNavigationControllerState;", 0, n0Var)};
        f162243V0 = new a(null);
    }

    public BottomNavigationFragment() {
        super(R.layout.fragment_bottom_navigation);
        t tVar = new t(new y());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new v(new u()));
        this.f162274v0 = new O0(m0.f406844a.b(F.class), new w(interfaceC42726CB), tVar, new x(interfaceC42726CB));
        this.f162251G0 = new C35968w3(this);
        this.f162254J0 = new io.reactivex.rxjava3.disposables.c();
        this.f162257M0 = Collections.newSetFromMap(new WeakHashMap());
        this.f162262R0 = C42727D.c(new e());
        this.f162263S0 = new C35952u1(this);
        this.f162264T0 = C42727D.c(new c());
        this.f162265U0 = C42727D.c(new d());
    }

    public static final void q5(BottomNavigationFragment bottomNavigationFragment, Intent intent, NavigationTabSetItem navigationTabSetItem) {
        AuthSource authSource = navigationTabSetItem == NavigationTab.f106973i ? AuthSource.f92712l : navigationTabSetItem == NavigationTab.f106972h ? AuthSource.f92698e : navigationTabSetItem == NavigationTab.f106974j ? AuthSource.f92696d : AuthSource.f92727s0;
        InterfaceC19542a interfaceC19542a = bottomNavigationFragment.f162266n0;
        if (interfaceC19542a == null) {
            interfaceC19542a = null;
        }
        bottomNavigationFragment.startActivity(interfaceC19542a.e(authSource, intent));
    }

    @Override // com.avito.android.bottom_navigation.U
    public final void E1() {
        C41336a.C11375a.a();
        C28885g c28885g = this.f162252H0;
        if (c28885g != null) {
            c28885g.b(true);
        }
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return d1();
    }

    @Override // com.avito.android.bottom_navigation.space.e
    public final boolean d1() {
        boolean zBooleanValue;
        int iOrdinal = v5().f162304c.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.home.navbar.a aVar = (com.avito.android.home.navbar.a) this.f162264T0.getValue();
        aVar.getClass();
        com.avito.android.lib.util.i.f181373a.getClass();
        boolean z12 = com.avito.android.lib.util.i.f181377e;
        C15047a c15047a = aVar.f162437a;
        if (z12) {
            kotlin.reflect.n<Object> nVar = C15047a.f14573m[7];
            zBooleanValue = ((Boolean) c15047a.f14581i.a().invoke()).booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (!zBooleanValue) {
            return false;
        }
        kotlin.reflect.n<Object>[] nVarArr = C15047a.f14573m;
        kotlin.reflect.n<Object> nVar2 = nVarArr[5];
        if (((Boolean) c15047a.f14579g.a().invoke()).booleanValue()) {
            return false;
        }
        kotlin.reflect.n<Object> nVar3 = nVarArr[6];
        if (!((Boolean) c15047a.f14580h.a().invoke()).booleanValue()) {
            u3.l<AvitoBusiness360NavbarTestGroup> lVar = aVar.f162438b.get();
            AvitoBusiness360NavbarTestGroup avitoBusiness360NavbarTestGroup = lVar.f439745a.f439749b;
            if (avitoBusiness360NavbarTestGroup != AvitoBusiness360NavbarTestGroup.f106995c) {
                lVar.b();
            }
            avitoBusiness360NavbarTestGroup.getClass();
            if (avitoBusiness360NavbarTestGroup != AvitoBusiness360NavbarTestGroup.f106996d) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.bottom_navigation.space.e
    @Y61.k
    public final BottomNavigationSpace f4() {
        return v5().f162304c;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.bottom_navigation.space.e
    public final void n1() {
        NavigationTabSetItem navigationTabSetItemA;
        C28885g c28885g = this.f162252H0;
        if (c28885g == null || (navigationTabSetItemA = c28885g.a()) == null) {
            return;
        }
        c28885g.f107012h.post(new RunnableC28882d(0, c28885g, navigationTabSetItemA));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (d1()) {
            com.avito.android.ui.status_bar.e eVar = this.f162246B0;
            if (eVar == null) {
                eVar = null;
            }
            eVar.c(this, Collections.singletonList((com.avito.android.home.navbar.d) this.f162265U0.getValue()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f162254J0.e();
        H2 h22 = this.f162253I0;
        if (h22 != null) {
            h22.dispose();
        }
        this.f162253I0 = null;
        InterfaceC28891m interfaceC28891m = this.f162258N0;
        if (interfaceC28891m != null) {
            interfaceC28891m.onDestroyView();
        }
        this.f162258N0 = null;
        C28885g c28885g = this.f162252H0;
        this.f162263S0.setValue(this, f162244W0[1], c28885g != null ? c28885g.d() : null);
        this.f162252H0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        io.reactivex.rxjava3.internal.observers.y yVar = this.f162255K0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f162255K0 = null;
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f162256L0;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f162256L0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.ui.i iVar = this.f162269q0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.i();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        InterfaceC35745a5 interfaceC35745a5 = this.f162272t0;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        this.f162255K0 = A1.h(io.reactivex.rxjava3.core.z.a0(0L, 1L, timeUnit, interfaceC35745a5.c()).y0(new f()), g.f162283l, null, 6);
        InterfaceC35745a5 interfaceC35745a52 = this.f162272t0;
        this.f162256L0 = (io.reactivex.rxjava3.internal.observers.y) io.reactivex.rxjava3.core.z.a0(0L, 1L, timeUnit, (interfaceC35745a52 != null ? interfaceC35745a52 : null).c()).v0(new h(), i.f162285b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C28885g c28885g = this.f162252H0;
        if (c28885g != null) {
            BottomNavigationControllerState bottomNavigationControllerStateD = c28885g.d();
            this.f162263S0.setValue(this, f162244W0[1], bottomNavigationControllerStateD);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c3  */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(@Y61.k android.view.View r34, @Y61.l android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.home.bottom_navigation.BottomNavigationFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.avito.android.bottom_navigation.space.e
    @Y61.l
    public final View p1() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R.id.close_icon);
        }
        return null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) throws PackageManager.NameNotFoundException {
        InterfaceC29904k.a aVarA = com.avito.android.di.component.q.a();
        Context contextRequireContext = requireContext();
        PackageInfo packageInfo = contextRequireContext.getPackageManager().getPackageInfo(contextRequireContext.getPackageName(), 0);
        aVarA.a(packageInfo.lastUpdateTime == packageInfo.firstInstallTime, (InterfaceC29903j) C29972i.a(C29972i.b(this), InterfaceC29903j.class), cv.c.b(this), (com.avito.android.di.component.I) C29972i.a(C29972i.b(this), com.avito.android.di.component.I.class)).a(this);
    }

    @Y61.l
    public final NavigationTabSetItem r5() {
        C28885g c28885g = this.f162252H0;
        if (c28885g != null) {
            return c28885g.a();
        }
        return null;
    }

    public final void s5(@Y61.l C28899v c28899v) {
        C28885g c28885g = this.f162252H0;
        if (c28885g != null) {
            c28885g.f107010f.b(c28899v);
        }
    }

    public final void t5() {
        C28885g c28885g = this.f162252H0;
        if (c28885g != null) {
            c28885g.b(false);
        }
    }

    public final com.avito.android.bottom_navigation.F u5() {
        return (com.avito.android.bottom_navigation.F) this.f162262R0.getValue();
    }

    public final BottomNavigationOpenParams v5() {
        return (BottomNavigationOpenParams) this.f162251G0.getValue(this, f162244W0[0]);
    }

    public final void w5(@Y61.k BottomNavigationScreenParams bottomNavigationScreenParams) {
        C28885g c28885g = this.f162252H0;
        if (c28885g == null) {
            return;
        }
        com.avito.android.bottom_navigation.F fU5 = u5();
        NavigationTab navigationTab = NavigationTab.f106972h;
        boolean zContains = fU5.contains(navigationTab);
        TabFragmentFactory.Data data = bottomNavigationScreenParams.f162307c;
        if (zContains) {
            CalledFrom calledFrom = bottomNavigationScreenParams.f162308d;
            if (((calledFrom instanceof CalledFrom.AppLinking) && kotlin.jvm.internal.L.f(((CalledFrom.AppLinking) calledFrom).f67242b, com.avito.android.deep_linking.links.storage.a.f134018a.b(AdvertPublicationLink.Public.class))) || ((calledFrom instanceof CalledFrom.Push) && kotlin.jvm.internal.L.f(((CalledFrom.Push) calledFrom).f67244b, com.avito.android.deep_linking.links.storage.a.f134018a.b(AdvertPublicationLink.Public.class)))) {
                if (data != null) {
                    c28885g.c(data);
                    return;
                } else {
                    c28885g.e(navigationTab);
                    return;
                }
            }
        }
        if (data != null) {
            c28885g.c(data);
            return;
        }
        Integer num = bottomNavigationScreenParams.f162306b;
        if (num != null) {
            c28885g.e(u5().get(num.intValue()));
        } else if (c28885g.a() == null) {
            c28885g.e((NavigationTabSetItem) C42745f0.E(u5()));
        }
    }
}
