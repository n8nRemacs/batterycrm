package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzgk implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzgk[] f350401b;
    public static final zzgk zza;

    static {
        zzgk zzgkVar = new zzgk("INSTANCE", 0);
        zza = zzgkVar;
        f350401b = new zzgk[]{zzgkVar};
    }

    public static zzgk[] values() {
        return (zzgk[]) f350401b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i12 = 0; i12 < iMin; i12++) {
            int i13 = (bArr[i12] & 255) - (bArr2[i12] & 255);
            if (i13 != 0) {
                return i13;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
