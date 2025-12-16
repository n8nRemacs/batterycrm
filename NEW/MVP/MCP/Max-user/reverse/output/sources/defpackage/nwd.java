package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class nwd extends qwd implements Iterator {
    public owd a;
    public owd b;
    public final /* synthetic */ int c;

    public nwd(owd owdVar, owd owdVar2, int i) {
        this.c = i;
        this.a = owdVar2;
        this.b = owdVar;
    }

    @Override // defpackage.qwd
    public final void a(owd owdVar) {
        owd owdVar2;
        owd owdVarB = null;
        if (this.a == owdVar && owdVar == this.b) {
            this.b = null;
            this.a = null;
        }
        owd owdVar3 = this.a;
        if (owdVar3 == owdVar) {
            switch (this.c) {
                case 0:
                    owdVar2 = owdVar3.d;
                    break;
                default:
                    owdVar2 = owdVar3.c;
                    break;
            }
            this.a = owdVar2;
        }
        owd owdVar4 = this.b;
        if (owdVar4 == owdVar) {
            owd owdVar5 = this.a;
            if (owdVar4 != owdVar5 && owdVar5 != null) {
                owdVarB = b(owdVar4);
            }
            this.b = owdVarB;
        }
    }

    public final owd b(owd owdVar) {
        switch (this.c) {
            case 0:
                return owdVar.c;
            default:
                return owdVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        owd owdVar = this.b;
        owd owdVar2 = this.a;
        this.b = (owdVar == owdVar2 || owdVar2 == null) ? null : b(owdVar);
        return owdVar;
    }
}
