package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class pig extends nig {
    public final Iterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pig(ay5 ay5Var, Object obj) {
        super(obj);
        b26 b26Var = (b26) ay5Var.o;
        zde zdeVar = (zde) b26Var.c.invoke(obj);
        this.b = zdeVar != null ? zdeVar.iterator() : null;
    }

    @Override // defpackage.sig
    public final Object a() {
        Iterator it = this.b;
        if (it == null || !it.hasNext()) {
            return null;
        }
        return it.next();
    }
}
