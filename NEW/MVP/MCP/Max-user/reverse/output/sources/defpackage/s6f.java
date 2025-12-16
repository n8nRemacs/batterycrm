package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import java.io.IOException;

/* loaded from: classes.dex */
public final class s6f implements v6f {
    public final int a;
    public final Integer b;

    public s6f(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    @Override // defpackage.g99
    public final boolean a(MediaPlayer mediaPlayer, Context context) throws IllegalStateException, IOException, IllegalArgumentException {
        try {
            mediaPlayer.setDataSource(context.getResources().openRawResourceFd(this.b.intValue()));
            return true;
        } catch (IOException e) {
            wqi.g("SoundConfigTag", e, e.getMessage(), new Object[0]);
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6f)) {
            return false;
        }
        s6f s6fVar = (s6f) obj;
        return this.a == s6fVar.a && this.b.equals(s6fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (az1.v(this.a) * 31);
    }

    public final String toString() {
        return "Asset(type=" + ctd.l(this.a) + ", asset=" + this.b + ")";
    }
}
