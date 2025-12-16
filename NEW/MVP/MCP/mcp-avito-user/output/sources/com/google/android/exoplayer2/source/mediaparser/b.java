package com.google.android.exoplayer2.source.mediaparser;

import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.analytics.p;
import j.InterfaceC42164u;
import j.X;

/* compiled from: MediaParserUtil.java */
/* loaded from: classes6.dex */
public final class b {

    /* compiled from: MediaParserUtil.java */
    @X
    public static final class a {
        @InterfaceC42164u
        public static void a(MediaParser mediaParser, p pVar) {
            LogSessionId logSessionIdA = pVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            mediaParser.setLogSessionId(logSessionIdA);
        }
    }

    @X
    public static void a(MediaParser mediaParser, p pVar) {
        a.a(mediaParser, pVar);
    }
}
