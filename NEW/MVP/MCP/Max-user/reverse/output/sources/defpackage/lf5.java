package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class lf5 extends LinearLayout {
    public ImageView.ScaleType A0;
    public View.OnLongClickListener B0;
    public CharSequence C0;
    public final AppCompatTextView D0;
    public boolean E0;
    public EditText F0;
    public final AccessibilityManager G0;
    public wo4 H0;
    public final jf5 I0;
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode o;
    public View.OnLongClickListener s0;
    public final CheckableImageButton t0;
    public final ft0 u0;
    public int v0;
    public final LinkedHashSet w0;
    public ColorStateList x0;
    public PorterDuff.Mode y0;
    public int z0;

    public lf5(TextInputLayout textInputLayout, jdc jdcVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.v0 = 0;
        this.w0 = new LinkedHashSet();
        this.I0 = new jf5(this);
        kf5 kf5Var = new kf5(this);
        this.G0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, uxc.text_input_error_icon);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, uxc.text_input_end_icon);
        this.t0 = checkableImageButtonA2;
        ft0 ft0Var = new ft0();
        ft0Var.c = new SparseArray();
        ft0Var.d = this;
        int i = z5d.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) jdcVar.c;
        ft0Var.a = typedArray.getResourceId(i, 0);
        ft0Var.b = typedArray.getResourceId(z5d.TextInputLayout_passwordToggleDrawable, 0);
        this.u0 = ft0Var;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.D0 = appCompatTextView;
        int i2 = z5d.TextInputLayout_errorIconTint;
        TypedArray typedArray2 = (TypedArray) jdcVar.c;
        if (typedArray2.hasValue(i2)) {
            this.d = gti.b(getContext(), jdcVar, z5d.TextInputLayout_errorIconTint);
        }
        if (typedArray2.hasValue(z5d.TextInputLayout_errorIconTintMode)) {
            this.o = yqi.f(typedArray2.getInt(z5d.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray2.hasValue(z5d.TextInputLayout_errorIconDrawable)) {
            i(jdcVar.t(z5d.TextInputLayout_errorIconDrawable));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(s2d.error_icon_content_description));
        WeakHashMap weakHashMap = hfh.a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(z5d.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(z5d.TextInputLayout_endIconTint)) {
                this.x0 = gti.b(getContext(), jdcVar, z5d.TextInputLayout_endIconTint);
            }
            if (typedArray2.hasValue(z5d.TextInputLayout_endIconTintMode)) {
                this.y0 = yqi.f(typedArray2.getInt(z5d.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray2.hasValue(z5d.TextInputLayout_endIconMode)) {
            g(typedArray2.getInt(z5d.TextInputLayout_endIconMode, 0));
            if (typedArray2.hasValue(z5d.TextInputLayout_endIconContentDescription) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(z5d.TextInputLayout_endIconContentDescription))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(z5d.TextInputLayout_endIconCheckable, true));
        } else if (typedArray2.hasValue(z5d.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(z5d.TextInputLayout_passwordToggleTint)) {
                this.x0 = gti.b(getContext(), jdcVar, z5d.TextInputLayout_passwordToggleTint);
            }
            if (typedArray2.hasValue(z5d.TextInputLayout_passwordToggleTintMode)) {
                this.y0 = yqi.f(typedArray2.getInt(z5d.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            g(typedArray2.getBoolean(z5d.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(z5d.TextInputLayout_passwordToggleContentDescription);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(z5d.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(dwc.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.z0) {
            this.z0 = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(z5d.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType scaleTypeC = hfi.c(typedArray2.getInt(z5d.TextInputLayout_endIconScaleType, -1));
            this.A0 = scaleTypeC;
            checkableImageButtonA2.setScaleType(scaleTypeC);
            checkableImageButtonA.setScaleType(scaleTypeC);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(uxc.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray2.getResourceId(z5d.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray2.hasValue(z5d.TextInputLayout_suffixTextColor)) {
            appCompatTextView.setTextColor(jdcVar.s(z5d.TextInputLayout_suffixTextColor));
        }
        CharSequence text3 = typedArray2.getText(z5d.TextInputLayout_suffixText);
        this.C0 = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.o1.add(kf5Var);
        if (textInputLayout.d != null) {
            kf5Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new rk(5, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(k1d.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (gti.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final mf5 b() {
        mf5 tb4Var;
        int i = this.v0;
        ft0 ft0Var = this.u0;
        SparseArray sparseArray = (SparseArray) ft0Var.c;
        mf5 mf5Var = (mf5) sparseArray.get(i);
        if (mf5Var != null) {
            return mf5Var;
        }
        lf5 lf5Var = (lf5) ft0Var.d;
        if (i == -1) {
            tb4Var = new tb4(lf5Var, 0);
        } else if (i == 0) {
            tb4Var = new tb4(lf5Var, 1);
        } else if (i == 1) {
            tb4Var = new hob(lf5Var, ft0Var.b);
        } else if (i == 2) {
            tb4Var = new za3(lf5Var);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(ho7.f(i, "Invalid end icon mode: "));
            }
            tb4Var = new d65(lf5Var);
        }
        sparseArray.append(i, tb4Var);
        return tb4Var;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.t0;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = hfh.a;
        return this.D0.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.t0.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        mf5 mf5VarB = b();
        boolean zK = mf5VarB.k();
        CheckableImageButton checkableImageButton = this.t0;
        boolean z4 = true;
        if (!zK || (z3 = checkableImageButton.d) == mf5VarB.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(mf5VarB instanceof d65) || (zIsActivated = checkableImageButton.isActivated()) == mf5VarB.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            hfi.m(this.a, checkableImageButton, this.x0);
        }
    }

    public final void g(int i) {
        if (this.v0 == i) {
            return;
        }
        mf5 mf5VarB = b();
        wo4 wo4Var = this.H0;
        AccessibilityManager accessibilityManager = this.G0;
        if (wo4Var != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new a5(wo4Var));
        }
        this.H0 = null;
        mf5VarB.s();
        this.v0 = i;
        Iterator it = this.w0.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
        h(i != 0);
        mf5 mf5VarB2 = b();
        int iD = this.u0.a;
        if (iD == 0) {
            iD = mf5VarB2.d();
        }
        Drawable drawableA = iD != 0 ? eri.a(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.t0;
        checkableImageButton.setImageDrawable(drawableA);
        TextInputLayout textInputLayout = this.a;
        if (drawableA != null) {
            hfi.a(textInputLayout, checkableImageButton, this.x0, this.y0);
            hfi.m(textInputLayout, checkableImageButton, this.x0);
        }
        int iC = mf5VarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(mf5VarB2.k());
        if (!mf5VarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        mf5VarB2.r();
        wo4 wo4VarH = mf5VarB2.h();
        this.H0 = wo4VarH;
        if (wo4VarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = hfh.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new a5(this.H0));
            }
        }
        View.OnClickListener onClickListenerF = mf5VarB2.f();
        View.OnLongClickListener onLongClickListener = this.B0;
        checkableImageButton.setOnClickListener(onClickListenerF);
        hfi.o(checkableImageButton, onLongClickListener);
        EditText editText = this.F0;
        if (editText != null) {
            mf5VarB2.m(editText);
            j(mf5VarB2);
        }
        hfi.a(textInputLayout, checkableImageButton, this.x0, this.y0);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.t0.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        hfi.a(this.a, checkableImageButton, this.d, this.o);
    }

    public final void j(mf5 mf5Var) {
        if (this.F0 == null) {
            return;
        }
        if (mf5Var.e() != null) {
            this.F0.setOnFocusChangeListener(mf5Var.e());
        }
        if (mf5Var.g() != null) {
            this.t0.setOnFocusChangeListener(mf5Var.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.t0.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.C0 == null || this.E0) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.w0.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.v0 != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = hfh.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(dwc.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = hfh.a;
        this.D0.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.D0;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.C0 == null || this.E0) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.a.q();
    }
}
