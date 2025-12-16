package com.avito.android.service_booking_settings.work_hours.item.schedule_period;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingSchedulePeriodItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/schedule_period/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_booking_settings/work_hours/item/schedule_period/h;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f278034e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f278035b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f278036c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f278037d;

    /* compiled from: ServiceBookingSchedulePeriodItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<TextView> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = i.this.f278035b.findViewById(R.id.sb_schedule_period_title);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public i(@k View view) {
        super(view);
        this.f278035b = view;
        Input input = (Input) view.findViewById(R.id.sb_schedule_period_select);
        input.setClearButton(false);
        this.f278036c = input;
        this.f278037d = C42727D.b(LazyThreadSafetyMode.f406616d, new a());
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule_period.h
    public final void QE(@k Y41.a<G0> aVar) {
        this.f278036c.setClearButtonClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(5, aVar));
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule_period.h
    public final void iq(@l SchedulePeriod.ScheduleOptionsItem scheduleOptionsItem) {
        Input.t(this.f278036c, scheduleOptionsItem != null ? scheduleOptionsItem.f278064d : null, false, 6);
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule_period.h
    public final void setEnabled(boolean z12) {
        D6.F(this.f278035b, z12);
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule_period.h
    public final void setHint(@l String str) {
        this.f278036c.setHint(str);
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule_period.h
    public final void setInputClickListener(@k Y41.a<G0> aVar) {
        this.f278036c.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(6, aVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule_period.h
    public final void setTitle(@l String str) {
        I5.a((TextView) this.f278037d.getValue(), str, false);
    }
}
