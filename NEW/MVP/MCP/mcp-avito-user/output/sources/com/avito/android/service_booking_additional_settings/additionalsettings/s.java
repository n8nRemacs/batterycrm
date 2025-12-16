package com.avito.android.service_booking_additional_settings.additionalsettings;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.spinner.Spinner;
import com.google.android.material.appbar.MaterialToolbar;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingAdditionalSettingsViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/s;", "", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f275111a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f275112b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f275113c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f275114d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f275115e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C42670a f275116f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f275117g;

    /* compiled from: ServiceBookingAdditionalSettingsViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f275118l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f275118l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f275118l.findViewById(R.id.agreement_tv);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f275119l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f275119l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f275119l.findViewById(R.id.link_help_textview);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/spinner/Spinner;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Spinner> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f275120l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f275120l = view;
        }

        @Override // Y41.a
        public final Spinner invoke() {
            View viewFindViewById = this.f275120l.findViewById(R.id.load_spinner);
            if (viewFindViewById != null) {
                return (Spinner) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f275121l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(0);
            this.f275121l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = this.f275121l.findViewById(R.id.additional_settings_container);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<RecyclerView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f275122l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.f275122l = view;
        }

        @Override // Y41.a
        public final RecyclerView invoke() {
            View viewFindViewById = this.f275122l.findViewById(R.id.srv_settings_rv);
            if (viewFindViewById != null) {
                return (RecyclerView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/material/appbar/MaterialToolbar;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<MaterialToolbar> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f275123l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(0);
            this.f275123l = view;
        }

        @Override // Y41.a
        public final MaterialToolbar invoke() {
            View viewFindViewById = this.f275123l.findViewById(R.id.toolbar);
            if (viewFindViewById != null) {
                return (MaterialToolbar) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
    }

    public s(@Y61.k View view) {
        this.f275111a = C42727D.c(new f(view));
        this.f275112b = C42727D.c(new b(view));
        this.f275113c = C42727D.c(new c(view));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new a(view));
        this.f275114d = interfaceC42726CC;
        this.f275115e = C42727D.c(new e(view));
        View viewFindViewById = view.findViewById(R.id.additional_view_content_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f275116f = new C42670a((ViewGroup) viewFindViewById, new d(view), 0, 4, null);
        ((TextView) interfaceC42726CC.getValue()).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
