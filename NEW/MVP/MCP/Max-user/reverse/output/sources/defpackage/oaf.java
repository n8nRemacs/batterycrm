package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class oaf extends LinearLayout {
    public final TextInputLayout a;
    public final AppCompatTextView b;
    public CharSequence c;
    public final CheckableImageButton d;
    public ColorStateList o;
    public PorterDuff.Mode s0;
    public int t0;
    public ImageView.ScaleType u0;
    public View.OnLongClickListener v0;
    public boolean w0;

    public oaf(TextInputLayout textInputLayout, jdc jdcVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(k1d.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.b = appCompatTextView;
        if (gti.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.v0;
        checkableImageButton.setOnClickListener(null);
        hfi.o(checkableImageButton, onLongClickListener);
        this.v0 = null;
        checkableImageButton.setOnLongClickListener(null);
        hfi.o(checkableImageButton, null);
        int i = z5d.TextInputLayout_startIconTint;
        TypedArray typedArray = (TypedArray) jdcVar.c;
        if (typedArray.hasValue(i)) {
            this.o = gti.b(getContext(), jdcVar, z5d.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(z5d.TextInputLayout_startIconTintMode)) {
            this.s0 = yqi.f(typedArray.getInt(z5d.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray.hasValue(z5d.TextInputLayout_startIconDrawable)) {
            b(jdcVar.t(z5d.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(z5d.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(z5d.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(z5d.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(z5d.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(dwc.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.t0) {
            this.t0 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(z5d.TextInputLayout_startIconScaleType)) {
            ImageView.ScaleType scaleTypeC = hfi.c(typedArray.getInt(z5d.TextInputLayout_startIconScaleType, -1));
            this.u0 = scaleTypeC;
            checkableImageButton.setScaleType(scaleTypeC);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(uxc.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = hfh.a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(z5d.TextInputLayout_prefixTextAppearance, 0));
        if (typedArray.hasValue(z5d.TextInputLayout_prefixTextColor)) {
            appCompatTextView.setTextColor(jdcVar.s(z5d.TextInputLayout_prefixTextColor));
        }
        CharSequence text2 = typedArray.getText(z5d.TextInputLayout_prefixText);
        this.c = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = hfh.a;
        return this.b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.o;
            PorterDuff.Mode mode = this.s0;
            TextInputLayout textInputLayout = this.a;
            hfi.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            hfi.m(textInputLayout, checkableImageButton, this.o);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.v0;
        checkableImageButton.setOnClickListener(null);
        hfi.o(checkableImageButton, onLongClickListener);
        this.v0 = null;
        checkableImageButton.setOnLongClickListener(null);
        hfi.o(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.a.d;
        if (editText == null) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = hfh.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(dwc.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = hfh.a;
        this.b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.c == null || this.w0) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.b.setVisibility(i);
        this.a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        d();
    }
}
