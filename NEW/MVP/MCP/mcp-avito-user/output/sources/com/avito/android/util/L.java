package com.avito.android.util;

import kotlin.Metadata;
import kotlin.text.C43044a;

/* compiled from: CharSequences.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_lang_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class L {
    public static final int a(@Y61.k CharSequence charSequence) {
        int length = charSequence.length();
        int i12 = 0;
        while (i12 < length && C43044a.d(charSequence.charAt(i12))) {
            i12++;
        }
        while (length > i12 && C43044a.d(charSequence.charAt(length - 1))) {
            length--;
        }
        return length - i12;
    }
}
