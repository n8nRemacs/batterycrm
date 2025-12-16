package defpackage;

/* loaded from: classes2.dex */
public final class ijc extends ljc {
    public final int a;

    public ijc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijc) && this.a == ((ijc) obj).a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 128;
    }

    public final int hashCode() {
        return Integer.hashCode(-2147483520) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return -2147483520;
    }

    public final String toString() {
        return "ParticipantsCount(count=" + this.a + ", itemViewType=" + j6j.c(-2147483520) + ")";
    }
}
