package com.avito.android.lib.design.progress_bar_re23;

import LV.a;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.c;
import com.avito.android.util.C35763c0;
import j.InterfaceC42156l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import wV.AbstractC49562a;
import wV.C49563b;
import wV.C49564c;
import xV.C49888a;
import xV.C49890c;
import xV.InterfaceC49889b;
import xV.e;
import yV.C50177a;

/* compiled from: ProgressBarRe23.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b \u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010 \u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R$\u0010#\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R*\u0010(\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0019R*\u0010,\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010&\"\u0004\b+\u0010\u0019R0\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u000eR$\u00104\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u0010\t¨\u00065"}, d2 = {"Lcom/avito/android/lib/design/progress_bar_re23/ProgressBarRe23;", "Landroid/view/View;", "LLV/a;", "LxV/a;", "LyV/a;", "", "progressValue", "Lkotlin/G0;", "setupLinearDrawingDelegate", "(F)V", "", "LxV/c;", "value", "setupSegmentedDrawingDelegate", "(Ljava/util/List;)V", "newStyle", "setStyle", "(LyV/a;)V", "newState", "setState", "(LxV/a;)V", "", "f", "I", "setBarHeight", "(I)V", "barHeight", "g", "setSegmentSpacing", "segmentSpacing", "h", "setCornerRadius", "cornerRadius", "i", "setMinEdgeWidth", "minEdgeWidth", "j", "getTrackColor", "()I", "setTrackColor", "trackColor", "k", "getProgressColor", "setProgressColor", "progressColor", "getSegments", "()Ljava/util/List;", "setSegments", "segments", "getProgress", "()F", "setProgress", "progress", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProgressBarRe23 extends View implements a<C49888a, C50177a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public C49888a f180107b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C50177a f180108c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f180109d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public AbstractC49562a f180110e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int barHeight;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int segmentSpacing;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int cornerRadius;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int minEdgeWidth;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int trackColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int progressColor;

    @j
    public ProgressBarRe23(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void setBarHeight(int i12) {
        requestLayout();
        this.barHeight = i12;
    }

    private final void setCornerRadius(int i12) {
        AbstractC49562a abstractC49562a = this.f180110e;
        if (abstractC49562a != null) {
            abstractC49562a.c(i12);
        }
        invalidate();
        this.cornerRadius = i12;
    }

    private final void setMinEdgeWidth(int i12) {
        AbstractC49562a abstractC49562a = this.f180110e;
        if (abstractC49562a instanceof C49563b) {
            ((C49563b) abstractC49562a).f441463g = i12;
        }
        invalidate();
        this.minEdgeWidth = i12;
    }

    private final void setSegmentSpacing(int i12) {
        AbstractC49562a abstractC49562a = this.f180110e;
        if (abstractC49562a != null) {
            abstractC49562a.f441458b = i12;
        }
        invalidate();
        this.segmentSpacing = i12;
    }

    private final void setupLinearDrawingDelegate(float progressValue) {
        C49563b c49563b = new C49563b();
        c49563b.f441465i.setColor(this.trackColor);
        c49563b.f441468l.setColor(this.progressColor);
        c49563b.f441464h = s.f(progressValue, 0.0f, 1.0f);
        c49563b.c(this.cornerRadius);
        c49563b.f441458b = this.segmentSpacing;
        c49563b.f441463g = this.minEdgeWidth;
        c49563b.b(this.f180109d);
        this.f180110e = c49563b;
    }

    private final void setupSegmentedDrawingDelegate(List<C49890c> value) {
        C49564c c49564c = new C49564c();
        c49564c.c(this.cornerRadius);
        c49564c.f441458b = this.segmentSpacing;
        Iterator<T> it = value.iterator();
        float f12 = 0.0f;
        while (it.hasNext()) {
            f12 += ((C49890c) it.next()).f442510a;
        }
        c49564c.f441474h = f12;
        c49564c.f441473g = value;
        c49564c.b(this.f180109d);
        this.f180110e = c49564c;
    }

    public final float getProgress() {
        AbstractC49562a abstractC49562a = this.f180110e;
        C49563b c49563b = abstractC49562a instanceof C49563b ? (C49563b) abstractC49562a : null;
        if (c49563b != null) {
            return c49563b.f441464h;
        }
        return 0.0f;
    }

    public final int getProgressColor() {
        return this.progressColor;
    }

    @k
    public final List<C49890c> getSegments() {
        List<C49890c> list;
        AbstractC49562a abstractC49562a = this.f180110e;
        C49564c c49564c = abstractC49562a instanceof C49564c ? (C49564c) abstractC49562a : null;
        return (c49564c == null || (list = c49564c.f441473g) == null) ? C42784z0.f406748b : list;
    }

    public final int getTrackColor() {
        return this.trackColor;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        canvas.save();
        RectF rectF = this.f180109d;
        float f12 = rectF.left;
        if (f12 != 0.0f || rectF.top != 0.0f) {
            canvas.translate(f12, rectF.top);
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
        }
        AbstractC49562a abstractC49562a = this.f180110e;
        if (abstractC49562a != null) {
            abstractC49562a.a(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int defaultSize = View.getDefaultSize(getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), i12);
        int i14 = this.barHeight;
        setMeasuredDimension(defaultSize, i14 < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i13) : getPaddingTop() + i14 + getPaddingBottom());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        float paddingRight = getPaddingRight() + getPaddingLeft();
        RectF rectF = this.f180109d;
        rectF.set(getPaddingLeft(), getPaddingTop(), i12 - paddingRight, getPaddingTop() + this.barHeight);
        AbstractC49562a abstractC49562a = this.f180110e;
        if (abstractC49562a != null) {
            abstractC49562a.b(rectF);
        }
    }

    public final void setProgress(float f12) {
        AbstractC49562a abstractC49562a = this.f180110e;
        if (abstractC49562a instanceof C49563b) {
            C49563b c49563b = (C49563b) abstractC49562a;
            c49563b.getClass();
            c49563b.f441464h = s.f(f12, 0.0f, 1.0f);
        } else {
            setupLinearDrawingDelegate(f12);
        }
        invalidate();
    }

    public final void setProgressColor(int i12) {
        AbstractC49562a abstractC49562a = this.f180110e;
        if (abstractC49562a instanceof C49563b) {
            ((C49563b) abstractC49562a).f441468l.setColor(i12);
        }
        invalidate();
        this.progressColor = i12;
    }

    public final void setSegments(@k List<C49890c> list) {
        AbstractC49562a abstractC49562a = this.f180110e;
        if (abstractC49562a instanceof C49564c) {
            C49564c c49564c = (C49564c) abstractC49562a;
            c49564c.getClass();
            Iterator<T> it = list.iterator();
            float f12 = 0.0f;
            while (it.hasNext()) {
                f12 += ((C49890c) it.next()).f442510a;
            }
            c49564c.f441474h = f12;
            c49564c.f441473g = list;
        } else {
            setupSegmentedDrawingDelegate(list);
        }
        invalidate();
    }

    public final void setTrackColor(int i12) {
        AbstractC49562a abstractC49562a = this.f180110e;
        if (abstractC49562a instanceof C49563b) {
            ((C49563b) abstractC49562a).f441465i.setColor(i12);
        }
        invalidate();
        this.trackColor = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProgressBarRe23(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.progressBarRe23 : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_ProgressBarRe23 : i13;
        super(context, attributeSet, i12, i13);
        this.f180109d = new RectF();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178991r0, i12, i13);
        float f12 = typedArrayObtainStyledAttributes.getFloat(6, 0.0f);
        C50177a.C12902a c12902a = C50177a.f443122g;
        Context context2 = getContext();
        c12902a.getClass();
        C50177a c50177aC = C50177a.C12902a.c(typedArrayObtainStyledAttributes, context2);
        typedArrayObtainStyledAttributes.recycle();
        setStyle(c50177aC);
        setupLinearDrawingDelegate(f12);
    }

    @Override // LV.b
    public void setState(@k C49888a newState) {
        C49888a c49888a = this.f180107b;
        if (new c(newState, c49888a).f181333c) {
            return;
        }
        this.f180107b = newState;
        InterfaceC49889b interfaceC49889b = c49888a != null ? c49888a.f442509a : null;
        InterfaceC49889b interfaceC49889b2 = newState.f442509a;
        if (new c(interfaceC49889b2, interfaceC49889b).f181333c || interfaceC49889b2 == null) {
            return;
        }
        if (interfaceC49889b2 instanceof e) {
            setProgress(((e) interfaceC49889b2).f442516a);
        } else if (interfaceC49889b2 instanceof xV.d) {
            setSegments(((xV.d) interfaceC49889b2).f442515a);
        }
    }

    @Override // LV.d
    public void setStyle(@k C50177a newStyle) {
        C50177a c50177a = this.f180108c;
        if (new c(newStyle, c50177a).f181333c) {
            return;
        }
        this.f180108c = newStyle;
        int i12 = newStyle.f443126d;
        Integer numValueOf = Integer.valueOf(i12);
        if (!new c(numValueOf, c50177a != null ? Integer.valueOf(c50177a.f443126d) : null).f181333c) {
            setCornerRadius(numValueOf.intValue());
        }
        int i13 = newStyle.f443128f;
        Integer numValueOf2 = Integer.valueOf(i13);
        if (!new c(numValueOf2, c50177a != null ? Integer.valueOf(c50177a.f443128f) : null).f181333c) {
            setSegmentSpacing(numValueOf2.intValue());
        }
        int i14 = newStyle.f443127e;
        Integer numValueOf3 = Integer.valueOf(i14);
        if (!new c(numValueOf3, c50177a != null ? Integer.valueOf(c50177a.f443127e) : null).f181333c) {
            setMinEdgeWidth(numValueOf3.intValue());
        }
        int i15 = newStyle.f443125c;
        Integer numValueOf4 = Integer.valueOf(i15);
        if (!new c(numValueOf4, c50177a != null ? Integer.valueOf(c50177a.f443125c) : null).f181333c) {
            setBarHeight(numValueOf4.intValue());
        }
        C35763c0 c35763c0 = c50177a != null ? c50177a.f443123a : null;
        C35763c0 c35763c02 = newStyle.f443123a;
        if (!new c(c35763c02, c35763c0).f181333c) {
            setTrackColor(c35763c02 != null ? c35763c02.f318848a : 0);
        }
        C35763c0 c35763c03 = c50177a != null ? c50177a.f443124b : null;
        C35763c0 c35763c04 = newStyle.f443124b;
        if (!new c(c35763c04, c35763c03).f181333c) {
            setProgressColor(c35763c04 != null ? c35763c04.f318848a : 0);
        }
        if (!L.f(Integer.valueOf(i15), c50177a != null ? Integer.valueOf(c50177a.f443125c) : null)) {
            requestLayout();
            return;
        }
        if (L.f(Integer.valueOf(i12), c50177a != null ? Integer.valueOf(c50177a.f443126d) : null)) {
            if (L.f(Integer.valueOf(i13), c50177a != null ? Integer.valueOf(c50177a.f443128f) : null)) {
                if (L.f(Integer.valueOf(i14), c50177a != null ? Integer.valueOf(c50177a.f443127e) : null)) {
                    if (L.f(c35763c02, c50177a != null ? c50177a.f443123a : null)) {
                        if (L.f(c35763c04, c50177a != null ? c50177a.f443124b : null)) {
                            return;
                        }
                    }
                }
            }
        }
        invalidate();
    }
}
