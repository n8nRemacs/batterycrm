package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.logging.Level;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzuq extends zzut {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f354033d;

    /* renamed from: e, reason: collision with root package name */
    public final int f354034e;

    /* renamed from: f, reason: collision with root package name */
    public int f354035f;

    public zzuq(byte[] bArr, int i12) {
        super(null);
        int length = bArr.length;
        if (((length - i12) | i12) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        this.f354033d = bArr;
        this.f354035f = 0;
        this.f354034e = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final int zza() {
        return this.f354034e - this.f354035f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzb(byte b12) throws zzur {
        try {
            byte[] bArr = this.f354033d;
            int i12 = this.f354035f;
            this.f354035f = i12 + 1;
            bArr[i12] = b12;
        } catch (IndexOutOfBoundsException e12) {
            throw new zzur(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f354035f), Integer.valueOf(this.f354034e), 1), e12);
        }
    }

    public final void zzc(byte[] bArr, int i12, int i13) {
        try {
            System.arraycopy(bArr, 0, this.f354033d, this.f354035f, i13);
            this.f354035f += i13;
        } catch (IndexOutOfBoundsException e12) {
            throw new zzur(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f354035f), Integer.valueOf(this.f354034e), Integer.valueOf(i13)), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzd(int i12, boolean z12) throws zzur {
        zzq(i12 << 3);
        zzb(z12 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zze(int i12, zzul zzulVar) {
        zzq((i12 << 3) | 2);
        zzq(zzulVar.zzd());
        zzulVar.e(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzf(int i12, int i13) throws zzur {
        zzq((i12 << 3) | 5);
        zzg(i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzg(int i12) throws zzur {
        try {
            byte[] bArr = this.f354033d;
            int i13 = this.f354035f;
            int i14 = i13 + 1;
            this.f354035f = i14;
            bArr[i13] = (byte) (i12 & 255);
            int i15 = i13 + 2;
            this.f354035f = i15;
            bArr[i14] = (byte) ((i12 >> 8) & 255);
            int i16 = i13 + 3;
            this.f354035f = i16;
            bArr[i15] = (byte) ((i12 >> 16) & 255);
            this.f354035f = i13 + 4;
            bArr[i16] = (byte) ((i12 >> 24) & 255);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzur(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f354035f), Integer.valueOf(this.f354034e), 1), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzh(int i12, long j12) throws zzur {
        zzq((i12 << 3) | 1);
        zzi(j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzi(long j12) throws zzur {
        try {
            byte[] bArr = this.f354033d;
            int i12 = this.f354035f;
            int i13 = i12 + 1;
            this.f354035f = i13;
            bArr[i12] = (byte) (((int) j12) & 255);
            int i14 = i12 + 2;
            this.f354035f = i14;
            bArr[i13] = (byte) (((int) (j12 >> 8)) & 255);
            int i15 = i12 + 3;
            this.f354035f = i15;
            bArr[i14] = (byte) (((int) (j12 >> 16)) & 255);
            int i16 = i12 + 4;
            this.f354035f = i16;
            bArr[i15] = (byte) (((int) (j12 >> 24)) & 255);
            int i17 = i12 + 5;
            this.f354035f = i17;
            bArr[i16] = (byte) (((int) (j12 >> 32)) & 255);
            int i18 = i12 + 6;
            this.f354035f = i18;
            bArr[i17] = (byte) (((int) (j12 >> 40)) & 255);
            int i19 = i12 + 7;
            this.f354035f = i19;
            bArr[i18] = (byte) (((int) (j12 >> 48)) & 255);
            this.f354035f = i12 + 8;
            bArr[i19] = (byte) (((int) (j12 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzur(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f354035f), Integer.valueOf(this.f354034e), 1), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzj(int i12, int i13) throws zzur {
        zzq(i12 << 3);
        zzk(i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzk(int i12) throws zzur {
        if (i12 >= 0) {
            zzq(i12);
        } else {
            zzs(i12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzl(byte[] bArr, int i12, int i13) {
        zzc(bArr, 0, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzm(int i12, String str) throws zzur {
        zzq((i12 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws zzur {
        int i12 = this.f354035f;
        try {
            int iZzw = zzut.zzw(str.length() * 3);
            int iZzw2 = zzut.zzw(str.length());
            int i13 = this.f354034e;
            byte[] bArr = this.f354033d;
            if (iZzw2 != iZzw) {
                zzq(zzyl.c(str));
                int i14 = this.f354035f;
                this.f354035f = zzyl.b(i14, i13 - i14, str, bArr);
            } else {
                int i15 = i12 + iZzw2;
                this.f354035f = i15;
                int iB2 = zzyl.b(i15, i13 - i15, str, bArr);
                this.f354035f = i12;
                zzq((iB2 - i12) - iZzw2);
                this.f354035f = iB2;
            }
        } catch (zzyk e12) {
            this.f354035f = i12;
            zzut.f354036b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(zzvt.f354067a);
            try {
                int length = bytes.length;
                zzq(length);
                zzl(bytes, 0, length);
            } catch (IndexOutOfBoundsException e13) {
                throw new zzur(e13);
            }
        } catch (IndexOutOfBoundsException e14) {
            throw new zzur(e14);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzo(int i12, int i13) {
        zzq((i12 << 3) | i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzp(int i12, int i13) {
        zzq(i12 << 3);
        zzq(i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzq(int i12) {
        while (true) {
            int i13 = i12 & (-128);
            byte[] bArr = this.f354033d;
            if (i13 == 0) {
                int i14 = this.f354035f;
                this.f354035f = i14 + 1;
                bArr[i14] = (byte) i12;
                return;
            } else {
                try {
                    int i15 = this.f354035f;
                    this.f354035f = i15 + 1;
                    bArr[i15] = (byte) ((i12 | 128) & 255);
                    i12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new zzur(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f354035f), Integer.valueOf(this.f354034e), 1), e12);
                }
            }
            throw new zzur(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f354035f), Integer.valueOf(this.f354034e), 1), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzr(int i12, long j12) throws zzur {
        zzq(i12 << 3);
        zzs(j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzut
    public final void zzs(long j12) throws zzur {
        boolean z12 = zzut.f354037c;
        int i12 = this.f354034e;
        byte[] bArr = this.f354033d;
        if (!z12 || i12 - this.f354035f < 10) {
            while ((j12 & (-128)) != 0) {
                try {
                    int i13 = this.f354035f;
                    this.f354035f = i13 + 1;
                    bArr[i13] = (byte) ((((int) j12) | 128) & 255);
                    j12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new zzur(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f354035f), Integer.valueOf(i12), 1), e12);
                }
            }
            int i14 = this.f354035f;
            this.f354035f = i14 + 1;
            bArr[i14] = (byte) j12;
            return;
        }
        while (true) {
            int i15 = (int) j12;
            if ((j12 & (-128)) == 0) {
                int i16 = this.f354035f;
                this.f354035f = i16 + 1;
                zzyg.f354149c.zzd(bArr, zzyg.f354152f + i16, (byte) i15);
                return;
            }
            int i17 = this.f354035f;
            this.f354035f = i17 + 1;
            zzyg.f354149c.zzd(bArr, zzyg.f354152f + i17, (byte) ((i15 | 128) & 255));
            j12 >>>= 7;
        }
    }
}
