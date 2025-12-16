package com.yandex.div.core.state;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: UpdateStateScrollListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/state/q;", "Landroidx/recyclerview/widget/RecyclerView$r;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class q extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f367675b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f367676c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.m f367677d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@Y61.k String str, @Y61.k k kVar, @Y61.k com.yandex.div.core.view2.divs.gallery.c cVar) {
        this.f367675b = str;
        this.f367676c = kVar;
        this.f367677d = (RecyclerView.m) cVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.recyclerview.widget.RecyclerView$m, com.yandex.div.core.view2.divs.gallery.c] */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        int left;
        int paddingLeft;
        ?? r42 = this.f367677d;
        int iF2 = r42.f();
        int i14 = 0;
        RecyclerView.C cQ2 = recyclerView.Q(iF2, false);
        if (cQ2 != null) {
            if (r42.n() == 1) {
                left = cQ2.itemView.getTop();
                paddingLeft = r42.getView().getPaddingTop();
            } else {
                left = cQ2.itemView.getLeft();
                paddingLeft = r42.getView().getPaddingLeft();
            }
            i14 = left - paddingLeft;
        }
        this.f367676c.f367667b.put(this.f367675b, new l(iF2, i14));
    }
}
