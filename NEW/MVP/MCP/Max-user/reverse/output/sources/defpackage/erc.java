package defpackage;

/* loaded from: classes2.dex */
public abstract class erc {
    public final long a;
    public final String b;

    public erc(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erc) || getClass() != obj.getClass()) {
            return false;
        }
        erc ercVar = (erc) obj;
        return this.a == ercVar.a && fni.a(this.b, ercVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + a9h.a(vid.a(getClass()).hashCode() * 31, 31, this.a);
    }
}
