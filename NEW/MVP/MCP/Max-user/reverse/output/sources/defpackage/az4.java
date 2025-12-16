package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class az4 implements zde {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ az4(zde zdeVar, Object obj, int i) {
        this.a = i;
        this.b = zdeVar;
        this.c = obj;
    }

    @Override // defpackage.zde
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new zy4(((Iterable) ((at) this.b).b).iterator(), (d73) this.c);
            case 1:
                return new cr6(this);
            case 2:
                return new dh9(this);
            default:
                oz5 oz5Var = (oz5) this.b;
                ArrayList arrayList = new ArrayList();
                lee.n(oz5Var, arrayList);
                ze3.s((Comparator) this.c, arrayList);
                return arrayList.iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public az4(cm6 cm6Var, em6 em6Var) {
        this.a = 1;
        this.b = (u08) cm6Var;
        this.c = em6Var;
    }
}
