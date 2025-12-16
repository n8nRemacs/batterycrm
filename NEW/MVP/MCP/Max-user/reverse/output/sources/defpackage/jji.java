package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class jji extends dii {
    public final transient nji c;
    public final transient lji d;

    public jji(nji njiVar, lji ljiVar) {
        this.c = njiVar;
        this.d = ljiVar;
    }

    @Override // defpackage.qhi
    public final int a(int i, Object[] objArr) {
        return this.d.a(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
