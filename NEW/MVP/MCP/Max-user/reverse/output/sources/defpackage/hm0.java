package defpackage;

/* loaded from: classes.dex */
public final class hm0 implements da8 {
    public final da8 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;
    public Object o = null;

    public hm0(da8 da8Var) {
        this.a = da8Var;
    }

    public final void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        da8 da8Var = this.a;
        if (i == 1) {
            da8Var.c(this.c, this.d);
        } else if (i == 2) {
            da8Var.g(this.c, this.d);
        } else if (i == 3) {
            da8Var.h(this.c, this.d, this.o);
        }
        this.o = null;
        this.b = 0;
    }

    @Override // defpackage.da8
    public final void b(int i, int i2) {
        a();
        this.a.b(i, i2);
    }

    @Override // defpackage.da8
    public final void c(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // defpackage.da8
    public final void g(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            a();
            this.c = i;
            this.d = i2;
            this.b = 2;
        }
    }

    @Override // defpackage.da8
    public final void h(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.o == obj) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.o = obj;
        this.b = 3;
    }
}
