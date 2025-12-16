package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.R;

/* compiled from: CBRDocBoundsCheckResultView.kt */
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR.\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR.\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0011\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRDocBoundsCheckResultView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/G0;", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "value", "transformMatrix", "Landroid/graphics/Matrix;", "getTransformMatrix", "()Landroid/graphics/Matrix;", "setTransformMatrix", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "docRect", "Landroid/graphics/Rect;", "getDocRect", "()Landroid/graphics/Rect;", "setDocRect", "(Landroid/graphics/Rect;)V", "Landroid/graphics/RectF;", "docRectF", "Landroid/graphics/RectF;", "getDocRectF", "()Landroid/graphics/RectF;", "setDocRectF", "(Landroid/graphics/RectF;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRDocBoundsCheckResultView extends View {

    @l
    private Rect docRect;

    @l
    private RectF docRectF;

    @k
    private final Paint paint;

    @l
    private Matrix transformMatrix;

    @j
    public CBRDocBoundsCheckResultView(@k Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @l
    public final Rect getDocRect() {
        return this.docRect;
    }

    @l
    public final RectF getDocRectF() {
        return this.docRectF;
    }

    @k
    public final Paint getPaint() {
        return this.paint;
    }

    @l
    public final Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // android.view.View
    public void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.docRectF;
        if (rectF == null) {
            return;
        }
        canvas.drawRect(rectF, this.paint);
    }

    public final void setDocRect(@l Rect rect) {
        this.docRect = rect;
        setDocRectF(rect != null ? new RectF(rect) : null);
    }

    public final void setDocRectF(@l RectF rectF) {
        this.docRectF = rectF;
        invalidate();
    }

    public final void setTransformMatrix(@l Matrix matrix) {
        this.transformMatrix = matrix;
        invalidate();
    }

    @j
    public CBRDocBoundsCheckResultView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @j
    public CBRDocBoundsCheckResultView(@k Context context, @l AttributeSet attributeSet, int i12) {
        this(context, attributeSet, i12, 0, 8, null);
    }

    public /* synthetic */ CBRDocBoundsCheckResultView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    @j
    public CBRDocBoundsCheckResultView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setColor(-16711936);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.cbr_frame_stroke_width));
    }
}
