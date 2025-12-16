package ru.cyberity.cbr.core.widget.autocompletePhone.util;

import Y61.k;
import kotlin.Metadata;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "isPhoneDigitCountValid", "(Ljava/lang/String;)Z", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ExtensionsKt {
    public static final boolean isPhoneDigitCountValid(@k String str) {
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '#' || Character.isDigit(cCharAt)) {
                i12++;
            }
        }
        return 7 <= i12 && i12 < 16;
    }
}
