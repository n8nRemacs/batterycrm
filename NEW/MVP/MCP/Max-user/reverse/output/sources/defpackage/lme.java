package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.io.File;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public final /* synthetic */ class lme implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tme b;

    public /* synthetic */ lme(tme tmeVar, int i) {
        this.a = i;
        this.b = tmeVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        tme tmeVar = this.b;
        switch (i) {
            case 0:
                return (AudioManager) ((Context) tmeVar.o.getValue()).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            default:
                yy7[] yy7VarArr = tme.z0;
                iz5 iz5Var = (iz5) tmeVar.d.getValue();
                iz5Var.getClass();
                File[] fileArrListFiles = iz5.g(iz5.b(iz5Var.c), "ringtones").listFiles();
                if (fileArrListFiles == null) {
                    return null;
                }
                for (File file : fileArrListFiles) {
                    tmeVar.v0.put(file.getAbsolutePath(), file);
                }
                return qqg.a;
        }
    }
}
