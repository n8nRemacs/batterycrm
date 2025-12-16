package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class nme implements g99 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ nme(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.g99
    public boolean a(MediaPlayer mediaPlayer, Context context) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        mediaPlayer.setDataSource(this.b);
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "TracerFeature::" + this.b;
            default:
                return super.toString();
        }
    }
}
