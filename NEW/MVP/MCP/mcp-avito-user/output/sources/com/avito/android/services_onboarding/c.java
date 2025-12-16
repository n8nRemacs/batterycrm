package com.avito.android.services_onboarding;

import Zu0.InterfaceC19610a;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.services_onboarding.ServicesOnboardingFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f279807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServicesOnboardingFragment f279808c;

    public /* synthetic */ c(ServicesOnboardingFragment servicesOnboardingFragment, int i12) {
        this.f279807b = i12;
        this.f279808c = servicesOnboardingFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ServicesOnboardingFragment servicesOnboardingFragment = this.f279808c;
        switch (this.f279807b) {
            case 0:
                ServicesOnboardingFragment.a aVar = ServicesOnboardingFragment.f279769y0;
                servicesOnboardingFragment.requireActivity().onBackPressed();
                break;
            case 1:
                ServicesOnboardingFragment.a aVar2 = ServicesOnboardingFragment.f279769y0;
                servicesOnboardingFragment.q5().accept(InterfaceC19610a.b.f20550a);
                break;
            default:
                ServicesOnboardingFragment.a aVar3 = ServicesOnboardingFragment.f279769y0;
                RecyclerView recyclerView = servicesOnboardingFragment.f279777u0;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.L1()) : null;
                if (numValueOf != null) {
                    servicesOnboardingFragment.q5().accept(new InterfaceC19610a.C1469a(numValueOf.intValue()));
                    break;
                }
                break;
        }
    }
}
