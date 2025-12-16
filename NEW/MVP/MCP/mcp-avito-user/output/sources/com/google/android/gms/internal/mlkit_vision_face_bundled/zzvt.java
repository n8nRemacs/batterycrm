package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzvt {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f354067a;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzup zzf;

    static {
        Charset.forName("US-ASCII");
        f354067a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzun zzunVar = new zzun(bArr, 0, 0, false, null);
        try {
            zzunVar.zza(0);
            zzf = zzunVar;
        } catch (zzvv e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public static int zza(boolean z12) {
        return z12 ? 1231 : 1237;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, f354067a);
    }
}
