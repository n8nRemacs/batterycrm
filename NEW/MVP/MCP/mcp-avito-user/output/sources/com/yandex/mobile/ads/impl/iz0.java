package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ah;
import com.yandex.mobile.ads.impl.gz;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class iz0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ry0 f386703a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final sv0 f386704b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final String f386705c;

    /* renamed from: d, reason: collision with root package name */
    private final int f386706d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private final cz f386707e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final gz f386708f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private final mz0 f386709g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    private final iz0 f386710h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    private final iz0 f386711i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    private final iz0 f386712j;

    /* renamed from: k, reason: collision with root package name */
    private final long f386713k;

    /* renamed from: l, reason: collision with root package name */
    private final long f386714l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    private final dt f386715m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    private ah f386716n;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        private ry0 f386717a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        private sv0 f386718b;

        /* renamed from: c, reason: collision with root package name */
        private int f386719c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        private String f386720d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        private cz f386721e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        private gz.a f386722f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        private mz0 f386723g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        private iz0 f386724h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        private iz0 f386725i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        private iz0 f386726j;

        /* renamed from: k, reason: collision with root package name */
        private long f386727k;

        /* renamed from: l, reason: collision with root package name */
        private long f386728l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        private dt f386729m;

        public a() {
            this.f386719c = -1;
            this.f386722f = new gz.a();
        }

        @Y61.k
        public final a a(@Y61.k ry0 ry0Var) {
            this.f386717a = ry0Var;
            return this;
        }

        public final int b() {
            return this.f386719c;
        }

        @Y61.k
        public final a c() {
            this.f386722f.c("Proxy-Authenticate", "OkHttp-Preemptive");
            return this;
        }

        @Y61.k
        public final a a(@Y61.k sv0 sv0Var) {
            this.f386718b = sv0Var;
            return this;
        }

        @Y61.k
        public final a b(@Y61.k String str) {
            this.f386720d = str;
            return this;
        }

        @Y61.k
        public final a c(@Y61.l iz0 iz0Var) {
            if (iz0Var.a() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.f386726j = iz0Var;
            return this;
        }

        @Y61.k
        public final a a(int i12) {
            this.f386719c = i12;
            return this;
        }

        @Y61.k
        public final a b(@Y61.l iz0 iz0Var) {
            a(iz0Var, "networkResponse");
            this.f386724h = iz0Var;
            return this;
        }

        public a(@Y61.k iz0 iz0Var) {
            this.f386719c = -1;
            this.f386717a = iz0Var.p();
            this.f386718b = iz0Var.n();
            this.f386719c = iz0Var.e();
            this.f386720d = iz0Var.j();
            this.f386721e = iz0Var.g();
            this.f386722f = iz0Var.h().b();
            this.f386723g = iz0Var.a();
            this.f386724h = iz0Var.k();
            this.f386725i = iz0Var.c();
            this.f386726j = iz0Var.m();
            this.f386727k = iz0Var.q();
            this.f386728l = iz0Var.o();
            this.f386729m = iz0Var.f();
        }

        @Y61.k
        public final a a(@Y61.l cz czVar) {
            this.f386721e = czVar;
            return this;
        }

        @Y61.k
        public final void a(@Y61.k String str) {
            this.f386722f.a("Warning", str);
        }

        @Y61.k
        public final a b(long j12) {
            this.f386727k = j12;
            return this;
        }

        @Y61.k
        public final a a(@Y61.k gz gzVar) {
            this.f386722f = gzVar.b();
            return this;
        }

        @Y61.k
        public final a a(@Y61.l mz0 mz0Var) {
            this.f386723g = mz0Var;
            return this;
        }

        @Y61.k
        public final a a(@Y61.l iz0 iz0Var) {
            a(iz0Var, "cacheResponse");
            this.f386725i = iz0Var;
            return this;
        }

        private static void a(iz0 iz0Var, String str) {
            if (iz0Var != null) {
                if (iz0Var.a() == null) {
                    if (iz0Var.k() == null) {
                        if (iz0Var.c() == null) {
                            if (iz0Var.m() != null) {
                                throw new IllegalArgumentException(up1.a(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(up1.a(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(up1.a(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(up1.a(str, ".body != null").toString());
            }
        }

        @Y61.k
        public final a a(long j12) {
            this.f386728l = j12;
            return this;
        }

        public final void a(@Y61.k dt dtVar) {
            this.f386729m = dtVar;
        }

        @Y61.k
        public final iz0 a() {
            int i12 = this.f386719c;
            if (i12 >= 0) {
                ry0 ry0Var = this.f386717a;
                if (ry0Var != null) {
                    sv0 sv0Var = this.f386718b;
                    if (sv0Var != null) {
                        String str = this.f386720d;
                        if (str != null) {
                            return new iz0(ry0Var, sv0Var, str, i12, this.f386721e, this.f386722f.a(), this.f386723g, this.f386724h, this.f386725i, this.f386726j, this.f386727k, this.f386728l, this.f386729m);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("protocol == null");
                }
                throw new IllegalStateException("request == null");
            }
            StringBuilder sbA = Cif.a("code < 0: ");
            sbA.append(this.f386719c);
            throw new IllegalStateException(sbA.toString().toString());
        }
    }

    public iz0(@Y61.k ry0 ry0Var, @Y61.k sv0 sv0Var, @Y61.k String str, int i12, @Y61.l cz czVar, @Y61.k gz gzVar, @Y61.l mz0 mz0Var, @Y61.l iz0 iz0Var, @Y61.l iz0 iz0Var2, @Y61.l iz0 iz0Var3, long j12, long j13, @Y61.l dt dtVar) {
        this.f386703a = ry0Var;
        this.f386704b = sv0Var;
        this.f386705c = str;
        this.f386706d = i12;
        this.f386707e = czVar;
        this.f386708f = gzVar;
        this.f386709g = mz0Var;
        this.f386710h = iz0Var;
        this.f386711i = iz0Var2;
        this.f386712j = iz0Var3;
        this.f386713k = j12;
        this.f386714l = j13;
        this.f386715m = dtVar;
    }

    @Y61.l
    @X41.i
    public final mz0 a() {
        return this.f386709g;
    }

    @X41.i
    @Y61.k
    public final ah b() throws NumberFormatException {
        ah ahVar = this.f386716n;
        if (ahVar != null) {
            return ahVar;
        }
        int i12 = ah.f383553n;
        ah ahVarA = ah.b.a(this.f386708f);
        this.f386716n = ahVarA;
        return ahVarA;
    }

    @Y61.l
    @X41.i
    public final iz0 c() {
        return this.f386711i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        mz0 mz0Var = this.f386709g;
        if (mz0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        qc1.a((Closeable) mz0Var.d());
    }

    @Y61.k
    public final List<li> d() {
        String str;
        gz gzVar = this.f386708f;
        int i12 = this.f386706d;
        if (i12 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i12 != 407) {
                return C42784z0.f406748b;
            }
            str = "Proxy-Authenticate";
        }
        return l10.a(gzVar, str);
    }

    @X41.i
    public final int e() {
        return this.f386706d;
    }

    @Y61.l
    @X41.i
    public final dt f() {
        return this.f386715m;
    }

    @Y61.l
    @X41.i
    public final cz g() {
        return this.f386707e;
    }

    @X41.i
    @Y61.k
    public final gz h() {
        return this.f386708f;
    }

    public final boolean i() {
        int i12 = this.f386706d;
        return 200 <= i12 && i12 < 300;
    }

    @X41.i
    @Y61.k
    public final String j() {
        return this.f386705c;
    }

    @Y61.l
    @X41.i
    public final iz0 k() {
        return this.f386710h;
    }

    @Y61.k
    public final a l() {
        return new a(this);
    }

    @Y61.l
    @X41.i
    public final iz0 m() {
        return this.f386712j;
    }

    @X41.i
    @Y61.k
    public final sv0 n() {
        return this.f386704b;
    }

    @X41.i
    public final long o() {
        return this.f386714l;
    }

    @X41.i
    @Y61.k
    public final ry0 p() {
        return this.f386703a;
    }

    @X41.i
    public final long q() {
        return this.f386713k;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("Response{protocol=");
        sbA.append(this.f386704b);
        sbA.append(", code=");
        sbA.append(this.f386706d);
        sbA.append(", message=");
        sbA.append(this.f386705c);
        sbA.append(", url=");
        sbA.append(this.f386703a.h());
        sbA.append('}');
        return sbA.toString();
    }

    public static String a(iz0 iz0Var, String str) {
        iz0Var.getClass();
        String strA = iz0Var.f386708f.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }
}
