package com.google.android.gms.internal.auth;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzfa {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f350106a;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzej zzf;

    static {
        Charset.forName("US-ASCII");
        f350106a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzeh zzehVar = new zzeh(bArr, 0, 0, false, null);
        try {
            zzehVar.zza(0);
            zzf = zzehVar;
        } catch (zzfb e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public static int zza(boolean z12) {
        return z12 ? 1231 : 1237;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, f350106a);
    }
}
