package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class icj extends r7j {
    public final transient nji c;
    public final transient xcj d;

    public icj(nji njiVar, xcj xcjVar) {
        this.c = njiVar;
        this.d = xcjVar;
    }

    @Override // defpackage.jyi
    public final int a(Object[] objArr) {
        return this.d.a(objArr);
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
        this.c.getClass();
        return 1;
    }
}
