package com.avito.android.referral_program;

import Cd.C13243a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C22823h0;
import androidx.core.view.F0;
import androidx.fragment.app.ActivityC22955m;
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
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.beduin.v2.page.t;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.ownership.Owners;
import com.avito.android.referral_program.di.e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.A5;
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

/* compiled from: ReferralPageStatusBarFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/referral_program/ReferralPageStatusBarFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReferralPageStatusBarFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f252606C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f252607A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f252608B0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.referral_program.k f252609o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f252610p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f252611q0;

    /* renamed from: r0, reason: collision with root package name */
    public ScreenPerformanceTracker f252612r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f252613s0;

    /* renamed from: t0, reason: collision with root package name */
    public ZS.b f252614t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.referral_program.l f252615u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public C29270c0 f252616v0;

    /* renamed from: w0, reason: collision with root package name */
    public BeduinView f252617w0;

    /* renamed from: x0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f252618x0;

    /* renamed from: y0, reason: collision with root package name */
    public String f252619y0;

    /* renamed from: z0, reason: collision with root package name */
    public s f252620z0;

    /* compiled from: ReferralPageStatusBarFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/referral_program/ReferralPageStatusBarFragment$a;", "", "<init>", "()V", "", "EXTRA_CONTENT_HEIGHT", "Ljava/lang/String;", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReferralPageStatusBarFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ReferralPageStatusBarFragment.this.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralPageStatusBarFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<x, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = ReferralPageStatusBarFragment.f252606C0;
            ReferralPageStatusBarFragment.this.s5().accept(InterfaceC40047a.C11082a.f395204a);
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralPageStatusBarFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f252623l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ReferralPageStatusBarFragment f252624m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, ReferralPageStatusBarFragment referralPageStatusBarFragment) {
            super(0);
            this.f252623l = view;
            this.f252624m = referralPageStatusBarFragment;
        }

        @Override // Y41.a
        public final G0 invoke() {
            View view = this.f252623l;
            view.setMinimumHeight(view.getHeight());
            a aVar = ReferralPageStatusBarFragment.f252606C0;
            ReferralPageStatusBarFragment referralPageStatusBarFragment = this.f252624m;
            com.avito.android.referral_program.i iVarS5 = referralPageStatusBarFragment.s5();
            String str = referralPageStatusBarFragment.f252619y0;
            if (str == null) {
                str = null;
            }
            ZS.b bVar = referralPageStatusBarFragment.f252614t0;
            iVarS5.accept(new InterfaceC40047a.c(str, bVar != null ? bVar : null));
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralPageStatusBarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<BeduinOneTimeEvent, G0> {
        @Override // Y41.l
        public final G0 invoke(BeduinOneTimeEvent beduinOneTimeEvent) {
            BeduinOneTimeEvent beduinOneTimeEvent2 = beduinOneTimeEvent;
            ReferralPageStatusBarFragment referralPageStatusBarFragment = (ReferralPageStatusBarFragment) this.receiver;
            a aVar = ReferralPageStatusBarFragment.f252606C0;
            referralPageStatusBarFragment.getClass();
            if (beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.ShowToastBar) {
                com.avito.android.lib.beduin_v2.ui_messages.b bVar = com.avito.android.lib.beduin_v2.ui_messages.b.f177570a;
                BeduinView beduinView = referralPageStatusBarFragment.f252617w0;
                BeduinView beduinView2 = beduinView != null ? beduinView : null;
                bVar.getClass();
                com.avito.android.lib.beduin_v2.ui_messages.b.a(beduinView2, (BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent2);
            } else if (!(beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.b)) {
                if (beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.a) {
                    BeduinView beduinView3 = referralPageStatusBarFragment.f252617w0;
                    (beduinView3 != null ? beduinView3 : null).c(((BeduinOneTimeEvent.a) beduinOneTimeEvent2).f176280a);
                } else if (!(beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.d) && (beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.c)) {
                    com.avito.android.referral_program.i iVarS5 = referralPageStatusBarFragment.s5();
                    String str = referralPageStatusBarFragment.f252619y0;
                    if (str == null) {
                        str = null;
                    }
                    ZS.b bVar2 = referralPageStatusBarFragment.f252614t0;
                    iVarS5.accept(new InterfaceC40047a.c(str, bVar2 != null ? bVar2 : null));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralPageStatusBarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LeT/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LeT/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<AbstractC40048c, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AbstractC40048c abstractC40048c) {
            AbstractC40048c abstractC40048c2 = abstractC40048c;
            a aVar = ReferralPageStatusBarFragment.f252606C0;
            ReferralPageStatusBarFragment referralPageStatusBarFragment = ReferralPageStatusBarFragment.this;
            if (abstractC40048c2 instanceof AbstractC40048c.d) {
                com.avito.android.progress_overlay.l lVar = referralPageStatusBarFragment.f252618x0;
                if (lVar == null) {
                    lVar = null;
                }
                lVar.k(null);
            } else if (abstractC40048c2 instanceof AbstractC40048c.a) {
                com.avito.android.progress_overlay.l lVar2 = referralPageStatusBarFragment.f252618x0;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.j();
                BeduinView beduinView = referralPageStatusBarFragment.f252617w0;
                (beduinView != null ? beduinView : null).b(((AbstractC40048c.a) abstractC40048c2).getF395211c());
            } else if (abstractC40048c2 instanceof AbstractC40048c.b) {
                V2.f318762a.f(((AbstractC40048c.b) abstractC40048c2).f395216b);
                com.avito.android.progress_overlay.l lVar3 = referralPageStatusBarFragment.f252618x0;
                (lVar3 != null ? lVar3 : null).a("");
            } else {
                boolean z12 = abstractC40048c2 instanceof AbstractC40048c.C11084c;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralPageStatusBarFragment.kt */
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
                a aVar = ReferralPageStatusBarFragment.f252606C0;
                ReferralPageStatusBarFragment referralPageStatusBarFragment = ReferralPageStatusBarFragment.this;
                View currentFocus = referralPageStatusBarFragment.requireActivity().getCurrentFocus();
                if (currentFocus != null && (recyclerViewP = D6.p(currentFocus)) != null) {
                    RecyclerView.m layoutManager = recyclerViewP.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null && linearLayoutManager.f53690r == 1) {
                        BeduinView beduinView = referralPageStatusBarFragment.f252617w0;
                        if (beduinView == null) {
                            beduinView = null;
                        }
                        int height = beduinView.getRootView().getHeight();
                        Rect rect = new Rect();
                        BeduinView beduinView2 = referralPageStatusBarFragment.f252617w0;
                        if (beduinView2 == null) {
                            beduinView2 = null;
                        }
                        beduinView2.getWindowVisibleDisplayFrame(rect);
                        int iHeight = rect.height();
                        int i12 = height - iHeight;
                        int iMax = Math.max(0, iHeight - currentFocus.getHeight());
                        C29270c0 c29270c0 = referralPageStatusBarFragment.f252616v0;
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

    /* compiled from: ReferralPageStatusBarFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Set<FV0.h>> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = ReferralPageStatusBarFragment.f252606C0;
            return ReferralPageStatusBarFragment.this.s5().f252673J;
        }
    }

    /* compiled from: ReferralPageStatusBarFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<Boolean> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Bundle arguments = ReferralPageStatusBarFragment.this.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("scrollOnKeyboardShown", false) : false);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f252629l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f252629l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f252629l);
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
            return ReferralPageStatusBarFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f252631l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f252631l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f252631l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f252632l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f252632l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f252632l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f252633l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f252633l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f252633l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ReferralPageStatusBarFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/referral_program/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/referral_program/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.referral_program.i> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.referral_program.i invoke() {
            com.avito.android.referral_program.k kVar = ReferralPageStatusBarFragment.this.f252609o0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.referral_program.i) kVar.get();
        }
    }

    public ReferralPageStatusBarFragment() {
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f252610p0 = new O0(m0.f406844a.b(com.avito.android.referral_program.i.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f252611q0 = C42727D.c(new i());
        this.f252607A0 = C42727D.c(new h());
        this.f252608B0 = new b();
    }

    @Override // FV0.d
    public final void close() {
        ((b) this.f252608B0).invoke();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C19918B.a(requireActivity().getF21241d(), this, new c(), 2);
        com.avito.android.referral_program.l lVar = this.f252615u0;
        if (lVar == null) {
            lVar = null;
        }
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        lVar.getClass();
        Window window = activityC22955mRequireActivity.getWindow();
        F0.a(window, false);
        window.setStatusBarColor(0);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f252612r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_referral_page, viewGroup, false);
        Bundle arguments = getArguments();
        int i12 = arguments != null ? arguments.getInt("extra_content_height", -1) : -1;
        if (i12 != -1) {
            viewInflate.setMinimumHeight(i12);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.status_bar_background);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        A5 a52 = A5.f318519a;
        Resources resources = requireContext().getResources();
        a52.getClass();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        layoutParams.height = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        viewFindViewById.setLayoutParams(layoutParams);
        BeduinView beduinView = (BeduinView) viewInflate.findViewById(R.id.beduin);
        s sVar = this.f252620z0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        s sVar2 = this.f252620z0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar2.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f252617w0 = beduinView;
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.content_container);
        InterfaceC28373a interfaceC28373a = this.f252613s0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup2, R.id.beduin, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 24, null);
        lVar.f231600j = new d(viewInflate, this);
        this.f252618x0 = lVar;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f252612r0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, s5(), new e(1, this, ReferralPageStatusBarFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;)V", 0), new f());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f252612r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        if (((Boolean) this.f252611q0.getValue()).booleanValue()) {
            K2.b(view, new g());
        }
        com.avito.android.referral_program.l lVar = this.f252615u0;
        if (lVar == null) {
            lVar = null;
        }
        lVar.getClass();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setBackground(null);
        }
        C22823h0.K(view, new com.avito.android.offlinization.ui.a(view, 12));
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
        this.f252619y0 = string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("screenName") : null;
        BeduinV2PageScreen beduinV2PageScreen = new BeduinV2PageScreen(string2 != null ? string2 : "");
        this.f252612r0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(beduinV2PageScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null));
        this.f252614t0 = new ZS.b(beduinV2PageScreen, Owners.f210493h0, (String) null, 4, (C42822w) null);
        e.a aVarOg = ((e.b) C29972i.a(C29972i.b(this), e.b.class)).og();
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f252612r0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker == null ? null : screenPerformanceTracker;
        ZS.b bVar = this.f252614t0;
        C31138n0 c31138n0 = new C31138n0(K.a(aVarEd, screenPerformanceTracker2, bVar == null ? null : bVar, cv.c.d(this), null, null, null, 56));
        String str = this.f252619y0;
        if (str == null) {
            str = null;
        }
        aVarOg.a(c31138n0, str).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f252612r0;
        this.f252620z0 = aVarFd.a(contextRequireContext, screenPerformanceTracker3 == null ? null : screenPerformanceTracker3, s5().f252674K, v.f57891a, s5().f252672E);
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f252612r0;
        if (screenPerformanceTracker4 == null) {
            screenPerformanceTracker4 = null;
        }
        screenPerformanceTracker4.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker5 = this.f252612r0;
        (screenPerformanceTracker5 != null ? screenPerformanceTracker5 : null).c(this, g5());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final s q5() {
        s sVar = this.f252620z0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f252607A0.getValue();
    }

    public final com.avito.android.referral_program.i s5() {
        return (com.avito.android.referral_program.i) this.f252610p0.getValue();
    }
}
