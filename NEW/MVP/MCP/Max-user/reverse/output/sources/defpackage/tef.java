package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class tef {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final kz4 c;
    public final z7c d;
    public final kz4 e;
    public final kz4 f;
    public final j0e g;
    public final j0e h;
    public final kz4 i;
    public final kz4 j;
    public qu1 k;
    public final nm0 l;

    public tef(kz4 kz4Var, z7c z7cVar, kz4 kz4Var2, kz4 kz4Var3, j0e j0eVar, j0e j0eVar2, kz4 kz4Var4, kz4 kz4Var5) {
        new ConcurrentHashMap();
        this.l = nm0.t(Collections.EMPTY_LIST);
        this.c = kz4Var;
        this.d = z7cVar;
        this.e = kz4Var2;
        this.f = kz4Var3;
        this.g = j0eVar;
        this.h = j0eVar2;
        this.i = kz4Var4;
        this.j = kz4Var5;
    }

    public final ora a() {
        return new ora(((kdd) this.j.get()).b().a(Collections.singletonList(hdd.STICKER)), new ref(this, 2), 5);
    }

    public final m2f b(List list) {
        wqi.c("tef", "getStickersByIds: ids count=%d", Integer.valueOf(list.size()));
        int i = 18;
        return new vr8(new m2f(new ora(vqa.i(this.a.entrySet()).g(new oh2(21, list)), new ycd(i), 5).s(), new qef(this, list, 1), 0), new vef(8), 3).s().h(new t9f(i, new c1g(list, new ycd(15))));
    }

    public final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            l.getClass();
            if (((jef) this.a.get(l)) == null) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    public final u2f d(List list) {
        wqi.c("tef", "loadNetworkStickers: %s", list);
        jqi.i(list);
        vk3 vk3VarI = vqa.i(jqi.j(list));
        ref refVar = new ref(this, 0);
        ifi.c(2, "bufferSize");
        vr8 vr8Var = new vr8(vk3VarI, refVar, 1);
        ArrayList arrayList = new ArrayList();
        return new cra(vr8Var, new kn6(arrayList), new ycd(20)).m(this.g);
    }

    public final synchronized void e(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jef jefVar = (jef) it.next();
                this.a.put(Long.valueOf(jefVar.a), jefVar);
            }
            bwd.a(new v64(this, 11, list), new ycd(24), this.h);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f() {
        if (!pbj.g(((iz5) ((qx5) this.e.get())).o(), this.b)) {
            wqi.c("tef", "Failed to store initial showcase", new Object[0]);
        }
    }

    public final void g(List list) {
        ConcurrentHashMap concurrentHashMap;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            concurrentHashMap = this.b;
            if (!zHasNext) {
                break;
            }
            z7e z7eVar = (z7e) it.next();
            Iterator it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((String) ((Map.Entry) it2.next()).getKey()).equals(z7eVar.b)) {
                    it2.remove();
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            z7e z7eVar2 = (z7e) it3.next();
            int i = z7eVar2.a;
            String str = z7eVar2.b;
            if (i == 3) {
                if (!((lgf) z7eVar2).c.isEmpty()) {
                    concurrentHashMap.put(str, z7eVar2);
                }
            } else if (i == 2 && !((xhf) z7eVar2).c.isEmpty()) {
                concurrentHashMap.put(str, z7eVar2);
            }
        }
        this.l.f(concurrentHashMap.values());
    }

    public final void h(List list) {
        wqi.c("tef", "Update recent section", new Object[0]);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            z7e z7eVar = (z7e) list.get(i2);
            if ("RECENT".equals(z7eVar.b) && z7eVar.a == 4) {
                bwd.b(this.k);
                kdd kddVar = (kdd) this.j.get();
                ArrayList arrayList = ((ldd) z7eVar).c;
                kddVar.getClass();
                wqi.c("kdd", "Replace recents. New size = %d", Integer.valueOf(arrayList.size()));
                ddd dddVarB = kddVar.b();
                qk3 qk3VarH = new ik3(dddVarB.b(), 2, new cdd(dddVarB, arrayList, i)).h(this.h);
                qu1 qu1Var = new qu1(new ycd(27), i, new yl4(11));
                qk3VarH.f(qu1Var);
                this.k = qu1Var;
                return;
            }
        }
    }
}
