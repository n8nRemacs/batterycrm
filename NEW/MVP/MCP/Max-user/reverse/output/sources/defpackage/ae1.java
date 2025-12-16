package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ae1 {
    public final wd0 a;
    public final ms8 b;
    public final ms8 c;
    public final boolean d;
    public final s5g e;
    public final List f;
    public final s5g g;

    public ae1(wd0 wd0Var, ms8 ms8Var, ms8 ms8Var2, boolean z, s5g s5gVar, List list, s5g s5gVar2) {
        this.a = wd0Var;
        this.b = ms8Var;
        this.c = ms8Var2;
        this.d = z;
        this.e = s5gVar;
        this.f = list;
        this.g = s5gVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    public static ae1 a(ae1 ae1Var, wd0 wd0Var, ms8 ms8Var, ms8 ms8Var2, boolean z, s5g s5gVar, ArrayList arrayList, s5g s5gVar2, int i) {
        if ((i & 1) != 0) {
            wd0Var = ae1Var.a;
        }
        wd0 wd0Var2 = wd0Var;
        if ((i & 2) != 0) {
            ms8Var = ae1Var.b;
        }
        ms8 ms8Var3 = ms8Var;
        if ((i & 4) != 0) {
            ms8Var2 = ae1Var.c;
        }
        ms8 ms8Var4 = ms8Var2;
        if ((i & 8) != 0) {
            z = ae1Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            s5gVar = ae1Var.e;
        }
        s5g s5gVar3 = s5gVar;
        ArrayList arrayList2 = arrayList;
        if ((i & 32) != 0) {
            arrayList2 = ae1Var.f;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 64) != 0) {
            s5gVar2 = ae1Var.g;
        }
        ae1Var.getClass();
        return new ae1(wd0Var2, ms8Var3, ms8Var4, z2, s5gVar3, arrayList3, s5gVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae1)) {
            return false;
        }
        ae1 ae1Var = (ae1) obj;
        return fni.a(this.a, ae1Var.a) && this.b == ae1Var.b && this.c == ae1Var.c && this.d == ae1Var.d && fni.a(this.e, ae1Var.e) && fni.a(this.f, ae1Var.f) && fni.a(this.g, ae1Var.g);
    }

    public final int hashCode() {
        wd0 wd0Var = this.a;
        int iD = xc0.d(a9h.b((this.c.hashCode() + ((this.b.hashCode() + ((wd0Var == null ? 0 : wd0Var.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        s5g s5gVar = this.g;
        return iHashCode + (s5gVar != null ? s5gVar.hashCode() : 0);
    }

    public final String toString() {
        return "UserPreviewState(avatar=" + this.a + ", microphoneState=" + this.b + ", videoState=" + this.c + ", isFrontCamera=" + this.d + ", title=" + this.e + ", avatarInfo=" + this.f + ", participantsTitle=" + this.g + ")";
    }
}
