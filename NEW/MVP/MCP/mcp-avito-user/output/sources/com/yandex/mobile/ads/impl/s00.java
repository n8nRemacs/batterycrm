package com.yandex.mobile.ads.impl;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.remote.model.AdvertStatus;
import com.yandex.mobile.ads.impl.b71;
import com.yandex.mobile.ads.impl.iz0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.text.C43066x;
import okio.C44802l;
import okio.InterfaceC44803m;
import okio.InterfaceC44804n;

/* loaded from: classes8.dex */
public final class s00 implements et {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final bq0 f389717a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final cx0 f389718b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final InterfaceC44804n f389719c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final InterfaceC44803m f389720d;

    /* renamed from: e, reason: collision with root package name */
    private int f389721e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final hz f389722f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private gz f389723g;

    public abstract class a implements okio.e0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final okio.A f389724a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f389725b;

        public a() {
            this.f389724a = new okio.A(s00.this.f389719c.getTimeout());
        }

        public final boolean a() {
            return this.f389725b;
        }

        public final void b() {
            if (s00.this.f389721e == 6) {
                return;
            }
            if (s00.this.f389721e == 5) {
                s00.a(s00.this, this.f389724a);
                s00.this.f389721e = 6;
            } else {
                StringBuilder sbA = Cif.a("state: ");
                sbA.append(s00.this.f389721e);
                throw new IllegalStateException(sbA.toString());
            }
        }

        public final void c() {
            this.f389725b = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        @Override // okio.e0
        public long read(@Y61.k C44802l c44802l, long j12) throws IOException {
            try {
                return s00.this.f389719c.read(c44802l, j12);
            } catch (IOException e12) {
                s00.this.c().j();
                b();
                throw e12;
            }
        }

        @Override // okio.e0
        @Y61.k
        /* renamed from: timeout */
        public final okio.i0 getTimeout() {
            return this.f389724a;
        }
    }

    public final class b implements okio.c0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final okio.A f389727a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f389728b;

        public b() {
            this.f389727a = new okio.A(s00.this.f389720d.getF420032c());
        }

        @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f389728b) {
                return;
            }
            this.f389728b = true;
            s00.this.f389720d.b2("0\r\n\r\n");
            s00.a(s00.this, this.f389727a);
            s00.this.f389721e = 3;
        }

        @Override // okio.c0, java.io.Flushable
        public final synchronized void flush() {
            if (this.f389728b) {
                return;
            }
            s00.this.f389720d.flush();
        }

        @Override // okio.c0
        @Y61.k
        /* renamed from: timeout */
        public final okio.i0 getF420032c() {
            return this.f389727a;
        }

        @Override // okio.c0
        public final void write(@Y61.k C44802l c44802l, long j12) {
            if (this.f389728b) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            if (j12 == 0) {
                return;
            }
            s00.this.f389720d.z4(j12);
            s00.this.f389720d.b2("\r\n");
            s00.this.f389720d.write(c44802l, j12);
            s00.this.f389720d.b2("\r\n");
        }
    }

    public final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        private final s10 f389730d;

        /* renamed from: e, reason: collision with root package name */
        private long f389731e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f389732f;

        public c(s10 s10Var) {
            super();
            this.f389730d = s10Var;
            this.f389731e = -1L;
            this.f389732f = true;
        }

        @Override // com.yandex.mobile.ads.impl.s00.a, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (this.f389732f && !qc1.a(this, TimeUnit.MILLISECONDS)) {
                s00.this.c().j();
                b();
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.s00.a, okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
            if (j12 < 0) {
                throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
            }
            if (a()) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            if (!this.f389732f) {
                return -1L;
            }
            long j13 = this.f389731e;
            if (j13 == 0 || j13 == -1) {
                if (j13 != -1) {
                    s00.this.f389719c.n2();
                }
                try {
                    this.f389731e = s00.this.f389719c.J1();
                    String string = C43066x.A0(s00.this.f389719c.n2()).toString();
                    if (this.f389731e < 0 || (string.length() > 0 && !C43066x.h0(string, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f389731e + string + '\"');
                    }
                    if (this.f389731e == 0) {
                        this.f389732f = false;
                        s00 s00Var = s00.this;
                        s00Var.f389723g = s00Var.f389722f.a();
                        l10.a(s00.this.f389717a.h(), this.f389730d, s00.this.f389723g);
                        b();
                    }
                    if (!this.f389732f) {
                        return -1L;
                    }
                } catch (NumberFormatException e12) {
                    throw new ProtocolException(e12.getMessage());
                }
            }
            long j14 = super.read(c44802l, Math.min(j12, this.f389731e));
            if (j14 != -1) {
                this.f389731e -= j14;
                return j14;
            }
            s00.this.c().j();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
    }

    public final class d extends a {

        /* renamed from: d, reason: collision with root package name */
        private long f389734d;

        public d(long j12) {
            super();
            this.f389734d = j12;
            if (j12 == 0) {
                b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.s00.a, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (this.f389734d != 0 && !qc1.a(this, TimeUnit.MILLISECONDS)) {
                s00.this.c().j();
                b();
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.s00.a, okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
            if (j12 < 0) {
                throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
            }
            if (a()) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            long j13 = this.f389734d;
            if (j13 == 0) {
                return -1L;
            }
            long j14 = super.read(c44802l, Math.min(j13, j12));
            if (j14 == -1) {
                s00.this.c().j();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j15 = this.f389734d - j14;
            this.f389734d = j15;
            if (j15 == 0) {
                b();
            }
            return j14;
        }
    }

    public final class e implements okio.c0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final okio.A f389736a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f389737b;

        public e() {
            this.f389736a = new okio.A(s00.this.f389720d.getF420032c());
        }

        @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f389737b) {
                return;
            }
            this.f389737b = true;
            s00.a(s00.this, this.f389736a);
            s00.this.f389721e = 3;
        }

        @Override // okio.c0, java.io.Flushable
        public final void flush() {
            if (this.f389737b) {
                return;
            }
            s00.this.f389720d.flush();
        }

        @Override // okio.c0
        @Y61.k
        /* renamed from: timeout */
        public final okio.i0 getF420032c() {
            return this.f389736a;
        }

        @Override // okio.c0
        public final void write(@Y61.k C44802l c44802l, long j12) {
            if (this.f389737b) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            qc1.a(c44802l.f420125c, 0L, j12);
            s00.this.f389720d.write(c44802l, j12);
        }
    }

    public final class f extends a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f389739d;

        public f(s00 s00Var) {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.s00.a, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (!this.f389739d) {
                b();
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.s00.a, okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
            if (j12 < 0) {
                throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
            }
            if (a()) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            if (this.f389739d) {
                return -1L;
            }
            long j13 = super.read(c44802l, j12);
            if (j13 != -1) {
                return j13;
            }
            this.f389739d = true;
            b();
            return -1L;
        }
    }

    public s00(@Y61.l bq0 bq0Var, @Y61.k cx0 cx0Var, @Y61.k InterfaceC44804n interfaceC44804n, @Y61.k InterfaceC44803m interfaceC44803m) {
        this.f389717a = bq0Var;
        this.f389718b = cx0Var;
        this.f389719c = interfaceC44804n;
        this.f389720d = interfaceC44803m;
        this.f389722f = new hz(interfaceC44804n);
    }

    public static final void a(s00 s00Var, okio.A a12) {
        s00Var.getClass();
        okio.i0 i0Var = a12.f420009b;
        a12.f420009b = okio.i0.NONE;
        i0Var.clearDeadline();
        i0Var.clearTimeout();
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final void cancel() {
        this.f389718b.a();
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final long b(@Y61.k iz0 iz0Var) {
        if (!l10.a(iz0Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(iz0.a(iz0Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return qc1.a(iz0Var);
    }

    @Override // com.yandex.mobile.ads.impl.et
    @Y61.k
    public final cx0 c() {
        return this.f389718b;
    }

    public final void c(@Y61.k iz0 iz0Var) {
        long jA2 = qc1.a(iz0Var);
        if (jA2 == -1) {
            return;
        }
        okio.e0 e0VarA = a(jA2);
        qc1.a(e0VarA, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        ((d) e0VarA).close();
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final void b() {
        this.f389720d.flush();
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final void a(@Y61.k ry0 ry0Var) {
        a(ry0Var.d(), xy0.a(ry0Var, this.f389718b.k().b().type()));
    }

    @Override // com.yandex.mobile.ads.impl.et
    @Y61.k
    public final okio.c0 a(@Y61.k ry0 ry0Var, long j12) {
        if (ry0Var.a() != null) {
            ry0Var.a().getClass();
        }
        if ("chunked".equalsIgnoreCase(ry0Var.a("Transfer-Encoding"))) {
            if (this.f389721e == 1) {
                this.f389721e = 2;
                return new b();
            }
            StringBuilder sbA = Cif.a("state: ");
            sbA.append(this.f389721e);
            throw new IllegalStateException(sbA.toString().toString());
        }
        if (j12 != -1) {
            if (this.f389721e == 1) {
                this.f389721e = 2;
                return new e();
            }
            StringBuilder sbA2 = Cif.a("state: ");
            sbA2.append(this.f389721e);
            throw new IllegalStateException(sbA2.toString().toString());
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.yandex.mobile.ads.impl.et
    @Y61.k
    public final okio.e0 a(@Y61.k iz0 iz0Var) {
        if (!l10.a(iz0Var)) {
            return a(0L);
        }
        if ("chunked".equalsIgnoreCase(iz0.a(iz0Var, "Transfer-Encoding"))) {
            s10 s10VarH = iz0Var.p().h();
            if (this.f389721e == 4) {
                this.f389721e = 5;
                return new c(s10VarH);
            }
            StringBuilder sbA = Cif.a("state: ");
            sbA.append(this.f389721e);
            throw new IllegalStateException(sbA.toString().toString());
        }
        long jA2 = qc1.a(iz0Var);
        if (jA2 != -1) {
            return a(jA2);
        }
        if (this.f389721e == 4) {
            this.f389721e = 5;
            this.f389718b.j();
            return new f(this);
        }
        StringBuilder sbA2 = Cif.a("state: ");
        sbA2.append(this.f389721e);
        throw new IllegalStateException(sbA2.toString().toString());
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final void a() {
        this.f389720d.flush();
    }

    public final void a(@Y61.k gz gzVar, @Y61.k String str) {
        if (this.f389721e == 0) {
            this.f389720d.b2(str).b2("\r\n");
            int size = gzVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f389720d.b2(gzVar.a(i12)).b2(": ").b2(gzVar.b(i12)).b2("\r\n");
            }
            this.f389720d.b2("\r\n");
            this.f389721e = 1;
            return;
        }
        StringBuilder sbA = Cif.a("state: ");
        sbA.append(this.f389721e);
        throw new IllegalStateException(sbA.toString().toString());
    }

    @Override // com.yandex.mobile.ads.impl.et
    @Y61.l
    public final iz0.a a(boolean z12) throws NumberFormatException, IOException {
        int i12 = this.f389721e;
        if (i12 != 1 && i12 != 3) {
            StringBuilder sbA = Cif.a("state: ");
            sbA.append(this.f389721e);
            throw new IllegalStateException(sbA.toString().toString());
        }
        try {
            b71 b71VarA = b71.a.a(this.f389722f.b());
            iz0.a aVarA = new iz0.a().a(b71VarA.f383804a).a(b71VarA.f383805b).b(b71VarA.f383806c).a(this.f389722f.a());
            if (z12 && b71VarA.f383805b == 100) {
                return null;
            }
            if (b71VarA.f383805b == 100) {
                this.f389721e = 3;
                return aVarA;
            }
            this.f389721e = 4;
            return aVarA;
        } catch (EOFException e12) {
            throw new IOException(up1.a("unexpected end of stream on ", this.f389718b.k().a().k().k()), e12);
        }
    }

    private final okio.e0 a(long j12) {
        if (this.f389721e == 4) {
            this.f389721e = 5;
            return new d(j12);
        }
        StringBuilder sbA = Cif.a("state: ");
        sbA.append(this.f389721e);
        throw new IllegalStateException(sbA.toString().toString());
    }
}
