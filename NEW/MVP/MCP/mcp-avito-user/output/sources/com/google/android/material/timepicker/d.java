package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: MaxInputValidator.java */
/* loaded from: classes6.dex */
class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final int f357662a;

    public d(int i12) {
        this.f357662a = i12;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i12, int i13, Spanned spanned, int i14, int i15) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i14, i15, charSequence.subSequence(i12, i13).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f357662a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
