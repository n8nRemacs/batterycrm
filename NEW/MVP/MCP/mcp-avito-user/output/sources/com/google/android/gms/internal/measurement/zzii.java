package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzii extends zzij {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f350848d;

    /* renamed from: e, reason: collision with root package name */
    public int f350849e;

    /* renamed from: f, reason: collision with root package name */
    public int f350850f;

    /* renamed from: g, reason: collision with root package name */
    public int f350851g;

    /* renamed from: h, reason: collision with root package name */
    public int f350852h;

    /* renamed from: i, reason: collision with root package name */
    public int f350853i;

    public zzii(byte[] bArr, int i12, int i13, boolean z12, zzil zzilVar) {
        super();
        this.f350853i = Integer.MAX_VALUE;
        this.f350848d = bArr;
        this.f350849e = i13;
        this.f350851g = 0;
    }

    public final void b() {
        int i12 = this.f350849e + this.f350850f;
        this.f350849e = i12;
        int i13 = this.f350853i;
        if (i12 <= i13) {
            this.f350850f = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f350850f = i14;
        this.f350849e = i12 - i14;
    }

    public final void c(int i12) throws zzjq {
        if (i12 >= 0) {
            int i13 = this.f350849e;
            int i14 = this.f350851g;
            if (i12 <= i13 - i14) {
                this.f350851g = i14 + i12;
                return;
            }
        }
        if (i12 >= 0) {
            throw zzjq.e();
        }
        throw zzjq.c();
    }

    public final long d() throws zzjq {
        long j12 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            int i13 = this.f350851g;
            if (i13 == this.f350849e) {
                throw zzjq.e();
            }
            this.f350851g = i13 + 1;
            j12 |= (r3 & 127) << i12;
            if ((this.f350848d[i13] & 128) == 0) {
                return j12;
            }
        }
        throw new zzjq("CodedInputStream encountered a malformed varint.");
    }

    public final int e() throws zzjq {
        int i12 = this.f350851g;
        if (this.f350849e - i12 < 4) {
            throw zzjq.e();
        }
        this.f350851g = i12 + 4;
        byte[] bArr = this.f350848d;
        return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
    }

    public final int f() {
        int i12;
        int i13 = this.f350851g;
        int i14 = this.f350849e;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f350848d;
            byte b12 = bArr[i13];
            if (b12 >= 0) {
                this.f350851g = i15;
                return b12;
            }
            if (i14 - i15 >= 9) {
                int i16 = i13 + 2;
                int i17 = (bArr[i15] << 7) ^ b12;
                if (i17 < 0) {
                    i12 = i17 ^ (-128);
                } else {
                    int i18 = i13 + 3;
                    int i19 = (bArr[i16] << 14) ^ i17;
                    if (i19 >= 0) {
                        i12 = i19 ^ 16256;
                    } else {
                        int i22 = i13 + 4;
                        int i23 = i19 ^ (bArr[i18] << 21);
                        if (i23 < 0) {
                            i12 = (-2080896) ^ i23;
                        } else {
                            i18 = i13 + 5;
                            byte b13 = bArr[i22];
                            int i24 = (i23 ^ (b13 << 28)) ^ 266354560;
                            if (b13 < 0) {
                                i22 = i13 + 6;
                                if (bArr[i18] < 0) {
                                    i18 = i13 + 7;
                                    if (bArr[i22] < 0) {
                                        i22 = i13 + 8;
                                        if (bArr[i18] < 0) {
                                            i18 = i13 + 9;
                                            if (bArr[i22] < 0) {
                                                int i25 = i13 + 10;
                                                if (bArr[i18] >= 0) {
                                                    i16 = i25;
                                                    i12 = i24;
                                                }
                                            }
                                        }
                                    }
                                }
                                i12 = i24;
                            }
                            i12 = i24;
                        }
                        i16 = i22;
                    }
                    i16 = i18;
                }
                this.f350851g = i16;
                return i12;
            }
        }
        return (int) d();
    }

    public final long g() throws zzjq {
        int i12 = this.f350851g;
        if (this.f350849e - i12 < 8) {
            throw zzjq.e();
        }
        this.f350851g = i12 + 8;
        byte[] bArr = this.f350848d;
        return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
    }

    public final long h() {
        long j12;
        long j13;
        long j14;
        long j15;
        int i12 = this.f350851g;
        int i13 = this.f350849e;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f350848d;
            byte b12 = bArr[i12];
            if (b12 >= 0) {
                this.f350851g = i14;
                return b12;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b12;
                if (i16 < 0) {
                    j12 = i16 ^ (-128);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    if (i18 >= 0) {
                        j12 = i18 ^ 16256;
                        i15 = i17;
                    } else {
                        int i19 = i12 + 4;
                        int i22 = i18 ^ (bArr[i17] << 21);
                        if (i22 < 0) {
                            j15 = (-2080896) ^ i22;
                        } else {
                            long j16 = i22;
                            i15 = i12 + 5;
                            long j17 = j16 ^ (bArr[i19] << 28);
                            if (j17 >= 0) {
                                j14 = 266354560;
                            } else {
                                i19 = i12 + 6;
                                long j18 = j17 ^ (bArr[i15] << 35);
                                if (j18 < 0) {
                                    j13 = -34093383808L;
                                } else {
                                    i15 = i12 + 7;
                                    j17 = j18 ^ (bArr[i19] << 42);
                                    if (j17 >= 0) {
                                        j14 = 4363953127296L;
                                    } else {
                                        i19 = i12 + 8;
                                        j18 = j17 ^ (bArr[i15] << 49);
                                        if (j18 < 0) {
                                            j13 = -558586000294016L;
                                        } else {
                                            i15 = i12 + 9;
                                            long j19 = (j18 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j19 < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i15 = i23;
                                                }
                                            }
                                            j12 = j19;
                                        }
                                    }
                                }
                                j15 = j13 ^ j18;
                            }
                            j12 = j14 ^ j17;
                        }
                        i15 = i19;
                        j12 = j15;
                    }
                }
                this.f350851g = i15;
                return j12;
            }
        }
        return d();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final double zza() {
        return Double.longBitsToDouble(g());
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final float zzb() {
        return Float.intBitsToFloat(e());
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zzc() {
        return this.f350851g;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zzd() {
        return f();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zze() {
        return e();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zzf() {
        return f();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zzg() {
        return e();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zzh() {
        return zzij.zze(f());
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zzi() throws zzjq {
        if (zzt()) {
            this.f350852h = 0;
            return 0;
        }
        int iF2 = f();
        this.f350852h = iF2;
        if ((iF2 >>> 3) != 0) {
            return iF2;
        }
        throw new zzjq("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zzj() {
        return f();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final long zzk() {
        return g();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final long zzl() {
        return h();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final long zzn() {
        return g();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final long zzo() {
        return zzij.zza(h());
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final long zzp() {
        return h();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // com.google.android.gms.internal.measurement.zzij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzhu zzq() throws com.google.android.gms.internal.measurement.zzjq {
        /*
            r4 = this;
            int r0 = r4.f()
            byte[] r1 = r4.f350848d
            if (r0 <= 0) goto L19
            int r2 = r4.f350849e
            int r3 = r4.f350851g
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            com.google.android.gms.internal.measurement.zzhu r1 = com.google.android.gms.internal.measurement.zzhu.zza(r1, r3, r0)
            int r2 = r4.f350851g
            int r2 = r2 + r0
            r4.f350851g = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.measurement.zzhu r0 = com.google.android.gms.internal.measurement.zzhu.zza
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f350849e
            int r3 = r4.f350851g
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f350851g = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = com.google.android.gms.internal.measurement.zzjh.zzb
        L35:
            com.google.android.gms.internal.measurement.zzhu r1 = com.google.android.gms.internal.measurement.zzhu.zza
            com.google.android.gms.internal.measurement.zzie r1 = new com.google.android.gms.internal.measurement.zzie
            r1.<init>(r0)
            return r1
        L3d:
            com.google.android.gms.internal.measurement.zzjq r0 = com.google.android.gms.internal.measurement.zzjq.c()
            throw r0
        L42:
            com.google.android.gms.internal.measurement.zzjq r0 = com.google.android.gms.internal.measurement.zzjq.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzii.zzq():com.google.android.gms.internal.measurement.zzhu");
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final String zzr() throws zzjq {
        int iF2 = f();
        if (iF2 > 0) {
            int i12 = this.f350849e;
            int i13 = this.f350851g;
            if (iF2 <= i12 - i13) {
                String str = new String(this.f350848d, i13, iF2, zzjh.f350896a);
                this.f350851g += iF2;
                return str;
            }
        }
        if (iF2 == 0) {
            return "";
        }
        if (iF2 < 0) {
            throw zzjq.c();
        }
        throw zzjq.e();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final String zzs() throws zzjq {
        int iF2 = f();
        if (iF2 > 0) {
            int i12 = this.f350849e;
            int i13 = this.f350851g;
            if (iF2 <= i12 - i13) {
                String strD = zzmp.d(i13, iF2, this.f350848d);
                this.f350851g += iF2;
                return strD;
            }
        }
        if (iF2 == 0) {
            return "";
        }
        if (iF2 <= 0) {
            throw zzjq.c();
        }
        throw zzjq.e();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final boolean zzt() {
        return this.f350851g == this.f350849e;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final boolean zzu() {
        return h() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zza(int i12) {
        if (i12 < 0) {
            throw zzjq.c();
        }
        int iZzc = i12 + zzc();
        if (iZzc < 0) {
            throw zzjq.d();
        }
        int i13 = this.f350853i;
        if (iZzc > i13) {
            throw zzjq.e();
        }
        this.f350853i = iZzc;
        b();
        return i13;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final void zzb(int i12) throws zzjq {
        if (this.f350852h != i12) {
            throw new zzjq("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final void zzc(int i12) {
        this.f350853i = i12;
        b();
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final boolean zzd(int i12) throws zzjq {
        int iZzi;
        int i13 = i12 & 7;
        int i14 = 0;
        if (i13 == 0) {
            int i15 = this.f350849e - this.f350851g;
            byte[] bArr = this.f350848d;
            if (i15 >= 10) {
                while (i14 < 10) {
                    int i16 = this.f350851g;
                    this.f350851g = i16 + 1;
                    if (bArr[i16] < 0) {
                        i14++;
                    }
                }
                throw new zzjq("CodedInputStream encountered a malformed varint.");
            }
            while (i14 < 10) {
                int i17 = this.f350851g;
                if (i17 == this.f350849e) {
                    throw zzjq.e();
                }
                this.f350851g = i17 + 1;
                if (bArr[i17] < 0) {
                    i14++;
                }
            }
            throw new zzjq("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i13 == 1) {
            c(8);
            return true;
        }
        if (i13 == 2) {
            c(f());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw zzjq.a();
            }
            c(4);
            return true;
        }
        do {
            iZzi = zzi();
            if (iZzi == 0) {
                break;
            }
        } while (zzd(iZzi));
        zzb(((i12 >>> 3) << 3) | 4);
        return true;
    }
}
