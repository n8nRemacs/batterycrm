package com.avito.android.profile.pro.impl.screen;

import Cd.C13243a;
import D90.a;
import ak.C19902a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.avito_finance_user_profile.view.mvi.p;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile.pro.ProfileProArguments;
import com.avito.android.profile.pro.impl.ProfileTabScreen;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.di.d;
import com.avito.android.profile.pro.impl.screen.A;
import com.avito.android.profile.pro.impl.screen.ProfileProFragment;
import com.avito.android.remote.error.ApiError;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.service_booking_user_profile.view.i;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import com.avito.android.util.y6;
import cv.InterfaceC39417a;
import i.AbstractC41201a;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import mg.InterfaceC44078b;
import mg.InterfaceC44079c;
import po0.InterfaceC47119a;
import z1.AbstractC50339a;

/* compiled from: ProfileProFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/ProfileProFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "c", "d", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileProFragment extends TabBaseFragment implements InterfaceC28477j.b {

    /* renamed from: X0, reason: collision with root package name */
    public static final /* synthetic */ int f222861X0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.settings.b f222862A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.wallet.page.c f222863B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public InterfaceC47119a f222864C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public l90.o f222865D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f222866E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.active_orders_common.items.order.f f222867F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public com.avito.android.active_orders_common.items.all_orders.f f222868G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public t90.b f222869H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.notification_center.counter.f f222870I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public s90.e f222871J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.pro.impl.screen.item.service_booking_block.m f222872K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.pro.impl.screen.item.service_booking_block.c f222873L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.pro.impl.screen.item.geo_banner.c f222874M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public F f222875N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public R0 f222876O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public p.a f222877P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public final O0 f222878Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.pro.impl.screen.item.avito_finance.item.d f222879R0;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.component.user_hat.e> f222880S0;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public final Object f222881T0;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public final Object f222882U0;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public final Object f222883V0;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<G0> f222884W0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public D f222885t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile_tab.summary.f f222886u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public A.a f222887v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final O0 f222888w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f222889x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f222890y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public h.b f222891z0;

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f222892l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f222892l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f222892l.getValue()).getF42820b();
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/ProfileProFragment$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.pro.impl.screen.ProfileProFragment$a, reason: case insensitive filesystem */
    public static final class C33356a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ViewGroup f222893a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AnimationView f222894b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f222895c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final TextView f222896d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Integer, G0> f222897e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f222898f;

        /* renamed from: g, reason: collision with root package name */
        public int f222899g = -1;

        /* renamed from: h, reason: collision with root package name */
        public boolean f222900h;

        /* JADX WARN: Multi-variable type inference failed */
        public C33356a(@Y61.k ViewGroup viewGroup, @Y61.k ViewGroup viewGroup2, @Y61.k AnimationView animationView, @Y61.k TextView textView, @Y61.k TextView textView2, @Y61.k Y41.l<? super Integer, G0> lVar, @Y61.k Y41.a<G0> aVar) {
            this.f222893a = viewGroup2;
            this.f222894b = animationView;
            this.f222895c = textView;
            this.f222896d = textView2;
            this.f222897e = lVar;
            this.f222898f = aVar;
            viewGroup.setOnClickListener(new ViewOnClickListenerC33357a(this, 2));
            viewGroup2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.avito.android.profile.pro.impl.screen.e
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    ProfileProFragment.C33356a c33356a = this.f222947b;
                    if (c33356a.f222900h) {
                        int i22 = i15 - i13;
                        if (c33356a.f222899g != i22) {
                            ((v) c33356a.f222897e).invoke(Integer.valueOf(i22));
                        }
                        c33356a.f222899g = i22;
                    }
                }
            });
        }

        public final void a(boolean z12) {
            this.f222900h = z12;
            this.f222893a.setVisibility(z12 ? 0 : 8);
            if (z12) {
                return;
            }
            if (this.f222899g != 0) {
                ((com.avito.android.profile.pro.impl.screen.v) this.f222897e).invoke(0);
            }
            this.f222899g = 0;
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/ProfileProFragment$b;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SwipeRefreshLayout f222901a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ImageView f222902b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ImageView f222903c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Badge f222904d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ImageView f222905e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ViewGroup f222906f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final C33356a f222907g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.progress_overlay.l f222908h;

        public b(@Y61.k SwipeRefreshLayout swipeRefreshLayout, @Y61.k ImageView imageView, @Y61.k ImageView imageView2, @Y61.k Badge badge, @Y61.k ImageView imageView3, @Y61.k ViewGroup viewGroup, @Y61.k C33356a c33356a) {
            this.f222901a = swipeRefreshLayout;
            this.f222902b = imageView;
            this.f222903c = imageView2;
            this.f222904d = badge;
            this.f222905e = imageView3;
            this.f222906f = viewGroup;
            this.f222907g = c33356a;
            this.f222908h = new com.avito.android.progress_overlay.l(viewGroup, 0, null, R.layout.part_network_problem, 0, 22, null);
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/ProfileProFragment$c;", "", "<init>", "()V", "", "REQ_KEY_PROFILE_PRO_DEEPLINK", "Ljava/lang/String;", "", "SB_BLOCK_THROTTLE_DELAY_MS", "J", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/ProfileProFragment$d;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.deeplink_handler.handler.composite.a f222909a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public List<? extends DeepLink> f222910b;

        public d(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
            this.f222909a = aVar;
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/mvi/p;", "invoke", "()Lcom/avito/android/avito_finance_user_profile/view/mvi/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.avito_finance_user_profile.view.mvi.p> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.avito_finance_user_profile.view.mvi.p invoke() {
            p.a aVar = ProfileProFragment.this.f222877P0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.create();
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/profile/pro/impl/screen/ProfileProFragment$f", "Li/a;", "Lkotlin/G0;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends AbstractC41201a<G0, Boolean> {
        public f() {
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, G0 g02) {
            l90.o oVar = ProfileProFragment.this.f222865D0;
            if (oVar == null) {
                oVar = null;
            }
            return oVar.c();
        }

        @Override // i.AbstractC41201a
        public final Boolean parseResult(int i12, Intent intent) {
            return Boolean.valueOf(i12 == -1);
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/ProfileProFragment$d;", "invoke", "()Lcom/avito/android/profile/pro/impl/screen/ProfileProFragment$d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<d> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final d invoke() {
            com.avito.android.deeplink_handler.handler.composite.a aVar = ProfileProFragment.this.f222890y0;
            if (aVar == null) {
                aVar = null;
            }
            return new d(aVar);
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends kotlin.jvm.internal.H implements Y41.a<com.avito.android.profile.pro.impl.screen.u> {
        @Override // Y41.a
        public final com.avito.android.profile.pro.impl.screen.u invoke() {
            ProfileProFragment profileProFragment = (ProfileProFragment) this.receiver;
            int i12 = ProfileProFragment.f222861X0;
            profileProFragment.getClass();
            return new com.avito.android.profile.pro.impl.screen.u(profileProFragment);
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile/pro/impl/screen/ProfileProFragment$i", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements a.InterfaceC4053a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a f222914b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ProfileProFragment f222915c;

        public i(d.a aVar, ProfileProFragment profileProFragment) {
            this.f222915c = profileProFragment;
            this.f222914b = aVar;
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void J(@Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, G0> lVar) {
            TabFragmentFactory.Data dataA = C19902a.a(intent);
            ProfileProFragment profileProFragment = this.f222915c;
            if (dataA == null) {
                intent.setFlags(603979776);
                C35966w1.d(profileProFragment, intent, i12);
            } else {
                intent.setFlags(603979776);
                profileProFragment.C5(i12, intent);
            }
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void R(@Y61.k Intent intent, @Y61.k Y41.l<? super Exception, G0> lVar) {
            this.f222914b.R(intent, lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void X(int i12, @Y61.k Intent intent) {
            this.f222914b.X(i12, intent);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void g1(@Y61.k Y41.l<? super Context, G0> lVar) {
            this.f222914b.g1(lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void s1() {
            this.f222914b.s1();
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "updateBundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.p<String, Bundle, G0> {
        public j() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            ProfileTabUserType profileTabUserType;
            Bundle bundle2 = bundle;
            D d12 = ProfileProFragment.this.f222885t0;
            if (d12 == null) {
                d12 = null;
            }
            ProfileProArguments.f222422d.getClass();
            int iOrdinal = ProfileProArguments.a.a(bundle2).f222424c.ordinal();
            if (iOrdinal == 0) {
                profileTabUserType = ProfileTabUserType.f222434b;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                profileTabUserType = ProfileTabUserType.f222435c;
            }
            d12.accept(new a.y(profileTabUserType));
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<G0> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D d12 = ProfileProFragment.this.f222885t0;
            if (d12 == null) {
                d12 = null;
            }
            d12.accept(a.u.f3003a);
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$onViewCreated$6", f = "ProfileProFragment.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f222918q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f222920s;

        /* compiled from: ProfileProFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$onViewCreated$6$1", f = "ProfileProFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f222921q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ProfileProFragment f222922r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ b f222923s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProfileProFragment profileProFragment, b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f222922r = profileProFragment;
                this.f222923s = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f222922r, this.f222923s, continuation);
                aVar.f222921q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f222921q;
                int i12 = ProfileProFragment.f222861X0;
                ProfileProFragment profileProFragment = this.f222922r;
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.s(profileProFragment, this.f222923s, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.j(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.k(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.l(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.q(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.o(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.p(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.r(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.m(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new C33365i(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new C33363g(profileProFragment, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(b bVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f222920s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ProfileProFragment.this.new l(this.f222920s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f222918q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                b bVar = this.f222920s;
                ProfileProFragment profileProFragment = ProfileProFragment.this;
                a aVar = new a(profileProFragment, bVar, null);
                this.f222918q = 1;
                if (C23056p0.b(profileProFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$onViewCreated$7", f = "ProfileProFragment.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f222924q;

        /* compiled from: ProfileProFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$onViewCreated$7$1", f = "ProfileProFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f222926q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ProfileProFragment f222927r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProfileProFragment profileProFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f222927r = profileProFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f222927r, continuation);
                aVar.f222926q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f222926q;
                int i12 = ProfileProFragment.f222861X0;
                ProfileProFragment profileProFragment = this.f222927r;
                C43259k.d(t12, null, null, new com.avito.android.profile.pro.impl.screen.n(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new C33364h(profileProFragment, null), 3);
                C43259k.d(t12, null, null, new C33362f(profileProFragment, null), 3);
                return G0.f406611a;
            }
        }

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ProfileProFragment.this.new m(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f222924q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46683f;
                ProfileProFragment profileProFragment = ProfileProFragment.this;
                a aVar = new a(profileProFragment, null);
                this.f222924q = 1;
                if (C23056p0.b(profileProFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<G0> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D d12 = ProfileProFragment.this.f222885t0;
            if (d12 == null) {
                d12 = null;
            }
            d12.accept(a.C0152a.f2979a);
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/A;", "invoke", "()Lcom/avito/android/profile/pro/impl/screen/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.profile.pro.impl.screen.A> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.profile.pro.impl.screen.A invoke() {
            A.a aVar = ProfileProFragment.this.f222887v0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.create();
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LD90/a;", "action", "Lkotlin/G0;", "invoke", "(LD90/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.l<D90.a, G0> {
        public p() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(D90.a aVar) {
            D90.a aVar2 = aVar;
            D d12 = ProfileProFragment.this.f222885t0;
            if (d12 == null) {
                d12 = null;
            }
            d12.accept(aVar2);
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class q extends N implements Y41.a<String> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return ProfileProFragment.this.requireContext().getString(R.string.profile_pro_share_screen_title);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f222932l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f222932l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f222932l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f222933l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Y41.a aVar) {
            super(0);
            this.f222933l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f222933l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.a<Fragment> {
        public t() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ProfileProFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ t f222935l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(t tVar) {
            super(0);
            this.f222935l = tVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f222935l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f222936l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f222936l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f222936l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f222937l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f222937l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f222937l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f222938l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Y41.a aVar) {
            super(0);
            this.f222938l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f222938l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends N implements Y41.a<Fragment> {
        public y() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ProfileProFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ y f222940l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(y yVar) {
            super(0);
            this.f222940l = yVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f222940l.invoke();
        }
    }

    static {
        new c(null);
    }

    public ProfileProFragment() {
        super(0, 1, null);
        s sVar = new s(new o());
        t tVar = new t();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new u(tVar));
        n0 n0Var = m0.f406844a;
        this.f222888w0 = new O0(n0Var.b(com.avito.android.profile.pro.impl.screen.A.class), new v(interfaceC42726CB), sVar, new w(interfaceC42726CB));
        x xVar = new x(new e());
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new z(new y()));
        this.f222878Q0 = new O0(n0Var.b(com.avito.android.avito_finance_user_profile.view.mvi.p.class), new A(interfaceC42726CB2), xVar, new r(interfaceC42726CB2));
        this.f222880S0 = new com.jakewharton.rxrelay3.c<>();
        this.f222881T0 = C42727D.b(lazyThreadSafetyMode, new h(0, this, ProfileProFragment.class, "createGeoBannerListener", "createGeoBannerListener()Lcom/avito/android/profile/pro/impl/screen/ProfileProFragment$createGeoBannerListener$1;", 0));
        this.f222882U0 = C42727D.b(lazyThreadSafetyMode, new g());
        this.f222883V0 = C42727D.b(lazyThreadSafetyMode, new q());
        this.f222884W0 = registerForActivityResult(new f(), new androidx.view.result.a() { // from class: com.avito.android.profile.pro.impl.screen.d
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                int i12 = ProfileProFragment.f222861X0;
                if (((Boolean) obj).booleanValue()) {
                    D d12 = this.f222946b.f222885t0;
                    if (d12 == null) {
                        d12 = null;
                    }
                    d12.accept(a.i.f2992a);
                }
            }
        });
    }

    public final com.avito.android.avito_finance_user_profile.view.mvi.p D5() {
        return (com.avito.android.avito_finance_user_profile.view.mvi.p) this.f222878Q0.getValue();
    }

    public final com.avito.android.profile.pro.impl.screen.A E5() {
        return (com.avito.android.profile.pro.impl.screen.A) this.f222888w0.getValue();
    }

    public final void F5(DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f222890y0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, "req_deep_link_user_profile_pro", null, 4);
    }

    public final void G5(PrintableText printableText, PrintableText printableText2, ApiError apiError, Throwable th2, Y41.a<G0> aVar, ToastBarPosition toastBarPosition) {
        List listSingletonList;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        if (printableText2 != null) {
            listSingletonList = Collections.singletonList(new c.a.C3719a(printableText2.k0(requireContext()), false, null, aVar, 6, null));
        } else {
            listSingletonList = null;
        }
        List list = listSingletonList;
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.c(cVar, this, printableText, null, list, f.c.a.a(apiError, th2), 0, toastBarPosition, 938);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new i(new d.a(this), this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, "profile-pro-update-key", new j());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_profile_pro, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            t90.b bVar = this.f222869H0;
            if (bVar == null) {
                bVar = null;
            }
            bVar.getClass();
            bVar.f439176a.c(new u90.k());
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.items);
        com.avito.konveyor.adapter.d dVar = this.f222866E0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.profile_pro_root);
        ImageView imageView = (ImageView) view.findViewById(R.id.share);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.notifications);
        Badge badge = (Badge) view.findViewById(R.id.notifications_badge);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.settings);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.loading_container);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.profile_pro_ai_assistant_container);
        AnimationView animationView = (AnimationView) viewGroup2.findViewById(R.id.profile_pro_ai_assistant_animation);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.profile_pro_ai_assistant_title);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.profile_pro_ai_assistant_subtitle);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.profile_pro_ai_assistant_button_container);
        int iB2 = y6.b(16);
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), iB2);
        b bVar2 = new b(swipeRefreshLayout, imageView, imageView2, badge, imageView3, viewGroup, new C33356a(viewGroup3, viewGroup2, animationView, textView, textView2, new com.avito.android.profile.pro.impl.screen.v(iB2, recyclerView), new n()));
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile.pro.impl.screen.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ProfileProFragment f222944c;

            {
                this.f222944c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        D d12 = this.f222944c.f222885t0;
                        if (d12 == null) {
                            d12 = null;
                        }
                        d12.accept(a.w.f3005a);
                        break;
                    case 1:
                        D d13 = this.f222944c.f222885t0;
                        if (d13 == null) {
                            d13 = null;
                        }
                        d13.accept(a.o.f2998a);
                        break;
                    default:
                        D d14 = this.f222944c.f222885t0;
                        if (d14 == null) {
                            d14 = null;
                        }
                        d14.accept(a.v.f3004a);
                        break;
                }
            }
        });
        final int i13 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile.pro.impl.screen.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ProfileProFragment f222944c;

            {
                this.f222944c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        D d12 = this.f222944c.f222885t0;
                        if (d12 == null) {
                            d12 = null;
                        }
                        d12.accept(a.w.f3005a);
                        break;
                    case 1:
                        D d13 = this.f222944c.f222885t0;
                        if (d13 == null) {
                            d13 = null;
                        }
                        d13.accept(a.o.f2998a);
                        break;
                    default:
                        D d14 = this.f222944c.f222885t0;
                        if (d14 == null) {
                            d14 = null;
                        }
                        d14.accept(a.v.f3004a);
                        break;
                }
            }
        });
        final int i14 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile.pro.impl.screen.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ProfileProFragment f222944c;

            {
                this.f222944c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        D d12 = this.f222944c.f222885t0;
                        if (d12 == null) {
                            d12 = null;
                        }
                        d12.accept(a.w.f3005a);
                        break;
                    case 1:
                        D d13 = this.f222944c.f222885t0;
                        if (d13 == null) {
                            d13 = null;
                        }
                        d13.accept(a.o.f2998a);
                        break;
                    default:
                        D d14 = this.f222944c.f222885t0;
                        if (d14 == null) {
                            d14 = null;
                        }
                        d14.accept(a.v.f3004a);
                        break;
                }
            }
        });
        bVar2.f222908h.f231600j = new k();
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: com.avito.android.profile.pro.impl.screen.c
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void j0() {
                D d12 = this.f222945b.f222885t0;
                if (d12 == null) {
                    d12 = null;
                }
                d12.accept(a.x.f3006a);
            }
        });
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new l(bVar2, null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new m(null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        ProfileTabUserType profileTabUserType;
        com.avito.android.profile.pro.impl.di.e eVar = (com.avito.android.profile.pro.impl.di.e) C29972i.a(C29972i.b(this), com.avito.android.profile.pro.impl.di.e.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        com.avito.android.service_booking_user_profile.view.j jVarA = eVar.Ya().a(new i.a(), eVar);
        com.avito.android.seller_coach.hints_dialog.provider.l lVarA = eVar.s2().a(eVar, interfaceC39417aB);
        InterfaceC44079c interfaceC44079cA = eVar.aa().a(eVar, new InterfaceC44078b.a());
        com.avito.android.analytics.screens.tracker.F fA2 = eVar.b().a(new C28478k(ProfileTabScreen.f222433d, com.avito.android.analytics.screens.s.c(this), null, 4, null));
        d.a aVarA = com.avito.android.profile.pro.impl.di.a.a();
        p pVar = new p();
        Resources resources = getResources();
        ProfileProArguments.a aVar = ProfileProArguments.f222422d;
        Bundle bundleRequireArguments = requireArguments();
        aVar.getClass();
        int iOrdinal = ProfileProArguments.a.a(bundleRequireArguments).f222424c.ordinal();
        if (iOrdinal == 0) {
            profileTabUserType = ProfileTabUserType.f222434b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            profileTabUserType = ProfileTabUserType.f222435c;
        }
        aVarA.a(eVar, interfaceC39417aB, jVarA, interfaceC44079cA, lVarA, pVar, this.f222880S0, resources, profileTabUserType, this, fA2).b(this);
    }
}
