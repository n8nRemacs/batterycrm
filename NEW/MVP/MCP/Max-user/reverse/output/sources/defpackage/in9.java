package defpackage;

/* loaded from: classes2.dex */
public final class in9 extends jn9 {
    public final int a;

    public in9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in9) && this.a == ((in9) obj).a;
    }

    public final int hashCode() {
        return az1.v(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleEmoji(state=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "KEYBOARD_BY_SYSTEM" : "KEYBOARD" : "EMOJI" : "DEFAULT");
        sb.append(")");
        return sb.toString();
    }
}
