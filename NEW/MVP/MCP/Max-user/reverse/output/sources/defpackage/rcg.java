package defpackage;

/* loaded from: classes.dex */
public final class rcg extends ifi {
    public final String a;

    public rcg(String str) {
        this.a = str;
    }

    @Override // defpackage.ifi
    public final CharSequence b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcg) && this.a.equals(((rcg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LostConnection(text=" + ((Object) this.a) + ")";
    }
}
