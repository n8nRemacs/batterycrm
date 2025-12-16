package defpackage;

import one.me.pinbars.PinBarsWidget;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class szb implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ szb(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        Object[] objArr = 0;
        PinBarsWidget pinBarsWidget = this.b;
        switch (i) {
            case 0:
                int i2 = PinBarsWidget.u0;
                return pinBarsWidget.getRouter();
            case 1:
                int i3 = PinBarsWidget.u0;
                zy6 zy6Var = pinBarsWidget.y0().Y;
                if (zy6Var != null) {
                    pb2 pb2Var = (pb2) zy6Var.a.getValue();
                    qf2 qf2VarT = pb2Var != null ? pb2Var.t() : null;
                    String str = qf2VarT != null ? qf2VarT.c : null;
                    if (str == null || str.length() == 0) {
                        wqi.c(zy6.class.getName(), "Can't join to group call in chat because joinLink is empty", new Object[0]);
                    } else {
                        zy6Var.g.h(new ez6(str, qf2VarT.g == 2));
                    }
                }
                return qqg.a;
            case 2:
                int i4 = PinBarsWidget.u0;
                nzb nzbVar = nzb.a;
                lzf lzfVar = (lzf) nzbVar.getAccessor().c(8);
                bwf bwfVarD = nzbVar.getAccessor().d(HttpStatus.SC_PRECONDITION_FAILED);
                bwf bwfVarD2 = nzbVar.getAccessor().d(221);
                bwf bwfVarD3 = nzbVar.getAccessor().d(222);
                l7a l7aVar = (l7a) nzbVar.getAccessor().c(37);
                bwf bwfVarD4 = nzbVar.getAccessor().d(454);
                ozb ozbVar = (ozb) pinBarsWidget.b.getValue();
                return new qzb(lzfVar, bwfVarD, bwfVarD2, bwfVarD3, nzbVar.getAccessor().d(123), nzbVar.getAccessor().d(329), nzbVar.getAccessor().d(332), nzbVar.getAccessor().d(15), nzbVar.getAccessor().d(150), nzbVar.getAccessor().d(46), nzbVar.getAccessor().d(48), l7aVar, bwfVarD4, nzbVar.getAccessor().d(514), nzbVar.getAccessor().d(198), nzbVar.getAccessor().d(281), nzbVar.getAccessor().d(489), nzbVar.getAccessor().d(163), ozbVar, (tih) nzbVar.getAccessor().c(76));
            default:
                int i5 = PinBarsWidget.u0;
                return new kj1(new bwf(new szb(pinBarsWidget, objArr == true ? 1 : 0)), new s2i(pinBarsWidget, 0));
        }
    }
}
