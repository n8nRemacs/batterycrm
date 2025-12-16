package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.offline.k;
import com.google.android.exoplayer2.offline.m;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.cache.a;
import com.google.android.exoplayer2.upstream.cache.g;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.util.I;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: SegmentDownloader.java */
/* loaded from: classes6.dex */
public abstract class q<M extends m<M>> implements k {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.p f345829a;

    /* renamed from: b, reason: collision with root package name */
    public final HlsPlaylistParser f345830b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<StreamKey> f345831c;

    /* renamed from: d, reason: collision with root package name */
    public final a.d f345832d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.cache.q f345833e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.h f345834f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f345835g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<I<?, ?>> f345836h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f345837i;

    /* compiled from: SegmentDownloader.java */
    public static final class a implements g.a {

        /* renamed from: a, reason: collision with root package name */
        public final k.a f345838a;

        /* renamed from: b, reason: collision with root package name */
        public final long f345839b;

        /* renamed from: c, reason: collision with root package name */
        public final int f345840c;

        /* renamed from: d, reason: collision with root package name */
        public long f345841d;

        /* renamed from: e, reason: collision with root package name */
        public int f345842e;

        public a(k.a aVar, long j12, int i12, long j13, int i13) {
            this.f345838a = aVar;
            this.f345839b = j12;
            this.f345840c = i12;
            this.f345841d = j13;
            this.f345842e = i13;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.g.a
        public final void a(long j12, long j13, long j14) {
            long j15 = this.f345841d + j14;
            this.f345841d = j15;
            this.f345838a.a(this.f345839b, j15, b());
        }

        public final float b() {
            long j12 = this.f345839b;
            if (j12 != -1 && j12 != 0) {
                return (this.f345841d * 100.0f) / j12;
            }
            int i12 = this.f345840c;
            if (i12 != 0) {
                return (this.f345842e * 100.0f) / i12;
            }
            return -1.0f;
        }
    }

    /* compiled from: SegmentDownloader.java */
    public static class b implements Comparable<b> {

        /* renamed from: b, reason: collision with root package name */
        public final long f345843b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.p f345844c;

        public b(long j12, com.google.android.exoplayer2.upstream.p pVar) {
            this.f345843b = j12;
            this.f345844c = pVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            return U.i(this.f345843b, bVar.f345843b);
        }
    }

    /* compiled from: SegmentDownloader.java */
    public static final class c extends I<Void, IOException> {

        /* renamed from: i, reason: collision with root package name */
        public final b f345845i;

        /* renamed from: j, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.cache.a f345846j;

        /* renamed from: k, reason: collision with root package name */
        @P
        public final a f345847k;

        /* renamed from: l, reason: collision with root package name */
        public final byte[] f345848l;

        /* renamed from: m, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.cache.g f345849m;

        public c(b bVar, com.google.android.exoplayer2.upstream.cache.a aVar, @P a aVar2, byte[] bArr) {
            this.f345845i = bVar;
            this.f345846j = aVar;
            this.f345847k = aVar2;
            this.f345848l = bArr;
            this.f345849m = new com.google.android.exoplayer2.upstream.cache.g(aVar, bVar.f345844c, bArr, aVar2);
        }

        @Override // com.google.android.exoplayer2.util.I
        public final void b() {
            this.f345849m.f347857j = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x014f, code lost:
        
            throw new java.io.InterruptedIOException();
         */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0101 A[Catch: IOException -> 0x0148, TryCatch #1 {IOException -> 0x0148, blocks: (B:65:0x00fa, B:68:0x0101, B:70:0x0107, B:74:0x0119, B:76:0x011d, B:78:0x0126, B:80:0x0130, B:81:0x0140, B:85:0x014a, B:86:0x014f, B:88:0x0152, B:91:0x015b, B:93:0x0161), top: B:105:0x00fa }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0119 A[Catch: IOException -> 0x0148, TryCatch #1 {IOException -> 0x0148, blocks: (B:65:0x00fa, B:68:0x0101, B:70:0x0107, B:74:0x0119, B:76:0x011d, B:78:0x0126, B:80:0x0130, B:81:0x0140, B:85:0x014a, B:86:0x014f, B:88:0x0152, B:91:0x015b, B:93:0x0161), top: B:105:0x00fa }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0152 A[Catch: IOException -> 0x0148, TryCatch #1 {IOException -> 0x0148, blocks: (B:65:0x00fa, B:68:0x0101, B:70:0x0107, B:74:0x0119, B:76:0x011d, B:78:0x0126, B:80:0x0130, B:81:0x0140, B:85:0x014a, B:86:0x014f, B:88:0x0152, B:91:0x015b, B:93:0x0161), top: B:105:0x00fa }] */
        @Override // com.google.android.exoplayer2.util.I
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Void c() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.q.c.c():java.lang.Object");
        }
    }

    public q(O o12, HlsPlaylistParser hlsPlaylistParser, a.d dVar, Executor executor) {
        o12.f343529c.getClass();
        O.i iVar = o12.f343529c;
        this.f345829a = c(iVar.f343571a);
        this.f345830b = hlsPlaylistParser;
        this.f345831c = new ArrayList<>(iVar.f343575e);
        this.f345832d = dVar;
        this.f345835g = executor;
        com.google.android.exoplayer2.upstream.cache.q qVar = dVar.f347831a;
        qVar.getClass();
        this.f345833e = qVar;
        this.f345834f = dVar.f347833c;
        this.f345836h = new ArrayList<>();
    }

    public static com.google.android.exoplayer2.upstream.p c(Uri uri) {
        p.b bVar = new p.b();
        bVar.f347939a = uri;
        bVar.f347947i = 1;
        return bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.util.List r20, com.google.android.exoplayer2.analytics.h r21) {
        /*
            r0 = r20
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = r2
        L9:
            int r4 = r20.size()
            if (r2 >= r4) goto Lc2
            java.lang.Object r4 = r0.get(r2)
            com.google.android.exoplayer2.offline.q$b r4 = (com.google.android.exoplayer2.offline.q.b) r4
            com.google.android.exoplayer2.upstream.p r5 = r4.f345844c
            r6 = r21
            java.lang.String r5 = r6.d(r5)
            java.lang.Object r7 = r1.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L27
            r8 = 0
            goto L31
        L27:
            int r8 = r7.intValue()
            java.lang.Object r8 = r0.get(r8)
            com.google.android.exoplayer2.offline.q$b r8 = (com.google.android.exoplayer2.offline.q.b) r8
        L31:
            if (r8 == 0) goto La6
            long r9 = r8.f345843b
            r11 = 20000000(0x1312d00, double:9.881313E-317)
            long r11 = r11 + r9
            long r13 = r4.f345843b
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 > 0) goto La6
            com.google.android.exoplayer2.upstream.p r8 = r8.f345844c
            android.net.Uri r11 = r8.f347929a
            com.google.android.exoplayer2.upstream.p r12 = r4.f345844c
            android.net.Uri r13 = r12.f347929a
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto La6
            long r13 = r8.f347935g
            r15 = -1
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 == 0) goto La6
            r11 = r1
            r17 = r2
            long r1 = r8.f347934f
            long r1 = r1 + r13
            r18 = r4
            r19 = r5
            long r4 = r12.f347934f
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto Lad
            java.lang.String r1 = r8.f347936h
            java.lang.String r2 = r12.f347936h
            boolean r1 = com.google.android.exoplayer2.util.U.a(r1, r2)
            if (r1 == 0) goto Lad
            int r1 = r8.f347937i
            int r2 = r12.f347937i
            if (r1 != r2) goto Lad
            int r1 = r8.f347931c
            int r2 = r12.f347931c
            if (r1 != r2) goto Lad
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f347933e
            java.util.Map<java.lang.String, java.lang.String> r2 = r12.f347933e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lad
            long r1 = r12.f347935g
            int r4 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r4 != 0) goto L8d
        L8b:
            r1 = r15
            goto L90
        L8d:
            long r15 = r13 + r1
            goto L8b
        L90:
            r4 = 0
            com.google.android.exoplayer2.upstream.p r1 = r8.b(r4, r1)
            r7.getClass()
            int r2 = r7.intValue()
            com.google.android.exoplayer2.offline.q$b r4 = new com.google.android.exoplayer2.offline.q$b
            r4.<init>(r9, r1)
            r0.set(r2, r4)
            goto Lbd
        La6:
            r11 = r1
            r17 = r2
            r18 = r4
            r19 = r5
        Lad:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2 = r19
            r11.put(r2, r1)
            r4 = r18
            r0.set(r3, r4)
            int r3 = r3 + 1
        Lbd:
            int r2 = r17 + 1
            r1 = r11
            goto L9
        Lc2:
            int r1 = r20.size()
            com.google.android.exoplayer2.util.U.L(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.q.f(java.util.List, com.google.android.exoplayer2.analytics.h):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018a A[LOOP:1: B:78:0x0182->B:80:0x018a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3 A[LOOP:2: B:82:0x01a1->B:83:0x01a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.offline.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@j.P com.google.android.exoplayer2.offline.k.a r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.q.a(com.google.android.exoplayer2.offline.k$a):void");
    }

    public final <T> void b(I<T, ?> i12) {
        synchronized (this.f345836h) {
            try {
                if (this.f345837i) {
                    throw new InterruptedException();
                }
                this.f345836h.add(i12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final m d(com.google.android.exoplayer2.upstream.cache.a aVar, com.google.android.exoplayer2.upstream.p pVar, boolean z12) throws ExecutionException, InterruptedException, IOException {
        m<Object> mVar;
        p pVar2 = new p(this, aVar, pVar);
        if (!z12) {
            while (!this.f345837i) {
                b(pVar2);
                this.f345835g.execute(pVar2);
                try {
                    mVar = pVar2.get();
                } catch (ExecutionException e12) {
                    Throwable cause = e12.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i12 = U.f348106a;
                        throw e12;
                    }
                } finally {
                    pVar2.a();
                    h(pVar2);
                }
            }
            throw new InterruptedException();
        }
        pVar2.run();
        try {
            mVar = pVar2.get();
        } catch (ExecutionException e13) {
            Throwable cause2 = e13.getCause();
            cause2.getClass();
            if (cause2 instanceof IOException) {
                throw ((IOException) cause2);
            }
            int i13 = U.f348106a;
            throw e13;
        }
        return mVar;
    }

    public abstract ArrayList e(com.google.android.exoplayer2.upstream.cache.a aVar, m mVar, boolean z12);

    public final void g(int i12) {
        synchronized (this.f345836h) {
            this.f345836h.remove(i12);
        }
    }

    public final void h(I<?, ?> i12) {
        synchronized (this.f345836h) {
            this.f345836h.remove(i12);
        }
    }

    @Override // com.google.android.exoplayer2.offline.k
    public final void remove() {
        com.google.android.exoplayer2.analytics.h hVar = this.f345834f;
        com.google.android.exoplayer2.upstream.cache.q qVar = this.f345833e;
        com.google.android.exoplayer2.upstream.p pVar = this.f345829a;
        a.d dVar = this.f345832d;
        com.google.android.exoplayer2.upstream.cache.a aVarC = dVar.c(null, dVar.f347835e | 1, -1000);
        try {
            try {
                ArrayList arrayListE = e(aVarC, d(aVarC, pVar, true), true);
                for (int i12 = 0; i12 < arrayListE.size(); i12++) {
                    qVar.f(hVar.d(((b) arrayListE.get(i12)).f345844c));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            qVar.f(hVar.d(pVar));
        }
    }
}
