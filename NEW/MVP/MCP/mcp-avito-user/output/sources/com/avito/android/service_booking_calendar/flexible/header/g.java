package com.avito.android.service_booking_calendar.flexible.header;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.flexible.header.view.ScheduleInfoPanelView;
import com.avito.android.util.C35835l0;
import com.google.android.material.appbar.MaterialToolbar;
import kd0.C42670a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarHeaderViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/g;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f275908a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f275909b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MaterialToolbar f275910c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f275911d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f275912e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RecyclerView f275913f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f275914g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f275915h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ScheduleInfoPanelView f275916i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C42670a f275917j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final RecyclerView f275918k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final RecyclerView f275919l;

    /* compiled from: CalendarHeaderViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = g.this.f275908a.findViewById(R.id.flexible_calendar_weeks_recycler_view);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public g(@k View view) {
        this.f275908a = view;
        this.f275909b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.flexible_calendar_toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) viewFindViewById;
        this.f275910c = materialToolbar;
        View viewFindViewById2 = view.findViewById(R.id.flexible_calendar_header_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f275911d = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.flexible_calendar_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f275912e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.flexible_calendar_toolbar_actions);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f275913f = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.flexible_calendar_content_root);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f275914g = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.flexible_calendar_header_content_root);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f275915h = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.flexible_calendar_info_panel);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.service_booking_calendar.flexible.header.view.ScheduleInfoPanelView");
        }
        this.f275916i = (ScheduleInfoPanelView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.flexible_calendar_header_content_root);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C42670a c42670a = new C42670a((ViewGroup) viewFindViewById8, new a(), 0, 4, null);
        this.f275917j = c42670a;
        View viewFindViewById9 = view.findViewById(R.id.flexible_calendar_weeks_recycler_view);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f275918k = (RecyclerView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.flexible_calendar_month_recycler_view);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f275919l = (RecyclerView) viewFindViewById10;
        C42670a.d(c42670a);
        Drawable navigationIcon = materialToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(C35835l0.d(R.attr.black, materialToolbar.getContext()));
        }
    }
}
