package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.fi9;
import defpackage.fvc;
import defpackage.fzf;
import defpackage.gi9;
import defpackage.hi9;
import defpackage.jc5;
import defpackage.jm7;
import defpackage.p89;
import defpackage.t1b;
import defpackage.vb5;
import defpackage.y4e;
import defpackage.z7c;
import defpackage.za5;
import defpackage.zm;
import one.me.android.OneMeApplication;

/* loaded from: classes2.dex */
public class MessageComposeEditText extends za5 {
    public static final /* synthetic */ int w0 = 0;

    public MessageComposeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, fvc.editTextStyle);
        ((OneMeApplication) ((fzf) context.getApplicationContext())).getClass();
        vb5 vb5Var = (vb5) y4e.a.getAccessor().c(441);
        if (!vb5Var.e) {
            addTextChangedListener(new jc5(0, vb5Var));
        }
        ((t1b) zm.a()).a();
        setReplaceTextSmiles(((z7c) zm.d.b.getValue()).c.g.getBoolean("app.messages.replace.emoji", false));
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        editorInfo.contentMimeTypes = new String[]{"image/jpeg", "image/png", "image/gif"};
        return new jm7(inputConnectionOnCreateInputConnection, new p89(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return (i == 4 && keyEvent.getAction() == 0) ? super.onKeyPreIme(i, keyEvent) : super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    public void setListener(fi9 fi9Var) {
    }

    public void setMIUITextSelectListener(gi9 gi9Var) {
    }

    public void setTextSelectListener(hi9 hi9Var) {
    }
}
