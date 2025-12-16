package com.avito.android.brandspace.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.brandspace.di.q;
import com.avito.android.brandspace.router.BrandspaceArguments;
import com.avito.android.brandspace.view.e;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.P5;
import dj.InterfaceC39736a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import gj.m;
import gj.n;
import gj.o;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BrandspaceFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/brandspace/view/BrandspaceFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "<init>", "()V", "a", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class BrandspaceFragment extends TabBaseFragment implements InterfaceC28477j.b, gj.i {

    /* renamed from: D0, reason: collision with root package name */
    @k
    public static final a f107771D0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f107772A0;

    /* renamed from: B0, reason: collision with root package name */
    public gj.k f107773B0;

    /* renamed from: C0, reason: collision with root package name */
    @l
    public Float f107774C0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.brandspace.vm.a f107775t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public n f107776u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f107777v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f107778w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public h f107779x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final NavigationState f107780y0;

    /* renamed from: z0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f107781z0;

    /* compiled from: BrandspaceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/brandspace/view/BrandspaceFragment$a;", "", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BrandspaceFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Bundle, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            BrandspaceFragment brandspaceFragment = BrandspaceFragment.this;
            com.avito.android.brandspace.vm.a aVar = brandspaceFragment.f107775t0;
            if (aVar == null) {
                aVar = null;
            }
            bundle2.putBundle("vm_state", aVar.P());
            Float f12 = brandspaceFragment.f107774C0;
            if (f12 != null) {
                bundle2.putFloat("logo_ratio", f12.floatValue());
            }
            return G0.f406611a;
        }
    }

    public BrandspaceFragment() {
        super(0, 1, null);
        this.f107778w0 = new io.reactivex.rxjava3.disposables.c();
        this.f107780y0 = new NavigationState(false, null, 2, null);
    }

    @Override // gj.i
    @l
    public final RecyclerView B0(@k String str) {
        h hVar;
        com.avito.android.brandspace.vm.a aVar = this.f107775t0;
        if (aVar == null) {
            aVar = null;
        }
        if (str.equals(aVar.Rd())) {
            h hVar2 = this.f107779x0;
            if (hVar2 != null) {
                return hVar2.f107798g;
            }
            return null;
        }
        com.avito.android.brandspace.vm.a aVar2 = this.f107775t0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        if (str.equals(aVar2.m0())) {
            h hVar3 = this.f107779x0;
            if (hVar3 != null) {
                return hVar3.f107799h;
            }
            return null;
        }
        com.avito.android.brandspace.vm.a aVar3 = this.f107775t0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        if (!str.equals(aVar3.W9()) || (hVar = this.f107779x0) == null) {
            return null;
        }
        return hVar.f107800i;
    }

    @Override // gj.i
    @l
    public final View b3(@k String str) {
        return B0(str);
    }

    @Override // gj.i
    @l
    public final o c1() {
        return null;
    }

    @Override // gj.i
    @k
    public final String m0() {
        com.avito.android.brandspace.vm.a aVar = this.f107775t0;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.m0();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @l
    public final Context m5(@k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        com.avito.android.brandspace.vm.a aVar = this.f107775t0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.g1().e();
        return layoutInflater.inflate(R.layout.brandspace_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f107778w0.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        com.avito.android.brandspace.vm.a aVar = this.f107775t0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.I0();
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        com.avito.android.brandspace.vm.a aVar = this.f107775t0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.w8();
        super.onResume();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A5(bundle, new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        n nVar = this.f107776u0;
        if (nVar == null) {
            nVar = null;
        }
        gj.k kVarA = m.a(nVar, this);
        this.f107773B0 = kVarA;
        com.avito.android.brandspace.vm.a aVar = this.f107775t0;
        if (aVar == null) {
            aVar = null;
        }
        ((com.avito.android.beduin.view.c) kVarA).l(aVar.V());
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.brandspace_toolbar);
        toolbar.setTitle("");
        P5.c(toolbar, R.attr.black);
        o5(toolbar);
        toolbar.setNavigationOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 21));
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.brandspace_content_horizontal_padding);
        InterfaceC25659b interfaceC25659b = this.f107777v0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        this.f107781z0 = interfaceC25659b.b(Integer.valueOf(dimensionPixelSize));
        InterfaceC25659b interfaceC25659b2 = this.f107777v0;
        if (interfaceC25659b2 == null) {
            interfaceC25659b2 = null;
        }
        this.f107772A0 = interfaceC25659b2.b(Integer.valueOf(dimensionPixelSize));
        InterfaceC25659b interfaceC25659b3 = this.f107777v0;
        if (interfaceC25659b3 == null) {
            interfaceC25659b3 = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarB = interfaceC25659b3.b(Integer.valueOf(dimensionPixelSize));
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f107781z0;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = abstractC25658a == null ? null : abstractC25658a;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = this.f107772A0;
        h hVar = new h(view, this.f107778w0, abstractC25658a2, abstractC25658a3 == null ? null : abstractC25658a3, aVarB, toolbar);
        com.avito.android.brandspace.vm.a aVar2 = this.f107775t0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> listB5 = aVar2.B5();
        com.avito.android.brandspace.vm.a aVar3 = this.f107775t0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> listDd = aVar3.Dd();
        com.avito.android.brandspace.vm.a aVar4 = this.f107775t0;
        if (aVar4 == null) {
            aVar4 = null;
        }
        hVar.b(listB5, listDd, aVar4.H3());
        com.avito.android.brandspace.vm.a aVar5 = this.f107775t0;
        if (aVar5 == null) {
            aVar5 = null;
        }
        z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> zVarN8 = aVar5.N8();
        com.avito.android.brandspace.vm.a aVar6 = this.f107775t0;
        if (aVar6 == null) {
            aVar6 = null;
        }
        z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> zVarH6 = aVar6.H6();
        com.avito.android.brandspace.vm.a aVar7 = this.f107775t0;
        if (aVar7 == null) {
            aVar7 = null;
        }
        hVar.a(zVarN8, zVarH6, aVar7.V6());
        com.avito.android.brandspace.vm.a aVar8 = this.f107775t0;
        if (aVar8 == null) {
            aVar8 = null;
        }
        InterfaceC39736a interfaceC39736aB0 = aVar8.B0();
        com.avito.android.brandspace.vm.a aVar9 = this.f107775t0;
        if (aVar9 == null) {
            aVar9 = null;
        }
        InterfaceC39736a interfaceC39736aB02 = aVar9.B0();
        com.avito.android.brandspace.vm.a aVar10 = this.f107775t0;
        if (aVar10 == null) {
            aVar10 = null;
        }
        hVar.e(interfaceC39736aB0, interfaceC39736aB02, aVar10.B0());
        hVar.f107801j.f231600j = new com.avito.android.brandspace.view.a(this);
        com.avito.android.brandspace.vm.a aVar11 = this.f107775t0;
        if (aVar11 == null) {
            aVar11 = null;
        }
        aVar11.E6().observe(getViewLifecycleOwner(), new e.a(new com.avito.android.brandspace.view.b(this, hVar)));
        com.avito.android.brandspace.vm.a aVar12 = this.f107775t0;
        if (aVar12 == null) {
            aVar12 = null;
        }
        aVar12.R4().observe(getViewLifecycleOwner(), new e.a(new c(this, hVar)));
        this.f107779x0 = hVar;
        com.avito.android.brandspace.vm.a aVar13 = this.f107775t0;
        (aVar13 != null ? aVar13 : null).g1().d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle arguments = getArguments();
        BrandspaceArguments brandspaceArguments = arguments != null ? (BrandspaceArguments) arguments.getParcelable("key_brandspace_arguments") : null;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        q.a().a(brandspaceArguments.f107764b, brandspaceArguments.f107766d, brandspaceArguments.f107767e, this, this, s.c(this), null, (com.avito.android.brandspace.di.c) C29972i.a(C29972i.b(this), com.avito.android.brandspace.di.c.class), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), cv.c.b(this)).b(this);
        Bundle bundleT5 = t5(bundle);
        if (bundleT5 != null) {
            this.f107774C0 = bundleT5.containsKey("logo_ratio") ? Float.valueOf(bundleT5.getFloat("logo_ratio")) : null;
            Bundle bundle2 = bundleT5.getBundle("vm_state");
            if (bundle2 != null) {
                com.avito.android.brandspace.vm.a aVar = this.f107775t0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.b(bundle2);
            }
        }
        com.avito.android.brandspace.vm.a aVar2 = this.f107775t0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.g1().a(fA2.b());
        com.avito.android.brandspace.vm.a aVar3 = this.f107775t0;
        (aVar3 != null ? aVar3 : null).g1().m(g5(), this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF107780y0() {
        return this.f107780y0;
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
