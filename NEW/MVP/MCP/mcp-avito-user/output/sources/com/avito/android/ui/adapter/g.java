package com.avito.android.ui.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: DelegatingDataObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/adapter/g;", "Landroidx/recyclerview/widget/RecyclerView$g;", "_avito_appending-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends RecyclerView.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.Adapter<? extends RecyclerView.C> f304564a;

    public g(@Y61.k RecyclerView.Adapter<? extends RecyclerView.C> adapter) {
        this.f304564a = adapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void a() {
        this.f304564a.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void b(int i12, int i13) {
        this.f304564a.notifyItemRangeChanged(i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void c(int i12, int i13, @Y61.l Object obj) {
        this.f304564a.notifyItemRangeChanged(i12, i13, obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void d(int i12, int i13) {
        this.f304564a.notifyItemRangeInserted(i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void e(int i12, int i13) {
        this.f304564a.notifyItemMoved(i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void f(int i12, int i13) {
        this.f304564a.notifyItemRangeRemoved(i12, i13);
    }
}
