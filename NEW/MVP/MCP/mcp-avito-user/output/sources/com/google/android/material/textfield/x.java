package com.google.android.material.textfield;

import android.annotation.SuppressLint;
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
import androidx.appcompat.widget.D0;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.O;
import j.N;
import j.P;
import java.util.WeakHashMap;

/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
class x extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f357559b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f357560c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public CharSequence f357561d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f357562e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f357563f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f357564g;

    /* renamed from: h, reason: collision with root package name */
    public int f357565h;

    /* renamed from: i, reason: collision with root package name */
    @N
    public ImageView.ScaleType f357566i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnLongClickListener f357567j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f357568k;

    public x(TextInputLayout textInputLayout, D0 d02) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f357559b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f357562e = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f357560c = appCompatTextView;
        if (com.google.android.material.resources.c.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f357567j;
        checkableImageButton.setOnClickListener(null);
        r.d(checkableImageButton, onLongClickListener);
        this.f357567j = null;
        checkableImageButton.setOnLongClickListener(null);
        r.d(checkableImageButton, null);
        int i12 = R.styleable.TextInputLayout_startIconTint;
        TypedArray typedArray = d02.f22121b;
        if (typedArray.hasValue(i12)) {
            this.f357563f = com.google.android.material.resources.c.a(getContext(), d02, R.styleable.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_startIconTintMode)) {
            this.f357564g = O.g(typedArray.getInt(R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_startIconDrawable)) {
            a(d02.b(R.styleable.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(R.styleable.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(R.styleable.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f357565h) {
            this.f357565h = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_startIconScaleType)) {
            ImageView.ScaleType scaleTypeB = r.b(typedArray.getInt(R.styleable.TextInputLayout_startIconScaleType, -1));
            this.f357566i = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        if (typedArray.hasValue(R.styleable.TextInputLayout_prefixTextColor)) {
            appCompatTextView.setTextColor(d02.a(R.styleable.TextInputLayout_prefixTextColor));
        }
        CharSequence text2 = typedArray.getText(R.styleable.TextInputLayout_prefixText);
        this.f357561d = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        d();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final void a(@P Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f357562e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f357563f;
            PorterDuff.Mode mode = this.f357564g;
            TextInputLayout textInputLayout = this.f357559b;
            r.a(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            r.c(textInputLayout, checkableImageButton, this.f357563f);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f357567j;
        checkableImageButton.setOnClickListener(null);
        r.d(checkableImageButton, onLongClickListener);
        this.f357567j = null;
        checkableImageButton.setOnLongClickListener(null);
        r.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z12) {
        CheckableImageButton checkableImageButton = this.f357562e;
        if ((checkableImageButton.getVisibility() == 0) != z12) {
            checkableImageButton.setVisibility(z12 ? 0 : 8);
            c();
            d();
        }
    }

    public final void c() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.f357559b.editText;
        if (editText == null) {
            return;
        }
        if (this.f357562e.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
        this.f357560c.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i12 = (this.f357561d == null || this.f357568k) ? 8 : 0;
        setVisibility((this.f357562e.getVisibility() == 0 || i12 == 0) ? 0 : 8);
        this.f357560c.setVisibility(i12);
        this.f357559b.updateDummyDrawables();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) throws Resources.NotFoundException {
        super.onMeasure(i12, i13);
        c();
    }
}
