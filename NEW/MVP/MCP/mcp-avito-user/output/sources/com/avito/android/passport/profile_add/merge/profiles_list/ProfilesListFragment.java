package com.avito.android.passport.profile_add.merge.profiles_list;

import Cd.C13243a;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import com.avito.android.passport.profile_add.merge.profiles_list.ProfilesListFragment;
import com.avito.android.passport.profile_add.merge.profiles_list.a;
import com.avito.android.passport.profile_add.merge.profiles_list.recycler.w;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import cv.InterfaceC39417a;
import d60.InterfaceC39512a;
import dagger.internal.u;
import f60.InterfaceC40238a;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ProfilesListFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/ProfilesListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfilesListFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f213192A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f213193B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f213194n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f213195o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_add.merge.profiles_list.recycler.p f213196p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_add.merge.profiles_list.recycler.d f213197q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_list_item.n f213198r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f213199s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public G50.a f213200t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public u f213201u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f213202v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213203w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213204x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213205y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213206z0;

    /* compiled from: ProfilesListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/ProfilesListFragment$a;", "", "<init>", "()V", "", "EXTRA_MERGE_FLOW", "Ljava/lang/String;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ProfilesListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.passport.profile_add.merge.profiles_list.ProfilesListFragment$a$a, reason: collision with other inner class name */
        public static final class C6387a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ MergeFlow f213207l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6387a(MergeFlow mergeFlow) {
                super(1);
                this.f213207l = mergeFlow;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putSerializable("passport.add_profile.merge.merge_flow", this.f213207l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ProfilesListFragment a(@Y61.k MergeFlow mergeFlow) {
            ProfilesListFragment profilesListFragment = new ProfilesListFragment();
            C35966w1.a(profilesListFragment, -1, new C6387a(mergeFlow));
            return profilesListFragment;
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f213208l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f213208l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f213208l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ProfilesListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f213210l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f213210l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f213210l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f213211l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f213211l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f213211l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f213212l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f213212l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f213212l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ProfilesListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/s;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/merge/profiles_list/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<s> {
        public g() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final s invoke() {
            u uVar = ProfilesListFragment.this.f213201u0;
            if (uVar == null) {
                uVar = null;
            }
            return (s) uVar.get();
        }
    }

    static {
        Y y12 = new Y(ProfilesListFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f213193B0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ProfilesListFragment.class, "profilesList", "getProfilesList()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ProfilesListFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ProfilesListFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay2/ProgressOverlay;", 0, n0Var)};
        f213192A0 = new a(null);
    }

    public ProfilesListFragment() {
        super(R.layout.passport_merge_accounts_profiles_list_fragment);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f213202v0 = new O0(m0.f406844a.b(s.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
        this.f213203w0 = new C47313c(null, 1, null);
        this.f213204x0 = new C47313c(null, 1, null);
        this.f213205y0 = new C47313c(null, 1, null);
        this.f213206z0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f213199s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.nav_bar);
        navBar.c(R.attr.ic_close24, new l(this));
        C47313c c47313c = this.f213203w0;
        kotlin.reflect.n<Object>[] nVarArr = f213193B0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, navBar);
        C42670a c42670a = new C42670a((ViewGroup) view.findViewById(R.id.progress_container), new m(view), 0, 4, null);
        C47313c c47313c2 = this.f213206z0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[3];
        c47313c2.b(this, c42670a);
        Button button = (Button) view.findViewById(R.id.passport_merge_accounts_continue);
        C47313c c47313c3 = this.f213205y0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, button);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.passport_merge_accounts_profiles_list);
        C47313c c47313c4 = this.f213204x0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[1];
        c47313c4.b(this, recyclerView);
        kotlin.reflect.n<Object> nVar5 = nVarArr[1];
        ((RecyclerView) c47313c4.a()).l(new w(), -1);
        kotlin.reflect.n<Object> nVar6 = nVarArr[1];
        RecyclerView recyclerView2 = (RecyclerView) c47313c4.a();
        com.avito.konveyor.adapter.j jVar = this.f213194n0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        C22984Q.a(getViewLifecycleOwner()).c(new com.avito.android.passport.profile_add.merge.profiles_list.e(this, null));
        com.avito.android.passport.profile_add.merge.profiles_list.recycler.d dVar = this.f213197q0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.K5(new h(this));
        com.avito.android.passport.profile_add.merge.profiles_list.recycler.d dVar2 = this.f213197q0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        dVar2.K4(new i(this));
        com.avito.android.passport.profile_add.merge.profiles_list.recycler.p pVar = this.f213196p0;
        if (pVar == null) {
            pVar = null;
        }
        pVar.a(new j(this));
        kotlin.reflect.n<Object> nVar7 = nVarArr[2];
        Button button2 = (Button) c47313c3.a();
        final int i12 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.passport.profile_add.merge.profiles_list.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ProfilesListFragment f213247c;

            {
                this.f213247c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ProfilesListFragment profilesListFragment = this.f213247c;
                switch (i12) {
                    case 0:
                        ProfilesListFragment.a aVar = ProfilesListFragment.f213192A0;
                        profilesListFragment.r5().accept(InterfaceC40238a.b.f395662a);
                        break;
                    default:
                        ProfilesListFragment.a aVar2 = ProfilesListFragment.f213192A0;
                        profilesListFragment.r5().accept(InterfaceC40238a.e.f395665a);
                        break;
                }
            }
        });
        final int i13 = 1;
        q5().a(new View.OnClickListener(this) { // from class: com.avito.android.passport.profile_add.merge.profiles_list.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ProfilesListFragment f213247c;

            {
                this.f213247c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ProfilesListFragment profilesListFragment = this.f213247c;
                switch (i13) {
                    case 0:
                        ProfilesListFragment.a aVar = ProfilesListFragment.f213192A0;
                        profilesListFragment.r5().accept(InterfaceC40238a.b.f395662a);
                        break;
                    default:
                        ProfilesListFragment.a aVar2 = ProfilesListFragment.f213192A0;
                        profilesListFragment.r5().accept(InterfaceC40238a.e.f395665a);
                        break;
                }
            }
        });
        com.avito.android.passport.profile_list_item.n nVar8 = this.f213198r0;
        if (nVar8 == null) {
            nVar8 = null;
        }
        nVar8.H3(new k(this));
        ScreenPerformanceTracker screenPerformanceTracker = this.f213199s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Object serializable;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        InterfaceC39512a interfaceC39512a = (InterfaceC39512a) C29972i.a(C29972i.b(this), InterfaceC39512a.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        Bundle bundleRequireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = bundleRequireArguments.getSerializable("passport.add_profile.merge.merge_flow", MergeFlow.class);
        } else {
            Object serializable2 = bundleRequireArguments.getSerializable("passport.add_profile.merge.merge_flow");
            if (!(serializable2 instanceof MergeFlow)) {
                serializable2 = null;
            }
            serializable = (MergeFlow) serializable2;
        }
        a.c cVar = new a.c(new o(), interfaceC39512a, interfaceC39417aB, rVarC, activityC22955mRequireActivity, (MergeFlow) serializable, null);
        this.f213194n0 = cVar.f213225l.get();
        this.f213195o0 = cVar.f213224k.get();
        this.f213196p0 = cVar.f213216c.get();
        this.f213197q0 = cVar.f213218e.get();
        this.f213198r0 = cVar.f213220g.get();
        this.f213199s0 = cVar.f213228o.get();
        G50.a aVarD6 = cVar.f213214a.D6();
        dagger.internal.t.c(aVarD6);
        this.f213200t0 = aVarD6;
        this.f213201u0 = cVar.f213237x;
        ScreenPerformanceTracker screenPerformanceTracker = this.f213199s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final C42670a q5() {
        C47313c c47313c = this.f213206z0;
        kotlin.reflect.n<Object> nVar = f213193B0[3];
        return (C42670a) c47313c.a();
    }

    public final s r5() {
        return (s) this.f213202v0.getValue();
    }
}
