package com.avito.android.help_center.help_center_request;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.help_center_request.di.d;
import com.avito.android.help_center.help_center_request.h;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HelpCenterRequestFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/help_center/help_center_request/HelpCenterRequestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/help_center/help_center_request/h$a;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpCenterRequestFragment extends BaseFragment implements h.a, com.avito.android.ui.fragments.c, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public h f161757n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f161758o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f161759p0;

    /* compiled from: HelpCenterRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/help_center/help_center_request/HelpCenterRequestFragment$a;", "", "<init>", "()V", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    public HelpCenterRequestFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        h hVar = this.f161757n0;
        if (hVar == null) {
            hVar = null;
        }
        return hVar.a();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.help_center_request_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        h hVar = this.f161757n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.e0();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        h hVar = this.f161757n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        h hVar = this.f161757n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.c0();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC28373a interfaceC28373a = this.f161759p0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        p pVar = new p(view, interfaceC28373a);
        h hVar = this.f161757n0;
        (hVar != null ? hVar : null).b(pVar);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        String string = requireArguments().getString("key_theme");
        String string2 = requireArguments().getString("key_advertisement_id");
        String string3 = requireArguments().getString("key_context_id");
        d.a aVarA = com.avito.android.help_center.help_center_request.di.c.a();
        aVarA.d((com.avito.android.help_center.help_center_request.di.e) C29972i.a(C29972i.b(this), com.avito.android.help_center.help_center_request.di.e.class));
        aVarA.a(string);
        aVarA.b(string2);
        aVarA.c(string3);
        aVarA.build().a(this);
    }

    public final void q5() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }
}
