package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.AudioSink$ConfigurationException;
import com.google.android.exoplayer2.audio.AudioSink$InitializationException;
import com.google.android.exoplayer2.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class lw8 extends sw8 implements ew8 {
    public final Context O1;
    public final xt4 P1;
    public final zj4 Q1;
    public int R1;
    public boolean S1;
    public gf6 T1;
    public long U1;
    public boolean V1;
    public boolean W1;
    public boolean X1;
    public hm5 Y1;

    public lw8(Context context, hw8 hw8Var, Handler handler, xl5 xl5Var, zj4 zj4Var) {
        super(1, hw8Var, 44100.0f);
        this.O1 = context.getApplicationContext();
        this.Q1 = zj4Var;
        this.P1 = new xt4(handler, 5, xl5Var);
        zj4Var.r = new x6i(22, this);
    }

    public static wg7 p0(uy0 uy0Var, gf6 gf6Var, boolean z, zj4 zj4Var) {
        String str = gf6Var.v0;
        if (str == null) {
            t76 t76Var = wg7.b;
            return zjd.o;
        }
        if (zj4Var.g(gf6Var) != 0) {
            List listE = cx8.e("audio/raw", false, false);
            ow8 ow8Var = listE.isEmpty() ? null : (ow8) listE.get(0);
            if (ow8Var != null) {
                return wg7.m(ow8Var);
            }
        }
        uy0Var.getClass();
        List listE2 = cx8.e(str, z, false);
        String strB = cx8.b(gf6Var);
        if (strB == null) {
            return wg7.j(listE2);
        }
        List listE3 = cx8.e(strB, z, false);
        tg7 tg7VarI = wg7.i();
        tg7VarI.d(listE2);
        tg7VarI.d(listE3);
        return tg7VarI.i();
    }

    @Override // defpackage.sw8
    public final rh4 A(ow8 ow8Var, gf6 gf6Var, gf6 gf6Var2) {
        rh4 rh4VarB = ow8Var.b(gf6Var, gf6Var2);
        int i = rh4VarB.e;
        if (o0(ow8Var, gf6Var2) > this.R1) {
            i |= 64;
        }
        int i2 = i;
        return new rh4(ow8Var.a, gf6Var, gf6Var2, i2 != 0 ? 0 : rh4VarB.d, i2);
    }

    @Override // defpackage.sw8
    public final float K(float f, gf6[] gf6VarArr) {
        int iMax = -1;
        for (gf6 gf6Var : gf6VarArr) {
            int i = gf6Var.J0;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // defpackage.sw8
    public final ArrayList L(uy0 uy0Var, gf6 gf6Var, boolean z) {
        wg7 wg7VarP0 = p0(uy0Var, gf6Var, z, this.Q1);
        Pattern pattern = cx8.a;
        ArrayList arrayList = new ArrayList(wg7VarP0);
        Collections.sort(arrayList, new dj3(7, new sl6(17, gf6Var)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    @Override // defpackage.sw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.gw8 N(defpackage.ow8 r13, defpackage.gf6 r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw8.N(ow8, gf6, android.media.MediaCrypto, float):gw8");
    }

    @Override // defpackage.sw8
    public final void S(Exception exc) {
        pai.c("MediaCodecAudioRenderer", "Audio codec error", exc);
        xt4 xt4Var = this.P1;
        Handler handler = (Handler) xt4Var.b;
        if (handler != null) {
            handler.post(new p50(xt4Var, exc, 2));
        }
    }

    @Override // defpackage.sw8
    public final void T(long j, long j2, String str) {
        xt4 xt4Var = this.P1;
        Handler handler = (Handler) xt4Var.b;
        if (handler != null) {
            handler.post(new p50(xt4Var, str, j, j2));
        }
    }

    @Override // defpackage.sw8
    public final void U(String str) {
        xt4 xt4Var = this.P1;
        Handler handler = (Handler) xt4Var.b;
        if (handler != null) {
            handler.post(new p50(xt4Var, str, 0));
        }
    }

    @Override // defpackage.sw8
    public final rh4 V(i5i i5iVar) {
        rh4 rh4VarV = super.V(i5iVar);
        gf6 gf6Var = (gf6) i5iVar.b;
        xt4 xt4Var = this.P1;
        Handler handler = (Handler) xt4Var.b;
        if (handler != null) {
            handler.post(new p50(xt4Var, gf6Var, rh4VarV));
        }
        return rh4VarV;
    }

    @Override // defpackage.sw8
    public final void W(gf6 gf6Var, MediaFormat mediaFormat) throws ExoPlaybackException {
        gf6 gf6Var2 = this.T1;
        int[] iArr = null;
        if (gf6Var2 != null) {
            gf6Var = gf6Var2;
        } else if (this.S0 != null) {
            String str = gf6Var.v0;
            int i = gf6Var.I0;
            int iT = "audio/raw".equals(str) ? gf6Var.K0 : (xxg.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? xxg.t(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            ef6 ef6Var = new ef6();
            ef6Var.k = "audio/raw";
            ef6Var.z = iT;
            ef6Var.A = gf6Var.L0;
            ef6Var.B = gf6Var.M0;
            ef6Var.x = mediaFormat.getInteger("channel-count");
            ef6Var.y = mediaFormat.getInteger("sample-rate");
            gf6Var = new gf6(ef6Var);
            if (this.S1 && gf6Var.I0 == 6 && i < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            }
        }
        try {
            this.Q1.b(gf6Var, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw d(e, e.a, false, 5001);
        }
    }

    @Override // defpackage.sw8
    public final void Y() {
        this.Q1.G = true;
    }

    @Override // defpackage.sw8
    public final void Z(oh4 oh4Var) {
        if (!this.V1 || oh4Var.j(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(oh4Var.X - this.U1) > 500000) {
            this.U1 = oh4Var.X;
        }
        this.V1 = false;
    }

    @Override // defpackage.sk0, defpackage.t4c
    public final void a(int i, Object obj) {
        zj4 zj4Var = this.Q1;
        if (i == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            if (zj4Var.J != fFloatValue) {
                zj4Var.J = fFloatValue;
                if (zj4Var.n()) {
                    if (xxg.a >= 21) {
                        zj4Var.u.setVolume(zj4Var.J);
                        return;
                    }
                    AudioTrack audioTrack = zj4Var.u;
                    float f = zj4Var.J;
                    audioTrack.setStereoVolume(f, f);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            j20 j20Var = (j20) obj;
            if (zj4Var.v.equals(j20Var)) {
                return;
            }
            zj4Var.v = j20Var;
            if (zj4Var.Y) {
                return;
            }
            zj4Var.d();
            return;
        }
        if (i == 6) {
            ic0 ic0Var = (ic0) obj;
            if (zj4Var.X.equals(ic0Var)) {
                return;
            }
            ic0Var.getClass();
            if (zj4Var.u != null) {
                zj4Var.X.getClass();
            }
            zj4Var.X = ic0Var;
            return;
        }
        switch (i) {
            case 9:
                zj4Var.s(zj4Var.h().a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                if (zj4Var.W != iIntValue) {
                    zj4Var.W = iIntValue;
                    zj4Var.V = iIntValue != 0;
                    zj4Var.d();
                    break;
                }
                break;
            case 11:
                this.Y1 = (hm5) obj;
                break;
        }
    }

    @Override // defpackage.sw8
    public final boolean b0(long j, long j2, jw8 jw8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, gf6 gf6Var) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.T1 != null && (i2 & 2) != 0) {
            jw8Var.getClass();
            jw8Var.releaseOutputBuffer(i, false);
            return true;
        }
        zj4 zj4Var = this.Q1;
        if (z) {
            if (jw8Var != null) {
                jw8Var.releaseOutputBuffer(i, false);
            }
            this.J1.g += i3;
            zj4Var.G = true;
            return true;
        }
        try {
            if (!zj4Var.k(i3, j3, byteBuffer)) {
                return false;
            }
            if (jw8Var != null) {
                jw8Var.releaseOutputBuffer(i, false);
            }
            this.J1.f += i3;
            return true;
        } catch (AudioSink$InitializationException e) {
            throw d(e, e.b, e.a, 5001);
        } catch (AudioSink$WriteException e2) {
            throw d(e2, gf6Var, e2.a, 5002);
        }
    }

    @Override // defpackage.ew8
    public final b3c c() {
        zj4 zj4Var = this.Q1;
        return zj4Var.k ? zj4Var.y : zj4Var.h().a;
    }

    @Override // defpackage.sk0
    public final ew8 e() {
        return this;
    }

    @Override // defpackage.sw8
    public final void e0() throws ExoPlaybackException {
        try {
            zj4 zj4Var = this.Q1;
            if (!zj4Var.S && zj4Var.n() && zj4Var.c()) {
                zj4Var.p();
                zj4Var.S = true;
            }
        } catch (AudioSink$WriteException e) {
            throw d(e, e.b, e.a, 5002);
        }
    }

    @Override // defpackage.sk0
    public final String f() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.sw8, defpackage.sk0
    public final boolean h() {
        if (!this.F1) {
            return false;
        }
        zj4 zj4Var = this.Q1;
        if (zj4Var.n()) {
            return zj4Var.S && !zj4Var.l();
        }
        return true;
    }

    @Override // defpackage.sw8, defpackage.sk0
    public final boolean i() {
        return this.Q1.l() || super.i();
    }

    @Override // defpackage.sk0
    public final void j() {
        xt4 xt4Var = this.P1;
        this.X1 = true;
        try {
            this.Q1.d();
            try {
                this.J0 = null;
                this.K1 = -9223372036854775807L;
                this.L1 = -9223372036854775807L;
                this.M1 = 0;
                H();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.J0 = null;
                this.K1 = -9223372036854775807L;
                this.L1 = -9223372036854775807L;
                this.M1 = 0;
                H();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.sw8
    public final boolean j0(gf6 gf6Var) {
        return this.Q1.g(gf6Var) != 0;
    }

    @Override // defpackage.sk0
    public final void k(boolean z, boolean z2) {
        nh4 nh4Var = new nh4(0);
        this.J1 = nh4Var;
        xt4 xt4Var = this.P1;
        Handler handler = (Handler) xt4Var.b;
        if (handler != null) {
            handler.post(new p50(xt4Var, nh4Var, 4));
        }
        jld jldVar = this.c;
        jldVar.getClass();
        boolean z3 = jldVar.a;
        zj4 zj4Var = this.Q1;
        if (z3) {
            zj4Var.getClass();
            fsi.d(xxg.a >= 21);
            fsi.d(zj4Var.V);
            if (!zj4Var.Y) {
                zj4Var.Y = true;
                zj4Var.d();
            }
        } else if (zj4Var.Y) {
            zj4Var.Y = false;
            zj4Var.d();
        }
        m4c m4cVar = this.o;
        m4cVar.getClass();
        zj4Var.q = m4cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if ((r5.isEmpty() ? null : (defpackage.ow8) r5.get(0)) != null) goto L30;
     */
    @Override // defpackage.sw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k0(defpackage.uy0 r14, defpackage.gf6 r15) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw8.k0(uy0, gf6):int");
    }

    @Override // defpackage.sw8, defpackage.sk0
    public final void l(long j, boolean z) {
        super.l(j, z);
        this.Q1.d();
        this.U1 = j;
        this.V1 = true;
        this.W1 = true;
    }

    @Override // defpackage.sk0
    public final void m() {
        zj4 zj4Var = this.Q1;
        try {
            try {
                C();
                d0();
                mc5 mc5Var = this.M0;
                if (mc5Var != null) {
                    mc5Var.E(null);
                }
                this.M0 = null;
            } catch (Throwable th) {
                mc5 mc5Var2 = this.M0;
                if (mc5Var2 != null) {
                    mc5Var2.E(null);
                }
                this.M0 = null;
                throw th;
            }
        } finally {
            if (this.X1) {
                this.X1 = false;
                zj4Var.r();
            }
        }
    }

    @Override // defpackage.sk0
    public final void n() throws IllegalStateException {
        zj4 zj4Var = this.Q1;
        zj4Var.U = true;
        if (zj4Var.n()) {
            l10 l10Var = zj4Var.i.f;
            l10Var.getClass();
            l10Var.a();
            zj4Var.u.play();
        }
    }

    @Override // defpackage.sk0
    public final void o() throws IllegalStateException {
        q0();
        zj4 zj4Var = this.Q1;
        zj4Var.U = false;
        if (zj4Var.n()) {
            k60 k60Var = zj4Var.i;
            k60Var.l = 0L;
            k60Var.w = 0;
            k60Var.v = 0;
            k60Var.m = 0L;
            k60Var.C = 0L;
            k60Var.F = 0L;
            k60Var.k = false;
            if (k60Var.x == -9223372036854775807L) {
                l10 l10Var = k60Var.f;
                l10Var.getClass();
                l10Var.a();
                zj4Var.u.pause();
            }
        }
    }

    public final int o0(ow8 ow8Var, gf6 gf6Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(ow8Var.a) || (i = xxg.a) >= 24 || (i == 23 && xxg.A(this.O1))) {
            return gf6Var.w0;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025d A[Catch: Exception -> 0x0278, TRY_LEAVE, TryCatch #0 {Exception -> 0x0278, blocks: (B:93:0x0238, B:95:0x025d), top: B:166:0x0238 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0() {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw8.q0():void");
    }

    @Override // defpackage.ew8
    public final long r() {
        if (this.X == 2) {
            q0();
        }
        return this.U1;
    }

    @Override // defpackage.ew8
    public final void s(b3c b3cVar) {
        zj4 zj4Var = this.Q1;
        zj4Var.getClass();
        b3c b3cVar2 = new b3c(xxg.h(b3cVar.a, 0.1f, 8.0f), xxg.h(b3cVar.b, 0.1f, 8.0f));
        if (!zj4Var.k || xxg.a < 23) {
            zj4Var.s(b3cVar2, zj4Var.h().b);
        } else {
            zj4Var.t(b3cVar2);
        }
    }
}
