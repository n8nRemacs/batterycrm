package com.avito.android.change_specific.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SpecificsItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/adapter/u;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f117916b = y6.b(0);

    /* renamed from: c, reason: collision with root package name */
    public final int f117917c = y6.b(20);

    /* renamed from: d, reason: collision with root package name */
    public final int f117918d = y6.b(36);

    /* renamed from: e, reason: collision with root package name */
    public final int f117919e;

    @Inject
    public u(@Y61.k com.avito.konveyor.a aVar) {
        this.f117919e = aVar.Y(k.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int iU2 = RecyclerView.U(view);
        int itemViewType = adapter.getItemViewType(iU2);
        rect.bottom = iU2 == adapter.getItemCount() + (-1) ? this.f117918d : y6.b(0);
        int i12 = this.f117919e;
        if (i12 != itemViewType) {
            return;
        }
        rect.top = (iU2 != 0 && adapter.getItemViewType(iU2 + (-1)) == i12) ? this.f117916b : iU2 != 0 ? this.f117917c : y6.b(0);
    }
}
