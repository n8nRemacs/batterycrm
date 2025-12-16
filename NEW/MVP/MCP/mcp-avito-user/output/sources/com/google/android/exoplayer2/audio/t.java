package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.search.filter.RunnableC34589p;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.h0;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.l;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import j.P;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: MediaCodecAudioRenderer.java */
/* loaded from: classes6.dex */
public class t extends MediaCodecRenderer implements com.google.android.exoplayer2.util.x {

    /* renamed from: F0, reason: collision with root package name */
    public final Context f344076F0;

    /* renamed from: G0, reason: collision with root package name */
    public final i.a f344077G0;

    /* renamed from: H0, reason: collision with root package name */
    public final DefaultAudioSink f344078H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f344079I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f344080J0;

    /* renamed from: K0, reason: collision with root package name */
    @P
    public I f344081K0;

    /* renamed from: L0, reason: collision with root package name */
    public long f344082L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f344083M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f344084N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f344085O0;

    /* renamed from: P0, reason: collision with root package name */
    @P
    public h0.c f344086P0;

    /* compiled from: MediaCodecAudioRenderer.java */
    public final class b implements AudioSink.a {
        public b(a aVar) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void a(long j12) {
            i.a aVar = t.this.f344077G0;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.f(1, j12, aVar));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void b(int i12, long j12, long j13) {
            i.a aVar = t.this.f344077G0;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.g(aVar, i12, j12, j13, 1));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void b1(Exception exc) {
            C36605v.a("Audio sink error", exc);
            i.a aVar = t.this.f344077G0;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new g(aVar, exc, 1));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void c() {
            h0.c cVar = t.this.f344086P0;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void d() {
            t.this.f344084N0 = true;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void e() {
            h0.c cVar = t.this.f344086P0;
            if (cVar != null) {
                cVar.b();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void onSkipSilenceEnabledChanged(boolean z12) {
            i.a aVar = t.this.f344077G0;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new D.b(13, aVar, z12));
            }
        }
    }

    public t(Context context, l.b bVar, com.google.android.exoplayer2.mediacodec.o oVar, @P Handler handler, @P i iVar, DefaultAudioSink defaultAudioSink) {
        super(1, bVar, oVar, 44100.0f);
        this.f344076F0 = context.getApplicationContext();
        this.f344078H0 = defaultAudioSink;
        this.f344077G0 = new i.a(handler, iVar);
        defaultAudioSink.f343911r = new b(null);
    }

    public static AbstractC37401r1 z0(com.google.android.exoplayer2.mediacodec.o oVar, I i12, boolean z12, DefaultAudioSink defaultAudioSink) {
        String str = i12.f343476m;
        if (str == null) {
            return AbstractC37401r1.C();
        }
        if (defaultAudioSink.i(i12) != 0) {
            List<com.google.android.exoplayer2.mediacodec.m> listE = MediaCodecUtil.e("audio/raw", false, false);
            com.google.android.exoplayer2.mediacodec.m mVar = listE.isEmpty() ? null : listE.get(0);
            if (mVar != null) {
                return AbstractC37401r1.E(mVar);
            }
        }
        oVar.getClass();
        List<com.google.android.exoplayer2.mediacodec.m> listE2 = MediaCodecUtil.e(str, z12, false);
        String strB = MediaCodecUtil.b(i12);
        if (strB == null) {
            return AbstractC37401r1.v(listE2);
        }
        List<com.google.android.exoplayer2.mediacodec.m> listE3 = MediaCodecUtil.e(strB, z12, false);
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        aVar.e(listE2);
        aVar.e(listE3);
        return aVar.i();
    }

    public final void A0() {
        long jH2 = this.f344078H0.h(a());
        if (jH2 != Long.MIN_VALUE) {
            if (!this.f344084N0) {
                jH2 = Math.max(this.f344082L0, jH2);
            }
            this.f344082L0 = jH2;
            this.f344084N0 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void B() {
        i.a aVar = this.f344077G0;
        this.f344085O0 = true;
        try {
            this.f344078H0.f();
            try {
                super.B();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.B();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void C(boolean z12, boolean z13) throws IllegalStateException {
        super.C(z12, z13);
        com.google.android.exoplayer2.decoder.f fVar = this.f345471A0;
        i.a aVar = this.f344077G0;
        Handler handler = aVar.f343996a;
        if (handler != null) {
            handler.post(new h(aVar, fVar, 0));
        }
        j0 j0Var = this.f345398d;
        j0Var.getClass();
        boolean z14 = j0Var.f345445a;
        DefaultAudioSink defaultAudioSink = this.f344078H0;
        if (z14) {
            defaultAudioSink.e();
        } else {
            defaultAudioSink.c();
        }
        com.google.android.exoplayer2.analytics.p pVar = this.f345400f;
        pVar.getClass();
        defaultAudioSink.f343910q = pVar;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void D(long j12, boolean z12) throws Exception {
        super.D(j12, z12);
        this.f344078H0.f();
        this.f344082L0 = j12;
        this.f344083M0 = true;
        this.f344084N0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void E() throws IllegalStateException {
        DefaultAudioSink defaultAudioSink = this.f344078H0;
        try {
            super.E();
        } finally {
            if (this.f344085O0) {
                this.f344085O0 = false;
                defaultAudioSink.y();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void F() throws IllegalStateException {
        this.f344078H0.u();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f
    public final void G() throws IllegalStateException {
        A0();
        this.f344078H0.t();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final com.google.android.exoplayer2.decoder.h K(com.google.android.exoplayer2.mediacodec.m mVar, I i12, I i13) {
        com.google.android.exoplayer2.decoder.h hVarB = mVar.b(i12, i13);
        int iY02 = y0(mVar, i13);
        int i14 = this.f344079I0;
        int i15 = hVarB.f344241e;
        if (iY02 > i14) {
            i15 |= 64;
        }
        int i16 = i15;
        return new com.google.android.exoplayer2.decoder.h(mVar.f345608a, i12, i13, i16 != 0 ? 0 : hVarB.f344240d, i16);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float U(float f12, I[] iArr) {
        int iMax = -1;
        for (I i12 : iArr) {
            int i13 = i12.f343458A;
            if (i13 != -1) {
                iMax = Math.max(iMax, i13);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f12 * iMax;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final ArrayList V(com.google.android.exoplayer2.mediacodec.o oVar, I i12, boolean z12) {
        AbstractC37401r1 abstractC37401r1Z0 = z0(oVar, i12, z12, this.f344078H0);
        Pattern pattern = MediaCodecUtil.f345543a;
        ArrayList arrayList = new ArrayList(abstractC37401r1Z0);
        Collections.sort(arrayList, new com.google.android.exoplayer2.mediacodec.q(new com.google.android.exoplayer2.mediacodec.p(i12)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.mediacodec.l.a X(com.google.android.exoplayer2.mediacodec.m r12, com.google.android.exoplayer2.I r13, @j.P android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.t.X(com.google.android.exoplayer2.mediacodec.m, com.google.android.exoplayer2.I, android.media.MediaCrypto, float):com.google.android.exoplayer2.mediacodec.l$a");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.h0
    public final boolean a() {
        return this.f345532w0 && this.f344078H0.r();
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.e0.b
    public final void b(int i12, @P Object obj) throws IllegalStateException {
        DefaultAudioSink defaultAudioSink = this.f344078H0;
        if (i12 == 2) {
            defaultAudioSink.G(((Float) obj).floatValue());
        }
        if (i12 == 3) {
            defaultAudioSink.z((C36506d) obj);
            return;
        }
        if (i12 == 6) {
            defaultAudioSink.D((l) obj);
            return;
        }
        switch (i12) {
            case 9:
                defaultAudioSink.F(((Boolean) obj).booleanValue());
                break;
            case 10:
                defaultAudioSink.B(((Integer) obj).intValue());
                break;
            case 11:
                this.f344086P0 = (h0.c) obj;
                break;
        }
    }

    @Override // com.google.android.exoplayer2.util.x
    public final long c() {
        if (this.f345401g == 2) {
            A0();
        }
        return this.f344082L0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void c0(Exception exc) {
        C36605v.a("Audio codec error", exc);
        i.a aVar = this.f344077G0;
        Handler handler = aVar.f343996a;
        if (handler != null) {
            handler.post(new g(aVar, exc, 0));
        }
    }

    @Override // com.google.android.exoplayer2.util.x
    public final void d(c0 c0Var) {
        this.f344078H0.E(c0Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void d0(long j12, long j13, String str) {
        i.a aVar = this.f344077G0;
        Handler handler = aVar.f343996a;
        if (handler != null) {
            handler.post(new androidx.media3.exoplayer.audio.e(aVar, str, j12, j13, 2));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void e0(String str) {
        i.a aVar = this.f344077G0;
        Handler handler = aVar.f343996a;
        if (handler != null) {
            handler.post(new RunnableC34589p(23, aVar, str));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @P
    public final com.google.android.exoplayer2.decoder.h f0(J j12) throws Exception {
        com.google.android.exoplayer2.decoder.h hVarF0 = super.f0(j12);
        I i12 = j12.f343521b;
        i.a aVar = this.f344077G0;
        Handler handler = aVar.f343996a;
        if (handler != null) {
            handler.post(new com.avito.konveyor.item_visibility_tracker.c(aVar, i12, hVarF0, 1));
        }
        return hVarF0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void g0(I i12, @P MediaFormat mediaFormat) throws ExoPlaybackException {
        int i13;
        I i14 = this.f344081K0;
        int[] iArr = null;
        if (i14 != null) {
            i12 = i14;
        } else if (this.f345483J != null) {
            int iV2 = "audio/raw".equals(i12.f343476m) ? i12.f343459B : (U.f348106a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? U.v(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            I.b bVar = new I.b();
            bVar.f343504k = "audio/raw";
            bVar.f343519z = iV2;
            bVar.f343490A = i12.f343460C;
            bVar.f343491B = i12.f343461D;
            bVar.f343517x = mediaFormat.getInteger("channel-count");
            bVar.f343518y = mediaFormat.getInteger("sample-rate");
            I iA2 = bVar.a();
            if (this.f344080J0 && iA2.f343489z == 6 && (i13 = i12.f343489z) < 6) {
                iArr = new int[i13];
                for (int i15 = 0; i15 < i13; i15++) {
                    iArr[i15] = i15;
                }
            }
            i12 = iA2;
        }
        try {
            this.f344078H0.b(i12, iArr);
        } catch (AudioSink.ConfigurationException e12) {
            throw z(e12, e12.f343852b, false, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.h0, com.google.android.exoplayer2.i0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.util.x
    public final c0 getPlaybackParameters() {
        return this.f344078H0.k();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void i0() {
        this.f344078H0.f343872G = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void j0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f344083M0 || decoderInputBuffer.f(BeduinInputModel.MIN_TEXT_VERSION)) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f344207f - this.f344082L0) > 500000) {
            this.f344082L0 = decoderInputBuffer.f344207f;
        }
        this.f344083M0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean l0(long j12, long j13, @P com.google.android.exoplayer2.mediacodec.l lVar, @P ByteBuffer byteBuffer, int i12, int i13, int i14, long j14, boolean z12, boolean z13, I i15) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.f344081K0 != null && (i13 & 2) != 0) {
            lVar.getClass();
            lVar.releaseOutputBuffer(i12, false);
            return true;
        }
        DefaultAudioSink defaultAudioSink = this.f344078H0;
        if (z12) {
            if (lVar != null) {
                lVar.releaseOutputBuffer(i12, false);
            }
            this.f345471A0.f344228f += i14;
            defaultAudioSink.f343872G = true;
            return true;
        }
        try {
            if (!defaultAudioSink.n(byteBuffer, j14, i14)) {
                return false;
            }
            if (lVar != null) {
                lVar.releaseOutputBuffer(i12, false);
            }
            this.f345471A0.f344227e += i14;
            return true;
        } catch (AudioSink.InitializationException e12) {
            throw z(e12, e12.f343855d, e12.f343854c, 5001);
        } catch (AudioSink.WriteException e13) {
            throw z(e13, i15, e13.f343857c, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.h0
    public final boolean n() {
        return this.f344078H0.o() || super.n();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void o0() throws IllegalStateException, ExoPlaybackException {
        try {
            this.f344078H0.w();
        } catch (AudioSink.WriteException e12) {
            throw z(e12, e12.f343858d, e12.f343857c, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean t0(I i12) {
        return this.f344078H0.i(i12) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u0(com.google.android.exoplayer2.mediacodec.o r12, com.google.android.exoplayer2.I r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.t.u0(com.google.android.exoplayer2.mediacodec.o, com.google.android.exoplayer2.I):int");
    }

    public final int y0(com.google.android.exoplayer2.mediacodec.m mVar, I i12) {
        int i13;
        if (!"OMX.google.raw.decoder".equals(mVar.f345608a) || (i13 = U.f348106a) >= 24 || (i13 == 23 && U.G(this.f344076F0))) {
            return i12.f343477n;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.h0
    @P
    public final com.google.android.exoplayer2.util.x w() {
        return this;
    }
}
