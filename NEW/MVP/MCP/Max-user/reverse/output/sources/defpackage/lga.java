package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lga extends dtf implements sm6 {
    public final /* synthetic */ oga X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lga(oga ogaVar, Continuation continuation) {
        super(2, continuation);
        this.X = ogaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lga lgaVar = (lga) l((ybe) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lgaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lga lgaVar = new lga(this.X, continuation);
        lgaVar.o = obj;
        return lgaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ybe ybeVar = (ybe) this.o;
        xbe xbeVar = ybeVar.a;
        vbe vbeVar = xbeVar instanceof vbe ? (vbe) xbeVar : null;
        Long l = vbeVar != null ? new Long(vbeVar.c) : null;
        i2c i2cVar = ybeVar.b;
        g2c g2cVar = i2cVar instanceof g2c ? (g2c) i2cVar : null;
        Long l2 = g2cVar != null ? new Long(g2cVar.b) : null;
        if (l == null) {
            l = l2;
        }
        tcf tcfVar = this.X.X;
        Iterable<zea> iterable = (Iterable) tcfVar.getValue();
        ArrayList arrayList = new ArrayList(we3.q(iterable, 10));
        for (zea zeaVar : iterable) {
            arrayList.add(zea.x(zeaVar, l != null && zeaVar.a == l.longValue()));
        }
        tcfVar.m(null, arrayList);
        return qqg.a;
    }
}
