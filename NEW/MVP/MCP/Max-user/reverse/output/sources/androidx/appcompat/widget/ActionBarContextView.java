package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.c0;
import defpackage.dhh;
import defpackage.e7;
import defpackage.eri;
import defpackage.fvc;
import defpackage.h7;
import defpackage.hfh;
import defpackage.l7;
import defpackage.o6d;
import defpackage.og9;
import defpackage.p1d;
import defpackage.r6;
import defpackage.vf9;
import defpackage.whh;
import defpackage.zxc;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public LinearLayout A0;
    public TextView B0;
    public TextView C0;
    public final int D0;
    public final int E0;
    public boolean F0;
    public final int G0;
    public final c0 a;
    public final Context b;
    public ActionMenuView c;
    public h7 d;
    public int o;
    public dhh s0;
    public boolean t0;
    public boolean u0;
    public CharSequence v0;
    public CharSequence w0;
    public View x0;
    public View y0;
    public View z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int i = fvc.actionModeStyle;
        super(context, attributeSet, i);
        c0 c0Var = new c0();
        c0Var.c = this;
        c0Var.b = false;
        this.a = c0Var;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(fvc.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o6d.ActionMode, i, 0);
        int i2 = o6d.ActionMode_background;
        setBackground((!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i2) : eri.a(context, resourceId));
        this.D0 = typedArrayObtainStyledAttributes.getResourceId(o6d.ActionMode_titleTextStyle, 0);
        this.E0 = typedArrayObtainStyledAttributes.getResourceId(o6d.ActionMode_subtitleTextStyle, 0);
        this.o = typedArrayObtainStyledAttributes.getLayoutDimension(o6d.ActionMode_height, 0);
        this.G0 = typedArrayObtainStyledAttributes.getResourceId(o6d.ActionMode_closeItemLayout, p1d.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(l7 l7Var) {
        View view = this.x0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.G0, (ViewGroup) this, false);
            this.x0 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.x0);
        }
        View viewFindViewById = this.x0.findViewById(zxc.action_mode_close_button);
        this.y0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new r6(0, l7Var));
        vf9 vf9VarD = l7Var.d();
        h7 h7Var = this.d;
        if (h7Var != null) {
            h7Var.g();
            e7 e7Var = h7Var.D0;
            if (e7Var != null && e7Var.b()) {
                e7Var.i.dismiss();
            }
        }
        h7 h7Var2 = new h7(getContext());
        this.d = h7Var2;
        h7Var2.v0 = true;
        h7Var2.w0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        vf9VarD.b(this.d, this.b);
        h7 h7Var3 = this.d;
        og9 og9Var = h7Var3.Z;
        if (og9Var == null) {
            og9 og9Var2 = (og9) h7Var3.d.inflate(h7Var3.X, (ViewGroup) this, false);
            h7Var3.Z = og9Var2;
            og9Var2.b(h7Var3.c);
            h7Var3.i();
        }
        og9 og9Var3 = h7Var3.Z;
        if (og9Var != og9Var3) {
            ((ActionMenuView) og9Var3).setPresenter(h7Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) og9Var3;
        this.c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.A0 == null) {
            LayoutInflater.from(getContext()).inflate(p1d.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A0 = linearLayout;
            this.B0 = (TextView) linearLayout.findViewById(zxc.action_bar_title);
            this.C0 = (TextView) this.A0.findViewById(zxc.action_bar_subtitle);
            int i = this.D0;
            if (i != 0) {
                this.B0.setTextAppearance(getContext(), i);
            }
            int i2 = this.E0;
            if (i2 != 0) {
                this.C0.setTextAppearance(getContext(), i2);
            }
        }
        this.B0.setText(this.v0);
        this.C0.setText(this.w0);
        boolean zIsEmpty = TextUtils.isEmpty(this.v0);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.w0);
        this.C0.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.A0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.A0.getParent() == null) {
            addView(this.A0);
        }
    }

    public final void e() {
        removeAllViews();
        this.z0 = null;
        this.c = null;
        this.d = null;
        View view = this.y0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.s0 != null ? this.a.a : getVisibility();
    }

    public int getContentHeight() {
        return this.o;
    }

    public CharSequence getSubtitle() {
        return this.w0;
    }

    public CharSequence getTitle() {
        return this.v0;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            dhh dhhVar = this.s0;
            if (dhhVar != null) {
                dhhVar.b();
            }
            super.setVisibility(i);
        }
    }

    public final dhh i(int i, long j) {
        dhh dhhVar = this.s0;
        if (dhhVar != null) {
            dhhVar.b();
        }
        c0 c0Var = this.a;
        if (i != 0) {
            dhh dhhVarA = hfh.a(this);
            dhhVarA.a(0.0f);
            dhhVarA.c(j);
            ((ActionBarContextView) c0Var.c).s0 = dhhVarA;
            c0Var.a = i;
            dhhVarA.d(c0Var);
            return dhhVarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        dhh dhhVarA2 = hfh.a(this);
        dhhVarA2.a(1.0f);
        dhhVarA2.c(j);
        ((ActionBarContextView) c0Var.c).s0 = dhhVarA2;
        c0Var.a = i;
        dhhVarA2.d(c0Var);
        return dhhVarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, o6d.ActionBar, fvc.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(o6d.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        h7 h7Var = this.d;
        if (h7Var != null) {
            Configuration configuration2 = h7Var.b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            h7Var.z0 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            vf9 vf9Var = h7Var.c;
            if (vf9Var != null) {
                vf9Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h7 h7Var = this.d;
        if (h7Var != null) {
            h7Var.g();
            e7 e7Var = this.d.D0;
            if (e7Var == null || !e7Var.b()) {
                return;
            }
            e7Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.u0 = false;
        }
        if (!this.u0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.u0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.u0 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = whh.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.x0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.x0.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(i7, paddingTop, paddingTop2, this.x0, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.A0;
        if (linearLayout != null && this.z0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.A0, z3);
        }
        View view2 = this.z0;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.o;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.x0;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.x0.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.A0;
        if (linearLayout != null && this.z0 == null) {
            if (this.F0) {
                this.A0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.A0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.A0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.z0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.z0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.o > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t0 = false;
        }
        if (!this.t0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.t0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.t0 = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.o = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.z0;
        if (view2 != null) {
            removeView(view2);
        }
        this.z0 = view;
        if (view != null && (linearLayout = this.A0) != null) {
            removeView(linearLayout);
            this.A0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.w0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.v0 = charSequence;
        d();
        hfh.o(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.F0) {
            requestLayout();
        }
        this.F0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
