package com.avito.android.serp;

import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.recyclerview.widget.RecyclerView;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: EventsAwareAdapter.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/d;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$C;", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d extends RecyclerView.Adapter<RecyclerView.C> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f273946c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f273947d = new a();

    /* compiled from: EventsAwareAdapter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/d$a", "Landroidx/recyclerview/widget/RecyclerView$g;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            d.this.f273946c = "onChanged";
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i12, int i13) {
            d.this.f273946c = H.j(i12, i13, "onItemRangeChanged start: ", " count: ");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i12, int i13, @Y61.l Object obj) {
            d.this.f273946c = H.j(i12, i13, "onItemRangeChanged start: ", " count: ");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            d.this.f273946c = H.j(i12, i13, "onItemRangeInserted start: ", " count: ");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i12, int i13) {
            d.this.f273946c = G.e(i12, "onItemRangeMoved start: ", " count: 1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i12, int i13) {
            d.this.f273946c = H.j(i12, i13, "onItemRangeRemoved start: ", " count: ");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@Y61.k RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        registerAdapterDataObserver(this.f273947d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@Y61.k RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.f273947d);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" {item count: ");
        sb2.append(getItemCount());
        if (this.f273946c != null) {
            sb2.append(", last event: ");
            sb2.append(this.f273946c);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
