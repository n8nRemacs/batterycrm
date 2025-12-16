package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.yandex.mobile.ads.exo.drm.e;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.impl.ac0;
import com.yandex.mobile.ads.impl.jc0;
import j.InterfaceC42153i;
import j.InterfaceC42164u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class gc0 extends ff {

    /* renamed from: F0, reason: collision with root package name */
    private static final hc0 f385635F0 = tv0.f();

    /* renamed from: G0, reason: collision with root package name */
    private static final byte[] f385636G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final long[] f385637A;

    /* renamed from: A0, reason: collision with root package name */
    @j.P
    private lt f385638A0;

    /* renamed from: B, reason: collision with root package name */
    @j.P
    private vw f385639B;

    /* renamed from: B0, reason: collision with root package name */
    protected tn f385640B0;

    /* renamed from: C, reason: collision with root package name */
    @j.P
    private vw f385641C;

    /* renamed from: C0, reason: collision with root package name */
    private long f385642C0;

    /* renamed from: D, reason: collision with root package name */
    @j.P
    private com.yandex.mobile.ads.exo.drm.e f385643D;

    /* renamed from: D0, reason: collision with root package name */
    private long f385644D0;

    /* renamed from: E, reason: collision with root package name */
    @j.P
    private com.yandex.mobile.ads.exo.drm.e f385645E;

    /* renamed from: E0, reason: collision with root package name */
    private int f385646E0;

    /* renamed from: F, reason: collision with root package name */
    @j.P
    private MediaCrypto f385647F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f385648G;

    /* renamed from: H, reason: collision with root package name */
    private long f385649H;

    /* renamed from: I, reason: collision with root package name */
    private float f385650I;

    /* renamed from: J, reason: collision with root package name */
    private float f385651J;

    /* renamed from: K, reason: collision with root package name */
    @j.P
    private ac0 f385652K;

    /* renamed from: L, reason: collision with root package name */
    @j.P
    private vw f385653L;

    /* renamed from: M, reason: collision with root package name */
    @j.P
    private MediaFormat f385654M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f385655N;

    /* renamed from: O, reason: collision with root package name */
    private float f385656O;

    /* renamed from: P, reason: collision with root package name */
    @j.P
    private ArrayDeque<ec0> f385657P;

    /* renamed from: Q, reason: collision with root package name */
    @j.P
    private b f385658Q;

    /* renamed from: R, reason: collision with root package name */
    @j.P
    private ec0 f385659R;

    /* renamed from: S, reason: collision with root package name */
    private int f385660S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f385661T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f385662U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f385663V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f385664W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f385665X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f385666Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f385667Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f385668a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f385669b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f385670c0;

    /* renamed from: d0, reason: collision with root package name */
    @j.P
    private wg f385671d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f385672e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f385673f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f385674g0;

    /* renamed from: h0, reason: collision with root package name */
    @j.P
    private ByteBuffer f385675h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f385676i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f385677j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f385678k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f385679l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f385680m0;

    /* renamed from: n, reason: collision with root package name */
    private final ac0.b f385681n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f385682n0;

    /* renamed from: o, reason: collision with root package name */
    private final ic0 f385683o;

    /* renamed from: o0, reason: collision with root package name */
    private int f385684o0;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f385685p;

    /* renamed from: p0, reason: collision with root package name */
    private int f385686p0;

    /* renamed from: q, reason: collision with root package name */
    private final float f385687q;

    /* renamed from: q0, reason: collision with root package name */
    private int f385688q0;

    /* renamed from: r, reason: collision with root package name */
    private final vn f385689r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f385690r0;

    /* renamed from: s, reason: collision with root package name */
    private final vn f385691s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f385692s0;

    /* renamed from: t, reason: collision with root package name */
    private final vn f385693t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f385694t0;

    /* renamed from: u, reason: collision with root package name */
    private final nf f385695u;

    /* renamed from: u0, reason: collision with root package name */
    private long f385696u0;

    /* renamed from: v, reason: collision with root package name */
    private final h91<vw> f385697v;

    /* renamed from: v0, reason: collision with root package name */
    private long f385698v0;

    /* renamed from: w, reason: collision with root package name */
    private final ArrayList<Long> f385699w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f385700w0;

    /* renamed from: x, reason: collision with root package name */
    private final MediaCodec.BufferInfo f385701x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f385702x0;

    /* renamed from: y, reason: collision with root package name */
    private final long[] f385703y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f385704y0;

    /* renamed from: z, reason: collision with root package name */
    private final long[] f385705z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f385706z0;

    @j.X
    public static final class a {
        @InterfaceC42164u
        public static void a(ac0.a aVar, jt0 jt0Var) {
            LogSessionId logSessionIdA = jt0Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f383459b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public gc0(int i12, cp cpVar, ic0 ic0Var, float f12) {
        super(i12);
        this.f385681n = cpVar;
        this.f385683o = (ic0) db.a(ic0Var);
        this.f385685p = false;
        this.f385687q = f12;
        this.f385689r = vn.j();
        this.f385691s = new vn(0);
        this.f385693t = new vn(2);
        nf nfVar = new nf();
        this.f385695u = nfVar;
        this.f385697v = new h91<>();
        this.f385699w = new ArrayList<>();
        this.f385701x = new MediaCodec.BufferInfo();
        this.f385650I = 1.0f;
        this.f385651J = 1.0f;
        this.f385649H = -9223372036854775807L;
        this.f385703y = new long[10];
        this.f385705z = new long[10];
        this.f385637A = new long[10];
        this.f385642C0 = -9223372036854775807L;
        this.f385644D0 = -9223372036854775807L;
        nfVar.e(0);
        nfVar.f390951c.order(ByteOrder.nativeOrder());
        this.f385656O = -1.0f;
        this.f385660S = 0;
        this.f385684o0 = 0;
        this.f385673f0 = -1;
        this.f385674g0 = -1;
        this.f385672e0 = -9223372036854775807L;
        this.f385696u0 = -9223372036854775807L;
        this.f385698v0 = -9223372036854775807L;
        this.f385686p0 = 0;
        this.f385688q0 = 0;
    }

    @TargetApi(23)
    private void K() throws Exception {
        int i12 = this.f385688q0;
        if (i12 == 1) {
            try {
                this.f385652K.flush();
                return;
            } finally {
            }
        }
        if (i12 == 2) {
            try {
                this.f385652K.flush();
                N();
                Q();
                return;
            } finally {
            }
        }
        if (i12 != 3) {
            this.f385702x0 = true;
            M();
        } else {
            L();
            I();
        }
    }

    @j.X
    private void Q() throws MediaCryptoException, lt {
        try {
            this.f385647F.setMediaDrmSession(a(this.f385645E).f384095b);
            b(this.f385645E);
            this.f385686p0 = 0;
            this.f385688q0 = 0;
        } catch (MediaCryptoException e12) {
            throw a(e12, this.f385639B, AuthCode.StatusCode.PERMISSION_EXPIRED);
        }
    }

    private boolean c(long j12, long j13) throws Exception {
        boolean z12;
        boolean z13;
        boolean zA2;
        ac0 ac0Var;
        ByteBuffer byteBuffer;
        int i12;
        MediaCodec.BufferInfo bufferInfo;
        int iA2;
        boolean z14;
        if (this.f385674g0 < 0) {
            if (this.f385665X && this.f385692s0) {
                try {
                    iA2 = this.f385652K.a(this.f385701x);
                } catch (IllegalStateException unused) {
                    K();
                    if (this.f385702x0) {
                        L();
                    }
                    return false;
                }
            } else {
                iA2 = this.f385652K.a(this.f385701x);
            }
            if (iA2 < 0) {
                if (iA2 != -2) {
                    if (this.f385670c0 && (this.f385700w0 || this.f385686p0 == 2)) {
                        K();
                    }
                    return false;
                }
                this.f385694t0 = true;
                MediaFormat mediaFormatB = this.f385652K.b();
                if (this.f385660S != 0 && mediaFormatB.getInteger("width") == 32 && mediaFormatB.getInteger("height") == 32) {
                    this.f385669b0 = true;
                } else {
                    if (this.f385667Z) {
                        mediaFormatB.setInteger("channel-count", 1);
                    }
                    this.f385654M = mediaFormatB;
                    this.f385655N = true;
                }
                return true;
            }
            if (this.f385669b0) {
                this.f385669b0 = false;
                this.f385652K.a(false, iA2);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f385701x;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                K();
                return false;
            }
            this.f385674g0 = iA2;
            ByteBuffer byteBufferC = this.f385652K.c(iA2);
            this.f385675h0 = byteBufferC;
            if (byteBufferC != null) {
                byteBufferC.position(this.f385701x.offset);
                ByteBuffer byteBuffer2 = this.f385675h0;
                MediaCodec.BufferInfo bufferInfo3 = this.f385701x;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.f385666Y) {
                MediaCodec.BufferInfo bufferInfo4 = this.f385701x;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j14 = this.f385696u0;
                    if (j14 != -9223372036854775807L) {
                        bufferInfo4.presentationTimeUs = j14;
                    }
                }
            }
            long j15 = this.f385701x.presentationTimeUs;
            int size = this.f385699w.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z14 = false;
                    break;
                }
                if (this.f385699w.get(i13).longValue() == j15) {
                    this.f385699w.remove(i13);
                    z14 = true;
                    break;
                }
                i13++;
            }
            this.f385676i0 = z14;
            long j16 = this.f385698v0;
            long j17 = this.f385701x.presentationTimeUs;
            this.f385677j0 = j16 == j17;
            d(j17);
        }
        if (this.f385665X && this.f385692s0) {
            try {
                ac0Var = this.f385652K;
                byteBuffer = this.f385675h0;
                i12 = this.f385674g0;
                bufferInfo = this.f385701x;
                z12 = false;
                z13 = true;
            } catch (IllegalStateException unused2) {
                z12 = false;
            }
            try {
                zA2 = a(j12, j13, ac0Var, byteBuffer, i12, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f385676i0, this.f385677j0, this.f385641C);
            } catch (IllegalStateException unused3) {
                K();
                if (this.f385702x0) {
                    L();
                }
                return z12;
            }
        } else {
            z12 = false;
            z13 = true;
            ac0 ac0Var2 = this.f385652K;
            ByteBuffer byteBuffer3 = this.f385675h0;
            int i14 = this.f385674g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f385701x;
            zA2 = a(j12, j13, ac0Var2, byteBuffer3, i14, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f385676i0, this.f385677j0, this.f385641C);
        }
        if (zA2) {
            c(this.f385701x.presentationTimeUs);
            boolean z15 = (this.f385701x.flags & 4) != 0 ? z13 : z12;
            this.f385674g0 = -1;
            this.f385675h0 = null;
            if (!z15) {
                return z13;
            }
            K();
        }
        return z12;
    }

    @TargetApi(23)
    private boolean y() throws MediaCryptoException, lt {
        if (this.f385690r0) {
            this.f385686p0 = 1;
            if (this.f385662U || this.f385664W) {
                this.f385688q0 = 3;
                return false;
            }
            this.f385688q0 = 2;
        } else {
            Q();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean z() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gc0.z():boolean");
    }

    public final void A() throws Exception {
        if (B()) {
            I();
        }
    }

    public final boolean B() throws MediaCryptoException {
        if (this.f385652K == null) {
            return false;
        }
        int i12 = this.f385688q0;
        if (i12 == 3 || this.f385662U || ((this.f385663V && !this.f385694t0) || (this.f385664W && this.f385692s0))) {
            L();
            return true;
        }
        if (i12 == 2) {
            int i13 = pc1.f388768a;
            db.b(i13 >= 23);
            if (i13 >= 23) {
                try {
                    Q();
                } catch (lt e12) {
                    ka0.b("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e12);
                    L();
                    return true;
                }
            }
        }
        try {
            this.f385652K.flush();
            return false;
        } finally {
            N();
        }
    }

    @j.P
    public final ac0 C() {
        return this.f385652K;
    }

    @j.P
    public final ec0 D() {
        return this.f385659R;
    }

    public boolean E() {
        return false;
    }

    @j.P
    public final MediaFormat F() {
        return this.f385654M;
    }

    public final long G() {
        return this.f385644D0;
    }

    public final float H() {
        return this.f385650I;
    }

    public final void I() throws Exception {
        vw vwVar;
        if (this.f385652K != null || this.f385678k0 || (vwVar = this.f385639B) == null) {
            return;
        }
        boolean z12 = false;
        if (this.f385645E == null && b(vwVar)) {
            vw vwVar2 = this.f385639B;
            this.f385680m0 = false;
            this.f385695u.b();
            this.f385693t.b();
            this.f385679l0 = false;
            this.f385678k0 = false;
            String str = vwVar2.f391181l;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f385695u.f(32);
            } else {
                this.f385695u.f(1);
            }
            this.f385678k0 = true;
            return;
        }
        b(this.f385645E);
        String str2 = this.f385639B.f391181l;
        com.yandex.mobile.ads.exo.drm.e eVar = this.f385643D;
        if (eVar != null) {
            if (this.f385647F == null) {
                bx bxVarA = a(eVar);
                if (bxVarA != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(bxVarA.f384094a, bxVarA.f384095b);
                        this.f385647F = mediaCrypto;
                        if (!bxVarA.f384096c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                            z12 = true;
                        }
                        this.f385648G = z12;
                    } catch (MediaCryptoException e12) {
                        throw a(e12, this.f385639B, AuthCode.StatusCode.PERMISSION_EXPIRED);
                    }
                } else if (this.f385643D.g() == null) {
                    return;
                }
            }
            if (bx.f384093d) {
                int iC2 = this.f385643D.c();
                if (iC2 == 1) {
                    e.a aVarG = this.f385643D.g();
                    aVarG.getClass();
                    throw a(aVarG, this.f385639B, aVarG.f382910a);
                }
                if (iC2 != 4) {
                    return;
                }
            }
        }
        try {
            a(this.f385647F, this.f385648G);
        } catch (b e13) {
            throw a(e13, this.f385639B, 4001);
        }
    }

    public abstract void J();

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        try {
            ac0 ac0Var = this.f385652K;
            if (ac0Var != null) {
                ac0Var.release();
                this.f385640B0.f390230b++;
                a(this.f385659R.f384886a);
            }
            this.f385652K = null;
            try {
                MediaCrypto mediaCrypto = this.f385647F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f385652K = null;
            try {
                MediaCrypto mediaCrypto2 = this.f385647F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    @InterfaceC42153i
    public void N() {
        this.f385673f0 = -1;
        this.f385691s.f390951c = null;
        this.f385674g0 = -1;
        this.f385675h0 = null;
        this.f385672e0 = -9223372036854775807L;
        this.f385692s0 = false;
        this.f385690r0 = false;
        this.f385668a0 = false;
        this.f385669b0 = false;
        this.f385676i0 = false;
        this.f385677j0 = false;
        this.f385699w.clear();
        this.f385696u0 = -9223372036854775807L;
        this.f385698v0 = -9223372036854775807L;
        wg wgVar = this.f385671d0;
        if (wgVar != null) {
            wgVar.a();
        }
        this.f385686p0 = 0;
        this.f385688q0 = 0;
        this.f385684o0 = this.f385682n0 ? 1 : 0;
    }

    @InterfaceC42153i
    public final void O() {
        N();
        this.f385638A0 = null;
        this.f385671d0 = null;
        this.f385657P = null;
        this.f385659R = null;
        this.f385653L = null;
        this.f385654M = null;
        this.f385655N = false;
        this.f385694t0 = false;
        this.f385656O = -1.0f;
        this.f385660S = 0;
        this.f385661T = false;
        this.f385662U = false;
        this.f385663V = false;
        this.f385664W = false;
        this.f385665X = false;
        this.f385666Y = false;
        this.f385667Z = false;
        this.f385670c0 = false;
        this.f385682n0 = false;
        this.f385684o0 = 0;
        this.f385648G = false;
    }

    public final void P() {
        this.f385706z0 = true;
    }

    public abstract float a(float f12, vw[] vwVarArr);

    public abstract int a(ic0 ic0Var, vw vwVar);

    public abstract ac0.a a(ec0 ec0Var, vw vwVar, @j.P MediaCrypto mediaCrypto, float f12);

    public abstract xn a(ec0 ec0Var, vw vwVar, vw vwVar2);

    public abstract ArrayList a(ic0 ic0Var, vw vwVar, boolean z12);

    public void a(vn vnVar) {
    }

    public abstract void a(vw vwVar, @j.P MediaFormat mediaFormat);

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(String str, long j12, long j13);

    public abstract boolean a(long j12, long j13, @j.P ac0 ac0Var, @j.P ByteBuffer byteBuffer, int i12, int i13, int i14, long j14, boolean z12, boolean z13, vw vwVar);

    public abstract void b(vn vnVar);

    public boolean b(vw vwVar) {
        return false;
    }

    public final void d(long j12) {
        vw vwVarB = this.f385697v.b(j12);
        if (vwVarB == null && this.f385655N) {
            vwVarB = this.f385697v.c();
        }
        if (vwVarB != null) {
            this.f385641C = vwVarB;
        } else if (!this.f385655N || this.f385641C == null) {
            return;
        }
        a(this.f385641C, this.f385654M);
        this.f385655N = false;
    }

    @Override // com.yandex.mobile.ads.impl.ff, com.yandex.mobile.ads.impl.vx0
    public final int f() {
        return 8;
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public void u() throws MediaCryptoException {
        this.f385639B = null;
        this.f385642C0 = -9223372036854775807L;
        this.f385644D0 = -9223372036854775807L;
        this.f385646E0 = 0;
        B();
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public void v() {
        try {
            this.f385680m0 = false;
            this.f385695u.b();
            this.f385693t.b();
            this.f385679l0 = false;
            this.f385678k0 = false;
            L();
            com.yandex.mobile.ads.exo.drm.e eVar = this.f385645E;
            if (eVar != null) {
                eVar.a((f.a) null);
            }
            this.f385645E = null;
        } catch (Throwable th2) {
            com.yandex.mobile.ads.exo.drm.e eVar2 = this.f385645E;
            if (eVar2 != null) {
                eVar2.a((f.a) null);
            }
            this.f385645E = null;
            throw th2;
        }
    }

    private void b(@j.P com.yandex.mobile.ads.exo.drm.e eVar) {
        com.yandex.mobile.ads.exo.drm.e eVar2 = this.f385643D;
        if (eVar2 != eVar) {
            if (eVar != null) {
                eVar.b(null);
            }
            if (eVar2 != null) {
                eVar2.a((f.a) null);
            }
        }
        this.f385643D = eVar;
    }

    public boolean a(ec0 ec0Var) {
        return true;
    }

    public static class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f385707a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f385708b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final ec0 f385709c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final String f385710d;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(vw vwVar, @j.P Exception exc, boolean z12, ec0 ec0Var) {
            StringBuilder sbA = Cif.a("Decoder init failed: ");
            sbA.append(ec0Var.f384886a);
            sbA.append(", ");
            sbA.append(vwVar);
            this(sbA.toString(), exc, vwVar.f391181l, z12, ec0Var, pc1.f388768a >= 21 ? a(exc) : null);
        }

        public static b a(b bVar) {
            return new b(bVar.getMessage(), bVar.getCause(), bVar.f385707a, bVar.f385708b, bVar.f385709c, bVar.f385710d);
        }

        @j.P
        @j.X
        private static String a(@j.P Exception exc) {
            if (exc instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
            }
            return null;
        }

        public b(int i12, vw vwVar, @j.P jc0.b bVar, boolean z12) {
            this("Decoder init failed: [" + i12 + "], " + vwVar, bVar, vwVar.f391181l, z12, null, a(i12));
        }

        private static String a(int i12) {
            return "com.yandex.mobile.ads.exoplayer2.mediacodec.MediaCodecRenderer_" + (i12 < 0 ? "neg_" : "") + Math.abs(i12);
        }

        private b(String str, @j.P Throwable th2, String str2, boolean z12, @j.P ec0 ec0Var, @j.P String str3) {
            super(str, th2);
            this.f385707a = str2;
            this.f385708b = z12;
            this.f385709c = ec0Var;
            this.f385710d = str3;
        }
    }

    @Override // com.yandex.mobile.ads.impl.vx0
    public final int a(vw vwVar) throws lt {
        try {
            return a(this.f385683o, vwVar);
        } catch (jc0.b e12) {
            throw a(e12, vwVar, 4002);
        }
    }

    public final void a(lt ltVar) {
        this.f385638A0 = ltVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    private boolean b(long j12, long j13) throws Exception {
        boolean z12;
        db.b(!this.f385702x0);
        if (this.f385695u.m()) {
            nf nfVar = this.f385695u;
            ByteBuffer byteBuffer = nfVar.f390951c;
            int i12 = this.f385674g0;
            int iL2 = nfVar.l();
            nf nfVar2 = this.f385695u;
            if (!a(j12, j13, null, byteBuffer, i12, 0, iL2, nfVar2.f390953e, nfVar2.e(), this.f385695u.f(), this.f385641C)) {
                return false;
            }
            c(this.f385695u.k());
            this.f385695u.b();
            z12 = 0;
        } else {
            z12 = 0;
        }
        if (this.f385700w0) {
            this.f385702x0 = true;
            return z12;
        }
        if (this.f385679l0) {
            db.b(this.f385695u.a(this.f385693t));
            this.f385679l0 = z12;
        }
        if (this.f385680m0) {
            if (this.f385695u.m()) {
                return true;
            }
            this.f385680m0 = z12;
            this.f385695u.b();
            this.f385693t.b();
            this.f385679l0 = z12;
            this.f385678k0 = z12;
            this.f385680m0 = z12;
            I();
            if (!this.f385678k0) {
                return z12;
            }
        }
        db.b(!this.f385700w0);
        ww wwVarQ = q();
        this.f385693t.b();
        while (true) {
            this.f385693t.b();
            int iA2 = a(wwVarQ, this.f385693t, (int) z12);
            if (iA2 == -5) {
                a(wwVarQ);
                break;
            }
            if (iA2 != -4) {
                if (iA2 != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (this.f385693t.f()) {
                    this.f385700w0 = true;
                    break;
                }
                if (this.f385704y0) {
                    vw vwVar = this.f385639B;
                    vwVar.getClass();
                    this.f385641C = vwVar;
                    a(vwVar, (MediaFormat) null);
                    this.f385704y0 = z12;
                }
                this.f385693t.h();
                if (!this.f385695u.a(this.f385693t)) {
                    this.f385679l0 = true;
                    break;
                }
            }
        }
        if (this.f385695u.m()) {
            this.f385695u.h();
        }
        if (this.f385695u.m() || this.f385700w0 || this.f385680m0) {
            return true;
        }
        return z12;
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public void a(boolean z12, boolean z13) {
        this.f385640B0 = new tn();
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void a(vw[] vwVarArr, long j12, long j13) {
        if (this.f385644D0 == -9223372036854775807L) {
            db.b(this.f385642C0 == -9223372036854775807L);
            this.f385642C0 = j12;
            this.f385644D0 = j13;
            return;
        }
        int i12 = this.f385646E0;
        if (i12 == this.f385705z.length) {
            StringBuilder sbA = Cif.a("Too many stream changes, so dropping offset: ");
            sbA.append(this.f385705z[this.f385646E0 - 1]);
            ka0.d("MediaCodecRenderer", sbA.toString());
        } else {
            this.f385646E0 = i12 + 1;
        }
        long[] jArr = this.f385703y;
        int i13 = this.f385646E0 - 1;
        jArr[i13] = j12;
        this.f385705z[i13] = j13;
        this.f385637A[i13] = this.f385696u0;
    }

    private boolean d(int i12) throws Exception {
        ww wwVarQ = q();
        this.f385689r.b();
        int iA2 = a(wwVarQ, this.f385689r, i12 | 4);
        if (iA2 == -5) {
            a(wwVarQ);
            return true;
        }
        if (iA2 != -4 || !this.f385689r.f()) {
            return false;
        }
        this.f385700w0 = true;
        K();
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public boolean d() {
        return this.f385639B != null && (t() || this.f385674g0 >= 0 || (this.f385672e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f385672e0));
    }

    public void M() {
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public void a(long j12, boolean z12) {
        this.f385700w0 = false;
        this.f385702x0 = false;
        this.f385706z0 = false;
        if (this.f385678k0) {
            this.f385695u.b();
            this.f385693t.b();
            this.f385679l0 = false;
        } else {
            A();
        }
        if (this.f385697v.d() > 0) {
            this.f385704y0 = true;
        }
        this.f385697v.a();
        int i12 = this.f385646E0;
        if (i12 != 0) {
            int i13 = i12 - 1;
            this.f385644D0 = this.f385705z[i13];
            this.f385642C0 = this.f385703y[i13];
            this.f385646E0 = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public void a(float f12, float f13) throws Exception {
        this.f385650I = f12;
        this.f385651J = f13;
        c(this.f385653L);
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void a(long j12, long j13) throws Exception {
        boolean z12 = false;
        if (this.f385706z0) {
            this.f385706z0 = false;
            K();
        }
        lt ltVar = this.f385638A0;
        if (ltVar == null) {
            try {
                if (this.f385702x0) {
                    M();
                    return;
                }
                if (this.f385639B != null || d(2)) {
                    I();
                    if (this.f385678k0) {
                        r91.a("bypassRender");
                        while (b(j12, j13)) {
                        }
                        r91.a();
                    } else if (this.f385652K != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        r91.a("drainAndFeed");
                        while (c(j12, j13) && (this.f385649H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.f385649H)) {
                        }
                        while (z() && (this.f385649H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.f385649H)) {
                        }
                        r91.a();
                    } else {
                        this.f385640B0.f390232d += b(j12);
                        d(1);
                    }
                    synchronized (this.f385640B0) {
                    }
                    return;
                }
                return;
            } catch (IllegalStateException e12) {
                int i12 = pc1.f388768a;
                if (i12 < 21 || !(e12 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e12.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e12;
                    }
                }
                a(e12);
                if (i12 >= 21) {
                    if (e12 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e12).isRecoverable() : false) {
                        z12 = true;
                    }
                }
                if (z12) {
                    L();
                }
                throw a(4003, this.f385639B, a(e12, this.f385659R), z12);
            }
        }
        this.f385638A0 = null;
        throw ltVar;
    }

    @InterfaceC42153i
    public void c(long j12) {
        while (true) {
            int i12 = this.f385646E0;
            if (i12 == 0 || j12 < this.f385637A[0]) {
                return;
            }
            long[] jArr = this.f385703y;
            this.f385642C0 = jArr[0];
            this.f385644D0 = this.f385705z[0];
            int i13 = i12 - 1;
            this.f385646E0 = i13;
            System.arraycopy(jArr, 1, jArr, 0, i13);
            long[] jArr2 = this.f385705z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f385646E0);
            long[] jArr3 = this.f385637A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f385646E0);
            J();
        }
    }

    private boolean c(vw vwVar) throws Exception {
        if (pc1.f388768a >= 23 && this.f385652K != null && this.f385688q0 != 3 && c() != 0) {
            float fA2 = a(this.f385651J, s());
            float f12 = this.f385656O;
            if (f12 == fA2) {
                return true;
            }
            if (fA2 == -1.0f) {
                if (this.f385690r0) {
                    this.f385686p0 = 1;
                    this.f385688q0 = 3;
                    return false;
                }
                L();
                I();
                return false;
            }
            if (f12 == -1.0f && fA2 <= this.f385687q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA2);
            this.f385652K.a(bundle);
            this.f385656O = fA2;
        }
        return true;
    }

    public dc0 a(IllegalStateException illegalStateException, @j.P ec0 ec0Var) {
        return new dc0(illegalStateException, ec0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.media.MediaCrypto r8, boolean r9) throws java.lang.Exception {
        /*
            r7 = this;
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ec0> r0 = r7.f385657P
            r1 = 0
            if (r0 != 0) goto L3a
            java.util.List r0 = r7.a(r9)     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            r2.<init>()     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            r7.f385657P = r2     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            boolean r3 = r7.f385685p     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            if (r3 == 0) goto L1a
            r2.addAll(r0)     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            goto L2c
        L18:
            r8 = move-exception
            goto L2f
        L1a:
            boolean r2 = r0.isEmpty()     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            if (r2 != 0) goto L2c
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ec0> r2 = r7.f385657P     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            com.yandex.mobile.ads.impl.ec0 r0 = (com.yandex.mobile.ads.impl.ec0) r0     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            r2.add(r0)     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
        L2c:
            r7.f385658Q = r1     // Catch: com.yandex.mobile.ads.impl.jc0.b -> L18
            goto L3a
        L2f:
            com.yandex.mobile.ads.impl.gc0$b r0 = new com.yandex.mobile.ads.impl.gc0$b
            com.yandex.mobile.ads.impl.vw r1 = r7.f385639B
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r2, r1, r8, r9)
            throw r0
        L3a:
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ec0> r0 = r7.f385657P
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb3
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ec0> r0 = r7.f385657P
            java.lang.Object r0 = r0.peekFirst()
            com.yandex.mobile.ads.impl.ec0 r0 = (com.yandex.mobile.ads.impl.ec0) r0
        L4a:
            com.yandex.mobile.ads.impl.ac0 r2 = r7.f385652K
            if (r2 != 0) goto Lb0
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ec0> r2 = r7.f385657P
            java.lang.Object r2 = r2.peekFirst()
            com.yandex.mobile.ads.impl.ec0 r2 = (com.yandex.mobile.ads.impl.ec0) r2
            boolean r3 = r7.a(r2)
            if (r3 != 0) goto L5d
            return
        L5d:
            r7.a(r2, r8)     // Catch: java.lang.Exception -> L61
            goto L4a
        L61:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L76
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            com.yandex.mobile.ads.impl.ka0.d(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.a(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L4a
        L74:
            r3 = move-exception
            goto L77
        L76:
            throw r3     // Catch: java.lang.Exception -> L74
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.yandex.mobile.ads.impl.ka0.b(r4, r5, r3)
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ec0> r4 = r7.f385657P
            r4.removeFirst()
            com.yandex.mobile.ads.impl.gc0$b r4 = new com.yandex.mobile.ads.impl.gc0$b
            com.yandex.mobile.ads.impl.vw r5 = r7.f385639B
            r4.<init>(r5, r3, r9, r2)
            r7.a(r4)
            com.yandex.mobile.ads.impl.gc0$b r2 = r7.f385658Q
            if (r2 != 0) goto L9e
            r7.f385658Q = r4
            goto La4
        L9e:
            com.yandex.mobile.ads.impl.gc0$b r2 = com.yandex.mobile.ads.impl.gc0.b.a(r2)
            r7.f385658Q = r2
        La4:
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ec0> r2 = r7.f385657P
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lad
            goto L4a
        Lad:
            com.yandex.mobile.ads.impl.gc0$b r8 = r7.f385658Q
            throw r8
        Lb0:
            r7.f385657P = r1
            return
        Lb3:
            com.yandex.mobile.ads.impl.gc0$b r8 = new com.yandex.mobile.ads.impl.gc0$b
            com.yandex.mobile.ads.impl.vw r0 = r7.f385639B
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r2, r0, r1, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gc0.a(android.media.MediaCrypto, boolean):void");
    }

    private List<ec0> a(boolean z12) {
        ArrayList arrayListA = a(this.f385683o, this.f385639B, z12);
        if (arrayListA.isEmpty() && z12) {
            arrayListA = a(this.f385683o, this.f385639B, false);
            if (!arrayListA.isEmpty()) {
                StringBuilder sbA = Cif.a("Drm session requires secure decoder for ");
                sbA.append(this.f385639B.f391181l);
                sbA.append(", but no secure decoder available. Trying to proceed with ");
                sbA.append(arrayListA);
                sbA.append(".");
                ka0.d("MediaCodecRenderer", sbA.toString());
            }
        }
        return arrayListA;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.yandex.mobile.ads.impl.ec0 r18, android.media.MediaCrypto r19) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gc0.a(com.yandex.mobile.ads.impl.ec0, android.media.MediaCrypto):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        if (r12 != false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0112  */
    @j.InterfaceC42153i
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.yandex.mobile.ads.impl.xn a(com.yandex.mobile.ads.impl.ww r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gc0.a(com.yandex.mobile.ads.impl.ww):com.yandex.mobile.ads.impl.xn");
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public boolean a() {
        return this.f385702x0;
    }

    @j.P
    private bx a(com.yandex.mobile.ads.exo.drm.e eVar) throws lt {
        tm tmVarH = eVar.h();
        if (tmVarH != null && !(tmVarH instanceof bx)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + tmVarH), this.f385639B, AuthCode.StatusCode.WAITING_CONNECT);
        }
        return (bx) tmVarH;
    }
}
