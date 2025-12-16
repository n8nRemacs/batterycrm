package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class h3a {
    public final ArrayList a;

    public h3a(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3a) && this.a.equals(((h3a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MovieStateUpdates(updates=" + this.a + ")";
    }
}
