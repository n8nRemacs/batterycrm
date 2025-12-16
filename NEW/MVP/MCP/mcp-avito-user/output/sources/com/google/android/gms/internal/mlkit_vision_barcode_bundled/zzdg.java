package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzdg extends zzdi {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f352408d;

    /* renamed from: e, reason: collision with root package name */
    public final int f352409e;

    /* renamed from: f, reason: collision with root package name */
    public int f352410f;

    public zzdg(byte[] bArr, int i12) {
        super(null);
        int length = bArr.length;
        if (((length - i12) | i12) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        this.f352408d = bArr;
        this.f352410f = 0;
        this.f352409e = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final int zza() {
        return this.f352409e - this.f352410f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzb(byte b12) throws zzdh {
        try {
            byte[] bArr = this.f352408d;
            int i12 = this.f352410f;
            this.f352410f = i12 + 1;
            bArr[i12] = b12;
        } catch (IndexOutOfBoundsException e12) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f352410f), Integer.valueOf(this.f352409e), 1), e12);
        }
    }

    public final void zzc(byte[] bArr, int i12, int i13) {
        try {
            System.arraycopy(bArr, i12, this.f352408d, this.f352410f, i13);
            this.f352410f += i13;
        } catch (IndexOutOfBoundsException e12) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f352410f), Integer.valueOf(this.f352409e), Integer.valueOf(i13)), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzd(int i12, boolean z12) throws zzdh {
        zzq(i12 << 3);
        zzb(z12 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zze(int i12, zzdb zzdbVar) {
        zzq((i12 << 3) | 2);
        zzq(zzdbVar.zzd());
        zzdbVar.r(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzf(int i12, int i13) throws zzdh {
        zzq((i12 << 3) | 5);
        zzg(i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzg(int i12) throws zzdh {
        try {
            byte[] bArr = this.f352408d;
            int i13 = this.f352410f;
            int i14 = i13 + 1;
            this.f352410f = i14;
            bArr[i13] = (byte) (i12 & 255);
            int i15 = i13 + 2;
            this.f352410f = i15;
            bArr[i14] = (byte) ((i12 >> 8) & 255);
            int i16 = i13 + 3;
            this.f352410f = i16;
            bArr[i15] = (byte) ((i12 >> 16) & 255);
            this.f352410f = i13 + 4;
            bArr[i16] = (byte) ((i12 >> 24) & 255);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f352410f), Integer.valueOf(this.f352409e), 1), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzh(int i12, long j12) throws zzdh {
        zzq((i12 << 3) | 1);
        zzi(j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzi(long j12) throws zzdh {
        try {
            byte[] bArr = this.f352408d;
            int i12 = this.f352410f;
            int i13 = i12 + 1;
            this.f352410f = i13;
            bArr[i12] = (byte) (((int) j12) & 255);
            int i14 = i12 + 2;
            this.f352410f = i14;
            bArr[i13] = (byte) (((int) (j12 >> 8)) & 255);
            int i15 = i12 + 3;
            this.f352410f = i15;
            bArr[i14] = (byte) (((int) (j12 >> 16)) & 255);
            int i16 = i12 + 4;
            this.f352410f = i16;
            bArr[i15] = (byte) (((int) (j12 >> 24)) & 255);
            int i17 = i12 + 5;
            this.f352410f = i17;
            bArr[i16] = (byte) (((int) (j12 >> 32)) & 255);
            int i18 = i12 + 6;
            this.f352410f = i18;
            bArr[i17] = (byte) (((int) (j12 >> 40)) & 255);
            int i19 = i12 + 7;
            this.f352410f = i19;
            bArr[i18] = (byte) (((int) (j12 >> 48)) & 255);
            this.f352410f = i12 + 8;
            bArr[i19] = (byte) (((int) (j12 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f352410f), Integer.valueOf(this.f352409e), 1), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzj(int i12, int i13) throws zzdh {
        zzq(i12 << 3);
        zzk(i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzk(int i12) throws zzdh {
        if (i12 >= 0) {
            zzq(i12);
        } else {
            zzs(i12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzl(byte[] bArr, int i12, int i13) {
        zzc(bArr, 0, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzm(int i12, String str) throws zzdh {
        zzq((i12 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws zzdh {
        int i12 = this.f352410f;
        try {
            int iZzD = zzdi.zzD(str.length() * 3);
            int iZzD2 = zzdi.zzD(str.length());
            int i13 = this.f352409e;
            byte[] bArr = this.f352408d;
            if (iZzD2 != iZzD) {
                zzq(zzhe.c(str));
                int i14 = this.f352410f;
                this.f352410f = zzhe.b(i14, i13 - i14, str, bArr);
            } else {
                int i15 = i12 + iZzD2;
                this.f352410f = i15;
                int iB2 = zzhe.b(i15, i13 - i15, str, bArr);
                this.f352410f = i12;
                zzq((iB2 - i12) - iZzD2);
                this.f352410f = iB2;
            }
        } catch (zzhd e12) {
            this.f352410f = i12;
            zzdi.f352411b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(zzel.f352447a);
            try {
                int length = bytes.length;
                zzq(length);
                zzl(bytes, 0, length);
            } catch (zzdh e13) {
                throw e13;
            } catch (IndexOutOfBoundsException e14) {
                throw new zzdh(e14);
            }
        } catch (IndexOutOfBoundsException e15) {
            throw new zzdh(e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzo(int i12, int i13) {
        zzq((i12 << 3) | i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzp(int i12, int i13) {
        zzq(i12 << 3);
        zzq(i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzq(int i12) {
        if (zzdi.f352412c) {
            int i13 = zzcn.zza;
        }
        while (true) {
            int i14 = i12 & (-128);
            byte[] bArr = this.f352408d;
            if (i14 == 0) {
                int i15 = this.f352410f;
                this.f352410f = i15 + 1;
                bArr[i15] = (byte) i12;
                return;
            } else {
                try {
                    int i16 = this.f352410f;
                    this.f352410f = i16 + 1;
                    bArr[i16] = (byte) ((i12 & 127) | 128);
                    i12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f352410f), Integer.valueOf(this.f352409e), 1), e12);
                }
            }
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f352410f), Integer.valueOf(this.f352409e), 1), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzr(int i12, long j12) throws zzdh {
        zzq(i12 << 3);
        zzs(j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzs(long j12) throws zzdh {
        boolean z12 = zzdi.f352412c;
        int i12 = this.f352409e;
        byte[] bArr = this.f352408d;
        if (!z12 || i12 - this.f352410f < 10) {
            while ((j12 & (-128)) != 0) {
                try {
                    int i13 = this.f352410f;
                    this.f352410f = i13 + 1;
                    bArr[i13] = (byte) ((((int) j12) & 127) | 128);
                    j12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f352410f), Integer.valueOf(i12), 1), e12);
                }
            }
            int i14 = this.f352410f;
            this.f352410f = i14 + 1;
            bArr[i14] = (byte) j12;
            return;
        }
        while ((j12 & (-128)) != 0) {
            int i15 = this.f352410f;
            this.f352410f = i15 + 1;
            zzgz.f352545c.zzd(bArr, zzgz.f352548f + i15, (byte) ((((int) j12) & 127) | 128));
            j12 >>>= 7;
        }
        int i16 = this.f352410f;
        this.f352410f = i16 + 1;
        zzgz.f352545c.zzd(bArr, zzgz.f352548f + i16, (byte) j12);
    }
}
