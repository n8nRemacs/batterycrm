package defpackage;

/* loaded from: classes.dex */
public final class ta8 {
    public final Object a;
    public y16 b = new y16(1);
    public boolean c;
    public boolean d;

    public ta8(Object obj) {
        this.a = obj;
    }

    public final void a(ra8 ra8Var) {
        this.d = true;
        if (this.c) {
            this.c = false;
            ra8Var.f(this.a, this.b.e());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ta8.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ta8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
