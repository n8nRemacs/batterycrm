package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class db1 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f384565d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f384566e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f384567f;

    /* renamed from: a, reason: collision with root package name */
    private final int f384562a = 112800;

    /* renamed from: b, reason: collision with root package name */
    private final o91 f384563b = new o91(0);

    /* renamed from: g, reason: collision with root package name */
    private long f384568g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f384569h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f384570i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final pr0 f384564c = new pr0();

    public final long a() {
        return this.f384570i;
    }

    public final o91 b() {
        return this.f384563b;
    }

    public final boolean c() {
        return this.f384565d;
    }

    public final int a(to toVar, fu0 fu0Var, int i12) {
        if (i12 <= 0) {
            pr0 pr0Var = this.f384564c;
            byte[] bArr = pc1.f388773f;
            pr0Var.getClass();
            pr0Var.a(bArr.length, bArr);
            this.f384565d = true;
            toVar.c();
            return 0;
        }
        long j12 = -9223372036854775807L;
        if (!this.f384567f) {
            long jA2 = toVar.a();
            int iMin = (int) Math.min(this.f384562a, jA2);
            long j13 = jA2 - iMin;
            if (toVar.getPosition() != j13) {
                fu0Var.f385508a = j13;
                return 1;
            }
            this.f384564c.c(iMin);
            toVar.c();
            toVar.b(this.f384564c.c(), 0, iMin, false);
            pr0 pr0Var2 = this.f384564c;
            int iD2 = pr0Var2.d();
            int iE2 = pr0Var2.e();
            int i13 = iE2 - 188;
            while (true) {
                if (i13 < iD2) {
                    break;
                }
                byte[] bArrC = pr0Var2.c();
                int i14 = -4;
                int i15 = 0;
                while (true) {
                    if (i14 > 4) {
                        break;
                    }
                    int i16 = (i14 * 188) + i13;
                    if (i16 < iD2 || i16 >= iE2 || bArrC[i16] != 71) {
                        i15 = 0;
                    } else {
                        i15++;
                        if (i15 == 5) {
                            long jA3 = gb1.a(i13, i12, pr0Var2);
                            if (jA3 != -9223372036854775807L) {
                                j12 = jA3;
                                break;
                            }
                        }
                    }
                    i14++;
                }
                i13--;
            }
            this.f384569h = j12;
            this.f384567f = true;
            return 0;
        }
        if (this.f384569h == -9223372036854775807L) {
            pr0 pr0Var3 = this.f384564c;
            byte[] bArr2 = pc1.f388773f;
            pr0Var3.getClass();
            pr0Var3.a(bArr2.length, bArr2);
            this.f384565d = true;
            toVar.c();
            return 0;
        }
        if (!this.f384566e) {
            int iMin2 = (int) Math.min(this.f384562a, toVar.a());
            long j14 = 0;
            if (toVar.getPosition() != j14) {
                fu0Var.f385508a = j14;
                return 1;
            }
            this.f384564c.c(iMin2);
            toVar.c();
            toVar.b(this.f384564c.c(), 0, iMin2, false);
            pr0 pr0Var4 = this.f384564c;
            int iD3 = pr0Var4.d();
            int iE3 = pr0Var4.e();
            while (true) {
                if (iD3 >= iE3) {
                    break;
                }
                if (pr0Var4.c()[iD3] == 71) {
                    long jA4 = gb1.a(iD3, i12, pr0Var4);
                    if (jA4 != -9223372036854775807L) {
                        j12 = jA4;
                        break;
                    }
                }
                iD3++;
            }
            this.f384568g = j12;
            this.f384566e = true;
            return 0;
        }
        long j15 = this.f384568g;
        if (j15 == -9223372036854775807L) {
            pr0 pr0Var5 = this.f384564c;
            byte[] bArr3 = pc1.f388773f;
            pr0Var5.getClass();
            pr0Var5.a(bArr3.length, bArr3);
            this.f384565d = true;
            toVar.c();
            return 0;
        }
        long jB2 = this.f384563b.b(this.f384569h) - this.f384563b.b(j15);
        this.f384570i = jB2;
        if (jB2 < 0) {
            StringBuilder sbA = Cif.a("Invalid duration: ");
            sbA.append(this.f384570i);
            sbA.append(". Using TIME_UNSET instead.");
            ka0.d("TsDurationReader", sbA.toString());
            this.f384570i = -9223372036854775807L;
        }
        pr0 pr0Var6 = this.f384564c;
        byte[] bArr4 = pc1.f388773f;
        pr0Var6.getClass();
        pr0Var6.a(bArr4.length, bArr4);
        this.f384565d = true;
        toVar.c();
        return 0;
    }
}
