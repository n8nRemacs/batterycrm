package defpackage;

/* loaded from: classes2.dex */
public final class ffa {
    public final int a;
    public final Integer b;

    public ffa(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffa)) {
            return false;
        }
        ffa ffaVar = (ffa) obj;
        return this.a == ffaVar.a && fni.a(this.b, ffaVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "NeuroAvatarScrollEvent(tabIndex=" + this.a + ", firstIndex=" + this.b + ")";
    }
}
