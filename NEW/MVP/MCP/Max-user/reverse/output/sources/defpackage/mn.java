package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.a;

/* loaded from: classes.dex */
public class mn extends AutoCompleteTextView implements ua5 {
    public static final int[] d = {R.attr.popupBackground};
    public final a9 a;
    public final lp b;
    public final s7c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aag.a(context);
        j7g.a(this, getContext());
        jdc jdcVarX = jdc.x(getContext(), attributeSet, d, i);
        if (((TypedArray) jdcVarX.c).hasValue(0)) {
            setDropDownBackgroundDrawable(jdcVarX.t(0));
        }
        jdcVarX.B();
        a9 a9Var = new a9(this);
        this.a = a9Var;
        a9Var.v(attributeSet, i);
        lp lpVar = new lp(this);
        this.b = lpVar;
        lpVar.f(attributeSet, i);
        lpVar.b();
        s7c s7cVar = new s7c(this);
        this.c = s7cVar;
        s7cVar.z(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerU = s7cVar.u(keyListener);
        if (keyListenerU == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerU);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // defpackage.ua5
    public final boolean a() {
        return ((kc5) ((ab5) this.c.b).a.c).X;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.j();
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        a9 a9Var = this.a;
        if (a9Var != null) {
            return a9Var.r();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a9 a9Var = this.a;
        if (a9Var != null) {
            return a9Var.s();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        cri.d(editorInfo, inputConnectionOnCreateInputConnection, this);
        return ((ab5) this.c.b).a(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.y();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.z(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.f(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(eri.a(getContext(), i));
    }

    @Override // defpackage.ua5
    public void setEmojiCompatEnabled(boolean z) {
        this.c.C(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.G(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.H(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        lp lpVar = this.b;
        lpVar.l(colorStateList);
        lpVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        lp lpVar = this.b;
        lpVar.m(mode);
        lpVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.g(context, i);
        }
    }
}
