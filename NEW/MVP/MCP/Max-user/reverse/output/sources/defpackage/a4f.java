package defpackage;

/* loaded from: classes.dex */
public final class a4f extends hh7 {
    public final transient Object d;

    public a4f(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.hh7, defpackage.ng7
    public final wg7 a() {
        return wg7.m(this.d);
    }

    @Override // defpackage.ng7
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.ng7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.ng7
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ng7
    /* renamed from: g */
    public final rrg iterator() {
        return new it7(this.d);
    }

    @Override // defpackage.hh7, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
