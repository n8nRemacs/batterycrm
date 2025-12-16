package defpackage;

import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class qw8 {
    public static void a(gw8 gw8Var, m4c m4cVar) {
        l4c l4cVar = m4cVar.a;
        l4cVar.getClass();
        LogSessionId logSessionId = l4cVar.a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        gw8Var.b.setString("log-session-id", logSessionId.getStringId());
    }
}
