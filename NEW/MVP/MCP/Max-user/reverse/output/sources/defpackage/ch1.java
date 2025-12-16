package defpackage;

/* loaded from: classes.dex */
public final class ch1 extends gh1 {
    public final Integer a;

    public ch1(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch1) && fni.a(this.a, ((ch1) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Description(description=" + this.a + ")";
    }
}
