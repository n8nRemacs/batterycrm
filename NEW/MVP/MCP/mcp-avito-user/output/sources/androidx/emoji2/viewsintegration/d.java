package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.e;
import j.N;
import j.X;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
@RestrictTo
@X
/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f46172a;

    /* renamed from: b, reason: collision with root package name */
    public e.g f46173b;

    /* compiled from: EmojiInputFilter.java */
    @RestrictTo
    @X
    public static class a extends e.g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f46174b;

        /* renamed from: c, reason: collision with root package name */
        public final WeakReference f46175c;

        public a(TextView textView, d dVar) {
            this.f46174b = new WeakReference(textView);
            this.f46175c = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.e.g
        public final void b() {
            Handler handler;
            TextView textView = (TextView) this.f46174b.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f46174b.get();
            InputFilter inputFilter = (InputFilter) this.f46175c.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            eVarA.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceJ = eVarA.j(0, length, 0, text);
                        if (text == charSequenceJ) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceJ);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceJ);
                        textView.setText(charSequenceJ);
                        if (charSequenceJ instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceJ;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public d(@N TextView textView) {
        this.f46172a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i12, int i13, Spanned spanned, int i14, int i15) {
        TextView textView = this.f46172a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iD2 = androidx.emoji2.text.e.a().d();
        if (iD2 != 0) {
            if (iD2 == 1) {
                if ((i15 == 0 && i14 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i12 != 0 || i13 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i12, i13);
                }
                return androidx.emoji2.text.e.a().j(0, charSequence.length(), 0, charSequence);
            }
            if (iD2 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
        if (this.f46173b == null) {
            this.f46173b = new a(textView, this);
        }
        eVarA.k(this.f46173b);
        return charSequence;
    }
}
