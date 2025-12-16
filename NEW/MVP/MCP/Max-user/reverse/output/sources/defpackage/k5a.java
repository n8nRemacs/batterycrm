package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final class k5a extends l0g {
    public final ul9 c;
    public final String d;

    public k5a(ul9 ul9Var, String str) {
        this.c = ul9Var;
        this.d = str;
    }

    public static final k5a e(tm9 tm9Var) {
        int iM;
        String strP;
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
        ul9 ul9VarB = null;
        String strP2 = null;
        for (int i = 0; i < iM; i++) {
            try {
                strP = efi.p(tm9Var, null);
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
                strP = null;
            }
            if (strP != null) {
                if (strP.equals("reactionInfo")) {
                    ul9VarB = iwi.b(tm9Var);
                } else if (strP.equals(NegotiationErrorStat.KEY_ERROR)) {
                    try {
                        strP2 = efi.p(tm9Var, null);
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
                        strP2 = null;
                    }
                } else {
                    try {
                        tm9Var.v();
                    } catch (Throwable th4) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = vfe.a.iterator();
                        while (it4.hasNext()) {
                            ((qwa) it4.next()).getClass();
                            qwa.a(th4);
                        }
                        int iV4 = az1.v(ctd.a);
                        if (iV4 != 0) {
                            if (iV4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new k5a(ul9VarB, strP2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5a)) {
            return false;
        }
        k5a k5aVar = (k5a) obj;
        return fni.a(this.c, k5aVar.c) && fni.a(this.d, k5aVar.d);
    }

    public final int hashCode() {
        ul9 ul9Var = this.c;
        int iHashCode = (ul9Var == null ? 0 : ul9Var.hashCode()) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(reactionInfo=" + this.c + ", error=" + this.d + ")";
    }
}
