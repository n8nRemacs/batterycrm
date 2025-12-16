package com.avito.android.mortgage.landing;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.mortgage.landing.LandingFragment;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import w00.InterfaceC49409a;

/* compiled from: LandingView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/n;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public int f200293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f200294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49409a, G0> f200295d;

    /* JADX WARN: Multi-variable type inference failed */
    public n(o oVar, Y41.l<? super InterfaceC49409a, G0> lVar) {
        this.f200294c = oVar;
        this.f200295d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        if (i12 == 1 && this.f200293b != 1 && this.f200294c.f200297B) {
            K2.d(recyclerView, false);
        }
        this.f200293b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        RecyclerView.m layoutManager = this.f200294c.f200307h.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        ((LandingFragment.e) this.f200295d).invoke(new InterfaceC49409a.t(linearLayoutManager != null ? linearLayoutManager.K1() : -1, linearLayoutManager != null ? linearLayoutManager.M1() : -1));
    }
}
