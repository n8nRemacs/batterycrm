package com.avito.android.photo_gallery.grid_gallery;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: GridGalleryView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/v;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f217435b;

    public v(y yVar) {
        this.f217435b = yVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        if (i12 == 0) {
            y yVar = this.f217435b;
            if (yVar.f217453n) {
                y.a(yVar);
                yVar.f217445f.post(new o(yVar, 1));
                yVar.f217453n = false;
            }
        }
    }
}
