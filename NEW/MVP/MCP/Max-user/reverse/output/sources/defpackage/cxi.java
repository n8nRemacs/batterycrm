package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class cxi {
    public static final ArrayList a(int i) {
        to7 to7Var = new to7(i, 23, 1);
        ArrayList arrayList = new ArrayList(we3.q(to7Var, 10));
        Iterator it = to7Var.iterator();
        while (((so7) it).c) {
            arrayList.add(new t8g(((so7) it).nextInt()));
        }
        return arrayList;
    }

    public static final ArrayList b(int i) {
        to7 to7Var = new to7(i, 59, 1);
        ArrayList arrayList = new ArrayList(we3.q(to7Var, 10));
        Iterator it = to7Var.iterator();
        while (((so7) it).c) {
            arrayList.add(new t8g(((so7) it).nextInt()));
        }
        return arrayList;
    }

    public static final uk1 c(h0f h0fVar) {
        return new uk1(h0fVar.a, h0fVar.b, h0fVar.c, h0fVar.d, h0fVar.e, h0fVar.f);
    }
}
