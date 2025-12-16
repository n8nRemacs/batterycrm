package defpackage;

/* loaded from: classes2.dex */
public final class kjc extends ljc {
    public final int a;
    public final int b;

    public kjc(int i) {
        this.a = i;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjc) && this.a == ((kjc) obj).a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 131072;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.b;
    }

    public final String toString() {
        return ho7.i("RknLabel(itemViewType=", j6j.c(this.a), ")");
    }
}
