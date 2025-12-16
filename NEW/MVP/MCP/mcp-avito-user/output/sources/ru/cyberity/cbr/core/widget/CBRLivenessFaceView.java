package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.dynamicanimation.animation.i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;

/* compiled from: CBRLivenessFaceView.kt */
@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001A\u0018\u0000 }2\u00020\u0001:\u0003~\u007f}B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\rJ/\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\"J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010\u001fJ\u000f\u0010)\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010\rR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\"\u0004\b3\u00104R.\u00105\u001a\u0004\u0018\u00010*2\b\u00100\u001a\u0004\u0018\u00010*8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.\"\u0004\b7\u00108R(\u0010:\u001a\u0004\u0018\u0001092\b\u00100\u001a\u0004\u0018\u0001098\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010N\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bN\u00102\"\u0004\bO\u00104R\u001c\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bQ\u0010R\u0012\u0004\bS\u0010\rR\u001c\u0010T\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bT\u00102\u0012\u0004\bU\u0010\rR\u001c\u0010V\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bV\u00102\u0012\u0004\bW\u0010\rR\u001a\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bY\u0010Z\u0012\u0004\b[\u0010\rR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010^R$\u0010`\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b`\u00102\"\u0004\ba\u00104R\u001a\u0010b\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bb\u0010^\u0012\u0004\bc\u0010\rR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010fR\u0014\u0010h\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR\u0014\u0010i\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010fR\u0014\u0010j\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010fR\u0014\u0010k\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010fR\u0016\u0010l\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010?R\u0016\u0010m\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010?R\u0016\u0010n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010?R\u0014\u0010o\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010?R\u0014\u0010p\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010?R$\u0010r\u001a\u00020q2\u0006\u00100\u001a\u00020q8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\br\u0010s\"\u0004\bt\u0010uR\u0011\u0010y\u001a\u00020v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u0080\u0001"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRLivenessFaceView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/G0;", "setRecognizingState", "()V", "setFaceDetectedState", "setFaceAnalyzingState", "setScanCompleteState", "onDetachedFromWindow", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "color", "setOverlayColor", "(I)V", "setFaceRecognizedColor", "setFaceMarkerActiveColor", "setFaceMarkerInActiveColor", "drawRecognizingCircle", "drawMarkers", "drawRecognizingArc", "updateOverlay", "Landroid/graphics/RectF;", "helperRectF", "Landroid/graphics/RectF;", "getHelperRectF", "()Landroid/graphics/RectF;", "", "value", "recognizingFactor", "F", "setRecognizingFactor", "(F)V", "faceRectangle", "getFaceRectangle", "setFaceRectangle", "(Landroid/graphics/RectF;)V", "Landroid/graphics/Bitmap;", "bgBitmap", "Landroid/graphics/Bitmap;", "setBgBitmap", "(Landroid/graphics/Bitmap;)V", "maxRadius", "I", "focusRadius", "ru/cyberity/cbr/core/widget/CBRLivenessFaceView$radiusHolder$1", "radiusHolder", "Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$radiusHolder$1;", "Landroidx/dynamicanimation/animation/i;", "radiusAnimation", "Landroidx/dynamicanimation/animation/i;", "Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceStateListener;", "stateListener", "Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceStateListener;", "getStateListener", "()Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceStateListener;", "setStateListener", "(Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceStateListener;)V", "detectingFactor", "setDetectingFactor", "", "detectingAnimationSpeed", "J", "getDetectingAnimationSpeed$annotations", "detectingArc1RotationAngle", "getDetectingArc1RotationAngle$annotations", "detectingArc2RotationAngle", "getDetectingArc2RotationAngle$annotations", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "updater", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "getUpdater$annotations", "Landroid/animation/ValueAnimator;", "recognizingAnimationDirect", "Landroid/animation/ValueAnimator;", "recognizingAnimationInDirect", "progressRotationAngle", "setProgressRotationAngle", "progressRotationAnimator", "getProgressRotationAnimator$annotations", "Landroid/graphics/Paint;", "mFaceProgressMarkerPaint", "Landroid/graphics/Paint;", "mFaceDetectionCirclePaint", "mFaceCutCirclePaint", "mFaceScanCompletePaint", "mFaceRecognizingPaint", "mFaceRectanglePaint", "mColorFaceMarkerActive", "mColorFaceMarkerInActive", "mColorOverlay", "mMarkerSize", "mMarkerPadding", "Lkotlin/ranges/l;", "progressRange", "Lkotlin/ranges/l;", "setProgressRange", "(Lkotlin/ranges/l;)V", "Landroid/graphics/Rect;", "getFaceCapturingRect", "()Landroid/graphics/Rect;", "faceCapturingRect", "", "isAnalyzing", "()Z", "Companion", "CBRFaceStateListener", "CBRFaceViewState", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRLivenessFaceView extends View {

    @l
    private Bitmap bgBitmap;
    private long detectingAnimationSpeed;
    private float detectingArc1RotationAngle;
    private float detectingArc2RotationAngle;
    private float detectingFactor;

    @l
    private RectF faceRectangle;
    private int focusRadius;

    @k
    private final RectF helperRectF;
    private int mColorFaceMarkerActive;
    private int mColorFaceMarkerInActive;
    private int mColorOverlay;

    @k
    private final Paint mFaceCutCirclePaint;

    @k
    private final Paint mFaceDetectionCirclePaint;

    @k
    private final Paint mFaceProgressMarkerPaint;

    @k
    private final Paint mFaceRecognizingPaint;

    @k
    private final Paint mFaceRectanglePaint;

    @k
    private final Paint mFaceScanCompletePaint;
    private final int mMarkerPadding;
    private final int mMarkerSize;
    private int maxRadius;

    @k
    private kotlin.ranges.l progressRange;
    private float progressRotationAngle;

    @k
    private final ValueAnimator progressRotationAnimator;

    @k
    private final i radiusAnimation;

    @k
    private final CBRLivenessFaceView$radiusHolder$1 radiusHolder;

    @k
    private final ValueAnimator recognizingAnimationDirect;

    @k
    private final ValueAnimator recognizingAnimationInDirect;
    private float recognizingFactor;

    @l
    private CBRFaceStateListener stateListener;

    @k
    private final ValueAnimator.AnimatorUpdateListener updater;

    /* compiled from: CBRLivenessFaceView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceStateListener;", "", "Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceViewState;", VoiceInfo.STATE, "Lkotlin/G0;", "onState", "(Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceViewState;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface CBRFaceStateListener {
        void onState(@k CBRFaceViewState state);
    }

    /* compiled from: CBRLivenessFaceView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRLivenessFaceView$CBRFaceViewState;", "", "(Ljava/lang/String;I)V", "Recognizing", "Recognized", "Analyzing", "Complete", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum CBRFaceViewState {
        Recognizing,
        Recognized,
        Analyzing,
        Complete
    }

    @j
    public CBRLivenessFaceView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drawMarkers(android.graphics.Canvas r26) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.widget.CBRLivenessFaceView.drawMarkers(android.graphics.Canvas):void");
    }

    private final void drawRecognizingArc(Canvas canvas) {
        this.helperRectF.set(getFaceCapturingRect());
        this.helperRectF.inset(0.0f, (this.helperRectF.height() * (1 - Math.abs(this.detectingFactor))) / 2);
        float f12 = this.detectingFactor > 0.0f ? 180.0f : 0.0f;
        canvas.save();
        canvas.rotate(this.detectingArc1RotationAngle, this.helperRectF.centerX(), this.helperRectF.centerY());
        float f13 = f12;
        canvas.drawArc(this.helperRectF, f13, 180.0f, false, this.mFaceRecognizingPaint);
        canvas.rotate((-this.detectingArc1RotationAngle) - this.detectingArc2RotationAngle, this.helperRectF.centerX(), this.helperRectF.centerY());
        canvas.drawArc(this.helperRectF, f13, 180.0f, false, this.mFaceRecognizingPaint);
        canvas.restore();
    }

    private final void drawRecognizingCircle(Canvas canvas) {
        float fCenterX = getFaceCapturingRect().centerX();
        float fCenterY = getFaceCapturingRect().centerY();
        float fMax = Math.max((1 - this.recognizingFactor) * this.focusRadius, getFaceCapturingRect().width() / 2.0f);
        Bitmap bitmap = this.bgBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (isAnalyzing()) {
            canvas.drawCircle(fCenterX, fCenterY, fMax, this.mFaceScanCompletePaint);
        } else {
            canvas.drawCircle(fCenterX, fCenterY, fMax, this.mFaceDetectionCirclePaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAnalyzing() {
        if (this.recognizingFactor == 0.0f) {
            kotlin.ranges.l lVar = this.progressRange;
            kotlin.ranges.l.f406912f.getClass();
            if (L.f(lVar, kotlin.ranges.l.f406913g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: progressRotationAnimator$lambda-8$lambda-7, reason: not valid java name */
    public static final void m296progressRotationAnimator$lambda8$lambda7(CBRLivenessFaceView cBRLivenessFaceView, ValueAnimator valueAnimator) {
        cBRLivenessFaceView.setProgressRotationAngle(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: radiusAnimation$lambda-1$lambda-0, reason: not valid java name */
    public static final void m297radiusAnimation$lambda1$lambda0(CBRLivenessFaceView cBRLivenessFaceView, androidx.dynamicanimation.animation.c cVar, boolean z12, float f12, float f13) {
        CBRFaceStateListener cBRFaceStateListener = cBRLivenessFaceView.stateListener;
        if (cBRFaceStateListener != null) {
            float f14 = cBRLivenessFaceView.recognizingFactor;
            cBRFaceStateListener.onState(f14 == 0.0f ? cBRLivenessFaceView.isAnalyzing() ? CBRFaceViewState.Analyzing : CBRFaceViewState.Recognized : f14 == 1.0f ? CBRFaceViewState.Complete : CBRFaceViewState.Recognizing);
        }
    }

    private final void setBgBitmap(Bitmap bitmap) {
        this.bgBitmap = bitmap;
        updateOverlay();
        invalidate();
    }

    private final void setDetectingFactor(float f12) {
        if (this.detectingFactor == f12) {
            return;
        }
        this.detectingFactor = f12;
        postInvalidateOnAnimation();
    }

    private final void setFaceMarkerActiveColor(int color) {
        this.mColorFaceMarkerActive = color;
    }

    private final void setFaceMarkerInActiveColor(int color) {
        this.mColorFaceMarkerInActive = color;
    }

    private final void setFaceRecognizedColor(int color) {
        this.mFaceRecognizingPaint.setColor(color);
        this.mFaceDetectionCirclePaint.setColor(color);
        invalidate();
    }

    private final void setOverlayColor(int color) {
        this.mColorOverlay = color;
        invalidate();
    }

    private final void setProgressRange(kotlin.ranges.l lVar) {
        if (L.f(lVar, this.progressRange)) {
            return;
        }
        this.progressRange = lVar;
        postInvalidateOnAnimation();
    }

    private final void setProgressRotationAngle(float f12) {
        if (f12 == this.progressRotationAngle) {
            return;
        }
        this.progressRotationAngle = f12;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRecognizingFactor(float f12) {
        if (this.recognizingFactor == f12) {
            return;
        }
        this.recognizingFactor = s.f(f12, -1.0f, 1.0f);
        updateOverlay();
        postInvalidate();
    }

    private final void updateOverlay() {
        float fCenterX = getFaceCapturingRect().centerX();
        float fCenterY = getFaceCapturingRect().centerY();
        float fMax = Math.max((1 - this.recognizingFactor) * this.focusRadius, getFaceCapturingRect().width() / 2.0f);
        Bitmap bitmap = this.bgBitmap;
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(this.mColorOverlay);
            canvas.drawCircle(fCenterX, fCenterY, fMax, this.mFaceCutCirclePaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updater$lambda-2, reason: not valid java name */
    public static final void m298updater$lambda2(CBRLivenessFaceView cBRLivenessFaceView, ValueAnimator valueAnimator) {
        cBRLivenessFaceView.setDetectingFactor(((Float) valueAnimator.getAnimatedValue()).floatValue());
        cBRLivenessFaceView.detectingArc1RotationAngle = (Math.abs(cBRLivenessFaceView.detectingFactor) * 0.3f) + cBRLivenessFaceView.detectingArc1RotationAngle;
        cBRLivenessFaceView.detectingArc2RotationAngle = (Math.abs(cBRLivenessFaceView.detectingFactor) * 0.5f) + cBRLivenessFaceView.detectingArc2RotationAngle;
    }

    @k
    public final Rect getFaceCapturingRect() {
        int strokeWidth = (this.mMarkerSize * 2) + (this.mMarkerPadding * 2) + ((int) this.mFaceProgressMarkerPaint.getStrokeWidth());
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width > height) {
            width = height;
        }
        int i12 = width - strokeWidth;
        int paddingLeft = getPaddingLeft() + ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - i12) / 2);
        int paddingTop = getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - i12) / 2);
        return new Rect(paddingLeft, paddingTop, paddingLeft + i12, i12 + paddingTop);
    }

    @l
    public final RectF getFaceRectangle() {
        return this.faceRectangle;
    }

    @k
    public final RectF getHelperRectF() {
        return this.helperRectF;
    }

    @l
    public final CBRFaceStateListener getStateListener() {
        return this.stateListener;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.radiusAnimation.d();
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
    }

    @Override // android.view.View
    public void onDraw(@k Canvas canvas) {
        RectF rectF;
        super.onDraw(canvas);
        canvas.save();
        drawRecognizingCircle(canvas);
        if (isAnalyzing()) {
            drawMarkers(canvas);
        }
        if (this.recognizingFactor == 0.0f && !isAnalyzing()) {
            drawRecognizingArc(canvas);
        }
        if (this.recognizingFactor < 0.0f && (rectF = this.faceRectangle) != null) {
            canvas.drawRect(rectF, this.mFaceRectanglePaint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        if (paddingStart > paddingTop) {
            paddingStart = paddingTop;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingEnd() + getPaddingStart() + paddingStart, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + paddingStart, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int w12, int h12, int oldw, int oldh) {
        Bitmap bitmap;
        super.onSizeChanged(w12, h12, oldw, oldh);
        Rect faceCapturingRect = getFaceCapturingRect();
        int iCenterX = faceCapturingRect.centerX();
        int iCenterX2 = w12 - faceCapturingRect.centerX();
        if (iCenterX < iCenterX2) {
            iCenterX = iCenterX2;
        }
        float f12 = iCenterX;
        int iCenterY = faceCapturingRect.centerY();
        int iCenterY2 = h12 - faceCapturingRect.centerY();
        if (iCenterY < iCenterY2) {
            iCenterY = iCenterY2;
        }
        float f13 = iCenterY;
        this.maxRadius = (int) Math.sqrt((f13 * f13) + (f12 * f12));
        this.focusRadius = getFaceCapturingRect().width() / 2;
        Bitmap bitmap2 = this.bgBitmap;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.bgBitmap) != null) {
            bitmap.recycle();
        }
        setBgBitmap(Bitmap.createBitmap(w12, h12, Bitmap.Config.ARGB_8888));
    }

    public final void setFaceAnalyzingState() {
        this.radiusAnimation.h(0.0f);
        kotlin.ranges.l.f406912f.getClass();
        setProgressRange(kotlin.ranges.l.f406913g);
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
        if (this.progressRotationAnimator.isStarted()) {
            return;
        }
        this.progressRotationAnimator.start();
    }

    public final void setFaceDetectedState() {
        this.radiusAnimation.h(0.0f);
        if (!this.recognizingAnimationDirect.isStarted() && !this.recognizingAnimationInDirect.isStarted()) {
            this.recognizingAnimationDirect.start();
            this.recognizingAnimationInDirect.cancel();
        }
        setProgressRange(new kotlin.ranges.l(0, 360, 1));
        if (this.progressRotationAnimator.isStarted()) {
            return;
        }
        this.progressRotationAnimator.start();
    }

    public final void setFaceRectangle(@l RectF rectF) {
        if (L.f(rectF, this.faceRectangle)) {
            return;
        }
        this.faceRectangle = rectF;
        postInvalidate();
    }

    public final void setRecognizingState() {
        this.radiusAnimation.h(-50.0f);
        kotlin.ranges.l.f406912f.getClass();
        setProgressRange(kotlin.ranges.l.f406913g);
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
        this.progressRotationAnimator.cancel();
    }

    public final void setScanCompleteState() {
        this.radiusAnimation.h(1000.0f);
        kotlin.ranges.l.f406912f.getClass();
        setProgressRange(kotlin.ranges.l.f406913g);
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
        this.progressRotationAnimator.cancel();
    }

    public final void setStateListener(@l CBRFaceStateListener cBRFaceStateListener) {
        this.stateListener = cBRFaceStateListener;
    }

    public /* synthetic */ CBRLivenessFaceView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_ProofaceViewStyle : i12, (i14 & 8) != 0 ? R.style.CBRProofaceViewStyle : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.dynamicanimation.animation.f, ru.cyberity.cbr.core.widget.CBRLivenessFaceView$radiusHolder$1] */
    @j
    public CBRLivenessFaceView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        Integer color;
        Integer color2;
        Integer color3;
        super(context, attributeSet, i12);
        final int i14 = 1;
        final int i15 = 0;
        this.helperRectF = new RectF();
        this.recognizingFactor = -1.0f;
        ?? r52 = new androidx.dynamicanimation.animation.f<CBRLivenessFaceView>() { // from class: ru.cyberity.cbr.core.widget.CBRLivenessFaceView$radiusHolder$1
            {
                super("recognizingFactor");
            }

            @Override // androidx.dynamicanimation.animation.f
            public float getValue(@l CBRLivenessFaceView view) {
                return this.this$0.recognizingFactor * 1000.0f;
            }

            @Override // androidx.dynamicanimation.animation.f
            public void setValue(@l CBRLivenessFaceView view, float value) {
                this.this$0.setRecognizingFactor(value / 1000.0f);
            }
        };
        this.radiusHolder = r52;
        i iVar = new i(this, r52, this.recognizingFactor);
        iVar.f46047t.a(0.75f);
        iVar.f46047t.b(200.0f);
        iVar.f46038h = -1000.0f;
        iVar.f46037g = 1000.0f;
        iVar.b(new d(this, i15));
        this.radiusAnimation = iVar;
        this.detectingFactor = -1.0f;
        this.detectingAnimationSpeed = 1000L;
        this.detectingArc1RotationAngle = 25.0f;
        this.detectingArc2RotationAngle = 25.0f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(this) { // from class: ru.cyberity.cbr.core.widget.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CBRLivenessFaceView f434249b;

            {
                this.f434249b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i15) {
                    case 0:
                        CBRLivenessFaceView.m298updater$lambda2(this.f434249b, valueAnimator);
                        break;
                    default:
                        CBRLivenessFaceView.m296progressRotationAnimator$lambda8$lambda7(this.f434249b, valueAnimator);
                        break;
                }
            }
        };
        this.updater = animatorUpdateListener;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(this.detectingAnimationSpeed);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: ru.cyberity.cbr.core.widget.CBRLivenessFaceView$recognizingAnimationDirect$lambda-4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@k Animator animator) {
                if (this.this$0.isAnalyzing()) {
                    return;
                }
                this.this$0.recognizingAnimationInDirect.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@k Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@k Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@k Animator animator) {
            }
        });
        this.recognizingAnimationDirect = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, -1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setDuration(this.detectingAnimationSpeed);
        valueAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat2.addListener(new Animator.AnimatorListener() { // from class: ru.cyberity.cbr.core.widget.CBRLivenessFaceView$recognizingAnimationInDirect$lambda-6$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@k Animator animator) {
                if (this.this$0.isAnalyzing()) {
                    return;
                }
                this.this$0.recognizingAnimationDirect.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@k Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@k Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@k Animator animator) {
            }
        });
        this.recognizingAnimationInDirect = valueAnimatorOfFloat2;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 4.0f);
        valueAnimatorOfFloat3.setDuration(this.detectingAnimationSpeed);
        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ru.cyberity.cbr.core.widget.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CBRLivenessFaceView f434249b;

            {
                this.f434249b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        CBRLivenessFaceView.m298updater$lambda2(this.f434249b, valueAnimator);
                        break;
                    default:
                        CBRLivenessFaceView.m296progressRotationAnimator$lambda8$lambda7(this.f434249b, valueAnimator);
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.setRepeatCount(-1);
        this.progressRotationAnimator = valueAnimatorOfFloat3;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.mFaceProgressMarkerPaint = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.mFaceDetectionCirclePaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.mFaceCutCirclePaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        this.mFaceScanCompletePaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style2);
        paint5.setStrokeCap(cap);
        this.mFaceRecognizingPaint = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style2);
        paint6.setColor(-65281);
        paint6.setStrokeWidth(ru.cyberity.cbr.core.common.s.a(2));
        this.mFaceRectanglePaint = paint6;
        kotlin.ranges.l.f406912f.getClass();
        this.progressRange = kotlin.ranges.l.f406913g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRLivenessFaceView, i12, i13);
        this.mColorFaceMarkerActive = ExtensionsKt.getStyledColor(typedArrayObtainStyledAttributes, R.styleable.CBRLivenessFaceView_cbr_ProofaceMarkerActiveColor, -65281);
        this.mColorFaceMarkerInActive = ExtensionsKt.getStyledColor(typedArrayObtainStyledAttributes, R.styleable.CBRLivenessFaceView_cbr_ProofaceMarkerInActiveColor, -65281);
        paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRLivenessFaceView_cbr_ProofaceMarkerStroke, 0.0f));
        paint2.setStrokeWidth(paint.getStrokeWidth());
        this.mMarkerSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRLivenessFaceView_cbr_ProofaceMarkerSize, 0);
        this.mMarkerPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRLivenessFaceView_cbr_ProofaceMarkerPadding, 0);
        this.mColorOverlay = ExtensionsKt.getStyledColor(typedArrayObtainStyledAttributes, R.styleable.CBRLivenessFaceView_cbr_ProofaceOverlayColor, -1);
        paint4.setColor(ExtensionsKt.getStyledColor(typedArrayObtainStyledAttributes, R.styleable.CBRLivenessFaceView_cbr_ProofaceCompleteOverlayColor, -1));
        paint5.setColor(ExtensionsKt.getStyledColor(typedArrayObtainStyledAttributes, R.styleable.CBRLivenessFaceView_cbr_ProofaceRecognizingColor, -1));
        paint2.setColor(paint5.getColor());
        paint5.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRLivenessFaceView_cbr_ProofaceRecognizingStroke, 0.0f));
        this.detectingAnimationSpeed = typedArrayObtainStyledAttributes.getInt(R.styleable.CBRLivenessFaceView_cbr_ProofaceRecognizingAnimationSpeed, 1000);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRLivenessFaceView_android_padding)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRLivenessFaceView_android_padding, 0);
            setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRLivenessFaceView_android_paddingLeft, getPaddingLeft()), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRLivenessFaceView_android_paddingTop, getPaddingTop()), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRLivenessFaceView_android_paddingRight, getPaddingRight()), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRLivenessFaceView_android_paddingBottom, getPaddingBottom()));
        }
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(this.mColorFaceMarkerActive);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        CBRColorElement cBRColorElement = CBRColorElement.BACKGROUND_COMMON;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null && (color3 = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) != null) {
            setOverlayColor(color3.intValue());
        }
        CBRColorElement cBRColorElement2 = CBRColorElement.CONTENT_SUCCESS;
        ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper.getCustomTheme();
        if (customTheme2 != null && (color2 = themeHelper.getColor(customTheme2, cBRColorElement2, themeHelper.isDarkTheme(this))) != null) {
            int iIntValue = color2.intValue();
            setFaceRecognizedColor(iIntValue);
            setFaceMarkerActiveColor(iIntValue);
        }
        CBRColorElement cBRColorElement3 = CBRColorElement.CONTENT_WEAK;
        ru.cyberity.cbr.core.theme.d customTheme3 = themeHelper.getCustomTheme();
        if (customTheme3 == null || (color = themeHelper.getColor(customTheme3, cBRColorElement3, themeHelper.isDarkTheme(this))) == null) {
            return;
        }
        setFaceMarkerInActiveColor(color.intValue());
    }

    private static /* synthetic */ void getDetectingAnimationSpeed$annotations() {
    }

    private static /* synthetic */ void getDetectingArc1RotationAngle$annotations() {
    }

    private static /* synthetic */ void getDetectingArc2RotationAngle$annotations() {
    }

    private static /* synthetic */ void getProgressRotationAnimator$annotations() {
    }

    private static /* synthetic */ void getUpdater$annotations() {
    }
}
