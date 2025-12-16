package defpackage;

/* loaded from: classes.dex */
public final class aa0 {
    public final Object a;
    public final l9c b;
    public final db0 c;

    public aa0(Object obj, l9c l9cVar, db0 db0Var) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.a = obj;
        this.b = l9cVar;
        this.c = db0Var;
    }

    public final boolean equals(Object obj) {
        db0 db0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aa0) {
            aa0 aa0Var = (aa0) obj;
            aa0Var.getClass();
            Object obj2 = aa0Var.a;
            db0 db0Var2 = aa0Var.c;
            if (this.a.equals(obj2) && this.b.equals(aa0Var.b) && ((db0Var = this.c) != null ? db0Var.equals(db0Var2) : db0Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        db0 db0Var = this.c;
        return (db0Var == null ? 0 : db0Var.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + "}";
    }
}
