package com.avito.android.service_booking_schedule_repetition_impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.service_booking_calendar.CalendarView;
import kd0.C42670a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingScheduleRepetitionViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/q;", "", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f277751a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f277752b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C42670a f277753c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CalendarView f277754d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f277755e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_utils.save_schedule_modal.f f277756f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f277757g;

    /* compiled from: ServiceBookingScheduleRepetitionViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = q.this.f277751a.findViewById(R.id.sb_flex_repetition_content);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public q(@Y61.k View view) {
        this.f277751a = view;
        this.f277752b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.sb_flex_repetition_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f277753c = new C42670a((ViewGroup) viewFindViewById, new a(), 0, 4, null);
        this.f277754d = (CalendarView) view.findViewById(R.id.sb_flex_repetition_calendar);
        this.f277755e = (Button) view.findViewById(R.id.sb_flex_repetition_repetition_save);
        this.f277756f = new com.avito.android.service_booking_utils.save_schedule_modal.f(view.getContext());
    }
}
