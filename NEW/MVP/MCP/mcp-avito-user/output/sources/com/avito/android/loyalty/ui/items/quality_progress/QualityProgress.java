package com.avito.android.loyalty.ui.items.quality_progress;

import HW.e;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.reflect.n;

/* compiled from: QualityProgress.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u00011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004R+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR+\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR+\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR+\u0010$\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\b\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\b\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\fR+\u0010,\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\b\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\fR+\u00100\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\b\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\f¨\u00062"}, d2 = {"Lcom/avito/android/loyalty/ui/items/quality_progress/QualityProgress;", "Landroid/view/View;", "", "getScaleMiddleValue", "()Ljava/lang/String;", "", "<set-?>", "b", "Lkotlin/properties/h;", "getProgress", "()I", "setProgress", "(I)V", "progress", "c", "getBadSectionColor", "setBadSectionColor", "badSectionColor", "d", "getGoodSectionStart", "setGoodSectionStart", "goodSectionStart", "e", "getGoodSectionEnd", "setGoodSectionEnd", "goodSectionEnd", "f", "getBadSectionSize", "setBadSectionSize", "badSectionSize", "", "g", "getShowScale", "()Z", "setShowScale", "(Z)V", "showScale", "h", "getScaleTextAppearance", "setScaleTextAppearance", "scaleTextAppearance", "i", "getScaleBadColor", "setScaleBadColor", "scaleBadColor", "j", "getScaleGoodColor", "setScaleGoodColor", "scaleGoodColor", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QualityProgress extends View {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f183690G;

    /* renamed from: H, reason: collision with root package name */
    public static final float f183691H;

    /* renamed from: I, reason: collision with root package name */
    public static final float f183692I;

    /* renamed from: J, reason: collision with root package name */
    public static final float f183693J;

    /* renamed from: K, reason: collision with root package name */
    public static final float f183694K;

    /* renamed from: L, reason: collision with root package name */
    public static final int f183695L;

    /* renamed from: A, reason: collision with root package name */
    public int f183696A;

    /* renamed from: B, reason: collision with root package name */
    public int f183697B;

    /* renamed from: C, reason: collision with root package name */
    public int f183698C;

    /* renamed from: D, reason: collision with root package name */
    public int f183699D;

    /* renamed from: E, reason: collision with root package name */
    @k
    public String f183700E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f183701F;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f183702b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f183703c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f183704d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e f183705e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f183706f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final e f183707g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final e f183708h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final e f183709i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final e f183710j;

    /* renamed from: k, reason: collision with root package name */
    public final float f183711k;

    /* renamed from: l, reason: collision with root package name */
    public final float f183712l;

    /* renamed from: m, reason: collision with root package name */
    public final float f183713m;

    /* renamed from: n, reason: collision with root package name */
    public final float f183714n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final RectF f183715o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Paint f183716p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final Paint f183717q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final Paint f183718r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final Paint f183719s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final Paint f183720t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final Paint f183721u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final Paint f183722v;

    /* renamed from: w, reason: collision with root package name */
    public float f183723w;

    /* renamed from: x, reason: collision with root package name */
    public float f183724x;

    /* renamed from: y, reason: collision with root package name */
    public float f183725y;

    /* renamed from: z, reason: collision with root package name */
    public final float f183726z;

    /* compiled from: QualityProgress.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/avito/android/loyalty/ui/items/quality_progress/QualityProgress$a;", "", "<init>", "()V", "", "INNER_CIRCLE_RATIO", "F", "", "PERCENT_SIGN", "Ljava/lang/String;", "SCALE_END_VALUE", "SCALE_START_VALUE", "", "SCALE_TOP_MARGIN", "I", "SECOND_SHADOW_COLOR", "SECOND_SHADOW_RADIUS", "SECOND_SHADOW_Y_OFFSET", "SHADOW_COLOR", "SHADOW_RADIUS", "SHADOW_Y_OFFSET", "THUMB_INNER_COLOR", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        Y y12 = new Y(QualityProgress.class, "progress", "getProgress()I", 0);
        n0 n0Var = m0.f406844a;
        f183690G = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(QualityProgress.class, "badSectionColor", "getBadSectionColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(QualityProgress.class, "goodSectionStart", "getGoodSectionStart()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(QualityProgress.class, "goodSectionEnd", "getGoodSectionEnd()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(QualityProgress.class, "badSectionSize", "getBadSectionSize()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(QualityProgress.class, "showScale", "getShowScale()Z", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(QualityProgress.class, "scaleTextAppearance", "getScaleTextAppearance()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(QualityProgress.class, "scaleBadColor", "getScaleBadColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(QualityProgress.class, "scaleGoodColor", "getScaleGoodColor()I", 0, n0Var)};
        new a(null);
        f183691H = y6.b(24);
        f183692I = y6.b(3);
        f183693J = y6.b(4);
        f183694K = y6.b(1);
        f183695L = y6.b(4);
    }

    @X41.j
    public QualityProgress(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final String getScaleMiddleValue() {
        int badSectionSize = getBadSectionSize() >= getProgress() ? getBadSectionSize() - 1 : getBadSectionSize();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(badSectionSize);
        sb2.append('%');
        return sb2.toString();
    }

    public final int getBadSectionColor() {
        return ((Number) this.f183703c.getValue(this, f183690G[1])).intValue();
    }

    public final int getBadSectionSize() {
        return ((Number) this.f183706f.getValue(this, f183690G[4])).intValue();
    }

    public final int getGoodSectionEnd() {
        return ((Number) this.f183705e.getValue(this, f183690G[3])).intValue();
    }

    public final int getGoodSectionStart() {
        return ((Number) this.f183704d.getValue(this, f183690G[2])).intValue();
    }

    public final int getProgress() {
        return ((Number) this.f183702b.getValue(this, f183690G[0])).intValue();
    }

    public final int getScaleBadColor() {
        return ((Number) this.f183709i.getValue(this, f183690G[7])).intValue();
    }

    public final int getScaleGoodColor() {
        return ((Number) this.f183710j.getValue(this, f183690G[8])).intValue();
    }

    public final int getScaleTextAppearance() {
        return ((Number) this.f183708h.getValue(this, f183690G[6])).intValue();
    }

    public final boolean getShowScale() {
        return ((Boolean) this.f183707g.getValue(this, f183690G[5])).booleanValue();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        float f12 = this.f183714n;
        float badSectionSize = ((getBadSectionSize() / 100.0f) * getWidth()) - f12;
        this.f183723w = badSectionSize;
        this.f183724x = badSectionSize + f12;
        this.f183717q.setShader(new LinearGradient(this.f183724x, 0.0f, getWidth(), 0.0f, getGoodSectionStart(), getGoodSectionEnd(), Shader.TileMode.CLAMP));
        this.f183716p.setColor(getBadSectionColor());
        this.f183725y = this.f183713m / 2.16f;
        if (!getShowScale()) {
            this.f183697B = 0;
            return;
        }
        Paint paint = this.f183721u;
        paint.setColor(getScaleBadColor());
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(getScaleTextAppearance());
        paint.setTextSize(textView.getTextSize());
        paint.setTypeface(textView.getTypeface());
        Paint paint2 = this.f183722v;
        paint2.set(paint);
        paint2.setColor(getScaleGoodColor());
        Rect rect = new Rect();
        paint.getTextBounds("100%", 0, 4, rect);
        this.f183697B = rect.height() + f183695L;
        this.f183698C = rect.width();
        String scaleMiddleValue = getScaleMiddleValue();
        this.f183700E = scaleMiddleValue;
        paint.getTextBounds(scaleMiddleValue, 0, scaleMiddleValue.length(), rect);
        this.f183699D = rect.width();
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        float f12;
        super.onDraw(canvas);
        float f13 = this.f183696A / 2.0f;
        RectF rectF = this.f183715o;
        float f14 = this.f183726z;
        rectF.top = f13 - f14;
        rectF.bottom = f14 + f13;
        rectF.left = 0.0f;
        rectF.right = this.f183723w;
        Paint paint = this.f183716p;
        float f15 = this.f183712l;
        canvas.drawRoundRect(rectF, f15, f15, paint);
        rectF.left = this.f183724x;
        rectF.right = getWidth();
        Paint paint2 = this.f183717q;
        canvas.drawRoundRect(rectF, f15, f15, paint2);
        int progress = getProgress();
        int badSectionSize = getBadSectionSize();
        float f16 = this.f183713m;
        if (progress > badSectionSize || getBadSectionSize() == 0) {
            float width = getWidth();
            float f17 = this.f183724x;
            f12 = s.f(r.c(width, f17, (getProgress() - getBadSectionSize()) / (100 - getBadSectionSize()), f17), this.f183724x + f16, getWidth() - f16);
            paint = paint2;
        } else {
            f12 = s.f(this.f183723w * (getProgress() / getBadSectionSize()), f16, this.f183723w - f16);
        }
        canvas.drawCircle(f12, f13, f16, this.f183718r);
        canvas.drawCircle(f12, f13, f16, this.f183719s);
        canvas.drawCircle(f12, f13, f16, paint);
        canvas.drawCircle(f12, f13, this.f183725y, this.f183720t);
        if (getShowScale()) {
            float height = getHeight();
            Paint paint3 = this.f183721u;
            canvas.drawText("0%", 0.0f, height, paint3);
            float width2 = (getWidth() - this.f183698C) - y6.b(1);
            float height2 = getHeight();
            Paint paint4 = this.f183722v;
            canvas.drawText("100%", width2, height2, paint4);
            if (getBadSectionSize() >= getProgress()) {
                canvas.drawText(this.f183700E, this.f183723w - this.f183699D, getHeight(), paint3);
            } else {
                canvas.drawText(this.f183700E, this.f183724x, getHeight(), paint4);
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        this.f183696A = (int) Math.max(this.f183713m * 2, this.f183711k);
        setMeasuredDimension(size, View.MeasureSpec.getMode(i13) == 1073741824 ? View.MeasureSpec.getSize(i13) : this.f183696A + this.f183697B);
    }

    public final void setBadSectionColor(int i12) {
        this.f183703c.setValue(this, f183690G[1], Integer.valueOf(i12));
    }

    public final void setBadSectionSize(int i12) {
        this.f183706f.setValue(this, f183690G[4], Integer.valueOf(i12));
    }

    public final void setGoodSectionEnd(int i12) {
        this.f183705e.setValue(this, f183690G[3], Integer.valueOf(i12));
    }

    public final void setGoodSectionStart(int i12) {
        this.f183704d.setValue(this, f183690G[2], Integer.valueOf(i12));
    }

    public final void setProgress(int i12) {
        this.f183702b.setValue(this, f183690G[0], Integer.valueOf(i12));
    }

    public final void setScaleBadColor(int i12) {
        this.f183709i.setValue(this, f183690G[7], Integer.valueOf(i12));
    }

    public final void setScaleGoodColor(int i12) {
        this.f183710j.setValue(this, f183690G[8], Integer.valueOf(i12));
    }

    public final void setScaleTextAppearance(int i12) {
        this.f183708h.setValue(this, f183690G[6], Integer.valueOf(i12));
    }

    public final void setShowScale(boolean z12) {
        this.f183707g.setValue(this, f183690G[5], Boolean.valueOf(z12));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QualityProgress(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.qualityProgress : i12;
        super(context, attributeSet, i12, 0);
        this.f183702b = new e(0, this, new f(this));
        this.f183703c = new e(0, this, new com.avito.android.loyalty.ui.items.quality_progress.a(this));
        this.f183704d = new e(0, this, new d(this));
        this.f183705e = new e(0, this, new c(this));
        this.f183706f = new e(40, this, new b(this));
        this.f183707g = new e(Boolean.FALSE, this, new j(this));
        this.f183708h = new e(Integer.valueOf(C35835l0.j(R.attr.textS20, context)), this, new i(this));
        this.f183709i = new e(0, this, new g(this));
        this.f183710j = new e(0, this, new h(this));
        this.f183711k = 12.0f;
        this.f183712l = 23.0f;
        this.f183713m = 13.0f;
        this.f183714n = 4.0f;
        this.f183715o = new RectF();
        this.f183716p = new Paint(1);
        this.f183717q = new Paint(1);
        Paint paint = new Paint(1);
        paint.setShadowLayer(f183691H, 0.0f, f183693J, 520093696);
        paint.setColor(0);
        this.f183718r = paint;
        Paint paint2 = new Paint(1);
        paint2.setShadowLayer(f183692I, 0.0f, f183694K, 218103808);
        paint2.setColor(0);
        this.f183719s = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        this.f183720t = paint3;
        this.f183721u = new Paint(1);
        this.f183722v = new Paint(1);
        this.f183700E = "";
        int iD2 = C35835l0.d(R.attr.red600, context);
        int iD3 = C35835l0.d(R.attr.green600, context);
        int iD4 = C35835l0.d(R.attr.green200, context);
        int iD5 = C35835l0.d(R.attr.black, context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.g.f7131a, i12, 0);
        setProgress(typedArrayObtainStyledAttributes.getInt(5, 0));
        setGoodSectionStart(typedArrayObtainStyledAttributes.getColor(4, iD4));
        setGoodSectionEnd(typedArrayObtainStyledAttributes.getColor(3, iD3));
        setBadSectionColor(typedArrayObtainStyledAttributes.getColor(0, iD2));
        this.f183713m = typedArrayObtainStyledAttributes.getDimension(11, 13.0f);
        this.f183712l = typedArrayObtainStyledAttributes.getDimension(2, 23.0f);
        float dimension = typedArrayObtainStyledAttributes.getDimension(12, 12.0f);
        this.f183711k = dimension;
        this.f183726z = dimension / 2;
        setBadSectionSize(typedArrayObtainStyledAttributes.getInt(1, getBadSectionSize()));
        this.f183714n = typedArrayObtainStyledAttributes.getDimension(9, 4.0f);
        setShowScale(typedArrayObtainStyledAttributes.getBoolean(10, getShowScale()));
        setScaleTextAppearance(typedArrayObtainStyledAttributes.getResourceId(8, getScaleTextAppearance()));
        setScaleBadColor(typedArrayObtainStyledAttributes.getResourceId(6, iD5));
        setScaleGoodColor(typedArrayObtainStyledAttributes.getResourceId(6, iD5));
        typedArrayObtainStyledAttributes.recycle();
        this.f183701F = true;
    }
}
