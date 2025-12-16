package com.avito.android.user_adverts.root_screen.adverts_host;

import AI0.a;
import DI0.a;
import DI0.c;
import TI0.a;
import YI0.a;
import Zd.InterfaceC19542a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22977J;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.seller_coach.adverts_hint.view.f;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.user_advert.AdvertActionTransferData;
import com.avito.android.user_adverts.di.host_fragment.C35553a;
import com.avito.android.user_adverts.di.host_fragment.z;
import com.avito.android.user_adverts.root_screen.UserAdvertsFragmentData;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.a;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.e;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.h;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.o;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.q;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.u;
import com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.c;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.j;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import com.avito.android.user_adverts.tab_actions.host.f;
import com.avito.android.user_adverts_common.ux_feedback.a;
import com.avito.android.user_adverts_filters.host.d;
import com.avito.android.util.C35835l0;
import com.avito.android.util.R0;
import com.google.android.material.appbar.MaterialToolbar;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.f2;
import nE.C44240b;
import zI0.InterfaceC50474d;
import zq0.AbstractC50612a;

/* compiled from: UserAdvertsHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u001f²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\r8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r8\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/UserAdvertsHostFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/K;", "Lcom/avito/android/user_adverts/di/host_fragment/z;", "Lcom/avito/android/bottom_navigation/ui/fragment/l;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "Lcom/avito/android/bottom_navigation/ui/fragment/m;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$d;", "LDI0/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lkotlinx/coroutines/flow/j;", "LPI0/b;", "safetyInfoCollector", "LxI0/b;", "charityInfoCollector", "LvI0/b;", "appRaterCollector", "Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/a;", "feedbackEventCollector", "Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;", "feedbackResultCollector", "LyI0/b;", "deliveryRestrictionCollector", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "uxFeedbackLinksCollector", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h;", "panelView", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsHostFragment extends TabBaseFragment implements com.avito.android.K<com.avito.android.user_adverts.di.host_fragment.z>, com.avito.android.bottom_navigation.ui.fragment.l, com.avito.android.bottom_navigation.ui.fragment.g, com.avito.android.bottom_navigation.ui.fragment.m, h.d, DI0.c, InterfaceC28477j.b {

    /* renamed from: o1, reason: collision with root package name */
    @Y61.k
    public static final a f312290o1 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f312291A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_adverts.tab_actions.host.j f312292B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_adverts.tab_actions.host.items.d f312293C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public h31.e<InterfaceC50474d> f312294D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b> f312295E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public AbstractC50612a f312296F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public C44240b f312297G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f312298H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f312299I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public R0 f312300J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public f.c f312301K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 f312302L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public b.InterfaceC9564b f312303M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public a.InterfaceC9795a f312304N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public com.avito.android.app_rater.b f312305O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public h.c f312306P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public f.b f312307Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public h.b f312308R0;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    public UserAdvertsSpace f312309S0;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public j.b f312310T0;

    /* renamed from: U0, reason: collision with root package name */
    @Inject
    public o.a f312311U0;

    /* renamed from: V0, reason: collision with root package name */
    @Inject
    public h.a f312312V0;

    /* renamed from: W0, reason: collision with root package name */
    @Inject
    public q.a f312313W0;

    /* renamed from: X0, reason: collision with root package name */
    @Inject
    public u.a f312314X0;

    /* renamed from: Y0, reason: collision with root package name */
    @Inject
    public e.a f312315Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @Inject
    public a.C9535a f312316Z0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f312317a1;

    /* renamed from: b1, reason: collision with root package name */
    @Y61.l
    public b0 f312318b1;

    /* renamed from: c1, reason: collision with root package name */
    public com.avito.android.user_adverts.tab_actions.host.f f312319c1;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.l
    public com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h f312320d1;

    /* renamed from: e1, reason: collision with root package name */
    public com.avito.android.user_adverts.di.host_fragment.z f312321e1;

    /* renamed from: f1, reason: collision with root package name */
    @Y61.l
    public com.avito.android.user_adverts.root_screen.adverts_host.soa_info_bottom_sheet.a f312322f1;

    /* renamed from: g1, reason: collision with root package name */
    @Y61.k
    public final k f312323g1;

    /* renamed from: h1, reason: collision with root package name */
    @Y61.k
    public final j f312324h1;

    /* renamed from: i1, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<G0> f312325i1;

    /* renamed from: j1, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<G0> f312326j1;

    /* renamed from: k1, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<d.a> f312327k1;

    /* renamed from: l1, reason: collision with root package name */
    @Y61.k
    public NavigationState f312328l1;

    /* renamed from: m1, reason: collision with root package name */
    @Y61.k
    public final Object f312329m1;

    /* renamed from: n1, reason: collision with root package name */
    @Y61.k
    public final Object f312330n1;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f312331t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.vas_planning.balance_lack.f f312332u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_adverts_filters.host.d f312333v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f312334w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> f312335x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f312336y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public eH0.k f312337z0;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/UserAdvertsHostFragment$a;", "", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static UserAdvertsHostFragment a(@Y61.l DeepLink deepLink, @Y61.l AdvertActionTransferData advertActionTransferData, @Y61.l String str, @Y61.l String str2, boolean z12) {
            UserAdvertsHostFragment userAdvertsHostFragment = new UserAdvertsHostFragment();
            Bundle bundle = new Bundle();
            bundle.putString("selected_shortcut", str);
            bundle.putString("message", str2);
            bundle.putParcelable("advert_action", advertActionTransferData);
            bundle.putParcelable("action", deepLink);
            bundle.putBoolean("show_navigation", z12);
            userAdvertsHostFragment.setArguments(bundle);
            return userAdvertsHostFragment;
        }

        public a() {
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectActions$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1247}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312338q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f312340s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f312341t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Lifecycle.State state, Y41.p<? super kotlinx.coroutines.T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f312340s = state;
            this.f312341t = (SuspendLambda) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return UserAdvertsHostFragment.this.new b(this.f312340s, this.f312341t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312338q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312338q = 1;
                if (C23056p0.b(UserAdvertsHostFragment.this, this.f312340s, this.f312341t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LDI0/c$b;", "invoke", "()LDI0/c$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<c.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f312342l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final c.b invoke() {
            c.b.f3152c.getClass();
            return new c.b(f2.b(16, 0, null, 6), null);
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c$c;", "invoke", "()Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<c.C9591c> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f312343l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final c.C9591c invoke() {
            c.C9591c.f313011c.getClass();
            return new c.C9591c(f2.b(0, 16, null, 5), null);
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$onCreateView$8", f = "UserAdvertsHostFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f312344q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = UserAdvertsHostFragment.this.new e(continuation);
            eVar.f312344q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f312344q;
            a aVar = UserAdvertsHostFragment.f312290o1;
            UserAdvertsHostFragment userAdvertsHostFragment = UserAdvertsHostFragment.this;
            C43259k.d(t12, null, null, new r(userAdvertsHostFragment, null), 3);
            b0 b0Var = userAdvertsHostFragment.f312318b1;
            C44240b c44240b = userAdvertsHostFragment.f312297G0;
            if (c44240b == null) {
                c44240b = null;
            }
            if (!c44240b.v().invoke().booleanValue() && b0Var != null) {
                C43259k.d(t12, null, null, new C35640z(userAdvertsHostFragment, b0Var, null), 3);
                C43259k.d(t12, null, null, new A(userAdvertsHostFragment, null), 3);
            }
            b0 b0Var2 = userAdvertsHostFragment.f312318b1;
            C44240b c44240b2 = userAdvertsHostFragment.f312297G0;
            if (c44240b2 == null) {
                c44240b2 = null;
            }
            if (!c44240b2.v().invoke().booleanValue() && b0Var2 != null) {
                C43259k.d(t12, null, null, new C35639y(userAdvertsHostFragment, b0Var2, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$onCreateView$9", f = "UserAdvertsHostFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f312346q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = UserAdvertsHostFragment.this.new f(continuation);
            fVar.f312346q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f312346q;
            UserAdvertsHostFragment userAdvertsHostFragment = UserAdvertsHostFragment.this;
            b0 b0Var = userAdvertsHostFragment.f312318b1;
            C44240b c44240b = userAdvertsHostFragment.f312297G0;
            if (c44240b == null) {
                c44240b = null;
            }
            if (!c44240b.v().invoke().booleanValue() && b0Var != null) {
                C43259k.d(t12, null, null, new C35637w(userAdvertsHostFragment, b0Var, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends kotlin.jvm.internal.H implements Y41.l<View, com.avito.android.lib.deprecated_design.tab.adapter.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f312348b = new g();

        public g() {
            super(1, com.avito.android.lib.deprecated_design.tab.adapter.f.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // Y41.l
        public final com.avito.android.lib.deprecated_design.tab.adapter.f invoke(View view) {
            return new com.avito.android.lib.deprecated_design.tab.adapter.f(view);
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f312349l = new h();

        public h() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Bundle bundle) {
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.user_adverts.root_screen.adverts_host.soa_info_bottom_sheet.a aVar = UserAdvertsHostFragment.this.f312322f1;
            if (aVar != null) {
                aVar.r();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_adverts/root_screen/adverts_host/UserAdvertsHostFragment$j", "Landroid/content/BroadcastReceiver;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends BroadcastReceiver {
        public j() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Y61.k Context context, @Y61.k Intent intent) {
            int i12 = Build.VERSION.SDK_INT;
            AdvertActionTransferData advertActionTransferData = (AdvertActionTransferData) (i12 >= 33 ? (Parcelable) intent.getParcelableExtra("advert_action", AdvertActionTransferData.class) : intent.getParcelableExtra("advert_action"));
            String stringExtra = intent.getStringExtra("soa_update_message");
            boolean z12 = false;
            boolean booleanExtra = intent.getBooleanExtra("should_show_app_rater", false);
            DeepLink deepLink = (DeepLink) (i12 >= 33 ? (Parcelable) intent.getParcelableExtra("delivery_restriction", DeepLink.class) : intent.getParcelableExtra("delivery_restriction"));
            a aVar = UserAdvertsHostFragment.f312290o1;
            UserAdvertsHostFragment userAdvertsHostFragment = UserAdvertsHostFragment.this;
            userAdvertsHostFragment.F5().h6(stringExtra);
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = userAdvertsHostFragment.f312302L0;
            if (e0Var == null) {
                e0Var = null;
            }
            e0Var.accept(new a.l(advertActionTransferData != null ? advertActionTransferData.f308187c : null));
            InterfaceC50474d interfaceC50474dF5 = userAdvertsHostFragment.F5();
            boolean z13 = (advertActionTransferData != null ? advertActionTransferData.f308189e : null) == AdvertActionTransferData.Type.f308190b;
            String str = advertActionTransferData != null ? advertActionTransferData.f308188d : null;
            String str2 = advertActionTransferData != null ? advertActionTransferData.f308186b : null;
            if (stringExtra != null && stringExtra.length() > 0) {
                z12 = true;
            }
            InterfaceC50474d.a.a(interfaceC50474dF5, booleanExtra, z13, str, str2, z12, deepLink, 908);
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_adverts/root_screen/adverts_host/UserAdvertsHostFragment$k", "Landroid/content/BroadcastReceiver;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k extends BroadcastReceiver {
        public k() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Y61.k Context context, @Y61.k Intent intent) {
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = UserAdvertsHostFragment.this.f312302L0;
            if (e0Var == null) {
                e0Var = null;
            }
            e0Var.accept(a.f.f15535a);
        }
    }

    public UserAdvertsHostFragment() {
        super(0, 1, null);
        this.f312317a1 = new io.reactivex.rxjava3.disposables.c();
        this.f312323g1 = new k();
        this.f312324h1 = new j();
        this.f312325i1 = registerForActivityResult(new OI0.a(new C35564b(this, 1)), new L91.o(new C35564b(this, 2), 1));
        this.f312326j1 = registerForActivityResult(new OI0.e(new C35564b(this, 3)), new L91.o(new C35564b(this, 4), 3));
        this.f312327k1 = registerForActivityResult(new OI0.c(new C35564b(this, 5)), new L91.o(new C35564b(this, 0), 2));
        this.f312328l1 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null), 1, null);
        d dVar = d.f312343l;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f312329m1 = C42727D.b(lazyThreadSafetyMode, dVar);
        this.f312330n1 = C42727D.b(lazyThreadSafetyMode, c.f312342l);
    }

    public static void G5(UserAdvertsHostFragment userAdvertsHostFragment, DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = userAdvertsHostFragment.f312334w0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 4);
    }

    public static void H5(UserAdvertsHostFragment userAdvertsHostFragment, PrintableText printableText, ApiError apiError, int i12) {
        ToastBarPosition toastBarPosition = ToastBarPosition.f181047e;
        if ((i12 & 2) != 0) {
            apiError = null;
        }
        if ((i12 & 8) != 0) {
            toastBarPosition = ToastBarPosition.f181046d;
        }
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.c(cVar, userAdvertsHostFragment, printableText, null, null, f.c.a.a(apiError, null), 0, toastBarPosition, 942);
    }

    public final void D5(Lifecycle.State state, Y41.p<? super kotlinx.coroutines.T, ? super Continuation<? super G0>, ? extends Object> pVar) {
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(state, pVar, null), 3);
    }

    public final void E5() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("action", DeepLink.class) : arguments.getParcelable("action"));
            if (deepLink != null) {
                G5(this, deepLink);
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    arguments2.remove("action");
                }
            }
        }
    }

    public final InterfaceC50474d F5() {
        h31.e<InterfaceC50474d> eVar = this.f312294D0;
        if (eVar == null) {
            eVar = null;
        }
        return eVar.get();
    }

    public final void I5(KI0.a aVar) {
        com.avito.android.user_adverts.root_screen.adverts_host.soa_info_bottom_sheet.a aVar2;
        com.avito.android.user_adverts.root_screen.adverts_host.soa_info_bottom_sheet.a aVar3 = this.f312322f1;
        if ((aVar3 != null ? Boolean.valueOf(aVar3.isShowing()) : null) == null || !((aVar2 = this.f312322f1) == null || aVar2.isShowing())) {
            Context contextRequireContext = requireContext();
            String str = aVar.f9384a;
            com.avito.android.util.text.a aVar4 = this.f312299I0;
            com.avito.android.user_adverts.root_screen.adverts_host.soa_info_bottom_sheet.a aVar5 = new com.avito.android.user_adverts.root_screen.adverts_host.soa_info_bottom_sheet.a(contextRequireContext, str, (aVar4 != null ? aVar4 : null).c(requireContext(), aVar.f9385b), aVar.f9386c, aVar.f9387d, new i());
            com.avito.android.lib.util.g.a(aVar5);
            aVar5.s();
            this.f312322f1 = aVar5;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        C44240b c44240b = this.f312297G0;
        if (c44240b == null) {
            c44240b = null;
        }
        if (c44240b.v().invoke().booleanValue()) {
            ((c.b) this.f312330n1.getValue()).f3153b.K5(a.C0165a.f3145a);
            return;
        }
        b0 b0Var = this.f312318b1;
        if (b0Var != null) {
            InterfaceC23487e interfaceC23487e = b0Var.f312386l.f312364l;
            com.avito.android.bottom_navigation.ui.fragment.g gVar = interfaceC23487e instanceof com.avito.android.bottom_navigation.ui.fragment.g ? (com.avito.android.bottom_navigation.ui.fragment.g) interfaceC23487e : null;
            if (gVar != null) {
                gVar.K3();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.bottom_navigation.ui.fragment.m
    public final boolean O(@Y61.k TabFragmentFactory.Data data) {
        boolean z12 = false;
        if (!(data instanceof UserAdvertsFragmentData)) {
            return false;
        }
        UserAdvertsFragmentData userAdvertsFragmentData = (UserAdvertsFragmentData) data;
        String str = userAdvertsFragmentData.f312201b;
        int i12 = 1;
        Object[] objArr = 0;
        if (str != null) {
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = this.f312302L0;
            if (e0Var == null) {
                e0Var = null;
            }
            e0Var.accept(new a.k(str));
        } else {
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var2 = this.f312302L0;
            if (e0Var2 == null) {
                e0Var2 = null;
            }
            e0Var2.accept(new a.h(z12, i12, objArr == true ? 1 : 0));
        }
        String str2 = userAdvertsFragmentData.f312202c;
        if (str2 != null) {
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var3 = this.f312302L0;
            (e0Var3 != null ? e0Var3 : null).accept(new a.n(str2));
        }
        DeepLink deepLink = userAdvertsFragmentData.f312204e;
        if (deepLink != null) {
            G5(this, deepLink);
        }
        return true;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h.d
    public final void P2(@Y61.k h.a aVar) {
        if (aVar instanceof h.a.C9654a) {
            F5().accept(new a.f(((h.a.C9654a) aVar).f313674a));
        } else if (aVar instanceof h.a.b) {
            F5().accept(new a.h(((h.a.b) aVar).f313676b));
        } else if (aVar instanceof h.a.c) {
            F5().accept(new a.g(((h.a.c) aVar).f313677a));
        }
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.l
    public final boolean b0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return navigationTabSetItem == NavigationTab.f106972h;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        z.a aVarA = C35553a.a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("message") : null;
        Bundle arguments2 = getArguments();
        UI0.b bVar = new UI0.b(string, arguments2 != null ? arguments2.getString("selected_shortcut") : null);
        BottomNavigationSpace bottomNavigationSpaceX5 = x5();
        com.avito.android.user_adverts.di.host_fragment.B b12 = (com.avito.android.user_adverts.di.host_fragment.B) C29972i.a(C29972i.b(this), com.avito.android.user_adverts.di.host_fragment.B.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        com.avito.android.user_adverts.di.host_fragment.z zVarA = aVarA.a(b12, interfaceC39417aB, b12.id().a(b12), b12.s2().a(b12, interfaceC39417aB), this, this, this, com.avito.android.analytics.screens.s.c(this), bVar, getResources(), bottomNavigationSpaceX5);
        this.f312321e1 = zVarA;
        zVarA.Be(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f312291A0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        super.onCreate(bundle);
        NavigationState navigationState = this.f312328l1;
        Bundle arguments3 = getArguments();
        this.f312328l1 = new NavigationState(arguments3 != null ? arguments3.getBoolean("show_navigation", true) : true, navigationState.f107150c);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f312291A0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.avito.android.user_adverts.tab_actions.host.f$c] */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.avito.android.user_adverts.root_screen.adverts_host.d] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        b0 b0Var;
        AdvertActionTransferData advertActionTransferData;
        Continuation continuation;
        String string;
        String string2;
        ScreenPerformanceTracker screenPerformanceTracker = this.f312291A0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.user_adverts_content_tab_fragment, viewGroup, false);
        com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> jVar = this.f312335x0;
        com.avito.android.lib.deprecated_design.tab.adapter.c cVar = new com.avito.android.lib.deprecated_design.tab.adapter.c(jVar != null ? jVar : null, requireContext(), 0, g.f312348b, 4, null);
        f.b bVar = this.f312307Q0;
        if (bVar == null) {
            bVar = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.v_user_adverts_hints);
        AbstractC50612a abstractC50612a = this.f312296F0;
        if (abstractC50612a == null) {
            abstractC50612a = null;
        }
        com.avito.android.seller_coach.adverts_hint.view.b bVarA = bVar.a(viewGroup2, new SI0.b(abstractC50612a));
        AbstractC50612a abstractC50612a2 = this.f312296F0;
        if (abstractC50612a2 == null) {
            abstractC50612a2 = null;
        }
        C35583o c35583o = new C35583o(this, bVarA, new SI0.a(abstractC50612a2), null);
        Lifecycle.State state = Lifecycle.State.f46682e;
        D5(state, c35583o);
        InterfaceC50474d interfaceC50474dF5 = F5();
        b.InterfaceC9564b interfaceC9564b = this.f312303M0;
        if (interfaceC9564b == null) {
            interfaceC9564b = null;
        }
        com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b bVarA2 = interfaceC9564b.a(C22984Q.a(getViewLifecycleOwner()));
        a.InterfaceC9795a interfaceC9795a = this.f312304N0;
        if (interfaceC9795a == null) {
            interfaceC9795a = null;
        }
        com.avito.android.user_adverts_common.ux_feedback.a aVarA = interfaceC9795a.a(C22984Q.a(getViewLifecycleOwner()));
        C35581m c35581m = new C35581m(this, interfaceC50474dF5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        D5(state, new C35567e(interfaceC50474dF5, this, C42727D.b(lazyThreadSafetyMode, new C35580l(this, viewInflate, interfaceC50474dF5)), C42727D.b(lazyThreadSafetyMode, new C35570h(this, interfaceC50474dF5)), C42727D.b(lazyThreadSafetyMode, c35581m), C42727D.b(lazyThreadSafetyMode, new C35569g(this, interfaceC50474dF5)), C42727D.b(lazyThreadSafetyMode, new C35578j(this, bVarA2)), bVarA2, C42727D.b(lazyThreadSafetyMode, new C35579k(this, interfaceC50474dF5)), C42727D.b(lazyThreadSafetyMode, new C35577i(this, interfaceC50474dF5)), C42727D.b(lazyThreadSafetyMode, new C35582n(this, aVarA)), aVarA, null));
        Lifecycle.State state2 = Lifecycle.State.f46683f;
        D5(state2, new C35568f(this, null));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f312291A0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        InterfaceC28373a interfaceC28373a = this.f312336y0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C44240b c44240b = this.f312297G0;
        if (c44240b == null) {
            c44240b = null;
        }
        this.f312320d1 = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h(viewInflate, screenPerformanceTracker2, interfaceC28373a, c44240b);
        D5(state, new C35592p(this, null));
        C44240b c44240b2 = this.f312297G0;
        if (c44240b2 == null) {
            c44240b2 = null;
        }
        if (c44240b2.v().invoke().booleanValue()) {
            b0Var = null;
        } else {
            ViewGroup viewGroup3 = (ViewGroup) viewInflate;
            FragmentManager childFragmentManager = getChildFragmentManager();
            InterfaceC50474d interfaceC50474dF52 = F5();
            AbstractC50612a abstractC50612a3 = this.f312296F0;
            AbstractC50612a abstractC50612a4 = abstractC50612a3 != null ? abstractC50612a3 : null;
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = this.f312302L0;
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var2 = e0Var != null ? e0Var : null;
            com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> jVar2 = this.f312335x0;
            com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> jVar3 = jVar2 != null ? jVar2 : null;
            UserAdvertsSpace userAdvertsSpace = this.f312309S0;
            b0Var = new b0(viewGroup3, childFragmentManager, interfaceC50474dF52, abstractC50612a4, e0Var2, cVar, jVar3, userAdvertsSpace != null ? userAdvertsSpace : null, !v5());
        }
        this.f312318b1 = b0Var;
        Bundle arguments = getArguments();
        if (arguments != null) {
            advertActionTransferData = (AdvertActionTransferData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("advert_action", AdvertActionTransferData.class) : arguments.getParcelable("advert_action"));
        } else {
            advertActionTransferData = null;
        }
        if (advertActionTransferData != null) {
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var3 = this.f312302L0;
            if (e0Var3 == null) {
                e0Var3 = null;
            }
            e0Var3.accept(new a.l(advertActionTransferData.f308187c));
        }
        InterfaceC50474d.a.a(F5(), false, (advertActionTransferData != null ? advertActionTransferData.f308189e : null) == AdvertActionTransferData.Type.f308190b, advertActionTransferData != null ? advertActionTransferData.f308188d : null, null, false, null, 1377);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("selected_shortcut")) != null) {
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var4 = this.f312302L0;
            if (e0Var4 == null) {
                e0Var4 = null;
            }
            e0Var4.accept(new a.k(string2));
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = arguments3.getString("message")) != null) {
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var5 = this.f312302L0;
            if (e0Var5 == null) {
                e0Var5 = null;
            }
            e0Var5.accept(new a.n(string));
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            androidx.core.content.d.registerReceiver(activityC22955mL1, this.f312323g1, new IntentFilter("com.avito.android.VAS_PAYMENT_SUCCESSFUL"), 4);
        }
        ActivityC22955m activityC22955mL12 = l1();
        if (activityC22955mL12 != null) {
            androidx.core.content.d.registerReceiver(activityC22955mL12, this.f312324h1, new IntentFilter("com.avito.android.USER_ADVERT_STATUS_CHANGE"), 4);
        }
        if (l1() != null) {
            eH0.k kVar = this.f312337z0;
            if (kVar == null) {
                kVar = null;
            }
            kVar.b();
        }
        f.c cVar2 = this.f312301K0;
        ?? r02 = cVar2;
        if (cVar2 == null) {
            r02 = 0;
        }
        this.f312319c1 = r02.a((ViewGroup) viewInflate.findViewById(R.id.content_holder), new com.avito.android.user_adverts.tab_actions.host.d() { // from class: com.avito.android.user_adverts.root_screen.adverts_host.d
            @Override // com.avito.android.user_adverts.tab_actions.host.d
            public final void a() {
                com.avito.android.user_adverts.tab_actions.host.j jVar4 = this.f312552a.f312292B0;
                if (jVar4 == null) {
                    jVar4 = null;
                }
                jVar4.accept(a.b.f19416a);
            }
        });
        if (!this.f312328l1.f107149b) {
            MaterialToolbar materialToolbar = (MaterialToolbar) viewInflate.findViewById(R.id.toolbar);
            Context context = getContext();
            materialToolbar.setNavigationIcon(context != null ? C35835l0.h(R.attr.ic_arrowBack24, context) : null);
            materialToolbar.setNavigationOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 28));
        }
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new I(this, null), 3);
        getChildFragmentManager().p0("request_key_user_adverts_attention_dialog_fragment_data", getViewLifecycleOwner(), new C35565c(this));
        C22960s.b(this, "request_key_hints_dialog", new J(this));
        C44240b c44240b3 = this.f312297G0;
        if (c44240b3 == null) {
            c44240b3 = null;
        }
        if (c44240b3.v().invoke().booleanValue()) {
            j.b bVar2 = this.f312310T0;
            if (bVar2 == null) {
                bVar2 = null;
            }
            com.avito.android.user_adverts.root_screen.adverts_host.host_view.j jVar4 = new com.avito.android.user_adverts.root_screen.adverts_host.host_view.j(viewInflate, this, !v5(), bVar2.f313044b, bVar2.f313043a);
            o.a aVar = this.f312311U0;
            if (aVar == null) {
                aVar = null;
            }
            com.avito.android.user_adverts.root_screen.adverts_host.binder.o oVar = new com.avito.android.user_adverts.root_screen.adverts_host.binder.o(aVar.f312481a.getState(), aVar.f312482b.getState(), aVar.f312483c.getState(), aVar.f312484d.getState(), aVar.f312485e, aVar.f312486f, aVar.f312487g.c(), this, null);
            h.a aVar2 = this.f312312V0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            ?? r62 = this.f312329m1;
            com.avito.android.user_adverts.root_screen.adverts_host.binder.h hVar = new com.avito.android.user_adverts.root_screen.adverts_host.binder.h((c.C9591c) r62.getValue(), this, aVar2.f312439a, aVar2.f312440b.c(), null);
            q.a aVar3 = this.f312313W0;
            if (aVar3 == null) {
                aVar3 = null;
            }
            com.avito.android.user_adverts.root_screen.adverts_host.binder.q qVar = new com.avito.android.user_adverts.root_screen.adverts_host.binder.q(aVar3.f312491a.getEvents(), this, aVar3.f312492b.c(), aVar3.f312493c, null);
            u.a aVar4 = this.f312314X0;
            if (aVar4 == null) {
                aVar4 = null;
            }
            com.avito.android.user_adverts.root_screen.adverts_host.binder.u uVar = new com.avito.android.user_adverts.root_screen.adverts_host.binder.u(aVar4.f312511a.getState(), this, aVar4.f312512b.c(), aVar4.f312513c, null);
            e.a aVar5 = this.f312315Y0;
            if (aVar5 == null) {
                aVar5 = null;
            }
            com.avito.android.user_adverts.root_screen.adverts_host.binder.e eVar = new com.avito.android.user_adverts.root_screen.adverts_host.binder.e((c.b) this.f312330n1.getValue(), this, aVar5.f312427a, aVar5.f312428b.c(), null);
            a.C9535a c9535a = this.f312316Z0;
            if (c9535a == null) {
                c9535a = null;
            }
            com.avito.android.user_adverts.root_screen.adverts_host.binder.a aVar6 = new com.avito.android.user_adverts.root_screen.adverts_host.binder.a(c9535a.f312407a.getEvents(), this, c9535a.f312408b.c(), c9535a.f312409c, null);
            C22977J c22977jA = C22981N.a(getLifecycle());
            C43259k.d(c22977jA, null, null, new C35636v(oVar, new com.avito.android.user_adverts.root_screen.adverts_host.host_view.d(jVar4, (c.C9591c) r62.getValue()), null), 3);
            AbstractC50612a abstractC50612a5 = this.f312296F0;
            if (abstractC50612a5 == null) {
                abstractC50612a5 = null;
            }
            C43259k.d(c22977jA, null, null, new C35607q(hVar, abstractC50612a5, null), 3);
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var6 = this.f312302L0;
            if (e0Var6 == null) {
                e0Var6 = null;
            }
            C43259k.d(c22977jA, null, null, new C35638x(hVar, e0Var6, null), 3);
            C43259k.d(c22977jA, null, null, new C35634t(qVar, aVar6, this, null), 3);
            C43259k.d(c22977jA, null, null, new C35608s(uVar, hVar, F5(), null), 3);
            continuation = null;
            C43259k.d(c22977jA, null, null, new C35635u(uVar, qVar, eVar, aVar6, jVar4, null), 3);
        } else {
            continuation = null;
        }
        D5(Lifecycle.State.f46681d, new e(continuation));
        D5(state2, new f(continuation));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f312291A0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : continuation).d();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f312317a1.e();
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.unregisterReceiver(this.f312323g1);
        }
        ActivityC22955m activityC22955mL12 = l1();
        if (activityC22955mL12 != null) {
            activityC22955mL12.unregisterReceiver(this.f312324h1);
        }
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h hVar = this.f312320d1;
        if (hVar != null) {
            hVar.f312822o = null;
        }
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = this.f312302L0;
        if (e0Var == null) {
            e0Var = null;
        }
        e0Var.accept(a.C1057a.f15530a);
        F5().onResume();
        com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h hVar = this.f312320d1;
        if (hVar != null) {
            hVar.f312822o = new C35565c(this);
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A5(bundle, h.f312349l);
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.user_adverts.di.host_fragment.z zVar = this.f312321e1;
        if (zVar != null) {
            return zVar;
        }
        return null;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF261842N0() {
        return this.f312328l1;
    }
}
