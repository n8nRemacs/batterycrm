package defpackage;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class kgh implements View.OnAttachStateChangeListener, TextWatcher {
    public final WeakReference a;

    public kgh(TextView textView) {
        this.a = new WeakReference(textView);
        if (textView.isAttachedToWindow()) {
            a(textView);
        }
    }

    public static void a(TextView textView) {
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), igh.class) : null;
        if (spans == null) {
            spans = new igh[0];
        }
        for (Object obj : spans) {
            ((igh) obj).attach(textView);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextView textView = (TextView) this.a.get();
        if (textView != null) {
            a(textView);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a((TextView) view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), igh.class) : null;
        if (spans == null) {
            spans = new igh[0];
        }
        for (Object obj : spans) {
            ((igh) obj).detach(view);
        }
    }
}
