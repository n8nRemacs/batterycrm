package defpackage;

/* loaded from: classes2.dex */
public final class q2g {
    public final usb a;
    public final int b;

    public q2g(usb usbVar, int i) {
        this.a = usbVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2g)) {
            return false;
        }
        q2g q2gVar = (q2g) obj;
        return this.a == q2gVar.a && this.b == q2gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TaskCountByType(type=" + this.a + ", count=" + this.b + ")";
    }
}
