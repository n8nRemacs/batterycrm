package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.AbstractC36523f;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.audio.u;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.l;
import com.google.android.exoplayer2.source.M;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.N;
import com.google.android.exoplayer2.util.U;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import j.InterfaceC42153i;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class MediaCodecRenderer extends AbstractC36523f {

    /* renamed from: E0, reason: collision with root package name */
    public static final byte[] f345469E0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    @P
    public I f345470A;

    /* renamed from: A0, reason: collision with root package name */
    public com.google.android.exoplayer2.decoder.f f345471A0;

    /* renamed from: B, reason: collision with root package name */
    @P
    public I f345472B;

    /* renamed from: B0, reason: collision with root package name */
    public long f345473B0;

    /* renamed from: C, reason: collision with root package name */
    @P
    public DrmSession f345474C;

    /* renamed from: C0, reason: collision with root package name */
    public long f345475C0;

    /* renamed from: D, reason: collision with root package name */
    @P
    public DrmSession f345476D;

    /* renamed from: D0, reason: collision with root package name */
    public int f345477D0;

    /* renamed from: E, reason: collision with root package name */
    @P
    public MediaCrypto f345478E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f345479F;

    /* renamed from: G, reason: collision with root package name */
    public final long f345480G;

    /* renamed from: H, reason: collision with root package name */
    public float f345481H;

    /* renamed from: I, reason: collision with root package name */
    public float f345482I;

    /* renamed from: J, reason: collision with root package name */
    @P
    public l f345483J;

    /* renamed from: K, reason: collision with root package name */
    @P
    public I f345484K;

    /* renamed from: L, reason: collision with root package name */
    @P
    public MediaFormat f345485L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f345486M;

    /* renamed from: N, reason: collision with root package name */
    public float f345487N;

    /* renamed from: O, reason: collision with root package name */
    @P
    public ArrayDeque<m> f345488O;

    /* renamed from: P, reason: collision with root package name */
    @P
    public DecoderInitializationException f345489P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    public m f345490Q;

    /* renamed from: R, reason: collision with root package name */
    public int f345491R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f345492S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f345493T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f345494U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f345495V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f345496W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f345497X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f345498Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f345499Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f345500a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f345501b0;

    /* renamed from: c0, reason: collision with root package name */
    @P
    public i f345502c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f345503d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f345504e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f345505f0;

    /* renamed from: g0, reason: collision with root package name */
    @P
    public ByteBuffer f345506g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f345507h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f345508i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f345509j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f345510k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f345511l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f345512m0;

    /* renamed from: n, reason: collision with root package name */
    public final l.b f345513n;

    /* renamed from: n0, reason: collision with root package name */
    public int f345514n0;

    /* renamed from: o, reason: collision with root package name */
    public final o f345515o;

    /* renamed from: o0, reason: collision with root package name */
    public int f345516o0;

    /* renamed from: p, reason: collision with root package name */
    public final float f345517p;

    /* renamed from: p0, reason: collision with root package name */
    public int f345518p0;

    /* renamed from: q, reason: collision with root package name */
    public final DecoderInputBuffer f345519q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f345520q0;

    /* renamed from: r, reason: collision with root package name */
    public final DecoderInputBuffer f345521r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f345522r0;

    /* renamed from: s, reason: collision with root package name */
    public final DecoderInputBuffer f345523s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f345524s0;

    /* renamed from: t, reason: collision with root package name */
    public final h f345525t;

    /* renamed from: t0, reason: collision with root package name */
    public long f345526t0;

    /* renamed from: u, reason: collision with root package name */
    public final N<I> f345527u;

    /* renamed from: u0, reason: collision with root package name */
    public long f345528u0;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList<Long> f345529v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f345530v0;

    /* renamed from: w, reason: collision with root package name */
    public final MediaCodec.BufferInfo f345531w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f345532w0;

    /* renamed from: x, reason: collision with root package name */
    public final long[] f345533x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f345534x0;

    /* renamed from: y, reason: collision with root package name */
    public final long[] f345535y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f345536y0;

    /* renamed from: z, reason: collision with root package name */
    public final long[] f345537z;

    /* renamed from: z0, reason: collision with root package name */
    @P
    public ExoPlaybackException f345538z0;

    @X
    public static final class a {
        @InterfaceC42164u
        public static void a(l.a aVar, com.google.android.exoplayer2.analytics.p pVar) {
            LogSessionId logSessionIdA = pVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f345604b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public MediaCodecRenderer(int i12, l.b bVar, o oVar, float f12) {
        super(i12);
        this.f345513n = bVar;
        oVar.getClass();
        this.f345515o = oVar;
        this.f345517p = f12;
        this.f345519q = new DecoderInputBuffer(0);
        this.f345521r = new DecoderInputBuffer(0);
        this.f345523s = new DecoderInputBuffer(2);
        h hVar = new h();
        this.f345525t = hVar;
        this.f345527u = new N<>();
        this.f345529v = new ArrayList<>();
        this.f345531w = new MediaCodec.BufferInfo();
        this.f345481H = 1.0f;
        this.f345482I = 1.0f;
        this.f345480G = -9223372036854775807L;
        this.f345533x = new long[10];
        this.f345535y = new long[10];
        this.f345537z = new long[10];
        this.f345473B0 = -9223372036854775807L;
        this.f345475C0 = -9223372036854775807L;
        hVar.j(0);
        hVar.f344205d.order(ByteOrder.nativeOrder());
        this.f345487N = -1.0f;
        this.f345491R = 0;
        this.f345514n0 = 0;
        this.f345504e0 = -1;
        this.f345505f0 = -1;
        this.f345503d0 = -9223372036854775807L;
        this.f345526t0 = -9223372036854775807L;
        this.f345528u0 = -9223372036854775807L;
        this.f345516o0 = 0;
        this.f345518p0 = 0;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public void B() throws MediaCryptoException {
        this.f345470A = null;
        this.f345473B0 = -9223372036854775807L;
        this.f345475C0 = -9223372036854775807L;
        this.f345477D0 = 0;
        S();
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public void C(boolean z12, boolean z13) {
        this.f345471A0 = new com.google.android.exoplayer2.decoder.f();
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public void D(long j12, boolean z12) throws Exception {
        int i12;
        this.f345530v0 = false;
        this.f345532w0 = false;
        this.f345536y0 = false;
        if (this.f345509j0) {
            this.f345525t.h();
            this.f345523s.h();
            this.f345510k0 = false;
        } else if (S()) {
            a0();
        }
        N<I> n12 = this.f345527u;
        synchronized (n12) {
            i12 = n12.f348098d;
        }
        if (i12 > 0) {
            this.f345534x0 = true;
        }
        this.f345527u.b();
        int i13 = this.f345477D0;
        if (i13 != 0) {
            int i14 = i13 - 1;
            this.f345475C0 = this.f345535y[i14];
            this.f345473B0 = this.f345533x[i14];
            this.f345477D0 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public void E() {
        try {
            M();
            n0();
        } finally {
            DrmSession.g(this.f345476D, null);
            this.f345476D = null;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void H(I[] iArr, long j12, long j13) {
        if (this.f345475C0 == -9223372036854775807L) {
            C36585a.d(this.f345473B0 == -9223372036854775807L);
            this.f345473B0 = j12;
            this.f345475C0 = j13;
            return;
        }
        int i12 = this.f345477D0;
        long[] jArr = this.f345535y;
        if (i12 == jArr.length) {
            long j14 = jArr[i12 - 1];
        } else {
            this.f345477D0 = i12 + 1;
        }
        int i13 = this.f345477D0 - 1;
        this.f345533x[i13] = j12;
        jArr[i13] = j13;
        this.f345537z[i13] = this.f345526t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final boolean J(long j12, long j13) throws Exception {
        boolean z12;
        h hVar;
        C36585a.d(!this.f345532w0);
        h hVar2 = this.f345525t;
        int i12 = hVar2.f345593j;
        if (!(i12 > 0)) {
            z12 = 0;
            hVar = hVar2;
        } else {
            if (!l0(j12, j13, null, hVar2.f344205d, this.f345505f0, 0, i12, hVar2.f344207f, hVar2.f(BeduinInputModel.MIN_TEXT_VERSION), hVar2.f(4), this.f345472B)) {
                return false;
            }
            hVar = hVar2;
            h0(hVar.f345592i);
            hVar.h();
            z12 = 0;
        }
        if (this.f345530v0) {
            this.f345532w0 = true;
            return z12;
        }
        boolean z13 = this.f345510k0;
        DecoderInputBuffer decoderInputBuffer = this.f345523s;
        if (z13) {
            C36585a.d(hVar.l(decoderInputBuffer));
            this.f345510k0 = z12;
        }
        if (this.f345511l0) {
            if (hVar.f345593j > 0) {
                return true;
            }
            M();
            this.f345511l0 = z12;
            a0();
            if (!this.f345509j0) {
                return z12;
            }
        }
        C36585a.d(!this.f345530v0);
        J j14 = this.f345397c;
        j14.a();
        decoderInputBuffer.h();
        while (true) {
            decoderInputBuffer.h();
            int I12 = I(j14, decoderInputBuffer, z12);
            if (I12 == -5) {
                f0(j14);
                break;
            }
            if (I12 != -4) {
                if (I12 != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (decoderInputBuffer.f(4)) {
                    this.f345530v0 = true;
                    break;
                }
                if (this.f345534x0) {
                    I i13 = this.f345470A;
                    i13.getClass();
                    this.f345472B = i13;
                    g0(i13, null);
                    this.f345534x0 = z12;
                }
                decoderInputBuffer.k();
                if (!hVar.l(decoderInputBuffer)) {
                    this.f345510k0 = true;
                    break;
                }
            }
        }
        if (hVar.f345593j > 0) {
            hVar.k();
        }
        if (hVar.f345593j > 0 || this.f345530v0 || this.f345511l0) {
            return true;
        }
        return z12;
    }

    public com.google.android.exoplayer2.decoder.h K(m mVar, I i12, I i13) {
        return new com.google.android.exoplayer2.decoder.h(mVar.f345608a, i12, i13, 0, 1);
    }

    public MediaCodecDecoderException L(IllegalStateException illegalStateException, @P m mVar) {
        return new MediaCodecDecoderException(illegalStateException, mVar);
    }

    public final void M() {
        this.f345511l0 = false;
        this.f345525t.h();
        this.f345523s.h();
        this.f345510k0 = false;
        this.f345509j0 = false;
    }

    @TargetApi(23)
    public final boolean O() throws ExoPlaybackException, MediaCryptoException {
        if (this.f345520q0) {
            this.f345516o0 = 1;
            if (this.f345493T || this.f345495V) {
                this.f345518p0 = 3;
                return false;
            }
            this.f345518p0 = 2;
        } else {
            w0();
        }
        return true;
    }

    public final boolean P(long j12, long j13) throws Exception {
        boolean z12;
        boolean z13;
        MediaCodec.BufferInfo bufferInfo;
        boolean zL02;
        int iB2;
        boolean z14;
        boolean z15 = this.f345505f0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f345531w;
        if (!z15) {
            if (this.f345496W && this.f345522r0) {
                try {
                    iB2 = this.f345483J.b(bufferInfo2);
                } catch (IllegalStateException unused) {
                    k0();
                    if (this.f345532w0) {
                        n0();
                    }
                    return false;
                }
            } else {
                iB2 = this.f345483J.b(bufferInfo2);
            }
            if (iB2 < 0) {
                if (iB2 != -2) {
                    if (this.f345501b0 && (this.f345530v0 || this.f345516o0 == 2)) {
                        k0();
                    }
                    return false;
                }
                this.f345524s0 = true;
                MediaFormat outputFormat = this.f345483J.getOutputFormat();
                if (this.f345491R != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f345500a0 = true;
                } else {
                    if (this.f345498Y) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    this.f345485L = outputFormat;
                    this.f345486M = true;
                }
                return true;
            }
            if (this.f345500a0) {
                this.f345500a0 = false;
                this.f345483J.releaseOutputBuffer(iB2, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                k0();
                return false;
            }
            this.f345505f0 = iB2;
            ByteBuffer outputBuffer = this.f345483J.getOutputBuffer(iB2);
            this.f345506g0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f345506g0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f345497X && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j14 = this.f345526t0;
                if (j14 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j14;
                }
            }
            long j15 = bufferInfo2.presentationTimeUs;
            ArrayList<Long> arrayList = this.f345529v;
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
            this.f345507h0 = z14;
            long j16 = this.f345528u0;
            long j17 = bufferInfo2.presentationTimeUs;
            this.f345508i0 = j16 == j17;
            x0(j17);
        }
        if (this.f345496W && this.f345522r0) {
            try {
                z12 = true;
                z13 = false;
            } catch (IllegalStateException unused2) {
                z13 = false;
            }
            try {
                zL02 = l0(j12, j13, this.f345483J, this.f345506g0, this.f345505f0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f345507h0, this.f345508i0, this.f345472B);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                k0();
                if (this.f345532w0) {
                    n0();
                }
                return z13;
            }
        } else {
            z12 = true;
            z13 = false;
            bufferInfo = bufferInfo2;
            zL02 = l0(j12, j13, this.f345483J, this.f345506g0, this.f345505f0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f345507h0, this.f345508i0, this.f345472B);
        }
        if (zL02) {
            h0(bufferInfo.presentationTimeUs);
            boolean z16 = (bufferInfo.flags & 4) != 0 ? z12 : z13;
            this.f345505f0 = -1;
            this.f345506g0 = null;
            if (!z16) {
                return z12;
            }
            k0();
        }
        return z13;
    }

    public final boolean Q() throws Exception {
        boolean z12;
        com.google.android.exoplayer2.decoder.d dVar;
        l lVar = this.f345483J;
        if (lVar == null || this.f345516o0 == 2 || this.f345530v0) {
            return false;
        }
        int i12 = this.f345504e0;
        DecoderInputBuffer decoderInputBuffer = this.f345521r;
        if (i12 < 0) {
            int iD2 = lVar.d();
            this.f345504e0 = iD2;
            if (iD2 < 0) {
                return false;
            }
            decoderInputBuffer.f344205d = this.f345483J.getInputBuffer(iD2);
            decoderInputBuffer.h();
        }
        if (this.f345516o0 == 1) {
            if (!this.f345501b0) {
                this.f345522r0 = true;
                this.f345483J.f(this.f345504e0, 0, 0L, 4);
                this.f345504e0 = -1;
                decoderInputBuffer.f344205d = null;
            }
            this.f345516o0 = 2;
            return false;
        }
        if (this.f345499Z) {
            this.f345499Z = false;
            decoderInputBuffer.f344205d.put(f345469E0);
            this.f345483J.f(this.f345504e0, 38, 0L, 0);
            this.f345504e0 = -1;
            decoderInputBuffer.f344205d = null;
            this.f345520q0 = true;
            return true;
        }
        if (this.f345514n0 == 1) {
            for (int i13 = 0; i13 < this.f345484K.f343478o.size(); i13++) {
                decoderInputBuffer.f344205d.put(this.f345484K.f343478o.get(i13));
            }
            this.f345514n0 = 2;
        }
        int iPosition = decoderInputBuffer.f344205d.position();
        J j12 = this.f345397c;
        j12.a();
        try {
            int I12 = I(j12, decoderInputBuffer, 0);
            if (t()) {
                this.f345528u0 = this.f345526t0;
            }
            if (I12 == -3) {
                return false;
            }
            if (I12 == -5) {
                if (this.f345514n0 == 2) {
                    decoderInputBuffer.h();
                    this.f345514n0 = 1;
                }
                f0(j12);
                return true;
            }
            if (decoderInputBuffer.f(4)) {
                if (this.f345514n0 == 2) {
                    decoderInputBuffer.h();
                    this.f345514n0 = 1;
                }
                this.f345530v0 = true;
                if (!this.f345520q0) {
                    k0();
                    return false;
                }
                try {
                    if (!this.f345501b0) {
                        this.f345522r0 = true;
                        this.f345483J.f(this.f345504e0, 0, 0L, 4);
                        this.f345504e0 = -1;
                        decoderInputBuffer.f344205d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e12) {
                    throw z(e12, this.f345470A, false, U.r(e12.getErrorCode()));
                }
            }
            if (!this.f345520q0 && !decoderInputBuffer.f(1)) {
                decoderInputBuffer.h();
                if (this.f345514n0 == 2) {
                    this.f345514n0 = 1;
                }
                return true;
            }
            boolean zF2 = decoderInputBuffer.f(1073741824);
            com.google.android.exoplayer2.decoder.d dVar2 = decoderInputBuffer.f344204c;
            if (zF2) {
                if (iPosition == 0) {
                    dVar2.getClass();
                } else {
                    if (dVar2.f344214d == null) {
                        int[] iArr = new int[1];
                        dVar2.f344214d = iArr;
                        dVar2.f344219i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = dVar2.f344214d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.f345492S && !zF2) {
                ByteBuffer byteBuffer = decoderInputBuffer.f344205d;
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
                if (decoderInputBuffer.f344205d.position() == 0) {
                    return true;
                }
                this.f345492S = false;
            }
            long jMax = decoderInputBuffer.f344207f;
            i iVar = this.f345502c0;
            if (iVar != null) {
                I i18 = this.f345470A;
                if (iVar.f345596b == 0) {
                    iVar.f345595a = jMax;
                }
                if (iVar.f345597c) {
                    z12 = zF2;
                    long j13 = this.f345526t0;
                    i iVar2 = this.f345502c0;
                    I i19 = this.f345470A;
                    iVar2.getClass();
                    dVar = dVar2;
                    this.f345526t0 = Math.max(j13, Math.max(0L, ((iVar2.f345596b - 529) * 1000000) / i19.f343458A) + iVar2.f345595a);
                } else {
                    ByteBuffer byteBuffer2 = decoderInputBuffer.f344205d;
                    byteBuffer2.getClass();
                    int i22 = 0;
                    int i23 = 0;
                    for (int i24 = 4; i22 < i24; i24 = 4) {
                        i23 = (i23 << 8) | (byteBuffer2.get(i22) & 255);
                        i22++;
                    }
                    int iB2 = u.b(i23);
                    if (iB2 == -1) {
                        iVar.f345597c = true;
                        iVar.f345596b = 0L;
                        jMax = decoderInputBuffer.f344207f;
                        iVar.f345595a = jMax;
                        z12 = zF2;
                        long j132 = this.f345526t0;
                        i iVar22 = this.f345502c0;
                        I i192 = this.f345470A;
                        iVar22.getClass();
                        dVar = dVar2;
                        this.f345526t0 = Math.max(j132, Math.max(0L, ((iVar22.f345596b - 529) * 1000000) / i192.f343458A) + iVar22.f345595a);
                    } else {
                        z12 = zF2;
                        jMax = Math.max(0L, ((iVar.f345596b - 529) * 1000000) / i18.f343458A) + iVar.f345595a;
                        iVar.f345596b += iB2;
                        long j1322 = this.f345526t0;
                        i iVar222 = this.f345502c0;
                        I i1922 = this.f345470A;
                        iVar222.getClass();
                        dVar = dVar2;
                        this.f345526t0 = Math.max(j1322, Math.max(0L, ((iVar222.f345596b - 529) * 1000000) / i1922.f343458A) + iVar222.f345595a);
                    }
                }
            } else {
                z12 = zF2;
                dVar = dVar2;
            }
            if (decoderInputBuffer.f(BeduinInputModel.MIN_TEXT_VERSION)) {
                this.f345529v.add(Long.valueOf(jMax));
            }
            if (this.f345534x0) {
                this.f345527u.a(jMax, this.f345470A);
                this.f345534x0 = false;
            }
            this.f345526t0 = Math.max(this.f345526t0, jMax);
            decoderInputBuffer.k();
            if (decoderInputBuffer.f(268435456)) {
                Y(decoderInputBuffer);
            }
            j0(decoderInputBuffer);
            try {
                if (z12) {
                    this.f345483J.h(this.f345504e0, dVar, jMax);
                } else {
                    this.f345483J.f(this.f345504e0, decoderInputBuffer.f344205d.limit(), jMax, 0);
                }
                this.f345504e0 = -1;
                decoderInputBuffer.f344205d = null;
                this.f345520q0 = true;
                this.f345514n0 = 0;
                this.f345471A0.f344225c++;
                return true;
            } catch (MediaCodec.CryptoException e13) {
                throw z(e13, this.f345470A, false, U.r(e13.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e14) {
            c0(e14);
            m0(0);
            R();
            return true;
        }
    }

    public final void R() {
        try {
            this.f345483J.flush();
        } finally {
            p0();
        }
    }

    public final boolean S() throws MediaCryptoException {
        if (this.f345483J == null) {
            return false;
        }
        int i12 = this.f345518p0;
        if (i12 == 3 || this.f345493T || ((this.f345494U && !this.f345524s0) || (this.f345495V && this.f345522r0))) {
            n0();
            return true;
        }
        if (i12 == 2) {
            int i13 = U.f348106a;
            C36585a.d(i13 >= 23);
            if (i13 >= 23) {
                try {
                    w0();
                } catch (ExoPlaybackException e12) {
                    C36605v.a("Failed to update the DRM session, releasing the codec instead.", e12);
                    n0();
                    return true;
                }
            }
        }
        R();
        return false;
    }

    public boolean T() {
        return false;
    }

    public float U(float f12, I[] iArr) {
        return -1.0f;
    }

    public abstract ArrayList V(o oVar, I i12, boolean z12);

    @P
    public final com.google.android.exoplayer2.drm.l W(DrmSession drmSession) throws ExoPlaybackException {
        com.google.android.exoplayer2.decoder.c cVarC = drmSession.c();
        if (cVarC == null || (cVarC instanceof com.google.android.exoplayer2.drm.l)) {
            return (com.google.android.exoplayer2.drm.l) cVarC;
        }
        throw z(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + cVarC), this.f345470A, false, AuthCode.StatusCode.WAITING_CONNECT);
    }

    public abstract l.a X(m mVar, I i12, @P MediaCrypto mediaCrypto, float f12);

    /* JADX WARN: Removed duplicated region for block: B:114:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(com.google.android.exoplayer2.mediacodec.m r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.Z(com.google.android.exoplayer2.mediacodec.m, android.media.MediaCrypto):void");
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.h0
    public boolean a() {
        return this.f345532w0;
    }

    public final void a0() throws Exception {
        I i12;
        if (this.f345483J != null || this.f345509j0 || (i12 = this.f345470A) == null) {
            return;
        }
        if (this.f345476D == null && t0(i12)) {
            I i13 = this.f345470A;
            M();
            String str = i13.f343476m;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            h hVar = this.f345525t;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                hVar.getClass();
                hVar.f345594k = 32;
            } else {
                hVar.getClass();
                hVar.f345594k = 1;
            }
            this.f345509j0 = true;
            return;
        }
        r0(this.f345476D);
        String str2 = this.f345470A.f343476m;
        DrmSession drmSession = this.f345474C;
        if (drmSession != null) {
            if (this.f345478E == null) {
                com.google.android.exoplayer2.drm.l lVarW = W(drmSession);
                if (lVarW != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(lVarW.f344349a, lVarW.f344350b);
                        this.f345478E = mediaCrypto;
                        this.f345479F = !lVarW.f344351c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e12) {
                        throw z(e12, this.f345470A, false, AuthCode.StatusCode.PERMISSION_EXPIRED);
                    }
                } else if (this.f345474C.getError() == null) {
                    return;
                }
            }
            if (com.google.android.exoplayer2.drm.l.f344348d) {
                int state = this.f345474C.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException error = this.f345474C.getError();
                    error.getClass();
                    throw z(error, this.f345470A, false, error.f344327b);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            b0(this.f345478E, this.f345479F);
        } catch (DecoderInitializationException e13) {
            throw z(e13, this.f345470A, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(android.media.MediaCrypto r12, boolean r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.b0(android.media.MediaCrypto, boolean):void");
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.i0
    public final int f() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r13 != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    @j.InterfaceC42153i
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.decoder.h f0(com.google.android.exoplayer2.J r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.f0(com.google.android.exoplayer2.J):com.google.android.exoplayer2.decoder.h");
    }

    @InterfaceC42153i
    public void h0(long j12) {
        while (true) {
            int i12 = this.f345477D0;
            if (i12 == 0) {
                return;
            }
            long[] jArr = this.f345537z;
            if (j12 < jArr[0]) {
                return;
            }
            long[] jArr2 = this.f345533x;
            this.f345473B0 = jArr2[0];
            long[] jArr3 = this.f345535y;
            this.f345475C0 = jArr3[0];
            int i13 = i12 - 1;
            this.f345477D0 = i13;
            System.arraycopy(jArr2, 1, jArr2, 0, i13);
            System.arraycopy(jArr3, 1, jArr3, 0, this.f345477D0);
            System.arraycopy(jArr, 1, jArr, 0, this.f345477D0);
            i0();
        }
    }

    @TargetApi(23)
    public final void k0() throws Exception {
        int i12 = this.f345518p0;
        if (i12 == 1) {
            R();
            return;
        }
        if (i12 == 2) {
            R();
            w0();
        } else if (i12 != 3) {
            this.f345532w0 = true;
            o0();
        } else {
            n0();
            a0();
        }
    }

    public abstract boolean l0(long j12, long j13, @P l lVar, @P ByteBuffer byteBuffer, int i12, int i13, int i14, long j14, boolean z12, boolean z13, I i15);

    public final boolean m0(int i12) throws Exception {
        J j12 = this.f345397c;
        j12.a();
        DecoderInputBuffer decoderInputBuffer = this.f345519q;
        decoderInputBuffer.h();
        int I12 = I(j12, decoderInputBuffer, i12 | 4);
        if (I12 == -5) {
            f0(j12);
            return true;
        }
        if (I12 != -4 || !decoderInputBuffer.f(4)) {
            return false;
        }
        this.f345530v0 = true;
        k0();
        return false;
    }

    @Override // com.google.android.exoplayer2.h0
    public boolean n() {
        return this.f345470A != null && (A() || this.f345505f0 >= 0 || (this.f345503d0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f345503d0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0() {
        try {
            l lVar = this.f345483J;
            if (lVar != null) {
                lVar.release();
                this.f345471A0.f344224b++;
                e0(this.f345490Q.f345608a);
            }
            this.f345483J = null;
            try {
                MediaCrypto mediaCrypto = this.f345478E;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f345483J = null;
            try {
                MediaCrypto mediaCrypto2 = this.f345478E;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.h0
    public final void o(long j12, long j13) throws Exception {
        boolean z12 = false;
        if (this.f345536y0) {
            this.f345536y0 = false;
            k0();
        }
        ExoPlaybackException exoPlaybackException = this.f345538z0;
        if (exoPlaybackException != null) {
            this.f345538z0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f345532w0) {
                o0();
                return;
            }
            if (this.f345470A != null || m0(2)) {
                a0();
                if (this.f345509j0) {
                    com.google.android.exoplayer2.util.P.a("bypassRender");
                    while (J(j12, j13)) {
                    }
                    com.google.android.exoplayer2.util.P.b();
                } else if (this.f345483J != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    com.google.android.exoplayer2.util.P.a("drainAndFeed");
                    while (P(j12, j13)) {
                        long j14 = this.f345480G;
                        if (!(j14 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j14)) {
                            break;
                        }
                    }
                    while (Q()) {
                        long j15 = this.f345480G;
                        if (!(j15 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j15)) {
                            break;
                        }
                    }
                    com.google.android.exoplayer2.util.P.b();
                } else {
                    com.google.android.exoplayer2.decoder.f fVar = this.f345471A0;
                    int i12 = fVar.f344226d;
                    M m12 = this.f345402h;
                    m12.getClass();
                    fVar.f344226d = i12 + m12.b(j12 - this.f345404j);
                    m0(1);
                }
                synchronized (this.f345471A0) {
                }
            }
        } catch (IllegalStateException e12) {
            int i13 = U.f348106a;
            if (i13 < 21 || !(e12 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e12.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e12;
                }
            }
            c0(e12);
            if (i13 >= 21) {
                if (e12 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e12).isRecoverable() : false) {
                    z12 = true;
                }
            }
            if (z12) {
                n0();
            }
            throw z(L(e12, this.f345490Q), this.f345470A, z12, 4003);
        }
    }

    @InterfaceC42153i
    public void p0() {
        this.f345504e0 = -1;
        this.f345521r.f344205d = null;
        this.f345505f0 = -1;
        this.f345506g0 = null;
        this.f345503d0 = -9223372036854775807L;
        this.f345522r0 = false;
        this.f345520q0 = false;
        this.f345499Z = false;
        this.f345500a0 = false;
        this.f345507h0 = false;
        this.f345508i0 = false;
        this.f345529v.clear();
        this.f345526t0 = -9223372036854775807L;
        this.f345528u0 = -9223372036854775807L;
        i iVar = this.f345502c0;
        if (iVar != null) {
            iVar.f345595a = 0L;
            iVar.f345596b = 0L;
            iVar.f345597c = false;
        }
        this.f345516o0 = 0;
        this.f345518p0 = 0;
        this.f345514n0 = this.f345512m0 ? 1 : 0;
    }

    @InterfaceC42153i
    public final void q0() {
        p0();
        this.f345538z0 = null;
        this.f345502c0 = null;
        this.f345488O = null;
        this.f345490Q = null;
        this.f345484K = null;
        this.f345485L = null;
        this.f345486M = false;
        this.f345524s0 = false;
        this.f345487N = -1.0f;
        this.f345491R = 0;
        this.f345492S = false;
        this.f345493T = false;
        this.f345494U = false;
        this.f345495V = false;
        this.f345496W = false;
        this.f345497X = false;
        this.f345498Y = false;
        this.f345501b0 = false;
        this.f345512m0 = false;
        this.f345514n0 = 0;
        this.f345479F = false;
    }

    public final void r0(@P DrmSession drmSession) {
        DrmSession.g(this.f345474C, drmSession);
        this.f345474C = drmSession;
    }

    public boolean s0(m mVar) {
        return true;
    }

    public boolean t0(I i12) {
        return false;
    }

    public abstract int u0(o oVar, I i12);

    public final boolean v0(I i12) throws Exception {
        if (U.f348106a >= 23 && this.f345483J != null && this.f345518p0 != 3 && this.f345401g != 0) {
            float f12 = this.f345482I;
            I[] iArr = this.f345403i;
            iArr.getClass();
            float fU2 = U(f12, iArr);
            float f13 = this.f345487N;
            if (f13 == fU2) {
                return true;
            }
            if (fU2 == -1.0f) {
                if (this.f345520q0) {
                    this.f345516o0 = 1;
                    this.f345518p0 = 3;
                    return false;
                }
                n0();
                a0();
                return false;
            }
            if (f13 == -1.0f && fU2 <= this.f345517p) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fU2);
            this.f345483J.setParameters(bundle);
            this.f345487N = fU2;
        }
        return true;
    }

    @X
    public final void w0() throws ExoPlaybackException, MediaCryptoException {
        try {
            this.f345478E.setMediaDrmSession(W(this.f345476D).f344350b);
            r0(this.f345476D);
            this.f345516o0 = 0;
            this.f345518p0 = 0;
        } catch (MediaCryptoException e12) {
            throw z(e12, this.f345470A, false, AuthCode.StatusCode.PERMISSION_EXPIRED);
        }
    }

    @Override // com.google.android.exoplayer2.h0
    public void x(float f12, float f13) throws Exception {
        this.f345481H = f12;
        this.f345482I = f13;
        v0(this.f345484K);
    }

    public final void x0(long j12) {
        I iD2;
        I iE2;
        N<I> n12 = this.f345527u;
        synchronized (n12) {
            iD2 = n12.d(j12, true);
        }
        I i12 = iD2;
        if (i12 == null && this.f345486M) {
            N<I> n13 = this.f345527u;
            synchronized (n13) {
                iE2 = n13.f348098d == 0 ? null : n13.e();
            }
            i12 = iE2;
        }
        if (i12 != null) {
            this.f345472B = i12;
        } else if (!this.f345486M || this.f345472B == null) {
            return;
        }
        g0(this.f345472B, this.f345485L);
        this.f345486M = false;
    }

    @Override // com.google.android.exoplayer2.i0
    public final int y(I i12) throws ExoPlaybackException {
        try {
            return u0(this.f345515o, i12);
        } catch (MediaCodecUtil.DecoderQueryException e12) {
            throw z(e12, i12, false, 4002);
        }
    }

    public static class DecoderInitializationException extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final String f345539b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f345540c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final m f345541d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public final String f345542e;

        public DecoderInitializationException(I i12, @P MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z12, int i13) {
            this("Decoder init failed: [" + i13 + "], " + i12, decoderQueryException, i12.f343476m, z12, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i13 < 0 ? "neg_" : "") + Math.abs(i13));
        }

        public DecoderInitializationException(String str, @P Throwable th2, String str2, boolean z12, @P m mVar, @P String str3) {
            super(str, th2);
            this.f345539b = str2;
            this.f345540c = z12;
            this.f345541d = mVar;
            this.f345542e = str3;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public void F() {
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public void G() {
    }

    public void i0() {
    }

    public void o0() {
    }

    public void Y(DecoderInputBuffer decoderInputBuffer) {
    }

    public void c0(Exception exc) {
    }

    public void e0(String str) {
    }

    public void j0(DecoderInputBuffer decoderInputBuffer) {
    }

    public void g0(I i12, @P MediaFormat mediaFormat) {
    }

    public void d0(long j12, long j13, String str) {
    }
}
