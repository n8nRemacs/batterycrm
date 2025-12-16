package defpackage;

import android.R;
import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class w3b extends EditText {
    public final boolean a;

    public w3b(Context context, int i) {
        super(context, null, R.attr.editTextStyle, 0);
        t2i.c(this, a93.s0.x(context).k());
        this.a = true;
        setClickable(true);
        setLongClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setCursorVisible(true);
        setInputType(131073);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean getDefaultEditable() {
        return this.a;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.a) {
            super.setText(charSequence, bufferType);
        }
    }
}
