package defpackage;

import java.util.AbstractMap;

/* loaded from: classes.dex */
public final class waj extends n4j {
    public final /* synthetic */ xbj c;

    public waj(xbj xbjVar) {
        this.c = xbjVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        xbj xbjVar = this.c;
        gvi.e(i, xbjVar.o);
        Object[] objArr = xbjVar.d;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.o;
    }
}
