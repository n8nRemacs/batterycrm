package com.avito.android.advert_stats.detail.tab.items.chart;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_stats.item.BarState;
import com.avito.android.lib.design.shadow_layout.ShadowLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StatsBarItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/j;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f86310p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f86311b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f86312c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f86313d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f86314e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f86315f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f86316g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ShadowLayout f86317h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f86318i;

    /* renamed from: j, reason: collision with root package name */
    public final int f86319j;

    /* renamed from: k, reason: collision with root package name */
    public final int f86320k;

    /* renamed from: l, reason: collision with root package name */
    public final int f86321l;

    /* renamed from: m, reason: collision with root package name */
    public final int f86322m;

    /* renamed from: n, reason: collision with root package name */
    public final int f86323n;

    /* renamed from: o, reason: collision with root package name */
    public final int f86324o;

    public j(@Y61.k View view) {
        super(view);
        this.f86311b = view;
        Resources resources = view.getResources();
        this.f86312c = resources;
        this.f86313d = view.findViewById(R.id.fl_bar);
        this.f86314e = (TextView) view.findViewById(R.id.tv_bar_description);
        this.f86315f = (TextView) view.findViewById(R.id.tv_bar_value);
        this.f86316g = view.findViewById(R.id.ll_bar_content);
        this.f86317h = (ShadowLayout) view.findViewById(R.id.sl_shadow_layout);
        this.f86319j = R.attr.green400;
        this.f86320k = R.attr.green50;
        this.f86321l = R.attr.blue400;
        this.f86322m = R.attr.blue50;
        this.f86323n = resources.getDimensionPixelSize(R.dimen.gradient_diffusion_top);
        this.f86324o = resources.getDimensionPixelSize(R.dimen.gradient_diffusion_bottom);
    }

    public final Drawable B80(int i12) {
        View view = this.f86311b;
        int iD2 = C35835l0.d(i12, view.getContext());
        Drawable drawable = androidx.core.content.d.getDrawable(view.getContext(), R.drawable.bg_bar);
        if (drawable != null) {
            drawable.setTint(iD2);
        }
        return drawable;
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.h
    public final void JX(boolean z12) {
        this.f86314e.setTypeface(null, z12 ? 1 : 0);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.h
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f86311b.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(26, aVar));
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.h
    public final void f6(int i12, int i13) {
        View view = this.f86313d;
        view.getLayoutParams().width = i12;
        view.getLayoutParams().height = i13;
        view.requestLayout();
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.h
    public final void p9(@Y61.k BarState barState, boolean z12, float f12) throws Resources.NotFoundException {
        Drawable drawableB80;
        boolean z13 = barState == BarState.f86679c;
        this.f86318i = z13;
        BarState barState2 = BarState.f86680d;
        boolean z14 = barState != barState2;
        Resources resources = this.f86312c;
        View view = this.f86311b;
        ShadowLayout shadowLayout = this.f86317h;
        if (z13) {
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.shadow_padding);
            D6.f(this.f86316g, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
            D6.H(shadowLayout);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.card_view_padding);
            D6.f(this.f86311b, dimensionPixelSize2, 0, dimensionPixelSize2, 0, 10);
        } else {
            D6.f(this.f86316g, 0, 0, 0, 0, 10);
            D6.f(this.f86311b, 0, 0, 0, 0, 10);
            D6.w(shadowLayout);
        }
        int i12 = barState != barState2 ? R.attr.black : R.attr.gray48;
        this.f86315f.setTextColor(C35835l0.d(i12, view.getContext()));
        this.f86314e.setTextColor(C35835l0.d(i12, view.getContext()));
        if (z12) {
            drawableB80 = B80(z14 ? R.attr.gray12 : R.attr.gray4);
        } else if (f12 == 1.0f) {
            drawableB80 = B80(z14 ? this.f86319j : this.f86320k);
        } else if (f12 > 0.0f) {
            PaintDrawable paintDrawable = new PaintDrawable();
            float[] fArr = new float[8];
            for (int i13 = 0; i13 < 8; i13++) {
                fArr[i13] = resources.getDimension(R.dimen.corner_radius);
            }
            paintDrawable.setShape(new RoundRectShape(fArr, null, null));
            paintDrawable.setShaderFactory(new i(this, f12, z14));
            drawableB80 = paintDrawable;
        } else {
            drawableB80 = B80(z14 ? this.f86321l : this.f86322m);
        }
        this.f86313d.setBackground(drawableB80);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.h
    public final void ts(@Y61.k String str) {
        this.f86314e.setText(str);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.h
    public final void xd(@Y61.k String str) {
        this.f86315f.setText(str);
    }
}
