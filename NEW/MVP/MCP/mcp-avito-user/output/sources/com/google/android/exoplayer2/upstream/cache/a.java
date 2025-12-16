package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C;
import com.google.android.exoplayer2.upstream.D;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.InterfaceC36582l;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.K;
import com.google.android.exoplayer2.upstream.M;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: CacheDataSource.java */
/* loaded from: classes6.dex */
public final class a implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public final Cache f347810a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36583m f347811b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final K f347812c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC36583m f347813d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.cache.e f347814e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final c f347815f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f347816g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f347817h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f347818i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public Uri f347819j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.upstream.p f347820k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.upstream.p f347821l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public InterfaceC36583m f347822m;

    /* renamed from: n, reason: collision with root package name */
    public long f347823n;

    /* renamed from: o, reason: collision with root package name */
    public long f347824o;

    /* renamed from: p, reason: collision with root package name */
    public long f347825p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public f f347826q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f347827r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f347828s;

    /* renamed from: t, reason: collision with root package name */
    public long f347829t;

    /* renamed from: u, reason: collision with root package name */
    public long f347830u;

    /* compiled from: CacheDataSource.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: CacheDataSource.java */
    public interface c {
        void a();

        void b();
    }

    /* compiled from: CacheDataSource.java */
    public static final class d implements InterfaceC36583m.a {

        /* renamed from: a, reason: collision with root package name */
        public q f347831a;

        /* renamed from: b, reason: collision with root package name */
        public final FileDataSource.b f347832b = new FileDataSource.b();

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.analytics.h f347833c = com.google.android.exoplayer2.upstream.cache.e.f347841i2;

        /* renamed from: d, reason: collision with root package name */
        @P
        public InterfaceC36583m.a f347834d;

        /* renamed from: e, reason: collision with root package name */
        public int f347835e;

        @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        public final InterfaceC36583m a() {
            InterfaceC36583m.a aVar = this.f347834d;
            return c(aVar != null ? aVar.a() : null, this.f347835e, 0);
        }

        public final a b() {
            InterfaceC36583m.a aVar = this.f347834d;
            return c(aVar != null ? aVar.a() : null, this.f347835e | 1, -1000);
        }

        public final a c(@P InterfaceC36583m interfaceC36583m, int i12, int i13) {
            CacheDataSink cacheDataSink;
            q qVar = this.f347831a;
            qVar.getClass();
            if (interfaceC36583m == null) {
                cacheDataSink = null;
            } else {
                new CacheDataSink.a();
                cacheDataSink = new CacheDataSink(qVar);
            }
            CacheDataSink cacheDataSink2 = cacheDataSink;
            this.f347832b.getClass();
            return new a(qVar, interfaceC36583m, new FileDataSource(), cacheDataSink2, this.f347833c, i12, null, i13, null, null);
        }
    }

    /* compiled from: CacheDataSource.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public a(Cache cache, InterfaceC36583m interfaceC36583m, InterfaceC36583m interfaceC36583m2, InterfaceC36582l interfaceC36582l, com.google.android.exoplayer2.upstream.cache.e eVar, int i12, PriorityTaskManager priorityTaskManager, int i13, c cVar, C10610a c10610a) {
        this.f347810a = cache;
        this.f347811b = interfaceC36583m2;
        this.f347814e = eVar == null ? com.google.android.exoplayer2.upstream.cache.e.f347841i2 : eVar;
        this.f347816g = (i12 & 1) != 0;
        this.f347817h = (i12 & 2) != 0;
        this.f347818i = (i12 & 4) != 0;
        if (interfaceC36583m != null) {
            interfaceC36583m = priorityTaskManager != null ? new D(interfaceC36583m, priorityTaskManager, i13) : interfaceC36583m;
            this.f347813d = interfaceC36583m;
            this.f347812c = interfaceC36582l != null ? new K(interfaceC36583m, interfaceC36582l) : null;
        } else {
            this.f347813d = C.f347716a;
            this.f347812c = null;
        }
        this.f347815f = cVar;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final Map<String, List<String>> c() {
        return !(this.f347822m == this.f347811b) ? this.f347813d.c() : Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        this.f347820k = null;
        this.f347819j = null;
        this.f347824o = 0L;
        c cVar = this.f347815f;
        if (cVar != null && this.f347829t > 0) {
            this.f347810a.b();
            cVar.a();
            this.f347829t = 0L;
        }
        try {
            l();
        } catch (Throwable th2) {
            if (this.f347822m == this.f347811b || (th2 instanceof Cache.CacheException)) {
                this.f347827r = true;
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(com.google.android.exoplayer2.upstream.p pVar) {
        c cVar;
        Cache cache = this.f347810a;
        try {
            String strD = this.f347814e.d(pVar);
            p.b bVarA = pVar.a();
            long j12 = pVar.f347934f;
            bVarA.f347946h = strD;
            com.google.android.exoplayer2.upstream.p pVarA = bVarA.a();
            this.f347820k = pVarA;
            Uri uri = pVarA.f347929a;
            byte[] bArr = cache.c(strD).f347885b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, C37262f.f359034c) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f347819j = uri;
            this.f347824o = j12;
            boolean z12 = this.f347817h;
            long j13 = pVar.f347935g;
            boolean z13 = (z12 && this.f347827r) || (this.f347818i && j13 == -1);
            this.f347828s = z13;
            if (z13 && (cVar = this.f347815f) != null) {
                cVar.b();
            }
            if (this.f347828s) {
                this.f347825p = -1L;
            } else {
                long jB2 = cache.c(strD).b();
                this.f347825p = jB2;
                if (jB2 != -1) {
                    long j14 = jB2 - j12;
                    this.f347825p = j14;
                    if (j14 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j13 != -1) {
                long j15 = this.f347825p;
                this.f347825p = j15 == -1 ? j13 : Math.min(j15, j13);
            }
            long j16 = this.f347825p;
            if (j16 > 0 || j16 == -1) {
                m(pVarA, false);
            }
            return j13 != -1 ? j13 : this.f347825p;
        } catch (Throwable th2) {
            if (this.f347822m == this.f347811b || (th2 instanceof Cache.CacheException)) {
                this.f347827r = true;
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347819j;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(M m12) {
        m12.getClass();
        this.f347811b.k(m12);
        this.f347813d.k(m12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        Cache cache = this.f347810a;
        InterfaceC36583m interfaceC36583m = this.f347822m;
        if (interfaceC36583m == null) {
            return;
        }
        try {
            interfaceC36583m.close();
        } finally {
            this.f347821l = null;
            this.f347822m = null;
            f fVar = this.f347826q;
            if (fVar != null) {
                cache.h(fVar);
                this.f347826q = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.google.android.exoplayer2.upstream.p r21, boolean r22) throws java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.a.m(com.google.android.exoplayer2.upstream.p, boolean):void");
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        int i14;
        InterfaceC36583m interfaceC36583m = this.f347811b;
        if (i13 == 0) {
            return 0;
        }
        if (this.f347825p == 0) {
            return -1;
        }
        com.google.android.exoplayer2.upstream.p pVar = this.f347820k;
        pVar.getClass();
        com.google.android.exoplayer2.upstream.p pVar2 = this.f347821l;
        pVar2.getClass();
        try {
            if (this.f347824o >= this.f347830u) {
                m(pVar, true);
            }
            InterfaceC36583m interfaceC36583m2 = this.f347822m;
            interfaceC36583m2.getClass();
            int i15 = interfaceC36583m2.read(bArr, i12, i13);
            if (i15 != -1) {
                if (this.f347822m == interfaceC36583m) {
                    this.f347829t += i15;
                }
                long j12 = i15;
                this.f347824o += j12;
                this.f347823n += j12;
                long j13 = this.f347825p;
                if (j13 != -1) {
                    this.f347825p = j13 - j12;
                }
                return i15;
            }
            InterfaceC36583m interfaceC36583m3 = this.f347822m;
            if (interfaceC36583m3 == interfaceC36583m) {
                i14 = i15;
            } else {
                i14 = i15;
                long j14 = pVar2.f347935g;
                if (j14 == -1 || this.f347823n < j14) {
                    String str = pVar.f347936h;
                    int i16 = U.f348106a;
                    this.f347825p = 0L;
                    if (!(interfaceC36583m3 == this.f347812c)) {
                        return i14;
                    }
                    k kVar = new k();
                    kVar.a(Long.valueOf(this.f347824o), "exo_len");
                    this.f347810a.d(str, kVar);
                    return i14;
                }
            }
            long j15 = this.f347825p;
            if (j15 <= 0 && j15 != -1) {
                return i14;
            }
            l();
            m(pVar, false);
            return read(bArr, i12, i13);
        } catch (Throwable th2) {
            if (this.f347822m == interfaceC36583m || (th2 instanceof Cache.CacheException)) {
                this.f347827r = true;
            }
            throw th2;
        }
    }
}
