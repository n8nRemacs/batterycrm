package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;

/* loaded from: classes.dex */
public final class r59 extends MediaControllerCompat.Callback {
    public final /* synthetic */ x59 a;

    public r59(x59 x59Var) {
        this.a = x59Var;
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
        x59 x59Var = this.a;
        x59Var.V0 = description;
        x59Var.g();
        x59Var.k();
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onSessionDestroyed() {
        x59 x59Var = this.a;
        MediaControllerCompat mediaControllerCompat = x59Var.T0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(x59Var.U0);
            x59Var.T0 = null;
        }
    }
}
