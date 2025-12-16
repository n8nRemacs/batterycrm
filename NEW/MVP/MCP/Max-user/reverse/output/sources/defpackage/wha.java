package defpackage;

import android.content.Context;
import android.media.CamcorderProfile;
import android.media.MediaMuxer;
import androidx.media3.muxer.MuxerException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.BiPredicate;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class wha implements x5c, p20, sy2, zc3, tm6, rl3, w74, gu3, pug, c6f, ey1, p9a {
    public static qgb A0;
    public static wha b;
    public final /* synthetic */ int a;
    public static final wha c = new wha(1);
    public static final wha d = new wha(3);
    public static final yt0 o = new yt0(new rt0(new qt0(-1302641957, -1722072357, 1717256923), new st0(new tt0(697119692, 9253836), new ut0(1032664012, 9253836), new vt0(1384985548, 9253836)), new wt0(-9810433, 704643071, -9810433, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -3158065, -2133864497, 536870911, -13028803, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-13487043, -13487043, -13487043}, new int[]{-13487043, -13487043}), new zt0(-13028803, -1191182337, -1685946, -36771, -1543503873, -1543503873, -2130706433, -520093697, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new au0(-14078413, 352321535, 1728053247, -1), new bu0(new cu0(-1, -520093697, -1, -520093697), -8362241, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -520093697, -2130706433));
    public static final yt0 X = new yt0(new rt0(new qt0(-1721086465, -1721086465, 1718242815), new st0(new tt0(704643071, 16777215), new ut0(1032664012, 9253836), new vt0(1384985548, 9253836)), new wt0(-1, 704643071, -9810433, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -7523380, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-1741997, -7523380, -13022491}, new int[]{-13022491, -7523380}), new zt0(-10469159, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new au0(-10469159, 452984831, -2046820353, -1), new bu0(new cu0(-9810433, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final th3 Y = new th3(new hg3(new gg3(-48049, -1579033, -9810433, -5058310), new ig3(-1, 1895825407, -9810433)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -15725039, -15725039, 1032871917, 1032871917, 1032871917, -12634336, -12634336, 4142880, -14796993, -14796993, 1980223), new lg3(721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -2405632, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -7523380, 724959367, 1305464783, -1, -10669092, 721429580, 1305464783, -1), new og3(new mg3(452984831, new int[]{16777215, 285212671, 553648127}), new ng3(452984831, new int[]{16777215, 285212671, 553648127}), new qg3(new pg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new sg3(new rg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433})), new tg3(new int[]{-1556990915, -533580739, -533580739}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831, 872415231, 452984831), -9810433, 1932407608, -1305266074, -869058458, -13420442, -15263716, -1, 536870911, 402653183, -9810433, -1559491570, -871625714, -1727263730, 1301964543, -9810433, -12171706, -15725039, new int[]{-1305266074, -1305266074}, new int[]{-13420442, -13420442}, new int[]{-650954650, -1305266074, -1942800282}, new int[]{-15725039, -15725039}), new vh3(-9810433, -520093697, -3259817, -2130706433, -9810433, -855638017), new bi3(new ci3(855638016, 637534208), new di3(687865856), new ei3(687865856)), new ji3(new hi3(new gi3(new fi3(-12641537), 536870911), new ii3(-1721086465, 184549375, 1728053247)), new ki3(new li3(1207959551, -1721086465)), new mi3(new ni3(1207959551, 2063597567, 1207959551, -1548240711, -1721086465))), new oi3(new pi3(536870911, 268435455), -855638017, 1882734149), new qi3(-855638017, -855638017, -15987698, -3259817, -520093697, 1895825407, 1207959551, -9810433));
    public static final wcg Z = new wcg(new tcg(new ucg(-1, 352321535, -9810433, -14672348), new vcg(1728053247, 184549375, -1721086465)), new xcg(new ycg(-15921907, 352321535, -855638017, -11513776, 1895825407, -8618884, -9810433), new zcg(-1559425779, 2063597567, 1207959551, 184549375, -1548109383, -1548109383, -1548109383, -1548109383, -1721086465)), new adg(new bdg(new cdg(536870911, 268435455))), new ddg(new edg(-15921907, -855638017, 1895825407, -9810433), new fdg(-1559425779, 2063597567, -1548109383, -1548109383, -1721086465)));
    public static final r6i s0 = new r6i(new q6i(-15198184, -14672348, 401074151, -14672348), new s6i(-855638017, 1895825407, -8618884, -9810433, 1895825407), new t6i(266856423, 15198183, -9810433), new u6i(-1579033, -9810433, 1474815975, -1, -1108875289, -2130706433, -2130706433, -9810433));
    public static final wha t0 = new wha(4);
    public static final wha u0 = new wha(5);
    public static final wha v0 = new wha(6);
    public static final /* synthetic */ wha w0 = new wha(7);
    public static final /* synthetic */ wha x0 = new wha(8);
    public static final wha y0 = new wha(9);
    public static final wha z0 = new wha(10);
    public static final wha B0 = new wha(11);
    public static final wha C0 = new wha(12);

    public /* synthetic */ wha(int i) {
        this.a = i;
    }

    public static final o98 d(DataInputStream dataInputStream) throws IOException {
        Object utf;
        o98 o98VarD = ve3.d();
        while (dataInputStream.read() == 3) {
            long j = dataInputStream.readLong();
            String utf2 = dataInputStream.readUTF();
            long j2 = dataInputStream.readLong();
            String utf3 = dataInputStream.readUTF();
            nn8 nn8Var = new nn8();
            int i = dataInputStream.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                String utf4 = dataInputStream.readUTF();
                int i3 = dataInputStream.readInt();
                if (i3 == 1) {
                    utf = dataInputStream.readUTF();
                } else if (i3 == 2) {
                    utf = Boolean.valueOf(dataInputStream.readBoolean());
                } else if (i3 == 3) {
                    utf = Long.valueOf(dataInputStream.readLong());
                } else {
                    if (i3 != 4) {
                        throw new IOException(ho7.f(i3, "Unsupported attribute value type "));
                    }
                    utf = Double.valueOf(dataInputStream.readDouble());
                }
                nn8Var.put(utf4, utf);
            }
            o98VarD.add(new kqb(j, utf2, j2, utf3, nn8Var.b()));
        }
        return ve3.a(o98VarD);
    }

    public static final void e(DataOutputStream dataOutputStream, kqb kqbVar) throws IOException {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeLong(kqbVar.a);
        dataOutputStream.writeUTF(kqbVar.b);
        dataOutputStream.writeLong(kqbVar.c);
        dataOutputStream.writeUTF(kqbVar.d);
        Map map = kqbVar.e;
        dataOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            dataOutputStream.writeUTF(str);
            if (value instanceof Boolean) {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
            } else if (value instanceof Long ? true : value instanceof Integer ? true : value instanceof Byte ? true : value instanceof Short) {
                dataOutputStream.writeInt(3);
                dataOutputStream.writeLong(((Number) value).longValue());
            } else if (value instanceof Double ? true : value instanceof Float) {
                dataOutputStream.writeInt(4);
                dataOutputStream.writeDouble(((Number) value).doubleValue());
            } else {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeUTF(value.toString());
            }
        }
    }

    public static gd1 l(String str) {
        return str.equals("action-open-call") ? bd1.a : str.equals("action-accept-call") ? wc1.a : str.equals("action-finished-call") ? zc1.a : str.equals("action-decline-call") ? yc1.a : str.equals("action-open-incoming") ? cd1.a : str.equals("action-join-link") ? ad1.a : str.equals("action-microphone-state") ? xc1.a : str.equals("action-rate-call") ? dd1.a : str.equals("action-unknown-call") ? ed1.a : fd1.a;
    }

    public static synchronized wha n() {
        try {
            if (b == null) {
                b = new wha(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(defpackage.ib5 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wha.o(ib5, android.text.Editable, int, int, boolean):boolean");
    }

    public static wha q(Map map, BiPredicate biPredicate) {
        return new wha(21);
    }

    public static String s(lha lhaVar) {
        if (lhaVar.equals(hha.b)) {
            return "disabled";
        }
        if (lhaVar instanceof jha) {
            jha jhaVar = (jha) lhaVar;
            long j = jhaVar.b;
            y65 y65Var = y65.MINUTES;
            return ho7.g("schedule,", (int) n7j.e(s65.m(j, y65Var), -2147483648L, 2147483647L), (int) n7j.e(s65.m(jhaVar.c, y65Var), -2147483648L, 2147483647L), ",");
        }
        if (lhaVar.equals(kha.b)) {
            return "system";
        }
        if (lhaVar.equals(iha.b)) {
            return "enabled";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.zc3
    public l0g A(tm9 tm9Var) {
        int iM;
        boolean zL = tm9Var.l();
        hd5 hd5Var = hd5.a;
        if (!zL) {
            return new jx3(hd5Var);
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
            return new jx3(hd5Var);
        }
        List listC = hd5Var;
        for (int i = 0; i < iM; i++) {
            String strP = null;
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
            }
            if (strP != null) {
                if (strP.equals("contacts")) {
                    try {
                        listC = sz.c(tm9Var);
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
                        listC = hd5Var;
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
        return new jx3(listC);
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Y;
    }

    @Override // defpackage.p9a
    public zjd a(int i) {
        if (i == 2) {
            return mk6.Y;
        }
        if (i == 1) {
            return mk6.Z;
        }
        t76 t76Var = wg7.b;
        return zjd.o;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 9:
                int i = kdd.g;
                wqi.e("kdd", "Can't add to recents", (Throwable) obj);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        p2h p2hVar;
        g35 g35Var = (g35) obj;
        z25 z25Var = g35Var.a;
        y25 y25Var = new y25(z25Var.a, z25Var.b);
        String str = g35Var.b;
        long j = g35Var.c;
        wvg wvgVar = g35Var.d;
        u10 u10Var = g35Var.e;
        if (u10Var == null) {
            p2hVar = null;
        } else {
            u10 u10Var2 = new u10(2);
            u10Var2.c = u10Var.c;
            u10Var2.b = u10Var.b;
            u10Var2.a = u10Var.a;
            u10Var2.d = u10Var.d;
            p2hVar = new p2h(u10Var2);
        }
        return new e35(y25Var, str, j, wvgVar, p2hVar);
    }

    @Override // defpackage.p9a
    public s9a b(String str) throws MuxerException {
        try {
            return new mk6(new MediaMuxer(str, 0));
        } catch (IOException e) {
            throw new MuxerException("Error creating muxer", e);
        }
    }

    @Override // defpackage.ey1
    public CamcorderProfile c(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    public void f(le5 le5Var) {
        le5Var.b(w6j.class, xxi.a);
        le5Var.b(abj.class, z3j.a);
        le5Var.b(x6j.class, zxi.a);
        le5Var.b(a7j.class, dyi.a);
        le5Var.b(y6j.class, byi.a);
        le5Var.b(z6j.class, eyi.a);
        le5Var.b(am3.class, fvi.a);
        le5Var.b(d5j.class, evi.a);
        le5Var.b(c6j.class, bxi.a);
        le5Var.b(z18.class, d3j.a);
        le5Var.b(c5j.class, cvi.a);
        le5Var.b(b5j.class, avi.a);
        le5Var.b(q8j.class, z0j.a);
        le5Var.b(acj.class, nwi.a);
        le5Var.b(y5j.class, twi.a);
        le5Var.b(v5j.class, lwi.a);
        le5Var.b(s8j.class, a1j.a);
        le5Var.b(iaj.class, a3j.a);
        le5Var.b(jaj.class, b3j.a);
        le5Var.b(haj.class, z2j.a);
        le5Var.b(h7j.class, vyi.a);
        le5Var.b(sbj.class, oti.a);
        le5Var.b(i7j.class, xyi.a);
        le5Var.b(e9j.class, l1j.a);
        le5Var.b(h9j.class, q1j.a);
        le5Var.b(g9j.class, p1j.a);
        le5Var.b(f9j.class, n1j.a);
        le5Var.b(q9j.class, i2j.a);
        le5Var.b(mee.class, j2j.a);
        le5Var.b(s9j.class, l2j.a);
        le5Var.b(r9j.class, k2j.a);
        le5Var.b(d7j.class, tyi.a);
        le5Var.b(t9j.class, m2j.a);
        le5Var.b(u9j.class, n2j.a);
        le5Var.b(v9j.class, o2j.a);
        le5Var.b(w9j.class, p2j.a);
        le5Var.b(caj.class, s2j.a);
        le5Var.b(baj.class, t2j.a);
        le5Var.b(p9j.class, x1j.a);
        le5Var.b(g6j.class, lxi.a);
        le5Var.b(n9j.class, g2j.a);
        le5Var.b(m9j.class, y1j.a);
        le5Var.b(o9j.class, h2j.a);
        le5Var.b(kaj.class, c3j.a);
        le5Var.b(ebj.class, f4j.a);
        le5Var.b(s4j.class, eui.a);
        le5Var.b(q4j.class, tti.a);
        le5Var.b(p4j.class, rti.a);
        le5Var.b(r4j.class, cui.a);
        le5Var.b(u4j.class, iui.a);
        le5Var.b(t4j.class, gui.a);
        le5Var.b(ve3.class, kui.a);
        le5Var.b(zob.class, mui.a);
        le5Var.b(v4j.class, oui.a);
        le5Var.b(w4j.class, qui.a);
        le5Var.b(x4j.class, sui.a);
        le5Var.b(zpi.class, hti.a);
        le5Var.b(cqi.class, lti.a);
        le5Var.b(bqi.class, jti.a);
        le5Var.b(e6j.class, hxi.a);
        le5Var.b(e5j.class, hvi.a);
        le5Var.b(rmi.class, gqi.a);
        le5Var.b(pmi.class, iqi.a);
        le5Var.b(t5j.class, hwi.a);
        le5Var.b(vmi.class, kqi.a);
        le5Var.b(tmi.class, mqi.a);
        le5Var.b(coi.class, hri.a);
        le5Var.b(aoi.class, jri.a);
        le5Var.b(dni.class, oqi.a);
        le5Var.b(ani.class, qqi.a);
        le5Var.b(ooi.class, asi.a);
        le5Var.b(moi.class, csi.a);
        le5Var.b(woi.class, isi.a);
        le5Var.b(uoi.class, ksi.a);
        le5Var.b(xpi.class, dti.a);
        le5Var.b(vpi.class, fti.a);
        le5Var.b(api.class, msi.a);
        le5Var.b(yoi.class, osi.a);
        le5Var.b(epi.class, qsi.a);
        le5Var.b(cpi.class, rsi.a);
        le5Var.b(mbj.class, m3j.a);
        le5Var.b(fbj.class, jvi.a);
        le5Var.b(jbj.class, ryi.a);
        le5Var.b(ibj.class, qyi.a);
        le5Var.b(gbj.class, pwi.a);
        le5Var.b(lbj.class, f3j.a);
        le5Var.b(kbj.class, e3j.a);
        le5Var.b(nbj.class, n3j.a);
        le5Var.b(hbj.class, dxi.a);
        le5Var.b(qbj.class, h4j.a);
        le5Var.b(pbj.class, i4j.a);
        le5Var.b(obj.class, g4j.a);
        le5Var.b(maj.class, p3j.a);
        le5Var.b(d6j.class, fxi.a);
        le5Var.b(h6j.class, nxi.a);
        le5Var.b(k4j.class, pti.a);
        le5Var.b(z5j.class, vwi.a);
        le5Var.b(f6j.class, jxi.a);
        le5Var.b(u5j.class, jwi.a);
        le5Var.b(g5j.class, nvi.a);
        le5Var.b(h5j.class, pvi.a);
        le5Var.b(f5j.class, lvi.a);
        le5Var.b(i5j.class, rvi.a);
        le5Var.b(c7j.class, oyi.a);
        le5Var.b(b7j.class, myi.a);
        le5Var.b(nmi.class, eqi.a);
        le5Var.b(bbj.class, c4j.a);
        le5Var.b(dbj.class, e4j.a);
        le5Var.b(cbj.class, d4j.a);
        le5Var.b(j4j.class, nti.a);
        le5Var.b(a5j.class, yui.a);
        le5Var.b(z4j.class, wui.a);
        le5Var.b(y4j.class, uui.a);
        le5Var.b(l8j.class, u0j.a);
        le5Var.b(o8j.class, x0j.a);
        le5Var.b(n8j.class, w0j.a);
        le5Var.b(yni.class, dri.a);
        le5Var.b(wni.class, fri.a);
        le5Var.b(t8j.class, c1j.a);
        le5Var.b(a9j.class, g1j.a);
        le5Var.b(u8j.class, d1j.a);
        le5Var.b(v8j.class, e1j.a);
        le5Var.b(goi.class, lri.a);
        le5Var.b(eoi.class, nri.a);
        le5Var.b(qaj.class, u3j.a);
        le5Var.b(paj.class, t3j.a);
        le5Var.b(f4f.class, a4j.a);
        le5Var.b(g4f.class, b4j.a);
        le5Var.b(i9j.class, r1j.a);
        le5Var.b(l9j.class, w1j.a);
        le5Var.b(j9j.class, t1j.a);
        le5Var.b(k9j.class, v1j.a);
        le5Var.b(b6j.class, zwi.a);
        le5Var.b(soi.class, esi.a);
        le5Var.b(qoi.class, gsi.a);
        le5Var.b(a6j.class, xwi.a);
        le5Var.b(w5j.class, rwi.a);
        le5Var.b(b9j.class, h1j.a);
        le5Var.b(d9j.class, k1j.a);
        le5Var.b(c9j.class, i1j.a);
        le5Var.b(koi.class, pri.a);
        le5Var.b(ioi.class, rri.a);
        le5Var.b(b8j.class, zzi.a);
        le5Var.b(c8j.class, b0j.a);
        le5Var.b(d8j.class, c0j.a);
        le5Var.b(lni.class, vqi.a);
        le5Var.b(jni.class, xqi.a);
        le5Var.b(x7j.class, tzi.a);
        le5Var.b(y7j.class, vzi.a);
        le5Var.b(z7j.class, xzi.a);
        le5Var.b(hni.class, sqi.a);
        le5Var.b(fni.class, uqi.a);
        le5Var.b(e8j.class, e0j.a);
        le5Var.b(f8j.class, f0j.a);
        le5Var.b(g8j.class, g0j.a);
        le5Var.b(h8j.class, p0j.a);
        le5Var.b(uni.class, zqi.a);
        le5Var.b(sni.class, bri.a);
        le5Var.b(oaj.class, q3j.a);
        le5Var.b(naj.class, r3j.a);
        le5Var.b(i6j.class, pxi.a);
        le5Var.b(k6j.class, txi.a);
        le5Var.b(j6j.class, rxi.a);
        le5Var.b(l6j.class, vxi.a);
        le5Var.b(daj.class, u2j.a);
        le5Var.b(vb3.class, v2j.a);
        le5Var.b(j8.class, xsi.a);
        le5Var.b(kpi.class, ysi.a);
        le5Var.b(raj.class, v3j.a);
        le5Var.b(gke.class, q2j.a);
        le5Var.b(x9j.class, r2j.a);
        le5Var.b(ipi.class, tsi.a);
        le5Var.b(gpi.class, vsi.a);
        le5Var.b(qg9.class, s3j.a);
        le5Var.b(w7j.class, bzi.a);
        le5Var.b(v7j.class, rzi.a);
        le5Var.b(s7j.class, lzi.a);
        le5Var.b(o7j.class, jzi.a);
        le5Var.b(t7j.class, nzi.a);
        le5Var.b(u7j.class, pzi.a);
        le5Var.b(n7j.class, hzi.a);
        le5Var.b(k7j.class, zyi.a);
        le5Var.b(m7j.class, fzi.a);
        le5Var.b(l7j.class, dzi.a);
        le5Var.b(j8j.class, s0j.a);
        le5Var.b(l5j.class, xvi.a);
        le5Var.b(i8j.class, q0j.a);
        le5Var.b(k8j.class, t0j.a);
        le5Var.b(k5j.class, vvi.a);
        le5Var.b(s5j.class, zvi.a);
        le5Var.b(laj.class, o3j.a);
        le5Var.b(eaj.class, w2j.a);
        le5Var.b(zaj.class, y3j.a);
        le5Var.b(gaj.class, y2j.a);
        le5Var.b(faj.class, x2j.a);
        le5Var.b(saj.class, w3j.a);
        le5Var.b(ppi.class, ati.a);
        le5Var.b(npi.class, bti.a);
        le5Var.b(taj.class, x3j.a);
        le5Var.b(j5j.class, tvi.a);
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

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return taj.b((Executor) v6dVar.f(new fsc(nq0.class, Executor.class)));
    }

    @Override // defpackage.sy2
    public r6i k() {
        return s0;
    }

    public qgb m(Context context) {
        if (A0 == null) {
            synchronized (this) {
                if (A0 == null) {
                    A0 = new qgb(context);
                }
            }
        }
        return A0;
    }

    @Override // defpackage.ey1
    public boolean p(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return X;
    }

    @Override // defpackage.sy2
    public wcg u() {
        return Z;
    }

    public wha(og4 og4Var) {
        this.a = 17;
    }
}
