package defpackage;

/* loaded from: classes2.dex */
public final class xye implements pr9 {
    public final String a;

    public xye(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xye) && fni.a(this.a, ((xye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("ShowWarningLinkBottomSheet(link=", this.a, ")");
    }
}
