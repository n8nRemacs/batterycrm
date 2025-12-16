package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.api.SessionSendLimitException;
import ru.ok.tamtam.api.UnknownOpcodeException;

/* loaded from: classes2.dex */
public class whe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zhe b;

    public /* synthetic */ whe(zhe zheVar, int i) {
        this.a = i;
        this.b = zheVar;
    }

    public boolean a(slb slbVar) {
        zhe zheVar = this.b;
        if (zheVar.c.get() != 2 && !zhe.b(zheVar, slbVar, fh8.class)) {
            return false;
        }
        slbVar.b.c.e(new pzf("session.state", "session is in logged in state or login already in progress", null));
        return true;
    }

    public void b() {
        boolean z;
        rlb rlbVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zhe zheVar = this.b;
        int size = zheVar.x.size();
        int i = 1;
        boolean z2 = zheVar.C > 0 && zheVar.n();
        if (z2 && !zheVar.D && zheVar.C < size) {
            wqi.o(zheVar.a, null, "amount of send_tasks=%d has exceeded the specified limit=%d", Arrays.copyOf(new Object[]{Integer.valueOf(size), Integer.valueOf(zheVar.C)}, 2));
            zheVar.u(new SessionSendLimitException(zheVar.C, size), false);
            zheVar.D = true;
        }
        if (z2) {
            wqi.c(this.b.a, "!==! invalidate start time for cmds, tasks=%d, limit=%d", Integer.valueOf(this.b.x.size()), Integer.valueOf(this.b.C));
        }
        synchronized (this.b.y) {
            try {
                if (this.b.x.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.b.x.iterator();
                    while (it.hasNext()) {
                        slb slbVar = (slb) it.next();
                        if (slbVar != null && slbVar.a == i && (rlbVar = slbVar.b) != null) {
                            if (z2) {
                                int i2 = az7.a;
                                int i3 = s65.d;
                                rlbVar.d = v9j.i(System.currentTimeMillis(), y65.MILLISECONDS);
                            } else {
                                long jG = jCurrentTimeMillis - s65.g(rlbVar.d);
                                long jD = d(slbVar);
                                if (jG > jD) {
                                    this.b.p(ag8.d, slbVar.b.c.k(), (short) 0, slbVar.b.a.P(), true, "send timeout: diff=" + jG + " requestTimeout=" + jD);
                                    slbVar.b.c.e(new hzf());
                                    this.b.o.f();
                                    arrayList.add(slbVar);
                                }
                            }
                        }
                        i = 1;
                    }
                    this.b.x.removeAll(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.b.w.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = this.b.w.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                long jD2 = d(((qlb) entry.getValue()).b);
                if (jCurrentTimeMillis - ((qlb) entry.getValue()).c > jD2 && jCurrentTimeMillis - this.b.e.get() > jD2) {
                    this.b.p(ag8.d, ((qlb) entry.getValue()).a.k(), ((Short) entry.getKey()).shortValue(), ((qlb) entry.getValue()).b.b.a.P(), false, "read timeout");
                    this.b.o.f();
                    arrayList2.add((Short) entry.getKey());
                    z = true;
                    break;
                }
            }
            hzf hzfVar = new hzf();
            if (z) {
                wqi.o(this.b.a, null, "session timeout", Arrays.copyOf(new Object[0], 0));
                Iterator it3 = this.b.w.values().iterator();
                while (it3.hasNext()) {
                    ((qlb) it3.next()).a.e(hzfVar);
                }
                this.b.w.clear();
                this.b.y(0);
                return;
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Short sh = (Short) it4.next();
                qlb qlbVar = (qlb) this.b.w.get(sh);
                if (qlbVar != null) {
                    qlbVar.a.e(hzfVar);
                    this.b.w.remove(sh);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0300 A[Catch: all -> 0x0250, TryCatch #19 {all -> 0x0250, blocks: (B:107:0x0245, B:152:0x02ea, B:154:0x0300, B:163:0x0333, B:157:0x0306, B:158:0x030a, B:159:0x0315, B:161:0x032d, B:162:0x0332, B:164:0x0349), top: B:195:0x0245, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0304 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0219 A[Catch: all -> 0x01d0, Exception -> 0x02bb, IOException -> 0x02c4, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x02c4, blocks: (B:84:0x01f1, B:85:0x01f5, B:95:0x0219), top: B:186:0x01f1 }] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whe.c():void");
    }

    public long d(slb slbVar) {
        if (slbVar.b == null) {
            return this.b.o.b().k();
        }
        qs3 qs3VarB = this.b.o.b();
        short sP = slbVar.b.a.P();
        short[] sArr = (short[]) qs3VarB.Z;
        if (Arrays.binarySearch(sArr, 0, sArr.length, sP) < 0) {
            return qs3VarB.k();
        }
        String name = qs3.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "use TYPE_MOBILE_SLOW timeout", null);
            }
        }
        return qs3VarB.j(os3.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(byte[] bArr, nlb nlbVar, ezf ezfVar) {
        String string;
        ag8 ag8Var = nlbVar.b == 1 ? ag8.Z : ag8.s0;
        if (bArr.length <= 0) {
            this.b.q(ag8Var, ezfVar.k(), nlbVar.c, nlbVar.d, false, "empty", null, nlbVar.g);
            short s = nlbVar.d;
            qha qhaVar = xhb.c;
            if (s != 20) {
                ezfVar.d(l0g.b);
                return;
            }
            this.b.w.remove(Short.valueOf(nlbVar.c));
            ezfVar.d(l0g.b);
            this.b.i(false, false);
            return;
        }
        l0g l0gVarC = l0g.c(nlbVar.d, bArr);
        boolean z = l0gVarC instanceof uie;
        if (z) {
            this.b.d = ((uie) l0gVarC).Z;
        }
        if (z && ((uie) l0gVarC).o != 1) {
            this.b.h.set(true);
        } else if (z && ((uie) l0gVarC).o == 1) {
            ezfVar.d(l0gVarC);
            this.b.f(true);
            return;
        }
        if (l0gVarC instanceof gh8) {
            this.b.y(2);
            zhe zheVar = this.b;
            if (zheVar.o()) {
                oje ojeVar = zheVar.u;
                String string2 = Integer.toString(zheVar.l);
                String str = ojeVar.c;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "onLoggedIn for sessionId=".concat(string2), null);
                    }
                }
                ojeVar.l = 2;
                ojeVar.b();
                ojeVar.h.clear();
            }
        }
        if (l0gVarC == 0) {
            UnknownOpcodeException unknownOpcodeException = new UnknownOpcodeException(nlbVar.d);
            this.b.q(ag8Var, ezfVar.k(), nlbVar.c, nlbVar.d, false, unknownOpcodeException.toString(), null, nlbVar.g);
            wqi.e(this.b.a, "unknown opcode", unknownOpcodeException);
            this.b.u(unknownOpcodeException, false);
            ezfVar.e(unknownOpcodeException.a);
            return;
        }
        if (l0gVarC instanceof xg8) {
            l5c l5cVar = (l5c) ((age) this.b.q.a.c(47));
            l5cVar.getClass();
            boolean zJ = l5cVar.j(PmsKey.f76logfull, false);
            l5c l5cVar2 = (l5c) ((age) this.b.q.a.c(47));
            l5cVar2.getClass();
            string = ((xg8) l0gVarC).a(zJ, l5cVar2.j(PmsKey.f77logsensitive, false));
        } else {
            string = l0gVarC.toString();
        }
        this.b.q(ag8Var, ezfVar.k(), nlbVar.c, nlbVar.d, false, string, null, nlbVar.g);
        ezfVar.d(l0gVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f() throws EOFException {
        int iM;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strP;
        String strP2;
        String str6;
        zhe zheVar;
        String strP3;
        tm9 tm9Var;
        boolean z2;
        pzf vzfVar;
        zhe zheVar2 = this.b;
        ConcurrentHashMap concurrentHashMap = zheVar2.w;
        String str7 = zheVar2.a;
        nlb nlbVar = new nlb(zheVar2.w());
        int i = nlbVar.g;
        byte[] bArr = new byte[i];
        int i2 = 0;
        Object[] objArr = 0;
        int i3 = 0;
        while (true) {
            int i4 = nlbVar.g;
            if (i3 >= i4) {
                byte b = nlbVar.e;
                if (b != 0) {
                    int i5 = i4 * b;
                    try {
                        byte[] bArr2 = new byte[i5];
                        q08.c().safeDecompressor().decompress(bArr, 0, i, bArr2, 0, i5);
                        bArr = bArr2;
                    } catch (Throwable th) {
                        wqi.g(str7, th, "LZ4Utils.decompress failure! packet = %s", nlbVar);
                        throw th;
                    }
                }
                byte b2 = nlbVar.b;
                if (b2 == 0) {
                    e(bArr, nlbVar, new ssb(this, nlbVar, objArr == true ? 1 : 0, 6));
                    return;
                }
                short s = nlbVar.c;
                qlb qlbVar = (qlb) concurrentHashMap.get(Short.valueOf(s));
                String str8 = null;
                if (qlbVar == null) {
                    wqi.o(str7, null, "illegal state in handleResponse, reader task is null", Arrays.copyOf(new Object[0], 0));
                    return;
                }
                ezf ezfVar = qlbVar.a;
                boolean z3 = true;
                if (b2 == 1) {
                    e(bArr, nlbVar, ezfVar);
                } else {
                    if (b2 != 3) {
                        String strF = ho7.f(b2, "illegal state in handleResponse, cmd: ");
                        IllegalStateException illegalStateException = new IllegalStateException(strF);
                        wqi.e(str7, strF, illegalStateException);
                        zheVar2.u(illegalStateException, false);
                        return;
                    }
                    tm9 tm9VarA = kl9.a(bArr);
                    if (tm9VarA.l()) {
                        try {
                            iM = efi.m(tm9VarA);
                        } catch (Throwable th2) {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                            Iterator it = vfe.a.iterator();
                            while (it.hasNext()) {
                                ((qwa) it.next()).getClass();
                                qwa.a(th2);
                            }
                            int iV = az1.v(ctd.a);
                            if (iV != 0) {
                                if (iV == 1) {
                                    throw th2;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            iM = 0;
                        }
                        String strP4 = null;
                        String str9 = null;
                        String str10 = null;
                        String strP5 = null;
                        String strP6 = null;
                        while (i2 < iM) {
                            try {
                                strP = efi.p(tm9VarA, str8);
                            } catch (Throwable th3) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                Iterator it2 = vfe.a.iterator();
                                while (it2.hasNext()) {
                                    ((qwa) it2.next()).getClass();
                                    qwa.a(th3);
                                }
                                int iV2 = az1.v(ctd.a);
                                if (iV2 != 0) {
                                    if (iV2 == z3) {
                                        throw th3;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                strP = null;
                            }
                            if (strP != null) {
                                switch (strP.hashCode()) {
                                    case -1724546052:
                                        strP2 = str9;
                                        str6 = strP6;
                                        zheVar = zheVar2;
                                        if (strP.equals("description")) {
                                            strP3 = str10;
                                            try {
                                                strP3 = efi.p(tm9VarA, strP3);
                                            } catch (Throwable th4) {
                                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                                                Iterator it3 = vfe.a.iterator();
                                                while (it3.hasNext()) {
                                                    ((qwa) it3.next()).getClass();
                                                    qwa.a(th4);
                                                }
                                                int iV3 = az1.v(ctd.a);
                                                if (iV3 != 0) {
                                                    if (iV3 == 1) {
                                                        throw th4;
                                                    }
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            }
                                            tm9Var = tm9VarA;
                                            z2 = true;
                                            strP6 = str6;
                                            break;
                                        }
                                        try {
                                            tm9VarA.v();
                                        } catch (Throwable th5) {
                                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                            Iterator it4 = vfe.a.iterator();
                                            while (it4.hasNext()) {
                                                ((qwa) it4.next()).getClass();
                                                qwa.a(th5);
                                            }
                                            int iV4 = az1.v(ctd.a);
                                            if (iV4 != 0) {
                                                if (iV4 == 1) {
                                                    throw th5;
                                                }
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        String str11 = str6;
                                        strP3 = str10;
                                        strP6 = str11;
                                        tm9Var = tm9VarA;
                                        z2 = true;
                                        break;
                                    case 96784904:
                                        strP2 = str9;
                                        str6 = strP6;
                                        zheVar = zheVar2;
                                        if (strP.equals(NegotiationErrorStat.KEY_ERROR)) {
                                            String str12 = strP4;
                                            try {
                                                strP4 = efi.p(tm9VarA, str12);
                                            } catch (Throwable th6) {
                                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                                Iterator it5 = vfe.a.iterator();
                                                while (it5.hasNext()) {
                                                    ((qwa) it5.next()).getClass();
                                                    qwa.a(th6);
                                                }
                                                int iV5 = az1.v(ctd.a);
                                                if (iV5 != 0) {
                                                    if (iV5 == 1) {
                                                        throw th6;
                                                    }
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                strP4 = str12;
                                            }
                                            strP6 = str6;
                                            strP3 = str10;
                                            tm9Var = tm9VarA;
                                            z2 = true;
                                            break;
                                        }
                                        tm9VarA.v();
                                        String str112 = str6;
                                        strP3 = str10;
                                        strP6 = str112;
                                        tm9Var = tm9VarA;
                                        z2 = true;
                                    case 110371416:
                                        strP2 = str9;
                                        str6 = strP6;
                                        zheVar = zheVar2;
                                        if (strP.equals("title")) {
                                            String str13 = strP5;
                                            try {
                                                strP5 = efi.p(tm9VarA, str13);
                                            } catch (Throwable th7) {
                                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                                Iterator it6 = vfe.a.iterator();
                                                while (it6.hasNext()) {
                                                    ((qwa) it6.next()).getClass();
                                                    qwa.a(th7);
                                                }
                                                int iV6 = az1.v(ctd.a);
                                                if (iV6 != 0) {
                                                    if (iV6 == 1) {
                                                        throw th7;
                                                    }
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                strP5 = str13;
                                            }
                                            strP6 = str6;
                                            strP3 = str10;
                                            tm9Var = tm9VarA;
                                            z2 = true;
                                            break;
                                        }
                                        tm9VarA.v();
                                        String str1122 = str6;
                                        strP3 = str10;
                                        strP6 = str1122;
                                        tm9Var = tm9VarA;
                                        z2 = true;
                                    case 954925063:
                                        str6 = strP6;
                                        if (!strP.equals("message")) {
                                            strP2 = str9;
                                            zheVar = zheVar2;
                                            tm9VarA.v();
                                            String str11222 = str6;
                                            strP3 = str10;
                                            strP6 = str11222;
                                            tm9Var = tm9VarA;
                                            z2 = true;
                                            break;
                                        } else {
                                            strP2 = str9;
                                            try {
                                                strP2 = efi.p(tm9VarA, strP2);
                                            } catch (Throwable th8) {
                                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                                Iterator it7 = vfe.a.iterator();
                                                while (it7.hasNext()) {
                                                    ((qwa) it7.next()).getClass();
                                                    qwa.a(th8);
                                                }
                                                int iV7 = az1.v(ctd.a);
                                                if (iV7 != 0) {
                                                    if (iV7 == 1) {
                                                        throw th8;
                                                    }
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            }
                                            zheVar = zheVar2;
                                            strP6 = str6;
                                            strP3 = str10;
                                            tm9Var = tm9VarA;
                                            z2 = true;
                                        }
                                    case 1122960396:
                                        if (strP.equals("localizedMessage")) {
                                            String str14 = strP6;
                                            try {
                                                strP6 = efi.p(tm9VarA, str14);
                                            } catch (Throwable th9) {
                                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                                Iterator it8 = vfe.a.iterator();
                                                while (it8.hasNext()) {
                                                    ((qwa) it8.next()).getClass();
                                                    qwa.a(th9);
                                                }
                                                int iV8 = az1.v(ctd.a);
                                                if (iV8 != 0) {
                                                    if (iV8 == z3) {
                                                        throw th9;
                                                    }
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                strP6 = str14;
                                            }
                                            strP3 = str10;
                                            tm9Var = tm9VarA;
                                            z2 = z3;
                                            strP2 = str9;
                                            zheVar = zheVar2;
                                            break;
                                        }
                                    default:
                                        strP2 = str9;
                                        str6 = strP6;
                                        zheVar = zheVar2;
                                        tm9VarA.v();
                                        String str112222 = str6;
                                        strP3 = str10;
                                        strP6 = str112222;
                                        tm9Var = tm9VarA;
                                        z2 = true;
                                        break;
                                }
                            } else {
                                strP3 = str10;
                                tm9Var = tm9VarA;
                                z2 = z3;
                                strP2 = str9;
                                zheVar = zheVar2;
                            }
                            i2++;
                            zheVar2 = zheVar;
                            str9 = strP2;
                            z3 = z2;
                            tm9VarA = tm9Var;
                            str10 = strP3;
                            str8 = null;
                        }
                        z = z3;
                        str = str9;
                        str2 = str10;
                        str3 = strP4;
                        str4 = strP5;
                        str5 = strP6;
                    } else {
                        z = true;
                        str5 = null;
                        str3 = null;
                        str = null;
                        str4 = null;
                        str2 = null;
                    }
                    zhe zheVar3 = zheVar2;
                    if (str2 == null && str4 == null) {
                        vzfVar = new pzf(str3, str, str5);
                    } else {
                        vzfVar = new vzf(str3, str, str5, str4, str2);
                    }
                    boolean z4 = z;
                    zheVar3.q(ag8.Y, ezfVar.k(), nlbVar.c, qlbVar.b.b.a.P(), false, vzfVar.toString(), vzfVar.b, bArr.length);
                    if ("proto.state".equals(vzfVar.b) && zheVar3.g()) {
                        zheVar3.i(z4, false);
                    }
                    ezfVar.e(vzfVar);
                }
                concurrentHashMap.remove(Short.valueOf(s));
                return;
            }
            int iV9 = zheVar2.v(i3, bArr, Math.min(256, i - i3));
            if (iV9 < 0) {
                throw new EOFException();
            }
            i3 += iV9;
            zheVar2.e.set(System.currentTimeMillis());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whe.run():void");
    }
}
