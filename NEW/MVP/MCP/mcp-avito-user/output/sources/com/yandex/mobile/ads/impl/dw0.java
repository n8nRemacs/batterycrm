package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class dw0 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f384698c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f384699d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f384700e;

    /* renamed from: a, reason: collision with root package name */
    private final o91 f384696a = new o91(0);

    /* renamed from: f, reason: collision with root package name */
    private long f384701f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f384702g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f384703h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f384697b = new pr0();

    public final int a(to toVar, fu0 fu0Var) {
        long j12 = -9223372036854775807L;
        if (!this.f384700e) {
            long jA2 = toVar.a();
            int iMin = (int) Math.min(20000L, jA2);
            long j13 = jA2 - iMin;
            if (toVar.getPosition() != j13) {
                fu0Var.f385508a = j13;
                return 1;
            }
            this.f384697b.c(iMin);
            toVar.c();
            toVar.b(this.f384697b.c(), 0, iMin, false);
            pr0 pr0Var = this.f384697b;
            int iD2 = pr0Var.d();
            int iE2 = pr0Var.e() - 4;
            while (true) {
                if (iE2 < iD2) {
                    break;
                }
                byte[] bArrC = pr0Var.c();
                if (((bArrC[iE2 + 3] & 255) | ((bArrC[iE2] & 255) << 24) | ((bArrC[iE2 + 1] & 255) << 16) | ((bArrC[iE2 + 2] & 255) << 8)) == 442) {
                    pr0Var.e(iE2 + 4);
                    long jA3 = a(pr0Var);
                    if (jA3 != -9223372036854775807L) {
                        j12 = jA3;
                        break;
                    }
                }
                iE2--;
            }
            this.f384702g = j12;
            this.f384700e = true;
            return 0;
        }
        if (this.f384702g == -9223372036854775807L) {
            pr0 pr0Var2 = this.f384697b;
            byte[] bArr = pc1.f388773f;
            pr0Var2.getClass();
            pr0Var2.a(bArr.length, bArr);
            this.f384698c = true;
            toVar.c();
            return 0;
        }
        if (this.f384699d) {
            long j14 = this.f384701f;
            if (j14 == -9223372036854775807L) {
                pr0 pr0Var3 = this.f384697b;
                byte[] bArr2 = pc1.f388773f;
                pr0Var3.getClass();
                pr0Var3.a(bArr2.length, bArr2);
                this.f384698c = true;
                toVar.c();
                return 0;
            }
            long jB2 = this.f384696a.b(this.f384702g) - this.f384696a.b(j14);
            this.f384703h = jB2;
            if (jB2 < 0) {
                StringBuilder sbA = Cif.a("Invalid duration: ");
                sbA.append(this.f384703h);
                sbA.append(". Using TIME_UNSET instead.");
                ka0.d("PsDurationReader", sbA.toString());
                this.f384703h = -9223372036854775807L;
            }
            pr0 pr0Var4 = this.f384697b;
            byte[] bArr3 = pc1.f388773f;
            pr0Var4.getClass();
            pr0Var4.a(bArr3.length, bArr3);
            this.f384698c = true;
            toVar.c();
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, toVar.a());
        long j15 = 0;
        if (toVar.getPosition() != j15) {
            fu0Var.f385508a = j15;
            return 1;
        }
        this.f384697b.c(iMin2);
        toVar.c();
        toVar.b(this.f384697b.c(), 0, iMin2, false);
        pr0 pr0Var5 = this.f384697b;
        int iD3 = pr0Var5.d();
        int iE3 = pr0Var5.e();
        while (true) {
            if (iD3 >= iE3 - 3) {
                break;
            }
            byte[] bArrC2 = pr0Var5.c();
            int i12 = iD3 + 1;
            if (((bArrC2[iD3 + 3] & 255) | ((bArrC2[iD3] & 255) << 24) | ((bArrC2[i12] & 255) << 16) | ((bArrC2[iD3 + 2] & 255) << 8)) == 442) {
                pr0Var5.e(iD3 + 4);
                long jA4 = a(pr0Var5);
                if (jA4 != -9223372036854775807L) {
                    j12 = jA4;
                    break;
                }
            }
            iD3 = i12;
        }
        this.f384701f = j12;
        this.f384699d = true;
        return 0;
    }

    public final o91 b() {
        return this.f384696a;
    }

    public final boolean c() {
        return this.f384698c;
    }

    public final long a() {
        return this.f384703h;
    }

    public static long a(pr0 pr0Var) {
        int iD2 = pr0Var.d();
        if (pr0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        pr0Var.a(bArr, 0, 9);
        pr0Var.e(iD2);
        byte b12 = bArr[0];
        if ((b12 & 196) == 68) {
            byte b13 = bArr[2];
            if ((b13 & 4) == 4) {
                byte b14 = bArr[4];
                if ((b14 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j12 = b12;
                    long j13 = b13;
                    return ((j13 & 3) << 13) | ((j12 & 3) << 28) | (((56 & j12) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j13 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b14 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
