package defpackage;

/* loaded from: classes2.dex */
public final class bjc extends cjc {
    public final gdc a;
    public final int b;

    public bjc(gdc gdcVar, int i) {
        this.a = gdcVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjc)) {
            return false;
        }
        bjc bjcVar = (bjc) obj;
        return this.a.equals(bjcVar.a) && this.b == bjcVar.b;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + utb.k(1, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.b;
    }

    public final String toString() {
        String strC = j6j.c(this.b);
        StringBuilder sb = new StringBuilder("Result(cellModel=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append("CHAT");
        sb.append(", itemViewType=");
        return ho7.l(sb, strC, ")");
    }
}
