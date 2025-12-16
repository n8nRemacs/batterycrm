package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class a04 implements Serializable {
    public final String a;
    public final String b;

    public a04(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        return wy1.j("ContactNameWrapper{name=", this.a, ", lastName=", this.b, "}");
    }
}
