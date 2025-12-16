package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* loaded from: classes.dex */
public final class lu6 extends dtf implements sm6 {
    public final /* synthetic */ GifViewerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu6(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.X = gifViewerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lu6 lu6Var = (lu6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lu6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lu6 lu6Var = new lu6(continuation, this.X);
        lu6Var.o = obj;
        return lu6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        jp2 jp2Var = (jp2) this.o;
        yy7[] yy7VarArr = GifViewerWidget.u0;
        int i = jp2Var.a;
        float f = jp2Var.b;
        if (i != 0) {
            GifViewerWidget gifViewerWidget = this.X;
            gifViewerWidget.C0().setRotation(f);
            gifViewerWidget.C0().requestLayout();
            j09 j09VarF = gifViewerWidget.D0().F(gifViewerWidget.z0(), gifViewerWidget.y0());
            b09 b09Var = j09VarF instanceof b09 ? (b09) j09VarF : null;
            if (b09Var != null) {
                gifViewerWidget.A0().setImageRotation(f);
                gifViewerWidget.A0().k(b09Var.d, true);
                gifViewerWidget.A0().requestLayout();
            }
        }
        return qqg.a;
    }
}
