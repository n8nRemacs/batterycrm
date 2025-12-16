package ru.cyberity.cbr.camera.photo.presentation.document;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;

/* compiled from: CBRFrameViewWithBackground.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001XB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0013J/\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R.\u0010.\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010'\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u0013R*\u0010:\u001a\u0002032\u0006\u0010'\u001a\u0002038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010$R\u0014\u0010=\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00100R$\u0010E\u001a\u00020@2\u0006\u0010'\u001a\u00020@8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010K\u001a\u00020F2\u0006\u0010'\u001a\u00020F8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010R\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010U\u001a\u00020@2\u0006\u0010'\u001a\u00020@8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bS\u0010B\"\u0004\bT\u0010DR\u0014\u0010W\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010O¨\u0006Y"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/G0;", "a", "()V", "Landroid/graphics/Canvas;", "canvas", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/RectF;", "frameRect", "(Landroid/graphics/RectF;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDraw", "b", "()Landroid/graphics/RectF;", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "canvasBitmap", "Landroid/graphics/Canvas;", "drawCanvas", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "canvasPaint", "Landroid/util/SizeF;", "value", "d", "Landroid/util/SizeF;", "getFrameSize", "()Landroid/util/SizeF;", "setFrameSize", "(Landroid/util/SizeF;)V", "frameSize", "e", "Landroid/graphics/RectF;", "getFrameRect", "setFrameRect", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground$State;", "f", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground$State;", "getState", "()Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground$State;", "setState", "(Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground$State;)V", VoiceInfo.STATE, "g", "rectPaint", "strokedRectPaint", "i", "strokedRect", "", "j", "F", "setStateFrameWidth", "(F)V", "stateFrameWidth", "Landroid/content/res/ColorStateList;", "k", "Landroid/content/res/ColorStateList;", "setStateFrameColors", "(Landroid/content/res/ColorStateList;)V", "stateFrameColors", "l", "I", "getFrameBackgroundColor", "()I", "setFrameBackgroundColor", "(I)V", "frameBackgroundColor", "m", "setStateFrameRadius", "stateFrameRadius", "getStateFrameColor", "stateFrameColor", "State", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRFrameViewWithBackground extends View {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private Bitmap canvasBitmap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private Canvas drawCanvas;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final Paint canvasPaint;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private SizeF frameSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private RectF frameRect;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private State state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final Paint rectPaint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final Paint strokedRectPaint;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private RectF strokedRect;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float stateFrameWidth;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    private ColorStateList stateFrameColors;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int frameBackgroundColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float stateFrameRadius;

    /* compiled from: CBRFrameViewWithBackground.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "RED", "YELLOW", "GREEN", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        DEFAULT,
        RED,
        YELLOW,
        GREEN
    }

    /* compiled from: CBRFrameViewWithBackground.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f432182a;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.YELLOW.ordinal()] = 1;
            iArr[State.GREEN.ordinal()] = 2;
            iArr[State.RED.ordinal()] = 3;
            f432182a = iArr;
        }
    }

    @j
    public CBRFrameViewWithBackground(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void a() {
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_WARNING);
        int iIntValue = themeColor != null ? themeColor.intValue() : this.stateFrameColors.getColorForState(new int[]{R.attr.cbr_statePending}, -65281);
        Integer themeColor2 = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_SUCCESS);
        int iIntValue2 = themeColor2 != null ? themeColor2.intValue() : this.stateFrameColors.getColorForState(new int[]{R.attr.cbr_stateApproved}, -65281);
        CBRColorElement cBRColorElement = CBRColorElement.CONTENT_CRITICAL;
        Integer themeColor3 = themeHelper.getThemeColor(this, cBRColorElement);
        int iIntValue3 = themeColor3 != null ? themeColor3.intValue() : this.stateFrameColors.getColorForState(new int[]{R.attr.cbr_stateRejected}, -65281);
        Integer themeColor4 = themeHelper.getThemeColor(this, cBRColorElement);
        setStateFrameColors(new ColorStateList(new int[][]{new int[]{R.attr.cbr_statePending}, new int[]{R.attr.cbr_stateApproved}, new int[]{R.attr.cbr_stateRejected}, new int[]{R.attr.cbr_stateInit}}, new int[]{iIntValue, iIntValue2, iIntValue3, themeColor4 != null ? themeColor4.intValue() : this.stateFrameColors.getColorForState(new int[]{R.attr.cbr_stateInit}, -65281)}));
    }

    private final int getStateFrameColor() {
        int i12 = a.f432182a[this.state.ordinal()];
        int colorForState = this.stateFrameColors.getColorForState(i12 != 1 ? i12 != 2 ? i12 != 3 ? new int[]{R.attr.cbr_stateInit} : new int[]{R.attr.cbr_stateRejected} : new int[]{R.attr.cbr_stateApproved} : new int[]{R.attr.cbr_statePending}, -65281);
        return Color.rgb(Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState));
    }

    private final void setFrameBackgroundColor(int i12) {
        this.frameBackgroundColor = i12;
        invalidate();
    }

    private final void setFrameRect(RectF rectF) {
        this.frameRect = rectF;
        if (rectF != null) {
            a(rectF);
        }
    }

    private final void setStateFrameColors(ColorStateList colorStateList) {
        this.stateFrameColors = colorStateList;
        invalidate();
    }

    private final void setStateFrameRadius(float f12) {
        this.stateFrameRadius = f12;
        invalidate();
    }

    private final void setStateFrameWidth(float f12) {
        this.stateFrameWidth = f12;
        this.strokedRectPaint.setStrokeWidth(f12);
        invalidate();
    }

    @l
    public final RectF b() {
        SizeF sizeF;
        if (getWidth() == 0 || getHeight() == 0 || (sizeF = this.frameSize) == null) {
            return null;
        }
        float f12 = 2;
        float width = (getWidth() - sizeF.getWidth()) / f12;
        float height = (getHeight() - sizeF.getHeight()) / f12;
        RectF rectF = new RectF(width, height, sizeF.getWidth() + width, sizeF.getHeight() + height);
        setFrameRect(rectF);
        return rectF;
    }

    public final int getFrameBackgroundColor() {
        return this.frameBackgroundColor;
    }

    @l
    public final RectF getFrameRect() {
        return this.frameRect;
    }

    @l
    public final SizeF getFrameSize() {
        return this.frameSize;
    }

    @k
    public final State getState() {
        return this.state;
    }

    @Override // android.view.View
    public void onDraw(@k Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.canvasBitmap == null || (canvas2 = this.drawCanvas) == null) {
            return;
        }
        a(canvas2);
        Bitmap bitmap = this.canvasBitmap;
        if (bitmap == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.canvasPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w12, int h12, int oldw, int oldh) {
        Bitmap bitmap;
        super.onSizeChanged(w12, h12, oldw, oldh);
        Bitmap bitmap2 = this.canvasBitmap;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.canvasBitmap) != null) {
            bitmap.recycle();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(w12, h12, Bitmap.Config.ARGB_8888);
        this.drawCanvas = new Canvas(bitmapCreateBitmap);
        this.canvasBitmap = bitmapCreateBitmap;
    }

    public final void setFrameSize(@l SizeF sizeF) {
        setFrameRect(null);
        this.frameSize = sizeF;
        invalidate();
    }

    public final void setState(@k State state) {
        this.state = state;
        RectF rectF = this.frameRect;
        if (rectF != null) {
            a(rectF);
            this.strokedRectPaint.setColor(getStateFrameColor());
        }
        invalidate();
    }

    public /* synthetic */ CBRFrameViewWithBackground(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? ru.cyberity.internal.R.attr.cbrFrameViewWithBackgroundStyle : i12, (i14 & 8) != 0 ? ru.cyberity.internal.R.style.Widget_CBRFrameViewWithBackground : i13);
    }

    @j
    public CBRFrameViewWithBackground(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.canvasPaint = new Paint(4);
        this.state = State.RED;
        Paint paint = new Paint();
        this.rectPaint = paint;
        Paint paint2 = new Paint();
        this.strokedRectPaint = paint2;
        this.strokedRect = new RectF();
        this.stateFrameColors = ColorStateList.valueOf(-65281);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ru.cyberity.internal.R.styleable.CBRFrameViewWithBackground, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(ru.cyberity.internal.R.styleable.CBRFrameViewWithBackground_cbr_stateFrameColor)) {
            setStateFrameColors(s.a(typedArrayObtainStyledAttributes, context, ru.cyberity.internal.R.styleable.CBRFrameViewWithBackground_cbr_stateFrameColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ru.cyberity.internal.R.styleable.CBRFrameViewWithBackground_cbr_stateFrameRadius)) {
            setStateFrameRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(ru.cyberity.internal.R.styleable.CBRFrameViewWithBackground_cbr_stateFrameRadius, context.getResources().getDimensionPixelSize(ru.cyberity.internal.R.dimen.cbr_state_frame_radius)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ru.cyberity.internal.R.styleable.CBRFrameViewWithBackground_cbr_stateFrameWidth)) {
            setStateFrameWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(ru.cyberity.internal.R.styleable.CBRFrameViewWithBackground_cbr_stateFrameWidth, context.getResources().getDimensionPixelSize(ru.cyberity.internal.R.dimen.cbr_frame_stroke_width)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ru.cyberity.internal.R.styleable.CBRFrameViewWithBackground_cbr_frameBackgroundColor)) {
            setFrameBackgroundColor(typedArrayObtainStyledAttributes.getColor(ru.cyberity.internal.R.styleable.CBRFrameViewWithBackground_cbr_frameBackgroundColor, androidx.core.content.d.getColor(context, ru.cyberity.internal.R.color.auto_capture_frame_background)));
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        a();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        Float themeMetricDimension = themeHelper.getThemeMetricDimension(CBRMetricElement.DOCUMENT_FRAME_BORDER_WIDTH);
        if (themeMetricDimension != null) {
            setStateFrameWidth(themeMetricDimension.floatValue());
        }
        Float themeMetricDimension2 = themeHelper.getThemeMetricDimension(CBRMetricElement.DOCUMENT_FRAME_CORNER_RADIUS);
        if (themeMetricDimension2 != null) {
            setStateFrameRadius(themeMetricDimension2.floatValue());
        }
        Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.CAMERA_BACKGROUND_OVERLAY);
        if (themeColor != null) {
            setFrameBackgroundColor(themeColor.intValue());
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setDither(true);
        paint.setColor(0);
        paint2.setColor(getStateFrameColor());
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setPathEffect(new DashPathEffect(new float[]{context.getResources().getDimensionPixelSize(ru.cyberity.internal.R.dimen.cbr_frame_stroke_interval), context.getResources().getDimensionPixelSize(ru.cyberity.internal.R.dimen.cbr_frame_stroke_interval)}, 0.0f));
    }

    private final void a(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        RectF rectFB = this.frameRect;
        if (rectFB == null && (rectFB = b()) == null) {
            return;
        }
        canvas.drawColor(this.frameBackgroundColor);
        float f12 = this.stateFrameRadius;
        canvas.drawRoundRect(rectFB, f12, f12, this.rectPaint);
        RectF rectF = this.strokedRect;
        float f13 = this.stateFrameRadius;
        canvas.drawRoundRect(rectF, f13, f13, this.strokedRectPaint);
    }

    private final void a(RectF frameRect) {
        float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(ru.cyberity.internal.R.dimen.cbr_frame_stroke_width);
        this.strokedRect = new RectF(frameRect.left - dimensionPixelSize, frameRect.top - dimensionPixelSize, frameRect.right + dimensionPixelSize, frameRect.bottom + dimensionPixelSize);
    }
}
