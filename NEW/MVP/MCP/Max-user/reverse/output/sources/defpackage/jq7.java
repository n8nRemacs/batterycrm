package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class jq7 extends ur0 implements tsb {
    public static final /* synthetic */ int s0 = 0;
    public final String Y;
    public final m2g Z;

    public jq7(long j, String str, long j2, long j3, m2g m2gVar) {
        super(2, j, j2, Collections.singletonList(Long.valueOf(j3)));
        this.Y = str;
        this.Z = m2gVar;
    }

    @Override // defpackage.tsb
    public final int c() throws Throwable {
        qi9 qi9VarN = n();
        m2g m2gVar = this.Z;
        si9 si9VarM = qi9VarN.m(m2gVar.a);
        if (si9VarM != null && si9VarM.t0 != jm9.DELETED && si9VarM.A()) {
            return 1;
        }
        wqi.c("jq7", "onPreExecute: messageId " + m2gVar.a + " is wrong", new Object[0]);
        v(si9VarM);
        k().c(new k25());
        return 3;
    }

    @Override // defpackage.ur0, defpackage.j1g
    public final void e(pzf pzfVar) {
        super.e(pzfVar);
        if (qaj.c(pzfVar.b)) {
            return;
        }
        wqi.e("jq7", "Can't update msg", null);
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        wqi.c("jq7", "onMaxFailCount", new Object[0]);
        r().d(this.a);
        v(n().m(this.Z.a));
        k().c(new k25());
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.FileDownload fileDownload = new Tasks.FileDownload();
        m2g m2gVar = this.Z;
        fileDownload.messageId = m2gVar.a;
        fileDownload.attachId = m2gVar.b;
        fileDownload.videoId = m2gVar.c;
        fileDownload.audioId = m2gVar.d;
        fileDownload.mp4GifId = m2gVar.e;
        fileDownload.stickerId = m2gVar.f;
        fileDownload.fileId = m2gVar.j;
        fileDownload.fileName = m2gVar.k;
        fileDownload.url = m2gVar.g;
        fileDownload.notifyProgress = m2gVar.h;
        fileDownload.checkAutoloadConnection = m2gVar.i;
        fileDownload.invalidateCount = m2gVar.l;
        fileDownload.useOriginalExtension = m2gVar.m;
        fileDownload.notCopyVideoToGallery = m2gVar.n;
        fileDownload.attachType = m2gVar.p;
        Tasks.InvalidateAndDownloadAudio invalidateAndDownloadAudio = new Tasks.InvalidateAndDownloadAudio();
        invalidateAndDownloadAudio.requestId = this.a;
        invalidateAndDownloadAudio.outputPath = this.Y;
        invalidateAndDownloadAudio.chatServerId = this.o;
        invalidateAndDownloadAudio.serverMessageId = ((Number) ((List) this.X).get(0)).longValue();
        invalidateAndDownloadAudio.fileDownload = fileDownload;
        return fl9.toByteArray(invalidateAndDownloadAudio);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.M0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ur0, defpackage.j1g
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void d(w4a w4aVar) throws Throwable {
        String str;
        super.d(w4aVar);
        wqi.c("jq7", "Receive msg get response", new Object[0]);
        qi9 qi9VarN = n();
        m2g m2gVar = this.Z;
        si9 si9VarM = qi9VarN.m(m2gVar.a);
        if (si9VarM == null || !si9VarM.A()) {
            wqi.e("jq7", "No message after msg get", null);
            f();
            return;
        }
        wqi.c("jq7", "messageDb = " + si9VarM + ", forwardLink = " + (si9VarM.v() ? si9VarM.A0 : null), new Object[0]);
        w00 w00VarH = si9VarM.h();
        if (w00VarH == null || (str = w00VarH.b) == null) {
            return;
        }
        m2g m2gVar2 = new m2g(m2gVar.a, m2gVar.b, m2gVar.c, m2gVar.d, m2gVar.e, m2gVar.f, str, m2gVar.h, m2gVar.i, m2gVar.j, m2gVar.k, m2gVar.l + 1, m2gVar.m, m2gVar.n, "");
        tm tmVar = this.c;
        ((dv5) (tmVar != null ? tmVar : null).I.getValue()).a(m2gVar2);
    }

    public final void v(si9 si9Var) {
        if (si9Var == null || si9Var.t0 == jm9.DELETED) {
            return;
        }
        m2g m2gVar = this.Z;
        w10 w10VarC = ssi.c(si9Var, m2gVar.b);
        if (w10VarC != null) {
            if (!w10VarC.o.a()) {
                n().r(si9Var.a, w10VarC.r, new os5(23));
                k().c(new itg(si9Var.Z, si9Var.a, false));
            } else {
                tm tmVar = this.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                ((q97) tmVar.H.getValue()).a.a(new File(this.Y), m2gVar.b);
            }
        }
    }
}
