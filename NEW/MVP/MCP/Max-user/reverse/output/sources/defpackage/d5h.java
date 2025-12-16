package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class d5h extends g5h {
    public final List a;

    public d5h(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5h) && fni.a(this.a, ((d5h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FilesReady(uriList=" + this.a + ")";
    }
}
