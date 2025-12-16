package com.avito.android.service_booking_settings.work_hours;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.google.android.material.appbar.MaterialToolbar;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingWorkHoursViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/w;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MaterialToolbar f278142a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f278143b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f278144c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f278145d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f278146e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C42670a f278147f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f278148g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f278149h;

    /* compiled from: ServiceBookingWorkHoursViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f278150l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f278150l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = this.f278150l.findViewById(R.id.recycler_view);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: ServiceBookingWorkHoursViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/save_schedule_modal/f;", "invoke", "()Lcom/avito/android/service_booking_utils/save_schedule_modal/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.service_booking_utils.save_schedule_modal.f> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f278151l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f278151l = view;
        }

        @Override // Y41.a
        public final com.avito.android.service_booking_utils.save_schedule_modal.f invoke() {
            return new com.avito.android.service_booking_utils.save_schedule_modal.f(this.f278151l.getContext());
        }
    }

    public w(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.progress_placeholder);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.toolbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        this.f278142a = (MaterialToolbar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f278143b = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.button_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f278144c = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.recycler_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f278145d = (RecyclerView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.toast_bar_anchor);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f278146e = viewFindViewById6;
        this.f278147f = new C42670a(viewGroup, new a(view), 0, 4, null);
        this.f278148g = C42727D.b(LazyThreadSafetyMode.f406616d, new b(view));
    }
}
