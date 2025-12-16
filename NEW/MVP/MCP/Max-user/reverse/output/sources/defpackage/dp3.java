package defpackage;

/* loaded from: classes2.dex */
public final class dp3 extends id0 {
    public final String b;
    public final o8c c;

    public dp3(String str, o8c o8cVar) {
        super(7);
        this.b = str;
        this.c = o8cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp3)) {
            return false;
        }
        dp3 dp3Var = (dp3) obj;
        return fni.a(this.b, dp3Var.b) && fni.a(this.c, dp3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "NameInputScreen(token=" + this.b + ", presetAvatars=" + this.c + ")";
    }
}
