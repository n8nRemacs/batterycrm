package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l3g implements el {
    public static final l3g b = new l3g(null);
    public final String a;

    public /* synthetic */ l3g(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l3g) {
            return syi.c(this.a, ((l3g) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
