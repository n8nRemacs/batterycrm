package com.avito.android.advert_stats.item;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.shadow_layout.ShadowLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BarItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/item/g;", "Lcom/avito/android/advert_stats/item/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_stats.item.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28328g extends com.avito.konveyor.adapter.b implements InterfaceC28326e {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f86752o = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f86753b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f86754c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f86755d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f86756e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f86757f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ShadowLayout f86758g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86759h;

    /* renamed from: i, reason: collision with root package name */
    public final int f86760i;

    /* renamed from: j, reason: collision with root package name */
    public final int f86761j;

    /* renamed from: k, reason: collision with root package name */
    public final int f86762k;

    /* renamed from: l, reason: collision with root package name */
    public final int f86763l;

    /* renamed from: m, reason: collision with root package name */
    public final int f86764m;

    /* renamed from: n, reason: collision with root package name */
    public final int f86765n;

    public C28328g(@Y61.k View view) {
        super(view);
        this.f86753b = view;
        Resources resources = view.getResources();
        this.f86754c = resources;
        this.f86755d = view.findViewById(R.id.bar);
        this.f86756e = (TextView) view.findViewById(R.id.value);
        this.f86757f = view.findViewById(R.id.bar_content);
        this.f86758g = (ShadowLayout) view.findViewById(R.id.shadow_layout);
        this.f86760i = R.attr.green400;
        this.f86761j = R.attr.green50;
        this.f86762k = R.attr.blue400;
        this.f86763l = R.attr.blue50;
        this.f86764m = resources.getDimensionPixelSize(R.dimen.gradient_diffusion_top);
        this.f86765n = resources.getDimensionPixelSize(R.dimen.gradient_diffusion_bottom);
    }

    public final Drawable B80(int i12) {
        View view = this.f86753b;
        int iD2 = C35835l0.d(i12, view.getContext());
        Drawable drawable = androidx.core.content.d.getDrawable(view.getContext(), R.drawable.bg_bar);
        if (drawable != null) {
            drawable.setTint(iD2);
        }
        return drawable;
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28326e
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f86753b.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(27, aVar));
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28326e
    public final void f6(int i12, int i13) {
        View view = this.f86755d;
        view.getLayoutParams().width = i12;
        view.getLayoutParams().height = i13;
        view.requestLayout();
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28326e
    public final void p9(@Y61.k BarState barState, boolean z12, float f12) throws Resources.NotFoundException {
        Drawable drawableB80;
        boolean z13 = barState == BarState.f86679c;
        this.f86759h = z13;
        boolean z14 = barState != BarState.f86680d;
        Resources resources = this.f86754c;
        View view = this.f86753b;
        ShadowLayout shadowLayout = this.f86758g;
        if (z13) {
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.shadow_padding);
            D6.f(this.f86757f, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
            D6.H(shadowLayout);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.card_view_padding);
            D6.f(this.f86753b, dimensionPixelSize2, 0, dimensionPixelSize2, 0, 10);
        } else {
            D6.f(this.f86757f, 0, 0, 0, 0, 10);
            D6.f(this.f86753b, 0, 0, 0, 0, 10);
            D6.w(shadowLayout);
        }
        this.f86756e.setTextColor(C35835l0.d(this.f86759h ? R.attr.black : R.attr.gray48, view.getContext()));
        if (z12) {
            drawableB80 = B80(z14 ? R.attr.gray12 : R.attr.gray4);
        } else if (f12 == 1.0f) {
            drawableB80 = B80(z14 ? this.f86760i : this.f86761j);
        } else if (f12 > 0.0f) {
            PaintDrawable paintDrawable = new PaintDrawable();
            float[] fArr = new float[8];
            for (int i12 = 0; i12 < 8; i12++) {
                fArr[i12] = resources.getDimension(R.dimen.corner_radius);
            }
            paintDrawable.setShape(new RoundRectShape(fArr, null, null));
            paintDrawable.setShaderFactory(new C28327f(this, f12, z14));
            drawableB80 = paintDrawable;
        } else {
            drawableB80 = B80(z14 ? this.f86762k : this.f86763l);
        }
        this.f86755d.setBackground(drawableB80);
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28326e
    public final void xd(@Y61.k String str) {
        this.f86756e.setText(str);
    }
}
