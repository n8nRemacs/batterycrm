package com.avito.android.hotel_available_rooms.konveyor;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: HotelRoomFiltersMarginItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f162833b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f162834c = y6.b(6);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (zVar.b() == 1) {
            return;
        }
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i12 = f162834c;
        if (iU2 == 0) {
            rect.left = 0;
            rect.right = i12 / 2;
        } else if (iU2 == zVar.b() - 1) {
            rect.right = 0;
            rect.left = i12 / 2;
        } else {
            int i13 = i12 / 2;
            rect.left = i13;
            rect.right = i13;
        }
    }
}
