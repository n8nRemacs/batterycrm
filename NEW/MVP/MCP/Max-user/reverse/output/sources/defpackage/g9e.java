package defpackage;

/* loaded from: classes.dex */
public final class g9e {
    public final m9e a;
    public final m9e b;

    public g9e(m9e m9eVar, m9e m9eVar2) {
        this.a = m9eVar;
        this.b = m9eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g9e.class == obj.getClass()) {
            g9e g9eVar = (g9e) obj;
            if (this.a.equals(g9eVar.a) && this.b.equals(g9eVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        m9e m9eVar = this.a;
        sb.append(m9eVar);
        m9e m9eVar2 = this.b;
        if (m9eVar.equals(m9eVar2)) {
            str = "";
        } else {
            str = ", " + m9eVar2;
        }
        return ho7.l(sb, str, "]");
    }
}
