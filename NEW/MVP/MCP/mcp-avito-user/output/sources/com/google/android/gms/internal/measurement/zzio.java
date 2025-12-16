package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzio extends zzhv {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f350862b = Logger.getLogger(zzio.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f350863c = zzmo.f351000e;

    /* renamed from: a, reason: collision with root package name */
    public zzir f350864a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static class zza extends zzio {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f350865d;

        /* renamed from: e, reason: collision with root package name */
        public final int f350866e;

        /* renamed from: f, reason: collision with root package name */
        public int f350867f;

        public zza(byte[] bArr, int i12) {
            super();
            if (((bArr.length - i12) | i12) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i12)));
            }
            this.f350865d = bArr;
            this.f350867f = 0;
            this.f350866e = i12;
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void a(int i12, zzkr zzkrVar, zzlj zzljVar) throws zzb {
            zzc(i12, 2);
            zzc(((zzhl) zzkrVar).a(zzljVar));
            zzljVar.zza((zzlj) zzkrVar, (zzne) this.f350864a);
        }

        public final void c(byte[] bArr, int i12, int i13) throws zzb {
            try {
                System.arraycopy(bArr, i12, this.f350865d, this.f350867f, i13);
                this.f350867f += i13;
            } catch (IndexOutOfBoundsException e12) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f350867f), Integer.valueOf(this.f350866e), Integer.valueOf(i13)), e12);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final int zza() {
            return this.f350866e - this.f350867f;
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(byte[] bArr, int i12, int i13) throws zzb {
            zzc(i13);
            c(bArr, 0, i13);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzc(int i12, int i13) throws zzb {
            zzc((i12 << 3) | i13);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzd(int i12, int i13) throws zzb {
            zzc(i12, 0);
            zzc(i13);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(byte b12) throws zzb {
            try {
                byte[] bArr = this.f350865d;
                int i12 = this.f350867f;
                this.f350867f = i12 + 1;
                bArr[i12] = b12;
            } catch (IndexOutOfBoundsException e12) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f350867f), Integer.valueOf(this.f350866e), 1), e12);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzc(int i12) throws zzb {
            while (true) {
                int i13 = i12 & (-128);
                byte[] bArr = this.f350865d;
                if (i13 == 0) {
                    int i14 = this.f350867f;
                    this.f350867f = i14 + 1;
                    bArr[i14] = (byte) i12;
                    return;
                } else {
                    try {
                        int i15 = this.f350867f;
                        this.f350867f = i15 + 1;
                        bArr[i15] = (byte) (i12 | 128);
                        i12 >>>= 7;
                    } catch (IndexOutOfBoundsException e12) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f350867f), Integer.valueOf(this.f350866e), 1), e12);
                    }
                }
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f350867f), Integer.valueOf(this.f350866e), 1), e12);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(int i12, int i13) throws zzb {
            zzc(i12, 0);
            zzb(i13);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i12, boolean z12) throws zzb {
            zzc(i12, 0);
            zza(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(int i12) throws zzb {
            if (i12 >= 0) {
                zzc(i12);
            } else {
                zzb(i12);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i12, zzhu zzhuVar) throws zzb {
            zzc(i12, 2);
            zza(zzhuVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(int i12, zzhu zzhuVar) throws zzb {
            zzc(1, 3);
            zzd(2, i12);
            zza(3, zzhuVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(zzhu zzhuVar) throws zzb {
            zzc(zzhuVar.zzb());
            zzhuVar.d(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i12, int i13) throws zzb {
            zzc(i12, 5);
            zza(i13);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(int i12, long j12) throws zzb {
            zzc(i12, 0);
            zzb(j12);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i12) throws zzb {
            try {
                byte[] bArr = this.f350865d;
                int i13 = this.f350867f;
                int i14 = i13 + 1;
                this.f350867f = i14;
                bArr[i13] = (byte) i12;
                int i15 = i13 + 2;
                this.f350867f = i15;
                bArr[i14] = (byte) (i12 >> 8);
                int i16 = i13 + 3;
                this.f350867f = i16;
                bArr[i15] = (byte) (i12 >> 16);
                this.f350867f = i13 + 4;
                bArr[i16] = (byte) (i12 >>> 24);
            } catch (IndexOutOfBoundsException e12) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f350867f), Integer.valueOf(this.f350866e), 1), e12);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(long j12) throws zzb {
            boolean z12 = zzio.f350863c;
            byte[] bArr = this.f350865d;
            if (z12 && zza() >= 10) {
                while ((j12 & (-128)) != 0) {
                    int i12 = this.f350867f;
                    this.f350867f = i12 + 1;
                    zzmo.f350998c.zza((Object) bArr, zzmo.f351001f + i12, (byte) (((int) j12) | 128));
                    j12 >>>= 7;
                }
                int i13 = this.f350867f;
                this.f350867f = i13 + 1;
                zzmo.f350998c.zza((Object) bArr, zzmo.f351001f + i13, (byte) j12);
                return;
            }
            while ((j12 & (-128)) != 0) {
                try {
                    int i14 = this.f350867f;
                    this.f350867f = i14 + 1;
                    bArr[i14] = (byte) (((int) j12) | 128);
                    j12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f350867f), Integer.valueOf(this.f350866e), 1), e12);
                }
            }
            int i15 = this.f350867f;
            this.f350867f = i15 + 1;
            bArr[i15] = (byte) j12;
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i12, long j12) throws zzb {
            zzc(i12, 1);
            zza(j12);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(long j12) throws zzb {
            try {
                byte[] bArr = this.f350865d;
                int i12 = this.f350867f;
                int i13 = i12 + 1;
                this.f350867f = i13;
                bArr[i12] = (byte) j12;
                int i14 = i12 + 2;
                this.f350867f = i14;
                bArr[i13] = (byte) (j12 >> 8);
                int i15 = i12 + 3;
                this.f350867f = i15;
                bArr[i14] = (byte) (j12 >> 16);
                int i16 = i12 + 4;
                this.f350867f = i16;
                bArr[i15] = (byte) (j12 >> 24);
                int i17 = i12 + 5;
                this.f350867f = i17;
                bArr[i16] = (byte) (j12 >> 32);
                int i18 = i12 + 6;
                this.f350867f = i18;
                bArr[i17] = (byte) (j12 >> 40);
                int i19 = i12 + 7;
                this.f350867f = i19;
                bArr[i18] = (byte) (j12 >> 48);
                this.f350867f = i12 + 8;
                bArr[i19] = (byte) (j12 >> 56);
            } catch (IndexOutOfBoundsException e12) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f350867f), Integer.valueOf(this.f350866e), 1), e12);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhv
        public final void zza(byte[] bArr, int i12, int i13) throws zzb {
            c(bArr, i12, i13);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(zzkr zzkrVar) throws zzb {
            zzc(zzkrVar.zzbw());
            zzkrVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i12, zzkr zzkrVar) throws zzb {
            zzc(1, 3);
            zzd(2, i12);
            zzc(3, 2);
            zza(zzkrVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i12, String str) throws zzb {
            zzc(i12, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(String str) throws zzb {
            int i12 = this.f350867f;
            try {
                int iZzj = zzio.zzj(str.length() * 3);
                int iZzj2 = zzio.zzj(str.length());
                byte[] bArr = this.f350865d;
                if (iZzj2 == iZzj) {
                    int i13 = i12 + iZzj2;
                    this.f350867f = i13;
                    int iA2 = zzmp.a(i13, zza(), str, bArr);
                    this.f350867f = i12;
                    zzc((iA2 - i12) - iZzj2);
                    this.f350867f = iA2;
                    return;
                }
                zzc(zzmp.c(str));
                this.f350867f = zzmp.a(this.f350867f, zza(), str, bArr);
            } catch (zzms e12) {
                this.f350867f = i12;
                zzio.f350862b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
                byte[] bytes = str.getBytes(zzjh.f350896a);
                try {
                    zzc(bytes.length);
                    zza(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e13) {
                    throw new zzb(e13);
                }
            } catch (IndexOutOfBoundsException e14) {
                throw new zzb(e14);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public zzb(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    @Deprecated
    public static int b(int i12, zzkr zzkrVar, zzlj zzljVar) {
        return ((zzhl) zzkrVar).a(zzljVar) + (zzj(i12 << 3) << 1);
    }

    public static int zza(double d12) {
        return 8;
    }

    public static int zzb(int i12, boolean z12) {
        return zzj(i12 << 3) + 1;
    }

    public static int zzc(long j12) {
        return 8;
    }

    public static int zzd(int i12) {
        return zzg(i12);
    }

    public static int zze(int i12) {
        return 4;
    }

    public static int zzf(int i12, int i13) {
        return zzj(i12 << 3) + 4;
    }

    public static int zzg(int i12) {
        return 4;
    }

    public static int zzh(int i12, int i13) {
        return zzj(i12 << 3) + 4;
    }

    public static int zzi(int i12, int i13) {
        return zzj((i13 >> 31) ^ (i13 << 1)) + zzj(i12 << 3);
    }

    public static int zzj(int i12, int i13) {
        return zzj(i13) + zzj(i12 << 3);
    }

    public abstract void a(int i12, zzkr zzkrVar, zzlj zzljVar);

    public abstract int zza();

    public abstract void zza(byte b12);

    public abstract void zza(int i12);

    public abstract void zza(int i12, int i13);

    public abstract void zza(int i12, long j12);

    public abstract void zza(int i12, zzhu zzhuVar);

    public abstract void zza(int i12, zzkr zzkrVar);

    public abstract void zza(int i12, String str);

    public abstract void zza(int i12, boolean z12);

    public abstract void zza(long j12);

    public abstract void zza(zzhu zzhuVar);

    public abstract void zza(zzkr zzkrVar);

    public abstract void zza(String str);

    public abstract void zzb(int i12);

    public abstract void zzb(int i12, int i13);

    public abstract void zzb(int i12, long j12);

    public abstract void zzb(int i12, zzhu zzhuVar);

    public abstract void zzb(long j12);

    public abstract void zzb(byte[] bArr, int i12, int i13);

    public abstract void zzc(int i12);

    public abstract void zzc(int i12, int i13);

    public abstract void zzd(int i12, int i13);

    public final void zzk(int i12, int i13) {
        zzd(i12, (i13 >> 31) ^ (i13 << 1));
    }

    public zzio() {
    }

    public static int zza(float f12) {
        return 4;
    }

    public static int zzb(zzhu zzhuVar) {
        int iZzb = zzhuVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zzc(int i12, zzhu zzhuVar) {
        int iZzj = zzj(i12 << 3);
        int iZzb = zzhuVar.zzb();
        return zzj(iZzb) + iZzb + iZzj;
    }

    public static int zzd(int i12, long j12) {
        return zzg(j12) + zzj(i12 << 3);
    }

    public static int zze(long j12) {
        return 8;
    }

    public static int zzf(int i12) {
        return zzg(i12);
    }

    public static int zzg(int i12, int i13) {
        return zzg(i13) + zzj(i12 << 3);
    }

    public static int zzh(int i12) {
        return zzj((i12 >> 31) ^ (i12 << 1));
    }

    public final void zzk(int i12) {
        zzc((i12 >> 31) ^ (i12 << 1));
    }

    public static int zza(boolean z12) {
        return 1;
    }

    public static int zze(int i12, int i13) {
        return zzg(i13) + zzj(i12 << 3);
    }

    public static int zzf(int i12, long j12) {
        return zzg((j12 >> 63) ^ (j12 << 1)) + zzj(i12 << 3);
    }

    public static int zzi(int i12) {
        return zzj(i12 << 3);
    }

    public static int zzj(int i12) {
        return (352 - (Integer.numberOfLeadingZeros(i12) * 9)) >>> 6;
    }

    public final void zzh(int i12, long j12) {
        zzb(i12, (j12 >> 63) ^ (j12 << 1));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    public static int zzb(zzkr zzkrVar) {
        return zzkrVar.zzbw();
    }

    public static int zzd(long j12) {
        return zzg(j12);
    }

    public static int zzg(int i12, long j12) {
        return zzg(j12) + zzj(i12 << 3);
    }

    public final void zzh(long j12) {
        zzb((j12 >> 63) ^ (j12 << 1));
    }

    public static int zzb(int i12, zzjv zzjvVar) {
        int iZzj = zzj(i12 << 3);
        int iZzb = zzjvVar.zzb();
        return zzj(iZzb) + iZzb + iZzj;
    }

    public static int zzc(int i12, long j12) {
        return zzj(i12 << 3) + 8;
    }

    public static int zzd(int i12, zzhu zzhuVar) {
        return zzc(3, zzhuVar) + zzj(2, i12) + (zzj(8) << 1);
    }

    public static int zze(int i12, long j12) {
        return zzj(i12 << 3) + 8;
    }

    public static int zzf(long j12) {
        return zzg((j12 >> 63) ^ (j12 << 1));
    }

    public static int zza(int i12, double d12) {
        return zzj(i12 << 3) + 8;
    }

    public static int zzc(zzkr zzkrVar) {
        int iZzbw = zzkrVar.zzbw();
        return zzj(iZzbw) + iZzbw;
    }

    public static int zzg(long j12) {
        return (640 - (Long.numberOfLeadingZeros(j12) * 9)) >>> 6;
    }

    public static int zza(int i12, float f12) {
        return zzj(i12 << 3) + 4;
    }

    public static int zza(int i12, zzjv zzjvVar) {
        return zzb(3, zzjvVar) + zzj(2, i12) + (zzj(8) << 1);
    }

    public static int zzb(int i12, zzkr zzkrVar) {
        return zzc(zzkrVar) + zzj(24) + zzj(2, i12) + (zzj(8) << 1);
    }

    public static int zza(zzjv zzjvVar) {
        int iZzb = zzjvVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zzb(int i12, String str) {
        return zzb(str) + zzj(i12 << 3);
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmp.c(str);
        } catch (zzms unused) {
            length = str.getBytes(zzjh.f350896a).length;
        }
        return zzj(length) + length;
    }

    public static zzio zzb(byte[] bArr) {
        return new zza(bArr, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z12) {
        zza(z12 ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i12, double d12) {
        zza(i12, Double.doubleToRawLongBits(d12));
    }

    public final void zzb(double d12) {
        zza(Double.doubleToRawLongBits(d12));
    }

    public final void zzb(int i12, float f12) {
        zza(i12, Float.floatToRawIntBits(f12));
    }

    public final void zzb(float f12) {
        zza(Float.floatToRawIntBits(f12));
    }
}
