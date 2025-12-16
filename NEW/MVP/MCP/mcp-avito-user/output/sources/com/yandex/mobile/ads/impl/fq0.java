package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.adjust.sdk.network.ErrorCodes;
import com.yandex.mobile.ads.impl.ry0;
import com.yandex.mobile.ads.impl.th;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* loaded from: classes8.dex */
public final class fq0 extends we {

    /* renamed from: e, reason: collision with root package name */
    private final th.a f385472e;

    /* renamed from: f, reason: collision with root package name */
    private final h10 f385473f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private final String f385474g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private final ah f385475h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private final h10 f385476i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private com.google.common.base.N<String> f385477j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private kn f385478k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private iz0 f385479l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private InputStream f385480m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f385481n;

    /* renamed from: o, reason: collision with root package name */
    private long f385482o;

    /* renamed from: p, reason: collision with root package name */
    private long f385483p;

    static {
        st.a("goog.exo.okhttp");
    }

    public fq0(bq0 bq0Var, @j.P String str, @j.P h10 h10Var) {
        super(true);
        bq0Var.getClass();
        this.f385472e = bq0Var;
        this.f385474g = str;
        this.f385475h = null;
        this.f385476i = h10Var;
        this.f385477j = null;
        this.f385473f = new h10();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) throws IOException {
        this.f385478k = knVar;
        long j12 = 0;
        this.f385483p = 0L;
        this.f385482o = 0L;
        b(knVar);
        long j13 = knVar.f387197f;
        long j14 = knVar.f387198g;
        s10 s10VarA = s10.a(knVar.f387192a.toString());
        if (s10VarA == null) {
            throw new e10("Malformed URL", ErrorCodes.PROTOCOL_EXCEPTION);
        }
        ry0.a aVarA = new ry0.a().a(s10VarA);
        ah ahVar = this.f385475h;
        if (ahVar != null) {
            aVarA.a(ahVar);
        }
        HashMap map = new HashMap();
        h10 h10Var = this.f385476i;
        if (h10Var != null) {
            map.putAll(h10Var.a());
        }
        map.putAll(this.f385473f.a());
        map.putAll(knVar.f387196e);
        for (Map.Entry entry : map.entrySet()) {
            aVarA.b((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = com.google.android.exoplayer2.upstream.y.a(j13, j14);
        if (strA != null) {
            aVarA.a("Range", strA);
        }
        String str = this.f385474g;
        if (str != null) {
            aVarA.a("User-Agent", str);
        }
        if (!knVar.a(1)) {
            aVarA.a("Accept-Encoding", "identity");
        }
        byte[] bArr = knVar.f387195d;
        aVarA.a(knVar.b(), bArr != null ? uy0.a(bArr) : knVar.f387194c == 2 ? uy0.a(com.google.android.exoplayer2.util.U.f348110e) : null);
        bx0 bx0VarA = this.f385472e.a(aVarA.a());
        try {
            com.google.common.util.concurrent.e1 e1Var = new com.google.common.util.concurrent.e1();
            bx0VarA.a(new eq0(e1Var));
            try {
                iz0 iz0Var = (iz0) e1Var.get();
                this.f385479l = iz0Var;
                mz0 mz0VarA = iz0Var.a();
                mz0VarA.getClass();
                this.f385480m = mz0VarA.a();
                int iE2 = iz0Var.e();
                if (!iz0Var.i()) {
                    if (iE2 == 416) {
                        if (knVar.f387197f == t10.a(iz0Var.h().a("Content-Range"))) {
                            this.f385481n = true;
                            c(knVar);
                            long j15 = knVar.f387198g;
                            if (j15 != -1) {
                                return j15;
                            }
                            return 0L;
                        }
                    }
                    try {
                        InputStream inputStream = this.f385480m;
                        inputStream.getClass();
                        com.google.android.exoplayer2.util.U.Q(inputStream);
                    } catch (IOException unused) {
                        int i12 = com.google.android.exoplayer2.util.U.f348106a;
                    }
                    TreeMap treeMapC = iz0Var.h().c();
                    iz0 iz0Var2 = this.f385479l;
                    if (iz0Var2 != null) {
                        mz0 mz0VarA2 = iz0Var2.a();
                        mz0VarA2.getClass();
                        mz0VarA2.close();
                        this.f385479l = null;
                    }
                    this.f385480m = null;
                    throw new g10(iE2, iE2 == 416 ? new hn(2008) : null, treeMapC);
                }
                pd0 pd0VarC = mz0VarA.c();
                String string = pd0VarC != null ? pd0VarC.toString() : "";
                com.google.common.base.N<String> n12 = this.f385477j;
                if (n12 != null && !n12.apply(string)) {
                    iz0 iz0Var3 = this.f385479l;
                    if (iz0Var3 != null) {
                        mz0 mz0VarA3 = iz0Var3.a();
                        mz0VarA3.getClass();
                        mz0VarA3.close();
                        this.f385479l = null;
                    }
                    this.f385480m = null;
                    throw new f10(string);
                }
                if (iE2 == 200) {
                    long j16 = knVar.f387197f;
                    if (j16 != 0) {
                        j12 = j16;
                    }
                }
                long j17 = knVar.f387198g;
                if (j17 != -1) {
                    this.f385482o = j17;
                } else {
                    long jB2 = mz0VarA.b();
                    this.f385482o = jB2 != -1 ? jB2 - j12 : -1L;
                }
                this.f385481n = true;
                c(knVar);
                try {
                    a(j12);
                    return this.f385482o;
                } catch (e10 e12) {
                    iz0 iz0Var4 = this.f385479l;
                    if (iz0Var4 != null) {
                        mz0 mz0VarA4 = iz0Var4.a();
                        mz0VarA4.getClass();
                        mz0VarA4.close();
                        this.f385479l = null;
                    }
                    this.f385480m = null;
                    throw e12;
                }
            } catch (InterruptedException unused2) {
                bx0VarA.a();
                throw new InterruptedIOException();
            } catch (ExecutionException e13) {
                throw new IOException(e13);
            }
        } catch (IOException e14) {
            throw e10.a(e14, 1);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final Map<String, List<String>> b() {
        iz0 iz0Var = this.f385479l;
        return iz0Var == null ? Collections.emptyMap() : iz0Var.h().c();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() throws IOException {
        if (this.f385481n) {
            this.f385481n = false;
            f();
            iz0 iz0Var = this.f385479l;
            if (iz0Var != null) {
                mz0 mz0VarA = iz0Var.a();
                mz0VarA.getClass();
                mz0VarA.close();
                this.f385479l = null;
            }
            this.f385480m = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        iz0 iz0Var = this.f385479l;
        if (iz0Var == null) {
            return null;
        }
        return Uri.parse(iz0Var.p().h().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0017, B:12:0x0020, B:15:0x002c), top: B:19:0x0004 }] */
    @Override // com.yandex.mobile.ads.impl.dn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L35
        L4:
            long r0 = r6.f385482o     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f385483p     // Catch: java.io.IOException -> L1e
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L2a
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L1e
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L1e
            int r9 = (int) r0     // Catch: java.io.IOException -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L36
        L20:
            java.io.InputStream r0 = r6.f385480m     // Catch: java.io.IOException -> L1e
            int r1 = com.google.android.exoplayer2.util.U.f348106a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2c
        L2a:
            r7 = r3
            goto L35
        L2c:
            long r8 = r6.f385483p     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f385483p = r8     // Catch: java.io.IOException -> L1e
            r6.c(r7)     // Catch: java.io.IOException -> L1e
        L35:
            return r7
        L36:
            int r8 = com.google.android.exoplayer2.util.U.f348106a
            r8 = 2
            com.yandex.mobile.ads.impl.e10 r7 = com.yandex.mobile.ads.impl.e10.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fq0.read(byte[], int, int):int");
    }

    private void a(long j12) throws IOException {
        if (j12 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j12 > 0) {
            try {
                int iMin = (int) Math.min(j12, 4096);
                InputStream inputStream = this.f385480m;
                int i12 = com.google.android.exoplayer2.util.U.f348106a;
                int i13 = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i13 != -1) {
                    j12 -= i13;
                    c(i13);
                } else {
                    throw new e10(2008);
                }
            } catch (IOException e12) {
                if (e12 instanceof e10) {
                    throw ((e10) e12);
                }
                throw new e10(2000);
            }
        }
    }
}
