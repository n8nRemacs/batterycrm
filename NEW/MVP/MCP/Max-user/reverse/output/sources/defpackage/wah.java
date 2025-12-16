package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class wah extends sm implements j1g, tsb {
    public final long X;
    public final long Y;
    public final String Z;
    public final long d;
    public final long o;
    public final boolean s0;
    public final boolean t0;
    public final String u0;
    public final boolean v0;
    public final String w0;
    public final bwf x0;

    public wah(long j, long j2, long j3, long j4, long j5, String str, boolean z, boolean z2, String str2, boolean z3) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = j5;
        this.Z = str;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = str2;
        this.v0 = z3;
        this.w0 = wah.class.getName();
        this.x0 = new bwf(new kvf(18, this));
    }

    @Override // defpackage.tsb
    public final int c() throws Throwable {
        long j = this.Y;
        if (j <= 0) {
            return 1;
        }
        si9 si9VarM = n().m(j);
        return (si9VarM == null || si9VarM.t0 == jm9.DELETED) ? 3 : 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        xah xahVar = (xah) l0gVar;
        if (!this.s0) {
            k().c(new yah(this.a, this.d, this.Y, this.Z, xahVar.c));
            return;
        }
        Map map = xahVar.c;
        if (map.size() == 1 && map.containsKey("EXTERNAL")) {
            return;
        }
        String str = this.Z;
        if (str == null) {
            str = "";
        }
        m2g m2gVar = new m2g(this.Y, str, this.d, 0L, 0L, 0L, xpi.f(xahVar.c), true, false, 0L, "", 0, false, !this.t0, "VIDEO");
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ((dv5) tmVar.I.getValue()).a(m2gVar);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) throws Throwable {
        si9 si9VarM = n().m(this.Y);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            k().c(new rj0(this.a, pzfVar));
            f();
            return;
        }
        if ("attachment.token.expired".equals(pzfVar.b)) {
            wqi.e(this.w0, "videoPlayCmd failed with token expired, retry videoPlayCmd", null);
            if (this.v0) {
                k().c(new rj0(this.a, pzfVar));
            } else {
                zah zahVar = (zah) this.x0.getValue();
                synchronized (zahVar) {
                    if (zahVar.b == -1) {
                        zahVar.a.k().d(zahVar);
                        hwa hwaVarJ = zahVar.a.j();
                        wah wahVar = zahVar.a;
                        zahVar.b = hwaVarJ.y(wahVar.o, Collections.singletonList(Long.valueOf(wahVar.X)));
                    }
                }
            }
        } else if ("video.not.found".equals(pzfVar.b)) {
            wqi.e(this.w0, "videoPlayCmd failed, set attach status to ERROR", null);
            n().r(this.Y, this.Z, new fwg(14));
            k().c(new itg(si9VarM.Z, si9VarM.a, false));
        }
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.VideoPlay videoPlay = new Tasks.VideoPlay();
        videoPlay.requestId = this.a;
        videoPlay.videoId = this.d;
        videoPlay.chatServerId = this.o;
        videoPlay.messageServerId = this.X;
        videoPlay.messageId = this.Y;
        String str = this.Z;
        if (str != null) {
            videoPlay.attachLocalId = str;
        }
        videoPlay.startDownload = this.s0;
        videoPlay.saveToGallery = this.t0;
        videoPlay.token = this.u0;
        return fl9.toByteArray(videoPlay);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.u0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        return new y1h(this.u0, this.d, this.o, this.X);
    }
}
