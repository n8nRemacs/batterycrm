package com.avito.android.reputation.ui.items.reputation_radial_progress_bar;

import Hm0.C14007a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;

/* compiled from: ReputationRadialProgressBar.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0007\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u00014R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR+\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR+\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR+\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR+\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR+\u0010)\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020#8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010-\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0007R\u001a\u00100\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010\u0007R\u001a\u00103\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u0007¨\u00065"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_radial_progress_bar/a;", "Landroid/view/View;", "", "<set-?>", "b", "Lkotlin/properties/h;", "getScore", "()I", "setScore", "(I)V", "score", "c", "getLeftColor", "setLeftColor", "leftColor", "d", "getRightColor", "setRightColor", "rightColor", "e", "getBackgroundLeftColor", "setBackgroundLeftColor", "backgroundLeftColor", "f", "getBackgroundRightColor", "setBackgroundRightColor", "backgroundRightColor", "g", "getThreshold", "setThreshold", "threshold", "h", "getProgressBarWidth", "setProgressBarWidth", "progressBarWidth", "", "i", "getThresholdHeight", "()F", "setThresholdHeight", "(F)V", "thresholdHeight", "u", "I", "getGreen600$_avito_reputation_impl", "green600", "v", "getGreen200$_avito_reputation_impl", "green200", "w", "getWarmGray4$_avito_reputation_impl", "warmGray4", "a", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends View {

    /* renamed from: A, reason: collision with root package name */
    public static final float f254995A;

    /* renamed from: B, reason: collision with root package name */
    public static final float f254996B;

    /* renamed from: C, reason: collision with root package name */
    public static final float f254997C;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final C7632a f254998x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f254999y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f255000z;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f255001b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f255002c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f255003d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e f255004e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final e f255005f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final e f255006g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final e f255007h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final e f255008i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Paint f255009j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Paint f255010k;

    /* renamed from: l, reason: collision with root package name */
    public float f255011l;

    /* renamed from: m, reason: collision with root package name */
    public float f255012m;

    /* renamed from: n, reason: collision with root package name */
    public float f255013n;

    /* renamed from: o, reason: collision with root package name */
    public float f255014o;

    /* renamed from: p, reason: collision with root package name */
    public float f255015p;

    /* renamed from: q, reason: collision with root package name */
    public float f255016q;

    /* renamed from: r, reason: collision with root package name */
    public float f255017r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final RectF f255018s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f255019t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final int green600;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final int green200;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final int warmGray4;

    /* compiled from: ReputationRadialProgressBar.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_radial_progress_bar/a$a;", "", "<init>", "()V", "", "SWEEP_GRADIENT_END", "F", "SWEEP_GRADIENT_START", "", "THRESHOLD_DEFAULT", "I", "THRESHOLD_GAP", "THRESHOLD_RADIUS", "THRESHOLD_WIDTH", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.reputation.ui.items.reputation_radial_progress_bar.a$a, reason: collision with other inner class name */
    public static final class C7632a {
        public /* synthetic */ C7632a(C42822w c42822w) {
            this();
        }

        public C7632a() {
        }
    }

    static {
        Y y12 = new Y(a.class, "score", "getScore()I", 0);
        n0 n0Var = m0.f406844a;
        f254999y = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(a.class, "leftColor", "getLeftColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "rightColor", "getRightColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "backgroundLeftColor", "getBackgroundLeftColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "backgroundRightColor", "getBackgroundRightColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "threshold", "getThreshold()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "progressBarWidth", "getProgressBarWidth()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "thresholdHeight", "getThresholdHeight()F", 0, n0Var)};
        f254998x = new C7632a(null);
        f255000z = y6.b(24);
        float fB2 = y6.b(4);
        f254995A = fB2;
        f254996B = fB2 / 2;
        f254997C = y6.b(1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.reputationRadialProgressBar : i12;
        super(context, attributeSet, i12, 0);
        this.f255001b = new e(0, this, new h(this));
        this.f255002c = new e(0, this, new d(this));
        this.f255003d = new e(0, this, new g(this));
        this.f255004e = new e(0, this, new b(this));
        this.f255005f = new e(0, this, new c(this));
        this.f255006g = new e(40, this, new i(this));
        this.f255007h = new e(Integer.valueOf(f255000z), this, new f(this));
        this.f255008i = new e(Float.valueOf(getProgressBarWidth() / 2), this, new j(this));
        this.f255009j = new Paint(1);
        this.f255010k = new Paint(1);
        this.f255018s = new RectF();
        int iD2 = C35835l0.d(R.attr.green600, context);
        this.green600 = iD2;
        int iD3 = C35835l0.d(R.attr.green200, context);
        this.green200 = iD3;
        int iD4 = C35835l0.d(R.attr.warmGray4, context);
        this.warmGray4 = iD4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14007a.e.f7691d, i12, 0);
        int i14 = typedArrayObtainStyledAttributes.getInt(5, 1);
        setScore(i14 <= 0 ? 1 : i14);
        setLeftColor(typedArrayObtainStyledAttributes.getColor(2, iD3));
        setRightColor(typedArrayObtainStyledAttributes.getColor(4, iD2));
        setBackgroundLeftColor(typedArrayObtainStyledAttributes.getColor(0, iD4));
        setBackgroundRightColor(typedArrayObtainStyledAttributes.getColor(1, iD4));
        setThresholdHeight(typedArrayObtainStyledAttributes.getDimension(7, getThresholdHeight()));
        setThreshold(typedArrayObtainStyledAttributes.getInt(6, getThreshold()));
        setProgressBarWidth(typedArrayObtainStyledAttributes.getInt(3, getProgressBarWidth()));
        typedArrayObtainStyledAttributes.recycle();
        this.f255019t = true;
    }

    public final int getBackgroundLeftColor() {
        return ((Number) this.f255004e.getValue(this, f254999y[3])).intValue();
    }

    public final int getBackgroundRightColor() {
        return ((Number) this.f255005f.getValue(this, f254999y[4])).intValue();
    }

    /* renamed from: getGreen200$_avito_reputation_impl, reason: from getter */
    public final int getGreen200() {
        return this.green200;
    }

    /* renamed from: getGreen600$_avito_reputation_impl, reason: from getter */
    public final int getGreen600() {
        return this.green600;
    }

    public final int getLeftColor() {
        return ((Number) this.f255002c.getValue(this, f254999y[1])).intValue();
    }

    public final int getProgressBarWidth() {
        return ((Number) this.f255007h.getValue(this, f254999y[6])).intValue();
    }

    public final int getRightColor() {
        return ((Number) this.f255003d.getValue(this, f254999y[2])).intValue();
    }

    public final int getScore() {
        return ((Number) this.f255001b.getValue(this, f254999y[0])).intValue();
    }

    public final int getThreshold() {
        return ((Number) this.f255006g.getValue(this, f254999y[5])).intValue();
    }

    public final float getThresholdHeight() {
        return ((Number) this.f255008i.getValue(this, f254999y[7])).floatValue();
    }

    /* renamed from: getWarmGray4$_avito_reputation_impl, reason: from getter */
    public final int getWarmGray4() {
        return this.warmGray4;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        float f12 = 2;
        this.f255015p = getWidth() / f12;
        this.f255016q = getHeight();
        float f13 = 100;
        RectF rectF = this.f255018s;
        rectF.left = getProgressBarWidth() / f12;
        rectF.top = getProgressBarWidth() / f12;
        rectF.right = (getHeight() * f12) - (getProgressBarWidth() / f12);
        rectF.bottom = (getHeight() * f12) - (getProgressBarWidth() / f12);
        Paint paint = this.f255009j;
        float score = ((getScore() * 0.5f) / f13) + 0.5f;
        paint.setShader(new SweepGradient(this.f255015p, this.f255016q, new int[]{getLeftColor(), getRightColor(), getBackgroundLeftColor(), getBackgroundRightColor()}, new float[]{0.5f, score, score, 1.0f}));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getProgressBarWidth());
        paint.setStrokeCap(Paint.Cap.ROUND);
        float height = getHeight() - (getProgressBarWidth() / f12);
        getScore();
        this.f255013n = (f254995A / height) * 57.29578f;
        this.f255014o = ((getProgressBarWidth() / 2) * 180) / ((float) (height * 3.141592653589793d));
        this.f255011l = (getScore() * 180) / 100.0f;
        float threshold = (getThreshold() * 180) / 100.0f;
        this.f255012m = threshold;
        float f14 = (f254996B / height) * 57.29578f;
        float f15 = 0.0f;
        if (getScore() > getThreshold()) {
            float f16 = this.f255012m;
            float f17 = this.f255013n;
            if (f16 + f17 + f14 >= this.f255011l) {
                f15 = -f17;
            }
        } else if (this.f255011l > this.f255012m - f14) {
            f15 = this.f255013n;
        }
        float f18 = threshold + f15;
        this.f255012m = f18;
        this.f255017r = f18 - 90.0f;
        int iD2 = C35835l0.d(R.attr.constantWhite, getContext());
        int iD3 = C35835l0.d(R.attr.red300, getContext());
        float f19 = this.f255017r / 360.0f;
        this.f255010k.setShader(new SweepGradient(this.f255015p, this.f255016q, new int[]{iD2, iD2, iD3, iD3}, new float[]{0.5f - (this.f255017r / 360.0f), (((getScore() * 0.5f) / f13) + 0.5f) - (this.f255017r / 360.0f), (((getScore() * 0.5f) / f13) + 0.5f) - f19, 1.0f - f19}));
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f255018s;
        float f12 = this.f255014o;
        float f13 = 2;
        canvas.drawArc(rectF, f12 + 180.0f, 180.0f - (f12 * f13), false, this.f255009j);
        float height = getHeight();
        int iSave = canvas.save();
        canvas.rotate(this.f255017r, getWidth() / f13, height);
        try {
            float f14 = f254995A;
            canvas.drawRoundRect((canvas.getWidth() / f13) - (f14 / f13), (getProgressBarWidth() / 2) - (getThresholdHeight() / f13), (f14 / f13) + (canvas.getWidth() / f13), (getThresholdHeight() / f13) + (getProgressBarWidth() / 2), f254997C, f14, this.f255010k);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i13);
        setMeasuredDimension(View.MeasureSpec.getMode(i12) == 1073741824 ? View.MeasureSpec.getSize(i12) : Math.min(size * 2, View.MeasureSpec.getSize(i12)), size);
    }

    public final void setBackgroundLeftColor(int i12) {
        this.f255004e.setValue(this, f254999y[3], Integer.valueOf(i12));
    }

    public final void setBackgroundRightColor(int i12) {
        this.f255005f.setValue(this, f254999y[4], Integer.valueOf(i12));
    }

    public final void setLeftColor(int i12) {
        this.f255002c.setValue(this, f254999y[1], Integer.valueOf(i12));
    }

    public final void setProgressBarWidth(int i12) {
        this.f255007h.setValue(this, f254999y[6], Integer.valueOf(i12));
    }

    public final void setRightColor(int i12) {
        this.f255003d.setValue(this, f254999y[2], Integer.valueOf(i12));
    }

    public final void setScore(int i12) {
        this.f255001b.setValue(this, f254999y[0], Integer.valueOf(i12));
    }

    public final void setThreshold(int i12) {
        this.f255006g.setValue(this, f254999y[5], Integer.valueOf(i12));
    }

    public final void setThresholdHeight(float f12) {
        this.f255008i.setValue(this, f254999y[7], Float.valueOf(f12));
    }
}
