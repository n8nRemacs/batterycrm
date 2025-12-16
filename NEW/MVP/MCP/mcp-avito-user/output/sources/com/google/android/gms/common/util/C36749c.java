package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.util.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36749c {
    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public static byte[] a(@N String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @N
    @RX0.a
    public static String b(@N byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
