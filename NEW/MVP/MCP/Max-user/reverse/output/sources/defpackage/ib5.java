package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ib5 extends InputConnectionWrapper {
    public final EditText a;
    public final wha b;

    public ib5(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        wha whaVar = new wha(19);
        super(inputConnection, false);
        this.a = editText;
        this.b = whaVar;
        if (ta5.m != null) {
            ta5 ta5VarA = ta5.a();
            if (ta5VarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            pa5 pa5Var = ta5VarA.e;
            pa5Var.getClass();
            Bundle bundle = editorInfo.extras;
            az9 az9Var = ((hz9) pa5Var.c).a;
            int iA = az9Var.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) az9Var.d).getInt(iA + az9Var.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", ((ta5) pa5Var.a).h);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return wha.o(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return wha.o(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
