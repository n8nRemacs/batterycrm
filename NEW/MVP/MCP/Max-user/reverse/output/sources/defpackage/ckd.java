package defpackage;

/* loaded from: classes.dex */
public final class ckd extends hh7 {
    public final transient ah7 d;
    public final transient dkd o;

    public ckd(ah7 ah7Var, dkd dkdVar) {
        this.d = ah7Var;
        this.o = dkdVar;
    }

    @Override // defpackage.hh7, defpackage.ng7
    public final wg7 a() {
        return this.o;
    }

    @Override // defpackage.ng7
    public final int b(int i, Object[] objArr) {
        return this.o.b(i, objArr);
    }

    @Override // defpackage.ng7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.ng7
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ng7
    /* renamed from: g */
    public final rrg iterator() {
        return this.o.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
