package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class oig extends nig {
    public boolean b;
    public Iterator c;
    public boolean d;
    public final /* synthetic */ ay5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oig(ay5 ay5Var, Object obj) {
        super(obj);
        this.e = ay5Var;
    }

    @Override // defpackage.sig
    public final Object a() {
        b26 b26Var = (b26) this.e.o;
        boolean z = this.d;
        Object obj = this.a;
        if (!z && this.c == null) {
            if (!((Boolean) ((em6) b26Var.d).invoke(obj)).booleanValue()) {
                return null;
            }
            zde zdeVar = (zde) b26Var.c.invoke(obj);
            Iterator it = zdeVar != null ? zdeVar.iterator() : null;
            this.c = it;
            if (it == null) {
                this.d = true;
            }
        }
        Iterator it2 = this.c;
        if (it2 != null && it2.hasNext()) {
            return this.c.next();
        }
        if (this.b) {
            return null;
        }
        this.b = true;
        return obj;
    }
}
