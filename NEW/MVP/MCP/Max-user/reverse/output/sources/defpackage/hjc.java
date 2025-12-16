package defpackage;

/* loaded from: classes2.dex */
public final class hjc extends ljc {
    public final int a;
    public final int b;

    public hjc(int i) {
        this.a = i;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hjc) && this.a == ((hjc) obj).a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 524288;
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
        return ho7.i("OfficialOrgLabel(itemViewType=", j6j.c(this.a), ")");
    }
}
