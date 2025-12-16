package com.avito.security;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;

/* loaded from: classes5.dex */
class n2 extends m2 {
    public static final String a(String str, String str2, String str3, boolean z12) {
        y0.b(str, "$this$replace");
        y0.b(str2, "oldValue");
        y0.b(str3, "newValue");
        int i12 = 0;
        int iA2 = o2.a(str, str2, 0, z12);
        if (iA2 < 0) {
            return str;
        }
        int length = str2.length();
        int iA3 = s1.a(length, 1);
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i12, iA2);
            sb2.append(str3);
            i12 = iA2 + length;
            if (iA2 >= str.length()) {
                break;
            }
            iA2 = o2.a(str, str2, iA2 + iA3, z12);
        } while (iA2 > 0);
        sb2.append((CharSequence) str, i12, str.length());
        String string = sb2.toString();
        y0.a((Object) string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static /* synthetic */ String a(String str, String str2, String str3, boolean z12, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        return a(str, str2, str3, z12);
    }

    public static final boolean a(String str, int i12, String str2, int i13, int i14, boolean z12) {
        y0.b(str, "$this$regionMatches");
        y0.b(str2, PluralsKeys.OTHER);
        return !z12 ? str.regionMatches(i12, str2, i13, i14) : str.regionMatches(z12, i12, str2, i13, i14);
    }

    public static boolean a(String str, String str2, boolean z12) {
        return str == null ? str2 == null : !z12 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }
}
