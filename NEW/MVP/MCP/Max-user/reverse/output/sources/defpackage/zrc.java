package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import one.me.qrscanner.QrScannerWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class zrc extends dtf implements sm6 {
    public final /* synthetic */ QrScannerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrc(Continuation continuation, QrScannerWidget qrScannerWidget) {
        super(2, continuation);
        this.X = qrScannerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zrc zrcVar = (zrc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zrcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zrc zrcVar = new zrc(continuation, this.X);
        zrcVar.o = obj;
        return zrcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8, types: [c54] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ?? r4;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof prc) {
            ytd router = this.X.getRouter();
            js jsVar = new js();
            jsVar.addLast(router);
            loop0: while (true) {
                if (jsVar.isEmpty()) {
                    r4 = 0;
                    break;
                }
                ArrayList arrayListE = ((ytd) jsVar.removeLast()).e();
                for (int i = ve3.i(arrayListE); -1 < i; i--) {
                    r4 = ((bud) arrayListE.get(i)).a;
                    if (r4 instanceof qrc) {
                        break loop0;
                    }
                    Iterator it = new fqd(r4.getChildRouters()).iterator();
                    while (true) {
                        eqd eqdVar = (eqd) it;
                        if (eqdVar.b.hasPrevious()) {
                            jsVar.addLast((ytd) eqdVar.b.previous());
                        }
                    }
                }
            }
            qrc qrcVar = (qrc) r4;
            if (qrcVar != null) {
                ((WebAppRootScreen) qrcVar).N0().c1.m(null, ((prc) cdaVar).b);
            }
            orc.c.p0().d();
        } else if (cdaVar instanceof ei4) {
            orc.c.s0((ei4) cdaVar);
            QrScannerWidget qrScannerWidget = this.X;
            yy7[] yy7VarArr = QrScannerWidget.E0;
            w12 controller = ((a9c) qrScannerWidget.s0.D(qrScannerWidget, QrScannerWidget.E0[2])).getController();
            if (controller != null) {
                jei.b();
                yc7 yc7Var = controller.g;
                controller.f = null;
                controller.g = null;
                dd7 dd7Var = controller.h;
                synchronized (dd7Var.q) {
                    gd7 gd7Var = dd7Var.p;
                    gd7Var.c();
                    synchronized (gd7Var.B0) {
                        gd7Var.a = null;
                        gd7Var.Y = null;
                    }
                    if (dd7Var.r != null) {
                        dd7Var.c = 2;
                        dd7Var.r();
                    }
                    dd7Var.r = null;
                }
                controller.k(yc7Var, null);
            }
        }
        return qqg.a;
    }
}
