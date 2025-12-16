package defpackage;

/* loaded from: classes.dex */
public final class ak1 {
    public final boolean a;

    public ak1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak1) && this.a == ((ak1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("CallPresettingsState(isSaveButtonAvailable=", ")", this.a);
    }
}
