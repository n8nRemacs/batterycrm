package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class o50 implements xfd, MediaRecorder.OnInfoListener {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public MediaRecorder e;
    public tfd f;
    public volatile String g;

    public o50(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        bwf bwfVarD = o6i.a.getAccessor().d(47);
        this.a = k18Var;
        this.b = bwfVarD;
        this.c = k18Var2;
        this.d = k18Var3;
    }

    @Override // defpackage.xfd
    public final int a() {
        MediaRecorder mediaRecorder = this.e;
        if (mediaRecorder == null) {
            return 0;
        }
        try {
            return mediaRecorder.getMaxAmplitude();
        } catch (RuntimeException e) {
            wqi.e(o50.class.getName(), "Can't getRecorderAmplitude illegal state", e);
            return 0;
        }
    }

    @Override // defpackage.xfd
    public final boolean b() {
        return this.e != null;
    }

    public final boolean c(int i, int i2, Integer num, String str) throws IllegalStateException, IOException, IllegalArgumentException {
        try {
            MediaRecorder mediaRecorderH = Build.VERSION.SDK_INT >= 31 ? q20.h((Context) this.a.getValue()) : new MediaRecorder();
            this.e = mediaRecorderH;
            mediaRecorderH.setAudioSource(1);
            mediaRecorderH.setOutputFormat(6);
            mediaRecorderH.setAudioEncoder(i);
            mediaRecorderH.setOnInfoListener(this);
            l5c l5cVar = (l5c) ((age) this.b.getValue());
            l5cVar.getClass();
            mediaRecorderH.setMaxDuration(((int) l5cVar.m(PmsKey.f79maxaudiolength, 3600)) * 1000);
            mediaRecorderH.setAudioSamplingRate(i2);
            if (num != null) {
                mediaRecorderH.setAudioEncodingBitRate(num.intValue());
            }
            mediaRecorderH.setAudioChannels(1);
            mediaRecorderH.setOutputFile(str);
            mediaRecorderH.prepare();
            mediaRecorderH.start();
            return true;
        } catch (RuntimeException e) {
            String name = o50.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar == null) {
                return false;
            }
            lg8 lg8Var = lg8.Y;
            if (!l6bVar.b(lg8Var)) {
                return false;
            }
            l6bVar.c(lg8Var, name, xc0.e(i, e.getMessage(), " encoder: "), null);
            return false;
        }
    }

    @Override // defpackage.xfd
    public final void d() {
        MediaRecorder mediaRecorder = this.e;
        if (mediaRecorder != null) {
            try {
                try {
                    mediaRecorder.stop();
                    MediaRecorder mediaRecorder2 = this.e;
                    if (mediaRecorder2 != null) {
                        mediaRecorder2.release();
                    }
                    this.e = null;
                } catch (RuntimeException e) {
                    wqi.e(o50.class.getName(), "Can't stopRecordAudio", e);
                    MediaRecorder mediaRecorder3 = this.e;
                    if (mediaRecorder3 != null) {
                        mediaRecorder3.release();
                    }
                    this.e = null;
                }
            } catch (Throwable th) {
                MediaRecorder mediaRecorder4 = this.e;
                if (mediaRecorder4 != null) {
                    mediaRecorder4.release();
                }
                this.e = null;
                throw th;
            }
        }
    }

    @Override // defpackage.xfd
    public final void e() throws IllegalStateException {
        MediaRecorder mediaRecorder = this.e;
        if (mediaRecorder != null) {
            mediaRecorder.resume();
        }
    }

    @Override // defpackage.xfd
    public final Object f(long j, Continuation continuation) throws IllegalStateException, IOException, IllegalArgumentException {
        qqg qqgVar = qqg.a;
        String absolutePath = ((iz5) ((qx5) this.d.getValue())).d(j).getAbsolutePath();
        if (absolutePath == null) {
            wqi.c(o50.class.getName(), "Couldn't create a file for the audio message", new Object[0]);
            return qqgVar;
        }
        this.g = absolutePath;
        if (!c(3, 90000, new Integer(60000), absolutePath) && !c(3, 45000, new Integer(30000), absolutePath) && !c(3, 16000, null, absolutePath)) {
            c(0, 16000, null, absolutePath);
        }
        return qqgVar;
    }

    @Override // defpackage.xfd
    public final Object g(wfd wfdVar) {
        String str;
        if (!(wfdVar instanceof ufd) || (str = this.g) == null) {
            return null;
        }
        ufd ufdVar = (ufd) wfdVar;
        return new k40(str, ufdVar.a, ufdVar.b);
    }

    @Override // defpackage.xfd
    public final void h() throws IllegalStateException {
        MediaRecorder mediaRecorder = this.e;
        if (mediaRecorder != null) {
            mediaRecorder.pause();
        }
    }

    @Override // defpackage.xfd
    public final boolean i() {
        return ((qsb) this.c.getValue()).c(qsb.h);
    }

    @Override // defpackage.xfd
    public final String j() {
        return null;
    }

    @Override // defpackage.xfd
    public final void k(zed zedVar) {
        this.f = zedVar;
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        tfd tfdVar;
        if ((i == 800 || i == 801) && (tfdVar = this.f) != null) {
            ((zed) tfdVar).H();
        }
    }
}
