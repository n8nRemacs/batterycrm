package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStream;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final class ap4 extends vt3 {
    public static final cdh[] j = {cdh.a, cdh.b};
    public final ConcurrentHashMap f;
    public final HashMap g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;

    public ap4(awd awdVar, y6d y6dVar, ppb ppbVar, y6i y6iVar) {
        super(awdVar, y6dVar, ppbVar, y6iVar);
        this.f = new ConcurrentHashMap();
        this.g = new HashMap();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
    }

    @Override // defpackage.dnb
    public final void a(ti1 ti1Var, VideoFrame videoFrame) {
        hc8 hc8Var = new hc8(5);
        hc8Var.b = ti1Var;
        hc8Var.c = cdh.b;
        List list = (List) this.f.get(hc8Var.u());
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((fch) it.next()).a(videoFrame);
        }
    }

    @Override // defpackage.vt3
    public final void d() {
        awd awdVar = (awd) this.a;
        eu3 eu3Var = new eu3(1, this);
        wpb wpbVar = (wpb) awdVar.b;
        wpbVar.i(new c(wpbVar, eu3Var, 1), "DefaultRemoteVideoTracks.clearRemoteVideoRenderers");
    }

    @Override // defpackage.vt3
    public final void e(ti1 ti1Var, String str) {
        for (int i = 0; i < 2; i++) {
            cdh cdhVar = j[i];
            hc8 hc8Var = new hc8(5);
            hc8Var.c = cdhVar;
            hc8Var.b = ti1Var;
            p(str, hc8Var.u(), null);
        }
    }

    @Override // defpackage.vt3
    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages(null);
        synchronized (this.f) {
            try {
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((fch) it2.next()).a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        awd awdVar = (awd) this.a;
        ((wpb) awdVar.b).i(new qj4(3, this), "DefaultRemoteVideoTracks.closeOnExecutor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vt3
    public final void k(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        awd awdVar = (awd) this.a;
        zo4 zo4Var = new zo4(this, rtpReceiver, mediaStreamArr, 0);
        wpb wpbVar = (wpb) awdVar.b;
        wpbVar.i(new c(wpbVar, zo4Var, 1), "DefaultRemoteVideoTracks.handleVideoTracksOnExecutor");
    }

    @Override // defpackage.vt3
    public final void p(final String str, final nt1 nt1Var, final List list) {
        awd awdVar = (awd) this.a;
        hu3 hu3Var = new hu3() { // from class: yo4
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                this.a.u(str, nt1Var, list);
            }
        };
        wpb wpbVar = (wpb) awdVar.b;
        wpbVar.i(new c(wpbVar, hu3Var, 1), "DefaultRemoteVideoTracks.setRemoteVideoRenderersOnExecutor");
    }

    public final void u(String str, nt1 nt1Var, List list) {
        synchronized (this.f) {
            try {
                VideoTrack videoTrack = (VideoTrack) this.g.get(str);
                if (videoTrack == null) {
                    ((y6d) this.b).log("DefaultRemoteVideoTracks", "no " + nt1Var + " track");
                    return;
                }
                List<fch> list2 = (List) this.f.get(nt1Var);
                if (list2 == null) {
                    ((y6d) this.b).log("DefaultRemoteVideoTracks", "no renderers for " + nt1Var + " track");
                } else {
                    for (fch fchVar : list2) {
                        fchVar.a = null;
                        try {
                            videoTrack.removeSink(fchVar);
                        } catch (Exception unused) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        VideoSink videoSink = (VideoSink) it.next();
                        fch fchVar2 = new fch();
                        fchVar2.a = videoSink;
                        arrayList.add(fchVar2);
                        if (nt1Var.a == cdh.a && !videoTrack.isDisposed()) {
                            videoTrack.addSink(fchVar2);
                        }
                    }
                }
                nt1 nt1Var2 = (nt1) this.h.get(str);
                if (nt1Var2 != null) {
                    this.h.remove(str);
                    this.i.remove(nt1Var2);
                }
                this.h.put(str, nt1Var);
                this.i.put(nt1Var, str);
                this.f.put(nt1Var, Collections.unmodifiableList(arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
