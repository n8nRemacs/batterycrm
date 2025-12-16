package com.google.android.gms.internal.location;

import AK.c;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzdm {
    public static String a(int i12, int i13, String str) {
        if (i12 < 0) {
            return zzdn.zza("%s (%s) must not be negative", str, Integer.valueOf(i12));
        }
        if (i13 >= 0) {
            return zzdn.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i12), Integer.valueOf(i13));
        }
        throw new IllegalArgumentException(c.g(i13, "negative size: "));
    }

    public static int zza(int i12, int i13, String str) {
        String strZza;
        if (i12 >= 0 && i12 < i13) {
            return i12;
        }
        if (i12 < 0) {
            strZza = zzdn.zza("%s (%s) must not be negative", "index", Integer.valueOf(i12));
        } else {
            if (i13 < 0) {
                throw new IllegalArgumentException(c.g(i13, "negative size: "));
            }
            strZza = zzdn.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i12), Integer.valueOf(i13));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i12, int i13, String str) {
        if (i12 < 0 || i12 > i13) {
            throw new IndexOutOfBoundsException(a(i12, i13, "index"));
        }
        return i12;
    }

    public static void zzc(int i12, int i13, int i14) {
        if (i12 < 0 || i13 < i12 || i13 > i14) {
            throw new IndexOutOfBoundsException((i12 < 0 || i12 > i14) ? a(i12, i14, "start index") : (i13 < 0 || i13 > i14) ? a(i13, i14, "end index") : zzdn.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i13), Integer.valueOf(i12)));
        }
    }
}
