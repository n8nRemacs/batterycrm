package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import defpackage.a9;
import defpackage.aag;
import defpackage.fvc;
import defpackage.j7g;
import defpackage.lp;
import defpackage.mo;
import defpackage.tp;
import defpackage.ua5;
import defpackage.whh;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements ua5 {
    public final a9 a;
    public final lp b;
    public mo c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fvc.buttonStyle);
    }

    private mo getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new mo(this);
        }
        return this.c;
    }

    @Override // defpackage.ua5
    public final boolean a() {
        return getEmojiTextViewHelper().b();
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
    public int getAutoSizeMaxTextSize() {
        if (whh.c) {
            return super.getAutoSizeMaxTextSize();
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            return Math.round(lpVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (whh.c) {
            return super.getAutoSizeMinTextSize();
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            return Math.round(lpVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (whh.c) {
            return super.getAutoSizeStepGranularity();
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            return Math.round(lpVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (whh.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        lp lpVar = this.b;
        return lpVar != null ? lpVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (whh.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            return lpVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.a.e(super.getCustomSelectionActionModeCallback());
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        lp lpVar = this.b;
        if (lpVar == null || whh.c) {
            return;
        }
        lpVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        lp lpVar = this.b;
        if (lpVar != null) {
            tp tpVar = lpVar.i;
            if (whh.c || !tpVar.f()) {
                return;
            }
            tpVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (whh.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (whh.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (whh.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.k(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.a.f(callback, this));
    }

    @Override // defpackage.ua5
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.a.setAllCaps(z);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = whh.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            tp tpVar = lpVar.i;
            if (z || tpVar.f()) {
                return;
            }
            tpVar.g(i, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aag.a(context);
        j7g.a(this, getContext());
        a9 a9Var = new a9(this);
        this.a = a9Var;
        a9Var.v(attributeSet, i);
        lp lpVar = new lp(this);
        this.b = lpVar;
        lpVar.f(attributeSet, i);
        lpVar.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }
}
