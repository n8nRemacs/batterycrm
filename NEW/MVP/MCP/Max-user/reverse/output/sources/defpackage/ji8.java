package defpackage;

/* loaded from: classes2.dex */
public final class ji8 extends sm implements j1g {
    public final String d;

    public ji8(long j, String str) {
        super(j);
        this.d = str;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.b().c(new uu(this.a, 6));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.b().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.sm
    public final n2 i() {
        oi8 oi8Var = new oi8(xhb.y0);
        String str = this.d;
        if (str != null && str.length() != 0) {
            oi8Var.x("pushToken", str);
        }
        return oi8Var;
    }
}
