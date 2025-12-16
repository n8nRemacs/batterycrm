package com.avito.android.service_booking_day_settings.daysettings;

import android.app.Dialog;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.switcher.Switcher;
import com.google.android.material.appbar.MaterialToolbar;
import kd0.C42670a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DaySettingsViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/h;", "", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f276871a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MaterialToolbar f276872b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f276873c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f276874d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f276875e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f276876f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f276877g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Switcher f276878h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f276879i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f276880j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f276881k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f276882l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final NestedScrollView f276883m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f276884n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Input f276885o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Input f276886p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f276887q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f276888r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_utils.save_schedule_modal.f f276889s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Dialog f276890t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C42670a f276891u;

    /* compiled from: DaySettingsViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = h.this.f276871a.findViewById(R.id.settings_view_content);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public h(@Y61.k View view) {
        this.f276871a = view;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        this.f276872b = (MaterialToolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.button_save);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f276873c = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.button_repeats);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f276874d = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.bottom_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f276875e = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.view_for_toast_success);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f276876f = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.workday_tv);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276877g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.work_day_switcher);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f276878h = (Switcher) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.day_info_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f276881k = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.time_inputs_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f276882l = (ComponentContainer) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.settings_nested);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        this.f276883m = (NestedScrollView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.schedule_tv);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276884n = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.time_input_start);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f276885o = (Input) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.time_input_end);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f276886p = (Input) viewFindViewById13;
        this.f276887q = (ViewGroup) view.findViewById(R.id.add_break_container);
        View viewFindViewById14 = view.findViewById(R.id.offer_tv);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById14;
        this.f276888r = textView;
        this.f276889s = new com.avito.android.service_booking_utils.save_schedule_modal.f(view.getContext());
        View viewFindViewById15 = view.findViewById(R.id.settings_view_layout);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f276891u = new C42670a((ViewGroup) viewFindViewById15, new a(), 0, 4, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
