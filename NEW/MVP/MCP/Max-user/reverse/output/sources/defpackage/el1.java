package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class el1 {
    public static final long[] m = {500, 535, 458, 535, 825};
    public final Context a;
    public final age b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final bwf g;
    public final bwf h;
    public final bwf i;
    public MediaPlayer j;
    public w6f k;
    public final und l;

    public el1(Context context, age ageVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = context;
        this.b = ageVar;
        this.c = k18Var;
        this.d = k18Var2;
        this.e = k18Var3;
        this.f = k18Var4;
        final int i = 0;
        this.g = new bwf(new cm6(this) { // from class: bl1
            public final /* synthetic */ el1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 1:
                        return (Vibrator) this.b.a.getSystemService("vibrator");
                    case 2:
                        l5c l5cVar = (l5c) this.b.b;
                        l5cVar.getClass();
                        return Boolean.valueOf(l5cVar.j(PmsKey.f128reconnectcallringtone, false));
                    default:
                        gu5 gu5Var = (gu5) ((rt5) this.b.e.getValue());
                        gu5Var.getClass();
                        return Boolean.valueOf(gu5Var.j(PmsKey.f10callcustomringtone, false));
                }
            }
        });
        final int i2 = 1;
        this.h = new bwf(new cm6(this) { // from class: bl1
            public final /* synthetic */ el1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 1:
                        return (Vibrator) this.b.a.getSystemService("vibrator");
                    case 2:
                        l5c l5cVar = (l5c) this.b.b;
                        l5cVar.getClass();
                        return Boolean.valueOf(l5cVar.j(PmsKey.f128reconnectcallringtone, false));
                    default:
                        gu5 gu5Var = (gu5) ((rt5) this.b.e.getValue());
                        gu5Var.getClass();
                        return Boolean.valueOf(gu5Var.j(PmsKey.f10callcustomringtone, false));
                }
            }
        });
        final int i3 = 2;
        this.i = new bwf(new cm6(this) { // from class: bl1
            public final /* synthetic */ el1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 1:
                        return (Vibrator) this.b.a.getSystemService("vibrator");
                    case 2:
                        l5c l5cVar = (l5c) this.b.b;
                        l5cVar.getClass();
                        return Boolean.valueOf(l5cVar.j(PmsKey.f128reconnectcallringtone, false));
                    default:
                        gu5 gu5Var = (gu5) ((rt5) this.b.e.getValue());
                        gu5Var.getClass();
                        return Boolean.valueOf(gu5Var.j(PmsKey.f10callcustomringtone, false));
                }
            }
        });
        bwf bwfVar = w6f.h;
        this.k = ebj.c();
        final int i4 = 3;
        this.l = new und(new cm6(this) { // from class: bl1
            public final /* synthetic */ el1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 1:
                        return (Vibrator) this.b.a.getSystemService("vibrator");
                    case 2:
                        l5c l5cVar = (l5c) this.b.b;
                        l5cVar.getClass();
                        return Boolean.valueOf(l5cVar.j(PmsKey.f128reconnectcallringtone, false));
                    default:
                        gu5 gu5Var = (gu5) ((rt5) this.b.e.getValue());
                        gu5Var.getClass();
                        return Boolean.valueOf(gu5Var.j(PmsKey.f10callcustomringtone, false));
                }
            }
        });
    }

    public final boolean a() {
        boolean zC = ((ix1) this.c.getValue()).c();
        boolean zD = ((tih) this.d.getValue()).d();
        int ringerMode = ((AudioManager) this.g.getValue()).getRingerMode();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                String str = ringerMode != 0 ? ringerMode != 1 ? ringerMode != 2 ? "unknown" : "RINGER_MODE_NORMAL" : "RINGER_MODE_VIBRATE" : "RINGER_MODE_SILENT";
                StringBuilder sbP = ho7.p("isRingtonePlayAvailable notificationsEnabled=", zC, " isAppOpened=", zD, " ringMode=");
                sbP.append(str);
                l6bVar.c(lg8Var, "RingtoneManagerTag", sbP.toString(), null);
            }
        }
        if (ringerMode != 2) {
            return false;
        }
        return zC || zD;
    }

    public final void b(w6f w6fVar) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "RingtoneManagerTag", "attach ringtone config: " + w6fVar, null);
            }
        }
        this.k = w6fVar;
    }

    public final void c(v6f v6fVar, final boolean z) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "RingtoneManagerTag", " start ringtone loop=" + z + " sound=" + v6fVar, null);
            }
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Main (UI) thread expected");
        }
        if (((Boolean) this.l.getValue()).booleanValue()) {
            z1f z1fVar = (z1f) this.f.getValue();
            yy7[] yy7VarArr = z1f.t0;
            z1fVar.i(v6fVar, 0, z, null);
            return;
        }
        try {
            e();
            MediaPlayer mediaPlayer = new MediaPlayer();
            v6fVar.a(mediaPlayer, this.a);
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(0).build());
            mediaPlayer.setLooping(z);
            mediaPlayer.setOnPreparedListener(new cl1());
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: dl1
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) throws IllegalStateException {
                    if (z) {
                        return;
                    }
                    this.e();
                }
            });
            mediaPlayer.prepareAsync();
            this.j = mediaPlayer;
        } catch (IOException e) {
            wqi.e("RingtoneManagerTag", "Got error during init player: sound=" + v6fVar + " e=" + e.getMessage(), e);
        } catch (IllegalStateException e2) {
            wqi.e("RingtoneManagerTag", "Got error during init player: sound=" + v6fVar + " e=" + e2.getMessage(), e2);
        }
    }

    public final void d() {
        w6f w6fVar = this.k;
        if (w6fVar == null) {
            return;
        }
        boolean zHasVibrator = ((Vibrator) this.h.getValue()).hasVibrator();
        if (zHasVibrator && w6fVar.g) {
            ((Vibrator) this.h.getValue()).cancel();
            ((Vibrator) this.h.getValue()).vibrate(VibrationEffect.createWaveform(m, 0), new AudioAttributes.Builder().setContentType(4).setUsage(6).build());
            return;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, "RingtoneManagerTag", "can't start vibrate hasVibrator=" + zHasVibrator + " canVibrate" + w6fVar.g, null);
        }
    }

    public final void e() throws IllegalStateException {
        lg8 lg8Var = lg8.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, "RingtoneManagerTag", " stop all", null);
        }
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, "RingtoneManagerTag", " stop ringtone", null);
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Main (UI) thread expected");
        }
        if (((Boolean) this.l.getValue()).booleanValue()) {
            ((z1f) this.f.getValue()).j();
        } else {
            MediaPlayer mediaPlayer = this.j;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
            this.j = null;
        }
        this.l.reset();
        l6b l6bVar3 = wqi.a;
        if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
            l6bVar3.c(lg8Var, "RingtoneManagerTag", " stopVibrate", null);
        }
        ((Vibrator) this.h.getValue()).cancel();
    }
}
