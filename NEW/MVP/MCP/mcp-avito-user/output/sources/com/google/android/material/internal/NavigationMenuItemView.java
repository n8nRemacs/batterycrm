package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.K0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
public class NavigationMenuItemView extends C37074o implements p.a {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f356733G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f356734A;

    /* renamed from: B, reason: collision with root package name */
    public androidx.appcompat.view.menu.k f356735B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f356736C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f356737D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f356738E;

    /* renamed from: F, reason: collision with root package name */
    public final C22808a f356739F;

    /* renamed from: w, reason: collision with root package name */
    public int f356740w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f356741x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f356742y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f356743z;

    public class a extends C22808a {
        public a() {
        }

        @Override // androidx.core.view.C22808a
        public final void d(View view, @j.N androidx.core.view.accessibility.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f44991a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f356742y);
        }
    }

    public NavigationMenuItemView(@j.N Context context, @j.P AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.f356739F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.f356743z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C22823h0.C(checkedTextView, aVar);
    }

    private void setActionView(@j.P View view) {
        if (view != null) {
            if (this.f356734A == null) {
                this.f356734A = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f356734A.removeAllViews();
            this.f356734A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public final void d(@j.N androidx.appcompat.view.menu.k kVar) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.f356735B = kVar;
        int i12 = kVar.f21861a;
        if (i12 > 0) {
            setId(i12);
        }
        setVisibility(kVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.avito.android.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f356733G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            setBackground(stateListDrawable);
        }
        setCheckable(kVar.isCheckable());
        setChecked(kVar.isChecked());
        setEnabled(kVar.isEnabled());
        setTitle(kVar.f21865e);
        setIcon(kVar.getIcon());
        setActionView(kVar.getActionView());
        setContentDescription(kVar.f21877q);
        K0.a(this, kVar.f21878r);
        androidx.appcompat.view.menu.k kVar2 = this.f356735B;
        CharSequence charSequence = kVar2.f21865e;
        CheckedTextView checkedTextView = this.f356743z;
        if (charSequence == null && kVar2.getIcon() == null && this.f356735B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f356734A;
            if (frameLayout != null) {
                LinearLayoutCompat.b bVar = (LinearLayoutCompat.b) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) bVar).width = -1;
                this.f356734A.setLayoutParams(bVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f356734A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.b bVar2 = (LinearLayoutCompat.b) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) bVar2).width = -2;
            this.f356734A.setLayoutParams(bVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public androidx.appcompat.view.menu.k getItemData() {
        return this.f356735B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 1);
        androidx.appcompat.view.menu.k kVar = this.f356735B;
        if (kVar != null && kVar.isCheckable() && this.f356735B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f356733G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z12) {
        refreshDrawableState();
        if (this.f356742y != z12) {
            this.f356742y = z12;
            this.f356739F.h(this.f356743z, 2048);
        }
    }

    public void setChecked(boolean z12) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f356743z;
        checkedTextView.setChecked(z12);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z12 ? 1 : 0);
    }

    public void setHorizontalPadding(int i12) {
        setPadding(i12, getPaddingTop(), i12, getPaddingBottom());
    }

    public void setIcon(@j.P Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f356737D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f356736C);
            }
            int i12 = this.f356740w;
            drawable.setBounds(0, 0, i12, i12);
        } else if (this.f356741x) {
            if (this.f356738E == null) {
                Resources resources = getResources();
                int i13 = com.google.android.material.R.drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
                Drawable drawable2 = resources.getDrawable(i13, theme);
                this.f356738E = drawable2;
                if (drawable2 != null) {
                    int i14 = this.f356740w;
                    drawable2.setBounds(0, 0, i14, i14);
                }
            }
            drawable = this.f356738E;
        }
        this.f356743z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i12) {
        this.f356743z.setCompoundDrawablePadding(i12);
    }

    public void setIconSize(@j.r int i12) {
        this.f356740w = i12;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f356736C = colorStateList;
        this.f356737D = colorStateList != null;
        androidx.appcompat.view.menu.k kVar = this.f356735B;
        if (kVar != null) {
            setIcon(kVar.getIcon());
        }
    }

    public void setMaxLines(int i12) {
        this.f356743z.setMaxLines(i12);
    }

    public void setNeedsEmptyIcon(boolean z12) {
        this.f356741x = z12;
    }

    public void setTextAppearance(int i12) {
        this.f356743z.setTextAppearance(i12);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f356743z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f356743z.setText(charSequence);
    }
}
