package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class dcf implements zve, g5a, btd, rl3 {
    public final /* synthetic */ int a;

    public /* synthetic */ dcf(int i) {
        this.a = i;
    }

    @Override // defpackage.zve
    public x26 e(mcf mcfVar) {
        return new mwd(new ccf(mcfVar, null));
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return new tkd(v6dVar.c(mni.class));
    }

    @Override // defpackage.g5a
    public Object p(tm9 tm9Var) {
        int iM;
        String strP;
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
        Long lValueOf = null;
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
                try {
                    if (strP.equals("id")) {
                        long jL = 0;
                        try {
                            jL = efi.l(tm9Var, 0L);
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
                        lValueOf = Long.valueOf(jL);
                    } else if (strP.equals("errorCode")) {
                        try {
                            strP2 = efi.p(tm9Var, null);
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
                            strP2 = null;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable th5) {
                    try {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = vfe.a.iterator();
                        while (it5.hasNext()) {
                            ((qwa) it5.next()).getClass();
                            qwa.a(th5);
                        }
                        int iV5 = az1.v(ctd.a);
                        if (iV5 != 0) {
                            if (iV5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                        Iterator it6 = vfe.a.iterator();
                        while (it6.hasNext()) {
                            ((qwa) it6.next()).getClass();
                            qwa.a(th6);
                        }
                        int iV6 = az1.v(ctd.a);
                        if (iV6 != 0) {
                            if (iV6 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th6;
                        }
                    }
                }
            }
        }
        return new x1h(strP2, lValueOf);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
