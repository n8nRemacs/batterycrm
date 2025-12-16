package com.avito.android.guests_selector;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GuestsSelectorItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/j;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f161519b;

    @Inject
    public j(@Y61.k com.avito.konveyor.a aVar) {
        this.f161519b = aVar.Y(com.avito.android.guests_selector.items.swither.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (recyclerView.W(view).getItemViewType() != this.f161519b) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else {
            rect.top = y6.b(13);
            rect.bottom = y6.b(13);
        }
    }
}
