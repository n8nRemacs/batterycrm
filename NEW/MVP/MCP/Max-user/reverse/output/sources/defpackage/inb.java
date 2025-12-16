package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStream;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class inb extends vt3 {
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final HashMap i;
    public final ConcurrentHashMap j;
    public final ConcurrentHashMap k;
    public final ConcurrentHashMap l;

    public inb(awd awdVar, y6d y6dVar, ppb ppbVar, y6i y6iVar) {
        super(awdVar, y6dVar, ppbVar, y6iVar);
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new HashMap();
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.l = new ConcurrentHashMap();
    }

    @Override // defpackage.dnb
    public final void a(ti1 ti1Var, VideoFrame videoFrame) {
        hc8 hc8Var = new hc8(5);
        hc8Var.b = ti1Var;
        hc8Var.c = cdh.b;
        List list = (List) this.j.get(hc8Var.u());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(videoFrame);
            }
        }
    }

    @Override // defpackage.vt3
    public final void d() {
        w0a.f();
        this.j.clear();
        this.i.clear();
    }

    @Override // defpackage.vt3
    public final void e(ti1 ti1Var, String str) {
        w0a.f();
        HashMap map = this.i;
        Set set = (Set) map.get(ti1Var);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.j.remove((nt1) it.next());
        }
        map.remove(ti1Var);
    }

    @Override // defpackage.vt3
    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages(null);
        awd awdVar = (awd) this.a;
        ((wpb) awdVar.b).i(new awa(7, this), "ParticipantsAgnosticRemoteVideoTracks.closeInternal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vt3
    public final void k(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        awd awdVar = (awd) this.a;
        zo4 zo4Var = new zo4(this, rtpReceiver, mediaStreamArr, 1);
        wpb wpbVar = (wpb) awdVar.b;
        wpbVar.i(new c(wpbVar, zo4Var, 1), "DefaultRemoteVideoTracks.handleVideoTracksOnExecutor");
    }

    @Override // defpackage.vt3
    public final void p(String str, nt1 nt1Var, List list) {
        w0a.f();
        ConcurrentHashMap concurrentHashMap = this.j;
        HashMap map = this.i;
        if (list == null) {
            concurrentHashMap.remove(nt1Var);
            Set set = (Set) map.get(nt1Var.b);
            if (set != null) {
                set.remove(nt1Var);
                return;
            }
            return;
        }
        concurrentHashMap.put(nt1Var, list);
        Set hashSet = (Set) map.get(nt1Var.b);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(nt1Var.b, hashSet);
        }
        hashSet.add(nt1Var);
    }
}
