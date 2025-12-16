package com.google.android.material.slider;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.core.graphics.C22767g;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.material.R;
import com.google.android.material.internal.C37064e;
import com.google.android.material.internal.D;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import com.google.android.material.shape.k;
import com.google.android.material.shape.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import j.F;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.k0;
import j.r;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import lY0.C43707b;
import wY0.C49576a;

/* loaded from: classes6.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {

    /* renamed from: k0, reason: collision with root package name */
    public static final int f357194k0 = R.style.Widget_MaterialComponents_Slider;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f357195l0 = R.attr.motionDurationMedium4;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f357196m0 = R.attr.motionDurationShort3;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f357197n0 = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f357198o0 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: A, reason: collision with root package name */
    public int f357199A;

    /* renamed from: B, reason: collision with root package name */
    public int f357200B;

    /* renamed from: C, reason: collision with root package name */
    public int f357201C;

    /* renamed from: D, reason: collision with root package name */
    public int f357202D;

    /* renamed from: E, reason: collision with root package name */
    public int f357203E;

    /* renamed from: F, reason: collision with root package name */
    public final int f357204F;

    /* renamed from: G, reason: collision with root package name */
    public float f357205G;

    /* renamed from: H, reason: collision with root package name */
    public MotionEvent f357206H;

    /* renamed from: I, reason: collision with root package name */
    public e f357207I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f357208J;

    /* renamed from: K, reason: collision with root package name */
    public float f357209K;

    /* renamed from: L, reason: collision with root package name */
    public float f357210L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList<Float> f357211M;

    /* renamed from: N, reason: collision with root package name */
    public int f357212N;

    /* renamed from: O, reason: collision with root package name */
    public int f357213O;

    /* renamed from: P, reason: collision with root package name */
    public float f357214P;

    /* renamed from: Q, reason: collision with root package name */
    public float[] f357215Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f357216R;

    /* renamed from: S, reason: collision with root package name */
    public int f357217S;

    /* renamed from: T, reason: collision with root package name */
    public int f357218T;

    /* renamed from: U, reason: collision with root package name */
    public int f357219U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f357220V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f357221W;

    /* renamed from: a0, reason: collision with root package name */
    @N
    public ColorStateList f357222a0;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Paint f357223b;

    /* renamed from: b0, reason: collision with root package name */
    @N
    public ColorStateList f357224b0;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final Paint f357225c;

    /* renamed from: c0, reason: collision with root package name */
    @N
    public ColorStateList f357226c0;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final Paint f357227d;

    /* renamed from: d0, reason: collision with root package name */
    @N
    public ColorStateList f357228d0;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final Paint f357229e;

    /* renamed from: e0, reason: collision with root package name */
    @N
    public ColorStateList f357230e0;

    /* renamed from: f, reason: collision with root package name */
    @N
    public final Paint f357231f;

    /* renamed from: f0, reason: collision with root package name */
    @N
    public final k f357232f0;

    /* renamed from: g, reason: collision with root package name */
    @N
    public final Paint f357233g;

    /* renamed from: g0, reason: collision with root package name */
    @P
    public Drawable f357234g0;

    /* renamed from: h, reason: collision with root package name */
    @N
    public final c f357235h;

    /* renamed from: h0, reason: collision with root package name */
    @N
    public List<Drawable> f357236h0;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManager f357237i;

    /* renamed from: i0, reason: collision with root package name */
    public float f357238i0;

    /* renamed from: j, reason: collision with root package name */
    public BaseSlider<S, L, T>.b f357239j;

    /* renamed from: j0, reason: collision with root package name */
    public int f357240j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f357241k;

    /* renamed from: l, reason: collision with root package name */
    @N
    public final ArrayList f357242l;

    /* renamed from: m, reason: collision with root package name */
    @N
    public final ArrayList f357243m;

    /* renamed from: n, reason: collision with root package name */
    @N
    public final ArrayList f357244n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f357245o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f357246p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f357247q;

    /* renamed from: r, reason: collision with root package name */
    public final int f357248r;

    /* renamed from: s, reason: collision with root package name */
    public final int f357249s;

    /* renamed from: t, reason: collision with root package name */
    public final int f357250t;

    /* renamed from: u, reason: collision with root package name */
    public final int f357251u;

    /* renamed from: v, reason: collision with root package name */
    public final int f357252v;

    /* renamed from: w, reason: collision with root package name */
    public final int f357253w;

    /* renamed from: x, reason: collision with root package name */
    @r
    public final int f357254x;

    /* renamed from: y, reason: collision with root package name */
    public final int f357255y;

    /* renamed from: z, reason: collision with root package name */
    public int f357256z;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public float f357257b;

        /* renamed from: c, reason: collision with root package name */
        public float f357258c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList<Float> f357259d;

        /* renamed from: e, reason: collision with root package name */
        public float f357260e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f357261f;

        public class a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            @N
            public final SliderState createFromParcel(@N Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @N
            public final SliderState[] newArray(int i12) {
                return new SliderState[i12];
            }
        }

        public SliderState(Parcel parcel, a aVar) {
            super(parcel);
            this.f357257b = parcel.readFloat();
            this.f357258c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f357259d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f357260e = parcel.readFloat();
            this.f357261f = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeFloat(this.f357257b);
            parcel.writeFloat(this.f357258c);
            parcel.writeList(this.f357259d);
            parcel.writeFloat(this.f357260e);
            parcel.writeBooleanArray(new boolean[]{this.f357261f});
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseSlider baseSlider = BaseSlider.this;
            Iterator it = baseSlider.f357242l.iterator();
            while (it.hasNext()) {
                com.google.android.material.tooltip.a aVar = (com.google.android.material.tooltip.a) it.next();
                aVar.f357711M = 1.2f;
                aVar.f357709K = fFloatValue;
                aVar.f357710L = fFloatValue;
                aVar.f357712N = C43707b.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                aVar.invalidateSelf();
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            baseSlider.postInvalidateOnAnimation();
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public int f357263b = -1;

        public b(a aVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.f357235h.x(this.f357263b, 4);
        }
    }

    public static class c extends androidx.customview.widget.a {

        /* renamed from: q, reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f357265q;

        /* renamed from: r, reason: collision with root package name */
        public final Rect f357266r;

        public c(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f357266r = new Rect();
            this.f357265q = baseSlider;
        }

        @Override // androidx.customview.widget.a
        public final int n(float f12, float f13) {
            int i12 = 0;
            while (true) {
                BaseSlider<?, ?, ?> baseSlider = this.f357265q;
                if (i12 >= baseSlider.getValues().size()) {
                    return -1;
                }
                Rect rect = this.f357266r;
                baseSlider.u(i12, rect);
                if (rect.contains((int) f12, (int) f13)) {
                    return i12;
                }
                i12++;
            }
        }

        @Override // androidx.customview.widget.a
        public final void o(ArrayList arrayList) {
            for (int i12 = 0; i12 < this.f357265q.getValues().size(); i12++) {
                arrayList.add(Integer.valueOf(i12));
            }
        }

        @Override // androidx.customview.widget.a
        public final boolean s(int i12, int i13, Bundle bundle) {
            BaseSlider<?, ?, ?> baseSlider = this.f357265q;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i13 != 4096 && i13 != 8192) {
                if (i13 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    float f12 = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                    int i14 = BaseSlider.f357194k0;
                    if (baseSlider.t(f12, i12)) {
                        baseSlider.v();
                        baseSlider.postInvalidate();
                        p(i12);
                        return true;
                    }
                }
                return false;
            }
            int i15 = BaseSlider.f357194k0;
            float fRound = baseSlider.f357214P;
            if (fRound == 0.0f) {
                fRound = 1.0f;
            }
            if ((baseSlider.f357210L - baseSlider.f357209K) / fRound > 20) {
                fRound *= Math.round(r1 / r5);
            }
            if (i13 == 8192) {
                fRound = -fRound;
            }
            if (baseSlider.l()) {
                fRound = -fRound;
            }
            if (!baseSlider.t(M0.a.a(baseSlider.getValues().get(i12).floatValue() + fRound, baseSlider.getValueFrom(), baseSlider.getValueTo()), i12)) {
                return false;
            }
            baseSlider.v();
            baseSlider.postInvalidate();
            p(i12);
            return true;
        }

        @Override // androidx.customview.widget.a
        public final void u(int i12, f fVar) {
            fVar.b(f.a.f45016s);
            BaseSlider<?, ?, ?> baseSlider = this.f357265q;
            List<Float> values = baseSlider.getValues();
            float fFloatValue = values.get(i12).floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    fVar.a(8192);
                }
                if (fFloatValue < valueTo) {
                    fVar.a(4096);
                }
            }
            AccessibilityNodeInfo.RangeInfo rangeInfoObtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue);
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            accessibilityNodeInfo.setRangeInfo(rangeInfoObtain);
            fVar.k(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb2.append(baseSlider.getContentDescription());
                sb2.append(",");
            }
            String strH = baseSlider.h(fFloatValue);
            String string = baseSlider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = i12 == baseSlider.getValues().size() - 1 ? baseSlider.getContext().getString(R.string.material_slider_range_end) : i12 == 0 ? baseSlider.getContext().getString(R.string.material_slider_range_start) : "";
            }
            Locale locale = Locale.US;
            sb2.append(string + ", " + strH);
            fVar.o(sb2.toString());
            Rect rect = this.f357266r;
            baseSlider.u(i12, rect);
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    public BaseSlider(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f357211M.size() == 1) {
            fFloatValue2 = this.f357209K;
        }
        float fP2 = p(fFloatValue2);
        float fP3 = p(fFloatValue);
        return l() ? new float[]{fP3, fP2} : new float[]{fP2, fP3};
    }

    private float getValueOfTouchPosition() {
        double dRound;
        float f12 = this.f357238i0;
        float f13 = this.f357214P;
        if (f13 > 0.0f) {
            dRound = Math.round(f12 * r1) / ((int) ((this.f357210L - this.f357209K) / f13));
        } else {
            dRound = f12;
        }
        if (l()) {
            dRound = 1.0d - dRound;
        }
        float f14 = this.f357210L;
        return (float) ((dRound * (f14 - r1)) + this.f357209K);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f12 = this.f357238i0;
        if (l()) {
            f12 = 1.0f - f12;
        }
        float f13 = this.f357210L;
        float f14 = this.f357209K;
        return androidx.appcompat.app.r.c(f13, f14, f12, f14);
    }

    private void setValuesInternal(@N ArrayList<Float> arrayList) {
        ViewGroup viewGroupC;
        int resourceId;
        com.google.android.material.internal.N nD2;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f357211M.size() == arrayList.size() && this.f357211M.equals(arrayList)) {
            return;
        }
        this.f357211M = arrayList;
        this.f357221W = true;
        this.f357213O = 0;
        v();
        ArrayList arrayList2 = this.f357242l;
        if (arrayList2.size() > this.f357211M.size()) {
            List<com.google.android.material.tooltip.a> listSubList = arrayList2.subList(this.f357211M.size(), arrayList2.size());
            for (com.google.android.material.tooltip.a aVar : listSubList) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                if (isAttachedToWindow() && (nD2 = O.d(O.c(this))) != null) {
                    nD2.b(aVar);
                    ViewGroup viewGroupC2 = O.c(this);
                    if (viewGroupC2 == null) {
                        aVar.getClass();
                    } else {
                        viewGroupC2.removeOnLayoutChangeListener(aVar.f357701C);
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f357211M.size()) {
            Context context = getContext();
            int i12 = this.f357241k;
            com.google.android.material.tooltip.a aVar2 = new com.google.android.material.tooltip.a(context, i12);
            TypedArray typedArrayD = G.d(aVar2.f357714z, null, R.styleable.Tooltip, 0, i12, new int[0]);
            Context context2 = aVar2.f357714z;
            aVar2.f357707I = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            q.b bVarF = aVar2.f357034b.f357057a.f();
            bVarF.f357103k = aVar2.A();
            aVar2.setShapeAppearanceModel(bVarF.a());
            CharSequence text = typedArrayD.getText(R.styleable.Tooltip_android_text);
            boolean zEquals = TextUtils.equals(aVar2.f357713y, text);
            D d12 = aVar2.f357700B;
            if (!zEquals) {
                aVar2.f357713y = text;
                d12.f356724d = true;
                aVar2.invalidateSelf();
            }
            int i13 = R.styleable.Tooltip_android_textAppearance;
            com.google.android.material.resources.d dVar = (!typedArrayD.hasValue(i13) || (resourceId = typedArrayD.getResourceId(i13, 0)) == 0) ? null : new com.google.android.material.resources.d(context2, resourceId);
            if (dVar != null && typedArrayD.hasValue(R.styleable.Tooltip_android_textColor)) {
                dVar.f356996j = com.google.android.material.resources.c.b(typedArrayD, context2, R.styleable.Tooltip_android_textColor);
            }
            d12.b(dVar, context2);
            aVar2.n(ColorStateList.valueOf(typedArrayD.getColor(R.styleable.Tooltip_backgroundTint, C22767g.g(C22767g.i(com.google.android.material.color.k.c(context2, R.attr.colorOnBackground, com.google.android.material.tooltip.a.class.getCanonicalName()), 153), C22767g.i(com.google.android.material.color.k.c(context2, android.R.attr.colorBackground, com.google.android.material.tooltip.a.class.getCanonicalName()), 229)))));
            aVar2.u(ColorStateList.valueOf(com.google.android.material.color.k.c(context2, R.attr.colorSurface, com.google.android.material.tooltip.a.class.getCanonicalName())));
            aVar2.f357703E = typedArrayD.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
            aVar2.f357704F = typedArrayD.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
            aVar2.f357705G = typedArrayD.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
            aVar2.f357706H = typedArrayD.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
            typedArrayD.recycle();
            arrayList2.add(aVar2);
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            if (isAttachedToWindow() && (viewGroupC = O.c(this)) != null) {
                int[] iArr = new int[2];
                viewGroupC.getLocationOnScreen(iArr);
                aVar2.f357708J = iArr[0];
                viewGroupC.getWindowVisibleDisplayFrame(aVar2.f357702D);
                viewGroupC.addOnLayoutChangeListener(aVar2.f357701C);
            }
        }
        int i14 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.tooltip.a) it.next()).v(i14);
        }
        Iterator it2 = this.f357243m.iterator();
        while (it2.hasNext()) {
            com.google.android.material.slider.a aVar3 = (com.google.android.material.slider.a) it2.next();
            Iterator<Float> it3 = this.f357211M.iterator();
            while (it3.hasNext()) {
                aVar3.a(this, it3.next().floatValue(), false);
            }
        }
        postInvalidate();
    }

    public final void d(Drawable drawable) {
        int i12 = this.f357202D * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i12, i12);
        } else {
            float fMax = i12 / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@N MotionEvent motionEvent) {
        return this.f357235h.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f357223b.setColor(i(this.f357230e0));
        this.f357225c.setColor(i(this.f357228d0));
        this.f357231f.setColor(i(this.f357226c0));
        this.f357233g.setColor(i(this.f357224b0));
        Iterator it = this.f357242l.iterator();
        while (it.hasNext()) {
            com.google.android.material.tooltip.a aVar = (com.google.android.material.tooltip.a) it.next();
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        k kVar = this.f357232f0;
        if (kVar.isStateful()) {
            kVar.setState(getDrawableState());
        }
        Paint paint = this.f357229e;
        paint.setColor(i(this.f357222a0));
        paint.setAlpha(63);
    }

    public final int e() {
        int i12 = this.f357256z / 2;
        int i13 = this.f357199A;
        return i12 + ((i13 == 1 || i13 == 3) ? ((com.google.android.material.tooltip.a) this.f357242l.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator f(boolean z12) {
        int iC2;
        TimeInterpolator timeInterpolatorD;
        float fFloatValue = z12 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z12 ? this.f357247q : this.f357246p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z12 ? 1.0f : 0.0f);
        if (z12) {
            iC2 = C49576a.c(getContext(), f357195l0, 83);
            timeInterpolatorD = C49576a.d(getContext(), f357197n0, C43707b.f413883e);
        } else {
            iC2 = C49576a.c(getContext(), f357196m0, 117);
            timeInterpolatorD = C49576a.d(getContext(), f357198o0, C43707b.f413881c);
        }
        valueAnimatorOfFloat.setDuration(iC2);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorD);
        valueAnimatorOfFloat.addUpdateListener(new a());
        return valueAnimatorOfFloat;
    }

    public final void g(@N Canvas canvas, int i12, int i13, float f12, @N Drawable drawable) {
        canvas.save();
        canvas.translate((this.f357201C + ((int) (p(f12) * i12))) - (drawable.getBounds().width() / 2.0f), i13 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    @N
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @k0
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f357235h.f45366k;
    }

    public int getActiveThumbIndex() {
        return this.f357212N;
    }

    public int getFocusedThumbIndex() {
        return this.f357213O;
    }

    @r
    public int getHaloRadius() {
        return this.f357203E;
    }

    @N
    public ColorStateList getHaloTintList() {
        return this.f357222a0;
    }

    public int getLabelBehavior() {
        return this.f357199A;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f357214P;
    }

    public float getThumbElevation() {
        return this.f357232f0.f357034b.f357069m;
    }

    @r
    public int getThumbRadius() {
        return this.f357202D;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f357232f0.f357034b.f357060d;
    }

    public float getThumbStrokeWidth() {
        return this.f357232f0.f357034b.f357066j;
    }

    @N
    public ColorStateList getThumbTintList() {
        return this.f357232f0.f357034b.f357059c;
    }

    @r
    public int getTickActiveRadius() {
        return this.f357217S;
    }

    @N
    public ColorStateList getTickActiveTintList() {
        return this.f357224b0;
    }

    @r
    public int getTickInactiveRadius() {
        return this.f357218T;
    }

    @N
    public ColorStateList getTickInactiveTintList() {
        return this.f357226c0;
    }

    @N
    public ColorStateList getTickTintList() {
        if (this.f357226c0.equals(this.f357224b0)) {
            return this.f357224b0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @N
    public ColorStateList getTrackActiveTintList() {
        return this.f357228d0;
    }

    @r
    public int getTrackHeight() {
        return this.f357200B;
    }

    @N
    public ColorStateList getTrackInactiveTintList() {
        return this.f357230e0;
    }

    @r
    public int getTrackSidePadding() {
        return this.f357201C;
    }

    @N
    public ColorStateList getTrackTintList() {
        if (this.f357230e0.equals(this.f357228d0)) {
            return this.f357228d0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @r
    public int getTrackWidth() {
        return this.f357219U;
    }

    public float getValueFrom() {
        return this.f357209K;
    }

    public float getValueTo() {
        return this.f357210L;
    }

    @N
    public List<Float> getValues() {
        return new ArrayList(this.f357211M);
    }

    public final String h(float f12) {
        if (this.f357207I != null) {
            return this.f357207I.a(f12);
        }
        return String.format(((float) ((int) f12)) == f12 ? "%.0f" : "%.2f", Float.valueOf(f12));
    }

    @InterfaceC42156l
    public final int i(@N ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean j(float f12) {
        double dDoubleValue = new BigDecimal(Float.toString(f12)).divide(new BigDecimal(Float.toString(this.f357214P)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean k(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) == 3) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return getLayoutDirection() == 1;
    }

    public final void m() {
        if (this.f357214P <= 0.0f) {
            return;
        }
        x();
        int iMin = Math.min((int) (((this.f357210L - this.f357209K) / this.f357214P) + 1.0f), (this.f357219U / (this.f357200B * 2)) + 1);
        float[] fArr = this.f357215Q;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f357215Q = new float[iMin * 2];
        }
        float f12 = this.f357219U / (iMin - 1);
        for (int i12 = 0; i12 < iMin * 2; i12 += 2) {
            float[] fArr2 = this.f357215Q;
            fArr2[i12] = ((i12 / 2.0f) * f12) + this.f357201C;
            fArr2[i12 + 1] = e();
        }
    }

    public final boolean n(int i12) {
        int i13 = this.f357213O;
        long j12 = i13 + i12;
        long size = this.f357211M.size() - 1;
        if (j12 < 0) {
            j12 = 0;
        } else if (j12 > size) {
            j12 = size;
        }
        int i14 = (int) j12;
        this.f357213O = i14;
        if (i14 == i13) {
            return false;
        }
        if (this.f357212N != -1) {
            this.f357212N = i14;
        }
        v();
        postInvalidate();
        return true;
    }

    public final void o(int i12) {
        if (l()) {
            i12 = i12 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i12;
        }
        n(i12);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f357242l.iterator();
        while (it.hasNext()) {
            com.google.android.material.tooltip.a aVar = (com.google.android.material.tooltip.a) it.next();
            ViewGroup viewGroupC = O.c(this);
            if (viewGroupC == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                viewGroupC.getLocationOnScreen(iArr);
                aVar.f357708J = iArr[0];
                viewGroupC.getWindowVisibleDisplayFrame(aVar.f357702D);
                viewGroupC.addOnLayoutChangeListener(aVar.f357701C);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        BaseSlider<S, L, T>.b bVar = this.f357239j;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.f357245o = false;
        Iterator it = this.f357242l.iterator();
        while (it.hasNext()) {
            com.google.android.material.tooltip.a aVar = (com.google.android.material.tooltip.a) it.next();
            com.google.android.material.internal.N nD2 = O.d(O.c(this));
            if (nD2 != null) {
                nD2.b(aVar);
                ViewGroup viewGroupC = O.c(this);
                if (viewGroupC == null) {
                    aVar.getClass();
                } else {
                    viewGroupC.removeOnLayoutChangeListener(aVar.f357701C);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(@N Canvas canvas) {
        if (this.f357221W) {
            x();
            m();
        }
        super.onDraw(canvas);
        int iE2 = e();
        int i12 = this.f357219U;
        float[] activeRange = getActiveRange();
        int i13 = this.f357201C;
        float f12 = i12;
        float f13 = i13 + (activeRange[1] * f12);
        float f14 = i13 + i12;
        Paint paint = this.f357223b;
        if (f13 < f14) {
            float f15 = iE2;
            canvas.drawLine(f13, f15, f14, f15, paint);
        }
        float f16 = this.f357201C;
        float f17 = (activeRange[0] * f12) + f16;
        if (f17 > f16) {
            float f18 = iE2;
            canvas.drawLine(f16, f18, f17, f18, paint);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.f357209K) {
            int i14 = this.f357219U;
            float[] activeRange2 = getActiveRange();
            float f19 = this.f357201C;
            float f22 = i14;
            float f23 = iE2;
            canvas.drawLine((activeRange2[0] * f22) + f19, f23, (activeRange2[1] * f22) + f19, f23, this.f357225c);
        }
        if (this.f357216R && this.f357214P > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int iRound = Math.round(activeRange3[0] * ((this.f357215Q.length / 2) - 1));
            int iRound2 = Math.round(activeRange3[1] * ((this.f357215Q.length / 2) - 1));
            float[] fArr = this.f357215Q;
            int i15 = iRound * 2;
            Paint paint2 = this.f357231f;
            canvas.drawPoints(fArr, 0, i15, paint2);
            int i16 = iRound2 * 2;
            canvas.drawPoints(this.f357215Q, i15, i16 - i15, this.f357233g);
            float[] fArr2 = this.f357215Q;
            canvas.drawPoints(fArr2, i16, fArr2.length - i16, paint2);
        }
        if ((this.f357208J || isFocused()) && isEnabled()) {
            int i17 = this.f357219U;
            if (!(getBackground() instanceof RippleDrawable)) {
                int iP2 = (int) ((p(this.f357211M.get(this.f357213O).floatValue()) * i17) + this.f357201C);
                if (Build.VERSION.SDK_INT < 28) {
                    int i18 = this.f357203E;
                    canvas.clipRect(iP2 - i18, iE2 - i18, iP2 + i18, i18 + iE2, Region.Op.UNION);
                }
                canvas.drawCircle(iP2, iE2, this.f357203E, this.f357229e);
            }
        }
        if ((this.f357212N != -1 || this.f357199A == 3) && isEnabled()) {
            if (this.f357199A != 2) {
                if (!this.f357245o) {
                    this.f357245o = true;
                    ValueAnimator valueAnimatorF = f(true);
                    this.f357246p = valueAnimatorF;
                    this.f357247q = null;
                    valueAnimatorF.start();
                }
                ArrayList arrayList = this.f357242l;
                Iterator it = arrayList.iterator();
                for (int i19 = 0; i19 < this.f357211M.size() && it.hasNext(); i19++) {
                    if (i19 != this.f357213O) {
                        s((com.google.android.material.tooltip.a) it.next(), this.f357211M.get(i19).floatValue());
                    }
                }
                if (!it.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f357211M.size())));
                }
                s((com.google.android.material.tooltip.a) it.next(), this.f357211M.get(this.f357213O).floatValue());
            }
        } else if (this.f357245o) {
            this.f357245o = false;
            ValueAnimator valueAnimatorF2 = f(false);
            this.f357247q = valueAnimatorF2;
            this.f357246p = null;
            valueAnimatorF2.addListener(new com.google.android.material.slider.c(this));
            this.f357247q.start();
        }
        int i22 = this.f357219U;
        for (int i23 = 0; i23 < this.f357211M.size(); i23++) {
            float fFloatValue = this.f357211M.get(i23).floatValue();
            Drawable drawable = this.f357234g0;
            if (drawable != null) {
                g(canvas, i22, iE2, fFloatValue, drawable);
            } else if (i23 < this.f357236h0.size()) {
                g(canvas, i22, iE2, fFloatValue, this.f357236h0.get(i23));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle((p(fFloatValue) * i22) + this.f357201C, iE2, this.f357202D, this.f357227d);
                }
                g(canvas, i22, iE2, fFloatValue, this.f357232f0);
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z12, int i12, @P Rect rect) {
        super.onFocusChanged(z12, i12, rect);
        c cVar = this.f357235h;
        if (!z12) {
            this.f357212N = -1;
            cVar.j(this.f357213O);
            return;
        }
        if (i12 == 1) {
            n(Integer.MAX_VALUE);
        } else if (i12 == 2) {
            n(BeduinInputModel.MIN_TEXT_VERSION);
        } else if (i12 == 17) {
            o(Integer.MAX_VALUE);
        } else if (i12 == 66) {
            o(BeduinInputModel.MIN_TEXT_VERSION);
        }
        cVar.w(this.f357213O);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r14, @j.N android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i12, @N KeyEvent keyEvent) {
        this.f357220V = false;
        return super.onKeyUp(i12, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14 = this.f357256z;
        int i15 = this.f357199A;
        super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(i14 + ((i15 == 1 || i15 == 3) ? ((com.google.android.material.tooltip.a) this.f357242l.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f357209K = sliderState.f357257b;
        this.f357210L = sliderState.f357258c;
        setValuesInternal(sliderState.f357259d);
        this.f357214P = sliderState.f357260e;
        if (sliderState.f357261f) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f357257b = this.f357209K;
        sliderState.f357258c = this.f357210L;
        sliderState.f357259d = new ArrayList<>(this.f357211M);
        sliderState.f357260e = this.f357214P;
        sliderState.f357261f = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        this.f357219U = Math.max(i12 - (this.f357201C * 2), 0);
        m();
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@j.N android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@N View view, int i12) {
        com.google.android.material.internal.N nD2;
        super.onVisibilityChanged(view, i12);
        if (i12 == 0 || (nD2 = O.d(O.c(this))) == null) {
            return;
        }
        Iterator it = this.f357242l.iterator();
        while (it.hasNext()) {
            nD2.b((com.google.android.material.tooltip.a) it.next());
        }
    }

    public final float p(float f12) {
        float f13 = this.f357209K;
        float f14 = (f12 - f13) / (this.f357210L - f13);
        return l() ? 1.0f - f14 : f14;
    }

    public final void q() {
        Iterator it = this.f357244n.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.slider.b) it.next()).a(this);
        }
    }

    public boolean r() {
        if (this.f357212N != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fP2 = (p(valueOfTouchPositionAbsolute) * this.f357219U) + this.f357201C;
        this.f357212N = 0;
        float fAbs = Math.abs(this.f357211M.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i12 = 1; i12 < this.f357211M.size(); i12++) {
            float fAbs2 = Math.abs(this.f357211M.get(i12).floatValue() - valueOfTouchPositionAbsolute);
            float fP3 = (p(this.f357211M.get(i12).floatValue()) * this.f357219U) + this.f357201C;
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z12 = !l() ? fP3 - fP2 >= 0.0f : fP3 - fP2 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f357212N = i12;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fP3 - fP2) < this.f357248r) {
                        this.f357212N = -1;
                        return false;
                    }
                    if (z12) {
                        this.f357212N = i12;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f357212N != -1;
    }

    public final void s(com.google.android.material.tooltip.a aVar, float f12) {
        String strH = h(f12);
        if (!TextUtils.equals(aVar.f357713y, strH)) {
            aVar.f357713y = strH;
            aVar.f357700B.f356724d = true;
            aVar.invalidateSelf();
        }
        int iP2 = (this.f357201C + ((int) (p(f12) * this.f357219U))) - (aVar.getIntrinsicWidth() / 2);
        int iE2 = e() - (this.f357204F + this.f357202D);
        aVar.setBounds(iP2, iE2 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + iP2, iE2);
        Rect rect = new Rect(aVar.getBounds());
        C37064e.c(O.c(this), this, rect);
        aVar.setBounds(rect);
        O.d(O.c(this)).a(aVar);
    }

    public void setActiveThumbIndex(int i12) {
        this.f357212N = i12;
    }

    public void setCustomThumbDrawable(@InterfaceC42165v int i12) {
        setCustomThumbDrawable(getResources().getDrawable(i12));
    }

    public void setCustomThumbDrawablesForValues(@N @InterfaceC42165v int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            drawableArr[i12] = getResources().getDrawable(iArr[i12]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z12) {
        super.setEnabled(z12);
        setLayerType(z12 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i12) {
        if (i12 < 0 || i12 >= this.f357211M.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f357213O = i12;
        this.f357235h.w(i12);
        postInvalidate();
    }

    public void setHaloRadius(@F @r int i12) {
        if (i12 == this.f357203E) {
            return;
        }
        this.f357203E = i12;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f357203E);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(@InterfaceC42161q int i12) {
        setHaloRadius(getResources().getDimensionPixelSize(i12));
    }

    public void setHaloTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f357222a0)) {
            return;
        }
        this.f357222a0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.f357229e;
        paint.setColor(i(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i12) {
        if (this.f357199A != i12) {
            this.f357199A = i12;
            requestLayout();
        }
    }

    public void setLabelFormatter(@P e eVar) {
        this.f357207I = eVar;
    }

    public void setSeparationUnit(int i12) {
        this.f357240j0 = i12;
        this.f357221W = true;
        postInvalidate();
    }

    public void setStepSize(float f12) {
        if (f12 >= 0.0f) {
            if (this.f357214P != f12) {
                this.f357214P = f12;
                this.f357221W = true;
                postInvalidate();
                return;
            }
            return;
        }
        float f13 = this.f357209K;
        float f14 = this.f357210L;
        StringBuilder sb2 = new StringBuilder("The stepSize(");
        sb2.append(f12);
        sb2.append(") must be 0, or a factor of the valueFrom(");
        sb2.append(f13);
        sb2.append(")-valueTo(");
        throw new IllegalArgumentException(androidx.camera.camera2.internal.G.d(f14, ") range", sb2));
    }

    public void setThumbElevation(float f12) {
        this.f357232f0.m(f12);
    }

    public void setThumbElevationResource(@InterfaceC42161q int i12) {
        setThumbElevation(getResources().getDimension(i12));
    }

    public void setThumbRadius(@F @r int i12) {
        if (i12 == this.f357202D) {
            return;
        }
        this.f357202D = i12;
        k kVar = this.f357232f0;
        q.b bVar = new q.b();
        bVar.d(this.f357202D);
        kVar.setShapeAppearanceModel(bVar.a());
        int i13 = this.f357202D * 2;
        kVar.setBounds(0, 0, i13, i13);
        Drawable drawable = this.f357234g0;
        if (drawable != null) {
            d(drawable);
        }
        Iterator<Drawable> it = this.f357236h0.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
        w();
    }

    public void setThumbRadiusResource(@InterfaceC42161q int i12) {
        setThumbRadius(getResources().getDimensionPixelSize(i12));
    }

    public void setThumbStrokeColor(@P ColorStateList colorStateList) {
        this.f357232f0.u(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@InterfaceC42158n int i12) {
        if (i12 != 0) {
            setThumbStrokeColor(androidx.core.content.d.getColorStateList(getContext(), i12));
        }
    }

    public void setThumbStrokeWidth(float f12) {
        this.f357232f0.v(f12);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@InterfaceC42161q int i12) {
        if (i12 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i12));
        }
    }

    public void setThumbTintList(@N ColorStateList colorStateList) {
        k kVar = this.f357232f0;
        if (colorStateList.equals(kVar.f357034b.f357059c)) {
            return;
        }
        kVar.n(colorStateList);
        invalidate();
    }

    public void setTickActiveRadius(@F @r int i12) {
        if (this.f357217S != i12) {
            this.f357217S = i12;
            this.f357233g.setStrokeWidth(i12 * 2);
            w();
        }
    }

    public void setTickActiveTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f357224b0)) {
            return;
        }
        this.f357224b0 = colorStateList;
        this.f357233g.setColor(i(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@F @r int i12) {
        if (this.f357218T != i12) {
            this.f357218T = i12;
            this.f357231f.setStrokeWidth(i12 * 2);
            w();
        }
    }

    public void setTickInactiveTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f357226c0)) {
            return;
        }
        this.f357226c0 = colorStateList;
        this.f357231f.setColor(i(colorStateList));
        invalidate();
    }

    public void setTickTintList(@N ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z12) {
        if (this.f357216R != z12) {
            this.f357216R = z12;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f357228d0)) {
            return;
        }
        this.f357228d0 = colorStateList;
        this.f357225c.setColor(i(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@F @r int i12) {
        if (this.f357200B != i12) {
            this.f357200B = i12;
            this.f357223b.setStrokeWidth(i12);
            this.f357225c.setStrokeWidth(this.f357200B);
            w();
        }
    }

    public void setTrackInactiveTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f357230e0)) {
            return;
        }
        this.f357230e0 = colorStateList;
        this.f357223b.setColor(i(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@N ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f12) {
        this.f357209K = f12;
        this.f357221W = true;
        postInvalidate();
    }

    public void setValueTo(float f12) {
        this.f357210L = f12;
        this.f357221W = true;
        postInvalidate();
    }

    public void setValues(@N Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public final boolean t(float f12, int i12) {
        this.f357213O = i12;
        if (Math.abs(f12 - this.f357211M.get(i12).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f357240j0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f13 = this.f357209K;
                minSeparation = androidx.appcompat.app.r.c(f13, this.f357210L, (minSeparation - this.f357201C) / this.f357219U, f13);
            }
        }
        if (l()) {
            minSeparation = -minSeparation;
        }
        int i13 = i12 + 1;
        int i14 = i12 - 1;
        this.f357211M.set(i12, Float.valueOf(M0.a.a(f12, i14 < 0 ? this.f357209K : minSeparation + this.f357211M.get(i14).floatValue(), i13 >= this.f357211M.size() ? this.f357210L : this.f357211M.get(i13).floatValue() - minSeparation)));
        Iterator it = this.f357243m.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.slider.a) it.next()).a(this, this.f357211M.get(i12).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f357237i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            BaseSlider<S, L, T>.b bVar = this.f357239j;
            if (bVar == null) {
                this.f357239j = new b(null);
            } else {
                removeCallbacks(bVar);
            }
            BaseSlider<S, L, T>.b bVar2 = this.f357239j;
            bVar2.f357263b = i12;
            postDelayed(bVar2, 200L);
        }
        return true;
    }

    public final void u(int i12, Rect rect) {
        int iP2 = this.f357201C + ((int) (p(getValues().get(i12).floatValue()) * this.f357219U));
        int iE2 = e();
        int i13 = this.f357202D;
        int i14 = this.f357254x;
        if (i13 <= i14) {
            i13 = i14;
        }
        int i15 = i13 / 2;
        rect.set(iP2 - i15, iE2 - i15, iP2 + i15, iE2 + i15);
    }

    public final void v() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iP2 = (int) ((p(this.f357211M.get(this.f357213O).floatValue()) * this.f357219U) + this.f357201C);
            int iE2 = e();
            int i12 = this.f357203E;
            background.setHotspotBounds(iP2 - i12, iE2 - i12, iP2 + i12, iE2 + i12);
        }
    }

    public final void w() {
        boolean z12;
        int iMax = Math.max(this.f357255y, Math.max(this.f357200B + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.f357202D * 2)));
        boolean z13 = false;
        if (iMax == this.f357256z) {
            z12 = false;
        } else {
            this.f357256z = iMax;
            z12 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max(this.f357202D - this.f357250t, 0), Math.max((this.f357200B - this.f357251u) / 2, 0)), Math.max(Math.max(this.f357217S - this.f357252v, 0), Math.max(this.f357218T - this.f357253w, 0))) + this.f357249s;
        if (this.f357201C != iMax2) {
            this.f357201C = iMax2;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (isLaidOut()) {
                this.f357219U = Math.max(getWidth() - (this.f357201C * 2), 0);
                m();
            }
            z13 = true;
        }
        if (z12) {
            requestLayout();
        } else if (z13) {
            postInvalidate();
        }
    }

    public final void x() {
        if (this.f357221W) {
            float f12 = this.f357209K;
            float f13 = this.f357210L;
            if (f12 >= f13) {
                throw new IllegalStateException("valueFrom(" + this.f357209K + ") must be smaller than valueTo(" + this.f357210L + ")");
            }
            if (f13 <= f12) {
                throw new IllegalStateException("valueTo(" + this.f357210L + ") must be greater than valueFrom(" + this.f357209K + ")");
            }
            if (this.f357214P > 0.0f && !j(f13 - f12)) {
                float f14 = this.f357214P;
                float f15 = this.f357209K;
                float f16 = this.f357210L;
                StringBuilder sb2 = new StringBuilder("The stepSize(");
                sb2.append(f14);
                sb2.append(") must be 0, or a factor of the valueFrom(");
                sb2.append(f15);
                sb2.append(")-valueTo(");
                throw new IllegalStateException(androidx.camera.camera2.internal.G.d(f16, ") range", sb2));
            }
            Iterator<Float> it = this.f357211M.iterator();
            while (it.hasNext()) {
                Float next = it.next();
                if (next.floatValue() < this.f357209K || next.floatValue() > this.f357210L) {
                    float f17 = this.f357209K;
                    float f18 = this.f357210L;
                    StringBuilder sb3 = new StringBuilder("Slider value(");
                    sb3.append(next);
                    sb3.append(") must be greater or equal to valueFrom(");
                    sb3.append(f17);
                    sb3.append("), and lower or equal to valueTo(");
                    throw new IllegalStateException(androidx.camera.camera2.internal.G.d(f18, ")", sb3));
                }
                if (this.f357214P > 0.0f && !j(next.floatValue() - this.f357209K)) {
                    float f19 = this.f357209K;
                    float f22 = this.f357214P;
                    throw new IllegalStateException("Value(" + next + ") must be equal to valueFrom(" + f19 + ") plus a multiple of stepSize(" + f22 + ") when using stepSize(" + f22 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f23 = this.f357214P;
            if (f23 > 0.0f && minSeparation > 0.0f) {
                if (this.f357240j0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f357214P + ")");
                }
                if (minSeparation < f23 || !j(minSeparation)) {
                    float f24 = this.f357214P;
                    StringBuilder sb4 = new StringBuilder("minSeparation(");
                    sb4.append(minSeparation);
                    sb4.append(") must be greater or equal and a multiple of stepSize(");
                    sb4.append(f24);
                    sb4.append(") when using stepSize(");
                    throw new IllegalStateException(androidx.camera.camera2.internal.G.d(f24, ")", sb4));
                }
            }
            this.f357221W = false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseSlider(@N Context context, @P AttributeSet attributeSet, int i12) throws Resources.NotFoundException {
        int i13 = f357194k0;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.f357242l = new ArrayList();
        this.f357243m = new ArrayList();
        this.f357244n = new ArrayList();
        this.f357245o = false;
        this.f357208J = false;
        this.f357211M = new ArrayList<>();
        this.f357212N = -1;
        this.f357213O = -1;
        this.f357214P = 0.0f;
        this.f357216R = true;
        this.f357220V = false;
        k kVar = new k();
        this.f357232f0 = kVar;
        this.f357236h0 = Collections.emptyList();
        this.f357240j0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f357223b = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f357225c = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f357227d = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f357229e = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f357231f = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f357233g = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f357255y = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f357249s = dimensionPixelOffset;
        this.f357201C = dimensionPixelOffset;
        this.f357250t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f357251u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f357252v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f357253w = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f357204F = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        int[] iArr = R.styleable.Slider;
        G.a(context2, attributeSet, i12, i13);
        G.b(context2, attributeSet, iArr, i12, i13, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        this.f357241k = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.f357209K = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.f357210L = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f357209K));
        this.f357214P = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.f357254x = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(O.b(48, getContext()))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_trackColor);
        int i14 = zHasValue ? R.styleable.Slider_trackColor : R.styleable.Slider_trackColorInactive;
        int i15 = zHasValue ? R.styleable.Slider_trackColor : R.styleable.Slider_trackColorActive;
        ColorStateList colorStateListB = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, i14);
        setTrackInactiveTintList(colorStateListB == null ? androidx.core.content.d.getColorStateList(context2, R.color.material_slider_inactive_track_color) : colorStateListB);
        ColorStateList colorStateListB2 = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, i15);
        setTrackActiveTintList(colorStateListB2 == null ? androidx.core.content.d.getColorStateList(context2, R.color.material_slider_active_track_color) : colorStateListB2);
        kVar.n(com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, R.styleable.Slider_thumbColor));
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, R.styleable.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateListB3 = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, R.styleable.Slider_haloColor);
        setHaloTintList(colorStateListB3 == null ? androidx.core.content.d.getColorStateList(context2, R.color.material_slider_halo_color) : colorStateListB3);
        this.f357216R = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_tickColor);
        int i16 = zHasValue2 ? R.styleable.Slider_tickColor : R.styleable.Slider_tickColorInactive;
        int i17 = zHasValue2 ? R.styleable.Slider_tickColor : R.styleable.Slider_tickColorActive;
        ColorStateList colorStateListB4 = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, i16);
        setTickInactiveTintList(colorStateListB4 == null ? androidx.core.content.d.getColorStateList(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListB4);
        ColorStateList colorStateListB5 = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, i17);
        setTickActiveTintList(colorStateListB5 == null ? androidx.core.content.d.getColorStateList(context2, R.color.material_slider_active_tick_marks_color) : colorStateListB5);
        setThumbRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, 0));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, 0));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        kVar.s();
        this.f357248r = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.f357235h = cVar;
        C22823h0.C(this, cVar);
        this.f357237i = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setCustomThumbDrawable(@N Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        d(drawableNewDrawable);
        this.f357234g0 = drawableNewDrawable;
        this.f357236h0.clear();
        postInvalidate();
    }

    public void setValues(@N List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@N Drawable... drawableArr) {
        this.f357234g0 = null;
        this.f357236h0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.f357236h0;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            d(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
