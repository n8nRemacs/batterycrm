package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class xdi extends mdi {
    public final transient bei c;
    public final transient ydi d;

    public xdi(bei beiVar, ydi ydiVar) {
        this.c = beiVar;
        this.d = ydiVar;
    }

    @Override // defpackage.pci
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
        return this.c.X;
    }
}
