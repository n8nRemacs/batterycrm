package defpackage;

/* loaded from: classes2.dex */
public final class ecd extends u7j {
    public final String a;

    public ecd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecd) && fni.a(this.a, ((ecd) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho7.i("Avatar(avatarUrl=", this.a, ")");
    }
}
