package com.avito.android.hotel_booking.select_radio;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SelectRadioMarginsItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f163996b = y6.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f163997c = y6.b(16);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        rect.top = RecyclerView.U(view) == 0 ? this.f163997c : this.f163996b;
    }
}
