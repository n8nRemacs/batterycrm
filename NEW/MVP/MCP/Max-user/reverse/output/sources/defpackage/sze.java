package defpackage;

/* loaded from: classes2.dex */
public abstract class sze {
    public final boolean direct;
    public final String message;

    public sze(String str, boolean z) {
        this.message = str;
        this.direct = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sze szeVar = (sze) obj;
        if (this.direct != szeVar.direct) {
            return false;
        }
        return this.message.equals(szeVar.message);
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + (this.direct ? 1 : 0);
    }
}
