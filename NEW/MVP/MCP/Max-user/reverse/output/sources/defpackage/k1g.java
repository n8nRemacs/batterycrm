package defpackage;

/* loaded from: classes2.dex */
public final class k1g {
    public final sm a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;

    public k1g(sm smVar, boolean z, boolean z2, long j, int i) {
        this.a = smVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1g)) {
            return false;
        }
        k1g k1gVar = (k1g) obj;
        return this.a.equals(k1gVar.a) && this.b == k1gVar.b && this.c == k1gVar.c && this.d == k1gVar.d && this.e == k1gVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + a9h.a(a9h.b(a9h.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "Task(apiTask=" + this.a + ", executeAndSave=" + this.b + ", retry=" + this.c + ", dependsRequestId=" + this.d + ", dependencyType=" + this.e + ")";
    }
}
