package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class etb extends j0 {
    public final vsb a;

    public etb(vsb vsbVar) {
        this.a = vsbVar;
    }

    @Override // defpackage.j0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // defpackage.j0
    public final int getSize() {
        vsb vsbVar = this.a;
        vsbVar.getClass();
        return vsbVar.b;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        uig uigVar = this.a.a;
        vig[] vigVarArr = new vig[8];
        for (int i = 0; i < 8; i++) {
            vigVarArr[i] = new wig(2);
        }
        return new dtb(uigVar, vigVarArr);
    }
}
