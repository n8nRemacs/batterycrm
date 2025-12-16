package com.avito.android.extended_profile_adverts;

import Cd.C13243a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_adverts.di.C30488a;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.h1;
import com.avito.android.ui.fragments.TabBaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.d2;
import pA.InterfaceC46926a;
import qA.InterfaceC47264a;
import z1.AbstractC50339a;

/* compiled from: ProfileAdvertsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_adverts/ProfileAdvertsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProfileAdvertsFragment extends TabBaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite.n f150541A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.viewed.f f150542B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public InterfaceC47264a f150543C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f150544D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.a f150545E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public d2<InterfaceC46926a> f150546F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public s f150547G0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public u f150548t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f150549u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f150550v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public h1 f150551w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> f150552x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public Y0 f150553y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public GridLayoutManager.c f150554z0;

    /* compiled from: ProfileAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_adverts/ProfileAdvertsFragment$a;", "", "<init>", "()V", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ProfileAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_adverts/ProfileAdvertsFragment$b", "Lcom/avito/android/ui/adapter/f;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.ui.adapter.f {
        public b() {
        }

        @Override // com.avito.android.ui.adapter.f
        public final boolean gk() {
            ProfileAdvertsFragment profileAdvertsFragment = ProfileAdvertsFragment.this;
            return ((t) profileAdvertsFragment.f150549u0.getValue()).getState().getValue().f428249g && ((t) profileAdvertsFragment.f150549u0.getValue()).getState().getValue().f428250h == null;
        }

        @Override // com.avito.android.ui.adapter.f
        public final void rp() {
            ((t) ProfileAdvertsFragment.this.f150549u0.getValue()).accept(InterfaceC46926a.C12255a.f428226a);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f150556l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f150556l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f150556l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ProfileAdvertsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f150558l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f150558l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f150558l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f150559l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f150559l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f150559l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f150560l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f150560l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f150560l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ProfileAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_adverts/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_adverts/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<t> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = ProfileAdvertsFragment.this.f150548t0;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    public ProfileAdvertsFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f150549u0 = new O0(m0.f406844a.b(t.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        InterfaceC47264a interfaceC47264a = this.f150543C0;
        if (interfaceC47264a == null) {
            interfaceC47264a = null;
        }
        interfaceC47264a.e();
        return layoutInflater.inflate(R.layout.profile_adverts, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.favorite.n nVar = this.f150541A0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.I();
        com.avito.android.advert.viewed.f fVar = this.f150542B0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.e0();
        com.avito.android.advert_collection_toast.a aVar = this.f150545E0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        s sVar = this.f150547G0;
        if (sVar != null) {
            sVar.f150974m.setAdapter(null);
        }
        this.f150547G0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC47264a interfaceC47264a = this.f150543C0;
        if (interfaceC47264a == null) {
            interfaceC47264a = null;
        }
        interfaceC47264a.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        InterfaceC47264a interfaceC47264a = this.f150543C0;
        if (interfaceC47264a == null) {
            interfaceC47264a = null;
        }
        interfaceC47264a.stop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        t tVar = (t) this.f150549u0.getValue();
        d2<InterfaceC46926a> d2Var = this.f150546F0;
        d2<InterfaceC46926a> d2Var2 = d2Var != null ? d2Var : null;
        com.avito.android.favorite.n nVar = this.f150541A0;
        com.avito.android.favorite.n nVar2 = nVar != null ? nVar : null;
        com.avito.android.advert.viewed.f fVar = this.f150542B0;
        com.avito.android.advert.viewed.f fVar2 = fVar != null ? fVar : null;
        com.avito.android.recycler.data_aware.c cVar = this.f150550v0;
        com.avito.android.recycler.data_aware.c cVar2 = cVar != null ? cVar : null;
        com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> hVar = this.f150552x0;
        com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> hVar2 = hVar != null ? hVar : null;
        h1 h1Var = this.f150551w0;
        h1 h1Var2 = h1Var != null ? h1Var : null;
        Y0 y02 = this.f150553y0;
        Y0 y03 = y02 != null ? y02 : null;
        GridLayoutManager.c cVar3 = this.f150554z0;
        GridLayoutManager.c cVar4 = cVar3 != null ? cVar3 : null;
        InterfaceC47264a interfaceC47264a = this.f150543C0;
        s sVar = new s(view, this, tVar, d2Var2, nVar2, fVar2, cVar2, hVar2, h1Var2, y03, cVar4, interfaceC47264a != null ? interfaceC47264a : null);
        com.avito.android.favorite.n nVar3 = this.f150541A0;
        if (nVar3 == null) {
            nVar3 = null;
        }
        nVar3.s4(sVar);
        com.avito.android.advert.viewed.f fVar3 = this.f150542B0;
        if (fVar3 == null) {
            fVar3 = null;
        }
        fVar3.d(sVar);
        this.f150547G0 = sVar;
        com.avito.android.advert_collection_toast.a aVar = this.f150545E0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.d(view, this);
        InterfaceC47264a interfaceC47264a2 = this.f150543C0;
        (interfaceC47264a2 != null ? interfaceC47264a2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        String string;
        String string2;
        SearchParams searchParams;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i12 = Build.VERSION.SDK_INT;
            Screen screen = (Screen) (i12 >= 34 ? (Parcelable) arguments.getParcelable("screen", Screen.class) : arguments.getParcelable("screen"));
            if (screen != null) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    throw new IllegalArgumentException();
                }
                boolean z12 = arguments2.getBoolean("sub_component", false);
                Bundle arguments3 = getArguments();
                if (arguments3 == null || (string = arguments3.getString("user_key")) == null) {
                    throw new IllegalArgumentException();
                }
                Bundle arguments4 = getArguments();
                if (arguments4 == null || (string2 = arguments4.getString("shortcut")) == null) {
                    throw new IllegalArgumentException();
                }
                Bundle arguments5 = getArguments();
                if (arguments5 == null) {
                    throw new IllegalArgumentException();
                }
                boolean z13 = arguments5.getBoolean("useSearchRequest");
                Bundle arguments6 = getArguments();
                String string3 = arguments6 != null ? arguments6.getString("context_id") : null;
                Bundle arguments7 = getArguments();
                String string4 = arguments7 != null ? arguments7.getString("external_disclaimer") : null;
                Bundle arguments8 = getArguments();
                String string5 = arguments8 != null ? arguments8.getString("profile_session") : null;
                D.f90335a.getClass();
                F fA2 = D.a.a();
                Bundle arguments9 = getArguments();
                if (arguments9 != null) {
                    searchParams = (SearchParams) (i12 >= 34 ? (Parcelable) arguments9.getParcelable("search_params", SearchParams.class) : arguments9.getParcelable("search_params"));
                } else {
                    searchParams = null;
                }
                C30488a.a().a(string2, z13, string3, string, string5, string4, getResources(), screen, com.avito.android.analytics.screens.s.c(this), z12, getF42820b(), searchParams, new b(), (com.avito.android.extended_profile_adverts.di.m) C29972i.a(C29972i.b(this), com.avito.android.extended_profile_adverts.di.m.class), cv.c.b(this)).a(this);
                InterfaceC47264a interfaceC47264a = this.f150543C0;
                if (interfaceC47264a == null) {
                    interfaceC47264a = null;
                }
                interfaceC47264a.a(fA2.b());
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
