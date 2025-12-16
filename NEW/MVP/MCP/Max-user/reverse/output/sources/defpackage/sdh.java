package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* loaded from: classes.dex */
public final class sdh extends dtf implements sm6 {
    public final /* synthetic */ VideoViewerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdh(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.X = videoViewerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sdh sdhVar = (sdh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sdhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sdh sdhVar = new sdh(continuation, this.X);
        sdhVar.o = obj;
        return sdhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g2h g2hVar;
        hc8 hc8Var;
        cbh cbhVarO0;
        g8j.b(obj);
        lp2 lp2Var = (lp2) this.o;
        VideoViewerWidget videoViewerWidget = this.X;
        String str = videoViewerWidget.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                boolean z = lp2Var.b != null;
                j09 j09Var = lp2Var.a;
                long jZ0 = videoViewerWidget.z0();
                String strY0 = videoViewerWidget.y0();
                StringBuilder sb = new StringBuilder("Media viewer. Video page state changed, \n                        |hasContent:");
                sb.append(z);
                sb.append(", \n                        |item:");
                sb.append(j09Var);
                sb.append(", curMsgId:");
                hf3.e(jZ0, ", \n                        |curAttachId:", strY0, sb);
                sb.append("\n                        |");
                l6bVar.c(lg8Var, str, wmf.e(sb.toString()), null);
            }
        }
        j09 j09Var2 = lp2Var.a;
        if (j09Var2 != null && j09Var2.j() == videoViewerWidget.z0() && fni.a(lp2Var.a.w(), videoViewerWidget.y0()) && (g2hVar = lp2Var.b) != null) {
            videoViewerWidget.s0 = g2hVar;
            rdh rdhVarA0 = videoViewerWidget.A0();
            if (rdhVarA0 != null && (cbhVarO0 = ((ChatMediaViewerScreen) rdhVarA0).O0()) != null) {
                cbhVarO0.I0(lp2Var.b, true, bbh.ATTACH_VIEWER, (16 & 8) != 0 ? 1 : 4, (16 & 16) != 0);
                if (((gu5) ((rt5) videoViewerWidget.b.getValue())).r()) {
                    videoViewerWidget.C0().setAlpha(0.0f);
                    cbhVarO0.X(new iu6(videoViewerWidget, cbhVarO0, 2));
                }
            }
            if (!((gu5) ((rt5) videoViewerWidget.b.getValue())).r() && (hc8Var = videoViewerWidget.Z) != null) {
                hc8Var.s();
            }
            videoViewerWidget.C0().a(videoViewerWidget.t0);
        }
        return qqg.a;
    }
}
