package com.yandex.mobile.ads.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.gc;
import com.yandex.mobile.ads.impl.vw;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class zw implements ru {

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f392353F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G, reason: collision with root package name */
    private static final vw f392354G = new vw.a().f("application/x-emsg").a();

    /* renamed from: A, reason: collision with root package name */
    private boolean f392355A;

    /* renamed from: B, reason: collision with root package name */
    private tu f392356B;

    /* renamed from: C, reason: collision with root package name */
    private x91[] f392357C;

    /* renamed from: D, reason: collision with root package name */
    private x91[] f392358D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f392359E;

    /* renamed from: a, reason: collision with root package name */
    private final List<vw> f392360a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<b> f392361b;

    /* renamed from: c, reason: collision with root package name */
    private final pr0 f392362c;

    /* renamed from: d, reason: collision with root package name */
    private final pr0 f392363d;

    /* renamed from: e, reason: collision with root package name */
    private final pr0 f392364e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f392365f;

    /* renamed from: g, reason: collision with root package name */
    private final pr0 f392366g;

    /* renamed from: h, reason: collision with root package name */
    private final ct f392367h;

    /* renamed from: i, reason: collision with root package name */
    private final pr0 f392368i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<gc.a> f392369j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayDeque<a> f392370k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private final x91 f392371l;

    /* renamed from: m, reason: collision with root package name */
    private int f392372m;

    /* renamed from: n, reason: collision with root package name */
    private int f392373n;

    /* renamed from: o, reason: collision with root package name */
    private long f392374o;

    /* renamed from: p, reason: collision with root package name */
    private int f392375p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    private pr0 f392376q;

    /* renamed from: r, reason: collision with root package name */
    private long f392377r;

    /* renamed from: s, reason: collision with root package name */
    private int f392378s;

    /* renamed from: t, reason: collision with root package name */
    private long f392379t;

    /* renamed from: u, reason: collision with root package name */
    private long f392380u;

    /* renamed from: v, reason: collision with root package name */
    private long f392381v;

    /* renamed from: w, reason: collision with root package name */
    @j.P
    private b f392382w;

    /* renamed from: x, reason: collision with root package name */
    private int f392383x;

    /* renamed from: y, reason: collision with root package name */
    private int f392384y;

    /* renamed from: z, reason: collision with root package name */
    private int f392385z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f392386a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f392387b;

        /* renamed from: c, reason: collision with root package name */
        public final int f392388c;

        public a(int i12, long j12, boolean z12) {
            this.f392386a = j12;
            this.f392387b = z12;
            this.f392388c = i12;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final x91 f392389a;

        /* renamed from: d, reason: collision with root package name */
        public y91 f392392d;

        /* renamed from: e, reason: collision with root package name */
        public ip f392393e;

        /* renamed from: f, reason: collision with root package name */
        public int f392394f;

        /* renamed from: g, reason: collision with root package name */
        public int f392395g;

        /* renamed from: h, reason: collision with root package name */
        public int f392396h;

        /* renamed from: i, reason: collision with root package name */
        public int f392397i;

        /* renamed from: l, reason: collision with root package name */
        private boolean f392400l;

        /* renamed from: b, reason: collision with root package name */
        public final u91 f392390b = new u91();

        /* renamed from: c, reason: collision with root package name */
        public final pr0 f392391c = new pr0();

        /* renamed from: j, reason: collision with root package name */
        private final pr0 f392398j = new pr0(1);

        /* renamed from: k, reason: collision with root package name */
        private final pr0 f392399k = new pr0();

        public b(x91 x91Var, y91 y91Var, ip ipVar) {
            this.f392389a = x91Var;
            this.f392392d = y91Var;
            this.f392393e = ipVar;
            a(y91Var, ipVar);
        }

        public final long c() {
            if (!this.f392400l) {
                return this.f392392d.f391973f[this.f392394f];
            }
            u91 u91Var = this.f392390b;
            return u91Var.f390490i[this.f392394f];
        }

        public final int d() {
            return !this.f392400l ? this.f392392d.f391971d[this.f392394f] : this.f392390b.f390489h[this.f392394f];
        }

        @j.P
        public final t91 e() {
            if (!this.f392400l) {
                return null;
            }
            u91 u91Var = this.f392390b;
            ip ipVar = u91Var.f390482a;
            int i12 = pc1.f388768a;
            int i13 = ipVar.f386662a;
            t91 t91VarA = u91Var.f390494m;
            if (t91VarA == null) {
                t91VarA = this.f392392d.f391968a.a(i13);
            }
            if (t91VarA == null || !t91VarA.f390131a) {
                return null;
            }
            return t91VarA;
        }

        public final boolean f() {
            this.f392394f++;
            if (!this.f392400l) {
                return false;
            }
            int i12 = this.f392395g + 1;
            this.f392395g = i12;
            int[] iArr = this.f392390b.f390488g;
            int i13 = this.f392396h;
            if (i12 != iArr[i13]) {
                return true;
            }
            this.f392396h = i13 + 1;
            this.f392395g = 0;
            return false;
        }

        public final void g() {
            u91 u91Var = this.f392390b;
            u91Var.f390485d = 0;
            u91Var.f390497p = 0L;
            u91Var.f390498q = false;
            u91Var.f390492k = false;
            u91Var.f390496o = false;
            u91Var.f390494m = null;
            this.f392394f = 0;
            this.f392396h = 0;
            this.f392395g = 0;
            this.f392397i = 0;
            this.f392400l = false;
        }

        public final void a(y91 y91Var, ip ipVar) {
            this.f392392d = y91Var;
            this.f392393e = ipVar;
            this.f392389a.a(y91Var.f391968a.f389838f);
            g();
        }

        public final long b() {
            return !this.f392400l ? this.f392392d.f391970c[this.f392394f] : this.f392390b.f390487f[this.f392396h];
        }

        public final int a() {
            int i12;
            if (!this.f392400l) {
                i12 = this.f392392d.f391974g[this.f392394f];
            } else {
                i12 = this.f392390b.f390491j[this.f392394f] ? 1 : 0;
            }
            return e() != null ? i12 | 1073741824 : i12;
        }

        public final int a(int i12, int i13) {
            pr0 pr0Var;
            t91 t91VarE = e();
            if (t91VarE == null) {
                return 0;
            }
            int length = t91VarE.f390134d;
            if (length != 0) {
                pr0Var = this.f392390b.f390495n;
            } else {
                byte[] bArr = t91VarE.f390135e;
                int i14 = pc1.f388768a;
                this.f392399k.a(bArr.length, bArr);
                pr0 pr0Var2 = this.f392399k;
                length = bArr.length;
                pr0Var = pr0Var2;
            }
            u91 u91Var = this.f392390b;
            boolean z12 = u91Var.f390492k && u91Var.f390493l[this.f392394f];
            boolean z13 = z12 || i13 != 0;
            this.f392398j.c()[0] = (byte) ((z13 ? 128 : 0) | length);
            this.f392398j.e(0);
            this.f392389a.b(1, this.f392398j);
            this.f392389a.b(length, pr0Var);
            if (!z13) {
                return length + 1;
            }
            if (!z12) {
                this.f392391c.c(8);
                byte[] bArrC = this.f392391c.c();
                bArrC[0] = 0;
                bArrC[1] = 1;
                bArrC[2] = (byte) ((i13 >> 8) & 255);
                bArrC[3] = (byte) (i13 & 255);
                bArrC[4] = (byte) ((i12 >> 24) & 255);
                bArrC[5] = (byte) ((i12 >> 16) & 255);
                bArrC[6] = (byte) ((i12 >> 8) & 255);
                bArrC[7] = (byte) (i12 & 255);
                this.f392389a.b(8, this.f392391c);
                return length + 9;
            }
            pr0 pr0Var3 = this.f392390b.f390495n;
            int iZ2 = pr0Var3.z();
            pr0Var3.f(-2);
            int i15 = (iZ2 * 6) + 2;
            if (i13 != 0) {
                this.f392391c.c(i15);
                byte[] bArrC2 = this.f392391c.c();
                pr0Var3.a(bArrC2, 0, i15);
                int i16 = (((bArrC2[2] & 255) << 8) | (bArrC2[3] & 255)) + i13;
                bArrC2[2] = (byte) ((i16 >> 8) & 255);
                bArrC2[3] = (byte) (i16 & 255);
                pr0Var3 = this.f392391c;
            }
            this.f392389a.b(i15, pr0Var3);
            return length + 1 + i15;
        }
    }

    public zw(int i12) {
        this(Collections.emptyList());
    }

    @j.P
    public final s91 a(@j.P s91 s91Var) {
        return s91Var;
    }

    public zw(List list) {
        this(list, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ru[] a() {
        return new ru[]{new zw(0)};
    }

    public zw(List list, int i12) {
        this.f392360a = Collections.unmodifiableList(list);
        this.f392371l = null;
        this.f392367h = new ct();
        this.f392368i = new pr0(16);
        this.f392362c = new pr0(lj0.f387520a);
        this.f392363d = new pr0(5);
        this.f392364e = new pr0();
        byte[] bArr = new byte[16];
        this.f392365f = bArr;
        this.f392366g = new pr0(bArr);
        this.f392369j = new ArrayDeque<>();
        this.f392370k = new ArrayDeque<>();
        this.f392361b = new SparseArray<>();
        this.f392380u = -9223372036854775807L;
        this.f392379t = -9223372036854775807L;
        this.f392381v = -9223372036854775807L;
        this.f392356B = tu.f390311a;
        this.f392357C = new x91[0];
        this.f392358D = new x91[0];
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        return m51.a((to) suVar);
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        int i12;
        this.f392356B = tuVar;
        int i13 = 0;
        this.f392372m = 0;
        this.f392375p = 0;
        x91[] x91VarArr = new x91[2];
        this.f392357C = x91VarArr;
        x91 x91Var = this.f392371l;
        if (x91Var != null) {
            x91VarArr[0] = x91Var;
            i12 = 1;
        } else {
            i12 = 0;
        }
        x91[] x91VarArr2 = (x91[]) pc1.a(i12, x91VarArr);
        this.f392357C = x91VarArr2;
        for (x91 x91Var2 : x91VarArr2) {
            x91Var2.a(f392354G);
        }
        this.f392358D = new x91[this.f392360a.size()];
        int i14 = 100;
        while (i13 < this.f392358D.length) {
            int i15 = i14 + 1;
            x91 x91VarA = this.f392356B.a(i14, 3);
            x91VarA.a(this.f392360a.get(i13));
            this.f392358D[i13] = x91VarA;
            i13++;
            i14 = i15;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        int size = this.f392361b.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f392361b.valueAt(i12).g();
        }
        this.f392370k.clear();
        this.f392378s = 0;
        this.f392379t = j13;
        this.f392369j.clear();
        this.f392372m = 0;
        this.f392375p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024d, code lost:
    
        r5.a(r10, r20, r33.f392383x, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0260, code lost:
    
        if (r33.f392370k.isEmpty() != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0262, code lost:
    
        r1 = r33.f392370k.removeFirst();
        r33.f392378s -= r1.f392388c;
        r3 = r1.f392386a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0275, code lost:
    
        if (r1.f392387b == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0277, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0278, code lost:
    
        r5 = r33.f392357C;
        r7 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x027c, code lost:
    
        if (r8 >= r7) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x027e, code lost:
    
        r5[r8].a(r3, 1, r1.f392388c, r33.f392378s, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0299, code lost:
    
        if (r2.f() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029b, code lost:
    
        r33.f392382w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x029d, code lost:
    
        r33.f392372m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02a1, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r33.f392372m != 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        r3 = r2.d();
        r33.f392383x = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (r2.f392394f >= r2.f392397i) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        ((com.yandex.mobile.ads.impl.to) r34).a(r3);
        r1 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r3 = r2.f392390b.f390495n;
        r1 = r1.f390134d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        r3.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        r1 = r2.f392390b;
        r5 = r2.f392394f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
    
        if (r1.f390492k == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        if (r1.f390493l[r5] == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
    
        r3.f(r3.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r2.f() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        r33.f392382w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
    
        r33.f392372m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        if (r2.f392392d.f391968a.f389839g != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
    
        r33.f392383x = r3 - 8;
        ((com.yandex.mobile.ads.impl.to) r34).a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0106, code lost:
    
        if ("audio/ac4".equals(r2.f392392d.f391968a.f389838f.f391181l) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
    
        r33.f392384y = r2.a(r33.f392383x, 7);
        com.yandex.mobile.ads.impl.C39341l.a(r33.f392383x, r33.f392366g);
        r2.f392389a.a(7, r33.f392366g);
        r33.f392384y += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
    
        r33.f392384y = r2.a(r33.f392383x, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
    
        r33.f392383x += r33.f392384y;
        r33.f392372m = 4;
        r33.f392385z = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
    
        r3 = r2.f392392d.f391968a;
        r5 = r2.f392389a;
        r10 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
    
        if (r3.f389842j == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0147, code lost:
    
        r7 = r33.f392363d.c();
        r7[0] = 0;
        r7[1] = 0;
        r7[2] = 0;
        r13 = r3.f389842j;
        r14 = r13 + 1;
        r13 = 4 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015f, code lost:
    
        if (r33.f392384y >= r33.f392383x) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        r12 = r33.f392385z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
    
        if (r12 != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
    
        ((com.yandex.mobile.ads.impl.to) r34).a(r7, r13, r14, r9);
        r33.f392363d.e(r9);
        r12 = r33.f392363d.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0178, code lost:
    
        if (r12 < r8) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
    
        r33.f392385z = r12 - 1;
        r33.f392362c.e(r9);
        r5.a(4, r33.f392362c);
        r5.a(r8, r33.f392363d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0191, code lost:
    
        if (r33.f392358D.length <= 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
    
        r12 = r3.f389838f.f391181l;
        r17 = r7[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019f, code lost:
    
        if ("video/avc".equals(r12) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a3, code lost:
    
        if ((r17 & 31) == r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a9, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b4, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b5, code lost:
    
        r33.f392355A = r9;
        r33.f392384y += 5;
        r33.f392383x += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c2, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cb, code lost:
    
        throw com.yandex.mobile.ads.impl.tr0.a("Invalid NAL length", (java.lang.Exception) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ce, code lost:
    
        if (r33.f392355A == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d0, code lost:
    
        r33.f392364e.c(r12);
        ((com.yandex.mobile.ads.impl.to) r34).a(r33.f392364e.c(), 0, r33.f392385z, false);
        r5.a(r33.f392385z, r33.f392364e);
        r4 = r33.f392385z;
        r8 = com.yandex.mobile.ads.impl.lj0.a(r33.f392364e.e(), r33.f392364e.c());
        r33.f392364e.e("video/hevc".equals(r3.f389838f.f391181l) ? 1 : 0);
        r33.f392364e.d(r8);
        com.yandex.mobile.ads.impl.ii.a(r10, r33.f392364e, r33.f392358D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0217, code lost:
    
        r4 = r5.b(r34, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021d, code lost:
    
        r33.f392384y += r4;
        r33.f392385z -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022a, code lost:
    
        r3 = r33.f392384y;
        r4 = r33.f392383x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022e, code lost:
    
        if (r3 >= r4) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0230, code lost:
    
        r33.f392384y += r5.b(r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023c, code lost:
    
        r20 = r2.a();
        r1 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0244, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0246, code lost:
    
        r23 = r1.f390133c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024b, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    @Override // com.yandex.mobile.ads.impl.ru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.su r34, com.yandex.mobile.ads.impl.fu0 r35) throws java.io.EOFException, java.io.InterruptedIOException, com.yandex.mobile.ads.impl.tr0 {
        /*
            Method dump skipped, instructions count: 1872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zw.a(com.yandex.mobile.ads.impl.su, com.yandex.mobile.ads.impl.fu0):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x0627, code lost:
    
        r1 = r0;
        r1.f392372m = 0;
        r1.f392375p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x062d, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(long r52) throws com.yandex.mobile.ads.impl.tr0 {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zw.a(long):void");
    }

    private void a(gc.a aVar) {
        ip ipVar;
        ip ipVar2;
        DrmInitData drmInitDataA = a(aVar.f385632c);
        gc.a aVarC = aVar.c(1836475768);
        aVarC.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = aVarC.f385632c.size();
        long jV2 = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            gc.b bVar = (gc.b) aVarC.f385632c.get(i12);
            int i13 = bVar.f385630a;
            if (i13 == 1953654136) {
                pr0 pr0Var = bVar.f385634b;
                pr0Var.e(12);
                Pair pairCreate = Pair.create(Integer.valueOf(pr0Var.h()), new ip(pr0Var.h() - 1, pr0Var.h(), pr0Var.h(), pr0Var.h()));
                sparseArray.put(((Integer) pairCreate.first).intValue(), (ip) pairCreate.second);
            } else if (i13 == 1835362404) {
                pr0 pr0Var2 = bVar.f385634b;
                pr0Var2.e(8);
                jV2 = gc.b(pr0Var2.h()) == 0 ? pr0Var2.v() : pr0Var2.y();
            }
        }
        ArrayList arrayListA = hc.a(aVar, new oy(), jV2, drmInitDataA, false, false, new G0(this, 15));
        int size2 = arrayListA.size();
        if (this.f392361b.size() == 0) {
            for (int i14 = 0; i14 < size2; i14++) {
                y91 y91Var = (y91) arrayListA.get(i14);
                s91 s91Var = y91Var.f391968a;
                x91 x91VarA = this.f392356B.a(i14, s91Var.f389834b);
                int i15 = s91Var.f389833a;
                if (sparseArray.size() == 1) {
                    ipVar2 = (ip) sparseArray.valueAt(0);
                } else {
                    ipVar2 = (ip) sparseArray.get(i15);
                    ipVar2.getClass();
                }
                this.f392361b.put(s91Var.f389833a, new b(x91VarA, y91Var, ipVar2));
                this.f392380u = Math.max(this.f392380u, s91Var.f389837e);
            }
            this.f392356B.a();
            return;
        }
        db.b(this.f392361b.size() == size2);
        for (int i16 = 0; i16 < size2; i16++) {
            y91 y91Var2 = (y91) arrayListA.get(i16);
            s91 s91Var2 = y91Var2.f391968a;
            b bVar2 = this.f392361b.get(s91Var2.f389833a);
            int i17 = s91Var2.f389833a;
            if (sparseArray.size() == 1) {
                ipVar = (ip) sparseArray.valueAt(0);
            } else {
                ipVar = (ip) sparseArray.get(i17);
                ipVar.getClass();
            }
            bVar2.a(y91Var2, ipVar);
        }
    }

    private static void a(pr0 pr0Var, int i12, u91 u91Var) throws tr0 {
        pr0Var.e(i12 + 8);
        int iH2 = pr0Var.h();
        if ((iH2 & 1) == 0) {
            boolean z12 = (iH2 & 2) != 0;
            int iX2 = pr0Var.x();
            if (iX2 == 0) {
                Arrays.fill(u91Var.f390493l, 0, u91Var.f390486e, false);
                return;
            }
            if (iX2 == u91Var.f390486e) {
                Arrays.fill(u91Var.f390493l, 0, iX2, z12);
                u91Var.f390495n.c(pr0Var.a());
                u91Var.f390492k = true;
                u91Var.f390496o = true;
                pr0Var.a(u91Var.f390495n.c(), 0, u91Var.f390495n.e());
                u91Var.f390495n.e(0);
                u91Var.f390496o = false;
                return;
            }
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(iX2, "Senc sample count ", " is different from fragment sample count");
            sbJ.append(u91Var.f390486e);
            throw tr0.a(sbJ.toString(), (Exception) null);
        }
        throw tr0.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @j.P
    private static DrmInitData a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i12 = 0; i12 < size; i12++) {
            gc.b bVar = (gc.b) arrayList.get(i12);
            if (bVar.f385630a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArrC = bVar.f385634b.c();
                UUID uuidC = fw0.c(bArrC);
                if (uuidC == null) {
                    ka0.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuidC, null, "video/mp4", bArrC));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(arrayList2);
    }
}
