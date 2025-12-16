package defpackage;

/* loaded from: classes2.dex */
public final class t14 {
    public final Integer a;

    public t14(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t14) && fni.a(this.a, ((t14) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ButtonTitle(buttonTitleRes=" + this.a + ")";
    }
}
