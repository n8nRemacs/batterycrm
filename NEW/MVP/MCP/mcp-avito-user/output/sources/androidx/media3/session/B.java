package androidx.media3.session;

import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.AbstractServiceC23085i;

/* compiled from: MediaBrowserImplLegacy.java */
/* loaded from: classes.dex */
class B extends MediaBrowserCompat.ItemCallback {
    @Override // android.support.v4.media.MediaBrowserCompat.ItemCallback
    public final void onError(String str) {
        C23252q.b(-1, null);
        throw null;
    }

    @Override // android.support.v4.media.MediaBrowserCompat.ItemCallback
    public final void onItemLoaded(MediaBrowserCompat.MediaItem mediaItem) {
        if (mediaItem == null) {
            C23252q.b(-3, null);
            throw null;
        }
        AbstractServiceC23085i.a aVar = C1.f51933a;
        C23252q.j(C1.l(mediaItem.getDescription(), mediaItem.isBrowsable(), mediaItem.isPlayable()));
        SystemClock.elapsedRealtime();
        throw null;
    }
}
