package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class kn8 extends mn8 implements Iterator, my7 {
    public final /* synthetic */ int o;

    public kn8(int i, nn8 nn8Var) {
        this.o = i;
        this.d = nn8Var;
        this.b = -1;
        this.c = nn8Var.Z;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.o) {
            case 0:
                b();
                int i = this.a;
                nn8 nn8Var = (nn8) this.d;
                if (i >= nn8Var.X) {
                    throw new NoSuchElementException();
                }
                this.a = i + 1;
                this.b = i;
                ln8 ln8Var = new ln8(i, nn8Var);
                e();
                return ln8Var;
            case 1:
                b();
                int i2 = this.a;
                nn8 nn8Var2 = (nn8) this.d;
                if (i2 >= nn8Var2.X) {
                    throw new NoSuchElementException();
                }
                this.a = i2 + 1;
                this.b = i2;
                Object obj = nn8Var2.a[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.a;
                nn8 nn8Var3 = (nn8) this.d;
                if (i3 >= nn8Var3.X) {
                    throw new NoSuchElementException();
                }
                this.a = i3 + 1;
                this.b = i3;
                Object obj2 = nn8Var3.b[i3];
                e();
                return obj2;
        }
    }
}
