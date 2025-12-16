package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class sj4 {
    public static void a(AudioTrack audioTrack, m4c m4cVar) {
        l4c l4cVar = m4cVar.a;
        l4cVar.getClass();
        LogSessionId logSessionId = l4cVar.a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
