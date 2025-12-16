package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* loaded from: classes.dex */
public final class lcj implements zc3, wzg, sy2, j0g, m7c, sg8, tm6, hb8, cw8, ysa, wc, zve {
    public static lcj b;
    public static final os5 v0;
    public static final os5 w0;
    public final /* synthetic */ int a;
    public static final lcj c = new lcj(1);
    public static final lcj d = new lcj(2);
    public static final lcj o = new lcj(3);
    public static final yt0 X = new yt0(new rt0(new qt0(-1559261502, -1559261502, 1712295618), new st0(new tt0(521113282, 1019586), new ut0(1024429762, 1019586), new vt0(1024231611, 821435)), new wt0(-15757630, 336563906, -1, -2062577982), new xt0(1292865218, 168791746, 1019586, new int[]{1292865218, -2146464062}), -15757630, 1024429762, 336563906, -1, 336563906, -4112, 336563906, -1, 336563906, 2047839938, new int[]{-1, -1, -1}, new int[]{-1, -1}), new zt0(-1, -15757630, -1685946, -53188, -15757630, -1307603262, -2062807794, -1, -8682855, -8682855, -15757630, -1559491314, -1895035634, 1879837966, -1895035634), new au0(-1, 336563906, -15757630, -1), new bu0(new cu0(-1, -15757630, -15757630, -1), -15757630, -15757630, -15757630, -15987442, -2062807794, -2062807794, -1207169778, -15757630, 16777215, -2062807794, -1207169778, -2062807794));
    public static final yt0 Y = new yt0(new rt0(new qt0(-1728006644, -1728006644, 1711322636), new st0(new tt0(521113282, 1019586), new ut0(1024429762, 1019586), new vt0(1024231611, 821435)), new wt0(-15757630, 521113282, -1, -2062577982), new xt0(1292865218, 168791746, 1019586, new int[]{1292865218, -2146464062}), -15757630, 1544523458, 336563906, -1442305, 336563906, 336563906, 521113282, -656897, 336563906, 2047839938, new int[]{-1442305, -1442305, -1442305}, new int[]{-1442305, -1442305}), new zt0(-1442305, -15757630, -1685946, -16711919, -15757630, -15757630, -15757630, -1, -2063258820, -2063258820, -16711919, -1559942340, -1895486660, 1879386940, -1895486660), new au0(-1442305, 336563906, -15757630, -1), new bu0(new cu0(-1, -15757630, -15757630, -1), -15757630, -15757630, -16711919, -16438468, -2063258820, -2063258820, -1207620804, -15757630, 16777215, -2063258820, -1207620804, -15757630));
    public static final th3 Z = new th3(new hg3(new gg3(-53188, -15921907, -15757630, -2693121), new ig3(-15987442, -4933959, -15757630)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -6695465, -8340225, 1291877119, 1291877119, 1291877119, 0, 0, 0, 0, 0, 0), new lg3(1033643952, 698099632, -6543440, -1543503873, 1024489791, 688945471, -15697601, -371456, 1039815936, 704271616, -371456, -16544549, 1023642843, 688098523, -16544549, -2409396, 1037777996, 702233676, -2409396, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -15757630, 1024429762, 688885442, -15757630, -9158436, 1031028956, 695484636, -9158436), new og3(new mg3(1308622847, new int[]{16777215, 1090519039, -2130706433}), new ng3(-986638, new int[]{16777215, 1090519039, -2130706433}), new qg3(new pg3(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new sg3(new rg3(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444})), new tg3(new int[]{-1543503873, -520093697, -520093697}, -16751924, -16729857, 47359, -5107493, 11669723, 872415231, 452984831, -1, -2130706433), -15757630, 1543503872, -2062577982, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521486, -871625458, -1727263474, 1291877119, -15757630, -1184014, -8734748, new int[]{-2062577982, -2062577982}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-6695465, -8340225}), new vh3(-15757630, -15757630, -53188, -2062807794, -15757630, -855638017), new bi3(new ci3(251658240, 167772160), new di3(251658240), new ei3(251658240)), new ji3(new hi3(new gi3(new fi3(-16089170), 520093696), new ii3(-1727033662, 168627469, 2047675661)), new ki3(new li3(-1545253546, -1727033662)), new mi3(new ni3(-1543503873, -1191182337, -1545253546, -1552977290, -1727033662))), new oi3(new pi3(688655630, 252448014), -1, 1308622847), new qi3(-1, -15987442, -1, -53188, -15987698, -2062808050, 1712065550, -15757630));
    public static final wcg s0 = new wcg(new tcg(new ucg(-15921907, 336136457, -15757630, -1), new vcg(2047675661, 168364297, -1727033662)), new xcg(new ycg(-1, 336136457, -15921907, -4407874, -11447211, -7762804, -15757630), new zcg(-1191182337, -1191182337, -1545253546, 168364297, -1552977290, -1552977290, -1552977290, -1552977290, -1727033662)), new adg(new bdg(new cdg(688655630, 252448014))), new ddg(new edg(-1, -15921907, -2062742259, -15757630), new fdg(-1543503873, -1191182337, -1552977290, -1552977290, -1728021761)));
    public static final r6i t0 = new r6i(new q6i(-592138, -1, 336136457, -1), new s6i(-15987442, -7762804, -7762804, -15757630, 1879837966), new t6i(252448014, 252448014, -15757630), new u6i(-15987442, -15757630, 1712065806, -15987442, -1207169778, -2062807794, -2062807794, -15757630));
    public static final lcj u0 = new lcj(4);
    public static final lcj x0 = new lcj(6);
    public static final lcj y0 = new lcj(7);
    public static final lcj z0 = new lcj(8);
    public static final lcj A0 = new lcj(9);
    public static final lcj B0 = new lcj(10);
    public static final lcj C0 = new lcj(11);

    static {
        int i = 10;
        v0 = new os5(i);
        w0 = new os5(i);
    }

    public /* synthetic */ lcj(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    public static final Paint f(lcj lcjVar) {
        lcjVar.getClass();
        return (Paint) lc0.B0.getValue();
    }

    public static final ood j(ood oodVar) {
        if ((oodVar != null ? oodVar.Y : null) == null) {
            return oodVar;
        }
        nod nodVarW = oodVar.w();
        nodVarW.g = null;
        return nodVarW.a();
    }

    public static ArrayList l(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(m((zi1) entry.getKey(), (gs1) entry.getValue()));
        }
        return arrayList;
    }

    public static ixg m(zi1 zi1Var, gs1 gs1Var) {
        r5g r5gVar = new r5g(gs1Var.getName());
        mc0 mc0VarA = fui.a(gs1Var.getName(), Long.valueOf(zi1Var.a));
        String strQ = gs1Var.q();
        if (strQ == null) {
            strQ = "";
        }
        return new ixg(r5gVar, mc0VarA, strQ, zi1Var);
    }

    public static st4 o(lcj lcjVar) {
        Object next;
        Resources system = Resources.getSystem();
        lcjVar.getClass();
        int i = system.getDisplayMetrics().densityDpi;
        Iterator it = st4.t0.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            to7 to7Var = ((st4) next).a;
            if (i >= to7Var.a && i < to7Var.b) {
                break;
            }
        }
        return (st4) next;
    }

    public static boolean p(String str) {
        return (HTTP.CONN_DIRECTIVE.equalsIgnoreCase(str) || HTTP.CONN_KEEP_ALIVE.equalsIgnoreCase(str) || AUTH.PROXY_AUTH.equalsIgnoreCase(str) || AUTH.PROXY_AUTH_RESP.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HTTP.TRANSFER_ENCODING.equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static synchronized void q() {
        if (b == null) {
            b = new lcj(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zc3
    public l0g A(tm9 tm9Var) {
        int iM;
        String strP;
        int iM2;
        String strP2;
        int iF;
        int iM3;
        String strP3;
        long j;
        int i;
        Byte bH;
        int i2;
        int iM4;
        String strP4;
        switch (this.a) {
            case 1:
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
                String strP5 = null;
                String strP6 = null;
                for (int i3 = 0; i3 < iM; i3++) {
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
                            if (strP.equals("trackId")) {
                                try {
                                    strP5 = efi.p(tm9Var, null);
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
                                    strP5 = null;
                                }
                            } else if (strP.equals("email")) {
                                try {
                                    strP6 = efi.p(tm9Var, null);
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
                                    strP6 = null;
                                }
                            } else {
                                try {
                                    tm9Var.v();
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
                                }
                            }
                        } catch (Throwable th6) {
                            try {
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
                            }
                        }
                    }
                }
                if (strP5 == null || strP6 == null) {
                    return null;
                }
                return new h70(strP5, strP6);
            case 6:
                try {
                    iM2 = efi.m(tm9Var);
                } catch (Throwable th8) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                    Iterator it8 = vfe.a.iterator();
                    while (it8.hasNext()) {
                        ((qwa) it8.next()).getClass();
                        qwa.a(th8);
                    }
                    int iV8 = az1.v(ctd.a);
                    if (iV8 != 0) {
                        if (iV8 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th8;
                    }
                    iM2 = 0;
                }
                w8a w8aVar = null;
                for (int i4 = 0; i4 < iM2; i4++) {
                    try {
                        strP2 = efi.p(tm9Var, null);
                    } catch (Throwable th9) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                        Iterator it9 = vfe.a.iterator();
                        while (it9.hasNext()) {
                            ((qwa) it9.next()).getClass();
                            qwa.a(th9);
                        }
                        int iV9 = az1.v(ctd.a);
                        if (iV9 != 0) {
                            if (iV9 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th9;
                        }
                        strP2 = null;
                    }
                    if (strP2 != null) {
                        try {
                            if (strP2.equals("folders")) {
                                w8a w8aVar2 = rqa.b;
                                try {
                                    if (tm9Var.w().a() == 7) {
                                        try {
                                            iF = efi.f(tm9Var);
                                        } catch (Throwable th10) {
                                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                            Iterator it10 = vfe.a.iterator();
                                            while (it10.hasNext()) {
                                                ((qwa) it10.next()).getClass();
                                                qwa.a(th10);
                                            }
                                            int iV10 = az1.v(ctd.a);
                                            if (iV10 != 0) {
                                                if (iV10 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th10;
                                            }
                                            iF = 0;
                                        }
                                        w8a w8aVar3 = new w8a(iF);
                                        for (int i5 = 0; i5 < iF; i5++) {
                                            dh2 dh2VarA = wzi.a(tm9Var);
                                            if (dh2VarA != null) {
                                                w8aVar3.b(dh2VarA);
                                            }
                                        }
                                        w8aVar2 = w8aVar3;
                                    } else {
                                        tm9Var.v();
                                    }
                                } catch (Throwable th11) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                                    Iterator it11 = vfe.a.iterator();
                                    while (it11.hasNext()) {
                                        ((qwa) it11.next()).getClass();
                                        qwa.a(th11);
                                    }
                                    int iV11 = az1.v(ctd.a);
                                    if (iV11 != 0) {
                                        if (iV11 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th11;
                                    }
                                }
                                w8aVar = w8aVar2;
                            } else {
                                try {
                                    tm9Var.v();
                                } catch (Throwable th12) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                                    Iterator it12 = vfe.a.iterator();
                                    while (it12.hasNext()) {
                                        ((qwa) it12.next()).getClass();
                                        qwa.a(th12);
                                    }
                                    int iV12 = az1.v(ctd.a);
                                    if (iV12 != 0) {
                                        if (iV12 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th12;
                                    }
                                }
                            }
                        } catch (Throwable th13) {
                            try {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                Iterator it13 = vfe.a.iterator();
                                while (it13.hasNext()) {
                                    ((qwa) it13.next()).getClass();
                                    qwa.a(th13);
                                }
                                int iV13 = az1.v(ctd.a);
                                if (iV13 != 0) {
                                    if (iV13 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th13;
                                }
                            } catch (Throwable th14) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                                Iterator it14 = vfe.a.iterator();
                                while (it14.hasNext()) {
                                    ((qwa) it14.next()).getClass();
                                    qwa.a(th14);
                                }
                                int iV14 = az1.v(ctd.a);
                                if (iV14 != 0) {
                                    if (iV14 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th14;
                                }
                            }
                        }
                    }
                }
                if (w8aVar != null) {
                    return new ac6(w8aVar);
                }
                return null;
            case 8:
                wqi.c("NotifMsgDelayedCmd", "response", new Object[0]);
                int i6 = 1;
                try {
                    iM3 = efi.m(tm9Var);
                } catch (Throwable th15) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                    Iterator it15 = vfe.a.iterator();
                    while (it15.hasNext()) {
                        ((qwa) it15.next()).getClass();
                        qwa.a(th15);
                    }
                    int iV15 = az1.v(ctd.a);
                    if (iV15 != 0) {
                        if (iV15 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th15;
                    }
                    iM3 = 0;
                }
                String str = null;
                if (iM3 == 0) {
                    return null;
                }
                int i7 = 5;
                long j2 = 0;
                long[] jArrC = null;
                fh9 fh9VarA = null;
                int i8 = 5;
                long jL = 0;
                long jL2 = 0;
                int i9 = 0;
                while (i9 < iM3) {
                    try {
                        strP3 = efi.p(tm9Var, str);
                    } catch (Throwable th16) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th16);
                        Iterator it16 = vfe.a.iterator();
                        while (it16.hasNext()) {
                            ((qwa) it16.next()).getClass();
                            qwa.a(th16);
                        }
                        int iV16 = az1.v(ctd.a);
                        if (iV16 != 0) {
                            if (iV16 != i6) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th16;
                        }
                        strP3 = str;
                    }
                    if (strP3 != null) {
                        switch (strP3.hashCode()) {
                            case -1690743503:
                                j = j2;
                                if (strP3.equals("messageIds")) {
                                    i = 1;
                                    jArrC = vfe.c(tm9Var);
                                    break;
                                }
                                try {
                                    tm9Var.v();
                                } catch (Throwable th17) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                    Iterator it17 = vfe.a.iterator();
                                    while (it17.hasNext()) {
                                        ((qwa) it17.next()).getClass();
                                        qwa.a(th17);
                                    }
                                    int iV17 = az1.v(ctd.a);
                                    if (iV17 != 0) {
                                        if (iV17 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th17;
                                    }
                                }
                                i = 1;
                                break;
                            case -1361631597:
                                if (!strP3.equals(ApiProtocol.PARAM_CHAT_ID)) {
                                    j = 0;
                                    tm9Var.v();
                                    i = 1;
                                    break;
                                } else {
                                    j = 0;
                                    try {
                                        jL = efi.l(tm9Var, 0L);
                                    } catch (Throwable th18) {
                                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th18);
                                        Iterator it18 = vfe.a.iterator();
                                        while (it18.hasNext()) {
                                            ((qwa) it18.next()).getClass();
                                            qwa.a(th18);
                                        }
                                        int iV18 = az1.v(ctd.a);
                                        if (iV18 != 0) {
                                            if (iV18 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th18;
                                        }
                                        jL = 0;
                                    }
                                    i = 1;
                                }
                            case -907060194:
                                if (strP3.equals("updateTypeId")) {
                                    try {
                                        bH = efi.h(tm9Var);
                                    } catch (Throwable th19) {
                                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                                        Iterator it19 = vfe.a.iterator();
                                        while (it19.hasNext()) {
                                            ((qwa) it19.next()).getClass();
                                            qwa.a(th19);
                                        }
                                        int iV19 = az1.v(ctd.a);
                                        if (iV19 != 0) {
                                            if (iV19 != i6) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th19;
                                        }
                                        bH = str;
                                    }
                                    if (bH == 0) {
                                        i8 = i7;
                                    } else {
                                        int[] iArrY = az1.y(i7);
                                        int length = iArrY.length;
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 < length) {
                                                i2 = iArrY[i10];
                                                byte b2 = 1;
                                                if (i2 == 1) {
                                                    b2 = 0;
                                                } else if (i2 != 2) {
                                                    b2 = 3;
                                                    if (i2 == 3) {
                                                        b2 = 2;
                                                    } else if (i2 != 4) {
                                                        if (i2 != 5) {
                                                            throw null;
                                                        }
                                                        b2 = -128;
                                                    }
                                                }
                                                if (b2 != bH.byteValue()) {
                                                    i10++;
                                                }
                                            } else {
                                                i2 = 0;
                                            }
                                        }
                                        i8 = i2 == 0 ? 5 : i2;
                                    }
                                    j = 0;
                                    i = 1;
                                    break;
                                }
                                j = j2;
                                tm9Var.v();
                                i = 1;
                            case -836030906:
                                if (strP3.equals("userId")) {
                                    try {
                                        jL2 = efi.l(tm9Var, j2);
                                    } catch (Throwable th20) {
                                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th20);
                                        Iterator it20 = vfe.a.iterator();
                                        while (it20.hasNext()) {
                                            ((qwa) it20.next()).getClass();
                                            qwa.a(th20);
                                        }
                                        int iV20 = az1.v(ctd.a);
                                        if (iV20 != 0) {
                                            if (iV20 != i6) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th20;
                                        }
                                        jL2 = j2;
                                    }
                                    i = i6;
                                    j = j2;
                                    break;
                                }
                                j = j2;
                                tm9Var.v();
                                i = 1;
                                break;
                            case 954925063:
                                if (strP3.equals("message")) {
                                    fh9VarA = ovi.a(tm9Var);
                                    i = i6;
                                    j = j2;
                                    break;
                                }
                                j = j2;
                                tm9Var.v();
                                i = 1;
                                break;
                            default:
                                j = j2;
                                tm9Var.v();
                                i = 1;
                                break;
                        }
                    } else {
                        i = i6;
                        j = j2;
                    }
                    i9++;
                    j2 = j;
                    i6 = i;
                    str = null;
                    i7 = 5;
                }
                if (jArrC == null) {
                    jArrC = lc4.a;
                }
                return new xja(jL, jL2, i8, fh9VarA, jArrC);
            default:
                if (!tm9Var.l()) {
                    return null;
                }
                try {
                    iM4 = efi.m(tm9Var);
                } catch (Throwable th21) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                    Iterator it21 = vfe.a.iterator();
                    while (it21.hasNext()) {
                        ((qwa) it21.next()).getClass();
                        qwa.a(th21);
                    }
                    int iV21 = az1.v(ctd.a);
                    if (iV21 != 0) {
                        if (iV21 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th21;
                    }
                    iM4 = 0;
                }
                if (iM4 == 0) {
                    return null;
                }
                String strP7 = null;
                String strP8 = null;
                for (int i11 = 0; i11 < iM4; i11++) {
                    try {
                        strP4 = efi.p(tm9Var, null);
                    } catch (Throwable th22) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th22);
                        Iterator it22 = vfe.a.iterator();
                        while (it22.hasNext()) {
                            ((qwa) it22.next()).getClass();
                            qwa.a(th22);
                        }
                        int iV22 = az1.v(ctd.a);
                        if (iV22 != 0) {
                            if (iV22 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th22;
                        }
                        strP4 = null;
                    }
                    if (strP4 != null) {
                        if (strP4.equals(KwsFeaturesConfigProviderImpl.URL_KEY)) {
                            try {
                                strP7 = efi.p(tm9Var, null);
                            } catch (Throwable th23) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th23);
                                Iterator it23 = vfe.a.iterator();
                                while (it23.hasNext()) {
                                    ((qwa) it23.next()).getClass();
                                    qwa.a(th23);
                                }
                                int iV23 = az1.v(ctd.a);
                                if (iV23 != 0) {
                                    if (iV23 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th23;
                                }
                                strP7 = null;
                            }
                        } else if (strP4.equals("query_id")) {
                            try {
                                strP8 = efi.p(tm9Var, null);
                            } catch (Throwable th24) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th24);
                                Iterator it24 = vfe.a.iterator();
                                while (it24.hasNext()) {
                                    ((qwa) it24.next()).getClass();
                                    qwa.a(th24);
                                }
                                int iV24 = az1.v(ctd.a);
                                if (iV24 != 0) {
                                    if (iV24 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th24;
                                }
                                strP8 = null;
                            }
                        } else {
                            try {
                                tm9Var.v();
                            } catch (Throwable th25) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th25);
                                Iterator it25 = vfe.a.iterator();
                                while (it25.hasNext()) {
                                    ((qwa) it25.next()).getClass();
                                    qwa.a(th25);
                                }
                                int iV25 = az1.v(ctd.a);
                                if (iV25 != 0) {
                                    if (iV25 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th25;
                                }
                            }
                        }
                    }
                }
                return new zrh(strP7, strP8);
        }
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Z;
    }

    @Override // defpackage.cw8
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        return obj;
    }

    @Override // defpackage.cw8
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.j0g
    public long c(int i, long j, float f) {
        int i2;
        if (j <= 0) {
            return System.currentTimeMillis();
        }
        if (i > 10) {
            i2 = 300000;
        } else {
            wqi.c("lcj", "errorCount = %d^2 * 3 * 1000", Integer.valueOf(i));
            i2 = i * i * 3000;
        }
        return j + i2;
    }

    @Override // defpackage.ysa
    public bta call() {
        return new fta(16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0215 A[RETURN] */
    @Override // defpackage.sg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.Object r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcj.d(java.lang.Object, java.lang.String):java.lang.Object");
    }

    @Override // defpackage.zve
    public x26 e(mcf mcfVar) {
        return new m11(13, xve.a);
    }

    @Override // defpackage.sy2
    public int g(int i) {
        r6i r6iVar = t0;
        t6i t6iVar = r6iVar.c;
        q6i q6iVar = r6iVar.a;
        s6i s6iVar = r6iVar.b;
        u6i u6iVar = r6iVar.d;
        wcg wcgVar = s0;
        adg adgVar = wcgVar.c;
        tcg tcgVar = wcgVar.a;
        ddg ddgVar = wcgVar.d;
        xcg xcgVar = wcgVar.b;
        th3 th3Var = Z;
        oi3 oi3Var = th3Var.f;
        bi3 bi3Var = th3Var.d;
        vh3 vh3Var = th3Var.c;
        hg3 hg3Var = th3Var.a;
        qi3 qi3Var = th3Var.g;
        ji3 ji3Var = th3Var.e;
        kg3 kg3Var = th3Var.b;
        if (i == vuc.chat_common_action_background_error) {
            return hg3Var.a.a;
        }
        if (i == vuc.chat_common_action_background_neutral) {
            return hg3Var.a.b;
        }
        if (i == vuc.chat_common_action_background_themed) {
            return hg3Var.a.c;
        }
        if (i == vuc.chat_common_action_background_themedFade) {
            return hg3Var.a.d;
        }
        if (i == vuc.chat_common_action_icon_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_action_icon_neutral) {
            return hg3Var.b.a;
        }
        if (i == vuc.chat_common_action_icon_neutralSecondary) {
            return hg3Var.b.b;
        }
        if (i == vuc.chat_common_action_icon_themedFade) {
            return hg3Var.b.c;
        }
        if (i == vuc.chat_common_background_accent) {
            return kg3Var.e;
        }
        if (i == vuc.chat_common_background_capsule) {
            return kg3Var.f;
        }
        if (i == vuc.chat_common_background_capsuleOutside) {
            return kg3Var.g;
        }
        if (i == vuc.chat_common_background_capsuleSecondary) {
            return kg3Var.h;
        }
        if (i == vuc.chat_common_background_chatFAB) {
            return kg3Var.i;
        }
        if (i == vuc.chat_common_background_contrastFloatingSecondary) {
            return kg3Var.j;
        }
        if (i == vuc.chat_common_background_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_background_neutral) {
            return kg3Var.k;
        }
        if (i == vuc.chat_common_background_neutralFade) {
            return 1543503872;
        }
        if (i == vuc.chat_common_background_neutralFadeSecondary) {
            return kg3Var.l;
        }
        if (i == vuc.chat_common_background_neutralFadeTertiary) {
            return kg3Var.m;
        }
        if (i == vuc.chat_common_background_neutralThemed) {
            return kg3Var.n;
        }
        if (i == vuc.chat_common_background_overlay) {
            return kg3Var.o;
        }
        if (i == vuc.chat_common_background_overlayHard) {
            return kg3Var.p;
        }
        if (i == vuc.chat_common_background_overlaySecondary) {
            return kg3Var.q;
        }
        if (i == vuc.chat_common_background_pattern) {
            return kg3Var.r;
        }
        if (i == vuc.chat_common_background_searchHighlight) {
            return kg3Var.s;
        }
        if (i == vuc.chat_common_background_stickerBlank) {
            return kg3Var.t;
        }
        if (i == vuc.chat_common_background_surfaceGround) {
            return kg3Var.u;
        }
        if (i == vuc.chat_common_background_timelineActive) {
            return -1191182337;
        }
        if (i == vuc.chat_common_background_timelinePassive) {
            return 1392508927;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep1) {
            return kg3Var.a.a;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep2) {
            return kg3Var.a.b;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep3) {
            return kg3Var.a.c;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep4) {
            return kg3Var.a.d;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep5) {
            return kg3Var.a.e;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep6) {
            return kg3Var.a.f;
        }
        if (i == vuc.chat_common_background_chatBackground_backgroundStep1) {
            return kg3Var.a.g;
        }
        if (i == vuc.chat_common_background_chatBackground_backgroundStep2) {
            return kg3Var.a.h;
        }
        if (i == vuc.chat_common_background_chatBackground_patternColor) {
            return kg3Var.a.i;
        }
        if (i == vuc.chat_common_background_chatBackground_patternGradientStep1) {
            return kg3Var.a.j;
        }
        if (i == vuc.chat_common_background_chatBackground_patternGradientStep2) {
            return kg3Var.a.k;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep1) {
            return kg3Var.a.l;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep2) {
            return kg3Var.a.m;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep3) {
            return kg3Var.a.n;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep4) {
            return kg3Var.a.o;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep5) {
            return kg3Var.a.p;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep6) {
            return kg3Var.a.q;
        }
        if (i == vuc.chat_common_background_fileType_archiveBadge) {
            return -6543440;
        }
        if (i == vuc.chat_common_background_fileType_archiveBkg) {
            return kg3Var.b.a;
        }
        if (i == vuc.chat_common_background_fileType_archiveElement) {
            return kg3Var.b.b;
        }
        if (i == vuc.chat_common_background_fileType_archiveIcon) {
            return kg3Var.b.c;
        }
        if (i == vuc.chat_common_background_fileType_background) {
            return kg3Var.b.d;
        }
        if (i == vuc.chat_common_background_fileType_dataBadge) {
            return -15697601;
        }
        if (i == vuc.chat_common_background_fileType_dataBkg) {
            return kg3Var.b.e;
        }
        if (i == vuc.chat_common_background_fileType_dataElement) {
            return kg3Var.b.f;
        }
        if (i == vuc.chat_common_background_fileType_dataIcon) {
            return kg3Var.b.g;
        }
        if (i == vuc.chat_common_background_fileType_imageBadge) {
            return kg3Var.b.h;
        }
        if (i == vuc.chat_common_background_fileType_imageBkg) {
            return kg3Var.b.i;
        }
        if (i == vuc.chat_common_background_fileType_imageElement) {
            return kg3Var.b.j;
        }
        if (i == vuc.chat_common_background_fileType_imageIcon) {
            return kg3Var.b.k;
        }
        if (i == vuc.chat_common_background_fileType_musicBadge) {
            return kg3Var.b.l;
        }
        if (i == vuc.chat_common_background_fileType_musicBkg) {
            return kg3Var.b.m;
        }
        if (i == vuc.chat_common_background_fileType_musicElement) {
            return kg3Var.b.n;
        }
        if (i == vuc.chat_common_background_fileType_musicIcon) {
            return kg3Var.b.o;
        }
        if (i == vuc.chat_common_background_fileType_presentationBadge) {
            return kg3Var.b.p;
        }
        if (i == vuc.chat_common_background_fileType_presentationBkg) {
            return kg3Var.b.q;
        }
        if (i == vuc.chat_common_background_fileType_presentationElement) {
            return kg3Var.b.r;
        }
        if (i == vuc.chat_common_background_fileType_presentationIcon) {
            return kg3Var.b.s;
        }
        if (i == vuc.chat_common_background_fileType_programBadge) {
            return kg3Var.b.t;
        }
        if (i == vuc.chat_common_background_fileType_programBkg) {
            return kg3Var.b.u;
        }
        if (i == vuc.chat_common_background_fileType_programElement) {
            return kg3Var.b.v;
        }
        if (i == vuc.chat_common_background_fileType_programIcon) {
            return kg3Var.b.w;
        }
        if (i == vuc.chat_common_background_fileType_textBadge) {
            return -14983490;
        }
        if (i == vuc.chat_common_background_fileType_textBkg) {
            return kg3Var.b.x;
        }
        if (i == vuc.chat_common_background_fileType_textElement) {
            return kg3Var.b.y;
        }
        if (i == vuc.chat_common_background_fileType_textIcon) {
            return kg3Var.b.z;
        }
        if (i == vuc.chat_common_background_fileType_unknownBadge) {
            return kg3Var.b.A;
        }
        if (i == vuc.chat_common_background_fileType_unknownBkg) {
            return kg3Var.b.B;
        }
        if (i == vuc.chat_common_background_fileType_unknownElement) {
            return kg3Var.b.C;
        }
        if (i == vuc.chat_common_background_fileType_unknownIcon) {
            return kg3Var.b.D;
        }
        if (i == vuc.chat_common_background_fileType_videoBadge) {
            return kg3Var.b.E;
        }
        if (i == vuc.chat_common_background_fileType_videoBkg) {
            return kg3Var.b.F;
        }
        if (i == vuc.chat_common_background_fileType_videoElement) {
            return kg3Var.b.G;
        }
        if (i == vuc.chat_common_background_fileType_videoIcon) {
            return kg3Var.b.H;
        }
        if (i == vuc.chat_common_background_skeleton_bubbleGradientPrimary_staticBackground) {
            return kg3Var.c.a.b;
        }
        if (i == vuc.chat_common_background_skeleton_bubbleGradientSecondary_staticBackground) {
            return kg3Var.c.b.b;
        }
        if (i == vuc.chat_common_background_skeleton_stickerPrimary_baseGradient_staticBackground) {
            return kg3Var.c.c.a.b;
        }
        if (i == vuc.chat_common_background_skeleton_stickerSecondary_baseGradient_staticBackground) {
            return kg3Var.c.d.a.b;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRBackground) {
            return kg3Var.d.b;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep1) {
            return kg3Var.d.c;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep2) {
            return kg3Var.d.d;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep3) {
            return kg3Var.d.e;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep4) {
            return kg3Var.d.f;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeFadeStep1) {
            return kg3Var.d.g;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeFadeStep2) {
            return kg3Var.d.h;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeStep1) {
            return kg3Var.d.i;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeStep2) {
            return kg3Var.d.j;
        }
        if (i == vuc.chat_common_icon_accent) {
            return vh3Var.a;
        }
        if (i == vuc.chat_common_icon_accentContrast) {
            return vh3Var.b;
        }
        if (i == vuc.chat_common_icon_capsule || i == vuc.chat_common_icon_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_icon_negative) {
            return vh3Var.c;
        }
        if (i == vuc.chat_common_icon_secondary) {
            return vh3Var.d;
        }
        if (i == vuc.chat_common_icon_themed) {
            return vh3Var.e;
        }
        if (i == vuc.chat_common_icon_verificationCapsule) {
            return vh3Var.f;
        }
        if (i == vuc.chat_common_shadows_elevation2_primary) {
            return bi3Var.a.a;
        }
        if (i == vuc.chat_common_shadows_elevation2_secondary) {
            return bi3Var.a.b;
        }
        if (i == vuc.chat_common_shadows_topBar_color) {
            return bi3Var.b.a;
        }
        if (i == vuc.chat_common_shadows_writeBar_color) {
            return bi3Var.c.a;
        }
        if (i == vuc.chat_common_states_background_active_neutralFadeTertiary) {
            return ji3Var.a.a.b;
        }
        if (i == vuc.chat_common_states_background_active_action_themed) {
            return ji3Var.a.a.a.a;
        }
        if (i == vuc.chat_common_states_background_disabled_accent) {
            return ji3Var.a.b.a;
        }
        if (i == vuc.chat_common_states_background_disabled_neutralFadeSecondary) {
            return ji3Var.a.b.b;
        }
        if (i == vuc.chat_common_states_background_disabled_neutralThemed) {
            return ji3Var.a.b.c;
        }
        if (i == vuc.chat_common_states_icon_disabled_negative) {
            return ji3Var.b.a.a;
        }
        if (i == vuc.chat_common_states_icon_disabled_themed) {
            return ji3Var.b.a.b;
        }
        if (i == vuc.chat_common_states_text_disabled_contrast) {
            return ji3Var.c.a.a;
        }
        if (i == vuc.chat_common_states_text_disabled_contrastStatic) {
            return ji3Var.c.a.b;
        }
        if (i == vuc.chat_common_states_text_disabled_negative) {
            return ji3Var.c.a.c;
        }
        if (i == vuc.chat_common_states_text_disabled_primary) {
            return ji3Var.c.a.d;
        }
        if (i == vuc.chat_common_states_text_disabled_themed) {
            return ji3Var.c.a.e;
        }
        if (i == vuc.chat_common_stroke_contrast) {
            return oi3Var.b;
        }
        if (i == vuc.chat_common_stroke_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_stroke_glass) {
            return oi3Var.c;
        }
        if (i == vuc.chat_common_stroke_separator_primary) {
            return oi3Var.a.a;
        }
        if (i == vuc.chat_common_stroke_separator_secondary) {
            return oi3Var.a.b;
        }
        if (i == vuc.chat_common_text_capsule) {
            return qi3Var.a;
        }
        if (i == vuc.chat_common_text_capsuleSecondary) {
            return qi3Var.b;
        }
        if (i == vuc.chat_common_text_contrast) {
            return qi3Var.c;
        }
        if (i == vuc.chat_common_text_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_text_fileType) {
            return -520093697;
        }
        if (i == vuc.chat_common_text_negative) {
            return qi3Var.d;
        }
        if (i == vuc.chat_common_text_primary) {
            return qi3Var.e;
        }
        if (i == vuc.chat_common_text_secondary) {
            return qi3Var.f;
        }
        if (i == vuc.chat_common_text_tertiary) {
            return qi3Var.g;
        }
        if (i == vuc.chat_common_text_themed) {
            return qi3Var.h;
        }
        if (i == vuc.chat_topbar_background_default_neutral) {
            return tcgVar.a.a;
        }
        if (i == vuc.chat_topbar_background_default_neutralFade) {
            return tcgVar.a.b;
        }
        if (i == vuc.chat_topbar_background_default_primary) {
            return -855638017;
        }
        if (i == vuc.chat_topbar_background_default_themed) {
            return tcgVar.a.c;
        }
        if (i == vuc.chat_topbar_background_default_topbar) {
            return tcgVar.a.d;
        }
        if (i == vuc.chat_topbar_background_disabled_neutral) {
            return tcgVar.b.a;
        }
        if (i == vuc.chat_topbar_background_disabled_neutralFade) {
            return tcgVar.b.b;
        }
        if (i == vuc.chat_topbar_background_disabled_themed) {
            return tcgVar.b.c;
        }
        if (i == vuc.chat_topbar_icon_default_contrast) {
            return xcgVar.a.a;
        }
        if (i == vuc.chat_topbar_icon_default_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_topbar_icon_default_neutralFade) {
            return xcgVar.a.b;
        }
        if (i == vuc.chat_topbar_icon_default_primary) {
            return xcgVar.a.c;
        }
        if (i == vuc.chat_topbar_icon_default_quaternary) {
            return xcgVar.a.d;
        }
        if (i == vuc.chat_topbar_icon_default_secondary) {
            return xcgVar.a.e;
        }
        if (i == vuc.chat_topbar_icon_default_tertiary) {
            return xcgVar.a.f;
        }
        if (i == vuc.chat_topbar_icon_default_themed) {
            return xcgVar.a.g;
        }
        if (i == vuc.chat_topbar_icon_disabled_contrast) {
            return xcgVar.b.a;
        }
        if (i == vuc.chat_topbar_icon_disabled_contrastStatic) {
            return xcgVar.b.b;
        }
        if (i == vuc.chat_topbar_icon_disabled_negative) {
            return xcgVar.b.c;
        }
        if (i == vuc.chat_topbar_icon_disabled_neutralFade) {
            return xcgVar.b.d;
        }
        if (i == vuc.chat_topbar_icon_disabled_primary) {
            return xcgVar.b.e;
        }
        if (i == vuc.chat_topbar_icon_disabled_quaternary) {
            return xcgVar.b.f;
        }
        if (i == vuc.chat_topbar_icon_disabled_secondary) {
            return xcgVar.b.g;
        }
        if (i == vuc.chat_topbar_icon_disabled_tertiary) {
            return xcgVar.b.h;
        }
        if (i == vuc.chat_topbar_icon_disabled_themed) {
            return xcgVar.b.i;
        }
        if (i == vuc.chat_topbar_stroke_separator_default_primary) {
            return adgVar.a.a.a;
        }
        if (i == vuc.chat_topbar_stroke_separator_default_secondary) {
            return adgVar.a.a.b;
        }
        if (i == vuc.chat_topbar_text_default_contrast) {
            return ddgVar.a.a;
        }
        if (i == vuc.chat_topbar_text_default_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_topbar_text_default_primary) {
            return ddgVar.a.b;
        }
        if (i == vuc.chat_topbar_text_default_secondary) {
            return ddgVar.a.c;
        }
        if (i == vuc.chat_topbar_text_default_themed) {
            return ddgVar.a.d;
        }
        if (i == vuc.chat_topbar_text_disabled_contrast) {
            return ddgVar.b.a;
        }
        if (i == vuc.chat_topbar_text_disabled_contrastStatic) {
            return ddgVar.b.b;
        }
        if (i == vuc.chat_topbar_text_disabled_primary) {
            return ddgVar.b.c;
        }
        if (i == vuc.chat_topbar_text_disabled_secondary) {
            return ddgVar.b.d;
        }
        if (i == vuc.chat_topbar_text_disabled_themed) {
            return ddgVar.b.e;
        }
        if (i == vuc.chat_writebar_background_emojiArea) {
            return q6iVar.a;
        }
        if (i == vuc.chat_writebar_background_input) {
            return q6iVar.b;
        }
        if (i == vuc.chat_writebar_background_neutralFade) {
            return q6iVar.c;
        }
        if (i == vuc.chat_writebar_background_surface) {
            return q6iVar.d;
        }
        if (i == vuc.chat_writebar_icon_neutral) {
            return s6iVar.a;
        }
        if (i == vuc.chat_writebar_icon_neutralSecondary) {
            return s6iVar.b;
        }
        if (i == vuc.chat_writebar_icon_neutralTertiary) {
            return s6iVar.c;
        }
        if (i == vuc.chat_writebar_icon_themed) {
            return s6iVar.d;
        }
        if (i == vuc.chat_writebar_icon_verificationReplyTo) {
            return s6iVar.e;
        }
        if (i == vuc.chat_writebar_stroke_areaSeparator) {
            return t6iVar.a;
        }
        if (i == vuc.chat_writebar_stroke_input) {
            return t6iVar.b;
        }
        if (i == vuc.chat_writebar_stroke_themed) {
            return t6iVar.c;
        }
        if (i == vuc.chat_writebar_text_input) {
            return u6iVar.a;
        }
        if (i == vuc.chat_writebar_text_inputMDLink) {
            return u6iVar.b;
        }
        if (i == vuc.chat_writebar_text_inputPlaceholder) {
            return u6iVar.c;
        }
        if (i == vuc.chat_writebar_text_primary) {
            return u6iVar.d;
        }
        if (i == vuc.chat_writebar_text_replyMessage) {
            return u6iVar.e;
        }
        if (i == vuc.chat_writebar_text_replyTo) {
            return u6iVar.f;
        }
        if (i == vuc.chat_writebar_text_secondary) {
            return u6iVar.g;
        }
        if (i == vuc.chat_writebar_text_themed) {
            return u6iVar.h;
        }
        throw new IllegalArgumentException(ho7.f(i, "Unknown attr res passed "));
    }

    @Override // defpackage.wc
    public String get(int i) {
        if (i == 256) {
            return "SHA256withRSA/PSS";
        }
        if (i == 384) {
            return "SHA384withRSA/PSS";
        }
        if (i == 512) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException(ho7.f(i, "Unsupported hash length: "));
    }

    @Override // defpackage.sy2
    public yt0 i() {
        return X;
    }

    @Override // defpackage.sy2
    public r6i k() {
        return t0;
    }

    @Override // defpackage.wzg
    public long n(yeb yebVar) {
        yebVar.a();
        return ipi.a(-1, yebVar.a().G().c.a);
    }

    @Override // defpackage.cw8
    public boolean next() {
        return false;
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return Y;
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return d1g.a(((Number) obj).intValue());
    }

    public String toString() {
        switch (this.a) {
            case 20:
                return "IdentityFunction";
            case 29:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.sy2
    public wcg u() {
        return s0;
    }
}
