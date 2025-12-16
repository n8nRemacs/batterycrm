package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.util.MissingResourceException;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class dbh implements cbh, r3c, jd, AudioManager.OnAudioFocusChangeListener, q30 {
    public final em5 X;
    public final r30 Y;
    public final yi5 a;
    public final bl5 b;
    public final tih c;
    public final q0h d;
    public g2h s0;
    public final zkb v0;
    public final String o = dbh.class.getName();
    public final bm3 Z = new bm3();
    public int t0 = 1;
    public boolean u0 = true;

    public dbh(Context context, yi5 yi5Var, bl5 bl5Var, k18 k18Var, r4c r4cVar, tih tihVar, q0h q0hVar) throws MissingResourceException {
        jb8 bo4Var;
        this.a = yi5Var;
        this.b = bl5Var;
        this.c = tihVar;
        this.d = q0hVar;
        this.Y = new r30(context, this);
        if (r4cVar.b) {
            int i = r4cVar.e;
            int i2 = r4cVar.f;
            int i3 = r4cVar.g;
            int i4 = r4cVar.d;
            int i5 = r4cVar.h;
            if (i3 < 0) {
                throw new IllegalStateException("The playback_buffer must be greater than or equal to 0");
            }
            if (i4 < 0) {
                throw new IllegalStateException("The playback_buffer_after_rebuffer must be greater than or equal to 0");
            }
            if (i < i3) {
                throw new IllegalStateException("The min_buffer must be greater than or equal to playback_buffer");
            }
            if (i < i4) {
                throw new IllegalStateException("The min_buffer must be greater than or equal to playback_buffer_after_rebuffer");
            }
            if (i2 < i) {
                throw new IllegalStateException("The max_buffer must be greater than or equal to min_buffer");
            }
            if (i5 <= 0) {
                throw new IllegalStateException("The format_max_input_size_scale_up_factor must be greater than 0");
            }
            ye yeVar = new ye();
            yeVar.a = i;
            yeVar.b = i2;
            yeVar.c = i3;
            yeVar.d = i4;
            yeVar.e = i5;
            bo4Var = new zz9(yeVar);
        } else {
            int i6 = r4cVar.e;
            int i7 = r4cVar.f;
            int i8 = r4cVar.g;
            int i9 = r4cVar.d;
            bo4.m("bufferForPlaybackMs", i8, 0, "0");
            bo4.m("bufferForPlaybackAfterRebufferMs", i9, 0, "0");
            bo4.m("minBufferMs", i6, i8, "bufferForPlaybackMs");
            bo4.m("minBufferMs", i6, i9, "bufferForPlaybackAfterRebufferMs");
            bo4.m("maxBufferMs", i7, i6, "minBufferMs");
            bo4Var = new bo4(new ri4(), i6, i7, i8, i9, r4cVar.c);
        }
        ar4 ar4Var = new ar4(context, new r8j(12));
        nq4 nq4VarE = ar4Var.e();
        nq4VarE.getClass();
        lq4 lq4Var = new lq4(nq4VarE);
        String iSO3Language = ((w4e) ((pb3) k18Var.getValue())).u().getISO3Language();
        if (iSO3Language == null) {
            lq4Var.f(new String[0]);
        } else {
            lq4Var.f(new String[]{iSO3Language});
        }
        hl5 hl5Var = new hl5(context);
        hl5Var.c(ar4Var);
        hl5Var.b(bo4Var);
        em5 em5VarA = hl5Var.a();
        this.X = em5VarA;
        em5VarA.x0.a(this);
        em5VarA.L0(this);
        this.v0 = new zkb(12, this);
    }

    @Override // defpackage.cbh
    public final void C(abh abhVar) {
        this.Z.a.remove(abhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0(defpackage.g2h r25, boolean r26, defpackage.bbh r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbh.I0(g2h, boolean, bbh, int, boolean):void");
    }

    @Override // defpackage.jd
    public final void J(id idVar, int i) {
        wqi.c(this.o, "Player. Video frames dropped: " + i, new Object[0]);
    }

    @Override // defpackage.r3c
    public final void L0(PlaybackException playbackException) {
        wqi.b(this.o, "Player. Error", playbackException);
        ((y3b) this.a).a(playbackException);
        this.Z.z(playbackException);
    }

    @Override // defpackage.jd
    public final void N(id idVar, nh4 nh4Var) {
        wqi.c(this.o, "Player. Video renderer is disabled", new Object[0]);
    }

    @Override // defpackage.cbh
    public final long O0() {
        g2h g2hVar = this.s0;
        if (g2hVar != null) {
            return this.X.S0() - g2hVar.b();
        }
        return 0L;
    }

    @Override // defpackage.cbh
    public final void Q(boolean z) {
        this.X.q1(z ? 2 : 0);
    }

    @Override // defpackage.q30
    public final boolean U0() {
        return this.c.d() || this.u0;
    }

    public final void V0() {
        g2h g2hVar = this.s0;
        em5 em5Var = this.X;
        String str = this.o;
        if (g2hVar == null || g2hVar.b() <= 0 || g2hVar.g()) {
            wqi.c(str, "Player. Seek to start: 0", new Object[0]);
            em5Var.F0(5, 0L);
        } else {
            wqi.c(str, "Player. Seek to start from content: %d", Long.valueOf(g2hVar.b()));
            em5Var.F0(5, g2hVar.b());
        }
    }

    @Override // defpackage.cbh
    public final void X(abh abhVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.Z.a;
        if (copyOnWriteArraySet.contains(abhVar)) {
            return;
        }
        copyOnWriteArraySet.add(abhVar);
    }

    @Override // defpackage.cbh, defpackage.q30
    public final float a() {
        em5 em5Var = this.X;
        em5Var.A1();
        return em5Var.g1;
    }

    @Override // defpackage.cbh
    public final void a0(Surface surface) {
        String str = this.o;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Player. Set surface " + surface, null);
            }
        }
        if (surface == null) {
            this.X.Q0();
        } else {
            this.X.s1(surface);
        }
    }

    @Override // defpackage.cbh, defpackage.q30
    public final void b(float f) {
        em5 em5Var = this.X;
        em5Var.A1();
        float f2 = em5Var.g1;
        String str = this.o;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Player. New volume: " + f + ", prev: " + f2, null);
            }
        }
        this.X.t1(f);
        if (f2 <= 0.0f && f > 0.0f) {
            this.Y.r(3, this.t0);
        } else if (f2 != f && f <= 0.0f) {
            this.Y.q();
        }
    }

    @Override // defpackage.cbh
    public final void clear() {
        wqi.c(this.o, "Player. Clear", new Object[0]);
        this.X.Q0();
        this.Z.a.clear();
        this.s0 = null;
        this.t0 = 1;
    }

    @Override // defpackage.cbh, defpackage.q30
    public final boolean d() {
        em5 em5Var = this.X;
        int playbackState = em5Var.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && em5Var.i() && em5Var.u() == 0;
    }

    @Override // defpackage.jd
    public final void d0(id idVar, ub8 ub8Var, g19 g19Var, IOException iOException, boolean z) {
        wqi.e(this.o, "Player. Load error, wasCanceled " + z + ", videoContent: " + this.s0, iOException);
        this.Z.z(iOException);
    }

    @Override // defpackage.cbh
    public final long e() {
        g2h g2hVar = this.s0;
        if (g2hVar != null) {
            return this.X.e() - g2hVar.b();
        }
        return 0L;
    }

    @Override // defpackage.cbh
    public final long getDuration() {
        g2h g2hVar = this.s0;
        if (g2hVar != null) {
            if (g2hVar.c() > 0) {
                return g2hVar.c() - g2hVar.b();
            }
            em5 em5Var = this.X;
            if (em5Var.getDuration() > 0) {
                return em5Var.getDuration();
            }
        }
        return 0L;
    }

    @Override // defpackage.cbh
    public final boolean isIdle() {
        return this.X.getPlaybackState() == 1;
    }

    @Override // defpackage.r3c
    public final void j(float f) {
        this.Z.f(f);
    }

    @Override // defpackage.r3c
    public final void k(int i) {
        String str = this.o;
        if (i == 1) {
            wqi.c(str, "Player. State changed: ExoPlayer.STATE_IDLE", new Object[0]);
            return;
        }
        bm3 bm3Var = this.Z;
        if (i == 2) {
            wqi.c(str, "Player. State changed: ExoPlayer.STATE_BUFFERING", new Object[0]);
            bm3Var.w();
            return;
        }
        em5 em5Var = this.X;
        if (i == 3) {
            wqi.c(str, "Player. State changed: ExoPlayer.STATE_READY", new Object[0]);
            bm3Var.h(em5Var.i());
        } else {
            if (i != 4) {
                return;
            }
            wqi.c(str, "Player. State changed: ExoPlayer.STATE_ENDED", new Object[0]);
            em5Var.A1();
            if (em5Var.Q0 != 1) {
                bm3Var.d();
            } else {
                wqi.c(str, "Player. State ended, but video is looping. Restart", new Object[0]);
                play();
            }
        }
    }

    @Override // defpackage.jd
    public final void m0(id idVar, Object obj, long j) {
        String str = this.o;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Player. First frame rendered: output=" + obj + " renderTimeMs=" + j, null);
            }
        }
        this.Z.c();
    }

    @Override // defpackage.r3c
    public final void n0(s9g s9gVar, int i) {
        wqi.c(this.o, "Player. onTimelineChanged %d", Integer.valueOf(i));
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        String str = this.o;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.f(i, "Player. On audio focus change: "), null);
            }
        }
        this.Y.p(i);
    }

    @Override // defpackage.cbh, defpackage.q30
    public final void pause() {
        em5 em5Var = this.X;
        em5Var.A1();
        if (em5Var.o1) {
            return;
        }
        wqi.c(this.o, "Player. Pause", new Object[0]);
        em5Var.o1(false);
        this.Z.o();
    }

    @Override // defpackage.cbh, defpackage.q30
    public final void play() {
        wqi.c(this.o, "Player. Play", new Object[0]);
        em5 em5Var = this.X;
        if (em5Var.getPlaybackState() == 4) {
            V0();
        }
        em5Var.o1(true);
        this.Z.r();
        this.Y.r(3, this.t0);
    }

    @Override // defpackage.cbh
    public final void release() {
        wqi.c(this.o, "Player. Release", new Object[0]);
        this.Z.b();
        em5 em5Var = this.X;
        em5Var.A1();
        em5Var.D0.X.e(this);
        em5Var.i1(this);
        em5Var.Q0();
        em5Var.h1();
        this.Y.q();
        this.t0 = 1;
    }

    @Override // defpackage.cbh
    public final void seekTo(long j) {
        String str = this.o;
        wy1.q(j, "Player. Seek to: ", str);
        g2h g2hVar = this.s0;
        if (g2hVar == null) {
            return;
        }
        this.Z.i();
        em5 em5Var = this.X;
        if (em5Var.getDuration() == 0 || j <= em5Var.getDuration() - g2hVar.b()) {
            em5Var.F0(5, g2hVar.b() + j);
            return;
        }
        wqi.c(str, "Player. Can't seek to: " + j + ", position greater than duration. Seek to end.", new Object[0]);
        em5Var.F0(5, em5Var.getDuration() - g2hVar.b());
    }

    @Override // defpackage.cbh
    public final void stop() {
        em5 em5Var = this.X;
        em5Var.A1();
        if (em5Var.o1) {
            return;
        }
        wqi.c(this.o, "Player. Stop", new Object[0]);
        em5Var.u1();
        this.Z.g();
        this.Y.q();
    }

    @Override // defpackage.cbh
    public final boolean y0() {
        em5 em5Var = this.X;
        return em5Var.getPlaybackState() == 3 && !em5Var.i();
    }
}
