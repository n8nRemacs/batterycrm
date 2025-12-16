package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.common.C23108t;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.InterfaceC23102m;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.drm.g;
import androidx.media3.exoplayer.source.M;
import androidx.media3.extractor.J;
import j.InterfaceC42153i;
import java.io.EOFException;

/* compiled from: SampleQueue.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public class O implements androidx.media3.extractor.J {

    /* renamed from: A, reason: collision with root package name */
    @j.P
    public C23108t f49611A;

    /* renamed from: B, reason: collision with root package name */
    @j.P
    public C23108t f49612B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f49613C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f49614D;

    /* renamed from: a, reason: collision with root package name */
    public final M f49615a;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final androidx.media3.exoplayer.drm.g f49618d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final f.a f49619e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public d f49620f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public C23108t f49621g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public DrmSession f49622h;

    /* renamed from: p, reason: collision with root package name */
    public int f49630p;

    /* renamed from: q, reason: collision with root package name */
    public int f49631q;

    /* renamed from: r, reason: collision with root package name */
    public int f49632r;

    /* renamed from: s, reason: collision with root package name */
    public int f49633s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f49637w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f49640z;

    /* renamed from: b, reason: collision with root package name */
    public final b f49616b = new b();

    /* renamed from: i, reason: collision with root package name */
    public int f49623i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f49624j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f49625k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f49628n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f49627m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f49626l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public J.a[] f49629o = new J.a[1000];

    /* renamed from: c, reason: collision with root package name */
    public final X<c> f49617c = new X<>(new N(0));

    /* renamed from: t, reason: collision with root package name */
    public long f49634t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f49635u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f49636v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f49639y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f49638x = true;

    /* compiled from: SampleQueue.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f49641a;

        /* renamed from: b, reason: collision with root package name */
        public long f49642b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public J.a f49643c;
    }

    /* compiled from: SampleQueue.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C23108t f49644a;

        /* renamed from: b, reason: collision with root package name */
        public final g.b f49645b;

        public c(C23108t c23108t, g.b bVar, a aVar) {
            this.f49644a = c23108t;
            this.f49645b = bVar;
        }
    }

    /* compiled from: SampleQueue.java */
    public interface d {
    }

    public O(androidx.media3.exoplayer.upstream.b bVar, @j.P androidx.media3.exoplayer.drm.g gVar, @j.P f.a aVar) {
        this.f49618d = gVar;
        this.f49619e = aVar;
        this.f49615a = new M(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0006, B:8:0x0012, B:13:0x0022, B:15:0x0039, B:19:0x0051, B:18:0x004f), top: B:29:0x0006 }] */
    @Override // androidx.media3.extractor.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.media3.common.C23108t r5) {
        /*
            r4 = this;
            r0 = 0
            r4.f49640z = r0
            r4.f49611A = r5
            monitor-enter(r4)
            r4.f49639y = r0     // Catch: java.lang.Throwable -> L4d
            androidx.media3.common.t r1 = r4.f49612B     // Catch: java.lang.Throwable -> L4d
            boolean r1 = androidx.media3.common.util.M.a(r5, r1)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L12
            monitor-exit(r4)
            goto L61
        L12:
            androidx.media3.exoplayer.source.X<androidx.media3.exoplayer.source.O$c> r1 = r4.f49617c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray<V> r1 = r1.f49703b     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L4d
            r2 = 1
            if (r1 != 0) goto L1f
            r1 = r2
            goto L20
        L1f:
            r1 = r0
        L20:
            if (r1 != 0) goto L4f
            androidx.media3.exoplayer.source.X<androidx.media3.exoplayer.source.O$c> r1 = r4.f49617c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray<V> r1 = r1.f49703b     // Catch: java.lang.Throwable -> L4d
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L4d
            int r3 = r3 - r2
            java.lang.Object r1 = r1.valueAt(r3)     // Catch: java.lang.Throwable -> L4d
            androidx.media3.exoplayer.source.O$c r1 = (androidx.media3.exoplayer.source.O.c) r1     // Catch: java.lang.Throwable -> L4d
            androidx.media3.common.t r1 = r1.f49644a     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4f
            androidx.media3.exoplayer.source.X<androidx.media3.exoplayer.source.O$c> r5 = r4.f49617c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray<V> r5 = r5.f49703b     // Catch: java.lang.Throwable -> L4d
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L4d
            int r1 = r1 - r2
            java.lang.Object r5 = r5.valueAt(r1)     // Catch: java.lang.Throwable -> L4d
            androidx.media3.exoplayer.source.O$c r5 = (androidx.media3.exoplayer.source.O.c) r5     // Catch: java.lang.Throwable -> L4d
            androidx.media3.common.t r5 = r5.f49644a     // Catch: java.lang.Throwable -> L4d
            r4.f49612B = r5     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r5 = move-exception
            goto L71
        L4f:
            r4.f49612B = r5     // Catch: java.lang.Throwable -> L4d
        L51:
            androidx.media3.common.t r5 = r4.f49612B     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r5.f47757m     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = r5.f47754j     // Catch: java.lang.Throwable -> L4d
            boolean r5 = androidx.media3.common.D.a(r1, r5)     // Catch: java.lang.Throwable -> L4d
            r4.f49613C = r5     // Catch: java.lang.Throwable -> L4d
            r4.f49614D = r0     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r4)
            r0 = r2
        L61:
            androidx.media3.exoplayer.source.O$d r5 = r4.f49620f
            if (r5 == 0) goto L70
            if (r0 == 0) goto L70
            androidx.media3.exoplayer.source.J r5 = (androidx.media3.exoplayer.source.J) r5
            android.os.Handler r0 = r5.f49539q
            androidx.media3.exoplayer.source.H r5 = r5.f49537o
            r0.post(r5)
        L70:
            return
        L71:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.O.b(androidx.media3.common.t):void");
    }

    @Override // androidx.media3.extractor.J
    public final int c(InterfaceC23102m interfaceC23102m, int i12, boolean z12) throws EOFException {
        M m12 = this.f49615a;
        int iB2 = m12.b(i12);
        M.a aVar = m12.f49595f;
        androidx.media3.exoplayer.upstream.a aVar2 = aVar.f49599c;
        int i13 = interfaceC23102m.read(aVar2.f50063a, ((int) (m12.f49596g - aVar.f49597a)) + aVar2.f50064b, iB2);
        if (i13 == -1) {
            if (z12) {
                return -1;
            }
            throw new EOFException();
        }
        long j12 = m12.f49596g + i13;
        m12.f49596g = j12;
        M.a aVar3 = m12.f49595f;
        if (j12 != aVar3.f49598b) {
            return i13;
        }
        m12.f49595f = aVar3.f49600d;
        return i13;
    }

    @Override // androidx.media3.extractor.J
    public final void d(int i12, androidx.media3.common.util.z zVar) {
        while (true) {
            M m12 = this.f49615a;
            if (i12 <= 0) {
                m12.getClass();
                return;
            }
            int iB2 = m12.b(i12);
            M.a aVar = m12.f49595f;
            androidx.media3.exoplayer.upstream.a aVar2 = aVar.f49599c;
            zVar.e(((int) (m12.f49596g - aVar.f49597a)) + aVar2.f50064b, iB2, aVar2.f50063a);
            i12 -= iB2;
            long j12 = m12.f49596g + iB2;
            m12.f49596g = j12;
            M.a aVar3 = m12.f49595f;
            if (j12 == aVar3.f49598b) {
                m12.f49595f = aVar3.f49600d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:26:0x0044, B:28:0x0048, B:32:0x005e, B:35:0x0065, B:39:0x006d, B:44:0x00a6, B:67:0x011f, B:69:0x0128, B:46:0x00bf, B:48:0x00c3, B:50:0x00ce, B:52:0x00e7, B:56:0x00f0, B:57:0x00f5, B:59:0x00fb, B:63:0x0109, B:65:0x010e, B:66:0x011c, B:49:0x00cc), top: B:74:0x0044 }] */
    @Override // androidx.media3.extractor.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r10, int r12, int r13, int r14, @j.P androidx.media3.extractor.J.a r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.O.f(long, int, int, int, androidx.media3.extractor.J$a):void");
    }

    @j.B
    public final long g(int i12) {
        long j12 = this.f49635u;
        long jMax = Long.MIN_VALUE;
        if (i12 != 0) {
            int iJ2 = j(i12 - 1);
            for (int i13 = 0; i13 < i12; i13++) {
                jMax = Math.max(jMax, this.f49628n[iJ2]);
                if ((this.f49627m[iJ2] & 1) != 0) {
                    break;
                }
                iJ2--;
                if (iJ2 == -1) {
                    iJ2 = this.f49623i - 1;
                }
            }
        }
        this.f49635u = Math.max(j12, jMax);
        this.f49630p -= i12;
        int i14 = this.f49631q + i12;
        this.f49631q = i14;
        int i15 = this.f49632r + i12;
        this.f49632r = i15;
        int i16 = this.f49623i;
        if (i15 >= i16) {
            this.f49632r = i15 - i16;
        }
        int i17 = this.f49633s - i12;
        this.f49633s = i17;
        int i18 = 0;
        if (i17 < 0) {
            this.f49633s = 0;
        }
        while (true) {
            X<c> x12 = this.f49617c;
            SparseArray<c> sparseArray = x12.f49703b;
            if (i18 >= sparseArray.size() - 1) {
                break;
            }
            int i19 = i18 + 1;
            if (i14 < sparseArray.keyAt(i19)) {
                break;
            }
            x12.f49704c.accept(sparseArray.valueAt(i18));
            sparseArray.removeAt(i18);
            int i22 = x12.f49702a;
            if (i22 > 0) {
                x12.f49702a = i22 - 1;
            }
            i18 = i19;
        }
        if (this.f49630p != 0) {
            return this.f49625k[this.f49632r];
        }
        int i23 = this.f49632r;
        if (i23 == 0) {
            i23 = this.f49623i;
        }
        return this.f49625k[i23 - 1] + this.f49626l[r10];
    }

    public final void h() {
        long jG2;
        M m12 = this.f49615a;
        synchronized (this) {
            int i12 = this.f49630p;
            jG2 = i12 == 0 ? -1L : g(i12);
        }
        m12.a(jG2);
    }

    public final int i(int i12, int i13, long j12, boolean z12) {
        int i14 = -1;
        for (int i15 = 0; i15 < i13; i15++) {
            long j13 = this.f49628n[i12];
            if (j13 > j12) {
                return i14;
            }
            if (!z12 || (this.f49627m[i12] & 1) != 0) {
                if (j13 == j12) {
                    return i15;
                }
                i14 = i15;
            }
            i12++;
            if (i12 == this.f49623i) {
                i12 = 0;
            }
        }
        return i14;
    }

    public final int j(int i12) {
        int i13 = this.f49632r + i12;
        int i14 = this.f49623i;
        return i13 < i14 ? i13 : i13 - i14;
    }

    @InterfaceC42153i
    public final synchronized boolean k(boolean z12) {
        C23108t c23108t;
        int i12 = this.f49633s;
        boolean z13 = false;
        if (i12 != this.f49630p) {
            if (this.f49617c.a(this.f49631q + i12).f49644a != this.f49621g) {
                return true;
            }
            return l(j(this.f49633s));
        }
        if (z12 || this.f49637w || ((c23108t = this.f49612B) != null && c23108t != this.f49621g)) {
            z13 = true;
        }
        return z13;
    }

    public final boolean l(int i12) {
        DrmSession drmSession = this.f49622h;
        return drmSession == null || drmSession.getState() == 4 || ((this.f49627m[i12] & 1073741824) == 0 && this.f49622h.a());
    }

    public final void m(C23108t c23108t, androidx.media3.exoplayer.F f12) {
        C23108t c23108tA;
        C23108t c23108t2 = this.f49621g;
        boolean z12 = c23108t2 == null;
        DrmInitData drmInitData = z12 ? null : c23108t2.f47760p;
        this.f49621g = c23108t;
        DrmInitData drmInitData2 = c23108t.f47760p;
        androidx.media3.exoplayer.drm.g gVar = this.f49618d;
        if (gVar != null) {
            int iA2 = gVar.a(c23108t);
            C23108t.b bVarA = c23108t.a();
            bVarA.f47776F = iA2;
            c23108tA = bVarA.a();
        } else {
            c23108tA = c23108t;
        }
        f12.f48506b = c23108tA;
        f12.f48505a = this.f49622h;
        if (gVar == null) {
            return;
        }
        if (z12 || !androidx.media3.common.util.M.a(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f49622h;
            f.a aVar = this.f49619e;
            DrmSession drmSessionB = gVar.b(aVar, c23108t);
            this.f49622h = drmSessionB;
            f12.f48505a = drmSessionB;
            if (drmSession != null) {
                drmSession.f(aVar);
            }
        }
    }

    @InterfaceC42153i
    public final void n(boolean z12) {
        X<c> x12;
        SparseArray<c> sparseArray;
        M m12 = this.f49615a;
        M.a aVar = m12.f49593d;
        androidx.media3.exoplayer.upstream.a aVar2 = aVar.f49599c;
        androidx.media3.exoplayer.upstream.b bVar = m12.f49590a;
        if (aVar2 != null) {
            bVar.d(aVar);
            aVar.f49599c = null;
            aVar.f49600d = null;
        }
        M.a aVar3 = m12.f49593d;
        int i12 = 0;
        C23110a.g(aVar3.f49599c == null);
        aVar3.f49597a = 0L;
        aVar3.f49598b = m12.f49591b;
        M.a aVar4 = m12.f49593d;
        m12.f49594e = aVar4;
        m12.f49595f = aVar4;
        m12.f49596g = 0L;
        bVar.a();
        this.f49630p = 0;
        this.f49631q = 0;
        this.f49632r = 0;
        this.f49633s = 0;
        this.f49638x = true;
        this.f49634t = Long.MIN_VALUE;
        this.f49635u = Long.MIN_VALUE;
        this.f49636v = Long.MIN_VALUE;
        this.f49637w = false;
        while (true) {
            x12 = this.f49617c;
            sparseArray = x12.f49703b;
            if (i12 >= sparseArray.size()) {
                break;
            }
            x12.f49704c.accept(sparseArray.valueAt(i12));
            i12++;
        }
        x12.f49702a = -1;
        sparseArray.clear();
        if (z12) {
            this.f49611A = null;
            this.f49612B = null;
            this.f49639y = true;
        }
    }

    public final synchronized boolean o(long j12, boolean z12) {
        synchronized (this) {
            this.f49633s = 0;
            M m12 = this.f49615a;
            m12.f49594e = m12.f49593d;
        }
        int iJ2 = j(0);
        int i12 = this.f49633s;
        int i13 = this.f49630p;
        if ((i12 != i13) && j12 >= this.f49628n[iJ2] && (j12 <= this.f49636v || z12)) {
            int i14 = i(iJ2, i13 - i12, j12, true);
            if (i14 == -1) {
                return false;
            }
            this.f49634t = j12;
            this.f49633s += i14;
            return true;
        }
        return false;
    }
}
