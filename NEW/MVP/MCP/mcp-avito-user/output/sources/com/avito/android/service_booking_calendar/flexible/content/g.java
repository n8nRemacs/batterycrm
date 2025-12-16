package com.avito.android.service_booking_calendar.flexible.content;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.google.android.material.appbar.MaterialToolbar;
import kd0.C42670a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarContentViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/content/g;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f275644a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MaterialToolbar f275645b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C42670a f275646c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f275647d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewGroup f275648e;

    /* compiled from: CalendarContentViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = g.this.f275644a.findViewById(R.id.flexible_calendar_content);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public g(@k View view) {
        this.f275644a = view;
        view.getContext();
        View viewFindViewById = view.findViewById(R.id.flexible_calendar_progress_overlay_toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) viewFindViewById;
        this.f275645b = materialToolbar;
        View viewFindViewById2 = view.findViewById(R.id.flexible_calendar_content_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C42670a c42670a = new C42670a((ViewGroup) viewFindViewById2, new a(), 0, 4, null);
        this.f275646c = c42670a;
        View viewFindViewById3 = view.findViewById(R.id.calendar_today_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f275647d = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.calendar_day_schedule);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f275648e = (ViewGroup) viewFindViewById4;
        C42670a.d(c42670a);
        Drawable navigationIcon = materialToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(C35835l0.d(R.attr.black, materialToolbar.getContext()));
        }
    }
}
