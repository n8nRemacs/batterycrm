package com.avito.android.publish.pretend;

import Id0.InterfaceC14062b;
import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.R0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.progress_overlay.l;
import com.avito.android.publish.pretend.c;
import com.avito.android.publish.pretend.di.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PretendFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/pretend/PretendFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PretendFragment extends Fragment implements com.avito.android.ui.fragments.c, InterfaceC14062b, InterfaceC28477j.b {

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f238347f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public i f238348g0;

    /* renamed from: h0, reason: collision with root package name */
    public h f238349h0;

    /* renamed from: i0, reason: collision with root package name */
    public l f238350i0;

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        h hVar = this.f238349h0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f238378K.ye();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@Y61.l Bundle bundle) {
        super.onActivityCreated(bundle);
        h hVar = this.f238349h0;
        if (hVar == null) {
            hVar = null;
        }
        if (hVar.f238380M.getValue() == null) {
            hVar.ke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        b.a aVarA = com.avito.android.publish.pretend.di.a.a();
        aVarA.a((com.avito.android.publish.pretend.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.pretend.di.c.class));
        aVarA.build().a(this);
        i iVar = this.f238348g0;
        if (iVar == null) {
            iVar = null;
        }
        this.f238349h0 = (h) R0.a(this, iVar).a(h.class);
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.loading_progress_overlay_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        h hVar = this.f238349h0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f238380M.removeObservers(getViewLifecycleOwner());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f238347f0;
        l lVar = new l(viewGroup, 0, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_progress_overlay, 0, 18, null);
        this.f238350i0 = lVar;
        lVar.k(null);
        h hVar = this.f238349h0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f238380M.observe(getViewLifecycleOwner(), new c.a(new a(this)));
        h hVar2 = this.f238349h0;
        if (hVar2 == null) {
            hVar2 = null;
        }
        l lVar2 = this.f238350i0;
        (lVar2 != null ? lVar2 : null).f231600j = new b(hVar2);
    }
}
