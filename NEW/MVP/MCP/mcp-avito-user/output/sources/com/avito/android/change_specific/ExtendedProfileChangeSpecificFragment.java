package com.avito.android.change_specific;

import Cd.C13243a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.change_specific.adapter.u;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import lo.C43810c;
import lo.InterfaceC43808a;
import lo.InterfaceC43809b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ExtendedProfileChangeSpecificFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/change_specific/ExtendedProfileChangeSpecificFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExtendedProfileChangeSpecificFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f117869y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f117870z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f117871n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f117872o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f117873p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f117874q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public u f117875r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f117876s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f117877t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f117878u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f117879v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f117880w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f117881x0;

    /* compiled from: ExtendedProfileChangeSpecificFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/change_specific/ExtendedProfileChangeSpecificFragment$a;", "", "<init>", "()V", "", "EXTRA_ARGS", "Ljava/lang/String;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/change_specific/ExtendedProfileChangeSpecificArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ExtendedProfileChangeSpecificArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ExtendedProfileChangeSpecificArguments invoke() {
            Bundle bundleRequireArguments = ExtendedProfileChangeSpecificFragment.this.requireArguments();
            return (ExtendedProfileChangeSpecificArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("change_specific_fragment.args", ExtendedProfileChangeSpecificArguments.class) : bundleRequireArguments.getParcelable("change_specific_fragment.args"));
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC43809b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC43809b interfaceC43809b) {
            InterfaceC43809b interfaceC43809b2 = interfaceC43809b;
            ExtendedProfileChangeSpecificFragment extendedProfileChangeSpecificFragment = (ExtendedProfileChangeSpecificFragment) this.receiver;
            a aVar = ExtendedProfileChangeSpecificFragment.f117869y0;
            extendedProfileChangeSpecificFragment.getClass();
            if (interfaceC43809b2 instanceof InterfaceC43809b.C11803b) {
                com.avito.android.extended_profile_ui_components.p pVar = com.avito.android.extended_profile_ui_components.p.f153373a;
                C47313c c47313c = extendedProfileChangeSpecificFragment.f117876s0;
                kotlin.reflect.n<Object> nVar = ExtendedProfileChangeSpecificFragment.f117870z0[0];
                RecyclerView recyclerView = (RecyclerView) c47313c.a();
                InterfaceC43809b.C11803b c11803b = (InterfaceC43809b.C11803b) interfaceC43809b2;
                ScreenPerformanceTracker screenPerformanceTracker = extendedProfileChangeSpecificFragment.f117880w0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                com.avito.android.extended_profile_ui_components.p.c(pVar, recyclerView, c11803b.f414204a, screenPerformanceTracker, null);
            } else if (interfaceC43809b2 instanceof InterfaceC43809b.a) {
                ActivityC22955m activityC22955mRequireActivity = extendedProfileChangeSpecificFragment.requireActivity();
                Intent intent = activityC22955mRequireActivity.getIntent();
                InterfaceC43809b.a aVar2 = (InterfaceC43809b.a) interfaceC43809b2;
                if (aVar2.f414202a) {
                    activityC22955mRequireActivity.setResult(-1, intent);
                }
                intent.putExtra("change_specific_activity.result", aVar2.f414203b);
                activityC22955mRequireActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llo/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Llo/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C43810c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43810c c43810c) {
            C43810c c43810c2 = c43810c;
            ExtendedProfileChangeSpecificFragment extendedProfileChangeSpecificFragment = ExtendedProfileChangeSpecificFragment.this;
            com.avito.konveyor.adapter.a aVar = extendedProfileChangeSpecificFragment.f117874q0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(c43810c2.f414208c));
            Button buttonQ5 = extendedProfileChangeSpecificFragment.q5();
            boolean z12 = c43810c2.f414213h;
            buttonQ5.setLoading(z12);
            extendedProfileChangeSpecificFragment.q5().setClickable(!z12);
            boolean z13 = c43810c2.f414211f;
            C47313c c47313c = extendedProfileChangeSpecificFragment.f117879v0;
            if (z13) {
                kotlin.reflect.n<Object> nVar = ExtendedProfileChangeSpecificFragment.f117870z0[3];
                ((com.avito.android.extended_profile_ui_components.l) c47313c.a()).d();
            } else {
                Throwable th2 = c43810c2.f414212g;
                if (th2 != null) {
                    kotlin.reflect.n<Object> nVar2 = ExtendedProfileChangeSpecificFragment.f117870z0[3];
                    com.avito.android.extended_profile_ui_components.l lVar = (com.avito.android.extended_profile_ui_components.l) c47313c.a();
                    ScreenPerformanceTracker screenPerformanceTracker = extendedProfileChangeSpecificFragment.f117880w0;
                    lVar.c(th2, screenPerformanceTracker != null ? screenPerformanceTracker : null);
                } else {
                    kotlin.reflect.n<Object> nVar3 = ExtendedProfileChangeSpecificFragment.f117870z0[3];
                    ((com.avito.android.extended_profile_ui_components.l) c47313c.a()).a();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llo/a;", "it", "Lkotlin/G0;", "invoke", "(Llo/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC43808a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC43808a interfaceC43808a) {
            a aVar = ExtendedProfileChangeSpecificFragment.f117869y0;
            ExtendedProfileChangeSpecificFragment.this.r5().accept(interfaceC43808a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f117885l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f117885l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f117885l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ExtendedProfileChangeSpecificFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f117887l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f117887l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f117887l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f117888l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f117888l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f117888l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f117889l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f117889l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f117889l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/change_specific/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/change_specific/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<n> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final n invoke() {
            o oVar = ExtendedProfileChangeSpecificFragment.this.f117871n0;
            if (oVar == null) {
                oVar = null;
            }
            return (n) oVar.get();
        }
    }

    static {
        Y y12 = new Y(ExtendedProfileChangeSpecificFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f117870z0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileChangeSpecificFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileChangeSpecificFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileChangeSpecificFragment.class, "errorAndProgressView", "getErrorAndProgressView()Lcom/avito/android/extended_profile_ui_components/ErrorAndProgressViewRedesign;", 0, n0Var)};
        f117869y0 = new a(null);
    }

    public ExtendedProfileChangeSpecificFragment() {
        super(R.layout.extended_profile_change_specific_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f117872o0 = new O0(m0.f406844a.b(n.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f117876s0 = new C47313c(null, 1, null);
        this.f117877t0 = new C47313c(null, 1, null);
        this.f117878u0 = new C47313c(null, 1, null);
        this.f117879v0 = new C47313c(null, 1, null);
        this.f117881x0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f117880w0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f117880w0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new c(1, this, ExtendedProfileChangeSpecificFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificOneTimeEvent;)V", 0), new d());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.change_specific_nav_bar);
        C47313c c47313c = this.f117878u0;
        kotlin.reflect.n<Object>[] nVarArr = f117870z0;
        kotlin.reflect.n<Object> nVar = nVarArr[2];
        c47313c.b(this, navBar);
        kotlin.reflect.n<Object> nVar2 = nVarArr[2];
        ((NavBar) c47313c.a()).c(R.attr.ic_close24, new com.avito.android.change_specific.c(this));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.change_specific_recycler);
        C47313c c47313c2 = this.f117876s0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[0];
        c47313c2.b(this, recyclerView);
        Button button = (Button) view.findViewById(R.id.change_specific_continue_button);
        C47313c c47313c3 = this.f117877t0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[1];
        c47313c3.b(this, button);
        if (((ExtendedProfileChangeSpecificArguments) this.f117881x0.getValue()).f117866b) {
            q5().setText(R.string.extended_profile_change_specific_continue_only_select);
        } else {
            q5().setText(R.string.extended_profile_change_specific_continue);
        }
        com.avito.android.extended_profile_ui_components.l lVar = new com.avito.android.extended_profile_ui_components.l(new com.avito.android.change_specific.d(this), view);
        C47313c c47313c4 = this.f117879v0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[3];
        c47313c4.b(this, lVar);
        kotlin.reflect.n<Object> nVar6 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47313c2.a();
        com.avito.konveyor.adapter.j jVar = this.f117873p0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        kotlin.reflect.n<Object> nVar7 = nVarArr[0];
        RecyclerView recyclerView3 = (RecyclerView) c47313c2.a();
        u uVar = this.f117875r0;
        if (uVar == null) {
            uVar = null;
        }
        recyclerView3.l(uVar, -1);
        q5().setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 26));
        ScreenPerformanceTracker screenPerformanceTracker = this.f117880w0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.change_specific.di.a.a().a((com.avito.android.change_specific.di.c) C29972i.a(C29972i.b(this), com.avito.android.change_specific.di.c.class), (ExtendedProfileChangeSpecificArguments) this.f117881x0.getValue(), getResources(), s.c(this), ExtendedProfileChangeSpecificScreen.f117893d, new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f117880w0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final Button q5() {
        C47313c c47313c = this.f117877t0;
        kotlin.reflect.n<Object> nVar = f117870z0[1];
        return (Button) c47313c.a();
    }

    public final n r5() {
        return (n) this.f117872o0.getValue();
    }
}
