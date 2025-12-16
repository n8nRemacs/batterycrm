package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class x4a extends l0g {
    public Long X;
    public ArrayList c;
    public ul9 d;
    public sl9 o;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        int iF;
        if (str != null) {
            Long lValueOf = null;
            sl9 sl9VarC = null;
            switch (str.hashCode()) {
                case -1716357513:
                    if (str.equals("reactionInfo")) {
                        this.d = iwi.b(tm9Var);
                        return;
                    }
                    break;
                case -1370485892:
                    if (str.equals("yourReaction")) {
                        try {
                            sl9VarC = gwi.c(tm9Var);
                        } catch (Throwable th) {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                            Iterator it = vfe.a.iterator();
                            while (it.hasNext()) {
                                ((qwa) it.next()).getClass();
                                qwa.a(th);
                            }
                            int iV = az1.v(ctd.a);
                            if (iV != 0) {
                                if (iV == 1) {
                                    throw th;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        this.o = sl9VarC;
                        return;
                    }
                    break;
                case -1122997398:
                    if (str.equals("reactions")) {
                        try {
                            iF = efi.f(tm9Var);
                        } catch (Throwable th2) {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                            Iterator it2 = vfe.a.iterator();
                            while (it2.hasNext()) {
                                ((qwa) it2.next()).getClass();
                                qwa.a(th2);
                            }
                            int iV2 = az1.v(ctd.a);
                            if (iV2 != 0) {
                                if (iV2 == 1) {
                                    throw th2;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            iF = 0;
                        }
                        if (iF == 0) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < iF; i++) {
                            arrayList.add(gwi.c(tm9Var));
                        }
                        this.c = arrayList;
                        return;
                    }
                    break;
                case -1081306054:
                    if (str.equals("marker")) {
                        try {
                            lValueOf = Long.valueOf(efi.l(tm9Var, 0L));
                        } catch (Throwable th3) {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                            Iterator it3 = vfe.a.iterator();
                            while (it3.hasNext()) {
                                ((qwa) it3.next()).getClass();
                                qwa.a(th3);
                            }
                            int iV3 = az1.v(ctd.a);
                            if (iV3 != 0) {
                                if (iV3 == 1) {
                                    throw th3;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        this.X = lValueOf;
                        return;
                    }
                    break;
            }
        }
        tm9Var.v();
    }

    @Override // defpackage.pj0
    public final String toString() {
        ArrayList arrayList = this.c;
        return "MsgGetDetailedReactionsCmd, reactions = " + (arrayList != null ? ue3.N(arrayList, null, null, null, new wm7(27), 31) : null) + " + " + this.d + " + " + this.o + " + " + this.X;
    }
}
