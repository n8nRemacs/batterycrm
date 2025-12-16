package com.avito.android.service_booking_calendar.flexible.header;

import Y61.k;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MonthCalendarLayoutManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/MonthCalendarLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MonthCalendarLayoutManager extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public final int f275857G;

    /* renamed from: H, reason: collision with root package name */
    public final int f275858H;

    public /* synthetic */ MonthCalendarLayoutManager(Context context, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? 1 : i12);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void l1(int i12) {
        b2(i12, 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z1(@k RecyclerView.z zVar, @k int[] iArr) {
        int i12 = this.f275858H;
        int i13 = this.f275857G;
        iArr[0] = i12 * i13;
        iArr[1] = i12 * i13;
    }

    public MonthCalendarLayoutManager(@k Context context, int i12) {
        this.f275857G = i12;
        this.f275858H = context.getResources().getDimensionPixelSize(R.dimen.flexible_calendar_week_day_item_size_with_paddings);
    }
}
