package defpackage;

/* loaded from: classes.dex */
public final class f9e {
    public final l9e a;
    public final l9e b;

    public f9e(l9e l9eVar, l9e l9eVar2) {
        this.a = l9eVar;
        this.b = l9eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f9e.class == obj.getClass()) {
            f9e f9eVar = (f9e) obj;
            if (this.a.equals(f9eVar.a) && this.b.equals(f9eVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String string;
        l9e l9eVar = this.a;
        String strValueOf = String.valueOf(l9eVar);
        l9e l9eVar2 = this.b;
        if (l9eVar.equals(l9eVar2)) {
            string = "";
        } else {
            String strValueOf2 = String.valueOf(l9eVar2);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 2);
            sb.append(", ");
            sb.append(strValueOf2);
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(u45.f(strValueOf.length() + 2, string));
        sb2.append("[");
        sb2.append(strValueOf);
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
