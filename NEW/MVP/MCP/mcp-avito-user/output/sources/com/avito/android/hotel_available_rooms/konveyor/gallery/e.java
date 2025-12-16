package com.avito.android.hotel_available_rooms.konveyor.gallery;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: HotelRoomGalleryMarginItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/gallery/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f162939b;

    /* renamed from: c, reason: collision with root package name */
    public final int f162940c;

    public e(boolean z12) {
        this.f162939b = z12 ? y6.b(10) : y6.b(16);
        this.f162940c = z12 ? y6.b(1) : y6.b(2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        int iB2 = zVar.b();
        int i12 = this.f162939b;
        if (iB2 == 1) {
            rect.left = i12;
            rect.right = i12;
            return;
        }
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i13 = this.f162940c;
        if (iU2 == 0) {
            rect.left = i12;
            rect.right = i13;
        } else if (iU2 == zVar.b() - 1) {
            rect.right = i12;
        } else {
            rect.right = i13;
        }
    }
}
