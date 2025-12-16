package defpackage;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public final /* synthetic */ class iq implements frf, orf {
    public final /* synthetic */ Context a;

    @Override // defpackage.orf
    public prf a(u73 u73Var) {
        String str = (String) u73Var.d;
        ggg gggVar = (ggg) u73Var.o;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new tk6(this.a, str, gggVar, true, true);
    }

    @Override // defpackage.frf
    public Object get() {
        return (AudioManager) this.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }
}
