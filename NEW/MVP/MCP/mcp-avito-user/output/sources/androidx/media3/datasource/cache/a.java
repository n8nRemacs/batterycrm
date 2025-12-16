package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.A;
import androidx.media3.datasource.B;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.j;
import androidx.media3.datasource.o;
import androidx.media3.datasource.u;
import androidx.media3.datasource.v;
import j.P;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: CacheDataSource.java */
@J
/* loaded from: classes.dex */
public final class a implements androidx.media3.datasource.j {

    /* renamed from: a, reason: collision with root package name */
    public final Cache f48205a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.datasource.j f48206b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final A f48207c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.datasource.j f48208d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.media3.datasource.cache.e f48209e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final c f48210f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f48211g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Uri f48212h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public androidx.media3.datasource.o f48213i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public androidx.media3.datasource.o f48214j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public androidx.media3.datasource.j f48215k;

    /* renamed from: l, reason: collision with root package name */
    public long f48216l;

    /* renamed from: m, reason: collision with root package name */
    public long f48217m;

    /* renamed from: n, reason: collision with root package name */
    public long f48218n;

    /* renamed from: o, reason: collision with root package name */
    public long f48219o;

    /* renamed from: p, reason: collision with root package name */
    public long f48220p;

    /* compiled from: CacheDataSource.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: CacheDataSource.java */
    public interface c {
        void a();
    }

    /* compiled from: CacheDataSource.java */
    public static final class d implements j.a {
        public d() {
            new FileDataSource.b();
        }

        @Override // androidx.media3.datasource.j.a
        public final androidx.media3.datasource.j a() {
            throw null;
        }
    }

    /* compiled from: CacheDataSource.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public a(Cache cache, androidx.media3.datasource.j jVar, androidx.media3.datasource.j jVar2, androidx.media3.datasource.i iVar, androidx.media3.datasource.cache.e eVar, int i12, PriorityTaskManager priorityTaskManager, int i13, c cVar, C1820a c1820a) {
        this.f48205a = cache;
        this.f48206b = jVar2;
        this.f48209e = eVar == null ? androidx.media3.datasource.cache.e.f48221G1 : eVar;
        this.f48211g = (i12 & 1) != 0;
        if (jVar != null) {
            jVar = priorityTaskManager != null ? new v(jVar, priorityTaskManager, i13) : jVar;
            this.f48208d = jVar;
            this.f48207c = iVar != null ? new A(jVar, iVar) : null;
        } else {
            this.f48208d = u.f48313a;
            this.f48207c = null;
        }
        this.f48210f = cVar;
    }

    @Override // androidx.media3.datasource.j
    public final Map<String, List<String>> c() {
        return !(this.f48215k == this.f48206b) ? this.f48208d.c() : Collections.emptyMap();
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        this.f48213i = null;
        this.f48212h = null;
        this.f48217m = 0L;
        c cVar = this.f48210f;
        if (cVar != null && this.f48219o > 0) {
            this.f48205a.b();
            cVar.a();
            this.f48219o = 0L;
        }
        try {
            k();
        } catch (Throwable th2) {
            if (this.f48215k != this.f48206b) {
                boolean z12 = th2 instanceof Cache.CacheException;
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.j
    public final long e(androidx.media3.datasource.o oVar) {
        Cache cache = this.f48205a;
        try {
            String strA = this.f48209e.a(oVar);
            o.b bVarA = oVar.a();
            bVarA.f48262h = strA;
            this.f48213i = bVarA.a();
            cache.d();
            throw null;
        } catch (Throwable th2) {
            if (this.f48215k != this.f48206b) {
                boolean z12 = th2 instanceof Cache.CacheException;
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48212h;
    }

    @Override // androidx.media3.datasource.j
    public final void j(B b12) {
        b12.getClass();
        this.f48206b.j(b12);
        this.f48208d.j(b12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        androidx.media3.datasource.j jVar = this.f48215k;
        if (jVar == null) {
            return;
        }
        try {
            jVar.close();
        } finally {
            this.f48214j = null;
            this.f48215k = null;
        }
    }

    public final void l(androidx.media3.datasource.o oVar, boolean z12) throws InterruptedIOException {
        String str = oVar.f48252h;
        int i12 = M.f47887a;
        Cache cache = this.f48205a;
        if (!this.f48211g) {
            cache.f();
            throw null;
        }
        try {
            this.f48205a.a(this.f48217m, this.f48218n, str);
            throw null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        androidx.media3.datasource.o oVar;
        int i14;
        androidx.media3.datasource.j jVar = this.f48206b;
        if (i13 == 0) {
            return 0;
        }
        if (this.f48218n == 0) {
            return -1;
        }
        androidx.media3.datasource.o oVar2 = this.f48213i;
        oVar2.getClass();
        androidx.media3.datasource.o oVar3 = this.f48214j;
        oVar3.getClass();
        try {
            if (this.f48217m >= this.f48220p) {
                l(oVar2, true);
            }
            androidx.media3.datasource.j jVar2 = this.f48215k;
            jVar2.getClass();
            int i15 = jVar2.read(bArr, i12, i13);
            if (i15 != -1) {
                if (this.f48215k == jVar) {
                    this.f48219o += i15;
                }
                long j12 = i15;
                this.f48217m += j12;
                this.f48216l += j12;
                long j13 = this.f48218n;
                if (j13 != -1) {
                    this.f48218n = j13 - j12;
                }
                return i15;
            }
            androidx.media3.datasource.j jVar3 = this.f48215k;
            if (!(jVar3 == jVar)) {
                oVar = oVar2;
                long j14 = oVar3.f48251g;
                if (j14 != -1) {
                    i14 = i15;
                    if (this.f48216l < j14) {
                    }
                } else {
                    i14 = i15;
                }
                int i16 = M.f47887a;
                this.f48218n = 0L;
                if (!(jVar3 == this.f48207c)) {
                    return i14;
                }
                k kVar = new k();
                Long lValueOf = Long.valueOf(this.f48217m);
                HashMap map = kVar.f48222a;
                lValueOf.getClass();
                map.put("exo_len", lValueOf);
                kVar.f48223b.remove("exo_len");
                this.f48205a.e();
                throw null;
            }
            oVar = oVar2;
            i14 = i15;
            long j15 = this.f48218n;
            if (j15 <= 0 && j15 != -1) {
                return i14;
            }
            k();
            l(oVar, false);
            return read(bArr, i12, i13);
        } catch (Throwable th2) {
            if (this.f48215k != jVar) {
                boolean z12 = th2 instanceof Cache.CacheException;
            }
            throw th2;
        }
    }
}
