package io.ktor.util;

import kotlin.Metadata;

/* compiled from: Charset.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.util.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41616x {
    @Y61.k
    public static final char[] a(@Y61.k String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i12 = 0; i12 < length; i12++) {
            cArr[i12] = str.charAt(i12);
        }
        return cArr;
    }
}
