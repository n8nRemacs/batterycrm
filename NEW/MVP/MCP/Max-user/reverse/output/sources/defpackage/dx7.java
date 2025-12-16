package defpackage;

/* loaded from: classes.dex */
public final class dx7 extends tx7 {
    public final boolean a;
    public final String b;

    public dx7(String str, boolean z) {
        this.a = z;
        this.b = str.toString();
    }

    @Override // defpackage.tx7
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dx7.class != obj.getClass()) {
            return false;
        }
        dx7 dx7Var = (dx7) obj;
        return this.a == dx7Var.a && fni.a(this.b, dx7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.tx7
    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        qmf.a(sb, str);
        return sb.toString();
    }
}
