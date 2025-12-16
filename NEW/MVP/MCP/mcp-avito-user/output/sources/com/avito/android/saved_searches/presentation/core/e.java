package com.avito.android.saved_searches.presentation.core;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SavedSearchItemsOffsetsDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/core/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final e f258402b = new e();

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        rect.left = y6.b(16);
        rect.right = y6.b(16);
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof com.avito.android.saved_searches.presentation.items.header.e ? true : cW2 instanceof com.avito.android.saved_searches.presentation.items.skeletons.header_skeleton.e) {
            rect.top = y6.b(32);
            return;
        }
        if (cW2 instanceof com.avito.android.saved_searches.presentation.items.name.e ? true : cW2 instanceof com.avito.android.saved_searches.presentation.items.skeletons.name_skeleton.e) {
            rect.top = y6.b(24);
            rect.bottom = y6.b(51);
        } else if (cW2 instanceof com.avito.android.saved_searches.presentation.items.skeletons.settings_skeleton.e) {
            rect.top = y6.b(12);
        } else if (cW2 instanceof com.avito.android.saved_searches.presentation.items.chips.j) {
            rect.top = y6.b(20);
        }
    }
}
