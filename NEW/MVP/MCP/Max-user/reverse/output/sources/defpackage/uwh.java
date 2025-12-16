package defpackage;

/* loaded from: classes2.dex */
public final class uwh {
    public static final twh Companion = new twh();
    public final boolean a;

    public /* synthetic */ uwh(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            g5j.c(i, 1, swh.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwh) && this.a == ((uwh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("WebAppSetupClosingBehaviorRequest(needConfirmation=", ")", this.a);
    }
}
