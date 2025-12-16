package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import kotlinx.coroutines.internal.ContextScope;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public final class z1f implements q30, ui8 {
    public static final /* synthetic */ yy7[] t0;
    public final ContextScope X;
    public final k18 Z;
    public final Context a;
    public final lzf b;
    public final AudioManager c;
    public MediaPlayer d;
    public final r30 o;
    public final t9f Y = c7j.c();
    public float s0 = 1.0f;

    static {
        z8a z8aVar = new z8a(z1f.class, "startPlaybackJob", "getStartPlaybackJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        t0 = new yy7[]{z8aVar};
    }

    public z1f(Context context, lzf lzfVar, k18 k18Var) {
        this.a = context;
        this.b = lzfVar;
        this.c = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.o = new r30(context, this);
        this.X = d7j.a(((q2b) lzfVar).c());
        this.Z = k18Var;
    }

    public static final float e(z1f z1fVar, int i) {
        AudioManager audioManager = z1fVar.c;
        float streamVolume = audioManager.getStreamVolume(i) / audioManager.getStreamMaxVolume(i);
        gu5 gu5Var = (gu5) z1fVar.h();
        return (((Number) gu5Var.N.D(gu5Var, gu5.S[28])).longValue() <= 0 || streamVolume >= 0.1f || i != 0) ? streamVolume : n7j.b(((float) Math.log(100.0f - r2)) / ((float) Math.log(100.0f)), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.z1f r10, defpackage.q44 r11) {
        /*
            r10.getClass()
            qqg r0 = defpackage.qqg.a
            boolean r1 = r11 instanceof defpackage.q1f
            if (r1 == 0) goto L18
            r1 = r11
            q1f r1 = (defpackage.q1f) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.Y = r2
            goto L1d
        L18:
            q1f r1 = new q1f
            r1.<init>(r10, r11)
        L1d:
            java.lang.Object r11 = r1.o
            g84 r2 = defpackage.g84.a
            int r3 = r1.Y
            java.lang.String r4 = "SimpleRingtonePlayer"
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3b
            if (r3 != r5) goto L33
            z1f r10 = r1.d
            defpackage.g8j.b(r11)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L90
            goto L88
        L31:
            r11 = move-exception
            goto L83
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            defpackage.g8j.b(r11)
            l6b r11 = defpackage.wqi.a
            if (r11 != 0) goto L43
            goto L6a
        L43:
            lg8 r3 = defpackage.lg8.d
            boolean r7 = r11.b(r3)
            if (r7 == 0) goto L6a
            android.media.MediaPlayer r7 = r10.d
            if (r7 == 0) goto L58
            boolean r7 = r7.isPlaying()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L59
        L58:
            r7 = r6
        L59:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "releaseSafely, player is playing: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r11.c(r3, r4, r7, r6)
        L6a:
            android.media.MediaPlayer r11 = r10.d
            if (r11 != 0) goto L6f
            return r0
        L6f:
            vdc r3 = new vdc     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L90
            r7 = 23
            r3.<init>(r7, r11)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L90
            r1.d = r10     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L90
            r1.Y = r5     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L90
            bd5 r11 = defpackage.bd5.a     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L90
            java.lang.Object r11 = defpackage.vmi.i(r11, r3, r1)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L90
            if (r11 != r2) goto L88
            return r2
        L83:
            java.lang.String r1 = "failed to release media player"
            defpackage.wqi.e(r4, r1, r11)
        L88:
            r10.d = r6
            r30 r10 = r10.o
            r10.q()
            return r0
        L90:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1f.f(z1f, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.z1f r11, defpackage.q44 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.r1f
            if (r0 == 0) goto L13
            r0 = r12
            r1f r0 = (defpackage.r1f) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            r1f r0 = new r1f
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            java.lang.String r3 = "SimpleRingtonePlayer"
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 != r6) goto L35
            z1f r11 = r0.d
            defpackage.g8j.b(r12)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32
            goto L88
        L2d:
            r12 = move-exception
            goto Lbb
        L30:
            r12 = move-exception
            goto L9c
        L32:
            r12 = move-exception
            goto Lba
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            defpackage.g8j.b(r12)
            l6b r12 = defpackage.wqi.a
            if (r12 != 0) goto L45
            goto L6d
        L45:
            lg8 r2 = defpackage.lg8.d
            boolean r7 = r12.b(r2)
            if (r7 == 0) goto L6d
            android.media.MediaPlayer r7 = r11.d
            r8 = 0
            if (r7 == 0) goto L5b
            boolean r7 = r7.isPlaying()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L5c
        L5b:
            r7 = r8
        L5c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "resetSafely, player is playing: "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r12.c(r2, r3, r7, r8)
        L6d:
            android.media.MediaPlayer r12 = r11.d
            if (r12 != 0) goto L74
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L74:
            prd r2 = new prd     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32
            r7 = 18
            r2.<init>(r7, r12)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32
            r0.d = r11     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32
            r0.Y = r6     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32
            bd5 r12 = defpackage.bd5.a     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32
            java.lang.Object r12 = defpackage.vmi.i(r12, r2, r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32
            if (r12 != r1) goto L88
            return r1
        L88:
            rt5 r12 = r11.h()
            gu5 r12 = (defpackage.gu5) r12
            long r0 = r12.p()
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 == 0) goto Lb5
            r30 r11 = r11.o
            r11.q()
            goto Lb5
        L9c:
            java.lang.String r0 = "failed to reset media player"
            defpackage.wqi.e(r3, r0, r12)     // Catch: java.lang.Throwable -> L2d
            rt5 r12 = r11.h()
            gu5 r12 = (defpackage.gu5) r12
            long r0 = r12.p()
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 == 0) goto Lb4
            r30 r11 = r11.o
            r11.q()
        Lb4:
            r6 = 0
        Lb5:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            return r11
        Lba:
            throw r12     // Catch: java.lang.Throwable -> L2d
        Lbb:
            rt5 r0 = r11.h()
            gu5 r0 = (defpackage.gu5) r0
            long r0 = r0.p()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto Lce
            r30 r11 = r11.o
            r11.q()
        Lce:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1f.g(z1f, q44):java.lang.Object");
    }

    @Override // defpackage.q30
    public final float a() {
        return this.s0;
    }

    @Override // defpackage.q30
    public final void b(float f) {
        this.s0 = f;
        svi.e(this.X, null, null, new y1f(this, f, null), 3);
    }

    @Override // defpackage.ui8
    public final void c() {
        wqi.c("SimpleRingtonePlayer", "onLogout called, player closed", new Object[0]);
        svi.e(this.X, null, null, new p1f(this, null), 3).invokeOnCompletion(new dse(2, this));
    }

    @Override // defpackage.q30
    public final boolean d() {
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null && Looper.getMainLooper().isCurrentThread()) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    public final rt5 h() {
        return (rt5) this.Z.getValue();
    }

    public final void i(g99 g99Var, int i, boolean z, Integer num) {
        this.Y.O(this, t0[0], svi.e(this.X, null, i84.b, new w1f(this, hashCode() + "#" + k7d.b.b(), num, i, z, g99Var, null), 1));
    }

    public final void j() {
        MediaPlayer mediaPlayer = this.d;
        wqi.b("SimpleRingtonePlayer", "stopPlayback, player is playing: " + (mediaPlayer != null ? Boolean.valueOf(mediaPlayer.isPlaying()) : null), new Throwable("stopPlayback"));
        svi.e(this.X, null, null, new x1f(this, null), 3);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        String strE = i != -3 ? i != -2 ? i != -1 ? i != 1 ? wy1.e(i, "Unknown(", ")") : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "SimpleRingtonePlayer", wy1.h("onAudioFocusChange ", strE), null);
            }
        }
        if (((gu5) h()).p() != 2) {
            this.o.p(i);
        }
    }

    @Override // defpackage.q30
    public final void pause() {
        boolean z = ((gu5) h()).p() == 2;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                MediaPlayer mediaPlayer = this.d;
                l6bVar.c(lg8Var, "SimpleRingtonePlayer", "pause, player is playing: " + (mediaPlayer != null ? Boolean.valueOf(mediaPlayer.isPlaying()) : null) + ", ignoring focus: " + z, null);
            }
        }
        if (z) {
            return;
        }
        j();
    }

    @Override // defpackage.q30
    public final void play() {
    }
}
