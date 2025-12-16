package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class df2 {
    public static final df2 f = new df2(null, 0, 0, 0, Collections.EMPTY_LIST);
    public static final df2 g = new df2(null, 0, 0, 0, Collections.EMPTY_LIST);
    public final jf2 a;
    public final int b;
    public final long c;
    public final long d;
    public final List e;

    public df2(jf2 jf2Var, int i, long j, long j2, List list) {
        this.a = jf2Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = list;
    }

    public final cf2 a() {
        cf2 cf2Var = new cf2();
        cf2Var.d = this.a;
        cf2Var.a = this.b;
        cf2Var.b = this.c;
        cf2Var.c = this.d;
        cf2Var.o = this.e;
        return cf2Var;
    }
}
