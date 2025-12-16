package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.baj;
import defpackage.bee;
import defpackage.cu4;
import defpackage.d45;
import defpackage.d65;
import defpackage.d7g;
import defpackage.dvc;
import defpackage.dwc;
import defpackage.er8;
import defpackage.eri;
import defpackage.eti;
import defpackage.exi;
import defpackage.g0;
import defpackage.gti;
import defpackage.hfh;
import defpackage.hfi;
import defpackage.ho7;
import defpackage.i4g;
import defpackage.iti;
import defpackage.j4g;
import defpackage.jc4;
import defpackage.jdc;
import defpackage.k4g;
import defpackage.kc4;
import defpackage.kf5;
import defpackage.ko;
import defpackage.l4g;
import defpackage.l6j;
import defpackage.lf5;
import defpackage.m5d;
import defpackage.ne3;
import defpackage.oaf;
import defpackage.ovc;
import defpackage.q85;
import defpackage.qtd;
import defpackage.r98;
import defpackage.rf3;
import defpackage.rg;
import defpackage.s2d;
import defpackage.s34;
import defpackage.s5i;
import defpackage.sp5;
import defpackage.t35;
import defpackage.t74;
import defpackage.tm0;
import defpackage.uxc;
import defpackage.vef;
import defpackage.vq8;
import defpackage.w3g;
import defpackage.wj7;
import defpackage.wk0;
import defpackage.wq8;
import defpackage.xj7;
import defpackage.xse;
import defpackage.y3g;
import defpackage.yeh;
import defpackage.yqi;
import defpackage.z5d;
import defpackage.z7;
import defpackage.zhg;
import defpackage.zp8;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int M1 = m5d.Widget_Design_TextInputLayout;
    public static final int[][] N1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public k4g A0;
    public int A1;
    public AppCompatTextView B0;
    public int B1;
    public int C0;
    public int C1;
    public int D0;
    public int D1;
    public CharSequence E0;
    public boolean E1;
    public boolean F0;
    public final ne3 F1;
    public AppCompatTextView G0;
    public boolean G1;
    public ColorStateList H0;
    public boolean H1;
    public int I0;
    public ValueAnimator I1;
    public sp5 J0;
    public boolean J1;
    public sp5 K0;
    public boolean K1;
    public ColorStateList L0;
    public boolean L1;
    public ColorStateList M0;
    public ColorStateList N0;
    public ColorStateList O0;
    public boolean P0;
    public CharSequence Q0;
    public boolean R0;
    public wq8 S0;
    public wq8 T0;
    public StateListDrawable U0;
    public boolean V0;
    public wq8 W0;
    public wq8 X0;
    public xse Y0;
    public boolean Z0;
    public final FrameLayout a;
    public final int a1;
    public final oaf b;
    public int b1;
    public final lf5 c;
    public int c1;
    public EditText d;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public final Rect i1;
    public final Rect j1;
    public final RectF k1;
    public Typeface l1;
    public ColorDrawable m1;
    public int n1;
    public CharSequence o;
    public final LinkedHashSet o1;
    public ColorDrawable p1;
    public int q1;
    public Drawable r1;
    public int s0;
    public ColorStateList s1;
    public int t0;
    public ColorStateList t1;
    public int u0;
    public int u1;
    public int v0;
    public int v1;
    public final xj7 w0;
    public int w1;
    public boolean x0;
    public ColorStateList x1;
    public int y0;
    public int y1;
    public boolean z0;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = dvc.textInputStyle;
        int i2 = M1;
        super(er8.a(context, attributeSet, i, i2), attributeSet, i);
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = new xj7(this);
        this.A0 = new vef(24);
        this.i1 = new Rect();
        this.j1 = new Rect();
        this.k1 = new RectF();
        this.o1 = new LinkedHashSet();
        ne3 ne3Var = new ne3(this);
        this.F1 = ne3Var;
        this.L1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = rg.a;
        ne3Var.W = linearInterpolator;
        ne3Var.i(false);
        ne3Var.V = linearInterpolator;
        ne3Var.i(false);
        ne3Var.l(8388659);
        int[] iArr = z5d.TextInputLayout;
        int[] iArr2 = {z5d.TextInputLayout_counterTextAppearance, z5d.TextInputLayout_counterOverflowTextAppearance, z5d.TextInputLayout_errorTextAppearance, z5d.TextInputLayout_helperTextTextAppearance, z5d.TextInputLayout_hintTextAppearance};
        d7g.a(context2, attributeSet, i, i2);
        d7g.b(context2, attributeSet, iArr, i, i2, iArr2);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        jdc jdcVar = new jdc(context2, typedArrayObtainStyledAttributes);
        oaf oafVar = new oaf(this, jdcVar);
        this.b = oafVar;
        this.P0 = typedArrayObtainStyledAttributes.getBoolean(z5d.TextInputLayout_hintEnabled, true);
        setHint(typedArrayObtainStyledAttributes.getText(z5d.TextInputLayout_android_hint));
        this.H1 = typedArrayObtainStyledAttributes.getBoolean(z5d.TextInputLayout_hintAnimationEnabled, true);
        this.G1 = typedArrayObtainStyledAttributes.getBoolean(z5d.TextInputLayout_expandedHintEnabled, true);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_android_minEms)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(z5d.TextInputLayout_android_minEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.TextInputLayout_android_minWidth, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(z5d.TextInputLayout_android_maxEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.TextInputLayout_android_maxWidth, -1));
        }
        this.Y0 = xse.b(context2, attributeSet, i, i2).g();
        this.a1 = context2.getResources().getDimensionPixelOffset(dwc.mtrl_textinput_box_label_cutout_padding);
        this.c1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(z5d.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.e1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(dwc.mtrl_textinput_box_stroke_width_default));
        this.f1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(dwc.mtrl_textinput_box_stroke_width_focused));
        this.d1 = this.e1;
        float dimension = typedArrayObtainStyledAttributes.getDimension(z5d.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(z5d.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(z5d.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(z5d.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        s5i s5iVarE = this.Y0.e();
        if (dimension >= 0.0f) {
            s5iVarE.e = new g0(dimension);
        }
        if (dimension2 >= 0.0f) {
            s5iVarE.f = new g0(dimension2);
        }
        if (dimension3 >= 0.0f) {
            s5iVarE.g = new g0(dimension3);
        }
        if (dimension4 >= 0.0f) {
            s5iVarE.h = new g0(dimension4);
        }
        this.Y0 = s5iVarE.g();
        ColorStateList colorStateListB = gti.b(context2, jdcVar, z5d.TextInputLayout_boxBackgroundColor);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.y1 = defaultColor;
            this.h1 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.z1 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.A1 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.B1 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.A1 = this.y1;
                ColorStateList colorStateListC = z7.c(context2, ovc.mtrl_filled_background_color);
                this.z1 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                this.B1 = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.h1 = 0;
            this.y1 = 0;
            this.z1 = 0;
            this.A1 = 0;
            this.B1 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListS = jdcVar.s(z5d.TextInputLayout_android_textColorHint);
            this.t1 = colorStateListS;
            this.s1 = colorStateListS;
        }
        ColorStateList colorStateListB2 = gti.b(context2, jdcVar, z5d.TextInputLayout_boxStrokeColor);
        this.w1 = typedArrayObtainStyledAttributes.getColor(z5d.TextInputLayout_boxStrokeColor, 0);
        this.u1 = s34.a(context2, ovc.mtrl_textinput_default_box_stroke_color);
        this.C1 = s34.a(context2, ovc.mtrl_textinput_disabled_color);
        this.v1 = s34.a(context2, ovc.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(gti.b(context2, jdcVar, z5d.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(z5d.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(z5d.TextInputLayout_hintTextAppearance, 0));
        }
        this.N0 = jdcVar.s(z5d.TextInputLayout_cursorColor);
        this.O0 = jdcVar.s(z5d.TextInputLayout_cursorErrorColor);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(z5d.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(z5d.TextInputLayout_errorContentDescription);
        int i3 = typedArrayObtainStyledAttributes.getInt(z5d.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(z5d.TextInputLayout_errorEnabled, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(z5d.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(z5d.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(z5d.TextInputLayout_helperText);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(z5d.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(z5d.TextInputLayout_placeholderText);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(z5d.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(z5d.TextInputLayout_counterMaxLength, -1));
        this.D0 = typedArrayObtainStyledAttributes.getResourceId(z5d.TextInputLayout_counterTextAppearance, 0);
        this.C0 = typedArrayObtainStyledAttributes.getResourceId(z5d.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(z5d.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i3);
        setCounterOverflowTextAppearance(this.C0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.D0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_errorTextColor)) {
            setErrorTextColor(jdcVar.s(z5d.TextInputLayout_errorTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(jdcVar.s(z5d.TextInputLayout_helperTextTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_hintTextColor)) {
            setHintTextColor(jdcVar.s(z5d.TextInputLayout_hintTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_counterTextColor)) {
            setCounterTextColor(jdcVar.s(z5d.TextInputLayout_counterTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(jdcVar.s(z5d.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(jdcVar.s(z5d.TextInputLayout_placeholderTextColor));
        }
        lf5 lf5Var = new lf5(this, jdcVar);
        this.c = lf5Var;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(z5d.TextInputLayout_android_enabled, true);
        jdcVar.B();
        WeakHashMap weakHashMap = hfh.a;
        setImportantForAccessibility(2);
        yeh.m(this, 1);
        frameLayout.addView(oafVar);
        frameLayout.addView(lf5Var);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || baj.b(editText)) {
            return this.S0;
        }
        int iF = eti.f(this.d, dvc.colorControlHighlight);
        int i = this.b1;
        int[][] iArr = N1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            wq8 wq8Var = this.S0;
            int i2 = this.h1;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{eti.j(iF, 0.1f, i2), i2}), wq8Var, wq8Var);
        }
        Context context = getContext();
        wq8 wq8Var2 = this.S0;
        int iE = eti.e(context, "TextInputLayout", dvc.colorSurface);
        wq8 wq8Var3 = new wq8(wq8Var2.a.a);
        int iJ = eti.j(iF, 0.1f, iE);
        wq8Var3.k(new ColorStateList(iArr, new int[]{iJ, 0}));
        wq8Var3.setTint(iE);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iE});
        wq8 wq8Var4 = new wq8(wq8Var2.a.a);
        wq8Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, wq8Var3, wq8Var4), wq8Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.U0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.U0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.U0.addState(new int[0], f(false));
        }
        return this.U0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.T0 == null) {
            this.T0 = f(true);
        }
        return this.T0;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.d = editText;
        int i = this.s0;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.u0);
        }
        int i2 = this.t0;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.v0);
        }
        this.V0 = false;
        i();
        setTextInputAccessibilityDelegate(new j4g(this));
        Typeface typeface = this.d.getTypeface();
        ne3 ne3Var = this.F1;
        boolean zM = ne3Var.m(typeface);
        boolean zO = ne3Var.o(typeface);
        if (zM || zO) {
            ne3Var.i(false);
        }
        float textSize = this.d.getTextSize();
        if (ne3Var.l != textSize) {
            ne3Var.l = textSize;
            ne3Var.i(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (ne3Var.g0 != letterSpacing) {
            ne3Var.g0 = letterSpacing;
            ne3Var.i(false);
        }
        int gravity = this.d.getGravity();
        ne3Var.l((gravity & (-113)) | 48);
        if (ne3Var.j != gravity) {
            ne3Var.j = gravity;
            ne3Var.i(false);
        }
        WeakHashMap weakHashMap = hfh.a;
        this.D1 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new i4g(this, editText));
        if (this.s1 == null) {
            this.s1 = this.d.getHintTextColors();
        }
        if (this.P0) {
            if (TextUtils.isEmpty(this.Q0)) {
                CharSequence hint = this.d.getHint();
                this.o = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.R0 = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.B0 != null) {
            n(this.d.getText());
        }
        r();
        this.w0.b();
        this.b.bringToFront();
        lf5 lf5Var = this.c;
        lf5Var.bringToFront();
        Iterator it = this.o1.iterator();
        while (it.hasNext()) {
            ((kf5) it.next()).a(this);
        }
        lf5Var.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.Q0)) {
            return;
        }
        this.Q0 = charSequence;
        ne3 ne3Var = this.F1;
        if (charSequence == null || !TextUtils.equals(ne3Var.G, charSequence)) {
            ne3Var.G = charSequence;
            ne3Var.H = null;
            Bitmap bitmap = ne3Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                ne3Var.K = null;
            }
            ne3Var.i(false);
        }
        if (this.E1) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.F0 == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.G0;
            if (appCompatTextView != null) {
                this.a.addView(appCompatTextView);
                this.G0.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.G0;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.G0 = null;
        }
        this.F0 = z;
    }

    public final void a(float f) {
        ne3 ne3Var = this.F1;
        if (ne3Var.b == f) {
            return;
        }
        if (this.I1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.I1 = valueAnimator;
            valueAnimator.setInterpolator(exi.d(getContext(), dvc.motionEasingEmphasizedInterpolator, rg.b));
            this.I1.setDuration(exi.c(dvc.motionDurationMedium4, 167, getContext()));
            this.I1.addUpdateListener(new wk0(7, this));
        }
        this.I1.setFloatValues(ne3Var.b, f);
        this.I1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        wq8 wq8Var = this.S0;
        if (wq8Var == null) {
            return;
        }
        xse xseVar = wq8Var.a.a;
        xse xseVar2 = this.Y0;
        if (xseVar != xseVar2) {
            wq8Var.setShapeAppearanceModel(xseVar2);
        }
        if (this.b1 == 2 && (i = this.d1) > -1 && (i2 = this.g1) != 0) {
            wq8 wq8Var2 = this.S0;
            wq8Var2.a.j = i;
            wq8Var2.invalidateSelf();
            wq8Var2.m(ColorStateList.valueOf(i2));
        }
        int iG = this.h1;
        if (this.b1 == 1) {
            iG = rf3.g(this.h1, eti.d(dvc.colorSurface, 0, getContext()));
        }
        this.h1 = iG;
        this.S0.k(ColorStateList.valueOf(iG));
        wq8 wq8Var3 = this.W0;
        if (wq8Var3 != null && this.X0 != null) {
            if (this.d1 > -1 && this.g1 != 0) {
                wq8Var3.k(this.d.isFocused() ? ColorStateList.valueOf(this.u1) : ColorStateList.valueOf(this.g1));
                this.X0.k(ColorStateList.valueOf(this.g1));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fE;
        if (!this.P0) {
            return 0;
        }
        int i = this.b1;
        ne3 ne3Var = this.F1;
        if (i == 0) {
            fE = ne3Var.e();
        } else {
            if (i != 2) {
                return 0;
            }
            fE = ne3Var.e() / 2.0f;
        }
        return (int) fE;
    }

    public final sp5 d() {
        sp5 sp5Var = new sp5();
        sp5Var.c = exi.c(dvc.motionDurationShort2, 87, getContext());
        sp5Var.d = exi.d(getContext(), dvc.motionEasingLinearInterpolator, rg.a);
        return sp5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.o != null) {
            boolean z = this.R0;
            this.R0 = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.o);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.R0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.K1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.K1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        wq8 wq8Var;
        super.draw(canvas);
        boolean z = this.P0;
        ne3 ne3Var = this.F1;
        if (z) {
            ne3Var.d(canvas);
        }
        if (this.X0 == null || (wq8Var = this.W0) == null) {
            return;
        }
        wq8Var.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.X0.getBounds();
            Rect bounds2 = this.W0.getBounds();
            float f = ne3Var.b;
            int iCenterX = bounds2.centerX();
            bounds.left = rg.c(iCenterX, f, bounds2.left);
            bounds.right = rg.c(iCenterX, f, bounds2.right);
            this.X0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.J1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.J1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            ne3 r3 = r4.F1
            if (r3 == 0) goto L2f
            r3.R = r1
            android.content.res.ColorStateList r1 = r3.o
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.n
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.i(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = defpackage.hfh.a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.J1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.P0 && !TextUtils.isEmpty(this.Q0) && (this.S0 instanceof kc4);
    }

    public final wq8 f(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(dwc.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof zp8 ? ((zp8) editText).getPopupElevation() : getResources().getDimensionPixelOffset(dwc.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(dwc.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        qtd qtdVar = new qtd();
        qtd qtdVar2 = new qtd();
        qtd qtdVar3 = new qtd();
        qtd qtdVar4 = new qtd();
        int i = 0;
        q85 q85Var = new q85(i);
        q85 q85Var2 = new q85(i);
        q85 q85Var3 = new q85(i);
        q85 q85Var4 = new q85(i);
        g0 g0Var = new g0(f);
        g0 g0Var2 = new g0(f);
        g0 g0Var3 = new g0(dimensionPixelOffset);
        g0 g0Var4 = new g0(dimensionPixelOffset);
        xse xseVar = new xse();
        xseVar.a = qtdVar;
        xseVar.b = qtdVar2;
        xseVar.c = qtdVar3;
        xseVar.d = qtdVar4;
        xseVar.e = g0Var;
        xseVar.f = g0Var2;
        xseVar.g = g0Var4;
        xseVar.h = g0Var3;
        xseVar.i = q85Var;
        xseVar.j = q85Var2;
        xseVar.k = q85Var3;
        xseVar.l = q85Var4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof zp8 ? ((zp8) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = wq8.H0;
            dropDownBackgroundTintList = ColorStateList.valueOf(eti.e(context, wq8.class.getSimpleName(), dvc.colorSurface));
        }
        wq8 wq8Var = new wq8();
        wq8Var.i(context);
        wq8Var.k(dropDownBackgroundTintList);
        wq8Var.j(popupElevation);
        wq8Var.setShapeAppearanceModel(xseVar);
        vq8 vq8Var = wq8Var.a;
        if (vq8Var.g == null) {
            vq8Var.g = new Rect();
        }
        wq8Var.a.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        wq8Var.invalidateSelf();
        return wq8Var;
    }

    public final int g(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.c.c() : this.b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public wq8 getBoxBackground() {
        int i = this.b1;
        if (i == 1 || i == 2) {
            return this.S0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.h1;
    }

    public int getBoxBackgroundMode() {
        return this.b1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.c1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zE = yqi.e(this);
        RectF rectF = this.k1;
        return zE ? this.Y0.h.a(rectF) : this.Y0.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zE = yqi.e(this);
        RectF rectF = this.k1;
        return zE ? this.Y0.g.a(rectF) : this.Y0.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zE = yqi.e(this);
        RectF rectF = this.k1;
        return zE ? this.Y0.e.a(rectF) : this.Y0.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zE = yqi.e(this);
        RectF rectF = this.k1;
        return zE ? this.Y0.f.a(rectF) : this.Y0.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.w1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.x1;
    }

    public int getBoxStrokeWidth() {
        return this.e1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1;
    }

    public int getCounterMaxLength() {
        return this.y0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.x0 && this.z0 && (appCompatTextView = this.B0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.M0;
    }

    public ColorStateList getCounterTextColor() {
        return this.L0;
    }

    public ColorStateList getCursorColor() {
        return this.N0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.O0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.s1;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.t0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.t0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.z0;
    }

    public int getEndIconMode() {
        return this.c.v0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.A0;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.t0;
    }

    public CharSequence getError() {
        xj7 xj7Var = this.w0;
        if (xj7Var.q) {
            return xj7Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.w0.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.w0.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.w0.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        xj7 xj7Var = this.w0;
        if (xj7Var.x) {
            return xj7Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.w0.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.P0) {
            return this.Q0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.F1.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        ne3 ne3Var = this.F1;
        return ne3Var.f(ne3Var.o);
    }

    public ColorStateList getHintTextColor() {
        return this.t1;
    }

    public k4g getLengthCounter() {
        return this.A0;
    }

    public int getMaxEms() {
        return this.t0;
    }

    public int getMaxWidth() {
        return this.v0;
    }

    public int getMinEms() {
        return this.s0;
    }

    public int getMinWidth() {
        return this.u0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.t0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.t0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.F0) {
            return this.E0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.I0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.H0;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public xse getShapeAppearanceModel() {
        return this.Y0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.t0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.u0;
    }

    public CharSequence getSuffixText() {
        return this.c.C0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.D0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.D0;
    }

    public Typeface getTypeface() {
        return this.l1;
    }

    public final int h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.b.a() : this.c.c());
    }

    public final void i() throws Resources.NotFoundException {
        int i = this.b1;
        if (i == 0) {
            this.S0 = null;
            this.W0 = null;
            this.X0 = null;
        } else if (i == 1) {
            this.S0 = new wq8(this.Y0);
            this.W0 = new wq8();
            this.X0 = new wq8();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(ho7.j(new StringBuilder(), this.b1, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.P0 || (this.S0 instanceof kc4)) {
                this.S0 = new wq8(this.Y0);
            } else {
                xse xseVar = this.Y0;
                int i2 = kc4.J0;
                if (xseVar == null) {
                    xseVar = new xse();
                }
                jc4 jc4Var = new jc4(xseVar, new RectF());
                kc4 kc4Var = new kc4(jc4Var);
                kc4Var.I0 = jc4Var;
                this.S0 = kc4Var;
            }
            this.W0 = null;
            this.X0 = null;
        }
        s();
        x();
        if (this.b1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.c1 = getResources().getDimensionPixelSize(dwc.material_font_2_0_box_collapsed_padding_top);
            } else if (gti.h(getContext())) {
                this.c1 = getResources().getDimensionPixelSize(dwc.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.b1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = hfh.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(dwc.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(dwc.material_filled_edittext_font_2_0_padding_bottom));
            } else if (gti.h(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = hfh.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(dwc.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(dwc.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.b1 != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.b1;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(m5d.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(s34.a(getContext(), ovc.design_error));
    }

    public final boolean m() {
        xj7 xj7Var = this.w0;
        return (xj7Var.o != 1 || xj7Var.r == null || TextUtils.isEmpty(xj7Var.p)) ? false : true;
    }

    public final void n(Editable editable) throws Resources.NotFoundException {
        ((vef) this.A0).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.z0;
        int i = this.y0;
        if (i == -1) {
            this.B0.setText(String.valueOf(length));
            this.B0.setContentDescription(null);
            this.z0 = false;
        } else {
            this.z0 = length > i;
            Context context = getContext();
            this.B0.setContentDescription(context.getString(this.z0 ? s2d.character_counter_overflowed_content_description : s2d.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.y0)));
            if (z != this.z0) {
                o();
            }
            tm0 tm0VarC = tm0.c();
            AppCompatTextView appCompatTextView = this.B0;
            String string = getContext().getString(s2d.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.y0));
            tm0VarC.getClass();
            w3g w3gVar = y3g.a;
            appCompatTextView.setText(string != null ? tm0VarC.d(string).toString() : null);
        }
        if (this.d == null || z == this.z0) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.B0;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.z0 ? this.C0 : this.D0);
            if (!this.z0 && (colorStateList2 = this.L0) != null) {
                this.B0.setTextColor(colorStateList2);
            }
            if (!this.z0 || (colorStateList = this.M0) == null) {
                return;
            }
            this.B0.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.F1.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        lf5 lf5Var = this.c;
        lf5Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.L1 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (iMax = Math.max(lf5Var.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(iMax);
            z = true;
        }
        boolean zQ = q();
        if (z || zQ) {
            this.d.post(new bee(21, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = cu4.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.i1;
            rect.set(0, 0, width, height);
            cu4.b(this, editText, rect);
            wq8 wq8Var = this.W0;
            if (wq8Var != null) {
                int i5 = rect.bottom;
                wq8Var.setBounds(rect.left, i5 - this.e1, rect.right, i5);
            }
            wq8 wq8Var2 = this.X0;
            if (wq8Var2 != null) {
                int i6 = rect.bottom;
                wq8Var2.setBounds(rect.left, i6 - this.f1, rect.right, i6);
            }
            if (this.P0) {
                float textSize = this.d.getTextSize();
                ne3 ne3Var = this.F1;
                if (ne3Var.l != textSize) {
                    ne3Var.l = textSize;
                    ne3Var.i(false);
                }
                int gravity = this.d.getGravity();
                ne3Var.l((gravity & (-113)) | 48);
                if (ne3Var.j != gravity) {
                    ne3Var.j = gravity;
                    ne3Var.i(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean zE = yqi.e(this);
                int i7 = rect.bottom;
                Rect rect2 = this.j1;
                rect2.bottom = i7;
                int i8 = this.b1;
                if (i8 == 1) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = rect.top + this.c1;
                    rect2.right = h(rect.right, zE);
                } else if (i8 != 2) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zE);
                } else {
                    rect2.left = this.d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.d.getPaddingRight();
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.right;
                int i12 = rect2.bottom;
                Rect rect3 = ne3Var.h;
                if (rect3.left != i9 || rect3.top != i10 || rect3.right != i11 || rect3.bottom != i12) {
                    rect3.set(i9, i10, i11, i12);
                    ne3Var.S = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = ne3Var.U;
                textPaint.setTextSize(ne3Var.l);
                textPaint.setTypeface(ne3Var.z);
                textPaint.setLetterSpacing(ne3Var.g0);
                float f = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.b1 != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.b1 != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                Rect rect4 = ne3Var.g;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    ne3Var.S = true;
                }
                ne3Var.i(false);
                if (!e() || this.E1) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.L1;
        lf5 lf5Var = this.c;
        if (!z) {
            lf5Var.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.L1 = true;
        }
        if (this.G0 != null && (editText = this.d) != null) {
            this.G0.setGravity(editText.getGravity());
            this.G0.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        lf5Var.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof l4g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l4g l4gVar = (l4g) parcelable;
        super.onRestoreInstanceState(l4gVar.a);
        setError(l4gVar.c);
        if (l4gVar.d) {
            post(new r98(27, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.Z0) {
            t74 t74Var = this.Y0.e;
            RectF rectF = this.k1;
            float fA = t74Var.a(rectF);
            float fA2 = this.Y0.f.a(rectF);
            float fA3 = this.Y0.h.a(rectF);
            float fA4 = this.Y0.g.a(rectF);
            xse xseVar = this.Y0;
            l6j l6jVar = xseVar.a;
            l6j l6jVar2 = xseVar.b;
            l6j l6jVar3 = xseVar.d;
            l6j l6jVar4 = xseVar.c;
            q85 q85Var = new q85(0);
            q85 q85Var2 = new q85(0);
            q85 q85Var3 = new q85(0);
            q85 q85Var4 = new q85(0);
            s5i.h(l6jVar2);
            s5i.h(l6jVar);
            s5i.h(l6jVar4);
            s5i.h(l6jVar3);
            g0 g0Var = new g0(fA2);
            g0 g0Var2 = new g0(fA);
            g0 g0Var3 = new g0(fA4);
            g0 g0Var4 = new g0(fA3);
            xse xseVar2 = new xse();
            xseVar2.a = l6jVar2;
            xseVar2.b = l6jVar;
            xseVar2.c = l6jVar3;
            xseVar2.d = l6jVar4;
            xseVar2.e = g0Var;
            xseVar2.f = g0Var2;
            xseVar2.g = g0Var4;
            xseVar2.h = g0Var3;
            xseVar2.i = q85Var;
            xseVar2.j = q85Var2;
            xseVar2.k = q85Var3;
            xseVar2.l = q85Var4;
            this.Z0 = z;
            setShapeAppearanceModel(xseVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l4g l4gVar = new l4g(super.onSaveInstanceState());
        if (m()) {
            l4gVar.c = getError();
        }
        lf5 lf5Var = this.c;
        l4gVar.d = lf5Var.v0 != 0 && lf5Var.t0.d;
        return l4gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.N0
            if (r0 == 0) goto L5
            goto L25
        L5:
            android.content.Context r0 = r4.getContext()
            int r1 = defpackage.dvc.colorControlActivated
            android.util.TypedValue r1 = defpackage.wsi.e(r0, r1)
            r2 = 0
            if (r1 != 0) goto L14
        L12:
            r0 = r2
            goto L25
        L14:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1d
            android.content.res.ColorStateList r0 = defpackage.z7.c(r0, r3)
            goto L25
        L1d:
            int r0 = r1.data
            if (r0 == 0) goto L12
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L25:
            android.widget.EditText r1 = r4.d
            if (r1 == 0) goto L50
            android.graphics.drawable.Drawable r1 = defpackage.hld.g(r1)
            if (r1 != 0) goto L30
            goto L50
        L30:
            android.widget.EditText r1 = r4.d
            android.graphics.drawable.Drawable r1 = defpackage.hld.g(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m()
            if (r2 != 0) goto L48
            androidx.appcompat.widget.AppCompatTextView r2 = r4.B0
            if (r2 == 0) goto L4d
            boolean r2 = r4.z0
            if (r2 == 0) goto L4d
        L48:
            android.content.res.ColorStateList r2 = r4.O0
            if (r2 == 0) goto L4d
            r0 = r2
        L4d:
            defpackage.t35.h(r1, r0)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.d;
        if (editText == null || this.b1 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = d45.a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(ko.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.z0 && (appCompatTextView = this.B0) != null) {
            drawableMutate.setColorFilter(ko.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.d;
        if (editText == null || this.S0 == null) {
            return;
        }
        if ((this.V0 || editText.getBackground() == null) && this.b1 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = hfh.a;
            editText2.setBackground(editTextBoxBackground);
            this.V0 = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.h1 != i) {
            this.h1 = i;
            this.y1 = i;
            this.A1 = i;
            this.B1 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(s34.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.y1 = defaultColor;
        this.h1 = defaultColor;
        this.z1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.A1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.B1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.b1) {
            return;
        }
        this.b1 = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.c1 = i;
    }

    public void setBoxCornerFamily(int i) {
        s5i s5iVarE = this.Y0.e();
        t74 t74Var = this.Y0.e;
        l6j l6jVarB = iti.b(i);
        s5iVarE.a = l6jVarB;
        s5i.h(l6jVarB);
        s5iVarE.e = t74Var;
        t74 t74Var2 = this.Y0.f;
        l6j l6jVarB2 = iti.b(i);
        s5iVarE.b = l6jVarB2;
        s5i.h(l6jVarB2);
        s5iVarE.f = t74Var2;
        t74 t74Var3 = this.Y0.h;
        l6j l6jVarB3 = iti.b(i);
        s5iVarE.d = l6jVarB3;
        s5i.h(l6jVarB3);
        s5iVarE.h = t74Var3;
        t74 t74Var4 = this.Y0.g;
        l6j l6jVarB4 = iti.b(i);
        s5iVarE.c = l6jVarB4;
        s5i.h(l6jVarB4);
        s5iVarE.g = t74Var4;
        this.Y0 = s5iVarE.g();
        b();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.w1 != i) {
            this.w1 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.u1 = colorStateList.getDefaultColor();
            this.C1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.v1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.w1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.w1 != colorStateList.getDefaultColor()) {
            this.w1 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.x1 != colorStateList) {
            this.x1 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.e1 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.f1 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) throws Resources.NotFoundException {
        if (this.x0 != z) {
            xj7 xj7Var = this.w0;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.B0 = appCompatTextView;
                appCompatTextView.setId(uxc.textinput_counter);
                Typeface typeface = this.l1;
                if (typeface != null) {
                    this.B0.setTypeface(typeface);
                }
                this.B0.setMaxLines(1);
                xj7Var.a(this.B0, 2);
                ((ViewGroup.MarginLayoutParams) this.B0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(dwc.mtrl_textinput_counter_margin_start));
                o();
                if (this.B0 != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                xj7Var.g(this.B0, 2);
                this.B0 = null;
            }
            this.x0 = z;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.y0 != i) {
            if (i > 0) {
                this.y0 = i;
            } else {
                this.y0 = -1;
            }
            if (!this.x0 || this.B0 == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.C0 != i) {
            this.C0 = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.D0 != i) {
            this.D0 = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.O0 != colorStateList) {
            this.O0 = colorStateList;
            if (m() || (this.B0 != null && this.z0)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.s1 = colorStateList;
        this.t1 = colorStateList;
        if (this.d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.t0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.t0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        lf5 lf5Var = this.c;
        CharSequence text = i != 0 ? lf5Var.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = lf5Var.t0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        lf5 lf5Var = this.c;
        Drawable drawableA = i != 0 ? eri.a(lf5Var.getContext(), i) : null;
        TextInputLayout textInputLayout = lf5Var.a;
        CheckableImageButton checkableImageButton = lf5Var.t0;
        checkableImageButton.setImageDrawable(drawableA);
        if (drawableA != null) {
            hfi.a(textInputLayout, checkableImageButton, lf5Var.x0, lf5Var.y0);
            hfi.m(textInputLayout, checkableImageButton, lf5Var.x0);
        }
    }

    public void setEndIconMinSize(int i) {
        lf5 lf5Var = this.c;
        if (i < 0) {
            lf5Var.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != lf5Var.z0) {
            lf5Var.z0 = i;
            CheckableImageButton checkableImageButton = lf5Var.t0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = lf5Var.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        lf5 lf5Var = this.c;
        CheckableImageButton checkableImageButton = lf5Var.t0;
        View.OnLongClickListener onLongClickListener = lf5Var.B0;
        checkableImageButton.setOnClickListener(onClickListener);
        hfi.o(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        lf5 lf5Var = this.c;
        lf5Var.B0 = onLongClickListener;
        CheckableImageButton checkableImageButton = lf5Var.t0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        hfi.o(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        lf5 lf5Var = this.c;
        lf5Var.A0 = scaleType;
        lf5Var.t0.setScaleType(scaleType);
        lf5Var.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        lf5 lf5Var = this.c;
        if (lf5Var.x0 != colorStateList) {
            lf5Var.x0 = colorStateList;
            hfi.a(lf5Var.a, lf5Var.t0, colorStateList, lf5Var.y0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        lf5 lf5Var = this.c;
        if (lf5Var.y0 != mode) {
            lf5Var.y0 = mode;
            hfi.a(lf5Var.a, lf5Var.t0, lf5Var.x0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        xj7 xj7Var = this.w0;
        if (!xj7Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            xj7Var.f();
            return;
        }
        xj7Var.c();
        xj7Var.p = charSequence;
        xj7Var.r.setText(charSequence);
        int i = xj7Var.n;
        if (i != 1) {
            xj7Var.o = 1;
        }
        xj7Var.i(i, xj7Var.o, xj7Var.h(xj7Var.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        xj7 xj7Var = this.w0;
        xj7Var.t = i;
        AppCompatTextView appCompatTextView = xj7Var.r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = hfh.a;
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        xj7 xj7Var = this.w0;
        xj7Var.s = charSequence;
        AppCompatTextView appCompatTextView = xj7Var.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) throws Resources.NotFoundException {
        xj7 xj7Var = this.w0;
        TextInputLayout textInputLayout = xj7Var.h;
        if (xj7Var.q == z) {
            return;
        }
        xj7Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(xj7Var.g, null);
            xj7Var.r = appCompatTextView;
            appCompatTextView.setId(uxc.textinput_error);
            xj7Var.r.setTextAlignment(5);
            Typeface typeface = xj7Var.B;
            if (typeface != null) {
                xj7Var.r.setTypeface(typeface);
            }
            int i = xj7Var.u;
            xj7Var.u = i;
            AppCompatTextView appCompatTextView2 = xj7Var.r;
            if (appCompatTextView2 != null) {
                xj7Var.h.l(appCompatTextView2, i);
            }
            ColorStateList colorStateList = xj7Var.v;
            xj7Var.v = colorStateList;
            AppCompatTextView appCompatTextView3 = xj7Var.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = xj7Var.s;
            xj7Var.s = charSequence;
            AppCompatTextView appCompatTextView4 = xj7Var.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = xj7Var.t;
            xj7Var.t = i2;
            AppCompatTextView appCompatTextView5 = xj7Var.r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = hfh.a;
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            xj7Var.r.setVisibility(4);
            xj7Var.a(xj7Var.r, 0);
        } else {
            xj7Var.f();
            xj7Var.g(xj7Var.r, 0);
            xj7Var.r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        xj7Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        lf5 lf5Var = this.c;
        lf5Var.i(i != 0 ? eri.a(lf5Var.getContext(), i) : null);
        hfi.m(lf5Var.a, lf5Var.c, lf5Var.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        lf5 lf5Var = this.c;
        CheckableImageButton checkableImageButton = lf5Var.c;
        View.OnLongClickListener onLongClickListener = lf5Var.s0;
        checkableImageButton.setOnClickListener(onClickListener);
        hfi.o(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        lf5 lf5Var = this.c;
        lf5Var.s0 = onLongClickListener;
        CheckableImageButton checkableImageButton = lf5Var.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        hfi.o(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        lf5 lf5Var = this.c;
        if (lf5Var.d != colorStateList) {
            lf5Var.d = colorStateList;
            hfi.a(lf5Var.a, lf5Var.c, colorStateList, lf5Var.o);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        lf5 lf5Var = this.c;
        if (lf5Var.o != mode) {
            lf5Var.o = mode;
            hfi.a(lf5Var.a, lf5Var.c, lf5Var.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        xj7 xj7Var = this.w0;
        xj7Var.u = i;
        AppCompatTextView appCompatTextView = xj7Var.r;
        if (appCompatTextView != null) {
            xj7Var.h.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        xj7 xj7Var = this.w0;
        xj7Var.v = colorStateList;
        AppCompatTextView appCompatTextView = xj7Var.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.G1 != z) {
            this.G1 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        xj7 xj7Var = this.w0;
        if (zIsEmpty) {
            if (xj7Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!xj7Var.x) {
            setHelperTextEnabled(true);
        }
        xj7Var.c();
        xj7Var.w = charSequence;
        xj7Var.y.setText(charSequence);
        int i = xj7Var.n;
        if (i != 2) {
            xj7Var.o = 2;
        }
        xj7Var.i(i, xj7Var.o, xj7Var.h(xj7Var.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        xj7 xj7Var = this.w0;
        xj7Var.A = colorStateList;
        AppCompatTextView appCompatTextView = xj7Var.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) throws Resources.NotFoundException {
        xj7 xj7Var = this.w0;
        TextInputLayout textInputLayout = xj7Var.h;
        if (xj7Var.x == z) {
            return;
        }
        xj7Var.c();
        int i = 0;
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(xj7Var.g, null);
            xj7Var.y = appCompatTextView;
            appCompatTextView.setId(uxc.textinput_helper_text);
            xj7Var.y.setTextAlignment(5);
            Typeface typeface = xj7Var.B;
            if (typeface != null) {
                xj7Var.y.setTypeface(typeface);
            }
            xj7Var.y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = xj7Var.y;
            WeakHashMap weakHashMap = hfh.a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i2 = xj7Var.z;
            xj7Var.z = i2;
            AppCompatTextView appCompatTextView3 = xj7Var.y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i2);
            }
            ColorStateList colorStateList = xj7Var.A;
            xj7Var.A = colorStateList;
            AppCompatTextView appCompatTextView4 = xj7Var.y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            xj7Var.a(xj7Var.y, 1);
            xj7Var.y.setAccessibilityDelegate(new wj7(i, xj7Var));
        } else {
            xj7Var.c();
            int i3 = xj7Var.n;
            if (i3 == 2) {
                xj7Var.o = 0;
            }
            xj7Var.i(i3, xj7Var.o, xj7Var.h(xj7Var.y, ""));
            xj7Var.g(xj7Var.y, 1);
            xj7Var.y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        xj7Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        xj7 xj7Var = this.w0;
        xj7Var.z = i;
        AppCompatTextView appCompatTextView = xj7Var.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.P0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.H1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.P0) {
            this.P0 = z;
            if (z) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.Q0)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.R0 = true;
            } else {
                this.R0 = false;
                if (!TextUtils.isEmpty(this.Q0) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.Q0);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        ne3 ne3Var = this.F1;
        ne3Var.k(i);
        this.t1 = ne3Var.o;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.t1 != colorStateList) {
            if (this.s1 == null) {
                ne3 ne3Var = this.F1;
                if (ne3Var.o != colorStateList) {
                    ne3Var.o = colorStateList;
                    ne3Var.i(false);
                }
            }
            this.t1 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(k4g k4gVar) {
        this.A0 = k4gVar;
    }

    public void setMaxEms(int i) {
        this.t0 = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.v0 = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.s0 = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.u0 = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        lf5 lf5Var = this.c;
        lf5Var.t0.setContentDescription(i != 0 ? lf5Var.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        lf5 lf5Var = this.c;
        lf5Var.t0.setImageDrawable(i != 0 ? eri.a(lf5Var.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        lf5 lf5Var = this.c;
        if (z && lf5Var.v0 != 1) {
            lf5Var.g(1);
        } else if (z) {
            lf5Var.getClass();
        } else {
            lf5Var.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        lf5 lf5Var = this.c;
        lf5Var.x0 = colorStateList;
        hfi.a(lf5Var.a, lf5Var.t0, colorStateList, lf5Var.y0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        lf5 lf5Var = this.c;
        lf5Var.y0 = mode;
        hfi.a(lf5Var.a, lf5Var.t0, lf5Var.x0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.G0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.G0 = appCompatTextView;
            appCompatTextView.setId(uxc.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.G0;
            WeakHashMap weakHashMap = hfh.a;
            appCompatTextView2.setImportantForAccessibility(2);
            sp5 sp5VarD = d();
            this.J0 = sp5VarD;
            sp5VarD.b = 67L;
            this.K0 = d();
            setPlaceholderTextAppearance(this.I0);
            setPlaceholderTextColor(this.H0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.F0) {
                setPlaceholderTextEnabled(true);
            }
            this.E0 = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.I0 = i;
        AppCompatTextView appCompatTextView = this.G0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            AppCompatTextView appCompatTextView = this.G0;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        oaf oafVar = this.b;
        oafVar.getClass();
        oafVar.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oafVar.b.setText(charSequence);
        oafVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(xse xseVar) {
        wq8 wq8Var = this.S0;
        if (wq8Var == null || wq8Var.a.a == xseVar) {
            return;
        }
        this.Y0 = xseVar;
        b();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? eri.a(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        oaf oafVar = this.b;
        if (i < 0) {
            oafVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != oafVar.t0) {
            oafVar.t0 = i;
            CheckableImageButton checkableImageButton = oafVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        oaf oafVar = this.b;
        CheckableImageButton checkableImageButton = oafVar.d;
        View.OnLongClickListener onLongClickListener = oafVar.v0;
        checkableImageButton.setOnClickListener(onClickListener);
        hfi.o(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        oaf oafVar = this.b;
        oafVar.v0 = onLongClickListener;
        CheckableImageButton checkableImageButton = oafVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        hfi.o(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        oaf oafVar = this.b;
        oafVar.u0 = scaleType;
        oafVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        oaf oafVar = this.b;
        if (oafVar.o != colorStateList) {
            oafVar.o = colorStateList;
            hfi.a(oafVar.a, oafVar.d, colorStateList, oafVar.s0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        oaf oafVar = this.b;
        if (oafVar.s0 != mode) {
            oafVar.s0 = mode;
            hfi.a(oafVar.a, oafVar.d, oafVar.o, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        lf5 lf5Var = this.c;
        lf5Var.getClass();
        lf5Var.C0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        lf5Var.D0.setText(charSequence);
        lf5Var.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.D0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.D0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(j4g j4gVar) {
        EditText editText = this.d;
        if (editText != null) {
            hfh.n(editText, j4gVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.l1) {
            this.l1 = typeface;
            ne3 ne3Var = this.F1;
            boolean zM = ne3Var.m(typeface);
            boolean zO = ne3Var.o(typeface);
            if (zM || zO) {
                ne3Var.i(false);
            }
            xj7 xj7Var = this.w0;
            if (typeface != xj7Var.B) {
                xj7Var.B = typeface;
                AppCompatTextView appCompatTextView = xj7Var.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = xj7Var.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.B0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.b1 != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.d;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.s1;
        ne3 ne3Var = this.F1;
        if (colorStateList2 != null) {
            ne3Var.j(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.s1;
            ne3Var.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.C1) : this.C1));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.w0.r;
            ne3Var.j(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.z0 && (appCompatTextView = this.B0) != null) {
            ne3Var.j(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.t1) != null && ne3Var.o != colorStateList) {
            ne3Var.o = colorStateList;
            ne3Var.i(false);
        }
        lf5 lf5Var = this.c;
        oaf oafVar = this.b;
        if (z3 || !this.G1 || (isEnabled() && z4)) {
            if (z2 || this.E1) {
                ValueAnimator valueAnimator = this.I1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.I1.cancel();
                }
                if (z && this.H1) {
                    a(1.0f);
                } else {
                    ne3Var.p(1.0f);
                }
                this.E1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                oafVar.w0 = false;
                oafVar.e();
                lf5Var.E0 = false;
                lf5Var.n();
                return;
            }
            return;
        }
        if (z2 || !this.E1) {
            ValueAnimator valueAnimator2 = this.I1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.I1.cancel();
            }
            if (z && this.H1) {
                a(0.0f);
            } else {
                ne3Var.p(0.0f);
            }
            if (e() && !((kc4) this.S0).I0.r.isEmpty() && e()) {
                ((kc4) this.S0).q(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.E1 = true;
            AppCompatTextView appCompatTextView3 = this.G0;
            if (appCompatTextView3 != null && this.F0) {
                appCompatTextView3.setText((CharSequence) null);
                zhg.a(this.a, this.K0);
                this.G0.setVisibility(4);
            }
            oafVar.w0 = true;
            oafVar.e();
            lf5Var.E0 = true;
            lf5Var.n();
        }
    }

    public final void v(Editable editable) {
        ((vef) this.A0).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.E1) {
            AppCompatTextView appCompatTextView = this.G0;
            if (appCompatTextView == null || !this.F0) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            zhg.a(frameLayout, this.K0);
            this.G0.setVisibility(4);
            return;
        }
        if (this.G0 == null || !this.F0 || TextUtils.isEmpty(this.E0)) {
            return;
        }
        this.G0.setText(this.E0);
        zhg.a(frameLayout, this.J0);
        this.G0.setVisibility(0);
        this.G0.bringToFront();
        announceForAccessibility(this.E0);
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.x1.getDefaultColor();
        int colorForState = this.x1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.x1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.g1 = colorForState2;
        } else if (z2) {
            this.g1 = colorForState;
        } else {
            this.g1 = defaultColor;
        }
    }

    public final void x() throws Resources.NotFoundException {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.S0 == null || this.b1 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.g1 = this.C1;
        } else if (m()) {
            if (this.x1 != null) {
                w(z2, z);
            } else {
                this.g1 = getErrorCurrentTextColors();
            }
        } else if (!this.z0 || (appCompatTextView = this.B0) == null) {
            if (z2) {
                this.g1 = this.w1;
            } else if (z) {
                this.g1 = this.v1;
            } else {
                this.g1 = this.u1;
            }
        } else if (this.x1 != null) {
            w(z2, z);
        } else {
            this.g1 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        lf5 lf5Var = this.c;
        TextInputLayout textInputLayout = lf5Var.a;
        CheckableImageButton checkableImageButton = lf5Var.t0;
        TextInputLayout textInputLayout2 = lf5Var.a;
        lf5Var.l();
        hfi.m(textInputLayout2, lf5Var.c, lf5Var.d);
        hfi.m(textInputLayout2, checkableImageButton, lf5Var.x0);
        if (lf5Var.b() instanceof d65) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                hfi.a(textInputLayout, checkableImageButton, lf5Var.x0, lf5Var.y0);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                t35.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        oaf oafVar = this.b;
        hfi.m(oafVar.a, oafVar.d, oafVar.o);
        if (this.b1 == 2) {
            int i = this.d1;
            if (z2 && isEnabled()) {
                this.d1 = this.f1;
            } else {
                this.d1 = this.e1;
            }
            if (this.d1 != i && e() && !this.E1) {
                if (e()) {
                    ((kc4) this.S0).q(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.b1 == 1) {
            if (!isEnabled()) {
                this.h1 = this.z1;
            } else if (z && !z2) {
                this.h1 = this.B1;
            } else if (z2) {
                this.h1 = this.A1;
            } else {
                this.h1 = this.y1;
            }
        }
        b();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.t0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.t0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.t0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        lf5 lf5Var = this.c;
        TextInputLayout textInputLayout = lf5Var.a;
        CheckableImageButton checkableImageButton = lf5Var.t0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            hfi.a(textInputLayout, checkableImageButton, lf5Var.x0, lf5Var.y0);
            hfi.m(textInputLayout, checkableImageButton, lf5Var.x0);
        }
    }
}
