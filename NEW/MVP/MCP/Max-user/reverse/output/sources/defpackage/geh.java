package defpackage;

import android.widget.LinearLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes.dex */
public final class geh extends dtf implements sm6 {
    public final /* synthetic */ VideoWebViewScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geh(Continuation continuation, VideoWebViewScreen videoWebViewScreen) {
        super(2, continuation);
        this.X = videoWebViewScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        geh gehVar = (geh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gehVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        geh gehVar = new geh(continuation, this.X);
        gehVar.o = obj;
        return gehVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zlb zlbVar = (zlb) this.o;
        VideoWebViewScreen videoWebViewScreen = this.X;
        bbd bbdVar = videoWebViewScreen.v0;
        bbd bbdVar2 = videoWebViewScreen.w0;
        yy7[] yy7VarArr = VideoWebViewScreen.H0;
        if (zlbVar == null || zlbVar.equals(wlb.a)) {
            yy7[] yy7VarArr2 = VideoWebViewScreen.H0;
            ((m9b) bbdVar.D(videoWebViewScreen, yy7VarArr2[7])).setVisibility(0);
            ((LinearLayout) bbdVar2.D(videoWebViewScreen, yy7VarArr2[8])).setVisibility(8);
            videoWebViewScreen.P0().setVisibility(8);
        } else if (zlbVar.equals(vlb.a)) {
            yy7[] yy7VarArr3 = VideoWebViewScreen.H0;
            ((LinearLayout) bbdVar2.D(videoWebViewScreen, yy7VarArr3[8])).setVisibility(0);
            videoWebViewScreen.P0().setVisibility(8);
            ((m9b) bbdVar.D(videoWebViewScreen, yy7VarArr3[7])).setVisibility(8);
        } else {
            if (!(zlbVar instanceof xlb) && !zlbVar.equals(ylb.a)) {
                throw new NoWhenBranchMatchedException();
            }
            videoWebViewScreen.P0().setVisibility(0);
            yy7[] yy7VarArr4 = VideoWebViewScreen.H0;
            ((LinearLayout) bbdVar2.D(videoWebViewScreen, yy7VarArr4[8])).setVisibility(8);
            ((m9b) bbdVar.D(videoWebViewScreen, yy7VarArr4[7])).setVisibility(8);
        }
        return qqg.a;
    }
}
