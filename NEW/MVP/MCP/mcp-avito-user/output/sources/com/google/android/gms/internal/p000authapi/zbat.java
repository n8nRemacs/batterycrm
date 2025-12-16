package com.google.android.gms.internal.p000authapi;

import android.util.Base64;
import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class zbat {

    /* renamed from: a, reason: collision with root package name */
    public static final SecureRandom f349986a = new SecureRandom();

    public static String zba() {
        byte[] bArr = new byte[16];
        f349986a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
