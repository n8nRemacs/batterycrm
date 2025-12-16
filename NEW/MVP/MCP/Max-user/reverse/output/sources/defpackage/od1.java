package defpackage;

/* loaded from: classes.dex */
public final class od1 extends ud1 {
    public final uxg a;

    public od1(uxg uxgVar) {
        this.a = uxgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od1) && this.a == ((od1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonAction(state=" + this.a + ")";
    }
}
