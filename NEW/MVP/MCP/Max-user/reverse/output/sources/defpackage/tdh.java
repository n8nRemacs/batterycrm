package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* loaded from: classes.dex */
public final class tdh extends dtf implements sm6 {
    public final /* synthetic */ VideoViewerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdh(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.X = videoViewerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tdh tdhVar = (tdh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tdhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tdh tdhVar = new tdh(continuation, this.X);
        tdhVar.o = obj;
        return tdhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        jp2 jp2Var = (jp2) this.o;
        yy7[] yy7VarArr = VideoViewerWidget.u0;
        int i = jp2Var.a;
        float f = jp2Var.b;
        if (i != 0) {
            VideoViewerWidget videoViewerWidget = this.X;
            videoViewerWidget.C0().setRotation(f);
            videoViewerWidget.C0().requestLayout();
            videoViewerWidget.B0().setRotation(f);
            j09 j09VarF = videoViewerWidget.D0().F(videoViewerWidget.z0(), videoViewerWidget.y0());
            h09 h09Var = j09VarF instanceof h09 ? (h09) j09VarF : null;
            if (h09Var != null) {
                videoViewerWidget.B0().k(h09Var.d, ((jp2) videoViewerWidget.D0().g1.a.getValue()).b);
                videoViewerWidget.B0().requestLayout();
            }
        }
        return qqg.a;
    }
}
