package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lce extends dtf implements sm6 {
    public final /* synthetic */ mce X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lce(mce mceVar, Continuation continuation) {
        super(2, continuation);
        this.X = mceVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lce lceVar = (lce) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lceVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lce lceVar = new lce(this.X, continuation);
        lceVar.o = obj;
        return lceVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List<jce> list = (List) this.o;
        LinkedHashMap linkedHashMap = this.X.a;
        linkedHashMap.clear();
        for (jce jceVar : list) {
            linkedHashMap.put(new Long(jceVar.a), jceVar);
        }
        return qqg.a;
    }
}
