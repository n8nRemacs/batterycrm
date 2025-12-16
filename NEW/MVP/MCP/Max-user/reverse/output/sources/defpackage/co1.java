package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class co1 extends dtf implements zm6 {
    public /* synthetic */ zi1 X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ co5 Z;
    public /* synthetic */ onb o;
    public /* synthetic */ boolean s0;
    public final /* synthetic */ wo1 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co1(wo1 wo1Var, b66 b66Var) {
        super(6, b66Var);
        this.t0 = wo1Var;
    }

    @Override // defpackage.zm6
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, b66 b66Var) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        co1 co1Var = new co1(this.t0, b66Var);
        co1Var.o = (onb) obj;
        co1Var.X = (zi1) obj2;
        co1Var.Y = zBooleanValue;
        co1Var.Z = (co5) obj4;
        co1Var.s0 = zBooleanValue2;
        qqg qqgVar = qqg.a;
        co1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        wo1 wo1Var;
        Object value;
        g8j.b(obj);
        onb onbVar = this.o;
        zi1 zi1Var = this.X;
        boolean z = this.Y;
        co5 co5Var = this.Z;
        boolean z2 = this.s0;
        Map map = onbVar.c;
        Map map2 = onbVar.g;
        Set<zi1> setG0 = ue3.g0(ue3.X(map2.keySet(), new vi5(1, map2)));
        nn8 nn8Var = new nn8();
        cnb cnbVar = onbVar.a;
        nn8Var.put(cnbVar.a.getId(), cnbVar);
        cnb cnbVar2 = (cnb) map.get(zi1Var);
        if (cnbVar2 != null) {
            bj1 bj1Var = cnbVar2.a;
            nn8Var.put(bj1Var.getId(), cnbVar2);
            setG0.remove(bj1Var.getId());
        }
        for (zi1 zi1Var2 : setG0) {
            cnb cnbVar3 = (cnb) map.get(zi1Var2);
            if (cnbVar3 != null) {
                nn8Var.put(zi1Var2, cnbVar3);
            }
        }
        cnb cnbVar4 = (cnb) map.get(onbVar.a());
        if (cnbVar4 != null) {
        }
        for (Map.Entry entry : map.entrySet()) {
            zi1 zi1Var3 = (zi1) entry.getKey();
            cnb cnbVar5 = (cnb) entry.getValue();
            if (!nn8Var.containsKey(zi1Var3)) {
                nn8Var.put(zi1Var3, cnbVar5);
            }
        }
        Collection collectionValues = nn8Var.b().values();
        int i = to8.i(we3.q(collectionValues, 10));
        if (i < 16) {
            i = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        Iterator it = ((pn8) collectionValues).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            wo1Var = this.t0;
            if (!zHasNext) {
                break;
            }
            cnb cnbVar6 = (cnb) it.next();
            linkedHashMap.put(cnbVar6.a.getId(), ko8.c(cnbVar6, cnbVar6.a.o(), z, z2, wo1Var.Y, co5Var, zi1Var));
        }
        tcf tcfVar = wo1Var.B0;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, linkedHashMap));
        return qqg.a;
    }
}
