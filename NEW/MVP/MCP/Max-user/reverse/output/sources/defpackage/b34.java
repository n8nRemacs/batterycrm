package defpackage;

import android.media.MediaDrm;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackStateEvent;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b34 {
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent e(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager f(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder j() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ ContentInfo.Builder m(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* synthetic */ void p() {
    }
}
