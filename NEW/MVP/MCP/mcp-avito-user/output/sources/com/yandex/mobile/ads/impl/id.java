package com.yandex.mobile.ads.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.mobile.ads.impl.vw;
import com.yandex.mobile.ads.impl.x21;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class id implements ru {

    /* renamed from: c, reason: collision with root package name */
    private int f386450c;

    /* renamed from: e, reason: collision with root package name */
    private jd f386452e;

    /* renamed from: h, reason: collision with root package name */
    private long f386455h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private qi f386456i;

    /* renamed from: m, reason: collision with root package name */
    private int f386460m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f386461n;

    /* renamed from: a, reason: collision with root package name */
    private final pr0 f386448a = new pr0(12);

    /* renamed from: b, reason: collision with root package name */
    private final b f386449b = new b(0);

    /* renamed from: d, reason: collision with root package name */
    private tu f386451d = new xr();

    /* renamed from: g, reason: collision with root package name */
    private qi[] f386454g = new qi[0];

    /* renamed from: k, reason: collision with root package name */
    private long f386458k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f386459l = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f386457j = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f386453f = -9223372036854775807L;

    public class a implements x21 {

        /* renamed from: a, reason: collision with root package name */
        private final long f386462a;

        public a(long j12) {
            this.f386462a = j12;
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final long c() {
            return this.f386462a;
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final x21.a b(long j12) {
            x21.a aVarB = id.this.f386454g[0].b(j12);
            for (int i12 = 1; i12 < id.this.f386454g.length; i12++) {
                x21.a aVarB2 = id.this.f386454g[i12].b(j12);
                if (aVarB2.f391532a.f392160b < aVarB.f391532a.f392160b) {
                    aVarB = aVarB2;
                }
            }
            return aVarB;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f386464a;

        /* renamed from: b, reason: collision with root package name */
        public int f386465b;

        /* renamed from: c, reason: collision with root package name */
        public int f386466c;

        private b() {
        }

        public /* synthetic */ b(int i12) {
            this();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f386450c = 0;
        this.f386451d = tuVar;
        this.f386455h = -1L;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        ((to) suVar).b(this.f386448a.c(), 0, 12, false);
        this.f386448a.e(0);
        if (this.f386448a.k() != 1179011410) {
            return false;
        }
        this.f386448a.f(4);
        return this.f386448a.k() == 541677121;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) throws EOFException, InterruptedIOException, tr0 {
        hd next;
        Object obj;
        Object obj2;
        hd next2;
        long j12;
        qi qiVar;
        to toVar = (to) suVar;
        if (a(toVar, fu0Var)) {
            return 1;
        }
        qi qiVar2 = null;
        int i12 = 0;
        switch (this.f386450c) {
            case 0:
                if (a(suVar)) {
                    toVar.a(12);
                    this.f386450c = 1;
                    return 0;
                }
                throw tr0.a("AVI Header List not found", (Exception) null);
            case 1:
                toVar.a(this.f386448a.c(), 0, 12, false);
                this.f386448a.e(0);
                b bVar = this.f386449b;
                pr0 pr0Var = this.f386448a;
                bVar.getClass();
                bVar.f386464a = pr0Var.k();
                bVar.f386465b = pr0Var.k();
                bVar.f386466c = 0;
                if (bVar.f386464a == 1414744396) {
                    bVar.f386466c = pr0Var.k();
                    b bVar2 = this.f386449b;
                    if (bVar2.f386466c == 1819436136) {
                        this.f386457j = bVar2.f386465b;
                        this.f386450c = 2;
                        return 0;
                    }
                    StringBuilder sbA = Cif.a("hdrl expected, found: ");
                    sbA.append(this.f386449b.f386466c);
                    throw tr0.a(sbA.toString(), (Exception) null);
                }
                StringBuilder sbA2 = Cif.a("LIST expected, found: ");
                sbA2.append(bVar.f386464a);
                throw tr0.a(sbA2.toString(), (Exception) null);
            case 2:
                int i13 = this.f386457j - 4;
                pr0 pr0Var2 = new pr0(i13);
                toVar.a(pr0Var2.c(), 0, i13, false);
                k90 k90VarA = k90.a(1819436136, pr0Var2);
                if (k90VarA.getType() == 1819436136) {
                    com.yandex.mobile.ads.embedded.guava.collect.q0<hd> q0VarListIterator = k90VarA.f387087a.listIterator(0);
                    while (true) {
                        if (q0VarListIterator.hasNext()) {
                            next = q0VarListIterator.next();
                            if (next.getClass() == jd.class) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    jd jdVar = (jd) next;
                    if (jdVar != null) {
                        this.f386452e = jdVar;
                        this.f386453f = jdVar.f386842c * jdVar.f386840a;
                        ArrayList arrayList = new ArrayList();
                        com.yandex.mobile.ads.embedded.guava.collect.q0<hd> q0VarListIterator2 = k90VarA.f387087a.listIterator(0);
                        int i14 = 0;
                        while (q0VarListIterator2.hasNext()) {
                            hd next3 = q0VarListIterator2.next();
                            if (next3.getType() == 1819440243) {
                                k90 k90Var = (k90) next3;
                                int i15 = i14 + 1;
                                com.yandex.mobile.ads.embedded.guava.collect.q0<hd> q0VarListIterator3 = k90Var.f387087a.listIterator(i12);
                                while (true) {
                                    if (q0VarListIterator3.hasNext()) {
                                        obj = (hd) q0VarListIterator3.next();
                                        if (obj.getClass() == kd.class) {
                                        }
                                    } else {
                                        obj = qiVar2;
                                    }
                                }
                                kd kdVar = (kd) obj;
                                com.yandex.mobile.ads.embedded.guava.collect.q0<hd> q0VarListIterator4 = k90Var.f387087a.listIterator(i12);
                                while (true) {
                                    if (q0VarListIterator4.hasNext()) {
                                        obj2 = (hd) q0VarListIterator4.next();
                                        if (obj2.getClass() == c71.class) {
                                        }
                                    } else {
                                        obj2 = qiVar2;
                                    }
                                }
                                c71 c71Var = (c71) obj2;
                                if (kdVar == null) {
                                    ka0.d("AviExtractor", "Missing Stream Header");
                                } else if (c71Var == null) {
                                    ka0.d("AviExtractor", "Missing Stream Format");
                                } else {
                                    long jA2 = pc1.a(kdVar.f387108d, kdVar.f387106b * 1000000, kdVar.f387107c);
                                    vw vwVar = c71Var.f384191a;
                                    vw.a aVarA = vwVar.a();
                                    aVarA.h(i14);
                                    int i16 = kdVar.f387109e;
                                    if (i16 != 0) {
                                        aVarA.i(i16);
                                    }
                                    com.yandex.mobile.ads.embedded.guava.collect.q0<hd> q0VarListIterator5 = k90Var.f387087a.listIterator(0);
                                    while (true) {
                                        if (q0VarListIterator5.hasNext()) {
                                            next2 = q0VarListIterator5.next();
                                            if (next2.getClass() == d71.class) {
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                    }
                                    d71 d71Var = (d71) next2;
                                    if (d71Var != null) {
                                        aVarA.d(d71Var.f384538a);
                                    }
                                    int iA2 = qg0.a(vwVar.f391181l);
                                    if (iA2 == 1 || iA2 == 2) {
                                        x91 x91VarA = this.f386451d.a(i14, iA2);
                                        x91VarA.a(aVarA.a());
                                        qi qiVar3 = new qi(i14, iA2, jA2, kdVar.f387108d, x91VarA);
                                        this.f386453f = jA2;
                                        qiVar2 = qiVar3;
                                    } else {
                                        qiVar2 = null;
                                    }
                                }
                                if (qiVar2 != null) {
                                    arrayList.add(qiVar2);
                                }
                                i14 = i15;
                                qiVar2 = null;
                                i12 = 0;
                            }
                        }
                        int i17 = i12;
                        this.f386454g = (qi[]) arrayList.toArray(new qi[i17]);
                        this.f386451d.a();
                        this.f386450c = 3;
                        return i17;
                    }
                    throw tr0.a("AviHeader not found", (Exception) null);
                }
                StringBuilder sbA3 = Cif.a("Unexpected header list type ");
                sbA3.append(k90VarA.getType());
                throw tr0.a(sbA3.toString(), (Exception) null);
            case 3:
                if (this.f386458k != -1) {
                    long position = toVar.getPosition();
                    long j13 = this.f386458k;
                    if (position != j13) {
                        this.f386455h = j13;
                        return 0;
                    }
                }
                toVar.b(this.f386448a.c(), 0, 12, false);
                toVar.c();
                this.f386448a.e(0);
                b bVar3 = this.f386449b;
                pr0 pr0Var3 = this.f386448a;
                bVar3.getClass();
                bVar3.f386464a = pr0Var3.k();
                bVar3.f386465b = pr0Var3.k();
                bVar3.f386466c = 0;
                int iK2 = this.f386448a.k();
                int i18 = this.f386449b.f386464a;
                if (i18 == 1179011410) {
                    toVar.a(12);
                    return 0;
                }
                if (i18 == 1414744396 && iK2 == 1769369453) {
                    long position2 = toVar.getPosition();
                    this.f386458k = position2;
                    this.f386459l = position2 + this.f386449b.f386465b + 8;
                    if (!this.f386461n) {
                        jd jdVar2 = this.f386452e;
                        jdVar2.getClass();
                        if ((jdVar2.f386841b & 16) == 16) {
                            this.f386450c = 4;
                            this.f386455h = this.f386459l;
                            return 0;
                        }
                        this.f386451d.a(new x21.b(this.f386453f, 0L));
                        this.f386461n = true;
                    }
                    this.f386455h = toVar.getPosition() + 12;
                    this.f386450c = 6;
                    return 0;
                }
                this.f386455h = toVar.getPosition() + this.f386449b.f386465b + 8;
                return 0;
            case 4:
                toVar.a(this.f386448a.c(), 0, 8, false);
                this.f386448a.e(0);
                int iK3 = this.f386448a.k();
                int iK4 = this.f386448a.k();
                if (iK3 == 829973609) {
                    this.f386450c = 5;
                    this.f386460m = iK4;
                } else {
                    this.f386455h = toVar.getPosition() + iK4;
                }
                return 0;
            case 5:
                pr0 pr0Var4 = new pr0(this.f386460m);
                toVar.a(pr0Var4.c(), 0, this.f386460m, false);
                if (pr0Var4.a() < 16) {
                    j12 = 0;
                } else {
                    int iD2 = pr0Var4.d();
                    pr0Var4.f(8);
                    long jK2 = pr0Var4.k();
                    long j14 = this.f386458k;
                    j12 = jK2 > j14 ? 0L : 8 + j14;
                    pr0Var4.e(iD2);
                }
                while (pr0Var4.a() >= 16) {
                    int iK5 = pr0Var4.k();
                    int iK6 = pr0Var4.k();
                    long jK3 = pr0Var4.k() + j12;
                    pr0Var4.k();
                    qi[] qiVarArr = this.f386454g;
                    int length = qiVarArr.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 < length) {
                            qiVar = qiVarArr[i19];
                            if (!qiVar.a(iK5)) {
                                i19++;
                            }
                        } else {
                            qiVar = null;
                        }
                    }
                    if (qiVar != null) {
                        if ((iK6 & 16) == 16) {
                            qiVar.a(jK3);
                        }
                        qiVar.b();
                    }
                }
                for (qi qiVar4 : this.f386454g) {
                    qiVar4.a();
                }
                this.f386461n = true;
                this.f386451d.a(new a(this.f386453f));
                this.f386450c = 6;
                this.f386455h = this.f386458k;
                return 0;
            case 6:
                if (toVar.getPosition() >= this.f386459l) {
                    return -1;
                }
                qi qiVar5 = this.f386456i;
                if (qiVar5 != null) {
                    if (!qiVar5.a(toVar)) {
                        return 0;
                    }
                    this.f386456i = null;
                    return 0;
                }
                if ((toVar.getPosition() & 1) == 1) {
                    toVar.a(1);
                }
                toVar.b(this.f386448a.c(), 0, 12, false);
                this.f386448a.e(0);
                int iK7 = this.f386448a.k();
                if (iK7 == 1414744396) {
                    this.f386448a.e(8);
                    toVar.a(this.f386448a.k() == 1769369453 ? 12 : 8);
                    toVar.c();
                    return 0;
                }
                int iK8 = this.f386448a.k();
                if (iK7 == 1263424842) {
                    this.f386455h = toVar.getPosition() + iK8 + 8;
                    return 0;
                }
                toVar.a(8);
                toVar.c();
                qi[] qiVarArr2 = this.f386454g;
                int length2 = qiVarArr2.length;
                int i22 = 0;
                while (true) {
                    if (i22 < length2) {
                        qi qiVar6 = qiVarArr2[i22];
                        if (qiVar6.a(iK7)) {
                            qiVar2 = qiVar6;
                        } else {
                            i22++;
                        }
                    }
                }
                if (qiVar2 == null) {
                    this.f386455h = toVar.getPosition() + iK8;
                    return 0;
                }
                qiVar2.b(iK8);
                this.f386456i = qiVar2;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        this.f386455h = -1L;
        this.f386456i = null;
        for (qi qiVar : this.f386454g) {
            qiVar.c(j12);
        }
        if (j12 == 0) {
            if (this.f386454g.length == 0) {
                this.f386450c = 0;
                return;
            } else {
                this.f386450c = 3;
                return;
            }
        }
        this.f386450c = 6;
    }

    private boolean a(to toVar, fu0 fu0Var) {
        boolean z12;
        if (this.f386455h != -1) {
            long position = toVar.getPosition();
            long j12 = this.f386455h;
            if (j12 >= position && j12 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                toVar.a((int) (j12 - position));
                z12 = false;
            } else {
                fu0Var.f385508a = j12;
                z12 = true;
            }
        } else {
            z12 = false;
        }
        this.f386455h = -1L;
        return z12;
    }
}
