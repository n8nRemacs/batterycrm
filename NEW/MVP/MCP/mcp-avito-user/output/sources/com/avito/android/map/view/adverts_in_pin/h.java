package com.avito.android.map.view.adverts_in_pin;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.skeleton.ScrollUnpredictiveGridLayoutManager;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: AdvertsInPinView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/adverts_in_pin/h;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final int f185411b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f185412c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f185413d;

    public h(f fVar) {
        this.f185413d = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        if (i12 == 0 && i13 == 0) {
            return;
        }
        int i14 = this.f185412c;
        f fVar = this.f185413d;
        InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> interfaceC42726C = fVar.f185398o;
        if (interfaceC42726C == null) {
            interfaceC42726C = null;
        }
        this.f185412c = interfaceC42726C.getValue().M1();
        if (i14 == this.f185411b) {
            return;
        }
        InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> interfaceC42726C2 = fVar.f185398o;
        if ((interfaceC42726C2 != null ? interfaceC42726C2 : null).getValue().o0() - this.f185412c < 3) {
            fVar.f185387d.rp();
        }
    }
}
