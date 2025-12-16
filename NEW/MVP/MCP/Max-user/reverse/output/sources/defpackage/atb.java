package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class atb implements Iterator, my7 {
    public final ysb a;

    public atb(xsb xsbVar) {
        vig[] vigVarArr = new vig[8];
        for (int i = 0; i < 8; i++) {
            vigVarArr[i] = new xig(this);
        }
        this.a = new ysb(xsbVar, vigVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
