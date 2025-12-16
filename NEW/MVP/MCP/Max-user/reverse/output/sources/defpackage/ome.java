package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class ome implements g99 {
    @Override // defpackage.g99
    public final boolean a(MediaPlayer mediaPlayer, Context context) throws IllegalStateException, IOException, IllegalArgumentException {
        mediaPlayer.setDataSource(context.getResources().openRawResourceFd(lvd.a));
        return true;
    }
}
