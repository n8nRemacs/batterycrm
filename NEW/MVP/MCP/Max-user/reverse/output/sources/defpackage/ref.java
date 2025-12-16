package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class ref implements tm6, gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tef b;

    public /* synthetic */ ref(tef tefVar, int i) {
        this.a = i;
        this.b = tefVar;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        this.b.e((List) obj);
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        int i = this.a;
        tef tefVar = this.b;
        List<scd> list = (List) obj;
        switch (i) {
            case 0:
                wqi.c("tef", "loadNetworkStickersSingle: ids=%s", list);
                m2f m2fVarH = ((hwa) tefVar.f.get()).G(new wua(2, jqi.c(list)), tefVar.g).h(new kce(20, gu.class)).h(new ycd(22)).h(new ycd(23));
                d1g d1gVar = (d1g) tefVar.i.get();
                d1gVar.getClass();
                return new k2f(m2fVarH.j(new b1g(d1gVar, 2, 0)), new ref(tefVar, 1), 1);
            default:
                ArrayList arrayList = new ArrayList();
                for (scd scdVar : list) {
                    if (scdVar instanceof pff) {
                        arrayList.add(Long.valueOf(((pff) scdVar).c));
                    }
                }
                ArrayList arrayListC = tefVar.c(arrayList);
                if (!arrayListC.isEmpty()) {
                    tefVar.d(arrayListC).e();
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    l.getClass();
                    jef jefVar = (jef) tefVar.a.get(l);
                    if (jefVar != null) {
                        arrayList2.add(jefVar);
                    }
                }
                return arrayList2;
        }
    }
}
