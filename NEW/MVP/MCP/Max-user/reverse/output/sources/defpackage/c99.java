package defpackage;

/* loaded from: classes.dex */
public final class c99 extends s29 {
    public c99(Object obj) {
        super(obj, -1, -1, -1L, -1);
    }

    public final c99 b(Object obj) {
        s29 s29Var;
        if (this.a.equals(obj)) {
            s29Var = this;
        } else {
            s29Var = new s29(obj, this.b, this.c, this.d, this.e);
        }
        return new c99(s29Var);
    }

    public c99(Object obj, long j, int i) {
        super(obj, -1, -1, j, i);
    }
}
