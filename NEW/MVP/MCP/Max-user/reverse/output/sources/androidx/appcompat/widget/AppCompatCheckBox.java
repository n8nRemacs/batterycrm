package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import defpackage.a9;
import defpackage.aag;
import defpackage.cag;
import defpackage.eri;
import defpackage.fvc;
import defpackage.j7g;
import defpackage.lp;
import defpackage.mo;
import defpackage.pn;
import defpackage.ua5;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements cag, ua5 {
    public final pn a;
    public final a9 b;
    public final lp c;
    public mo d;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fvc.checkboxStyle);
    }

    private mo getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new mo(this);
        }
        return this.d;
    }

    @Override // defpackage.ua5
    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a9 a9Var = this.b;
        if (a9Var != null) {
            a9Var.j();
        }
        lp lpVar = this.c;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        a9 a9Var = this.b;
        if (a9Var != null) {
            return a9Var.r();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a9 a9Var = this.b;
        if (a9Var != null) {
            return a9Var.s();
        }
        return null;
    }

    @Override // defpackage.cag
    public ColorStateList getSupportButtonTintList() {
        pn pnVar = this.a;
        if (pnVar != null) {
            return (ColorStateList) pnVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        pn pnVar = this.a;
        if (pnVar != null) {
            return (PorterDuff.Mode) pnVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a9 a9Var = this.b;
        if (a9Var != null) {
            a9Var.y();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a9 a9Var = this.b;
        if (a9Var != null) {
            a9Var.z(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        pn pnVar = this.a;
        if (pnVar != null) {
            if (pnVar.e) {
                pnVar.e = false;
            } else {
                pnVar.e = true;
                pnVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        lp lpVar = this.c;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        lp lpVar = this.c;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override // defpackage.ua5
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a9 a9Var = this.b;
        if (a9Var != null) {
            a9Var.G(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a9 a9Var = this.b;
        if (a9Var != null) {
            a9Var.H(mode);
        }
    }

    @Override // defpackage.cag
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        pn pnVar = this.a;
        if (pnVar != null) {
            pnVar.a = colorStateList;
            pnVar.c = true;
            pnVar.a();
        }
    }

    @Override // defpackage.cag
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        pn pnVar = this.a;
        if (pnVar != null) {
            pnVar.b = mode;
            pnVar.d = true;
            pnVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        lp lpVar = this.c;
        lpVar.l(colorStateList);
        lpVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        lp lpVar = this.c;
        lpVar.m(mode);
        lpVar.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aag.a(context);
        j7g.a(this, getContext());
        pn pnVar = new pn(this);
        this.a = pnVar;
        pnVar.e(attributeSet, i);
        a9 a9Var = new a9(this);
        this.b = a9Var;
        a9Var.v(attributeSet, i);
        lp lpVar = new lp(this);
        this.c = lpVar;
        lpVar.f(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(eri.a(getContext(), i));
    }
}
