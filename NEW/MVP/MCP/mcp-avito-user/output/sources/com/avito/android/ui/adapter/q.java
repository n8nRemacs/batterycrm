package com.avito.android.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecyclerViewAppendingAdapter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ui/adapter/q;", "Landroidx/recyclerview/widget/RecyclerView$C;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/ui/adapter/a;", "a", "_avito_appending-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q<T extends RecyclerView.C> extends RecyclerView.Adapter<RecyclerView.C> implements com.avito.android.ui.adapter.a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.Adapter<T> f304572c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b f304573d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g f304574e;

    /* compiled from: RecyclerViewAppendingAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/adapter/q$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_appending-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {
    }

    public q() {
        throw null;
    }

    public q(RecyclerView.Adapter adapter, f fVar, boolean z12, int i12, int i13, C42822w c42822w) {
        z12 = (i13 & 4) != 0 ? false : z12;
        i12 = (i13 & 8) != 0 ? R.layout.pending_view : i12;
        this.f304572c = adapter;
        this.f304573d = new b(this, fVar, z12, i12);
        g gVar = new g(this);
        this.f304574e = gVar;
        adapter.registerAdapterDataObserver(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.avito.android.ui.adapter.a
    public final int getCount() {
        return this.f304572c.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f304572c.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return this.f304573d.b(i12) ? BeduinInputModel.MIN_TEXT_VERSION : this.f304572c.getItemId(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        if (this.f304573d.b(i12)) {
            return -1;
        }
        return this.f304572c.getItemViewType(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@Y61.k RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f304572c.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@Y61.k RecyclerView.C c12, int i12) {
        this.f304573d.a(i12);
        if (c12 instanceof a) {
            return;
        }
        this.f304572c.onBindViewHolder(c12, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Y61.k
    public final RecyclerView.C onCreateViewHolder(@Y61.k ViewGroup viewGroup, int i12) {
        if (i12 != -1) {
            return this.f304572c.onCreateViewHolder(viewGroup, i12);
        }
        b bVar = this.f304573d;
        View view = bVar.f304563f;
        if (view == null || view.getParent() != null) {
            bVar.f304563f = LayoutInflater.from(viewGroup.getContext()).inflate(bVar.f304561d, viewGroup, false);
        }
        return new a(bVar.f304563f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@Y61.k RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f304572c.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@Y61.k RecyclerView.C c12) {
        if (c12 instanceof a) {
            return false;
        }
        return this.f304572c.onFailedToRecycleView(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@Y61.k RecyclerView.C c12) {
        super.onViewAttachedToWindow(c12);
        if (c12 instanceof a) {
            return;
        }
        this.f304572c.onViewAttachedToWindow(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@Y61.k RecyclerView.C c12) {
        super.onViewDetachedFromWindow(c12);
        if (c12 instanceof a) {
            return;
        }
        this.f304572c.onViewDetachedFromWindow(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@Y61.k RecyclerView.C c12) {
        super.onViewRecycled(c12);
        if (c12 instanceof a) {
            return;
        }
        this.f304572c.onViewRecycled(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z12) {
        super.setHasStableIds(z12);
        g gVar = this.f304574e;
        RecyclerView.Adapter<T> adapter = this.f304572c;
        adapter.unregisterAdapterDataObserver(gVar);
        adapter.setHasStableIds(z12);
    }
}
