package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class wac {
    public final gx3 a;
    public final LinkedHashMap b;
    public final ArrayList c;

    public wac(gx3 gx3Var, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        this.a = gx3Var;
        this.b = linkedHashMap;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wac)) {
            return false;
        }
        wac wacVar = (wac) obj;
        return fni.a(this.a, wacVar.a) && this.b.equals(wacVar.b) && this.c.equals(wacVar.c);
    }

    public final int hashCode() {
        gx3 gx3Var = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((gx3Var == null ? 0 : gx3Var.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "Profile(contactInfo=" + this.a + ", restrictions=" + this.b + ", profileOptions=" + this.c + ")";
    }
}
