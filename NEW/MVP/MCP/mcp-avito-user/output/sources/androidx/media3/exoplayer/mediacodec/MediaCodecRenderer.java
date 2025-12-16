package androidx.media3.exoplayer.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.common.C23108t;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.F;
import androidx.media3.common.util.H;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC23136e;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.C23139h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.w;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.l;
import androidx.media3.extractor.D;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import j.InterfaceC42153i;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;

@J
/* loaded from: classes.dex */
public abstract class MediaCodecRenderer extends AbstractC23136e {

    /* renamed from: E0, reason: collision with root package name */
    public static final byte[] f49245E0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    @P
    public C23108t f49246A;

    /* renamed from: A0, reason: collision with root package name */
    public C23138g f49247A0;

    /* renamed from: B, reason: collision with root package name */
    @P
    public C23108t f49248B;

    /* renamed from: B0, reason: collision with root package name */
    public b f49249B0;

    /* renamed from: C, reason: collision with root package name */
    @P
    public DrmSession f49250C;

    /* renamed from: C0, reason: collision with root package name */
    public long f49251C0;

    /* renamed from: D, reason: collision with root package name */
    @P
    public DrmSession f49252D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f49253D0;

    /* renamed from: E, reason: collision with root package name */
    @P
    public MediaCrypto f49254E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f49255F;

    /* renamed from: G, reason: collision with root package name */
    public final long f49256G;

    /* renamed from: H, reason: collision with root package name */
    public float f49257H;

    /* renamed from: I, reason: collision with root package name */
    public float f49258I;

    /* renamed from: J, reason: collision with root package name */
    @P
    public l f49259J;

    /* renamed from: K, reason: collision with root package name */
    @P
    public C23108t f49260K;

    /* renamed from: L, reason: collision with root package name */
    @P
    public MediaFormat f49261L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f49262M;

    /* renamed from: N, reason: collision with root package name */
    public float f49263N;

    /* renamed from: O, reason: collision with root package name */
    @P
    public ArrayDeque<n> f49264O;

    /* renamed from: P, reason: collision with root package name */
    @P
    public DecoderInitializationException f49265P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    public n f49266Q;

    /* renamed from: R, reason: collision with root package name */
    public int f49267R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f49268S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f49269T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f49270U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f49271V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f49272W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f49273X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f49274Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f49275Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f49276a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f49277b0;

    /* renamed from: c0, reason: collision with root package name */
    @P
    public i f49278c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f49279d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f49280e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f49281f0;

    /* renamed from: g0, reason: collision with root package name */
    @P
    public ByteBuffer f49282g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f49283h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f49284i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f49285j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f49286k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f49287l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f49288m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f49289n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f49290o0;

    /* renamed from: p, reason: collision with root package name */
    public final l.b f49291p;

    /* renamed from: p0, reason: collision with root package name */
    public int f49292p0;

    /* renamed from: q, reason: collision with root package name */
    public final q f49293q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f49294q0;

    /* renamed from: r, reason: collision with root package name */
    public final float f49295r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f49296r0;

    /* renamed from: s, reason: collision with root package name */
    public final DecoderInputBuffer f49297s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f49298s0;

    /* renamed from: t, reason: collision with root package name */
    public final DecoderInputBuffer f49299t;

    /* renamed from: t0, reason: collision with root package name */
    public long f49300t0;

    /* renamed from: u, reason: collision with root package name */
    public final DecoderInputBuffer f49301u;

    /* renamed from: u0, reason: collision with root package name */
    public long f49302u0;

    /* renamed from: v, reason: collision with root package name */
    public final h f49303v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f49304v0;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList<Long> f49305w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f49306w0;

    /* renamed from: x, reason: collision with root package name */
    public final MediaCodec.BufferInfo f49307x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f49308x0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayDeque<b> f49309y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f49310y0;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.s f49311z;

    /* renamed from: z0, reason: collision with root package name */
    @P
    public ExoPlaybackException f49312z0;

    @X
    public static final class a {
        @InterfaceC42164u
        public static void a(l.a aVar, w wVar) {
            LogSessionId logSessionIdA = wVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f49382b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final b f49317d = new b(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f49318a;

        /* renamed from: b, reason: collision with root package name */
        public final long f49319b;

        /* renamed from: c, reason: collision with root package name */
        public final F<C23108t> f49320c = new F<>();

        public b(long j12, long j13) {
            this.f49318a = j12;
            this.f49319b = j13;
        }
    }

    public MediaCodecRenderer(int i12, l.b bVar, q qVar, float f12) {
        super(i12);
        this.f49291p = bVar;
        qVar.getClass();
        this.f49293q = qVar;
        this.f49295r = f12;
        this.f49297s = new DecoderInputBuffer(0);
        this.f49299t = new DecoderInputBuffer(0);
        this.f49301u = new DecoderInputBuffer(2);
        h hVar = new h();
        this.f49303v = hVar;
        this.f49305w = new ArrayList<>();
        this.f49307x = new MediaCodec.BufferInfo();
        this.f49257H = 1.0f;
        this.f49258I = 1.0f;
        this.f49256G = -9223372036854775807L;
        this.f49309y = new ArrayDeque<>();
        x0(b.f49317d);
        hVar.j(0);
        hVar.f48323d.order(ByteOrder.nativeOrder());
        this.f49311z = new androidx.media3.exoplayer.audio.s();
        this.f49263N = -1.0f;
        this.f49267R = 0;
        this.f49289n0 = 0;
        this.f49280e0 = -1;
        this.f49281f0 = -1;
        this.f49279d0 = -9223372036854775807L;
        this.f49300t0 = -9223372036854775807L;
        this.f49302u0 = -9223372036854775807L;
        this.f49251C0 = -9223372036854775807L;
        this.f49290o0 = 0;
        this.f49292p0 = 0;
    }

    public abstract int A0(q qVar, C23108t c23108t);

    public final boolean B0(C23108t c23108t) throws Exception {
        if (M.f47887a >= 23 && this.f49259J != null && this.f49292p0 != 3 && this.f49145h != 0) {
            float f12 = this.f49258I;
            C23108t[] c23108tArr = this.f49147j;
            c23108tArr.getClass();
            float fX2 = X(f12, c23108tArr);
            float f13 = this.f49263N;
            if (f13 == fX2) {
                return true;
            }
            if (fX2 == -1.0f) {
                if (this.f49294q0) {
                    this.f49290o0 = 1;
                    this.f49292p0 = 3;
                    return false;
                }
                s0();
                d0();
                return false;
            }
            if (f13 == -1.0f && fX2 <= this.f49295r) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fX2);
            this.f49259J.setParameters(bundle);
            this.f49263N = fX2;
        }
        return true;
    }

    @X
    public final void C0() throws MediaCryptoException, ExoPlaybackException {
        androidx.media3.decoder.c cVarC = this.f49252D.c();
        if (cVarC instanceof androidx.media3.exoplayer.drm.m) {
            try {
                this.f49254E.setMediaDrmSession(((androidx.media3.exoplayer.drm.m) cVarC).f49126b);
            } catch (MediaCryptoException e12) {
                throw B(e12, this.f49246A, false, AuthCode.StatusCode.PERMISSION_EXPIRED);
            }
        }
        w0(this.f49252D);
        this.f49290o0 = 0;
        this.f49292p0 = 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public void D() throws MediaCryptoException {
        this.f49246A = null;
        x0(b.f49317d);
        this.f49309y.clear();
        V();
    }

    public final void D0(long j12) {
        C23108t c23108tD;
        C23108t c23108tD2;
        F<C23108t> f12 = this.f49249B0.f49320c;
        synchronized (f12) {
            c23108tD = null;
            c23108tD2 = null;
            while (f12.f47881d > 0 && j12 - f12.f47878a[f12.f47880c] >= 0) {
                c23108tD2 = f12.d();
            }
        }
        C23108t c23108t = c23108tD2;
        if (c23108t == null && this.f49253D0 && this.f49261L != null) {
            F<C23108t> f13 = this.f49249B0.f49320c;
            synchronized (f13) {
                if (f13.f47881d != 0) {
                    c23108tD = f13.d();
                }
            }
            c23108t = c23108tD;
        }
        if (c23108t != null) {
            this.f49248B = c23108t;
        } else if (!this.f49262M || this.f49248B == null) {
            return;
        }
        j0(this.f49248B, this.f49261L);
        this.f49262M = false;
        this.f49253D0 = false;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public void E(boolean z12, boolean z13) {
        this.f49247A0 = new C23138g();
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public void F(long j12, boolean z12) throws Exception {
        int i12;
        this.f49304v0 = false;
        this.f49306w0 = false;
        this.f49310y0 = false;
        if (this.f49285j0) {
            this.f49303v.h();
            this.f49301u.h();
            this.f49286k0 = false;
            androidx.media3.exoplayer.audio.s sVar = this.f49311z;
            sVar.getClass();
            sVar.f48985a = AudioProcessor.f47559a;
            sVar.f48987c = 0;
            sVar.f48986b = 2;
        } else if (V()) {
            d0();
        }
        F<C23108t> f12 = this.f49249B0.f49320c;
        synchronized (f12) {
            i12 = f12.f47881d;
        }
        if (i12 > 0) {
            this.f49308x0 = true;
        }
        this.f49249B0.f49320c.b();
        this.f49309y.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public void H() {
        try {
            Q();
            s0();
        } finally {
            DrmSession.e(this.f49252D, null);
            this.f49252D = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r2 >= r7) goto L13;
     */
    @Override // androidx.media3.exoplayer.AbstractC23136e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(androidx.media3.common.C23108t[] r6, long r7, long r9) {
        /*
            r5 = this;
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r6 = r5.f49249B0
            long r6 = r6.f49319b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L16
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r6 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b
            r6.<init>(r0, r9)
            r5.x0(r6)
            goto L4c
        L16:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b> r6 = r5.f49309y
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.f49300t0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.f49251C0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L42
        L2e:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r6 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b
            r6.<init>(r0, r9)
            r5.x0(r6)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r6 = r5.f49249B0
            long r6 = r6.f49319b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L4c
            r5.m0()
            goto L4c
        L42:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r7 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b
            long r0 = r5.f49300t0
            r7.<init>(r0, r9)
            r6.add(r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.K(androidx.media3.common.t[], long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r9 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0281 A[LOOP:0: B:30:0x0090->B:108:0x0281, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M(long r24, long r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.M(long, long):boolean");
    }

    public C23139h O(n nVar, C23108t c23108t, C23108t c23108t2) {
        return new C23139h(nVar.f49386a, c23108t, c23108t2, 0, 1);
    }

    public MediaCodecDecoderException P(IllegalStateException illegalStateException, @P n nVar) {
        return new MediaCodecDecoderException(illegalStateException, nVar);
    }

    public final void Q() {
        this.f49287l0 = false;
        this.f49303v.h();
        this.f49301u.h();
        this.f49286k0 = false;
        this.f49285j0 = false;
        androidx.media3.exoplayer.audio.s sVar = this.f49311z;
        sVar.getClass();
        sVar.f48985a = AudioProcessor.f47559a;
        sVar.f48987c = 0;
        sVar.f48986b = 2;
    }

    @TargetApi(23)
    public final boolean R() throws MediaCryptoException, ExoPlaybackException {
        if (this.f49294q0) {
            this.f49290o0 = 1;
            if (this.f49269T || this.f49271V) {
                this.f49292p0 = 3;
                return false;
            }
            this.f49292p0 = 2;
        } else {
            C0();
        }
        return true;
    }

    public final boolean S(long j12, long j13) throws Exception {
        boolean z12;
        boolean z13;
        MediaCodec.BufferInfo bufferInfo;
        boolean zQ02;
        int iB2;
        boolean z14;
        boolean z15 = this.f49281f0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f49307x;
        if (!z15) {
            if (this.f49272W && this.f49296r0) {
                try {
                    iB2 = this.f49259J.b(bufferInfo2);
                } catch (IllegalStateException unused) {
                    p0();
                    if (this.f49306w0) {
                        s0();
                    }
                    return false;
                }
            } else {
                iB2 = this.f49259J.b(bufferInfo2);
            }
            if (iB2 < 0) {
                if (iB2 != -2) {
                    if (this.f49277b0 && (this.f49304v0 || this.f49290o0 == 2)) {
                        p0();
                    }
                    return false;
                }
                this.f49298s0 = true;
                MediaFormat outputFormat = this.f49259J.getOutputFormat();
                if (this.f49267R != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f49276a0 = true;
                } else {
                    if (this.f49274Y) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    this.f49261L = outputFormat;
                    this.f49262M = true;
                }
                return true;
            }
            if (this.f49276a0) {
                this.f49276a0 = false;
                this.f49259J.releaseOutputBuffer(iB2, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                p0();
                return false;
            }
            this.f49281f0 = iB2;
            ByteBuffer outputBuffer = this.f49259J.getOutputBuffer(iB2);
            this.f49282g0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f49282g0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f49273X && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j14 = this.f49300t0;
                if (j14 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j14;
                }
            }
            long j15 = bufferInfo2.presentationTimeUs;
            ArrayList<Long> arrayList = this.f49305w;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z14 = false;
                    break;
                }
                if (arrayList.get(i12).longValue() == j15) {
                    arrayList.remove(i12);
                    z14 = true;
                    break;
                }
                i12++;
            }
            this.f49283h0 = z14;
            long j16 = this.f49302u0;
            long j17 = bufferInfo2.presentationTimeUs;
            this.f49284i0 = j16 == j17;
            D0(j17);
        }
        if (this.f49272W && this.f49296r0) {
            try {
                z12 = true;
                z13 = false;
            } catch (IllegalStateException unused2) {
                z13 = false;
            }
            try {
                zQ02 = q0(j12, j13, this.f49259J, this.f49282g0, this.f49281f0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f49283h0, this.f49284i0, this.f49248B);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                p0();
                if (this.f49306w0) {
                    s0();
                }
                return z13;
            }
        } else {
            z12 = true;
            z13 = false;
            bufferInfo = bufferInfo2;
            zQ02 = q0(j12, j13, this.f49259J, this.f49282g0, this.f49281f0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f49283h0, this.f49284i0, this.f49248B);
        }
        if (zQ02) {
            l0(bufferInfo.presentationTimeUs);
            boolean z16 = (bufferInfo.flags & 4) != 0 ? z12 : z13;
            this.f49281f0 = -1;
            this.f49282g0 = null;
            if (!z16) {
                return z12;
            }
            p0();
        }
        return z13;
    }

    public final boolean T() throws Exception {
        boolean z12;
        androidx.media3.decoder.d dVar;
        l lVar = this.f49259J;
        if (lVar == null || this.f49290o0 == 2 || this.f49304v0) {
            return false;
        }
        int i12 = this.f49280e0;
        DecoderInputBuffer decoderInputBuffer = this.f49299t;
        if (i12 < 0) {
            int iD2 = lVar.d();
            this.f49280e0 = iD2;
            if (iD2 < 0) {
                return false;
            }
            decoderInputBuffer.f48323d = this.f49259J.getInputBuffer(iD2);
            decoderInputBuffer.h();
        }
        if (this.f49290o0 == 1) {
            if (!this.f49277b0) {
                this.f49296r0 = true;
                this.f49259J.f(this.f49280e0, 0, 0L, 4);
                this.f49280e0 = -1;
                decoderInputBuffer.f48323d = null;
            }
            this.f49290o0 = 2;
            return false;
        }
        if (this.f49275Z) {
            this.f49275Z = false;
            decoderInputBuffer.f48323d.put(f49245E0);
            this.f49259J.f(this.f49280e0, 38, 0L, 0);
            this.f49280e0 = -1;
            decoderInputBuffer.f48323d = null;
            this.f49294q0 = true;
            return true;
        }
        if (this.f49289n0 == 1) {
            for (int i13 = 0; i13 < this.f49260K.f47759o.size(); i13++) {
                decoderInputBuffer.f48323d.put(this.f49260K.f47759o.get(i13));
            }
            this.f49289n0 = 2;
        }
        int iPosition = decoderInputBuffer.f48323d.position();
        androidx.media3.exoplayer.F f12 = this.f49141d;
        f12.a();
        try {
            int iL2 = L(f12, decoderInputBuffer, 0);
            if (t() || decoderInputBuffer.f(536870912)) {
                this.f49302u0 = this.f49300t0;
            }
            if (iL2 == -3) {
                return false;
            }
            if (iL2 == -5) {
                if (this.f49289n0 == 2) {
                    decoderInputBuffer.h();
                    this.f49289n0 = 1;
                }
                i0(f12);
                return true;
            }
            if (decoderInputBuffer.f(4)) {
                if (this.f49289n0 == 2) {
                    decoderInputBuffer.h();
                    this.f49289n0 = 1;
                }
                this.f49304v0 = true;
                if (!this.f49294q0) {
                    p0();
                    return false;
                }
                try {
                    if (!this.f49277b0) {
                        this.f49296r0 = true;
                        this.f49259J.f(this.f49280e0, 0, 0L, 4);
                        this.f49280e0 = -1;
                        decoderInputBuffer.f48323d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e12) {
                    throw B(e12, this.f49246A, false, M.q(e12.getErrorCode()));
                }
            }
            if (!this.f49294q0 && !decoderInputBuffer.f(1)) {
                decoderInputBuffer.h();
                if (this.f49289n0 == 2) {
                    this.f49289n0 = 1;
                }
                return true;
            }
            boolean zF2 = decoderInputBuffer.f(1073741824);
            androidx.media3.decoder.d dVar2 = decoderInputBuffer.f48322c;
            if (zF2) {
                if (iPosition == 0) {
                    dVar2.getClass();
                } else {
                    if (dVar2.f48332d == null) {
                        int[] iArr = new int[1];
                        dVar2.f48332d = iArr;
                        dVar2.f48337i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = dVar2.f48332d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.f49268S && !zF2) {
                ByteBuffer byteBuffer = decoderInputBuffer.f48323d;
                int iPosition2 = byteBuffer.position();
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = i14 + 1;
                    if (i16 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i17 = byteBuffer.get(i14) & 255;
                    if (i15 == 3) {
                        if (i17 == 1 && (byteBuffer.get(i16) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            byteBufferDuplicate.position(i14 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer.position(0);
                            byteBuffer.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i17 == 0) {
                        i15++;
                    }
                    if (i17 != 0) {
                        i15 = 0;
                    }
                    i14 = i16;
                }
                if (decoderInputBuffer.f48323d.position() == 0) {
                    return true;
                }
                this.f49268S = false;
            }
            long jMax = decoderInputBuffer.f48325f;
            i iVar = this.f49278c0;
            if (iVar != null) {
                C23108t c23108t = this.f49246A;
                if (iVar.f49374b == 0) {
                    iVar.f49373a = jMax;
                }
                if (iVar.f49375c) {
                    z12 = zF2;
                    long j12 = this.f49300t0;
                    i iVar2 = this.f49278c0;
                    C23108t c23108t2 = this.f49246A;
                    iVar2.getClass();
                    dVar = dVar2;
                    this.f49300t0 = Math.max(j12, Math.max(0L, ((iVar2.f49374b - 529) * 1000000) / c23108t2.f47737A) + iVar2.f49373a);
                } else {
                    ByteBuffer byteBuffer2 = decoderInputBuffer.f48323d;
                    byteBuffer2.getClass();
                    int i18 = 0;
                    int i19 = 0;
                    for (int i22 = 4; i18 < i22; i22 = 4) {
                        i19 = (i19 << 8) | (byteBuffer2.get(i18) & 255);
                        i18++;
                    }
                    int iB2 = D.b(i19);
                    if (iB2 == -1) {
                        iVar.f49375c = true;
                        iVar.f49374b = 0L;
                        iVar.f49373a = decoderInputBuffer.f48325f;
                        androidx.media3.common.util.s.g();
                        jMax = decoderInputBuffer.f48325f;
                        z12 = zF2;
                        long j122 = this.f49300t0;
                        i iVar22 = this.f49278c0;
                        C23108t c23108t22 = this.f49246A;
                        iVar22.getClass();
                        dVar = dVar2;
                        this.f49300t0 = Math.max(j122, Math.max(0L, ((iVar22.f49374b - 529) * 1000000) / c23108t22.f47737A) + iVar22.f49373a);
                    } else {
                        z12 = zF2;
                        jMax = Math.max(0L, ((iVar.f49374b - 529) * 1000000) / c23108t.f47737A) + iVar.f49373a;
                        iVar.f49374b += iB2;
                        long j1222 = this.f49300t0;
                        i iVar222 = this.f49278c0;
                        C23108t c23108t222 = this.f49246A;
                        iVar222.getClass();
                        dVar = dVar2;
                        this.f49300t0 = Math.max(j1222, Math.max(0L, ((iVar222.f49374b - 529) * 1000000) / c23108t222.f47737A) + iVar222.f49373a);
                    }
                }
            } else {
                z12 = zF2;
                dVar = dVar2;
            }
            if (decoderInputBuffer.f(BeduinInputModel.MIN_TEXT_VERSION)) {
                this.f49305w.add(Long.valueOf(jMax));
            }
            if (this.f49308x0) {
                ArrayDeque<b> arrayDeque = this.f49309y;
                if (arrayDeque.isEmpty()) {
                    this.f49249B0.f49320c.a(jMax, this.f49246A);
                } else {
                    arrayDeque.peekLast().f49320c.a(jMax, this.f49246A);
                }
                this.f49308x0 = false;
            }
            this.f49300t0 = Math.max(this.f49300t0, jMax);
            decoderInputBuffer.k();
            if (decoderInputBuffer.f(268435456)) {
                b0(decoderInputBuffer);
            }
            n0(decoderInputBuffer);
            try {
                if (z12) {
                    this.f49259J.g(this.f49280e0, dVar, jMax);
                } else {
                    this.f49259J.f(this.f49280e0, decoderInputBuffer.f48323d.limit(), jMax, 0);
                }
                this.f49280e0 = -1;
                decoderInputBuffer.f48323d = null;
                this.f49294q0 = true;
                this.f49289n0 = 0;
                this.f49247A0.f49157c++;
                return true;
            } catch (MediaCodec.CryptoException e13) {
                throw B(e13, this.f49246A, false, M.q(e13.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e14) {
            f0(e14);
            r0(0);
            U();
            return true;
        }
    }

    public final void U() {
        try {
            this.f49259J.flush();
        } finally {
            u0();
        }
    }

    public final boolean V() throws MediaCryptoException {
        if (this.f49259J == null) {
            return false;
        }
        int i12 = this.f49292p0;
        if (i12 == 3 || this.f49269T || ((this.f49270U && !this.f49298s0) || (this.f49271V && this.f49296r0))) {
            s0();
            return true;
        }
        if (i12 == 2) {
            int i13 = M.f47887a;
            C23110a.g(i13 >= 23);
            if (i13 >= 23) {
                try {
                    C0();
                } catch (ExoPlaybackException e12) {
                    androidx.media3.common.util.s.h("Failed to update the DRM session, releasing the codec instead.", e12);
                    s0();
                    return true;
                }
            }
        }
        U();
        return false;
    }

    public boolean W() {
        return false;
    }

    public float X(float f12, C23108t[] c23108tArr) {
        return -1.0f;
    }

    public abstract ArrayList Y(q qVar, C23108t c23108t, boolean z12);

    public abstract l.a Z(n nVar, C23108t c23108t, @P MediaCrypto mediaCrypto, float f12);

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.c0
    public boolean a() {
        return this.f49306w0;
    }

    public final long a0() {
        return this.f49249B0.f49319b;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(androidx.media3.exoplayer.mediacodec.n r17, @j.P android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.c0(androidx.media3.exoplayer.mediacodec.n, android.media.MediaCrypto):void");
    }

    public final void d0() throws Exception {
        C23108t c23108t;
        if (this.f49259J != null || this.f49285j0 || (c23108t = this.f49246A) == null) {
            return;
        }
        if (this.f49252D == null && z0(c23108t)) {
            C23108t c23108t2 = this.f49246A;
            Q();
            String str = c23108t2.f47757m;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            h hVar = this.f49303v;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                hVar.getClass();
                hVar.f49372k = 32;
            } else {
                hVar.getClass();
                hVar.f49372k = 1;
            }
            this.f49285j0 = true;
            return;
        }
        w0(this.f49252D);
        String str2 = this.f49246A.f47757m;
        DrmSession drmSession = this.f49250C;
        if (drmSession != null) {
            androidx.media3.decoder.c cVarC = drmSession.c();
            if (this.f49254E == null) {
                if (cVarC == null) {
                    if (this.f49250C.getError() == null) {
                        return;
                    }
                } else if (cVarC instanceof androidx.media3.exoplayer.drm.m) {
                    androidx.media3.exoplayer.drm.m mVar = (androidx.media3.exoplayer.drm.m) cVarC;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(mVar.f49125a, mVar.f49126b);
                        this.f49254E = mediaCrypto;
                        this.f49255F = !mVar.f49127c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e12) {
                        throw B(e12, this.f49246A, false, AuthCode.StatusCode.PERMISSION_EXPIRED);
                    }
                }
            }
            if (androidx.media3.exoplayer.drm.m.f49124d && (cVarC instanceof androidx.media3.exoplayer.drm.m)) {
                int state = this.f49250C.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException error = this.f49250C.getError();
                    error.getClass();
                    throw B(error, this.f49246A, false, error.f49098b);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            e0(this.f49254E, this.f49255F);
        } catch (DecoderInitializationException e13) {
            throw B(e13, this.f49246A, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(@j.P android.media.MediaCrypto r12, boolean r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.e0(android.media.MediaCrypto, boolean):void");
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.d0
    public final int f() {
        return 8;
    }

    @Override // androidx.media3.exoplayer.d0
    public final int i(C23108t c23108t) throws ExoPlaybackException {
        try {
            return A0(this.f49293q, c23108t);
        } catch (MediaCodecUtil.DecoderQueryException e12) {
            throw B(e12, c23108t, false, 4002);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        if (r14 != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    @j.InterfaceC42153i
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.C23139h i0(androidx.media3.exoplayer.F r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.i0(androidx.media3.exoplayer.F):androidx.media3.exoplayer.h");
    }

    @InterfaceC42153i
    public void l0(long j12) {
        this.f49251C0 = j12;
        while (true) {
            ArrayDeque<b> arrayDeque = this.f49309y;
            if (arrayDeque.isEmpty() || j12 < arrayDeque.peek().f49318a) {
                return;
            }
            x0(arrayDeque.poll());
            m0();
        }
    }

    @Override // androidx.media3.exoplayer.c0
    public boolean n() {
        return this.f49246A != null && (C() || this.f49281f0 >= 0 || (this.f49279d0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f49279d0));
    }

    @Override // androidx.media3.exoplayer.c0
    public void o(long j12, long j13) throws Exception {
        boolean z12 = false;
        if (this.f49310y0) {
            this.f49310y0 = false;
            p0();
        }
        ExoPlaybackException exoPlaybackException = this.f49312z0;
        if (exoPlaybackException != null) {
            this.f49312z0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f49306w0) {
                t0();
                return;
            }
            if (this.f49246A != null || r0(2)) {
                d0();
                if (this.f49285j0) {
                    H.a("bypassRender");
                    while (M(j12, j13)) {
                    }
                    H.b();
                } else if (this.f49259J != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    H.a("drainAndFeed");
                    while (S(j12, j13)) {
                        long j14 = this.f49256G;
                        if (!(j14 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j14)) {
                            break;
                        }
                    }
                    while (T()) {
                        long j15 = this.f49256G;
                        if (!(j15 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j15)) {
                            break;
                        }
                    }
                    H.b();
                } else {
                    C23138g c23138g = this.f49247A0;
                    int i12 = c23138g.f49158d;
                    androidx.media3.exoplayer.source.P p12 = this.f49146i;
                    p12.getClass();
                    c23138g.f49158d = i12 + p12.b(j12 - this.f49148k);
                    r0(1);
                }
                synchronized (this.f49247A0) {
                }
            }
        } catch (IllegalStateException e12) {
            int i13 = M.f47887a;
            if (i13 < 21 || !(e12 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e12.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e12;
                }
            }
            f0(e12);
            if (i13 >= 21) {
                if (e12 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e12).isRecoverable() : false) {
                    z12 = true;
                }
            }
            if (z12) {
                s0();
            }
            throw B(P(e12, this.f49266Q), this.f49246A, z12, 4003);
        }
    }

    @TargetApi(23)
    public final void p0() throws Exception {
        int i12 = this.f49292p0;
        if (i12 == 1) {
            U();
            return;
        }
        if (i12 == 2) {
            U();
            C0();
        } else if (i12 != 3) {
            this.f49306w0 = true;
            t0();
        } else {
            s0();
            d0();
        }
    }

    public abstract boolean q0(long j12, long j13, @P l lVar, @P ByteBuffer byteBuffer, int i12, int i13, int i14, long j14, boolean z12, boolean z13, C23108t c23108t);

    public final boolean r0(int i12) throws Exception {
        androidx.media3.exoplayer.F f12 = this.f49141d;
        f12.a();
        DecoderInputBuffer decoderInputBuffer = this.f49297s;
        decoderInputBuffer.h();
        int iL2 = L(f12, decoderInputBuffer, i12 | 4);
        if (iL2 == -5) {
            i0(f12);
            return true;
        }
        if (iL2 != -4 || !decoderInputBuffer.f(4)) {
            return false;
        }
        this.f49304v0 = true;
        p0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s0() {
        try {
            l lVar = this.f49259J;
            if (lVar != null) {
                lVar.release();
                this.f49247A0.f49156b++;
                h0(this.f49266Q.f49386a);
            }
            this.f49259J = null;
            try {
                MediaCrypto mediaCrypto = this.f49254E;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f49259J = null;
            try {
                MediaCrypto mediaCrypto2 = this.f49254E;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    @InterfaceC42153i
    public void u0() {
        this.f49280e0 = -1;
        this.f49299t.f48323d = null;
        this.f49281f0 = -1;
        this.f49282g0 = null;
        this.f49279d0 = -9223372036854775807L;
        this.f49296r0 = false;
        this.f49294q0 = false;
        this.f49275Z = false;
        this.f49276a0 = false;
        this.f49283h0 = false;
        this.f49284i0 = false;
        this.f49305w.clear();
        this.f49300t0 = -9223372036854775807L;
        this.f49302u0 = -9223372036854775807L;
        this.f49251C0 = -9223372036854775807L;
        i iVar = this.f49278c0;
        if (iVar != null) {
            iVar.f49373a = 0L;
            iVar.f49374b = 0L;
            iVar.f49375c = false;
        }
        this.f49290o0 = 0;
        this.f49292p0 = 0;
        this.f49289n0 = this.f49288m0 ? 1 : 0;
    }

    @InterfaceC42153i
    public final void v0() {
        u0();
        this.f49312z0 = null;
        this.f49278c0 = null;
        this.f49264O = null;
        this.f49266Q = null;
        this.f49260K = null;
        this.f49261L = null;
        this.f49262M = false;
        this.f49298s0 = false;
        this.f49263N = -1.0f;
        this.f49267R = 0;
        this.f49268S = false;
        this.f49269T = false;
        this.f49270U = false;
        this.f49271V = false;
        this.f49272W = false;
        this.f49273X = false;
        this.f49274Y = false;
        this.f49277b0 = false;
        this.f49288m0 = false;
        this.f49289n0 = 0;
        this.f49255F = false;
    }

    public final void w0(@P DrmSession drmSession) {
        DrmSession.e(this.f49250C, drmSession);
        this.f49250C = drmSession;
    }

    @Override // androidx.media3.exoplayer.c0
    public void x(float f12, float f13) throws Exception {
        this.f49257H = f12;
        this.f49258I = f13;
        B0(this.f49260K);
    }

    public final void x0(b bVar) {
        this.f49249B0 = bVar;
        long j12 = bVar.f49319b;
        if (j12 != -9223372036854775807L) {
            this.f49253D0 = true;
            k0(j12);
        }
    }

    public boolean y0(n nVar) {
        return true;
    }

    public boolean z0(C23108t c23108t) {
        return false;
    }

    public static class DecoderInitializationException extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final String f49313b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49314c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final n f49315d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public final String f49316e;

        public DecoderInitializationException(C23108t c23108t, @P MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z12, int i12) {
            this("Decoder init failed: [" + i12 + "], " + c23108t, decoderQueryException, c23108t.f47757m, z12, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i12 < 0 ? "neg_" : "") + Math.abs(i12));
        }

        public DecoderInitializationException(String str, @P Throwable th2, String str2, boolean z12, @P n nVar, @P String str3) {
            super(str, th2);
            this.f49313b = str2;
            this.f49314c = z12;
            this.f49315d = nVar;
            this.f49316e = str3;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public void I() {
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public void J() {
    }

    public void m0() {
    }

    public void t0() {
    }

    public void b0(DecoderInputBuffer decoderInputBuffer) {
    }

    public void f0(Exception exc) {
    }

    public void h0(String str) {
    }

    public void k0(long j12) {
    }

    public void n0(DecoderInputBuffer decoderInputBuffer) {
    }

    public void o0(C23108t c23108t) {
    }

    public void j0(C23108t c23108t, @P MediaFormat mediaFormat) {
    }

    public void g0(long j12, long j13, String str) {
    }
}
