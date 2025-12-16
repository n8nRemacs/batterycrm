package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class udi extends zci {
    public final /* synthetic */ wdi c;

    public udi(wdi wdiVar) {
        this.c = wdiVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        wdi wdiVar = this.c;
        kvi.c(i, wdiVar.o);
        Object[] objArr = wdiVar.d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.o;
    }
}
