package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import j.N;
import j.P;
import j.e0;
import java.util.Arrays;

/* loaded from: classes6.dex */
class ClockFaceView extends e implements ClockHandView.c {

    /* renamed from: e, reason: collision with root package name */
    public final ClockHandView f357575e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f357576f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f357577g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f357578h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray<TextView> f357579i;

    /* renamed from: j, reason: collision with root package name */
    public final C22808a f357580j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f357581k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f357582l;

    /* renamed from: m, reason: collision with root package name */
    public final int f357583m;

    /* renamed from: n, reason: collision with root package name */
    public final int f357584n;

    /* renamed from: o, reason: collision with root package name */
    public final int f357585o;

    /* renamed from: p, reason: collision with root package name */
    public final int f357586p;

    /* renamed from: q, reason: collision with root package name */
    public String[] f357587q;

    /* renamed from: r, reason: collision with root package name */
    public float f357588r;

    /* renamed from: s, reason: collision with root package name */
    public final ColorStateList f357589s;

    class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ClockFaceView clockFaceView = ClockFaceView.this;
            if (!clockFaceView.isShown()) {
                return true;
            }
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f357575e.f357603l) - clockFaceView.f357583m;
            if (height != clockFaceView.f357664c) {
                clockFaceView.f357664c = height;
                clockFaceView.g();
                int i12 = clockFaceView.f357664c;
                ClockHandView clockHandView = clockFaceView.f357575e;
                clockHandView.f357612u = i12;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    class b extends C22808a {
        public b() {
        }

        @Override // androidx.core.view.C22808a
        public final void d(View view, @N androidx.core.view.accessibility.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f44991a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (iIntValue > 0) {
                accessibilityNodeInfo.setTraversalAfter(ClockFaceView.this.f357579i.get(iIntValue - 1));
            }
            fVar.n(f.g.a(0, 1, iIntValue, 1, view.isSelected()));
            fVar.l(true);
            fVar.b(f.a.f45004g);
        }

        @Override // androidx.core.view.C22808a
        public final boolean g(View view, int i12, Bundle bundle) {
            if (i12 != 16) {
                return super.g(view, i12, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = ClockFaceView.this;
            view.getHitRect(clockFaceView.f357576f);
            float fCenterX = clockFaceView.f357576f.centerX();
            float fCenterY = clockFaceView.f357576f.centerY();
            clockFaceView.f357575e.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            clockFaceView.f357575e.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockFaceView(@N Context context, @P AttributeSet attributeSet) {
        int i12 = R.attr.materialClockStyle;
        super(context, attributeSet, i12);
        this.f357576f = new Rect();
        this.f357577g = new RectF();
        this.f357578h = new Rect();
        this.f357579i = new SparseArray<>();
        this.f357582l = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockFaceView, i12, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListB = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context, R.styleable.ClockFaceView_clockNumberTextColor);
        this.f357589s = colorStateListB;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f357575e = clockHandView;
        this.f357583m = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListB.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListB.getDefaultColor());
        this.f357581k = new int[]{colorForState, colorForState, colorStateListB.getDefaultColor()};
        clockHandView.f357602k.add(this);
        int defaultColor = androidx.core.content.d.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListB2 = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListB2 != null ? colorStateListB2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f357580j = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        i(0, strArr);
        this.f357584n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f357585o = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f357586p = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public final void b(float f12, boolean z12) {
        if (Math.abs(this.f357588r - f12) > 0.001f) {
            this.f357588r = f12;
            h();
        }
    }

    @Override // com.google.android.material.timepicker.e
    public final void g() {
        super.g();
        int i12 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f357579i;
            if (i12 >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i12).setVisibility(0);
            i12++;
        }
    }

    public final void h() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f357575e.f357606o;
        float f12 = Float.MAX_VALUE;
        TextView textView = null;
        int i12 = 0;
        while (true) {
            sparseArray = this.f357579i;
            int size = sparseArray.size();
            rectF = this.f357577g;
            rect = this.f357576f;
            if (i12 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i12);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f12) {
                    textView = textView2;
                    f12 = fHeight;
                }
            }
            i12++;
        }
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            TextView textView3 = sparseArray.get(i13);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f357578h);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f357581k, this.f357582l, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    public final void i(@e0 int i12, String[] strArr) {
        this.f357587q = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        SparseArray<TextView> sparseArray = this.f357579i;
        int size = sparseArray.size();
        boolean z12 = false;
        for (int i13 = 0; i13 < Math.max(this.f357587q.length, size); i13++) {
            TextView textView = sparseArray.get(i13);
            if (i13 >= this.f357587q.length) {
                removeView(textView);
                sparseArray.remove(i13);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i13, textView);
                    addView(textView);
                }
                textView.setText(this.f357587q[i13]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i13));
                int i14 = (i13 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i14));
                if (i14 > 1) {
                    z12 = true;
                }
                C22823h0.C(textView, this.f357580j);
                textView.setTextColor(this.f357589s);
                if (i12 != 0) {
                    textView.setContentDescription(getResources().getString(i12, this.f357587q[i13]));
                }
            }
        }
        ClockHandView clockHandView = this.f357575e;
        if (clockHandView.f357601j && !z12) {
            clockHandView.f357613v = 1;
        }
        clockHandView.f357601j = z12;
        clockHandView.invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new androidx.core.view.accessibility.f(accessibilityNodeInfo).m(f.C1754f.a(1, this.f357587q.length, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f357586p / Math.max(Math.max(this.f357584n / displayMetrics.heightPixels, this.f357585o / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
