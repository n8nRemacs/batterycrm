package com.avito.android.autoteka.items.payment;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.avito.android.autoteka.presentation.previewsearch.AutotekaPreviewSearchActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class h implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96863a;

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i12, int i13, Spanned spanned, int i14, int i15) {
        switch (this.f96863a) {
            case 0:
                int i16 = j.f96866t;
                StringBuilder sb2 = new StringBuilder(i13 - i12);
                boolean z12 = true;
                for (int i17 = i12; i17 < i13; i17++) {
                    if (charSequence != null) {
                        char cCharAt = charSequence.charAt(i17);
                        if (Character.isLetterOrDigit(cCharAt)) {
                            sb2.append(cCharAt);
                        } else {
                            z12 = false;
                        }
                    }
                }
                if (z12) {
                    return null;
                }
                if (!(charSequence instanceof Spanned)) {
                    return sb2;
                }
                SpannableString spannableString = new SpannableString(sb2);
                TextUtils.copySpansFrom((Spanned) charSequence, i12, sb2.length(), null, spannableString, 0);
                return spannableString;
            default:
                h hVar = AutotekaPreviewSearchActivity.f97529x;
                StringBuilder sb3 = new StringBuilder(i13 - i12);
                boolean z13 = true;
                for (int i18 = i12; i18 < i13; i18++) {
                    if (charSequence != null) {
                        char cCharAt2 = charSequence.charAt(i18);
                        if (Character.isLetterOrDigit(cCharAt2)) {
                            sb3.append(cCharAt2);
                        } else {
                            z13 = false;
                        }
                    }
                }
                if (z13) {
                    return null;
                }
                if (!(charSequence instanceof Spanned)) {
                    return sb3;
                }
                SpannableString spannableString2 = new SpannableString(sb3);
                TextUtils.copySpansFrom((Spanned) charSequence, i12, sb3.length(), null, spannableString2, 0);
                return spannableString2;
        }
    }
}
