package com.avito.android.beduin.v2.page.impl;

import Cd.C13243a;
import Ii.f;
import Ki.C14316a;
import Li.InterfaceC14399a;
import Li.b;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C19918B;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU.s;
import com.avito.android.C29270c0;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.BeduinV2PageScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.beduin.v2.page.impl.BeduinV2BottomSheetFragment;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.V2;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: BeduinV2PageFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2PageFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/K;", "LLi/a;", "Lcom/avito/android/beduin/v2/page/impl/e;", "<init>", "()V", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2PageFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b, K<InterfaceC14399a>, InterfaceC28868e {

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public static final a f104859L0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public String f104860A0;

    /* renamed from: B0, reason: collision with root package name */
    public String f104861B0;

    /* renamed from: C0, reason: collision with root package name */
    public ZS.b f104862C0;

    /* renamed from: D0, reason: collision with root package name */
    public cU.s f104863D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104864E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104865F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104866G0;

    /* renamed from: H0, reason: collision with root package name */
    public Li.b f104867H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f104868I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f104869J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Throwable, G0> f104870K0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public A f104871o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f104872p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104873q0;

    /* renamed from: r0, reason: collision with root package name */
    public ScreenPerformanceTracker f104874r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f104875s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.C f104876t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public C29270c0 f104877u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.beduin.v2.interaction.navigation.flow.p f104878v0;

    /* renamed from: w0, reason: collision with root package name */
    public ViewGroup f104879w0;

    /* renamed from: x0, reason: collision with root package name */
    public View f104880x0;

    /* renamed from: y0, reason: collision with root package name */
    public C42670a f104881y0;

    /* renamed from: z0, reason: collision with root package name */
    public String f104882z0;

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2PageFragment$a;", "", "<init>", "()V", "", "EXTRA_CONTENT_HEIGHT", "Ljava/lang/String;", "EXTRA_HORIZONTAL_PADDING", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            BeduinV2PageFragment beduinV2PageFragment = BeduinV2PageFragment.this;
            androidx.core.content.j jVarRequireActivity = beduinV2PageFragment.requireActivity();
            G0 g02 = null;
            com.avito.android.beduin.v2.page.i iVar = jVarRequireActivity instanceof com.avito.android.beduin.v2.page.i ? (com.avito.android.beduin.v2.page.i) jVarRequireActivity : null;
            if (iVar != null) {
                iVar.w1();
                g02 = G0.f406611a;
            } else {
                InterfaceC23487e parentFragment = beduinV2PageFragment.getParentFragment();
                com.avito.android.beduin.v2.page.i iVar2 = parentFragment instanceof com.avito.android.beduin.v2.page.i ? (com.avito.android.beduin.v2.page.i) parentFragment : null;
                if (iVar2 != null) {
                    iVar2.w1();
                    g02 = G0.f406611a;
                }
            }
            if (g02 == null) {
                beduinV2PageFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LKi/a;", "invoke", "()LKi/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<C14316a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C14316a invoke() {
            BeduinV2PageFragment beduinV2PageFragment = BeduinV2PageFragment.this;
            FragmentManager childFragmentManager = beduinV2PageFragment.getChildFragmentManager();
            com.avito.beduin.v2.interaction.navigation.flow.p pVar = beduinV2PageFragment.f104878v0;
            if (pVar == null) {
                pVar = null;
            }
            return new C14316a(R.id.content_view, childFragmentManager, pVar);
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFV0/f;", "invoke", "()LFV0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<FV0.f> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final FV0.f invoke() {
            BeduinV2PageFragment beduinV2PageFragment = BeduinV2PageFragment.this;
            C29270c0 c29270c0 = beduinV2PageFragment.f104877u0;
            if (c29270c0 == null) {
                c29270c0 = null;
            }
            return c29270c0.v().invoke().booleanValue() ? (C14316a) beduinV2PageFragment.f104865F0.getValue() : FV0.g.f4722a;
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<androidx.view.x, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(androidx.view.x xVar) {
            BeduinV2PageFragment.this.i0();
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<View> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            View view = BeduinV2PageFragment.this.f104880x0;
            if (view == null) {
                return null;
            }
            return view;
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinView f104888l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BeduinView beduinView) {
            super(0);
            this.f104888l = beduinView;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f104888l;
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends kotlin.jvm.internal.H implements Y41.l<BeduinOneTimeEvent, G0> {
        /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent r21) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.v2.page.impl.BeduinV2PageFragment.h.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LeT/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LeT/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<AbstractC40048c, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AbstractC40048c abstractC40048c) {
            AbstractC40048c abstractC40048c2 = abstractC40048c;
            a aVar = BeduinV2PageFragment.f104859L0;
            BeduinV2PageFragment beduinV2PageFragment = BeduinV2PageFragment.this;
            if (abstractC40048c2 instanceof AbstractC40048c.d) {
                C42670a c42670a = beduinV2PageFragment.f104881y0;
                C42670a.d(c42670a != null ? c42670a : null);
            } else if (abstractC40048c2 instanceof AbstractC40048c.a) {
                C42670a c42670a2 = beduinV2PageFragment.f104881y0;
                if (c42670a2 == null) {
                    c42670a2 = null;
                }
                c42670a2.b();
                View view = beduinV2PageFragment.f104880x0;
                if (view == null) {
                    view = null;
                }
                BeduinView beduinView = view instanceof BeduinView ? (BeduinView) view : null;
                if (beduinView != null) {
                    beduinView.b(((AbstractC40048c.a) abstractC40048c2).getF395211c());
                }
                Y41.a<G0> aVar2 = beduinV2PageFragment.f104869J0;
                if (aVar2 != null) {
                    ((BeduinV2BottomSheetFragment.g) aVar2).invoke();
                }
            } else if (abstractC40048c2 instanceof AbstractC40048c.b) {
                V2 v22 = V2.f318762a;
                Throwable th2 = ((AbstractC40048c.b) abstractC40048c2).f395216b;
                v22.f(th2);
                C42670a c42670a3 = beduinV2PageFragment.f104881y0;
                if (c42670a3 == null) {
                    c42670a3 = null;
                }
                c42670a3.c(null, new com.avito.android.beduin.v2.page.impl.q(new com.avito.android.beduin.v2.page.impl.o(beduinV2PageFragment)));
                Y41.l<? super Throwable, G0> lVar = beduinV2PageFragment.f104870K0;
                if (lVar != null) {
                    ((BeduinV2BottomSheetFragment.h) lVar).invoke(th2);
                }
            } else if (abstractC40048c2 instanceof AbstractC40048c.C11084c) {
                C29270c0 c29270c0 = beduinV2PageFragment.f104877u0;
                if ((c29270c0 != null ? c29270c0 : null).v().invoke().booleanValue()) {
                    C14316a.c((C14316a) beduinV2PageFragment.f104865F0.getValue());
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<Boolean, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            RecyclerView recyclerViewP;
            int iA2;
            if (bool.booleanValue()) {
                a aVar = BeduinV2PageFragment.f104859L0;
                BeduinV2PageFragment beduinV2PageFragment = BeduinV2PageFragment.this;
                View currentFocus = beduinV2PageFragment.requireActivity().getCurrentFocus();
                if (currentFocus != null && (recyclerViewP = D6.p(currentFocus)) != null) {
                    RecyclerView.m layoutManager = recyclerViewP.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null && linearLayoutManager.f53690r == 1) {
                        View view = beduinV2PageFragment.f104880x0;
                        if (view == null) {
                            view = null;
                        }
                        int height = view.getRootView().getHeight();
                        Rect rect = new Rect();
                        View view2 = beduinV2PageFragment.f104880x0;
                        if (view2 == null) {
                            view2 = null;
                        }
                        view2.getWindowVisibleDisplayFrame(rect);
                        int iHeight = rect.height();
                        int i12 = height - iHeight;
                        int iMax = Math.max(0, iHeight - currentFocus.getHeight());
                        C29270c0 c29270c0 = beduinV2PageFragment.f104877u0;
                        C29270c0 c29270c02 = c29270c0 != null ? c29270c0 : null;
                        c29270c02.getClass();
                        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[16];
                        if (((Boolean) c29270c02.f113280r.a().invoke()).booleanValue()) {
                            iA2 = (com.avito.android.beduin.v2.page.t.a(currentFocus) - com.avito.android.beduin.v2.page.t.a(recyclerViewP)) - currentFocus.getHeight();
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

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Set<FV0.h>> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = BeduinV2PageFragment.f104859L0;
            return BeduinV2PageFragment.this.s5().f105153J;
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class l extends N implements Y41.a<Boolean> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Bundle arguments = BeduinV2PageFragment.this.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("scrollOnKeyboardShown", false) : false);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f104893l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Y41.a aVar) {
            super(0);
            this.f104893l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f104893l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<Fragment> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BeduinV2PageFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f104895l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.f104895l = nVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104895l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104896l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104896l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104896l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104897l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104897l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104897l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BeduinV2PageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/y;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/beduin/v2/page/impl/y;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<y> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final y invoke() {
            A a12 = BeduinV2PageFragment.this.f104871o0;
            if (a12 == null) {
                a12 = null;
            }
            return (y) a12.get();
        }
    }

    public BeduinV2PageFragment() {
        m mVar = new m(new r());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new o(new n()));
        this.f104872p0 = new O0(m0.f406844a.b(y.class), new p(interfaceC42726CB), mVar, new q(interfaceC42726CB));
        this.f104873q0 = C42727D.c(new l());
        this.f104864E0 = C42727D.c(new k());
        this.f104865F0 = C42727D.c(new c());
        this.f104866G0 = C42727D.c(new d());
        this.f104868I0 = new b();
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, FV0.a
    @Y61.k
    public final FV0.f A1() {
        return (FV0.f) this.f104866G0.getValue();
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, com.avito.beduin.v2.interaction.flow.keyboard.f
    public final void L4(boolean z12) {
        Dialog dialog;
        Window window;
        View decorView;
        View viewFindFocus;
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof BeduinV2BottomSheetFragment)) {
            parentFragment = null;
        }
        BeduinV2BottomSheetFragment beduinV2BottomSheetFragment = (BeduinV2BottomSheetFragment) parentFragment;
        if (beduinV2BottomSheetFragment != null && (dialog = beduinV2BottomSheetFragment.getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.d.getSystemService(dialog.getContext(), InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
            }
            if (z12 && (viewFindFocus = decorView.findFocus()) != null) {
                viewFindFocus.clearFocus();
            }
        }
        super.L4(z12);
    }

    @Override // FV0.d
    public final void close() {
        ((b) this.f104868I0).invoke();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.beduin.v2.page.impl.InterfaceC28868e
    public final void i0() {
        s5().accept(InterfaceC40047a.C11082a.f395204a);
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("pagePath") : null;
        if (string == null) {
            string = "";
        }
        this.f104882z0 = string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("scenarioParentId") : null;
        if (string2 == null) {
            string2 = "";
        }
        this.f104860A0 = string2;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("scenarioId") : null;
        if (string3 == null) {
            string3 = "";
        }
        this.f104861B0 = string3;
        Bundle arguments4 = getArguments();
        String string4 = arguments4 != null ? arguments4.getString("screenName") : null;
        BeduinV2PageScreen beduinV2PageScreen = new BeduinV2PageScreen(string4 != null ? string4 : "");
        C28478k c28478k = new C28478k(beduinV2PageScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        String str = this.f104860A0;
        String str2 = str == null ? null : str;
        String str3 = this.f104861B0;
        this.f104862C0 = new ZS.b(beduinV2PageScreen, str2, str3 == null ? null : str3, Collections.singletonList(Owners.f210556y), (String) null, 16, (C42822w) null);
        this.f104874r0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(c28478k);
        f.a aVarKa = ((f.b) C29972i.a(C29972i.b(this), f.b.class)).ka();
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f104874r0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker == null ? null : screenPerformanceTracker;
        ZS.b bVar = this.f104862C0;
        C31138n0 c31138n0 = new C31138n0(com.avito.android.lib.beduin_v2.feature.di.K.a(aVarEd, screenPerformanceTracker2, bVar == null ? null : bVar, cv.c.d(this), null, null, new ZS.c(true), 24));
        String str4 = this.f104882z0;
        if (str4 == null) {
            str4 = null;
        }
        aVarKa.a(c31138n0, str4).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f104874r0;
        this.f104863D0 = aVarFd.a(contextRequireContext, screenPerformanceTracker3 == null ? null : screenPerformanceTracker3, s5().f105154K, cU.v.f57891a, s5().f105152E);
        b.a aVarKj = ((b.InterfaceC0627b) C29972i.a(C29972i.b(this), b.InterfaceC0627b.class)).Kj();
        cU.s sVar = this.f104863D0;
        if (sVar == null) {
            sVar = null;
        }
        this.f104867H0 = aVarKj.a(sVar, new Ki.d(new com.avito.android.beduin.v2.page.impl.n(this)));
        com.avito.android.util.C c12 = this.f104876t0;
        if (c12 == null) {
            c12 = null;
        }
        c12.getF125491k().getClass();
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f104874r0;
        if (screenPerformanceTracker4 == null) {
            screenPerformanceTracker4 = null;
        }
        screenPerformanceTracker4.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker5 = this.f104874r0;
        (screenPerformanceTracker5 != null ? screenPerformanceTracker5 : null).c(this, g5());
        C19918B.a(requireActivity().getF21241d(), this, new e(), 2);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f104874r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C29270c0 c29270c0 = this.f104877u0;
        if (c29270c0 == null) {
            c29270c0 = null;
        }
        View viewInflate = c29270c0.v().invoke().booleanValue() ? layoutInflater.inflate(R.layout.fragment_beduin_v2_page_new_navigation, viewGroup, false) : layoutInflater.inflate(R.layout.fragment_beduin_v2_page, viewGroup, false);
        Bundle arguments = getArguments();
        int i12 = arguments != null ? arguments.getInt("extra_content_height", -1) : -1;
        if (i12 != -1) {
            viewInflate.setMinimumHeight(i12);
        }
        Bundle arguments2 = getArguments();
        int i13 = arguments2 != null ? arguments2.getInt("extra_with_horizontal_paddings", -1) : -1;
        if (i13 != -1) {
            viewInflate.setPadding(i13, 0, i13, 0);
        }
        this.f104879w0 = (ViewGroup) viewInflate.findViewById(R.id.content_container);
        C29270c0 c29270c02 = this.f104877u0;
        if (c29270c02 == null) {
            c29270c02 = null;
        }
        if (c29270c02.v().invoke().booleanValue()) {
            this.f104880x0 = viewInflate.findViewById(R.id.content_view);
            ViewGroup viewGroup2 = this.f104879w0;
            this.f104881y0 = new C42670a(viewGroup2 == null ? null : viewGroup2, new f(), 0, 4, null);
        } else {
            View viewFindViewById = viewInflate.findViewById(R.id.beduin);
            BeduinView beduinView = (BeduinView) viewFindViewById;
            cU.s sVar = this.f104863D0;
            if (sVar == null) {
                sVar = null;
            }
            com.avito.beduin.v2.render.android_view.A aB2 = sVar.b();
            cU.s sVar2 = this.f104863D0;
            if (sVar2 == null) {
                sVar2 = null;
            }
            com.avito.beduin.v2.theme.k kVarA = sVar2.a();
            beduinView.f337913c = aB2;
            beduinView.f337914d = kVarA;
            ViewGroup viewGroup3 = this.f104879w0;
            this.f104881y0 = new C42670a(viewGroup3 == null ? null : viewGroup3, new g(beduinView), 0, 4, null);
            this.f104880x0 = viewFindViewById;
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f104874r0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, s5(), new h(1, this, BeduinV2PageFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;)V", 0), new i());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f104874r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        if (((Boolean) this.f104873q0.getValue()).booleanValue()) {
            K2.b(view, new j());
        }
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final cU.s q5() {
        cU.s sVar = this.f104863D0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        Li.b bVar = this.f104867H0;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f104864E0.getValue();
    }

    public final y s5() {
        return (y) this.f104872p0.getValue();
    }
}
