package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.i91;

/* renamed from: com.yandex.mobile.ads.impl.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC39317e extends i91 {

    /* renamed from: b, reason: collision with root package name */
    private final int f384716b;

    /* renamed from: c, reason: collision with root package name */
    private final s31 f384717c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f384718d = false;

    public AbstractC39317e(s31 s31Var) {
        this.f384717c = s31Var;
        this.f384716b = s31Var.a();
    }

    public static Object c(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object d(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final i91.b a(Object obj, i91.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iB2 = b(obj2);
        int iF2 = f(iB2);
        g(iB2).a(obj3, bVar);
        bVar.f386391c += iF2;
        bVar.f386390b = obj;
        return bVar;
    }

    public abstract int b(int i12);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        r0 = r0 - 1;
     */
    @Override // com.yandex.mobile.ads.impl.i91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f384718d
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto Lb
            if (r8 != r2) goto La
            r8 = r3
        La:
            r9 = r1
        Lb:
            int r0 = r6.c(r7)
            int r4 = r6.f(r0)
            com.yandex.mobile.ads.impl.i91 r5 = r6.g(r0)
            int r7 = r7 - r4
            if (r8 != r3) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.b(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L2f
            com.yandex.mobile.ads.impl.s31 r7 = r6.f384717c
            int r7 = r7.d(r0)
            r0 = r7
            goto L33
        L2f:
            if (r0 <= 0) goto L32
            goto L4a
        L32:
            r0 = r1
        L33:
            if (r0 == r1) goto L4c
            com.yandex.mobile.ads.impl.i91 r7 = r6.g(r0)
            boolean r7 = r7.c()
            if (r7 == 0) goto L4c
            if (r9 == 0) goto L48
            com.yandex.mobile.ads.impl.s31 r7 = r6.f384717c
            int r0 = r7.d(r0)
            goto L33
        L48:
            if (r0 <= 0) goto L32
        L4a:
            int r0 = r0 - r2
            goto L33
        L4c:
            if (r0 == r1) goto L5c
            int r7 = r6.f(r0)
            com.yandex.mobile.ads.impl.i91 r8 = r6.g(r0)
            int r8 = r8.b(r9)
            int r8 = r8 + r7
            return r8
        L5c:
            if (r8 != r3) goto L63
            int r7 = r6.b(r9)
            return r7
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC39317e.b(int, int, boolean):int");
    }

    public abstract int b(Object obj);

    public abstract int c(int i12);

    public abstract Object d(int i12);

    public abstract int e(int i12);

    public abstract int f(int i12);

    public abstract i91 g(int i12);

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0036, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0036, code lost:
    
        r0 = r0 + 1;
     */
    @Override // com.yandex.mobile.ads.impl.i91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f384718d
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto Lb
            if (r8 != r3) goto La
            r8 = r2
        La:
            r9 = r1
        Lb:
            int r0 = r6.c(r7)
            int r4 = r6.f(r0)
            com.yandex.mobile.ads.impl.i91 r5 = r6.g(r0)
            int r7 = r7 - r4
            if (r8 != r2) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.a(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L2f
            com.yandex.mobile.ads.impl.s31 r7 = r6.f384717c
            int r7 = r7.a(r0)
            r0 = r7
            goto L36
        L2f:
            int r7 = r6.f384716b
            int r7 = r7 - r3
            if (r0 >= r7) goto L35
            goto L50
        L35:
            r0 = r1
        L36:
            if (r0 == r1) goto L52
            com.yandex.mobile.ads.impl.i91 r7 = r6.g(r0)
            boolean r7 = r7.c()
            if (r7 == 0) goto L52
            if (r9 == 0) goto L4b
            com.yandex.mobile.ads.impl.s31 r7 = r6.f384717c
            int r0 = r7.a(r0)
            goto L36
        L4b:
            int r7 = r6.f384716b
            int r7 = r7 - r3
            if (r0 >= r7) goto L35
        L50:
            int r0 = r0 + r3
            goto L36
        L52:
            if (r0 == r1) goto L62
            int r7 = r6.f(r0)
            com.yandex.mobile.ads.impl.i91 r8 = r6.g(r0)
            int r8 = r8.a(r9)
            int r8 = r8 + r7
            return r8
        L62:
            if (r8 != r2) goto L69
            int r7 = r6.a(r9)
            return r7
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC39317e.a(int, int, boolean):int");
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final int b(boolean z12) {
        int i12 = this.f384716b;
        if (i12 == 0) {
            return -1;
        }
        if (this.f384718d) {
            z12 = false;
        }
        int iC2 = z12 ? this.f384717c.c() : i12 - 1;
        while (g(iC2).c()) {
            if (z12) {
                iC2 = this.f384717c.d(iC2);
            } else {
                iC2 = iC2 > 0 ? iC2 - 1 : -1;
            }
            if (iC2 == -1) {
                return -1;
            }
        }
        return g(iC2).b(z12) + f(iC2);
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final int a(boolean z12) {
        if (this.f384716b == 0) {
            return -1;
        }
        if (this.f384718d) {
            z12 = false;
        }
        int iB2 = z12 ? this.f384717c.b() : 0;
        while (g(iB2).c()) {
            if (z12) {
                iB2 = this.f384717c.a(iB2);
            } else {
                iB2 = iB2 < this.f384716b + (-1) ? iB2 + 1 : -1;
            }
            if (iB2 == -1) {
                return -1;
            }
        }
        return g(iB2).a(z12) + f(iB2);
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final i91.d a(int i12, i91.d dVar, long j12) {
        int iC2 = c(i12);
        int iF2 = f(iC2);
        int iE2 = e(iC2);
        g(iC2).a(i12 - iF2, dVar, j12);
        Object objD = d(iC2);
        if (!i91.d.f386400r.equals(dVar.f386404a)) {
            objD = Pair.create(objD, dVar.f386404a);
        }
        dVar.f386404a = objD;
        dVar.f386418o += iE2;
        dVar.f386419p += iE2;
        return dVar;
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final i91.b a(int i12, i91.b bVar, boolean z12) {
        int iB2 = b(i12);
        int iF2 = f(iB2);
        g(iB2).a(i12 - e(iB2), bVar, z12);
        bVar.f386391c += iF2;
        if (z12) {
            Object objD = d(iB2);
            Object obj = bVar.f386390b;
            obj.getClass();
            bVar.f386390b = Pair.create(objD, obj);
        }
        return bVar;
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final int a(Object obj) {
        int iA2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iB2 = b(obj2);
        if (iB2 == -1 || (iA2 = g(iB2).a(obj3)) == -1) {
            return -1;
        }
        return e(iB2) + iA2;
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final Object a(int i12) {
        int iB2 = b(i12);
        return Pair.create(d(iB2), g(iB2).a(i12 - e(iB2)));
    }
}
