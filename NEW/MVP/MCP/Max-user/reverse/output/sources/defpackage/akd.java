package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class akd extends wg7 {
    public final /* synthetic */ bkd c;

    public akd(bkd bkdVar) {
        this.c = bkdVar;
    }

    @Override // defpackage.ng7
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bkd bkdVar = this.c;
        u5j.d(i, bkdVar.Y);
        Object[] objArr = bkdVar.o;
        int i2 = i * 2;
        int i3 = bkdVar.X;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.Y;
    }
}
