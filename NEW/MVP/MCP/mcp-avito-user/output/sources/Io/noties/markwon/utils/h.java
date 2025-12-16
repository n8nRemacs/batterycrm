package io.noties.markwon.utils;

import android.text.Spannable;
import android.text.SpannableString;

/* compiled from: NoCopySpannableFactory.java */
/* loaded from: classes8.dex */
public class h extends Spannable.Factory {

    /* compiled from: NoCopySpannableFactory.java */
    public static class a {
        static {
            new h();
        }
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
    }
}
