package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.D0;
import androidx.vectordrawable.graphics.drawable.b;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.google.android.material.R;
import com.google.android.material.color.k;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.X;
import j.e0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.C43852a;
import rY0.C47618a;

/* loaded from: classes6.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f356190B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[][] f356191C;

    /* renamed from: D, reason: collision with root package name */
    @SuppressLint({"DiscouragedApi"})
    public static final int f356192D;

    /* renamed from: f, reason: collision with root package name */
    @N
    public final LinkedHashSet<d> f356194f;

    /* renamed from: g, reason: collision with root package name */
    @N
    public final LinkedHashSet<c> f356195g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public ColorStateList f356196h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f356197i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f356198j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f356199k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public CharSequence f356200l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public Drawable f356201m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public Drawable f356202n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f356203o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public ColorStateList f356204p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public ColorStateList f356205q;

    /* renamed from: r, reason: collision with root package name */
    @N
    public PorterDuff.Mode f356206r;

    /* renamed from: s, reason: collision with root package name */
    public int f356207s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f356208t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f356209u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public CharSequence f356210v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public CompoundButton.OnCheckedChangeListener f356211w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public final androidx.vectordrawable.graphics.drawable.c f356212x;

    /* renamed from: y, reason: collision with root package name */
    public final b.a f356213y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f356193z = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f356189A = {R.attr.state_indeterminate};

    public static class SavedState extends View.BaseSavedState {

        @N
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f356214b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(Parcel parcel, a aVar) {
            super(parcel);
            this.f356214b = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        @N
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i12 = this.f356214b;
            return AK.c.s(sb2, i12 != 1 ? i12 != 2 ? BeduinCartItemModel.UNCHECKED_STRING : "indeterminate" : BeduinCartItemModel.CHECKED_STRING, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeValue(Integer.valueOf(this.f356214b));
        }
    }

    public class a extends b.a {
        public a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public final void b(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.f356204p;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public final void c(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f356204p;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.f356208t, colorStateList.getDefaultColor()));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface b {
    }

    public interface c {
        void a();
    }

    public interface d {
        void a();
    }

    static {
        int i12 = R.attr.state_error;
        f356190B = new int[]{i12};
        f356191C = new int[][]{new int[]{android.R.attr.state_enabled, i12}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f356192D = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @P AttributeSet attributeSet) {
        int i12 = R.attr.checkboxStyle;
        int i13 = f356193z;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.f356194f = new LinkedHashSet<>();
        this.f356195g = new LinkedHashSet<>();
        this.f356212x = androidx.vectordrawable.graphics.drawable.c.a(R.drawable.mtrl_checkbox_button_checked_unchecked, getContext());
        this.f356213y = new a();
        Context context2 = getContext();
        this.f356201m = getButtonDrawable();
        this.f356204p = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = R.styleable.MaterialCheckBox;
        G.a(context2, attributeSet, i12, i13);
        G.b(context2, attributeSet, iArr, i12, i13, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        D0 d02 = new D0(typedArrayObtainStyledAttributes, context2);
        this.f356202n = d02.b(R.styleable.MaterialCheckBox_buttonIcon);
        if (this.f356201m != null && com.google.android.material.resources.b.b(context2, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCheckBox_android_button, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCheckBox_buttonCompat, 0);
            if (resourceId == f356192D && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f356201m = C43852a.a(context2, R.drawable.mtrl_checkbox_button);
                this.f356203o = true;
                if (this.f356202n == null) {
                    this.f356202n = C43852a.a(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f356205q = com.google.android.material.resources.c.a(context2, d02, R.styleable.MaterialCheckBox_buttonIconTint);
        this.f356206r = O.g(typedArrayObtainStyledAttributes.getInt(R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f356197i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.f356198j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f356199k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialCheckBox_errorShown, false);
        this.f356200l = typedArrayObtainStyledAttributes.getText(R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(R.styleable.MaterialCheckBox_checkedState, 0));
        }
        d02.f();
        b();
    }

    @N
    private String getButtonStateDescription() {
        int i12 = this.f356207s;
        return i12 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i12 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f356196h == null) {
            int iD2 = k.d(this, R.attr.colorControlActivated);
            int iD3 = k.d(this, R.attr.colorError);
            int iD4 = k.d(this, R.attr.colorSurface);
            int iD5 = k.d(this, R.attr.colorOnSurface);
            this.f356196h = new ColorStateList(f356191C, new int[]{k.f(1.0f, iD4, iD3), k.f(1.0f, iD4, iD2), k.f(0.54f, iD4, iD5), k.f(0.38f, iD4, iD5), k.f(0.38f, iD4, iD5)});
        }
        return this.f356196h;
    }

    @P
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f356204p;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.f356201m = C47618a.b(this.f356201m, this.f356204p, getButtonTintMode());
        this.f356202n = C47618a.b(this.f356202n, this.f356205q, this.f356206r);
        if (this.f356203o) {
            androidx.vectordrawable.graphics.drawable.c cVar = this.f356212x;
            if (cVar != null) {
                b.a aVar = this.f356213y;
                cVar.c(aVar);
                cVar.b(aVar);
            }
            Drawable drawable = this.f356201m;
            if ((drawable instanceof AnimatedStateListDrawable) && cVar != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(R.id.checked, R.id.unchecked, cVar, false);
                ((AnimatedStateListDrawable) this.f356201m).addTransition(R.id.indeterminate, R.id.unchecked, cVar, false);
            }
        }
        Drawable drawable2 = this.f356201m;
        if (drawable2 != null && (colorStateList2 = this.f356204p) != null) {
            drawable2.setTintList(colorStateList2);
        }
        Drawable drawable3 = this.f356202n;
        if (drawable3 != null && (colorStateList = this.f356205q) != null) {
            drawable3.setTintList(colorStateList);
        }
        super.setButtonDrawable(C47618a.a(this.f356201m, this.f356202n));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    @P
    public Drawable getButtonDrawable() {
        return this.f356201m;
    }

    @P
    public Drawable getButtonIconDrawable() {
        return this.f356202n;
    }

    @P
    public ColorStateList getButtonIconTintList() {
        return this.f356205q;
    }

    @N
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f356206r;
    }

    @Override // android.widget.CompoundButton
    @P
    public ColorStateList getButtonTintList() {
        return this.f356204p;
    }

    public int getCheckedState() {
        return this.f356207s;
    }

    @P
    public CharSequence getErrorAccessibilityLabel() {
        return this.f356200l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f356207s == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f356197i && this.f356204p == null && this.f356205q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f356189A);
        }
        if (this.f356199k) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f356190B);
        }
        this.f356208t = C47618a.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f356198j || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (O.f(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@P AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f356199k) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f356200l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@P Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f356214b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @P
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f356214b = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@InterfaceC42165v int i12) {
        setButtonDrawable(C43852a.a(getContext(), i12));
    }

    public void setButtonIconDrawable(@P Drawable drawable) {
        this.f356202n = drawable;
        b();
    }

    public void setButtonIconDrawableResource(@InterfaceC42165v int i12) {
        setButtonIconDrawable(C43852a.a(getContext(), i12));
    }

    public void setButtonIconTintList(@P ColorStateList colorStateList) {
        if (this.f356205q == colorStateList) {
            return;
        }
        this.f356205q = colorStateList;
        b();
    }

    public void setButtonIconTintMode(@N PorterDuff.Mode mode) {
        if (this.f356206r == mode) {
            return;
        }
        this.f356206r = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@P ColorStateList colorStateList) {
        if (this.f356204p == colorStateList) {
            return;
        }
        this.f356204p = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@P PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z12) {
        this.f356198j = z12;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z12) {
        setCheckedState(z12 ? 1 : 0);
    }

    public void setCheckedState(int i12) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f356207s != i12) {
            this.f356207s = i12;
            super.setChecked(i12 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f356210v == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f356209u) {
                return;
            }
            this.f356209u = true;
            LinkedHashSet<c> linkedHashSet = this.f356195g;
            if (linkedHashSet != null) {
                Iterator<c> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.f356207s != 2 && (onCheckedChangeListener = this.f356211w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f356209u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z12) {
        super.setEnabled(z12);
    }

    public void setErrorAccessibilityLabel(@P CharSequence charSequence) {
        this.f356200l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@e0 int i12) {
        setErrorAccessibilityLabel(i12 != 0 ? getResources().getText(i12) : null);
    }

    public void setErrorShown(boolean z12) {
        if (this.f356199k == z12) {
            return;
        }
        this.f356199k = z12;
        refreshDrawableState();
        Iterator<d> it = this.f356194f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@P CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f356211w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @X
    public void setStateDescription(@P CharSequence charSequence) {
        this.f356210v = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z12) {
        this.f356197i = z12;
        if (z12) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@P Drawable drawable) {
        this.f356201m = drawable;
        this.f356203o = false;
        b();
    }
}
