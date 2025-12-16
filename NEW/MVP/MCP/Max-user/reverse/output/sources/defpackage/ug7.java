package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ug7 extends i2 implements xg7 {
    public final l3 a;
    public final int b;
    public final int c;

    public ug7(l3 l3Var, int i, int i2) {
        this.a = l3Var;
        this.b = i;
        hqi.e(i, i2, l3Var.getSize());
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hqi.c(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.j0
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.i2, java.util.List
    public final List subList(int i, int i2) {
        hqi.e(i, i2, this.c);
        int i3 = this.b;
        return new ug7(this.a, i + i3, i3 + i2);
    }
}
