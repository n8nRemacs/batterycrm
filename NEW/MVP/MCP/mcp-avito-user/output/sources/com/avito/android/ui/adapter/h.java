package com.avito.android.ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: GridLayoutAppendingAdapter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ui/adapter/h;", "Landroidx/recyclerview/widget/RecyclerView$C;", "T", "Lcom/avito/android/serp/d;", "Lcom/avito/konveyor/adapter/i;", "a", "_avito_appending-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h<T extends RecyclerView.C> extends com.avito.android.serp.d implements com.avito.konveyor.adapter.i {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.Adapter<T> f304565e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final l f304566f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public View f304567g;

    /* compiled from: GridLayoutAppendingAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/adapter/h$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_appending-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {
    }

    public h(@Y61.k RecyclerView.Adapter adapter, @Y61.k l lVar) {
        this.f304565e = adapter;
        this.f304566f = lVar;
        g gVar = new g(this);
        setHasStableIds(true);
        adapter.registerAdapterDataObserver(gVar);
        lVar.f304570c = adapter;
    }

    @Override // com.avito.konveyor.adapter.i
    @Y61.l
    public final TV0.a getItem(int i12) {
        List<T> list;
        TV0.a aVar;
        RecyclerView.Adapter<T> adapter = this.f304565e;
        com.avito.konveyor.adapter.d dVar = adapter instanceof com.avito.konveyor.adapter.d ? (com.avito.konveyor.adapter.d) adapter : null;
        if (dVar != null && (list = dVar.f53650c.f53994f) != 0 && (aVar = (TV0.a) C42745f0.K(i12, list)) != null) {
            return aVar;
        }
        com.avito.konveyor.adapter.i iVar = adapter instanceof com.avito.konveyor.adapter.i ? (com.avito.konveyor.adapter.i) adapter : null;
        if (iVar != null) {
            return iVar.getItem(i12);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        RecyclerView.Adapter<?> adapter = this.f304566f.f304570c;
        if (adapter == null) {
            adapter = null;
        }
        return adapter.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        this.f304566f.getClass();
        return this.f304565e.getItemId(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        this.f304566f.getClass();
        return this.f304565e.getItemViewType(i12);
    }

    @Override // com.avito.android.serp.d, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@Y61.k RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f304565e.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@Y61.k RecyclerView.C c12, int i12, @Y61.k List<Object> list) {
        this.f304566f.a(i12);
        if (c12 instanceof a) {
            return;
        }
        this.f304565e.onBindViewHolder(c12, i12, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Y61.k
    public final RecyclerView.C onCreateViewHolder(@Y61.k ViewGroup viewGroup, int i12) {
        if (i12 != -1) {
            return this.f304565e.onCreateViewHolder(viewGroup, i12);
        }
        View viewB = this.f304567g;
        if (viewB == null || viewB.getParent() != null) {
            viewB = C0.b(viewGroup, R.layout.pending_view, viewGroup, false);
            this.f304567g = viewB;
        }
        return new a(viewB);
    }

    @Override // com.avito.android.serp.d, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@Y61.k RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f304565e.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@Y61.k RecyclerView.C c12) {
        if (c12 instanceof a) {
            return false;
        }
        return this.f304565e.onFailedToRecycleView(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@Y61.k RecyclerView.C c12) {
        super.onViewAttachedToWindow(c12);
        if (c12 instanceof a) {
            return;
        }
        this.f304565e.onViewAttachedToWindow(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@Y61.k RecyclerView.C c12) {
        super.onViewDetachedFromWindow(c12);
        if (c12 instanceof a) {
            return;
        }
        this.f304565e.onViewDetachedFromWindow(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@Y61.k RecyclerView.C c12) {
        super.onViewRecycled(c12);
        if (c12 instanceof a) {
            return;
        }
        this.f304565e.onViewRecycled(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z12) {
        super.setHasStableIds(z12);
        this.f304565e.setHasStableIds(z12);
    }

    @Override // com.avito.android.serp.d
    @Y61.k
    public final String toString() {
        return super.toString() + ", with explicit append:" + Objects.nonNull(this.f304566f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@Y61.k RecyclerView.C c12, int i12) {
        this.f304566f.a(i12);
        if (c12 instanceof a) {
            return;
        }
        this.f304565e.onBindViewHolder(c12, i12);
    }
}
