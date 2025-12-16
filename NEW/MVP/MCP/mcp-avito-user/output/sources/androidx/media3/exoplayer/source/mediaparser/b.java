package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.analytics.w;
import j.InterfaceC42164u;
import j.X;

/* compiled from: MediaParserUtil.java */
@J
/* loaded from: classes.dex */
public final class b {

    /* compiled from: MediaParserUtil.java */
    @X
    public static final class a {
        @InterfaceC42164u
        public static void a(MediaParser mediaParser, w wVar) {
            LogSessionId logSessionIdA = wVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            mediaParser.setLogSessionId(logSessionIdA);
        }
    }
}
