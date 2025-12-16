package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.a;

/* loaded from: classes.dex */
public final class on extends CheckedTextView implements ua5 {
    public final pn a;
    public final a9 b;
    public final lp c;
    public mo d;

    /* JADX WARN: Illegal instructions before constructor call */
    public on(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int i = fvc.checkedTextViewStyle;
        aag.a(context);
        super(context, attributeSet, i);
        j7g.a(this, getContext());
        lp lpVar = new lp(this);
        this.c = lpVar;
        lpVar.f(attributeSet, i);
        lpVar.b();
        a9 a9Var = new a9(this);
        this.b = a9Var;
        a9Var.v(attributeSet, i);
        this.a = new pn(this);
        jdc jdcVarX = jdc.x(getContext(), attributeSet, o6d.CheckedTextView, i);
        TypedArray typedArray = (TypedArray) jdcVarX.c;
        hfh.m(this, getContext(), o6d.CheckedTextView, attributeSet, (TypedArray) jdcVarX.c, i, 0);
        try {
            if (typedArray.hasValue(o6d.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(o6d.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(eri.a(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(o6d.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(o6d.CheckedTextView_android_checkMark, 0)) != 0) {
                setCheckMarkDrawable(eri.a(getContext(), resourceId));
            }
            if (typedArray.hasValue(o6d.CheckedTextView_checkMarkTint)) {
                setCheckMarkTintList(jdcVarX.s(o6d.CheckedTextView_checkMarkTint));
            }
            if (typedArray.hasValue(o6d.CheckedTextView_checkMarkTintMode)) {
                setCheckMarkTintMode(d45.c(typedArray.getInt(o6d.CheckedTextView_checkMarkTintMode, -1), null));
            }
            jdcVarX.B();
            getEmojiTextViewHelper().c(attributeSet, i);
        } catch (Throwable th) {
            jdcVarX.B();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lp lpVar = this.c;
        if (lpVar != null) {
            lpVar.b();
        }
        a9 a9Var = this.b;
        if (a9Var != null) {
            a9Var.j();
        }
        pn pnVar = this.a;
        if (pnVar != null) {
            pnVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.e(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        pn pnVar = this.a;
        if (pnVar != null) {
            return (ColorStateList) pnVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        cri.d(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        pn pnVar = this.a;
        if (pnVar != null) {
            if (pnVar.e) {
                pnVar.e = false;
            } else {
                pnVar.e = true;
                pnVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        lp lpVar = this.c;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        lp lpVar = this.c;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.f(callback, this));
    }

    @Override // defpackage.ua5
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        pn pnVar = this.a;
        if (pnVar != null) {
            pnVar.a = colorStateList;
            pnVar.c = true;
            pnVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        pn pnVar = this.a;
        if (pnVar != null) {
            pnVar.b = mode;
            pnVar.d = true;
            pnVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lp lpVar = this.c;
        if (lpVar != null) {
            lpVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(eri.a(getContext(), i));
    }
}
