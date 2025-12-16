package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u6f implements v6f {
    public final Uri a;

    public u6f(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.g99
    public final boolean a(MediaPlayer mediaPlayer, Context context) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = this.a;
        if (uri == null) {
            return false;
        }
        try {
            mediaPlayer.setDataSource(context, uri);
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
        if (!(obj instanceof u6f)) {
            return false;
        }
        u6f u6fVar = (u6f) obj;
        u6fVar.getClass();
        return fni.a(this.a, u6fVar.a);
    }

    public final int hashCode() {
        int iV = az1.v(2) * 31;
        Uri uri = this.a;
        return iV + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "SystemRingtone(type=" + ctd.l(2) + ", uri=" + this.a + ")";
    }
}
