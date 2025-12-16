package defpackage;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final /* synthetic */ class cl1 implements MediaPlayer.OnPreparedListener {
    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        mediaPlayer.start();
    }
}
