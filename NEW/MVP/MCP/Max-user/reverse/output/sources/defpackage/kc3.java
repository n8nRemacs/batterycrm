package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.facebook.soloader.SoLoader;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class kc3 implements li, zc3, sy2, wj5, v3g, wzg, is4, w74, gu3, yw8, oca, sg8, wc {
    public final /* synthetic */ int a;
    public static final kc3 b = new kc3(1);
    public static final kc3 c = new kc3(2);
    public static final kc3 d = new kc3(3);
    public static final yt0 o = new yt0(new rt0(new qt0(-1296349121, -1715779521, 1723549759), new st0(new tt0(700139583, 12273727), new ut0(1035683903, 12273727), new vt0(1388005439, 12273727)), new wt0(-4503489, 704643071, -4503489, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -3158065, -2133864497, 536870911, -13620180, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-13620180, -13423572, -13227221}, new int[]{-13620180, -13227221}), new zt0(-13358036, -1191182337, -1685946, -36771, -1543503873, -1543503873, -2130706433, -520093697, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new au0(-13424087, 352321535, 1728053247, -1), new bu0(new cu0(-1, -520093697, -1, -520093697), -4503489, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -520093697, -2130706433));
    public static final yt0 X = new yt0(new rt0(new qt0(-1722117017, -1722117017, 1717212263), new st0(new tt0(704643071, 16777215), new ut0(1035683903, 12273727), new vt0(1388005439, 12273727)), new wt0(-1, 704643071, -4503489, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -4956323, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-3042439, -4688794, -6335406}, new int[]{-3042439, -6335406}), new zt0(-3968920, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new au0(-4503489, 452984831, -2046820353, -1), new bu0(new cu0(-4503489, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final th3 Y = new th3(new hg3(new gg3(-48049, -1579033, -4503489, -346190), new ig3(-1, 1895825407, -4503489)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -15659250, -15659250, -12572640, -12572640, -12572640, 0, 0, 0, 0, 0, 0), new lg3(721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -2405632, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -4503489, 733694015, 1305464783, -1, -10669092, 721429580, 1305464783, -1), new og3(new mg3(452984831, new int[]{16777215, 285212671, 553648127}), new ng3(452984831, new int[]{16777215, 285212671, 553648127}), new qg3(new pg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new sg3(new rg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433})), new tg3(new int[]{-1555154633, -531744457, -531744457}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831, 872415231, 452984831), -4503489, 1933061934, -1302705849, -867549635, -11911619, -14936297, -1, 536870911, 402653183, -4503489, -1559425779, -871625458, -1727263474, -12242393, -4503489, -12172991, -15659250, new int[]{-1302705849, -1302705849}, new int[]{-13620180, -13620180}, new int[]{-642037697, -1296349121, -1933883329}, new int[]{-15659250, -15659250}), new vh3(-4503489, -520093697, -3259817, -2130706433, -4503489, -855638017), new bi3(new ci3(855638016, 637534208), new di3(687865856), new ei3(687865856)), new ji3(new hi3(new gi3(new fi3(-4508373), 536870911), new ii3(-1715779521, 184549375, 1728053247)), new ki3(new li3(1207959551, -1715779521)), new mi3(new ni3(1207959551, 2063597567, 1207959551, -1548109897, -1715779521))), new oi3(new pi3(536870911, 268435455), -855638017, 1882734149), new qi3(-855638017, -855638017, -15987442, -3259817, -520093697, 1895825407, 1207959551, -4503489));
    public static final wcg Z = new wcg(new tcg(new ucg(-1, 352321535, -4503489, -14409954), new vcg(1728053247, 184549375, -1715779521)), new xcg(new ycg(-15921907, 352321535, -855638017, -11579312, 1895825407, -8815492, -4503489), new zcg(-1559425779, 2063597567, 1207959551, 184549375, -1548240711, -1548240711, -1548240711, -1548240711, -1715779521)), new adg(new bdg(new cdg(536870911, 268435455))), new ddg(new edg(-15921907, -855638017, 1895825407, -4503489), new fdg(-1559425779, 2063597567, -1548240711, -1548240711, -1715779521)));
    public static final r6i s0 = new r6i(new q6i(-15198184, -14409954, 401074151, -14409954), new s6i(-855638017, 1895825407, -8815492, -4503489, 1895825407), new t6i(266856423, 15198183, -4503489), new u6i(-1579033, -4503489, 1474815975, -1, -1108875289, -2130706433, -2130706433, -4503489));
    public static final /* synthetic */ kc3 t0 = new kc3(4);
    public static final gf1 u0 = new gf1(24);
    public static final kc3 v0 = new kc3(5);
    public static final kc3 w0 = new kc3(6);
    public static final kc3 x0 = new kc3(7);
    public static final kc3 y0 = new kc3(8);
    public static final kc3 z0 = new kc3(9);
    public static final kc3 A0 = new kc3(10);
    public static final kc3 B0 = new kc3(11);
    public static final kc3 C0 = new kc3(12);

    public /* synthetic */ kc3(int i) {
        this.a = i;
    }

    public static bnd s(byte[] bArr, ua9 ua9Var, int i) {
        if ((i & 1) != 0) {
            ua9Var = null;
        }
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = yxg.a;
        if ((j | j2) < 0 || j > length2 || length2 - j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new bnd(bArr, ua9Var, length);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final l0g v(tm9 tm9Var) {
        int iM;
        String strP;
        long j;
        int i;
        int iM2;
        String strO;
        int i2;
        int iM3;
        long jL;
        c8c c8cVarA;
        int iM4;
        long jL2;
        List listE;
        long jNanoTime = System.nanoTime();
        if (!tm9Var.l()) {
            return new gh8();
        }
        int i3 = 1;
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
            return new gh8();
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        String str = null;
        List listB = hd5.a;
        List listC = listB;
        long jL3 = 0;
        long jL4 = 0;
        long jL5 = 0;
        String strP2 = null;
        po3 po3VarB = null;
        o35 o35Var = null;
        wac wacVarC = null;
        int i4 = 0;
        boolean zBooleanValue = false;
        while (i4 < iM) {
            try {
                strP = efi.p(tm9Var, str);
            } catch (Throwable th2) {
                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = vfe.a.iterator();
                while (it2.hasNext()) {
                    ((qwa) it2.next()).getClass();
                    qwa.a(th2);
                }
                int iV2 = az1.v(ctd.a);
                if (iV2 != 0) {
                    if (iV2 != i3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = str;
            }
            if (strP != null) {
                switch (strP.hashCode()) {
                    case -1900708191:
                        j = j2;
                        if (strP.equals("videoChatHistory")) {
                            Boolean boolValueOf = Boolean.FALSE;
                            try {
                                boolValueOf = Boolean.valueOf(efi.g(tm9Var));
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
                            i = 1;
                            zBooleanValue = boolValueOf.booleanValue();
                            break;
                        }
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
                        i = 1;
                        break;
                    case -1849019982:
                        if (strP.equals("chatMarker")) {
                            j = 0;
                            try {
                                jL4 = efi.l(tm9Var, 0L);
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
                                jL4 = 0;
                            }
                            i = 1;
                            break;
                        }
                        j = 0;
                        tm9Var.v();
                        i = 1;
                    case -1354792126:
                        if (strP.equals("config")) {
                            po3VarB = h5j.b(tm9Var);
                            i = 1;
                            j = 0;
                            break;
                        }
                        j = 0;
                        tm9Var.v();
                        i = 1;
                        break;
                    case -1323779342:
                        if (strP.equals("drafts")) {
                            try {
                                iM2 = efi.m(tm9Var);
                            } catch (Throwable th6) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                Iterator it6 = vfe.a.iterator();
                                while (it6.hasNext()) {
                                    ((qwa) it6.next()).getClass();
                                    qwa.a(th6);
                                }
                                int iV6 = az1.v(ctd.a);
                                if (iV6 != 0) {
                                    if (iV6 != i3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th6;
                                }
                                iM2 = 0;
                            }
                            if (iM2 == 0) {
                                o35Var = null;
                            } else {
                                int i5 = 0;
                                d35 d35VarB = null;
                                d35 d35VarB2 = null;
                                while (i5 < iM2) {
                                    try {
                                        strO = efi.o(tm9Var);
                                    } catch (Throwable th7) {
                                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                        Iterator it7 = vfe.a.iterator();
                                        while (it7.hasNext()) {
                                            ((qwa) it7.next()).getClass();
                                            qwa.a(th7);
                                        }
                                        int iV7 = az1.v(ctd.a);
                                        if (iV7 != 0) {
                                            if (iV7 != i3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th7;
                                        }
                                        strO = null;
                                    }
                                    if (strO != null) {
                                        if (strO.equals("chats")) {
                                            try {
                                                d35VarB = o9j.b(tm9Var);
                                            } catch (Throwable th8) {
                                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                                Iterator it8 = vfe.a.iterator();
                                                while (it8.hasNext()) {
                                                    ((qwa) it8.next()).getClass();
                                                    qwa.a(th8);
                                                }
                                                int iV8 = az1.v(ctd.a);
                                                if (iV8 != 0) {
                                                    if (iV8 != i3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th8;
                                                }
                                                d35VarB = null;
                                            }
                                        } else if (strO.equals("users")) {
                                            try {
                                                d35VarB2 = o9j.b(tm9Var);
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
                                                d35VarB2 = null;
                                            }
                                        } else {
                                            i2 = iM2;
                                            try {
                                                tm9Var.v();
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
                                            }
                                        }
                                        i2 = iM2;
                                    } else {
                                        i2 = iM2;
                                    }
                                    i5++;
                                    iM2 = i2;
                                    i3 = 1;
                                }
                                o35Var = new o35(d35VarB, d35VarB2);
                            }
                            i = 1;
                            j = 0;
                            break;
                        }
                        j = 0;
                        tm9Var.v();
                        i = 1;
                        break;
                    case -1276666629:
                        if (strP.equals("presence")) {
                            try {
                                iM3 = efi.m(tm9Var);
                            } catch (Throwable th11) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                                Iterator it11 = vfe.a.iterator();
                                while (it11.hasNext()) {
                                    ((qwa) it11.next()).getClass();
                                    qwa.a(th11);
                                }
                                int iV11 = az1.v(ctd.a);
                                if (iV11 != 0) {
                                    if (iV11 != i3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th11;
                                }
                                iM3 = 0;
                            }
                            for (int i6 = 0; i6 < iM3; i6++) {
                                try {
                                    jL = efi.l(tm9Var, 0L);
                                } catch (Throwable th12) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                                    Iterator it12 = vfe.a.iterator();
                                    while (it12.hasNext()) {
                                        ((qwa) it12.next()).getClass();
                                        qwa.a(th12);
                                    }
                                    int iV12 = az1.v(ctd.a);
                                    if (iV12 != 0) {
                                        if (iV12 != i3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th12;
                                    }
                                    jL = 0;
                                }
                                Long lValueOf = Long.valueOf(jL);
                                try {
                                    c8cVarA = c8c.a(tm9Var);
                                } catch (Throwable th13) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                    Iterator it13 = vfe.a.iterator();
                                    while (it13.hasNext()) {
                                        ((qwa) it13.next()).getClass();
                                        qwa.a(th13);
                                    }
                                    int iV13 = az1.v(ctd.a);
                                    if (iV13 != 0) {
                                        if (iV13 != i3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th13;
                                    }
                                    c8cVarA = null;
                                }
                                map.put(lValueOf, c8cVarA);
                            }
                            i = i3;
                            j = 0;
                            break;
                        }
                        j = 0;
                        tm9Var.v();
                        i = 1;
                        break;
                    case -567451565:
                        if (strP.equals("contacts")) {
                            try {
                                listC = sz.c(tm9Var);
                            } catch (Throwable th14) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                                Iterator it14 = vfe.a.iterator();
                                while (it14.hasNext()) {
                                    ((qwa) it14.next()).getClass();
                                    qwa.a(th14);
                                }
                                int iV14 = az1.v(ctd.a);
                                if (iV14 != 0) {
                                    if (iV14 != i3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th14;
                                }
                                listC = listC;
                            }
                            i = i3;
                            j = 0;
                            break;
                        }
                        j = 0;
                        tm9Var.v();
                        i = 1;
                        break;
                    case -462094004:
                        if (strP.equals("messages")) {
                            try {
                                iM4 = efi.m(tm9Var);
                            } catch (Throwable th15) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                                Iterator it15 = vfe.a.iterator();
                                while (it15.hasNext()) {
                                    ((qwa) it15.next()).getClass();
                                    qwa.a(th15);
                                }
                                int iV15 = az1.v(ctd.a);
                                if (iV15 != 0) {
                                    if (iV15 != i3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th15;
                                }
                                iM4 = 0;
                            }
                            int i7 = 0;
                            while (i7 < iM4) {
                                try {
                                    jL2 = efi.l(tm9Var, j2);
                                } catch (Throwable th16) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th16);
                                    Iterator it16 = vfe.a.iterator();
                                    while (it16.hasNext()) {
                                        ((qwa) it16.next()).getClass();
                                        qwa.a(th16);
                                    }
                                    int iV16 = az1.v(ctd.a);
                                    if (iV16 != 0) {
                                        if (iV16 != i3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th16;
                                    }
                                    jL2 = 0;
                                }
                                Long lValueOf2 = Long.valueOf(jL2);
                                try {
                                    listE = sz.e(tm9Var);
                                } catch (Throwable th17) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                    Iterator it17 = vfe.a.iterator();
                                    while (it17.hasNext()) {
                                        ((qwa) it17.next()).getClass();
                                        qwa.a(th17);
                                    }
                                    int iV17 = az1.v(ctd.a);
                                    if (iV17 != 0) {
                                        if (iV17 != i3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th17;
                                    }
                                    listE = listC;
                                }
                                map2.put(lValueOf2, listE);
                                i7++;
                                j2 = 0;
                            }
                            j = j2;
                            i = i3;
                            break;
                        }
                        j = j2;
                        tm9Var.v();
                        i = 1;
                        break;
                    case -309425751:
                        if (strP.equals("profile")) {
                            try {
                                wacVarC = f6j.c(tm9Var);
                            } catch (Throwable th18) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th18);
                                Iterator it18 = vfe.a.iterator();
                                while (it18.hasNext()) {
                                    ((qwa) it18.next()).getClass();
                                    qwa.a(th18);
                                }
                                int iV18 = az1.v(ctd.a);
                                if (iV18 != 0) {
                                    if (iV18 != i3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th18;
                                }
                                wacVarC = null;
                            }
                            j = j2;
                            i = i3;
                            break;
                        }
                        j = j2;
                        tm9Var.v();
                        i = 1;
                        break;
                    case 3560141:
                        if (strP.equals("time")) {
                            try {
                                jL3 = efi.l(tm9Var, j2);
                            } catch (Throwable th19) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                                Iterator it19 = vfe.a.iterator();
                                while (it19.hasNext()) {
                                    ((qwa) it19.next()).getClass();
                                    qwa.a(th19);
                                }
                                int iV19 = az1.v(ctd.a);
                                if (iV19 != 0) {
                                    if (iV19 != i3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th19;
                                }
                                jL3 = j2;
                            }
                            j = j2;
                            i = i3;
                            break;
                        }
                        j = j2;
                        tm9Var.v();
                        i = 1;
                        break;
                    case 94425557:
                        if (strP.equals("calls")) {
                            int iF = efi.f(tm9Var);
                            for (int i8 = 0; i8 < iF; i8++) {
                                arrayList.add(h1h.a(tm9Var));
                            }
                            j = j2;
                            i = i3;
                            break;
                        }
                        j = j2;
                        tm9Var.v();
                        i = 1;
                        break;
                    case 94623771:
                        if (strP.equals("chats")) {
                            try {
                                listB = sz.b(tm9Var);
                            } catch (Throwable th20) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th20);
                                Iterator it20 = vfe.a.iterator();
                                while (it20.hasNext()) {
                                    ((qwa) it20.next()).getClass();
                                    qwa.a(th20);
                                }
                                int iV20 = az1.v(ctd.a);
                                if (iV20 != 0) {
                                    if (iV20 != i3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th20;
                                }
                                listB = listC;
                            }
                            j = j2;
                            i = i3;
                            break;
                        }
                        j = j2;
                        tm9Var.v();
                        i = 1;
                        break;
                    case 110541305:
                        if (strP.equals(ApiProtocol.KEY_TOKEN)) {
                            try {
                                strP2 = efi.p(tm9Var, null);
                            } catch (Throwable th21) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                                Iterator it21 = vfe.a.iterator();
                                while (it21.hasNext()) {
                                    ((qwa) it21.next()).getClass();
                                    qwa.a(th21);
                                }
                                int iV21 = az1.v(ctd.a);
                                if (iV21 != 0) {
                                    if (iV21 != i3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th21;
                                }
                                strP2 = null;
                            }
                            j = j2;
                            i = i3;
                            break;
                        }
                        j = j2;
                        tm9Var.v();
                        i = 1;
                        break;
                    case 1097076194:
                        if (strP.equals("resetAt")) {
                            try {
                                jL5 = efi.l(tm9Var, j2);
                            } catch (Throwable th22) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th22);
                                Iterator it22 = vfe.a.iterator();
                                while (it22.hasNext()) {
                                    ((qwa) it22.next()).getClass();
                                    qwa.a(th22);
                                }
                                int iV22 = az1.v(ctd.a);
                                if (iV22 != 0) {
                                    if (iV22 != i3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th22;
                                }
                                jL5 = j2;
                            }
                            j = j2;
                            i = i3;
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
                j = j2;
                i = i3;
            }
            i4++;
            i3 = i;
            j2 = j;
            str = null;
        }
        return new gh8(wacVarC, listB, listC, map, strP2, jL3, po3VarB, map2, jL4, arrayList, zBooleanValue, jL5, o35Var, jNanoTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03d8 A[Catch: all -> 0x020b, LOOP:14: B:277:0x03d2->B:279:0x03d8, LOOP_END, TryCatch #8 {all -> 0x020b, blocks: (B:142:0x01ef, B:143:0x01f4, B:216:0x02f7, B:217:0x0300, B:219:0x0306, B:220:0x0313, B:224:0x031e, B:225:0x0323, B:226:0x0324, B:145:0x01f9, B:148:0x0203, B:151:0x020e, B:154:0x0218, B:182:0x0277, B:183:0x0280, B:185:0x0286, B:186:0x0293, B:190:0x029e, B:191:0x02a3, B:192:0x02a4, B:193:0x02a5, B:210:0x02e3, B:199:0x02b5, B:200:0x02be, B:202:0x02c4, B:203:0x02d1, B:207:0x02dc, B:208:0x02e1, B:209:0x02e2, B:211:0x02e9, B:227:0x0325, B:276:0x03c9, B:277:0x03d2, B:279:0x03d8, B:280:0x03e5, B:284:0x03f0, B:285:0x03f5, B:286:0x03f6, B:155:0x021a, B:173:0x025a, B:175:0x0262, B:177:0x0268, B:178:0x026b, B:180:0x0271, B:160:0x022a, B:161:0x0233, B:163:0x0239, B:166:0x0248, B:169:0x0252, B:170:0x0257, B:171:0x0258, B:157:0x0224, B:196:0x02af, B:213:0x02f1), top: B:430:0x01ef, outer: #18, inners: #2, #13, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x03ed A[SYNTHETIC] */
    @Override // defpackage.zc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.l0g A(defpackage.tm9 r20) {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc3.A(tm9):l0g");
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Y;
    }

    @Override // defpackage.is4
    public boolean a(SSLSocket sSLSocket) {
        return dnf.r(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        t8j.a(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // defpackage.yw8
    public MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.oca
    public boolean c(String str) {
        return SoLoader.m(0, str);
    }

    @Override // defpackage.sg8
    public Object d(Object obj, String str) {
        return (fni.a(str, SdkMetricStatEvent.VALUE_KEY) && zdi.a.a()) ? "*****" : lcj.B0.d(obj, str);
    }

    @Override // defpackage.yw8
    public boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.li
    public String f() {
        throw new UnsupportedOperationException("noop supplier");
    }

    @Override // defpackage.sy2
    public int g(int i) {
        r6i r6iVar = s0;
        t6i t6iVar = r6iVar.c;
        q6i q6iVar = r6iVar.a;
        s6i s6iVar = r6iVar.b;
        u6i u6iVar = r6iVar.d;
        wcg wcgVar = Z;
        adg adgVar = wcgVar.c;
        tcg tcgVar = wcgVar.a;
        ddg ddgVar = wcgVar.d;
        xcg xcgVar = wcgVar.b;
        th3 th3Var = Y;
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
        return "RSASSA-PSS";
    }

    @Override // defpackage.sy2
    public yt0 i() {
        return o;
    }

    @Override // defpackage.li
    public void j(cm6 cm6Var) {
    }

    @Override // defpackage.sy2
    public r6i k() {
        return s0;
    }

    @Override // defpackage.is4
    public i6f l(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new ee(superclass);
    }

    @Override // defpackage.v3g
    public int m(int i, CharSequence charSequence) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            char c2 = 2;
            if (i2 >= i) {
                return z ? 1 : 2;
            }
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            w3g w3gVar = y3g.a;
            if (directionality == 0) {
                c2 = 1;
            } else if (directionality == 1 || directionality == 2) {
                c2 = 0;
            }
            if (c2 == 0) {
                return 0;
            }
            if (c2 == 1) {
                z = true;
            }
            i2++;
        }
    }

    @Override // defpackage.wzg
    public long n(yeb yebVar) {
        yebVar.getIcon();
        return ipi.a(-1, yebVar.getIcon().k);
    }

    @Override // defpackage.yw8
    public boolean o(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.yw8
    public int p() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.yw8
    public boolean q() {
        return false;
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return X;
    }

    public AudioTrack t(x50 x50Var, k20 k20Var, int i, Context context) {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = x50Var.b;
        int i4 = x50Var.c;
        int i5 = x50Var.a;
        String str = zxg.a;
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(x50Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) k20Var.b().b).setAudioFormat(new AudioFormat.Builder().setSampleRate(i3).setChannelMask(i4).setEncoding(i5).build()).setTransferMode(1).setBufferSizeInBytes(x50Var.f).setSessionId(i);
        if (i2 >= 29) {
            sessionId.setOffloadedPlayback(x50Var.e);
        }
        if (i2 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }

    @Override // defpackage.sy2
    public wcg u() {
        return Z;
    }
}
