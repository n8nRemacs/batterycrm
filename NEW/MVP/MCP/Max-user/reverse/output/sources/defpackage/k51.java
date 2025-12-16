package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class k51 {
    public final Bundle a;
    public final List b;
    public final LinkedHashMap c;
    public final Point d;

    public k51(Bundle bundle, o98 o98Var, LinkedHashMap linkedHashMap, Point point) {
        this.a = bundle;
        this.b = o98Var;
        this.c = linkedHashMap;
        this.d = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k51)) {
            return false;
        }
        k51 k51Var = (k51) obj;
        return this.a.equals(k51Var.a) && fni.a(this.b, k51Var.b) && this.c.equals(k51Var.c) && fni.a(this.d, k51Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xrf.l(this.b, this.a.hashCode() * 31, 31)) * 31;
        Point point = this.d;
        return iHashCode + (point == null ? 0 : point.hashCode());
    }

    public final String toString() {
        return "CallContextMenuInfo(bundle=" + this.a + ", actions=" + this.b + ", statParam=" + this.c + ", anchor=" + this.d + ")";
    }
}
