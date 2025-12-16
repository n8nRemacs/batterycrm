package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zib implements t98 {
    public static final zib d = new zib(hd5.a, 0, 1);
    public final int a;
    public final int b;
    public final List c;

    public zib(List list, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zib zibVar = (zib) obj;
        List list = zibVar.c;
        if (this.a != zibVar.a || this.b != zibVar.b) {
            return false;
        }
        List list2 = this.c;
        if (list2.size() != list.size()) {
            return false;
        }
        ArrayList arrayListJ0 = ue3.j0(list2, list);
        if (arrayListJ0.isEmpty()) {
            return true;
        }
        Iterator it = arrayListJ0.iterator();
        while (it.hasNext()) {
            imb imbVar = (imb) it.next();
            if (!fni.a((yd1) imbVar.a, (yd1) imbVar.b)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        zib zibVar = (zib) t98Var;
        return zibVar.b == this.b && zibVar.a == this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + utb.k(this.b, this.a * 31, 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        zib zibVar = (zib) t98Var;
        return equals(zibVar) ? hd5.a : Collections.singletonList(new yib(zibVar));
    }

    @Override // defpackage.t98
    public final int m() {
        return 1;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return t98Var.equals(this);
    }

    public final String toString() {
        StringBuilder sbM = ho7.m(this.a, "OpponentsPageState(pagePosition=", ", pageType=");
        int i = this.b;
        sbM.append(i != 1 ? i != 2 ? "null" : "SCREEN_SHARING" : "DEFAULT");
        sbM.append(", opponents=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
