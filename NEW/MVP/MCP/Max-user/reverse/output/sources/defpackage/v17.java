package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public final class v17 implements zc3, sy2, wzg, o44, qu6, ll6, shc, mhd {
    public static final /* synthetic */ v17 B0;
    public static final v17 b;
    public static final v17 c;
    public static final v17 d;
    public static final v17 t0;
    public static final v17 u0;
    public static Context v0;
    public static final /* synthetic */ v17 w0;
    public static final v17 y0;
    public static final v17 z0;
    public final /* synthetic */ int a;
    public static final yt0 o = new yt0(new rt0(new qt0(-1546045898, -1546045898, 1725511222), new st0(new tt0(534328886, 14235190), new ut0(1037645366, 14235190), new vt0(1037645366, 14235190)), new wt0(-2542026, 349779510, -1, -2049362378), new xt0(1306080822, 182007350, 14235190, new int[]{1306080822, -2133248458}), -2542026, 1037645366, 349779510, -1, 349779510, -4112, 349779510, -1, 349779510, 2061055542, new int[]{-1, -1, -1}, new int[]{-1, -1}), new zt0(-1, -2542026, -53188, -53188, -2542026, -1294387658, -2062807794, -1, -6718597, -6718597, -2542026, -1559491314, -1895035634, 1879837966, -1895035634), new au0(-1, 349779510, -2542026, -2542026), new bu0(new cu0(-1, -2542026, -2542026, -1), -2542026, -2542026, -2542026, -15987442, -2062807794, -2062807794, -1207169778, -2542026, 16777215, -2062807794, -1207169778, -2062807794));
    public static final yt0 X = new yt0(new rt0(new qt0(-1728006644, -1728006644, 1711322636), new st0(new tt0(536870911, 16777215), new ut0(1037645366, 14235190), new vt0(1037645366, 14235190)), new wt0(-1, 704643071, -2542026, -2049362378), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -4243649, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-4243649, -4243649, -4243649}, new int[]{-4243649, -4243649}), new zt0(-4315350, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new au0(-2542026, 452984831, -2046820353, -2542026), new bu0(new cu0(-2542026, -520093697, -1, -1), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final th3 Y = new th3(new hg3(new gg3(-53188, -15921907, -2542026, -2693121), new ig3(-15987442, -4933959, -2542026)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -2035713, -2035713, -4071950, -4071950, -4071950, 0, 0, 0, 0, 0, 0), new lg3(1033643952, 698099632, -6543440, -1543503873, 1024489791, 688945471, -15697601, -371456, 1039815936, 704271616, -371456, -16544549, 1023642843, 688098523, -16544549, -2409396, 1037777996, 702233676, -2409396, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -2542026, 1037645366, 702101046, -2542026, -9158436, 1031028956, 695484636, -9158436), new og3(new mg3(1308622847, new int[]{16777215, 1090519039, -2130706433}), new ng3(-986638, new int[]{16777215, 1090519039, -2130706433}), new qg3(new pg3(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new sg3(new rg3(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444})), new tg3(new int[]{-1543503873, -520093697, -520093697}, -4706256, -16729857, 47359, -108471, 16668745, 872415231, 452984831, -1, -2130706433), -2542026, 1543503872, -2051597284, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521486, -871625458, -1727263474, 1291877119, -2542026, -1184014, -2035713, new int[]{-2051597284, -2051597284}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-2035713, -2035713}), new vh3(-2542026, -2542026, -53188, -2062807794, -2542026, -855638017), new bi3(new ci3(251658240, 167772160), new di3(251658240), new ei3(251658240)), new ji3(new hi3(new gi3(new fi3(-3730926), 520093696), new ii3(-1713818058, 168627469, 2047675661)), new ki3(new li3(-1545253546, -1713818058)), new mi3(new ni3(-1543503873, -1191182337, -1545253546, -1552977290, -1713818058))), new oi3(new pi3(688655630, 252448014), -1, 1308622847), new qi3(-1, -15987442, -1, -53188, -15987698, -2062808050, 1712065550, -15987442));
    public static final wcg Z = new wcg(new tcg(new ucg(-15921907, 336136457, -2542026, -1), new vcg(2047675661, 168364297, -1713818058)), new xcg(new ycg(-1, 336136457, -15921907, -4407874, -11447211, -7762804, -2542026), new zcg(-1191182337, -1191182337, -1545253546, 168364297, -1552977290, -1552977290, -1552977290, -1552977290, -1713818058)), new adg(new bdg(new cdg(688655630, 252448014))), new ddg(new edg(-1, -15921907, -2062742259, -2542026), new fdg(-1543503873, -1191182337, -1552519313, -1552519313, -1713818058)));
    public static final r6i s0 = new r6i(new q6i(-592138, -1, 336136457, -1), new s6i(-15987442, -7763316, -7763316, -2542026, 1879837966), new t6i(252448014, 252448014, -2542026), new u6i(-15987442, -2542026, 1712065806, -15987442, -1207169778, -2062807794, -2062807794, -2542026));
    public static final hu5 x0 = new hu5();
    public static final ycd A0 = new ycd(7);

    static {
        byte b2 = 0;
        b = new v17(1, b2);
        c = new v17(2, b2);
        d = new v17(3, b2);
        byte b3 = 0;
        t0 = new v17(4, b3);
        u0 = new v17(5, b3);
        w0 = new v17(6, b3);
        y0 = new v17(8, b3);
        z0 = new v17(9, b3);
        B0 = new v17(12, b3);
    }

    public /* synthetic */ v17(int i, byte b2) {
        this.a = i;
    }

    public static final void a(ArrayList arrayList, f9d f9dVar) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (fni.a(((wl9) it.next()).a, f9dVar)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        wl9 wl9Var = (wl9) arrayList.get(i);
        int i2 = wl9Var.b;
        if (i2 == 1) {
            arrayList.remove(i);
        } else {
            arrayList.set(i, new wl9(wl9Var.a, i2 - 1));
        }
    }

    public static int b(ViewGroup viewGroup) {
        return kti.d((g4i.h(viewGroup, viewGroup.getRootWindowInsets()).a.f(2).d > 0 ? 68 : 76) * vw4.d().getDisplayMetrics().density);
    }

    public static d0f j(r8a r8aVar) {
        c0f c0fVar = new c0f();
        c0fVar.a = r8aVar.f;
        c0fVar.c = r8aVar.b;
        c0fVar.d = r8aVar.c;
        c0fVar.b = r8aVar.e;
        c0fVar.e = r8aVar.g;
        c0fVar.f = r8aVar.d;
        return new d0f(c0fVar);
    }

    public static v17 p(lt7[] lt7VarArr) {
        if (lt7VarArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", lt7VarArr[0].getClass().getName(), Integer.valueOf(lt7VarArr.length)));
        }
        int iC = 0;
        for (lt7 lt7Var : lt7VarArr) {
            if (lt7Var.a()) {
                iC |= lt7Var.c();
            }
        }
        return new v17(iC);
    }

    public static File v(Context context, nme nmeVar) {
        File fileW = w(context);
        nbj.b(fileW);
        return jz5.g(fileW, nmeVar.b + '_' + System.currentTimeMillis() + ".bin");
    }

    public static File w(Context context) {
        String str;
        String strB = d6j.b();
        if (strB.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false));
        }
        return new File(context.getCacheDir(), str);
    }

    public static hz4 x() throws JSONException, IOException {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("dns.google.com").appendPath("resolve");
        builderAppendPath.appendQueryParameter(SdkMetricStatEvent.NAME_KEY, "api._endpoint.ok.ru.");
        builderAppendPath.appendQueryParameter("type", String.valueOf(16));
        URLConnection uRLConnectionOpenConnection = new URL(builderAppendPath.toString()).openConnection();
        uRLConnectionOpenConnection.setConnectTimeout(3000);
        uRLConnectionOpenConnection.setReadTimeout(3000);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream(), lb2.a), 8192);
        try {
            String strT = guf.t(bufferedReader);
            bufferedReader.close();
            try {
                JSONObject jSONObject = new JSONObject(strT).getJSONArray("Answer").getJSONObject(0);
                jSONObject.getString(SdkMetricStatEvent.NAME_KEY);
                jSONObject.getInt("type");
                return new hz4(jSONObject.getInt("TTL"), jSONObject.getString("data"));
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } finally {
        }
    }

    @Override // defpackage.zc3
    public l0g A(tm9 tm9Var) {
        int iM;
        String strP;
        int iM2;
        String strP2;
        switch (this.a) {
            case 2:
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
                long jL = 0;
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
                            if (strP.equals("timestamp")) {
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
                                    jL = 0;
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
                return new s70(jL);
            default:
                if (!tm9Var.l()) {
                    return null;
                }
                try {
                    iM2 = efi.m(tm9Var);
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
                    iM2 = 0;
                }
                List listB = null;
                long jL2 = 0;
                for (int i2 = 0; i2 < iM2; i2++) {
                    try {
                        strP2 = efi.p(tm9Var, null);
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
                        strP2 = null;
                    }
                    if (strP2 != null) {
                        try {
                            if (strP2.equals("complainSync")) {
                                try {
                                    jL2 = efi.l(tm9Var, 0L);
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
                                    jL2 = 0;
                                }
                            } else if (strP2.equals("complains")) {
                                listB = vfe.b(tm9Var, hd5.a, new jx0(1, lj3.c, kj3.class, "invoke", "newInstance(Lorg/msgpack/core/MessageUnpacker;)Lru/ok/tamtam/api/commands/base/ComplainReasons;", 0, 12));
                            } else {
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
                        } catch (Throwable th11) {
                            try {
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
                    }
                }
                if (listB == null) {
                    return null;
                }
                return new qj3(jL2, listB);
        }
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Y;
    }

    @Override // defpackage.shc
    public void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r8, int r10, defpackage.ew0 r11, defpackage.vf6 r12, boolean r13, defpackage.q44 r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.dw2
            if (r0 == 0) goto L14
            r0 = r14
            dw2 r0 = (defpackage.dw2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            dw2 r0 = new dw2
            r0.<init>(r7, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.X
            int r0 = r6.Z
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            int r10 = r6.o
            boolean r13 = r6.d
            defpackage.g8j.b(r14)
            goto L63
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.g8j.b(r14)
            r14 = 0
            if (r12 == 0) goto L3d
            java.util.Set r0 = r12.a
            r2 = r0
            goto L3e
        L3d:
            r2 = r14
        L3e:
            if (r12 == 0) goto L44
            java.lang.Long r0 = r12.b
            r3 = r0
            goto L45
        L44:
            r3 = r14
        L45:
            if (r12 == 0) goto L49
            java.lang.CharSequence r14 = r12.d
        L49:
            r4 = r14
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r8)
            java.util.Set r5 = java.util.Collections.singleton(r12)
            r6.d = r13
            r6.o = r10
            r6.Z = r1
            r1 = r11
            java.lang.Object r14 = r1.a(r2, r3, r4, r5, r6)
            g84 r8 = defpackage.g84.a
            if (r14 != r8) goto L63
            return r8
        L63:
            sf6 r14 = (defpackage.sf6) r14
            ew2 r8 = new ew2
            r8.<init>(r10, r14, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v17.d(long, int, ew0, vf6, boolean, q44):java.lang.Object");
    }

    @Override // defpackage.shc
    public void e(int i, Object obj) {
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

    @Override // defpackage.sy2
    public r6i k() {
        return s0;
    }

    public saj l(hf6 hf6Var) {
        int i;
        int i2;
        String str = hf6Var.n;
        if (str != null) {
            i = 1;
            i2 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new bq(i2);
                case "application/x-icy":
                    return new cc7();
                case "application/id3":
                    return new lc7(null);
                case "application/x-emsg":
                    return new bq(i);
                case "application/x-scte35":
                    return new c8f();
            }
        }
        throw new IllegalArgumentException(wy1.h("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // defpackage.wzg
    public long n(yeb yebVar) {
        yebVar.getIcon();
        return ipi.a(-1, yebVar.getIcon().k);
    }

    @Override // defpackage.mhd
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, h6f[] h6fVarArr) {
        g6f g6fVar;
        String message;
        if (!(unsatisfiedLinkError instanceof g6f) || (unsatisfiedLinkError instanceof f6f) || (message = (g6fVar = (g6f) unsatisfiedLinkError).getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        String str = g6fVar.a;
        StringBuilder sb = new StringBuilder("Reunpacking BackupSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(str == null ? "" : ", retrying for specific library ".concat(str));
        Log.e("SoLoader", sb.toString());
        for (h6f h6fVar : h6fVarArr) {
            if (h6fVar instanceof hg0) {
                hg0 hg0Var = (hg0) h6fVar;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Runpacking BackupSoSource ");
                    hg0Var.getClass();
                    sb2.append("BackupSoSource");
                    Log.e("SoLoader", sb2.toString());
                    hg0Var.d(2);
                } catch (Exception e) {
                    StringBuilder sb3 = new StringBuilder("Encountered an exception while reunpacking BackupSoSource BackupSoSource for library ");
                    hg0Var.getClass();
                    sb3.append(str);
                    sb3.append(": ");
                    Log.e("SoLoader", sb3.toString(), e);
                    return false;
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
    public Object s(Task task) throws IOException {
        if (task.h()) {
            return (Bundle) task.f();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.e())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.e());
    }

    public wx4 t(nx4 nx4Var) {
        int i = nx4Var.a;
        brf brfVar = nx4Var.c;
        String str = nx4Var.b;
        qha qhaVar = nx4Var.h;
        s75 s75Var = new s75(i, brfVar, str, qhaVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new wx4(s75Var, nx4Var.g, new dq0(nx4Var.f, nx4Var.e, nx4Var.d), nx4Var.i, qhaVar, executorServiceNewSingleThreadExecutor);
    }

    @Override // defpackage.sy2
    public wcg u() {
        return Z;
    }

    public boolean z(hf6 hf6Var) {
        String str = hf6Var.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    public v17(int i) {
        this.a = 22;
    }
}
