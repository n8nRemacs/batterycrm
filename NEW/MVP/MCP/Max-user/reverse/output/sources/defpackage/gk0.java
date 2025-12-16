package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.Set;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class gk0 implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gk0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.p6
    public final void run() throws IOException {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fba) obj).j(new dk0(2));
                break;
            case 1:
                sz3 sz3Var = (sz3) obj;
                raa raaVar = sz3Var.I0.Y;
                if (raaVar != null) {
                    kp8 kp8Var = sz3Var.H0;
                    Iterator it = ((Set) raaVar.a).iterator();
                    while (it.hasNext()) {
                        ((v9a) it.next()).d.j(new ek0(kp8Var, i2));
                    }
                    break;
                }
                break;
            case 2:
                ((w14) obj).b();
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            case 4:
                ypc ypcVar = (ypc) obj;
                wqi.c("xo4", "close socket for host: %s", ypcVar.f.toString());
                Socket socket = ypcVar.d;
                if (socket != null) {
                    try {
                        socket.close();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 5:
                ((js5) obj).a.d(4, 0L);
                break;
            case 6:
                ql6 ql6VarB0 = ((FrgLocalVideo) obj).B0();
                if (ql6VarB0 != null) {
                    ((ActLocalMedias) ql6VarB0).V(!r0.X0, false);
                    break;
                }
                break;
            case 7:
                zm8 zm8Var = (zm8) obj;
                for (int i3 = 0; i3 < zm8Var.n.size(); i3++) {
                    u6e u6eVar = (u6e) zm8Var.n.get(i3);
                    if (u6eVar.a == 1) {
                        pb2 pb2VarM = zm8Var.a.M(u6eVar.d.a);
                        if (pb2VarM == null || !pb2VarM.m0()) {
                            zm8Var.n.remove(i3);
                        } else {
                            zm8Var.n.set(i3, u6e.a(pb2VarM, u6eVar.c));
                        }
                    }
                }
                rm8 rm8Var = zm8Var.i;
                if (rm8Var != null) {
                    rm8Var.f(zm8Var.r, zm8Var.n, true);
                    break;
                }
                break;
            case 8:
                ((vm9) obj).d.set(false);
                break;
            case 9:
                ((eaa) obj).B0 = null;
                break;
            case 10:
                ((r1g) obj).b(true);
                break;
            case 11:
                ((qs3) obj).getClass();
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                wqi.c("aug", "putUploadInRepository: finished for upload=%s", (ttg) obj);
                break;
            case 13:
                wqi.c("u2h", "removeFromRepository: success, conversionData = %s", (l2h) obj);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                wqi.c("u2h", "putConversionInRepository: success, videoConversion = %s", (k2h) obj);
                break;
            default:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = (VideoPlayerSeekBarPreview) obj;
                bwd.b(videoPlayerSeekBarPreview.t0);
                videoPlayerSeekBarPreview.c.a(false);
                break;
        }
    }

    public /* synthetic */ gk0(xo4 xo4Var, ypc ypcVar) {
        this.a = 4;
        this.b = ypcVar;
    }
}
