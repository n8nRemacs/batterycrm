package com.avito.android.select.sectioned_multiselect.container;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import aq0.InterfaceC23653b;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.select.sectioned_multiselect.container.di.c;
import com.avito.android.select.sectioned_multiselect.container.tab_layout.ContainerTabItem;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kq0.C43487a;

/* compiled from: SectionedMultiselectContainerFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/SectionedMultiselectContainerFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SectionedMultiselectContainerFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public d f266418n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public C43487a f266419o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public j<ContainerTabItem> f266420p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.select.sectioned_multiselect.container.a f266421q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final C35968w3 f266422r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public h f266423s0;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f266417u0 = {m0.f406844a.e(new Y(SectionedMultiselectContainerFragment.class, "openParams", "getOpenParams()Lcom/avito/android/select/sectioned_multiselect/container/SectionedMultiselectContainerParams;", 0))};

    /* renamed from: t0, reason: collision with root package name */
    @k
    public static final a f266416t0 = new a(null);

    /* compiled from: SectionedMultiselectContainerFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/SectionedMultiselectContainerFragment$a;", "", "<init>", "()V", "", "CURRENT_TAB_KEY", "Ljava/lang/String;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public SectionedMultiselectContainerFragment() {
        super(0, 1, null);
        this.f266422r0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @k
    public final Context m5(@k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.sectioned_multiselect_container_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        d dVar = this.f266418n0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@k Bundle bundle) {
        h hVar = this.f266423s0;
        bundle.putInt("current_tab_key", hVar != null ? hVar.f266462e.getSelectedTabPosition() : -1);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43487a c43487a = this.f266419o0;
        C43487a c43487a2 = c43487a != null ? c43487a : null;
        j<ContainerTabItem> jVar = this.f266420p0;
        j<ContainerTabItem> jVar2 = jVar != null ? jVar : null;
        com.avito.android.select.sectioned_multiselect.container.a aVar = this.f266421q0;
        h hVar = new h(view, c43487a2, jVar2, aVar != null ? aVar : null, bundle != null ? bundle.getInt("current_tab_key", -1) : -1);
        this.f266423s0 = hVar;
        d dVar = this.f266418n0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b(hVar);
        d dVar2 = this.f266418n0;
        (dVar2 != null ? dVar2 : null).a();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        c.a aVarA = com.avito.android.select.sectioned_multiselect.container.di.a.a();
        n<Object>[] nVarArr = f266417u0;
        n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f266422r0;
        SectionedMultiselectContainerParams sectionedMultiselectContainerParams = (SectionedMultiselectContainerParams) c35968w3.getValue(this, nVar);
        aVarA.a(sectionedMultiselectContainerParams.f266424b, requireContext(), getResources(), this, requireActivity(), ((SectionedMultiselectContainerParams) c35968w3.getValue(this, nVarArr[0])).f266425c, ((SectionedMultiselectContainerParams) c35968w3.getValue(this, nVarArr[0])).f266426d, (InterfaceC23653b) C29972i.a(C29972i.b(this), InterfaceC23653b.class)).a(this);
    }
}
