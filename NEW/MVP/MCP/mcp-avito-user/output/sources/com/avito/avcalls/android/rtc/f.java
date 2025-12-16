package com.avito.avcalls.android.rtc;

import com.avito.avcalls.android.logger.g;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;

/* compiled from: MediaStreamTrack.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/rtc/f;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class f {
    @Y61.k
    public abstract MediaStreamTrack a();

    public final void b(boolean z12) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        companion.getClass();
        g.Companion.c("MediaStreamTrack(" + a().kind() + ')', "setEnabled(" + z12 + ')');
        a().setEnabled(z12);
    }

    @Y61.k
    public final String toString() {
        return "MediaStreamTrack(" + a().id() + ')';
    }
}
