package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class dt7 extends v76 {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ l7c b;

    public dt7(Iterable iterable, l7c l7cVar) {
        this.a = iterable;
        this.b = l7cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        return new et7(it, this.b);
    }
}
