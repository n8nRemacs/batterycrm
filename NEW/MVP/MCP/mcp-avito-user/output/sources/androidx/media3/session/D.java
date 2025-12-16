package androidx.media3.session;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.AbstractServiceC23085i;
import com.google.common.collect.AbstractC37401r1;
import java.util.List;

/* compiled from: MediaBrowserImplLegacy.java */
/* loaded from: classes.dex */
class D extends MediaBrowserCompat.SearchCallback {
    @Override // android.support.v4.media.MediaBrowserCompat.SearchCallback
    public final void onError(String str, Bundle bundle) {
        C23252q.b(-1, null);
        throw null;
    }

    @Override // android.support.v4.media.MediaBrowserCompat.SearchCallback
    public final void onSearchResult(String str, Bundle bundle, List<MediaBrowserCompat.MediaItem> list) {
        AbstractServiceC23085i.a aVar = C1.f51933a;
        AbstractC37401r1.a aVar2 = new AbstractC37401r1.a();
        for (int i12 = 0; i12 < list.size(); i12++) {
            MediaBrowserCompat.MediaItem mediaItem = list.get(i12);
            aVar2.g(C1.l(mediaItem.getDescription(), mediaItem.isBrowsable(), mediaItem.isPlayable()));
        }
        C23252q.g(aVar2.i(), null);
        throw null;
    }
}
