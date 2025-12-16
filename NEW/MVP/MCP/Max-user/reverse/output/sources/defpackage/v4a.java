package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class v4a extends l0g {
    public final fh9 c;

    public v4a(fh9 fh9Var) {
        this.c = fh9Var;
    }

    public static final v4a e(tm9 tm9Var) {
        String strP;
        if (!tm9Var.l()) {
            return null;
        }
        int iU0 = tm9Var.u0();
        fh9 fh9VarA = null;
        for (int i = 0; i < iU0; i++) {
            try {
                strP = efi.p(tm9Var, null);
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
                strP = null;
            }
            if (strP != null) {
                if (strP.equals("message")) {
                    fh9VarA = ovi.a(tm9Var);
                } else {
                    tm9Var.v();
                }
            }
        }
        return new v4a(fh9VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4a) && fni.a(this.c, ((v4a) obj).c);
    }

    public final int hashCode() {
        fh9 fh9Var = this.c;
        if (fh9Var == null) {
            return 0;
        }
        return fh9Var.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(message=" + this.c + ")";
    }
}
