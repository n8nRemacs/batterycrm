package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders;
import com.yandex.mobile.ads.impl.a20;
import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.kd0;
import com.yandex.mobile.ads.impl.kn;
import com.yandex.mobile.ads.impl.m11;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.s90;
import com.yandex.mobile.ads.impl.vw;
import com.yandex.mobile.ads.impl.x21;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v61.InterfaceC49173d;

/* loaded from: classes8.dex */
final class lv0 implements dd0, tu, s90.a<a>, s90.e, m11.c {

    /* renamed from: N, reason: collision with root package name */
    private static final Map<String, String> f387718N;

    /* renamed from: O, reason: collision with root package name */
    private static final vw f387719O;

    /* renamed from: B, reason: collision with root package name */
    private boolean f387721B;

    /* renamed from: D, reason: collision with root package name */
    private boolean f387723D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f387724E;

    /* renamed from: F, reason: collision with root package name */
    private int f387725F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f387726G;

    /* renamed from: H, reason: collision with root package name */
    private long f387727H;

    /* renamed from: J, reason: collision with root package name */
    private boolean f387729J;

    /* renamed from: K, reason: collision with root package name */
    private int f387730K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f387731L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f387732M;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f387733b;

    /* renamed from: c, reason: collision with root package name */
    private final gn f387734c;

    /* renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.drm.g f387735d;

    /* renamed from: e, reason: collision with root package name */
    private final p90 f387736e;

    /* renamed from: f, reason: collision with root package name */
    private final kd0.a f387737f;

    /* renamed from: g, reason: collision with root package name */
    private final f.a f387738g;

    /* renamed from: h, reason: collision with root package name */
    private final b f387739h;

    /* renamed from: i, reason: collision with root package name */
    private final h9 f387740i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private final String f387741j;

    /* renamed from: k, reason: collision with root package name */
    private final long f387742k;

    /* renamed from: m, reason: collision with root package name */
    private final kv0 f387744m;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    private dd0.a f387749r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    private IcyHeaders f387750s;

    /* renamed from: v, reason: collision with root package name */
    private boolean f387753v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f387754w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f387755x;

    /* renamed from: y, reason: collision with root package name */
    private e f387756y;

    /* renamed from: z, reason: collision with root package name */
    private x21 f387757z;

    /* renamed from: l, reason: collision with root package name */
    private final s90 f387743l = new s90("ProgressiveMediaPeriod");

    /* renamed from: n, reason: collision with root package name */
    private final bl f387745n = new bl();

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f387746o = new U0(this, 0);

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f387747p = new U0(this, 1);

    /* renamed from: q, reason: collision with root package name */
    private final Handler f387748q = pc1.a();

    /* renamed from: u, reason: collision with root package name */
    private d[] f387752u = new d[0];

    /* renamed from: t, reason: collision with root package name */
    private m11[] f387751t = new m11[0];

    /* renamed from: I, reason: collision with root package name */
    private long f387728I = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    private long f387720A = -9223372036854775807L;

    /* renamed from: C, reason: collision with root package name */
    private int f387722C = 1;

    public final class a implements s90.d, a20.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f387759b;

        /* renamed from: c, reason: collision with root package name */
        private final a71 f387760c;

        /* renamed from: d, reason: collision with root package name */
        private final kv0 f387761d;

        /* renamed from: e, reason: collision with root package name */
        private final tu f387762e;

        /* renamed from: f, reason: collision with root package name */
        private final bl f387763f;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f387765h;

        /* renamed from: j, reason: collision with root package name */
        private long f387767j;

        /* renamed from: l, reason: collision with root package name */
        @j.P
        private m11 f387769l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f387770m;

        /* renamed from: g, reason: collision with root package name */
        private final fu0 f387764g = new fu0();

        /* renamed from: i, reason: collision with root package name */
        private boolean f387766i = true;

        /* renamed from: a, reason: collision with root package name */
        private final long f387758a = q90.a();

        /* renamed from: k, reason: collision with root package name */
        private kn f387768k = a(0);

        public a(Uri uri, gn gnVar, kv0 kv0Var, tu tuVar, bl blVar) {
            this.f387759b = uri;
            this.f387760c = new a71(gnVar);
            this.f387761d = kv0Var;
            this.f387762e = tuVar;
            this.f387763f = blVar;
        }

        @Override // com.yandex.mobile.ads.impl.s90.d
        public final void a() {
            int iA2 = 0;
            while (iA2 == 0 && !this.f387765h) {
                try {
                    long j12 = this.f387764g.f385508a;
                    kn knVarA = a(j12);
                    this.f387768k = knVarA;
                    long jA2 = this.f387760c.a(knVarA);
                    if (jA2 != -1) {
                        jA2 += j12;
                        lv0.this.j();
                    }
                    long j13 = jA2;
                    lv0.this.f387750s = IcyHeaders.a(this.f387760c.b());
                    gn a20Var = this.f387760c;
                    if (lv0.this.f387750s != null && lv0.this.f387750s.f382975f != -1) {
                        a20Var = new a20(this.f387760c, lv0.this.f387750s.f382975f, this);
                        m11 m11VarF = lv0.this.f();
                        this.f387769l = m11VarF;
                        m11VarF.a(lv0.f387719O);
                    }
                    long jB2 = j12;
                    ((tg) this.f387761d).a(a20Var, this.f387759b, this.f387760c.b(), j12, j13, this.f387762e);
                    if (lv0.this.f387750s != null) {
                        ((tg) this.f387761d).a();
                    }
                    if (this.f387766i) {
                        ((tg) this.f387761d).a(jB2, this.f387767j);
                        this.f387766i = false;
                    }
                    while (true) {
                        long j14 = jB2;
                        while (iA2 == 0 && !this.f387765h) {
                            try {
                                this.f387763f.a();
                                iA2 = ((tg) this.f387761d).a(this.f387764g);
                                jB2 = ((tg) this.f387761d).b();
                                if (jB2 > lv0.this.f387742k + j14) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f387763f.c();
                        lv0.this.f387748q.post(lv0.this.f387747p);
                    }
                    if (iA2 == 1) {
                        iA2 = 0;
                    } else if (((tg) this.f387761d).b() != -1) {
                        this.f387764g.f385508a = ((tg) this.f387761d).b();
                    }
                    jn.a(this.f387760c);
                } catch (Throwable th2) {
                    if (iA2 != 1 && ((tg) this.f387761d).b() != -1) {
                        this.f387764g.f385508a = ((tg) this.f387761d).b();
                    }
                    jn.a(this.f387760c);
                    throw th2;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.s90.d
        public final void b() {
            this.f387765h = true;
        }

        public final void a(pr0 pr0Var) {
            long jMax;
            if (!this.f387770m) {
                jMax = this.f387767j;
            } else {
                jMax = Math.max(lv0.c(lv0.this), this.f387767j);
            }
            long j12 = jMax;
            int iA2 = pr0Var.a();
            m11 m11Var = this.f387769l;
            m11Var.getClass();
            m11Var.b(iA2, pr0Var);
            m11Var.a(j12, 1, iA2, 0, null);
            this.f387770m = true;
        }

        private kn a(long j12) {
            return new kn.a().a(this.f387759b).b(j12).a(lv0.this.f387741j).a(6).a(lv0.f387718N).a();
        }

        public static void a(a aVar, long j12, long j13) {
            aVar.f387764g.f385508a = j12;
            aVar.f387767j = j13;
            aVar.f387766i = true;
            aVar.f387770m = false;
        }
    }

    public interface b {
    }

    public final class c implements n11 {

        /* renamed from: a, reason: collision with root package name */
        private final int f387772a;

        public c(int i12) {
            this.f387772a = i12;
        }

        @Override // com.yandex.mobile.ads.impl.n11
        public final boolean d() {
            return lv0.this.a(this.f387772a);
        }

        @Override // com.yandex.mobile.ads.impl.n11
        public final void a() {
            lv0.this.c(this.f387772a);
        }

        @Override // com.yandex.mobile.ads.impl.n11
        public final int a(ww wwVar, vn vnVar, int i12) {
            return lv0.this.a(this.f387772a, wwVar, vnVar, i12);
        }

        @Override // com.yandex.mobile.ads.impl.n11
        public final int a(long j12) {
            return lv0.this.a(this.f387772a, j12);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f387774a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f387775b;

        public d(boolean z12, int i12) {
            this.f387774a = i12;
            this.f387775b = z12;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f387774a == dVar.f387774a && this.f387775b == dVar.f387775b;
        }

        public final int hashCode() {
            return (this.f387774a * 31) + (this.f387775b ? 1 : 0);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final w91 f387776a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f387777b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f387778c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f387779d;

        public e(w91 w91Var, boolean[] zArr) {
            this.f387776a = w91Var;
            this.f387777b = zArr;
            int i12 = w91Var.f391354a;
            this.f387778c = new boolean[i12];
            this.f387779d = new boolean[i12];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f387718N = Collections.unmodifiableMap(map);
        f387719O = new vw.a().c("icy").f("application/x-icy").a();
    }

    public lv0(Uri uri, gn gnVar, kv0 kv0Var, com.yandex.mobile.ads.exo.drm.g gVar, f.a aVar, p90 p90Var, kd0.a aVar2, b bVar, h9 h9Var, @j.P String str, int i12) {
        this.f387733b = uri;
        this.f387734c = gnVar;
        this.f387735d = gVar;
        this.f387738g = aVar;
        this.f387736e = p90Var;
        this.f387737f = aVar2;
        this.f387739h = bVar;
        this.f387740i = h9Var;
        this.f387741j = str;
        this.f387742k = i12;
        this.f387744m = kv0Var;
    }

    public static /* synthetic */ long c(lv0 lv0Var) {
        return lv0Var.a(true);
    }

    private void m() {
        a aVar = new a(this.f387733b, this.f387734c, this.f387744m, this, this.f387745n);
        if (this.f387754w) {
            db.b(this.f387728I != -9223372036854775807L);
            long j12 = this.f387720A;
            if (j12 != -9223372036854775807L && this.f387728I > j12) {
                this.f387731L = true;
                this.f387728I = -9223372036854775807L;
                return;
            }
            x21 x21Var = this.f387757z;
            x21Var.getClass();
            a.a(aVar, x21Var.b(this.f387728I).f391532a.f392160b, this.f387728I);
            for (m11 m11Var : this.f387751t) {
                m11Var.a(this.f387728I);
            }
            this.f387728I = -9223372036854775807L;
        }
        int iE2 = 0;
        for (m11 m11Var2 : this.f387751t) {
            iE2 += m11Var2.e();
        }
        this.f387730K = iE2;
        this.f387737f.b(new q90(aVar.f387758a, aVar.f387768k, this.f387743l.a(aVar, this, this.f387736e.a(this.f387722C))), (vw) null, aVar.f387767j, this.f387720A);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final boolean continueLoading(long j12) {
        if (this.f387731L || this.f387743l.c() || this.f387729J) {
            return false;
        }
        if (this.f387754w && this.f387725F == 0) {
            return false;
        }
        boolean zE2 = this.f387745n.e();
        if (this.f387743l.d()) {
            return zE2;
        }
        m();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void discardBuffer(long j12, boolean z12) {
        e();
        if (this.f387728I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.f387756y.f387778c;
        int length = this.f387751t.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f387751t[i12].a(j12, z12, zArr[i12]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long getBufferedPositionUs() {
        long jA2;
        e();
        if (this.f387731L || this.f387725F == 0) {
            return Long.MIN_VALUE;
        }
        long j12 = this.f387728I;
        if (j12 != -9223372036854775807L) {
            return j12;
        }
        if (this.f387755x) {
            int length = this.f387751t.length;
            jA2 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < length; i12++) {
                e eVar = this.f387756y;
                if (eVar.f387777b[i12] && eVar.f387778c[i12] && !this.f387751t[i12].f()) {
                    jA2 = Math.min(jA2, this.f387751t[i12].b());
                }
            }
        } else {
            jA2 = Long.MAX_VALUE;
        }
        if (jA2 == Long.MAX_VALUE) {
            jA2 = a(false);
        }
        return jA2 == Long.MIN_VALUE ? this.f387727H : jA2;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final w91 getTrackGroups() {
        e();
        return this.f387756y.f387776a;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final boolean isLoading() {
        return this.f387743l.d() && this.f387745n.d();
    }

    public final void l() {
        if (this.f387754w) {
            for (m11 m11Var : this.f387751t) {
                m11Var.h();
            }
        }
        this.f387743l.a(this);
        this.f387748q.removeCallbacksAndMessages(null);
        this.f387749r = null;
        this.f387732M = true;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void maybeThrowPrepareError() throws tr0 {
        this.f387743l.a(this.f387736e.a(this.f387722C));
        if (this.f387731L && !this.f387754w) {
            throw tr0.a("Loading finished before preparation is complete.", (Exception) null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long readDiscontinuity() {
        if (!this.f387724E) {
            return -9223372036854775807L;
        }
        if (!this.f387731L) {
            int iE2 = 0;
            for (m11 m11Var : this.f387751t) {
                iE2 += m11Var.e();
            }
            if (iE2 <= this.f387730K) {
                return -9223372036854775807L;
            }
        }
        this.f387724E = false;
        return this.f387727H;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long seekToUs(long j12) {
        e();
        boolean[] zArr = this.f387756y.f387777b;
        if (!this.f387757z.b()) {
            j12 = 0;
        }
        this.f387724E = false;
        this.f387727H = j12;
        if (this.f387728I != -9223372036854775807L) {
            this.f387728I = j12;
            return j12;
        }
        if (this.f387722C != 7) {
            int length = this.f387751t.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (this.f387751t[i12].b(j12, false) || (!zArr[i12] && this.f387755x)) {
                }
            }
            return j12;
        }
        this.f387729J = false;
        this.f387728I = j12;
        this.f387731L = false;
        if (this.f387743l.d()) {
            for (m11 m11Var : this.f387751t) {
                m11Var.a();
            }
            this.f387743l.a();
        } else {
            this.f387743l.b();
            for (m11 m11Var2 : this.f387751t) {
                m11Var2.b(false);
            }
        }
        return j12;
    }

    @InterfaceC49173d
    private void e() {
        db.b(this.f387754w);
        this.f387756y.getClass();
        this.f387757z.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f387732M) {
            return;
        }
        dd0.a aVar = this.f387749r;
        aVar.getClass();
        aVar.a((dd0.a) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f387726G = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f387732M || this.f387754w || !this.f387753v || this.f387757z == null) {
            return;
        }
        for (m11 m11Var : this.f387751t) {
            if (m11Var.d() == null) {
                return;
            }
        }
        this.f387745n.c();
        int length = this.f387751t.length;
        v91[] v91VarArr = new v91[length];
        boolean[] zArr = new boolean[length];
        for (int i12 = 0; i12 < length; i12++) {
            vw vwVarD = this.f387751t[i12].d();
            vwVarD.getClass();
            String str = vwVarD.f391181l;
            boolean zB2 = qg0.b(str);
            boolean z12 = zB2 || qg0.d(str);
            zArr[i12] = z12;
            this.f387755x = z12 | this.f387755x;
            IcyHeaders icyHeaders = this.f387750s;
            if (icyHeaders != null) {
                if (zB2 || this.f387752u[i12].f387775b) {
                    Metadata metadata = vwVarD.f391179j;
                    vwVarD = vwVarD.a().a(metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders)).a();
                }
                if (zB2 && vwVarD.f391175f == -1 && vwVarD.f391176g == -1 && icyHeaders.f382970a != -1) {
                    vwVarD = vwVarD.a().b(icyHeaders.f382970a).a();
                }
            }
            v91VarArr[i12] = new v91(Integer.toString(i12), vwVarD.a().d(this.f387735d.a(vwVarD)).a());
        }
        this.f387756y = new e(new w91(v91VarArr), zArr);
        this.f387754w = true;
        dd0.a aVar = this.f387749r;
        aVar.getClass();
        aVar.a((dd0) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f387748q.post(new U0(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.s90.e
    public final void b() {
        for (m11 m11Var : this.f387751t) {
            m11Var.i();
        }
        ((tg) this.f387744m).c();
    }

    public final m11 f() {
        return a(new d(true, 0));
    }

    public final void k() {
        this.f387748q.post(this.f387746o);
    }

    @Override // com.yandex.mobile.ads.impl.s90.a
    public final void a(s90.d dVar, long j12, long j13, boolean z12) {
        a aVar = (a) dVar;
        a71 a71Var = aVar.f387760c;
        long unused = aVar.f387758a;
        kn unused2 = aVar.f387768k;
        a71Var.getClass();
        q90 q90Var = new q90();
        p90 p90Var = this.f387736e;
        long unused3 = aVar.f387758a;
        p90Var.getClass();
        this.f387737f.a(q90Var, aVar.f387767j, this.f387720A);
        if (z12) {
            return;
        }
        for (m11 m11Var : this.f387751t) {
            m11Var.b(false);
        }
        if (this.f387725F > 0) {
            dd0.a aVar2 = this.f387749r;
            aVar2.getClass();
            aVar2.a((dd0.a) this);
        }
    }

    public final void c(int i12) {
        this.f387751t[i12].g();
        this.f387743l.a(this.f387736e.a(this.f387722C));
    }

    private void b(int i12) {
        e();
        boolean[] zArr = this.f387756y.f387777b;
        if (this.f387729J && zArr[i12] && !this.f387751t[i12].a(false)) {
            this.f387728I = 0L;
            this.f387729J = false;
            this.f387724E = true;
            this.f387727H = 0L;
            this.f387730K = 0;
            for (m11 m11Var : this.f387751t) {
                m11Var.b(false);
            }
            dd0.a aVar = this.f387749r;
            aVar.getClass();
            aVar.a((dd0.a) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(x21 x21Var) {
        this.f387757z = this.f387750s == null ? x21Var : new x21.b(-9223372036854775807L, 0L);
        this.f387720A = x21Var.c();
        boolean z12 = !this.f387726G && x21Var.c() == -9223372036854775807L;
        this.f387721B = z12;
        this.f387722C = z12 ? 7 : 1;
        ((nv0) this.f387739h).a(this.f387720A, x21Var.b(), this.f387721B);
        if (this.f387754w) {
            return;
        }
        i();
    }

    @Override // com.yandex.mobile.ads.impl.s90.a
    public final void a(s90.d dVar, long j12, long j13) {
        x21 x21Var;
        a aVar = (a) dVar;
        if (this.f387720A == -9223372036854775807L && (x21Var = this.f387757z) != null) {
            boolean zB2 = x21Var.b();
            long jA2 = a(true);
            long j14 = jA2 == Long.MIN_VALUE ? 0L : jA2 + 10000;
            this.f387720A = j14;
            ((nv0) this.f387739h).a(j14, zB2, this.f387721B);
        }
        a71 a71Var = aVar.f387760c;
        long unused = aVar.f387758a;
        kn unused2 = aVar.f387768k;
        a71Var.getClass();
        q90 q90Var = new q90();
        p90 p90Var = this.f387736e;
        long unused3 = aVar.f387758a;
        p90Var.getClass();
        this.f387737f.a(q90Var, (vw) null, aVar.f387767j, this.f387720A);
        this.f387731L = true;
        dd0.a aVar2 = this.f387749r;
        aVar2.getClass();
        aVar2.a((dd0.a) this);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void reevaluateBuffer(long j12) {
    }

    @Override // com.yandex.mobile.ads.impl.s90.a
    public final s90.b a(s90.d dVar, long j12, long j13, IOException iOException, int i12) {
        s90.b bVarA;
        x21 x21Var;
        a aVar = (a) dVar;
        a71 a71Var = aVar.f387760c;
        long unused = aVar.f387758a;
        kn unused2 = aVar.f387768k;
        a71Var.getClass();
        q90 q90Var = new q90();
        pc1.b(aVar.f387767j);
        pc1.b(this.f387720A);
        long jA2 = this.f387736e.a(new p90.a(iOException, i12));
        if (jA2 == -9223372036854775807L) {
            bVarA = s90.f389816e;
        } else {
            int iE2 = 0;
            for (m11 m11Var : this.f387751t) {
                iE2 += m11Var.e();
            }
            boolean z12 = iE2 > this.f387730K;
            if (!this.f387726G && ((x21Var = this.f387757z) == null || x21Var.c() == -9223372036854775807L)) {
                boolean z13 = this.f387754w;
                if (z13 && !this.f387724E && this.f387728I == -9223372036854775807L) {
                    this.f387729J = true;
                    bVarA = s90.f389815d;
                } else {
                    this.f387724E = z13;
                    this.f387727H = 0L;
                    this.f387730K = 0;
                    for (m11 m11Var2 : this.f387751t) {
                        m11Var2.b(false);
                    }
                    a.a(aVar, 0L, 0L);
                }
            } else {
                this.f387730K = iE2;
            }
            bVarA = s90.a(jA2, z12);
        }
        boolean zA2 = bVarA.a();
        this.f387737f.a(q90Var, 1, null, aVar.f387767j, this.f387720A, iOException, !zA2);
        if (!zA2) {
            p90 p90Var = this.f387736e;
            long unused3 = aVar.f387758a;
            p90Var.getClass();
        }
        return bVarA;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void a(dd0.a aVar, long j12) {
        this.f387749r = aVar;
        this.f387745n.e();
        m();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long a(cu[] cuVarArr, boolean[] zArr, n11[] n11VarArr, boolean[] zArr2, long j12) {
        cu cuVar;
        e();
        e eVar = this.f387756y;
        w91 w91Var = eVar.f387776a;
        boolean[] zArr3 = eVar.f387778c;
        int i12 = this.f387725F;
        int i13 = 0;
        for (int i14 = 0; i14 < cuVarArr.length; i14++) {
            n11 n11Var = n11VarArr[i14];
            if (n11Var != null && (cuVarArr[i14] == null || !zArr[i14])) {
                int i15 = ((c) n11Var).f387772a;
                db.b(zArr3[i15]);
                this.f387725F--;
                zArr3[i15] = false;
                n11VarArr[i14] = null;
            }
        }
        boolean z12 = !this.f387723D ? j12 == 0 : i12 != 0;
        for (int i16 = 0; i16 < cuVarArr.length; i16++) {
            if (n11VarArr[i16] == null && (cuVar = cuVarArr[i16]) != null) {
                db.b(cuVar.length() == 1);
                db.b(cuVar.b(0) == 0);
                int iA2 = w91Var.a(cuVar.a());
                db.b(!zArr3[iA2]);
                this.f387725F++;
                zArr3[iA2] = true;
                n11VarArr[i16] = new c(iA2);
                zArr2[i16] = true;
                if (!z12) {
                    m11 m11Var = this.f387751t[iA2];
                    z12 = (m11Var.b(j12, true) || m11Var.c() == 0) ? false : true;
                }
            }
        }
        if (this.f387725F == 0) {
            this.f387729J = false;
            this.f387724E = false;
            if (this.f387743l.d()) {
                m11[] m11VarArr = this.f387751t;
                int length = m11VarArr.length;
                while (i13 < length) {
                    m11VarArr[i13].a();
                    i13++;
                }
                this.f387743l.a();
            } else {
                for (m11 m11Var2 : this.f387751t) {
                    m11Var2.b(false);
                }
            }
        } else if (z12) {
            j12 = seekToUs(j12);
            while (i13 < n11VarArr.length) {
                if (n11VarArr[i13] != null) {
                    zArr2[i13] = true;
                }
                i13++;
            }
        }
        this.f387723D = true;
        return j12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (java.lang.Math.abs(r7 - r18) <= java.lang.Math.abs(r9 - r18)) goto L33;
     */
    @Override // com.yandex.mobile.ads.impl.dd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r18, com.yandex.mobile.ads.impl.y21 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r17.e()
            com.yandex.mobile.ads.impl.x21 r4 = r0.f387757z
            boolean r4 = r4.b()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.yandex.mobile.ads.impl.x21 r4 = r0.f387757z
            com.yandex.mobile.ads.impl.x21$a r4 = r4.b(r1)
            com.yandex.mobile.ads.impl.z21 r7 = r4.f391532a
            long r7 = r7.f392159a
            com.yandex.mobile.ads.impl.z21 r4 = r4.f391533b
            long r9 = r4.f392159a
            long r11 = r3.f391899a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 != 0) goto L30
            long r13 = r3.f391900b
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L30
            r13 = r1
            goto L81
        L30:
            int r4 = com.yandex.mobile.ads.impl.pc1.f388768a
            long r13 = r1 - r11
            long r11 = r11 ^ r1
            long r15 = r1 ^ r13
            long r11 = r11 & r15
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L3e
            r13 = -9223372036854775808
        L3e:
            long r3 = r3.f391900b
            long r11 = r1 + r3
            long r15 = r1 ^ r11
            long r3 = r3 ^ r11
            long r3 = r3 & r15
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L4f
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4f:
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 > 0) goto L5b
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 > 0) goto L5b
            r3 = r5
            goto L5c
        L5b:
            r3 = r4
        L5c:
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 > 0) goto L65
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L65
            r4 = r5
        L65:
            if (r3 == 0) goto L7a
            if (r4 == 0) goto L7a
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L80
            goto L7c
        L7a:
            if (r3 == 0) goto L7e
        L7c:
            r13 = r7
            goto L81
        L7e:
            if (r4 == 0) goto L81
        L80:
            r13 = r9
        L81:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lv0.a(long, com.yandex.mobile.ads.impl.y21):long");
    }

    public final boolean a(int i12) {
        return !this.f387724E && this.f387728I == -9223372036854775807L && this.f387751t[i12].a(this.f387731L);
    }

    public final int a(int i12, ww wwVar, vn vnVar, int i13) {
        if (this.f387724E || this.f387728I != -9223372036854775807L) {
            return -3;
        }
        e();
        e eVar = this.f387756y;
        boolean[] zArr = eVar.f387779d;
        if (!zArr[i12]) {
            vw vwVarA = eVar.f387776a.a(i12).a(0);
            this.f387737f.a(qg0.a(vwVarA.f391181l), vwVarA, this.f387727H);
            zArr[i12] = true;
        }
        int iA2 = this.f387751t[i12].a(wwVar, vnVar, i13, this.f387731L);
        if (iA2 == -3) {
            b(i12);
        }
        return iA2;
    }

    public final int a(int i12, long j12) {
        if (this.f387724E || this.f387728I != -9223372036854775807L) {
            return 0;
        }
        e();
        e eVar = this.f387756y;
        boolean[] zArr = eVar.f387779d;
        if (!zArr[i12]) {
            vw vwVarA = eVar.f387776a.a(i12).a(0);
            this.f387737f.a(qg0.a(vwVarA.f391181l), vwVarA, this.f387727H);
            zArr[i12] = true;
        }
        m11 m11Var = this.f387751t[i12];
        int iA2 = m11Var.a(j12, this.f387731L);
        m11Var.d(iA2);
        if (iA2 == 0) {
            b(i12);
        }
        return iA2;
    }

    @Override // com.yandex.mobile.ads.impl.tu
    public final x91 a(int i12, int i13) {
        return a(new d(false, i12));
    }

    @Override // com.yandex.mobile.ads.impl.tu
    public final void a() {
        this.f387753v = true;
        this.f387748q.post(this.f387746o);
    }

    @Override // com.yandex.mobile.ads.impl.tu
    public final void a(x21 x21Var) {
        this.f387748q.post(new H(3, this, x21Var));
    }

    private m11 a(d dVar) {
        int length = this.f387751t.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (dVar.equals(this.f387752u[i12])) {
                return this.f387751t[i12];
            }
        }
        h9 h9Var = this.f387740i;
        com.yandex.mobile.ads.exo.drm.g gVar = this.f387735d;
        f.a aVar = this.f387738g;
        gVar.getClass();
        aVar.getClass();
        m11 m11Var = new m11(h9Var, gVar, aVar);
        m11Var.a(this);
        int i13 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f387752u, i13);
        dVarArr[length] = dVar;
        int i14 = pc1.f388768a;
        this.f387752u = dVarArr;
        m11[] m11VarArr = (m11[]) Arrays.copyOf(this.f387751t, i13);
        m11VarArr[length] = m11Var;
        this.f387751t = m11VarArr;
        return m11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long a(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            com.yandex.mobile.ads.impl.m11[] r3 = r5.f387751t
            int r3 = r3.length
            if (r2 >= r3) goto L24
            if (r6 != 0) goto L15
            com.yandex.mobile.ads.impl.lv0$e r3 = r5.f387756y
            r3.getClass()
            boolean[] r3 = r3.f387778c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L21
        L15:
            com.yandex.mobile.ads.impl.m11[] r3 = r5.f387751t
            r3 = r3[r2]
            long r3 = r3.b()
            long r0 = java.lang.Math.max(r0, r3)
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lv0.a(boolean):long");
    }
}
