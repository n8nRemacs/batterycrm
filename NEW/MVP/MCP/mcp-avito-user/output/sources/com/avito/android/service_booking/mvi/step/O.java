package com.avito.android.service_booking.mvi.step;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.beduin.v2.render.android_view.BeduinView;
import com.google.android.material.appbar.MaterialToolbar;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingMviStepViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/O;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f274448a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f274449b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f274450c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f274451d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f274452e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking.error_titled_view.e f274453f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C42670a f274454g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Object f274455h;

    /* compiled from: ServiceBookingMviStepViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/beduin/v2/render/android_view/BeduinView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<BeduinView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f274456l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ cU.s f274457m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, cU.s sVar) {
            super(0);
            this.f274456l = view;
            this.f274457m = sVar;
        }

        @Override // Y41.a
        public final BeduinView invoke() {
            View viewFindViewById = this.f274456l.findViewById(R.id.beduin_view);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.beduin.v2.render.android_view.BeduinView");
            }
            BeduinView beduinView = (BeduinView) viewFindViewById;
            cU.s sVar = this.f274457m;
            com.avito.beduin.v2.render.android_view.A aB2 = sVar.b();
            com.avito.beduin.v2.theme.k kVarA = sVar.a();
            beduinView.f337913c = aB2;
            beduinView.f337914d = kVarA;
            return beduinView;
        }
    }

    /* compiled from: ServiceBookingMviStepViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f274458l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f274458l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = this.f274458l.findViewById(R.id.sb_step_container);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: ServiceBookingMviStepViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Button> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f274459l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f274459l = view;
        }

        @Override // Y41.a
        public final Button invoke() {
            View viewFindViewById = this.f274459l.findViewById(R.id.sb_next_step_btn);
            if (viewFindViewById != null) {
                return (Button) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
    }

    /* compiled from: ServiceBookingMviStepViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f274460l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(0);
            this.f274460l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = this.f274460l.findViewById(R.id.service_booking_step_wrapper);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: ServiceBookingMviStepViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<RecyclerView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f274461l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.f274461l = view;
        }

        @Override // Y41.a
        public final RecyclerView invoke() {
            View viewFindViewById = this.f274461l.findViewById(R.id.sb_recycler_view);
            if (viewFindViewById != null) {
                return (RecyclerView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
    }

    /* compiled from: ServiceBookingMviStepViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Button> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f274462l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(0);
            this.f274462l = view;
        }

        @Override // Y41.a
        public final Button invoke() {
            View viewFindViewById = this.f274462l.findViewById(R.id.sb_return_btn);
            if (viewFindViewById != null) {
                return (Button) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
    }

    /* compiled from: ServiceBookingMviStepViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/material/appbar/MaterialToolbar;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<MaterialToolbar> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f274463l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view) {
            super(0);
            this.f274463l = view;
        }

        @Override // Y41.a
        public final MaterialToolbar invoke() {
            View viewFindViewById = this.f274463l.findViewById(R.id.sb_toolbar);
            if (viewFindViewById != null) {
                return (MaterialToolbar) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
    }

    public O(@Y61.k View view, @Y61.k cU.s sVar) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f274448a = C42727D.b(lazyThreadSafetyMode, new g(view));
        this.f274449b = C42727D.b(lazyThreadSafetyMode, new c(view));
        this.f274450c = C42727D.b(lazyThreadSafetyMode, new f(view));
        this.f274451d = C42727D.b(lazyThreadSafetyMode, new e(view));
        this.f274452e = C42727D.b(lazyThreadSafetyMode, new b(view));
        this.f274453f = new com.avito.android.service_booking.error_titled_view.e(view);
        View viewFindViewById = view.findViewById(R.id.service_booking_fragment_mvi_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f274454g = new C42670a((ViewGroup) viewFindViewById, new d(view), 0, 4, null);
        this.f274455h = C42727D.b(lazyThreadSafetyMode, new a(view, sVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Y61.k
    public final MaterialToolbar a() {
        return (MaterialToolbar) this.f274448a.getValue();
    }
}
