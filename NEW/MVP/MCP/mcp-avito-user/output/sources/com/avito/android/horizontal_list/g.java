package com.avito.android.horizontal_list;

import Y61.k;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: HorizontalListWidgetItemViewImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/horizontal_list/g;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f162570b;

    public g(h hVar) {
        this.f162570b = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        d dVar;
        Parcelable parcelableL1;
        if (i12 != 0 || (dVar = this.f162570b.f162575f) == null || (parcelableL1 = dVar.f162566a.l1()) == null) {
            return;
        }
        dVar.f162567b.f162569b.b(parcelableL1, dVar.f162568c.f162544h);
    }
}
