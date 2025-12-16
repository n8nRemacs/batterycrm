package com.avito.android.advert.item.salary_range.salary_view;

import J6.a;
import J6.b;
import J6.c;
import J6.d;
import L6.a;
import LV.a;
import X41.j;
import Y61.k;
import Y61.l;
import Y9.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.y6;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: SalaryRangeView.kt */
@P
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R*\u0010 \u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/advert/item/salary_range/salary_view/SalaryRangeView;", "Landroid/view/View;", "LLV/a;", "LK6/a;", "LL6/a;", "newStyle", "Lkotlin/G0;", "setStyle", "(LL6/a;)V", "newState", "setState", "(LK6/a;)V", "", "value", "d", "I", "getBaseLineColor", "()I", "setBaseLineColor", "(I)V", "baseLineColor", "e", "getMiddleLineColor", "setMiddleLineColor", "middleLineColor", "", "f", "F", "getMiddleLineValue", "()F", "setMiddleLineValue", "(F)V", "middleLineValue", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SalaryRangeView extends View implements a<K6.a, L6.a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public K6.a f79280b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public L6.a f79281c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int baseLineColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int middleLineColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float middleLineValue;

    /* renamed from: g, reason: collision with root package name */
    public float f79285g;

    /* renamed from: h, reason: collision with root package name */
    public float f79286h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final b f79287i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final b f79288j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final c f79289k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final d f79290l;

    @j
    public SalaryRangeView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final int getBaseLineColor() {
        return this.baseLineColor;
    }

    public final int getMiddleLineColor() {
        return this.middleLineColor;
    }

    public final float getMiddleLineValue() {
        return this.middleLineValue;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        canvas.save();
        b bVar = this.f79287i;
        RectF rectF = bVar.f8765d;
        float f12 = bVar.f8763b;
        canvas.drawRoundRect(rectF, f12, f12, bVar.f8764c);
        b bVar2 = this.f79288j;
        RectF rectF2 = bVar2.f8765d;
        float f13 = bVar2.f8763b;
        canvas.drawRoundRect(rectF2, f13, f13, bVar2.f8764c);
        c cVar = this.f79289k;
        canvas.drawCircle(cVar.f8770e, cVar.f8771f, y6.a(cVar.f8769d), cVar.f8773h);
        canvas.drawCircle(cVar.f8770e, cVar.f8771f, y6.a(cVar.f8768c), cVar.f8772g);
        d dVar = this.f79290l;
        RectF rectF3 = dVar.f8782i;
        float f14 = dVar.f8777d;
        canvas.drawRoundRect(rectF3, f14, f14, dVar.f8781h);
        canvas.drawText(dVar.f8774a, y6.a(dVar.f8775b) + rectF3.left, rectF3.bottom - y6.a(dVar.f8776c), dVar.f8780g.getPaint());
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int iA2 = y6.a(this.f79286h) + (y6.a(this.f79289k.f8769d) * 2) + getPaddingBottom() + getPaddingTop();
        d dVar = this.f79290l;
        setMeasuredDimension(View.getDefaultSize(paddingRight, i12), View.getDefaultSize((y6.a(dVar.f8776c) * 2) + dVar.f8783j.height() + iA2, i13));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        float fB2;
        int iB2;
        float paddingRight;
        super.onSizeChanged(i12, i13, i14, i15);
        c cVar = this.f79289k;
        int iA2 = y6.a(cVar.f8769d) * 2;
        b bVar = this.f79287i;
        float paddingBottom = (i13 - getPaddingBottom()) - ((iA2 - y6.a(bVar.f8762a)) / 2);
        RectF rectF = new RectF(getPaddingLeft(), paddingBottom - y6.a(bVar.f8762a), i12 - getPaddingRight(), paddingBottom);
        a.C0504a.a(bVar, rectF, 0.0f, 0.0f, 6);
        float fWidth = rectF.width() * this.f79285g;
        a.C0504a.a(cVar, null, fWidth, (i13 - getPaddingBottom()) - ((y6.a(cVar.f8769d) * 2) / 2.0f), 1);
        float fWidth2 = (rectF.width() - (rectF.width() * this.middleLineValue)) / 2;
        rectF.set(rectF.left + fWidth2, rectF.top, rectF.right - fWidth2, rectF.bottom);
        a.C0504a.a(this.f79288j, rectF, 0.0f, 0.0f, 6);
        d dVar = this.f79290l;
        if (fWidth - (dVar.b() / 2) < getPaddingLeft()) {
            fB2 = getPaddingLeft();
            iB2 = dVar.b();
        } else {
            if ((dVar.b() / 2) + fWidth > i12 - getPaddingRight()) {
                paddingRight = i12 - getPaddingRight();
                fB2 = paddingRight - dVar.b();
                a.C0504a.a(dVar, new RectF(fB2, getPaddingTop(), paddingRight, getPaddingTop() + (y6.a(dVar.f8776c) * 2) + dVar.f8783j.height()), 0.0f, 0.0f, 6);
            }
            fB2 = fWidth - (dVar.b() / 2);
            iB2 = dVar.b();
        }
        paddingRight = iB2 + fB2;
        a.C0504a.a(dVar, new RectF(fB2, getPaddingTop(), paddingRight, getPaddingTop() + (y6.a(dVar.f8776c) * 2) + dVar.f8783j.height()), 0.0f, 0.0f, 6);
    }

    public final void setBaseLineColor(int i12) {
        this.f79287i.f8764c.setColor(i12);
        invalidate();
        this.baseLineColor = i12;
    }

    public final void setMiddleLineColor(int i12) {
        this.f79288j.f8764c.setColor(i12);
        invalidate();
        this.middleLineColor = i12;
    }

    public final void setMiddleLineValue(float f12) {
        this.middleLineValue = s.f(f12, 0.0f, 1.0f);
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SalaryRangeView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.salaryRange : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_SalaryRangeDefault : i13;
        super(context, attributeSet, i12, i13);
        this.f79287i = new b();
        this.f79288j = new b();
        this.f79289k = new c();
        this.f79290l = new d(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.l.f19370c, i12, i13);
        L6.a.f9778s.getClass();
        L6.a aVarB = a.C0603a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        setStyle(aVarB);
    }

    @Override // LV.b
    public void setState(@k K6.a newState) {
        if (new com.avito.android.lib.util.c(newState, this.f79280b).f181333c) {
            return;
        }
        this.f79280b = newState;
        d dVar = this.f79290l;
        dVar.getClass();
        String strConcat = newState.f9270a;
        if (strConcat.length() > 20) {
            strConcat = strConcat.substring(0, 20).concat("…");
        }
        dVar.f8780g.getPaint().getTextBounds(strConcat, 0, strConcat.length(), dVar.f8783j);
        dVar.f8774a = strConcat;
        float f12 = this.middleLineValue;
        float f13 = (1.0f - f12) / 2;
        long j12 = newState.f9273d;
        long j13 = newState.f9272c;
        float f14 = j12 - (((f12 + f13) * (j12 - j13)) / f12);
        float f15 = (newState.f9271b - f14) / (((j12 + j13) - f14) - f14);
        this.f79285g = f15;
        this.f79285g = s.f(f15, f13, 1.0f - f13);
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k L6.a r10) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.salary_range.salary_view.SalaryRangeView.setStyle(L6.a):void");
    }
}
