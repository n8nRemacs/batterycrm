package com.yandex.div.evaluable.function;

import kotlin.Metadata;

/* compiled from: StringFunctions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div-evaluable"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f1 {
    public static final String a(int i12, String str) {
        if (str.length() == 0 || i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12);
        kotlin.ranges.k it = kotlin.ranges.s.r(0, i12).iterator();
        while (it.f406910d) {
            sb2.append(str.charAt(it.a() % str.length()));
        }
        return sb2.toString();
    }
}
