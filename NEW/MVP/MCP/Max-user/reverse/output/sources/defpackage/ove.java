package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class ove implements je8, q8a {
    public final EglBase.Context a;
    public final he8 b;
    public final rve c;
    public final f54 d;
    public final r8a e;
    public final Context f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final y6d k;
    public final boolean l;
    public final si1 m;
    public volatile ie8 o;
    public volatile VideoSink p;
    public final wd8 q;
    public final btd r;
    public final y8g s;
    public final nve t;
    public final awd u;
    public ge8 w;
    public final CopyOnWriteArraySet n = new CopyOnWriteArraySet();
    public b32 v = null;

    public ove(mve mveVar) {
        y6d y6dVar = mveVar.e;
        this.k = y6dVar;
        this.c = mveVar.a;
        this.d = mveVar.b;
        this.j = mveVar.i;
        this.f = mveVar.d;
        this.e = mveVar.c;
        this.a = mveVar.k;
        this.l = mveVar.j;
        this.m = mveVar.f;
        this.b = mveVar.g;
        this.q = mveVar.l;
        this.r = mveVar.n;
        this.h = "ARDAMSv0";
        this.i = "ARDAMSa0";
        this.g = "ARDAMS";
        y6dVar.log("SlmsSource", "local media stream id = ARDAMS local video track id = ARDAMSv0 local audio track id = ARDAMSa0");
        this.s = mveVar.m;
        this.t = mveVar.o;
        this.u = mveVar.h;
    }

    public final os0 a() {
        boolean z = this.o == null;
        if (z) {
            fe8 fe8Var = new fe8();
            fe8Var.o = false;
            fe8Var.s = null;
            fe8Var.t = false;
            fe8Var.a = this.c.d;
            fe8Var.c = this.c.a;
            fe8Var.b = this.d;
            fe8Var.e = this.g;
            fe8Var.f = this.h;
            fe8Var.g = this.i;
            fe8Var.d = this.f.getApplicationContext();
            fe8Var.h = this.k;
            fe8Var.i = this.a;
            fe8Var.k = true;
            fe8Var.j = this.b;
            fe8Var.p = this.l;
            si1 si1Var = this.m;
            fe8Var.l = si1Var.q;
            wd8 wd8Var = this.q;
            fe8Var.q = wd8Var;
            fe8Var.m = this.r;
            fe8Var.s = this.j;
            qi1 qi1Var = si1Var.z;
            fe8Var.t = qi1Var.a;
            fe8Var.o = qi1Var.k;
            fe8Var.n = this.s;
            fe8Var.r = this.u;
            if (fe8Var.a == null || wd8Var == null || fe8Var.b == null || TextUtils.isEmpty(fe8Var.e) || TextUtils.isEmpty(fe8Var.f) || TextUtils.isEmpty(fe8Var.g) || fe8Var.h == null || fe8Var.j == null || fe8Var.i == null || fe8Var.m == null || fe8Var.n == null || fe8Var.r == null) {
                throw new IllegalStateException();
            }
            this.o = new ie8(fe8Var);
            this.o.x = this.w;
            this.o.c.add(this);
            if (this.v != null) {
                this.o.k(this.v);
            }
            VideoSink videoSink = this.p;
            if (videoSink != null) {
                this.o.j(videoSink);
            }
            this.o.d(this.e);
            nve nveVar = this.t;
            if (nveVar != null) {
                ie8 ie8Var = this.o;
                ie8Var.getClass();
                nveVar.b(new ee8(ie8Var));
            }
        }
        return new os0(this.o, z);
    }

    @Override // defpackage.je8
    public final void b(ie8 ie8Var) {
        this.k.log("SlmsSource", "onLocalMediaStreamChanged");
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((je8) it.next()).b(ie8Var);
        }
    }

    public final int c() {
        ie8 ie8Var = this.o;
        if (ie8Var != null) {
            d12 d12Var = ie8Var.r;
            if (d12Var != null && d12Var.k) {
                MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) ie8Var.y.e;
                if (mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) {
                    return d12Var.i ? 1 : 2;
                }
            }
            i1e i1eVar = ie8Var.t;
            if (i1eVar != null && i1eVar.d) {
                MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) ie8Var.z.e;
                if (mediaStreamTrack2 != null ? mediaStreamTrack2.enabled() : false) {
                    return 3;
                }
            }
        }
        return 0;
    }

    public final void d(boolean z) {
        ie8 ie8Var = this.o;
        if (ie8Var != null) {
            m50 m50Var = ie8Var.j;
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) m50Var.e;
            if ((mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) != z) {
                ie8Var.n.log("OKRTCLmsAdapter", xc0.f("setAudioShareTrackEnabled, enabled=", z));
                m50Var.o(z);
            }
        }
    }

    @Override // defpackage.q8a
    public final void h(r8a r8aVar) {
        this.k.log("SlmsSource", "onMediaSettingsChanged, " + r8aVar);
        this.c.a.execute(new aee(this, 8, r8aVar));
    }
}
