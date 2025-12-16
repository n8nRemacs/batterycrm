package defpackage;

import android.media.MediaPlayer;

/* loaded from: classes2.dex */
public final class v1f implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ String a;

    public v1f(String str) {
        this.a = str;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return false;
        }
        lg8 lg8Var = lg8.X;
        if (!l6bVar.b(lg8Var)) {
            return false;
        }
        StringBuilder sbM = utb.m(i, "Playback(", str, ") | on error happened. what:", " extra:");
        sbM.append(i2);
        l6bVar.c(lg8Var, "SimpleRingtonePlayer", sbM.toString(), null);
        return false;
    }
}
