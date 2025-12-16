package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.a9;
import defpackage.aag;
import defpackage.ab5;
import defpackage.c34;
import defpackage.c6g;
import defpackage.cri;
import defpackage.d34;
import defpackage.f34;
import defpackage.fp;
import defpackage.fvc;
import defpackage.hfh;
import defpackage.i5i;
import defpackage.iv6;
import defpackage.j7g;
import defpackage.jm7;
import defpackage.kc5;
import defpackage.lo;
import defpackage.lp;
import defpackage.ro;
import defpackage.s7c;
import defpackage.sl6;
import defpackage.ua5;
import defpackage.uva;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements uva, ua5 {
    public final a9 a;
    public final lp b;
    public final i5i c;
    public final c6g d;
    public final s7c o;
    public lo s0;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fvc.editTextStyle);
    }

    private lo getSuperCaller() {
        if (this.s0 == null) {
            this.s0 = new lo(this);
        }
        return this.s0;
    }

    @Override // defpackage.ua5
    public final boolean a() {
        return ((kc5) ((ab5) this.o.b).a.c).X;
    }

    @Override // defpackage.uva
    public final f34 b(f34 f34Var) {
        return this.d.a(this, f34Var);
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        i5i i5iVar;
        if (Build.VERSION.SDK_INT >= 28 || (i5iVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) i5iVar.b;
        return textClassifier == null ? fp.a((TextView) i5iVar.a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrG;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        lp.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        cri.d(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrG = hfh.g(this)) != null) {
            editorInfo.contentMimeTypes = strArrG;
            inputConnectionOnCreateInputConnection = new jm7(inputConnectionOnCreateInputConnection, new sl6(6, this));
        }
        return ((ab5) this.o.b).a(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && hfh.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = ro.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        c34 iv6Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || hfh.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                iv6Var = new iv6(primaryClip, 1);
            } else {
                d34 d34Var = new d34();
                d34Var.b = primaryClip;
                d34Var.c = 1;
                iv6Var = d34Var;
            }
            iv6Var.setFlags(i == 16908322 ? 0 : 1);
            hfh.j(this, iv6Var.build());
        }
        return true;
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
        super.setCustomSelectionActionModeCallback(androidx.core.widget.a.f(callback, this));
    }

    @Override // defpackage.ua5
    public void setEmojiCompatEnabled(boolean z) {
        this.o.C(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.o.u(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        i5i i5iVar;
        if (Build.VERSION.SDK_INT >= 28 || (i5iVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            i5iVar.b = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
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
        i5i i5iVar = new i5i();
        i5iVar.a = this;
        this.c = i5iVar;
        this.d = new c6g();
        s7c s7cVar = new s7c(this);
        this.o = s7cVar;
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
