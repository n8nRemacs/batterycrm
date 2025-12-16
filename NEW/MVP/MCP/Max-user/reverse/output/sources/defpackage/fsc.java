package defpackage;

/* loaded from: classes.dex */
public final class fsc {
    public final Class a;
    public final Class b;

    public fsc(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static fsc a(Class cls) {
        return new fsc(esc.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fsc.class != obj.getClass()) {
            return false;
        }
        fsc fscVar = (fsc) obj;
        if (this.b.equals(fscVar.b)) {
            return this.a.equals(fscVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == esc.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
