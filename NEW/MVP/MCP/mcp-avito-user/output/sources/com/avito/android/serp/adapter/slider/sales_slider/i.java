package com.avito.android.serp.adapter.slider.sales_slider;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SalesSliderBackgroundView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/i;", "Landroid/widget/FrameLayout;", "", "color", "Lkotlin/G0;", "setBackgroundColor", "(I)V", "offset", "setDefaultTextHorizontalOffset", "", "alpha", "setTextOverlayAlpha", "(F)V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GradientDrawable f272311b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f272312c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f272313d;

    public /* synthetic */ i(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.f272311b.setColor(color);
    }

    public final void setDefaultTextHorizontalOffset(int offset) {
        View view = this.f272312c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = offset;
        view.setLayoutParams(layoutParams);
    }

    public final void setTextOverlayAlpha(float alpha) {
        this.f272313d.setAlpha(alpha);
    }

    @X41.j
    public i(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(0);
        gradientDrawableE.setCornerRadius(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.f272311b = gradientDrawableE;
        setId(View.generateViewId());
        View viewInflate = View.inflate(context, R.layout.serp_sales_slider_background, this);
        this.f272312c = viewInflate.findViewById(R.id.serp_sales_slider_background_left_space);
        this.f272313d = (TextView) viewInflate.findViewById(R.id.serp_sales_slider_background_text);
        viewInflate.findViewById(R.id.serp_sales_slider_background_container).setBackground(gradientDrawableE);
    }
}
