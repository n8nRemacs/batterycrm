package com.avito.android.util;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: MimeEncoder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/e3;", "", "<init>", "()V", "_common_okhttp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.e3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35782e3 {
    @Y61.k
    public static String a(@Y61.k String str) {
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt >= 127 || (cCharAt < ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t')) {
                i12++;
            }
        }
        return i12 == 0 ? str : AK.c.k("=?UTF-8?B?", Base64.encodeToString(str.getBytes(C43047d.f410589b), 2), "?=");
    }
}
