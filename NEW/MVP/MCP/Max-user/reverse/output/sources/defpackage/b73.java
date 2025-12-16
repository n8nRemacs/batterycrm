package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class b73 extends th0 {
    public final String a;
    public final cm6 b;
    public final o00 c = new o00(12);
    public final d92 d = new d92(10, this);

    public b73(String str, cm6 cm6Var) {
        this.a = str;
        this.b = cm6Var;
    }

    @Override // defpackage.th0
    public final Comparator a() {
        return this.c;
    }

    @Override // defpackage.th0
    public final em6 b() {
        return this.d;
    }

    @Override // defpackage.th0
    public final cm6 c() {
        return this.b;
    }
}
