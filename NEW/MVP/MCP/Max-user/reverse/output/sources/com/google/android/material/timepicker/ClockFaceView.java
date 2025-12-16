package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import defpackage.d7d;
import defpackage.dvc;
import defpackage.dwc;
import defpackage.gti;
import defpackage.hfh;
import defpackage.ic3;
import defpackage.k1d;
import defpackage.k5;
import defpackage.m5d;
import defpackage.ovc;
import defpackage.qt3;
import defpackage.ut3;
import defpackage.uxc;
import defpackage.z5d;
import defpackage.z7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class ClockFaceView extends d7d implements ic3 {
    public final ClockHandView I0;
    public final Rect J0;
    public final RectF K0;
    public final Rect L0;
    public final SparseArray M0;
    public final c N0;
    public final int[] O0;
    public final float[] P0;
    public final int Q0;
    public final int R0;
    public final int S0;
    public final int T0;
    public final String[] U0;
    public float V0;
    public final ColorStateList W0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockFaceView(Context context, AttributeSet attributeSet) {
        int i = dvc.materialClockStyle;
        super(context, attributeSet, i);
        this.J0 = new Rect();
        this.K0 = new RectF();
        this.L0 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.M0 = sparseArray;
        this.P0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.ClockFaceView, i, m5d.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListC = gti.c(context, typedArrayObtainStyledAttributes, z5d.ClockFaceView_clockNumberTextColor);
        this.W0 = colorStateListC;
        LayoutInflater.from(context).inflate(k1d.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(uxc.material_clock_hand);
        this.I0 = clockHandView;
        this.Q0 = resources.getDimensionPixelSize(dwc.material_clock_hand_padding);
        int colorForState = colorStateListC.getColorForState(new int[]{R.attr.state_selected}, colorStateListC.getDefaultColor());
        this.O0 = new int[]{colorForState, colorForState, colorStateListC.getDefaultColor()};
        clockHandView.c.add(this);
        int defaultColor = z7.c(context, ovc.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListC2 = gti.c(context, typedArrayObtainStyledAttributes, z5d.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListC2 != null ? colorStateListC2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.N0 = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.U0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.U0.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.U0.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(k1d.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.U0[i2]);
                textView.setTag(uxc.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(uxc.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                hfh.n(textView, this.N0);
                textView.setTextColor(this.W0);
            }
        }
        ClockHandView clockHandView2 = this.I0;
        if (clockHandView2.b && !z) {
            clockHandView2.z0 = 1;
        }
        clockHandView2.b = z;
        clockHandView2.invalidate();
        this.R0 = resources.getDimensionPixelSize(dwc.material_time_picker_minimum_screen_height);
        this.S0 = resources.getDimensionPixelSize(dwc.material_time_picker_minimum_screen_width);
        this.T0 = resources.getDimensionPixelSize(dwc.material_clock_size);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) k5.a(1, this.U0.length, 1).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.T0 / Math.max(Math.max(this.R0 / displayMetrics.heightPixels, this.S0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // defpackage.d7d
    public final void v() {
        ut3 ut3Var = new ut3();
        ut3Var.c(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != uxc.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(uxc.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.G0 * 0.66f) : this.G0;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                int i3 = uxc.circle_center;
                qt3 qt3Var = ut3Var.g(id).d;
                qt3Var.z = i3;
                qt3Var.A = iRound;
                qt3Var.B = size;
                size += 360.0f / list.size();
            }
        }
        ut3Var.a(this);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.M0;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    public final void w() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.I0.t0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.M0;
            int size = sparseArray.size();
            rect = this.J0;
            rectF = this.K0;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.L0);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.O0, this.P0, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }
}
