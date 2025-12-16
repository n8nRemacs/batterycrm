package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class g47 extends zj0 {
    public final long X;
    public final List o;

    public g47(long j, List list) {
        super(0, 0L, list.size() - 1);
        this.X = j;
        this.o = list;
    }

    @Override // defpackage.bw8, defpackage.cw8
    public final long a() {
        c();
        return this.X + ((e57) this.o.get((int) this.d)).o;
    }

    @Override // defpackage.bw8, defpackage.cw8
    public final long b() {
        c();
        e57 e57Var = (e57) this.o.get((int) this.d);
        return this.X + e57Var.o + e57Var.c;
    }
}
