package defpackage;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.ok.messages.settings.view.SliderWithCustomTicks;

/* loaded from: classes.dex */
public abstract class al0 extends View {
    public static final int E1 = m5d.Widget_MaterialComponents_Slider;
    public static final int F1 = dvc.motionDurationMedium4;
    public static final int G1 = dvc.motionDurationShort3;
    public static final int H1 = dvc.motionEasingEmphasizedInterpolator;
    public static final int I1 = dvc.motionEasingEmphasizedAccelerateInterpolator;
    public final ArrayList A0;
    public List A1;
    public boolean B0;
    public float B1;
    public ValueAnimator C0;
    public int C1;
    public ValueAnimator D0;
    public final vk0 D1;
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public final int Z0;
    public final Paint a;
    public float a1;
    public final Paint b;
    public MotionEvent b1;
    public final Paint c;
    public boolean c1;
    public final Paint d;
    public float d1;
    public float e1;
    public ArrayList f1;
    public int g1;
    public int h1;
    public float i1;
    public float[] j1;
    public boolean k1;
    public int l1;
    public int m1;
    public int n1;
    public final Paint o;
    public boolean o1;
    public boolean p1;
    public ColorStateList q1;
    public ColorStateList r1;
    public final Paint s0;
    public ColorStateList s1;
    public final Paint t0;
    public ColorStateList t1;
    public final yk0 u0;
    public ColorStateList u1;
    public final AccessibilityManager v0;
    public final Path v1;
    public xk0 w0;
    public final RectF w1;
    public final int x0;
    public final RectF x1;
    public final ArrayList y0;
    public final wq8 y1;
    public final ArrayList z0;
    public Drawable z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v5, types: [vk0] */
    public al0(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = E1;
        super(er8.a(context, attributeSet, 0, i), attributeSet, 0);
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = false;
        this.V0 = -1;
        this.W0 = -1;
        this.c1 = false;
        this.f1 = new ArrayList();
        this.g1 = -1;
        this.h1 = -1;
        this.i1 = 0.0f;
        this.k1 = true;
        this.o1 = false;
        this.v1 = new Path();
        this.w1 = new RectF();
        this.x1 = new RectF();
        wq8 wq8Var = new wq8();
        this.y1 = wq8Var;
        this.A1 = Collections.EMPTY_LIST;
        this.C1 = 0;
        final l4f l4fVar = (l4f) this;
        this.D1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: vk0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                l4fVar.w();
            }
        };
        Context context2 = getContext();
        this.a = new Paint();
        this.b = new Paint();
        Paint paint = new Paint(1);
        this.c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.o = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.s0 = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.t0 = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.M0 = resources.getDimensionPixelSize(dwc.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(dwc.mtrl_slider_track_side_padding);
        this.F0 = dimensionPixelOffset;
        this.Q0 = dimensionPixelOffset;
        this.G0 = resources.getDimensionPixelSize(dwc.mtrl_slider_thumb_radius);
        this.H0 = resources.getDimensionPixelSize(dwc.mtrl_slider_track_height);
        this.I0 = resources.getDimensionPixelSize(dwc.mtrl_slider_tick_radius);
        this.J0 = resources.getDimensionPixelSize(dwc.mtrl_slider_tick_radius);
        this.K0 = resources.getDimensionPixelSize(dwc.mtrl_slider_tick_min_spacing);
        this.Z0 = resources.getDimensionPixelSize(dwc.mtrl_slider_label_padding);
        int[] iArr = z5d.Slider;
        d7g.a(context2, attributeSet, 0, i);
        d7g.b(context2, attributeSet, iArr, 0, i, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, i);
        this.x0 = typedArrayObtainStyledAttributes.getResourceId(z5d.Slider_labelStyle, m5d.Widget_MaterialComponents_Tooltip);
        this.d1 = typedArrayObtainStyledAttributes.getFloat(z5d.Slider_android_valueFrom, 0.0f);
        this.e1 = typedArrayObtainStyledAttributes.getFloat(z5d.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.d1));
        this.i1 = typedArrayObtainStyledAttributes.getFloat(z5d.Slider_android_stepSize, 0.0f);
        this.L0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(z5d.Slider_minTouchTargetSize, (float) Math.ceil(yqi.b(getContext(), 48))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(z5d.Slider_trackColor);
        int i2 = zHasValue ? z5d.Slider_trackColor : z5d.Slider_trackColorInactive;
        int i3 = zHasValue ? z5d.Slider_trackColor : z5d.Slider_trackColorActive;
        ColorStateList colorStateListC = gti.c(context2, typedArrayObtainStyledAttributes, i2);
        setTrackInactiveTintList(colorStateListC == null ? z7.c(context2, ovc.material_slider_inactive_track_color) : colorStateListC);
        ColorStateList colorStateListC2 = gti.c(context2, typedArrayObtainStyledAttributes, i3);
        setTrackActiveTintList(colorStateListC2 == null ? z7.c(context2, ovc.material_slider_active_track_color) : colorStateListC2);
        wq8Var.k(gti.c(context2, typedArrayObtainStyledAttributes, z5d.Slider_thumbColor));
        if (typedArrayObtainStyledAttributes.hasValue(z5d.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(gti.c(context2, typedArrayObtainStyledAttributes, z5d.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(z5d.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateListC3 = gti.c(context2, typedArrayObtainStyledAttributes, z5d.Slider_haloColor);
        setHaloTintList(colorStateListC3 == null ? z7.c(context2, ovc.material_slider_halo_color) : colorStateListC3);
        this.k1 = typedArrayObtainStyledAttributes.getBoolean(z5d.Slider_tickVisible, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(z5d.Slider_tickColor);
        int i4 = zHasValue2 ? z5d.Slider_tickColor : z5d.Slider_tickColorInactive;
        int i5 = zHasValue2 ? z5d.Slider_tickColor : z5d.Slider_tickColorActive;
        ColorStateList colorStateListC4 = gti.c(context2, typedArrayObtainStyledAttributes, i4);
        setTickInactiveTintList(colorStateListC4 == null ? z7.c(context2, ovc.material_slider_inactive_tick_marks_color) : colorStateListC4);
        ColorStateList colorStateListC5 = gti.c(context2, typedArrayObtainStyledAttributes, i5);
        setTickActiveTintList(colorStateListC5 == null ? z7.c(context2, ovc.material_slider_active_tick_marks_color) : colorStateListC5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(z5d.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_tickRadiusActive, this.X0 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.Slider_tickRadiusInactive, this.X0 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(z5d.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(z5d.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        wq8Var.l();
        this.E0 = ViewConfiguration.get(context2).getScaledTouchSlop();
        yk0 yk0Var = new yk0(l4fVar);
        this.u0 = yk0Var;
        hfh.n(this, yk0Var);
        this.v0 = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final boolean A(float f) {
        return i(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.d1)), MathContext.DECIMAL64).doubleValue());
    }

    public final float B(float f) {
        return (o(f) * this.n1) + this.Q0;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.R0, this.S0);
        } else {
            float fMax = Math.max(this.R0, this.S0) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final int b() {
        int i = this.N0 / 2;
        int i2 = this.O0;
        return i + ((i2 == 1 || i2 == 3) ? ((icg) this.y0.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator c(boolean z) {
        int iC;
        TimeInterpolator timeInterpolatorD;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.D0 : this.C0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iC = exi.c(F1, 83, getContext());
            timeInterpolatorD = exi.d(getContext(), H1, rg.e);
        } else {
            iC = exi.c(G1, 117, getContext());
            timeInterpolatorD = exi.d(getContext(), I1, rg.c);
        }
        valueAnimatorOfFloat.setDuration(iC);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorD);
        valueAnimatorOfFloat.addUpdateListener(new wk0(0, this));
        return valueAnimatorOfFloat;
    }

    public final void d(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.Q0 + ((int) (o(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.u0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setColor(h(this.u1));
        this.b.setColor(h(this.t1));
        this.o.setColor(h(this.s1));
        this.s0.setColor(h(this.r1));
        this.t0.setColor(h(this.t1));
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            icg icgVar = (icg) it.next();
            if (icgVar.isStateful()) {
                icgVar.setState(getDrawableState());
            }
        }
        wq8 wq8Var = this.y1;
        if (wq8Var.isStateful()) {
            wq8Var.setState(getDrawableState());
        }
        int iH = h(this.q1);
        Paint paint = this.d;
        paint.setColor(iH);
        paint.setAlpha(63);
    }

    public final void e() {
        if (!this.B0) {
            this.B0 = true;
            ValueAnimator valueAnimatorC = c(true);
            this.C0 = valueAnimatorC;
            this.D0 = null;
            valueAnimatorC.start();
        }
        ArrayList arrayList = this.y0;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.f1.size() && it.hasNext(); i++) {
            if (i != this.h1) {
                q((icg) it.next(), ((Float) this.f1.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f1.size())));
        }
        q((icg) it.next(), ((Float) this.f1.get(this.h1)).floatValue());
    }

    public final void f() {
        if (this.B0) {
            this.B0 = false;
            ValueAnimator valueAnimatorC = c(false);
            this.D0 = valueAnimatorC;
            this.C0 = null;
            valueAnimatorC.addListener(new s6(2, this));
            this.D0.start();
        }
    }

    public final float[] g() {
        float fFloatValue = ((Float) this.f1.get(0)).floatValue();
        float fFloatValue2 = ((Float) wy1.d(this.f1, 1)).floatValue();
        if (this.f1.size() == 1) {
            fFloatValue = this.d1;
        }
        float fO = o(fFloatValue);
        float fO2 = o(fFloatValue2);
        return k() ? new float[]{fO2, fO} : new float[]{fO, fO2};
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.u0.k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public List<Float> getValues() {
        return new ArrayList(this.f1);
    }

    public final int h(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean i(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.i1)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        WeakHashMap weakHashMap = hfh.a;
        return getLayoutDirection() == 1;
    }

    public final void l() {
        if (this.i1 <= 0.0f) {
            return;
        }
        z();
        int iMin = Math.min((int) (((this.e1 - this.d1) / this.i1) + 1.0f), (this.n1 / this.K0) + 1);
        float[] fArr = this.j1;
        if (fArr == null || fArr.length != iMin * 2) {
            this.j1 = new float[iMin * 2];
        }
        float f = this.n1 / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.j1;
            fArr2[i] = ((i / 2.0f) * f) + this.Q0;
            fArr2[i + 1] = b();
        }
    }

    public final boolean m(int i) {
        int i2 = this.h1;
        long j = i2 + i;
        long size = this.f1.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.h1 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.g1 != -1) {
            this.g1 = i3;
        }
        v();
        postInvalidate();
        return true;
    }

    public final void n(int i) {
        if (k()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        m(i);
    }

    public final float o(float f) {
        float f2 = this.d1;
        float f3 = (f - f2) / (this.e1 - f2);
        return k() ? 1.0f - f3 : f3;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.D1);
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            icg icgVar = (icg) it.next();
            ViewGroup viewGroupD = yqi.d(this);
            if (viewGroupD == null) {
                icgVar.getClass();
            } else {
                icgVar.getClass();
                int[] iArr = new int[2];
                viewGroupD.getLocationOnScreen(iArr);
                icgVar.U0 = iArr[0];
                viewGroupD.getWindowVisibleDisplayFrame(icgVar.N0);
                viewGroupD.addOnLayoutChangeListener(icgVar.M0);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        xk0 xk0Var = this.w0;
        if (xk0Var != null) {
            removeCallbacks(xk0Var);
        }
        this.B0 = false;
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            icg icgVar = (icg) it.next();
            ViewGroup viewGroupD = yqi.d(this);
            nud nudVar = viewGroupD == null ? null : new nud(viewGroupD);
            if (nudVar != null) {
                ((ViewOverlay) nudVar.b).remove(icgVar);
                ViewGroup viewGroupD2 = yqi.d(this);
                if (viewGroupD2 == null) {
                    icgVar.getClass();
                } else {
                    viewGroupD2.removeOnLayoutChangeListener(icgVar.M0);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.D1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al0.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        yk0 yk0Var = this.u0;
        if (!z) {
            this.g1 = -1;
            yk0Var.j(this.h1);
            return;
        }
        if (i == 1) {
            m(Integer.MAX_VALUE);
        } else if (i == 2) {
            m(Integer.MIN_VALUE);
        } else if (i == 17) {
            n(Integer.MAX_VALUE);
        } else if (i == 66) {
            n(Integer.MIN_VALUE);
        }
        yk0Var.w(this.h1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al0.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.o1 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.N0;
        int i4 = this.O0;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + ((i4 == 1 || i4 == 3) ? ((icg) this.y0.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        zk0 zk0Var = (zk0) parcelable;
        super.onRestoreInstanceState(zk0Var.getSuperState());
        this.d1 = zk0Var.a;
        this.e1 = zk0Var.b;
        r(zk0Var.c);
        this.i1 = zk0Var.d;
        if (zk0Var.o) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        zk0 zk0Var = new zk0(super.onSaveInstanceState());
        zk0Var.a = this.d1;
        zk0Var.b = this.e1;
        zk0Var.c = new ArrayList(this.f1);
        zk0Var.d = this.i1;
        zk0Var.o = hasFocus();
        return zk0Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.n1 = Math.max(i - (this.Q0 * 2), 0);
        l();
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupD = yqi.d(this);
            nud nudVar = viewGroupD == null ? null : new nud(viewGroupD);
            if (nudVar == null) {
                return;
            }
            Iterator it = this.y0.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) nudVar.b).remove((icg) it.next());
            }
        }
    }

    public final void p() {
        Iterator it = this.A0.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
    }

    public final void q(icg icgVar, float f) {
        String str = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        if (!TextUtils.equals(icgVar.I0, str)) {
            icgVar.I0 = str;
            icgVar.L0.e = true;
            icgVar.invalidateSelf();
        }
        int iO = (this.Q0 + ((int) (o(f) * this.n1))) - (icgVar.getIntrinsicWidth() / 2);
        int iB = b() - ((this.S0 / 2) + this.Z0);
        icgVar.setBounds(iO, iB - icgVar.getIntrinsicHeight(), icgVar.getIntrinsicWidth() + iO, iB);
        Rect rect = new Rect(icgVar.getBounds());
        cu4.b(yqi.d(this), this, rect);
        icgVar.setBounds(rect);
        ViewGroup viewGroupD = yqi.d(this);
        ((ViewOverlay) (viewGroupD == null ? null : new nud(viewGroupD)).b).add(icgVar);
    }

    public final void r(ArrayList arrayList) {
        ViewGroup viewGroupD;
        int resourceId;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f1.size() == arrayList.size() && this.f1.equals(arrayList)) {
            return;
        }
        this.f1 = arrayList;
        this.p1 = true;
        this.h1 = 0;
        v();
        ArrayList arrayList2 = this.y0;
        if (arrayList2.size() > this.f1.size()) {
            List<icg> listSubList = arrayList2.subList(this.f1.size(), arrayList2.size());
            for (icg icgVar : listSubList) {
                WeakHashMap weakHashMap = hfh.a;
                if (isAttachedToWindow()) {
                    ViewGroup viewGroupD2 = yqi.d(this);
                    nud nudVar = viewGroupD2 == null ? null : new nud(viewGroupD2);
                    if (nudVar != null) {
                        ((ViewOverlay) nudVar.b).remove(icgVar);
                        ViewGroup viewGroupD3 = yqi.d(this);
                        if (viewGroupD3 == null) {
                            icgVar.getClass();
                        } else {
                            viewGroupD3.removeOnLayoutChangeListener(icgVar.M0);
                        }
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f1.size()) {
            Context context = getContext();
            int i = this.x0;
            icg icgVar2 = new icg(context, i);
            TypedArray typedArrayD = d7g.d(icgVar2.J0, null, z5d.Tooltip, 0, i, new int[0]);
            Context context2 = icgVar2.J0;
            icgVar2.T0 = context2.getResources().getDimensionPixelSize(dwc.mtrl_tooltip_arrowSize);
            boolean z = typedArrayD.getBoolean(z5d.Tooltip_showMarker, true);
            icgVar2.S0 = z;
            if (z) {
                s5i s5iVarE = icgVar2.a.a.e();
                s5iVarE.k = icgVar2.r();
                icgVar2.setShapeAppearanceModel(s5iVarE.g());
            } else {
                icgVar2.T0 = 0;
            }
            CharSequence text = typedArrayD.getText(z5d.Tooltip_android_text);
            boolean zEquals = TextUtils.equals(icgVar2.I0, text);
            a4g a4gVar = icgVar2.L0;
            if (!zEquals) {
                icgVar2.I0 = text;
                a4gVar.e = true;
                icgVar2.invalidateSelf();
            }
            int i2 = z5d.Tooltip_android_textAppearance;
            s3g s3gVar = (!typedArrayD.hasValue(i2) || (resourceId = typedArrayD.getResourceId(i2, 0)) == 0) ? null : new s3g(context2, resourceId);
            if (s3gVar != null && typedArrayD.hasValue(z5d.Tooltip_android_textColor)) {
                s3gVar.j = gti.c(context2, typedArrayD, z5d.Tooltip_android_textColor);
            }
            a4gVar.c(s3gVar, context2);
            icgVar2.k(ColorStateList.valueOf(typedArrayD.getColor(z5d.Tooltip_backgroundTint, rf3.g(rf3.i(eti.e(context2, icg.class.getCanonicalName(), dvc.colorOnBackground), 153), rf3.i(eti.e(context2, icg.class.getCanonicalName(), R.attr.colorBackground), 229)))));
            icgVar2.m(ColorStateList.valueOf(eti.e(context2, icg.class.getCanonicalName(), dvc.colorSurface)));
            icgVar2.O0 = typedArrayD.getDimensionPixelSize(z5d.Tooltip_android_padding, 0);
            icgVar2.P0 = typedArrayD.getDimensionPixelSize(z5d.Tooltip_android_minWidth, 0);
            icgVar2.Q0 = typedArrayD.getDimensionPixelSize(z5d.Tooltip_android_minHeight, 0);
            icgVar2.R0 = typedArrayD.getDimensionPixelSize(z5d.Tooltip_android_layout_margin, 0);
            typedArrayD.recycle();
            arrayList2.add(icgVar2);
            WeakHashMap weakHashMap2 = hfh.a;
            if (isAttachedToWindow() && (viewGroupD = yqi.d(this)) != null) {
                int[] iArr = new int[2];
                viewGroupD.getLocationOnScreen(iArr);
                icgVar2.U0 = iArr[0];
                viewGroupD.getWindowVisibleDisplayFrame(icgVar2.N0);
                viewGroupD.addOnLayoutChangeListener(icgVar2.M0);
            }
        }
        int i3 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            icg icgVar3 = (icg) it.next();
            icgVar3.a.j = i3;
            icgVar3.invalidateSelf();
        }
        Iterator it2 = this.z0.iterator();
        while (it2.hasNext()) {
            ik0 ik0Var = (ik0) it2.next();
            Iterator it3 = this.f1.iterator();
            while (it3.hasNext()) {
                ((Float) it3.next()).getClass();
                ((SliderWithCustomTicks) ik0Var).getClass();
            }
        }
        postInvalidate();
    }

    public final boolean s(int i, float f) {
        this.h1 = i;
        if (Math.abs(f - ((Float) this.f1.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.C1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = this.d1;
                minSeparation = utb.i(f2, this.e1, (minSeparation - this.Q0) / this.n1, f2);
            }
        }
        if (k()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.f1.set(i, Float.valueOf(dui.d(f, i3 < 0 ? this.d1 : minSeparation + ((Float) this.f1.get(i3)).floatValue(), i2 >= this.f1.size() ? this.e1 : ((Float) this.f1.get(i2)).floatValue() - minSeparation)));
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            ik0 ik0Var = (ik0) it.next();
            ((Float) this.f1.get(i)).getClass();
            SliderWithCustomTicks sliderWithCustomTicks = (SliderWithCustomTicks) ik0Var;
            sliderWithCustomTicks.getClass();
            uog.i(sliderWithCustomTicks, p07.VIRTUAL_KEY);
        }
        AccessibilityManager accessibilityManager = this.v0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.w0;
            if (runnable == null) {
                this.w0 = new xk0(this);
            } else {
                removeCallbacks(runnable);
            }
            xk0 xk0Var = this.w0;
            xk0Var.b = i;
            postDelayed(xk0Var, 200L);
        }
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.g1 = i;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public void setSeparationUnit(int i) {
        this.C1 = i;
        this.p1 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        r(arrayList);
    }

    public final void t() {
        double dRound;
        float f = this.B1;
        float f2 = this.i1;
        if (f2 > 0.0f) {
            dRound = Math.round(f * r1) / ((int) ((this.e1 - this.d1) / f2));
        } else {
            dRound = f;
        }
        if (k()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.e1;
        s(this.g1, (float) ((dRound * (f3 - r1)) + this.d1));
    }

    public final void u(int i, Rect rect) {
        int iO = this.Q0 + ((int) (o(getValues().get(i).floatValue()) * this.n1));
        int iB = b();
        int iMax = Math.max(this.R0 / 2, this.L0 / 2);
        int iMax2 = Math.max(this.S0 / 2, this.L0 / 2);
        rect.set(iO - iMax, iB - iMax2, iO + iMax, iB + iMax2);
    }

    public final void v() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iO = (int) ((o(((Float) this.f1.get(this.h1)).floatValue()) * this.n1) + this.Q0);
            int iB = b();
            int i = this.T0;
            t35.f(background, iO - i, iB - i, iO + i, iB + i);
        }
    }

    public final void w() {
        int i = this.O0;
        if (i == 0 || i == 1) {
            if (this.g1 == -1 || !isEnabled()) {
                f();
                return;
            } else {
                e();
                return;
            }
        }
        if (i == 2) {
            f();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.O0);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            yqi.d(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                e();
                return;
            }
        }
        f();
    }

    public final void x(Canvas canvas, Paint paint, RectF rectF, int i) {
        float f;
        float f2 = this.P0 / 2.0f;
        int iV = az1.v(i);
        if (iV == 1) {
            f = this.Y0;
        } else if (iV != 2) {
            if (iV == 3) {
                f2 = this.Y0;
            }
            f = f2;
        } else {
            f = f2;
            f2 = this.Y0;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.v1;
        path.reset();
        if (rectF.width() >= f2 + f) {
            path.addRoundRect(rectF, new float[]{f2, f2, f, f, f, f, f2, f2}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(f2, f);
        float fMax = Math.max(f2, f);
        canvas.save();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iV2 = az1.v(i);
        RectF rectF2 = this.x1;
        if (iV2 == 1) {
            float f3 = rectF.left;
            rectF2.set(f3, rectF.top, (2.0f * fMax) + f3, rectF.bottom);
        } else if (iV2 != 2) {
            rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF2.set(f4 - (2.0f * fMax), rectF.top, f4, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, fMax, fMax, paint);
        canvas.restore();
    }

    public final void y() {
        boolean z;
        int iMax = Math.max(this.M0, Math.max(this.P0 + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.S0));
        boolean z2 = true;
        if (iMax == this.N0) {
            z = false;
        } else {
            this.N0 = iMax;
            z = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.R0 / 2) - this.G0, 0), Math.max((this.P0 - this.H0) / 2, 0)), Math.max(Math.max(this.l1 - this.I0, 0), Math.max(this.m1 - this.J0, 0))) + this.F0;
        if (this.Q0 == iMax2) {
            z2 = false;
        } else {
            this.Q0 = iMax2;
            WeakHashMap weakHashMap = hfh.a;
            if (isLaidOut()) {
                this.n1 = Math.max(getWidth() - (this.Q0 * 2), 0);
                l();
            }
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final void z() {
        if (this.p1) {
            float f = this.d1;
            float f2 = this.e1;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + this.d1 + ") must be smaller than valueTo(" + this.e1 + ")");
            }
            if (f2 <= f) {
                throw new IllegalStateException("valueTo(" + this.e1 + ") must be greater than valueFrom(" + this.d1 + ")");
            }
            if (this.i1 > 0.0f && !A(f2)) {
                throw new IllegalStateException("The stepSize(" + this.i1 + ") must be 0, or a factor of the valueFrom(" + this.d1 + ")-valueTo(" + this.e1 + ") range");
            }
            Iterator it = this.f1.iterator();
            while (it.hasNext()) {
                Float f3 = (Float) it.next();
                if (f3.floatValue() < this.d1 || f3.floatValue() > this.e1) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.d1 + "), and lower or equal to valueTo(" + this.e1 + ")");
                }
                if (this.i1 > 0.0f && !A(f3.floatValue())) {
                    float f4 = this.d1;
                    float f5 = this.i1;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f6 = this.i1;
            if (f6 > 0.0f && minSeparation > 0.0f) {
                if (this.C1 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.i1 + ")");
                }
                if (minSeparation < f6 || !i(minSeparation)) {
                    float f7 = this.i1;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            float f8 = this.i1;
            if (f8 != 0.0f) {
                if (((int) f8) != f8) {
                    Log.w("al0", "Floating point value used for stepSize(" + f8 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f9 = this.d1;
                if (((int) f9) != f9) {
                    Log.w("al0", "Floating point value used for valueFrom(" + f9 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f10 = this.e1;
                if (((int) f10) != f10) {
                    Log.w("al0", "Floating point value used for valueTo(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.p1 = false;
        }
    }

    public void setValues(List<Float> list) {
        r(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.z1 = null;
        this.A1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.A1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
