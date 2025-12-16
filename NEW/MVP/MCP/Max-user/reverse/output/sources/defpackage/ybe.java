package defpackage;

/* loaded from: classes2.dex */
public final class ybe {
    public final xbe a;
    public final i2c b;

    public ybe(xbe xbeVar, i2c i2cVar) {
        this.a = xbeVar;
        this.b = i2cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybe)) {
            return false;
        }
        ybe ybeVar = (ybe) obj;
        return fni.a(this.a, ybeVar.a) && fni.a(this.b, ybeVar.b);
    }

    public final int hashCode() {
        xbe xbeVar = this.a;
        return this.b.hashCode() + ((xbeVar == null ? 0 : xbeVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectedAvatarInfo(avatar=" + this.a + ", placeholder=" + this.b + ")";
    }
}
