package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class lfa {
    public final String a;
    public final List b;

    public lfa(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfa)) {
            return false;
        }
        lfa lfaVar = (lfa) obj;
        return fni.a(this.a, lfaVar.a) && fni.a(this.b, lfaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NeuroAvatarsPresetInfo(name=" + this.a + ", avatars=" + this.b + ")";
    }
}
