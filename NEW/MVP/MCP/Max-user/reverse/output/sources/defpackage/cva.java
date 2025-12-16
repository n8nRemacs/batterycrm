package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class cva extends u08 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cva(jva jvaVar, int i) {
        super(1);
        this.a = i;
        this.b = jvaVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.a) {
            case 0:
                jva jvaVar = this.b;
                js jsVar = jvaVar.b;
                ListIterator listIterator = jsVar.listIterator(jsVar.getSize());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((bva) objPrevious).a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                bva bvaVar = (bva) objPrevious;
                if (jvaVar.c != null) {
                    jvaVar.c();
                }
                jvaVar.c = bvaVar;
                if (bvaVar != null) {
                    bvaVar.d();
                }
                break;
            default:
                te0 te0Var = (te0) obj;
                jva jvaVar2 = this.b;
                bva bvaVar2 = jvaVar2.c;
                if (bvaVar2 == null) {
                    js jsVar2 = jvaVar2.b;
                    ListIterator listIterator2 = jsVar2.listIterator(jsVar2.getSize());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((bva) objPrevious2).a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    bvaVar2 = (bva) objPrevious2;
                }
                if (bvaVar2 != null) {
                    bvaVar2.c(te0Var);
                }
                break;
        }
        return qqg.a;
    }
}
