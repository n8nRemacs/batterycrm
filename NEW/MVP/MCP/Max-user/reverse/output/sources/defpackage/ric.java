package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ric extends mjc {
    public final List a;
    public final List b;
    public final boolean c;
    public final int d = 1;

    public ric(List list, List list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ric)) {
            return false;
        }
        ric ricVar = (ric) obj;
        return fni.a(this.a, ricVar.a) && fni.a(this.b, ricVar.b) && this.c == ricVar.c;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xrf.l(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonsStack(buttons=");
        sb.append(this.a);
        sb.append(", contextMenuButtons=");
        sb.append(this.b);
        sb.append(", isMoreButtonEnabled=");
        return az1.k(sb, this.c, ")");
    }
}
