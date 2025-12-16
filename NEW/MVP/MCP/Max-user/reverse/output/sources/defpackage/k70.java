package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class k70 extends l0g {
    public static final /* synthetic */ int X = 0;
    public final LinkedHashMap c;
    public final ArrayList d;
    public final zva o;

    public k70(LinkedHashMap linkedHashMap, ArrayList arrayList, zva zvaVar) {
        this.c = linkedHashMap;
        this.d = arrayList;
        this.o = zvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k70)) {
            return false;
        }
        k70 k70Var = (k70) obj;
        return this.c.equals(k70Var.c) && this.d.equals(k70Var.d) && fni.a(this.o, k70Var.o);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        zva zvaVar = this.o;
        return iHashCode + (zvaVar == null ? 0 : zvaVar.hashCode());
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{tokenTypes=" + l8g.g(this.c) + "passwordChallenge=" + this.o + "}";
    }
}
