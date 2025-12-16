package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zp8 extends mn {
    public final ca8 o;
    public final AccessibilityManager s0;
    public final Rect t0;
    public final int u0;
    public final float v0;
    public ColorStateList w0;
    public int x0;
    public ColorStateList y0;

    /* JADX WARN: Illegal instructions before constructor call */
    public zp8(Context context, AttributeSet attributeSet) {
        int i = dvc.autoCompleteTextViewStyle;
        super(er8.a(context, attributeSet, i, 0), attributeSet, i);
        this.t0 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = d7g.d(context2, attributeSet, z5d.MaterialAutoCompleteTextView, i, m5d.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayD.hasValue(z5d.MaterialAutoCompleteTextView_android_inputType) && typedArrayD.getInt(z5d.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.u0 = typedArrayD.getResourceId(z5d.MaterialAutoCompleteTextView_simpleItemLayout, k1d.mtrl_auto_complete_simple_item);
        this.v0 = typedArrayD.getDimensionPixelOffset(z5d.MaterialAutoCompleteTextView_android_popupElevation, dwc.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayD.hasValue(z5d.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.w0 = ColorStateList.valueOf(typedArrayD.getColor(z5d.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.x0 = typedArrayD.getColor(z5d.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.y0 = gti.c(context2, typedArrayD, z5d.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.s0 = (AccessibilityManager) context2.getSystemService("accessibility");
        ca8 ca8Var = new ca8(context2, null, fvc.listPopupWindowStyle, 0);
        this.o = ca8Var;
        ca8Var.I0 = true;
        ca8Var.J0.setFocusable(true);
        ca8Var.y0 = this;
        ca8Var.J0.setInputMethodMode(2);
        ca8Var.p(getAdapter());
        ca8Var.z0 = new zo(1, this);
        if (typedArrayD.hasValue(z5d.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayD.getResourceId(z5d.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayD.recycle();
    }

    public static void b(zp8 zp8Var, Object obj) {
        zp8Var.setText(zp8Var.convertSelectionToString(obj), false);
    }

    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.s0;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (d()) {
            this.o.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.w0;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutC = c();
        return (textInputLayoutC == null || !textInputLayoutC.R0) ? super.getHint() : textInputLayoutC.getHint();
    }

    public float getPopupElevation() {
        return this.v0;
    }

    public int getSimpleItemSelectedColor() {
        return this.x0;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.y0;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutC = c();
        if (textInputLayoutC != null && textInputLayoutC.R0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutC = c();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutC != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ca8 ca8Var = this.o;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !ca8Var.J0.isShowing() ? -1 : ca8Var.c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutC);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = ca8Var.J0.getBackground();
                if (background != null) {
                    Rect rect = this.t0;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutC.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (d()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.o.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ca8 ca8Var = this.o;
        if (ca8Var != null) {
            ca8Var.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.w0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof wq8) {
            ((wq8) dropDownBackground).k(this.w0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.o.A0 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutC = c();
        if (textInputLayoutC != null) {
            textInputLayoutC.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.x0 = i;
        if (getAdapter() instanceof yp8) {
            ((yp8) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.y0 = colorStateList;
        if (getAdapter() instanceof yp8) {
            ((yp8) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (d()) {
            this.o.g();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new yp8(this, getContext(), this.u0, strArr));
    }
}
