package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class sf6 {
    public final LinkedHashSet a;
    public final f1e b;

    public sf6(LinkedHashSet linkedHashSet, f1e f1eVar) {
        this.a = linkedHashSet;
        this.b = f1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf6)) {
            return false;
        }
        sf6 sf6Var = (sf6) obj;
        return this.a.equals(sf6Var.a) && this.b == sf6Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ForwardInAppReviewData(triggeredConditions=" + this.a + ", screen=" + this.b + ")";
    }
}
