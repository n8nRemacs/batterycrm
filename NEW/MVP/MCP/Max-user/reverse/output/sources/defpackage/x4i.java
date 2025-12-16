package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public final class x4i {
    public final UUID a;
    public final w4i b;
    public final yd4 c;
    public final HashSet d;
    public final yd4 e;
    public final int f;
    public final int g;

    public x4i(UUID uuid, w4i w4iVar, yd4 yd4Var, ArrayList arrayList, yd4 yd4Var2, int i, int i2) {
        this.a = uuid;
        this.b = w4iVar;
        this.c = yd4Var;
        this.d = new HashSet(arrayList);
        this.e = yd4Var2;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x4i.class != obj.getClass()) {
            return false;
        }
        x4i x4iVar = (x4i) obj;
        if (this.f == x4iVar.f && this.g == x4iVar.g && this.a.equals(x4iVar.a) && this.b == x4iVar.b && this.c.equals(x4iVar.c) && this.d.equals(x4iVar.d)) {
            return this.e.equals(x4iVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + this.b + ", mOutputData=" + this.c + ", mTags=" + this.d + ", mProgress=" + this.e + '}';
    }
}
