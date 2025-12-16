package com.avito.android.beduin.common.component.serp_layout;

import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.Metadata;

/* compiled from: SerpLayoutComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/serp_layout/g;", "Landroidx/lifecycle/q;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102610b;

    public g(d dVar) {
        this.f102610b = dVar;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f102610b.f102599h.I();
        interfaceC22983P.getLifecycle().c(this);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
        d dVar = this.f102610b;
        dVar.f102600i.b(dVar.f102605n);
        dVar.u();
    }
}
