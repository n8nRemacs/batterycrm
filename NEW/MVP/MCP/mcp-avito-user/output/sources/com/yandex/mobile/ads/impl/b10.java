package com.yandex.mobile.ads.impl;

import androidx.compose.foundation.text.selection.C21030p;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import okio.C44800j;
import okio.C44802l;
import okio.InterfaceC44804n;

/* loaded from: classes8.dex */
public final class b10 {

    /* renamed from: a, reason: collision with root package name */
    private final int f383727a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final u00 f383728b;

    /* renamed from: c, reason: collision with root package name */
    private long f383729c;

    /* renamed from: d, reason: collision with root package name */
    private long f383730d;

    /* renamed from: e, reason: collision with root package name */
    private long f383731e;

    /* renamed from: f, reason: collision with root package name */
    private long f383732f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final ArrayDeque<gz> f383733g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f383734h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    private final b f383735i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    private final a f383736j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    private final c f383737k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    private final c f383738l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    private xs f383739m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    private IOException f383740n;

    public final class a implements okio.c0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f383741a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final C44802l f383742b = new C44802l();

        /* renamed from: c, reason: collision with root package name */
        private boolean f383743c;

        public a(boolean z12) {
            this.f383741a = z12;
        }

        public final boolean a() {
            return this.f383743c;
        }

        public final boolean b() {
            return this.f383741a;
        }

        @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            b10 b10Var = b10.this;
            if (qc1.f389148f && Thread.holdsLock(b10Var)) {
                StringBuilder sbA = Cif.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(b10Var);
                throw new AssertionError(sbA.toString());
            }
            b10 b10Var2 = b10.this;
            synchronized (b10Var2) {
                if (this.f383743c) {
                    return;
                }
                boolean z12 = b10Var2.d() == null;
                kotlin.G0 g02 = kotlin.G0.f406611a;
                if (!b10.this.k().f383741a) {
                    if (this.f383742b.f420125c > 0) {
                        while (this.f383742b.f420125c > 0) {
                            a(true);
                        }
                    } else if (z12) {
                        b10.this.c().a(b10.this.f(), true, (C44802l) null, 0L);
                    }
                }
                synchronized (b10.this) {
                    this.f383743c = true;
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                }
                b10.this.c().flush();
                b10.this.a();
            }
        }

        @Override // okio.c0, java.io.Flushable
        public final void flush() throws IOException {
            b10 b10Var = b10.this;
            if (qc1.f389148f && Thread.holdsLock(b10Var)) {
                StringBuilder sbA = Cif.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(b10Var);
                throw new AssertionError(sbA.toString());
            }
            b10 b10Var2 = b10.this;
            synchronized (b10Var2) {
                b10Var2.b();
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
            while (this.f383742b.f420125c > 0) {
                a(false);
                b10.this.c().flush();
            }
        }

        @Override // okio.c0
        @Y61.k
        /* renamed from: timeout */
        public final okio.i0 getF420032c() {
            return b10.this.o();
        }

        @Override // okio.c0
        public final void write(@Y61.k C44802l c44802l, long j12) throws IOException {
            b10 b10Var = b10.this;
            if (!qc1.f389148f || !Thread.holdsLock(b10Var)) {
                this.f383742b.write(c44802l, j12);
                while (this.f383742b.f420125c >= 16384) {
                    a(false);
                }
            } else {
                StringBuilder sbA = Cif.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(b10Var);
                throw new AssertionError(sbA.toString());
            }
        }

        private final void a(boolean z12) throws IOException {
            long jMin;
            boolean z13;
            b10 b10Var = b10.this;
            synchronized (b10Var) {
                try {
                    b10Var.o().enter();
                    while (b10Var.n() >= b10Var.m() && !this.f383741a && !this.f383743c && b10Var.d() == null) {
                        try {
                            b10Var.t();
                        } finally {
                            b10Var.o().a();
                        }
                    }
                    b10Var.o().a();
                    b10Var.b();
                    jMin = Math.min(b10Var.m() - b10Var.n(), this.f383742b.f420125c);
                    b10Var.d(b10Var.n() + jMin);
                    z13 = z12 && jMin == this.f383742b.f420125c;
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b10.this.o().enter();
            try {
                b10.this.c().a(b10.this.f(), z13, this.f383742b, jMin);
            } finally {
                b10Var = b10.this;
            }
        }
    }

    public final class b implements okio.e0 {

        /* renamed from: a, reason: collision with root package name */
        private final long f383745a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f383746b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final C44802l f383747c = new C44802l();

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        private final C44802l f383748d = new C44802l();

        /* renamed from: e, reason: collision with root package name */
        private boolean f383749e;

        public b(long j12, boolean z12) {
            this.f383745a = j12;
            this.f383746b = z12;
        }

        public final boolean a() {
            return this.f383749e;
        }

        public final boolean b() {
            return this.f383746b;
        }

        public final void c() {
            this.f383746b = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j12;
            b10 b10Var = b10.this;
            synchronized (b10Var) {
                this.f383749e = true;
                C44802l c44802l = this.f383748d;
                j12 = c44802l.f420125c;
                c44802l.a();
                b10Var.notifyAll();
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
            if (j12 > 0) {
                a(j12);
            }
            b10.this.a();
        }

        @Override // okio.e0
        public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
            IOException iOExceptionE;
            boolean z12;
            long j13;
            long j14 = 0;
            if (j12 < 0) {
                throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
            }
            while (true) {
                b10 b10Var = b10.this;
                synchronized (b10Var) {
                    b10Var.i().enter();
                    try {
                        if (b10Var.d() != null) {
                            iOExceptionE = b10Var.e();
                            if (iOExceptionE == null) {
                                iOExceptionE = new f71(b10Var.d());
                            }
                        } else {
                            iOExceptionE = null;
                        }
                        if (this.f383749e) {
                            throw new IOException("stream closed");
                        }
                        C44802l c44802l2 = this.f383748d;
                        long j15 = c44802l2.f420125c;
                        z12 = false;
                        if (j15 > j14) {
                            j13 = c44802l2.read(c44802l, Math.min(j12, j15));
                            b10Var.c(b10Var.h() + j13);
                            long jH2 = b10Var.h() - b10Var.g();
                            if (iOExceptionE == null && jH2 >= b10Var.c().g().b() / 2) {
                                b10Var.c().a(b10Var.f(), jH2);
                                b10Var.b(b10Var.h());
                            }
                        } else {
                            if (!this.f383746b && iOExceptionE == null) {
                                b10Var.t();
                                z12 = true;
                            }
                            j13 = -1;
                        }
                        b10Var.i().a();
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } finally {
                    }
                }
                if (!z12) {
                    if (j13 != -1) {
                        a(j13);
                        return j13;
                    }
                    if (iOExceptionE == null) {
                        return -1L;
                    }
                    throw iOExceptionE;
                }
                j14 = 0;
            }
        }

        @Override // okio.e0
        @Y61.k
        /* renamed from: timeout */
        public final okio.i0 getF420025c() {
            return b10.this.i();
        }

        private final void a(long j12) {
            b10 b10Var = b10.this;
            if (!qc1.f389148f || !Thread.holdsLock(b10Var)) {
                b10.this.c().b(j12);
                return;
            }
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(b10Var);
            throw new AssertionError(sbA.toString());
        }

        public final void a(@Y61.k InterfaceC44804n interfaceC44804n, long j12) throws EOFException {
            boolean z12;
            boolean z13;
            long j13;
            b10 b10Var = b10.this;
            if (qc1.f389148f && Thread.holdsLock(b10Var)) {
                StringBuilder sbA = Cif.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(b10Var);
                throw new AssertionError(sbA.toString());
            }
            while (j12 > 0) {
                synchronized (b10.this) {
                    z12 = this.f383746b;
                    z13 = this.f383748d.f420125c + j12 > this.f383745a;
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                }
                if (z13) {
                    interfaceC44804n.skip(j12);
                    b10.this.a(xs.f391802e);
                    return;
                }
                if (z12) {
                    interfaceC44804n.skip(j12);
                    return;
                }
                long j14 = interfaceC44804n.read(this.f383747c, j12);
                if (j14 != -1) {
                    j12 -= j14;
                    b10 b10Var2 = b10.this;
                    synchronized (b10Var2) {
                        try {
                            if (this.f383749e) {
                                C44802l c44802l = this.f383747c;
                                j13 = c44802l.f420125c;
                                c44802l.a();
                            } else {
                                C44802l c44802l2 = this.f383748d;
                                boolean z14 = c44802l2.f420125c == 0;
                                c44802l2.h2(this.f383747c);
                                if (z14) {
                                    b10Var2.notifyAll();
                                }
                                j13 = 0;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (j13 > 0) {
                        a(j13);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }
    }

    public final class c extends C44800j {
        public c() {
        }

        public final void a() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.C44800j
        @Y61.k
        public final IOException newTimeoutException(@Y61.l IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.C44800j
        public final void timedOut() {
            b10.this.a(xs.f391804g);
            b10.this.c().l();
        }
    }

    public b10(int i12, @Y61.k u00 u00Var, boolean z12, boolean z13, @Y61.l gz gzVar) {
        this.f383727a = i12;
        this.f383728b = u00Var;
        this.f383732f = u00Var.h().b();
        ArrayDeque<gz> arrayDeque = new ArrayDeque<>();
        this.f383733g = arrayDeque;
        this.f383735i = new b(u00Var.g().b(), z13);
        this.f383736j = new a(z12);
        this.f383737k = new c();
        this.f383738l = new c();
        if (gzVar == null) {
            if (!p()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (p()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(gzVar);
        }
    }

    public final void a(@Y61.k xs xsVar, @Y61.l IOException iOException) {
        if (b(xsVar, iOException)) {
            this.f383728b.b(this.f383727a, xsVar);
        }
    }

    public final void b(long j12) {
        this.f383730d = j12;
    }

    @Y61.k
    public final u00 c() {
        return this.f383728b;
    }

    public final void d(long j12) {
        this.f383731e = j12;
    }

    @Y61.l
    public final IOException e() {
        return this.f383740n;
    }

    public final int f() {
        return this.f383727a;
    }

    public final long g() {
        return this.f383730d;
    }

    public final long h() {
        return this.f383729c;
    }

    @Y61.k
    public final c i() {
        return this.f383737k;
    }

    @Y61.k
    public final a j() {
        synchronized (this) {
            try {
                if (!this.f383734h && !p()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f383736j;
    }

    @Y61.k
    public final a k() {
        return this.f383736j;
    }

    @Y61.k
    public final b l() {
        return this.f383735i;
    }

    public final long m() {
        return this.f383732f;
    }

    public final long n() {
        return this.f383731e;
    }

    @Y61.k
    public final c o() {
        return this.f383738l;
    }

    public final boolean p() {
        return this.f383728b.b() == ((this.f383727a & 1) == 1);
    }

    public final synchronized boolean q() {
        try {
            if (this.f383739m != null) {
                return false;
            }
            if (this.f383735i.b() || this.f383735i.a()) {
                if (this.f383736j.b() || this.f383736j.a()) {
                    if (this.f383734h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Y61.k
    public final c r() {
        return this.f383737k;
    }

    @Y61.k
    public final synchronized gz s() throws IOException {
        this.f383737k.enter();
        while (this.f383733g.isEmpty() && this.f383739m == null) {
            try {
                t();
            } catch (Throwable th2) {
                this.f383737k.a();
                throw th2;
            }
        }
        this.f383737k.a();
        if (this.f383733g.isEmpty()) {
            IOException iOException = this.f383740n;
            if (iOException != null) {
                throw iOException;
            }
            throw new f71(this.f383739m);
        }
        return this.f383733g.removeFirst();
    }

    public final void t() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @Y61.k
    public final c u() {
        return this.f383738l;
    }

    public final synchronized void b(@Y61.k xs xsVar) {
        if (this.f383739m == null) {
            this.f383739m = xsVar;
            notifyAll();
        }
    }

    public final void c(long j12) {
        this.f383729c = j12;
    }

    @Y61.l
    public final synchronized xs d() {
        return this.f383739m;
    }

    public final void a(@Y61.k xs xsVar) {
        if (b(xsVar, null)) {
            this.f383728b.c(this.f383727a, xsVar);
        }
    }

    public final void a(long j12) {
        this.f383732f += j12;
        if (j12 > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        if (!this.f383736j.a()) {
            if (!this.f383736j.b()) {
                if (this.f383739m != null) {
                    IOException iOException = this.f383740n;
                    if (iOException == null) {
                        throw new f71(this.f383739m);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void a(@Y61.k InterfaceC44804n interfaceC44804n, int i12) throws EOFException {
        if (qc1.f389148f && Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        this.f383735i.a(interfaceC44804n, i12);
    }

    private final boolean b(xs xsVar, IOException iOException) {
        if (qc1.f389148f && Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            if (this.f383739m != null) {
                return false;
            }
            if (this.f383735i.b() && this.f383736j.b()) {
                return false;
            }
            this.f383739m = xsVar;
            this.f383740n = iOException;
            notifyAll();
            kotlin.G0 g02 = kotlin.G0.f406611a;
            this.f383728b.c(this.f383727a);
            return true;
        }
    }

    public final void a(@Y61.k gz gzVar, boolean z12) {
        boolean zQ2;
        if (qc1.f389148f && Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            try {
                if (this.f383734h && z12) {
                    this.f383735i.getClass();
                } else {
                    this.f383734h = true;
                    this.f383733g.add(gzVar);
                }
                if (z12) {
                    this.f383735i.c();
                }
                zQ2 = q();
                notifyAll();
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zQ2) {
            return;
        }
        this.f383728b.c(this.f383727a);
    }

    public final void a() {
        boolean z12;
        boolean zQ2;
        if (qc1.f389148f && Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            try {
                z12 = !this.f383735i.b() && this.f383735i.a() && (this.f383736j.b() || this.f383736j.a());
                zQ2 = q();
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            a(xs.f391804g, (IOException) null);
        } else {
            if (zQ2) {
                return;
            }
            this.f383728b.c(this.f383727a);
        }
    }
}
