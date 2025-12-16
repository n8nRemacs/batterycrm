package defpackage;

/* loaded from: classes2.dex */
public final class u0i {
    public final String a;
    public final boolean b;
    public final vvh c;

    public u0i(String str, boolean z, vvh vvhVar) {
        this.a = str;
        this.b = z;
        this.c = vvhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0i)) {
            return false;
        }
        u0i u0iVar = (u0i) obj;
        return fni.a(this.a, u0iVar.a) && this.b == u0iVar.b && fni.a(this.c, u0iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a9h.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WebViewContainerState(title=" + this.a + ", isVerified=" + this.b + ", loadingState=" + this.c + ")";
    }
}
