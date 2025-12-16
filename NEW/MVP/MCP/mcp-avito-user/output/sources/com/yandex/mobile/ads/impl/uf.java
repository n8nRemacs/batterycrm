package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
public abstract class uf {

    /* renamed from: a, reason: collision with root package name */
    protected final a f390527a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f390528b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    protected c f390529c;

    /* renamed from: d, reason: collision with root package name */
    private final int f390530d;

    public static class a implements x21 {

        /* renamed from: a, reason: collision with root package name */
        private final d f390531a;

        /* renamed from: b, reason: collision with root package name */
        private final long f390532b;

        /* renamed from: c, reason: collision with root package name */
        private final long f390533c = 0;

        /* renamed from: d, reason: collision with root package name */
        private final long f390534d;

        /* renamed from: e, reason: collision with root package name */
        private final long f390535e;

        /* renamed from: f, reason: collision with root package name */
        private final long f390536f;

        /* renamed from: g, reason: collision with root package name */
        private final long f390537g;

        public a(d dVar, long j12, long j13, long j14, long j15, long j16) {
            this.f390531a = dVar;
            this.f390532b = j12;
            this.f390534d = j13;
            this.f390535e = j14;
            this.f390536f = j15;
            this.f390537g = j16;
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final long c() {
            return this.f390532b;
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final x21.a b(long j12) {
            z21 z21Var = new z21(j12, c.a(this.f390531a.a(j12), this.f390533c, this.f390534d, this.f390535e, this.f390536f, this.f390537g));
            return new x21.a(z21Var, z21Var);
        }

        public final long c(long j12) {
            return this.f390531a.a(j12);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f390538a;

        /* renamed from: b, reason: collision with root package name */
        private final long f390539b;

        /* renamed from: c, reason: collision with root package name */
        private final long f390540c;

        /* renamed from: d, reason: collision with root package name */
        private long f390541d;

        /* renamed from: e, reason: collision with root package name */
        private long f390542e;

        /* renamed from: f, reason: collision with root package name */
        private long f390543f;

        /* renamed from: g, reason: collision with root package name */
        private long f390544g;

        /* renamed from: h, reason: collision with root package name */
        private long f390545h;

        public c(long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
            this.f390538a = j12;
            this.f390539b = j13;
            this.f390541d = j14;
            this.f390542e = j15;
            this.f390543f = j16;
            this.f390544g = j17;
            this.f390540c = j18;
            this.f390545h = a(j13, j14, j15, j16, j17, j18);
        }

        public static long a(long j12, long j13, long j14, long j15, long j16, long j17) {
            if (j15 + 1 >= j16 || j13 + 1 >= j14) {
                return j15;
            }
            long j18 = (long) ((j12 - j13) * ((j16 - j15) / (j14 - j13)));
            long j19 = j18 / 20;
            int i12 = pc1.f388768a;
            return Math.max(j15, Math.min(((j18 + j15) - j17) - j19, j16 - 1));
        }

        public static long b(c cVar) {
            return cVar.f390543f;
        }

        public static long c(c cVar) {
            return cVar.f390544g;
        }

        public static long d(c cVar) {
            return cVar.f390545h;
        }

        public static long e(c cVar) {
            return cVar.f390539b;
        }

        public static void b(c cVar, long j12, long j13) {
            cVar.f390541d = j12;
            cVar.f390543f = j13;
            cVar.f390545h = a(cVar.f390539b, j12, cVar.f390542e, j13, cVar.f390544g, cVar.f390540c);
        }

        public static long a(c cVar) {
            return cVar.f390538a;
        }

        public static void a(c cVar, long j12, long j13) {
            cVar.f390542e = j12;
            cVar.f390544g = j13;
            cVar.f390545h = a(cVar.f390539b, cVar.f390541d, j12, cVar.f390543f, j13, cVar.f390540c);
        }
    }

    public interface d {
        long a(long j12);
    }

    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f390546d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f390547a;

        /* renamed from: b, reason: collision with root package name */
        private final long f390548b;

        /* renamed from: c, reason: collision with root package name */
        private final long f390549c;

        private e(int i12, long j12, long j13) {
            this.f390547a = i12;
            this.f390548b = j12;
            this.f390549c = j13;
        }

        public static e a(long j12, long j13) {
            return new e(-1, j12, j13);
        }

        public static e b(long j12, long j13) {
            return new e(-2, j12, j13);
        }

        public static e a(long j12) {
            return new e(0, -9223372036854775807L, j12);
        }
    }

    public interface f {
        e a(to toVar, long j12);

        default void a() {
        }
    }

    public uf(d dVar, f fVar, long j12, long j13, long j14, long j15, long j16, int i12) {
        this.f390528b = fVar;
        this.f390530d = i12;
        this.f390527a = new a(dVar, j12, j13, j14, j15, j16);
    }

    public final a a() {
        return this.f390527a;
    }

    public final boolean b() {
        return this.f390529c != null;
    }

    public final void a(long j12) {
        c cVar = this.f390529c;
        if (cVar == null || c.a(cVar) != j12) {
            this.f390529c = new c(j12, this.f390527a.c(j12), this.f390527a.f390533c, this.f390527a.f390534d, this.f390527a.f390535e, this.f390527a.f390536f, this.f390527a.f390537g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (r5 != r14.getPosition()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        r15.f385508a = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.to r14, com.yandex.mobile.ads.impl.fu0 r15) {
        /*
            r13 = this;
        L0:
            com.yandex.mobile.ads.impl.uf$c r0 = r13.f390529c
            java.lang.Object r0 = com.yandex.mobile.ads.impl.db.b(r0)
            com.yandex.mobile.ads.impl.uf$c r0 = (com.yandex.mobile.ads.impl.uf.c) r0
            long r1 = com.yandex.mobile.ads.impl.uf.c.b(r0)
            long r3 = com.yandex.mobile.ads.impl.uf.c.c(r0)
            long r5 = com.yandex.mobile.ads.impl.uf.c.d(r0)
            long r3 = r3 - r1
            int r7 = r13.f390530d
            long r7 = (long) r7
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r4 = 0
            r7 = 1
            r8 = 0
            if (r3 > 0) goto L33
            r13.f390529c = r4
            com.yandex.mobile.ads.impl.uf$f r0 = r13.f390528b
            r0.a()
            long r3 = r14.getPosition()
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 != 0) goto L30
            r7 = r8
            goto L32
        L30:
            r15.f385508a = r1
        L32:
            return r7
        L33:
            long r1 = r14.getPosition()
            long r1 = r5 - r1
            r9 = 0
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 < 0) goto Lc9
            r11 = 262144(0x40000, double:1.295163E-318)
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 > 0) goto Lc9
            int r1 = (int) r1
            r14.a(r1)
            r14.c()
            com.yandex.mobile.ads.impl.uf$f r1 = r13.f390528b
            long r2 = com.yandex.mobile.ads.impl.uf.c.e(r0)
            com.yandex.mobile.ads.impl.uf$e r1 = r1.a(r14, r2)
            int r2 = com.yandex.mobile.ads.impl.uf.e.a(r1)
            r3 = -3
            if (r2 == r3) goto Lb5
            r3 = -2
            if (r2 == r3) goto La8
            r3 = -1
            if (r2 == r3) goto L9b
            if (r2 != 0) goto L93
            long r2 = com.yandex.mobile.ads.impl.uf.e.c(r1)
            long r5 = r14.getPosition()
            long r2 = r2 - r5
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 < 0) goto L7b
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto L7b
            int r0 = (int) r2
            r14.a(r0)
        L7b:
            r13.f390529c = r4
            com.yandex.mobile.ads.impl.uf$f r0 = r13.f390528b
            r0.a()
            long r0 = com.yandex.mobile.ads.impl.uf.e.c(r1)
            long r2 = r14.getPosition()
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 != 0) goto L90
            r7 = r8
            goto L92
        L90:
            r15.f385508a = r0
        L92:
            return r7
        L93:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Invalid case"
            r14.<init>(r15)
            throw r14
        L9b:
            long r2 = com.yandex.mobile.ads.impl.uf.e.b(r1)
            long r4 = com.yandex.mobile.ads.impl.uf.e.c(r1)
            com.yandex.mobile.ads.impl.uf.c.a(r0, r2, r4)
            goto L0
        La8:
            long r2 = com.yandex.mobile.ads.impl.uf.e.b(r1)
            long r4 = com.yandex.mobile.ads.impl.uf.e.c(r1)
            com.yandex.mobile.ads.impl.uf.c.b(r0, r2, r4)
            goto L0
        Lb5:
            r13.f390529c = r4
            com.yandex.mobile.ads.impl.uf$f r0 = r13.f390528b
            r0.a()
            long r0 = r14.getPosition()
            int r14 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r14 != 0) goto Lc6
            r7 = r8
            goto Lc8
        Lc6:
            r15.f385508a = r5
        Lc8:
            return r7
        Lc9:
            long r0 = r14.getPosition()
            int r14 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r14 != 0) goto Ld3
            r7 = r8
            goto Ld5
        Ld3:
            r15.f385508a = r5
        Ld5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uf.a(com.yandex.mobile.ads.impl.to, com.yandex.mobile.ads.impl.fu0):int");
    }

    public static final class b implements d {
        @Override // com.yandex.mobile.ads.impl.uf.d
        public final long a(long j12) {
            return j12;
        }
    }
}
