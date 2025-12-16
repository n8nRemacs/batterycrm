package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.iw;
import com.yandex.mobile.ads.impl.jw;
import com.yandex.mobile.ads.impl.x21;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes8.dex */
public final class hw implements ru {

    /* renamed from: e, reason: collision with root package name */
    private tu f386221e;

    /* renamed from: f, reason: collision with root package name */
    private x91 f386222f;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private Metadata f386224h;

    /* renamed from: i, reason: collision with root package name */
    private mw f386225i;

    /* renamed from: j, reason: collision with root package name */
    private int f386226j;

    /* renamed from: k, reason: collision with root package name */
    private int f386227k;

    /* renamed from: l, reason: collision with root package name */
    private gw f386228l;

    /* renamed from: m, reason: collision with root package name */
    private int f386229m;

    /* renamed from: n, reason: collision with root package name */
    private long f386230n;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f386217a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f386218b = new pr0(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    private final boolean f386219c = false;

    /* renamed from: d, reason: collision with root package name */
    private final iw.a f386220d = new iw.a();

    /* renamed from: g, reason: collision with root package name */
    private int f386223g = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static ru[] a() {
        return new ru[]{new hw()};
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        to toVar = (to) suVar;
        Metadata metadataA = new d20().a(toVar, c20.f384158b);
        if (metadataA != null) {
            metadataA.c();
        }
        pr0 pr0Var = new pr0(4);
        toVar.b(pr0Var.c(), 0, 4, false);
        return pr0Var.v() == 1716281667;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f386221e = tuVar;
        this.f386222f = tuVar.a(0, 1);
        tuVar.a();
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) throws EOFException, InterruptedIOException, tr0 {
        x21 bVar;
        boolean z12;
        long j12;
        boolean zA2;
        boolean z13 = true;
        int i12 = this.f386223g;
        Metadata metadata = null;
        if (i12 == 0) {
            boolean z14 = this.f386219c;
            to toVar = (to) suVar;
            toVar.c();
            long jE2 = toVar.e();
            Metadata metadataA = new d20().a(toVar, !z14 ? null : c20.f384158b);
            if (metadataA != null && metadataA.c() != 0) {
                metadata = metadataA;
            }
            toVar.a((int) (toVar.e() - jE2));
            this.f386224h = metadata;
            this.f386223g = 1;
            return 0;
        }
        if (i12 == 1) {
            byte[] bArr = this.f386217a;
            to toVar2 = (to) suVar;
            toVar2.b(bArr, 0, bArr.length, false);
            toVar2.c();
            this.f386223g = 2;
            return 0;
        }
        if (i12 == 2) {
            pr0 pr0Var = new pr0(4);
            ((to) suVar).a(pr0Var.c(), 0, 4, false);
            if (pr0Var.v() == 1716281667) {
                this.f386223g = 3;
                return 0;
            }
            throw tr0.a("Failed to read FLAC stream marker.", (Exception) null);
        }
        if (i12 == 3) {
            jw.a aVar = new jw.a(this.f386225i);
            boolean zA3 = false;
            while (!zA3) {
                zA3 = jw.a((to) suVar, aVar);
                mw mwVar = aVar.f386984a;
                int i13 = pc1.f388768a;
                this.f386225i = mwVar;
            }
            this.f386225i.getClass();
            this.f386226j = Math.max(this.f386225i.f388100c, 6);
            x91 x91Var = this.f386222f;
            int i14 = pc1.f388768a;
            x91Var.a(this.f386225i.a(this.f386217a, this.f386224h));
            this.f386223g = 4;
            return 0;
        }
        long j13 = 0;
        if (i12 == 4) {
            to toVar3 = (to) suVar;
            toVar3.c();
            pr0 pr0Var2 = new pr0(2);
            toVar3.b(pr0Var2.c(), 0, 2, false);
            int iZ2 = pr0Var2.z();
            if ((iZ2 >> 2) == 16382) {
                toVar3.c();
                this.f386227k = iZ2;
                tu tuVar = this.f386221e;
                int i15 = pc1.f388768a;
                long position = toVar3.getPosition();
                long jA2 = toVar3.a();
                this.f386225i.getClass();
                mw mwVar2 = this.f386225i;
                if (mwVar2.f388108k != null) {
                    bVar = new lw(mwVar2, position);
                } else if (jA2 != -1 && mwVar2.f388107j > 0) {
                    gw gwVar = new gw(mwVar2, this.f386227k, position, jA2);
                    this.f386228l = gwVar;
                    bVar = gwVar.a();
                } else {
                    bVar = new x21.b(mwVar2.b(), 0L);
                }
                tuVar.a(bVar);
                this.f386223g = 5;
                return 0;
            }
            toVar3.c();
            throw tr0.a("First frame does not start with sync code.", (Exception) null);
        }
        if (i12 == 5) {
            this.f386222f.getClass();
            this.f386225i.getClass();
            gw gwVar2 = this.f386228l;
            if (gwVar2 != null && gwVar2.b()) {
                return this.f386228l.a((to) suVar, fu0Var);
            }
            if (this.f386230n == -1) {
                mw mwVar3 = this.f386225i;
                to toVar4 = (to) suVar;
                toVar4.c();
                toVar4.a(false, 1);
                byte[] bArr2 = new byte[1];
                toVar4.b(bArr2, 0, 1, false);
                boolean z15 = (bArr2[0] & 1) == 1;
                toVar4.a(false, 2);
                int i16 = z15 ? 7 : 6;
                pr0 pr0Var3 = new pr0(i16);
                byte[] bArrC = pr0Var3.c();
                int i17 = 0;
                while (i17 < i16) {
                    int iB2 = toVar4.b(bArrC, i17, i16 - i17);
                    if (iB2 == -1) {
                        break;
                    }
                    i17 += iB2;
                }
                pr0Var3.d(i17);
                toVar4.c();
                try {
                    long jA3 = pr0Var3.A();
                    if (!z15) {
                        jA3 *= mwVar3.f388099b;
                    }
                    j13 = jA3;
                } catch (NumberFormatException unused) {
                    z13 = false;
                }
                if (z13) {
                    this.f386230n = j13;
                    return 0;
                }
                throw tr0.a((String) null, (Exception) null);
            }
            int iE2 = this.f386218b.e();
            if (iE2 < 32768) {
                int i18 = ((to) suVar).read(this.f386218b.c(), iE2, 32768 - iE2);
                z12 = i18 == -1;
                if (!z12) {
                    this.f386218b.d(iE2 + i18);
                } else if (this.f386218b.a() == 0) {
                    long j14 = this.f386230n * 1000000;
                    mw mwVar4 = this.f386225i;
                    int i19 = pc1.f388768a;
                    this.f386222f.a(j14 / mwVar4.f388102e, 1, this.f386229m, 0, null);
                    return -1;
                }
            } else {
                z12 = false;
            }
            int iD2 = this.f386218b.d();
            int i22 = this.f386229m;
            int i23 = this.f386226j;
            if (i22 < i23) {
                pr0 pr0Var4 = this.f386218b;
                pr0Var4.f(Math.min(i23 - i22, pr0Var4.a()));
            }
            pr0 pr0Var5 = this.f386218b;
            this.f386225i.getClass();
            int iD3 = pr0Var5.d();
            while (true) {
                if (iD3 <= pr0Var5.e() - 16) {
                    pr0Var5.e(iD3);
                    if (iw.a(pr0Var5, this.f386225i, this.f386227k, this.f386220d)) {
                        pr0Var5.e(iD3);
                        j12 = this.f386220d.f386691a;
                        break;
                    }
                    iD3++;
                } else {
                    if (z12) {
                        while (iD3 <= pr0Var5.e() - this.f386226j) {
                            pr0Var5.e(iD3);
                            try {
                                zA2 = iw.a(pr0Var5, this.f386225i, this.f386227k, this.f386220d);
                            } catch (IndexOutOfBoundsException unused2) {
                                zA2 = false;
                            }
                            if (pr0Var5.d() > pr0Var5.e()) {
                                zA2 = false;
                            }
                            if (zA2) {
                                pr0Var5.e(iD3);
                                j12 = this.f386220d.f386691a;
                                break;
                            }
                            iD3++;
                        }
                        pr0Var5.e(pr0Var5.e());
                    } else {
                        pr0Var5.e(iD3);
                    }
                    j12 = -1;
                }
            }
            int iD4 = this.f386218b.d() - iD2;
            this.f386218b.e(iD2);
            this.f386222f.a(iD4, this.f386218b);
            int i24 = this.f386229m + iD4;
            this.f386229m = i24;
            if (j12 != -1) {
                long j15 = this.f386230n * 1000000;
                mw mwVar5 = this.f386225i;
                int i25 = pc1.f388768a;
                this.f386222f.a(j15 / mwVar5.f388102e, 1, i24, 0, null);
                this.f386229m = 0;
                this.f386230n = j12;
            }
            if (this.f386218b.a() >= 16) {
                return 0;
            }
            int iA2 = this.f386218b.a();
            System.arraycopy(this.f386218b.c(), this.f386218b.d(), this.f386218b.c(), 0, iA2);
            this.f386218b.e(0);
            this.f386218b.d(iA2);
            return 0;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        if (j12 == 0) {
            this.f386223g = 0;
        } else {
            gw gwVar = this.f386228l;
            if (gwVar != null) {
                gwVar.a(j13);
            }
        }
        this.f386230n = j13 != 0 ? -1L : 0L;
        this.f386229m = 0;
        this.f386218b.c(0);
    }
}
