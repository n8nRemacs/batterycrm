package com.avito.android.beduin.ui.universal.view;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import bj.AbstractC25658a;
import com.avito.android.beduin.ui.universal.m;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalBeduinPushBottomSheetViewImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/universal/view/b;", "Lcom/avito/android/beduin/ui/universal/view/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.bottom_sheet.d f104555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f104556b;

    public b(@k com.avito.android.lib.design.bottom_sheet.d dVar, @k View view, @k InterfaceC22983P interfaceC22983P, @k io.reactivex.rxjava3.disposables.c cVar, @k com.avito.android.beduin.common.navigation_bar.b bVar, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a2, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a3, @k l<? super Boolean, G0> lVar) {
        this.f104555a = dVar;
        this.f104556b = new d(view, interfaceC22983P, cVar, bVar, abstractC25658a, abstractC25658a2, abstractC25658a3, null, lVar);
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    public final View a() {
        View viewU = this.f104555a.u();
        return viewU == null ? this.f104556b.f104557a : viewU;
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: b */
    public final RecyclerView getF104570n() {
        return this.f104556b.f104570n;
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: c */
    public final RecyclerView getF104571o() {
        return this.f104556b.f104571o;
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    public final void d(@k m mVar) {
        this.f104556b.d(mVar);
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: e */
    public final RecyclerView getF104569m() {
        return this.f104556b.f104569m;
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    public final void f(@k m mVar) {
        this.f104556b.f(mVar);
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: getView */
    public final View getF104557a() {
        return this.f104556b.f104557a;
    }
}
