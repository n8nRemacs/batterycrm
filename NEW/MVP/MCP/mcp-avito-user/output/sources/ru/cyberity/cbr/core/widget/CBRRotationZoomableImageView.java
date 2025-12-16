package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.dynamicanimation.animation.i;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;

/* compiled from: CBRRotationZoomableImageView.kt */
@Metadata(d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014*\u0001F\u0018\u0000 t2\u00020\u0001:\u0003tuvB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0019J\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0011¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010(\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010)\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0002¢\u0006\u0004\b+\u0010\u0019J\u0019\u0010-\u001a\u00020\f2\b\b\u0002\u0010,\u001a\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\f2\b\b\u0002\u0010,\u001a\u00020\u001dH\u0002¢\u0006\u0004\b/\u0010.J\u0019\u00101\u001a\u00020\u001d2\b\b\u0002\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u001d2\b\b\u0002\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u001dH\u0002¢\u0006\u0004\b4\u0010*J\u000f\u00105\u001a\u00020\u001dH\u0002¢\u0006\u0004\b5\u0010*J\u000f\u00106\u001a\u00020\u0011H\u0002¢\u0006\u0004\b6\u0010\u0019J\u000f\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b7\u0010\u0019J'\u0010;\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001dH\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010\u0017R$\u0010A\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u001d8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010BR\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010\u0019R\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010BR\u0016\u0010Z\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010BR\u0016\u0010[\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010BR\u0016\u0010\\\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\u0016\u0010_\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010BR\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010BR\u0016\u0010g\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010BR\u0016\u0010h\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\"\u0010j\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010i\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0011\u0010q\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010*¨\u0006w"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "computeScroll", "()V", "onDetachedFromWindow", "rotateCW", "rotateCCW", "", "angle", "exact", "rotate", "(FZ)V", "Landroid/graphics/Bitmap;", "bm", "rotationDegrees", "setImageBitmapWithRotation", "(Landroid/graphics/Bitmap;I)V", "clearImage", "reduceClipping", "getFitScale", "()F", "finishScale", "scale", "canTranslateX", "(F)Z", "canTranslateY", "scaleFactor", "getDrawableScaledWidth", "(F)F", "getDrawableScaledHeight", "getDrawableWidth", "getDrawableHeight", "computeViewPort", "updateMatrix", "scaleTo", "drawableCenterEndX", "drawableCenterEndY", "animateScale", "(FFF)V", "velocityX", "velocityY", "fling", "value", "rotationAngle", "F", "setRotationAngle", "(F)V", "targetAngle", "ru/cyberity/cbr/core/widget/CBRRotationZoomableImageView$rotationPositionHolder$1", "rotationPositionHolder", "Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView$rotationPositionHolder$1;", "Landroidx/dynamicanimation/animation/i;", "rotationAnimation", "Landroidx/dynamicanimation/animation/i;", "getRotationAnimation$annotations", "Landroid/animation/ValueAnimator;", "scaleAnimation", "Landroid/animation/ValueAnimator;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Landroid/graphics/Matrix;", "mtrx", "Landroid/graphics/Matrix;", "Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView$TouchMode;", "touchMode", "Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView$TouchMode;", "touchStartDistance", "touchStartX", "touchStartY", "pointerId1", "I", "pointerId2", "currentScale", "Landroid/graphics/RectF;", "viewPort", "Landroid/graphics/RectF;", "Landroid/widget/Scroller;", "scroller", "Landroid/widget/Scroller;", "lastViewPortCenterX", "lastViewPortCenterY", "lastViewPortCenterSaved", "Z", "zoomEnabled", "getZoomEnabled", "()Z", "setZoomEnabled", "(Z)V", "getRotation", "()I", "rotation", "getMinScale", "minScale", "Companion", "GestureListener", "TouchMode", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRRotationZoomableImageView extends AppCompatImageView {
    private float currentScale;

    @k
    private final GestureDetector gestureDetector;
    private boolean lastViewPortCenterSaved;
    private float lastViewPortCenterX;
    private float lastViewPortCenterY;

    @k
    private final Matrix mtrx;
    private int pointerId1;
    private int pointerId2;
    private float rotationAngle;

    @k
    private final i rotationAnimation;

    @k
    private final CBRRotationZoomableImageView$rotationPositionHolder$1 rotationPositionHolder;

    @l
    private ValueAnimator scaleAnimation;

    @k
    private final Scroller scroller;
    private float targetAngle;

    @k
    private TouchMode touchMode;
    private float touchStartDistance;
    private float touchStartX;
    private float touchStartY;

    @k
    private final RectF viewPort;
    private boolean zoomEnabled;

    /* compiled from: CBRRotationZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J*\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView;)V", "onDoubleTap", "", "e", "Landroid/view/MotionEvent;", "onFling", "e1", "e2", "velocityX", "", "velocityY", "onSingleTapConfirmed", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(@k MotionEvent e12) {
            CBRRotationZoomableImageView.this.scroller.forceFinished(true);
            if (CBRRotationZoomableImageView.this.currentScale > CBRRotationZoomableImageView.this.getFitScale()) {
                CBRRotationZoomableImageView cBRRotationZoomableImageView = CBRRotationZoomableImageView.this;
                cBRRotationZoomableImageView.animateScale(cBRRotationZoomableImageView.getFitScale(), CBRRotationZoomableImageView.this.getWidth() / 2.0f, CBRRotationZoomableImageView.this.getHeight() / 2.0f);
            } else {
                CBRRotationZoomableImageView.this.computeViewPort();
                CBRRotationZoomableImageView.this.animateScale(2.6666667f, CBRRotationZoomableImageView.this.viewPort.centerX() - ((e12.getX(0) - CBRRotationZoomableImageView.this.viewPort.centerX()) * 2.6666667f), CBRRotationZoomableImageView.this.viewPort.centerY() - ((e12.getY(0) - CBRRotationZoomableImageView.this.viewPort.centerY()) * 2.6666667f));
            }
            return super.onDoubleTap(e12);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@l MotionEvent e12, @k MotionEvent e22, float velocityX, float velocityY) {
            CBRRotationZoomableImageView.this.fling((int) velocityX, (int) velocityY);
            return super.onFling(e12, e22, velocityX, velocityY);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@k MotionEvent e12) {
            CBRRotationZoomableImageView.this.performClick();
            return super.onSingleTapConfirmed(e12);
        }
    }

    /* compiled from: CBRRotationZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView$TouchMode;", "", "(Ljava/lang/String;I)V", "NONE", "DRAG", "ZOOM", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum TouchMode {
        NONE,
        DRAG,
        ZOOM
    }

    @j
    public CBRRotationZoomableImageView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateScale(float scaleTo, float drawableCenterEndX, float drawableCenterEndY) {
        ValueAnimator valueAnimator = this.scaleAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float f12 = this.currentScale;
        final float f13 = scaleTo - f12;
        final float fCenterX = drawableCenterEndX - this.viewPort.centerX();
        final float fCenterY = drawableCenterEndY - this.viewPort.centerY();
        final l0.e eVar = new l0.e();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.cyberity.cbr.core.widget.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CBRRotationZoomableImageView.m299animateScale$lambda7$lambda6(f12, f13, this, eVar, fCenterX, fCenterY, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.scaleAnimation = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateScale$lambda-7$lambda-6, reason: not valid java name */
    public static final void m299animateScale$lambda7$lambda6(float f12, float f13, CBRRotationZoomableImageView cBRRotationZoomableImageView, l0.e eVar, float f14, float f15, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f16 = (f13 * fFloatValue) + f12;
        float f17 = f16 / cBRRotationZoomableImageView.currentScale;
        cBRRotationZoomableImageView.mtrx.postScale(f17, f17, cBRRotationZoomableImageView.viewPort.centerX(), cBRRotationZoomableImageView.viewPort.centerY());
        float f18 = fFloatValue - eVar.f406839b;
        cBRRotationZoomableImageView.mtrx.postTranslate(f14 * f18, f18 * f15);
        cBRRotationZoomableImageView.currentScale = f16;
        eVar.f406839b = fFloatValue;
        cBRRotationZoomableImageView.reduceClipping();
    }

    private final boolean canTranslateX(float scale) {
        return scale <= 4.0f && (this.targetAngle % ((float) 180) != 0.0f ? getDrawableScaledHeight(scale) > ((float) getHeight()) : getDrawableScaledWidth(scale) > ((float) getWidth()));
    }

    public static /* synthetic */ boolean canTranslateX$default(CBRRotationZoomableImageView cBRRotationZoomableImageView, float f12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f12 = cBRRotationZoomableImageView.currentScale;
        }
        return cBRRotationZoomableImageView.canTranslateX(f12);
    }

    private final boolean canTranslateY(float scale) {
        return scale <= 4.0f && (this.targetAngle % ((float) 180) != 0.0f ? getDrawableScaledWidth(scale) > ((float) getWidth()) : getDrawableScaledHeight(scale) > ((float) getHeight()));
    }

    public static /* synthetic */ boolean canTranslateY$default(CBRRotationZoomableImageView cBRRotationZoomableImageView, float f12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f12 = cBRRotationZoomableImageView.currentScale;
        }
        return cBRRotationZoomableImageView.canTranslateY(f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void computeViewPort() {
        RectF rectF = this.viewPort;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getDrawableWidth();
        rectF.bottom = getDrawableHeight();
        this.mtrx.mapRect(this.viewPort);
    }

    private final void finishScale() {
        if (this.currentScale < getMinScale()) {
            this.scroller.forceFinished(true);
            animateScale(getFitScale(), getWidth() / 2.0f, getHeight() / 2.0f);
        } else if (this.currentScale > 4.0f) {
            this.scroller.forceFinished(true);
            this.lastViewPortCenterSaved = false;
            animateScale(4.0f, this.lastViewPortCenterX, this.lastViewPortCenterY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fling(int velocityX, int velocityY) {
        this.scroller.forceFinished(true);
        RectF rectF = this.viewPort;
        float f12 = rectF.left;
        this.touchStartX = f12;
        float f13 = rectF.top;
        this.touchStartY = f13;
        this.scroller.fling((int) f12, (int) f13, velocityX, velocityY, getWidth() - ((int) this.viewPort.width()), 0, getHeight() - ((int) this.viewPort.height()), 0);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        postInvalidateOnAnimation();
    }

    private final float getDrawableHeight() {
        if (getDrawable() != null) {
            return r0.getIntrinsicHeight();
        }
        return 0.0f;
    }

    private final float getDrawableScaledHeight(float scaleFactor) {
        return getDrawableHeight() * scaleFactor;
    }

    private final float getDrawableScaledWidth(float scaleFactor) {
        return getDrawableWidth() * scaleFactor;
    }

    private final float getDrawableWidth() {
        if (getDrawable() != null) {
            return r0.getIntrinsicWidth();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getFitScale() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        return this.targetAngle % ((float) 180) == 0.0f ? Math.min(getWidth() / intrinsicWidth, getHeight() / intrinsicHeight) : Math.min(getWidth() / intrinsicHeight, getHeight() / intrinsicWidth);
    }

    private final float getMinScale() {
        return getFitScale();
    }

    private final void reduceClipping() {
        computeViewPort();
        if (this.viewPort.width() > getWidth()) {
            RectF rectF = this.viewPort;
            if (rectF.left > 0.0f && rectF.right > getWidth()) {
                this.mtrx.postTranslate(-this.viewPort.left, 0.0f);
            }
            if (this.viewPort.right < getWidth() && this.viewPort.left < 0.0f) {
                this.mtrx.postTranslate(getWidth() - this.viewPort.right, 0.0f);
            }
        }
        if (this.viewPort.height() > getHeight()) {
            RectF rectF2 = this.viewPort;
            if (rectF2.top > 0.0f && rectF2.bottom > getHeight()) {
                this.mtrx.postTranslate(0.0f, -this.viewPort.top);
            }
            if (this.viewPort.bottom < getHeight() && this.viewPort.top < 0.0f) {
                this.mtrx.postTranslate(0.0f, getHeight() - this.viewPort.bottom);
            }
        }
        if (this.viewPort.width() < getWidth()) {
            float width = (getWidth() / 2.0f) - this.viewPort.centerX();
            if (width != 0.0f) {
                this.mtrx.postTranslate(width, 0.0f);
            }
        }
        if (this.viewPort.height() < getHeight()) {
            float height = (getHeight() / 2.0f) - this.viewPort.centerY();
            if (height != 0.0f) {
                this.mtrx.postTranslate(0.0f, height);
            }
        }
        updateMatrix();
    }

    public static /* synthetic */ void rotate$default(CBRRotationZoomableImageView cBRRotationZoomableImageView, float f12, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        cBRRotationZoomableImageView.rotate(f12, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rotationAnimation$lambda-3$lambda-2, reason: not valid java name */
    public static final void m300rotationAnimation$lambda3$lambda2(CBRRotationZoomableImageView cBRRotationZoomableImageView, androidx.dynamicanimation.animation.c cVar, boolean z12, float f12, float f13) {
        float f14 = 360;
        float f15 = cBRRotationZoomableImageView.targetAngle % f14;
        if (f15 < 0.0f) {
            f15 += f14;
        }
        cBRRotationZoomableImageView.setRotationAngle(f15);
        cBRRotationZoomableImageView.targetAngle = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRotationAngle(float f12) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            this.rotationAngle = f12;
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            Matrix matrix = this.mtrx;
            float f13 = intrinsicWidth / 2.0f;
            float f14 = intrinsicHeight / 2.0f;
            matrix.setRotate(f12, f13, f14);
            float fitScale = getFitScale();
            matrix.postScale(fitScale, fitScale, f13, f14);
            float f15 = 2;
            matrix.postTranslate((-(intrinsicWidth - getWidth())) / f15, (-(intrinsicHeight - getHeight())) / f15);
            this.currentScale = fitScale;
            updateMatrix();
        }
    }

    private final void updateMatrix() {
        setImageMatrix(this.mtrx);
        computeViewPort();
    }

    public final void clearImage() {
        setImageResource(R.color.transparent);
        this.rotationAnimation.d();
        ValueAnimator valueAnimator = this.scaleAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.scaleAnimation = null;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.scroller.computeScrollOffset()) {
            int currX = this.scroller.getCurrX();
            int currY = this.scroller.getCurrY();
            float f12 = currX;
            float f13 = f12 - this.touchStartX;
            float f14 = currY;
            float f15 = f14 - this.touchStartY;
            Matrix matrix = this.mtrx;
            if (!canTranslateX$default(this, 0.0f, 1, null)) {
                f13 = 0.0f;
            }
            if (!canTranslateY$default(this, 0.0f, 1, null)) {
                f15 = 0.0f;
            }
            matrix.postTranslate(f13, f15);
            this.touchStartX = f12;
            this.touchStartY = f14;
            reduceClipping();
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final int getRotation() {
        return (int) this.targetAngle;
    }

    public final boolean getZoomEnabled() {
        return this.zoomEnabled;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.scaleAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.scaleAnimation = null;
        this.rotationAnimation.d();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.currentScale = getFitScale();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r0 != 6) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@Y61.k android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.widget.CBRRotationZoomableImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void rotate(float angle, boolean exact) {
        this.scroller.forceFinished(true);
        if (exact) {
            this.targetAngle = angle;
        } else {
            this.targetAngle += angle;
        }
        this.rotationAnimation.h(this.targetAngle * 1000.0f);
    }

    public final void rotateCCW() {
        rotate$default(this, -90.0f, false, 2, null);
    }

    public final void rotateCW() {
        rotate$default(this, 90.0f, false, 2, null);
    }

    public final void setImageBitmapWithRotation(@l Bitmap bm, int rotationDegrees) {
        setImageBitmap(bm);
        float f12 = rotationDegrees;
        this.targetAngle = f12;
        this.rotationAnimation.h(f12 * 1000.0f);
        this.rotationAnimation.i();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@l Drawable drawable) {
        super.setImageDrawable(drawable);
        this.targetAngle = 0.0f;
        this.rotationAnimation.h(0.0f);
        this.rotationAnimation.i();
    }

    public final void setZoomEnabled(boolean z12) {
        this.zoomEnabled = z12;
    }

    public /* synthetic */ CBRRotationZoomableImageView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? ru.cyberity.cbr.core.R.attr.cbr_RotationZoomableImageViewStyle : i12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.dynamicanimation.animation.f, ru.cyberity.cbr.core.widget.CBRRotationZoomableImageView$rotationPositionHolder$1] */
    @j
    public CBRRotationZoomableImageView(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        ?? r02 = new androidx.dynamicanimation.animation.f<CBRRotationZoomableImageView>() { // from class: ru.cyberity.cbr.core.widget.CBRRotationZoomableImageView$rotationPositionHolder$1
            {
                super("rotationDegree");
            }

            @Override // androidx.dynamicanimation.animation.f
            public float getValue(@l CBRRotationZoomableImageView view) {
                return this.this$0.rotationAngle * 1000.0f;
            }

            @Override // androidx.dynamicanimation.animation.f
            public void setValue(@l CBRRotationZoomableImageView view, float value) {
                this.this$0.setRotationAngle(value / 1000.0f);
            }
        };
        this.rotationPositionHolder = r02;
        i iVar = new i(this, r02, 0.0f);
        iVar.f46047t.a(1.0f);
        iVar.f46047t.b(1500.0f);
        iVar.b(new d(this, 1));
        this.rotationAnimation = iVar;
        this.gestureDetector = new GestureDetector(context, new GestureListener());
        Matrix matrix = new Matrix();
        matrix.setTranslate(1.0f, 1.0f);
        matrix.setScale(1.0f, 1.0f);
        this.mtrx = matrix;
        this.touchMode = TouchMode.NONE;
        this.currentScale = 1.0f;
        this.viewPort = new RectF();
        this.scroller = new Scroller(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ru.cyberity.cbr.core.R.styleable.CBRRotationZoomableImageView, i12, 0);
        this.zoomEnabled = typedArrayObtainStyledAttributes.getBoolean(ru.cyberity.cbr.core.R.styleable.CBRRotationZoomableImageView_cbr_zoomEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.MATRIX);
        updateMatrix();
    }

    private static /* synthetic */ void getRotationAnimation$annotations() {
    }
}
