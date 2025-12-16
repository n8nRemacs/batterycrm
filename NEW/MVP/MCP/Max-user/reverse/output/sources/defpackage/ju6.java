package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* loaded from: classes.dex */
public final class ju6 extends dtf implements sm6 {
    public final /* synthetic */ GifViewerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju6(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.X = gifViewerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ju6 ju6Var = (ju6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ju6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ju6 ju6Var = new ju6(continuation, this.X);
        ju6Var.o = obj;
        return ju6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zh5 zh5Var = (zh5) this.o;
        yy7[] yy7VarArr = GifViewerWidget.u0;
        boolean z = zh5Var instanceof ph5;
        GifViewerWidget gifViewerWidget = this.X;
        if (z) {
            ph5 ph5Var = (ph5) zh5Var;
            if (fni.a(ph5Var.a.w(), gifViewerWidget.y0()) && ph5Var.a.j() == gifViewerWidget.z0()) {
                j09 j09VarF = gifViewerWidget.D0().F(gifViewerWidget.z0(), gifViewerWidget.y0());
                b09 b09Var = j09VarF instanceof b09 ? (b09) j09VarF : null;
                if (b09Var != null) {
                    if (gifViewerWidget.A0().getFailure()) {
                        gifViewerWidget.D0().K(gifViewerWidget.z0(), gifViewerWidget.y0());
                        gifViewerWidget.A0().k(b09Var.d, gifViewerWidget.A0().getFailure());
                    } else {
                        gifViewerWidget.D0().L(gifViewerWidget.z0(), gifViewerWidget.y0());
                    }
                }
            }
        } else if (zh5Var instanceof qh5) {
            qh5 qh5Var = (qh5) zh5Var;
            if (fni.a(qh5Var.a.w(), gifViewerWidget.y0()) && qh5Var.a.j() == gifViewerWidget.z0()) {
                gifViewerWidget.s0 = null;
                cbh cbhVarB0 = gifViewerWidget.B0();
                if (cbhVarB0 != null) {
                    cbhVarB0.Q(false);
                    cbhVarB0.pause();
                    cbhVarB0.a0(null);
                    cbhVarB0.stop();
                }
                gifViewerWidget.C0().b();
            }
        } else if (zh5Var instanceof rh5) {
            b09 b09Var2 = ((rh5) zh5Var).a;
            if (fni.a(b09Var2.X, gifViewerWidget.y0()) && b09Var2.a == gifViewerWidget.z0()) {
                gifViewerWidget.A0().k(b09Var2.d, true);
            }
        }
        return qqg.a;
    }
}
