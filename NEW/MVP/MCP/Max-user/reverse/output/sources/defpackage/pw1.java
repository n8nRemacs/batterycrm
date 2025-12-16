package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class pw1 {
    public final pb2 a;
    public final ku3 b;
    public final eh9 c;
    public ArrayList d;

    public pw1(eh9 eh9Var, ku3 ku3Var) {
        this.b = ku3Var;
        this.c = eh9Var;
        this.a = null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(this.c.a.a));
        ArrayList arrayList2 = this.d;
        if ((arrayList2 == null ? 0 : arrayList2.size()) > 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((pw1) it.next()).c.a.a));
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pw1.class != obj.getClass()) {
            return false;
        }
        pw1 pw1Var = (pw1) obj;
        eh9 eh9Var = pw1Var.c;
        ku3 ku3Var = pw1Var.b;
        pb2 pb2Var = pw1Var.a;
        pb2 pb2Var2 = this.a;
        if (pb2Var2 != null) {
            if (!pb2Var2.equals(pb2Var)) {
                return false;
            }
        } else if (pb2Var != null) {
            return false;
        }
        ku3 ku3Var2 = this.b;
        if (ku3Var2 != null) {
            if (!ku3Var2.equals(ku3Var)) {
                return false;
            }
        } else if (ku3Var != null) {
            return false;
        }
        eh9 eh9Var2 = this.c;
        if (eh9Var2 != null) {
            if (!eh9Var2.equals(eh9Var)) {
                return false;
            }
        } else if (eh9Var != null) {
            return false;
        }
        ArrayList arrayList = this.d;
        return arrayList != null ? arrayList.equals(pw1Var.d) : pw1Var.d == null;
    }

    public final int hashCode() {
        pb2 pb2Var = this.a;
        int iHashCode = (pb2Var != null ? pb2Var.hashCode() : 0) * 31;
        ku3 ku3Var = this.b;
        int iHashCode2 = (iHashCode + (ku3Var != null ? ku3Var.hashCode() : 0)) * 31;
        eh9 eh9Var = this.c;
        int iHashCode3 = (iHashCode2 + (eh9Var != null ? eh9Var.hashCode() : 0)) * 31;
        ArrayList arrayList = this.d;
        return iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public pw1(pb2 pb2Var, eh9 eh9Var) {
        this.a = pb2Var;
        this.c = eh9Var;
        this.b = null;
    }
}
