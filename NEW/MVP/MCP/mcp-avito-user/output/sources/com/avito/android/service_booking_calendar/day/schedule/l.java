package com.avito.android.service_booking_calendar.day.schedule;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kd0.C42670a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DayScheduleViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/l;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f275383a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f275384b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C42670a f275385c;

    /* compiled from: DayScheduleViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = l.this.f275383a.findViewById(R.id.day_schedule_content);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public l(@Y61.k View view) {
        this.f275383a = view;
        View viewFindViewById = view.findViewById(R.id.day_schedule_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f275384b = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.day_schedule_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C42670a c42670a = new C42670a((ViewGroup) viewFindViewById2, new a(), 0, 4, null);
        this.f275385c = c42670a;
        C42670a.d(c42670a);
    }
}
