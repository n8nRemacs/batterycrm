package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class fgi {
    public transient mfi a;
    public transient s2 b;

    public final Map a() {
        s2 s2Var = this.b;
        if (s2Var != null) {
            return s2Var;
        }
        hgi hgiVar = (hgi) this;
        s2 s2Var2 = new s2(hgiVar, hgiVar.c, 1);
        this.b = s2Var2;
        return s2Var2;
    }

    public final Set b() {
        mfi mfiVar = this.a;
        if (mfiVar != null) {
            return mfiVar;
        }
        hgi hgiVar = (hgi) this;
        mfi mfiVar2 = new mfi(hgiVar, hgiVar.c);
        this.a = mfiVar2;
        return mfiVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fgi) {
            return a().equals(((fgi) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((s2) a()).b.hashCode();
    }

    public final String toString() {
        return ((s2) a()).b.toString();
    }
}
