package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.c7;
import defpackage.d7;
import defpackage.gcg;
import defpackage.i7;
import defpackage.ng9;
import defpackage.o6d;
import defpackage.uf9;
import defpackage.vf9;
import defpackage.zf9;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements ng9, View.OnClickListener, i7 {
    public boolean A0;
    public boolean B0;
    public final int C0;
    public int D0;
    public final int E0;
    public zf9 u0;
    public CharSequence v0;
    public Drawable w0;
    public uf9 x0;
    public c7 y0;
    public d7 z0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.A0 = i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o6d.ActionMenuItemView, 0, 0);
        this.C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o6d.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.E0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.D0 = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.ng9
    public final void c(zf9 zf9Var) {
        this.u0 = zf9Var;
        setIcon(zf9Var.getIcon());
        setTitle(zf9Var.getTitleCondensed());
        setId(zf9Var.a);
        setVisibility(zf9Var.isVisible() ? 0 : 8);
        setEnabled(zf9Var.isEnabled());
        if (zf9Var.hasSubMenu() && this.y0 == null) {
            this.y0 = new c7(this);
        }
    }

    @Override // defpackage.i7
    public final boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.i7
    public final boolean e() {
        return !TextUtils.isEmpty(getText()) && this.u0.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.ng9
    public zf9 getItemData() {
        return this.u0;
    }

    public final boolean i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void j() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.v0);
        if (this.w0 != null && ((this.u0.I0 & 4) != 4 || (!this.A0 && !this.B0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.v0 : null);
        CharSequence charSequence = this.u0.A0;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.u0.o);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.u0.B0;
        if (TextUtils.isEmpty(charSequence2)) {
            gcg.a(this, z3 ? null : this.u0.o);
        } else {
            gcg.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        uf9 uf9Var = this.x0;
        if (uf9Var != null) {
            uf9Var.a(this.u0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0 = i();
        j();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.D0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.C0;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.w0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.w0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c7 c7Var;
        if (this.u0.hasSubMenu() && (c7Var = this.y0) != null && c7Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.B0 != z) {
            this.B0 = z;
            zf9 zf9Var = this.u0;
            if (zf9Var != null) {
                vf9 vf9Var = zf9Var.x0;
                vf9Var.u0 = true;
                vf9Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.w0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.E0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        j();
    }

    public void setItemInvoker(uf9 uf9Var) {
        this.x0 = uf9Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.D0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(d7 d7Var) {
        this.z0 = d7Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.v0 = charSequence;
        j();
    }
}
