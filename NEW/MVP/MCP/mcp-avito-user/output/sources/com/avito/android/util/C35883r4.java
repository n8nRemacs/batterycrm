package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: RawPhoneNumberFormatter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/r4;", "Lcom/avito/android/util/t1;", "", "<init>", "()V", "_common_formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.r4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35883r4 implements InterfaceC35945t1<String> {
    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(String str) {
        String str2 = str;
        if (str2 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str2.charAt(i12);
            if (cCharAt == '+' || Character.isDigit(cCharAt) || cCharAt == ',') {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }
}
