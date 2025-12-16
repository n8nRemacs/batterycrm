package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* loaded from: classes.dex */
public final class v1a implements ul, zc3, sy2, tm6, weg, o44, g5a, ru6, v57, shc, mhd, fod {
    public static v1a B0;
    public final /* synthetic */ int a;
    public static final v1a b = new v1a(1);
    public static final v1a c = new v1a(2);
    public static final v1a d = new v1a(3);
    public static final yt0 o = new yt0(new rt0(new qt0(-1307228386, -1726658786, 1712670494), new st0(new tt0(688690176, 824320), new ut0(1024234496, 824320), new vt0(1376556032, 824320)), new wt0(-15952896, 704643071, -15952896, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -3158065, -2133864497, 536870911, -14800098, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-14800086, -14800098, -14669052}, new int[]{-12894370, -13487043}), new zt0(-14669047, -1191182337, -1685946, -36771, -1543503873, -1543503873, -2130706433, -520093697, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new au0(-14800100, 352321535, 1728053247, -1), new bu0(new cu0(-1, -520093697, -1, -520093697), -15952896, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -520093697, -2130706433));
    public static final yt0 X = new yt0(new rt0(new qt0(-1722117017, -1722117017, 1717212263), new st0(new tt0(704643071, 16777215), new ut0(1024234496, 824320), new vt0(1376556032, 824320)), new wt0(-1, 704643071, -15952896, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -15636943, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-16158620, -15636943, -11177963}, new int[]{-7845452, -10655003}), new zt0(-12555234, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new au0(-15952896, 452984831, -2046820353, -1), new bu0(new cu0(-15952896, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final th3 Y = new th3(new hg3(new gg3(-48049, -1579033, -15952896, -4654414), new ig3(-1, 1895825407, -15952896)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -16185336, -16185336, -14340586, -14340586, -14340586, -15258074, -15258074, 1519142, -13424114, -13424114, 3353102), new lg3(721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -2405632, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -15952896, 722244608, 1305464783, -1, -10669092, 721429580, 1305464783, -1), new og3(new mg3(452984831, new int[]{16777215, 285212671, 553648127}), new ng3(452984831, new int[]{16777215, 285212671, 553648127}), new qg3(new pg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new sg3(new rg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433})), new tg3(new int[]{-1558564070, -535153894, -535153894}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831, 872415231, 452984831), -15952896, 1932474414, -1307228386, -868332995, -12694979, -15262697, -1, 536870911, 402653183, -15952896, -1559425779, -871625458, -1727263474, 1292669952, -15952896, -12499391, -15461356, new int[]{-1307228386, -1307228386}, new int[]{-15382754, -15382754}, new int[]{-652594406, -1306905830, -1944440038}, new int[]{-16119544, -16119544}), new vh3(-15952896, -520093697, -3259817, -2130706433, -15952896, -855638017), new bi3(new ci3(855638016, 637534208), new di3(687865856), new ei3(687865856)), new ji3(new hi3(new gi3(new fi3(-16023552), 536870911), new ii3(-1727228928, 184549375, 1728053247)), new ki3(new li3(1207959551, -1727228928)), new mi3(new ni3(1207959551, 2063597567, 1207959551, -1548240457, -1727228928))), new oi3(new pi3(536870911, 268435455), -855638017, 1881359648), new qi3(-855638017, -855638017, -15987442, -3259817, -520093697, 1895825407, 1207959551, -15952896));
    public static final wcg Z = new wcg(new tcg(new ucg(-1, 352321535, -15952896, -15262695), new vcg(1728053247, 184549375, -1727228928)), new xcg(new ycg(-15921907, 352321535, -855638017, -11579312, 1895825407, -8815492, -15952896), new zcg(-1559425779, 2063597567, 1207959551, 184549375, -1548240711, -1548240711, -1548240711, -1548240711, -1727228928)), new adg(new bdg(new cdg(536870911, 268435455))), new ddg(new edg(-15921907, -855638017, 1895825407, -15952896), new fdg(-1559425779, 2063597567, -1548240711, -1548240711, -1727228928)));
    public static final r6i s0 = new r6i(new q6i(-15198184, -15262695, 401074151, -15262695), new s6i(-855638017, 1895825407, -8815492, -15952896, 1895825407), new t6i(266856423, 15198183, -15952896), new u6i(-1579033, -15952896, 1474815975, -1, -1108875289, -2130706433, -2130706433, -15952896));
    public static final v1a t0 = new v1a(4);
    public static final v1a u0 = new v1a(5);
    public static final v1a v0 = new v1a(6);
    public static final v1a w0 = new v1a(7);
    public static final v1a x0 = new v1a(8);
    public static final v1a y0 = new v1a(10);
    public static final v1a z0 = new v1a(11);
    public static final /* synthetic */ v1a A0 = new v1a(12);

    public /* synthetic */ v1a(int i) {
        this.a = i;
    }

    public static v1a C() {
        if (B0 == null) {
            B0 = new v1a(29);
        }
        return B0;
    }

    public static List D(List list, List list2) {
        if (list.isEmpty()) {
            return ue3.X(list2, s55.b);
        }
        if (list2.isEmpty()) {
            return list;
        }
        o98 o98VarD = ve3.d();
        o98VarD.addAll(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            E(o98VarD, (y55) it.next());
        }
        if (o98VarD.getSize() > 15) {
            j7d j7dVar = k7d.a;
            n08 n08Var = new n08();
            int i = 0;
            while (o98VarD.getSize() > 14) {
                i += ((y55) o98VarD.a(n08Var.nextInt(o98VarD.getSize()))).c;
            }
            E(o98VarD, new y55("unknown", "max_size_exceeded", i));
        }
        return ve3.a(o98VarD);
    }

    public static void E(o98 o98Var, y55 y55Var) {
        int i;
        int size = o98Var.getSize();
        ve3.n(o98Var.getSize(), size);
        int i2 = size - 1;
        int i3 = 0;
        while (true) {
            if (i3 > i2) {
                i = -(i3 + 1);
                break;
            }
            i = (i3 + i2) >>> 1;
            y55 y55Var2 = (y55) o98Var.get(i);
            String str = y55Var.a;
            String str2 = y55Var.b;
            int iCompareTo = y55Var2.a.compareTo(str);
            if (iCompareTo == 0 && (iCompareTo = y55Var2.b.compareTo(str2)) == 0) {
                iCompareTo = 0;
            }
            if (iCompareTo >= 0) {
                if (iCompareTo <= 0) {
                    break;
                } else {
                    i2 = i - 1;
                }
            } else {
                i3 = i + 1;
            }
        }
        if (i < 0) {
            o98Var.add((-i) - 1, y55Var);
        } else {
            y55 y55Var3 = (y55) o98Var.get(i);
            o98Var.set(i, new y55(y55Var3.a, y55Var3.b, y55Var3.c + y55Var.c));
        }
    }

    public static z81 F(JSONObject jSONObject) {
        String strOptString;
        ti1 ti1VarA;
        String strOptString2 = jSONObject.optString("key");
        int i = 0;
        jSONObject.optInt("totalCount", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(CallAnalyticsApiRequest.KEY_ITEMS);
        if (jSONArrayOptJSONArray == null) {
            return new z81(strOptString2, hd5.a);
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        if (length >= 0) {
            while (true) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("participantId")) != null) {
                    try {
                        ti1VarA = ti1.a(strOptString);
                    } catch (Exception unused) {
                        ti1VarA = null;
                    }
                    if (ti1VarA != null) {
                        arrayList.add(ti1VarA);
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new z81(strOptString2, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(defpackage.g94 r14, java.util.List r15) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v1a.H(g94, java.util.List):void");
    }

    public static void I(List list) {
        List listD;
        list.size();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g94 g94Var = (g94) list.get(i);
            if (i == 0) {
                feg fegVar = feg.a;
                listD = feg.b().d();
            } else {
                listD = null;
            }
            try {
                H(g94Var, listD);
                g94Var.getClass();
                jz5.b(new File(g94Var.c));
            } catch (Throwable unused) {
                if (listD != null) {
                    feg fegVar2 = feg.a;
                    feg.b().a(listD);
                }
            }
        }
    }

    public static final void l(File... fileArr) {
        for (File file : fileArr) {
            if (file.exists()) {
                try {
                    nbj.a(file);
                } catch (IOException unused) {
                    file.toString();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.js m(java.io.File[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v1a.m(java.io.File[], int):js");
    }

    public static void n(neb nebVar, List list) {
        nebVar.j();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            meb mebVar = new meb(nebVar.getContext());
            mebVar.setTabItem((aya) obj);
            iyf iyfVarI = nebVar.i();
            iyfVarI.b = mebVar;
            kyf kyfVar = iyfVarI.d;
            if (kyfVar != null) {
                kyfVar.d();
            }
            ArrayList arrayList = nebVar.b;
            nebVar.b(iyfVarI, arrayList.size(), arrayList.isEmpty());
            i = i2;
        }
    }

    public static String v(int i) {
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(Math.abs(i));
        int length = strValueOf.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0 && (strValueOf.length() - i2) % 3 == 0) {
                sb.append(' ');
            }
            sb.append(strValueOf.charAt(i2));
        }
        return sb.toString();
    }

    @Override // defpackage.zc3
    public l0g A(tm9 tm9Var) {
        int iM;
        String strP;
        Integer numValueOf;
        String strP2;
        int iM2;
        String strP3;
        boolean zG;
        int iM3;
        String strP4;
        switch (this.a) {
            case 2:
                if (!tm9Var.l()) {
                    return null;
                }
                us usVar = new us(0);
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
                            if (strP.equals("tokenAttrs")) {
                                try {
                                    numValueOf = Integer.valueOf(efi.m(tm9Var));
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
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    int iIntValue = numValueOf.intValue();
                                    for (int i2 = 0; i2 < iIntValue; i2++) {
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
                                        if (strP2 != null) {
                                            usVar.put(strP2, iti.d(tm9Var).a);
                                        }
                                    }
                                } else {
                                    continue;
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
                return new t70(usVar);
            case 6:
                if (!tm9Var.l()) {
                    return new aw5("", null);
                }
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
                Boolean boolValueOf = null;
                String strP5 = "";
                for (int i3 = 0; i3 < iM2; i3++) {
                    try {
                        strP3 = efi.p(tm9Var, null);
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
                        strP3 = null;
                    }
                    if (strP3 != null) {
                        try {
                            if (strP3.equals(KwsFeaturesConfigProviderImpl.URL_KEY)) {
                                try {
                                    strP5 = efi.p(tm9Var, null);
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
                                    strP5 = null;
                                }
                                if (strP5 == null) {
                                    strP5 = "";
                                }
                            } else if (strP3.equals("unsafe")) {
                                try {
                                    zG = efi.g(tm9Var);
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
                                    zG = false;
                                }
                                boolValueOf = Boolean.valueOf(zG);
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
                return new aw5(strP5, boolValueOf);
            default:
                if (!tm9Var.l()) {
                    return null;
                }
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
                sz szVarE = null;
                long jL = Long.MIN_VALUE;
                for (int i4 = 0; i4 < iM3; i4++) {
                    try {
                        strP4 = efi.p(tm9Var, null);
                    } catch (Throwable th16) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th16);
                        Iterator it16 = vfe.a.iterator();
                        while (it16.hasNext()) {
                            ((qwa) it16.next()).getClass();
                            qwa.a(th16);
                        }
                        int iV16 = az1.v(ctd.a);
                        if (iV16 != 0) {
                            if (iV16 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th16;
                        }
                        strP4 = null;
                    }
                    if (strP4 != null) {
                        try {
                            if (strP4.equals(ApiProtocol.PARAM_CHAT_ID)) {
                                try {
                                    jL = efi.l(tm9Var, jL);
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
                            } else if (strP4.equals("messages")) {
                                szVarE = sz.e(tm9Var);
                            }
                        } catch (Throwable th18) {
                            try {
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
                            } catch (Throwable th19) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                                Iterator it19 = vfe.a.iterator();
                                while (it19.hasNext()) {
                                    ((qwa) it19.next()).getClass();
                                    qwa.a(th19);
                                }
                                int iV19 = az1.v(ctd.a);
                                if (iV19 != 0) {
                                    if (iV19 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th19;
                                }
                            }
                        }
                    }
                }
                if (jL == Long.MIN_VALUE || szVarE == null) {
                    return null;
                }
                return new w4a(jL, szVarE);
        }
    }

    public h5b B(View view) {
        return x(view.getContext()).j();
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Y;
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        return (j0e) ((n0g) ((m0g) qn3.h.getValue())).e.getValue();
    }

    @Override // defpackage.fod
    public void b(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // defpackage.shc
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.v57
    public wmb d() {
        return new t57(p57.n, null);
    }

    @Override // defpackage.shc
    public void e(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // defpackage.ul
    public tl f(tl tlVar, Object obj) {
        vk vkVar = (vk) obj;
        tlVar.getClass();
        return tlVar.b(vkVar.a, vkVar.b);
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

    @Override // defpackage.sy2
    public yt0 i() {
        return o;
    }

    @Override // defpackage.v57
    public wmb j(p57 p57Var, h57 h57Var) {
        return new t57(p57Var, h57Var);
    }

    @Override // defpackage.sy2
    public r6i k() {
        return s0;
    }

    public HashMap o(Object obj) throws SecurityException {
        ConcurrentHashMap concurrentHashMap = tk.a;
        Class<?> cls = obj.getClass();
        HashMap map = new HashMap();
        Map map2 = (Map) tk.a.get(cls);
        Map map3 = map2;
        if (map2 == null) {
            HashMap map4 = new HashMap();
            tk.a(cls, map4, new HashMap());
            map3 = map4;
        }
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                map.put(entry.getKey(), new oi5(obj, (Method) entry.getValue()));
            }
        }
        return map;
    }

    @Override // defpackage.g5a
    public Object p(tm9 tm9Var) {
        long jL = 0;
        try {
            jL = efi.l(tm9Var, 0L);
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
        }
        return Long.valueOf(jL);
    }

    @Override // defpackage.mhd
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, h6f[] h6fVarArr) {
        if (!(unsatisfiedLinkError instanceof g6f) || (unsatisfiedLinkError instanceof f6f)) {
            return false;
        }
        String str = ((g6f) unsatisfiedLinkError).a;
        StringBuilder sb = new StringBuilder("Reunpacking NonApk UnpackingSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(str == null ? "" : ", retrying for specific library ".concat(str));
        Log.e("SoLoader", sb.toString());
        for (h6f h6fVar : h6fVarArr) {
            if (h6fVar instanceof urg) {
                urg urgVar = (urg) h6fVar;
                if (urgVar instanceof hg0) {
                    continue;
                } else {
                    try {
                        Log.e("SoLoader", "Runpacking " + urgVar.b());
                        urgVar.d(2);
                    } catch (Exception e) {
                        Log.e("SoLoader", "Encountered an exception while reunpacking " + urgVar.b() + " for library " + str + ": ", e);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return X;
    }

    @Override // defpackage.o44
    public Object s(Task task) {
        Intent intent = (Intent) ((Bundle) task.f()).getParcelable("notification_data");
        if (intent != null) {
            return new yc3(intent);
        }
        return null;
    }

    public HashMap t(Object obj) throws SecurityException {
        ConcurrentHashMap concurrentHashMap = tk.a;
        Class<?> cls = obj.getClass();
        HashMap map = new HashMap();
        Map map2 = (Map) tk.b.get(cls);
        Map map3 = map2;
        if (map2 == null) {
            HashMap map4 = new HashMap();
            tk.a(cls, new HashMap(), map4);
            map3 = map4;
        }
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                HashSet hashSet = new HashSet();
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    hashSet.add(new di5(obj, (Method) it.next()));
                }
                map.put(entry.getKey(), hashSet);
            }
        }
        return map;
    }

    @Override // defpackage.sy2
    public wcg u() {
        return Z;
    }

    public a93 x(Context context) {
        if (a93.t0 == null) {
            synchronized (this) {
                if (a93.t0 == null) {
                    a93.t0 = new a93(context, 0);
                }
            }
        }
        return a93.t0;
    }

    public yeb y(View view) {
        return x(view.getContext()).k();
    }

    public h5b z(Context context) {
        return x(context).j();
    }
}
