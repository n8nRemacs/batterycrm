package defpackage;

/* loaded from: classes2.dex */
public final class hu7 {
    public final String a;
    public final x9f b;

    public hu7(String str, x9f x9fVar) {
        this.a = str;
        this.b = x9fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu7)) {
            return false;
        }
        hu7 hu7Var = (hu7) obj;
        return fni.a(this.a, hu7Var.a) && this.b.equals(hu7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JobWrapper(name=" + this.a + ", job=" + this.b + ")";
    }
}
