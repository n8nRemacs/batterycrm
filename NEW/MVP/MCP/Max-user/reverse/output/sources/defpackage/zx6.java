package defpackage;

/* loaded from: classes.dex */
public final class zx6 {
    public final dy6 a;
    public final fy6 b;
    public boolean c = true;

    public zx6(dy6 dy6Var, fy6 fy6Var) {
        this.a = dy6Var;
        this.b = fy6Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(!this.c ? "+>" : "->");
        sb.append(" ");
        sb.append(this.b);
        return sb.toString();
    }
}
