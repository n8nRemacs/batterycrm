package defpackage;

/* loaded from: classes2.dex */
public final class jce {
    public final long a;
    public final int b;

    public jce(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jce)) {
            return false;
        }
        jce jceVar = (jce) obj;
        return this.a == jceVar.a && this.b == jceVar.b;
    }

    public final int hashCode() {
        return az1.v(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "SelectedMention(id=", ", selectedMentionType=");
        int i = this.b;
        sbL.append(i != 1 ? i != 2 ? "null" : "NAME" : "SHORTLINK");
        sbL.append(")");
        return sbL.toString();
    }
}
