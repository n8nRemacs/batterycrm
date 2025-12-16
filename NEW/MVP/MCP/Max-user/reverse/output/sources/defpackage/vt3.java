package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.List;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;

/* loaded from: classes.dex */
public abstract class vt3 implements dnb {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public vt3(awd awdVar, y6d y6dVar, ppb ppbVar, y6i y6iVar) {
        this.a = awdVar;
        this.b = y6dVar;
        this.d = ppbVar;
        this.c = new Handler(Looper.getMainLooper());
        this.e = y6iVar;
    }

    public abstract void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void d();

    public abstract void e(ti1 ti1Var, String str);

    public abstract void f();

    public abstract MediaSource g();

    public abstract MediaStreamTrack h(String str, MediaSource mediaSource);

    public abstract Object i();

    public String j() {
        return getClass().getSimpleName();
    }

    public abstract void k(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

    public void l() {
        y6d y6dVar = (y6d) this.c;
        if (((MediaStreamTrack) this.e) != null) {
            y6dVar.log(j(), this + ": An attempt to create track, while got one, ignore");
            return;
        }
        if (((MediaSource) this.d) != null) {
            y6dVar.log(j(), this + ": An attempt to create source, while got one, ignore");
            return;
        }
        MediaSource mediaSourceG = g();
        this.d = mediaSourceG;
        MediaStreamTrack mediaStreamTrackH = h((String) this.a, mediaSourceG);
        this.e = mediaStreamTrackH;
        b((MediaStream) this.b, mediaStreamTrackH);
    }

    public void m() {
        y6d y6dVar = (y6d) this.c;
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.e;
        if (mediaStreamTrack != null) {
            c((MediaStream) this.b, mediaStreamTrack);
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) this.e;
        if (mediaStreamTrack2 != null) {
            mediaStreamTrack2.dispose();
            y6dVar.log(j(), this + ": " + w0a.c(mediaStreamTrack2) + " was disposed");
        }
        this.e = null;
        MediaSource mediaSource = (MediaSource) this.d;
        if (mediaSource != null) {
            mediaSource.dispose();
            y6dVar.log(j(), this + ": " + w0a.c(mediaSource) + " was disposed");
        }
        this.d = null;
    }

    public void n(ht3 ht3Var) {
        synchronized (this.c) {
            if (((LinkedHashSet) this.e).remove(ht3Var) && ((LinkedHashSet) this.e).isEmpty()) {
                s();
            }
        }
    }

    public void o(boolean z) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.e;
        if (mediaStreamTrack != null) {
            mediaStreamTrack.setEnabled(z);
        }
    }

    public abstract void p(String str, nt1 nt1Var, List list);

    public void q(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.d;
            if (obj2 == null || !obj2.equals(obj)) {
                this.d = obj;
                ((i30) ((u5i) this.a).c).execute(new my1(ue3.d0((LinkedHashSet) this.e), 16, this));
            }
        }
    }

    public abstract void r();

    public abstract void s();

    public void t(RtpSender rtpSender) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.e;
        if (rtpSender == null || mediaStreamTrack == null || rtpSender.track() == mediaStreamTrack) {
            return;
        }
        ((y6d) this.c).log(j(), this + ": bind " + w0a.c(mediaStreamTrack) + " with " + w0a.c(rtpSender));
        rtpSender.setTrack(mediaStreamTrack, false);
    }

    public vt3(String str, MediaStream mediaStream, y6d y6dVar) {
        this.a = str;
        this.b = mediaStream;
        this.c = y6dVar;
    }

    public vt3(Context context, u5i u5iVar) {
        this.a = u5iVar;
        this.b = context.getApplicationContext();
        this.c = new Object();
        this.e = new LinkedHashSet();
    }
}
