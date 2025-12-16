package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
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
import androidx.appcompat.widget.D0;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.c;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.F;
import com.google.android.material.internal.O;
import com.google.android.material.textfield.TextInputLayout;
import j.D;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C43852a;

/* compiled from: EndCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
class p extends LinearLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f357483y = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f357484b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final FrameLayout f357485c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final CheckableImageButton f357486d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f357487e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f357488f;

    /* renamed from: g, reason: collision with root package name */
    public View.OnLongClickListener f357489g;

    /* renamed from: h, reason: collision with root package name */
    @N
    public final CheckableImageButton f357490h;

    /* renamed from: i, reason: collision with root package name */
    public final d f357491i;

    /* renamed from: j, reason: collision with root package name */
    public int f357492j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.j> f357493k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f357494l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f357495m;

    /* renamed from: n, reason: collision with root package name */
    public int f357496n;

    /* renamed from: o, reason: collision with root package name */
    @N
    public ImageView.ScaleType f357497o;

    /* renamed from: p, reason: collision with root package name */
    public View.OnLongClickListener f357498p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public CharSequence f357499q;

    /* renamed from: r, reason: collision with root package name */
    @N
    public final AppCompatTextView f357500r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f357501s;

    /* renamed from: t, reason: collision with root package name */
    public EditText f357502t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public final AccessibilityManager f357503u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public c.e f357504v;

    /* renamed from: w, reason: collision with root package name */
    public final TextWatcher f357505w;

    /* renamed from: x, reason: collision with root package name */
    public final TextInputLayout.i f357506x;

    /* compiled from: EndCompoundLayout.java */
    public class a extends F {
        public a() {
        }

        @Override // com.google.android.material.internal.F, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            p.this.b().a();
        }

        @Override // com.google.android.material.internal.F, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            p.this.b().b();
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public class b implements TextInputLayout.i {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public final void a(@N TextInputLayout textInputLayout) {
            p pVar = p.this;
            if (pVar.f357502t == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = pVar.f357502t;
            TextWatcher textWatcher = pVar.f357505w;
            if (editText != null) {
                editText.removeTextChangedListener(textWatcher);
                if (pVar.f357502t.getOnFocusChangeListener() == pVar.b().e()) {
                    pVar.f357502t.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            pVar.f357502t = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(textWatcher);
            }
            pVar.b().m(pVar.f357502t);
            pVar.i(pVar.b());
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            int i12 = p.f357483y;
            p pVar = p.this;
            if (pVar.f357504v == null || (accessibilityManager = pVar.f357503u) == null) {
                return;
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (pVar.isAttachedToWindow()) {
                androidx.core.view.accessibility.c.a(accessibilityManager, pVar.f357504v);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            int i12 = p.f357483y;
            p pVar = p.this;
            c.e eVar = pVar.f357504v;
            if (eVar == null || (accessibilityManager = pVar.f357503u) == null) {
                return;
            }
            androidx.core.view.accessibility.c.b(accessibilityManager, eVar);
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<q> f357510a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public final p f357511b;

        /* renamed from: c, reason: collision with root package name */
        public final int f357512c;

        /* renamed from: d, reason: collision with root package name */
        public final int f357513d;

        public d(p pVar, D0 d02) {
            this.f357511b = pVar;
            int i12 = R.styleable.TextInputLayout_endIconDrawable;
            TypedArray typedArray = d02.f22121b;
            this.f357512c = typedArray.getResourceId(i12, 0);
            this.f357513d = typedArray.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }
    }

    public p(TextInputLayout textInputLayout, D0 d02) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f357492j = 0;
        this.f357493k = new LinkedHashSet<>();
        this.f357505w = new a();
        b bVar = new b();
        this.f357503u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f357484b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f357485c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f357486d = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f357490h = checkableImageButtonA2;
        this.f357491i = new d(this, d02);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f357500r = appCompatTextView;
        int i12 = R.styleable.TextInputLayout_errorIconTint;
        TypedArray typedArray = d02.f22121b;
        if (typedArray.hasValue(i12)) {
            this.f357487e = com.google.android.material.resources.c.a(getContext(), d02, R.styleable.TextInputLayout_errorIconTint);
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_errorIconTintMode)) {
            this.f357488f = O.g(typedArray.getInt(R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_errorIconDrawable)) {
            h(d02.b(R.styleable.TextInputLayout_errorIconDrawable));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(R.styleable.TextInputLayout_endIconTint)) {
                this.f357494l = com.google.android.material.resources.c.a(getContext(), d02, R.styleable.TextInputLayout_endIconTint);
            }
            if (typedArray.hasValue(R.styleable.TextInputLayout_endIconTintMode)) {
                this.f357495m = O.g(typedArray.getInt(R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_endIconMode)) {
            f(typedArray.getInt(R.styleable.TextInputLayout_endIconMode, 0));
            if (typedArray.hasValue(R.styleable.TextInputLayout_endIconContentDescription) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(R.styleable.TextInputLayout_endIconContentDescription))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (typedArray.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTint)) {
                this.f357494l = com.google.android.material.resources.c.a(getContext(), d02, R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (typedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.f357495m = O.g(typedArray.getInt(R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            f(typedArray.getBoolean(R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(R.styleable.TextInputLayout_passwordToggleContentDescription);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f357496n) {
            this.f357496n = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType scaleTypeB = r.b(typedArray.getInt(R.styleable.TextInputLayout_endIconScaleType, -1));
            this.f357497o = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray.hasValue(R.styleable.TextInputLayout_suffixTextColor)) {
            appCompatTextView.setTextColor(d02.a(R.styleable.TextInputLayout_suffixTextColor));
        }
        CharSequence text3 = typedArray.getText(R.styleable.TextInputLayout_suffixText);
        this.f357499q = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        m();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.addOnEditTextAttachedListener(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, @D int i12) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i12);
        if (com.google.android.material.resources.c.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q hVar;
        int i12 = this.f357492j;
        d dVar = this.f357491i;
        SparseArray<q> sparseArray = dVar.f357510a;
        q wVar = sparseArray.get(i12);
        if (wVar == null) {
            p pVar = dVar.f357511b;
            if (i12 == -1) {
                hVar = new h(pVar);
            } else if (i12 == 0) {
                hVar = new v(pVar);
            } else if (i12 == 1) {
                wVar = new w(pVar, dVar.f357513d);
                sparseArray.append(i12, wVar);
            } else if (i12 == 2) {
                hVar = new g(pVar);
            } else {
                if (i12 != 3) {
                    throw new IllegalArgumentException(AK.c.g(i12, "Invalid end icon mode: "));
                }
                hVar = new n(pVar);
            }
            wVar = hVar;
            sparseArray.append(i12, wVar);
        }
        return wVar;
    }

    public final boolean c() {
        return this.f357485c.getVisibility() == 0 && this.f357490h.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f357486d.getVisibility() == 0;
    }

    public final void e(boolean z12) {
        boolean z13;
        boolean zIsActivated;
        boolean z14;
        q qVarB = b();
        boolean zK2 = qVarB.k();
        CheckableImageButton checkableImageButton = this.f357490h;
        boolean z15 = true;
        if (!zK2 || (z14 = checkableImageButton.f356716b) == qVarB.l()) {
            z13 = false;
        } else {
            checkableImageButton.setChecked(!z14);
            z13 = true;
        }
        if (!(qVarB instanceof n) || (zIsActivated = checkableImageButton.isActivated()) == qVarB.j()) {
            z15 = z13;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z12 || z15) {
            r.c(this.f357484b, checkableImageButton, this.f357494l);
        }
    }

    public final void f(int i12) {
        if (this.f357492j == i12) {
            return;
        }
        q qVarB = b();
        c.e eVar = this.f357504v;
        AccessibilityManager accessibilityManager = this.f357503u;
        if (eVar != null && accessibilityManager != null) {
            androidx.core.view.accessibility.c.b(accessibilityManager, eVar);
        }
        this.f357504v = null;
        qVarB.s();
        this.f357492j = i12;
        Iterator<TextInputLayout.j> it = this.f357493k.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        g(i12 != 0);
        q qVarB2 = b();
        int iD2 = this.f357491i.f357512c;
        if (iD2 == 0) {
            iD2 = qVarB2.d();
        }
        Drawable drawableA = iD2 != 0 ? C43852a.a(getContext(), iD2) : null;
        CheckableImageButton checkableImageButton = this.f357490h;
        checkableImageButton.setImageDrawable(drawableA);
        TextInputLayout textInputLayout = this.f357484b;
        if (drawableA != null) {
            r.a(textInputLayout, checkableImageButton, this.f357494l, this.f357495m);
            r.c(textInputLayout, checkableImageButton, this.f357494l);
        }
        int iC2 = qVarB2.c();
        CharSequence text = iC2 != 0 ? getResources().getText(iC2) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(qVarB2.k());
        if (!qVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i12);
        }
        qVarB2.r();
        c.e eVarH = qVarB2.h();
        this.f357504v = eVarH;
        if (eVarH != null && accessibilityManager != null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (isAttachedToWindow()) {
                androidx.core.view.accessibility.c.a(accessibilityManager, this.f357504v);
            }
        }
        View.OnClickListener onClickListenerF = qVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f357498p;
        checkableImageButton.setOnClickListener(onClickListenerF);
        r.d(checkableImageButton, onLongClickListener);
        EditText editText = this.f357502t;
        if (editText != null) {
            qVarB2.m(editText);
            i(qVarB2);
        }
        r.a(textInputLayout, checkableImageButton, this.f357494l, this.f357495m);
        e(true);
    }

    public final void g(boolean z12) {
        if (c() != z12) {
            this.f357490h.setVisibility(z12 ? 0 : 8);
            j();
            l();
            this.f357484b.updateDummyDrawables();
        }
    }

    public final void h(@P Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f357486d;
        checkableImageButton.setImageDrawable(drawable);
        k();
        r.a(this.f357484b, checkableImageButton, this.f357487e, this.f357488f);
    }

    public final void i(q qVar) {
        if (this.f357502t == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f357502t.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f357490h.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void j() {
        this.f357485c.setVisibility((this.f357490h.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || !((this.f357499q == null || this.f357501s) ? 8 : false)) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.f357486d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f357484b;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.isErrorEnabled() && textInputLayout.shouldShowError()) ? 0 : 8);
        j();
        l();
        if (this.f357492j != 0) {
            return;
        }
        textInputLayout.updateDummyDrawables();
    }

    public final void l() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f357484b;
        if (textInputLayout.editText == null) {
            return;
        }
        if (c() || d()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.editText;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.editText.getPaddingTop();
        int paddingBottom = textInputLayout.editText.getPaddingBottom();
        WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
        this.f357500r.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void m() {
        AppCompatTextView appCompatTextView = this.f357500r;
        int visibility = appCompatTextView.getVisibility();
        int i12 = (this.f357499q == null || this.f357501s) ? 8 : 0;
        if (visibility != i12) {
            b().p(i12 == 0);
        }
        j();
        appCompatTextView.setVisibility(i12);
        this.f357484b.updateDummyDrawables();
    }
}
