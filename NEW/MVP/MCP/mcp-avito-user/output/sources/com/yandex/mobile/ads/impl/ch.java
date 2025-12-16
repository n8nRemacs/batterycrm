package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.bh;
import com.yandex.mobile.ads.impl.gn;
import com.yandex.mobile.ads.impl.wv;
import com.yandex.mobile.ads.impl.yg;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ch implements gn {

    /* renamed from: a, reason: collision with root package name */
    private final yg f384273a;

    /* renamed from: b, reason: collision with root package name */
    private final gn f384274b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final q81 f384275c;

    /* renamed from: d, reason: collision with root package name */
    private final gn f384276d;

    /* renamed from: e, reason: collision with root package name */
    private final kh f384277e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f384278f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f384279g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f384280h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private Uri f384281i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private kn f384282j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private kn f384283k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private gn f384284l;

    /* renamed from: m, reason: collision with root package name */
    private long f384285m;

    /* renamed from: n, reason: collision with root package name */
    private long f384286n;

    /* renamed from: o, reason: collision with root package name */
    private long f384287o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private lh f384288p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f384289q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f384290r;

    /* renamed from: s, reason: collision with root package name */
    private long f384291s;

    /* renamed from: t, reason: collision with root package name */
    private long f384292t;

    public interface a {
        void a();

        void b();
    }

    public static final class b implements gn.a {

        /* renamed from: a, reason: collision with root package name */
        private yg f384293a;

        /* renamed from: b, reason: collision with root package name */
        private wv.b f384294b = new wv.b();

        /* renamed from: c, reason: collision with root package name */
        private kh f384295c = kh.f387131a;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private gn.a f384296d;

        public final b a(yg ygVar) {
            this.f384293a = ygVar;
            return this;
        }

        public final ch b() {
            gn.a aVar = this.f384296d;
            gn gnVarA = aVar != null ? aVar.a() : null;
            yg ygVar = this.f384293a;
            ygVar.getClass();
            bh bhVarA = gnVarA != null ? new bh.b().a(ygVar).a() : null;
            this.f384294b.getClass();
            return new ch(ygVar, gnVarA, new wv(), bhVarA, this.f384295c, 1, -1000, 0);
        }

        public final b a(@j.P gn.a aVar) {
            this.f384296d = aVar;
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.gn.a
        public final gn a() {
            gn.a aVar = this.f384296d;
            gn gnVarA = aVar != null ? aVar.a() : null;
            yg ygVar = this.f384293a;
            ygVar.getClass();
            bh bhVarA = gnVarA != null ? new bh.b().a(ygVar).a() : null;
            this.f384294b.getClass();
            return new ch(ygVar, gnVarA, new wv(), bhVarA, this.f384295c, 0, 0, 0);
        }
    }

    public /* synthetic */ ch(yg ygVar, gn gnVar, wv wvVar, bh bhVar, kh khVar, int i12, int i13, int i14) {
        this(ygVar, gnVar, wvVar, bhVar, khVar, i12, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f() {
        gn gnVar = this.f384284l;
        if (gnVar == null) {
            return;
        }
        try {
            gnVar.close();
        } finally {
            this.f384283k = null;
            this.f384284l = null;
            lh lhVar = this.f384288p;
            if (lhVar != null) {
                this.f384273a.b(lhVar);
                this.f384288p = null;
            }
        }
    }

    private boolean i() {
        return !(this.f384284l == this.f384274b);
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void a(ua1 ua1Var) {
        ua1Var.getClass();
        this.f384274b.a(ua1Var);
        this.f384276d.a(ua1Var);
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final Map<String, List<String>> b() {
        return i() ? this.f384276d.b() : Collections.emptyMap();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        this.f384282j = null;
        this.f384281i = null;
        this.f384286n = 0L;
        try {
            f();
        } catch (Throwable th2) {
            if (this.f384284l == this.f384274b || (th2 instanceof yg.a)) {
                this.f384289q = true;
            }
            throw th2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        return this.f384281i;
    }

    public final yg g() {
        return this.f384273a;
    }

    public final kh h() {
        return this.f384277e;
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) {
        int i14;
        if (i13 == 0) {
            return 0;
        }
        if (this.f384287o == 0) {
            return -1;
        }
        kn knVar = this.f384282j;
        knVar.getClass();
        kn knVar2 = this.f384283k;
        knVar2.getClass();
        try {
            if (this.f384286n >= this.f384292t) {
                a(knVar, true);
            }
            gn gnVar = this.f384284l;
            gnVar.getClass();
            int i15 = gnVar.read(bArr, i12, i13);
            if (i15 != -1) {
                if (this.f384284l == this.f384274b) {
                    this.f384291s += i15;
                }
                long j12 = i15;
                this.f384286n += j12;
                this.f384285m += j12;
                long j13 = this.f384287o;
                if (j13 != -1) {
                    this.f384287o = j13 - j12;
                }
                return i15;
            }
            if (i()) {
                long j14 = knVar2.f387198g;
                if (j14 != -1) {
                    i14 = i15;
                    if (this.f384285m < j14) {
                    }
                } else {
                    i14 = i15;
                }
                String str = knVar.f387199h;
                int i16 = pc1.f388768a;
                this.f384287o = 0L;
                if (this.f384284l != this.f384275c) {
                    return i14;
                }
                tl tlVar = new tl();
                tl.a(tlVar, this.f384286n);
                this.f384273a.a(str, tlVar);
                return i14;
            }
            i14 = i15;
            long j15 = this.f384287o;
            if (j15 <= 0 && j15 != -1) {
                return i14;
            }
            f();
            a(knVar, false);
            return read(bArr, i12, i13);
        } catch (Throwable th2) {
            if (this.f384284l == this.f384274b || (th2 instanceof yg.a)) {
                this.f384289q = true;
            }
            throw th2;
        }
    }

    private ch(yg ygVar, @j.P gn gnVar, wv wvVar, @j.P bh bhVar, @j.P kh khVar, int i12, int i13) {
        this.f384273a = ygVar;
        this.f384274b = wvVar;
        this.f384277e = khVar == null ? kh.f387131a : khVar;
        this.f384278f = (i12 & 1) != 0;
        this.f384279g = (i12 & 2) != 0;
        this.f384280h = (i12 & 4) != 0;
        if (gnVar != null) {
            this.f384276d = gnVar;
            this.f384275c = bhVar != null ? new q81(gnVar, bhVar) : null;
        } else {
            this.f384276d = rs0.f389608a;
            this.f384275c = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) {
        try {
            String strA = this.f384277e.a(knVar);
            kn knVarA = knVar.a().a(strA).a();
            this.f384282j = knVarA;
            yg ygVar = this.f384273a;
            Uri uri = knVarA.f387192a;
            String strC = ygVar.b(strA).c();
            Uri uri2 = strC == null ? null : Uri.parse(strC);
            if (uri2 != null) {
                uri = uri2;
            }
            this.f384281i = uri;
            this.f384286n = knVar.f387197f;
            boolean z12 = (this.f384279g && this.f384289q) || (this.f384280h && knVar.f387198g == -1);
            this.f384290r = z12;
            if (z12) {
                this.f384287o = -1L;
            } else {
                long jB2 = this.f384273a.b(strA).b();
                this.f384287o = jB2;
                if (jB2 != -1) {
                    long j12 = jB2 - knVar.f387197f;
                    this.f384287o = j12;
                    if (j12 < 0) {
                        throw new hn(2008);
                    }
                }
            }
            long jMin = knVar.f387198g;
            if (jMin != -1) {
                long j13 = this.f384287o;
                if (j13 != -1) {
                    jMin = Math.min(j13, jMin);
                }
                this.f384287o = jMin;
            }
            long j14 = this.f384287o;
            if (j14 > 0 || j14 == -1) {
                a(knVarA, false);
            }
            long j15 = knVar.f387198g;
            return j15 != -1 ? j15 : this.f384287o;
        } catch (Throwable th2) {
            if (this.f384284l == this.f384274b || (th2 instanceof yg.a)) {
                this.f384289q = true;
            }
            throw th2;
        }
    }

    private void a(kn knVar, boolean z12) throws InterruptedIOException {
        lh lhVarE;
        kn knVarA;
        gn gnVar;
        String str = knVar.f387199h;
        int i12 = pc1.f388768a;
        if (this.f384290r) {
            lhVarE = null;
        } else if (this.f384278f) {
            try {
                lhVarE = this.f384273a.e(str, this.f384286n, this.f384287o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            lhVarE = this.f384273a.c(str, this.f384286n, this.f384287o);
        }
        if (lhVarE == null) {
            gnVar = this.f384276d;
            knVarA = knVar.a().b(this.f384286n).a(this.f384287o).a();
        } else if (lhVarE.f387481d) {
            Uri uriFromFile = Uri.fromFile(lhVarE.f387482e);
            long j12 = lhVarE.f387479b;
            long j13 = this.f384286n - j12;
            long jMin = lhVarE.f387480c - j13;
            long j14 = this.f384287o;
            if (j14 != -1) {
                jMin = Math.min(jMin, j14);
            }
            knVarA = knVar.a().a(uriFromFile).c(j12).b(j13).a(jMin).a();
            gnVar = this.f384274b;
        } else {
            long jMin2 = lhVarE.f387480c;
            if (jMin2 == -1) {
                jMin2 = this.f384287o;
            } else {
                long j15 = this.f384287o;
                if (j15 != -1) {
                    jMin2 = Math.min(jMin2, j15);
                }
            }
            knVarA = knVar.a().b(this.f384286n).a(jMin2).a();
            gnVar = this.f384275c;
            if (gnVar == null) {
                gnVar = this.f384276d;
                this.f384273a.b(lhVarE);
                lhVarE = null;
            }
        }
        this.f384292t = (this.f384290r || gnVar != this.f384276d) ? Long.MAX_VALUE : this.f384286n + 102400;
        if (z12) {
            db.b(this.f384284l == this.f384276d);
            if (gnVar == this.f384276d) {
                return;
            }
            try {
                f();
            } finally {
            }
        }
        if (lhVarE != null && !lhVarE.f387481d) {
            this.f384288p = lhVarE;
        }
        this.f384284l = gnVar;
        this.f384283k = knVarA;
        this.f384285m = 0L;
        long jA2 = gnVar.a(knVarA);
        tl tlVar = new tl();
        if (knVarA.f387198g == -1 && jA2 != -1) {
            this.f384287o = jA2;
            tl.a(tlVar, this.f384286n + jA2);
        }
        if (i()) {
            Uri uriD = gnVar.d();
            this.f384281i = uriD;
            tl.a(tlVar, knVar.f387192a.equals(uriD) ? null : this.f384281i);
        }
        if (this.f384284l == this.f384275c) {
            this.f384273a.a(str, tlVar);
        }
    }
}
