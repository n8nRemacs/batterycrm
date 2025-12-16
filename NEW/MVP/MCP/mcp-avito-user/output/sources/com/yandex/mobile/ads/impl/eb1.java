package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.x21;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class eb1 implements ru {

    /* renamed from: a, reason: collision with root package name */
    private final int f384844a;

    /* renamed from: b, reason: collision with root package name */
    private final int f384845b;

    /* renamed from: c, reason: collision with root package name */
    private final List<o91> f384846c;

    /* renamed from: d, reason: collision with root package name */
    private final pr0 f384847d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseIntArray f384848e;

    /* renamed from: f, reason: collision with root package name */
    private final fb1.c f384849f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray<fb1> f384850g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f384851h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f384852i;

    /* renamed from: j, reason: collision with root package name */
    private final db1 f384853j;

    /* renamed from: k, reason: collision with root package name */
    private cb1 f384854k;

    /* renamed from: l, reason: collision with root package name */
    private tu f384855l;

    /* renamed from: m, reason: collision with root package name */
    private int f384856m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f384857n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f384858o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f384859p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    private fb1 f384860q;

    /* renamed from: r, reason: collision with root package name */
    private int f384861r;

    /* renamed from: s, reason: collision with root package name */
    private int f384862s;

    public class a implements v21 {

        /* renamed from: a, reason: collision with root package name */
        private final or0 f384863a = new or0(new byte[4]);

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.v21
        public final void a(o91 o91Var, tu tuVar, fb1.d dVar) {
        }

        @Override // com.yandex.mobile.ads.impl.v21
        public final void a(pr0 pr0Var) {
            if (pr0Var.t() == 0 && (pr0Var.t() & 128) != 0) {
                pr0Var.f(6);
                int iA2 = pr0Var.a() / 4;
                for (int i12 = 0; i12 < iA2; i12++) {
                    or0 or0Var = this.f384863a;
                    pr0Var.a(or0Var.f388623a, 0, 4);
                    or0Var.c(0);
                    int iB2 = this.f384863a.b(16);
                    this.f384863a.d(3);
                    if (iB2 == 0) {
                        this.f384863a.d(13);
                    } else {
                        int iB3 = this.f384863a.b(13);
                        if (eb1.this.f384850g.get(iB3) == null) {
                            eb1.this.f384850g.put(iB3, new w21(eb1.this.new b(iB3)));
                            eb1.e(eb1.this);
                        }
                    }
                }
                if (eb1.this.f384844a != 2) {
                    eb1.this.f384850g.remove(0);
                }
            }
        }
    }

    public class b implements v21 {

        /* renamed from: a, reason: collision with root package name */
        private final or0 f384865a = new or0(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<fb1> f384866b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private final SparseIntArray f384867c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        private final int f384868d;

        public b(int i12) {
            this.f384868d = i12;
        }

        @Override // com.yandex.mobile.ads.impl.v21
        public final void a(o91 o91Var, tu tuVar, fb1.d dVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0256  */
        @Override // com.yandex.mobile.ads.impl.v21
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(com.yandex.mobile.ads.impl.pr0 r24) {
            /*
                Method dump skipped, instructions count: 809
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.eb1.b.a(com.yandex.mobile.ads.impl.pr0):void");
        }
    }

    public eb1(int i12) {
        this(new o91(0L), new mp());
    }

    public static /* synthetic */ void e(eb1 eb1Var) {
        eb1Var.f384856m++;
    }

    public eb1(o91 o91Var, mp mpVar) {
        this.f384849f = (fb1.c) db.a(mpVar);
        this.f384845b = 112800;
        this.f384844a = 1;
        this.f384846c = Collections.singletonList(o91Var);
        this.f384847d = new pr0(0, new byte[9400]);
        this.f384851h = new SparseBooleanArray();
        this.f384852i = new SparseBooleanArray();
        this.f384850g = new SparseArray<>();
        this.f384848e = new SparseIntArray();
        this.f384853j = new db1();
        this.f384855l = tu.f390311a;
        this.f384862s = -1;
        b();
    }

    private void b() {
        this.f384851h.clear();
        this.f384850g.clear();
        SparseArray<fb1> sparseArrayA = this.f384849f.a();
        int size = sparseArrayA.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f384850g.put(sparseArrayA.keyAt(i12), sparseArrayA.valueAt(i12));
        }
        this.f384850g.put(0, new w21(new a()));
        this.f384860q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ru[] a() {
        return new ru[]{new eb1(0)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.yandex.mobile.ads.impl.ru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.yandex.mobile.ads.impl.su r7) {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.pr0 r0 = r6.f384847d
            byte[] r0 = r0.c()
            com.yandex.mobile.ads.impl.to r7 = (com.yandex.mobile.ads.impl.to) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.b(r0, r1, r2, r1)
            r2 = r1
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = r1
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.a(r2)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.eb1.a(com.yandex.mobile.ads.impl.su):boolean");
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f384855l = tuVar;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        cb1 cb1Var;
        db.b(this.f384844a != 2);
        int size = this.f384846c.size();
        for (int i12 = 0; i12 < size; i12++) {
            o91 o91Var = this.f384846c.get(i12);
            boolean z12 = o91Var.c() == -9223372036854775807L;
            if (!z12) {
                long jA2 = o91Var.a();
                z12 = (jA2 == -9223372036854775807L || jA2 == 0 || jA2 == j13) ? false : true;
            }
            if (z12) {
                o91Var.c(j13);
            }
        }
        if (j13 != 0 && (cb1Var = this.f384854k) != null) {
            cb1Var.a(j13);
        }
        this.f384847d.c(0);
        this.f384848e.clear();
        for (int i13 = 0; i13 < this.f384850g.size(); i13++) {
            this.f384850g.valueAt(i13).a();
        }
        this.f384861r = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) throws tr0 {
        to toVar;
        ?? r15;
        ?? r14;
        to toVar2;
        long j12;
        boolean z12;
        boolean z13;
        to toVar3 = (to) suVar;
        long jA2 = toVar3.a();
        if (!this.f384857n) {
            toVar = toVar3;
            r15 = 0;
            r14 = 1;
        } else {
            if (jA2 != -1 && this.f384844a != 2 && !this.f384853j.c()) {
                return this.f384853j.a(toVar3, fu0Var, this.f384862s);
            }
            if (this.f384858o) {
                toVar2 = toVar3;
                j12 = 0;
                z12 = false;
                z13 = true;
            } else {
                this.f384858o = true;
                if (this.f384853j.a() != -9223372036854775807L) {
                    toVar2 = toVar3;
                    j12 = 0;
                    z12 = false;
                    z13 = true;
                    cb1 cb1Var = new cb1(this.f384853j.b(), this.f384853j.a(), jA2, this.f384862s, this.f384845b);
                    this.f384854k = cb1Var;
                    this.f384855l.a(cb1Var.a());
                } else {
                    toVar2 = toVar3;
                    j12 = 0;
                    z12 = false;
                    z13 = true;
                    this.f384855l.a(new x21.b(this.f384853j.a(), 0L));
                }
            }
            if (this.f384859p) {
                this.f384859p = z12;
                a(j12, j12);
                if (toVar2.getPosition() != j12) {
                    fu0Var.f385508a = j12;
                    return z13 ? 1 : 0;
                }
            }
            cb1 cb1Var2 = this.f384854k;
            if (cb1Var2 != null && cb1Var2.b()) {
                return this.f384854k.a(toVar2, fu0Var);
            }
            toVar = toVar2;
            r14 = z13;
            r15 = z12;
        }
        byte[] bArrC = this.f384847d.c();
        if (9400 - this.f384847d.d() < 188) {
            int iA2 = this.f384847d.a();
            if (iA2 > 0) {
                System.arraycopy(bArrC, this.f384847d.d(), bArrC, r15, iA2);
            }
            this.f384847d.a(iA2, bArrC);
        }
        while (this.f384847d.a() < 188) {
            int iE2 = this.f384847d.e();
            int i12 = toVar.read(bArrC, iE2, 9400 - iE2);
            if (i12 == -1) {
                return -1;
            }
            this.f384847d.d(iE2 + i12);
        }
        int iD2 = this.f384847d.d();
        int iE3 = this.f384847d.e();
        byte[] bArrC2 = this.f384847d.c();
        int i13 = iD2;
        while (i13 < iE3 && bArrC2[i13] != 71) {
            i13++;
        }
        this.f384847d.e(i13);
        int i14 = i13 + 188;
        if (i14 > iE3) {
            int i15 = (i13 - iD2) + this.f384861r;
            this.f384861r = i15;
            if (this.f384844a == 2 && i15 > 376) {
                throw tr0.a("Cannot find sync byte. Most likely not a Transport Stream.", (Exception) null);
            }
        } else {
            this.f384861r = r15;
        }
        int iE4 = this.f384847d.e();
        if (i14 > iE4) {
            return r15;
        }
        int iH2 = this.f384847d.h();
        if ((8388608 & iH2) != 0) {
            this.f384847d.e(i14);
            return r15;
        }
        int i16 = (4194304 & iH2) != 0 ? r14 : r15;
        int i17 = (2096896 & iH2) >> 8;
        boolean z14 = (iH2 & 32) != 0 ? r14 : r15;
        fb1 fb1Var = (iH2 & 16) != 0 ? this.f384850g.get(i17) : null;
        if (fb1Var == null) {
            this.f384847d.e(i14);
            return r15;
        }
        if (this.f384844a != 2) {
            int i18 = iH2 & 15;
            int i19 = this.f384848e.get(i17, i18 - 1);
            this.f384848e.put(i17, i18);
            if (i19 == i18) {
                this.f384847d.e(i14);
                return r15;
            }
            if (i18 != ((i19 + r14) & 15)) {
                fb1Var.a();
            }
        }
        if (z14) {
            int iT2 = this.f384847d.t();
            i16 |= (this.f384847d.t() & 64) != 0 ? 2 : r15;
            this.f384847d.f(iT2 - r14);
        }
        boolean z15 = this.f384857n;
        if (this.f384844a == 2 || z15 || !this.f384852i.get(i17, r15)) {
            this.f384847d.d(i14);
            fb1Var.a(i16, this.f384847d);
            this.f384847d.d(iE4);
        }
        if (this.f384844a != 2 && !z15 && this.f384857n && jA2 != -1) {
            this.f384859p = r14;
        }
        this.f384847d.e(i14);
        return r15;
    }
}
