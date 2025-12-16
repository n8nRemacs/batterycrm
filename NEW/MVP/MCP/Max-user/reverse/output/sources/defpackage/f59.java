package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class f59 extends MediaControllerCompat.Callback {
    public final /* synthetic */ d a;

    public f59(d dVar) {
        this.a = dVar;
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
        d dVar = this.a;
        dVar.e1 = description;
        dVar.s();
        dVar.r(false);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        d dVar = this.a;
        dVar.d1 = playbackStateCompat;
        dVar.r(false);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onSessionDestroyed() {
        d dVar = this.a;
        MediaControllerCompat mediaControllerCompat = dVar.b1;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(dVar.c1);
            dVar.b1 = null;
        }
    }
}
