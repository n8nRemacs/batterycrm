package defpackage;

import android.media.MediaPlayer;

/* loaded from: classes2.dex */
public final class s1f implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ z1f b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Integer d;

    public s1f(String str, z1f z1fVar, int i, Integer num) {
        this.a = str;
        this.b = z1fVar;
        this.c = i;
        this.d = num;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        StringBuilder sb = new StringBuilder("Playback(");
        String str = this.a;
        sb.append(str);
        sb.append(") | player prepared");
        wqi.c("SimpleRingtonePlayer", sb.toString(), new Object[0]);
        mediaPlayer.start();
        z1f z1fVar = this.b;
        wqi.c("SimpleRingtonePlayer", "Playback(" + str + ") | requesting audio focus after player start, volume:" + z1fVar.s0 + " isPlaying:" + z1fVar.d(), new Object[0]);
        if (((gu5) z1fVar.h()).p() != 2) {
            r30 r30Var = z1fVar.o;
            Integer num = this.d;
            r30Var.r(this.c, num != null ? num.intValue() : ((gu5) z1fVar.h()).p() == 1 ? 1 : 2);
        }
    }
}
