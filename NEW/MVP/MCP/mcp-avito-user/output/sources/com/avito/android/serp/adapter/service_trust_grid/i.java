package com.avito.android.serp.adapter.service_trust_grid;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ServiceTrustGridItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/service_trust_grid/i;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f272229b = y6.b(8);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        if (recyclerView.W(view) instanceof f) {
            int i13 = this.f272229b / 2;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
            if (itemCount == 0) {
                i12 = 0;
                i13 = 0;
            } else {
                int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
                if (bindingAdapterPosition == 0) {
                    i12 = i13;
                    i13 = 0;
                } else {
                    i12 = bindingAdapterPosition == itemCount ? 0 : i13;
                }
            }
            rect.set(i13, 0, i12, 0);
        }
    }
}
