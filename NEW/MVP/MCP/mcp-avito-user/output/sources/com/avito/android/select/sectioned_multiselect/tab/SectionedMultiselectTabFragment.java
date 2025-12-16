package com.avito.android.select.sectioned_multiselect.tab;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC23487e;
import aq0.InterfaceC23653b;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.select.Arguments;
import com.avito.android.select.sectioned_multiselect.tab.di.d;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedMultiselectTabFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/tab/SectionedMultiselectTabFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SectionedMultiselectTabFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public c f266696n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f266697o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f266698p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f266699q0;

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f266695s0 = {m0.f406844a.e(new Y(SectionedMultiselectTabFragment.class, "openParams", "getOpenParams()Lcom/avito/android/select/sectioned_multiselect/tab/SectionedMultiselectTabParams;", 0))};

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final a f266694r0 = new a(null);

    /* compiled from: SectionedMultiselectTabFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/tab/SectionedMultiselectTabFragment$a;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public SectionedMultiselectTabFragment() {
        super(0, 1, null);
        this.f266699q0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        Fragment parentFragment;
        super.onCreate(bundle);
        SectionedMultiselectTabParams sectionedMultiselectTabParams = (SectionedMultiselectTabParams) this.f266699q0.getValue(this, f266695s0[0]);
        C42784z0 c42784z0 = C42784z0.f406748b;
        Arguments arguments = new Arguments(false, sectionedMultiselectTabParams.f266700b, null, c42784z0, c42784z0, "", null, true, false, false, true, true, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, sectionedMultiselectTabParams.f266702d, false, false, null, false, false, false, 0, null, null, -1073749179, 255, null);
        Fragment parentFragment2 = getParentFragment();
        InterfaceC23487e targetFragment = (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null) ? null : parentFragment.getTargetFragment();
        com.avito.android.select.p pVar = targetFragment instanceof com.avito.android.select.p ? (com.avito.android.select.p) targetFragment : null;
        InterfaceC19588c<? super InterfaceC19587b> interfaceC19588cE4 = pVar != null ? pVar.E4(arguments) : null;
        d.a aVarA = com.avito.android.select.sectioned_multiselect.tab.di.a.a();
        aVarA.d((InterfaceC23653b) C29972i.a(C29972i.b(this), InterfaceC23653b.class));
        aVarA.a(cv.c.b(this));
        String str = sectionedMultiselectTabParams.f266701c;
        aVarA.h(str);
        aVarA.c(sectionedMultiselectTabParams.f266700b);
        aVarA.g(requireActivity());
        aVarA.f(sectionedMultiselectTabParams.f266703e && str == null);
        aVarA.e(interfaceC19588cE4);
        aVarA.b(getResources());
        aVarA.build().a(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.sectioned_list_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        c cVar = this.f266696n0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.e0();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f266697o0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.android.recycler.data_aware.c cVar = this.f266698p0;
        if (cVar == null) {
            cVar = null;
        }
        t tVar = new t(view, jVar, cVar);
        c cVar2 = this.f266696n0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.b(tVar);
        c cVar3 = this.f266696n0;
        (cVar3 != null ? cVar3 : null).a();
    }
}
