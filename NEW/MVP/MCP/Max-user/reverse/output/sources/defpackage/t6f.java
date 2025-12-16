package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import java.io.IOException;

/* loaded from: classes.dex */
public final class t6f implements v6f {
    public final String a;

    public t6f(String str) {
        this.a = str;
    }

    @Override // defpackage.g99
    public final boolean a(MediaPlayer mediaPlayer, Context context) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        try {
            mediaPlayer.setDataSource(this.a);
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
        if (!(obj instanceof t6f)) {
            return false;
        }
        t6f t6fVar = (t6f) obj;
        t6fVar.getClass();
        return fni.a(this.a, t6fVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (az1.v(2) * 31);
    }

    public final String toString() {
        return "Custom(type=" + ctd.l(2) + ", path=" + this.a + ")";
    }
}
