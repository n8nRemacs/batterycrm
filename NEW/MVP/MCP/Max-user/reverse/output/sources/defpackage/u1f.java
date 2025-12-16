package defpackage;

import android.media.MediaPlayer;

/* loaded from: classes2.dex */
public final class u1f implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ z1f a;
    public final /* synthetic */ String b;

    public u1f(z1f z1fVar, String str) {
        this.a = z1fVar;
        this.b = str;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        z1f z1fVar = this.a;
        svi.e(z1fVar.X, null, null, new t1f(this.b, z1fVar, null), 3);
    }
}
