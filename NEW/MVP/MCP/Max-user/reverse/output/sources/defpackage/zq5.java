package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zq5 extends rwd {
    public final HashMap o = new HashMap();

    @Override // defpackage.rwd
    public final owd a(Object obj) {
        return (owd) this.o.get(obj);
    }

    @Override // defpackage.rwd
    public final Object b(Object obj, Object obj2) {
        owd owdVarA = a(obj);
        if (owdVarA != null) {
            return owdVarA.b;
        }
        owd owdVar = new owd(obj, obj2);
        this.d++;
        owd owdVar2 = this.b;
        if (owdVar2 == null) {
            this.a = owdVar;
            this.b = owdVar;
        } else {
            owdVar2.c = owdVar;
            owdVar.d = owdVar2;
            this.b = owdVar;
        }
        this.o.put(obj, owdVar);
        return null;
    }

    @Override // defpackage.rwd
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.o.remove(obj);
        return objC;
    }
}
