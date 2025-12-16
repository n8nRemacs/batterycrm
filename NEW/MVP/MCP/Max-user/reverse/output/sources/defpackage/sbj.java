package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class sbj {
    public final cji a;

    public /* synthetic */ sbj(s6b s6bVar) {
        this.a = (cji) s6bVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbj) {
            return syi.c(this.a, ((sbj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
