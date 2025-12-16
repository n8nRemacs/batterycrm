package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ani {
    public final u6j a;
    public final Boolean b;
    public final sbj c;
    public final cji d;
    public final cji e;

    public /* synthetic */ ani(v6d v6dVar) {
        this.a = (u6j) v6dVar.b;
        this.b = (Boolean) v6dVar.c;
        this.c = (sbj) v6dVar.d;
        this.d = (cji) v6dVar.o;
        this.e = (cji) v6dVar.X;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ani)) {
            return false;
        }
        ani aniVar = (ani) obj;
        return syi.c(this.a, aniVar.a) && syi.c(null, null) && syi.c(this.b, aniVar.b) && syi.c(null, null) && syi.c(this.c, aniVar.c) && syi.c(this.d, aniVar.d) && syi.c(this.e, aniVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b, null, this.c, this.d, this.e});
    }
}
