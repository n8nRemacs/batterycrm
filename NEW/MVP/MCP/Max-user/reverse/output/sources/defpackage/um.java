package defpackage;

/* loaded from: classes2.dex */
public final class um {
    public final String a;
    public final String b;

    public um(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um)) {
            return false;
        }
        um umVar = (um) obj;
        return fni.a(this.a, umVar.a) && fni.a(this.b, umVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return wy1.j("Info(token=", this.a, ", apiEndpoint=", this.b, ")");
    }
}
