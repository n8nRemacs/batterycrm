package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ci implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ci(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    private final Object a() {
        x55 x55Var;
        lrd lrdVar = ((wpa) this.c).a;
        dsd dsdVar = (dsd) this.b;
        Cursor cursorN = lrdVar.n(dsdVar);
        try {
            int iC = s7j.c(cursorN, "chat_id");
            int iC2 = s7j.c(cursorN, "message_id");
            int iC3 = s7j.c(cursorN, "time");
            int iC4 = s7j.c(cursorN, "fcm");
            int iC5 = s7j.c(cursorN, "drop_reason");
            vpa vpaVar = null;
            if (cursorN.moveToFirst()) {
                long j = cursorN.getLong(iC);
                long j2 = cursorN.getLong(iC2);
                long j3 = cursorN.getLong(iC3);
                Integer numValueOf = cursorN.isNull(iC4) ? null : Integer.valueOf(cursorN.getInt(iC4));
                Boolean boolValueOf = numValueOf == null ? null : Boolean.valueOf(numValueOf.intValue() != 0);
                String string = cursorN.isNull(iC5) ? null : cursorN.getString(iC5);
                x55[] x55VarArr = x55.b;
                if (string != null) {
                    for (x55 x55Var2 : x55.b) {
                        if (x55Var2.a.equalsIgnoreCase(string)) {
                            x55Var = x55Var2;
                            break;
                        }
                    }
                }
                x55Var = null;
                vpaVar = new vpa(j, j2, j3, boolValueOf, x55Var);
            }
            return vpaVar;
        } finally {
            cursorN.close();
            dsdVar.y();
        }
    }

    private final Object b() {
        Cursor cursorN = ((lrd) ((jdc) this.c).b).n((dsd) this.b);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "server_id");
            int iC3 = s7j.c(cursorN, "profile");
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(new ghc(cursorN.getLong(iC), cursorN.getLong(iC2), l6j.b(cursorN.isNull(iC3) ? null : cursorN.getBlob(iC3))));
            }
            return arrayList;
        } finally {
            cursorN.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [lrd] */
    /* JADX WARN: Type inference failed for: r0v13, types: [lrd] */
    /* JADX WARN: Type inference failed for: r0v156, types: [lrd] */
    /* JADX WARN: Type inference failed for: r0v28, types: [lrd] */
    /* JADX WARN: Type inference failed for: r12v1, types: [rg2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [lrd] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        dsd dsdVar;
        dsd dsdVar2;
        ot5 ot5Var;
        switch (this.a) {
            case 0:
                ei eiVar = (ei) this.c;
                lrd lrdVar = eiVar.a;
                lrdVar.c();
                try {
                    eiVar.b.A((ArrayList) this.b);
                    lrdVar.q();
                    lrdVar.k();
                    return qqg.a;
                } catch (Throwable th) {
                    lrdVar.k();
                    throw th;
                }
            case 1:
                ek ekVar = (ek) this.c;
                lrd lrdVar2 = ekVar.a;
                lrdVar2.c();
                try {
                    ekVar.b.A((ArrayList) this.b);
                    lrdVar2.q();
                    lrdVar2.k();
                    return qqg.a;
                } catch (Throwable th2) {
                    lrdVar2.k();
                    throw th2;
                }
            case 2:
                Cursor cursorN = ((ek) this.c).a.n((dsd) this.b);
                try {
                    int iC = s7j.c(cursorN, "id");
                    int iC2 = s7j.c(cursorN, SdkMetricStatEvent.NAME_KEY);
                    int iC3 = s7j.c(cursorN, "icon_url");
                    int iC4 = s7j.c(cursorN, "icon_lottie_url");
                    int iC5 = s7j.c(cursorN, "update_time");
                    int iC6 = s7j.c(cursorN, "animoji_ids");
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        long j = cursorN.getLong(iC);
                        String string = null;
                        String string2 = cursorN.isNull(iC2) ? null : cursorN.getString(iC2);
                        String string3 = cursorN.isNull(iC3) ? null : cursorN.getString(iC3);
                        String string4 = cursorN.isNull(iC4) ? null : cursorN.getString(iC4);
                        long j2 = cursorN.getLong(iC5);
                        if (!cursorN.isNull(iC6)) {
                            string = cursorN.getString(iC6);
                        }
                        arrayList.add(new dk(j, string2, string3, string4, j2, z7.j(string)));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                m03 m03Var = (m03) this.c;
                Cursor cursorN2 = m03Var.a.n((dsd) this.b);
                try {
                    int iC7 = s7j.c(cursorN2, "id");
                    int iC8 = s7j.c(cursorN2, "server_id");
                    int iC9 = s7j.c(cursorN2, "data");
                    int iC10 = s7j.c(cursorN2, "favourite_index");
                    int iC11 = s7j.c(cursorN2, "sort_time");
                    int iC12 = s7j.c(cursorN2, "cid");
                    byte[] blob = null;
                    if (cursorN2.moveToFirst()) {
                        long j3 = cursorN2.getLong(iC7);
                        long j4 = cursorN2.getLong(iC8);
                        if (!cursorN2.isNull(iC9)) {
                            blob = cursorN2.getBlob(iC9);
                        }
                        blob = new rg2(j3, j4, m03Var.a().c(blob), cursorN2.getLong(iC10), cursorN2.getLong(iC11), cursorN2.getLong(iC12));
                    }
                    return blob;
                } finally {
                }
            case 4:
                mj3 mj3Var = (mj3) this.c;
                lrd lrdVar3 = mj3Var.a;
                lrdVar3.c();
                try {
                    mj3Var.b.A((ArrayList) this.b);
                    lrdVar3.q();
                    lrdVar3.k();
                    return qqg.a;
                } catch (Throwable th3) {
                    lrdVar3.k();
                    throw th3;
                }
            case 5:
                Cursor cursorN3 = ((mj3) this.c).a.n((dsd) this.b);
                try {
                    int iC13 = s7j.c(cursorN3, "id");
                    int iC14 = s7j.c(cursorN3, "type_id");
                    int iC15 = s7j.c(cursorN3, "complain_reasons");
                    nj3 nj3Var = null;
                    String string5 = null;
                    if (cursorN3.moveToFirst()) {
                        long j5 = cursorN3.getLong(iC13);
                        byte b = (byte) cursorN3.getShort(iC14);
                        if (!cursorN3.isNull(iC15)) {
                            string5 = cursorN3.getString(iC15);
                        }
                        nj3Var = new nj3(j5, b, c5j.a(string5));
                    }
                    return nj3Var;
                } finally {
                }
            case 6:
                m35 m35Var = (m35) this.c;
                OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl = m35Var.a;
                oneMeRoomDatabase_Impl.c();
                try {
                    m35Var.b.B((g35) this.b);
                    oneMeRoomDatabase_Impl.q();
                    oneMeRoomDatabase_Impl.k();
                    return null;
                } catch (Throwable th4) {
                    oneMeRoomDatabase_Impl.k();
                    throw th4;
                }
            case 7:
                hs5 hs5Var = (hs5) this.c;
                lrd lrdVar4 = hs5Var.a;
                lrdVar4.c();
                try {
                    hs5Var.b.A((ArrayList) this.b);
                    lrdVar4.q();
                    lrdVar4.k();
                    return null;
                } finally {
                }
            case 8:
                Cursor cursorN4 = ((hs5) this.c).a.n((dsd) this.b);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorN4.getCount());
                    while (cursorN4.moveToNext()) {
                        arrayList2.add(cursorN4.isNull(0) ? null : Long.valueOf(cursorN4.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
            case 9:
                hs5 hs5Var2 = (hs5) this.c;
                StringBuilder sbM = az1.m("DELETE FROM favorite_sticker_sets WHERE id IN (");
                List<Long> list = (List) this.b;
                int i = 1;
                lc4.a(sbM, list == null ? 1 : list.size());
                sbM.append(")");
                String string6 = sbM.toString();
                lrd lrdVar5 = hs5Var2.a;
                vk6 vk6VarD = lrdVar5.d(string6);
                if (list == null) {
                    vk6VarD.S(1);
                } else {
                    for (Long l : list) {
                        if (l == null) {
                            vk6VarD.S(i);
                        } else {
                            vk6VarD.k(i, l.longValue());
                        }
                        i++;
                    }
                }
                lrdVar5.c();
                try {
                    vk6VarD.w();
                    lrdVar5.q();
                    lrdVar5.k();
                    return null;
                } finally {
                }
            case 10:
                qs5 qs5Var = (qs5) this.c;
                lrd lrdVar6 = qs5Var.a;
                lrdVar6.c();
                try {
                    qs5Var.b.A((ArrayList) this.b);
                    lrdVar6.q();
                    lrdVar6.k();
                    return null;
                } finally {
                }
            case 11:
                Cursor cursorN5 = ((qs5) this.c).a.n((dsd) this.b);
                try {
                    ArrayList arrayList3 = new ArrayList(cursorN5.getCount());
                    while (cursorN5.moveToNext()) {
                        arrayList3.add(cursorN5.isNull(0) ? null : Long.valueOf(cursorN5.getLong(0)));
                    }
                    return arrayList3;
                } finally {
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                qs5 qs5Var2 = (qs5) this.c;
                StringBuilder sbM2 = az1.m("DELETE FROM favorite_stickers WHERE id IN (");
                List<Long> list2 = (List) this.b;
                int i2 = 1;
                lc4.a(sbM2, list2 == null ? 1 : list2.size());
                sbM2.append(")");
                String string7 = sbM2.toString();
                lrd lrdVar7 = qs5Var2.a;
                vk6 vk6VarD2 = lrdVar7.d(string7);
                if (list2 == null) {
                    vk6VarD2.S(1);
                } else {
                    for (Long l2 : list2) {
                        if (l2 == null) {
                            vk6VarD2.S(i2);
                        } else {
                            vk6VarD2.k(i2, l2.longValue());
                        }
                        i2++;
                    }
                }
                lrdVar7.c();
                try {
                    vk6VarD2.w();
                    lrdVar7.q();
                    lrdVar7.k();
                    return null;
                } finally {
                }
            case 13:
                vs5 vs5Var = (vs5) this.c;
                lrd lrdVar8 = vs5Var.a;
                lrdVar8.c();
                try {
                    vs5Var.b.A((Iterable) this.b);
                    lrdVar8.q();
                    lrdVar8.k();
                    return qqg.a;
                } catch (Throwable th5) {
                    lrdVar8.k();
                    throw th5;
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                lrd lrdVar9 = ((vs5) this.c).a;
                dsd dsdVar3 = (dsd) this.b;
                Cursor cursorN6 = lrdVar9.n(dsdVar3);
                try {
                    int iC16 = s7j.c(cursorN6, "push_id");
                    int iC17 = s7j.c(cursorN6, "chat_id");
                    int iC18 = s7j.c(cursorN6, "msg_id");
                    int iC19 = s7j.c(cursorN6, "analytics_status");
                    int iC20 = s7j.c(cursorN6, "suid");
                    int iC21 = s7j.c(cursorN6, "content_length");
                    int iC22 = s7j.c(cursorN6, "sent_time");
                    int iC23 = s7j.c(cursorN6, "event_key");
                    int iC24 = s7j.c(cursorN6, "fcm_sent_time");
                    int iC25 = s7j.c(cursorN6, "received_time");
                    int iC26 = s7j.c(cursorN6, "push_type");
                    int iC27 = s7j.c(cursorN6, "time");
                    int iC28 = s7j.c(cursorN6, "created_time");
                    dsdVar = dsdVar3;
                    try {
                        ArrayList arrayList4 = new ArrayList(cursorN6.getCount());
                        while (cursorN6.moveToNext()) {
                            long j6 = cursorN6.getLong(iC16);
                            long j7 = cursorN6.getLong(iC17);
                            long j8 = cursorN6.getLong(iC18);
                            int i3 = cursorN6.getInt(iC19);
                            int i4 = iC16;
                            int[] iArrY = az1.y(3);
                            int i5 = iC17;
                            int length = iArrY.length;
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                if (i7 < length) {
                                    int i8 = iArrY[i7];
                                    int i9 = i7;
                                    if (az1.v(i8) == i3) {
                                        i6 = i8;
                                    } else {
                                        i7 = i9 + 1;
                                    }
                                }
                            }
                            if (i6 == 0) {
                                i6 = 1;
                            }
                            arrayList4.add(new ws5(j6, j7, j8, i6, cursorN6.isNull(iC20) ? null : Long.valueOf(cursorN6.getLong(iC20)), cursorN6.getLong(iC21), cursorN6.isNull(iC22) ? null : Long.valueOf(cursorN6.getLong(iC22)), cursorN6.isNull(iC23) ? null : cursorN6.getString(iC23), cursorN6.getLong(iC24), cursorN6.getLong(iC25), cursorN6.isNull(iC26) ? null : cursorN6.getString(iC26), cursorN6.getLong(iC27), cursorN6.getLong(iC28)));
                            iC16 = i4;
                            iC17 = i5;
                        }
                        cursorN6.close();
                        dsdVar.y();
                        return arrayList4;
                    } catch (Throwable th6) {
                        th = th6;
                        cursorN6.close();
                        dsdVar.y();
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    dsdVar = dsdVar3;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                mt5 mt5Var = (mt5) this.c;
                lrd lrdVar10 = mt5Var.a;
                lrdVar10.c();
                try {
                    mt5Var.b.A((ArrayList) this.b);
                    lrdVar10.q();
                    lrdVar10.k();
                    return qqg.a;
                } catch (Throwable th8) {
                    lrdVar10.k();
                    throw th8;
                }
            case 16:
                Cursor cursorN7 = ((mt5) this.c).a.n((dsd) this.b);
                try {
                    int iC29 = s7j.c(cursorN7, "chat_id");
                    int iC30 = s7j.c(cursorN7, "last_notify_msg_id");
                    ArrayList arrayList5 = new ArrayList(cursorN7.getCount());
                    while (cursorN7.moveToNext()) {
                        arrayList5.add(new nt5(cursorN7.getLong(iC29), cursorN7.getLong(iC30)));
                    }
                    return arrayList5;
                } finally {
                }
            case LangUtils.HASH_SEED /* 17 */:
                StringBuilder sbM3 = az1.m("DELETE FROM informer_banner WHERE id in (");
                ArrayList arrayList6 = (ArrayList) this.b;
                lc4.a(sbM3, arrayList6.size());
                sbM3.append(")");
                String string8 = sbM3.toString();
                lrd lrdVar11 = ((gk7) this.c).a;
                vk6 vk6VarD3 = lrdVar11.d(string8);
                Iterator it = arrayList6.iterator();
                int i10 = 1;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str == null) {
                        vk6VarD3.S(i10);
                    } else {
                        vk6VarD3.f(i10, str);
                    }
                    i10++;
                }
                lrdVar11.c();
                try {
                    vk6VarD3.w();
                    lrdVar11.q();
                    lrdVar11.k();
                    return qqg.a;
                } finally {
                }
            case 18:
                gk7 gk7Var = (gk7) this.c;
                lrd lrdVar12 = gk7Var.a;
                lrdVar12.c();
                try {
                    gk7Var.b.B((vk7) this.b);
                    lrdVar12.q();
                    lrdVar12.k();
                    return qqg.a;
                } finally {
                }
            case 19:
                gk7 gk7Var2 = (gk7) this.c;
                lrd lrdVar13 = gk7Var2.a;
                lrdVar13.c();
                try {
                    gk7Var2.b.A((List) this.b);
                    lrdVar13.q();
                    lrdVar13.k();
                    return qqg.a;
                } finally {
                }
            case 20:
                an9 an9Var = (an9) this.c;
                lrd lrdVar14 = an9Var.a;
                lrdVar14.c();
                try {
                    an9Var.b.B((wm9) this.b);
                    lrdVar14.q();
                    lrdVar14.k();
                    return null;
                } catch (Throwable th9) {
                    lrdVar14.k();
                    throw th9;
                }
            case 21:
                lrd lrdVar15 = ((wna) this.c).a;
                dsd dsdVar4 = (dsd) this.b;
                Cursor cursorN8 = lrdVar15.n(dsdVar4);
                try {
                    int iC31 = s7j.c(cursorN8, "chat_id");
                    int iC32 = s7j.c(cursorN8, "message_id");
                    int iC33 = s7j.c(cursorN8, "type");
                    int iC34 = s7j.c(cursorN8, "chat_title");
                    int iC35 = s7j.c(cursorN8, "sender_user_name");
                    int iC36 = s7j.c(cursorN8, "sender_user_id");
                    int iC37 = s7j.c(cursorN8, "time");
                    int iC38 = s7j.c(cursorN8, "text");
                    int iC39 = s7j.c(cursorN8, "push_id");
                    int iC40 = s7j.c(cursorN8, "event_key");
                    int iC41 = s7j.c(cursorN8, "large_image_url");
                    int iC42 = s7j.c(cursorN8, "fire_m");
                    int iC43 = s7j.c(cursorN8, "has_any_error");
                    dsdVar2 = dsdVar4;
                    try {
                        ArrayList arrayList7 = new ArrayList(cursorN8.getCount());
                        while (cursorN8.moveToNext()) {
                            long j9 = cursorN8.getLong(iC31);
                            long j10 = cursorN8.getLong(iC32);
                            String string9 = cursorN8.isNull(iC33) ? null : cursorN8.getString(iC33);
                            int i11 = iC31;
                            ot5[] ot5VarArr = ot5.b;
                            int i12 = iC32;
                            int length2 = ot5VarArr.length;
                            int i13 = 0;
                            while (true) {
                                if (i13 < length2) {
                                    int i14 = i13;
                                    ot5Var = ot5VarArr[i14];
                                    int i15 = length2;
                                    if (!ot5Var.a.equals(string9)) {
                                        i13 = i14 + 1;
                                        length2 = i15;
                                    }
                                } else {
                                    ot5Var = null;
                                }
                            }
                            if (ot5Var == null) {
                                ot5Var = ot5.UNKNOWN;
                            }
                            arrayList7.add(new lt5(j9, j10, ot5Var, cursorN8.isNull(iC34) ? null : cursorN8.getString(iC34), cursorN8.isNull(iC35) ? null : cursorN8.getString(iC35), cursorN8.getLong(iC36), cursorN8.getLong(iC37), cursorN8.isNull(iC38) ? null : cursorN8.getString(iC38), cursorN8.getLong(iC39), cursorN8.isNull(iC40) ? null : cursorN8.getString(iC40), cursorN8.isNull(iC41) ? null : cursorN8.getString(iC41), cursorN8.getInt(iC42) != 0, cursorN8.getInt(iC43) != 0));
                            iC31 = i11;
                            iC32 = i12;
                        }
                        cursorN8.close();
                        dsdVar2.y();
                        return arrayList7;
                    } catch (Throwable th10) {
                        th = th10;
                        cursorN8.close();
                        dsdVar2.y();
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    dsdVar2 = dsdVar4;
                }
            case 22:
                wna wnaVar = (wna) this.c;
                lrd lrdVar16 = wnaVar.a;
                lrdVar16.c();
                try {
                    wnaVar.b.B((lt5) this.b);
                    lrdVar16.q();
                    lrdVar16.k();
                    return qqg.a;
                } catch (Throwable th12) {
                    lrdVar16.k();
                    throw th12;
                }
            case 23:
                Cursor cursorN9 = ((coa) this.c).a.n((dsd) this.b);
                try {
                    int iC44 = s7j.c(cursorN9, "chat_id");
                    int iC45 = s7j.c(cursorN9, "mark");
                    ArrayList arrayList8 = new ArrayList(cursorN9.getCount());
                    while (cursorN9.moveToNext()) {
                        arrayList8.add(new cna(cursorN9.getLong(iC44), cursorN9.getLong(iC45)));
                    }
                    return arrayList8;
                } finally {
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                wpa wpaVar = (wpa) this.c;
                lrd lrdVar17 = wpaVar.a;
                lrdVar17.c();
                try {
                    wpaVar.b.A((List) this.b);
                    lrdVar17.q();
                    lrdVar17.k();
                    return qqg.a;
                } finally {
                }
            case 25:
                return a();
            case 26:
                StringBuilder sbM4 = az1.m("DELETE FROM notifications_tracker_messages WHERE chat_id||'_'||message_id in (");
                ArrayList arrayList9 = (ArrayList) this.b;
                lc4.a(sbM4, arrayList9.size());
                sbM4.append(")");
                String string10 = sbM4.toString();
                lrd lrdVar18 = ((wpa) this.c).a;
                vk6 vk6VarD4 = lrdVar18.d(string10);
                Iterator it2 = arrayList9.iterator();
                int i16 = 1;
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (str2 == null) {
                        vk6VarD4.S(i16);
                    } else {
                        vk6VarD4.f(i16, str2);
                    }
                    i16++;
                }
                lrdVar18.c();
                try {
                    Integer numValueOf = Integer.valueOf(vk6VarD4.w());
                    lrdVar18.q();
                    return numValueOf;
                } finally {
                }
            case 27:
                jdc jdcVar = (jdc) this.c;
                lrd lrdVar19 = (lrd) jdcVar.b;
                lrdVar19.c();
                try {
                    ((ai) jdcVar.c).B((ghc) this.b);
                    lrdVar19.q();
                    lrdVar19.k();
                    return qqg.a;
                } catch (Throwable th13) {
                    lrdVar19.k();
                    throw th13;
                }
            case 28:
                return b();
            default:
                kad kadVar = (kad) this.c;
                lrd lrdVar20 = kadVar.a;
                lrdVar20.c();
                try {
                    kadVar.b.B((iad) this.b);
                    lrdVar20.q();
                    lrdVar20.k();
                    return qqg.a;
                } catch (Throwable th14) {
                    lrdVar20.k();
                    throw th14;
                }
        }
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 8:
                ((dsd) this.b).y();
                break;
            case 11:
                ((dsd) this.b).y();
                break;
            case 28:
                ((dsd) this.b).y();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
