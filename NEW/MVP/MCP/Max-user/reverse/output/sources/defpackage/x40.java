package defpackage;

/* loaded from: classes2.dex */
public final class x40 {
    public final Long a;
    public final Long b;
    public final float c;
    public final p20 d;

    public x40(Long l, Long l2, float f, p20 p20Var) {
        this.a = l;
        this.b = l2;
        this.c = f;
        this.d = p20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x40)) {
            return false;
        }
        x40 x40Var = (x40) obj;
        return fni.a(this.a, x40Var.a) && fni.a(this.b, x40Var.b) && Float.compare(this.c, x40Var.c) == 0 && fni.a(this.d, x40Var.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return this.d.hashCode() + hf3.b((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        return "AudioMessageState(messageId=" + this.a + ", chatId=" + this.b + ", currentPosition=" + this.c + ", audioButtonState=" + this.d + ")";
    }
}
