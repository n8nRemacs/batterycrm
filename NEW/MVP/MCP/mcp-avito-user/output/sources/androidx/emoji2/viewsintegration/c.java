package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import j.N;
import j.X;

/* compiled from: EmojiInputConnection.java */
@RestrictTo
@X
/* loaded from: classes.dex */
final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f46170a;

    /* renamed from: b, reason: collision with root package name */
    public final a f46171b;

    /* compiled from: EmojiInputConnection.java */
    public static class a {
    }

    public c(@N EditText editText, @N InputConnection inputConnection, @N EditorInfo editorInfo) {
        a aVar = new a();
        super(inputConnection, false);
        this.f46170a = editText;
        this.f46171b = aVar;
        if (androidx.emoji2.text.e.g()) {
            androidx.emoji2.text.e.a().l(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i12, int i13) {
        Editable editableText = this.f46170a.getEditableText();
        this.f46171b.getClass();
        return androidx.emoji2.text.e.e(this, editableText, i12, i13, false) || super.deleteSurroundingText(i12, i13);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i12, int i13) {
        Editable editableText = this.f46170a.getEditableText();
        this.f46171b.getClass();
        return androidx.emoji2.text.e.e(this, editableText, i12, i13, true) || super.deleteSurroundingTextInCodePoints(i12, i13);
    }
}
