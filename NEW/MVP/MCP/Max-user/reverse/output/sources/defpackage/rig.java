package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class rig extends nig {
    public boolean b;
    public Iterator c;
    public final /* synthetic */ ay5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rig(ay5 ay5Var, Object obj) {
        super(obj);
        this.d = ay5Var;
    }

    @Override // defpackage.sig
    public final Object a() {
        b26 b26Var = (b26) this.d.o;
        boolean z = this.b;
        Object obj = this.a;
        if (!z) {
            if (!((Boolean) ((em6) b26Var.d).invoke(obj)).booleanValue()) {
                return null;
            }
            this.b = true;
            return obj;
        }
        Iterator it = this.c;
        if (it != null && !it.hasNext()) {
            return null;
        }
        if (this.c == null) {
            zde zdeVar = (zde) b26Var.c.invoke(obj);
            Iterator it2 = zdeVar != null ? zdeVar.iterator() : null;
            this.c = it2;
            if (it2 == null || !it2.hasNext()) {
                return null;
            }
        }
        return this.c.next();
    }
}
