package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzjh {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f350896a;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        f350896a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        zzij.a(0, bArr);
    }

    public static int zza(long j12) {
        return (int) (j12 ^ (j12 >>> 32));
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, f350896a);
    }

    public static boolean zzc(byte[] bArr) {
        return zzmp.f351004a.a(0, bArr.length, bArr) == 0;
    }

    public static int zza(boolean z12) {
        return z12 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        for (byte b12 : bArr) {
            length = (length * 31) + b12;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }
}
