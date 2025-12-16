package com.avito.android.str_calendar.seller.calendar;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import xy0.AbstractC50022b;

/* compiled from: SellerCalendarRecyclerViewDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/a;", "Lxy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC50022b {
    public a() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        View viewFindViewById = view.findViewById(R.id.text_view_container);
        if (viewFindViewById == null) {
            return;
        }
        int i12 = i(view);
        c(i12, rect);
        e(view, viewFindViewById, R.id.secondary_background_view, i12);
        e(view, viewFindViewById, R.id.background_view, i12);
    }
}
