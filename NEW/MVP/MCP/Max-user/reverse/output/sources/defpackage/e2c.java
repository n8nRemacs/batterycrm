package defpackage;

/* loaded from: classes2.dex */
public final class e2c implements i2c {
    public final CharSequence a;
    public final long b;

    public e2c(CharSequence charSequence, long j) {
        this.a = charSequence;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2c)) {
            return false;
        }
        e2c e2cVar = (e2c) obj;
        return fni.a(this.a, e2cVar.a) && this.b == e2cVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + ((Object) this.a) + ", avatarSourceId=" + this.b + ")";
    }
}
