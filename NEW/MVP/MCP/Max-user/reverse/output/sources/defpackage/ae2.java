package defpackage;

import android.database.Cursor;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.exception.UserNotFoundException;

/* loaded from: classes2.dex */
public final /* synthetic */ class ae2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve2 b;

    public /* synthetic */ ae2(ve2 ve2Var, int i) {
        this.a = i;
        this.b = ve2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        dsd dsdVar;
        si9 si9Var;
        switch (this.a) {
            case 0:
                ve2 ve2Var = this.b;
                if (ve2Var.k) {
                    return;
                }
                wqi.c("ve2", "load 1: start", new Object[0]);
                if (ve2Var.k) {
                    return;
                }
                ((deg) ve2Var.z.get()).getClass();
                deg.a("ChatController.load()");
                long jNanoTime = System.nanoTime();
                xs xsVar = new xs(0);
                ArrayList arrayList = new ArrayList();
                kz4 kz4Var = ve2Var.z;
                ((deg) kz4Var.get()).getClass();
                deg.a("ChatController.selectChats()");
                jrd jrdVar = ((ie4) ve2Var.m.get()).b;
                m03 m03VarC = jrdVar.c();
                m03VarC.getClass();
                dsd dsdVarC = dsd.c(0, "SELECT * FROM chats");
                lrd lrdVar = m03VarC.a;
                lrdVar.b();
                Cursor cursorN = lrdVar.n(dsdVarC);
                try {
                    int iC = s7j.c(cursorN, "id");
                    int iC2 = s7j.c(cursorN, "server_id");
                    int iC3 = s7j.c(cursorN, "data");
                    int iC4 = s7j.c(cursorN, "favourite_index");
                    int iC5 = s7j.c(cursorN, "sort_time");
                    dsdVar = dsdVarC;
                    try {
                        int iC6 = s7j.c(cursorN, "cid");
                        ArrayList arrayList2 = new ArrayList(cursorN.getCount());
                        while (cursorN.moveToNext()) {
                            kz4 kz4Var2 = kz4Var;
                            arrayList2.add(new rg2(cursorN.getLong(iC), cursorN.getLong(iC2), m03VarC.a().c(cursorN.isNull(iC3) ? null : cursorN.getBlob(iC3)), cursorN.getLong(iC4), cursorN.getLong(iC5), cursorN.getLong(iC6)));
                            kz4Var = kz4Var2;
                        }
                        kz4 kz4Var3 = kz4Var;
                        cursorN.close();
                        dsdVar.y();
                        TreeSet treeSet = new TreeSet(jrd.g);
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            treeSet.add(jrdVar.a((rg2) it.next()));
                        }
                        List<sf2> listD0 = ue3.d0(treeSet);
                        ((deg) kz4Var3.get()).getClass();
                        Trace.endSection();
                        ArrayList arrayList3 = new ArrayList();
                        wqi.c("ve2", "load 2", new Object[0]);
                        for (sf2 sf2Var : listD0) {
                            rf2 rf2Var = sf2Var.b;
                            if (rf2Var.b != pf2.b || (!(rf2Var.o0 == 1 || rf2Var.f0) || rf2Var.e.containsKey(Long.valueOf(ve2Var.U())))) {
                                ve2Var.e0(sf2Var.a, sf2Var);
                                xsVar.add(Long.valueOf(sf2Var.a));
                                long j = sf2Var.b.j;
                                if (j > 0) {
                                    arrayList.add(Long.valueOf(j));
                                }
                            } else {
                                arrayList3.add(sf2Var);
                            }
                        }
                        wqi.c("ve2", "load 3", new Object[0]);
                        if (!arrayList3.isEmpty()) {
                            ((q2b) ve2Var.D).b().mo13dispatch(bd5.a, new my1(ve2Var, 9, arrayList3));
                        }
                        wqi.c("ve2", "load 4", new Object[0]);
                        ((deg) ve2Var.z.get()).getClass();
                        deg.a("ChatController.load().processedChats");
                        m8a m8aVarO = ((qi9) ve2Var.t.get()).a.c.o(arrayList);
                        wqi.c("ve2", "load 5", new Object[0]);
                        qs qsVar = new qs(xsVar);
                        while (qsVar.hasNext()) {
                            sf2 sf2Var2 = (sf2) ve2Var.f.get((Long) qsVar.next());
                            if (sf2Var2 != null && (si9Var = (si9) m8aVarO.d(sf2Var2.b.j)) != null) {
                                pb2 pb2VarQ = ve2Var.q(sf2Var2, si9Var);
                                if (ve2Var.a.getValue() == null) {
                                    if (pb2VarQ.b.e(ve2Var.o.a.s())) {
                                        ve2Var.a.m(null, pb2VarQ);
                                    }
                                }
                            }
                        }
                        wqi.c("ve2", "load 6", new Object[0]);
                        ((deg) ve2Var.z.get()).getClass();
                        Trace.endSection();
                        ve2Var.k = true;
                        wqi.c("ve2", "load 7", new Object[0]);
                        ve2Var.l.D();
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null) {
                            lg8 lg8Var = lg8.d;
                            if (l6bVar.b(lg8Var)) {
                                Locale locale = Locale.ROOT;
                                StringBuilder sbM = u45.m(xsVar.c, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime), "chats loaded to memory cache size: ", " by time ");
                                sbM.append("ms");
                                l6bVar.c(lg8Var, "ve2", sbM.toString(), null);
                            }
                        }
                        ve2Var.n.c(new n73(xsVar, true, true, null, null, 120));
                        ((deg) ve2Var.z.get()).getClass();
                        Trace.endSection();
                        if (ve2Var.a.getValue() == null) {
                            try {
                                ve2Var.E();
                                List listSingletonList = Collections.singletonList((pb2) ve2Var.a.getValue());
                                ue2 ue2Var = ve2Var.G;
                                if (ue2Var != null) {
                                    ue2Var.a(listSingletonList);
                                }
                            } catch (UserNotFoundException unused) {
                            }
                        }
                        wqi.c("ve2", "load 8: finish", new Object[0]);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        cursorN.close();
                        dsdVar.y();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dsdVar = dsdVarC;
                }
                break;
            default:
                ve2 ve2Var2 = this.b;
                ve2Var2.h.clear();
                ve2Var2.e.clear();
                ve2Var2.i.clear();
                ve2Var2.f.clear();
                ve2Var2.d.clear();
                ve2Var2.g.clear();
                ve2Var2.j.clear();
                ve2Var2.a.setValue(null);
                return;
        }
    }
}
