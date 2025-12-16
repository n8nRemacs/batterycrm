package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C19948f0;
import androidx.appcompat.widget.C19953i;
import androidx.core.graphics.C22767g;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.internal.G;
import j.I;
import j.InterfaceC42149e;
import j.N;
import j.P;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes6.dex */
public class u extends C19953i {

    @P
    private final AccessibilityManager accessibilityManager;

    @N
    private final C19948f0 modalListPopup;
    private final float popupElevation;

    @I
    private final int simpleItemLayout;
    private int simpleItemSelectedColor;

    @P
    private ColorStateList simpleItemSelectedRippleColor;

    @N
    private final Rect tempRect;

    /* compiled from: MaterialAutoCompleteTextView.java */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i12, long j12) {
            Object item;
            u uVar = u.this;
            if (i12 < 0) {
                C19948f0 c19948f0 = uVar.modalListPopup;
                item = !c19948f0.f22505A.isShowing() ? null : c19948f0.f22508d.getSelectedItem();
            } else {
                item = uVar.getAdapter().getItem(i12);
            }
            uVar.updateText(item);
            AdapterView.OnItemClickListener onItemClickListener = uVar.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i12 < 0) {
                    C19948f0 c19948f02 = uVar.modalListPopup;
                    view = !c19948f02.f22505A.isShowing() ? null : c19948f02.f22508d.getSelectedView();
                    C19948f0 c19948f03 = uVar.modalListPopup;
                    i12 = !c19948f03.f22505A.isShowing() ? -1 : c19948f03.f22508d.getSelectedItemPosition();
                    C19948f0 c19948f04 = uVar.modalListPopup;
                    j12 = !c19948f04.f22505A.isShowing() ? Long.MIN_VALUE : c19948f04.f22508d.getSelectedItemId();
                }
                onItemClickListener.onItemClick(uVar.modalListPopup.f22508d, view, i12, j12);
            }
            uVar.modalListPopup.dismiss();
        }
    }

    /* compiled from: MaterialAutoCompleteTextView.java */
    public class b<T> extends ArrayAdapter<String> {

        /* renamed from: b, reason: collision with root package name */
        @P
        public ColorStateList f357553b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public ColorStateList f357554c;

        public b(@N Context context, int i12, @N String[] strArr) {
            super(context, i12, strArr);
            a();
        }

        public final void a() {
            ColorStateList colorStateList;
            u uVar = u.this;
            ColorStateList colorStateList2 = null;
            if (uVar.simpleItemSelectedRippleColor != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{uVar.simpleItemSelectedRippleColor.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f357554c = colorStateList;
            if (uVar.simpleItemSelectedColor != 0 && uVar.simpleItemSelectedRippleColor != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C22767g.g(uVar.simpleItemSelectedRippleColor.getColorForState(iArr3, 0), uVar.simpleItemSelectedColor), C22767g.g(uVar.simpleItemSelectedRippleColor.getColorForState(iArr2, 0), uVar.simpleItemSelectedColor), uVar.simpleItemSelectedColor});
            }
            this.f357553b = colorStateList2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i12, @P View view, ViewGroup viewGroup) {
            View view2 = super.getView(i12, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                u uVar = u.this;
                Drawable rippleDrawable = null;
                if (uVar.getText().toString().contentEquals(textView.getText()) && uVar.simpleItemSelectedColor != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(uVar.simpleItemSelectedColor);
                    if (this.f357554c != null) {
                        colorDrawable.setTintList(this.f357553b);
                        rippleDrawable = new RippleDrawable(this.f357554c, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                textView.setBackground(rippleDrawable);
            }
            return view2;
        }
    }

    public u(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.autoCompleteTextViewStyle);
    }

    @P
    private TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean isTouchExplorationEnabled() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int measureContentWidth() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        int i12 = 0;
        if (adapter == null || textInputLayoutFindTextInputLayoutAncestor == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        C19948f0 c19948f0 = this.modalListPopup;
        int iMin = Math.min(adapter.getCount(), Math.max(0, !c19948f0.f22505A.isShowing() ? -1 : c19948f0.f22508d.getSelectedItemPosition()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutFindTextInputLayoutAncestor);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable background = this.modalListPopup.f22505A.getBackground();
        if (background != null) {
            background.getPadding(this.tempRect);
            Rect rect = this.tempRect;
            iMax += rect.left + rect.right;
        }
        return textInputLayoutFindTextInputLayoutAncestor.getEndIconView().getMeasuredWidth() + iMax;
    }

    private void onInputTypeChanged() {
        TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (textInputLayoutFindTextInputLayoutAncestor != null) {
            textInputLayoutFindTextInputLayoutAncestor.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void updateText(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (isTouchExplorationEnabled()) {
            this.modalListPopup.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    @P
    public CharSequence getHint() {
        TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        return (textInputLayoutFindTextInputLayoutAncestor == null || !textInputLayoutFindTextInputLayoutAncestor.isProvidingHint()) ? super.getHint() : textInputLayoutFindTextInputLayoutAncestor.getHint();
    }

    public float getPopupElevation() {
        return this.popupElevation;
    }

    public int getSimpleItemSelectedColor() {
        return this.simpleItemSelectedColor;
    }

    @P
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.simpleItemSelectedRippleColor;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (textInputLayoutFindTextInputLayoutAncestor != null && textInputLayoutFindTextInputLayoutAncestor.isProvidingHint() && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.modalListPopup.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        if (View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth()), View.MeasureSpec.getSize(i12)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z12) {
        if (isTouchExplorationEnabled()) {
            return;
        }
        super.onWindowFocusChanged(z12);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@P T t12) {
        super.setAdapter(t12);
        this.modalListPopup.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C19948f0 c19948f0 = this.modalListPopup;
        if (c19948f0 != null) {
            c19948f0.g(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@P AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.modalListPopup.f22522r = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i12) {
        super.setRawInputType(i12);
        onInputTypeChanged();
    }

    public void setSimpleItemSelectedColor(int i12) {
        this.simpleItemSelectedColor = i12;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(@P ColorStateList colorStateList) {
        this.simpleItemSelectedRippleColor = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).a();
        }
    }

    public void setSimpleItems(@InterfaceC42149e int i12) {
        setSimpleItems(getResources().getStringArray(i12));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (isTouchExplorationEnabled()) {
            this.modalListPopup.show();
        } else {
            super.showDropDown();
        }
    }

    public u(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(BY0.a.a(context, attributeSet, i12, 0), attributeSet, i12);
        this.tempRect = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = G.d(context2, attributeSet, com.google.android.material.R.styleable.MaterialAutoCompleteTextView, i12, com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayD.hasValue(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType) && typedArrayD.getInt(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.simpleItemLayout = typedArrayD.getResourceId(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, com.google.android.material.R.layout.mtrl_auto_complete_simple_item);
        this.popupElevation = typedArrayD.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_popupElevation, com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.simpleItemSelectedColor = typedArrayD.getColor(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.simpleItemSelectedRippleColor = com.google.android.material.resources.c.b(typedArrayD, context2, com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        C19948f0 c19948f0 = new C19948f0(context2);
        this.modalListPopup = c19948f0;
        c19948f0.r();
        c19948f0.f22520p = this;
        c19948f0.f22505A.setInputMethodMode(2);
        c19948f0.o(getAdapter());
        c19948f0.f22521q = new a();
        if (typedArrayD.hasValue(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayD.getResourceId(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayD.recycle();
    }

    public void setSimpleItems(@N String[] strArr) {
        setAdapter(new b(getContext(), this.simpleItemLayout, strArr));
    }
}
