package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a10;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44803m;
import okio.InterfaceC44804n;

/* loaded from: classes8.dex */
public final class u00 implements Closeable {

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    private static final m31 f390349C;

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f390350D = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    private final d f390351A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f390352B;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f390353a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final c f390354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final LinkedHashMap f390355c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final String f390356d;

    /* renamed from: e, reason: collision with root package name */
    private int f390357e;

    /* renamed from: f, reason: collision with root package name */
    private int f390358f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f390359g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final o81 f390360h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    private final n81 f390361i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    private final n81 f390362j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    private final n81 f390363k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    private final iw0 f390364l;

    /* renamed from: m, reason: collision with root package name */
    private long f390365m;

    /* renamed from: n, reason: collision with root package name */
    private long f390366n;

    /* renamed from: o, reason: collision with root package name */
    private long f390367o;

    /* renamed from: p, reason: collision with root package name */
    private long f390368p;

    /* renamed from: q, reason: collision with root package name */
    private long f390369q;

    /* renamed from: r, reason: collision with root package name */
    private long f390370r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    private final m31 f390371s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    private m31 f390372t;

    /* renamed from: u, reason: collision with root package name */
    private long f390373u;

    /* renamed from: v, reason: collision with root package name */
    private long f390374v;

    /* renamed from: w, reason: collision with root package name */
    private long f390375w;

    /* renamed from: x, reason: collision with root package name */
    private long f390376x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    private final Socket f390377y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    private final c10 f390378z;

    public static final class b {
        @Y61.k
        public static m31 a() {
            return u00.f390349C;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public static final a f390388a = new a();

        public static final class a extends c {
            @Override // com.yandex.mobile.ads.impl.u00.c
            public final void a(@Y61.k b10 b10Var) {
                b10Var.a(xs.f391803f, (IOException) null);
            }
        }

        public abstract void a(@Y61.k b10 b10Var);

        public void a(@Y61.k u00 u00Var, @Y61.k m31 m31Var) {
        }
    }

    public final class d implements a10.c, Y41.a<kotlin.G0> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final a10 f390389a;

        public static final class a extends k81 {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ u00 f390391e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ l0.h f390392f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, u00 u00Var, l0.h hVar) {
                super(str, true);
                this.f390391e = u00Var;
                this.f390392f = hVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yandex.mobile.ads.impl.k81
            public final long e() {
                this.f390391e.e().a(this.f390391e, (m31) this.f390392f.f406842b);
                return -1L;
            }
        }

        public d(a10 a10Var) {
            this.f390389a = a10Var;
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.mobile.ads.impl.xs] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.G0] */
        @Override // Y41.a
        public final kotlin.G0 invoke() throws Throwable {
            xs xsVar;
            xs xsVar2;
            xs xsVar3;
            ?? r02 = xs.f391801d;
            IOException e12 = null;
            try {
                try {
                    this.f390389a.a(this);
                    while (this.f390389a.a(false, this)) {
                    }
                    xs xsVar4 = xs.f391799b;
                    try {
                        u00.this.a(xsVar4, xs.f391804g, (IOException) null);
                        qc1.a(this.f390389a);
                        xsVar3 = xsVar4;
                    } catch (IOException e13) {
                        e12 = e13;
                        xs xsVar5 = xs.f391800c;
                        u00 u00Var = u00.this;
                        u00Var.a(xsVar5, xsVar5, e12);
                        qc1.a(this.f390389a);
                        xsVar3 = u00Var;
                        r02 = kotlin.G0.f406611a;
                        return r02;
                    }
                } catch (Throwable th2) {
                    xsVar = xsVar3;
                    th = th2;
                    xsVar2 = r02;
                    u00.this.a(xsVar, xsVar2, e12);
                    qc1.a(this.f390389a);
                    throw th;
                }
            } catch (IOException e14) {
                e12 = e14;
            } catch (Throwable th3) {
                th = th3;
                xsVar = r02;
                xsVar2 = r02;
                u00.this.a(xsVar, xsVar2, e12);
                qc1.a(this.f390389a);
                throw th;
            }
            r02 = kotlin.G0.f406611a;
            return r02;
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void a(int i12, int i13, @Y61.k InterfaceC44804n interfaceC44804n, boolean z12) throws EOFException {
            u00.this.getClass();
            if (u00.b(i12)) {
                u00.this.a(i12, i13, interfaceC44804n, z12);
                return;
            }
            b10 b10VarA = u00.this.a(i12);
            if (b10VarA == null) {
                u00.this.c(i12, xs.f391800c);
                long j12 = i13;
                u00.this.b(j12);
                interfaceC44804n.skip(j12);
                return;
            }
            b10VarA.a(interfaceC44804n, i13);
            if (z12) {
                b10VarA.a(qc1.f389144b, true);
            }
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void a(boolean z12, int i12, @Y61.k List list) {
            u00.this.getClass();
            if (u00.b(i12)) {
                u00.this.a(i12, (List<ez>) list, z12);
                return;
            }
            u00 u00Var = u00.this;
            synchronized (u00Var) {
                b10 b10VarA = u00Var.a(i12);
                if (b10VarA == null) {
                    if (u00Var.f390359g) {
                        return;
                    }
                    if (i12 <= u00Var.d()) {
                        return;
                    }
                    if (i12 % 2 == u00Var.f() % 2) {
                        return;
                    }
                    b10 b10Var = new b10(i12, u00Var, false, z12, qc1.a((List<ez>) list));
                    u00Var.d(i12);
                    u00Var.i().put(Integer.valueOf(i12), b10Var);
                    u00Var.f390360h.e().a(new v00(u00Var.c() + '[' + i12 + "] onStream", u00Var, b10Var), 0L);
                    return;
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                b10VarA.a(qc1.a((List<ez>) list), z12);
            }
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void b() {
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void a(int i12, @Y61.k xs xsVar, @Y61.k C44805o c44805o) {
            int i13;
            Object[] array;
            c44805o.d();
            u00 u00Var = u00.this;
            synchronized (u00Var) {
                array = u00Var.i().values().toArray(new b10[0]);
                u00Var.f390359g = true;
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
            for (b10 b10Var : (b10[]) array) {
                if (b10Var.f() > i12 && b10Var.p()) {
                    b10Var.b(xs.f391803f);
                    u00.this.c(b10Var.f());
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void a(int i12, @Y61.k xs xsVar) {
            u00.this.getClass();
            if (u00.b(i12)) {
                u00.this.a(i12, xsVar);
                return;
            }
            b10 b10VarC = u00.this.c(i12);
            if (b10VarC != null) {
                b10VarC.b(xsVar);
            }
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void a(@Y61.k m31 m31Var) {
            u00.this.f390361i.a(new x00(u00.this.c() + " applyAndAckSettings", this, m31Var), 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v2, types: [T, com.yandex.mobile.ads.impl.m31] */
        /* JADX WARN: Type inference failed for: r12v3 */
        public final void a(boolean z12, @Y61.k m31 m31Var) {
            ?? r12;
            long jB2;
            int i12;
            b10[] b10VarArr;
            l0.h hVar = new l0.h();
            c10 c10VarK = u00.this.k();
            u00 u00Var = u00.this;
            synchronized (c10VarK) {
                synchronized (u00Var) {
                    try {
                        m31 m31VarH = u00Var.h();
                        if (z12) {
                            r12 = m31Var;
                        } else {
                            m31 m31Var2 = new m31();
                            m31Var2.a(m31VarH);
                            m31Var2.a(m31Var);
                            r12 = m31Var2;
                        }
                        hVar.f406842b = r12;
                        jB2 = r12.b() - m31VarH.b();
                        b10VarArr = (jB2 == 0 || u00Var.i().isEmpty()) ? null : (b10[]) u00Var.i().values().toArray(new b10[0]);
                        u00Var.a((m31) hVar.f406842b);
                        u00Var.f390363k.a(new a(u00Var.c() + " onSettings", u00Var, hVar), 0L);
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    u00Var.k().a((m31) hVar.f406842b);
                } catch (IOException e12) {
                    u00.a(u00Var, e12);
                }
                kotlin.G0 g03 = kotlin.G0.f406611a;
            }
            if (b10VarArr != null) {
                for (b10 b10Var : b10VarArr) {
                    synchronized (b10Var) {
                        b10Var.a(jB2);
                        kotlin.G0 g04 = kotlin.G0.f406611a;
                    }
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void a(int i12, int i13, boolean z12) {
            if (!z12) {
                u00.this.f390361i.a(new w00(u00.this.c() + " ping", u00.this, i12, i13), 0L);
                return;
            }
            u00 u00Var = u00.this;
            synchronized (u00Var) {
                try {
                    if (i12 == 1) {
                        u00Var.f390366n++;
                    } else if (i12 != 2) {
                        if (i12 == 3) {
                            u00Var.f390369q++;
                            u00Var.notifyAll();
                        }
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } else {
                        u00Var.f390368p++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void a(int i12, long j12) {
            if (i12 == 0) {
                u00 u00Var = u00.this;
                synchronized (u00Var) {
                    u00Var.f390376x = u00Var.j() + j12;
                    u00Var.notifyAll();
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                }
                return;
            }
            b10 b10VarA = u00.this.a(i12);
            if (b10VarA != null) {
                synchronized (b10VarA) {
                    b10VarA.a(j12);
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.a10.c
        public final void a(int i12, @Y61.k List list) {
            u00.this.a(i12, (List<ez>) list);
        }
    }

    public static final class e extends k81 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u00 f390393e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f390394f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f390395g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, u00 u00Var, int i12, List list, boolean z12) {
            super(str, true);
            this.f390393e = u00Var;
            this.f390394f = i12;
            this.f390395g = list;
        }

        @Override // com.yandex.mobile.ads.impl.k81
        public final long e() {
            ((hw0) this.f390393e.f390364l).a(this.f390395g);
            try {
                this.f390393e.k().a(this.f390394f, xs.f391804g);
                synchronized (this.f390393e) {
                    this.f390393e.f390352B.remove(Integer.valueOf(this.f390394f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class f extends k81 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u00 f390396e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f390397f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f390398g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, u00 u00Var, int i12, List list) {
            super(str, true);
            this.f390396e = u00Var;
            this.f390397f = i12;
            this.f390398g = list;
        }

        @Override // com.yandex.mobile.ads.impl.k81
        public final long e() {
            ((hw0) this.f390396e.f390364l).b(this.f390398g);
            try {
                this.f390396e.k().a(this.f390397f, xs.f391804g);
                synchronized (this.f390396e) {
                    this.f390396e.f390352B.remove(Integer.valueOf(this.f390397f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class g extends k81 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u00 f390399e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f390400f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ xs f390401g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, u00 u00Var, int i12, xs xsVar) {
            super(str, true);
            this.f390399e = u00Var;
            this.f390400f = i12;
            this.f390401g = xsVar;
        }

        @Override // com.yandex.mobile.ads.impl.k81
        public final long e() {
            ((hw0) this.f390399e.f390364l).a(this.f390401g);
            synchronized (this.f390399e) {
                this.f390399e.f390352B.remove(Integer.valueOf(this.f390400f));
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
            return -1L;
        }
    }

    public static final class h extends k81 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u00 f390402e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, u00 u00Var) {
            super(str, true);
            this.f390402e = u00Var;
        }

        @Override // com.yandex.mobile.ads.impl.k81
        public final long e() {
            this.f390402e.a(2, 0, false);
            return -1L;
        }
    }

    public static final class i extends k81 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u00 f390403e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f390404f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, u00 u00Var, long j12) {
            super(str);
            this.f390403e = u00Var;
            this.f390404f = j12;
        }

        @Override // com.yandex.mobile.ads.impl.k81
        public final long e() throws IOException {
            boolean z12;
            synchronized (this.f390403e) {
                if (this.f390403e.f390366n < this.f390403e.f390365m) {
                    z12 = true;
                } else {
                    this.f390403e.f390365m++;
                    z12 = false;
                }
            }
            if (!z12) {
                this.f390403e.a(1, 0, false);
                return this.f390404f;
            }
            u00 u00Var = this.f390403e;
            xs xsVar = xs.f391800c;
            u00Var.a(xsVar, xsVar, (IOException) null);
            return -1L;
        }
    }

    public static final class j extends k81 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u00 f390405e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f390406f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ xs f390407g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, u00 u00Var, int i12, xs xsVar) {
            super(str, true);
            this.f390405e = u00Var;
            this.f390406f = i12;
            this.f390407g = xsVar;
        }

        @Override // com.yandex.mobile.ads.impl.k81
        public final long e() throws IOException {
            try {
                this.f390405e.b(this.f390406f, this.f390407g);
                return -1L;
            } catch (IOException e12) {
                u00 u00Var = this.f390405e;
                xs xsVar = xs.f391800c;
                u00Var.a(xsVar, xsVar, e12);
                return -1L;
            }
        }
    }

    public static final class k extends k81 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u00 f390408e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f390409f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f390410g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, u00 u00Var, int i12, long j12) {
            super(str, true);
            this.f390408e = u00Var;
            this.f390409f = i12;
            this.f390410g = j12;
        }

        @Override // com.yandex.mobile.ads.impl.k81
        public final long e() throws IOException {
            try {
                this.f390408e.k().a(this.f390409f, this.f390410g);
                return -1L;
            } catch (IOException e12) {
                u00 u00Var = this.f390408e;
                xs xsVar = xs.f391800c;
                u00Var.a(xsVar, xsVar, e12);
                return -1L;
            }
        }
    }

    static {
        m31 m31Var = new m31();
        m31Var.a(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        m31Var.a(5, Http2.INITIAL_MAX_FRAME_SIZE);
        f390349C = m31Var;
    }

    public u00(@Y61.k a aVar) {
        boolean zB2 = aVar.b();
        this.f390353a = zB2;
        this.f390354b = aVar.d();
        this.f390355c = new LinkedHashMap();
        String strC = aVar.c();
        this.f390356d = strC;
        this.f390358f = aVar.b() ? 3 : 2;
        o81 o81VarJ = aVar.j();
        this.f390360h = o81VarJ;
        n81 n81VarE = o81VarJ.e();
        this.f390361i = n81VarE;
        this.f390362j = o81VarJ.e();
        this.f390363k = o81VarJ.e();
        this.f390364l = aVar.f();
        m31 m31Var = new m31();
        if (aVar.b()) {
            m31Var.a(7, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.f390371s = m31Var;
        this.f390372t = f390349C;
        this.f390376x = r2.b();
        this.f390377y = aVar.h();
        this.f390378z = new c10(aVar.g(), zB2);
        this.f390351A = new d(new a10(aVar.i(), zB2));
        this.f390352B = new LinkedHashSet();
        if (aVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(aVar.e());
            n81VarE.a(new i(up1.a(strC, " ping"), this, nanos), nanos);
        }
    }

    public static boolean b(int i12) {
        return i12 != 0 && (i12 & 1) == 0;
    }

    public static void l(u00 u00Var) {
        o81 o81Var = o81.f388458h;
        u00Var.f390378z.a();
        u00Var.f390378z.b(u00Var.f390371s);
        if (u00Var.f390371s.b() != 65535) {
            u00Var.f390378z.a(0, r1 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        o81Var.e().a(new m81(u00Var.f390356d, u00Var.f390351A), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(xs.f391799b, xs.f391804g, (IOException) null);
    }

    public final void flush() {
        this.f390378z.flush();
    }

    public final int f() {
        return this.f390358f;
    }

    @Y61.k
    public final m31 g() {
        return this.f390371s;
    }

    @Y61.k
    public final m31 h() {
        return this.f390372t;
    }

    @Y61.k
    public final LinkedHashMap i() {
        return this.f390355c;
    }

    public final long j() {
        return this.f390376x;
    }

    @Y61.k
    public final c10 k() {
        return this.f390378z;
    }

    @Y61.k
    public final String c() {
        return this.f390356d;
    }

    public final int d() {
        return this.f390357e;
    }

    @Y61.k
    public final c e() {
        return this.f390354b;
    }

    public final void a(@Y61.k m31 m31Var) {
        this.f390372t = m31Var;
    }

    public final boolean b() {
        return this.f390353a;
    }

    @Y61.l
    public final synchronized b10 c(int i12) {
        b10 b10Var;
        b10Var = (b10) this.f390355c.remove(Integer.valueOf(i12));
        notifyAll();
        return b10Var;
    }

    public final void d(int i12) {
        this.f390357e = i12;
    }

    @Y61.l
    public final synchronized b10 a(int i12) {
        return (b10) this.f390355c.get(Integer.valueOf(i12));
    }

    public final synchronized void b(long j12) {
        long j13 = this.f390373u + j12;
        this.f390373u = j13;
        long j14 = j13 - this.f390374v;
        if (j14 >= this.f390371s.b() / 2) {
            a(0, j14);
            this.f390374v += j14;
        }
    }

    @Y61.k
    public final b10 a(@Y61.k ArrayList arrayList, boolean z12) {
        int i12;
        b10 b10Var;
        boolean z13 = true;
        boolean z14 = !z12;
        synchronized (this.f390378z) {
            synchronized (this) {
                if (this.f390358f > 1073741823) {
                    xs xsVar = xs.f391803f;
                    synchronized (this.f390378z) {
                        l0.f fVar = new l0.f();
                        synchronized (this) {
                            if (!this.f390359g) {
                                this.f390359g = true;
                                int i13 = this.f390357e;
                                fVar.f406840b = i13;
                                kotlin.G0 g02 = kotlin.G0.f406611a;
                                this.f390378z.a(i13, xsVar, qc1.f389143a);
                            }
                        }
                    }
                }
                if (!this.f390359g) {
                    i12 = this.f390358f;
                    this.f390358f = i12 + 2;
                    b10Var = new b10(i12, this, z14, false, null);
                    if (z12 && this.f390375w < this.f390376x && b10Var.n() < b10Var.m()) {
                        z13 = false;
                    }
                    if (b10Var.q()) {
                        this.f390355c.put(Integer.valueOf(i12), b10Var);
                    }
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                } else {
                    throw new hl();
                }
            }
            this.f390378z.a(i12, arrayList, z14);
        }
        if (z13) {
            this.f390378z.flush();
        }
        return b10Var;
    }

    public final void c(int i12, @Y61.k xs xsVar) {
        this.f390361i.a(new j(this.f390356d + '[' + i12 + "] writeSynReset", this, i12, xsVar), 0L);
    }

    public final void l() {
        synchronized (this) {
            long j12 = this.f390368p;
            long j13 = this.f390367o;
            if (j12 < j13) {
                return;
            }
            this.f390367o = j13 + 1;
            this.f390370r = System.nanoTime() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            kotlin.G0 g02 = kotlin.G0.f406611a;
            this.f390361i.a(new h(AK.c.s(new StringBuilder(), this.f390356d, " ping"), this), 0L);
        }
    }

    public final void b(int i12, @Y61.k xs xsVar) {
        this.f390378z.a(i12, xsVar);
    }

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final o81 f390380b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f390381c;

        /* renamed from: d, reason: collision with root package name */
        public String f390382d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC44804n f390383e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC44803m f390384f;

        /* renamed from: i, reason: collision with root package name */
        private int f390387i;

        /* renamed from: a, reason: collision with root package name */
        private boolean f390379a = true;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        private c f390385g = c.f390388a;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        private iw0 f390386h = iw0.f386692a;

        public a(@Y61.k o81 o81Var) {
            this.f390380b = o81Var;
        }

        @X41.j
        @Y61.k
        public final a a(@Y61.k Socket socket, @Y61.k String str, @Y61.k InterfaceC44804n interfaceC44804n, @Y61.k InterfaceC44803m interfaceC44803m) {
            this.f390381c = socket;
            this.f390382d = this.f390379a ? androidx.compose.foundation.H.o(new StringBuilder(), qc1.f389149g, ' ', str) : up1.a("MockWebServer ", str);
            this.f390383e = interfaceC44804n;
            this.f390384f = interfaceC44803m;
            return this;
        }

        public final boolean b() {
            return this.f390379a;
        }

        @Y61.k
        public final String c() {
            String str = this.f390382d;
            if (str != null) {
                return str;
            }
            return null;
        }

        @Y61.k
        public final c d() {
            return this.f390385g;
        }

        public final int e() {
            return this.f390387i;
        }

        @Y61.k
        public final iw0 f() {
            return this.f390386h;
        }

        @Y61.k
        public final InterfaceC44803m g() {
            InterfaceC44803m interfaceC44803m = this.f390384f;
            if (interfaceC44803m != null) {
                return interfaceC44803m;
            }
            return null;
        }

        @Y61.k
        public final Socket h() {
            Socket socket = this.f390381c;
            if (socket != null) {
                return socket;
            }
            return null;
        }

        @Y61.k
        public final InterfaceC44804n i() {
            InterfaceC44804n interfaceC44804n = this.f390383e;
            if (interfaceC44804n != null) {
                return interfaceC44804n;
            }
            return null;
        }

        @Y61.k
        public final o81 j() {
            return this.f390380b;
        }

        @Y61.k
        public final a k() {
            this.f390387i = 0;
            return this;
        }

        @Y61.k
        public final a a(@Y61.k c cVar) {
            this.f390385g = cVar;
            return this;
        }

        @Y61.k
        public final u00 a() {
            return new u00(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f390378z.b());
        r6 = r2;
        r8.f390375w += r6;
        r4 = kotlin.G0.f406611a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, boolean r10, @Y61.l okio.C44802l r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.yandex.mobile.ads.impl.c10 r12 = r8.f390378z
            r12.a(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6c
            monitor-enter(r8)
        L12:
            long r4 = r8.f390375w     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            long r6 = r8.f390376x     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f390355c     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            goto L12
        L2a:
            r9 = move-exception
            goto L6a
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            com.yandex.mobile.ads.impl.c10 r4 = r8.f390378z     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.b()     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f390375w     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f390375w = r4     // Catch: java.lang.Throwable -> L2a
            kotlin.G0 r4 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            com.yandex.mobile.ads.impl.c10 r4 = r8.f390378z
            if (r10 == 0) goto L58
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L58
            r5 = 1
            goto L59
        L58:
            r5 = r3
        L59:
            r4.a(r5, r9, r11, r2)
            goto Ld
        L5d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L6a:
            monitor-exit(r8)
            throw r9
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u00.a(int, boolean, okio.l, long):void");
    }

    public final void a(int i12, long j12) {
        this.f390361i.a(new k(this.f390356d + '[' + i12 + "] windowUpdate", this, i12, j12), 0L);
    }

    public final void a(int i12, int i13, boolean z12) {
        try {
            this.f390378z.a(i12, i13, z12);
        } catch (IOException e12) {
            xs xsVar = xs.f391800c;
            a(xsVar, xsVar, e12);
        }
    }

    public static final void a(u00 u00Var, IOException iOException) throws IOException {
        xs xsVar = xs.f391800c;
        u00Var.a(xsVar, xsVar, iOException);
    }

    public final synchronized boolean a(long j12) {
        if (this.f390359g) {
            return false;
        }
        if (this.f390368p < this.f390367o) {
            if (j12 >= this.f390370r) {
                return false;
            }
        }
        return true;
    }

    public final void a(int i12, @Y61.k List<ez> list) {
        synchronized (this) {
            if (this.f390352B.contains(Integer.valueOf(i12))) {
                c(i12, xs.f391800c);
                return;
            }
            this.f390352B.add(Integer.valueOf(i12));
            this.f390362j.a(new f(this.f390356d + '[' + i12 + "] onRequest", this, i12, list), 0L);
        }
    }

    public final void a(int i12, @Y61.k List<ez> list, boolean z12) {
        this.f390362j.a(new e(this.f390356d + '[' + i12 + "] onHeaders", this, i12, list, z12), 0L);
    }

    public final void a(int i12, int i13, @Y61.k InterfaceC44804n interfaceC44804n, boolean z12) {
        C44802l c44802l = new C44802l();
        long j12 = i13;
        interfaceC44804n.x5(j12);
        interfaceC44804n.read(c44802l, j12);
        this.f390362j.a(new y00(this.f390356d + '[' + i12 + "] onData", this, i12, c44802l, i13, z12), 0L);
    }

    public final void a(int i12, @Y61.k xs xsVar) {
        this.f390362j.a(new g(this.f390356d + '[' + i12 + "] onReset", this, i12, xsVar), 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.yandex.mobile.ads.impl.xs r6, @Y61.k com.yandex.mobile.ads.impl.xs r7, @Y61.l java.io.IOException r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 1
            boolean r1 = com.yandex.mobile.ads.impl.qc1.f389148f
            if (r1 == 0) goto L2f
            boolean r1 = java.lang.Thread.holdsLock(r5)
            if (r1 != 0) goto Lc
            goto L2f
        Lc:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "Thread "
            java.lang.StringBuilder r7 = com.yandex.mobile.ads.impl.Cif.a(r7)
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r7.append(r8)
            java.lang.String r8 = " MUST NOT hold lock on "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L2f:
            com.yandex.mobile.ads.impl.c10 r1 = r5.f390378z     // Catch: java.io.IOException -> L58
            monitor-enter(r1)     // Catch: java.io.IOException -> L58
            kotlin.jvm.internal.l0$f r2 = new kotlin.jvm.internal.l0$f     // Catch: java.lang.Throwable -> L3f
            r2.<init>()     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L3f
            boolean r3 = r5.f390359g     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L41
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)     // Catch: java.io.IOException -> L58
            goto L58
        L3f:
            r6 = move-exception
            goto L56
        L41:
            r5.f390359g = r0     // Catch: java.lang.Throwable -> L53
            int r3 = r5.f390357e     // Catch: java.lang.Throwable -> L53
            r2.f406840b = r3     // Catch: java.lang.Throwable -> L53
            kotlin.G0 r2 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L53
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            com.yandex.mobile.ads.impl.c10 r2 = r5.f390378z     // Catch: java.lang.Throwable -> L3f
            byte[] r4 = com.yandex.mobile.ads.impl.qc1.f389143a     // Catch: java.lang.Throwable -> L3f
            r2.a(r3, r6, r4)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)     // Catch: java.io.IOException -> L58
            goto L58
        L53:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            throw r6     // Catch: java.lang.Throwable -> L3f
        L56:
            monitor-exit(r1)     // Catch: java.io.IOException -> L58
            throw r6     // Catch: java.io.IOException -> L58
        L58:
            monitor-enter(r5)
            java.util.LinkedHashMap r6 = r5.f390355c     // Catch: java.lang.Throwable -> L74
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L74
            r1 = 0
            if (r6 != 0) goto L76
            java.util.LinkedHashMap r6 = r5.f390355c     // Catch: java.lang.Throwable -> L74
            java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L74
            com.yandex.mobile.ads.impl.b10[] r2 = new com.yandex.mobile.ads.impl.b10[r1]     // Catch: java.lang.Throwable -> L74
            java.lang.Object[] r6 = r6.toArray(r2)     // Catch: java.lang.Throwable -> L74
            java.util.LinkedHashMap r2 = r5.f390355c     // Catch: java.lang.Throwable -> L74
            r2.clear()     // Catch: java.lang.Throwable -> L74
            goto L77
        L74:
            r6 = move-exception
            goto La2
        L76:
            r6 = 0
        L77:
            kotlin.G0 r2 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L74
            monitor-exit(r5)
            com.yandex.mobile.ads.impl.b10[] r6 = (com.yandex.mobile.ads.impl.b10[]) r6
            if (r6 == 0) goto L88
            int r2 = r6.length
        L7f:
            if (r1 >= r2) goto L88
            r3 = r6[r1]
            r3.a(r7, r8)     // Catch: java.io.IOException -> L86
        L86:
            int r1 = r1 + r0
            goto L7f
        L88:
            com.yandex.mobile.ads.impl.c10 r6 = r5.f390378z     // Catch: java.io.IOException -> L8d
            r6.close()     // Catch: java.io.IOException -> L8d
        L8d:
            java.net.Socket r6 = r5.f390377y     // Catch: java.io.IOException -> L92
            r6.close()     // Catch: java.io.IOException -> L92
        L92:
            com.yandex.mobile.ads.impl.n81 r6 = r5.f390361i
            r6.j()
            com.yandex.mobile.ads.impl.n81 r6 = r5.f390362j
            r6.j()
            com.yandex.mobile.ads.impl.n81 r6 = r5.f390363k
            r6.j()
            return
        La2:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u00.a(com.yandex.mobile.ads.impl.xs, com.yandex.mobile.ads.impl.xs, java.io.IOException):void");
    }
}
