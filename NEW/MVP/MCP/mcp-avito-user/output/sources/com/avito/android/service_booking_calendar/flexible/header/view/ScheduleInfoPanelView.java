package com.avito.android.service_booking_calendar.flexible.header.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ScheduleInfoPanelView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/view/ScheduleInfoPanelView;", "Landroid/widget/LinearLayout;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScheduleInfoPanelView extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f276095h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f276096b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f276097c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f276098d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewGroup f276099e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ViewGroup f276100f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f276101g;

    @j
    public ScheduleInfoPanelView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScheduleInfoPanelView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_schedule_info_panel, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.schedule_panel_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276096b = (TextView) viewFindViewById;
        this.f276101g = (TextView) viewInflate.findViewById(R.id.schedule_break_time);
        View viewFindViewById2 = viewInflate.findViewById(R.id.schedule_panel_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276097c = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.schedule_panel_action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f276098d = (Button) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.schedule_info_panel_loaded_root);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f276099e = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.schedule_info_panel_skeleton_root);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f276100f = (ViewGroup) viewFindViewById5;
    }
}
