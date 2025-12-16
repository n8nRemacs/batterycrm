package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class da9 extends bma {
    public final w69 e;
    public int[] f;

    public da9(w69 w69Var) {
        this.e = w69Var;
    }

    @Override // defpackage.bma
    public final void b(ggg gggVar) {
        Notification.Builder builder = (Notification.Builder) gggVar.o;
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        w69 w69Var = this.e;
        Notification.MediaStyle mediaSession = mediaStyle.setMediaSession(((b79) w69Var.a.h.k.b).c.b);
        int[] iArr = this.f;
        if (iArr != null) {
            mediaSession.setShowActionsInCompactView(iArr);
        }
        builder.setStyle(mediaSession);
        Bundle bundle = new Bundle();
        bundle.putBundle("androidx.media3.session", w69Var.a.j.b());
        builder.addExtras(bundle);
    }
}
