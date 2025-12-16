package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class jnb implements VideoSink {
    public final Map a;
    public final y6i b;

    public jnb(ConcurrentHashMap concurrentHashMap, y6i y6iVar) {
        this.a = concurrentHashMap;
        this.b = y6iVar;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId;
        List list;
        if ((videoFrame.getRotatedWidth() > 16 || videoFrame.getRotatedHeight() > 16) && (compactParticipantId = videoFrame.getCompactParticipantId()) != null) {
            nt1 nt1Var = (nt1) ((ConcurrentHashMap) this.b.b).get(Integer.valueOf((int) compactParticipantId.longValue()));
            if (nt1Var == null || (list = (List) this.a.get(nt1Var)) == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(videoFrame);
            }
        }
    }
}
