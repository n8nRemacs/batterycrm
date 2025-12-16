package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.e;
import j.P;
import j.X;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
@RestrictTo
@X
/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final EditText f46183b;

    /* renamed from: c, reason: collision with root package name */
    public e.g f46184c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46185d = true;

    /* compiled from: EmojiTextWatcher.java */
    @RestrictTo
    @X
    public static class a extends e.g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f46186b;

        public a(EditText editText) {
            this.f46186b = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.g
        public final void b() {
            Handler handler;
            EditText editText = (EditText) this.f46186b.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.a((EditText) this.f46186b.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f46183b = editText;
    }

    public static void a(@P EditText editText, int i12) {
        int length;
        if (i12 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
            if (editableText == null) {
                length = 0;
            } else {
                eVarA.getClass();
                length = editableText.length();
            }
            eVarA.j(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
        EditText editText = this.f46183b;
        if (!editText.isInEditMode() && this.f46185d && androidx.emoji2.text.e.g() && i13 <= i14 && (charSequence instanceof Spannable)) {
            int iD2 = androidx.emoji2.text.e.a().d();
            if (iD2 != 0) {
                if (iD2 == 1) {
                    androidx.emoji2.text.e.a().j(i12, i14 + i12, 0, (Spannable) charSequence);
                    return;
                } else if (iD2 != 3) {
                    return;
                }
            }
            androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
            if (this.f46184c == null) {
                this.f46184c = new a(editText);
            }
            eVarA.k(this.f46184c);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }
}
