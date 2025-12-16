package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.jo;
import com.yandex.mobile.ads.impl.oc;
import com.yandex.mobile.ads.impl.qc;
import com.yandex.mobile.ads.impl.tc;
import j.InterfaceC42164u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class io implements qc {

    /* renamed from: A, reason: collision with root package name */
    private int f386562A;

    /* renamed from: B, reason: collision with root package name */
    private long f386563B;

    /* renamed from: C, reason: collision with root package name */
    private long f386564C;

    /* renamed from: D, reason: collision with root package name */
    private long f386565D;

    /* renamed from: E, reason: collision with root package name */
    private long f386566E;

    /* renamed from: F, reason: collision with root package name */
    private int f386567F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f386568G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f386569H;

    /* renamed from: I, reason: collision with root package name */
    private long f386570I;

    /* renamed from: J, reason: collision with root package name */
    private float f386571J;

    /* renamed from: K, reason: collision with root package name */
    private oc[] f386572K;

    /* renamed from: L, reason: collision with root package name */
    private ByteBuffer[] f386573L;

    /* renamed from: M, reason: collision with root package name */
    @j.P
    private ByteBuffer f386574M;

    /* renamed from: N, reason: collision with root package name */
    private int f386575N;

    /* renamed from: O, reason: collision with root package name */
    @j.P
    private ByteBuffer f386576O;

    /* renamed from: P, reason: collision with root package name */
    private byte[] f386577P;

    /* renamed from: Q, reason: collision with root package name */
    private int f386578Q;

    /* renamed from: R, reason: collision with root package name */
    private int f386579R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f386580S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f386581T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f386582U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f386583V;

    /* renamed from: W, reason: collision with root package name */
    private int f386584W;

    /* renamed from: X, reason: collision with root package name */
    private dd f386585X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f386586Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f386587Z;

    /* renamed from: a, reason: collision with root package name */
    private final lc f386588a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f386589a0;

    /* renamed from: b, reason: collision with root package name */
    private final c f386590b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f386591b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f386592c;

    /* renamed from: d, reason: collision with root package name */
    private final mi f386593d;

    /* renamed from: e, reason: collision with root package name */
    private final xa1 f386594e;

    /* renamed from: f, reason: collision with root package name */
    private final oc[] f386595f;

    /* renamed from: g, reason: collision with root package name */
    private final oc[] f386596g;

    /* renamed from: h, reason: collision with root package name */
    private final bl f386597h;

    /* renamed from: i, reason: collision with root package name */
    private final tc f386598i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<i> f386599j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f386600k;

    /* renamed from: l, reason: collision with root package name */
    private final int f386601l;

    /* renamed from: m, reason: collision with root package name */
    private l f386602m;

    /* renamed from: n, reason: collision with root package name */
    private final j<qc.b> f386603n;

    /* renamed from: o, reason: collision with root package name */
    private final j<qc.e> f386604o;

    /* renamed from: p, reason: collision with root package name */
    private final jo f386605p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    private jt0 f386606q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    private qc.c f386607r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    private f f386608s;

    /* renamed from: t, reason: collision with root package name */
    private f f386609t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    private AudioTrack f386610u;

    /* renamed from: v, reason: collision with root package name */
    private jc f386611v;

    /* renamed from: w, reason: collision with root package name */
    @j.P
    private i f386612w;

    /* renamed from: x, reason: collision with root package name */
    private i f386613x;

    /* renamed from: y, reason: collision with root package name */
    private ct0 f386614y;

    /* renamed from: z, reason: collision with root package name */
    @j.P
    private ByteBuffer f386615z;

    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AudioTrack f386616b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f386616b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.f386616b.flush();
                this.f386616b.release();
            } finally {
                io.this.f386597h.e();
            }
        }
    }

    @j.X
    public static final class b {
        @InterfaceC42164u
        public static void a(AudioTrack audioTrack, jt0 jt0Var) {
            LogSessionId logSessionIdA = jt0Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface c {
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final jo f386618a = new jo(new jo.a());
    }

    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private g f386620b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f386621c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f386622d;

        /* renamed from: a, reason: collision with root package name */
        private lc f386619a = lc.f387441d;

        /* renamed from: e, reason: collision with root package name */
        private int f386623e = 0;

        /* renamed from: f, reason: collision with root package name */
        jo f386624f = d.f386618a;

        public final e a(lc lcVar) {
            lcVar.getClass();
            this.f386619a = lcVar;
            return this;
        }

        public final e b() {
            this.f386622d = false;
            return this;
        }

        public final e c() {
            this.f386621c = false;
            return this;
        }

        public final e d() {
            this.f386623e = 0;
            return this;
        }

        public final io a() {
            int i12 = 0;
            if (this.f386620b == null) {
                this.f386620b = new g(new oc[0], new t31(0), new f61());
            }
            return new io(this, i12);
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final vw f386625a;

        /* renamed from: b, reason: collision with root package name */
        public final int f386626b;

        /* renamed from: c, reason: collision with root package name */
        public final int f386627c;

        /* renamed from: d, reason: collision with root package name */
        public final int f386628d;

        /* renamed from: e, reason: collision with root package name */
        public final int f386629e;

        /* renamed from: f, reason: collision with root package name */
        public final int f386630f;

        /* renamed from: g, reason: collision with root package name */
        public final int f386631g;

        /* renamed from: h, reason: collision with root package name */
        public final int f386632h;

        /* renamed from: i, reason: collision with root package name */
        public final oc[] f386633i;

        public f(vw vwVar, int i12, int i13, int i14, int i15, int i16, int i17, int i18, oc[] ocVarArr) {
            this.f386625a = vwVar;
            this.f386626b = i12;
            this.f386627c = i13;
            this.f386628d = i14;
            this.f386629e = i15;
            this.f386630f = i16;
            this.f386631g = i17;
            this.f386632h = i18;
            this.f386633i = ocVarArr;
        }

        private AudioTrack b(boolean z12, jc jcVar, int i12) {
            int i13 = pc1.f388768a;
            if (i13 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(z12 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : jcVar.a().f386818a).setAudioFormat(io.a(this.f386629e, this.f386630f, this.f386631g)).setTransferMode(1).setBufferSizeInBytes(this.f386632h).setSessionId(i12).setOffloadedPlayback(this.f386627c == 1).build();
            }
            if (i13 >= 21) {
                return new AudioTrack(z12 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : jcVar.a().f386818a, io.a(this.f386629e, this.f386630f, this.f386631g), this.f386632h, 1, i12);
            }
            int iC2 = pc1.c(jcVar.f386814c);
            return i12 == 0 ? new AudioTrack(iC2, this.f386629e, this.f386630f, this.f386631g, this.f386632h, 1) : new AudioTrack(iC2, this.f386629e, this.f386630f, this.f386631g, this.f386632h, 1, i12);
        }

        public final AudioTrack a(boolean z12, jc jcVar, int i12) throws qc.b {
            try {
                AudioTrack audioTrackB = b(z12, jcVar, i12);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new qc.b(state, this.f386629e, this.f386630f, this.f386632h, this.f386625a, this.f386627c == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e12) {
                throw new qc.b(0, this.f386629e, this.f386630f, this.f386632h, this.f386625a, this.f386627c == 1, e12);
            }
        }
    }

    public static class g implements c {

        /* renamed from: a, reason: collision with root package name */
        private final oc[] f386634a;

        /* renamed from: b, reason: collision with root package name */
        private final t31 f386635b;

        /* renamed from: c, reason: collision with root package name */
        private final f61 f386636c;

        public g(oc[] ocVarArr, t31 t31Var, f61 f61Var) {
            oc[] ocVarArr2 = new oc[ocVarArr.length + 2];
            this.f386634a = ocVarArr2;
            System.arraycopy(ocVarArr, 0, ocVarArr2, 0, ocVarArr.length);
            this.f386635b = t31Var;
            this.f386636c = f61Var;
            ocVarArr2[ocVarArr.length] = t31Var;
            ocVarArr2[ocVarArr.length + 1] = f61Var;
        }

        public final oc[] a() {
            return this.f386634a;
        }

        public final long b() {
            return this.f386635b.i();
        }

        public final ct0 a(ct0 ct0Var) {
            this.f386636c.b(ct0Var.f384453a);
            this.f386636c.a(ct0Var.f384454b);
            return ct0Var;
        }

        public final boolean a(boolean z12) {
            this.f386635b.a(z12);
            return z12;
        }

        public final long a(long j12) {
            return this.f386636c.a(j12);
        }
    }

    public static final class h extends RuntimeException {
    }

    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final ct0 f386637a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f386638b;

        /* renamed from: c, reason: collision with root package name */
        public final long f386639c;

        /* renamed from: d, reason: collision with root package name */
        public final long f386640d;

        public /* synthetic */ i(ct0 ct0Var, boolean z12, long j12, long j13, int i12) {
            this(ct0Var, z12, j12, j13);
        }

        private i(ct0 ct0Var, boolean z12, long j12, long j13) {
            this.f386637a = ct0Var;
            this.f386638b = z12;
            this.f386639c = j12;
            this.f386640d = j13;
        }
    }

    public final class k implements tc.a {
        private k() {
        }

        @Override // com.yandex.mobile.ads.impl.tc.a
        public final void a(long j12, long j13, long j14, long j15) {
            StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "Spurious audio timestamp (frame position mismatch): ", ", ");
            sbQ.append(j13);
            sbQ.append(", ");
            sbQ.append(j14);
            sbQ.append(", ");
            sbQ.append(j15);
            sbQ.append(", ");
            sbQ.append(io.c(io.this));
            sbQ.append(", ");
            sbQ.append(io.this.i());
            ka0.d("DefaultAudioSink", sbQ.toString());
        }

        @Override // com.yandex.mobile.ads.impl.tc.a
        public final void b(long j12, long j13, long j14, long j15) {
            StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "Spurious audio timestamp (system clock mismatch): ", ", ");
            sbQ.append(j13);
            sbQ.append(", ");
            sbQ.append(j14);
            sbQ.append(", ");
            sbQ.append(j15);
            sbQ.append(", ");
            sbQ.append(io.c(io.this));
            sbQ.append(", ");
            sbQ.append(io.this.i());
            ka0.d("DefaultAudioSink", sbQ.toString());
        }

        public /* synthetic */ k(io ioVar, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.tc.a
        public final void a(long j12) {
            if (io.this.f386607r != null) {
                bc0.this.f383884I0.b(j12);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tc.a
        public final void b(long j12) {
            ka0.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j12);
        }

        @Override // com.yandex.mobile.ads.impl.tc.a
        public final void a(int i12, long j12) {
            if (io.this.f386607r != null) {
                bc0.this.f383884I0.b(i12, j12, SystemClock.elapsedRealtime() - io.this.f386587Z);
            }
        }
    }

    @j.X
    public final class l {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f386644a = new Handler();

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f386645b = new a();

        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i12) {
                db.b(audioTrack == io.this.f386610u);
                if (io.this.f386607r == null || !io.this.f386582U) {
                    return;
                }
                bc0.a aVar = (bc0.a) io.this.f386607r;
                if (bc0.this.f383893R0 != null) {
                    bc0.this.f383893R0.b();
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                db.b(audioTrack == io.this.f386610u);
                if (io.this.f386607r == null || !io.this.f386582U) {
                    return;
                }
                bc0.a aVar = (bc0.a) io.this.f386607r;
                if (bc0.this.f383893R0 != null) {
                    bc0.this.f383893R0.b();
                }
            }
        }

        public l() {
        }

        public final void a(AudioTrack audioTrack) {
            Handler handler = this.f386644a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.media3.exoplayer.audio.o(handler, 0), this.f386645b);
        }

        public final void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f386645b);
            this.f386644a.removeCallbacksAndMessages(null);
        }
    }

    public /* synthetic */ io(e eVar, int i12) {
        this(eVar);
    }

    private i h() {
        i iVar = this.f386612w;
        return iVar != null ? iVar : !this.f386599j.isEmpty() ? this.f386599j.getLast() : this.f386613x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long i() {
        return this.f386609t.f386627c == 0 ? this.f386565D / r0.f386628d : this.f386566E;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean j() throws com.yandex.mobile.ads.impl.qc.b {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.io.j():boolean");
    }

    private boolean k() {
        return this.f386610u != null;
    }

    private void l() {
        this.f386563B = 0L;
        this.f386564C = 0L;
        this.f386565D = 0L;
        this.f386566E = 0L;
        int i12 = 0;
        this.f386591b0 = false;
        this.f386567F = 0;
        this.f386613x = new i(h().f386637a, h().f386638b, 0L, 0L, 0);
        this.f386570I = 0L;
        this.f386612w = null;
        this.f386599j.clear();
        this.f386574M = null;
        this.f386575N = 0;
        this.f386576O = null;
        this.f386581T = false;
        this.f386580S = false;
        this.f386579R = -1;
        this.f386615z = null;
        this.f386562A = 0;
        this.f386594e.j();
        while (true) {
            oc[] ocVarArr = this.f386572K;
            if (i12 >= ocVarArr.length) {
                return;
            }
            oc ocVar = ocVarArr[i12];
            ocVar.flush();
            this.f386573L[i12] = ocVar.b();
            i12++;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void c() throws IllegalStateException {
        if (!this.f386580S && k() && g()) {
            if (!this.f386581T) {
                this.f386581T = true;
                this.f386598i.c(i());
                this.f386610u.stop();
                this.f386562A = 0;
            }
            this.f386580S = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void flush() throws IllegalStateException {
        if (k()) {
            l();
            if (this.f386598i.b()) {
                this.f386610u.pause();
            }
            AudioTrack audioTrack = this.f386610u;
            int i12 = pc1.f388768a;
            if (i12 >= 29 && audioTrack.isOffloadedPlayback()) {
                l lVar = this.f386602m;
                lVar.getClass();
                lVar.b(this.f386610u);
            }
            AudioTrack audioTrack2 = this.f386610u;
            this.f386610u = null;
            if (i12 < 21 && !this.f386583V) {
                this.f386584W = 0;
            }
            f fVar = this.f386608s;
            if (fVar != null) {
                this.f386609t = fVar;
                this.f386608s = null;
            }
            this.f386598i.d();
            this.f386597h.c();
            new a(audioTrack2).start();
        }
        this.f386604o.a();
        this.f386603n.a();
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final ct0 getPlaybackParameters() {
        return this.f386600k ? this.f386614y : h().f386637a;
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void pause() throws IllegalStateException {
        this.f386582U = false;
        if (k() && this.f386598i.c()) {
            this.f386610u.pause();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void play() throws IllegalStateException {
        this.f386582U = true;
        if (k()) {
            this.f386598i.e();
            this.f386610u.play();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void reset() throws IllegalStateException {
        flush();
        for (oc ocVar : this.f386595f) {
            ocVar.reset();
        }
        for (oc ocVar2 : this.f386596g) {
            ocVar2.reset();
        }
        this.f386582U = false;
        this.f386589a0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void setVolume(float f12) {
        if (this.f386571J != f12) {
            this.f386571J = f12;
            if (k()) {
                if (pc1.f388768a >= 21) {
                    this.f386610u.setVolume(this.f386571J);
                    return;
                }
                AudioTrack audioTrack = this.f386610u;
                float f13 = this.f386571J;
                audioTrack.setStereoVolume(f13, f13);
            }
        }
    }

    @v61.m
    private io(e eVar) {
        this.f386588a = eVar.f386619a;
        c cVar = eVar.f386620b;
        this.f386590b = cVar;
        int i12 = pc1.f388768a;
        int i13 = 0;
        this.f386592c = i12 >= 21 && eVar.f386621c;
        this.f386600k = i12 >= 23 && eVar.f386622d;
        this.f386601l = i12 >= 29 ? eVar.f386623e : 0;
        this.f386605p = eVar.f386624f;
        bl blVar = new bl(0);
        this.f386597h = blVar;
        blVar.e();
        this.f386598i = new tc(new k(this, i13));
        mi miVar = new mi();
        this.f386593d = miVar;
        xa1 xa1Var = new xa1();
        this.f386594e = xa1Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new gz0(), miVar, xa1Var);
        Collections.addAll(arrayList, ((g) cVar).a());
        this.f386595f = (oc[]) arrayList.toArray(new oc[0]);
        this.f386596g = new oc[]{new ow()};
        this.f386571J = 1.0f;
        this.f386611v = jc.f386811g;
        this.f386584W = 0;
        this.f386585X = new dd();
        ct0 ct0Var = ct0.f384452d;
        this.f386613x = new i(ct0Var, false, 0L, 0L, 0);
        this.f386614y = ct0Var;
        this.f386579R = -1;
        this.f386572K = new oc[0];
        this.f386573L = new ByteBuffer[0];
        this.f386599j = new ArrayDeque<>();
        this.f386603n = new j<>();
        this.f386604o = new j<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g() throws T, com.yandex.mobile.ads.impl.qc.e {
        /*
            r9 = this;
            int r0 = r9.f386579R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f386579R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f386579R
            com.yandex.mobile.ads.impl.oc[] r5 = r9.f386572K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.c()
        L1f:
            r9.b(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.f386579R
            int r0 = r0 + r1
            r9.f386579R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f386576O
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.f386576O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.f386579R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.io.g():boolean");
    }

    public final void a(qc.c cVar) {
        this.f386607r = cVar;
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final int b(vw vwVar) {
        if (!"audio/raw".equals(vwVar.f391181l)) {
            return ((this.f386589a0 || !a(vwVar, this.f386611v)) && this.f386588a.a(vwVar) == null) ? 0 : 2;
        }
        if (pc1.e(vwVar.f391164A)) {
            int i12 = vwVar.f391164A;
            return (i12 == 2 || (this.f386592c && i12 == 4)) ? 2 : 1;
        }
        StringBuilder sbA = Cif.a("Invalid PCM encoding: ");
        sbA.append(vwVar.f391164A);
        ka0.d("DefaultAudioSink", sbA.toString());
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final boolean d() {
        return k() && this.f386598i.d(i());
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void e() throws IllegalStateException {
        if (this.f386586Y) {
            this.f386586Y = false;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void f() {
        this.f386568G = true;
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void a(@j.P jt0 jt0Var) {
        this.f386606q = jt0Var;
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final boolean a(vw vwVar) {
        return b(vwVar) != 0;
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final long a(boolean z12) {
        long jA2;
        if (!k() || this.f386569H) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f386598i.a(z12), (i() * 1000000) / this.f386609t.f386629e);
        while (!this.f386599j.isEmpty() && jMin >= this.f386599j.getFirst().f386640d) {
            this.f386613x = this.f386599j.remove();
        }
        i iVar = this.f386613x;
        long j12 = jMin - iVar.f386640d;
        if (iVar.f386637a.equals(ct0.f384452d)) {
            jA2 = this.f386613x.f386639c + j12;
        } else if (this.f386599j.isEmpty()) {
            jA2 = ((g) this.f386590b).a(j12) + this.f386613x.f386639c;
        } else {
            i first = this.f386599j.getFirst();
            long jRound = first.f386640d - jMin;
            float f12 = this.f386613x.f386637a.f384453a;
            int i12 = pc1.f388768a;
            if (f12 != 1.0f) {
                jRound = Math.round(jRound * f12);
            }
            jA2 = first.f386639c - jRound;
        }
        return ((((g) this.f386590b).b() * 1000000) / this.f386609t.f386629e) + jA2;
    }

    public static long c(io ioVar) {
        if (ioVar.f386609t.f386627c == 0) {
            return ioVar.f386563B / r0.f386626b;
        }
        return ioVar.f386564C;
    }

    public static final class j<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private T f386641a;

        /* renamed from: b, reason: collision with root package name */
        private long f386642b;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void a(T t12) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f386641a == null) {
                this.f386641a = t12;
                this.f386642b = 100 + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f386642b) {
                T t13 = this.f386641a;
                if (t13 != t12) {
                    t13.addSuppressed(t12);
                }
                T t14 = this.f386641a;
                this.f386641a = null;
                throw t14;
            }
        }

        public final void a() {
            this.f386641a = null;
        }
    }

    private void b(long j12) throws T, qc.e {
        ByteBuffer byteBuffer;
        int length = this.f386572K.length;
        int i12 = length;
        while (i12 >= 0) {
            if (i12 > 0) {
                byteBuffer = this.f386573L[i12 - 1];
            } else {
                byteBuffer = this.f386574M;
                if (byteBuffer == null) {
                    byteBuffer = oc.f388484a;
                }
            }
            if (i12 == length) {
                a(byteBuffer, j12);
            } else {
                oc ocVar = this.f386572K[i12];
                if (i12 > this.f386579R) {
                    ocVar.a(byteBuffer);
                }
                ByteBuffer byteBufferB = ocVar.b();
                this.f386573L[i12] = byteBufferB;
                if (byteBufferB.hasRemaining()) {
                    i12++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i12--;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void b() throws IllegalStateException {
        db.b(pc1.f388768a >= 21);
        db.b(this.f386583V);
        if (this.f386586Y) {
            return;
        }
        this.f386586Y = true;
        flush();
    }

    @j.X
    private void b(ct0 ct0Var) {
        if (k()) {
            try {
                this.f386610u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(ct0Var.f384453a).setPitch(ct0Var.f384454b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e12) {
                ka0.b("DefaultAudioSink", "Failed to set playback params", e12);
            }
            ct0Var = new ct0(this.f386610u.getPlaybackParams().getSpeed(), this.f386610u.getPlaybackParams().getPitch());
            this.f386598i.a(ct0Var.f384453a);
        }
        this.f386614y = ct0Var;
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void a(vw vwVar, @j.P int[] iArr) throws qc.a, NumberFormatException {
        int i12;
        oc[] ocVarArr;
        int i13;
        int iIntValue;
        int iIntValue2;
        int i14;
        int iB2;
        oc[] ocVarArr2;
        int i15;
        int i16;
        int i17;
        int iMax;
        int i18;
        int i19;
        oc[] ocVarArr3;
        int[] iArr2;
        if ("audio/raw".equals(vwVar.f391181l)) {
            db.a(pc1.e(vwVar.f391164A));
            int iB3 = pc1.b(vwVar.f391164A, vwVar.f391194y);
            int i22 = vwVar.f391164A;
            if (this.f386592c && (i22 == 536870912 || i22 == 805306368 || i22 == 4)) {
                ocVarArr3 = this.f386596g;
            } else {
                ocVarArr3 = this.f386595f;
            }
            this.f386594e.a(vwVar.f391165B, vwVar.f391166C);
            if (pc1.f388768a < 21 && vwVar.f391194y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i23 = 0; i23 < 6; i23++) {
                    iArr2[i23] = i23;
                }
            } else {
                iArr2 = iArr;
            }
            this.f386593d.a(iArr2);
            oc.a aVar = new oc.a(vwVar.f391195z, vwVar.f391194y, vwVar.f391164A);
            for (oc ocVar : ocVarArr3) {
                try {
                    oc.a aVarA = ocVar.a(aVar);
                    if (ocVar.d()) {
                        aVar = aVarA;
                    }
                } catch (oc.b e12) {
                    throw new qc.a(e12, vwVar);
                }
            }
            int i24 = aVar.f388488c;
            int i25 = aVar.f388486a;
            int iA2 = pc1.a(aVar.f388487b);
            ocVarArr = ocVarArr3;
            iB2 = pc1.b(i24, aVar.f388487b);
            i14 = i25;
            iIntValue2 = iA2;
            iIntValue = i24;
            i12 = iB3;
            i13 = 0;
        } else {
            oc[] ocVarArr4 = new oc[0];
            int i26 = vwVar.f391195z;
            i12 = -1;
            if (a(vwVar, this.f386611v)) {
                String str = vwVar.f391181l;
                str.getClass();
                int iB4 = qg0.b(str, vwVar.f391178i);
                iIntValue2 = pc1.a(vwVar.f391194y);
                ocVarArr = ocVarArr4;
                i13 = 1;
                iIntValue = iB4;
            } else {
                Pair<Integer, Integer> pairA = this.f386588a.a(vwVar);
                if (pairA != null) {
                    ocVarArr = ocVarArr4;
                    i13 = 2;
                    iIntValue = ((Integer) pairA.first).intValue();
                    iIntValue2 = ((Integer) pairA.second).intValue();
                } else {
                    throw new qc.a("Unable to configure passthrough for: " + vwVar, vwVar);
                }
            }
            i14 = i26;
            iB2 = -1;
        }
        jo joVar = this.f386605p;
        int minBufferSize = AudioTrack.getMinBufferSize(i14, iIntValue2, iIntValue);
        db.b(minBufferSize != -2);
        double d12 = this.f386600k ? 8.0d : 1.0d;
        joVar.getClass();
        if (i13 != 0) {
            if (i13 == 1) {
                switch (iIntValue) {
                    case 5:
                        i18 = 80000;
                        break;
                    case 6:
                    case 18:
                        i18 = 768000;
                        break;
                    case 7:
                        i18 = 192000;
                        break;
                    case 8:
                        i18 = 2250000;
                        break;
                    case 9:
                        i18 = 40000;
                        break;
                    case 10:
                        i18 = 100000;
                        break;
                    case 11:
                        i18 = 16000;
                        break;
                    case 12:
                        i18 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i18 = 3062500;
                        break;
                    case 15:
                        i18 = 8000;
                        break;
                    case 16:
                        i18 = 256000;
                        break;
                    case 17:
                        i18 = 336000;
                        break;
                }
                ocVarArr2 = ocVarArr;
                iMax = c80.a((joVar.f386936f * i18) / 1000000);
                i17 = i13;
                i15 = i14;
            } else if (i13 == 2) {
                int i27 = joVar.f386935e;
                if (iIntValue == 5) {
                    i27 *= joVar.f386937g;
                }
                switch (iIntValue) {
                    case 5:
                        i19 = 80000;
                        break;
                    case 6:
                    case 18:
                        i19 = 768000;
                        break;
                    case 7:
                        i19 = 192000;
                        break;
                    case 8:
                        i19 = 2250000;
                        break;
                    case 9:
                        i19 = 40000;
                        break;
                    case 10:
                        i19 = 100000;
                        break;
                    case 11:
                        i19 = 16000;
                        break;
                    case 12:
                        i19 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i19 = 3062500;
                        break;
                    case 15:
                        i19 = 8000;
                        break;
                    case 16:
                        i19 = 256000;
                        break;
                    case 17:
                        i19 = 336000;
                        break;
                }
                iMax = c80.a((i27 * i19) / 1000000);
                i17 = i13;
                i15 = i14;
                ocVarArr2 = ocVarArr;
            } else {
                throw new IllegalArgumentException();
            }
            i16 = i12;
        } else {
            ocVarArr2 = ocVarArr;
            int i28 = joVar.f386934d * minBufferSize;
            int i29 = i13;
            long j12 = i14;
            i15 = i14;
            i16 = i12;
            long j13 = iB2;
            int iA3 = c80.a(((joVar.f386932b * j12) * j13) / 1000000);
            int i32 = joVar.f386933c;
            i17 = i29;
            int iA4 = c80.a(((i32 * j12) * j13) / 1000000);
            int i33 = pc1.f388768a;
            iMax = Math.max(iA3, Math.min(i28, iA4));
        }
        int iMax2 = (((Math.max(minBufferSize, (int) (iMax * d12)) + iB2) - 1) / iB2) * iB2;
        if (iIntValue == 0) {
            throw new qc.a("Invalid output encoding (mode=" + i17 + ") for: " + vwVar, vwVar);
        }
        if (iIntValue2 != 0) {
            this.f386589a0 = false;
            f fVar = new f(vwVar, i16, i17, iB2, i15, iIntValue2, iIntValue, iMax2, ocVarArr2);
            if (k()) {
                this.f386608s = fVar;
                return;
            } else {
                this.f386609t = fVar;
                return;
            }
        }
        throw new qc.a("Invalid output channel config (mode=" + i17 + ") for: " + vwVar, vwVar);
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void b(boolean z12) {
        ct0 ct0Var = h().f386637a;
        i iVarH = h();
        if (ct0Var.equals(iVarH.f386637a) && z12 == iVarH.f386638b) {
            return;
        }
        i iVar = new i(ct0Var, z12, -9223372036854775807L, -9223372036854775807L, 0);
        if (k()) {
            this.f386612w = iVar;
        } else {
            this.f386613x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final boolean a(ByteBuffer byteBuffer, long j12, int i12) throws IllegalStateException, T, qc.b, qc.e {
        long j13;
        int iA2;
        int i13;
        byte b12;
        int i14;
        byte b13;
        int i15;
        ByteBuffer byteBuffer2 = this.f386574M;
        db.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f386608s != null) {
            if (!g()) {
                return false;
            }
            f fVar = this.f386608s;
            f fVar2 = this.f386609t;
            fVar.getClass();
            if (fVar2.f386627c == fVar.f386627c && fVar2.f386631g == fVar.f386631g && fVar2.f386629e == fVar.f386629e && fVar2.f386630f == fVar.f386630f && fVar2.f386628d == fVar.f386628d) {
                this.f386609t = this.f386608s;
                this.f386608s = null;
                AudioTrack audioTrack = this.f386610u;
                if (pc1.f388768a >= 29 && audioTrack.isOffloadedPlayback() && this.f386601l != 3) {
                    if (this.f386610u.getPlayState() == 3) {
                        this.f386610u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack2 = this.f386610u;
                    vw vwVar = this.f386609t.f386625a;
                    audioTrack2.setOffloadDelayPadding(vwVar.f391165B, vwVar.f391166C);
                    this.f386591b0 = true;
                }
            } else {
                if (!this.f386581T) {
                    this.f386581T = true;
                    this.f386598i.c(i());
                    this.f386610u.stop();
                    this.f386562A = 0;
                }
                if (d()) {
                    return false;
                }
                flush();
            }
            a(j12);
        }
        if (!k()) {
            try {
                if (!j()) {
                    return false;
                }
            } catch (qc.b e12) {
                if (!e12.f389137b) {
                    this.f386603n.a(e12);
                    return false;
                }
                throw e12;
            }
        }
        this.f386603n.a();
        if (this.f386569H) {
            this.f386570I = Math.max(0L, j12);
            this.f386568G = false;
            this.f386569H = false;
            if (this.f386600k && pc1.f388768a >= 23) {
                b(this.f386614y);
            }
            a(j12);
            if (this.f386582U) {
                play();
            }
        }
        if (!this.f386598i.f(i())) {
            return false;
        }
        if (this.f386574M == null) {
            db.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            f fVar3 = this.f386609t;
            if (fVar3.f386627c != 0 && this.f386567F == 0) {
                int i16 = fVar3.f386631g;
                switch (i16) {
                    case 5:
                    case 6:
                    case 18:
                        iA2 = C39332i.a(byteBuffer);
                        break;
                    case 7:
                    case 8:
                        int iPosition = byteBuffer.position();
                        byte b14 = byteBuffer.get(iPosition);
                        if (b14 != -2) {
                            if (b14 == -1) {
                                i13 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                b13 = byteBuffer.get(iPosition + 7);
                            } else if (b14 != 31) {
                                i13 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                b12 = byteBuffer.get(iPosition + 5);
                            } else {
                                i13 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                b13 = byteBuffer.get(iPosition + 6);
                            }
                            i14 = b13 & 60;
                            iA2 = (((i14 >> 2) | i13) + 1) * 32;
                            break;
                        } else {
                            i13 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                            b12 = byteBuffer.get(iPosition + 4);
                        }
                        i14 = b12 & 252;
                        iA2 = (((i14 >> 2) | i13) + 1) * 32;
                    case 9:
                        int iPosition2 = byteBuffer.position();
                        int i17 = pc1.f388768a;
                        int iReverseBytes = byteBuffer.getInt(iPosition2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                        }
                        iA2 = oh0.c(iReverseBytes);
                        if (iA2 == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    case 10:
                    case 16:
                        iA2 = 1024;
                        break;
                    case 11:
                    case 12:
                        iA2 = 2048;
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException(ba.a("Unexpected audio encoding: ", i16));
                    case 14:
                        int iPosition3 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i18 = iPosition3;
                        while (true) {
                            if (i18 <= iLimit) {
                                int i19 = pc1.f388768a;
                                int iReverseBytes2 = byteBuffer.getInt(i18 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                }
                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                    i15 = i18 - iPosition3;
                                } else {
                                    i18++;
                                }
                            } else {
                                i15 = -1;
                            }
                        }
                        if (i15 != -1) {
                            iA2 = (40 << ((byteBuffer.get((byteBuffer.position() + i15) + ((byteBuffer.get((byteBuffer.position() + i15) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            break;
                        } else {
                            iA2 = 0;
                            break;
                        }
                    case 15:
                        iA2 = 512;
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition4);
                        iA2 = C39341l.a(new or0(16, bArr)).f387341c;
                        break;
                }
                this.f386567F = iA2;
                if (iA2 == 0) {
                    return true;
                }
            }
            if (this.f386612w != null) {
                if (!g()) {
                    return false;
                }
                a(j12);
                this.f386612w = null;
            }
            long j14 = this.f386570I;
            if (this.f386609t.f386627c == 0) {
                j13 = this.f386563B / r5.f386626b;
            } else {
                j13 = this.f386564C;
            }
            long jI2 = (((j13 - this.f386594e.i()) * 1000000) / r5.f386625a.f391195z) + j14;
            if (!this.f386568G && Math.abs(jI2 - j12) > 200000) {
                qc.c cVar = this.f386607r;
                qc.d dVar = new qc.d(j12, jI2);
                bc0.a aVar = (bc0.a) cVar;
                aVar.getClass();
                ka0.a("MediaCodecAudioRenderer", "Audio sink error", dVar);
                bc0.this.f383884I0.b(dVar);
                this.f386568G = true;
            }
            if (this.f386568G) {
                if (!g()) {
                    return false;
                }
                long j15 = j12 - jI2;
                this.f386570I += j15;
                this.f386568G = false;
                a(j12);
                qc.c cVar2 = this.f386607r;
                if (cVar2 != null && j15 != 0) {
                    bc0.this.R();
                }
            }
            if (this.f386609t.f386627c == 0) {
                this.f386563B += byteBuffer.remaining();
            } else {
                this.f386564C = (this.f386567F * i12) + this.f386564C;
            }
            this.f386574M = byteBuffer;
            this.f386575N = i12;
        }
        b(j12);
        if (!this.f386574M.hasRemaining()) {
            this.f386574M = null;
            this.f386575N = 0;
            return true;
        }
        if (!this.f386598i.e(i())) {
            return false;
        }
        ka0.d("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.nio.ByteBuffer r13, long r14) throws T, com.yandex.mobile.ads.impl.qc.e {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.io.a(java.nio.ByteBuffer, long):void");
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final boolean a() {
        return !k() || (this.f386580S && !d());
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void a(ct0 ct0Var) {
        float f12 = ct0Var.f384453a;
        int i12 = pc1.f388768a;
        ct0 ct0Var2 = new ct0(Math.max(0.1f, Math.min(f12, 8.0f)), Math.max(0.1f, Math.min(ct0Var.f384454b, 8.0f)));
        if (this.f386600k && pc1.f388768a >= 23) {
            b(ct0Var2);
            return;
        }
        boolean z12 = h().f386638b;
        i iVarH = h();
        if (ct0Var2.equals(iVarH.f386637a) && z12 == iVarH.f386638b) {
            return;
        }
        i iVar = new i(ct0Var2, z12, -9223372036854775807L, -9223372036854775807L, 0);
        if (k()) {
            this.f386612w = iVar;
        } else {
            this.f386613x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void a(jc jcVar) throws IllegalStateException {
        if (this.f386611v.equals(jcVar)) {
            return;
        }
        this.f386611v = jcVar;
        if (this.f386586Y) {
            return;
        }
        flush();
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void a(int i12) throws IllegalStateException {
        if (this.f386584W != i12) {
            this.f386584W = i12;
            this.f386583V = i12 != 0;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final void a(dd ddVar) {
        if (this.f386585X.equals(ddVar)) {
            return;
        }
        int i12 = ddVar.f384580a;
        float f12 = ddVar.f384581b;
        AudioTrack audioTrack = this.f386610u;
        if (audioTrack != null) {
            if (this.f386585X.f384580a != i12) {
                audioTrack.attachAuxEffect(i12);
            }
            if (i12 != 0) {
                this.f386610u.setAuxEffectSendLevel(f12);
            }
        }
        this.f386585X = ddVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(long r16) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.io.a(long):void");
    }

    private boolean a(vw vwVar, jc jcVar) throws NumberFormatException {
        int iA2;
        int playbackOffloadSupport;
        int i12 = pc1.f388768a;
        if (i12 < 29 || this.f386601l == 0) {
            return false;
        }
        String str = vwVar.f391181l;
        str.getClass();
        int iB2 = qg0.b(str, vwVar.f391178i);
        if (iB2 == 0 || (iA2 = pc1.a(vwVar.f391194y)) == 0) {
            return false;
        }
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(vwVar.f391195z).setChannelMask(iA2).setEncoding(iB2).build();
        AudioAttributes audioAttributes = jcVar.a().f386818a;
        if (i12 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, audioAttributes)) {
            playbackOffloadSupport = (i12 == 30 && pc1.f388771d.startsWith("Pixel")) ? 2 : 1;
        } else {
            playbackOffloadSupport = 0;
        }
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((vwVar.f391165B != 0 || vwVar.f391166C != 0) && (this.f386601l == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    public static AudioFormat a(int i12, int i13, int i14) {
        return new AudioFormat.Builder().setSampleRate(i12).setChannelMask(i13).setEncoding(i14).build();
    }
}
