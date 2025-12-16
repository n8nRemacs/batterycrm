package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23092f;
import androidx.media3.common.C23108t;
import androidx.media3.common.D;
import androidx.media3.common.G;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23118i;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.J;
import androidx.media3.common.util.L;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.audio.j;
import androidx.media3.exoplayer.audio.p;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.C37414t3;
import com.google.common.collect.O4;
import j.B;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@J
/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* renamed from: g0, reason: collision with root package name */
    public static final Object f48767g0 = new Object();

    /* renamed from: h0, reason: collision with root package name */
    @B
    @P
    public static ExecutorService f48768h0;

    /* renamed from: i0, reason: collision with root package name */
    @B
    public static int f48769i0;

    /* renamed from: A, reason: collision with root package name */
    public j f48770A;

    /* renamed from: B, reason: collision with root package name */
    public G f48771B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f48772C;

    /* renamed from: D, reason: collision with root package name */
    @P
    public ByteBuffer f48773D;

    /* renamed from: E, reason: collision with root package name */
    public int f48774E;

    /* renamed from: F, reason: collision with root package name */
    public long f48775F;

    /* renamed from: G, reason: collision with root package name */
    public long f48776G;

    /* renamed from: H, reason: collision with root package name */
    public long f48777H;

    /* renamed from: I, reason: collision with root package name */
    public long f48778I;

    /* renamed from: J, reason: collision with root package name */
    public int f48779J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f48780K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f48781L;

    /* renamed from: M, reason: collision with root package name */
    public long f48782M;

    /* renamed from: N, reason: collision with root package name */
    public float f48783N;

    /* renamed from: O, reason: collision with root package name */
    @P
    public ByteBuffer f48784O;

    /* renamed from: P, reason: collision with root package name */
    public int f48785P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    public ByteBuffer f48786Q;

    /* renamed from: R, reason: collision with root package name */
    public byte[] f48787R;

    /* renamed from: S, reason: collision with root package name */
    public int f48788S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f48789T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f48790U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f48791V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f48792W;

    /* renamed from: X, reason: collision with root package name */
    public int f48793X;

    /* renamed from: Y, reason: collision with root package name */
    public C23092f f48794Y;

    /* renamed from: Z, reason: collision with root package name */
    @P
    public d f48795Z;

    /* renamed from: a, reason: collision with root package name */
    @P
    public final Context f48796a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f48797a0;

    /* renamed from: b, reason: collision with root package name */
    public final i f48798b;

    /* renamed from: b0, reason: collision with root package name */
    public long f48799b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48800c;

    /* renamed from: c0, reason: collision with root package name */
    public long f48801c0;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.l f48802d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f48803d0;

    /* renamed from: e, reason: collision with root package name */
    public final x f48804e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f48805e0;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC37401r1<AudioProcessor> f48806f;

    /* renamed from: f0, reason: collision with root package name */
    @P
    public Looper f48807f0;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC37401r1<AudioProcessor> f48808g;

    /* renamed from: h, reason: collision with root package name */
    public final C23118i f48809h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.j f48810i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque<j> f48811j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f48812k;

    /* renamed from: l, reason: collision with root package name */
    public final int f48813l;

    /* renamed from: m, reason: collision with root package name */
    public o f48814m;

    /* renamed from: n, reason: collision with root package name */
    public final m<AudioSink.InitializationException> f48815n;

    /* renamed from: o, reason: collision with root package name */
    public final m<AudioSink.WriteException> f48816o;

    /* renamed from: p, reason: collision with root package name */
    public final p f48817p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public androidx.media3.exoplayer.analytics.w f48818q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public AudioSink.a f48819r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public h f48820s;

    /* renamed from: t, reason: collision with root package name */
    public h f48821t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.media3.common.audio.a f48822u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public AudioTrack f48823v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.media3.exoplayer.audio.a f48824w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.media3.exoplayer.audio.b f48825x;

    /* renamed from: y, reason: collision with root package name */
    public C23091e f48826y;

    /* renamed from: z, reason: collision with root package name */
    @P
    public j f48827z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException(String str, a aVar) {
            super(str);
        }
    }

    @X
    public static final class b {
        @InterfaceC42164u
        public static void a(AudioTrack audioTrack, @P d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f48828a);
        }
    }

    @X
    public static final class c {
        @InterfaceC42164u
        public static void a(AudioTrack audioTrack, androidx.media3.exoplayer.analytics.w wVar) {
            LogSessionId logSessionIdA = wVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    @X
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioDeviceInfo f48828a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f48828a = audioDeviceInfo;
        }
    }

    @Deprecated
    public interface e extends androidx.media3.common.audio.b {
    }

    public interface f {

        /* renamed from: a, reason: collision with root package name */
        public static final p f48829a;

        static {
            new p.a();
            f48829a = new p();
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final C23108t f48834a;

        /* renamed from: b, reason: collision with root package name */
        public final int f48835b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48836c;

        /* renamed from: d, reason: collision with root package name */
        public final int f48837d;

        /* renamed from: e, reason: collision with root package name */
        public final int f48838e;

        /* renamed from: f, reason: collision with root package name */
        public final int f48839f;

        /* renamed from: g, reason: collision with root package name */
        public final int f48840g;

        /* renamed from: h, reason: collision with root package name */
        public final int f48841h;

        /* renamed from: i, reason: collision with root package name */
        public final androidx.media3.common.audio.a f48842i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f48843j;

        public h(C23108t c23108t, int i12, int i13, int i14, int i15, int i16, int i17, int i18, androidx.media3.common.audio.a aVar, boolean z12) {
            this.f48834a = c23108t;
            this.f48835b = i12;
            this.f48836c = i13;
            this.f48837d = i14;
            this.f48838e = i15;
            this.f48839f = i16;
            this.f48840g = i17;
            this.f48841h = i18;
            this.f48842i = aVar;
            this.f48843j = z12;
        }

        @X
        public static AudioAttributes c(C23091e c23091e, boolean z12) {
            return z12 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c23091e.a().f47657a;
        }

        public final AudioTrack a(boolean z12, C23091e c23091e, int i12) throws AudioSink.InitializationException {
            int i13 = this.f48836c;
            try {
                AudioTrack audioTrackB = b(z12, c23091e, i12);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f48838e, this.f48839f, this.f48841h, this.f48834a, i13 == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e12) {
                throw new AudioSink.InitializationException(0, this.f48838e, this.f48839f, this.f48841h, this.f48834a, i13 == 1, e12);
            }
        }

        public final AudioTrack b(boolean z12, C23091e c23091e, int i12) {
            int i13;
            int i14;
            int i15 = M.f47887a;
            int i16 = this.f48840g;
            int i17 = this.f48839f;
            int i18 = this.f48838e;
            if (i15 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(c(c23091e, z12)).setAudioFormat(DefaultAudioSink.i(i18, i17, i16)).setTransferMode(1).setBufferSizeInBytes(this.f48841h).setSessionId(i12).setOffloadedPlayback(this.f48836c == 1).build();
            }
            if (i15 >= 21) {
                return new AudioTrack(c(c23091e, z12), DefaultAudioSink.i(i18, i17, i16), this.f48841h, 1, i12);
            }
            int i19 = c23091e.f47653d;
            if (i19 != 13) {
                switch (i19) {
                    case 2:
                        i13 = 0;
                        break;
                    case 3:
                        i14 = 8;
                        i13 = i14;
                        break;
                    case 4:
                        i14 = 4;
                        i13 = i14;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i14 = 5;
                        i13 = i14;
                        break;
                    case 6:
                        i14 = 2;
                        i13 = i14;
                        break;
                    default:
                        i14 = 3;
                        i13 = i14;
                        break;
                }
            } else {
                i13 = 1;
            }
            if (i12 == 0) {
                return new AudioTrack(i13, this.f48838e, this.f48839f, this.f48840g, this.f48841h, 1);
            }
            return new AudioTrack(i13, this.f48838e, this.f48839f, this.f48840g, this.f48841h, 1, i12);
        }
    }

    public static class i implements e {

        /* renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f48844a;

        /* renamed from: b, reason: collision with root package name */
        public final t f48845b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.audio.g f48846c;

        public i(AudioProcessor... audioProcessorArr) {
            t tVar = new t();
            androidx.media3.common.audio.g gVar = new androidx.media3.common.audio.g();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f48844a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f48845b = tVar;
            this.f48846c = gVar;
            audioProcessorArr2[audioProcessorArr.length] = tVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = gVar;
        }
    }

    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final G f48847a;

        /* renamed from: b, reason: collision with root package name */
        public final long f48848b;

        /* renamed from: c, reason: collision with root package name */
        public final long f48849c;

        public j(G g12, long j12, long j13, a aVar) {
            this.f48847a = g12;
            this.f48848b = j12;
            this.f48849c = j13;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    public static final class m<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        @P
        public T f48850a;

        /* renamed from: b, reason: collision with root package name */
        public long f48851b;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void a(T t12) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f48850a == null) {
                this.f48850a = t12;
                this.f48851b = 100 + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f48851b) {
                T t13 = this.f48850a;
                if (t13 != t12) {
                    t13.addSuppressed(t12);
                }
                T t14 = this.f48850a;
                this.f48850a = null;
                throw t14;
            }
        }
    }

    public final class n implements j.a {
        public n(a aVar) {
        }
    }

    @X
    public final class o {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f48853a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f48854b = new a();

        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i12) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.a aVar;
                if (audioTrack.equals(DefaultAudioSink.this.f48823v) && (aVar = (defaultAudioSink = DefaultAudioSink.this).f48819r) != null && defaultAudioSink.f48791V) {
                    aVar.e();
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.a aVar;
                if (audioTrack.equals(DefaultAudioSink.this.f48823v) && (aVar = (defaultAudioSink = DefaultAudioSink.this).f48819r) != null && defaultAudioSink.f48791V) {
                    aVar.e();
                }
            }
        }

        public o() {
        }
    }

    public DefaultAudioSink(g gVar, a aVar) {
        Context context = gVar.f48830a;
        this.f48796a = context;
        this.f48824w = context != null ? androidx.media3.exoplayer.audio.a.b(context) : gVar.f48831b;
        this.f48798b = gVar.f48832c;
        int i12 = M.f47887a;
        this.f48800c = false;
        this.f48812k = false;
        this.f48813l = 0;
        this.f48817p = gVar.f48833d;
        C23118i c23118i = new C23118i(InterfaceC23115f.f47901a);
        this.f48809h = c23118i;
        c23118i.d();
        this.f48810i = new androidx.media3.exoplayer.audio.j(new n(null));
        androidx.media3.exoplayer.audio.l lVar = new androidx.media3.exoplayer.audio.l();
        this.f48802d = lVar;
        x xVar = new x();
        this.f48804e = xVar;
        androidx.media3.common.audio.h hVar = new androidx.media3.common.audio.h();
        O4<Object> o42 = AbstractC37401r1.f359977c;
        Object[] objArr = {hVar, lVar, xVar};
        C37414t3.a(3, objArr);
        this.f48806f = AbstractC37401r1.r(3, objArr);
        this.f48808g = AbstractC37401r1.E(new w());
        this.f48783N = 1.0f;
        this.f48826y = C23091e.f47644h;
        this.f48793X = 0;
        this.f48794Y = new C23092f();
        G g12 = G.f47232e;
        this.f48770A = new j(g12, 0L, 0L, null);
        this.f48771B = g12;
        this.f48772C = false;
        this.f48811j = new ArrayDeque<>();
        this.f48815n = new m<>();
        this.f48816o = new m<>();
    }

    @X
    public static AudioFormat i(int i12, int i13, int i14) {
        return new AudioFormat.Builder().setSampleRate(i12).setChannelMask(i13).setEncoding(i14).build();
    }

    public static boolean s(AudioTrack audioTrack) {
        return M.f47887a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A(int i12) throws IllegalStateException {
        if (this.f48793X != i12) {
            this.f48793X = i12;
            this.f48792W = i12 != 0;
            g();
        }
    }

    @X
    public final void B() {
        if (q()) {
            try {
                this.f48823v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f48771B.f47236b).setPitch(this.f48771B.f47237c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e12) {
                androidx.media3.common.util.s.h("Failed to set playback params", e12);
            }
            G g12 = new G(this.f48823v.getPlaybackParams().getSpeed(), this.f48823v.getPlaybackParams().getPitch());
            this.f48771B = g12;
            float f12 = g12.f47236b;
            androidx.media3.exoplayer.audio.j jVar = this.f48810i;
            jVar.f48924j = f12;
            androidx.media3.exoplayer.audio.i iVar = jVar.f48920f;
            if (iVar != null) {
                iVar.a();
            }
            jVar.d();
        }
    }

    public final void C(C23092f c23092f) {
        if (this.f48794Y.equals(c23092f)) {
            return;
        }
        c23092f.getClass();
        if (this.f48823v != null) {
            this.f48794Y.getClass();
        }
        this.f48794Y = c23092f;
    }

    public final void D(G g12) {
        this.f48771B = new G(M.j(g12.f47236b, 0.1f, 8.0f), M.j(g12.f47237c, 0.1f, 8.0f));
        if (G()) {
            B();
            return;
        }
        j jVar = new j(g12, -9223372036854775807L, -9223372036854775807L, null);
        if (q()) {
            this.f48827z = jVar;
        } else {
            this.f48770A = jVar;
        }
    }

    public final void E(boolean z12) {
        this.f48772C = z12;
        j jVar = new j(G() ? G.f47232e : this.f48771B, -9223372036854775807L, -9223372036854775807L, null);
        if (q()) {
            this.f48827z = jVar;
        } else {
            this.f48770A = jVar;
        }
    }

    public final void F(float f12) {
        if (this.f48783N != f12) {
            this.f48783N = f12;
            if (q()) {
                if (M.f47887a >= 21) {
                    this.f48823v.setVolume(this.f48783N);
                    return;
                }
                AudioTrack audioTrack = this.f48823v;
                float f13 = this.f48783N;
                audioTrack.setStereoVolume(f13, f13);
            }
        }
    }

    public final boolean G() {
        h hVar = this.f48821t;
        return hVar != null && hVar.f48843j && M.f47887a >= 23;
    }

    public final boolean H(C23091e c23091e, C23108t c23108t) {
        int i12;
        int iP2;
        int i13 = M.f47887a;
        if (i13 < 29 || (i12 = this.f48813l) == 0) {
            return false;
        }
        String str = c23108t.f47757m;
        str.getClass();
        int iB2 = D.b(str, c23108t.f47754j);
        if (iB2 == 0 || (iP2 = M.p(c23108t.f47770z)) == 0) {
            return false;
        }
        AudioFormat audioFormatI = i(c23108t.f47737A, iP2, iB2);
        AudioAttributes audioAttributes = c23091e.a().f47657a;
        int playbackOffloadSupport = i13 >= 31 ? AudioManager.getPlaybackOffloadSupport(audioFormatI, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(audioFormatI, audioAttributes) ? 0 : (i13 == 30 && M.f47890d.startsWith("Pixel")) ? 2 : 1;
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((c23108t.f47739C != 0 || c23108t.f47740D != 0) && (i12 == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.nio.ByteBuffer r13, long r14) throws T, androidx.media3.exoplayer.audio.AudioSink.WriteException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.I(java.nio.ByteBuffer, long):void");
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    @X
    public final void a(@P AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.f48795Z = dVar;
        AudioTrack audioTrack = this.f48823v;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r14) {
        /*
            r13 = this;
            boolean r0 = r13.G()
            androidx.media3.exoplayer.audio.DefaultAudioSink$i r1 = r13.f48798b
            r2 = 4
            r3 = 805306368(0x30000000, float:4.656613E-10)
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r5 = r13.f48800c
            if (r0 != 0) goto L4f
            boolean r0 = r13.f48797a0
            if (r0 != 0) goto L49
            androidx.media3.exoplayer.audio.DefaultAudioSink$h r0 = r13.f48821t
            int r6 = r0.f48836c
            if (r6 != 0) goto L49
            androidx.media3.common.t r0 = r0.f48834a
            int r0 = r0.f47738B
            if (r5 == 0) goto L28
            int r6 = androidx.media3.common.util.M.f47887a
            if (r0 == r4) goto L49
            if (r0 == r3) goto L49
            if (r0 != r2) goto L28
            goto L49
        L28:
            androidx.media3.common.G r0 = r13.f48771B
            r1.getClass()
            float r6 = r0.f47236b
            androidx.media3.common.audio.g r7 = r1.f48846c
            float r8 = r7.f47600c
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L3c
            r7.f47600c = r6
            r7.f47606i = r9
        L3c:
            float r6 = r7.f47601d
            float r8 = r0.f47237c
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4b
            r7.f47601d = r8
            r7.f47606i = r9
            goto L4b
        L49:
            androidx.media3.common.G r0 = androidx.media3.common.G.f47232e
        L4b:
            r13.f48771B = r0
        L4d:
            r7 = r0
            goto L52
        L4f:
            androidx.media3.common.G r0 = androidx.media3.common.G.f47232e
            goto L4d
        L52:
            boolean r0 = r13.f48797a0
            if (r0 != 0) goto L72
            androidx.media3.exoplayer.audio.DefaultAudioSink$h r0 = r13.f48821t
            int r6 = r0.f48836c
            if (r6 != 0) goto L72
            androidx.media3.common.t r0 = r0.f48834a
            int r0 = r0.f47738B
            if (r5 == 0) goto L6b
            int r5 = androidx.media3.common.util.M.f47887a
            if (r0 == r4) goto L72
            if (r0 == r3) goto L72
            if (r0 != r2) goto L6b
            goto L72
        L6b:
            boolean r0 = r13.f48772C
            androidx.media3.exoplayer.audio.t r1 = r1.f48845b
            r1.f48992m = r0
            goto L73
        L72:
            r0 = 0
        L73:
            r13.f48772C = r0
            java.util.ArrayDeque<androidx.media3.exoplayer.audio.DefaultAudioSink$j> r0 = r13.f48811j
            androidx.media3.exoplayer.audio.DefaultAudioSink$j r1 = new androidx.media3.exoplayer.audio.DefaultAudioSink$j
            r2 = 0
            long r8 = java.lang.Math.max(r2, r14)
            androidx.media3.exoplayer.audio.DefaultAudioSink$h r14 = r13.f48821t
            long r2 = r13.m()
            int r14 = r14.f48838e
            long r10 = androidx.media3.common.util.M.J(r14, r2)
            r12 = 0
            r6 = r1
            r6.<init>(r7, r8, r10, r12)
            r0.add(r1)
            androidx.media3.exoplayer.audio.DefaultAudioSink$h r14 = r13.f48821t
            androidx.media3.common.audio.a r14 = r14.f48842i
            r13.f48822u = r14
            r14.b()
            androidx.media3.exoplayer.audio.AudioSink$a r14 = r13.f48819r
            if (r14 == 0) goto La5
            boolean r15 = r13.f48772C
            r14.onSkipSilenceEnabledChanged(r15)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.b(long):void");
    }

    public final void c(C23108t c23108t, @P int[] iArr) throws AudioSink.ConfigurationException {
        int iIntValue;
        androidx.media3.common.audio.a aVar;
        int i12;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iV2;
        boolean z13;
        int i17;
        androidx.media3.common.audio.a aVar2;
        int i18;
        int i19;
        int iK2;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(c23108t.f47757m);
        boolean z14 = this.f48812k;
        int i22 = c23108t.f47737A;
        int i23 = c23108t.f47770z;
        if (zEquals) {
            int i24 = c23108t.f47738B;
            C23110a.b(M.C(i24));
            int iV3 = M.v(i24, i23);
            AbstractC37401r1.a aVar3 = new AbstractC37401r1.a();
            if (this.f48800c && (i24 == 536870912 || i24 == 805306368 || i24 == 4)) {
                aVar3.e(this.f48808g);
            } else {
                aVar3.e(this.f48806f);
                aVar3.h(this.f48798b.f48844a);
            }
            aVar = new androidx.media3.common.audio.a(aVar3.i());
            if (aVar.equals(this.f48822u)) {
                aVar = this.f48822u;
            }
            int i25 = c23108t.f47739C;
            x xVar = this.f48804e;
            xVar.f49001i = i25;
            xVar.f49002j = c23108t.f47740D;
            if (M.f47887a < 21 && i23 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i26 = 0; i26 < 6; i26++) {
                    iArr2[i26] = i26;
                }
            } else {
                iArr2 = iArr;
            }
            this.f48802d.f48941i = iArr2;
            try {
                AudioProcessor.a aVarA = aVar.a(new AudioProcessor.a(i22, i23, i24));
                int i27 = aVarA.f47562b;
                int iP2 = M.p(i27);
                i14 = aVarA.f47563c;
                iV2 = M.v(i14, i27);
                z12 = z14;
                i13 = iV3;
                i15 = iP2;
                i16 = aVarA.f47561a;
                i12 = 0;
            } catch (AudioProcessor.UnhandledAudioFormatException e12) {
                throw new AudioSink.ConfigurationException(e12, c23108t);
            }
        } else {
            androidx.media3.common.audio.a aVar4 = new androidx.media3.common.audio.a(AbstractC37401r1.C());
            if (H(this.f48826y, c23108t)) {
                String str = c23108t.f47757m;
                str.getClass();
                int iB2 = D.b(str, c23108t.f47754j);
                iIntValue = M.p(i23);
                aVar = aVar4;
                i14 = iB2;
                i13 = -1;
                i12 = 1;
                z12 = true;
            } else {
                Pair<Integer, Integer> pairD = h().d(c23108t);
                if (pairD == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + c23108t, c23108t);
                }
                int iIntValue2 = ((Integer) pairD.first).intValue();
                iIntValue = ((Integer) pairD.second).intValue();
                aVar = aVar4;
                i12 = 2;
                z12 = z14;
                i13 = -1;
                i14 = iIntValue2;
            }
            i15 = iIntValue;
            i16 = i22;
            iV2 = i13;
        }
        if (i14 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i12 + ") for: " + c23108t, c23108t);
        }
        if (i15 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i12 + ") for: " + c23108t, c23108t);
        }
        p pVar = this.f48817p;
        int minBufferSize = AudioTrack.getMinBufferSize(i16, i15, i14);
        C23110a.g(minBufferSize != -2);
        int i28 = iV2 != -1 ? iV2 : 1;
        double d12 = z12 ? 8.0d : 1.0d;
        pVar.getClass();
        if (i12 != 0) {
            if (i12 == 1) {
                z13 = z12;
                iK2 = com.google.common.primitives.l.b((50000000 * p.a(i14)) / 1000000);
            } else {
                if (i12 != 2) {
                    throw new IllegalArgumentException();
                }
                z13 = z12;
                iK2 = com.google.common.primitives.l.b(((i14 == 5 ? 500000 : 250000) * (c23108t.f47753i != -1 ? com.google.common.math.f.a(r2, 8, RoundingMode.CEILING) : p.a(i14))) / 1000000);
            }
            i18 = i16;
            i19 = i15;
            i17 = i14;
            aVar2 = aVar;
        } else {
            z13 = z12;
            i17 = i14;
            aVar2 = aVar;
            long j12 = i16;
            i18 = i16;
            i19 = i15;
            long j13 = i28;
            iK2 = M.k(minBufferSize * 4, com.google.common.primitives.l.b(((250000 * j12) * j13) / 1000000), com.google.common.primitives.l.b(((750000 * j12) * j13) / 1000000));
        }
        int iMax = (((Math.max(minBufferSize, (int) (iK2 * d12)) + i28) - 1) / i28) * i28;
        this.f48803d0 = false;
        h hVar = new h(c23108t, i13, i12, iV2, i18, i19, i17, iMax, aVar2, z13);
        if (q()) {
            this.f48820s = hVar;
        } else {
            this.f48821t = hVar;
        }
    }

    public final void d() throws IllegalStateException {
        if (this.f48797a0) {
            this.f48797a0 = false;
            g();
        }
    }

    public final boolean e() throws T, AudioSink.WriteException {
        if (!this.f48822u.e()) {
            ByteBuffer byteBuffer = this.f48786Q;
            if (byteBuffer == null) {
                return true;
            }
            I(byteBuffer, Long.MIN_VALUE);
            return this.f48786Q == null;
        }
        androidx.media3.common.audio.a aVar = this.f48822u;
        if (aVar.e() && !aVar.f47568d) {
            aVar.f47568d = true;
            ((AudioProcessor) aVar.f47566b.get(0)).h();
        }
        x(Long.MIN_VALUE);
        if (!this.f48822u.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f48786Q;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final void f() throws IllegalStateException {
        C23110a.g(M.f47887a >= 21);
        C23110a.g(this.f48792W);
        if (this.f48797a0) {
            return;
        }
        this.f48797a0 = true;
        g();
    }

    public final void g() throws IllegalStateException {
        if (q()) {
            this.f48775F = 0L;
            this.f48776G = 0L;
            this.f48777H = 0L;
            this.f48778I = 0L;
            this.f48805e0 = false;
            this.f48779J = 0;
            this.f48770A = new j(this.f48771B, 0L, 0L, null);
            this.f48782M = 0L;
            this.f48827z = null;
            this.f48811j.clear();
            this.f48784O = null;
            this.f48785P = 0;
            this.f48786Q = null;
            this.f48790U = false;
            this.f48789T = false;
            this.f48773D = null;
            this.f48774E = 0;
            this.f48804e.f49007o = 0L;
            androidx.media3.common.audio.a aVar = this.f48821t.f48842i;
            this.f48822u = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f48810i.f48917c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f48823v.pause();
            }
            if (s(this.f48823v)) {
                o oVar = this.f48814m;
                oVar.getClass();
                this.f48823v.unregisterStreamEventCallback(oVar.f48854b);
                oVar.f48853a.removeCallbacksAndMessages(null);
            }
            if (M.f47887a < 21 && !this.f48792W) {
                this.f48793X = 0;
            }
            h hVar = this.f48820s;
            if (hVar != null) {
                this.f48821t = hVar;
                this.f48820s = null;
            }
            androidx.media3.exoplayer.audio.j jVar = this.f48810i;
            jVar.d();
            jVar.f48917c = null;
            jVar.f48920f = null;
            AudioTrack audioTrack2 = this.f48823v;
            C23118i c23118i = this.f48809h;
            c23118i.c();
            synchronized (f48767g0) {
                try {
                    if (f48768h0 == null) {
                        f48768h0 = Executors.newSingleThreadExecutor(new L("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f48769i0++;
                    f48768h0.execute(new J11.c(12, audioTrack2, c23118i));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f48823v = null;
        }
        this.f48816o.f48850a = null;
        this.f48815n.f48850a = null;
    }

    public final androidx.media3.exoplayer.audio.a h() {
        Context context;
        androidx.media3.exoplayer.audio.a aVarC;
        b.c cVar;
        if (this.f48825x == null && (context = this.f48796a) != null) {
            this.f48807f0 = Looper.myLooper();
            androidx.media3.exoplayer.audio.b bVar = new androidx.media3.exoplayer.audio.b(context, new Ae0.c(this, 11));
            this.f48825x = bVar;
            if (bVar.f48870h) {
                aVarC = bVar.f48869g;
                aVarC.getClass();
            } else {
                bVar.f48870h = true;
                b.d dVar = bVar.f48868f;
                if (dVar != null) {
                    dVar.f48872a.registerContentObserver(dVar.f48873b, false, dVar);
                }
                int i12 = M.f47887a;
                Handler handler = bVar.f48865c;
                Context context2 = bVar.f48863a;
                if (i12 >= 23 && (cVar = bVar.f48866d) != null) {
                    b.C1825b.a(context2, cVar, handler);
                }
                BroadcastReceiver broadcastReceiver = bVar.f48867e;
                aVarC = androidx.media3.exoplayer.audio.a.c(context2, broadcastReceiver != null ? context2.registerReceiver(broadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null);
                bVar.f48869g = aVarC;
            }
            this.f48824w = aVarC;
        }
        return this.f48824w;
    }

    public final long j(boolean z12) {
        ArrayDeque<j> arrayDeque;
        long jT2;
        if (!q() || this.f48781L) {
            return Long.MIN_VALUE;
        }
        long jA2 = this.f48810i.a(z12);
        h hVar = this.f48821t;
        long jMin = Math.min(jA2, M.J(hVar.f48838e, m()));
        while (true) {
            arrayDeque = this.f48811j;
            if (arrayDeque.isEmpty() || jMin < arrayDeque.getFirst().f48849c) {
                break;
            }
            this.f48770A = arrayDeque.remove();
        }
        j jVar = this.f48770A;
        long j12 = jMin - jVar.f48849c;
        boolean zEquals = jVar.f48847a.equals(G.f47232e);
        i iVar = this.f48798b;
        if (zEquals) {
            jT2 = this.f48770A.f48848b + j12;
        } else if (arrayDeque.isEmpty()) {
            jT2 = iVar.f48846c.b(j12) + this.f48770A.f48848b;
        } else {
            j first = arrayDeque.getFirst();
            jT2 = first.f48848b - M.t(first.f48849c - jMin, this.f48770A.f48847a.f47236b);
        }
        h hVar2 = this.f48821t;
        return M.J(hVar2.f48838e, iVar.f48845b.f48999t) + jT2;
    }

    public final int k(C23108t c23108t) {
        if (!"audio/raw".equals(c23108t.f47757m)) {
            return ((this.f48803d0 || !H(this.f48826y, c23108t)) && h().d(c23108t) == null) ? 0 : 2;
        }
        int i12 = c23108t.f47738B;
        if (M.C(i12)) {
            return (i12 == 2 || (this.f48800c && i12 == 4)) ? 2 : 1;
        }
        androidx.media3.common.util.s.g();
        return 0;
    }

    public final long l() {
        return this.f48821t.f48836c == 0 ? this.f48775F / r0.f48835b : this.f48776G;
    }

    public final long m() {
        return this.f48821t.f48836c == 0 ? this.f48777H / r0.f48837d : this.f48778I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
    
        if (r5.b() == 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0324 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.nio.ByteBuffer r23, long r24, int r26) throws java.lang.IllegalStateException, T, androidx.media3.exoplayer.audio.AudioSink.WriteException, androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.n(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean o() {
        return q() && this.f48810i.c(m());
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p() throws androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.p():boolean");
    }

    public final boolean q() {
        return this.f48823v != null;
    }

    public final boolean r() {
        return !q() || (this.f48789T && !o());
    }

    public final void t() throws IllegalStateException {
        this.f48791V = false;
        if (q()) {
            androidx.media3.exoplayer.audio.j jVar = this.f48810i;
            jVar.d();
            if (jVar.f48939y == -9223372036854775807L) {
                androidx.media3.exoplayer.audio.i iVar = jVar.f48920f;
                iVar.getClass();
                iVar.a();
                this.f48823v.pause();
            }
        }
    }

    public final void u() throws IllegalStateException {
        this.f48791V = true;
        if (q()) {
            androidx.media3.exoplayer.audio.i iVar = this.f48810i.f48920f;
            iVar.getClass();
            iVar.a();
            this.f48823v.play();
        }
    }

    public final void v() throws IllegalStateException {
        if (this.f48790U) {
            return;
        }
        this.f48790U = true;
        long jM2 = m();
        androidx.media3.exoplayer.audio.j jVar = this.f48810i;
        jVar.f48908A = jVar.b();
        jVar.f48939y = SystemClock.elapsedRealtime() * 1000;
        jVar.f48909B = jM2;
        this.f48823v.stop();
        this.f48774E = 0;
    }

    public final void w() throws IllegalStateException {
        if (!this.f48789T && q() && e()) {
            v();
            this.f48789T = true;
        }
    }

    public final void x(long j12) throws T, AudioSink.WriteException {
        ByteBuffer byteBuffer;
        if (!this.f48822u.e()) {
            ByteBuffer byteBuffer2 = this.f48784O;
            if (byteBuffer2 == null) {
                byteBuffer2 = AudioProcessor.f47559a;
            }
            I(byteBuffer2, j12);
            return;
        }
        while (!this.f48822u.d()) {
            do {
                androidx.media3.common.audio.a aVar = this.f48822u;
                if (aVar.e()) {
                    ByteBuffer byteBuffer3 = aVar.f47567c[aVar.c()];
                    if (!byteBuffer3.hasRemaining()) {
                        aVar.f(AudioProcessor.f47559a);
                    }
                    byteBuffer = byteBuffer3;
                } else {
                    byteBuffer = AudioProcessor.f47559a;
                }
                if (byteBuffer.hasRemaining()) {
                    I(byteBuffer, j12);
                } else {
                    ByteBuffer byteBuffer4 = this.f48784O;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    androidx.media3.common.audio.a aVar2 = this.f48822u;
                    ByteBuffer byteBuffer5 = this.f48784O;
                    if (aVar2.e() && !aVar2.f47568d) {
                        aVar2.f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void y() throws IllegalStateException {
        g();
        O4<AudioProcessor> o4ListIterator = this.f48806f.listIterator(0);
        while (o4ListIterator.hasNext()) {
            o4ListIterator.next().reset();
        }
        O4<AudioProcessor> o4ListIterator2 = this.f48808g.listIterator(0);
        while (o4ListIterator2.hasNext()) {
            o4ListIterator2.next().reset();
        }
        androidx.media3.common.audio.a aVar = this.f48822u;
        if (aVar != null) {
            int i12 = 0;
            while (true) {
                AbstractC37401r1<AudioProcessor> abstractC37401r1 = aVar.f47565a;
                if (i12 >= abstractC37401r1.size()) {
                    break;
                }
                AudioProcessor audioProcessor = abstractC37401r1.get(i12);
                audioProcessor.flush();
                audioProcessor.reset();
                i12++;
            }
            aVar.f47567c = new ByteBuffer[0];
            AudioProcessor.a aVar2 = AudioProcessor.a.f47560e;
            aVar.f47568d = false;
        }
        this.f48791V = false;
        this.f48803d0 = false;
    }

    public final void z(C23091e c23091e) throws IllegalStateException {
        if (this.f48826y.equals(c23091e)) {
            return;
        }
        this.f48826y = c23091e;
        if (this.f48797a0) {
            return;
        }
        g();
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Context f48830a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.media3.exoplayer.audio.a f48831b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public i f48832c;

        /* renamed from: d, reason: collision with root package name */
        public final p f48833d;

        @Deprecated
        public g() {
            this.f48830a = null;
            this.f48831b = androidx.media3.exoplayer.audio.a.f48857c;
            this.f48833d = f.f48829a;
        }

        public g(Context context) {
            this.f48830a = context;
            this.f48831b = androidx.media3.exoplayer.audio.a.f48857c;
            this.f48833d = f.f48829a;
        }
    }
}
