package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Looper;
import com.google.android.exoplayer2.PlaybackException;
import java.util.Collections;
import java.util.MissingResourceException;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class fl5 implements q3c, AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int x0 = 0;
    public xd8 X;
    public f2h Y;
    public float Z = 0.0f;
    public final j1f a;
    public final vl3 b;
    public final yi5 c;
    public final zk5 d;
    public final i5i o;
    public bk0 s0;
    public int t0;
    public int u0;
    public int v0;
    public boolean w0;

    public fl5(Context context, yi5 yi5Var, zk5 zk5Var, f28 f28Var, pe8 pe8Var) throws MissingResourceException {
        this.c = yi5Var;
        this.d = zk5Var;
        ao4.a("bufferForPlaybackMs", 500, 0, "0");
        ao4.a("bufferForPlaybackAfterRebufferMs", 3000, 0, "0");
        ao4.a("minBufferMs", 7000, 500, "bufferForPlaybackMs");
        ao4.a("minBufferMs", 7000, 3000, "bufferForPlaybackAfterRebufferMs");
        ao4.a("maxBufferMs", 15000, 7000, "minBufferMs");
        ao4 ao4Var = new ao4(new qi4(), 7000, 15000, 500, 3000);
        zq4 zq4Var = new zq4(context, new u1j(12));
        oq4 oq4VarA = zq4Var.a();
        String iSO3Language = pe8Var.u().getISO3Language();
        if (iSO3Language == null) {
            oq4VarA.c(new String[0]);
        } else {
            oq4VarA.c(new String[]{iSO3Language});
        }
        fde fdeVar = new fde();
        fdeVar.a = context;
        fdeVar.b = new uha(18);
        hd5 hd5Var = hd5.a;
        fdeVar.c = hd5Var;
        fdeVar.d = hd5Var;
        gl5 gl5Var = new gl5(context, fdeVar);
        fsi.d(!gl5Var.o);
        gl5Var.e = new eo4(4, zq4Var);
        fsi.d(!gl5Var.o);
        gl5Var.f = new eo4(1, ao4Var);
        fsi.d(!gl5Var.o);
        gl5Var.o = true;
        j1f j1fVar = new j1f(gl5Var);
        this.a = j1fVar;
        j1fVar.L0();
        dm5 dm5Var = j1fVar.c;
        dm5Var.getClass();
        cb6 cb6Var = dm5Var.w0;
        cb6Var.getClass();
        ((CopyOnWriteArraySet) cb6Var.d).add(new sa8(this));
        j1fVar.L0();
        mj4 mj4Var = dm5Var.B0;
        mj4Var.getClass();
        cb6 cb6Var2 = mj4Var.X;
        cb6Var2.getClass();
        ((CopyOnWriteArraySet) cb6Var2.d).add(new sa8(this));
        vl3 vl3Var = new vl3();
        vl3Var.d = Collections.EMPTY_LIST;
        vl3Var.b = j1fVar;
        vl3Var.a = zq4Var;
        vl3Var.o = pe8Var;
        vl3Var.X = f28Var;
        vl3Var.Y = fdeVar;
        this.b = vl3Var;
        this.o = new i5i(new iq(context));
        context.registerReceiver(new eo(6, this), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    public static void c() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is NOT main!");
        }
    }

    public final void B() {
        wqi.c("fl5", "Stop", new Object[0]);
        c();
        j1f j1fVar = this.a;
        j1fVar.L0();
        dm5 dm5Var = j1fVar.c;
        dm5Var.d1();
        dm5Var.d1();
        dm5Var.H0.c(1, dm5Var.i());
        dm5Var.Y0(null);
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        xd8 xd8Var = this.X;
        if (xd8Var != null) {
            xd8Var.h();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [i3, t39] */
    @Override // defpackage.q3c
    public final void F(mfg mfgVar, vfg vfgVar) {
        ?? r1;
        c();
        if (!this.w0) {
            this.w0 = this.b.p();
        }
        xd8 xd8Var = this.X;
        if (xd8Var == null || (r1 = xd8Var.e) == 0) {
            return;
        }
        r1.Z();
    }

    public final void b(float f) {
        c();
        j1f j1fVar = this.a;
        float fA = j1fVar.a();
        j1fVar.L0();
        dm5 dm5Var = j1fVar.c;
        dm5Var.d1();
        float fH = xxg.h(f, 0.0f, 1.0f);
        if (dm5Var.d1 != fH) {
            dm5Var.d1 = fH;
            dm5Var.V0(1, 2, Float.valueOf(dm5Var.H0.e * fH));
            dm5Var.w0.j(22, new ll5(0, fH));
        }
        xd8 xd8Var = this.X;
        if (xd8Var != null && xd8Var.b.d()) {
            if (xd8Var.e()) {
                xd8Var.a();
            } else {
                xd8Var.h();
            }
        }
        if (fA > 0.0f || f <= 0.0f) {
            return;
        }
        e();
    }

    public final boolean d() {
        j1f j1fVar = this.a;
        j1fVar.L0();
        dm5 dm5Var = j1fVar.c;
        dm5Var.d1();
        int i = dm5Var.j1.e;
        if (i != 2 && i != 3) {
            return false;
        }
        j1fVar.L0();
        if (!dm5Var.i()) {
            return false;
        }
        j1fVar.L0();
        dm5Var.d1();
        return dm5Var.j1.m == 0;
    }

    public final void e() {
        if (this.a.a() <= 0.0f || !d()) {
            return;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).build();
        i5i i5iVar = this.o;
        Object obj = i5iVar.b;
        if (obj == null) {
            obj = ((frf) i5iVar.a).get();
            i5iVar.b = obj;
        }
        ((AudioManager) obj).requestAudioFocus(audioFocusRequestBuild);
    }

    public final void g() {
        c();
        f2h f2hVar = this.Y;
        j1f j1fVar = this.a;
        if (f2hVar != null && f2hVar.b() > 0) {
            f2h f2hVar2 = this.Y;
            if (!((ml0) f2hVar2).c) {
                wqi.c("fl5", "seekToStart seekTo: %d", Long.valueOf(f2hVar2.b()));
                j1fVar.M0(j1fVar.t(), this.Y.b());
                return;
            }
        }
        wqi.c("fl5", "seekToStart seekTo: 0", new Object[0]);
        j1fVar.M0(j1fVar.t(), 0L);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [i3, t39] */
    /* JADX WARN: Type inference failed for: r4v4, types: [i3, t39] */
    /* JADX WARN: Type inference failed for: r4v7, types: [i3, t39] */
    @Override // defpackage.q3c
    public final void k(int i) {
        ?? r4;
        ?? r42;
        c();
        if (i == 1) {
            wqi.c("fl5", "onPlayerStateChanged ExoPlayer.STATE_IDLE", new Object[0]);
            return;
        }
        if (i == 2) {
            wqi.c("fl5", "onPlayerStateChanged ExoPlayer.STATE_BUFFERING", new Object[0]);
            xd8 xd8Var = this.X;
            if (xd8Var == null || (r4 = xd8Var.e) == 0) {
                return;
            }
            r4.w();
            return;
        }
        if (i == 3) {
            wqi.c("fl5", "onPlayerStateChanged ExoPlayer.STATE_READY", new Object[0]);
            xd8 xd8Var2 = this.X;
            if (xd8Var2 == null || (r42 = xd8Var2.e) == 0) {
                return;
            }
            r42.N();
            return;
        }
        if (i != 4) {
            return;
        }
        wqi.c("fl5", "onPlayerStateChanged ExoPlayer.STATE_ENDED", new Object[0]);
        if (this.a.getRepeatMode() == 1) {
            wqi.c("fl5", "State ended, but video is looping. Restart", new Object[0]);
            play();
            return;
        }
        xd8 xd8Var3 = this.X;
        if (xd8Var3 != null) {
            ?? r0 = xd8Var3.e;
            if (r0 != 0) {
                r0.d();
            }
            xd8Var3.h();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        wqi.c("fl5", "On audio focus change, %d", Integer.valueOf(i));
        j1f j1fVar = this.a;
        if (i == -3) {
            if (!d() || j1fVar.a() <= 0.0f) {
                return;
            }
            wqi.c("fl5", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2", new Object[0]);
            b(0.2f);
            return;
        }
        if (i == -2) {
            if (!d() || j1fVar.a() <= 0.0f) {
                return;
            }
            wqi.c("fl5", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player", new Object[0]);
            pause();
            return;
        }
        if (i == -1) {
            wqi.c("fl5", "onAudioFocusChange: AUDIOFOCUS_LOSS", new Object[0]);
            if (!d() || j1fVar.a() <= 0.0f) {
                return;
            }
            wqi.c("fl5", "onAudioFocusChange: AUDIOFOCUS_LOSS. Stop", new Object[0]);
            pause();
            return;
        }
        if (i != 1) {
            return;
        }
        if (!d()) {
            wqi.c("fl5", "onAudioFocusChange: AUDIOFOCUS_GAIN. Resuming player", new Object[0]);
            play();
        }
        float fA = j1fVar.a();
        if (fA <= 0.0f || fA >= 1.0d) {
            return;
        }
        wqi.c("fl5", "onAudioFocusChange: AUDIOFOCUS_GAIN. Volume up", new Object[0]);
        b(1.0f);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [i3, t39] */
    public final void pause() {
        wqi.c("fl5", "Pause", new Object[0]);
        c();
        this.a.N0(false);
        xd8 xd8Var = this.X;
        if (xd8Var != null) {
            ?? r1 = xd8Var.e;
            if (r1 != 0) {
                r1.o();
            }
            xd8Var.h();
        }
    }

    public final void play() {
        wqi.c("fl5", "Play", new Object[0]);
        c();
        j1f j1fVar = this.a;
        j1fVar.L0();
        dm5 dm5Var = j1fVar.c;
        dm5Var.d1();
        if (dm5Var.j1.e == 4) {
            g();
        }
        j1fVar.N0(true);
        xd8 xd8Var = this.X;
        if (xd8Var != null) {
            xd8Var.f();
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [i3, t39] */
    @Override // defpackage.q3c
    public final void u(PlaybackException playbackException) {
        c();
        ((y3b) this.c).a(playbackException != null ? playbackException : new IllegalStateException("onPlayerError"));
        xd8 xd8Var = this.X;
        if (xd8Var != null) {
            ?? r1 = xd8Var.e;
            if (r1 != 0) {
                r1.z(playbackException);
            }
            xd8Var.h();
        }
    }

    @Override // defpackage.q3c
    public final void y(int i) {
        wqi.c("fl5", "onTimelineChanged %d", Integer.valueOf(i));
    }
}
