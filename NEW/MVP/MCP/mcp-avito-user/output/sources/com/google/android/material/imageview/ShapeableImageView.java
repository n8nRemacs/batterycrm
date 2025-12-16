package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.d;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.material.R;
import com.google.android.material.resources.c;
import com.google.android.material.shape.k;
import com.google.android.material.shape.q;
import com.google.android.material.shape.v;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.N;
import j.P;
import j.r;

/* loaded from: classes6.dex */
public class ShapeableImageView extends AppCompatImageView implements v {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ShapeableImageView;
    private final Paint borderPaint;

    @r
    private int bottomContentPadding;
    private final Paint clearPaint;
    private final RectF destination;

    @r
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;

    @r
    private int leftContentPadding;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final com.google.android.material.shape.r pathProvider;

    @r
    private int rightContentPadding;

    @P
    private k shadowDrawable;
    private q shapeAppearanceModel;

    @r
    private int startContentPadding;

    @P
    private ColorStateList strokeColor;

    @r
    private float strokeWidth;

    @r
    private int topContentPadding;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f356692a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.shapeAppearanceModel == null) {
                return;
            }
            if (shapeableImageView.shadowDrawable == null) {
                shapeableImageView.shadowDrawable = new k(shapeableImageView.shapeAppearanceModel);
            }
            RectF rectF = shapeableImageView.destination;
            Rect rect = this.f356692a;
            rectF.round(rect);
            shapeableImageView.shadowDrawable.setBounds(rect);
            shapeableImageView.shadowDrawable.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private void drawStroke(Canvas canvas) {
        if (this.strokeColor == null) {
            return;
        }
        this.borderPaint.setStrokeWidth(this.strokeWidth);
        int colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
        if (this.strokeWidth <= 0.0f || colorForState == 0) {
            return;
        }
        this.borderPaint.setColor(colorForState);
        canvas.drawPath(this.path, this.borderPaint);
    }

    private boolean isContentPaddingRelative() {
        return (this.startContentPadding == Integer.MIN_VALUE && this.endContentPadding == Integer.MIN_VALUE) ? false : true;
    }

    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    private void updateShapeMask(int i12, int i13) {
        this.destination.set(getPaddingLeft(), getPaddingTop(), i12 - getPaddingRight(), i13 - getPaddingBottom());
        this.pathProvider.a(this.shapeAppearanceModel, 1.0f, this.destination, null, this.path);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, i12, i13);
        this.maskPath.addRect(this.maskRect, Path.Direction.CCW);
    }

    @r
    public int getContentPaddingBottom() {
        return this.bottomContentPadding;
    }

    @r
    public final int getContentPaddingEnd() {
        int i12 = this.endContentPadding;
        return i12 != Integer.MIN_VALUE ? i12 : isRtl() ? this.leftContentPadding : this.rightContentPadding;
    }

    @r
    public int getContentPaddingLeft() {
        int i12;
        int i13;
        if (isContentPaddingRelative()) {
            if (isRtl() && (i13 = this.endContentPadding) != Integer.MIN_VALUE) {
                return i13;
            }
            if (!isRtl() && (i12 = this.startContentPadding) != Integer.MIN_VALUE) {
                return i12;
            }
        }
        return this.leftContentPadding;
    }

    @r
    public int getContentPaddingRight() {
        int i12;
        int i13;
        if (isContentPaddingRelative()) {
            if (isRtl() && (i13 = this.startContentPadding) != Integer.MIN_VALUE) {
                return i13;
            }
            if (!isRtl() && (i12 = this.endContentPadding) != Integer.MIN_VALUE) {
                return i12;
            }
        }
        return this.rightContentPadding;
    }

    @r
    public final int getContentPaddingStart() {
        int i12 = this.startContentPadding;
        return i12 != Integer.MIN_VALUE ? i12 : isRtl() ? this.rightContentPadding : this.leftContentPadding;
    }

    @r
    public int getContentPaddingTop() {
        return this.topContentPadding;
    }

    @Override // android.view.View
    @r
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @r
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @r
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @r
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @r
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @r
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.v
    @N
    public q getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @P
    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    @r
    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.maskPath, this.clearPaint);
        drawStroke(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        if (!this.hasAdjustedPaddingAfterLayoutDirectionResolved && isLayoutDirectionResolved()) {
            this.hasAdjustedPaddingAfterLayoutDirectionResolved = true;
            if (isPaddingRelative() || isContentPaddingRelative()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        updateShapeMask(i12, i13);
    }

    @Override // android.view.View
    public void setPadding(@r int i12, @r int i13, @r int i14, @r int i15) {
        super.setPadding(getContentPaddingLeft() + i12, getContentPaddingTop() + i13, getContentPaddingRight() + i14, getContentPaddingBottom() + i15);
    }

    @Override // android.view.View
    public void setPaddingRelative(@r int i12, @r int i13, @r int i14, @r int i15) {
        super.setPaddingRelative(getContentPaddingStart() + i12, getContentPaddingTop() + i13, getContentPaddingEnd() + i14, getContentPaddingBottom() + i15);
    }

    @Override // com.google.android.material.shape.v
    public void setShapeAppearanceModel(@N q qVar) {
        this.shapeAppearanceModel = qVar;
        k kVar = this.shadowDrawable;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(qVar);
        }
        updateShapeMask(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@P ColorStateList colorStateList) {
        this.strokeColor = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@InterfaceC42158n int i12) {
        setStrokeColor(d.getColorStateList(getContext(), i12));
    }

    public void setStrokeWidth(@r float f12) {
        if (this.strokeWidth != f12) {
            this.strokeWidth = f12;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@InterfaceC42161q int i12) {
        setStrokeWidth(getResources().getDimensionPixelSize(i12));
    }

    public ShapeableImageView(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, @P AttributeSet attributeSet, int i12) {
        int i13 = DEF_STYLE_RES;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.pathProvider = com.google.android.material.shape.r.b();
        this.path = new Path();
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.clearPaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.destination = new RectF();
        this.maskRect = new RectF();
        this.maskPath = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.ShapeableImageView, i12, i13);
        setLayerType(2, null);
        this.strokeColor = c.b(typedArrayObtainStyledAttributes, context2, R.styleable.ShapeableImageView_strokeColor);
        this.strokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPadding, 0);
        this.leftContentPadding = dimensionPixelSize;
        this.topContentPadding = dimensionPixelSize;
        this.rightContentPadding = dimensionPixelSize;
        this.bottomContentPadding = dimensionPixelSize;
        this.leftContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.topContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.rightContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.bottomContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.startContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingStart, BeduinInputModel.MIN_TEXT_VERSION);
        this.endContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingEnd, BeduinInputModel.MIN_TEXT_VERSION);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.borderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.shapeAppearanceModel = q.c(context2, attributeSet, i12, i13).a();
        setOutlineProvider(new a());
    }
}
