package com.avito.android.service_booking_common.blueprints.date.timeslot_list;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: SbTimeslotListItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/timeslot_list/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f276393b;

    /* renamed from: c, reason: collision with root package name */
    public final int f276394c;

    /* renamed from: d, reason: collision with root package name */
    public final int f276395d;

    /* renamed from: e, reason: collision with root package name */
    public final int f276396e;

    public c(int i12, int i13, int i14) {
        this.f276393b = i12;
        this.f276394c = i13;
        this.f276395d = i14;
        this.f276396e = i14 / 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12 = this.f276394c;
        int i13 = this.f276393b;
        if (i13 == 1) {
            int i14 = this.f276395d;
            rect.set(i12, i14, i12, i14);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        int i15 = bVar != null ? bVar.f53669f : -1;
        boolean z12 = i15 == 0;
        boolean z13 = i15 == i13 - 1;
        int i16 = this.f276396e;
        if (z12) {
            rect.set(i12, i16, i16, i16);
        } else if (z13) {
            rect.set(i16, i16, i12, i16);
        } else {
            rect.set(i16, i16, i16, i16);
        }
    }
}
