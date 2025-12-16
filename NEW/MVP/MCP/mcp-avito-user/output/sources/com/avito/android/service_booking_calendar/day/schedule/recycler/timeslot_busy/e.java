package com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy;

import Y61.k;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.avito.android.R;
import com.avito.android.serp.adapter.serp_advert_card.i;
import com.avito.android.service_booking_calendar.day.schedule.view.TimeSlotView;
import com.avito.android.service_booking_calendar.domain.TimeSlotItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.ranges.l;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: BusyTimeSlotItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/recycler/timeslot_busy/e;", "Lcom/avito/android/service_booking_calendar/day/schedule/recycler/timeslot_busy/c;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f275429b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f275430c;

    @Inject
    public e() {
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f275429b = e2VarB;
        this.f275430c = e2VarB;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) throws Resources.NotFoundException {
        d dVar;
        g gVar = (g) eVar;
        TimeSlotItem.BusyTimeSlotItem busyTimeSlotItem = (TimeSlotItem.BusyTimeSlotItem) aVar;
        d dVar2 = new d(this, busyTimeSlotItem);
        int i13 = busyTimeSlotItem.f275513e;
        int i14 = busyTimeSlotItem.f275519k;
        int i15 = i13 + i14;
        gVar.f275435d = i15;
        gVar.f275436e = busyTimeSlotItem.f275511c;
        TimeSlotView.LayoutType layoutType = i13 != 1 ? i13 != 2 ? TimeSlotView.LayoutType.f275474d : TimeSlotView.LayoutType.f275473c : TimeSlotView.LayoutType.f275472b;
        List<String> list = busyTimeSlotItem.f275515g;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        TimeSlotView timeSlotView = gVar.f275434c;
        timeSlotView.getClass();
        int iOrdinal = layoutType.ordinal();
        String str = busyTimeSlotItem.f275512d;
        Group group = timeSlotView.f275470m;
        Group group2 = timeSlotView.f275469l;
        Group group3 = timeSlotView.f275468k;
        if (iOrdinal != 0) {
            String str2 = busyTimeSlotItem.f275517i;
            TextView textView = timeSlotView.f275465h;
            TextView textView2 = timeSlotView.f275464g;
            dVar = dVar2;
            if (iOrdinal == 1) {
                timeSlotView.b(R.dimen.view_timeslot_type_margin_expanded, layoutType);
                textView2.setText(str);
                textView.setText(str2);
                D6.w(group3);
                D6.G(group2, true);
                D6.w(group);
            } else if (iOrdinal == 2) {
                textView2.setText(str);
                textView.setText(str2);
                timeSlotView.f275467j.setText(busyTimeSlotItem.f275516h);
                int dimensionPixelSize = timeSlotView.getContext().getResources().getDimensionPixelSize(R.dimen.day_schedule_service_lin_extra_spacing);
                ViewGroup viewGroup = timeSlotView.f275466i;
                viewGroup.removeAllViews();
                int i16 = R.attr.textS1;
                if (i13 == 3 && list.size() > 1) {
                    com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(timeSlotView.getContext(), null, 0, 0, 14, null);
                    aVar2.setText(aVar2.getContext().getResources().getQuantityString(R.plurals.timeslot_services_count, list.size(), Integer.valueOf(list.size())));
                    aVar2.setTextAppearance(C35835l0.j(R.attr.textS1, aVar2.getContext()));
                    aVar2.setMaxLines(1);
                    aVar2.setEllipsize(TextUtils.TruncateAt.END);
                    aVar2.setPadding(0, dimensionPixelSize, 0, 0);
                    viewGroup.addView(aVar2, new ViewGroup.LayoutParams(-1, -2));
                } else if (i13 != 4 || list.size() <= 2) {
                    for (String str3 : list) {
                        com.avito.android.lib.design.text_view.a aVar3 = new com.avito.android.lib.design.text_view.a(timeSlotView.getContext(), null, 0, 0, 14, null);
                        aVar3.setText(str3);
                        aVar3.setTextAppearance(C35835l0.j(R.attr.textS1, aVar3.getContext()));
                        aVar3.setMaxLines(1);
                        aVar3.setEllipsize(TextUtils.TruncateAt.END);
                        aVar3.setPadding(0, dimensionPixelSize, 0, 0);
                        viewGroup.addView(aVar3, new ViewGroup.LayoutParams(-1, -2));
                    }
                } else {
                    kotlin.ranges.k it = new l(0, 1, 1).iterator();
                    while (it.f406910d) {
                        int iA2 = it.a();
                        com.avito.android.lib.design.text_view.a aVar4 = new com.avito.android.lib.design.text_view.a(timeSlotView.getContext(), null, 0, 0, 14, null);
                        aVar4.setText((CharSequence) list.get(iA2));
                        aVar4.setTextAppearance(C35835l0.j(i16, aVar4.getContext()));
                        aVar4.setMaxLines(1);
                        aVar4.setEllipsize(TextUtils.TruncateAt.END);
                        aVar4.setPadding(0, dimensionPixelSize, 0, 0);
                        viewGroup.addView(aVar4, new ViewGroup.LayoutParams(-1, -2));
                        i16 = R.attr.textS1;
                    }
                    com.avito.android.lib.design.text_view.a aVar5 = new com.avito.android.lib.design.text_view.a(timeSlotView.getContext(), null, 0, 0, 14, null);
                    aVar5.setText(aVar5.getContext().getResources().getQuantityString(R.plurals.timeslot_services_more_count, list.size() - 2, Integer.valueOf(list.size() - 2)));
                    aVar5.setTextAppearance(C35835l0.j(R.attr.textS1, aVar5.getContext()));
                    aVar5.setMaxLines(1);
                    aVar5.setEllipsize(TextUtils.TruncateAt.END);
                    aVar5.setPadding(0, dimensionPixelSize, 0, 0);
                    viewGroup.addView(aVar5, new ViewGroup.LayoutParams(-1, -2));
                }
                timeSlotView.b(R.dimen.view_timeslot_type_margin_expanded, layoutType);
                D6.w(group3);
                D6.G(group2, true);
                D6.G(group, true);
            }
        } else {
            dVar = dVar2;
            timeSlotView.b(R.dimen.view_timeslot_type_margin_only_title, layoutType);
            timeSlotView.f275463f.setText(str);
            D6.G(group3, true);
            D6.w(group2);
            D6.w(group);
        }
        ViewGroup viewGroup2 = timeSlotView.f275462e;
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        int i17 = timeSlotView.f275459b;
        layoutParams.height = i15 * i17;
        viewGroup2.setLayoutParams(layoutParams);
        View view = timeSlotView.f275471n;
        if (i14 == 0) {
            D6.w(view);
        } else {
            D6.G(view, true);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = i14 * i17;
            view.setLayoutParams(layoutParams2);
        }
        timeSlotView.setAppearance(busyTimeSlotItem.f275514f.f275525b);
        timeSlotView.setOnClickListener(new i(24, dVar));
    }

    @Override // com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.c
    @k
    /* renamed from: g6, reason: from getter */
    public final e2 getF275430c() {
        return this.f275430c;
    }
}
