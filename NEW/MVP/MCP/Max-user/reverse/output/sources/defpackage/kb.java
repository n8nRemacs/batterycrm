package defpackage;

/* loaded from: classes.dex */
public final class kb implements lb {
    public final zi1 a;

    public kb(zi1 zi1Var) {
        this.a = zi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kb) && this.a.equals(((kb) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisableScreenSharingForParticipant(id=" + this.a + ", isSuccess=true)";
    }
}
