package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class dj2 {
    public final pb2 a;

    public dj2(pb2 pb2Var) {
        this.a = pb2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[EDGE_INSN: B:28:0x0071->B:29:0x0072 BREAK  A[LOOP:0: B:24:0x0055->B:81:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ku3 ku3Var;
        ku3 ku3Var2;
        si9 si9Var;
        si9 si9Var2;
        int iHashCode2 = dj2.class.hashCode();
        pb2 pb2Var = this.a;
        int iHashCode3 = (Long.hashCode(pb2Var.b.k) * 31) + (Long.hashCode(pb2Var.b.a) * 31) + (Long.hashCode(pb2Var.b.l) * 31) + iHashCode2;
        eh9 eh9Var = pb2Var.c;
        String strR = null;
        Long lValueOf = (eh9Var == null || (si9Var2 = eh9Var.a) == null) ? null : Long.valueOf(si9Var2.m());
        int iHashCode4 = ((lValueOf != null ? lValueOf.hashCode() : 0) * 31) + iHashCode3;
        eh9 eh9Var2 = pb2Var.c;
        jdc jdcVar = (eh9Var2 == null || (si9Var = eh9Var2.a) == null) ? null : si9Var.x0;
        if (jdcVar == null || jdcVar.p() == 0) {
            iHashCode = 0;
        } else {
            iHashCode = 0;
            for (int i = 0; i < jdcVar.p(); i++) {
                w10 w10VarO = jdcVar.o(i);
                if (w10VarO != null) {
                    iHashCode = (iHashCode * 31) + Boolean.hashCode(w10VarO.z) + a9h.b((Objects.hashCode(w10VarO.x) + a9h.a(a9h.a(a9h.a(a9h.b((Objects.hashCode(w10VarO.s) + ((Objects.hashCode(w10VarO.r) + hf3.b(a9h.a((Objects.hashCode(w10VarO.o) + ((Objects.hashCode(w10VarO.m) + ((Objects.hashCode(w10VarO.l) + ((Objects.hashCode(w10VarO.k) + ((Objects.hashCode(w10VarO.j) + ((Objects.hashCode(w10VarO.i) + ((Objects.hashCode(w10VarO.h) + ((Objects.hashCode(w10VarO.g) + ((Objects.hashCode(w10VarO.f) + ((Objects.hashCode(w10VarO.e) + ((Objects.hashCode(w10VarO.d) + ((Objects.hashCode(w10VarO.c) + ((Objects.hashCode(w10VarO.b) + (Objects.hashCode(w10VarO.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, w10VarO.p), w10VarO.q, 31)) * 31)) * 31, 31, w10VarO.t), 31, w10VarO.u), 31, w10VarO.v), 31, w10VarO.w)) * 31, 31, w10VarO.y);
                }
            }
        }
        int i2 = (iHashCode * 31) + iHashCode4;
        eh9 eh9Var3 = pb2Var.c;
        String strE = (eh9Var3 == null || (ku3Var2 = eh9Var3.b) == null) ? null : ku3Var2.e();
        int iHashCode5 = ((strE != null ? strE.hashCode() : 0) * 31) + i2;
        eh9 eh9Var4 = pb2Var.c;
        if (eh9Var4 != null && (ku3Var = eh9Var4.b) != null) {
            strR = ku3Var.r(il0.a);
        }
        return ((strR != null ? strR.hashCode() : 0) * 31) + iHashCode5;
    }

    public final String toString() {
        si9 si9Var;
        pb2 pb2Var = this.a;
        rf2 rf2Var = pb2Var.b;
        long j = rf2Var.l;
        long j2 = rf2Var.a;
        long j3 = rf2Var.k;
        eh9 eh9Var = pb2Var.c;
        long jM = (eh9Var == null || (si9Var = eh9Var.a) == null) ? 0L : si9Var.m();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(":");
        sb.append(j2);
        az1.r(j3, ":", ":", sb);
        sb.append(jM);
        return sb.toString();
    }
}
