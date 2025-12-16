package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class lad implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vad b;

    public /* synthetic */ lad(vad vadVar, int i) {
        this.a = i;
        this.b = vadVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [hd5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @Override // defpackage.cm6
    public final Object invoke() {
        ?? arrayList;
        switch (this.a) {
            case 0:
                vad vadVar = this.b;
                wj wjVar = (wj) vadVar.v0.getValue();
                ConcurrentHashMap concurrentHashMap = wjVar.n;
                CopyOnWriteArrayList copyOnWriteArrayList = wjVar.o;
                if (copyOnWriteArrayList.isEmpty() || concurrentHashMap.isEmpty()) {
                    arrayList = hd5.a;
                } else {
                    arrayList = new ArrayList();
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        f9a f9aVar = (f9a) concurrentHashMap.get((Long) it.next());
                        vh vhVar = f9aVar != null ? (vh) f9aVar.getValue() : null;
                        if (vhVar != null) {
                            arrayList.add(vhVar);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
                for (vh vhVar2 : arrayList) {
                    yl9 yl9Var = (yl9) vadVar.u0.getValue();
                    long j = vhVar2.a;
                    String str = vhVar2.b;
                    int iD = kti.d(vadVar.X.a() * vw4.d().getDisplayMetrics().density);
                    k18 k18Var = yl9Var.c;
                    k18 k18Var2 = yl9Var.b;
                    vh vhVar3 = (vh) ((wj) k18Var.getValue()).i(j).getValue();
                    x8d x8dVar = new x8d((vhVar3 == null || !yl9Var.e) ? ((qb5) k18Var2.getValue()).b(iD, str) : ((qb5) k18Var2.getValue()).d(vhVar3.a, vhVar3.c, vhVar3.e, str, iD));
                    arrayList2.add(new m9d(vhVar2.a, x8dVar, vad.v(x8dVar), false));
                }
                return arrayList2;
            default:
                return Boolean.valueOf(this.b.y());
        }
    }
}
