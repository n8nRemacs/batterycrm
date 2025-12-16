package com.avito.android.widget_filters.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import kotlin.Metadata;

/* compiled from: WidgetFiltersViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/k;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f330541a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Toolbar f330542b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f330543c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SpinnerOverlay f330544d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ShimmerLayout f330545e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f330546f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f330547g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f330548h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f330549i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f330550j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f330551k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f330552l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f330553m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Chips f330554n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f330555o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f330556p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Space f330557q;

    public k(@Y61.k View view) {
        this.f330541a = view;
        this.f330542b = (Toolbar) view.findViewById(R.id.toolbar);
        this.f330543c = (TextView) view.findViewById(R.id.toolbar_title);
        this.f330544d = (SpinnerOverlay) view.findViewById(R.id.spinner_overlay);
        this.f330545e = (ShimmerLayout) view.findViewById(R.id.shimmer_layout);
        this.f330546f = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f330547g = view.findViewById(R.id.error_layout);
        this.f330548h = (ImageView) view.findViewById(R.id.error_iv);
        this.f330549i = (TextView) view.findViewById(R.id.error_title_tv);
        this.f330550j = (TextView) view.findViewById(R.id.error_subtitle_tv);
        this.f330551k = (Button) view.findViewById(R.id.error_retry_btn);
        this.f330552l = view.findViewById(R.id.footer_layout);
        this.f330553m = (TextView) view.findViewById(R.id.footer_hint_tv);
        this.f330554n = (Chips) view.findViewById(R.id.flex_search_chips);
        this.f330555o = (Button) view.findViewById(R.id.footer_reset_btn);
        this.f330556p = (Button) view.findViewById(R.id.footer_action_btn);
        this.f330557q = (Space) view.findViewById(R.id.footer_buttons_space);
    }
}
