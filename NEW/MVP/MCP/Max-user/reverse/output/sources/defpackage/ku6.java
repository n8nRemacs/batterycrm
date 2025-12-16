package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* loaded from: classes.dex */
public final class ku6 extends dtf implements sm6 {
    public final /* synthetic */ GifViewerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku6(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.X = gifViewerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ku6 ku6Var = (ku6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ku6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ku6 ku6Var = new ku6(continuation, this.X);
        ku6Var.o = obj;
        return ku6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g2h g2hVar;
        hc8 hc8Var;
        g8j.b(obj);
        lp2 lp2Var = (lp2) this.o;
        GifViewerWidget gifViewerWidget = this.X;
        String str = gifViewerWidget.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                boolean z = lp2Var.b != null;
                j09 j09Var = lp2Var.a;
                long jZ0 = gifViewerWidget.z0();
                String strY0 = gifViewerWidget.y0();
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
        if (j09Var2 != null && j09Var2.j() == gifViewerWidget.z0() && fni.a(lp2Var.a.w(), gifViewerWidget.y0()) && (g2hVar = lp2Var.b) != null) {
            gifViewerWidget.s0 = g2hVar;
            cbh cbhVarB0 = gifViewerWidget.B0();
            if (cbhVarB0 != null) {
                cbhVarB0.b(0.0f);
                cbhVarB0.Q(true);
                cbhVarB0.I0(lp2Var.b, true, bbh.ATTACH_VIEWER, (16 & 8) != 0 ? 1 : 4, (16 & 16) != 0);
                if (((gu5) ((rt5) gifViewerWidget.b.getValue())).r()) {
                    gifViewerWidget.C0().setAlpha(0.0f);
                    cbhVarB0.X(new iu6(gifViewerWidget, cbhVarB0, 0));
                }
            }
            if (!((gu5) ((rt5) gifViewerWidget.b.getValue())).r() && (hc8Var = gifViewerWidget.Z) != null) {
                hc8Var.s();
            }
            gifViewerWidget.C0().a(gifViewerWidget.t0);
        }
        return qqg.a;
    }
}
