package defpackage;

/* loaded from: classes2.dex */
public abstract class uk7 {
    public final byte a;

    public uk7(byte b) {
        this.a = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return getClass().equals(obj != null ? obj.getClass() : null) && this.a == ((uk7) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
