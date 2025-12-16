package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.common.internal.P0;
import java.util.Arrays;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzgq {

    /* renamed from: f, reason: collision with root package name */
    public static final zzgq f352533f = new zzgq(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f352534a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f352535b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f352536c;

    /* renamed from: d, reason: collision with root package name */
    public int f352537d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f352538e;

    public zzgq(int i12, int[] iArr, Object[] objArr, boolean z12) {
        this.f352537d = -1;
        this.f352534a = i12;
        this.f352535b = iArr;
        this.f352536c = objArr;
        this.f352538e = z12;
    }

    public static zzgq a() {
        return new zzgq(0, new int[8], new Object[8], true);
    }

    public static zzgq zzc() {
        return f352533f;
    }

    public final void b(int i12, Object obj) {
        if (!this.f352538e) {
            throw new UnsupportedOperationException();
        }
        int i13 = this.f352534a;
        int[] iArr = this.f352535b;
        if (i13 == iArr.length) {
            int i14 = i13 + (i13 < 4 ? 8 : i13 >> 1);
            this.f352535b = Arrays.copyOf(iArr, i14);
            this.f352536c = Arrays.copyOf(this.f352536c, i14);
        }
        int[] iArr2 = this.f352535b;
        int i15 = this.f352534a;
        iArr2[i15] = i12;
        this.f352536c[i15] = obj;
        this.f352534a = i15 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgq)) {
            return false;
        }
        zzgq zzgqVar = (zzgq) obj;
        int i12 = this.f352534a;
        if (i12 == zzgqVar.f352534a) {
            int[] iArr = this.f352535b;
            int[] iArr2 = zzgqVar.f352535b;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    Object[] objArr = this.f352536c;
                    Object[] objArr2 = zzgqVar.f352536c;
                    int i14 = this.f352534a;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (objArr[i15].equals(objArr2[i15])) {
                        }
                    }
                    return true;
                }
                if (iArr[i13] != iArr2[i13]) {
                    break;
                }
                i13++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f352534a;
        int i13 = (i12 + 527) * 31;
        int[] iArr = this.f352535b;
        int iHashCode = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i13 + i14) * 31;
        Object[] objArr = this.f352536c;
        int i17 = this.f352534a;
        for (int i18 = 0; i18 < i17; i18++) {
            iHashCode = (iHashCode * 31) + objArr[i18].hashCode();
        }
        return i16 + iHashCode;
    }

    public final int zza() {
        int iZzD;
        int iZzE;
        int i12 = this.f352537d;
        if (i12 != -1) {
            return i12;
        }
        int iD2 = 0;
        for (int i13 = 0; i13 < this.f352534a; i13++) {
            int i14 = this.f352535b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f352536c[i13]).getClass();
                    iD2 = P0.d(i15 << 3, 8, iD2);
                } else if (i16 == 2) {
                    zzdb zzdbVar = (zzdb) this.f352536c[i13];
                    int iZzD2 = zzdi.zzD(i15 << 3);
                    int iZzd = zzdbVar.zzd();
                    iD2 = P0.e(iZzd, iZzd, iZzD2, iD2);
                } else if (i16 == 3) {
                    int iZzC = zzdi.zzC(i15);
                    iZzD = iZzC + iZzC;
                    iZzE = ((zzgq) this.f352536c[i13]).zza();
                } else {
                    if (i16 != 5) {
                        int i17 = zzen.f352448c;
                        throw new IllegalStateException(new zzem("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f352536c[i13]).getClass();
                    iD2 = P0.d(i15 << 3, 4, iD2);
                }
            } else {
                long jLongValue = ((Long) this.f352536c[i13]).longValue();
                iZzD = zzdi.zzD(i15 << 3);
                iZzE = zzdi.zzE(jLongValue);
            }
            iD2 = iZzE + iZzD + iD2;
        }
        this.f352537d = iD2;
        return iD2;
    }

    public final int zzb() {
        int i12 = this.f352537d;
        if (i12 != -1) {
            return i12;
        }
        int iZzD = 0;
        for (int i13 = 0; i13 < this.f352534a; i13++) {
            int i14 = this.f352535b[i13];
            zzdb zzdbVar = (zzdb) this.f352536c[i13];
            int iZzD2 = zzdi.zzD(8);
            int iZzd = zzdbVar.zzd();
            iZzD += zzdi.zzD(iZzd) + iZzd + zzdi.zzD(24) + P0.d(i14 >>> 3, zzdi.zzD(16), iZzD2 + iZzD2);
        }
        this.f352537d = iZzD;
        return iZzD;
    }

    public final void zzf() {
        this.f352538e = false;
    }

    public final void zzj(zzdj zzdjVar) {
        if (this.f352534a != 0) {
            for (int i12 = 0; i12 < this.f352534a; i12++) {
                int i13 = this.f352535b[i12];
                Object obj = this.f352536c[i12];
                int i14 = i13 >>> 3;
                int i15 = i13 & 7;
                if (i15 == 0) {
                    zzdjVar.zzt(i14, ((Long) obj).longValue());
                } else if (i15 == 1) {
                    zzdjVar.zzm(i14, ((Long) obj).longValue());
                } else if (i15 == 2) {
                    zzdjVar.zzd(i14, (zzdb) obj);
                } else if (i15 == 3) {
                    zzdjVar.zzF(i14);
                    ((zzgq) obj).zzj(zzdjVar);
                    zzdjVar.zzh(i14);
                } else {
                    if (i15 != 5) {
                        int i16 = zzen.f352448c;
                        throw new RuntimeException(new zzem("Protocol message tag had invalid wire type."));
                    }
                    zzdjVar.zzk(i14, ((Integer) obj).intValue());
                }
            }
        }
    }

    public zzgq() {
        this(0, new int[8], new Object[8], true);
    }
}
