package defpackage;

/* loaded from: classes2.dex */
public final class yze implements zze {
    public final tze a;

    public yze(tze tzeVar) {
        this.a = tzeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yze) && fni.a(this.a, ((yze) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Replace(command=" + this.a + ")";
    }
}
