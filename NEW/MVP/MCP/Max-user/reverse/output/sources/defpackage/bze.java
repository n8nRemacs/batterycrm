package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class bze {
    public static final bze c = new bze(aze.a, hd5.a);
    public final aze a;
    public final List b;

    public bze(aze azeVar, List list) {
        this.a = azeVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bze)) {
            return false;
        }
        bze bzeVar = (bze) obj;
        return this.a == bzeVar.a && fni.a(this.b, bzeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowcaseState(state=" + this.a + ", content=" + this.b + ")";
    }
}
