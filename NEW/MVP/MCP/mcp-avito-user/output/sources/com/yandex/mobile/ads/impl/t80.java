package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C39313d;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class t80 implements is {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final String f390096a;

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f390097b;

    /* renamed from: c, reason: collision with root package name */
    private final or0 f390098c;

    /* renamed from: d, reason: collision with root package name */
    private x91 f390099d;

    /* renamed from: e, reason: collision with root package name */
    private String f390100e;

    /* renamed from: f, reason: collision with root package name */
    private vw f390101f;

    /* renamed from: g, reason: collision with root package name */
    private int f390102g;

    /* renamed from: h, reason: collision with root package name */
    private int f390103h;

    /* renamed from: i, reason: collision with root package name */
    private int f390104i;

    /* renamed from: j, reason: collision with root package name */
    private int f390105j;

    /* renamed from: k, reason: collision with root package name */
    private long f390106k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f390107l;

    /* renamed from: m, reason: collision with root package name */
    private int f390108m;

    /* renamed from: n, reason: collision with root package name */
    private int f390109n;

    /* renamed from: o, reason: collision with root package name */
    private int f390110o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f390111p;

    /* renamed from: q, reason: collision with root package name */
    private long f390112q;

    /* renamed from: r, reason: collision with root package name */
    private int f390113r;

    /* renamed from: s, reason: collision with root package name */
    private long f390114s;

    /* renamed from: t, reason: collision with root package name */
    private int f390115t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    private String f390116u;

    public t80(@j.P String str) {
        this.f390096a = str;
        pr0 pr0Var = new pr0(1024);
        this.f390097b = pr0Var;
        this.f390098c = new or0(pr0Var.c());
        this.f390106k = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        this.f390102g = 0;
        this.f390106k = -9223372036854775807L;
        this.f390107l = false;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        this.f390099d = tuVar.a(dVar.c(), 1);
        this.f390100e = dVar.b();
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f390106k = j12;
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(pr0 pr0Var) throws tr0 {
        int i12;
        boolean zF2;
        db.b(this.f390099d);
        while (pr0Var.a() > 0) {
            int i13 = this.f390102g;
            if (i13 != 0) {
                if (i13 == 1) {
                    int iT2 = pr0Var.t();
                    if ((iT2 & 224) == 224) {
                        this.f390105j = iT2;
                        this.f390102g = 2;
                    } else if (iT2 != 86) {
                        this.f390102g = 0;
                    }
                } else if (i13 == 2) {
                    int iT3 = ((this.f390105j & (-225)) << 8) | pr0Var.t();
                    this.f390104i = iT3;
                    if (iT3 > this.f390097b.c().length) {
                        this.f390097b.c(this.f390104i);
                        or0 or0Var = this.f390098c;
                        byte[] bArrC = this.f390097b.c();
                        or0Var.getClass();
                        or0Var.a(bArrC.length, bArrC);
                    }
                    this.f390103h = 0;
                    this.f390102g = 3;
                } else if (i13 == 3) {
                    int iMin = Math.min(pr0Var.a(), this.f390104i - this.f390103h);
                    pr0Var.a(this.f390098c.f388623a, this.f390103h, iMin);
                    int i14 = this.f390103h + iMin;
                    this.f390103h = i14;
                    if (i14 == this.f390104i) {
                        this.f390098c.c(0);
                        or0 or0Var2 = this.f390098c;
                        if (!or0Var2.f()) {
                            this.f390107l = true;
                            int iB2 = or0Var2.b(1);
                            int iB3 = iB2 == 1 ? or0Var2.b(1) : 0;
                            this.f390108m = iB3;
                            if (iB3 == 0) {
                                if (iB2 == 1) {
                                    or0Var2.b((or0Var2.b(2) + 1) * 8);
                                }
                                if (or0Var2.f()) {
                                    this.f390109n = or0Var2.b(6);
                                    int iB4 = or0Var2.b(4);
                                    int iB5 = or0Var2.b(3);
                                    if (iB4 == 0 && iB5 == 0) {
                                        if (iB2 == 0) {
                                            int iE2 = or0Var2.e();
                                            int iB6 = or0Var2.b();
                                            C39313d.a aVarA = C39313d.a(or0Var2, true);
                                            this.f390116u = aVarA.f384500c;
                                            this.f390113r = aVarA.f384498a;
                                            this.f390115t = aVarA.f384499b;
                                            int iB7 = iB6 - or0Var2.b();
                                            or0Var2.c(iE2);
                                            byte[] bArr = new byte[(iB7 + 7) / 8];
                                            or0Var2.a(bArr, iB7);
                                            vw vwVarA = new vw.a().c(this.f390100e).f("audio/mp4a-latm").a(this.f390116u).c(this.f390115t).n(this.f390113r).a(Collections.singletonList(bArr)).e(this.f390096a).a();
                                            if (!vwVarA.equals(this.f390101f)) {
                                                this.f390101f = vwVarA;
                                                this.f390114s = 1024000000 / vwVarA.f391195z;
                                                this.f390099d.a(vwVarA);
                                            }
                                        } else {
                                            int iB8 = or0Var2.b();
                                            C39313d.a aVarA2 = C39313d.a(or0Var2, true);
                                            this.f390116u = aVarA2.f384500c;
                                            this.f390113r = aVarA2.f384498a;
                                            this.f390115t = aVarA2.f384499b;
                                            or0Var2.d(or0Var2.b((or0Var2.b(2) + 1) * 8) - (iB8 - or0Var2.b()));
                                        }
                                        int iB9 = or0Var2.b(3);
                                        this.f390110o = iB9;
                                        if (iB9 == 0) {
                                            or0Var2.d(8);
                                        } else if (iB9 == 1) {
                                            or0Var2.d(9);
                                        } else if (iB9 == 3 || iB9 == 4 || iB9 == 5) {
                                            or0Var2.d(6);
                                        } else {
                                            if (iB9 != 6 && iB9 != 7) {
                                                throw new IllegalStateException();
                                            }
                                            or0Var2.d(1);
                                        }
                                        boolean zF3 = or0Var2.f();
                                        this.f390111p = zF3;
                                        this.f390112q = 0L;
                                        if (zF3) {
                                            if (iB2 == 1) {
                                                this.f390112q = or0Var2.b((or0Var2.b(2) + 1) * 8);
                                            } else {
                                                do {
                                                    zF2 = or0Var2.f();
                                                    this.f390112q = (this.f390112q << 8) + or0Var2.b(8);
                                                } while (zF2);
                                            }
                                        }
                                        if (or0Var2.f()) {
                                            or0Var2.d(8);
                                        }
                                    } else {
                                        throw tr0.a((String) null, (Exception) null);
                                    }
                                } else {
                                    throw tr0.a((String) null, (Exception) null);
                                }
                            } else {
                                throw tr0.a((String) null, (Exception) null);
                            }
                        } else {
                            if (this.f390107l) {
                            }
                            this.f390102g = 0;
                        }
                        if (this.f390108m == 0) {
                            if (this.f390109n == 0) {
                                if (this.f390110o == 0) {
                                    int i15 = 0;
                                    while (true) {
                                        int iB10 = or0Var2.b(8);
                                        i12 = i15 + iB10;
                                        if (iB10 != 255) {
                                            break;
                                        } else {
                                            i15 = i12;
                                        }
                                    }
                                    int iE3 = or0Var2.e();
                                    if ((iE3 & 7) == 0) {
                                        this.f390097b.e(iE3 >> 3);
                                    } else {
                                        or0Var2.a(this.f390097b.c(), i12 * 8);
                                        this.f390097b.e(0);
                                    }
                                    this.f390099d.a(i12, this.f390097b);
                                    long j12 = this.f390106k;
                                    if (j12 != -9223372036854775807L) {
                                        this.f390099d.a(j12, 1, i12, 0, null);
                                        this.f390106k += this.f390114s;
                                    }
                                    if (this.f390111p) {
                                        or0Var2.d((int) this.f390112q);
                                    }
                                    this.f390102g = 0;
                                } else {
                                    throw tr0.a((String) null, (Exception) null);
                                }
                            } else {
                                throw tr0.a((String) null, (Exception) null);
                            }
                        } else {
                            throw tr0.a((String) null, (Exception) null);
                        }
                    } else {
                        continue;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (pr0Var.t() == 86) {
                this.f390102g = 1;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
    }
}
