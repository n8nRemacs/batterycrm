package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class gg0 implements Iterable, my7 {
    public final ArrayDeque a = new ArrayDeque();
    public xtd b;

    public final bud a() {
        return (bud) this.a.peek();
    }

    public final bud b() {
        bud budVar = (bud) this.a.pop();
        xtd xtdVar = this.b;
        if (xtdVar != null) {
            xtdVar.f();
        }
        budVar.a.destroy();
        return budVar;
    }

    public final Iterator c() {
        return ue3.V(this.a).iterator();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f2(2, this.a.toArray(new bud[0]));
    }
}
