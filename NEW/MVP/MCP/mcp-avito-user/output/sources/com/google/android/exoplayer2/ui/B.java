package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.text.a;

/* compiled from: SubtitleViewUtils.java */
/* loaded from: classes6.dex */
final class B {
    public static void a(a.c cVar) {
        cVar.f346744k = -3.4028235E38f;
        cVar.f346743j = BeduinInputModel.MIN_TEXT_VERSION;
        CharSequence charSequence = cVar.f346734a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                cVar.f346734a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = cVar.f346734a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float b(int i12, int i13, int i14, float f12) {
        float f13;
        if (f12 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i12 == 0) {
            f13 = i14;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    return -3.4028235E38f;
                }
                return f12;
            }
            f13 = i13;
        }
        return f12 * f13;
    }
}
