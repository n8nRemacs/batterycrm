package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.WindowInsetsAnimation;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ssb implements rn6, ou1, vta, ezf, bs8, lsf {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ssb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public acf A(v4i v4iVar) {
        acf acfVar;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                Object acfVar2 = linkedHashMap.get(v4iVar);
                if (acfVar2 == null) {
                    acfVar2 = new acf(v4iVar);
                    linkedHashMap.put(v4iVar, acfVar2);
                }
                acfVar = (acf) acfVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return acfVar;
    }

    public void B(String str, hie hieVar, xwg xwgVar, ob0 ob0Var, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (linkedHashMap.containsKey(str)) {
            vwg vwgVar = new vwg(hieVar, xwgVar, ob0Var, list);
            vwg vwgVar2 = (vwg) linkedHashMap.get(str);
            vwgVar.e = vwgVar2.e;
            vwgVar.f = vwgVar2.f;
            linkedHashMap.put(str, vwgVar);
        }
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 1:
                ((tu1) this.b).b((q32) this.c);
                break;
            default:
                ((bs8) this.c).a(obj);
                break;
        }
    }

    @Override // defpackage.vta
    public void b() {
        switch (this.a) {
            case 5:
                ((pac) ((sac) this.b)).D(null);
                break;
            default:
                ((bs8) this.c).b();
                break;
        }
    }

    @Override // defpackage.vta
    public void c(py4 py4Var) {
        switch (this.a) {
            case 5:
                AtomicReference atomicReference = (AtomicReference) this.c;
                while (!atomicReference.compareAndSet(null, py4Var)) {
                    if (atomicReference.get() != null) {
                        py4Var.dispose();
                        break;
                    }
                }
                break;
            default:
                ty4.d((qu1) this.b, py4Var);
                break;
        }
    }

    @Override // defpackage.ezf
    public void d(l0g l0gVar) {
        mdd mddVar;
        int iIndexOf;
        int iIndexOf2;
        short s = ((nlb) this.b).d;
        qha qhaVar = xhb.c;
        if (s == 1) {
            qja qjaVar = ((whe) this.c).b.v;
            qjaVar.getClass();
            wqi.c("NotifListenerImpl", "onPing", new Object[0]);
            u0g u0gVar = qjaVar.l;
            if (u0gVar != null) {
                ((w0g) u0gVar.v0.getValue()).e();
            }
            zhe zheVar = ((whe) this.c).b;
            nlb nlbVar = (nlb) this.b;
            zhe.c(zheVar, new nlb((byte) 1, nlbVar.c, nlbVar.d, nlb.h, 0));
            return;
        }
        int i = 5;
        if (s == 2) {
            qja qjaVar2 = ((whe) this.c).b.v;
            qjaVar2.getClass();
            qjaVar2.b(new es9(qjaVar2, i, (pg4) l0gVar));
            return;
        }
        int i2 = 20;
        if (s == 20) {
            qja qjaVar3 = ((whe) this.c).b.v;
            qjaVar3.getClass();
            wqi.c("NotifListenerImpl", "onLogout", new Object[0]);
            u0g u0gVar2 = qjaVar3.l;
            if (u0gVar2 != null) {
                ((ExecutorService) u0gVar2.w0.getValue()).execute(new gq5(28, qjaVar3));
                return;
            }
            return;
        }
        int i3 = 19;
        int i4 = 3;
        if (s == 3) {
            boolean z = l0gVar == l0g.b;
            qja qjaVar4 = ((whe) this.c).b.v;
            if (z) {
                mddVar = new mdd();
                mddVar.d = true;
            } else {
                mddVar = (mdd) l0gVar;
            }
            qjaVar4.getClass();
            l6b l6bVar = wqi.a;
            String strSubstring = null;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "NotifListenerImpl", wy1.i("onReconnect: host=", (l8g.c(mddVar.c) || (iIndexOf2 = mddVar.c.indexOf(":")) <= 0) ? null : mddVar.c.substring(0, iIndexOf2), " port=", mddVar.e()), null);
                }
            }
            if (mddVar.c.length() > 0) {
                pe8 pe8Var = ((z7c) qjaVar4.a.getValue()).a;
                if (!l8g.c(mddVar.c) && (iIndexOf = mddVar.c.indexOf(":")) > 0) {
                    strSubstring = mddVar.c.substring(0, iIndexOf);
                }
                fde fdeVar = pe8Var.q0;
                yy7[] yy7VarArr = pe8.U0;
                fdeVar.O(pe8Var, yy7VarArr[3], strSubstring);
                ((z7c) qjaVar4.a.getValue()).a.R(mddVar.e());
                pe8 pe8Var2 = ((z7c) qjaVar4.a.getValue()).a;
                pe8Var2.s0.O(pe8Var2, yy7VarArr[5], Boolean.valueOf(mddVar.d));
            }
            u0g u0gVar3 = qjaVar4.l;
            if (u0gVar3 != null) {
                wqi.c(u0g.z0, "restart", new Object[0]);
                zhe zheVar2 = (zhe) ((w0g) u0gVar3.v0.getValue()).X.get();
                if (zheVar2 != null) {
                    zheVar2.z(false);
                }
                ((ExecutorService) u0gVar3.x0.getValue()).execute(new bee(i3, u0gVar3));
                return;
            }
            return;
        }
        xhb xhbVar = xhb.e2;
        int i5 = 15;
        if (s == xhbVar.a) {
            k4e k4eVar = ((whe) this.c).b.p;
            k4eVar.getClass();
            if (((pe8) ((pb3) k4eVar.a.c(46))).P()) {
                return;
            }
            uja ujaVar = (uja) l0gVar;
            zhe zheVar3 = ((whe) this.c).b;
            zf8 zf8Var = new zf8(xhbVar, i5);
            zf8Var.t(ujaVar.c, ApiProtocol.PARAM_CHAT_ID);
            fh9 fh9Var = ujaVar.o;
            zf8Var.t(fh9Var.a, "messageId");
            if (fh9Var.t0 == sm9.GROUP) {
                zf8Var.x("chatType", "GROUP_CHAT");
            }
            zhe.c(zheVar3, nlb.a(zf8Var, (byte) 1, ((nlb) this.b).c));
            qja qjaVar5 = ((whe) this.c).b.v;
            qjaVar5.getClass();
            qjaVar5.b(new es9(qjaVar5, i2, ujaVar));
            return;
        }
        if (s == xhb.g2.a) {
            qja qjaVar6 = ((whe) this.c).b.v;
            qjaVar6.getClass();
            qjaVar6.b(new es9(qjaVar6, 22, (sja) l0gVar));
            u0g u0gVar4 = qjaVar6.l;
            if (u0gVar4 != null) {
                ((w0g) u0gVar4.v0.getValue()).e();
                return;
            }
            return;
        }
        if (s == xhb.f2.a) {
            qja qjaVar7 = ((whe) this.c).b.v;
            qjaVar7.getClass();
            qjaVar7.b(new es9(qjaVar7, i5, (nka) l0gVar));
            return;
        }
        if (s == xhb.i2.a) {
            qja qjaVar8 = ((whe) this.c).b.v;
            qjaVar8.getClass();
            qjaVar8.b(new es9(qjaVar8, 21, (kka) l0gVar));
            return;
        }
        if (s == xhb.h2.a) {
            qja qjaVar9 = ((whe) this.c).b.v;
            ija ijaVar = (ija) l0gVar;
            qjaVar9.getClass();
            if (ijaVar.c != null) {
                qjaVar9.b(new es9(qjaVar9, 6, ijaVar));
                return;
            }
            return;
        }
        if (s == xhb.j2.a) {
            qja qjaVar10 = ((whe) this.c).b.v;
            qjaVar10.getClass();
            qjaVar10.b(new es9(qjaVar10, 8, (gja) l0gVar));
            return;
        }
        if (s == xhb.k2.a) {
            qja qjaVar11 = ((whe) this.c).b.v;
            qjaVar11.getClass();
            qjaVar11.b(new es9(qjaVar11, 17, (eja) l0gVar));
            return;
        }
        if (s == xhb.l2.a) {
            qja qjaVar12 = ((whe) this.c).b.v;
            qjaVar12.getClass();
            qjaVar12.b(new es9(qjaVar12, 7, (via) l0gVar));
            return;
        }
        if (s == xhb.m2.a) {
            qja qjaVar13 = ((whe) this.c).b.v;
            bja bjaVar = (bja) l0gVar;
            if (((rya) qjaVar13.c.getValue()).a()) {
                return;
            }
            qjaVar13.b(new es9(qjaVar13, i3, bjaVar));
            return;
        }
        if (s == xhb.n2.a) {
            qja qjaVar14 = ((whe) this.c).b.v;
            qjaVar14.getClass();
            qjaVar14.b(new es9(qjaVar14, 18, (jja) l0gVar));
            return;
        }
        if (s == xhb.o2.a) {
            qja qjaVar15 = ((whe) this.c).b.v;
            qjaVar15.getClass();
            qjaVar15.b(new es9(qjaVar15, 23, (fka) l0gVar));
            return;
        }
        if (s == xhb.p2.a) {
            qja qjaVar16 = ((whe) this.c).b.v;
            qjaVar16.getClass();
            qjaVar16.b(new es9(qjaVar16, 4, (dka) l0gVar));
            return;
        }
        if (s == xhb.q2.a) {
            qja qjaVar17 = ((whe) this.c).b.v;
            qjaVar17.getClass();
            qjaVar17.b(new es9(qjaVar17, 14, (hka) l0gVar));
            return;
        }
        if (s == xhb.r2.a) {
            qja qjaVar18 = ((whe) this.c).b.v;
            qjaVar18.getClass();
            qjaVar18.b(new es9(qjaVar18, i4, (jka) l0gVar));
            return;
        }
        if (s == xhb.s2.a) {
            qja qjaVar19 = ((whe) this.c).b.v;
            qjaVar19.getClass();
            qjaVar19.b(new es9(qjaVar19, 9, (cja) l0gVar));
            return;
        }
        if (s == xhb.w2.a) {
            qja qjaVar20 = ((whe) this.c).b.v;
            qjaVar20.getClass();
            qjaVar20.b(new pja(qjaVar20));
            return;
        }
        if (s == xhb.v2.a) {
            qja qjaVar21 = ((whe) this.c).b.v;
            qjaVar21.getClass();
            qjaVar21.b(new pja(qjaVar21, (rja) l0gVar));
            return;
        }
        if (s == xhb.x2.a) {
            qja qjaVar22 = ((whe) this.c).b.v;
            qjaVar22.getClass();
            qjaVar22.b(new es9(qjaVar22, 24, (uia) l0gVar));
            return;
        }
        if (s == xhb.y2.a) {
            qja qjaVar23 = ((whe) this.c).b.v;
            qjaVar23.getClass();
            qjaVar23.b(new es9(qjaVar23, 25, (lja) l0gVar));
            return;
        }
        if (s == xhb.z2.a) {
            qja qjaVar24 = ((whe) this.c).b.v;
            qjaVar24.getClass();
            qjaVar24.b(new es9(qjaVar24, 12, (mja) l0gVar));
            return;
        }
        if (s == xhb.E2.a) {
            qja qjaVar25 = ((whe) this.c).b.v;
            qjaVar25.getClass();
            qjaVar25.b(new es9(qjaVar25, 13, (xja) l0gVar));
            return;
        }
        if (s == xhb.F2.a) {
            qja qjaVar26 = ((whe) this.c).b.v;
            qjaVar26.getClass();
            qjaVar26.b(new es9(qjaVar26, 11, (lka) l0gVar));
            return;
        }
        if (s == xhb.P2.a) {
            qja qjaVar27 = ((whe) this.c).b.v;
            qjaVar27.getClass();
            qjaVar27.b(new es9(qjaVar27, 10, (oja) l0gVar));
        } else if (s == xhb.Q2.a) {
            qja qjaVar28 = ((whe) this.c).b.v;
            qjaVar28.getClass();
            qjaVar28.b(new es9(qjaVar28, 16, (yia) l0gVar));
        } else {
            xhb.c.getClass();
            String strH = wy1.h("Illegal state in handleNotif, unknown opcode ", "0x".concat(Integer.toHexString(65535 & s)));
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(strH);
            wqi.e(((whe) this.c).b.a, strH, illegalArgumentException);
            ((whe) this.c).b.u(illegalArgumentException, false);
        }
    }

    @Override // defpackage.ezf
    public void e(pzf pzfVar) {
        TamErrorException tamErrorException = new TamErrorException(pzfVar);
        zhe zheVar = ((whe) this.c).b;
        wqi.e(zheVar.a, "illegal state in handleNotif, onFail", tamErrorException);
        zheVar.u(tamErrorException, false);
    }

    @Override // defpackage.vta
    public void f(Object obj) {
        try {
            izi.b((sac) this.b, obj);
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.lsf
    public void g(vb0 vb0Var) {
        ((a8h) this.c).b();
        eo6 eo6Var = (((u75) this.b).a() && vb0Var.d) ? eo6.c : eo6.b;
        String str = ((a8h) this.c).a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onTransformationInfoUpdate, transformationInfo=" + vb0Var + ", input format=" + eo6Var, null);
            }
        }
        r8h r8hVar = ((a8h) this.c).t0;
        if (r8hVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ho6.d((AtomicBoolean) r8hVar.c, true);
        ho6.c((Thread) r8hVar.e);
        if (((eo6) r8hVar.n) != eo6Var) {
            r8hVar.n = eo6Var;
            r8hVar.v(r8hVar.b);
        }
    }

    public g3a h(tm9 tm9Var) throws IOException {
        int iN0 = tm9Var.n0();
        nt1 nt1Var = null;
        Long lValueOf = null;
        float fR0 = 1.0f;
        boolean zP0 = false;
        boolean zP02 = false;
        for (int i = 0; i < iN0; i++) {
            if (i == 0) {
                int iS0 = tm9Var.s0();
                nt1 nt1Var2 = (nt1) ((ConcurrentHashMap) ((y6i) this.b).b).get(Integer.valueOf(iS0));
                if (nt1Var2 == null) {
                    throw new RuntimeException(ho7.f(iS0, "Can't find compact id for "));
                }
                nt1Var = nt1Var2;
            } else if (i == 1) {
                fR0 = tm9Var.r0();
            } else if (i == 2) {
                zP0 = tm9Var.p0();
            } else if (i != 3) {
                if (i != 4) {
                    tm9Var.v();
                } else {
                    zP02 = tm9Var.p0();
                }
            } else if (tm9Var.w().a() == 3) {
                lValueOf = Long.valueOf(tm9Var.t0());
            }
        }
        if (nt1Var != null) {
            return new g3a(nt1Var, fR0, zP0, lValueOf, zP02);
        }
        throw new RuntimeException("Watch together parse error");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0 A[PHI: r12 r14
  0x00e0: PHI (r12v6 java.lang.Integer) = (r12v4 java.lang.Integer), (r12v4 java.lang.Integer), (r12v7 java.lang.Integer) binds: [B:59:0x0117, B:56:0x010e, B:38:0x00de] A[DONT_GENERATE, DONT_INLINE]
  0x00e0: PHI (r14v7 java.lang.Integer) = (r14v4 java.lang.Integer), (r14v5 java.lang.Integer), (r14v4 java.lang.Integer) binds: [B:59:0x0117, B:56:0x010e, B:38:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ou1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(defpackage.mbd r20, defpackage.ood r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssb.i(mbd, ood):void");
    }

    @Override // defpackage.ou1
    public void j(mbd mbdVar, IOException iOException) {
        ((xbd) this.b).c(iOException);
    }

    @Override // defpackage.ezf
    public long k() {
        return 0L;
    }

    public void l(mid midVar, kt ktVar) {
        z0f z0fVar = (z0f) this.b;
        qfh qfhVarA = (qfh) z0fVar.get(midVar);
        if (qfhVarA == null) {
            qfhVarA = qfh.a();
            z0fVar.put(midVar, qfhVarA);
        }
        qfhVarA.c = ktVar;
        qfhVarA.a |= 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    public gpf m(long j, ArrayList arrayList, String str, String str2, String str3, b8c b8cVar, int i) {
        String str4;
        String str5;
        o7e o7eVar = (o7e) this.b;
        if (arrayList.size() == 0) {
            return new gpf(j, 1, "", "", "", str3, b8cVar, str2);
        }
        String str6 = (String) arrayList.get(0);
        String str7 = null;
        if (l8g.c(str) || !o7eVar.i(str, str2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str4 = null;
                    break;
                }
                str4 = (String) it.next();
                if (!l8g.a(str4, str6) && o7eVar.i(str4, str2)) {
                    break;
                }
            }
        } else {
            str4 = str;
        }
        if (!l8g.c(str4)) {
            str5 = str4;
        } else if (l8g.c(str)) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ?? next = it2.next();
                try {
                    if (!l8g.a((String) next, str6)) {
                        str7 = next;
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            str4 = str7;
            str5 = str4;
        } else {
            str5 = str;
        }
        String strTrim = (l8g.c(str) || i != 1) ? ((String) arrayList.get(0)).trim() : str.trim();
        cj9 cj9Var = new cj9(j, null, bj9.a, 0, strTrim.length(), null);
        String strC = strTrim;
        if (l8g.c(str)) {
            strC = !l8g.c(strTrim) ? ((f7b) this.c).c(strTrim, cj9Var, true, true) : "";
        }
        return new gpf(j, 1, str6, str5, strC, str3, b8cVar, str2);
    }

    public gie n() {
        gie gieVar = new gie();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            vwg vwgVar = (vwg) entry.getValue();
            if (vwgVar.e) {
                gieVar.f(vwgVar.a);
                arrayList.add((String) entry.getKey());
            }
        }
        gri.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + ((String) this.b));
        return gieVar;
    }

    public Collection o() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            if (((vwg) entry.getValue()).e) {
                arrayList.add(((vwg) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @Override // defpackage.vta
    public void onError(Throwable th) {
        switch (this.a) {
            case 5:
                ((pac) ((sac) this.b)).D(th);
                break;
            default:
                ((bs8) this.c).onError(th);
                break;
        }
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        ((tu1) this.b).d(th);
    }

    public Collection p() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            if (((vwg) entry.getValue()).e) {
                arrayList.add(((vwg) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public boolean q(String[] strArr) {
        for (String str : strArr) {
            if (!((SharedPreferences) ((bwf) this.c).getValue()).getBoolean(str.concat("_req"), false)) {
                return false;
            }
        }
        return true;
    }

    public boolean r(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (linkedHashMap.containsKey(str)) {
            return ((vwg) linkedHashMap.get(str)).e;
        }
        return false;
    }

    public bkh s(tm9 tm9Var) {
        int iN0 = tm9Var.n0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iN0; i++) {
            try {
                arrayList.add(h(tm9Var));
            } catch (Throwable th) {
                ((y6d) this.c).log("WatchTogetherUpdateParser", "Can't parse video state update " + th);
            }
        }
        return new bkh(new h3a(arrayList));
    }

    public kt t(mid midVar, int i) {
        qfh qfhVar;
        kt ktVar;
        z0f z0fVar = (z0f) this.b;
        int iD = z0fVar.d(midVar);
        if (iD >= 0 && (qfhVar = (qfh) z0fVar.i(iD)) != null) {
            int i2 = qfhVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                qfhVar.a = i3;
                if (i == 4) {
                    ktVar = qfhVar.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    ktVar = qfhVar.c;
                }
                if ((i3 & 12) == 0) {
                    z0fVar.g(iD);
                    qfhVar.a = 0;
                    qfhVar.b = null;
                    qfhVar.c = null;
                    qfh.d.b(qfhVar);
                }
                return ktVar;
            }
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Map map = (Map) this.b;
                Throwable th = (Throwable) this.c;
                return "ThreadDump(threadsCount=" + map + ", allStackTraces=" + (th != null ? saj.d(th) : null) + ")";
            case 18:
                return "Bounds{lower=" + ((co7) this.b) + " upper=" + ((co7) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(Object obj, String str) {
        AtomicReference atomicReference = (AtomicReference) ((bwf) this.c).getValue();
        while (true) {
            Map map = (Map) atomicReference.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (obj == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, obj);
            }
            while (!atomicReference.compareAndSet(map, linkedHashMap)) {
                if (atomicReference.get() != map) {
                    break;
                }
            }
            return;
        }
    }

    public acf v(v4i v4iVar) {
        acf acfVar;
        synchronized (this.b) {
            acfVar = (acf) ((LinkedHashMap) this.c).remove(v4iVar);
        }
        return acfVar;
    }

    public List w(String str) {
        List listD0;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (fni.a(((v4i) entry.getKey()).a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.c).remove((v4i) it.next());
                }
                listD0 = ue3.d0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listD0;
    }

    public void x(mid midVar) {
        qfh qfhVar = (qfh) ((z0f) this.b).get(midVar);
        if (qfhVar == null) {
            return;
        }
        qfhVar.a &= -2;
    }

    public void y(mid midVar) {
        ek8 ek8Var = (ek8) this.c;
        int iG = ek8Var.g() - 1;
        while (true) {
            if (iG < 0) {
                break;
            }
            if (midVar == ek8Var.h(iG)) {
                Object[] objArr = ek8Var.c;
                Object obj = objArr[iG];
                Object obj2 = iei.a;
                if (obj != obj2) {
                    objArr[iG] = obj2;
                    ek8Var.a = true;
                }
            } else {
                iG--;
            }
        }
        qfh qfhVar = (qfh) ((z0f) this.b).remove(midVar);
        if (qfhVar != null) {
            qfhVar.a = 0;
            qfhVar.b = null;
            qfhVar.c = null;
            qfh.d.b(qfhVar);
        }
    }

    public void z() {
        afg.a(new bee(10, this));
    }

    public /* synthetic */ ssb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public ssb(IBinder iBinder) throws RemoteException {
        this.a = 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new mii(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public ssb(Context context) {
        this.a = 0;
        this.b = context;
        this.c = new bwf(new ffb(7, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ssb(cm6 cm6Var) {
        this.a = 7;
        this.b = (u08) cm6Var;
        this.c = new bwf(new m2(12, this));
    }

    public ssb(String str, int i) {
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                this.c = new LinkedHashMap();
                this.b = str;
                break;
            default:
                this.b = str;
                CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                this.c = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                break;
        }
    }

    public ssb(int i) {
        this.a = i;
        switch (i) {
            case 16:
                this.b = new z0f(0);
                this.c = new ek8((Object) null);
                break;
            case 19:
                tv6 tv6Var = tv6.d;
                this.b = new SparseIntArray();
                this.c = tv6Var;
                break;
            default:
                this.b = new Object();
                this.c = new LinkedHashMap();
                break;
        }
    }

    public ssb(ExecutorService executorService) {
        this.a = 4;
        this.c = new us(0);
        this.b = executorService;
    }

    public ssb(WindowInsetsAnimation.Bounds bounds) {
        this.a = 18;
        this.b = co7.c(bounds.getLowerBound());
        this.c = co7.c(bounds.getUpperBound());
    }
}
