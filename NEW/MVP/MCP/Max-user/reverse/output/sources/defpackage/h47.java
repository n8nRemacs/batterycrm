package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class h47 extends zj0 {
    public final long X;
    public final List o;

    public h47(long j, List list) {
        super(1, 0L, list.size() - 1);
        this.X = j;
        this.o = list;
    }

    @Override // defpackage.bw8, defpackage.cw8
    public final long a() {
        c();
        return this.X + ((f57) this.o.get((int) this.d)).o;
    }

    @Override // defpackage.bw8, defpackage.cw8
    public final long b() {
        c();
        f57 f57Var = (f57) this.o.get((int) this.d);
        return this.X + f57Var.o + f57Var.c;
    }
}
