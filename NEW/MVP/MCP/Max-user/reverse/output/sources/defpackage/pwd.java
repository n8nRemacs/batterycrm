package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class pwd extends qwd implements Iterator {
    public owd a;
    public boolean b = true;
    public final /* synthetic */ rwd c;

    public pwd(rwd rwdVar) {
        this.c = rwdVar;
    }

    @Override // defpackage.qwd
    public final void a(owd owdVar) {
        owd owdVar2 = this.a;
        if (owdVar == owdVar2) {
            owd owdVar3 = owdVar2.d;
            this.a = owdVar3;
            this.b = owdVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        owd owdVar = this.a;
        return (owdVar == null || owdVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            owd owdVar = this.a;
            this.a = owdVar != null ? owdVar.c : null;
        }
        return this.a;
    }
}
