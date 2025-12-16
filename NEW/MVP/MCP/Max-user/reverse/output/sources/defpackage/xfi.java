package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class xfi extends r2 implements ListIterator {
    public final /* synthetic */ a3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfi(a3 a3Var) {
        super(a3Var, (byte) 0);
        this.o = a3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a3 a3Var = this.o;
        boolean zIsEmpty = a3Var.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        if (zIsEmpty) {
            a3Var.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfi(a3 a3Var, int i) {
        super(a3Var, ((List) a3Var.c).listIterator(i), (byte) 0);
        this.o = a3Var;
    }
}
