package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class yw0 implements Serializable {
    public final boolean X;
    public final long Y;
    public final boolean Z;
    public final String a;
    public final gx0 b;
    public final int c;
    public final String d;
    public final String o;

    public yw0(vw0 vw0Var) {
        this.a = vw0Var.a;
        this.b = vw0Var.b;
        this.c = vw0Var.c;
        this.d = vw0Var.d;
        this.o = vw0Var.e;
        this.X = vw0Var.f;
        this.Z = vw0Var.g;
        this.Y = vw0Var.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yw0)) {
            return false;
        }
        yw0 yw0Var = (yw0) obj;
        if (l8g.a(this.a, yw0Var.a) && l8g.a(this.o, yw0Var.o) && this.b == yw0Var.b && this.X == yw0Var.X && this.c == yw0Var.c && this.Y == yw0Var.Y) {
            return l8g.a(this.d, yw0Var.d);
        }
        return false;
    }
}
