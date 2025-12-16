package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ypf {
    public final xpf a;
    public final ArrayList b;

    public ypf(xpf xpfVar, ArrayList arrayList) {
        this.a = xpfVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypf)) {
            return false;
        }
        ypf ypfVar = (ypf) obj;
        return this.a == ypfVar.a && this.b.equals(ypfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestionSearchResult(state=" + this.a + ", mentions=" + this.b + ")";
    }
}
