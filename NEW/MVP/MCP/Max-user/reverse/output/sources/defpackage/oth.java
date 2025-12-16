package defpackage;

/* loaded from: classes2.dex */
public final class oth {
    public static final nth Companion = new nth();
    public final String a;
    public final String b;

    public /* synthetic */ oth(int i, String str, String str2) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, mth.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oth)) {
            return false;
        }
        oth othVar = (oth) obj;
        return fni.a(this.a, othVar.a) && fni.a(this.b, othVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("WebAppRequestPhoneResponse(requestId=", this.a, ", phone=", this.b, ")");
    }

    public oth(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
