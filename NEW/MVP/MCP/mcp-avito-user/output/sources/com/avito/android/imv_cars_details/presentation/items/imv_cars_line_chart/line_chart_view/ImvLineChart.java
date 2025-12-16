package com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.line_chart_view;

import VM.g;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: ImvLineChart.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010R:\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_line_chart/line_chart_view/ImvLineChart;", "Landroid/view/View;", "", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_line_chart/line_chart_view/LineChartPoint;", "value", "b", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "Landroid/graphics/LinearGradient;", "getGradientShader", "()Landroid/graphics/LinearGradient;", "gradientShader", "a", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvLineChart extends View {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public List<LineChartPoint> points;

    /* renamed from: c, reason: collision with root package name */
    @l
    public ArrayList f170171c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f170172d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RectF f170173e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RectF f170174f;

    /* renamed from: g, reason: collision with root package name */
    public final float f170175g;

    /* renamed from: h, reason: collision with root package name */
    public final float f170176h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Paint f170177i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Paint f170178j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Paint f170179k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Path f170180l;

    /* renamed from: m, reason: collision with root package name */
    public final float f170181m;

    /* renamed from: n, reason: collision with root package name */
    public final float f170182n;

    /* renamed from: o, reason: collision with root package name */
    public final float f170183o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Paint f170184p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final Path f170185q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final TextPaint f170186r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final TextPaint f170187s;

    /* renamed from: t, reason: collision with root package name */
    public final float f170188t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final int[] f170189u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final Paint f170190v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final Path f170191w;

    /* compiled from: ImvLineChart.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_line_chart/line_chart_view/ImvLineChart$a;", "", "<init>", "()V", "", "CENTER_RELATIVE_POINT_POSITION", "F", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @j
    public ImvLineChart(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static ArrayList a(ArrayList arrayList, float f12, float f13, boolean z12) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        long jLongValue = ((Number) it.next()).longValue();
        while (it.hasNext()) {
            long jLongValue2 = ((Number) it.next()).longValue();
            if (jLongValue > jLongValue2) {
                jLongValue = jLongValue2;
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((Number) it2.next()).longValue() - jLongValue));
        }
        Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        long jLongValue3 = ((Number) it3.next()).longValue();
        while (it3.hasNext()) {
            long jLongValue4 = ((Number) it3.next()).longValue();
            if (jLongValue3 < jLongValue4) {
                jLongValue3 = jLongValue4;
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Float.valueOf(jLongValue3 > 0 ? ((Number) it4.next()).longValue() / jLongValue3 : 0.5f));
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            float fFloatValue = ((Number) it5.next()).floatValue();
            arrayList4.add(Float.valueOf(z12 ? r.c(1, fFloatValue, f12, f13) : (fFloatValue * f12) + f13));
        }
        return arrayList4;
    }

    public static TextPaint c(ImvLineChart imvLineChart, int i12) {
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(imvLineChart.getContext(), null, 0, 0, 14, null);
        aVar.setTextAppearance(C35835l0.j(R.attr.textS1, imvLineChart.getContext()));
        TextPaint paint = aVar.getPaint();
        paint.setColor(C35835l0.d(i12, imvLineChart.getContext()));
        return paint;
    }

    private final LinearGradient getGradientShader() {
        RectF rectF = this.f170174f;
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.f170172d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        return new LinearGradient(fCenterX, rectF2.top, rectF.centerX(), rectF2.bottom, this.f170189u, new float[]{0.1f, 0.8f}, tileMode);
    }

    public final void b() {
        List<LineChartPoint> list = this.points;
        if (list == null) {
            return;
        }
        List<LineChartPoint> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((LineChartPoint) it.next()).f170192b));
        }
        RectF rectF = this.f170174f;
        float f12 = rectF.right;
        float f13 = rectF.left;
        int i12 = 0;
        ArrayList arrayListA = a(arrayList, f12 - f13, f13, false);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((LineChartPoint) it2.next()).f170193c));
        }
        float f14 = rectF.bottom;
        float f15 = rectF.top;
        ArrayList arrayListA2 = a(arrayList2, (f14 - f15) - this.f170181m, f15, true);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayListA.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList3.add(new PointF(((Number) next).floatValue(), ((Number) arrayListA2.get(i12)).floatValue()));
            i12 = i13;
        }
        this.f170171c = arrayList3;
    }

    @l
    public final List<LineChartPoint> getPoints() {
        return this.points;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        PointF pointF;
        PointF pointF2;
        List<LineChartPoint> list;
        LineChartPoint lineChartPoint;
        String str;
        List<LineChartPoint> list2;
        LineChartPoint lineChartPoint2;
        String str2;
        LineChartPoint lineChartPoint3;
        String str3;
        LineChartPoint lineChartPoint4;
        String str4;
        Path path = this.f170185q;
        path.reset();
        RectF rectF = this.f170173e;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = this.f170182n;
        path.moveTo(f12, f13 + f14);
        path.lineTo(rectF.left, rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.right, rectF.top + f14);
        canvas.drawPath(path, this.f170184p);
        List<LineChartPoint> list3 = this.points;
        TextPaint textPaint = this.f170186r;
        if (list3 != null && (lineChartPoint3 = (LineChartPoint) C42745f0.G(list3)) != null && (str3 = lineChartPoint3.f170194d) != null && (lineChartPoint4 = (LineChartPoint) C42745f0.S(list3)) != null && (str4 = lineChartPoint4.f170194d) != null) {
            canvas.drawText(str3, rectF.left, this.f170172d.bottom, textPaint);
            canvas.drawText(str4, rectF.right - textPaint.measureText(str4), rectF.bottom, textPaint);
        }
        ArrayList arrayList = this.f170171c;
        int i12 = 0;
        if (arrayList != null) {
            Path path2 = this.f170191w;
            path2.reset();
            Paint paint = this.f170190v;
            paint.setShader(getGradientShader());
            Iterator it = arrayList.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                PointF pointF3 = (PointF) next;
                RectF rectF2 = this.f170174f;
                if (i13 == 0) {
                    path2.moveTo(rectF2.left, rectF.top);
                    path2.lineTo(rectF2.left, pointF3.y);
                } else if (arrayList.size() - 1 == i13) {
                    path2.lineTo(pointF3.x, pointF3.y);
                    path2.lineTo(rectF2.right, rectF.top);
                } else {
                    path2.lineTo(pointF3.x, pointF3.y);
                }
                i13 = i14;
            }
            path2.close();
            canvas.drawPath(path2, paint);
        }
        ArrayList arrayList2 = this.f170171c;
        float f15 = this.f170176h;
        if (arrayList2 != null) {
            Path path3 = this.f170180l;
            path3.reset();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i15 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                PointF pointF4 = (PointF) next2;
                if (i12 == 0) {
                    path3.moveTo(pointF4.x, pointF4.y);
                } else {
                    path3.lineTo(pointF4.x, pointF4.y);
                }
                i12 = i15;
            }
            canvas.drawPath(path3, this.f170177i);
            PointF pointF5 = (PointF) C42745f0.G(arrayList2);
            Paint paint2 = this.f170178j;
            float f16 = this.f170175g;
            Paint paint3 = this.f170179k;
            if (pointF5 != null) {
                float f17 = pointF5.x;
                float f18 = pointF5.y;
                canvas.drawCircle(f17, f18, f16, paint3);
                canvas.drawCircle(f17, f18, f15, paint2);
            }
            PointF pointF6 = (PointF) C42745f0.S(arrayList2);
            if (pointF6 != null) {
                float f19 = pointF6.x;
                float f22 = pointF6.y;
                canvas.drawCircle(f19, f22, f16, paint3);
                canvas.drawCircle(f19, f22, f15, paint2);
            }
        }
        ArrayList arrayList3 = this.f170171c;
        if (arrayList3 == null || (pointF = (PointF) C42745f0.G(arrayList3)) == null || (pointF2 = (PointF) C42745f0.S(arrayList3)) == null || (list = this.points) == null || (lineChartPoint = (LineChartPoint) C42745f0.G(list)) == null || (str = lineChartPoint.f170195e) == null || (list2 = this.points) == null || (lineChartPoint2 = (LineChartPoint) C42745f0.S(list2)) == null || (str2 = lineChartPoint2.f170195e) == null) {
            return;
        }
        float f23 = pointF.x;
        float f24 = pointF.y;
        float f25 = this.f170188t;
        TextPaint textPaint2 = this.f170187s;
        canvas.drawText(str, f23, (f24 - f25) - f15, textPaint2);
        canvas.drawText(str2, pointF2.x - textPaint.measureText(str2), (pointF2.y - f25) - f15, textPaint2);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int minimumWidth = getMinimumWidth();
        if (View.MeasureSpec.getMode(i12) == 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(minimumWidth, View.MeasureSpec.getSize(i12)), BeduinInputModel.MIN_TEXT_VERSION);
        }
        int minimumHeight = getMinimumHeight();
        if (View.MeasureSpec.getMode(i13) == 0) {
            i13 = View.MeasureSpec.makeMeasureSpec(Math.min(minimumHeight, View.MeasureSpec.getSize(i13)), BeduinInputModel.MIN_TEXT_VERSION);
        }
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        if (i12 == 0 || i13 == 0) {
            return;
        }
        RectF rectF = this.f170172d;
        rectF.left = s.g(getPaddingLeft(), 0, getWidth() / 2);
        rectF.top = s.g(getPaddingTop(), 0, getHeight() / 2);
        rectF.right = getWidth() - s.g(getPaddingRight(), 0, getWidth() / 2);
        rectF.bottom = getHeight() - s.g(getPaddingBottom(), 0, getHeight() / 2);
        RectF rectF2 = this.f170173e;
        float f12 = rectF.left;
        float f13 = 2;
        float f14 = this.f170183o;
        float f15 = f14 / f13;
        rectF2.left = f12 + f15;
        rectF2.right = rectF.right - f15;
        rectF2.top = ((rectF.bottom - f14) - this.f170182n) - this.f170186r.getTextSize();
        rectF2.bottom = rectF.bottom;
        RectF rectF3 = this.f170174f;
        rectF3.left = rectF.left;
        rectF3.right = rectF.right;
        float f16 = rectF.top;
        float f17 = this.f170175g;
        rectF3.top = f16 + f17;
        rectF3.bottom = (rectF2.top - (f14 / f13)) - f17;
        b();
    }

    public final void setPoints(@l List<LineChartPoint> list) {
        this.points = list;
        requestLayout();
        invalidate();
        b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImvLineChart(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        i12 = (i13 & 4) != 0 ? 0 : i12;
        super(context, attributeSet, i12);
        this.f170172d = new RectF();
        this.f170173e = new RectF();
        this.f170174f = new RectF();
        this.f170180l = new Path();
        this.f170185q = new Path();
        this.f170186r = c(this, R.attr.gray54);
        this.f170187s = c(this, R.attr.black);
        this.f170191w = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.i.f17092a, i12, R.style.ImvChartDefault);
        Paint paint = new Paint();
        paint.setColor(typedArrayObtainStyledAttributes.getColor(4, 0));
        paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(5, y6.b(2)));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f170177i = paint;
        Paint paint2 = new Paint();
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(4, 0));
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.f170178j = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(6, 0));
        paint3.setStyle(style2);
        this.f170179k = paint3;
        this.f170175g = typedArrayObtainStyledAttributes.getDimension(7, y6.b(6));
        this.f170176h = typedArrayObtainStyledAttributes.getDimension(3, y6.b(4));
        this.f170181m = typedArrayObtainStyledAttributes.getDimension(0, y6.b(12));
        this.f170182n = typedArrayObtainStyledAttributes.getDimension(10, y6.b(8));
        float dimension = typedArrayObtainStyledAttributes.getDimension(11, y6.b(1));
        this.f170183o = dimension;
        Paint paint4 = new Paint();
        paint4.setColor(typedArrayObtainStyledAttributes.getColor(9, 0));
        paint4.setStyle(style);
        paint4.setStrokeWidth(dimension);
        this.f170184p = paint4;
        this.f170188t = typedArrayObtainStyledAttributes.getDimension(8, y6.b(10));
        this.f170189u = new int[]{typedArrayObtainStyledAttributes.getColor(2, 0), typedArrayObtainStyledAttributes.getColor(1, 0)};
        Paint paint5 = new Paint();
        paint5.setStyle(style2);
        paint5.setAntiAlias(true);
        this.f170190v = paint5;
        typedArrayObtainStyledAttributes.recycle();
    }
}
