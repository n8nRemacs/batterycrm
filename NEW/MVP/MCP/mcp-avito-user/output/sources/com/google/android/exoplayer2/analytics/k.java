package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.y;
import j.P;
import java.util.HashMap;
import java.util.Random;

/* compiled from: DefaultPlaybackSessionManager.java */
/* loaded from: classes6.dex */
public final class k implements m {

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.media3.datasource.k f343788h = new androidx.media3.datasource.k(2);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f343789i = new Random();

    /* renamed from: e, reason: collision with root package name */
    public l f343794e;

    /* renamed from: g, reason: collision with root package name */
    @P
    public String f343796g;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.datasource.k f343793d = f343788h;

    /* renamed from: a, reason: collision with root package name */
    public final s0.d f343790a = new s0.d();

    /* renamed from: b, reason: collision with root package name */
    public final s0.b f343791b = new s0.b();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, a> f343792c = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public s0 f343795f = s0.f345869b;

    /* compiled from: DefaultPlaybackSessionManager.java */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f343797a;

        /* renamed from: b, reason: collision with root package name */
        public int f343798b;

        /* renamed from: c, reason: collision with root package name */
        public long f343799c;

        /* renamed from: d, reason: collision with root package name */
        public final y.b f343800d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f343801e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f343802f;

        public a(String str, int i12, @P y.b bVar) {
            this.f343797a = str;
            this.f343798b = i12;
            this.f343799c = bVar == null ? -1L : bVar.f346699d;
            if (bVar == null || !bVar.a()) {
                return;
            }
            this.f343800d = bVar;
        }

        public final boolean a(b.C10568b c10568b) {
            long j12 = this.f343799c;
            if (j12 == -1) {
                return false;
            }
            y.b bVar = c10568b.f343746d;
            if (bVar == null) {
                return this.f343798b != c10568b.f343745c;
            }
            if (bVar.f346699d > j12) {
                return true;
            }
            y.b bVar2 = this.f343800d;
            if (bVar2 == null) {
                return false;
            }
            s0 s0Var = c10568b.f343744b;
            int iB2 = s0Var.b(bVar.f346696a);
            int iB3 = s0Var.b(bVar2.f346696a);
            if (bVar.f346699d < bVar2.f346699d || iB2 < iB3) {
                return false;
            }
            if (iB2 > iB3) {
                return true;
            }
            boolean zA2 = bVar.a();
            int i12 = bVar2.f346697b;
            if (!zA2) {
                int i13 = bVar.f346700e;
                return i13 == -1 || i13 > i12;
            }
            int i14 = bVar.f346697b;
            if (i14 <= i12) {
                if (i14 != i12) {
                    return false;
                }
                if (bVar.f346698c <= bVar2.f346698c) {
                    return false;
                }
            }
            return true;
        }

        public final boolean b(s0 s0Var, s0 s0Var2) {
            int i12 = this.f343798b;
            if (i12 < s0Var.o()) {
                k kVar = k.this;
                s0Var.n(i12, kVar.f343790a);
                s0.d dVar = kVar.f343790a;
                for (int i13 = dVar.f345894p; i13 <= dVar.f345895q; i13++) {
                    int iB2 = s0Var2.b(s0Var.l(i13));
                    if (iB2 != -1) {
                        i12 = s0Var2.f(iB2, kVar.f343791b, false).f345872d;
                        break;
                    }
                }
                i12 = -1;
            } else if (i12 >= s0Var2.o()) {
                i12 = -1;
            }
            this.f343798b = i12;
            if (i12 == -1) {
                return false;
            }
            y.b bVar = this.f343800d;
            return bVar == null || s0Var2.b(bVar.f346696a) != -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.analytics.k.a a(int r16, @j.P com.google.android.exoplayer2.source.y.b r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.k$a> r3 = r0.f343792c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r4.next()
            com.google.android.exoplayer2.analytics.k$a r8 = (com.google.android.exoplayer2.analytics.k.a) r8
            long r9 = r8.f343799c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L33
            int r9 = r8.f343798b
            if (r1 != r9) goto L33
            if (r2 == 0) goto L33
            long r9 = r2.f346699d
            r8.f343799c = r9
        L33:
            if (r2 != 0) goto L3a
            int r9 = r8.f343798b
            if (r1 != r9) goto L15
            goto L5f
        L3a:
            com.google.android.exoplayer2.source.y$b r9 = r8.f343800d
            long r13 = r2.f346699d
            if (r9 != 0) goto L4d
            boolean r9 = r17.a()
            if (r9 != 0) goto L15
            long r9 = r8.f343799c
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 != 0) goto L15
            goto L5f
        L4d:
            long r11 = r9.f346699d
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.f346697b
            int r11 = r9.f346697b
            if (r10 != r11) goto L15
            int r10 = r2.f346698c
            int r9 = r9.f346698c
            if (r10 != r9) goto L15
        L5f:
            long r9 = r8.f343799c
            r11 = -1
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 == 0) goto L7a
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 >= 0) goto L6c
            goto L7a
        L6c:
            if (r11 != 0) goto L15
            int r9 = com.google.android.exoplayer2.util.U.f348106a
            com.google.android.exoplayer2.source.y$b r9 = r5.f343800d
            if (r9 == 0) goto L15
            com.google.android.exoplayer2.source.y$b r9 = r8.f343800d
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L7a:
            r5 = r8
            r6 = r9
            goto L15
        L7d:
            if (r5 != 0) goto L8f
            androidx.media3.datasource.k r4 = r0.f343793d
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.exoplayer2.analytics.k$a r5 = new com.google.android.exoplayer2.analytics.k$a
            r5.<init>(r4, r1, r2)
            r3.put(r4, r5)
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.k.a(int, com.google.android.exoplayer2.source.y$b):com.google.android.exoplayer2.analytics.k$a");
    }

    public final synchronized String b(s0 s0Var, y.b bVar) {
        return a(s0Var.g(bVar.f346696a, this.f343791b).f345872d, bVar).f343797a;
    }

    @v61.m
    public final void c(b.C10568b c10568b) {
        y.b bVar;
        if (c10568b.f343744b.p()) {
            this.f343796g = null;
            return;
        }
        a aVar = this.f343792c.get(this.f343796g);
        int i12 = c10568b.f343745c;
        y.b bVar2 = c10568b.f343746d;
        this.f343796g = a(i12, bVar2).f343797a;
        d(c10568b);
        if (bVar2 == null || !bVar2.a()) {
            return;
        }
        long j12 = bVar2.f346699d;
        if (aVar != null && aVar.f343799c == j12 && (bVar = aVar.f343800d) != null && bVar.f346697b == bVar2.f346697b && bVar.f346698c == bVar2.f346698c) {
            return;
        }
        a(i12, new y.b(bVar2.f346696a, j12));
        this.f343794e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1.f346699d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(com.google.android.exoplayer2.analytics.b.C10568b r8) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.k.d(com.google.android.exoplayer2.analytics.b$b):void");
    }
}
