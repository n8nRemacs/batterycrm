package ru.ok.messages.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.e;
import defpackage.rz7;

/* loaded from: classes2.dex */
public class KeyboardHandlerSearchView extends e {
    private rz7 listener;

    public KeyboardHandlerSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) ? super.dispatchKeyEventPreIme(keyEvent) : super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setListener(rz7 rz7Var) {
    }

    public KeyboardHandlerSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public KeyboardHandlerSearchView(Context context) {
        super(context, null);
    }
}
