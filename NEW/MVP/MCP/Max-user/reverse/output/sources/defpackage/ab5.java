package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class ab5 {
    public final py0 a;
    public int b = Integer.MAX_VALUE;
    public int c = 0;

    public ab5(EditText editText, boolean z) {
        this.a = new py0(editText, z);
    }

    public final ib5 a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        py0 py0Var = this.a;
        py0Var.getClass();
        return inputConnection instanceof ib5 ? (ib5) inputConnection : new ib5((EditText) py0Var.b, inputConnection, editorInfo);
    }
}
