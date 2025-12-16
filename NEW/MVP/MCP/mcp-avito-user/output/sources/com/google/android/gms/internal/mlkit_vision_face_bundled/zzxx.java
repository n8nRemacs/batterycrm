package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.common.internal.P0;
import java.util.Arrays;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzxx {

    /* renamed from: f, reason: collision with root package name */
    public static final zzxx f354137f = new zzxx(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f354138a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f354139b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f354140c;

    /* renamed from: d, reason: collision with root package name */
    public int f354141d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f354142e;

    public zzxx(int i12, int[] iArr, Object[] objArr, boolean z12) {
        this.f354141d = -1;
        this.f354138a = i12;
        this.f354139b = iArr;
        this.f354140c = objArr;
        this.f354142e = z12;
    }

    public static zzxx a() {
        return new zzxx(0, new int[8], new Object[8], true);
    }

    public static zzxx zzc() {
        return f354137f;
    }

    public final void b(int i12, Object obj) {
        if (!this.f354142e) {
            throw new UnsupportedOperationException();
        }
        c(this.f354138a + 1);
        int[] iArr = this.f354139b;
        int i13 = this.f354138a;
        iArr[i13] = i12;
        this.f354140c[i13] = obj;
        this.f354138a = i13 + 1;
    }

    public final void c(int i12) {
        int[] iArr = this.f354139b;
        if (i12 > iArr.length) {
            int i13 = this.f354138a;
            int i14 = (i13 / 2) + i13;
            if (i14 >= i12) {
                i12 = i14;
            }
            if (i12 < 8) {
                i12 = 8;
            }
            this.f354139b = Arrays.copyOf(iArr, i12);
            this.f354140c = Arrays.copyOf(this.f354140c, i12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzxx)) {
            return false;
        }
        zzxx zzxxVar = (zzxx) obj;
        int i12 = this.f354138a;
        if (i12 == zzxxVar.f354138a) {
            int[] iArr = this.f354139b;
            int[] iArr2 = zzxxVar.f354139b;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    Object[] objArr = this.f354140c;
                    Object[] objArr2 = zzxxVar.f354140c;
                    int i14 = this.f354138a;
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
        int i12 = this.f354138a;
        int i13 = i12 + 527;
        int[] iArr = this.f354139b;
        int iHashCode = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = ((i13 * 31) + i14) * 31;
        Object[] objArr = this.f354140c;
        int i17 = this.f354138a;
        for (int i18 = 0; i18 < i17; i18++) {
            iHashCode = (iHashCode * 31) + objArr[i18].hashCode();
        }
        return i16 + iHashCode;
    }

    public final int zza() {
        int iZzw;
        int iZzx;
        int iZzw2;
        int i12 = this.f354141d;
        if (i12 != -1) {
            return i12;
        }
        int iZzw3 = 0;
        for (int i13 = 0; i13 < this.f354138a; i13++) {
            int i14 = this.f354139b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f354140c[i13]).getClass();
                    iZzw2 = zzut.zzw(i15 << 3) + 8;
                } else if (i16 == 2) {
                    int i17 = i15 << 3;
                    zzul zzulVar = (zzul) this.f354140c[i13];
                    int iZzw4 = zzut.zzw(i17);
                    int iZzd = zzulVar.zzd();
                    iZzw3 = zzut.zzw(iZzd) + iZzd + iZzw4 + iZzw3;
                } else if (i16 == 3) {
                    int iZzw5 = zzut.zzw(i15 << 3);
                    iZzw = iZzw5 + iZzw5;
                    iZzx = ((zzxx) this.f354140c[i13]).zza();
                } else {
                    if (i16 != 5) {
                        int i18 = zzvv.f354068c;
                        throw new IllegalStateException(new zzvu("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f354140c[i13]).getClass();
                    iZzw2 = zzut.zzw(i15 << 3) + 4;
                }
                iZzw3 = iZzw2 + iZzw3;
            } else {
                int i19 = i15 << 3;
                long jLongValue = ((Long) this.f354140c[i13]).longValue();
                iZzw = zzut.zzw(i19);
                iZzx = zzut.zzx(jLongValue);
            }
            iZzw3 = iZzx + iZzw + iZzw3;
        }
        this.f354141d = iZzw3;
        return iZzw3;
    }

    public final int zzb() {
        int i12 = this.f354141d;
        if (i12 != -1) {
            return i12;
        }
        int iJ2 = 0;
        for (int i13 = 0; i13 < this.f354138a; i13++) {
            int i14 = this.f354139b[i13] >>> 3;
            zzul zzulVar = (zzul) this.f354140c[i13];
            int iZzw = zzut.zzw(8);
            int iZzw2 = zzut.zzw(i14) + zzut.zzw(16);
            int iZzw3 = zzut.zzw(24);
            int iZzd = zzulVar.zzd();
            iJ2 += iZzw + iZzw + iZzw2 + P0.j(iZzd, iZzd, iZzw3);
        }
        this.f354141d = iJ2;
        return iJ2;
    }

    public final void zzh() {
        if (this.f354142e) {
            this.f354142e = false;
        }
    }

    public final void zzl(zzyo zzyoVar) {
        if (this.f354138a != 0) {
            for (int i12 = 0; i12 < this.f354138a; i12++) {
                int i13 = this.f354139b[i12];
                Object obj = this.f354140c[i12];
                int i14 = i13 & 7;
                int i15 = i13 >>> 3;
                if (i14 == 0) {
                    zzyoVar.zzt(i15, ((Long) obj).longValue());
                } else if (i14 == 1) {
                    zzyoVar.zzm(i15, ((Long) obj).longValue());
                } else if (i14 == 2) {
                    zzyoVar.zzd(i15, (zzul) obj);
                } else if (i14 == 3) {
                    zzyoVar.zzF(i15);
                    ((zzxx) obj).zzl(zzyoVar);
                    zzyoVar.zzh(i15);
                } else {
                    if (i14 != 5) {
                        int i16 = zzvv.f354068c;
                        throw new RuntimeException(new zzvu("Protocol message tag had invalid wire type."));
                    }
                    zzyoVar.zzk(i15, ((Integer) obj).intValue());
                }
            }
        }
    }

    public zzxx() {
        this(0, new int[8], new Object[8], true);
    }
}
