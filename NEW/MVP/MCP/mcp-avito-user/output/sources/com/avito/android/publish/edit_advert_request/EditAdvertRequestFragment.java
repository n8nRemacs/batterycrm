package com.avito.android.publish.edit_advert_request;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.view.R0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.publish.edit_advert_request.di.c;
import com.avito.android.publish.edit_advert_request.h;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EditAdvertRequestFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/EditAdvertRequestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/f;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EditAdvertRequestFragment extends BaseFragment implements com.avito.android.ui.fragments.c, Id0.f, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f235445n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f235446o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f235447p0;

    /* renamed from: q0, reason: collision with root package name */
    public j f235448q0;

    /* renamed from: r0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f235449r0;

    public EditAdvertRequestFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        j jVar = this.f235448q0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.f235509M.ye();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@Y61.l Bundle bundle) {
        super.onActivityCreated(bundle);
        j jVar = this.f235448q0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.ke();
        jVar.f235517U.b(jVar.f235510N.d9().t0(new k(jVar)));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        c.a aVarA = com.avito.android.publish.edit_advert_request.di.a.a();
        aVarA.c((com.avito.android.publish.edit_advert_request.di.b) C29972i.a(C29972i.b(this), com.avito.android.publish.edit_advert_request.di.b.class));
        aVarA.b(getResources());
        aVarA.a(cv.c.b(this));
        aVarA.build().a(this);
        m mVar = this.f235445n0;
        if (mVar == null) {
            mVar = null;
        }
        this.f235448q0 = (j) R0.a(this, mVar).a(j.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.edit_advert_request_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        j jVar = this.f235448q0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.f235516T.removeObservers(getViewLifecycleOwner());
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f235446o0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.content, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_confirm_progress_overlay, 0, 16, null);
        this.f235449r0 = lVar;
        lVar.k(null);
        j jVar = this.f235448q0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.f235516T.observe(getViewLifecycleOwner(), new h.a(new e(this)));
        j jVar2 = this.f235448q0;
        if (jVar2 == null) {
            jVar2 = null;
        }
        com.avito.android.progress_overlay.l lVar2 = this.f235449r0;
        (lVar2 != null ? lVar2 : null).f231600j = new f(jVar2);
    }
}
