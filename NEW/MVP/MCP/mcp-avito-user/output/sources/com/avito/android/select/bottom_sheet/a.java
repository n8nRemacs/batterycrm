package com.avito.android.select.bottom_sheet;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: CollapsableChipsDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f265033b;

    public a(@Y61.k Resources resources) {
        this.f265033b = resources.getDimensionPixelOffset(R.dimen.collapsable_chips_horizontal_offset);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (recyclerView.W(view) instanceof com.avito.android.select.collapsable_chips.m) {
            int i12 = this.f265033b;
            rect.left = i12;
            rect.right = i12;
        }
    }
}
