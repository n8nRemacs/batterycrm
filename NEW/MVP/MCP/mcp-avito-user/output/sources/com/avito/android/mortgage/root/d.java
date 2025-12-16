package com.avito.android.mortgage.root;

import Y41.p;
import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MortgageRootView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/d;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public int f202214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f202215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p<Integer, Integer, G0> f202216d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(b bVar, p<? super Integer, ? super Integer, G0> pVar) {
        this.f202215c = bVar;
        this.f202216d = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        if (i12 == 1 && this.f202214b != 1 && this.f202215c.f202208w) {
            K2.d(recyclerView, true);
        }
        this.f202214b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        this.f202216d.invoke(Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.K1() : -1), Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.M1() : -1));
    }
}
