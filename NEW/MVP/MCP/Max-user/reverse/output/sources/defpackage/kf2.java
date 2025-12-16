package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class kf2 implements Serializable {
    public final /* synthetic */ int a = 0;
    public final Serializable b;
    public final ArrayList c;

    public kf2(i5i i5iVar) {
        this.b = (String) i5iVar.a;
        this.c = (sz) i5iVar.b;
    }

    public static void e(rs4 rs4Var) {
        int iOrdinal = rs4Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return;
        }
        throw new IllegalStateException("Unexpected value: " + rs4Var);
    }

    public void a(jf2 jf2Var, rs4 rs4Var) {
        d(rs4Var).add(jf2Var);
        e(rs4Var);
    }

    public kf2 b(boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        List listUnmodifiableList = z ? Collections.unmodifiableList(arrayList) : new ArrayList(arrayList);
        ArrayList arrayList2 = this.c;
        return new kf2(listUnmodifiableList, z ? Collections.unmodifiableList(arrayList2) : new ArrayList(arrayList2));
    }

    public int c(rs4 rs4Var) {
        return d(rs4Var).size();
    }

    public ArrayList d(rs4 rs4Var) {
        int iOrdinal = rs4Var.ordinal();
        if (iOrdinal == 0) {
            return (ArrayList) this.b;
        }
        if (iOrdinal == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unexpected value: " + rs4Var);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Message{text='" + ((String) this.b) + "', attaches=" + ((sz) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public kf2() {
        this(new ArrayList(), new ArrayList());
    }

    public kf2(List list, List list2) {
        this.b = new ArrayList(list);
        this.c = new ArrayList(list2);
    }
}
