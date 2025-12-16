package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class mub implements cub {
    public final k18 a;
    public final k18 b;
    public final tw0 c;
    public final k18 d;
    public final bwf e;
    public final k18 f;
    public final k18 g;
    public final yi5 h;
    public volatile long i;
    public volatile boolean j;
    public final HashMap k = new HashMap();

    public mub(k18 k18Var, k18 k18Var2, tw0 tw0Var, k18 k18Var3, bwf bwfVar, k18 k18Var4, k18 k18Var5, yi5 yi5Var) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = tw0Var;
        this.d = k18Var3;
        this.e = bwfVar;
        this.f = k18Var4;
        this.g = k18Var5;
        this.h = yi5Var;
        tw0Var.d(this);
    }

    @Override // defpackage.cub
    public final void a(ArrayList arrayList) {
        wqi.c("mub", "onPhonebookUpdated", new Object[0]);
        c();
    }

    public final void b(List list, Map map, HashMap map2) {
        wqi.c("mub", "onSyncSuccess: contacts=%s, phones=%s, requested=%s", Integer.valueOf(list.size()), Integer.valueOf(map.size()), Integer.valueOf(map2.size()));
        int size = list.size();
        int i = 1;
        k18 k18Var = this.f;
        if (size > 0) {
            long jS = ((z7c) this.d.getValue()).a.s();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                gx3 gx3Var = (gx3) it.next();
                if (gx3Var.a == jS) {
                    list.remove(gx3Var);
                    break;
                }
            }
            ((hwa) this.b.getValue()).p((List) list.stream().map(new xga(i)).collect(Collectors.toList()));
            ((qv3) k18Var.getValue()).s(list, yv3.a);
        }
        boolean z = false;
        for (String str : map.keySet()) {
            HashMap map3 = this.k;
            Integer num = (Integer) map3.get(str);
            int iIntValue = num != null ? num.intValue() + 1 : 1;
            map3.put(str, Integer.valueOf(iIntValue));
            if (!z && iIntValue >= 10) {
                ((y3b) this.h).a(new IllegalStateException("Contacts sync cycle"));
                z = true;
            }
        }
        k18 k18Var2 = this.a;
        csd csdVar = ((ie4) k18Var2.getValue()).e;
        ((OneMeRoomDatabase) csdVar.a.l()).p(new d8c(map, 22, csdVar));
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            map2.remove((String) it2.next());
        }
        wqi.c("mub", "markInvalidPhones: invalid phones: %s", Integer.valueOf(map2.size()));
        if (!map2.isEmpty()) {
            csd csdVar2 = ((ie4) k18Var2.getValue()).e;
            Set<String> setKeySet = map2.keySet();
            lrd lrdVar = csdVar2.c().a;
            lrdVar.b();
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE phones SET type = ? WHERE type = ? AND phone in (");
            lc4.a(sb, setKeySet.size());
            sb.append(")");
            vk6 vk6VarD = lrdVar.d(sb.toString());
            vk6VarD.k(1, 2);
            vk6VarD.k(2, 0);
            int i2 = 3;
            for (String str2 : setKeySet) {
                if (str2 == null) {
                    vk6VarD.S(i2);
                } else {
                    vk6VarD.f(i2, str2);
                }
                i2++;
            }
            lrdVar.c();
            try {
                vk6VarD.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            csd csdVar3 = ((ie4) k18Var2.getValue()).e;
            Long l = (Long) entry.getValue();
            l.longValue();
            csdVar3.getClass();
            ytb ytbVar = (ytb) ue3.I(csdVar3.f(Collections.singletonList(l)));
            if (ytbVar != null) {
                arrayList.add(ytbVar);
            }
        }
        Set setV = ((qv3) k18Var.getValue()).v(arrayList);
        if (!setV.isEmpty()) {
            ((jzf) this.g.getValue()).f(setV);
        }
        this.c.c(new tub());
        ((j0e) this.e.getValue()).c(new lub(this, 0), 1L, TimeUnit.SECONDS);
    }

    public final void c() {
        wqi.c("mub", "sync", new Object[0]);
        if (this.j) {
            wqi.c("mub", "sync in progress, return", new Object[0]);
        } else {
            this.j = true;
            ((j0e) this.e.getValue()).b(new lub(this, 1));
        }
    }

    public final void d() {
        dsd dsdVar;
        Integer num;
        wqi.c("mub", "syncInternal", new Object[0]);
        wqi.c("mub", "select unsynced phones", new Object[0]);
        HashMap map = new HashMap();
        sub subVarC = ((ie4) this.a.getValue()).e.c();
        subVarC.getClass();
        dsd dsdVarC = dsd.c(1, "SELECT * FROM phones WHERE type = ?");
        dsdVarC.k(1, 0);
        lrd lrdVar = subVarC.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "phonebook_id");
            int iC3 = s7j.c(cursorN, "contact_id");
            int iC4 = s7j.c(cursorN, "phone");
            int iC5 = s7j.c(cursorN, "server_phone");
            int iC6 = s7j.c(cursorN, "email");
            int iC7 = s7j.c(cursorN, "first_name");
            int iC8 = s7j.c(cursorN, "last_name");
            int iC9 = s7j.c(cursorN, "avatar_path");
            int iC10 = s7j.c(cursorN, "type");
            dsdVar = dsdVarC;
            try {
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    arrayList.add(new ztb(cursorN.getLong(iC), cursorN.getLong(iC2), cursorN.getInt(iC3), cursorN.isNull(iC4) ? null : cursorN.getString(iC4), cursorN.getLong(iC5), cursorN.isNull(iC6) ? null : cursorN.getString(iC6), cursorN.isNull(iC7) ? null : cursorN.getString(iC7), cursorN.isNull(iC8) ? null : cursorN.getString(iC8), cursorN.isNull(iC9) ? null : cursorN.getString(iC9), utb.b(cursorN.getInt(iC10))));
                }
                cursorN.close();
                dsdVar.y();
                ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(csd.d((ztb) it.next()));
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ytb ytbVar = (ytb) it2.next();
                    map.put(ytbVar.d, new a04(ytbVar.Y, ytbVar.Z));
                    if (map.size() == 100) {
                        break;
                    }
                }
                if (!map.isEmpty()) {
                    for (Map.Entry entry : this.k.entrySet()) {
                        if (map.containsKey(entry.getKey()) && (num = (Integer) entry.getValue()) != null && num.intValue() >= 10) {
                            wqi.c("mub", "syncInternal: already synced, skip", new Object[0]);
                            map.remove(entry.getKey());
                        }
                    }
                }
                wqi.c("mub", "syncInternal: unsyncedPhones size=%s", Integer.valueOf(map.size()));
                if (map.size() == 0) {
                    this.j = false;
                    wqi.c("mub", "syncInternal: everything synced, return", new Object[0]);
                } else {
                    hwa hwaVar = (hwa) this.b.getValue();
                    this.i = hwa.q(hwaVar, new hx3(hwaVar.t().a.k(), map, 1));
                }
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
    }

    @vnf
    public void onEvent(tvf tvfVar) {
        wqi.c("mub", "SyncResultEvent", new Object[0]);
        ((j0e) this.e.getValue()).b(new k79(this, 27, tvfVar));
    }

    @vnf
    public void onEvent(rj0 rj0Var) {
        if (rj0Var.a == this.i) {
            wqi.c("mub", "BaseErrorEvent :%s", rj0Var);
            this.j = false;
        }
    }
}
