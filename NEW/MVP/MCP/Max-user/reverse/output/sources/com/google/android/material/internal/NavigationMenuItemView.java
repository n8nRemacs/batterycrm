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
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.dwc;
import defpackage.fvc;
import defpackage.gcg;
import defpackage.god;
import defpackage.hfh;
import defpackage.k1d;
import defpackage.lod;
import defpackage.lxc;
import defpackage.ng9;
import defpackage.re6;
import defpackage.ss0;
import defpackage.t35;
import defpackage.uxc;
import defpackage.v48;
import defpackage.zf9;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends re6 implements ng9 {
    public static final int[] E0 = {R.attr.state_checked};
    public ColorStateList A0;
    public boolean B0;
    public Drawable C0;
    public final ss0 D0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public final boolean w0;
    public final CheckedTextView x0;
    public FrameLayout y0;
    public zf9 z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = true;
        ss0 ss0Var = new ss0(4, this);
        this.D0 = ss0Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(k1d.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(dwc.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(uxc.design_menu_item_text);
        this.x0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        hfh.n(checkedTextView, ss0Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.y0 == null) {
                this.y0 = (FrameLayout) ((ViewStub) findViewById(uxc.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.y0.removeAllViews();
            this.y0.addView(view);
        }
    }

    @Override // defpackage.ng9
    public final void c(zf9 zf9Var) {
        StateListDrawable stateListDrawable;
        this.z0 = zf9Var;
        int i = zf9Var.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(zf9Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(fvc.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(E0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = hfh.a;
            setBackground(stateListDrawable);
        }
        setCheckable(zf9Var.isCheckable());
        setChecked(zf9Var.isChecked());
        setEnabled(zf9Var.isEnabled());
        setTitle(zf9Var.o);
        setIcon(zf9Var.getIcon());
        setActionView(zf9Var.getActionView());
        setContentDescription(zf9Var.A0);
        gcg.a(this, zf9Var.B0);
        zf9 zf9Var2 = this.z0;
        CharSequence charSequence = zf9Var2.o;
        CheckedTextView checkedTextView = this.x0;
        if (charSequence == null && zf9Var2.getIcon() == null && this.z0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.y0;
            if (frameLayout != null) {
                v48 v48Var = (v48) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) v48Var).width = -1;
                this.y0.setLayoutParams(v48Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.y0;
        if (frameLayout2 != null) {
            v48 v48Var2 = (v48) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) v48Var2).width = -2;
            this.y0.setLayoutParams(v48Var2);
        }
    }

    @Override // defpackage.ng9
    public zf9 getItemData() {
        return this.z0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        zf9 zf9Var = this.z0;
        if (zf9Var != null && zf9Var.isCheckable() && this.z0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.v0 != z) {
            this.v0 = z;
            this.D0.h(this.x0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.x0;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.w0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.B0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                t35.h(drawable, this.A0);
            }
            int i = this.t0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.u0) {
            if (this.C0 == null) {
                Resources resources = getResources();
                int i2 = lxc.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = lod.a;
                Drawable drawableA = god.a(resources, i2, theme);
                this.C0 = drawableA;
                if (drawableA != null) {
                    int i3 = this.t0;
                    drawableA.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.C0;
        }
        this.x0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.x0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.t0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A0 = colorStateList;
        this.B0 = colorStateList != null;
        zf9 zf9Var = this.z0;
        if (zf9Var != null) {
            setIcon(zf9Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.x0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.u0 = z;
    }

    public void setTextAppearance(int i) {
        this.x0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.x0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.x0.setText(charSequence);
    }
}
