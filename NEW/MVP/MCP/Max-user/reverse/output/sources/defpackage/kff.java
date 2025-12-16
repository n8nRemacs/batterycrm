package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kff extends dtf implements sm6 {
    public final /* synthetic */ off X;
    public final /* synthetic */ Long Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kff(off offVar, Long l, Continuation continuation) {
        super(2, continuation);
        this.X = offVar;
        this.Y = l;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kff kffVar = (kff) l((imb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kffVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kff kffVar = new kff(this.X, this.Y, continuation);
        kffVar.o = obj;
        return kffVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        imb imbVar = (imb) this.o;
        sff sffVar = (sff) imbVar.a;
        Boolean bool = (Boolean) imbVar.b;
        tcf tcfVar = this.X.z0;
        boolean zBooleanValue = bool.booleanValue();
        long j = sffVar.a;
        String str = sffVar.b;
        if (str == null) {
            str = "";
        }
        r5g r5gVar = new r5g(str);
        String str2 = sffVar.c;
        List list = sffVar.h;
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(off.v((jef) it.next(), false, this.Y));
        }
        tcfVar.m(null, new dgf(j, r5gVar, str2, null, arrayList, zBooleanValue ? 2 : 4, false, false, 200));
        return qqg.a;
    }
}
