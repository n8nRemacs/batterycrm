package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.k;
import com.google.android.exoplayer2.audio.p;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class DefaultAudioSink implements AudioSink {

    /* renamed from: A, reason: collision with root package name */
    public int f343866A;

    /* renamed from: B, reason: collision with root package name */
    public long f343867B;

    /* renamed from: C, reason: collision with root package name */
    public long f343868C;

    /* renamed from: D, reason: collision with root package name */
    public long f343869D;

    /* renamed from: E, reason: collision with root package name */
    public long f343870E;

    /* renamed from: F, reason: collision with root package name */
    public int f343871F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f343872G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f343873H;

    /* renamed from: I, reason: collision with root package name */
    public long f343874I;

    /* renamed from: J, reason: collision with root package name */
    public float f343875J;

    /* renamed from: K, reason: collision with root package name */
    public AudioProcessor[] f343876K;

    /* renamed from: L, reason: collision with root package name */
    public ByteBuffer[] f343877L;

    /* renamed from: M, reason: collision with root package name */
    @P
    public ByteBuffer f343878M;

    /* renamed from: N, reason: collision with root package name */
    public int f343879N;

    /* renamed from: O, reason: collision with root package name */
    @P
    public ByteBuffer f343880O;

    /* renamed from: P, reason: collision with root package name */
    public byte[] f343881P;

    /* renamed from: Q, reason: collision with root package name */
    public int f343882Q;

    /* renamed from: R, reason: collision with root package name */
    public int f343883R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f343884S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f343885T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f343886U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f343887V;

    /* renamed from: W, reason: collision with root package name */
    public int f343888W;

    /* renamed from: X, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.l f343889X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f343890Y;

    /* renamed from: Z, reason: collision with root package name */
    public long f343891Z;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.e f343892a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f343893a0;

    /* renamed from: b, reason: collision with root package name */
    public final g f343894b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f343895b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f343896c;

    /* renamed from: d, reason: collision with root package name */
    public final n f343897d;

    /* renamed from: e, reason: collision with root package name */
    public final B f343898e;

    /* renamed from: f, reason: collision with root package name */
    public final AudioProcessor[] f343899f;

    /* renamed from: g, reason: collision with root package name */
    public final AudioProcessor[] f343900g;

    /* renamed from: h, reason: collision with root package name */
    public final ConditionVariable f343901h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.k f343902i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque<h> f343903j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f343904k;

    /* renamed from: l, reason: collision with root package name */
    public final int f343905l;

    /* renamed from: m, reason: collision with root package name */
    public m f343906m;

    /* renamed from: n, reason: collision with root package name */
    public final k<AudioSink.InitializationException> f343907n;

    /* renamed from: o, reason: collision with root package name */
    public final k<AudioSink.WriteException> f343908o;

    /* renamed from: p, reason: collision with root package name */
    public final p f343909p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.analytics.p f343910q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public AudioSink.a f343911r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public f f343912s;

    /* renamed from: t, reason: collision with root package name */
    public f f343913t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public AudioTrack f343914u;

    /* renamed from: v, reason: collision with root package name */
    public C36506d f343915v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public h f343916w;

    /* renamed from: x, reason: collision with root package name */
    public h f343917x;

    /* renamed from: y, reason: collision with root package name */
    public c0 f343918y;

    /* renamed from: z, reason: collision with root package name */
    @P
    public ByteBuffer f343919z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException(String str, a aVar) {
            super(str);
        }
    }

    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f343920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f343920b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            AudioTrack audioTrack = this.f343920b;
            try {
                audioTrack.flush();
                audioTrack.release();
            } finally {
                defaultAudioSink.f343901h.open();
            }
        }
    }

    @X
    public static final class b {
        @InterfaceC42164u
        public static void a(AudioTrack audioTrack, com.google.android.exoplayer2.analytics.p pVar) {
            LogSessionId logSessionIdA = pVar.a();
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
        public static final p f343922a;

        static {
            new p.a();
            f343922a = new p();
        }
    }

    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        @P
        public g f343924b;

        /* renamed from: a, reason: collision with root package name */
        public com.google.android.exoplayer2.audio.e f343923a = com.google.android.exoplayer2.audio.e.f343983c;

        /* renamed from: c, reason: collision with root package name */
        public final p f343925c = d.f343922a;
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final I f343926a;

        /* renamed from: b, reason: collision with root package name */
        public final int f343927b;

        /* renamed from: c, reason: collision with root package name */
        public final int f343928c;

        /* renamed from: d, reason: collision with root package name */
        public final int f343929d;

        /* renamed from: e, reason: collision with root package name */
        public final int f343930e;

        /* renamed from: f, reason: collision with root package name */
        public final int f343931f;

        /* renamed from: g, reason: collision with root package name */
        public final int f343932g;

        /* renamed from: h, reason: collision with root package name */
        public final int f343933h;

        /* renamed from: i, reason: collision with root package name */
        public final AudioProcessor[] f343934i;

        public f(I i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, AudioProcessor[] audioProcessorArr) {
            this.f343926a = i12;
            this.f343927b = i13;
            this.f343928c = i14;
            this.f343929d = i15;
            this.f343930e = i16;
            this.f343931f = i17;
            this.f343932g = i18;
            this.f343933h = i19;
            this.f343934i = audioProcessorArr;
        }

        @X
        public static AudioAttributes c(C36506d c36506d, boolean z12) {
            return z12 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c36506d.a().f343977a;
        }

        public final AudioTrack a(boolean z12, C36506d c36506d, int i12) throws AudioSink.InitializationException {
            int i13 = this.f343928c;
            try {
                AudioTrack audioTrackB = b(z12, c36506d, i12);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f343930e, this.f343931f, this.f343933h, this.f343926a, i13 == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e12) {
                throw new AudioSink.InitializationException(0, this.f343930e, this.f343931f, this.f343933h, this.f343926a, i13 == 1, e12);
            }
        }

        public final AudioTrack b(boolean z12, C36506d c36506d, int i12) {
            int i13 = U.f348106a;
            int i14 = this.f343932g;
            int i15 = this.f343931f;
            int i16 = this.f343930e;
            if (i13 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(c(c36506d, z12)).setAudioFormat(DefaultAudioSink.g(i16, i15, i14)).setTransferMode(1).setBufferSizeInBytes(this.f343933h).setSessionId(i12).setOffloadedPlayback(this.f343928c == 1).build();
            }
            if (i13 >= 21) {
                return new AudioTrack(c(c36506d, z12), DefaultAudioSink.g(i16, i15, i14), this.f343933h, 1, i12);
            }
            int iY2 = U.y(c36506d.f343973d);
            if (i12 == 0) {
                return new AudioTrack(iY2, this.f343930e, this.f343931f, this.f343932g, this.f343933h, 1);
            }
            return new AudioTrack(iY2, this.f343930e, this.f343931f, this.f343932g, this.f343933h, 1, i12);
        }
    }

    public static class g implements c {

        /* renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f343935a;

        /* renamed from: b, reason: collision with root package name */
        public final x f343936b;

        /* renamed from: c, reason: collision with root package name */
        public final z f343937c;

        public g(AudioProcessor... audioProcessorArr) {
            x xVar = new x();
            z zVar = new z();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f343935a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f343936b = xVar;
            this.f343937c = zVar;
            audioProcessorArr2[audioProcessorArr.length] = xVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = zVar;
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final c0 f343938a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f343939b;

        /* renamed from: c, reason: collision with root package name */
        public final long f343940c;

        /* renamed from: d, reason: collision with root package name */
        public final long f343941d;

        public h(c0 c0Var, boolean z12, long j12, long j13, a aVar) {
            this.f343938a = c0Var;
            this.f343939b = z12;
            this.f343940c = j12;
            this.f343941d = j13;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    public static final class k<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        @P
        public T f343942a;

        /* renamed from: b, reason: collision with root package name */
        public long f343943b;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void a(T t12) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f343942a == null) {
                this.f343942a = t12;
                this.f343943b = 100 + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f343943b) {
                T t13 = this.f343942a;
                if (t13 != t12) {
                    t13.addSuppressed(t12);
                }
                T t14 = this.f343942a;
                this.f343942a = null;
                throw t14;
            }
        }
    }

    public final class l implements k.a {
        public l(a aVar) {
        }
    }

    @X
    public final class m {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f343945a = new Handler();

        /* renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f343946b = new a();

        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i12) {
                C36585a.d(audioTrack == DefaultAudioSink.this.f343914u);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.a aVar = defaultAudioSink.f343911r;
                if (aVar == null || !defaultAudioSink.f343886U) {
                    return;
                }
                aVar.e();
            }

            public final void onTearDown(AudioTrack audioTrack) {
                C36585a.d(audioTrack == DefaultAudioSink.this.f343914u);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.a aVar = defaultAudioSink.f343911r;
                if (aVar == null || !defaultAudioSink.f343886U) {
                    return;
                }
                aVar.e();
            }
        }

        public m() {
        }
    }

    public DefaultAudioSink(e eVar, a aVar) {
        this.f343892a = eVar.f343923a;
        g gVar = eVar.f343924b;
        this.f343894b = gVar;
        int i12 = U.f348106a;
        this.f343896c = false;
        this.f343904k = false;
        this.f343905l = 0;
        this.f343909p = eVar.f343925c;
        this.f343901h = new ConditionVariable(true);
        this.f343902i = new com.google.android.exoplayer2.audio.k(new l(null));
        n nVar = new n();
        this.f343897d = nVar;
        B b12 = new B();
        this.f343898e = b12;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new w(), nVar, b12);
        Collections.addAll(arrayList, gVar.f343935a);
        this.f343899f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f343900g = new AudioProcessor[]{new r()};
        this.f343875J = 1.0f;
        this.f343915v = C36506d.f343970h;
        this.f343888W = 0;
        this.f343889X = new com.google.android.exoplayer2.audio.l();
        c0 c0Var = c0.f344179e;
        this.f343917x = new h(c0Var, false, 0L, 0L, null);
        this.f343918y = c0Var;
        this.f343883R = -1;
        this.f343876K = new AudioProcessor[0];
        this.f343877L = new ByteBuffer[0];
        this.f343903j = new ArrayDeque<>();
        this.f343907n = new k<>();
        this.f343908o = new k<>();
    }

    @X
    public static AudioFormat g(int i12, int i13, int i14) {
        return new AudioFormat.Builder().setSampleRate(i12).setChannelMask(i13).setEncoding(i14).build();
    }

    public static boolean s(AudioTrack audioTrack) {
        return U.f348106a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A(c0 c0Var, boolean z12) {
        h hVarJ = j();
        if (c0Var.equals(hVarJ.f343938a) && z12 == hVarJ.f343939b) {
            return;
        }
        h hVar = new h(c0Var, z12, -9223372036854775807L, -9223372036854775807L, null);
        if (q()) {
            this.f343916w = hVar;
        } else {
            this.f343917x = hVar;
        }
    }

    public final void B(int i12) throws IllegalStateException {
        if (this.f343888W != i12) {
            this.f343888W = i12;
            this.f343887V = i12 != 0;
            f();
        }
    }

    @X
    public final void C(c0 c0Var) {
        if (q()) {
            try {
                this.f343914u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(c0Var.f344180b).setPitch(c0Var.f344181c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e12) {
                C36605v.a("Failed to set playback params", e12);
            }
            c0Var = new c0(this.f343914u.getPlaybackParams().getSpeed(), this.f343914u.getPlaybackParams().getPitch());
            float f12 = c0Var.f344180b;
            com.google.android.exoplayer2.audio.k kVar = this.f343902i;
            kVar.f344024j = f12;
            com.google.android.exoplayer2.audio.j jVar = kVar.f344020f;
            if (jVar != null) {
                jVar.a();
            }
        }
        this.f343918y = c0Var;
    }

    public final void D(com.google.android.exoplayer2.audio.l lVar) {
        if (this.f343889X.equals(lVar)) {
            return;
        }
        lVar.getClass();
        if (this.f343914u != null) {
            this.f343889X.getClass();
        }
        this.f343889X = lVar;
    }

    public final void E(c0 c0Var) {
        c0 c0Var2 = new c0(U.j(c0Var.f344180b, 0.1f, 8.0f), U.j(c0Var.f344181c, 0.1f, 8.0f));
        if (!this.f343904k || U.f348106a < 23) {
            A(c0Var2, j().f343939b);
        } else {
            C(c0Var2);
        }
    }

    public final void F(boolean z12) {
        A(j().f343938a, z12);
    }

    public final void G(float f12) {
        if (this.f343875J != f12) {
            this.f343875J = f12;
            if (q()) {
                if (U.f348106a >= 21) {
                    this.f343914u.setVolume(this.f343875J);
                    return;
                }
                AudioTrack audioTrack = this.f343914u;
                float f13 = this.f343875J;
                audioTrack.setStereoVolume(f13, f13);
            }
        }
    }

    public final boolean H() {
        if (!this.f343890Y && "audio/raw".equals(this.f343913t.f343926a.f343476m)) {
            int i12 = this.f343913t.f343926a.f343459B;
            if (this.f343896c) {
                int i13 = U.f348106a;
                if (i12 == 536870912 || i12 == 805306368 || i12 == 4) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean I(I i12, C36506d c36506d) {
        int i13;
        int iO2;
        int i14 = U.f348106a;
        if (i14 < 29 || (i13 = this.f343905l) == 0) {
            return false;
        }
        String str = i12.f343476m;
        str.getClass();
        int iD2 = com.google.android.exoplayer2.util.z.d(str, i12.f343473j);
        if (iD2 == 0 || (iO2 = U.o(i12.f343489z)) == 0) {
            return false;
        }
        AudioFormat audioFormatG = g(i12.f343458A, iO2, iD2);
        AudioAttributes audioAttributes = c36506d.a().f343977a;
        int playbackOffloadSupport = i14 >= 31 ? AudioManager.getPlaybackOffloadSupport(audioFormatG, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(audioFormatG, audioAttributes) ? 0 : (i14 == 30 && U.f348109d.startsWith("Pixel")) ? 2 : 1;
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((i12.f343460C != 0 || i12.f343461D != 0) && (i13 == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(java.nio.ByteBuffer r13, long r14) throws com.google.android.exoplayer2.audio.AudioSink.WriteException, T {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.J(java.nio.ByteBuffer, long):void");
    }

    public final void a(long j12) {
        c0 c0Var;
        boolean z12;
        boolean zH2 = H();
        g gVar = this.f343894b;
        if (zH2) {
            c0Var = j().f343938a;
            gVar.getClass();
            float f12 = c0Var.f344180b;
            z zVar = gVar.f343937c;
            if (zVar.f344137c != f12) {
                zVar.f344137c = f12;
                zVar.f344143i = true;
            }
            float f13 = zVar.f344138d;
            float f14 = c0Var.f344181c;
            if (f13 != f14) {
                zVar.f344138d = f14;
                zVar.f344143i = true;
            }
        } else {
            c0Var = c0.f344179e;
        }
        c0 c0Var2 = c0Var;
        int i12 = 0;
        if (H()) {
            z12 = j().f343939b;
            gVar.f343936b.f344106m = z12;
        } else {
            z12 = false;
        }
        this.f343903j.add(new h(c0Var2, z12, Math.max(0L, j12), (m() * 1000000) / this.f343913t.f343930e, null));
        AudioProcessor[] audioProcessorArr = this.f343913t.f343934i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f343876K = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f343877L = new ByteBuffer[size];
        while (true) {
            AudioProcessor[] audioProcessorArr2 = this.f343876K;
            if (i12 >= audioProcessorArr2.length) {
                break;
            }
            AudioProcessor audioProcessor2 = audioProcessorArr2[i12];
            audioProcessor2.flush();
            this.f343877L[i12] = audioProcessor2.f();
            i12++;
        }
        AudioSink.a aVar = this.f343911r;
        if (aVar != null) {
            aVar.onSkipSilenceEnabledChanged(z12);
        }
    }

    public final void b(I i12, @P int[] iArr) throws AudioSink.ConfigurationException {
        int i13;
        int iIntValue;
        int iIntValue2;
        AudioProcessor[] audioProcessorArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int iW2;
        AudioProcessor[] audioProcessorArr2;
        int i18;
        int iK2;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(i12.f343476m);
        int i19 = i12.f343458A;
        int i22 = i12.f343489z;
        if (zEquals) {
            int i23 = i12.f343459B;
            C36585a.b(U.F(i23));
            int iW3 = U.w(i23, i22);
            AudioProcessor[] audioProcessorArr3 = (this.f343896c && (i23 == 536870912 || i23 == 805306368 || i23 == 4)) ? this.f343900g : this.f343899f;
            int i24 = i12.f343460C;
            B b12 = this.f343898e;
            b12.f343859i = i24;
            b12.f343860j = i12.f343461D;
            if (U.f348106a < 21 && i22 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i25 = 0; i25 < 6; i25++) {
                    iArr2[i25] = i25;
                }
            } else {
                iArr2 = iArr;
            }
            this.f343897d.f344048i = iArr2;
            AudioProcessor.a aVar = new AudioProcessor.a(i19, i22, i23);
            for (AudioProcessor audioProcessor : audioProcessorArr3) {
                try {
                    AudioProcessor.a aVarB = audioProcessor.b(aVar);
                    if (audioProcessor.isActive()) {
                        aVar = aVarB;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e12) {
                    throw new AudioSink.ConfigurationException(e12, i12);
                }
            }
            int i26 = aVar.f343850c;
            int i27 = aVar.f343849b;
            int iO2 = U.o(i27);
            iW2 = U.w(i26, i27);
            audioProcessorArr = audioProcessorArr3;
            i13 = iW3;
            i16 = iO2;
            i17 = aVar.f343848a;
            i15 = i26;
            i14 = 0;
        } else {
            AudioProcessor[] audioProcessorArr4 = new AudioProcessor[0];
            i13 = -1;
            if (I(i12, this.f343915v)) {
                String str = i12.f343476m;
                str.getClass();
                iIntValue = com.google.android.exoplayer2.util.z.d(str, i12.f343473j);
                iIntValue2 = U.o(i22);
                audioProcessorArr = audioProcessorArr4;
                i14 = 1;
            } else {
                Pair<Integer, Integer> pairB = this.f343892a.b(i12);
                if (pairB == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + i12, i12);
                }
                iIntValue = ((Integer) pairB.first).intValue();
                iIntValue2 = ((Integer) pairB.second).intValue();
                audioProcessorArr = audioProcessorArr4;
                i14 = 2;
            }
            i15 = iIntValue;
            i16 = iIntValue2;
            i17 = i19;
            iW2 = -1;
        }
        p pVar = this.f343909p;
        int minBufferSize = AudioTrack.getMinBufferSize(i17, i16, i15);
        C36585a.d(minBufferSize != -2);
        double d12 = this.f343904k ? 8.0d : 1.0d;
        pVar.getClass();
        if (i14 == 0) {
            audioProcessorArr2 = audioProcessorArr;
            long j12 = i17;
            int i28 = i14;
            long j13 = iW2;
            i18 = i28;
            iK2 = U.k(minBufferSize * 4, com.google.common.primitives.l.b(((250000 * j12) * j13) / 1000000), com.google.common.primitives.l.b(((750000 * j12) * j13) / 1000000));
        } else if (i14 == 1) {
            audioProcessorArr2 = audioProcessorArr;
            iK2 = com.google.common.primitives.l.b((50000000 * p.a(i15)) / 1000000);
            i18 = i14;
        } else {
            if (i14 != 2) {
                throw new IllegalArgumentException();
            }
            iK2 = com.google.common.primitives.l.b(((i15 == 5 ? 500000 : 250000) * p.a(i15)) / 1000000);
            i18 = i14;
            audioProcessorArr2 = audioProcessorArr;
        }
        int iMax = (((Math.max(minBufferSize, (int) (iK2 * d12)) + iW2) - 1) / iW2) * iW2;
        if (i15 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i18 + ") for: " + i12, i12);
        }
        if (i16 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i18 + ") for: " + i12, i12);
        }
        this.f343893a0 = false;
        f fVar = new f(i12, i13, i18, iW2, i17, i16, i15, iMax, audioProcessorArr2);
        if (q()) {
            this.f343912s = fVar;
        } else {
            this.f343913t = fVar;
        }
    }

    public final void c() throws IllegalStateException {
        if (this.f343890Y) {
            this.f343890Y = false;
            f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() throws com.google.android.exoplayer2.audio.AudioSink.WriteException, T {
        /*
            r9 = this;
            int r0 = r9.f343883R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f343883R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f343883R
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.f343876K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.h()
        L1f:
            r9.x(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.f343883R
            int r0 = r0 + r1
            r9.f343883R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f343880O
            if (r0 == 0) goto L3b
            r9.J(r0, r7)
            java.nio.ByteBuffer r0 = r9.f343880O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.f343883R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.d():boolean");
    }

    public final void e() throws IllegalStateException {
        C36585a.d(U.f348106a >= 21);
        C36585a.d(this.f343887V);
        if (this.f343890Y) {
            return;
        }
        this.f343890Y = true;
        f();
    }

    public final void f() throws IllegalStateException {
        if (q()) {
            this.f343867B = 0L;
            this.f343868C = 0L;
            this.f343869D = 0L;
            this.f343870E = 0L;
            this.f343895b0 = false;
            this.f343871F = 0;
            this.f343917x = new h(j().f343938a, j().f343939b, 0L, 0L, null);
            this.f343874I = 0L;
            this.f343916w = null;
            this.f343903j.clear();
            this.f343878M = null;
            this.f343879N = 0;
            this.f343880O = null;
            this.f343885T = false;
            this.f343884S = false;
            this.f343883R = -1;
            this.f343919z = null;
            this.f343866A = 0;
            this.f343898e.f343865o = 0L;
            int i12 = 0;
            while (true) {
                AudioProcessor[] audioProcessorArr = this.f343876K;
                if (i12 >= audioProcessorArr.length) {
                    break;
                }
                AudioProcessor audioProcessor = audioProcessorArr[i12];
                audioProcessor.flush();
                this.f343877L[i12] = audioProcessor.f();
                i12++;
            }
            com.google.android.exoplayer2.audio.k kVar = this.f343902i;
            AudioTrack audioTrack = kVar.f344017c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f343914u.pause();
            }
            if (s(this.f343914u)) {
                m mVar = this.f343906m;
                mVar.getClass();
                this.f343914u.unregisterStreamEventCallback(mVar.f343946b);
                mVar.f343945a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.f343914u;
            this.f343914u = null;
            if (U.f348106a < 21 && !this.f343887V) {
                this.f343888W = 0;
            }
            f fVar = this.f343912s;
            if (fVar != null) {
                this.f343913t = fVar;
                this.f343912s = null;
            }
            kVar.f344026l = 0L;
            kVar.f344037w = 0;
            kVar.f344036v = 0;
            kVar.f344027m = 0L;
            kVar.f344011C = 0L;
            kVar.f344014F = 0L;
            kVar.f344025k = false;
            kVar.f344017c = null;
            kVar.f344020f = null;
            this.f343901h.close();
            new a(audioTrack2).start();
        }
        this.f343908o.f343942a = null;
        this.f343907n.f343942a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(boolean r30) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.h(boolean):long");
    }

    public final int i(I i12) {
        if (!"audio/raw".equals(i12.f343476m)) {
            return ((this.f343893a0 || !I(i12, this.f343915v)) && this.f343892a.b(i12) == null) ? 0 : 2;
        }
        int i13 = i12.f343459B;
        if (U.F(i13)) {
            return (i13 == 2 || (this.f343896c && i13 == 4)) ? 2 : 1;
        }
        return 0;
    }

    public final h j() {
        h hVar = this.f343916w;
        if (hVar != null) {
            return hVar;
        }
        ArrayDeque<h> arrayDeque = this.f343903j;
        return !arrayDeque.isEmpty() ? arrayDeque.getLast() : this.f343917x;
    }

    public final c0 k() {
        return this.f343904k ? this.f343918y : j().f343938a;
    }

    public final long l() {
        return this.f343913t.f343928c == 0 ? this.f343867B / r0.f343927b : this.f343868C;
    }

    public final long m() {
        return this.f343913t.f343928c == 0 ? this.f343869D / r0.f343929d : this.f343870E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        if (r5.a() == 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.nio.ByteBuffer r23, long r24, int r26) throws java.lang.IllegalStateException, com.google.android.exoplayer2.audio.AudioSink.WriteException, T, com.google.android.exoplayer2.audio.AudioSink.InitializationException {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.n(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean o() {
        return q() && this.f343902i.b(m());
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.p():void");
    }

    public final boolean q() {
        return this.f343914u != null;
    }

    public final boolean r() {
        return !q() || (this.f343884S && !o());
    }

    public final void t() throws IllegalStateException {
        this.f343886U = false;
        if (q()) {
            com.google.android.exoplayer2.audio.k kVar = this.f343902i;
            kVar.f344026l = 0L;
            kVar.f344037w = 0;
            kVar.f344036v = 0;
            kVar.f344027m = 0L;
            kVar.f344011C = 0L;
            kVar.f344014F = 0L;
            kVar.f344025k = false;
            if (kVar.f344038x == -9223372036854775807L) {
                com.google.android.exoplayer2.audio.j jVar = kVar.f344020f;
                jVar.getClass();
                jVar.a();
                this.f343914u.pause();
            }
        }
    }

    public final void u() throws IllegalStateException {
        this.f343886U = true;
        if (q()) {
            com.google.android.exoplayer2.audio.j jVar = this.f343902i.f344020f;
            jVar.getClass();
            jVar.a();
            this.f343914u.play();
        }
    }

    public final void v() throws IllegalStateException {
        if (this.f343885T) {
            return;
        }
        this.f343885T = true;
        long jM2 = m();
        com.google.android.exoplayer2.audio.k kVar = this.f343902i;
        kVar.f344040z = kVar.a();
        kVar.f344038x = SystemClock.elapsedRealtime() * 1000;
        kVar.f344009A = jM2;
        this.f343914u.stop();
        this.f343866A = 0;
    }

    public final void w() throws IllegalStateException {
        if (!this.f343884S && q() && d()) {
            v();
            this.f343884S = true;
        }
    }

    public final void x(long j12) throws AudioSink.WriteException, T {
        ByteBuffer byteBuffer;
        int length = this.f343876K.length;
        int i12 = length;
        while (i12 >= 0) {
            if (i12 > 0) {
                byteBuffer = this.f343877L[i12 - 1];
            } else {
                byteBuffer = this.f343878M;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f343846a;
                }
            }
            if (i12 == length) {
                J(byteBuffer, j12);
            } else {
                AudioProcessor audioProcessor = this.f343876K[i12];
                if (i12 > this.f343883R) {
                    audioProcessor.g(byteBuffer);
                }
                ByteBuffer byteBufferF = audioProcessor.f();
                this.f343877L[i12] = byteBufferF;
                if (byteBufferF.hasRemaining()) {
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

    public final void y() throws IllegalStateException {
        f();
        for (AudioProcessor audioProcessor : this.f343899f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f343900g) {
            audioProcessor2.reset();
        }
        this.f343886U = false;
        this.f343893a0 = false;
    }

    public final void z(C36506d c36506d) throws IllegalStateException {
        if (this.f343915v.equals(c36506d)) {
            return;
        }
        this.f343915v = c36506d;
        if (this.f343890Y) {
            return;
        }
        f();
    }
}
