package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzhn {

    /* renamed from: a, reason: collision with root package name */
    public static final zzhm f350181a;
    public static final /* synthetic */ int zza = 0;

    static {
        if (zzhj.f350179e && zzhj.f350178d) {
            int i12 = zzds.zza;
        }
        f350181a = new zzhm();
    }

    public static /* bridge */ /* synthetic */ int a(int i12, int i13, byte[] bArr) {
        int i14 = i13 - i12;
        byte b12 = bArr[i12 - 1];
        if (i14 != 0) {
            if (i14 == 1) {
                byte b13 = bArr[i12];
                if (b12 <= -12 && b13 <= -65) {
                    return b12 ^ (b13 << 8);
                }
            } else {
                if (i14 != 2) {
                    throw new AssertionError();
                }
                byte b14 = bArr[i12];
                byte b15 = bArr[i12 + 1];
                if (b12 <= -12 && b14 <= -65 && b15 <= -65) {
                    return ((b14 << 8) ^ b12) ^ (b15 << 16);
                }
            }
        } else if (b12 <= -12) {
            return b12;
        }
        return -1;
    }

    public static boolean b(int i12, int i13, byte[] bArr) {
        return f350181a.a(i12, i13, bArr) == 0;
    }
}
