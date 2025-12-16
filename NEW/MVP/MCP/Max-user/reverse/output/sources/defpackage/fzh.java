package defpackage;

/* loaded from: classes2.dex */
public final class fzh implements tv7 {
    public final boolean a;

    public fzh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzh) && this.a == ((fzh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("NeedCloseConfirmation(needConfirmation=", ")", this.a);
    }
}
