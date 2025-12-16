package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class woi {
    public static yfh d(Class cls) {
        try {
            return (yfh) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }

    public static final b7g i(yyg yygVar, wuf wufVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        vyg vygVar = yygVar.b;
        y6g y6gVar = vygVar != null ? new y6g(vygVar.a, vygVar.b) : null;
        a7g a7gVar = yygVar.a != null ? wufVar != null ? new a7g(wufVar) : null : null;
        List<wyg> list = yygVar.d;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(we3.q(list, 10));
            for (wyg wygVar : list) {
                arrayList3.add(new z6g(wygVar.a, wygVar.b, wygVar.c, wygVar.d, wygVar.e, wygVar.g, wygVar.f));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<wyg> list2 = yygVar.e;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList(we3.q(list2, 10));
            for (wyg wygVar2 : list2) {
                arrayList4.add(new z6g(wygVar2.a, wygVar2.b, wygVar2.c, wygVar2.d, wygVar2.e, wygVar2.g, wygVar2.f));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        vyg vygVar2 = yygVar.c;
        return new b7g(a7gVar, y6gVar, vygVar2 != null ? new y6g(vygVar2.a, vygVar2.b) : null, arrayList, arrayList2, yygVar.f);
    }

    public abstract boolean a(x1 x1Var, g1 g1Var, g1 g1Var2);

    public abstract boolean b(x1 x1Var, Object obj, Object obj2);

    public abstract boolean c(x1 x1Var, v1 v1Var, v1 v1Var2);

    public abstract g1 e(x1 x1Var);

    public abstract v1 f(x1 x1Var);

    public abstract void g(v1 v1Var, v1 v1Var2);

    public abstract void h(v1 v1Var, Thread thread);
}
