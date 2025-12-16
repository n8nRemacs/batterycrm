package com.avito.android.bundles.ui.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DiscountView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/bundles/ui/view/DiscountView;", "Landroid/view/View;", "", "color", "Lkotlin/G0;", "setDiscountBackgroundColor", "(I)V", "", "value", "b", "Ljava/lang/String;", "getDiscountTitle", "()Ljava/lang/String;", "setDiscountTitle", "(Ljava/lang/String;)V", "discountTitle", "a", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiscountView extends View {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public String discountTitle;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f108443c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f108444d;

    /* renamed from: e, reason: collision with root package name */
    public final float f108445e;

    /* renamed from: f, reason: collision with root package name */
    public final int f108446f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RectF f108447g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final RectF f108448h;

    /* compiled from: DiscountView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/bundles/ui/view/DiscountView$a;", "", "<init>", "()V", "", "BACKGROUND_SQUARE_ROTATE_DEGREE", "F", "TEXT_SQUARE_ROTATE_DEGREE", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @j
    public DiscountView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @l
    public final String getDiscountTitle() {
        return this.discountTitle;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        RectF rectF = this.f108447g;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f12 = this.f108445e;
        rectF.left = f12;
        rectF.top = f12;
        rectF.right = fWidth + f12;
        rectF.bottom = f12 + fHeight;
        canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
        canvas.drawRect(rectF, this.f108443c);
        canvas.restore();
        String str = this.discountTitle;
        if (str != null) {
            canvas.save();
            RectF rectF2 = this.f108448h;
            canvas.rotate(-45.0f, rectF2.centerX(), rectF2.centerY());
            canvas.drawText(str, rectF2.centerX(), rectF2.centerY() + this.f108446f, this.f108444d);
            canvas.restore();
            G0 g02 = G0.f406611a;
        }
    }

    public final void setDiscountBackgroundColor(int color) {
        this.f108443c.setColor(color);
        invalidate();
    }

    public final void setDiscountTitle(@l String str) {
        this.discountTitle = str;
        invalidate();
    }

    public DiscountView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws Resources.NotFoundException {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.f108443c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(C35835l0.d(R.attr.constantWhite, context));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(getResources().getDimension(R.dimen.discount_view_text_size));
        this.f108444d = paint2;
        float dimension = getResources().getDimension(R.dimen.discount_view_background_square_size);
        this.f108445e = -getResources().getDimension(R.dimen.discount_view_background_square_shift);
        float dimension2 = getResources().getDimension(R.dimen.discount_view_text_square_size);
        this.f108446f = getResources().getDimensionPixelSize(R.dimen.discount_view_text_bottom_padding);
        this.f108447g = new RectF(0.0f, 0.0f, dimension, dimension);
        this.f108448h = new RectF(0.0f, 0.0f, dimension2, dimension2);
    }
}
