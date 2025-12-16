package defpackage;

/* loaded from: classes2.dex */
public final class xg4 extends i8j {
    public final boolean a;

    public xg4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg4) && this.a == ((xg4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Switch(isToggled=", ")", this.a);
    }
}
