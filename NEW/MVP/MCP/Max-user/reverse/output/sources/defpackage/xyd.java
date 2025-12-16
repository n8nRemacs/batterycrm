package defpackage;

/* loaded from: classes2.dex */
public final class xyd extends zyd {
    public final String a;

    public xyd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xyd) && fni.a(this.a, ((xyd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("Success(text=", this.a, ")");
    }
}
