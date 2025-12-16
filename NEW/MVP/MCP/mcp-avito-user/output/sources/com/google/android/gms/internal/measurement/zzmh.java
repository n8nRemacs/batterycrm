package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzmh {

    /* renamed from: f, reason: collision with root package name */
    public static final zzmh f350987f = new zzmh(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f350988a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f350989b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f350990c;

    /* renamed from: d, reason: collision with root package name */
    public int f350991d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f350992e;

    public zzmh() {
        this(0, new int[8], new Object[8], true);
    }

    public static void c(int i12, Object obj, zzne zzneVar) {
        int i13 = i12 >>> 3;
        int i14 = i12 & 7;
        if (i14 == 0) {
            zzneVar.zzb(i13, ((Long) obj).longValue());
            return;
        }
        if (i14 == 1) {
            zzneVar.zza(i13, ((Long) obj).longValue());
            return;
        }
        if (i14 == 2) {
            zzneVar.zza(i13, (zzhu) obj);
            return;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new RuntimeException(zzjq.a());
            }
            zzneVar.zzb(i13, ((Integer) obj).intValue());
        } else if (zzneVar.zza() == zznh.zza) {
            zzneVar.zzb(i13);
            ((zzmh) obj).zzb(zzneVar);
            zzneVar.zza(i13);
        } else {
            zzneVar.zza(i13);
            ((zzmh) obj).zzb(zzneVar);
            zzneVar.zzb(i13);
        }
    }

    public static zzmh zzc() {
        return f350987f;
    }

    public final void a(int i12) {
        int[] iArr = this.f350989b;
        if (i12 > iArr.length) {
            int i13 = this.f350988a;
            int i14 = (i13 / 2) + i13;
            if (i14 >= i12) {
                i12 = i14;
            }
            if (i12 < 8) {
                i12 = 8;
            }
            this.f350989b = Arrays.copyOf(iArr, i12);
            this.f350990c = Arrays.copyOf(this.f350990c, i12);
        }
    }

    public final void b(int i12, Object obj) {
        if (!this.f350992e) {
            throw new UnsupportedOperationException();
        }
        a(this.f350988a + 1);
        int[] iArr = this.f350989b;
        int i13 = this.f350988a;
        iArr[i13] = i12;
        this.f350990c[i13] = obj;
        this.f350988a = i13 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmh)) {
            return false;
        }
        zzmh zzmhVar = (zzmh) obj;
        int i12 = this.f350988a;
        if (i12 == zzmhVar.f350988a) {
            int[] iArr = this.f350989b;
            int[] iArr2 = zzmhVar.f350989b;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    Object[] objArr = this.f350990c;
                    Object[] objArr2 = zzmhVar.f350990c;
                    int i14 = this.f350988a;
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
        int i12 = this.f350988a;
        int i13 = (i12 + 527) * 31;
        int[] iArr = this.f350989b;
        int iHashCode = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i13 + i14) * 31;
        Object[] objArr = this.f350990c;
        int i17 = this.f350988a;
        for (int i18 = 0; i18 < i17; i18++) {
            iHashCode = (iHashCode * 31) + objArr[i18].hashCode();
        }
        return i16 + iHashCode;
    }

    public final int zza() {
        int iZzg;
        int i12 = this.f350991d;
        if (i12 != -1) {
            return i12;
        }
        int iZza = 0;
        for (int i13 = 0; i13 < this.f350988a; i13++) {
            int i14 = this.f350989b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                iZzg = zzio.zzg(i15, ((Long) this.f350990c[i13]).longValue());
            } else if (i16 == 1) {
                iZzg = zzio.zzc(i15, ((Long) this.f350990c[i13]).longValue());
            } else if (i16 == 2) {
                iZzg = zzio.zzc(i15, (zzhu) this.f350990c[i13]);
            } else if (i16 == 3) {
                iZza = ((zzmh) this.f350990c[i13]).zza() + (zzio.zzi(i15) << 1) + iZza;
            } else {
                if (i16 != 5) {
                    throw new IllegalStateException(zzjq.a());
                }
                iZzg = zzio.zzf(i15, ((Integer) this.f350990c[i13]).intValue());
            }
            iZza = iZzg + iZza;
        }
        this.f350991d = iZza;
        return iZza;
    }

    public final int zzb() {
        int i12 = this.f350991d;
        if (i12 != -1) {
            return i12;
        }
        int iZzd = 0;
        for (int i13 = 0; i13 < this.f350988a; i13++) {
            iZzd += zzio.zzd(this.f350989b[i13] >>> 3, (zzhu) this.f350990c[i13]);
        }
        this.f350991d = iZzd;
        return iZzd;
    }

    public final void zze() {
        if (this.f350992e) {
            this.f350992e = false;
        }
    }

    public zzmh(int i12, int[] iArr, Object[] objArr, boolean z12) {
        this.f350991d = -1;
        this.f350988a = i12;
        this.f350989b = iArr;
        this.f350990c = objArr;
        this.f350992e = z12;
    }

    public final void zzb(zzne zzneVar) {
        if (this.f350988a == 0) {
            return;
        }
        if (zzneVar.zza() == zznh.zza) {
            for (int i12 = 0; i12 < this.f350988a; i12++) {
                c(this.f350989b[i12], this.f350990c[i12], zzneVar);
            }
            return;
        }
        for (int i13 = this.f350988a - 1; i13 >= 0; i13--) {
            c(this.f350989b[i13], this.f350990c[i13], zzneVar);
        }
    }
}
