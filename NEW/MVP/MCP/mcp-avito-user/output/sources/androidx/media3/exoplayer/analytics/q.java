package androidx.media3.exoplayer.analytics;

import androidx.media3.common.P;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.analytics.b;
import androidx.media3.exoplayer.source.A;
import j.P;
import java.util.HashMap;
import java.util.Random;

/* compiled from: DefaultPlaybackSessionManager.java */
@J
/* loaded from: classes.dex */
public final class q implements t {

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.media3.datasource.k f48701i = new androidx.media3.datasource.k(1);

    /* renamed from: j, reason: collision with root package name */
    public static final Random f48702j = new Random();

    /* renamed from: e, reason: collision with root package name */
    public s f48707e;

    /* renamed from: g, reason: collision with root package name */
    @P
    public String f48709g;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.datasource.k f48706d = f48701i;

    /* renamed from: a, reason: collision with root package name */
    public final P.d f48703a = new P.d();

    /* renamed from: b, reason: collision with root package name */
    public final P.b f48704b = new P.b();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, a> f48705c = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public androidx.media3.common.P f48708f = androidx.media3.common.P.f47368b;

    /* renamed from: h, reason: collision with root package name */
    public long f48710h = -1;

    /* compiled from: DefaultPlaybackSessionManager.java */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f48711a;

        /* renamed from: b, reason: collision with root package name */
        public int f48712b;

        /* renamed from: c, reason: collision with root package name */
        public long f48713c;

        /* renamed from: d, reason: collision with root package name */
        public final A.b f48714d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f48715e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f48716f;

        public a(String str, int i12, @j.P A.b bVar) {
            this.f48711a = str;
            this.f48712b = i12;
            this.f48713c = bVar == null ? -1L : bVar.f47215d;
            if (bVar == null || !bVar.a()) {
                return;
            }
            this.f48714d = bVar;
        }

        public final boolean a(b.C1823b c1823b) {
            A.b bVar = c1823b.f48635d;
            if (bVar == null) {
                return this.f48712b != c1823b.f48634c;
            }
            long j12 = this.f48713c;
            if (j12 == -1) {
                return false;
            }
            if (bVar.f47215d > j12) {
                return true;
            }
            A.b bVar2 = this.f48714d;
            if (bVar2 == null) {
                return false;
            }
            androidx.media3.common.P p12 = c1823b.f48633b;
            int iG2 = p12.g(bVar.f47212a);
            int iG3 = p12.g(bVar2.f47212a);
            if (bVar.f47215d < bVar2.f47215d || iG2 < iG3) {
                return false;
            }
            if (iG2 > iG3) {
                return true;
            }
            boolean zA2 = bVar.a();
            int i12 = bVar2.f47213b;
            if (!zA2) {
                int i13 = bVar.f47216e;
                return i13 == -1 || i13 > i12;
            }
            int i14 = bVar.f47213b;
            if (i14 > i12) {
                return true;
            }
            if (i14 == i12) {
                if (bVar.f47214c > bVar2.f47214c) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(androidx.media3.common.P p12, androidx.media3.common.P p13) {
            int i12 = this.f48712b;
            if (i12 < p12.w()) {
                q qVar = q.this;
                p12.v(i12, qVar.f48703a);
                P.d dVar = qVar.f48703a;
                for (int i13 = dVar.f47421p; i13 <= dVar.f47422q; i13++) {
                    int iG2 = p13.g(p12.t(i13));
                    if (iG2 != -1) {
                        i12 = p13.n(iG2, qVar.f48704b, false).f47381d;
                        break;
                    }
                }
                i12 = -1;
            } else if (i12 >= p13.w()) {
                i12 = -1;
            }
            this.f48712b = i12;
            if (i12 == -1) {
                return false;
            }
            A.b bVar = this.f48714d;
            return bVar == null || p13.g(bVar.f47212a) != -1;
        }
    }

    public final void a(a aVar) {
        long j12 = aVar.f48713c;
        if (j12 != -1) {
            this.f48710h = j12;
        }
        this.f48709g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.exoplayer.analytics.q.a b(int r16, @j.P androidx.media3.exoplayer.source.A.b r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap<java.lang.String, androidx.media3.exoplayer.analytics.q$a> r3 = r0.f48705c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r4.next()
            androidx.media3.exoplayer.analytics.q$a r8 = (androidx.media3.exoplayer.analytics.q.a) r8
            long r9 = r8.f48713c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.f48712b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            androidx.media3.exoplayer.analytics.q r9 = androidx.media3.exoplayer.analytics.q.this
            java.util.HashMap<java.lang.String, androidx.media3.exoplayer.analytics.q$a> r10 = r9.f48705c
            java.lang.String r13 = r9.f48709g
            java.lang.Object r10 = r10.get(r13)
            androidx.media3.exoplayer.analytics.q$a r10 = (androidx.media3.exoplayer.analytics.q.a) r10
            if (r10 == 0) goto L44
            long r13 = r10.f48713c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.f48710h
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.f47215d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.f48713c = r9
        L51:
            if (r2 != 0) goto L58
            int r9 = r8.f48712b
            if (r1 != r9) goto L15
            goto L7d
        L58:
            androidx.media3.exoplayer.source.A$b r9 = r8.f48714d
            long r13 = r2.f47215d
            if (r9 != 0) goto L6b
            boolean r9 = r17.a()
            if (r9 != 0) goto L15
            long r9 = r8.f48713c
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 != 0) goto L15
            goto L7d
        L6b:
            long r11 = r9.f47215d
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.f47213b
            int r11 = r9.f47213b
            if (r10 != r11) goto L15
            int r10 = r2.f47214c
            int r9 = r9.f47214c
            if (r10 != r9) goto L15
        L7d:
            long r9 = r8.f48713c
            r11 = -1
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 == 0) goto L99
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 >= 0) goto L8a
            goto L99
        L8a:
            if (r11 != 0) goto L15
            int r9 = androidx.media3.common.util.M.f47887a
            androidx.media3.exoplayer.source.A$b r9 = r5.f48714d
            if (r9 == 0) goto L15
            androidx.media3.exoplayer.source.A$b r9 = r8.f48714d
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L99:
            r5 = r8
            r6 = r9
            goto L15
        L9d:
            if (r5 != 0) goto Laf
            androidx.media3.datasource.k r4 = r0.f48706d
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            androidx.media3.exoplayer.analytics.q$a r5 = new androidx.media3.exoplayer.analytics.q$a
            r5.<init>(r4, r1, r2)
            r3.put(r4, r5)
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.q.b(int, androidx.media3.exoplayer.source.A$b):androidx.media3.exoplayer.analytics.q$a");
    }

    public final synchronized String c(androidx.media3.common.P p12, A.b bVar) {
        return b(p12.o(bVar.f47212a, this.f48704b).f47381d, bVar).f48711a;
    }

    @v61.m
    public final void d(b.C1823b c1823b) {
        A.b bVar;
        boolean zX2 = c1823b.f48633b.x();
        HashMap<String, a> map = this.f48705c;
        if (zX2) {
            String str = this.f48709g;
            if (str != null) {
                a aVar = map.get(str);
                aVar.getClass();
                a(aVar);
                return;
            }
            return;
        }
        a aVar2 = map.get(this.f48709g);
        int i12 = c1823b.f48634c;
        A.b bVar2 = c1823b.f48635d;
        this.f48709g = b(i12, bVar2).f48711a;
        e(c1823b);
        if (bVar2 == null || !bVar2.a()) {
            return;
        }
        long j12 = bVar2.f47215d;
        if (aVar2 != null && aVar2.f48713c == j12 && (bVar = aVar2.f48714d) != null && bVar.f47213b == bVar2.f47213b && bVar.f47214c == bVar2.f47214c) {
            return;
        }
        b(i12, new A.b(bVar2.f47212a, j12));
        this.f48707e.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b3, B:42:0x00b7, B:43:0x00be, B:45:0x00c8, B:47:0x00cc, B:49:0x00d9, B:52:0x00e0), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(androidx.media3.exoplayer.analytics.b.C1823b r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.q.e(androidx.media3.exoplayer.analytics.b$b):void");
    }
}
