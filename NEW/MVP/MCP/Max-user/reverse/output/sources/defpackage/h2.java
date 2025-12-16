package defpackage;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class h2 extends i2 implements RandomAccess {
    public final i2 a;
    public final int b;
    public final int c;

    public h2(i2 i2Var, int i, int i2) {
        this.a = i2Var;
        this.b = i;
        cpi.a(i, i2, i2Var.getSize());
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
        return this.a.get(this.b + i);
    }

    @Override // defpackage.j0
    public final int getSize() {
        return this.c;
    }
}
