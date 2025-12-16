package com.avito.android.publish.view;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.publish.slots.card_select.item.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DownScrollListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/view/e;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f245644b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k Y41.l<? super k.b, G0> lVar) {
        this.f245644b = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.M1()) : null;
        Integer numValueOf2 = layoutManager != null ? Integer.valueOf(layoutManager.o0()) : null;
        if (numValueOf == null || numValueOf2 == null) {
            return;
        }
        int iIntValue = numValueOf2.intValue() - 1;
        int iIntValue2 = numValueOf.intValue();
        ?? r02 = this.f245644b;
        if (iIntValue2 == iIntValue) {
            r02.invoke(k.b.f243161a);
        } else {
            r02.invoke(null);
        }
    }
}
