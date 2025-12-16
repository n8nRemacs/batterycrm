package com.avito.android.service_booking_calendar.view.day.redesign;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.view.day.DayItemContent;
import com.avito.android.service_booking_calendar.view.day.d;
import com.avito.android.service_booking_calendar.view.day.i;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: CalendarCellViewRedesignedImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/redesign/c;", "Lcom/avito/android/service_booking_calendar/view/day/i;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f276211g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f276212b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f276213c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f276214d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f276215e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f276216f;

    public c(@k View view) {
        super(view);
        this.f276212b = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276213c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.day_group);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f276214d = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text_background);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f276215e = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.dot);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f276216f = viewFindViewById4;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.i
    public final void OT(@k Y41.a<G0> aVar) {
        this.f276215e.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(27, aVar));
    }

    @Override // com.avito.android.service_booking_calendar.view.day.i
    public final void lI(@k d dVar) {
        boolean z12 = dVar instanceof d.a;
        View view = this.f276214d;
        if (!z12) {
            if (dVar instanceof d.c) {
                D6.w(view);
                return;
            }
            return;
        }
        D6.H(view);
        DayItemContent dayItemContent = ((d.a) dVar).f276190c;
        String f276203a = dayItemContent.getF277635a();
        TextView textView = this.f276213c;
        textView.setText(f276203a);
        View view2 = this.f276212b;
        Context context = view2.getContext();
        boolean f276207e = dayItemContent.getF277639e();
        int i12 = R.attr.black;
        textView.setTextColor(C35835l0.d(f276207e ? R.attr.white : dayItemContent.getF277637c() == DayItemContent.DayType.f276171b ? R.attr.gray36 : dayItemContent.getF277637c() == DayItemContent.DayType.f276173d ? R.attr.gray54 : R.attr.black, context));
        Context context2 = view2.getContext();
        if (dayItemContent.getF277639e() && dayItemContent.getF277636b() != DayItemContent.EventType.f276176b) {
            i12 = R.attr.white;
        } else if (dayItemContent.getF277636b() != DayItemContent.EventType.f276178d) {
            i12 = dayItemContent.getF277636b() == DayItemContent.EventType.f276177c ? R.attr.gray36 : dayItemContent.getF277636b() == DayItemContent.EventType.f276179e ? R.attr.orange800 : R.attr.transparentWhite;
        }
        this.f276216f.setBackgroundTintList(C35835l0.e(i12, context2));
        this.f276215e.setBackground(C43852a.a(view2.getContext(), dayItemContent.getF277639e() ? R.drawable.day_focused_bg : dayItemContent.getF277638d() == DayItemContent.HighlightType.f276182b ? R.drawable.day_border_re23 : R.drawable.day_bg));
    }
}
