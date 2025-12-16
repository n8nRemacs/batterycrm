package com.avito.android.photo_picker.legacy.thumbnail_list;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PhotoItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/thumbnail_list/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f219884b;

    public b(@Y61.k Resources resources) {
        this.f219884b = resources.getDimensionPixelSize(R.dimen.photo_item_divider_size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (RecyclerView.V(view) == (recyclerView.getAdapter() != null ? r3.getItemCount() : 0) - 1) {
            return;
        }
        rect.right += this.f219884b;
    }
}
