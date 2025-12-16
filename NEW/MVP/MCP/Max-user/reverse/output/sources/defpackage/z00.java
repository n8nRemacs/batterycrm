package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class z00 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;

    static {
        List list = Collections.EMPTY_LIST;
    }

    public z00(y00 y00Var) {
        this.a = (String) y00Var.d;
        this.b = (String) y00Var.e;
        this.c = y00Var.a;
        this.d = y00Var.b;
        this.e = y00Var.c;
        this.f = (List) y00Var.f;
    }

    public final boolean a() {
        return this.d == 3;
    }

    public final boolean b() {
        int i = this.d;
        return i == 5 || a() || i == 4;
    }

    public final boolean c() {
        return this.c == 2;
    }
}
