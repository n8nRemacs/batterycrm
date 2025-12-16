package defpackage;

/* loaded from: classes.dex */
public final class sa8 {
    public final Object a;
    public y16 b = new y16(0);
    public boolean c;

    public sa8(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sa8.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((sa8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
