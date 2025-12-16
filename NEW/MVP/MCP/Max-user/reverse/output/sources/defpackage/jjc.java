package defpackage;

/* loaded from: classes2.dex */
public final class jjc extends ljc {
    public final String a;

    public jjc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjc) && this.a.equals(((jjc) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 16;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.t98
    public final int m() {
        return 16;
    }

    public final String toString() {
        return "Phone(text=" + ((Object) this.a) + ")";
    }
}
