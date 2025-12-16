package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzel {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f352447a;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzde zzf;

    static {
        Charset.forName("US-ASCII");
        f352447a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzdd zzddVar = new zzdd(bArr, 0, 0, false, null);
        try {
            zzddVar.zza(0);
            zzf = zzddVar;
        } catch (zzen e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public static zzfl a(Object obj, Object obj2) {
        return ((zzfl) obj).zzV().zzg((zzfl) obj2).zzm();
    }

    public static int zza(boolean z12) {
        return z12 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        for (byte b12 : bArr) {
            length = (length * 31) + b12;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public static int zzc(long j12) {
        return (int) (j12 ^ (j12 >>> 32));
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, f352447a);
    }

    public static boolean zzj(byte[] bArr) {
        return zzhe.f352550a.a(0, 0, bArr.length, bArr) == 0;
    }
}
