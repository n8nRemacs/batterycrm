package com.avito.android.beduin.v2.onboarding.impl;

import Cd.C13243a;
import Gi.InterfaceC13885a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C19918B;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import cU.s;
import cU.v;
import com.avito.android.C29270c0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.BeduinV2PageScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.onboarding.impl.BeduinV2OnboardingFragment;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.beduin.v2.page.t;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.V2;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Collection;
import java.util.Set;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: BeduinV2OnboardingBaseFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/BeduinV2OnboardingBaseFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2OnboardingBaseFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f104642D0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f104643A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public N f104644B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Throwable, G0> f104645C0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.v2.onboarding.impl.h f104646o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f104647p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104648q0;

    /* renamed from: r0, reason: collision with root package name */
    public ScreenPerformanceTracker f104649r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f104650s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public C29270c0 f104651t0;

    /* renamed from: u0, reason: collision with root package name */
    public BeduinView f104652u0;

    /* renamed from: v0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f104653v0;

    /* renamed from: w0, reason: collision with root package name */
    public ZS.b f104654w0;

    /* renamed from: x0, reason: collision with root package name */
    public String f104655x0;

    /* renamed from: y0, reason: collision with root package name */
    public s f104656y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104657z0;

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/BeduinV2OnboardingBaseFragment$a;", "", "<init>", "()V", "", "EXTRA_CONTENT_HEIGHT", "Ljava/lang/String;", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            BeduinV2OnboardingBaseFragment.this.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<x, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = BeduinV2OnboardingBaseFragment.f104642D0;
            BeduinV2OnboardingBaseFragment.this.s5().accept(InterfaceC40047a.C11082a.f395204a);
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f104660l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BeduinV2OnboardingBaseFragment f104661m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment) {
            super(0);
            this.f104660l = view;
            this.f104661m = beduinV2OnboardingBaseFragment;
        }

        @Override // Y41.a
        public final G0 invoke() {
            View view = this.f104660l;
            view.setMinimumHeight(view.getHeight());
            a aVar = BeduinV2OnboardingBaseFragment.f104642D0;
            BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment = this.f104661m;
            com.avito.android.beduin.v2.onboarding.impl.f fVarS5 = beduinV2OnboardingBaseFragment.s5();
            String str = beduinV2OnboardingBaseFragment.f104655x0;
            if (str == null) {
                str = null;
            }
            ZS.b bVar = beduinV2OnboardingBaseFragment.f104654w0;
            fVarS5.accept(new InterfaceC40047a.c(str, bVar != null ? bVar : null));
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<BeduinOneTimeEvent, G0> {
        @Override // Y41.l
        public final G0 invoke(BeduinOneTimeEvent beduinOneTimeEvent) {
            BeduinOneTimeEvent beduinOneTimeEvent2 = beduinOneTimeEvent;
            BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment = (BeduinV2OnboardingBaseFragment) this.receiver;
            a aVar = BeduinV2OnboardingBaseFragment.f104642D0;
            beduinV2OnboardingBaseFragment.getClass();
            if (beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.ShowToastBar) {
                com.avito.android.lib.beduin_v2.ui_messages.b bVar = com.avito.android.lib.beduin_v2.ui_messages.b.f177570a;
                BeduinView beduinView = beduinV2OnboardingBaseFragment.f104652u0;
                BeduinView beduinView2 = beduinView != null ? beduinView : null;
                bVar.getClass();
                com.avito.android.lib.beduin_v2.ui_messages.b.a(beduinView2, (BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent2);
            } else if (!(beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.b)) {
                if (beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.a) {
                    BeduinView beduinView3 = beduinV2OnboardingBaseFragment.f104652u0;
                    (beduinView3 != null ? beduinView3 : null).c(((BeduinOneTimeEvent.a) beduinOneTimeEvent2).f176280a);
                } else if (!(beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.d) && (beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.c)) {
                    com.avito.android.beduin.v2.onboarding.impl.f fVarS5 = beduinV2OnboardingBaseFragment.s5();
                    String str = beduinV2OnboardingBaseFragment.f104655x0;
                    if (str == null) {
                        str = null;
                    }
                    ZS.b bVar2 = beduinV2OnboardingBaseFragment.f104654w0;
                    fVarS5.accept(new InterfaceC40047a.c(str, bVar2 != null ? bVar2 : null));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LeT/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LeT/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<AbstractC40048c, G0> {
        public f() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r4v7, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(AbstractC40048c abstractC40048c) {
            AbstractC40048c abstractC40048c2 = abstractC40048c;
            a aVar = BeduinV2OnboardingBaseFragment.f104642D0;
            BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment = BeduinV2OnboardingBaseFragment.this;
            if (abstractC40048c2 instanceof AbstractC40048c.d) {
                com.avito.android.progress_overlay.l lVar = beduinV2OnboardingBaseFragment.f104653v0;
                if (lVar == null) {
                    lVar = null;
                }
                lVar.k(null);
            } else if (abstractC40048c2 instanceof AbstractC40048c.a) {
                com.avito.android.progress_overlay.l lVar2 = beduinV2OnboardingBaseFragment.f104653v0;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.j();
                BeduinView beduinView = beduinV2OnboardingBaseFragment.f104652u0;
                (beduinView != null ? beduinView : null).b(((AbstractC40048c.a) abstractC40048c2).getF395211c());
                ?? r42 = beduinV2OnboardingBaseFragment.f104644B0;
                if (r42 != 0) {
                    r42.invoke();
                }
            } else if (abstractC40048c2 instanceof AbstractC40048c.b) {
                V2 v22 = V2.f318762a;
                Throwable th2 = ((AbstractC40048c.b) abstractC40048c2).f395216b;
                v22.f(th2);
                com.avito.android.progress_overlay.l lVar3 = beduinV2OnboardingBaseFragment.f104653v0;
                (lVar3 != null ? lVar3 : null).a("");
                Y41.l<? super Throwable, G0> lVar4 = beduinV2OnboardingBaseFragment.f104645C0;
                if (lVar4 != null) {
                    ((BeduinV2OnboardingFragment.f) lVar4).invoke(th2);
                }
            } else {
                boolean z12 = abstractC40048c2 instanceof AbstractC40048c.C11084c;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Boolean, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            RecyclerView recyclerViewP;
            int iA2;
            if (bool.booleanValue()) {
                a aVar = BeduinV2OnboardingBaseFragment.f104642D0;
                BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment = BeduinV2OnboardingBaseFragment.this;
                View currentFocus = beduinV2OnboardingBaseFragment.requireActivity().getCurrentFocus();
                if (currentFocus != null && (recyclerViewP = D6.p(currentFocus)) != null) {
                    RecyclerView.m layoutManager = recyclerViewP.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null && linearLayoutManager.f53690r == 1) {
                        BeduinView beduinView = beduinV2OnboardingBaseFragment.f104652u0;
                        if (beduinView == null) {
                            beduinView = null;
                        }
                        int height = beduinView.getRootView().getHeight();
                        Rect rect = new Rect();
                        BeduinView beduinView2 = beduinV2OnboardingBaseFragment.f104652u0;
                        if (beduinView2 == null) {
                            beduinView2 = null;
                        }
                        beduinView2.getWindowVisibleDisplayFrame(rect);
                        int iHeight = rect.height();
                        int i12 = height - iHeight;
                        int iMax = Math.max(0, iHeight - currentFocus.getHeight());
                        C29270c0 c29270c0 = beduinV2OnboardingBaseFragment.f104651t0;
                        C29270c0 c29270c02 = c29270c0 != null ? c29270c0 : null;
                        c29270c02.getClass();
                        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[16];
                        if (((Boolean) c29270c02.f113280r.a().invoke()).booleanValue()) {
                            iA2 = (t.a(currentFocus) - t.a(recyclerViewP)) - currentFocus.getHeight();
                            if (iA2 < 0) {
                                iA2 = 0;
                            }
                        } else {
                            iA2 = Integer.MAX_VALUE;
                        }
                        recyclerViewP.C0(0, Math.min(iMax, Math.min(i12, iA2)));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Set<FV0.h>> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = BeduinV2OnboardingBaseFragment.f104642D0;
            return BeduinV2OnboardingBaseFragment.this.s5().f104727J;
        }
    }

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<Boolean> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Bundle arguments = BeduinV2OnboardingBaseFragment.this.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("scrollOnKeyboardShown", false) : false);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f104666l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f104666l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f104666l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BeduinV2OnboardingBaseFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f104668l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f104668l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104668l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104669l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104669l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104669l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104670l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104670l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104670l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BeduinV2OnboardingBaseFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/beduin/v2/onboarding/impl/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.beduin.v2.onboarding.impl.f> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.beduin.v2.onboarding.impl.f invoke() {
            com.avito.android.beduin.v2.onboarding.impl.h hVar = BeduinV2OnboardingBaseFragment.this.f104646o0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.beduin.v2.onboarding.impl.f) hVar.get();
        }
    }

    public BeduinV2OnboardingBaseFragment() {
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f104647p0 = new O0(m0.f406844a.b(com.avito.android.beduin.v2.onboarding.impl.f.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f104648q0 = C42727D.c(new i());
        this.f104657z0 = C42727D.c(new h());
        this.f104643A0 = new b();
    }

    @Override // FV0.d
    public final void close() {
        ((b) this.f104643A0).invoke();
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C19918B.a(requireActivity().getF21241d(), this, new c(), 2);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f104649r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_beduin_v2_onboarding, viewGroup, false);
        Bundle arguments = getArguments();
        int i12 = arguments != null ? arguments.getInt("extra_content_height", -1) : -1;
        if (i12 != -1) {
            viewInflate.setMinimumHeight(i12);
        }
        BeduinView beduinView = (BeduinView) viewInflate.findViewById(R.id.beduin);
        s sVar = this.f104656y0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        s sVar2 = this.f104656y0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar2.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f104652u0 = beduinView;
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.content_container);
        InterfaceC28373a interfaceC28373a = this.f104650s0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup2, R.id.beduin, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 24, null);
        lVar.f231600j = new d(viewInflate, this);
        this.f104653v0 = lVar;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f104649r0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, s5(), new e(1, this, BeduinV2OnboardingBaseFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;)V", 0), new f());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f104649r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        if (((Boolean) this.f104648q0.getValue()).booleanValue()) {
            K2.b(view, new g());
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("pagePath") : null;
        if (string == null) {
            string = "";
        }
        this.f104655x0 = string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("screenName") : null;
        BeduinV2PageScreen beduinV2PageScreen = new BeduinV2PageScreen(string2 != null ? string2 : "");
        C28478k c28478k = new C28478k(beduinV2PageScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        this.f104654w0 = new ZS.b(beduinV2PageScreen, Owners.f210493h0, (String) null, 4, (C42822w) null);
        this.f104649r0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(c28478k);
        InterfaceC13885a.InterfaceC0365a interfaceC0365aWc = ((InterfaceC13885a.b) C29972i.a(C29972i.b(this), InterfaceC13885a.b.class)).wc();
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f104649r0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker == null ? null : screenPerformanceTracker;
        ZS.b bVar = this.f104654w0;
        C31138n0 c31138n0 = new C31138n0(K.a(aVarEd, screenPerformanceTracker2, bVar == null ? null : bVar, cv.c.d(this), null, null, null, 56));
        String str = this.f104655x0;
        if (str == null) {
            str = null;
        }
        interfaceC0365aWc.a(c31138n0, str).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f104649r0;
        this.f104656y0 = aVarFd.a(contextRequireContext, screenPerformanceTracker3 == null ? null : screenPerformanceTracker3, s5().f104728K, v.f57891a, s5().f104726E);
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f104649r0;
        (screenPerformanceTracker4 != null ? screenPerformanceTracker4 : null).a(fA2.b());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final s q5() {
        s sVar = this.f104656y0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f104657z0.getValue();
    }

    public final com.avito.android.beduin.v2.onboarding.impl.f s5() {
        return (com.avito.android.beduin.v2.onboarding.impl.f) this.f104647p0.getValue();
    }
}
