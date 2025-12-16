package com.avito.android.lib.design.skeleton.shimmer;

import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.util.C1;
import com.avito.android.util.D1;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.u0;

/* compiled from: ShimmerLayout.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001(B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\fJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/ShimmerLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "visibility", "Lkotlin/G0;", "setVisibility", "(I)V", "shimmerColor", "setShimmerColor", "durationMillis", "setShimmerAnimationDuration", "", "animationReversed", "setAnimationReversed", "(Z)V", "", "maskWidth", "setMaskWidth", "(F)V", "gradientCenterColorWidth", "setGradientCenterColorWidth", "angle", "setShimmerAngle", "Landroid/graphics/Bitmap;", "getMaskBitmap", "()Landroid/graphics/Bitmap;", "Landroid/animation/Animator;", "getShimmerAnimation", "()Landroid/animation/Animator;", "shimmerAnimation", "", "getGradientColorDistribution", "()[F", "gradientColorDistribution", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShimmerLayout extends FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f180517t = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f180518b;

    /* renamed from: c, reason: collision with root package name */
    public int f180519c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Rect f180520d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Paint f180521e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ValueAnimator f180522f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Bitmap f180523g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Bitmap f180524h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Canvas f180525i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f180526j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f180527k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f180528l;

    /* renamed from: m, reason: collision with root package name */
    public int f180529m;

    /* renamed from: n, reason: collision with root package name */
    public int f180530n;

    /* renamed from: o, reason: collision with root package name */
    public int f180531o;

    /* renamed from: p, reason: collision with root package name */
    public float f180532p;

    /* renamed from: q, reason: collision with root package name */
    public float f180533q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public b f180534r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f180535s;

    /* compiled from: ShimmerLayout.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/ShimmerLayout$a;", "", "<init>", "()V", "", "DEFAULT_ANGLE", "B", "", "DEFAULT_ANIMATION_DURATION", "I", "DEFAULT_ANIMATION_DURATION_FOR_PULSATE", "MAX_ALPHA", "MAX_ANGLE_VALUE", "MAX_GRADIENT_CENTER_COLOR_WIDTH_VALUE", "MAX_MASK_WIDTH_VALUE", "MIN_ALPHA", "MIN_ANGLE_VALUE", "MIN_GRADIENT_CENTER_COLOR_WIDTH_VALUE", "MIN_MASK_WIDTH_VALUE", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ShimmerLayout.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/skeleton/shimmer/ShimmerLayout$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ShimmerLayout shimmerLayout = ShimmerLayout.this;
            shimmerLayout.getViewTreeObserver().removeOnPreDrawListener(this);
            shimmerLayout.c();
            return true;
        }
    }

    static {
        new a(null);
    }

    public ShimmerLayout(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f180519c = 255;
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.n.f178916D0, 0, 0);
        try {
            this.f180531o = typedArrayObtainStyledAttributes.getInteger(0, 20);
            this.f180529m = typedArrayObtainStyledAttributes.getInteger(1, 1500);
            this.f180530n = typedArrayObtainStyledAttributes.getColor(3, getContext().getColor(R.color.common_white));
            this.f180528l = typedArrayObtainStyledAttributes.getBoolean(2, false);
            this.f180532p = typedArrayObtainStyledAttributes.getFloat(5, 0.5f);
            this.f180533q = typedArrayObtainStyledAttributes.getFloat(4, 0.1f);
            this.f180526j = typedArrayObtainStyledAttributes.getBoolean(7, false);
            this.f180535s = typedArrayObtainStyledAttributes.getBoolean(6, false);
            typedArrayObtainStyledAttributes.recycle();
            setMaskWidth(this.f180532p);
            this.f180532p = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
            setGradientCenterColorWidth(this.f180533q);
            setShimmerAngle(this.f180531o);
            if (this.f180528l && getVisibility() == 0) {
                c();
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private final float[] getGradientColorDistribution() {
        float[] fArr = {0.0f, 0.5f - (f / 2.0f), (f / 2.0f) + 0.5f, 1.0f};
        float f12 = this.f180533q;
        return fArr;
    }

    private final Bitmap getMaskBitmap() {
        Bitmap bitmapCreateBitmap;
        if (this.f180524h == null) {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(this.f180520d.width(), getHeight(), Bitmap.Config.ALPHA_8);
            } catch (OutOfMemoryError unused) {
                System.gc();
                bitmapCreateBitmap = null;
            }
            this.f180524h = bitmapCreateBitmap;
        }
        return this.f180524h;
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final Animator getShimmerAnimation() {
        ValueAnimator valueAnimator = this.f180522f;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        if (this.f180520d == null) {
            this.f180520d = new Rect(0, 0, (int) ((Math.tan(Math.toRadians(Math.abs(this.f180531o))) * getHeight()) + (this.f180532p / Math.cos(Math.toRadians(Math.abs(this.f180531o))))), getHeight());
        }
        if (this.f180535s) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 127, 127, 255);
            valueAnimatorOfInt.setDuration(1200L);
            D1.a(valueAnimatorOfInt, -1);
            valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.5f, 0.0f, 0.5f, 1.0f));
            valueAnimatorOfInt.addUpdateListener(new AV.a(this, 1));
            this.f180522f = valueAnimatorOfInt;
        } else {
            int width = getWidth();
            int i12 = getWidth() > this.f180520d.width() ? -width : -this.f180520d.width();
            int iWidth = this.f180520d.width();
            int i13 = width - i12;
            ValueAnimator valueAnimatorOfInt2 = this.f180526j ? ValueAnimator.ofInt(i13, 0) : ValueAnimator.ofInt(0, i13);
            this.f180522f = valueAnimatorOfInt2;
            if (valueAnimatorOfInt2 != null) {
                valueAnimatorOfInt2.setDuration(this.f180529m);
                D1.a(valueAnimatorOfInt2, -1);
                valueAnimatorOfInt2.removeAllUpdateListeners();
                valueAnimatorOfInt2.addUpdateListener(new AV.d(this, i12, iWidth, 0));
            }
        }
        return this.f180522f;
    }

    private final void setShimmerAngle(int angle) {
        if (angle < -45 || 45 < angle) {
            u0 u0Var = u0.f406856a;
            throw new IllegalArgumentException(String.format("shimmerAngle value must be between %d and %d", Arrays.copyOf(new Object[]{(byte) -45, (byte) 45}, 2)).toString());
        }
        this.f180531o = angle;
        a();
    }

    public final void a() {
        if (this.f180527k) {
            b();
            c();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f180522f;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f180522f.removeAllUpdateListeners();
        }
        this.f180522f = null;
        this.f180521e = null;
        this.f180527k = false;
        this.f180525i = null;
        Bitmap bitmap = this.f180524h;
        if (bitmap != null) {
            bitmap.recycle();
            this.f180524h = null;
        }
    }

    public final void c() {
        C1.f318564a.getClass();
        if (!C1.a() || this.f180527k) {
            return;
        }
        if (getWidth() != 0) {
            getShimmerAnimation().start();
            this.f180527k = true;
        } else {
            if (this.f180534r != null) {
                getViewTreeObserver().removeOnPreDrawListener(this.f180534r);
            }
            this.f180534r = new b();
            getViewTreeObserver().addOnPreDrawListener(this.f180534r);
        }
    }

    public final void d() {
        if (this.f180534r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f180534r);
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@k Canvas canvas) {
        Paint paint;
        LinearGradient linearGradient;
        if (!this.f180527k || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
        Bitmap maskBitmap = getMaskBitmap();
        this.f180523g = maskBitmap;
        if (maskBitmap == null) {
            return;
        }
        Canvas canvas2 = this.f180525i;
        if (canvas2 == null) {
            canvas2 = new Canvas(this.f180523g);
            this.f180525i = canvas2;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas2.save();
        canvas2.translate(-this.f180518b, 0.0f);
        super.dispatchDraw(canvas2);
        canvas2.restore();
        if (this.f180521e == null) {
            int i12 = this.f180530n;
            int iArgb = Color.argb(0, Color.red(i12), Color.green(i12), Color.blue(i12));
            float f12 = this.f180532p;
            float height = this.f180531o >= 0 ? getHeight() : 0.0f;
            if (this.f180535s) {
                float width = getWidth();
                int i13 = this.f180530n;
                linearGradient = new LinearGradient(0.0f, 0.0f, width, 0.0f, i13, i13, Shader.TileMode.CLAMP);
            } else {
                float fCos = ((float) Math.cos(Math.toRadians(this.f180531o))) * f12;
                float fSin = (((float) Math.sin(Math.toRadians(this.f180531o))) * f12) + height;
                int i14 = this.f180530n;
                linearGradient = new LinearGradient(0.0f, height, fCos, fSin, new int[]{iArgb, i14, i14, iArgb}, getGradientColorDistribution(), Shader.TileMode.CLAMP);
            }
            Bitmap bitmap = this.f180523g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            ComposeShader composeShader = new ComposeShader(linearGradient, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.DST_IN);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setDither(true);
            paint2.setFilterBitmap(true);
            paint2.setShader(composeShader);
            this.f180521e = paint2;
        }
        canvas.save();
        canvas.translate(this.f180518b, 0.0f);
        if (this.f180535s && (paint = this.f180521e) != null) {
            paint.setAlpha(this.f180519c);
        }
        Rect rect = this.f180520d;
        canvas.drawRect(rect.left, 0.0f, rect.width(), this.f180520d.height(), this.f180521e);
        canvas.restore();
        this.f180523g = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f180528l && getVisibility() == 0) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        if (this.f180534r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f180534r);
        }
        super.onDetachedFromWindow();
    }

    public final void setAnimationReversed(boolean animationReversed) {
        this.f180526j = animationReversed;
        a();
    }

    public final void setGradientCenterColorWidth(float gradientCenterColorWidth) {
        if (gradientCenterColorWidth <= 0.0f || 1.0f <= gradientCenterColorWidth) {
            u0 u0Var = u0.f406856a;
            throw new IllegalArgumentException(String.format("gradientCenterColorWidth value must be higher than %d and less than %d", Arrays.copyOf(new Object[]{(byte) 0, (byte) 1}, 2)).toString());
        }
        this.f180533q = gradientCenterColorWidth;
        a();
    }

    public final void setMaskWidth(float maskWidth) {
        if (maskWidth <= 0.0f || 1.0f < maskWidth) {
            u0 u0Var = u0.f406856a;
            throw new IllegalArgumentException(String.format("maskWidth value must be higher than %d and less or equal to %d", Arrays.copyOf(new Object[]{(byte) 0, (byte) 1}, 2)).toString());
        }
        this.f180532p = maskWidth;
        a();
    }

    public final void setShimmerAnimationDuration(int durationMillis) {
        this.f180529m = durationMillis;
        a();
    }

    public final void setShimmerColor(int shimmerColor) {
        this.f180530n = shimmerColor;
        a();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (visibility != 0) {
            d();
        } else if (this.f180528l) {
            c();
        }
    }
}
