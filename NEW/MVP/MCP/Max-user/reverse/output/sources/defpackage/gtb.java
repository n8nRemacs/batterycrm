package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class gtb extends l3 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public gtb(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + Integer.valueOf(i)).toString());
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.c;
        hqi.c(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.b;
        } else {
            objArr = this.a;
            for (int i3 = this.d; i3 > 0; i3 -= 5) {
                Object obj = objArr[yoi.f(i, i3)];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // defpackage.j0
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.i2, java.util.List
    public final ListIterator listIterator(int i) {
        hqi.d(i, this.c);
        return new itb(i, this.c, (this.d / 5) + 1, this.a, this.b);
    }
}
