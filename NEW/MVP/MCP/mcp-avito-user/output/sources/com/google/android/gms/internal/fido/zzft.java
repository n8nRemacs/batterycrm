package com.google.android.gms.internal.fido;

import I41.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public abstract class zzft {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f350378b = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public abstract boolean a(zzft zzftVar);

    public byte[] b() {
        throw null;
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            if (zzb() == zzftVar.zzb() && a(zzftVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] bArrB = b();
        int i12 = bArrB[0] & 255;
        for (int i13 = 1; i13 < bArrB.length; i13++) {
            i12 |= (bArrB[i13] & 255) << (i13 * 8);
        }
        return i12;
    }

    public final String toString() {
        byte[] bArrB = b();
        int length = bArrB.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b12 : bArrB) {
            char[] cArr = f350378b;
            sb2.append(cArr[(b12 >> 4) & 15]);
            sb2.append(cArr[b12 & 15]);
        }
        return sb2.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract byte[] zzd();
}
