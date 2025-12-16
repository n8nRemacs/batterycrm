package defpackage;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class tla extends bma {
    public int[] e;
    public MediaSessionCompat.Token f;

    @Override // defpackage.bma
    public final void b(ggg gggVar) {
        Notification.Builder builder = (Notification.Builder) gggVar.o;
        if (Build.VERSION.SDK_INT >= 34) {
            bla.d(builder, bla.b(hla.a(bla.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            bla.d(builder, bla.b(bla.a(), this.e, this.f));
        }
    }
}
