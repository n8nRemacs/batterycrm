package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class vg7 extends wg7 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ wg7 o;

    public vg7(wg7 wg7Var, int i, int i2) {
        this.o = wg7Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ng7
    public final Object[] c() {
        return this.o.c();
    }

    @Override // defpackage.ng7
    public final int d() {
        return this.o.e() + this.c + this.d;
    }

    @Override // defpackage.ng7
    public final int e() {
        return this.o.e() + this.c;
    }

    @Override // defpackage.ng7
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u5j.d(i, this.d);
        return this.o.get(i + this.c);
    }

    @Override // defpackage.wg7, defpackage.ng7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.wg7, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.wg7, java.util.List
    /* renamed from: s */
    public final wg7 subList(int i, int i2) {
        u5j.g(i, i2, this.d);
        int i3 = this.c;
        return this.o.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.wg7, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
