package com.avito.android.help_center;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.di.b;
import com.avito.android.help_center.p;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HelpCenterFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/help_center/HelpCenterFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/help_center/p$a;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpCenterFragment extends BaseFragment implements p.a, com.avito.android.ui.fragments.c, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public p f161607n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f161608o0;

    public HelpCenterFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new com.avito.android.navigation.e(this, new d.a(this));
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        p pVar = this.f161607n0;
        if (pVar == null) {
            pVar = null;
        }
        return pVar.a();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.help_center_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        p pVar = this.f161607n0;
        if (pVar == null) {
            pVar = null;
        }
        pVar.e0();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        p pVar = this.f161607n0;
        if (pVar == null) {
            pVar = null;
        }
        bundle.putParcelable("key_presenter_state", pVar.d0());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        p pVar = this.f161607n0;
        if (pVar == null) {
            pVar = null;
        }
        pVar.b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        p pVar = this.f161607n0;
        if (pVar == null) {
            pVar = null;
        }
        pVar.c0();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC28373a interfaceC28373a = this.f161608o0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        L l12 = new L(view, interfaceC28373a);
        p pVar = this.f161607n0;
        (pVar != null ? pVar : null).c(l12);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key_url") : null;
        HelpCenterPresenterState helpCenterPresenterState = bundle != null ? (HelpCenterPresenterState) bundle.getParcelable("key_presenter_state") : null;
        b.a aVarA = com.avito.android.help_center.di.a.a();
        aVarA.b((com.avito.android.help_center.di.c) C29972i.a(C29972i.b(this), com.avito.android.help_center.di.c.class));
        aVarA.a(cv.c.b(this));
        aVarA.c(string);
        aVarA.d(helpCenterPresenterState);
        aVarA.build().a(this);
    }
}
