package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.avito.android.search.filter.RunnableC34589p;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.l;
import com.google.android.exoplayer2.mediacodec.q;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.util.y;
import com.google.android.exoplayer2.util.z;
import com.google.android.exoplayer2.video.k;
import com.google.android.exoplayer2.video.n;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.InterfaceC42153i;
import j.P;
import j.X;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: classes6.dex */
public class g extends MediaCodecRenderer {

    /* renamed from: o1, reason: collision with root package name */
    public static final int[] f348229o1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: p1, reason: collision with root package name */
    public static boolean f348230p1;

    /* renamed from: q1, reason: collision with root package name */
    public static boolean f348231q1;

    /* renamed from: F0, reason: collision with root package name */
    public final Context f348232F0;

    /* renamed from: G0, reason: collision with root package name */
    public final k f348233G0;

    /* renamed from: H0, reason: collision with root package name */
    public final n.a f348234H0;

    /* renamed from: I0, reason: collision with root package name */
    public final long f348235I0;

    /* renamed from: J0, reason: collision with root package name */
    public final int f348236J0;

    /* renamed from: K0, reason: collision with root package name */
    public final boolean f348237K0;

    /* renamed from: L0, reason: collision with root package name */
    public a f348238L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f348239M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f348240N0;

    /* renamed from: O0, reason: collision with root package name */
    @P
    public Surface f348241O0;

    /* renamed from: P0, reason: collision with root package name */
    @P
    public PlaceholderSurface f348242P0;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f348243Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f348244R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f348245S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f348246T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f348247U0;

    /* renamed from: V0, reason: collision with root package name */
    public long f348248V0;

    /* renamed from: W0, reason: collision with root package name */
    public long f348249W0;

    /* renamed from: X0, reason: collision with root package name */
    public long f348250X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f348251Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f348252Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f348253a1;

    /* renamed from: b1, reason: collision with root package name */
    public long f348254b1;

    /* renamed from: c1, reason: collision with root package name */
    public long f348255c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f348256d1;

    /* renamed from: e1, reason: collision with root package name */
    public int f348257e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f348258f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f348259g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f348260h1;

    /* renamed from: i1, reason: collision with root package name */
    public float f348261i1;

    /* renamed from: j1, reason: collision with root package name */
    @P
    public o f348262j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f348263k1;

    /* renamed from: l1, reason: collision with root package name */
    public int f348264l1;

    /* renamed from: m1, reason: collision with root package name */
    @P
    public b f348265m1;

    /* renamed from: n1, reason: collision with root package name */
    @P
    public j f348266n1;

    /* compiled from: MediaCodecVideoRenderer.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f348267a;

        /* renamed from: b, reason: collision with root package name */
        public final int f348268b;

        /* renamed from: c, reason: collision with root package name */
        public final int f348269c;

        public a(int i12, int i13, int i14) {
            this.f348267a = i12;
            this.f348268b = i13;
            this.f348269c = i14;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    @X
    public final class b implements l.c, Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f348270b;

        public b(com.google.android.exoplayer2.mediacodec.l lVar) {
            Handler handlerN = U.n(this);
            this.f348270b = handlerN;
            lVar.g(this, handlerN);
        }

        @Override // com.google.android.exoplayer2.mediacodec.l.c
        public final void a(long j12) {
            if (U.f348106a < 30) {
                Handler handler = this.f348270b;
                handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j12 >> 32), (int) j12));
                return;
            }
            g gVar = g.this;
            if (this != gVar.f348265m1) {
                return;
            }
            if (j12 == Long.MAX_VALUE) {
                gVar.f345536y0 = true;
                return;
            }
            try {
                gVar.x0(j12);
                gVar.E0();
                gVar.f345471A0.f344227e++;
                gVar.D0();
                gVar.h0(j12);
            } catch (ExoPlaybackException e12) {
                gVar.f345538z0 = e12;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            int i14 = U.f348106a;
            long j12 = ((i12 & 4294967295L) << 32) | (4294967295L & i13);
            g gVar = g.this;
            if (this == gVar.f348265m1) {
                if (j12 == Long.MAX_VALUE) {
                    gVar.f345536y0 = true;
                } else {
                    try {
                        gVar.x0(j12);
                        gVar.E0();
                        gVar.f345471A0.f344227e++;
                        gVar.D0();
                        gVar.h0(j12);
                    } catch (ExoPlaybackException e12) {
                        gVar.f345538z0 = e12;
                    }
                }
            }
            return true;
        }
    }

    public g(Context context, l.b bVar, com.google.android.exoplayer2.mediacodec.o oVar, long j12, @P Handler handler, @P n nVar) {
        super(2, bVar, oVar, 30.0f);
        this.f348235I0 = j12;
        this.f348236J0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f348232F0 = applicationContext;
        this.f348233G0 = new k(applicationContext);
        this.f348234H0 = new n.a(handler, nVar);
        this.f348237K0 = "NVIDIA".equals(U.f348108c);
        this.f348249W0 = -9223372036854775807L;
        this.f348258f1 = -1;
        this.f348259g1 = -1;
        this.f348261i1 = -1.0f;
        this.f348244R0 = 1;
        this.f348264l1 = 0;
        this.f348262j1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0(com.google.android.exoplayer2.mediacodec.m r11, com.google.android.exoplayer2.I r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.g.A0(com.google.android.exoplayer2.mediacodec.m, com.google.android.exoplayer2.I):int");
    }

    public static AbstractC37401r1 B0(com.google.android.exoplayer2.mediacodec.o oVar, I i12, boolean z12, boolean z13) {
        String str = i12.f343476m;
        if (str == null) {
            return AbstractC37401r1.C();
        }
        oVar.getClass();
        List<com.google.android.exoplayer2.mediacodec.m> listE = MediaCodecUtil.e(str, z12, z13);
        String strB = MediaCodecUtil.b(i12);
        if (strB == null) {
            return AbstractC37401r1.v(listE);
        }
        List<com.google.android.exoplayer2.mediacodec.m> listE2 = MediaCodecUtil.e(strB, z12, z13);
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        aVar.e(listE);
        aVar.e(listE2);
        return aVar.i();
    }

    public static int C0(com.google.android.exoplayer2.mediacodec.m mVar, I i12) {
        if (i12.f343477n == -1) {
            return A0(mVar, i12);
        }
        List<byte[]> list = i12.f343478o;
        int size = list.size();
        int length = 0;
        for (int i13 = 0; i13 < size; i13++) {
            length += list.get(i13).length;
        }
        return i12.f343477n + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0845  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean z0(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 3090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.g.z0(java.lang.String):boolean");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void B() {
        n.a aVar = this.f348234H0;
        this.f348262j1 = null;
        y0();
        this.f348243Q0 = false;
        this.f348265m1 = null;
        try {
            super.B();
            com.google.android.exoplayer2.decoder.f fVar = this.f345471A0;
            aVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = aVar.f348318a;
            if (handler != null) {
                handler.post(new m(aVar, fVar, 0));
            }
        } catch (Throwable th2) {
            com.google.android.exoplayer2.decoder.f fVar2 = this.f345471A0;
            aVar.getClass();
            synchronized (fVar2) {
                Handler handler2 = aVar.f348318a;
                if (handler2 != null) {
                    handler2.post(new m(aVar, fVar2, 0));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void C(boolean z12, boolean z13) {
        super.C(z12, z13);
        j0 j0Var = this.f345398d;
        j0Var.getClass();
        boolean z14 = j0Var.f345445a;
        C36585a.d((z14 && this.f348264l1 == 0) ? false : true);
        if (this.f348263k1 != z14) {
            this.f348263k1 = z14;
            n0();
        }
        com.google.android.exoplayer2.decoder.f fVar = this.f345471A0;
        n.a aVar = this.f348234H0;
        Handler handler = aVar.f348318a;
        if (handler != null) {
            handler.post(new m(aVar, fVar, 1));
        }
        this.f348246T0 = z13;
        this.f348247U0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void D(long j12, boolean z12) throws Exception {
        super.D(j12, z12);
        y0();
        k kVar = this.f348233G0;
        kVar.f348298m = 0L;
        kVar.f348301p = -1L;
        kVar.f348299n = -1L;
        this.f348254b1 = -9223372036854775807L;
        this.f348248V0 = -9223372036854775807L;
        this.f348252Z0 = 0;
        if (!z12) {
            this.f348249W0 = -9223372036854775807L;
        } else {
            long j13 = this.f348235I0;
            this.f348249W0 = j13 > 0 ? SystemClock.elapsedRealtime() + j13 : -9223372036854775807L;
        }
    }

    public final void D0() {
        this.f348247U0 = true;
        if (this.f348245S0) {
            return;
        }
        this.f348245S0 = true;
        Surface surface = this.f348241O0;
        n.a aVar = this.f348234H0;
        Handler handler = aVar.f348318a;
        if (handler != null) {
            handler.post(new androidx.media3.exoplayer.video.j(2, aVar, SystemClock.elapsedRealtime(), surface));
        }
        this.f348243Q0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    @TargetApi(17)
    public final void E() {
        try {
            super.E();
            PlaceholderSurface placeholderSurface = this.f348242P0;
            if (placeholderSurface != null) {
                if (this.f348241O0 == placeholderSurface) {
                    this.f348241O0 = null;
                }
                placeholderSurface.release();
                this.f348242P0 = null;
            }
        } catch (Throwable th2) {
            if (this.f348242P0 != null) {
                Surface surface = this.f348241O0;
                PlaceholderSurface placeholderSurface2 = this.f348242P0;
                if (surface == placeholderSurface2) {
                    this.f348241O0 = null;
                }
                placeholderSurface2.release();
                this.f348242P0 = null;
            }
            throw th2;
        }
    }

    public final void E0() {
        int i12 = this.f348258f1;
        if (i12 == -1 && this.f348259g1 == -1) {
            return;
        }
        o oVar = this.f348262j1;
        if (oVar != null && oVar.f348321b == i12 && oVar.f348322c == this.f348259g1 && oVar.f348323d == this.f348260h1 && oVar.f348324e == this.f348261i1) {
            return;
        }
        o oVar2 = new o(i12, this.f348259g1, this.f348260h1, this.f348261i1);
        this.f348262j1 = oVar2;
        n.a aVar = this.f348234H0;
        Handler handler = aVar.f348318a;
        if (handler != null) {
            handler.post(new RunnableC34589p(25, aVar, oVar2));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void F() {
        this.f348251Y0 = 0;
        this.f348250X0 = SystemClock.elapsedRealtime();
        this.f348255c1 = SystemClock.elapsedRealtime() * 1000;
        this.f348256d1 = 0L;
        this.f348257e1 = 0;
        k kVar = this.f348233G0;
        kVar.f348289d = true;
        kVar.f348298m = 0L;
        kVar.f348301p = -1L;
        kVar.f348299n = -1L;
        k.b bVar = kVar.f348287b;
        if (bVar != null) {
            k.e eVar = kVar.f348288c;
            eVar.getClass();
            eVar.f348308c.sendEmptyMessage(1);
            bVar.b(new com.avito.android.str_seller_orders.orders_seller.d(kVar, 24));
        }
        kVar.c(false);
    }

    public final void F0(com.google.android.exoplayer2.mediacodec.l lVar, int i12) {
        E0();
        com.google.android.exoplayer2.util.P.a("releaseOutputBuffer");
        lVar.releaseOutputBuffer(i12, true);
        com.google.android.exoplayer2.util.P.b();
        this.f348255c1 = SystemClock.elapsedRealtime() * 1000;
        this.f345471A0.f344227e++;
        this.f348252Z0 = 0;
        D0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void G() {
        this.f348249W0 = -9223372036854775807L;
        int i12 = this.f348251Y0;
        n.a aVar = this.f348234H0;
        if (i12 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = jElapsedRealtime - this.f348250X0;
            int i13 = this.f348251Y0;
            Handler handler = aVar.f348318a;
            if (handler != null) {
                handler.post(new l(aVar, i13, j12));
            }
            this.f348251Y0 = 0;
            this.f348250X0 = jElapsedRealtime;
        }
        int i14 = this.f348257e1;
        if (i14 != 0) {
            long j13 = this.f348256d1;
            Handler handler2 = aVar.f348318a;
            if (handler2 != null) {
                handler2.post(new l(aVar, j13, i14));
            }
            this.f348256d1 = 0L;
            this.f348257e1 = 0;
        }
        k kVar = this.f348233G0;
        kVar.f348289d = false;
        k.b bVar = kVar.f348287b;
        if (bVar != null) {
            bVar.a();
            k.e eVar = kVar.f348288c;
            eVar.getClass();
            eVar.f348308c.sendEmptyMessage(2);
        }
        kVar.a();
    }

    @X
    public final void G0(com.google.android.exoplayer2.mediacodec.l lVar, int i12, long j12) {
        E0();
        com.google.android.exoplayer2.util.P.a("releaseOutputBuffer");
        lVar.e(i12, j12);
        com.google.android.exoplayer2.util.P.b();
        this.f348255c1 = SystemClock.elapsedRealtime() * 1000;
        this.f345471A0.f344227e++;
        this.f348252Z0 = 0;
        D0();
    }

    public final boolean H0(com.google.android.exoplayer2.mediacodec.m mVar) {
        return U.f348106a >= 23 && !this.f348263k1 && !z0(mVar.f345608a) && (!mVar.f345613f || PlaceholderSurface.b(this.f348232F0));
    }

    public final void I0(com.google.android.exoplayer2.mediacodec.l lVar, int i12) {
        com.google.android.exoplayer2.util.P.a("skipVideoBuffer");
        lVar.releaseOutputBuffer(i12, false);
        com.google.android.exoplayer2.util.P.b();
        this.f345471A0.f344228f++;
    }

    public final void J0(int i12, int i13) {
        int i14;
        com.google.android.exoplayer2.decoder.f fVar = this.f345471A0;
        fVar.f344230h += i12;
        int i15 = i12 + i13;
        fVar.f344229g += i15;
        this.f348251Y0 += i15;
        int i16 = this.f348252Z0 + i15;
        this.f348252Z0 = i16;
        fVar.f344231i = Math.max(i16, fVar.f344231i);
        int i17 = this.f348236J0;
        if (i17 <= 0 || (i14 = this.f348251Y0) < i17 || i14 <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = jElapsedRealtime - this.f348250X0;
        int i18 = this.f348251Y0;
        n.a aVar = this.f348234H0;
        Handler handler = aVar.f348318a;
        if (handler != null) {
            handler.post(new l(aVar, i18, j12));
        }
        this.f348251Y0 = 0;
        this.f348250X0 = jElapsedRealtime;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final com.google.android.exoplayer2.decoder.h K(com.google.android.exoplayer2.mediacodec.m mVar, I i12, I i13) {
        com.google.android.exoplayer2.decoder.h hVarB = mVar.b(i12, i13);
        a aVar = this.f348238L0;
        int i14 = aVar.f348267a;
        int i15 = hVarB.f344241e;
        if (i13.f343481r > i14 || i13.f343482s > aVar.f348268b) {
            i15 |= 256;
        }
        if (C0(mVar, i13) > this.f348238L0.f348269c) {
            i15 |= 64;
        }
        int i16 = i15;
        return new com.google.android.exoplayer2.decoder.h(mVar.f345608a, i12, i13, i16 != 0 ? 0 : hVarB.f344240d, i16);
    }

    public final void K0(long j12) {
        com.google.android.exoplayer2.decoder.f fVar = this.f345471A0;
        fVar.f344233k += j12;
        fVar.f344234l++;
        this.f348256d1 += j12;
        this.f348257e1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException L(IllegalStateException illegalStateException, @P com.google.android.exoplayer2.mediacodec.m mVar) {
        Surface surface = this.f348241O0;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean T() {
        return this.f348263k1 && U.f348106a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float U(float f12, I[] iArr) {
        float fMax = -1.0f;
        for (I i12 : iArr) {
            float f13 = i12.f343483t;
            if (f13 != -1.0f) {
                fMax = Math.max(fMax, f13);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f12;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final ArrayList V(com.google.android.exoplayer2.mediacodec.o oVar, I i12, boolean z12) {
        AbstractC37401r1 abstractC37401r1B0 = B0(oVar, i12, z12, this.f348263k1);
        Pattern pattern = MediaCodecUtil.f345543a;
        ArrayList arrayList = new ArrayList(abstractC37401r1B0);
        Collections.sort(arrayList, new q(new com.google.android.exoplayer2.mediacodec.p(i12)));
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    public final l.a X(com.google.android.exoplayer2.mediacodec.m mVar, I i12, @P MediaCrypto mediaCrypto, float f12) {
        com.google.android.exoplayer2.video.b bVar;
        a aVar;
        Point point;
        float f13;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        int i13;
        char c12;
        boolean z12;
        Pair<Integer, Integer> pairD;
        int iA02;
        PlaceholderSurface placeholderSurface = this.f348242P0;
        if (placeholderSurface != null && placeholderSurface.f348173b != mVar.f345613f) {
            if (this.f348241O0 == placeholderSurface) {
                this.f348241O0 = null;
            }
            placeholderSurface.release();
            this.f348242P0 = null;
        }
        String str = mVar.f345610c;
        I[] iArr = this.f345403i;
        iArr.getClass();
        int iMax = i12.f343481r;
        int iC02 = C0(mVar, i12);
        int length = iArr.length;
        float f14 = i12.f343483t;
        int i14 = i12.f343481r;
        com.google.android.exoplayer2.video.b bVar2 = i12.f343488y;
        int i15 = i12.f343482s;
        if (length == 1) {
            if (iC02 != -1 && (iA02 = A0(mVar, i12)) != -1) {
                iC02 = Math.min((int) (iC02 * 1.5f), iA02);
            }
            aVar = new a(iMax, i15, iC02);
            bVar = bVar2;
        } else {
            int length2 = iArr.length;
            int iMax2 = i15;
            int i16 = 0;
            boolean z13 = false;
            while (i16 < length2) {
                I iA2 = iArr[i16];
                I[] iArr2 = iArr;
                if (bVar2 != null && iA2.f343488y == null) {
                    I.b bVarA = iA2.a();
                    bVarA.f343516w = bVar2;
                    iA2 = bVarA.a();
                }
                if (mVar.b(i12, iA2).f344240d != 0) {
                    int i17 = iA2.f343482s;
                    i13 = length2;
                    int i18 = iA2.f343481r;
                    c12 = 65535;
                    z13 |= i18 == -1 || i17 == -1;
                    iMax = Math.max(iMax, i18);
                    iMax2 = Math.max(iMax2, i17);
                    iC02 = Math.max(iC02, C0(mVar, iA2));
                } else {
                    i13 = length2;
                    c12 = 65535;
                }
                i16++;
                iArr = iArr2;
                length2 = i13;
            }
            if (z13) {
                boolean z14 = i15 > i14;
                int i19 = z14 ? i15 : i14;
                int i22 = z14 ? i14 : i15;
                float f15 = i22 / i19;
                int[] iArr3 = f348229o1;
                bVar = bVar2;
                int i23 = 0;
                while (i23 < 9) {
                    int i24 = iArr3[i23];
                    int[] iArr4 = iArr3;
                    int i25 = (int) (i24 * f15);
                    if (i24 <= i19 || i25 <= i22) {
                        break;
                    }
                    int i26 = i19;
                    int i27 = i22;
                    if (U.f348106a >= 21) {
                        int i28 = z14 ? i25 : i24;
                        if (!z14) {
                            i24 = i25;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f345611d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f13 = f15;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f13 = f15;
                            point2 = new Point(U.g(i28, widthAlignment) * widthAlignment, U.g(i24, heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (mVar.e(point2.x, point2.y, f14)) {
                            point = point3;
                            break;
                        }
                        i23++;
                        iArr3 = iArr4;
                        i19 = i26;
                        i22 = i27;
                        f15 = f13;
                    } else {
                        f13 = f15;
                        try {
                            int iG2 = U.g(i24, 16) * 16;
                            int iG3 = U.g(i25, 16) * 16;
                            if (iG2 * iG3 <= MediaCodecUtil.i()) {
                                int i29 = z14 ? iG3 : iG2;
                                if (!z14) {
                                    iG2 = iG3;
                                }
                                point = new Point(i29, iG2);
                            } else {
                                i23++;
                                iArr3 = iArr4;
                                i19 = i26;
                                i22 = i27;
                                f15 = f13;
                            }
                        } catch (MediaCodecUtil.DecoderQueryException unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    I.b bVarA2 = i12.a();
                    bVarA2.f343509p = iMax;
                    bVarA2.f343510q = iMax2;
                    iC02 = Math.max(iC02, A0(mVar, bVarA2.a()));
                }
            } else {
                bVar = bVar2;
            }
            aVar = new a(iMax, iMax2, iC02);
        }
        this.f348238L0 = aVar;
        int i32 = this.f348263k1 ? this.f348264l1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i14);
        mediaFormat.setInteger("height", i15);
        y.b(mediaFormat, i12.f343478o);
        if (f14 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f14);
        }
        y.a(mediaFormat, "rotation-degrees", i12.f343484u);
        if (bVar != null) {
            com.google.android.exoplayer2.video.b bVar3 = bVar;
            y.a(mediaFormat, "color-transfer", bVar3.f348189d);
            y.a(mediaFormat, "color-standard", bVar3.f348187b);
            y.a(mediaFormat, "color-range", bVar3.f348188c);
            byte[] bArr = bVar3.f348190e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(i12.f343476m) && (pairD = MediaCodecUtil.d(i12)) != null) {
            y.a(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f348267a);
        mediaFormat.setInteger("max-height", aVar.f348268b);
        y.a(mediaFormat, "max-input-size", aVar.f348269c);
        if (U.f348106a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f12 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f12);
            }
        }
        if (this.f348237K0) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i32 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i32);
        }
        if (this.f348241O0 == null) {
            if (!H0(mVar)) {
                throw new IllegalStateException();
            }
            if (this.f348242P0 == null) {
                this.f348242P0 = PlaceholderSurface.c(this.f348232F0, mVar.f345613f);
            }
            this.f348241O0 = this.f348242P0;
        }
        return new l.a(mVar, mediaFormat, i12, this.f348241O0, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(AvailableCode.HMS_IS_SPOOF)
    public final void Y(DecoderInputBuffer decoderInputBuffer) {
        if (this.f348240N0) {
            ByteBuffer byteBuffer = decoderInputBuffer.f344208g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b12 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s12 = byteBuffer.getShort();
                byte b13 = byteBuffer.get();
                byte b14 = byteBuffer.get();
                byteBuffer.position(0);
                if (b12 == -75 && s5 == 60 && s12 == 1 && b13 == 4 && b14 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    com.google.android.exoplayer2.mediacodec.l lVar = this.f345483J;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    lVar.setParameters(bundle);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [android.view.Surface] */
    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.e0.b
    public final void b(int i12, @P Object obj) throws Exception {
        Handler handler;
        Handler handler2;
        int iIntValue;
        k kVar = this.f348233G0;
        if (i12 != 1) {
            if (i12 == 7) {
                this.f348266n1 = (j) obj;
                return;
            }
            if (i12 == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.f348264l1 != iIntValue2) {
                    this.f348264l1 = iIntValue2;
                    if (this.f348263k1) {
                        n0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i12 != 4) {
                if (i12 == 5 && kVar.f348295j != (iIntValue = ((Integer) obj).intValue())) {
                    kVar.f348295j = iIntValue;
                    kVar.c(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.f348244R0 = iIntValue3;
            com.google.android.exoplayer2.mediacodec.l lVar = this.f345483J;
            if (lVar != null) {
                lVar.a(iIntValue3);
                return;
            }
            return;
        }
        PlaceholderSurface placeholderSurfaceC = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurfaceC == null) {
            PlaceholderSurface placeholderSurface = this.f348242P0;
            if (placeholderSurface != null) {
                placeholderSurfaceC = placeholderSurface;
            } else {
                com.google.android.exoplayer2.mediacodec.m mVar = this.f345490Q;
                if (mVar != null && H0(mVar)) {
                    placeholderSurfaceC = PlaceholderSurface.c(this.f348232F0, mVar.f345613f);
                    this.f348242P0 = placeholderSurfaceC;
                }
            }
        }
        Surface surface = this.f348241O0;
        n.a aVar = this.f348234H0;
        if (surface == placeholderSurfaceC) {
            if (placeholderSurfaceC == null || placeholderSurfaceC == this.f348242P0) {
                return;
            }
            o oVar = this.f348262j1;
            if (oVar != null && (handler = aVar.f348318a) != null) {
                handler.post(new RunnableC34589p(25, aVar, oVar));
            }
            if (this.f348243Q0) {
                Surface surface2 = this.f348241O0;
                Handler handler3 = aVar.f348318a;
                if (handler3 != null) {
                    handler3.post(new androidx.media3.exoplayer.video.j(2, aVar, SystemClock.elapsedRealtime(), surface2));
                    return;
                }
                return;
            }
            return;
        }
        this.f348241O0 = placeholderSurfaceC;
        kVar.getClass();
        PlaceholderSurface placeholderSurface2 = placeholderSurfaceC instanceof PlaceholderSurface ? null : placeholderSurfaceC;
        if (kVar.f348290e != placeholderSurface2) {
            kVar.a();
            kVar.f348290e = placeholderSurface2;
            kVar.c(true);
        }
        this.f348243Q0 = false;
        int i13 = this.f345401g;
        com.google.android.exoplayer2.mediacodec.l lVar2 = this.f345483J;
        if (lVar2 != null) {
            if (U.f348106a < 23 || placeholderSurfaceC == null || this.f348239M0) {
                n0();
                a0();
            } else {
                lVar2.c(placeholderSurfaceC);
            }
        }
        if (placeholderSurfaceC == null || placeholderSurfaceC == this.f348242P0) {
            this.f348262j1 = null;
            y0();
            return;
        }
        o oVar2 = this.f348262j1;
        if (oVar2 != null && (handler2 = aVar.f348318a) != null) {
            handler2.post(new RunnableC34589p(25, aVar, oVar2));
        }
        y0();
        if (i13 == 2) {
            long j12 = this.f348235I0;
            this.f348249W0 = j12 > 0 ? SystemClock.elapsedRealtime() + j12 : -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void c0(Exception exc) {
        C36605v.a("Video codec error", exc);
        n.a aVar = this.f348234H0;
        Handler handler = aVar.f348318a;
        if (handler != null) {
            handler.post(new RunnableC34589p(27, aVar, exc));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void d0(long j12, long j13, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        n.a aVar = this.f348234H0;
        Handler handler = aVar.f348318a;
        if (handler != null) {
            handler.post(new androidx.media3.exoplayer.audio.e(aVar, str, j12, j13, 3));
        }
        this.f348239M0 = z0(str);
        com.google.android.exoplayer2.mediacodec.m mVar = this.f345490Q;
        mVar.getClass();
        boolean z12 = false;
        if (U.f348106a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f345609b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f345611d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i12].profile == 16384) {
                    z12 = true;
                    break;
                }
                i12++;
            }
        }
        this.f348240N0 = z12;
        if (U.f348106a < 23 || !this.f348263k1) {
            return;
        }
        com.google.android.exoplayer2.mediacodec.l lVar = this.f345483J;
        lVar.getClass();
        this.f348265m1 = new b(lVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void e0(String str) {
        n.a aVar = this.f348234H0;
        Handler handler = aVar.f348318a;
        if (handler != null) {
            handler.post(new RunnableC34589p(26, aVar, str));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @P
    public final com.google.android.exoplayer2.decoder.h f0(J j12) throws Exception {
        com.google.android.exoplayer2.decoder.h hVarF0 = super.f0(j12);
        I i12 = j12.f343521b;
        n.a aVar = this.f348234H0;
        Handler handler = aVar.f348318a;
        if (handler != null) {
            handler.post(new com.avito.konveyor.item_visibility_tracker.c(aVar, i12, hVarF0, 4));
        }
        return hVarF0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void g0(I i12, @P MediaFormat mediaFormat) {
        com.google.android.exoplayer2.mediacodec.l lVar = this.f345483J;
        if (lVar != null) {
            lVar.a(this.f348244R0);
        }
        if (this.f348263k1) {
            this.f348258f1 = i12.f343481r;
            this.f348259g1 = i12.f343482s;
        } else {
            mediaFormat.getClass();
            boolean z12 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f348258f1 = z12 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f348259g1 = z12 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f12 = i12.f343485v;
        this.f348261i1 = f12;
        int i13 = U.f348106a;
        int i14 = i12.f343484u;
        if (i13 < 21) {
            this.f348260h1 = i14;
        } else if (i14 == 90 || i14 == 270) {
            int i15 = this.f348258f1;
            this.f348258f1 = this.f348259g1;
            this.f348259g1 = i15;
            this.f348261i1 = 1.0f / f12;
        }
        float f13 = i12.f343483t;
        k kVar = this.f348233G0;
        kVar.f348291f = f13;
        e eVar = kVar.f348286a;
        eVar.f348212a.c();
        eVar.f348213b.c();
        eVar.f348214c = false;
        eVar.f348215d = -9223372036854775807L;
        eVar.f348216e = 0;
        kVar.b();
    }

    @Override // com.google.android.exoplayer2.h0, com.google.android.exoplayer2.i0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @InterfaceC42153i
    public final void h0(long j12) {
        super.h0(j12);
        if (this.f348263k1) {
            return;
        }
        this.f348253a1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void i0() {
        y0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @InterfaceC42153i
    public final void j0(DecoderInputBuffer decoderInputBuffer) {
        boolean z12 = this.f348263k1;
        if (!z12) {
            this.f348253a1++;
        }
        if (U.f348106a >= 23 || !z12) {
            return;
        }
        long j12 = decoderInputBuffer.f344207f;
        x0(j12);
        E0();
        this.f345471A0.f344227e++;
        D0();
        h0(j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0(long r28, long r30, @j.P com.google.android.exoplayer2.mediacodec.l r32, @j.P java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, com.google.android.exoplayer2.I r41) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.g.l0(long, long, com.google.android.exoplayer2.mediacodec.l, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.I):boolean");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.h0
    public final boolean n() {
        PlaceholderSurface placeholderSurface;
        if (super.n() && (this.f348245S0 || (((placeholderSurface = this.f348242P0) != null && this.f348241O0 == placeholderSurface) || this.f345483J == null || this.f348263k1))) {
            this.f348249W0 = -9223372036854775807L;
            return true;
        }
        if (this.f348249W0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f348249W0) {
            return true;
        }
        this.f348249W0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @InterfaceC42153i
    public final void p0() {
        super.p0();
        this.f348253a1 = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean s0(com.google.android.exoplayer2.mediacodec.m mVar) {
        return this.f348241O0 != null || H0(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int u0(com.google.android.exoplayer2.mediacodec.o oVar, I i12) {
        boolean z12;
        int i13 = 0;
        if (!z.m(i12.f343476m)) {
            return i0.e(0, 0, 0);
        }
        boolean z13 = i12.f343479p != null;
        AbstractC37401r1 abstractC37401r1B0 = B0(oVar, i12, z13, false);
        if (z13 && abstractC37401r1B0.isEmpty()) {
            abstractC37401r1B0 = B0(oVar, i12, false, false);
        }
        if (abstractC37401r1B0.isEmpty()) {
            return i0.e(1, 0, 0);
        }
        int i14 = i12.f343463F;
        if (i14 != 0 && i14 != 2) {
            return i0.e(2, 0, 0);
        }
        com.google.android.exoplayer2.mediacodec.m mVar = (com.google.android.exoplayer2.mediacodec.m) abstractC37401r1B0.get(0);
        boolean zC2 = mVar.c(i12);
        if (zC2) {
            z12 = true;
        } else {
            for (int i15 = 1; i15 < abstractC37401r1B0.size(); i15++) {
                com.google.android.exoplayer2.mediacodec.m mVar2 = (com.google.android.exoplayer2.mediacodec.m) abstractC37401r1B0.get(i15);
                if (mVar2.c(i12)) {
                    zC2 = true;
                    z12 = false;
                    mVar = mVar2;
                    break;
                }
            }
            z12 = true;
        }
        int i16 = zC2 ? 4 : 3;
        int i17 = mVar.d(i12) ? 16 : 8;
        int i18 = mVar.f345614g ? 64 : 0;
        int i19 = z12 ? 128 : 0;
        if (zC2) {
            AbstractC37401r1 abstractC37401r1B02 = B0(oVar, i12, z13, true);
            if (!abstractC37401r1B02.isEmpty()) {
                Pattern pattern = MediaCodecUtil.f345543a;
                ArrayList arrayList = new ArrayList(abstractC37401r1B02);
                Collections.sort(arrayList, new q(new com.google.android.exoplayer2.mediacodec.p(i12)));
                com.google.android.exoplayer2.mediacodec.m mVar3 = (com.google.android.exoplayer2.mediacodec.m) arrayList.get(0);
                if (mVar3.c(i12) && mVar3.d(i12)) {
                    i13 = 32;
                }
            }
        }
        return i16 | i17 | i13 | i18 | i19;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.h0
    public final void x(float f12, float f13) throws Exception {
        super.x(f12, f13);
        k kVar = this.f348233G0;
        kVar.f348294i = f12;
        kVar.f348298m = 0L;
        kVar.f348301p = -1L;
        kVar.f348299n = -1L;
        kVar.c(false);
    }

    public final void y0() {
        com.google.android.exoplayer2.mediacodec.l lVar;
        this.f348245S0 = false;
        if (U.f348106a < 23 || !this.f348263k1 || (lVar = this.f345483J) == null) {
            return;
        }
        this.f348265m1 = new b(lVar);
    }
}
