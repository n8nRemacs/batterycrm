package defpackage;

/* loaded from: classes2.dex */
public final class pm7 extends cda {
    public final njd b;

    public pm7(njd njdVar) {
        super(qqg.a);
        this.b = njdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm7) && fni.a(this.b, ((pm7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NeuroAvatarScreen(registrationData=" + this.b + ")";
    }
}
