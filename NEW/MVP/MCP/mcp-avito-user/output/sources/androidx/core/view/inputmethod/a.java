package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.os.C22774b;
import j.N;
import j.X;

/* compiled from: EditorInfoCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class a {

    /* compiled from: EditorInfoCompat.java */
    @X
    /* renamed from: androidx.core.view.inputmethod.a$a, reason: collision with other inner class name */
    public static class C1758a {
        public static void a(@N EditorInfo editorInfo, CharSequence charSequence) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        }
    }

    /* compiled from: EditorInfoCompat.java */
    @X
    public static class b {
        public static void a(@N EditorInfo editorInfo, boolean z12) {
            editorInfo.setStylusHandwritingEnabled(z12);
        }
    }

    @Deprecated
    public a() {
    }

    public static void a(@N EditorInfo editorInfo, @N CharSequence charSequence) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            C1758a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i12 >= 30) {
            C1758a.a(editorInfo, charSequence);
            return;
        }
        int i13 = editorInfo.initialSelStart;
        int i14 = editorInfo.initialSelEnd;
        int i15 = i13 > i14 ? i14 : i13;
        if (i13 <= i14) {
            i13 = i14;
        }
        int length = charSequence.length();
        if (i15 < 0 || i13 > length) {
            c(editorInfo, null, 0, 0);
            return;
        }
        int i16 = editorInfo.inputType & 4095;
        if (i16 == 129 || i16 == 225 || i16 == 18) {
            c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            c(editorInfo, charSequence, i15, i13);
            return;
        }
        int i17 = i13 - i15;
        int i18 = i17 > 1024 ? 0 : i17;
        int i19 = 2048 - i18;
        int iMin = Math.min(charSequence.length() - i13, i19 - Math.min(i15, (int) (i19 * 0.8d)));
        int iMin2 = Math.min(i15, i19 - iMin);
        int i22 = i15 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i22))) {
            i22++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i13 + iMin) - 1))) {
            iMin--;
        }
        int i23 = iMin2 + i18;
        c(editorInfo, i18 != i17 ? TextUtils.concat(charSequence.subSequence(i22, i22 + iMin2), charSequence.subSequence(i13, iMin + i13)) : charSequence.subSequence(i22, i23 + iMin + i22), iMin2, i23);
    }

    public static void b(@N EditorInfo editorInfo, boolean z12) {
        if (C22774b.a()) {
            b.a(editorInfo, z12);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z12);
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence, int i12, int i13) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i12);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i13);
    }
}
