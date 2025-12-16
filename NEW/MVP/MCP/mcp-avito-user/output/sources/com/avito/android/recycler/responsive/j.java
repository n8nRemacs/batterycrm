package com.avito.android.recycler.responsive;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ResponsiveRecyclerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recycler/responsive/j;", "Lcom/avito/konveyor/adapter/j;", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.j {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f252363f;

    public j(@k e eVar, @k TV0.g<? extends com.avito.konveyor.adapter.b> gVar) {
        super(eVar, gVar);
        this.f252363f = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.C c12) {
        com.avito.konveyor.adapter.b bVar = (com.avito.konveyor.adapter.b) c12;
        if (bVar.getAdapterPosition() != -1) {
            this.f252363f.t0(bVar, bVar.getAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.C c12) {
        com.avito.konveyor.adapter.b bVar = (com.avito.konveyor.adapter.b) c12;
        if (bVar.getAdapterPosition() != -1) {
            this.f252363f.r0(bVar, bVar.getAdapterPosition());
        }
    }
}
