package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* loaded from: classes.dex */
public final class udh extends dtf implements sm6 {
    public final /* synthetic */ VideoViewerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udh(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.X = videoViewerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        udh udhVar = (udh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        udhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        udh udhVar = new udh(continuation, this.X);
        udhVar.o = obj;
        return udhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        cbh cbhVarO0;
        g8j.b(obj);
        zh5 zh5Var = (zh5) this.o;
        yy7[] yy7VarArr = VideoViewerWidget.u0;
        if (zh5Var instanceof qh5) {
            qh5 qh5Var = (qh5) zh5Var;
            long j = qh5Var.a.j();
            VideoViewerWidget videoViewerWidget = this.X;
            if (j == videoViewerWidget.z0() && fni.a(qh5Var.a.w(), videoViewerWidget.y0())) {
                wqi.c(videoViewerWidget.a, "Media viewer. Clear prev page", new Object[0]);
                g2h g2hVar = videoViewerWidget.s0;
                boolean z = g2hVar != null && g2hVar.g();
                videoViewerWidget.s0 = null;
                rdh rdhVarA0 = videoViewerWidget.A0();
                if (rdhVarA0 != null && (cbhVarO0 = ((ChatMediaViewerScreen) rdhVarA0).O0()) != null) {
                    yq2 yq2VarD0 = videoViewerWidget.D0();
                    long jZ0 = videoViewerWidget.z0();
                    String strY0 = videoViewerWidget.y0();
                    long jE = cbhVarO0.e();
                    long duration = cbhVarO0.getDuration();
                    yq2VarD0.getClass();
                    svi.d(yq2VarD0.a, bia.a, i84.c, new pq2(yq2VarD0, jZ0, strY0, jE, duration, z, null));
                    cbhVarO0.pause();
                    cbhVarO0.a0(null);
                    cbhVarO0.stop();
                }
                videoViewerWidget.C0().b();
            }
        }
        return qqg.a;
    }
}
