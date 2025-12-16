package defpackage;

/* loaded from: classes2.dex */
public final class ga6 implements t98 {
    public final int a;

    public ga6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga6) && this.a == ((ga6) obj).a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 9223372036854775806L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.t98
    public final int m() {
        return this.a;
    }

    public final String toString() {
        return wy1.e(this.a, "FolderMemberAddItem(viewType=", ")");
    }
}
