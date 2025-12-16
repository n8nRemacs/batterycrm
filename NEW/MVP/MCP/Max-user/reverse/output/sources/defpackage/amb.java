package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class amb implements cmb {
    public final LinkedHashMap a;

    public amb(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amb) && this.a.equals(((amb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallHistoryPageState(callsHistory=" + this.a + ")";
    }
}
