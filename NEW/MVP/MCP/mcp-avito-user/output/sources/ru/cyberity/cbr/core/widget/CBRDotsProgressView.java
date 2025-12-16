package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.C22026a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.ExtensionsKt;

/* compiled from: CBRDotsProgressView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR*\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRDotsProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "w", "h", "oldw", "oldh", "Lkotlin/G0;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "completePaint", "Landroid/graphics/Paint;", "dotPaint", "dotRadius", "I", "minGap", "value", "progress", "getProgress", "()I", "setProgress", "(I)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRDotsProgressView extends View {

    @k
    private final Paint completePaint;

    @k
    private final Paint dotPaint;
    private int dotRadius;
    private int minGap;
    private int progress;

    public /* synthetic */ CBRDotsProgressView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_DotsProgressViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRDotsProgressView : i13);
    }

    public final int getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / ((this.dotRadius * 2) + this.minGap);
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
        int width2 = width > 1 ? (((getWidth() - getPaddingLeft()) - getPaddingRight()) - ((this.dotRadius * width) * 2)) / (width - 1) : 0;
        int paddingLeft = getPaddingLeft() + this.dotRadius;
        for (int i12 = 0; i12 < width; i12++) {
            canvas.drawCircle(paddingLeft, height, this.dotRadius, (i12 * 100) / width >= this.progress ? this.dotPaint : this.completePaint);
            paddingLeft = C22026a.a(this.dotRadius, 2, width2, paddingLeft);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int w12, int h12, int oldw, int oldh) {
        super.onSizeChanged(w12, h12, oldw, oldh);
        int paddingTop = (h12 - getPaddingTop()) - getPaddingBottom();
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        this.dotRadius = paddingTop / 2;
    }

    public final void setProgress(int i12) {
        if (i12 != this.progress) {
            this.progress = i12;
            invalidate();
        }
    }

    @j
    public CBRDotsProgressView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        this.completePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.dotPaint = paint2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRDotsProgressView, i12, i13);
        paint2.setColor(ExtensionsKt.getStyledColor(typedArrayObtainStyledAttributes, R.styleable.CBRDotsProgressView_cbr_dotsProgressDotBackgroundColor, 0));
        paint.setColor(ExtensionsKt.getStyledColor(typedArrayObtainStyledAttributes, R.styleable.CBRDotsProgressView_cbr_dotsProgressDotCompleteColor, 0));
        this.minGap = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRDotsProgressView_cbr_dotsProgressMinGap, 0);
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
    }
}
