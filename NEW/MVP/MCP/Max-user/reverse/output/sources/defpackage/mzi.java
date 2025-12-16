package defpackage;

import android.text.Spannable;
import android.text.SpannableString;

/* loaded from: classes.dex */
public abstract class mzi {
    public static Spannable a(CharSequence charSequence) {
        CharSequence charSequenceC0 = vmf.c0(charSequence);
        Spannable spannableString = charSequenceC0 instanceof Spannable ? (Spannable) charSequenceC0 : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequenceC0);
        }
        int iC = vmf.C(charSequenceC0, '\n', 0, 6);
        while (iC >= 0) {
            int i = iC + 1;
            spannableString.setSpan(new omb(), iC, i, 33);
            iC = vmf.C(charSequenceC0, '\n', i, 4);
        }
        return spannableString;
    }

    public static int b(int i) {
        return i >= kti.d(((float) 200) * vw4.d().getDisplayMetrics().density) ? kti.d(90 * vw4.d().getDisplayMetrics().density) : i >= kti.d(((float) 72) * vw4.d().getDisplayMetrics().density) ? kti.d(36 * vw4.d().getDisplayMetrics().density) : i >= kti.d(((float) 64) * vw4.d().getDisplayMetrics().density) ? kti.d(32 * vw4.d().getDisplayMetrics().density) : i >= kti.d(((float) 48) * vw4.d().getDisplayMetrics().density) ? kti.d(28 * vw4.d().getDisplayMetrics().density) : i >= kti.d(((float) 36) * vw4.d().getDisplayMetrics().density) ? kti.d(24 * vw4.d().getDisplayMetrics().density) : i >= kti.d(((float) 32) * vw4.d().getDisplayMetrics().density) ? kti.d(20 * vw4.d().getDisplayMetrics().density) : i >= 28 ? kti.d(16 * vw4.d().getDisplayMetrics().density) : kti.d(12 * vw4.d().getDisplayMetrics().density);
    }
}
