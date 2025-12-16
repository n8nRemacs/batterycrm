package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23092f;
import androidx.media3.common.C23108t;
import androidx.media3.common.G;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.C23139h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.I;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.audio.h;
import androidx.media3.exoplayer.c0;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.e0;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.nio.ByteBuffer;

/* compiled from: MediaCodecAudioRenderer.java */
@J
/* loaded from: classes.dex */
public class r extends MediaCodecRenderer implements I {

    /* renamed from: F0, reason: collision with root package name */
    public final Context f48970F0;

    /* renamed from: G0, reason: collision with root package name */
    public final h.a f48971G0;

    /* renamed from: H0, reason: collision with root package name */
    public final DefaultAudioSink f48972H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f48973I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f48974J0;

    /* renamed from: K0, reason: collision with root package name */
    @P
    public C23108t f48975K0;

    /* renamed from: L0, reason: collision with root package name */
    @P
    public C23108t f48976L0;

    /* renamed from: M0, reason: collision with root package name */
    public long f48977M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f48978N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f48979O0;

    /* renamed from: P0, reason: collision with root package name */
    public boolean f48980P0;

    /* renamed from: Q0, reason: collision with root package name */
    @P
    public c0.c f48981Q0;

    /* compiled from: MediaCodecAudioRenderer.java */
    @X
    public static final class b {
        @InterfaceC42164u
        public static void a(AudioSink audioSink, @P Object obj) {
            audioSink.a((AudioDeviceInfo) obj);
        }
    }

    /* compiled from: MediaCodecAudioRenderer.java */
    public final class c implements AudioSink.a {
        public c(a aVar) {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void a(long j12) {
            h.a aVar = r.this.f48971G0;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new f(0, j12, aVar));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void b(int i12, long j12, long j13) {
            h.a aVar = r.this.f48971G0;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new g(aVar, i12, j12, j13, 0));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void b1(Exception exc) {
            androidx.media3.common.util.s.d("Audio sink error", exc);
            h.a aVar = r.this.f48971G0;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new d(aVar, exc, 1));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void c() {
            c0.c cVar = r.this.f48981Q0;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void d() {
            r.this.f48979O0 = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void e() {
            c0.c cVar = r.this.f48981Q0;
            if (cVar != null) {
                cVar.b();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void f() {
            d0.f fVar;
            r rVar = r.this;
            synchronized (rVar.f49139b) {
                fVar = rVar.f49152o;
            }
            if (fVar != null) {
                fVar.a(rVar);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void onSkipSilenceEnabledChanged(boolean z12) {
            h.a aVar = r.this.f48971G0;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new D.b(1, aVar, z12));
            }
        }
    }

    public r(Context context, l.b bVar, androidx.media3.exoplayer.mediacodec.q qVar, @P Handler handler, @P h hVar, DefaultAudioSink defaultAudioSink) {
        super(1, bVar, qVar, 44100.0f);
        this.f48970F0 = context.getApplicationContext();
        this.f48972H0 = defaultAudioSink;
        this.f48971G0 = new h.a(handler, hVar);
        defaultAudioSink.f48819r = new c(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0(androidx.media3.exoplayer.mediacodec.q r14, androidx.media3.common.C23108t r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.r.A0(androidx.media3.exoplayer.mediacodec.q, androidx.media3.common.t):int");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void D() {
        h.a aVar = this.f48971G0;
        this.f48980P0 = true;
        this.f48975K0 = null;
        try {
            this.f48972H0.g();
            try {
                super.D();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.D();
                throw th2;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void E(boolean z12, boolean z13) throws IllegalStateException {
        super.E(z12, z13);
        C23138g c23138g = this.f49247A0;
        h.a aVar = this.f48971G0;
        Handler handler = aVar.f48895a;
        if (handler != null) {
            handler.post(new androidx.media3.exoplayer.audio.c(aVar, c23138g, 0));
        }
        e0 e0Var = this.f49142e;
        e0Var.getClass();
        boolean z14 = e0Var.f49154a;
        DefaultAudioSink defaultAudioSink = this.f48972H0;
        if (z14) {
            defaultAudioSink.f();
        } else {
            defaultAudioSink.d();
        }
        androidx.media3.exoplayer.analytics.w wVar = this.f49144g;
        wVar.getClass();
        defaultAudioSink.f48818q = wVar;
    }

    public final int E0(androidx.media3.exoplayer.mediacodec.n nVar, C23108t c23108t) {
        int i12;
        if (!"OMX.google.raw.decoder".equals(nVar.f49386a) || (i12 = M.f47887a) >= 24 || (i12 == 23 && M.D(this.f48970F0))) {
            return c23108t.f47758n;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void F(long j12, boolean z12) throws Exception {
        super.F(j12, z12);
        this.f48972H0.g();
        this.f48977M0 = j12;
        this.f48978N0 = true;
        this.f48979O0 = true;
    }

    public final void F0() {
        long j12 = this.f48972H0.j(a());
        if (j12 != Long.MIN_VALUE) {
            if (!this.f48979O0) {
                j12 = Math.max(this.f48977M0, j12);
            }
            this.f48977M0 = j12;
            this.f48979O0 = false;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void G() {
        b.c cVar;
        androidx.media3.exoplayer.audio.b bVar = this.f48972H0.f48825x;
        if (bVar == null || !bVar.f48870h) {
            return;
        }
        bVar.f48869g = null;
        int i12 = M.f47887a;
        Context context = bVar.f48863a;
        if (i12 >= 23 && (cVar = bVar.f48866d) != null) {
            b.C1825b.b(context, cVar);
        }
        BroadcastReceiver broadcastReceiver = bVar.f48867e;
        if (broadcastReceiver != null) {
            context.unregisterReceiver(broadcastReceiver);
        }
        b.d dVar = bVar.f48868f;
        if (dVar != null) {
            dVar.f48872a.unregisterContentObserver(dVar);
        }
        bVar.f48870h = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void H() throws IllegalStateException {
        DefaultAudioSink defaultAudioSink = this.f48972H0;
        try {
            super.H();
        } finally {
            if (this.f48980P0) {
                this.f48980P0 = false;
                defaultAudioSink.y();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void I() throws IllegalStateException {
        this.f48972H0.u();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void J() throws IllegalStateException {
        F0();
        this.f48972H0.t();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final C23139h O(androidx.media3.exoplayer.mediacodec.n nVar, C23108t c23108t, C23108t c23108t2) {
        C23139h c23139hB = nVar.b(c23108t, c23108t2);
        boolean z12 = this.f49252D == null && z0(c23108t2);
        int i12 = c23139hB.f49174e;
        if (z12) {
            i12 |= 32768;
        }
        if (E0(nVar, c23108t2) > this.f48973I0) {
            i12 |= 64;
        }
        int i13 = i12;
        return new C23139h(nVar.f49386a, c23108t, c23108t2, i13 == 0 ? c23139hB.f49173d : 0, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float X(float f12, C23108t[] c23108tArr) {
        int iMax = -1;
        for (C23108t c23108t : c23108tArr) {
            int i12 = c23108t.f47737A;
            if (i12 != -1) {
                iMax = Math.max(iMax, i12);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f12 * iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList Y(androidx.media3.exoplayer.mediacodec.q r4, androidx.media3.common.C23108t r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.f47757m
            if (r0 != 0) goto L9
            com.google.common.collect.r1 r4 = com.google.common.collect.AbstractC37401r1.C()
            goto L5c
        L9:
            androidx.media3.exoplayer.audio.DefaultAudioSink r0 = r3.f48972H0
            int r0 = r0.k(r5)
            r1 = 0
            if (r0 == 0) goto L2d
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L20
            r0 = 0
            goto L26
        L20:
            java.lang.Object r0 = r0.get(r1)
            androidx.media3.exoplayer.mediacodec.n r0 = (androidx.media3.exoplayer.mediacodec.n) r0
        L26:
            if (r0 == 0) goto L2d
            com.google.common.collect.r1 r4 = com.google.common.collect.AbstractC37401r1.E(r0)
            goto L5c
        L2d:
            java.util.regex.Pattern r0 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f49321a
            r4.getClass()
            java.lang.String r4 = r5.f47757m
            java.util.List r4 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e(r4, r6, r1)
            java.lang.String r0 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b(r5)
            if (r0 != 0) goto L43
            com.google.common.collect.r1 r6 = com.google.common.collect.AbstractC37401r1.C()
            goto L47
        L43:
            java.util.List r6 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e(r0, r6, r1)
        L47:
            com.google.common.collect.O4<java.lang.Object> r0 = com.google.common.collect.AbstractC37401r1.f359977c
            com.google.common.collect.r1$a r0 = new com.google.common.collect.r1$a
            r0.<init>()
            java.util.List r4 = (java.util.List) r4
            r0.e(r4)
            java.util.List r6 = (java.util.List) r6
            r0.e(r6)
            com.google.common.collect.r1 r4 = r0.i()
        L5c:
            java.util.regex.Pattern r6 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f49321a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            androidx.media3.exoplayer.mediacodec.r r4 = new androidx.media3.exoplayer.mediacodec.r
            r4.<init>(r5)
            androidx.media3.exoplayer.mediacodec.s r5 = new androidx.media3.exoplayer.mediacodec.s
            r5.<init>(r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.r.Y(androidx.media3.exoplayer.mediacodec.q, androidx.media3.common.t, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.exoplayer.mediacodec.l.a Z(androidx.media3.exoplayer.mediacodec.n r12, androidx.media3.common.C23108t r13, @j.P android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.r.Z(androidx.media3.exoplayer.mediacodec.n, androidx.media3.common.t, android.media.MediaCrypto, float):androidx.media3.exoplayer.mediacodec.l$a");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.c0
    public final boolean a() {
        return this.f49306w0 && this.f48972H0.r();
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.Y.b
    public final void b(int i12, @P Object obj) throws IllegalStateException {
        DefaultAudioSink defaultAudioSink = this.f48972H0;
        if (i12 == 2) {
            defaultAudioSink.F(((Float) obj).floatValue());
        }
        if (i12 == 3) {
            defaultAudioSink.z((C23091e) obj);
            return;
        }
        if (i12 == 6) {
            defaultAudioSink.C((C23092f) obj);
            return;
        }
        switch (i12) {
            case 9:
                defaultAudioSink.E(((Boolean) obj).booleanValue());
                break;
            case 10:
                defaultAudioSink.A(((Integer) obj).intValue());
                break;
            case 11:
                this.f48981Q0 = (c0.c) obj;
                break;
            case 12:
                if (M.f47887a >= 23) {
                    b.a(defaultAudioSink, obj);
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.exoplayer.I
    public final long c() {
        if (this.f49145h == 2) {
            F0();
        }
        return this.f48977M0;
    }

    @Override // androidx.media3.exoplayer.I
    public final void d(G g12) {
        this.f48972H0.D(g12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void f0(Exception exc) {
        androidx.media3.common.util.s.d("Audio codec error", exc);
        h.a aVar = this.f48971G0;
        Handler handler = aVar.f48895a;
        if (handler != null) {
            handler.post(new d(aVar, exc, 0));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void g0(long j12, long j13, String str) {
        h.a aVar = this.f48971G0;
        Handler handler = aVar.f48895a;
        if (handler != null) {
            handler.post(new e(aVar, str, j12, j13, 0));
        }
    }

    @Override // androidx.media3.exoplayer.c0, androidx.media3.exoplayer.d0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.I
    public final G getPlaybackParameters() {
        return this.f48972H0.f48771B;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void h0(String str) {
        h.a aVar = this.f48971G0;
        Handler handler = aVar.f48895a;
        if (handler != null) {
            handler.post(new J11.c(11, aVar, str, false));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @P
    public final C23139h i0(F f12) throws Exception {
        C23108t c23108t = f12.f48506b;
        c23108t.getClass();
        this.f48975K0 = c23108t;
        C23139h c23139hI0 = super.i0(f12);
        C23108t c23108t2 = this.f48975K0;
        h.a aVar = this.f48971G0;
        Handler handler = aVar.f48895a;
        if (handler != null) {
            handler.post(new Me.m(aVar, c23108t2, c23139hI0, 6));
        }
        return c23139hI0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void j0(C23108t c23108t, @P MediaFormat mediaFormat) throws ExoPlaybackException {
        int i12;
        C23108t c23108t2 = this.f48976L0;
        int[] iArr = null;
        if (c23108t2 != null) {
            c23108t = c23108t2;
        } else if (this.f49259J != null) {
            int iU2 = "audio/raw".equals(c23108t.f47757m) ? c23108t.f47738B : (M.f47887a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? M.u(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            C23108t.b bVar = new C23108t.b();
            bVar.f47787k = "audio/raw";
            bVar.f47802z = iU2;
            bVar.f47771A = c23108t.f47739C;
            bVar.f47772B = c23108t.f47740D;
            bVar.f47800x = mediaFormat.getInteger("channel-count");
            bVar.f47801y = mediaFormat.getInteger("sample-rate");
            C23108t c23108tA = bVar.a();
            if (this.f48974J0 && c23108tA.f47770z == 6 && (i12 = c23108t.f47770z) < 6) {
                iArr = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr[i13] = i13;
                }
            }
            c23108t = c23108tA;
        }
        try {
            this.f48972H0.c(c23108t, iArr);
        } catch (AudioSink.ConfigurationException e12) {
            throw B(e12, e12.f48760b, false, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void k0(long j12) {
        this.f48972H0.getClass();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void m0() {
        this.f48972H0.f48780K = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.c0
    public final boolean n() {
        return this.f48972H0.o() || super.n();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void n0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f48978N0 || decoderInputBuffer.f(BeduinInputModel.MIN_TEXT_VERSION)) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f48325f - this.f48977M0) > 500000) {
            this.f48977M0 = decoderInputBuffer.f48325f;
        }
        this.f48978N0 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean q0(long j12, long j13, @P androidx.media3.exoplayer.mediacodec.l lVar, @P ByteBuffer byteBuffer, int i12, int i13, int i14, long j14, boolean z12, boolean z13, C23108t c23108t) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.f48976L0 != null && (i13 & 2) != 0) {
            lVar.getClass();
            lVar.releaseOutputBuffer(i12, false);
            return true;
        }
        DefaultAudioSink defaultAudioSink = this.f48972H0;
        if (z12) {
            if (lVar != null) {
                lVar.releaseOutputBuffer(i12, false);
            }
            this.f49247A0.f49160f += i14;
            defaultAudioSink.f48780K = true;
            return true;
        }
        try {
            if (!defaultAudioSink.n(byteBuffer, j14, i14)) {
                return false;
            }
            if (lVar != null) {
                lVar.releaseOutputBuffer(i12, false);
            }
            this.f49247A0.f49159e += i14;
            return true;
        } catch (AudioSink.InitializationException e12) {
            throw B(e12, this.f48975K0, e12.f48762c, 5001);
        } catch (AudioSink.WriteException e13) {
            throw B(e13, c23108t, e13.f48765c, 5002);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void t0() throws IllegalStateException, ExoPlaybackException {
        try {
            this.f48972H0.w();
        } catch (AudioSink.WriteException e12) {
            throw B(e12, e12.f48766d, e12.f48765c, 5002);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean z0(C23108t c23108t) {
        return this.f48972H0.k(c23108t) != 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.c0
    @P
    public final I w() {
        return this;
    }
}
