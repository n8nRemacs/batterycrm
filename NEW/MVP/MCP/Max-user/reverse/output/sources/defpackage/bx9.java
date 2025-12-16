package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class bx9 implements gu3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ em6 b;

    public /* synthetic */ bx9(em6 em6Var) {
        this.b = em6Var;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        yl7 yl7Var;
        Object next;
        q2i q2iVar;
        q2i q2iVar2;
        Object next2;
        switch (this.a) {
            case 0:
                x10 x10Var = (x10) obj;
                yl7 yl7Var2 = x10Var.b;
                em6 em6Var = this.b;
                if (yl7Var2 == null) {
                    Iterator it = x10Var.a.iterator();
                    while (true) {
                        yl7Var = null;
                        if (it.hasNext()) {
                            next = it.next();
                            if (((w10) next).n != null) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    w10 w10Var = (w10) next;
                    if (w10Var != null && (q2iVar2 = w10Var.n) != null) {
                        Iterator it2 = q2iVar2.a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (((l2i) next2).b()) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        l2i l2iVar = (l2i) next2;
                        if (l2iVar != null) {
                            yl7Var = l2iVar.c;
                        }
                    }
                    if (yl7Var != null) {
                        xl7 xl7Var = new xl7();
                        xl7Var.a = yl7Var.a;
                        xl7Var.b = yl7Var.b;
                        em6Var.invoke(xl7Var);
                        w10 w10Var2 = (w10) ue3.I(x10Var.a);
                        if (w10Var2 != null && (q2iVar = w10Var2.n) != null) {
                            ArrayList arrayList = q2iVar.a;
                            Iterator it3 = arrayList.iterator();
                            int i = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    i = -1;
                                } else if (!((l2i) it3.next()).b()) {
                                    i++;
                                }
                            }
                            l2i l2iVar2 = (l2i) arrayList.get(i);
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            arrayList2.set(i, new l2i(l2iVar2.a, l2iVar2.b, new yl7(xl7Var), l2iVar2.d));
                            List list = x10Var.a;
                            x00 x00VarI = w10Var2.i();
                            x00VarI.w = new q2i(arrayList2);
                            list.set(0, x00VarI.a());
                            break;
                        }
                    }
                } else {
                    xl7 xl7Var2 = new xl7();
                    xl7Var2.a = yl7Var2.a;
                    xl7Var2.b = yl7Var2.b;
                    em6Var.invoke(xl7Var2);
                    x10Var.b = new yl7(xl7Var2);
                    break;
                }
                break;
            default:
                this.b.invoke((x00) obj);
                break;
        }
    }

    public /* synthetic */ bx9(em6 em6Var, gx9 gx9Var) {
        this.b = em6Var;
    }
}
