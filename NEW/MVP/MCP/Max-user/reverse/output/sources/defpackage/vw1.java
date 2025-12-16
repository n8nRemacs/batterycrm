package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class vw1 implements ui8 {
    public final tw0 A0;
    public final z7c B0;
    public final pj9 C0;
    public long Y;
    public long Z;
    public boolean a;
    public volatile boolean b;
    public volatile uw1 c;
    public long s0;
    public final g4b t0;
    public final od8 u0;
    public final hwa v0;
    public final qi9 w0;
    public final ve2 x0;
    public final j0e y0;
    public final qx5 z0;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final HashSet o = new HashSet();
    public final HashSet X = new HashSet();

    public vw1(hwa hwaVar, qi9 qi9Var, ve2 ve2Var, j0e j0eVar, qx5 qx5Var, tw0 tw0Var, z7c z7cVar, g4b g4bVar, od8 od8Var, pj9 pj9Var) {
        this.v0 = hwaVar;
        this.w0 = qi9Var;
        this.x0 = ve2Var;
        this.y0 = j0eVar;
        this.z0 = qx5Var;
        this.A0 = tw0Var;
        this.B0 = z7cVar;
        this.t0 = g4bVar;
        this.u0 = od8Var;
        this.C0 = pj9Var;
    }

    public final void a(int i, List list) {
        HashSet hashSet;
        int size = list.size();
        while (true) {
            size--;
            hashSet = this.o;
            if (size < 0) {
                break;
            } else if (hashSet.contains(Long.valueOf(((eh9) list.get(size)).a.a))) {
                list.remove(size);
            }
        }
        this.d.addAll(i, list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Long.valueOf(((eh9) it.next()).a.a));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        hashSet.addAll(arrayList);
    }

    public final void b() {
        if (this.s0 != 0 || this.c.X.b() <= 0) {
            return;
        }
        for (Long l : ((LinkedHashMap) this.c.X.a).keySet()) {
            if (this.x0.J(l.longValue()) != null) {
                List listSubList = (List) ((LinkedHashMap) this.c.X.a).get(l);
                if (listSubList != null && !listSubList.isEmpty()) {
                    if (listSubList.size() > 100) {
                        listSubList = listSubList.subList(0, 100);
                    }
                    wqi.c("vw1", "loadMissedMessages: for chat: " + l + " messages size: " + listSubList.size(), new Object[0]);
                    this.s0 = this.v0.y(l.longValue(), new ArrayList(listSubList));
                    return;
                }
            } else {
                wqi.c("vw1", "loadMissedMessages: chat not found: " + l, new Object[0]);
            }
        }
    }

    @Override // defpackage.ui8
    public final void c() {
        g(new tw1(this, 2));
    }

    public final void d() {
        if (this.Z == 0) {
            wqi.c("vw1", "loadNext: loading from network from: " + this.c.c + " backward", new Object[0]);
            hwa hwaVar = this.v0;
            this.Z = hwa.q(hwaVar, new u1h(hwaVar.t().a.k(), this.c.c, false));
        }
    }

    public final void e() {
        if (this.c != null) {
            return;
        }
        this.c = new uw1();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(iz5.b(((iz5) this.z0).c), "call_history_state"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gbj.f(fileInputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gbj.d(fileInputStream);
            gbj.c(byteArrayOutputStream);
            Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
            fl9.mergeFrom(callHistoryState, byteArray);
            this.c.a = a.i(callHistoryState.chunk);
            this.c.b = callHistoryState.forwardMarker;
            this.c.c = callHistoryState.backwardMarker;
            this.c.d = callHistoryState.hasNext;
            this.c.o = callHistoryState.hasPrev;
            Map<Long, Protos.CallHistoryState.MissedMessagesItem> map = callHistoryState.missedMessagesIds;
            if (map != null) {
                for (Map.Entry<Long, Protos.CallHistoryState.MissedMessagesItem> entry : map.entrySet()) {
                    lz7 lz7Var = this.c.X;
                    Long key = entry.getKey();
                    ArrayList arrayListB = jqi.b(entry.getValue().ids);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) lz7Var.a;
                    List list = (List) linkedHashMap.get(key);
                    if (list != null) {
                        list.addAll(arrayListB);
                    } else {
                        linkedHashMap.put(key, arrayListB);
                    }
                }
            }
        } catch (Exception e) {
            wqi.c("vw1", "loadState error, set default state " + e.getMessage(), new Object[0]);
        }
    }

    public final void f() {
        this.y0.b(new tw1(this, 1));
    }

    public final void g(Runnable runnable) {
        this.t0.c().execute(runnable);
    }

    public final void h() {
        Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
        callHistoryState.chunk = a.j(this.c.a);
        callHistoryState.forwardMarker = this.c.b;
        callHistoryState.backwardMarker = this.c.c;
        callHistoryState.hasNext = this.c.d;
        callHistoryState.hasPrev = this.c.o;
        if (this.c.X != null) {
            callHistoryState.missedMessagesIds = new HashMap();
            for (Long l : ((LinkedHashMap) this.c.X.a).keySet()) {
                Protos.CallHistoryState.MissedMessagesItem missedMessagesItem = new Protos.CallHistoryState.MissedMessagesItem();
                missedMessagesItem.ids = jqi.c((List) ((LinkedHashMap) this.c.X.a).get(l));
                callHistoryState.missedMessagesIds.put(l, missedMessagesItem);
            }
        }
        byte[] byteArray = fl9.toByteArray(callHistoryState);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(iz5.b(((iz5) this.z0).c), "call_history_state"));
            fileOutputStream.write(byteArray);
            gbj.c(fileOutputStream);
        } catch (IOException e) {
            wqi.o("vw1", null, "failed to save state: " + e.getMessage(), Arrays.copyOf(new Object[0], 0));
        }
    }

    public final void i() {
        z7c z7cVar = this.B0;
        long jL = z7cVar.a.l();
        pe8 pe8Var = z7cVar.a;
        long jV = pe8Var.v();
        StringBuilder sbL = az1.l(jL, "setCallsLastSync: from: ", " to: ");
        sbL.append(jV);
        wqi.c("vw1", sbL.toString(), new Object[0]);
        pe8Var.u.O(pe8Var, w4e.m0[10], Long.valueOf(jV));
    }

    @vnf
    public void onEvent(n73 n73Var) {
        g(new ud(this, 27, n73Var));
    }

    @vnf
    public void onEvent(w1h w1hVar) {
        g(new ud(this, 23, w1hVar));
    }

    @vnf
    public void onEvent(ph8 ph8Var) {
        g(new ud(this, 25, ph8Var));
    }

    @vnf
    public void onEvent(gj7 gj7Var) {
        g(new ud(this, 24, gj7Var));
    }

    @vnf
    public void onEvent(q4a q4aVar) {
        g(new ud(this, 28, q4aVar));
    }

    @vnf
    public void onEvent(z4a z4aVar) {
        g(new ud(this, 26, z4aVar));
    }

    @vnf
    public void onEvent(rj0 rj0Var) {
        g(new ud(this, 22, rj0Var));
    }

    @vnf
    public void onEvent(y4a y4aVar) {
        g(new ud(this, 21, y4aVar));
    }
}
