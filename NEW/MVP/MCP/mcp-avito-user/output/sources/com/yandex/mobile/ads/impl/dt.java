package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.AdvertStatus;
import com.yandex.mobile.ads.impl.iz0;
import java.io.IOException;
import java.net.ProtocolException;
import okio.AbstractC44814y;
import okio.AbstractC44815z;
import okio.C44802l;

/* loaded from: classes8.dex */
public final class dt {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final bx0 f384652a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final zs f384653b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ft f384654c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final et f384655d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f384656e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final cx0 f384657f;

    public final class a extends AbstractC44814y {

        /* renamed from: a, reason: collision with root package name */
        private final long f384658a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f384659b;

        /* renamed from: c, reason: collision with root package name */
        private long f384660c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f384661d;

        public a(okio.c0 c0Var, @Y61.k long j12) {
            super(c0Var);
            this.f384658a = j12;
        }

        @Override // okio.AbstractC44814y, okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f384661d) {
                return;
            }
            this.f384661d = true;
            long j12 = this.f384658a;
            if (j12 != -1 && this.f384660c != j12) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                if (this.f384659b) {
                    return;
                }
                this.f384659b = true;
                dt.this.a(this.f384660c, false, true, null);
            } catch (IOException e12) {
                if (this.f384659b) {
                    throw e12;
                }
                this.f384659b = true;
                throw dt.this.a(this.f384660c, false, true, e12);
            }
        }

        @Override // okio.AbstractC44814y, okio.c0, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e12) {
                if (this.f384659b) {
                    throw e12;
                }
                this.f384659b = true;
                throw dt.this.a(this.f384660c, false, true, e12);
            }
        }

        @Override // okio.AbstractC44814y, okio.c0
        public final void write(@Y61.k C44802l c44802l, long j12) throws IOException {
            if (this.f384661d) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            long j13 = this.f384658a;
            if (j13 != -1 && this.f384660c + j12 > j13) {
                StringBuilder sbA = Cif.a("expected ");
                sbA.append(this.f384658a);
                sbA.append(" bytes but received ");
                sbA.append(this.f384660c + j12);
                throw new ProtocolException(sbA.toString());
            }
            try {
                super.write(c44802l, j12);
                this.f384660c += j12;
            } catch (IOException e12) {
                if (this.f384659b) {
                    throw e12;
                }
                this.f384659b = true;
                throw dt.this.a(this.f384660c, false, true, e12);
            }
        }
    }

    public final class b extends AbstractC44815z {

        /* renamed from: a, reason: collision with root package name */
        private final long f384663a;

        /* renamed from: b, reason: collision with root package name */
        private long f384664b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f384665c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f384666d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f384667e;

        public b(okio.e0 e0Var, @Y61.k long j12) {
            super(e0Var);
            this.f384663a = j12;
            this.f384665c = true;
            if (j12 == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e12) {
            if (this.f384666d) {
                return e12;
            }
            this.f384666d = true;
            if (e12 == null && this.f384665c) {
                this.f384665c = false;
                zs zsVarG = dt.this.g();
                bx0 bx0VarE = dt.this.e();
                zsVarG.getClass();
                zs.e(bx0VarE);
            }
            return (E) dt.this.a(this.f384664b, true, false, e12);
        }

        @Override // okio.AbstractC44815z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f384667e) {
                return;
            }
            this.f384667e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e12) {
                throw a(e12);
            }
        }

        @Override // okio.AbstractC44815z, okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
            if (this.f384667e) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            try {
                long j13 = delegate().read(c44802l, j12);
                if (this.f384665c) {
                    this.f384665c = false;
                    zs zsVarG = dt.this.g();
                    bx0 bx0VarE = dt.this.e();
                    zsVarG.getClass();
                    zs.e(bx0VarE);
                }
                if (j13 == -1) {
                    a(null);
                    return -1L;
                }
                long j14 = this.f384664b + j13;
                long j15 = this.f384663a;
                if (j15 != -1 && j14 > j15) {
                    throw new ProtocolException("expected " + this.f384663a + " bytes but received " + j14);
                }
                this.f384664b = j14;
                if (j14 == j15) {
                    a(null);
                }
                return j13;
            } catch (IOException e12) {
                throw a(e12);
            }
        }
    }

    public dt(@Y61.k bx0 bx0Var, @Y61.k zs zsVar, @Y61.k ft ftVar, @Y61.k et etVar) {
        this.f384652a = bx0Var;
        this.f384653b = zsVar;
        this.f384654c = ftVar;
        this.f384655d = etVar;
        this.f384657f = etVar.c();
    }

    @Y61.k
    public final okio.c0 a(@Y61.k ry0 ry0Var) {
        this.f384656e = false;
        long jA2 = ry0Var.a().a();
        zs zsVar = this.f384653b;
        bx0 bx0Var = this.f384652a;
        zsVar.getClass();
        zs.b(bx0Var);
        return new a(this.f384655d.a(ry0Var, jA2), jA2);
    }

    public final void b(@Y61.k ry0 ry0Var) throws IOException {
        try {
            zs zsVar = this.f384653b;
            bx0 bx0Var = this.f384652a;
            zsVar.getClass();
            zs.c(bx0Var);
            this.f384655d.a(ry0Var);
            zs zsVar2 = this.f384653b;
            bx0 bx0Var2 = this.f384652a;
            zsVar2.getClass();
            zs.a(bx0Var2, ry0Var);
        } catch (IOException e12) {
            zs zsVar3 = this.f384653b;
            bx0 bx0Var3 = this.f384652a;
            zsVar3.getClass();
            zs.a(bx0Var3, e12);
            this.f384654c.a(e12);
            this.f384655d.c().a(this.f384652a, e12);
            throw e12;
        }
    }

    public final void c() throws IOException {
        try {
            this.f384655d.a();
        } catch (IOException e12) {
            zs zsVar = this.f384653b;
            bx0 bx0Var = this.f384652a;
            zsVar.getClass();
            zs.a(bx0Var, e12);
            this.f384654c.a(e12);
            this.f384655d.c().a(this.f384652a, e12);
            throw e12;
        }
    }

    public final void d() throws IOException {
        try {
            this.f384655d.b();
        } catch (IOException e12) {
            zs zsVar = this.f384653b;
            bx0 bx0Var = this.f384652a;
            zsVar.getClass();
            zs.a(bx0Var, e12);
            this.f384654c.a(e12);
            this.f384655d.c().a(this.f384652a, e12);
            throw e12;
        }
    }

    @Y61.k
    public final bx0 e() {
        return this.f384652a;
    }

    @Y61.k
    public final cx0 f() {
        return this.f384657f;
    }

    @Y61.k
    public final zs g() {
        return this.f384653b;
    }

    @Y61.k
    public final ft h() {
        return this.f384654c;
    }

    public final boolean i() {
        return !kotlin.jvm.internal.L.f(this.f384654c.a().k().g(), this.f384657f.k().a().k().g());
    }

    public final boolean j() {
        return this.f384656e;
    }

    public final void k() {
        this.f384655d.c().j();
    }

    public final void l() {
        this.f384652a.a(this, true, false, null);
    }

    public final void m() {
        zs zsVar = this.f384653b;
        bx0 bx0Var = this.f384652a;
        zsVar.getClass();
        zs.f(bx0Var);
    }

    @Y61.l
    public final iz0.a a(boolean z12) throws IOException {
        try {
            iz0.a aVarA = this.f384655d.a(z12);
            if (aVarA != null) {
                aVarA.a(this);
            }
            return aVarA;
        } catch (IOException e12) {
            zs zsVar = this.f384653b;
            bx0 bx0Var = this.f384652a;
            zsVar.getClass();
            zs.b(bx0Var, e12);
            this.f384654c.a(e12);
            this.f384655d.c().a(this.f384652a, e12);
            throw e12;
        }
    }

    public final void b(@Y61.k iz0 iz0Var) {
        zs zsVar = this.f384653b;
        bx0 bx0Var = this.f384652a;
        zsVar.getClass();
        zs.a(bx0Var, iz0Var);
    }

    public final void b() {
        this.f384655d.cancel();
        this.f384652a.a(this, true, true, null);
    }

    @Y61.k
    public final ix0 a(@Y61.k iz0 iz0Var) throws IOException {
        try {
            String strA = iz0.a(iz0Var, "Content-Type");
            long jB2 = this.f384655d.b(iz0Var);
            return new ix0(strA, jB2, new okio.Y(new b(this.f384655d.a(iz0Var), jB2)));
        } catch (IOException e12) {
            zs zsVar = this.f384653b;
            bx0 bx0Var = this.f384652a;
            zsVar.getClass();
            zs.b(bx0Var, e12);
            this.f384654c.a(e12);
            this.f384655d.c().a(this.f384652a, e12);
            throw e12;
        }
    }

    public final void a() {
        this.f384655d.cancel();
    }

    public final <E extends IOException> E a(long j12, boolean z12, boolean z13, E e12) {
        if (e12 != null) {
            this.f384654c.a(e12);
            this.f384655d.c().a(this.f384652a, e12);
        }
        if (z13) {
            if (e12 != null) {
                zs zsVar = this.f384653b;
                bx0 bx0Var = this.f384652a;
                zsVar.getClass();
                zs.a(bx0Var, (IOException) e12);
            } else {
                zs zsVar2 = this.f384653b;
                bx0 bx0Var2 = this.f384652a;
                zsVar2.getClass();
                zs.a(bx0Var2);
            }
        }
        if (z12) {
            if (e12 != null) {
                zs zsVar3 = this.f384653b;
                bx0 bx0Var3 = this.f384652a;
                zsVar3.getClass();
                zs.b(bx0Var3, e12);
            } else {
                zs zsVar4 = this.f384653b;
                bx0 bx0Var4 = this.f384652a;
                zsVar4.getClass();
                zs.d(bx0Var4);
            }
        }
        return (E) this.f384652a.a(this, z13, z12, e12);
    }
}
