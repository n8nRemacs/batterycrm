package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import com.google.android.exoplayer2.audio.AudioSink$ConfigurationException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zj4 {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public j50[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public ic0 X;
    public boolean Y;
    public long Z;
    public final t20 a;
    public boolean a0;
    public final te8 b;
    public boolean b0;
    public final boolean c;
    public final ha2 d;
    public final ajg e;
    public final j50[] f;
    public final j50[] g;
    public final ConditionVariable h;
    public final k60 i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public jkc m;
    public final v32 n;
    public final v32 o;
    public final r8j p;
    public m4c q;
    public x6i r;
    public tj4 s;
    public tj4 t;
    public AudioTrack u;
    public j20 v;
    public vj4 w;
    public vj4 x;
    public b3c y;
    public ByteBuffer z;

    public zj4(ka5 ka5Var) {
        this.a = (t20) ka5Var.a;
        te8 te8Var = (te8) ka5Var.b;
        this.b = te8Var;
        int i = xxg.a;
        this.c = false;
        this.k = false;
        this.l = 0;
        this.p = (r8j) ka5Var.c;
        this.h = new ConditionVariable(true);
        this.i = new k60(new iv6(14, this));
        ha2 ha2Var = new ha2();
        this.d = ha2Var;
        ajg ajgVar = new ajg();
        ajgVar.m = xxg.f;
        this.e = ajgVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new qnd(), ha2Var, ajgVar);
        Collections.addAll(arrayList, (j50[]) te8Var.a);
        this.f = (j50[]) arrayList.toArray(new j50[0]);
        this.g = new j50[]{new o26()};
        this.J = 1.0f;
        this.v = j20.Y;
        this.W = 0;
        this.X = new ic0();
        b3c b3cVar = b3c.d;
        this.x = new vj4(b3cVar, false, 0L, 0L);
        this.y = b3cVar;
        this.R = -1;
        this.K = new j50[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new v32(5, false);
        this.o = new v32(5, false);
    }

    public static AudioFormat e(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(defpackage.gf6 r12, defpackage.t20 r13) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj4.f(gf6, t20):android.util.Pair");
    }

    public static boolean o(AudioTrack audioTrack) {
        return xxg.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        b3c b3cVar;
        boolean z;
        boolean zU = u();
        te8 te8Var = this.b;
        if (zU) {
            b3cVar = h().a;
            p6f p6fVar = (p6f) te8Var.c;
            float f = b3cVar.a;
            if (p6fVar.c != f) {
                p6fVar.c = f;
                p6fVar.i = true;
            }
            float f2 = b3cVar.b;
            if (p6fVar.d != f2) {
                p6fVar.d = f2;
                p6fVar.i = true;
            }
        } else {
            b3cVar = b3c.d;
        }
        b3c b3cVar2 = b3cVar;
        int i = 0;
        if (u()) {
            boolean z2 = h().b;
            ((v0f) te8Var.b).m = z2;
            z = z2;
        } else {
            z = false;
        }
        this.j.add(new vj4(b3cVar2, z, Math.max(0L, j), (j() * 1000000) / this.t.e));
        j50[] j50VarArr = this.t.i;
        ArrayList arrayList = new ArrayList();
        for (j50 j50Var : j50VarArr) {
            if (j50Var.isActive()) {
                arrayList.add(j50Var);
            } else {
                j50Var.flush();
            }
        }
        int size = arrayList.size();
        this.K = (j50[]) arrayList.toArray(new j50[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            j50[] j50VarArr2 = this.K;
            if (i >= j50VarArr2.length) {
                break;
            }
            j50 j50Var2 = j50VarArr2[i];
            j50Var2.flush();
            this.L[i] = j50Var2.b();
            i++;
        }
        x6i x6iVar = this.r;
        if (x6iVar != null) {
            xt4 xt4Var = ((lw8) x6iVar.b).P1;
            Handler handler = (Handler) xt4Var.b;
            if (handler != null) {
                handler.post(new ui(2, xt4Var, z));
            }
        }
    }

    public final void b(gf6 gf6Var, int[] iArr) {
        int i;
        int iIntValue;
        int i2;
        j50[] j50VarArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr2;
        String str = gf6Var.v0;
        int i8 = gf6Var.J0;
        int i9 = gf6Var.I0;
        int i10 = gf6Var.K0;
        if ("audio/raw".equals(str)) {
            fsi.b(xxg.z(i10));
            int iU = xxg.u(i10, i9);
            j50[] j50VarArr2 = (this.c && (i10 == 536870912 || i10 == 805306368 || i10 == 4)) ? this.g : this.f;
            int i11 = gf6Var.L0;
            int i12 = gf6Var.M0;
            ajg ajgVar = this.e;
            ajgVar.i = i11;
            ajgVar.j = i12;
            if (xxg.a < 21 && i9 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i13 = 0; i13 < 6; i13++) {
                    iArr2[i13] = i13;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.i = iArr2;
            h50 h50Var = new h50(i8, i9, i10);
            for (j50 j50Var : j50VarArr2) {
                try {
                    h50 h50VarE = j50Var.e(h50Var);
                    if (j50Var.isActive()) {
                        h50Var = h50VarE;
                    }
                } catch (AudioProcessor$UnhandledAudioFormatException e) {
                    throw new AudioSink$ConfigurationException(e, gf6Var);
                }
            }
            int i14 = h50Var.c;
            int i15 = h50Var.b;
            int i16 = h50Var.a;
            iIntValue = xxg.n(i15);
            int iU2 = xxg.u(i14, i15);
            j50VarArr = j50VarArr2;
            i3 = i14;
            i8 = i16;
            i = iU2;
            i4 = iU;
            i2 = 0;
        } else {
            j50[] j50VarArr3 = new j50[0];
            i = -1;
            if (v(gf6Var, this.v)) {
                String str2 = gf6Var.v0;
                str2.getClass();
                int iB = wz9.b(str2, gf6Var.s0);
                iIntValue = xxg.n(i9);
                i4 = -1;
                j50VarArr = j50VarArr3;
                i3 = iB;
                i2 = 1;
            } else {
                Pair pairF = f(gf6Var, this.a);
                if (pairF == null) {
                    String strValueOf = String.valueOf(gf6Var);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(strValueOf);
                    throw new AudioSink$ConfigurationException(sb.toString(), gf6Var);
                }
                int iIntValue2 = ((Integer) pairF.first).intValue();
                iIntValue = ((Integer) pairF.second).intValue();
                i2 = 2;
                j50VarArr = j50VarArr3;
                i3 = iIntValue2;
                i4 = -1;
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i8, iIntValue, i3);
        fsi.d(minBufferSize != -2);
        double d = this.k ? 8.0d : 1.0d;
        this.p.getClass();
        if (i2 != 0) {
            if (i2 == 1) {
                i5 = i4;
                i7 = jni.b((50000000 * r8j.l(i3)) / 1000000);
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException();
                }
                i5 = i4;
                i7 = jni.b(((i3 == 5 ? 500000 : 250000) * r8j.l(i3)) / 1000000);
            }
            i6 = i;
        } else {
            i5 = i4;
            long j = i8;
            long j2 = 250000 * j;
            long j3 = i;
            i6 = i;
            i7 = xxg.i(minBufferSize * 4, jni.b((j2 * j3) / 1000000), jni.b(((750000 * j) * j3) / 1000000));
        }
        int iMax = (((Math.max(minBufferSize, (int) (i7 * d)) + i6) - 1) / i6) * i6;
        if (i3 == 0) {
            String strValueOf2 = String.valueOf(gf6Var);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i2);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new AudioSink$ConfigurationException(sb2.toString(), gf6Var);
        }
        if (iIntValue != 0) {
            this.a0 = false;
            tj4 tj4Var = new tj4(gf6Var, i5, i2, i6, i8, iIntValue, i3, iMax, j50VarArr);
            if (n()) {
                this.s = tj4Var;
                return;
            } else {
                this.t = tj4Var;
                return;
            }
        }
        String strValueOf3 = String.valueOf(gf6Var);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 54);
        sb3.append("Invalid output channel config (mode=");
        sb3.append(i2);
        sb3.append(") for: ");
        sb3.append(strValueOf3);
        throw new AudioSink$ConfigurationException(sb3.toString(), gf6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r9.O != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.R
            j50[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.q(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L29
            goto L3a
        L29:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.w(r7, r0)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
        L3a:
            return r2
        L3b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj4.c():boolean");
    }

    public final void d() {
        if (n()) {
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.b0 = false;
            this.F = 0;
            this.x = new vj4(h().a, h().b, 0L, 0L);
            this.I = 0L;
            this.w = null;
            this.j.clear();
            this.M = null;
            this.N = 0;
            this.O = null;
            this.T = false;
            this.S = false;
            this.R = -1;
            this.z = null;
            this.A = 0;
            this.e.o = 0L;
            int i = 0;
            while (true) {
                j50[] j50VarArr = this.K;
                if (i >= j50VarArr.length) {
                    break;
                }
                j50 j50Var = j50VarArr[i];
                j50Var.flush();
                this.L[i] = j50Var.b();
                i++;
            }
            k60 k60Var = this.i;
            AudioTrack audioTrack = k60Var.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.u.pause();
            }
            if (o(this.u)) {
                jkc jkcVar = this.m;
                jkcVar.getClass();
                this.u.unregisterStreamEventCallback((yj4) jkcVar.b);
                ((Handler) jkcVar.a).removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.u;
            this.u = null;
            if (xxg.a < 21 && !this.V) {
                this.W = 0;
            }
            tj4 tj4Var = this.s;
            if (tj4Var != null) {
                this.t = tj4Var;
                this.s = null;
            }
            k60Var.l = 0L;
            k60Var.w = 0;
            k60Var.v = 0;
            k60Var.m = 0L;
            k60Var.C = 0L;
            k60Var.F = 0L;
            k60Var.k = false;
            k60Var.c = null;
            k60Var.f = null;
            this.h.close();
            new rj4(this, audioTrack2).start();
        }
        this.o.c = null;
        this.n.c = null;
    }

    public final int g(gf6 gf6Var) {
        String str = gf6Var.v0;
        int i = gf6Var.K0;
        if ("audio/raw".equals(str)) {
            if (!xxg.z(i)) {
                az1.s("Invalid PCM encoding: ", 33, i, "DefaultAudioSink");
                return 0;
            }
            if (i != 2 && (!this.c || i != 4)) {
                return 1;
            }
        } else if ((this.a0 || !v(gf6Var, this.v)) && f(gf6Var, this.a) == null) {
            return 0;
        }
        return 2;
    }

    public final vj4 h() {
        vj4 vj4Var = this.w;
        if (vj4Var != null) {
            return vj4Var;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (vj4) arrayDeque.getLast() : this.x;
    }

    public final long i() {
        return this.t.c == 0 ? this.B / r0.b : this.C;
    }

    public final long j() {
        return this.t.c == 0 ? this.D / r0.d : this.E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d3, code lost:
    
        if (r12 == 0) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(int r27, long r28, java.nio.ByteBuffer r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj4.k(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean l() {
        return n() && this.i.b(j());
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() throws com.google.android.exoplayer2.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj4.m():void");
    }

    public final boolean n() {
        return this.u != null;
    }

    public final void p() {
        if (this.T) {
            return;
        }
        this.T = true;
        long j = j();
        k60 k60Var = this.i;
        k60Var.z = k60Var.a();
        k60Var.x = SystemClock.elapsedRealtime() * 1000;
        k60Var.A = j;
        this.u.stop();
        this.A = 0;
    }

    public final void q(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.L[i - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = j50.a;
                }
            }
            if (i == length) {
                w(j, byteBuffer);
            } else {
                j50 j50Var = this.K[i];
                if (i > this.R) {
                    j50Var.c(byteBuffer);
                }
                ByteBuffer byteBufferB = j50Var.b();
                this.L[i] = byteBufferB;
                if (byteBufferB.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void r() {
        d();
        for (j50 j50Var : this.f) {
            j50Var.reset();
        }
        for (j50 j50Var2 : this.g) {
            j50Var2.reset();
        }
        this.U = false;
        this.a0 = false;
    }

    public final void s(b3c b3cVar, boolean z) {
        vj4 vj4VarH = h();
        if (b3cVar.equals(vj4VarH.a) && z == vj4VarH.b) {
            return;
        }
        vj4 vj4Var = new vj4(b3cVar, z, -9223372036854775807L, -9223372036854775807L);
        if (n()) {
            this.w = vj4Var;
        } else {
            this.x = vj4Var;
        }
    }

    public final void t(b3c b3cVar) {
        if (n()) {
            try {
                this.u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(b3cVar.a).setPitch(b3cVar.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                pai.e("DefaultAudioSink", "Failed to set playback params", e);
            }
            b3cVar = new b3c(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            float f = b3cVar.a;
            k60 k60Var = this.i;
            k60Var.j = f;
            l10 l10Var = k60Var.f;
            if (l10Var != null) {
                l10Var.a();
            }
        }
        this.y = b3cVar;
    }

    public final boolean u() {
        if (this.Y || !"audio/raw".equals(this.t.a.v0)) {
            return false;
        }
        int i = this.t.a.K0;
        if (!this.c) {
            return true;
        }
        int i2 = xxg.a;
        return (i == 536870912 || i == 805306368 || i == 4) ? false : true;
    }

    public final boolean v(gf6 gf6Var, j20 j20Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i;
        int iN;
        int i2 = xxg.a;
        if (i2 >= 29 && (i = this.l) != 0) {
            String str = gf6Var.v0;
            str.getClass();
            int iB = wz9.b(str, gf6Var.s0);
            if (iB != 0 && (iN = xxg.n(gf6Var.I0)) != 0) {
                AudioFormat audioFormatE = e(gf6Var.J0, iN, iB);
                AudioAttributes audioAttributesA = j20Var.a();
                int playbackOffloadSupport = i2 >= 31 ? AudioManager.getPlaybackOffloadSupport(audioFormatE, audioAttributesA) : !AudioManager.isOffloadedPlaybackSupported(audioFormatE, audioAttributesA) ? 0 : (i2 == 30 && xxg.d.startsWith("Pixel")) ? 2 : 1;
                if (playbackOffloadSupport != 0) {
                    if (playbackOffloadSupport == 1) {
                        boolean z = (gf6Var.L0 == 0 && gf6Var.M0 == 0) ? false : true;
                        boolean z2 = i == 1;
                        if (!z || !z2) {
                        }
                    } else if (playbackOffloadSupport != 2) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(long r13, java.nio.ByteBuffer r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj4.w(long, java.nio.ByteBuffer):void");
    }
}
