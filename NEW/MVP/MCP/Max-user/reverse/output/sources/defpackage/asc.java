package defpackage;

import kotlin.coroutines.Continuation;
import one.me.qrscanner.QrScannerWidget;

/* loaded from: classes2.dex */
public final class asc extends dtf implements sm6 {
    public final /* synthetic */ QrScannerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asc(Continuation continuation, QrScannerWidget qrScannerWidget) {
        super(2, continuation);
        this.X = qrScannerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        asc ascVar = (asc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ascVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        asc ascVar = new asc(continuation, this.X);
        ascVar.o = obj;
        return ascVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            yy7[] yy7VarArr = QrScannerWidget.E0;
            this.X.A0().t(yyd.a);
        }
        return qqg.a;
    }
}
