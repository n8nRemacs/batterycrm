package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class jad implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jad(u1a u1aVar, nm7 nm7Var) {
        this.a = 20;
        this.b = u1aVar;
        this.c = nm7Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorN;
        iad iadVar;
        lrd lrdVar;
        OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl;
        Cursor cursorN2;
        lrd lrdVar2;
        n2h n2hVar;
        lrd lrdVar3;
        n2h n2hVar2;
        d0j d0jVar;
        int i = this.a;
        qqg qqgVar = qqg.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cursorN = ((kad) obj).a.n((dsd) obj2);
                try {
                    int iC = s7j.c(cursorN, "id");
                    int iC2 = s7j.c(cursorN, "update_time");
                    int iC3 = s7j.c(cursorN, "reactions");
                    if (cursorN.moveToFirst()) {
                        iadVar = new iad(cursorN.getLong(iC2), cursorN.isNull(iC) ? null : cursorN.getString(iC), z7.j(cursorN.isNull(iC3) ? null : cursorN.getString(iC3)));
                    } else {
                        iadVar = null;
                    }
                    return iadVar;
                } finally {
                }
            case 1:
                ocd ocdVar = (ocd) obj;
                lrdVar = ocdVar.a;
                lrdVar.c();
                try {
                    ocdVar.b.A((ArrayList) obj2);
                    lrdVar.q();
                    return null;
                } finally {
                }
            case 2:
                ocd ocdVar2 = (ocd) obj;
                lrdVar = ocdVar2.a;
                lrdVar.c();
                try {
                    ocdVar2.b.B((pcd) obj2);
                    lrdVar.q();
                    return null;
                } finally {
                }
            case 3:
                ocd ocdVar3 = (ocd) obj;
                lrdVar = ocdVar3.a;
                lrdVar.c();
                try {
                    ocdVar3.c.B((List) obj2);
                    lrdVar.q();
                    return null;
                } finally {
                }
            case 4:
                drd drdVar = (drd) obj;
                oneMeRoomDatabase_Impl = drdVar.a;
                oneMeRoomDatabase_Impl.c();
                try {
                    Long lValueOf = Long.valueOf(drdVar.b.C((uqd) obj2));
                    oneMeRoomDatabase_Impl.q();
                    return lValueOf;
                } finally {
                }
            case 5:
                drd drdVar2 = (drd) obj;
                hq9 hq9Var = drdVar2.e;
                oneMeRoomDatabase_Impl = drdVar2.a;
                vk6 vk6VarA = hq9Var.a();
                String str = (String) obj2;
                if (str == null) {
                    vk6VarA.S(1);
                } else {
                    vk6VarA.f(1, str);
                }
                try {
                    oneMeRoomDatabase_Impl.c();
                    try {
                        vk6VarA.w();
                        oneMeRoomDatabase_Impl.q();
                        return qqgVar;
                    } finally {
                    }
                } finally {
                    hq9Var.r(vk6VarA);
                }
            case 6:
                cursorN2 = ((drd) obj).a.n((aqc) obj2);
                try {
                    return (!cursorN2.moveToFirst() || cursorN2.isNull(0)) ? null : Long.valueOf(cursorN2.getLong(0));
                } finally {
                }
            case 7:
                cursorN2 = ((lrd) ((kce) obj).b).n((dsd) obj2);
                try {
                    int iC4 = s7j.c(cursorN2, "id");
                    int iC5 = s7j.c(cursorN2, "selectedMentionType");
                    ArrayList arrayList = new ArrayList(cursorN2.getCount());
                    while (cursorN2.moveToNext()) {
                        long j = cursorN2.getLong(iC4);
                        int i2 = cursorN2.getInt(iC5);
                        arrayList.add(new jce(j, (i2 != 0 && i2 == 1) ? 2 : 1));
                    }
                    return arrayList;
                } finally {
                }
            case 8:
                StringBuilder sbM = az1.m("DELETE FROM stat_events WHERE id in (");
                ArrayList arrayList2 = (ArrayList) obj2;
                lc4.a(sbM, arrayList2.size());
                sbM.append(")");
                String string = sbM.toString();
                lrdVar2 = ((xdf) obj).a;
                vk6 vk6VarD = lrdVar2.d(string);
                Iterator it = arrayList2.iterator();
                int i3 = 1;
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    if (l == null) {
                        vk6VarD.S(i3);
                    } else {
                        vk6VarD.k(i3, l.longValue());
                    }
                    i3++;
                }
                lrdVar2.c();
                try {
                    vk6VarD.w();
                    lrdVar2.q();
                    return qqgVar;
                } finally {
                }
            case 9:
                xdf xdfVar = (xdf) obj;
                lrdVar2 = xdfVar.a;
                lrdVar2.c();
                try {
                    xdfVar.b.A((List) obj2);
                    lrdVar2.q();
                    return qqgVar;
                } finally {
                }
            case 10:
                cursorN = ((xdf) obj).a.n((dsd) obj2);
                try {
                    int iC6 = s7j.c(cursorN, "id");
                    int iC7 = s7j.c(cursorN, "timestamp");
                    int iC8 = s7j.c(cursorN, "entry");
                    ArrayList arrayList3 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList3.add(new fcf(cursorN.getLong(iC6), cursorN.getLong(iC7), fef.a(cursorN.isNull(iC8) ? null : cursorN.getBlob(iC8))));
                    }
                    return arrayList3;
                } finally {
                }
            case 11:
                jgf jgfVar = (jgf) obj;
                lrd lrdVar4 = jgfVar.a;
                lrdVar4.c();
                try {
                    jgfVar.b.A((List) obj2);
                    lrdVar4.q();
                    return null;
                } finally {
                    lrdVar4.k();
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                cursorN2 = ((jgf) obj).a.n((dsd) obj2);
                try {
                    int iC9 = s7j.c(cursorN2, "id");
                    int iC10 = s7j.c(cursorN2, SdkMetricStatEvent.NAME_KEY);
                    int iC11 = s7j.c(cursorN2, "icon_url");
                    int iC12 = s7j.c(cursorN2, "author_id");
                    int iC13 = s7j.c(cursorN2, "created_time");
                    int iC14 = s7j.c(cursorN2, "updated_time");
                    int iC15 = s7j.c(cursorN2, "link");
                    int iC16 = s7j.c(cursorN2, "stickers");
                    int iC17 = s7j.c(cursorN2, "draft");
                    ArrayList arrayList4 = new ArrayList(cursorN2.getCount());
                    while (cursorN2.moveToNext()) {
                        yff yffVar = new yff();
                        yffVar.a = cursorN2.getLong(iC9);
                        if (cursorN2.isNull(iC10)) {
                            yffVar.b = null;
                        } else {
                            yffVar.b = cursorN2.getString(iC10);
                        }
                        if (cursorN2.isNull(iC11)) {
                            yffVar.c = null;
                        } else {
                            yffVar.c = cursorN2.getString(iC11);
                        }
                        yffVar.d = cursorN2.getLong(iC12);
                        yffVar.e = cursorN2.getLong(iC13);
                        yffVar.f = cursorN2.getLong(iC14);
                        if (cursorN2.isNull(iC15)) {
                            yffVar.g = null;
                        } else {
                            yffVar.g = cursorN2.getString(iC15);
                        }
                        yffVar.h = z7.j(cursorN2.isNull(iC16) ? null : cursorN2.getString(iC16));
                        yffVar.i = cursorN2.getInt(iC17) != 0;
                        arrayList4.add(yffVar);
                    }
                    return arrayList4;
                } catch (Throwable th) {
                    throw th;
                }
            case 13:
                fuf fufVar = (fuf) obj;
                lrd lrdVar5 = fufVar.a;
                lrdVar5.c();
                try {
                    fufVar.b.B((n2h) obj2);
                    lrdVar5.q();
                    return qqgVar;
                } finally {
                    lrdVar5.k();
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                cursorN = ((fuf) obj).a.n((dsd) obj2);
                try {
                    int iC18 = s7j.c(cursorN, "finished");
                    int iC19 = s7j.c(cursorN, "prepared_path");
                    int iC20 = s7j.c(cursorN, "result_path");
                    int iC21 = s7j.c(cursorN, "source_uri");
                    int iC22 = s7j.c(cursorN, "quality");
                    int iC23 = s7j.c(cursorN, "start_trim_position");
                    int iC24 = s7j.c(cursorN, "end_trim_position");
                    int iC25 = s7j.c(cursorN, "mute");
                    if (cursorN.moveToFirst()) {
                        m2h m2hVar = new m2h();
                        if (cursorN.isNull(iC21)) {
                            m2hVar.a = null;
                        } else {
                            m2hVar.a = cursorN.getString(iC21);
                        }
                        m2hVar.b = coi.e(cursorN.isNull(iC22) ? null : Integer.valueOf(cursorN.getInt(iC22)));
                        m2hVar.c = cursorN.getFloat(iC23);
                        m2hVar.d = cursorN.getFloat(iC24);
                        m2hVar.e = cursorN.getInt(iC25) != 0;
                        n2h n2hVar3 = new n2h();
                        n2hVar3.b = cursorN.getInt(iC18) != 0;
                        if (cursorN.isNull(iC19)) {
                            n2hVar3.c = null;
                        } else {
                            n2hVar3.c = cursorN.getString(iC19);
                        }
                        if (cursorN.isNull(iC20)) {
                            n2hVar3.d = null;
                        } else {
                            n2hVar3.d = cursorN.getString(iC20);
                        }
                        n2hVar3.a = m2hVar;
                        n2hVar = n2hVar3;
                    } else {
                        n2hVar = null;
                    }
                    return n2hVar;
                } finally {
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ewg ewgVar = (ewg) obj;
                lrdVar3 = ewgVar.a;
                lrdVar3.c();
                try {
                    ewgVar.b.B((cug) obj2);
                    lrdVar3.q();
                    return null;
                } finally {
                }
            case 16:
                ewg ewgVar2 = (ewg) obj;
                crd crdVar = ewgVar2.e;
                lrdVar3 = ewgVar2.a;
                vk6 vk6VarA2 = crdVar.a();
                String str2 = (String) obj2;
                if (str2 == null) {
                    vk6VarA2.S(1);
                } else {
                    vk6VarA2.f(1, str2);
                }
                try {
                    lrdVar3.c();
                    try {
                        vk6VarA2.w();
                        lrdVar3.q();
                        return null;
                    } finally {
                    }
                } finally {
                    crdVar.r(vk6VarA2);
                }
            case LangUtils.HASH_SEED /* 17 */:
                o2h o2hVar = (o2h) obj;
                lrd lrdVar6 = o2hVar.a;
                lrdVar6.c();
                try {
                    o2hVar.b.B((n2h) obj2);
                    lrdVar6.q();
                    return null;
                } finally {
                    lrdVar6.k();
                }
            case 18:
                cursorN2 = ((o2h) obj).a.n((dsd) obj2);
                try {
                    int iC26 = s7j.c(cursorN2, "finished");
                    int iC27 = s7j.c(cursorN2, "prepared_path");
                    int iC28 = s7j.c(cursorN2, "result_path");
                    int iC29 = s7j.c(cursorN2, "source_uri");
                    int iC30 = s7j.c(cursorN2, "quality");
                    int iC31 = s7j.c(cursorN2, "start_trim_position");
                    int iC32 = s7j.c(cursorN2, "end_trim_position");
                    int iC33 = s7j.c(cursorN2, "mute");
                    if (cursorN2.moveToFirst()) {
                        m2h m2hVar2 = new m2h();
                        if (cursorN2.isNull(iC29)) {
                            m2hVar2.a = null;
                        } else {
                            m2hVar2.a = cursorN2.getString(iC29);
                        }
                        m2hVar2.b = coi.e(cursorN2.isNull(iC30) ? null : Integer.valueOf(cursorN2.getInt(iC30)));
                        m2hVar2.c = cursorN2.getFloat(iC31);
                        m2hVar2.d = cursorN2.getFloat(iC32);
                        m2hVar2.e = cursorN2.getInt(iC33) != 0;
                        n2h n2hVar4 = new n2h();
                        n2hVar4.b = cursorN2.getInt(iC26) != 0;
                        if (cursorN2.isNull(iC27)) {
                            n2hVar4.c = null;
                        } else {
                            n2hVar4.c = cursorN2.getString(iC27);
                        }
                        if (cursorN2.isNull(iC28)) {
                            n2hVar4.d = null;
                        } else {
                            n2hVar4.d = cursorN2.getString(iC28);
                        }
                        n2hVar4.a = m2hVar2;
                        n2hVar2 = n2hVar4;
                    } else {
                        n2hVar2 = null;
                    }
                    return n2hVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 19:
                s5i s5iVar = (s5i) obj;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s5iVar.a;
                workDatabase_Impl.c();
                try {
                    Cursor cursorD = u7j.d(workDatabase_Impl, (dsd) obj2);
                    try {
                        us usVar = new us(0);
                        us usVar2 = new us(0);
                        while (cursorD.moveToNext()) {
                            String string2 = cursorD.getString(0);
                            if (((ArrayList) usVar.get(string2)) == null) {
                                usVar.put(string2, new ArrayList());
                            }
                            String string3 = cursorD.getString(0);
                            if (((ArrayList) usVar2.get(string3)) == null) {
                                usVar2.put(string3, new ArrayList());
                            }
                        }
                        cursorD.moveToPosition(-1);
                        s5iVar.b(usVar);
                        s5iVar.a(usVar2);
                        ArrayList arrayList5 = new ArrayList(cursorD.getCount());
                        while (cursorD.moveToNext()) {
                            String string4 = cursorD.isNull(0) ? null : cursorD.getString(0);
                            w4i w4iVarH = to8.h(cursorD.getInt(1));
                            yd4 yd4VarA = yd4.a(cursorD.isNull(2) ? null : cursorD.getBlob(2));
                            int i4 = cursorD.getInt(3);
                            int i5 = cursorD.getInt(4);
                            ArrayList arrayList6 = (ArrayList) usVar.get(cursorD.getString(0));
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = (ArrayList) usVar2.get(cursorD.getString(0));
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList5.add(new q5i(string4, w4iVarH, yd4VarA, i4, i5, arrayList7, arrayList8));
                        }
                        workDatabase_Impl.q();
                        cursorD.close();
                        return arrayList5;
                    } catch (Throwable th3) {
                        cursorD.close();
                        throw th3;
                    }
                } finally {
                    workDatabase_Impl.k();
                }
            default:
                u1a u1aVar = (u1a) obj2;
                nm7 nm7Var = (nm7) obj;
                HashMap map = d0j.X;
                u1j.v();
                int i6 = s1j.a;
                u1j.v();
                if (Boolean.parseBoolean("")) {
                    HashMap map2 = d0j.X;
                    if (map2.get("detectorTaskWithResource#run") == null) {
                        map2.put("detectorTaskWithResource#run", new d0j("detectorTaskWithResource#run"));
                    }
                    d0jVar = (d0j) map2.get("detectorTaskWithResource#run");
                } else {
                    d0jVar = a0j.Y;
                }
                d0j d0jVar2 = d0jVar;
                d0jVar2.l();
                try {
                    List listT = u1aVar.b.t(nm7Var);
                    d0jVar2.close();
                    return listT;
                } finally {
                }
        }
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 7:
                ((dsd) this.b).y();
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((dsd) this.b).y();
                break;
            case 18:
                ((dsd) this.b).y();
                break;
            case 19:
                ((dsd) this.b).y();
                break;
            default:
                super.finalize();
                break;
        }
    }

    public /* synthetic */ jad(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
