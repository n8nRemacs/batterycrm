package defpackage;

/* loaded from: classes2.dex */
public final class m27 extends xh5 {
    public final int a;

    public m27(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m27) && this.a == ((m27) obj).a;
    }

    public final int hashCode() {
        return az1.v(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HideErrorInputEvent(typeInput=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "TITLE" : "SURNAME" : "NAME");
        sb.append(")");
        return sb.toString();
    }
}
