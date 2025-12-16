package defpackage;

/* loaded from: classes2.dex */
public final class gn9 extends jn9 {
    public final boolean a;
    public final int b;

    public gn9(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn9)) {
            return false;
        }
        gn9 gn9Var = (gn9) obj;
        return this.a == gn9Var.a && this.b == gn9Var.b;
    }

    public final int hashCode() {
        return az1.v(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpandEmoji(expand=");
        sb.append(this.a);
        sb.append(", collapseType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "BY_MEDIA_KEYBOARD" : "BY_EMOJI_STATE" : "BY_FOCUS" : "BY_DEFAULT");
        sb.append(")");
        return sb.toString();
    }
}
