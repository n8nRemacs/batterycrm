package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class k3a {
    public final ArrayList a;

    public k3a(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3a) && this.a.equals(((k3a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MovieThumbnail(qualities=" + this.a + ")";
    }
}
