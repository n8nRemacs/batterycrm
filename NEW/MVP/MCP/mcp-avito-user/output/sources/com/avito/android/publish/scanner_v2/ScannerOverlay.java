package com.avito.android.publish.scanner_v2;

import X41.j;
import Y61.k;
import Y61.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import com.avito.android.publish.P0;
import com.avito.android.publish.scanner_v2.a;
import com.avito.android.util.D1;
import com.avito.android.util.y6;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ScannerOverlay.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/avito/android/publish/scanner_v2/ScannerOverlay;", "Landroid/view/View;", "", "k", "Z", "getProgressEnabled", "()Z", "setProgressEnabled", "(Z)V", "progressEnabled", "Lcom/avito/android/publish/scanner_v2/ScannerOverlay$a;", "l", "Lcom/avito/android/publish/scanner_v2/ScannerOverlay$a;", "getCalculatePaddingListener", "()Lcom/avito/android/publish/scanner_v2/ScannerOverlay$a;", "setCalculatePaddingListener", "(Lcom/avito/android/publish/scanner_v2/ScannerOverlay$a;)V", "calculatePaddingListener", "Landroid/graphics/LinearGradient;", "getGradientShader", "()Landroid/graphics/LinearGradient;", "gradientShader", "ControllerType", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ScannerOverlay extends View {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f239281I = 0;

    /* renamed from: A, reason: collision with root package name */
    public final float f239282A;

    /* renamed from: B, reason: collision with root package name */
    public final int f239283B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public ValueAnimator f239284C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final AV.a f239285D;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final Paint f239286E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final Paint f239287F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final Paint f239288G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final Paint f239289H;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RectF f239290b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RectF f239291c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f239292d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RectF f239293e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RectF f239294f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Path f239295g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Path f239296h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Matrix f239297i;

    /* renamed from: j, reason: collision with root package name */
    public float f239298j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean progressEnabled;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @l
    public a calculatePaddingListener;

    /* renamed from: m, reason: collision with root package name */
    public final float f239301m;

    /* renamed from: n, reason: collision with root package name */
    public final float f239302n;

    /* renamed from: o, reason: collision with root package name */
    public final float f239303o;

    /* renamed from: p, reason: collision with root package name */
    public final float f239304p;

    /* renamed from: q, reason: collision with root package name */
    public final float f239305q;

    /* renamed from: r, reason: collision with root package name */
    public final float f239306r;

    /* renamed from: s, reason: collision with root package name */
    public final float f239307s;

    /* renamed from: t, reason: collision with root package name */
    public int f239308t;

    /* renamed from: u, reason: collision with root package name */
    public int f239309u;

    /* renamed from: v, reason: collision with root package name */
    public final float f239310v;

    /* renamed from: w, reason: collision with root package name */
    public final float f239311w;

    /* renamed from: x, reason: collision with root package name */
    public final float f239312x;

    /* renamed from: y, reason: collision with root package name */
    public final float f239313y;

    /* renamed from: z, reason: collision with root package name */
    public final float f239314z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScannerOverlay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner_v2/ScannerOverlay$ControllerType;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ControllerType {

        /* renamed from: b, reason: collision with root package name */
        public static final ControllerType f239315b;

        /* renamed from: c, reason: collision with root package name */
        public static final ControllerType f239316c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ControllerType[] f239317d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f239318e;

        static {
            ControllerType controllerType = new ControllerType("COLLAPSED", 0);
            f239315b = controllerType;
            ControllerType controllerType2 = new ControllerType("EXPANDED", 1);
            f239316c = controllerType2;
            ControllerType[] controllerTypeArr = {controllerType, controllerType2};
            f239317d = controllerTypeArr;
            f239318e = kotlin.enums.c.a(controllerTypeArr);
        }

        public ControllerType() {
            throw null;
        }

        public static ControllerType valueOf(String str) {
            return (ControllerType) Enum.valueOf(ControllerType.class, str);
        }

        public static ControllerType[] values() {
            return (ControllerType[]) f239317d.clone();
        }
    }

    /* compiled from: ScannerOverlay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner_v2/ScannerOverlay$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void e0(@k ControllerType controllerType, @k a.C7196a c7196a);
    }

    @j
    public ScannerOverlay(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearGradient getGradientShader() {
        RectF rectF = this.f239294f;
        return new LinearGradient(rectF.centerX(), rectF.top, rectF.centerX(), rectF.bottom, new int[]{0, this.f239283B, 0}, new float[]{0.01f, 0.5f, 0.99f}, Shader.TileMode.CLAMP);
    }

    @l
    public final a getCalculatePaddingListener() {
        return this.calculatePaddingListener;
    }

    public final boolean getProgressEnabled() {
        return this.progressEnabled;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Path path = this.f239295g;
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        canvas.drawRect(this.f239290b, this.f239288G);
        canvas.restore();
        if (!this.progressEnabled) {
            canvas.drawPath(this.f239296h, this.f239289H);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.drawRect(this.f239294f, this.f239287F);
        canvas.drawRect(this.f239293e, this.f239286E);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        RectF rectF = this.f239290b;
        rectF.left = getPaddingLeft();
        rectF.right = getWidth() - getPaddingRight();
        rectF.top = getPaddingTop();
        float height = getHeight() - getPaddingBottom();
        rectF.bottom = height;
        RectF rectF2 = this.f239291c;
        float f12 = rectF.left;
        float f13 = this.f239303o;
        rectF2.left = f12 + f13;
        rectF2.right = rectF.right - f13;
        rectF2.top = rectF.top + this.f239301m;
        rectF2.bottom = height - this.f239302n;
        com.avito.android.publish.scanner_v2.a aVar = com.avito.android.publish.scanner_v2.a.f239319a;
        int i16 = this.f239308t;
        int i17 = (int) this.f239305q;
        int i18 = this.f239309u;
        int i19 = (int) this.f239306r;
        int i22 = (int) this.f239307s;
        aVar.getClass();
        a.C7196a c7196aA = com.avito.android.publish.scanner_v2.a.a(this.f239304p, (int) rectF.width(), (int) rectF.height(), (int) f13, i16, i17, i18, i19, i22);
        float f14 = rectF.left;
        float f15 = c7196aA.f239322c;
        rectF2.left = f14 + f15;
        rectF2.right = rectF.right - f15;
        rectF2.top = rectF.top + c7196aA.f239320a;
        rectF2.bottom = rectF.bottom - c7196aA.f239321b;
        ControllerType controllerType = c7196aA.f239323d ? ControllerType.f239315b : ControllerType.f239316c;
        a aVar2 = this.calculatePaddingListener;
        if (aVar2 != null) {
            aVar2.e0(controllerType, c7196aA);
        }
        float f16 = rectF2.top;
        float f17 = this.f239314z;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f16 + f17, rectF2.bottom);
        valueAnimatorOfFloat.setDuration(1000L);
        D1.a(valueAnimatorOfFloat, -1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(this.f239285D);
        this.f239284C = valueAnimatorOfFloat;
        RectF rectF3 = this.f239292d;
        float f18 = rectF2.left;
        float f19 = this.f239311w;
        rectF3.left = f18 + f19;
        rectF3.right = rectF2.right - f19;
        rectF3.top = rectF2.top + f19;
        rectF3.bottom = rectF2.bottom - f19;
        RectF rectF4 = this.f239293e;
        float f22 = rectF2.left;
        rectF4.left = f22;
        float f23 = rectF2.right;
        rectF4.right = f23;
        float f24 = rectF2.bottom;
        float f25 = f24 - f17;
        rectF4.top = f25;
        rectF4.bottom = f24;
        RectF rectF5 = this.f239294f;
        rectF5.left = f22;
        rectF5.right = f23;
        float f26 = this.f239282A;
        rectF5.top = f25 - f26;
        rectF5.bottom = f24 + f26;
        this.f239287F.setShader(getGradientShader());
        Path path = this.f239295g;
        path.reset();
        float f27 = rectF2.left;
        float f28 = this.f239310v;
        path.moveTo(f27 + f28, rectF2.bottom);
        float f29 = rectF2.left;
        float f32 = rectF2.bottom;
        path.quadTo(f29, f32, f29, f32 - f28);
        path.moveTo(rectF2.left, rectF2.bottom - f28);
        path.lineTo(rectF2.left, rectF2.top + f28);
        float f33 = rectF2.left;
        float f34 = rectF2.top;
        path.quadTo(f33, f34, f33 + f28, f34);
        path.lineTo(rectF2.right - f28, rectF2.top);
        float f35 = rectF2.right;
        float f36 = rectF2.top;
        path.quadTo(f35, f36, f35, f36 + f28);
        path.lineTo(rectF2.right, rectF2.bottom - f28);
        float f37 = rectF2.right;
        float f38 = rectF2.bottom;
        path.quadTo(f37, f38, f37 - f28, f38);
        path.lineTo(rectF2.left + f28, rectF2.bottom);
        Path path2 = this.f239296h;
        path2.reset();
        float f39 = rectF3.left;
        float f42 = rectF3.top;
        float f43 = this.f239312x;
        float f44 = this.f239313y;
        path2.moveTo(f39, f42 + f43 + f44);
        path2.lineTo(rectF3.left, rectF3.top + f43);
        float f45 = rectF3.left;
        float f46 = rectF3.top;
        path2.quadTo(f45, f46, f45 + f43, f46);
        path2.lineTo(rectF3.left + f43 + f44, rectF3.top);
        path2.moveTo((rectF3.right - f43) - f44, rectF3.top);
        path2.lineTo(rectF3.right - f43, rectF3.top);
        float f47 = rectF3.right;
        float f48 = rectF3.top;
        path2.quadTo(f47, f48, f47, f48 + f43);
        path2.lineTo(rectF3.right, rectF3.top + f44 + f43);
        path2.moveTo(rectF3.right, (rectF3.bottom - f43) - f44);
        path2.lineTo(rectF3.right, rectF3.bottom - f43);
        float f49 = rectF3.right;
        float f52 = rectF3.bottom;
        path2.quadTo(f49, f52, f49 - f43, f52);
        path2.lineTo((rectF3.right - f43) - f44, rectF3.bottom);
        path2.moveTo(rectF3.left + f44 + f43, rectF3.bottom);
        path2.lineTo(rectF3.left + f43, rectF3.bottom);
        float f53 = rectF3.left;
        float f54 = rectF3.bottom;
        path2.quadTo(f53, f54, f53, f54 - f43);
        path2.lineTo(rectF3.left, (rectF3.bottom - f43) - f44);
        this.f239298j = rectF4.top;
    }

    public final void setCalculatePaddingListener(@l a aVar) {
        this.calculatePaddingListener = aVar;
    }

    public final void setProgressEnabled(boolean z12) {
        this.progressEnabled = z12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ScannerOverlay(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        i12 = (i13 & 4) != 0 ? 0 : i12;
        super(context, attributeSet, i12);
        this.f239290b = new RectF();
        this.f239291c = new RectF();
        this.f239292d = new RectF();
        this.f239293e = new RectF();
        this.f239294f = new RectF();
        this.f239295g = new Path();
        this.f239296h = new Path();
        this.f239297i = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P0.m.f231957c, i12, R.style.ScannerOverlayDefault);
        this.f239301m = typedArrayObtainStyledAttributes.getDimension(13, y6.b(40));
        this.f239302n = typedArrayObtainStyledAttributes.getDimension(12, y6.b(228));
        this.f239303o = typedArrayObtainStyledAttributes.getDimension(14, y6.b(32));
        this.f239304p = typedArrayObtainStyledAttributes.getFloat(6, 0.71f);
        this.f239305q = typedArrayObtainStyledAttributes.getDimension(10, y6.b(48));
        this.f239306r = typedArrayObtainStyledAttributes.getDimension(9, y6.b(180));
        this.f239307s = typedArrayObtainStyledAttributes.getDimension(7, y6.b(WebSocketProtocol.PAYLOAD_SHORT));
        this.f239310v = typedArrayObtainStyledAttributes.getDimension(11, y6.b(12));
        this.f239311w = typedArrayObtainStyledAttributes.getDimension(2, y6.b(10));
        this.f239312x = typedArrayObtainStyledAttributes.getDimension(3, y6.b(12));
        this.f239313y = typedArrayObtainStyledAttributes.getDimension(1, y6.b(30));
        float dimension = typedArrayObtainStyledAttributes.getDimension(4, y6.b(2));
        this.f239314z = typedArrayObtainStyledAttributes.getDimension(15, y6.b(2));
        this.f239282A = typedArrayObtainStyledAttributes.getDimension(17, y6.b(30));
        int color = typedArrayObtainStyledAttributes.getColor(16, 0);
        this.f239283B = color;
        int color2 = typedArrayObtainStyledAttributes.getColor(8, 0);
        float f12 = typedArrayObtainStyledAttributes.getFloat(5, 1.0f);
        int color3 = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        C22823h0.K(this, new Ae0.c(this, 1));
        this.f239285D = new AV.a(this, 2);
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setAlpha(JfifUtil.MARKER_SOI);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        this.f239286E = paint;
        Paint paint2 = new Paint();
        paint2.setAlpha(120);
        paint2.setStyle(style);
        this.f239287F = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(color2);
        paint3.setAlpha((int) (f12 * 255));
        this.f239288G = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(color3);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(dimension);
        this.f239289H = paint4;
    }
}
