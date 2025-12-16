package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class h5j {
    public static final int a(ree reeVar, ree[] reeVarArr) {
        int iHashCode = (reeVar.a().hashCode() * 31) + Arrays.hashCode(reeVarArr);
        int iF = reeVar.f();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i2 = iF - 1;
            int i3 = i * 31;
            String strA = reeVar.i(reeVar.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iF = i2;
        }
        int iF2 = reeVar.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iF2 - 1;
            int i5 = iHashCode3 * 31;
            s9j s9jVarE = reeVar.i(reeVar.f() - iF2).e();
            iHashCode3 = i5 + (s9jVarE != null ? s9jVarE.hashCode() : 0);
            iF2 = i4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static po3 b(tm9 tm9Var) {
        int iM;
        String strP;
        int i;
        String str;
        int iM2;
        long jL;
        fy2 fy2VarA;
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
        String str2 = null;
        if (iM == 0) {
            return null;
        }
        Map mapC = id5.a;
        String strP2 = null;
        us usVar = null;
        qxg qxgVarB = null;
        Map mapC2 = null;
        int i2 = 0;
        while (i2 < iM) {
            try {
                strP = efi.p(tm9Var, str2);
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
                strP = str2;
            }
            if (strP != null) {
                switch (strP.hashCode()) {
                    case -905826493:
                        i = iM;
                        str = str2;
                        if (!strP.equals("server")) {
                            try {
                                tm9Var.v();
                                break;
                            } catch (Throwable th3) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                Iterator it3 = vfe.a.iterator();
                                while (it3.hasNext()) {
                                    ((qwa) it3.next()).getClass();
                                    qwa.a(th3);
                                }
                                int iV3 = az1.v(ctd.a);
                                if (iV3 == 0) {
                                    break;
                                } else {
                                    if (iV3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            mapC = i5j.c(tm9Var);
                            break;
                        }
                    case 3195150:
                        i = iM;
                        if (strP.equals("hash")) {
                            str = null;
                            try {
                                strP2 = efi.p(tm9Var, null);
                                break;
                            } catch (Throwable th4) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                                Iterator it4 = vfe.a.iterator();
                                while (it4.hasNext()) {
                                    ((qwa) it4.next()).getClass();
                                    qwa.a(th4);
                                }
                                int iV4 = az1.v(ctd.a);
                                if (iV4 == 0) {
                                    strP2 = null;
                                    break;
                                } else {
                                    if (iV4 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th4;
                                }
                            }
                        }
                        str = null;
                        tm9Var.v();
                        break;
                    case 3599307:
                        i = iM;
                        if (strP.equals("user")) {
                            qxgVarB = i5j.b(tm9Var);
                            str = null;
                            break;
                        }
                        str = null;
                        tm9Var.v();
                        break;
                    case 94623771:
                        if (strP.equals("chats")) {
                            try {
                                iM2 = efi.m(tm9Var);
                            } catch (Throwable th5) {
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
                                iM2 = 0;
                            }
                            usVar = new us(iM2);
                            int i3 = 0;
                            while (i3 < iM2) {
                                int i4 = iM;
                                try {
                                    jL = efi.l(tm9Var, 0L);
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
                                    jL = 0;
                                }
                                try {
                                    fy2VarA = fy2.a(tm9Var);
                                } catch (Throwable th7) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                    Iterator it7 = vfe.a.iterator();
                                    while (it7.hasNext()) {
                                        ((qwa) it7.next()).getClass();
                                        qwa.a(th7);
                                    }
                                    int iV7 = az1.v(ctd.a);
                                    if (iV7 != 0) {
                                        if (iV7 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th7;
                                    }
                                    fy2VarA = null;
                                }
                                if (fy2VarA != null) {
                                }
                                i3++;
                                iM = i4;
                                str2 = null;
                            }
                            i = iM;
                            str = str2;
                            break;
                        }
                        i = iM;
                        str = str2;
                        tm9Var.v();
                        break;
                    case 1649517590:
                        if (strP.equals("experiments")) {
                            mapC2 = i5j.c(tm9Var);
                            i = iM;
                            str = str2;
                            break;
                        }
                        i = iM;
                        str = str2;
                        tm9Var.v();
                        break;
                    default:
                        i = iM;
                        str = str2;
                        tm9Var.v();
                        break;
                }
            } else {
                i = iM;
                str = str2;
            }
            i2++;
            str2 = str;
            iM = i;
        }
        return new po3(strP2, new nud(mapC), usVar, qxgVarB, mapC2);
    }
}
