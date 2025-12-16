package com.avito.android.ui.widget.tagged_input;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ItemMarginDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f304703b;

    public a(int i12) {
        this.f304703b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (recyclerView.getAdapter() == null) {
            return;
        }
        int iV2 = RecyclerView.V(view);
        int i12 = this.f304703b;
        if (iV2 != 0) {
            rect.left = i12;
        }
        if (iV2 != r3.getItemCount() - 1) {
            rect.right = i12;
        }
    }
}
