package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gh7 extends mg7 {
    @Override // defpackage.mg7
    public final /* bridge */ /* synthetic */ mg7 c(Object obj) {
        i(obj);
        return this;
    }

    public final void i(Object obj) {
        obj.getClass();
        a(obj);
    }

    public final hh7 j() {
        int i = this.b;
        if (i == 0) {
            int i2 = hh7.c;
            return fkd.t0;
        }
        if (i != 1) {
            hh7 hh7VarI = hh7.i(i, this.c);
            this.b = hh7VarI.size();
            this.a = true;
            return hh7VarI;
        }
        Object obj = this.c[0];
        Objects.requireNonNull(obj);
        int i3 = hh7.c;
        return new a4f(obj);
    }
}
