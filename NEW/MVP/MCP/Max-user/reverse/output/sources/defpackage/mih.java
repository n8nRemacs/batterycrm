package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public final class mih extends ah6 {
    public final String b;
    public int c;

    public mih(l22 l22Var) {
        super(l22Var);
        this.b = "virtual-" + l22Var.d() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.ah6, defpackage.l22
    public final int b() {
        return l(0);
    }

    @Override // defpackage.ah6, defpackage.l22
    public final String d() {
        return this.b;
    }

    @Override // defpackage.ah6, defpackage.l22
    public final int l(int i) {
        return bhg.h(this.a.l(i) - this.c);
    }
}
