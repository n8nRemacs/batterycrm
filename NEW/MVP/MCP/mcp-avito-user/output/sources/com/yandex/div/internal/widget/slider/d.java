package com.yandex.div.internal.widget.slider;

import X41.j;
import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.div.core.q0;
import j.U;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SliderView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b \b\u0016\u0018\u00002\u00020\u0001:\u0003ijkJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010*\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010.\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R.\u00106\u001a\u0004\u0018\u00010/2\b\u0010\u000b\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u0010:\u001a\u0004\u0018\u00010/2\b\u0010\u000b\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R.\u0010>\u001a\u0004\u0018\u00010/2\b\u0010\u000b\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105R.\u0010B\u001a\u0004\u0018\u00010/2\b\u0010\u000b\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u00103\"\u0004\bA\u00105R$\u0010F\u001a\u00020#2\u0006\u0010C\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bD\u0010%\u001a\u0004\bE\u0010'R.\u0010K\u001a\u0004\u0018\u00010/2\b\u0010G\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00101\u001a\u0004\bI\u00103\"\u0004\bJ\u00105R.\u0010S\u001a\u0004\u0018\u00010L2\b\u0010G\u001a\u0004\u0018\u00010L8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR(\u0010X\u001a\u0004\u0018\u00010#2\b\u0010C\u001a\u0004\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR.\u0010\\\u001a\u0004\u0018\u00010/2\b\u0010\u000b\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u00101\u001a\u0004\bZ\u00103\"\u0004\b[\u00105R.\u0010`\u001a\u0004\u0018\u00010L2\b\u0010G\u001a\u0004\u0018\u00010L8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010N\u001a\u0004\b^\u0010P\"\u0004\b_\u0010RR\u001c\u0010d\u001a\u00020\u00028B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010\u0004R\"\u0010h\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010\u001d\u001a\u0004\bf\u0010\u001f\"\u0004\bg\u0010!¨\u0006l"}, d2 = {"Lcom/yandex/div/internal/widget/slider/d;", "Landroid/view/View;", "", "getSuggestedMinimumHeight", "()I", "getSuggestedMinimumWidth", "Landroid/animation/ValueAnimator;", "Lkotlin/G0;", "setBaseParams", "(Landroid/animation/ValueAnimator;)V", "", "value", "h", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "i", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "getAnimationInterpolator", "()Landroid/view/animation/AccelerateDecelerateInterpolator;", "setAnimationInterpolator", "(Landroid/view/animation/AccelerateDecelerateInterpolator;)V", "animationInterpolator", "", "j", "Z", "getAnimationEnabled", "()Z", "setAnimationEnabled", "(Z)V", "animationEnabled", "", "k", "F", "getMinValue", "()F", "setMinValue", "(F)V", "minValue", "l", "getMaxValue", "setMaxValue", "maxValue", "Landroid/graphics/drawable/Drawable;", "m", "Landroid/graphics/drawable/Drawable;", "getActiveTickMarkDrawable", "()Landroid/graphics/drawable/Drawable;", "setActiveTickMarkDrawable", "(Landroid/graphics/drawable/Drawable;)V", "activeTickMarkDrawable", "n", "getInactiveTickMarkDrawable", "setInactiveTickMarkDrawable", "inactiveTickMarkDrawable", "o", "getActiveTrackDrawable", "setActiveTrackDrawable", "activeTrackDrawable", "p", "getInactiveTrackDrawable", "setInactiveTrackDrawable", "inactiveTrackDrawable", "<set-?>", "q", "getThumbValue", "thumbValue", "drawable", "r", "getThumbDrawable", "setThumbDrawable", "thumbDrawable", "LL21/b;", "s", "LL21/b;", "getThumbTextDrawable", "()LL21/b;", "setThumbTextDrawable", "(LL21/b;)V", "thumbTextDrawable", "t", "Ljava/lang/Float;", "getThumbSecondaryValue", "()Ljava/lang/Float;", "thumbSecondaryValue", "u", "getThumbSecondaryDrawable", "setThumbSecondaryDrawable", "thumbSecondaryDrawable", "v", "getThumbSecondTextDrawable", "setThumbSecondTextDrawable", "thumbSecondTextDrawable", "w", "I", "getMaxTickmarkOrThumbWidth", "maxTickmarkOrThumbWidth", "z", "getInteractive", "setInteractive", "interactive", "a", "b", "c", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class d extends View {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f370345A = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.yandex.div.internal.widget.slider.a f370346b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final q0<b> f370347c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ValueAnimator f370348d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public ValueAnimator f370349e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f370350f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f f370351g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public long animationDuration;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public AccelerateDecelerateInterpolator animationInterpolator;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean animationEnabled;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public float minValue;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float maxValue;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable activeTickMarkDrawable;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable inactiveTickMarkDrawable;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable activeTrackDrawable;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable inactiveTrackDrawable;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public float thumbValue;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable thumbDrawable;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @l
    public L21.b thumbTextDrawable;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @l
    public Float thumbSecondaryValue;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable thumbSecondaryDrawable;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @l
    public L21.b thumbSecondTextDrawable;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int maxTickmarkOrThumbWidth;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final a f370368x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public c f370369y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public boolean interactive;

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/slider/d$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class a {
        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/slider/d$c;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f370372b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f370373c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ c[] f370374d;

        static {
            c cVar = new c("THUMB", 0);
            f370372b = cVar;
            c cVar2 = new c("THUMB_SECONDARY", 1);
            f370373c = cVar2;
            f370374d = new c[]{cVar, cVar2};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f370374d.clone();
        }
    }

    /* compiled from: SliderView.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.internal.widget.slider.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C10934d {
        static {
            int[] iArr = new int[c.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
        }
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    private final int getMaxTickmarkOrThumbWidth() {
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        if (this.maxTickmarkOrThumbWidth == -1) {
            Drawable drawable = this.activeTickMarkDrawable;
            int iWidth = 0;
            int iWidth2 = (drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.width();
            Drawable drawable2 = this.inactiveTickMarkDrawable;
            int iMax = Math.max(iWidth2, (drawable2 == null || (bounds2 = drawable2.getBounds()) == null) ? 0 : bounds2.width());
            Drawable drawable3 = this.thumbDrawable;
            int iWidth3 = (drawable3 == null || (bounds3 = drawable3.getBounds()) == null) ? 0 : bounds3.width();
            Drawable drawable4 = this.thumbSecondaryDrawable;
            if (drawable4 != null && (bounds4 = drawable4.getBounds()) != null) {
                iWidth = bounds4.width();
            }
            this.maxTickmarkOrThumbWidth = Math.max(iMax, Math.max(iWidth3, iWidth));
        }
        return this.maxTickmarkOrThumbWidth;
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.animationDuration);
        valueAnimator.setInterpolator(this.animationInterpolator);
    }

    public final float a(int i12) {
        return (this.inactiveTickMarkDrawable == null && this.activeTickMarkDrawable == null) ? k(i12) : kotlin.math.b.b(k(i12));
    }

    public final boolean b() {
        return this.thumbSecondaryValue != null;
    }

    public final void d() {
        m(Math.min(Math.max(this.thumbValue, this.minValue), this.maxValue), false, true);
        if (b()) {
            Float f12 = this.thumbSecondaryValue;
            l(f12 == null ? null : Float.valueOf(Math.min(Math.max(f12.floatValue(), this.minValue), this.maxValue)), false, true);
        }
    }

    public final void f() {
        m(kotlin.math.b.b(this.thumbValue), false, true);
        if (this.thumbSecondaryValue == null) {
            return;
        }
        l(Float.valueOf(kotlin.math.b.b(r0.floatValue())), false, true);
    }

    @l
    public final Drawable getActiveTickMarkDrawable() {
        return this.activeTickMarkDrawable;
    }

    @l
    public final Drawable getActiveTrackDrawable() {
        return this.activeTrackDrawable;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    @k
    public final AccelerateDecelerateInterpolator getAnimationInterpolator() {
        return this.animationInterpolator;
    }

    @l
    public final Drawable getInactiveTickMarkDrawable() {
        return this.inactiveTickMarkDrawable;
    }

    @l
    public final Drawable getInactiveTrackDrawable() {
        return this.inactiveTrackDrawable;
    }

    public final boolean getInteractive() {
        return this.interactive;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        Drawable drawable = this.activeTrackDrawable;
        int iHeight = 0;
        int iHeight2 = (drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.height();
        Drawable drawable2 = this.inactiveTrackDrawable;
        int iMax = Math.max(iHeight2, (drawable2 == null || (bounds2 = drawable2.getBounds()) == null) ? 0 : bounds2.height());
        Drawable drawable3 = this.thumbDrawable;
        int iHeight3 = (drawable3 == null || (bounds3 = drawable3.getBounds()) == null) ? 0 : bounds3.height();
        Drawable drawable4 = this.thumbSecondaryDrawable;
        if (drawable4 != null && (bounds4 = drawable4.getBounds()) != null) {
            iHeight = bounds4.height();
        }
        return Math.max(Math.max(iHeight3, iHeight), iMax);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        int i12 = (int) ((this.maxValue - this.minValue) + 1);
        Drawable drawable = this.activeTrackDrawable;
        int iWidth = ((drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.width()) * i12;
        Drawable drawable2 = this.inactiveTrackDrawable;
        int iMax = Math.max(iWidth, ((drawable2 == null || (bounds2 = drawable2.getBounds()) == null) ? 0 : bounds2.width()) * i12);
        Drawable drawable3 = this.thumbDrawable;
        int iWidth2 = (drawable3 == null || (bounds3 = drawable3.getBounds()) == null) ? 0 : bounds3.width();
        Drawable drawable4 = this.thumbSecondaryDrawable;
        int iMax2 = Math.max(Math.max(iWidth2, (drawable4 == null || (bounds4 = drawable4.getBounds()) == null) ? 0 : bounds4.width()), iMax);
        L21.b bVar = this.thumbTextDrawable;
        int intrinsicWidth = bVar == null ? 0 : bVar.getIntrinsicWidth();
        L21.b bVar2 = this.thumbSecondTextDrawable;
        return Math.max(iMax2, Math.max(intrinsicWidth, bVar2 != null ? bVar2.getIntrinsicWidth() : 0));
    }

    @l
    public final Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @l
    public final L21.b getThumbSecondTextDrawable() {
        return this.thumbSecondTextDrawable;
    }

    @l
    public final Drawable getThumbSecondaryDrawable() {
        return this.thumbSecondaryDrawable;
    }

    @l
    public final Float getThumbSecondaryValue() {
        return this.thumbSecondaryValue;
    }

    @l
    public final L21.b getThumbTextDrawable() {
        return this.thumbTextDrawable;
    }

    public final float getThumbValue() {
        return this.thumbValue;
    }

    public final void h(c cVar, float f12, boolean z12) {
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            m(f12, z12, false);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            l(Float.valueOf(f12), z12, false);
        }
    }

    @U
    public final int i(float f12) {
        return (int) (((f12 - this.minValue) * (((getWidth() - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth())) / (this.maxValue - this.minValue));
    }

    public final float k(int i12) {
        return (((this.maxValue - this.minValue) * i12) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth())) + this.minValue;
    }

    public final void l(Float f12, boolean z12, boolean z13) {
        ValueAnimator valueAnimator;
        Float f13;
        Float fValueOf = f12 == null ? null : Float.valueOf(Math.min(Math.max(f12.floatValue(), this.minValue), this.maxValue));
        if (L.e(this.thumbSecondaryValue, fValueOf)) {
            return;
        }
        f fVar = this.f370351g;
        if (!z12 || !this.animationEnabled || (f13 = this.thumbSecondaryValue) == null || fValueOf == null) {
            if (z13 && (valueAnimator = this.f370349e) != null) {
                valueAnimator.cancel();
            }
            if (z13 || this.f370349e == null) {
                Float f14 = this.thumbSecondaryValue;
                fVar.f370378a = f14;
                this.thumbSecondaryValue = fValueOf;
                if (!L.e(f14, fValueOf)) {
                    Iterator<b> it = this.f370347c.iterator();
                    while (it.hasNext()) {
                        it.next().b(fValueOf);
                    }
                }
            }
        } else {
            ValueAnimator valueAnimator2 = this.f370349e;
            if (valueAnimator2 == null) {
                fVar.f370378a = f13;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.thumbSecondaryValue.floatValue(), fValueOf.floatValue());
            valueAnimatorOfFloat.addUpdateListener(new com.yandex.div.internal.widget.slider.c(this, 1));
            valueAnimatorOfFloat.addListener(fVar);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.f370349e = valueAnimatorOfFloat;
        }
        invalidate();
    }

    public final void m(float f12, boolean z12, boolean z13) {
        ValueAnimator valueAnimator;
        float fMin = Math.min(Math.max(f12, this.minValue), this.maxValue);
        float f13 = this.thumbValue;
        if (f13 == fMin) {
            return;
        }
        e eVar = this.f370350f;
        if (z12 && this.animationEnabled) {
            ValueAnimator valueAnimator2 = this.f370348d;
            if (valueAnimator2 == null) {
                eVar.f370375a = f13;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.thumbValue, fMin);
            valueAnimatorOfFloat.addUpdateListener(new com.yandex.div.internal.widget.slider.c(this, 0));
            valueAnimatorOfFloat.addListener(eVar);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.f370348d = valueAnimatorOfFloat;
        } else {
            if (z13 && (valueAnimator = this.f370348d) != null) {
                valueAnimator.cancel();
            }
            if (z13 || this.f370348d == null) {
                float f14 = this.thumbValue;
                eVar.f370375a = f14;
                this.thumbValue = fMin;
                Float fValueOf = Float.valueOf(f14);
                float f15 = this.thumbValue;
                if (!L.d(fValueOf, f15)) {
                    Iterator<b> it = this.f370347c.iterator();
                    while (it.hasNext()) {
                        it.next().a(f15);
                    }
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        float thumbValue;
        float fMax;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft() + (getMaxTickmarkOrThumbWidth() / 2), getPaddingTop());
        Drawable drawable = this.inactiveTrackDrawable;
        com.yandex.div.internal.widget.slider.a aVar = this.f370346b;
        if (drawable == null) {
            aVar.getClass();
        } else {
            drawable.setBounds(0, (aVar.f370337b / 2) - (drawable.getIntrinsicHeight() / 2), aVar.f370336a, (drawable.getIntrinsicHeight() / 2) + (aVar.f370337b / 2));
            drawable.draw(canvas);
        }
        a aVar2 = this.f370368x;
        aVar2.getClass();
        d dVar = d.this;
        if (dVar.b()) {
            thumbValue = dVar.getThumbValue();
            Float thumbSecondaryValue = dVar.getThumbSecondaryValue();
            if (thumbSecondaryValue != null) {
                thumbValue = Math.min(thumbValue, thumbSecondaryValue.floatValue());
            }
        } else {
            thumbValue = dVar.getMinValue();
        }
        if (dVar.b()) {
            float thumbValue2 = dVar.getThumbValue();
            Float thumbSecondaryValue2 = dVar.getThumbSecondaryValue();
            fMax = thumbSecondaryValue2 == null ? thumbValue2 : Math.max(thumbValue2, thumbSecondaryValue2.floatValue());
        } else {
            fMax = dVar.getThumbValue();
        }
        Drawable drawable2 = this.activeTrackDrawable;
        int i12 = i(thumbValue);
        int i13 = i(fMax);
        if (drawable2 == null) {
            aVar.getClass();
        } else {
            drawable2.setBounds(i12, (aVar.f370337b / 2) - (drawable2.getIntrinsicHeight() / 2), i13, (drawable2.getIntrinsicHeight() / 2) + (aVar.f370337b / 2));
            drawable2.draw(canvas);
        }
        int i14 = (int) this.minValue;
        int i15 = (int) this.maxValue;
        if (i14 <= i15) {
            while (true) {
                int i16 = i14 + 1;
                aVar.a(canvas, (i14 > ((int) fMax) || ((int) thumbValue) > i14) ? this.inactiveTickMarkDrawable : this.activeTickMarkDrawable, i(i14));
                if (i14 == i15) {
                    break;
                } else {
                    i14 = i16;
                }
            }
        }
        this.f370346b.b(canvas, i(this.thumbValue), this.thumbDrawable, (int) this.thumbValue, this.thumbTextDrawable);
        if (b()) {
            this.f370346b.b(canvas, i(this.thumbSecondaryValue.floatValue()), this.thumbSecondaryDrawable, (int) this.thumbSecondaryValue.floatValue(), this.thumbSecondTextDrawable);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        } else if (mode == 1073741824) {
            paddingRight = size;
        }
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        } else if (mode2 == 1073741824) {
            paddingBottom = size2;
        }
        setMeasuredDimension(paddingRight, paddingBottom);
        int paddingLeft = ((paddingRight - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
        int paddingTop = (paddingBottom - getPaddingTop()) - getPaddingBottom();
        com.yandex.div.internal.widget.slider.a aVar = this.f370346b;
        aVar.f370336a = paddingLeft;
        aVar.f370337b = paddingTop;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@k MotionEvent motionEvent) {
        if (!this.interactive) {
            return false;
        }
        int x12 = (((int) motionEvent.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                h(this.f370369y, a(x12), this.animationEnabled);
                return true;
            }
            if (action != 2) {
                return false;
            }
            h(this.f370369y, a(x12), false);
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        boolean zB2 = b();
        c cVar = c.f370372b;
        if (zB2 && Math.abs(x12 - i(this.thumbValue)) >= Math.abs(x12 - i(this.thumbSecondaryValue.floatValue()))) {
            cVar = c.f370373c;
        }
        this.f370369y = cVar;
        h(cVar, a(x12), this.animationEnabled);
        return true;
    }

    public final void setActiveTickMarkDrawable(@l Drawable drawable) {
        this.activeTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        f();
        invalidate();
    }

    public final void setActiveTrackDrawable(@l Drawable drawable) {
        this.activeTrackDrawable = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j12) {
        if (this.animationDuration == j12 || j12 < 0) {
            return;
        }
        this.animationDuration = j12;
    }

    public final void setAnimationEnabled(boolean z12) {
        this.animationEnabled = z12;
    }

    public final void setAnimationInterpolator(@k AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        this.animationInterpolator = accelerateDecelerateInterpolator;
    }

    public final void setInactiveTickMarkDrawable(@l Drawable drawable) {
        this.inactiveTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        f();
        invalidate();
    }

    public final void setInactiveTrackDrawable(@l Drawable drawable) {
        this.inactiveTrackDrawable = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z12) {
        this.interactive = z12;
    }

    public final void setMaxValue(float f12) {
        if (this.maxValue == f12) {
            return;
        }
        setMinValue(Math.min(this.minValue, f12 - 1.0f));
        this.maxValue = f12;
        d();
        invalidate();
    }

    public final void setMinValue(float f12) {
        if (this.minValue == f12) {
            return;
        }
        setMaxValue(Math.max(this.maxValue, 1.0f + f12));
        this.minValue = f12;
        d();
        invalidate();
    }

    public final void setThumbDrawable(@l Drawable drawable) {
        this.thumbDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(@l L21.b bVar) {
        this.thumbSecondTextDrawable = bVar;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(@l Drawable drawable) {
        this.thumbSecondaryDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbTextDrawable(@l L21.b bVar) {
        this.thumbTextDrawable = bVar;
        invalidate();
    }

    @j
    public d(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f370346b = new com.yandex.div.internal.widget.slider.a();
        this.f370347c = new q0<>();
        this.f370350f = new e();
        this.f370351g = new f();
        this.animationDuration = 300L;
        this.animationInterpolator = new AccelerateDecelerateInterpolator();
        this.animationEnabled = true;
        this.maxValue = 100.0f;
        this.thumbValue = this.minValue;
        this.maxTickmarkOrThumbWidth = -1;
        this.f370368x = new a();
        this.f370369y = c.f370372b;
        this.interactive = true;
    }

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/widget/slider/d$b;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface b {
        default void a(float f12) {
        }

        default void b(@l Float f12) {
        }
    }

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/internal/widget/slider/d$e", "Landroid/animation/Animator$AnimatorListener;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public float f370375a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f370376b;

        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@k Animator animator) {
            this.f370376b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@k Animator animator) {
            d dVar = d.this;
            dVar.f370348d = null;
            if (this.f370376b) {
                return;
            }
            Float fValueOf = Float.valueOf(this.f370375a);
            float thumbValue = dVar.getThumbValue();
            if (L.d(fValueOf, thumbValue)) {
                return;
            }
            Iterator<b> it = dVar.f370347c.iterator();
            while (it.hasNext()) {
                it.next().a(thumbValue);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@k Animator animator) {
            this.f370376b = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@k Animator animator) {
        }
    }

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/internal/widget/slider/d$f", "Landroid/animation/Animator$AnimatorListener;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Float f370378a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f370379b;

        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@k Animator animator) {
            this.f370379b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@k Animator animator) {
            d dVar = d.this;
            dVar.f370349e = null;
            if (this.f370379b) {
                return;
            }
            Float f12 = this.f370378a;
            Float thumbSecondaryValue = dVar.getThumbSecondaryValue();
            if (L.e(f12, thumbSecondaryValue)) {
                return;
            }
            Iterator<b> it = dVar.f370347c.iterator();
            while (it.hasNext()) {
                it.next().b(thumbSecondaryValue);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@k Animator animator) {
            this.f370379b = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@k Animator animator) {
        }
    }
}
