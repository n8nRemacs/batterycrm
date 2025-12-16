package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class sh2 extends l0g {
    public List c;
    public qb2 d;
    public gx3 o;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "chat":
                this.d = qb2.a(tm9Var);
                break;
            case "user":
                this.o = gx3.g(tm9Var);
                break;
            case "chats":
                this.c = sz.b(tm9Var);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{chats=" + Integer.valueOf(zdi.a(this.c)) + ", chat=" + this.d + ", contact=" + this.o + "}";
    }
}
