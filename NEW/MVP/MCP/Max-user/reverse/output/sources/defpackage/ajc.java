package defpackage;

/* loaded from: classes2.dex */
public final class ajc extends cjc {
    public final int a;

    public ajc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajc) && this.a == ((ajc) obj).a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 1024;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.a;
    }

    public final String toString() {
        return ho7.i("Loading(itemViewType=", j6j.c(this.a), ")");
    }
}
