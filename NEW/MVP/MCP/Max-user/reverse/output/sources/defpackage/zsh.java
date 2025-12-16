package defpackage;

/* loaded from: classes2.dex */
public final class zsh {
    public static final ysh Companion = new ysh();
    public final String a;

    public /* synthetic */ zsh(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            g5j.c(i, 1, xsh.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsh) && fni.a(this.a, ((zsh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("WebAppOpenLinkRequest(url=", this.a, ")");
    }
}
