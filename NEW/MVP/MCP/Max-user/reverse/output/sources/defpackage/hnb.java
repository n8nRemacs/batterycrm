package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class hnb implements VideoSink {
    public final String a;
    public long b = -1;
    public final /* synthetic */ inb c;

    public hnb(inb inbVar, String str) {
        this.c = inbVar;
        this.a = str;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId = videoFrame.getCompactParticipantId();
        if (compactParticipantId == null) {
            compactParticipantId = -1L;
        }
        if (compactParticipantId.longValue() != this.b) {
            this.b = compactParticipantId.longValue();
            if (compactParticipantId.longValue() == -1) {
                compactParticipantId = null;
            }
            inb inbVar = this.c;
            ConcurrentHashMap concurrentHashMap = inbVar.k;
            ConcurrentHashMap concurrentHashMap2 = inbVar.l;
            String str = this.a;
            nt1 nt1Var = (nt1) concurrentHashMap.get(str);
            if (nt1Var != null) {
                concurrentHashMap.remove(str, nt1Var);
                concurrentHashMap2.remove(nt1Var, str);
            }
            if (compactParticipantId != null) {
                nt1 nt1Var2 = (nt1) ((ConcurrentHashMap) ((y6i) inbVar.e).b).get(Integer.valueOf((int) compactParticipantId.longValue()));
                if (nt1Var2 != null) {
                    concurrentHashMap.put(str, nt1Var2);
                    concurrentHashMap2.put(nt1Var2, str);
                }
            }
        }
    }
}
