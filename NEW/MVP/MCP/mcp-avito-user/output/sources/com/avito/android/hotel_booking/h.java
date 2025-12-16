package com.avito.android.hotel_booking;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelBookingViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/h;", "", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f163598a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MaterialToolbar f163599b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ShimmerLayout f163600c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NestedScrollView f163601d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f163602e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f163603f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f163604g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f163605h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LinearLayout f163606i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinearLayout f163607j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f163608k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f163609l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Button f163610m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Button f163611n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final RecyclerView f163612o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final SpinnerOverlay f163613p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final LinearLayoutManager f163614q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final a f163615r;

    /* compiled from: HotelBookingViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/hotel_booking/h$a", "Landroidx/recyclerview/widget/z;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23434z {
        @Override // androidx.recyclerview.widget.C23434z
        public final int n() {
            return -1;
        }
    }

    public h(@k View view, @k com.avito.konveyor.adapter.d dVar) {
        this.f163598a = view;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        this.f163599b = (MaterialToolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.shimmer);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f163600c = (ShimmerLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        this.f163601d = (NestedScrollView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163602e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163603f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.retry);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f163604g = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.unavailable_action);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f163605h = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.floating_block);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f163606i = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.text_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f163607j = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.booking_price);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163608k = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.booking_description);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163609l = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.booking);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f163610m = (Button) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.booking_redesign);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f163611n = (Button) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.form);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById14;
        this.f163612o = recyclerView;
        View viewFindViewById15 = view.findViewById(R.id.loading_overlay);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.overlay.SpinnerOverlay");
        }
        this.f163613p = (SpinnerOverlay) viewFindViewById15;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.f163614q = linearLayoutManager;
        this.f163615r = new a(view.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dVar);
    }
}
