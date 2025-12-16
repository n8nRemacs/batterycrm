package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;

/* loaded from: classes8.dex */
public final class is0 implements fb1 {

    /* renamed from: a, reason: collision with root package name */
    private final is f386674a;

    /* renamed from: b, reason: collision with root package name */
    private final or0 f386675b = new or0(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f386676c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f386677d;

    /* renamed from: e, reason: collision with root package name */
    private o91 f386678e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f386679f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f386680g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f386681h;

    /* renamed from: i, reason: collision with root package name */
    private int f386682i;

    /* renamed from: j, reason: collision with root package name */
    private int f386683j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f386684k;

    /* renamed from: l, reason: collision with root package name */
    private long f386685l;

    public is0(is isVar) {
        this.f386674a = isVar;
    }

    @Override // com.yandex.mobile.ads.impl.fb1
    public final void a(o91 o91Var, tu tuVar, fb1.d dVar) {
        this.f386678e = o91Var;
        this.f386674a.a(tuVar, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.fb1
    public final void a() {
        this.f386676c = 0;
        this.f386677d = 0;
        this.f386681h = false;
        this.f386674a.a();
    }

    @Override // com.yandex.mobile.ads.impl.fb1
    public final void a(int i12, pr0 pr0Var) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        db.b(this.f386678e);
        int i18 = 2;
        int i19 = 3;
        int i22 = -1;
        int i23 = 0;
        if ((i12 & 1) != 0) {
            int i24 = this.f386676c;
            if (i24 != 0 && i24 != 1) {
                if (i24 == 2) {
                    ka0.d("PesReader", "Unexpected start indicator reading extended header");
                } else if (i24 == 3) {
                    if (this.f386683j != -1) {
                        StringBuilder sbA = Cif.a("Unexpected start indicator: expected ");
                        sbA.append(this.f386683j);
                        sbA.append(" more bytes");
                        ka0.d("PesReader", sbA.toString());
                    }
                    this.f386674a.b();
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f386676c = 1;
            this.f386677d = 0;
        }
        int i25 = i12;
        while (pr0Var.a() > 0) {
            int i26 = this.f386676c;
            if (i26 == 0) {
                i13 = i18;
                i14 = i19;
                i15 = i22;
                i16 = i23;
                pr0Var.f(pr0Var.a());
            } else if (i26 == 1) {
                i14 = i19;
                int i27 = i23;
                if (a(9, pr0Var, this.f386675b.f388623a)) {
                    this.f386675b.c(i27);
                    int iB2 = this.f386675b.b(24);
                    if (iB2 != 1) {
                        j90.a("Unexpected start code prefix: ", iB2, "PesReader");
                        this.f386683j = -1;
                        i15 = -1;
                        i17 = 0;
                        i13 = 2;
                    } else {
                        this.f386675b.d(8);
                        int iB3 = this.f386675b.b(16);
                        this.f386675b.d(5);
                        this.f386684k = this.f386675b.f();
                        i13 = 2;
                        this.f386675b.d(2);
                        this.f386679f = this.f386675b.f();
                        this.f386680g = this.f386675b.f();
                        this.f386675b.d(6);
                        int iB4 = this.f386675b.b(8);
                        this.f386682i = iB4;
                        if (iB3 == 0) {
                            this.f386683j = -1;
                            i15 = -1;
                        } else {
                            int i28 = (iB3 - 3) - iB4;
                            this.f386683j = i28;
                            if (i28 < 0) {
                                StringBuilder sbA2 = Cif.a("Found negative packet payload size: ");
                                sbA2.append(this.f386683j);
                                ka0.d("PesReader", sbA2.toString());
                                i15 = -1;
                                this.f386683j = -1;
                            } else {
                                i15 = -1;
                            }
                        }
                        i17 = 2;
                    }
                    this.f386676c = i17;
                    i16 = 0;
                    this.f386677d = 0;
                } else {
                    i16 = i27;
                    i15 = -1;
                    i13 = 2;
                }
            } else if (i26 != i18) {
                if (i26 == i19) {
                    int iA2 = pr0Var.a();
                    int i29 = this.f386683j;
                    int i32 = i29 == i22 ? i23 : iA2 - i29;
                    if (i32 > 0) {
                        iA2 -= i32;
                        pr0Var.d(pr0Var.d() + iA2);
                    }
                    this.f386674a.a(pr0Var);
                    int i33 = this.f386683j;
                    if (i33 != i22) {
                        int i34 = i33 - iA2;
                        this.f386683j = i34;
                        if (i34 == 0) {
                            this.f386674a.b();
                            this.f386676c = 1;
                            this.f386677d = i23;
                        }
                    }
                    i13 = i18;
                    i14 = i19;
                    i15 = i22;
                    i16 = i23;
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(Math.min(10, this.f386682i), pr0Var, this.f386675b.f388623a) && a(this.f386682i, pr0Var, (byte[]) null)) {
                this.f386675b.c(i23);
                this.f386685l = -9223372036854775807L;
                if (this.f386679f) {
                    this.f386675b.d(4);
                    this.f386675b.d(1);
                    this.f386675b.d(1);
                    long jB2 = (this.f386675b.b(15) << 15) | (this.f386675b.b(i19) << 30) | this.f386675b.b(15);
                    this.f386675b.d(1);
                    if (!this.f386681h && this.f386680g) {
                        this.f386675b.d(4);
                        this.f386675b.d(1);
                        this.f386675b.d(1);
                        this.f386675b.d(1);
                        this.f386678e.b((this.f386675b.b(15) << 15) | (this.f386675b.b(i19) << 30) | this.f386675b.b(15));
                        this.f386681h = true;
                    }
                    this.f386685l = this.f386678e.b(jB2);
                }
                i25 |= this.f386684k ? 4 : 0;
                this.f386674a.a(i25, this.f386685l);
                this.f386676c = 3;
                this.f386677d = 0;
                i23 = 0;
                i22 = -1;
                i19 = 3;
                i18 = 2;
            } else {
                i14 = i19;
                i15 = i22;
                i16 = i23;
                i13 = 2;
            }
            i23 = i16;
            i22 = i15;
            i19 = i14;
            i18 = i13;
        }
    }

    private boolean a(int i12, pr0 pr0Var, @j.P byte[] bArr) {
        int iMin = Math.min(pr0Var.a(), i12 - this.f386677d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            pr0Var.f(iMin);
        } else {
            pr0Var.a(bArr, this.f386677d, iMin);
        }
        int i13 = this.f386677d + iMin;
        this.f386677d = i13;
        return i13 == i12;
    }
}
