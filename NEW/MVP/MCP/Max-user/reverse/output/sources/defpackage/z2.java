package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class z2 extends r2 implements ListIterator {
    public final /* synthetic */ a3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(a3 a3Var) {
        super(a3Var);
        this.o = a3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a3 a3Var = this.o;
        boolean zIsEmpty = a3Var.isEmpty();
        c().add(obj);
        ((k2) a3Var.Y).o++;
        if (zIsEmpty) {
            a3Var.a();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(a3 a3Var, int i) {
        super(a3Var, ((List) a3Var.c).listIterator(i));
        this.o = a3Var;
    }
}
