package com.google.android.gms.internal.fido;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public abstract class zzgf {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgf f350399a;

    static {
        new zzgd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new zzgd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new zzge("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new zzge("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f350399a = new zzgc(new zzgb("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public static zzgf zzf() {
        return f350399a;
    }

    public abstract void a(StringBuilder sb2, byte[] bArr, int i12);

    public abstract int b(int i12);

    public abstract zzgf zzd();

    public final String zzg(byte[] bArr, int i12, int i13) {
        zzbm.zze(0, i13, bArr.length);
        StringBuilder sb2 = new StringBuilder(b(i13));
        try {
            a(sb2, bArr, i13);
            return sb2.toString();
        } catch (IOException e12) {
            throw new AssertionError(e12);
        }
    }
}
