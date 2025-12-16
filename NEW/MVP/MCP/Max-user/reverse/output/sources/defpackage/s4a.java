package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class s4a extends l0g {
    public final qb2 c;

    public s4a(qb2 qb2Var) {
        this.c = qb2Var;
    }

    public static final s4a e(tm9 tm9Var) {
        int iM;
        String strO;
        if (!tm9Var.l()) {
            return null;
        }
        try {
            iM = efi.m(tm9Var);
        } catch (Throwable th) {
            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = vfe.a.iterator();
            while (it.hasNext()) {
                ((qwa) it.next()).getClass();
                qwa.a(th);
            }
            int iV = az1.v(ctd.a);
            if (iV != 0) {
                if (iV != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iM = 0;
        }
        if (iM == 0) {
            return null;
        }
        qb2 qb2VarA = null;
        for (int i = 0; i < iM; i++) {
            try {
                strO = efi.o(tm9Var);
            } catch (Throwable th2) {
                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = vfe.a.iterator();
                while (it2.hasNext()) {
                    ((qwa) it2.next()).getClass();
                    qwa.a(th2);
                }
                int iV2 = az1.v(ctd.a);
                if (iV2 != 0) {
                    if (iV2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strO = null;
            }
            if (strO != null) {
                if (strO.equals("chat")) {
                    qb2VarA = qb2.a(tm9Var);
                } else {
                    try {
                        tm9Var.v();
                    } catch (Throwable th3) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = vfe.a.iterator();
                        while (it3.hasNext()) {
                            ((qwa) it3.next()).getClass();
                            qwa.a(th3);
                        }
                        int iV3 = az1.v(ctd.a);
                        if (iV3 != 0) {
                            if (iV3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }
        return new s4a(qb2VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4a) && fni.a(this.c, ((s4a) obj).c);
    }

    public final int hashCode() {
        qb2 qb2Var = this.c;
        if (qb2Var == null) {
            return 0;
        }
        return qb2Var.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(chat=" + this.c + ")";
    }
}
