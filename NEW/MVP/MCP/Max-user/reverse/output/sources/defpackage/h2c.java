package defpackage;

/* loaded from: classes2.dex */
public final class h2c implements i2c {
    public final String a;

    public h2c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2c) && fni.a(this.a, ((h2c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("UserPhoto(url=", this.a, ")");
    }
}
