package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class qi9 {
    public final ie4 a;
    public final tw0 b;
    public final z7c c;
    public final dkb d;
    public final c7c e;
    public final kz4 f;
    public final String g;
    public t9f h;

    public qi9(ie4 ie4Var, tw0 tw0Var, z7c z7cVar, dkb dkbVar, c7c c7cVar, kz4 kz4Var, String str) {
        this.a = ie4Var;
        this.b = tw0Var;
        this.c = z7cVar;
        this.d = dkbVar;
        this.e = c7cVar;
        this.f = kz4Var;
        this.g = str;
    }

    public final long a(long j, long j2) {
        wqi.c("qi9", "countMessagesFrom chatId = %d, timeFrom = %d", Long.valueOf(j), Long.valueOf(j2));
        lq9 lq9VarD = this.a.c.d();
        lq9VarD.getClass();
        dsd dsdVarC = dsd.c(4, "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = ? AND status <> ?");
        dsdVarC.k(1, j);
        dsdVarC.k(2, j2);
        vb9.h(dsdVarC, 3, 0, lq9VarD);
        dsdVarC.k(4, 10);
        lrd lrdVar = lq9VarD.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            return cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public final void b(long j, long j2, long j3) throws Throwable {
        dsd dsdVar;
        long j4;
        long j5;
        lrd lrdVar;
        int i;
        int i2;
        boolean z;
        int i3;
        byte[] blob;
        ie4 ie4Var = this.a;
        bsd bsdVar = ie4Var.c;
        lq9 lq9VarD = bsdVar.d();
        lq9VarD.getClass();
        dsd dsdVarC = dsd.c(2, "SELECT * FROM messages WHERE time >= ? AND time <= ? AND msg_link_id > 0");
        dsdVarC.k(1, j2);
        dsdVarC.k(2, BuildConfig.MAX_TIME_TO_UPLOAD);
        lrd lrdVar2 = lq9VarD.a;
        lrdVar2.b();
        Cursor cursorN = lrdVar2.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "server_id");
            int iC3 = s7j.c(cursorN, "time");
            int iC4 = s7j.c(cursorN, "update_time");
            int iC5 = s7j.c(cursorN, "sender");
            dsdVar = dsdVarC;
            try {
                int iC6 = s7j.c(cursorN, "cid");
                try {
                    int iC7 = s7j.c(cursorN, "text");
                    int iC8 = s7j.c(cursorN, "delivery_status");
                    int iC9 = s7j.c(cursorN, "status");
                    int iC10 = s7j.c(cursorN, "time_local");
                    int iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
                    int iC12 = s7j.c(cursorN, "localized_error");
                    int iC13 = s7j.c(cursorN, "attaches");
                    int iC14 = s7j.c(cursorN, "media_type");
                    int iC15 = s7j.c(cursorN, "detect_share");
                    int iC16 = s7j.c(cursorN, "msg_link_type");
                    int iC17 = s7j.c(cursorN, "msg_link_id");
                    int iC18 = s7j.c(cursorN, "inserted_from_msg_link");
                    int iC19 = s7j.c(cursorN, "msg_link_chat_id");
                    int iC20 = s7j.c(cursorN, "msg_link_chat_name");
                    int iC21 = s7j.c(cursorN, "msg_link_chat_link");
                    int iC22 = s7j.c(cursorN, "msg_link_chat_icon_url");
                    int iC23 = s7j.c(cursorN, "msg_link_chat_access_type");
                    int iC24 = s7j.c(cursorN, "msg_link_out_chat_id");
                    int iC25 = s7j.c(cursorN, "msg_link_out_msg_id");
                    int iC26 = s7j.c(cursorN, "type");
                    int iC27 = s7j.c(cursorN, "chat_id");
                    int iC28 = s7j.c(cursorN, "channel_views");
                    int iC29 = s7j.c(cursorN, "channel_forwards");
                    int iC30 = s7j.c(cursorN, "view_time");
                    int iC31 = s7j.c(cursorN, "options");
                    int iC32 = s7j.c(cursorN, "live_until");
                    int iC33 = s7j.c(cursorN, "elements");
                    int iC34 = s7j.c(cursorN, "reactions");
                    int iC35 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
                    int iC36 = s7j.c(cursorN, "delayed_attrs_notify_sender");
                    int iC37 = s7j.c(cursorN, "reactions_update_time");
                    int i4 = iC14;
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        long j6 = cursorN.getLong(iC);
                        long j7 = cursorN.getLong(iC2);
                        long j8 = cursorN.getLong(iC3);
                        long j9 = cursorN.getLong(iC4);
                        long j10 = cursorN.getLong(iC5);
                        long j11 = cursorN.getLong(iC6);
                        Boolean boolValueOf = null;
                        String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                        int i5 = cursorN.getInt(iC8);
                        lq9VarD.b().getClass();
                        xi9 xi9VarB = ky9.b(i5);
                        int i6 = cursorN.getInt(iC9);
                        lq9VarD.b().getClass();
                        jm9 jm9VarD = ky9.d(i6);
                        long j12 = cursorN.getLong(iC10);
                        String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                        String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                        byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                        lq9VarD.b().getClass();
                        jdc jdcVarA = ky9.a(blob2);
                        int i7 = i4;
                        int i8 = cursorN.getInt(i7);
                        i4 = i7;
                        int i9 = iC15;
                        if (cursorN.getInt(i9) != 0) {
                            int i10 = iC16;
                            i = i9;
                            i2 = i10;
                            z = true;
                        } else {
                            int i11 = iC16;
                            i = i9;
                            i2 = i11;
                            z = false;
                        }
                        int i12 = cursorN.getInt(i2);
                        int i13 = i2;
                        int i14 = iC17;
                        long j13 = cursorN.getLong(i14);
                        iC17 = i14;
                        int i15 = iC18;
                        boolean z2 = cursorN.getInt(i15) != 0;
                        iC18 = i15;
                        int i16 = iC19;
                        long j14 = cursorN.getLong(i16);
                        iC19 = i16;
                        int i17 = iC20;
                        String string4 = cursorN.isNull(i17) ? null : cursorN.getString(i17);
                        iC20 = i17;
                        int i18 = iC21;
                        String string5 = cursorN.isNull(i18) ? null : cursorN.getString(i18);
                        iC21 = i18;
                        int i19 = iC22;
                        String string6 = cursorN.isNull(i19) ? null : cursorN.getString(i19);
                        iC22 = i19;
                        int i20 = iC23;
                        Integer numValueOf = cursorN.isNull(i20) ? null : Integer.valueOf(cursorN.getInt(i20));
                        lq9VarD.a().getClass();
                        int iA = m73.a(numValueOf);
                        iC23 = i20;
                        int i21 = iC24;
                        long j15 = cursorN.getLong(i21);
                        iC24 = i21;
                        int i22 = iC25;
                        long j16 = cursorN.getLong(i22);
                        iC25 = i22;
                        int i23 = iC26;
                        int i24 = cursorN.getInt(i23);
                        lq9VarD.b().getClass();
                        int iE = ky9.e(i24);
                        iC26 = i23;
                        int i25 = iC27;
                        long j17 = cursorN.getLong(i25);
                        iC27 = i25;
                        int i26 = iC28;
                        int i27 = cursorN.getInt(i26);
                        iC28 = i26;
                        int i28 = iC29;
                        int i29 = cursorN.getInt(i28);
                        iC29 = i28;
                        int i30 = iC30;
                        long j18 = cursorN.getLong(i30);
                        iC30 = i30;
                        int i31 = iC31;
                        int i32 = cursorN.getInt(i31);
                        iC31 = i31;
                        int i33 = iC32;
                        long j19 = cursorN.getLong(i33);
                        iC32 = i33;
                        int i34 = iC33;
                        byte[] blob3 = cursorN.isNull(i34) ? null : cursorN.getBlob(i34);
                        lq9VarD.b().getClass();
                        List listC = ky9.c(blob3);
                        iC33 = i34;
                        int i35 = iC34;
                        if (cursorN.isNull(i35)) {
                            i3 = i35;
                            blob = null;
                        } else {
                            i3 = i35;
                            blob = cursorN.getBlob(i35);
                        }
                        int i36 = iC7;
                        xl9 xl9VarF = lq9VarD.b().f(blob);
                        int i37 = iC35;
                        Long lValueOf = cursorN.isNull(i37) ? null : Long.valueOf(cursorN.getLong(i37));
                        int i38 = iC36;
                        Integer numValueOf2 = cursorN.isNull(i38) ? null : Integer.valueOf(cursorN.getInt(i38));
                        if (numValueOf2 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        iC35 = i37;
                        int i39 = iC37;
                        iC37 = i39;
                        arrayList.add(new gj9(j6, j7, j8, j9, j10, j11, string, xi9VarB, jm9VarD, j12, string2, string3, jdcVarA, i8, z, i12, j13, z2, j14, string4, string5, string6, iA, j15, j16, iE, j17, i27, i29, j18, i32, j19, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i39)));
                        iC36 = i38;
                        iC15 = i;
                        iC7 = i36;
                        iC16 = i13;
                        iC34 = i3;
                    }
                    cursorN.close();
                    dsdVar.y();
                    ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(bsdVar.b((gj9) it.next()));
                    }
                    ArrayList arrayList3 = new ArrayList(arrayList2.size());
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        try {
                            si9 si9Var = ((si9) it2.next()).A0;
                            arrayList3.add(Long.valueOf(si9Var != null ? si9Var.a : 0L));
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    bsd bsdVar2 = ie4Var.c;
                    rs4 rs4Var = rs4.REGULAR;
                    bsdVar2.getClass();
                    int iOrdinal = rs4Var.ordinal();
                    int i40 = 4;
                    if (iOrdinal == 0) {
                        j4 = j;
                        j5 = j3;
                        lrdVar = bsdVar2.d().a;
                        lrdVar.b();
                        StringBuilder sb = new StringBuilder();
                        sb.append("DELETE FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND id NOT IN (");
                        lc4.a(sb, arrayList3.size());
                        sb.append(")");
                        vk6 vk6VarD = lrdVar.d(sb.toString());
                        vk6VarD.k(1, j4);
                        vk6VarD.k(2, j2);
                        vk6VarD.k(3, j5);
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Long l = (Long) it3.next();
                            if (l == null) {
                                vk6VarD.S(i40);
                            } else {
                                vk6VarD.k(i40, l.longValue());
                            }
                            i40++;
                        }
                        lrdVar.c();
                        try {
                            vk6VarD.w();
                            lrdVar.q();
                        } finally {
                        }
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lrdVar = bsdVar2.d().a;
                        lrdVar.b();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND id NOT IN (");
                        lc4.a(sb2, arrayList3.size());
                        sb2.append(")");
                        vk6 vk6VarD2 = lrdVar.d(sb2.toString());
                        j4 = j;
                        vk6VarD2.k(1, j4);
                        vk6VarD2.k(2, j2);
                        j5 = j3;
                        vk6VarD2.k(3, j5);
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            Long l2 = (Long) it4.next();
                            if (l2 == null) {
                                vk6VarD2.S(i40);
                            } else {
                                vk6VarD2.k(i40, l2.longValue());
                            }
                            i40++;
                        }
                        lrdVar.c();
                        try {
                            vk6VarD2.w();
                            lrdVar.q();
                            lrdVar.k();
                        } finally {
                        }
                    }
                    this.b.c(new q4a(j4, j2, j5, rs4.REGULAR));
                } catch (Throwable th2) {
                    th = th2;
                    cursorN.close();
                    dsdVar.y();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            dsdVar = dsdVarC;
        }
    }

    public final void c(long j, Collection collection) throws IOException {
        Long lValueOf = Long.valueOf(j);
        int i = 7;
        wu7 wu7Var = new wu7(i, new p89(i));
        StringBuilder sb = new StringBuilder();
        ue3.L(collection, sb, ",", "[", "]", -1, "", wu7Var);
        wqi.c("qi9", "deleteMessages %d ids = %s", lValueOf, sb.toString());
        this.d.getClass();
        if (j != 0) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                dkb.b(j, ((Long) it.next()).longValue());
            }
        }
        c7c c7cVar = this.e;
        c7cVar.getClass();
        Iterator it2 = ue3.d0(collection).iterator();
        while (it2.hasNext()) {
            c7cVar.c.remove(Long.valueOf(((Number) it2.next()).longValue()));
        }
        lq9 lq9VarD = this.a.c.d();
        List<Long> listD0 = ue3.d0(collection);
        lrd lrdVar = lq9VarD.a;
        lrdVar.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM messages WHERE chat_id = ? AND id in (");
        lc4.a(sb2, listD0.size());
        sb2.append(")");
        vk6 vk6VarD = lrdVar.d(sb2.toString());
        vk6VarD.k(1, j);
        int i2 = 2;
        for (Long l : listD0) {
            if (l == null) {
                vk6VarD.S(i2);
            } else {
                vk6VarD.k(i2, l.longValue());
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

    public final int d(long j, long j2, rs4 rs4Var) {
        ConcurrentHashMap concurrentHashMap = this.e.c;
        Iterator it = ue3.d0(concurrentHashMap.values()).iterator();
        int i = 0;
        while (it.hasNext()) {
            si9 si9Var = ((d7c) it.next()).d;
            long j3 = si9Var.c;
            long j4 = si9Var.a;
            if (si9Var.Z == j) {
                int i2 = rs4Var == null ? -1 : b7c.$EnumSwitchMapping$0[rs4Var.ordinal()];
                if (i2 == -1 || i2 == 1) {
                    if (j3 <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j4));
                        i++;
                    }
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ss4 ss4Var = si9Var.Q0;
                    if (ss4Var != null && ss4Var.a <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j4));
                        i++;
                    }
                }
            }
        }
        if (i > 0) {
            wqi.c("c7c", "clearPreprocessedDataInChat: chatId = %d, itemType = %s, count = %d", Long.valueOf(j), rs4Var, Integer.valueOf(i));
        }
        return this.a.c.a(j, j2, rs4Var);
    }

    public final boolean e(long j, long j2) {
        return this.a.c.d().i(j, j2) != null;
    }

    public final long f(long j, long j2, fh9 fh9Var) {
        List listSingletonList = Collections.singletonList(fh9Var);
        t9f t9fVar = this.h;
        if (t9fVar != null) {
            try {
                t9fVar.accept(listSingletonList);
            } catch (Throwable th) {
                wqi.e("qi9", "validateMessages: exception", th);
            }
        }
        return this.a.c.e(j, j2, fh9Var);
    }

    public final void g(long j, long j2, List list) {
        t9f t9fVar = this.h;
        if (t9fVar != null) {
            try {
                t9fVar.accept(list);
            } catch (Throwable th) {
                wqi.e("qi9", "validateMessages: exception", th);
            }
        }
        bsd bsdVar = this.a.c;
        ((OneMeRoomDatabase) bsdVar.a.l()).p(new s50(list, bsdVar, j, j2, 1));
    }

    public final ArrayList h(long j) throws Throwable {
        dsd dsdVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        ArrayList arrayList;
        int i;
        byte[] blob;
        Boolean boolValueOf;
        dsd dsdVar2;
        int iC14;
        int iC15;
        int iC16;
        int iC17;
        int iC18;
        int iC19;
        int iC20;
        int iC21;
        int iC22;
        int iC23;
        int iC24;
        int iC25;
        int iC26;
        int iC27;
        int i2;
        byte[] blob2;
        Boolean boolValueOf2;
        bsd bsdVar = this.a.c;
        bsdVar.getClass();
        int iOrdinal = rs4.REGULAR.ordinal();
        if (iOrdinal == 0) {
            lq9 lq9VarD = bsdVar.d();
            lq9VarD.getClass();
            dsd dsdVarC = dsd.c(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            dsdVarC.k(1, j);
            dsdVarC.k(2, -1);
            lrd lrdVar = lq9VarD.a;
            lrdVar.b();
            Cursor cursorN = lrdVar.n(dsdVarC);
            try {
                iC = s7j.c(cursorN, "id");
                iC2 = s7j.c(cursorN, "server_id");
                iC3 = s7j.c(cursorN, "time");
                iC4 = s7j.c(cursorN, "update_time");
                iC5 = s7j.c(cursorN, "sender");
                iC6 = s7j.c(cursorN, "cid");
                iC7 = s7j.c(cursorN, "text");
                iC8 = s7j.c(cursorN, "delivery_status");
                iC9 = s7j.c(cursorN, "status");
                iC10 = s7j.c(cursorN, "time_local");
                iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
                iC12 = s7j.c(cursorN, "localized_error");
                iC13 = s7j.c(cursorN, "attaches");
                dsdVar = dsdVarC;
            } catch (Throwable th) {
                th = th;
                dsdVar = dsdVarC;
            }
            try {
                int iC28 = s7j.c(cursorN, "media_type");
                int iC29 = s7j.c(cursorN, "detect_share");
                int iC30 = s7j.c(cursorN, "msg_link_type");
                int iC31 = s7j.c(cursorN, "msg_link_id");
                int iC32 = s7j.c(cursorN, "inserted_from_msg_link");
                int iC33 = s7j.c(cursorN, "msg_link_chat_id");
                int iC34 = s7j.c(cursorN, "msg_link_chat_name");
                int iC35 = s7j.c(cursorN, "msg_link_chat_link");
                int iC36 = s7j.c(cursorN, "msg_link_chat_icon_url");
                int iC37 = s7j.c(cursorN, "msg_link_chat_access_type");
                int iC38 = s7j.c(cursorN, "msg_link_out_chat_id");
                int iC39 = s7j.c(cursorN, "msg_link_out_msg_id");
                int iC40 = s7j.c(cursorN, "type");
                int iC41 = s7j.c(cursorN, "chat_id");
                int iC42 = s7j.c(cursorN, "channel_views");
                int iC43 = s7j.c(cursorN, "channel_forwards");
                int iC44 = s7j.c(cursorN, "view_time");
                int iC45 = s7j.c(cursorN, "options");
                int iC46 = s7j.c(cursorN, "live_until");
                int iC47 = s7j.c(cursorN, "elements");
                int iC48 = s7j.c(cursorN, "reactions");
                int iC49 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
                int iC50 = s7j.c(cursorN, "delayed_attrs_notify_sender");
                int iC51 = s7j.c(cursorN, "reactions_update_time");
                int i3 = iC28;
                ArrayList arrayList2 = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j2 = cursorN.getLong(iC);
                    long j3 = cursorN.getLong(iC2);
                    long j4 = cursorN.getLong(iC3);
                    long j5 = cursorN.getLong(iC4);
                    long j6 = cursorN.getLong(iC5);
                    long j7 = cursorN.getLong(iC6);
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9VarD.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9VarD.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j8 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob3 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9VarD.b().getClass();
                    jdc jdcVarA = ky9.a(blob3);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC10;
                    int i9 = iC29;
                    boolean z = cursorN.getInt(i9) != 0;
                    iC29 = i9;
                    int i10 = iC30;
                    int i11 = cursorN.getInt(i10);
                    iC30 = i10;
                    int i12 = iC31;
                    long j9 = cursorN.getLong(i12);
                    iC31 = i12;
                    int i13 = iC32;
                    boolean z2 = cursorN.getInt(i13) != 0;
                    iC32 = i13;
                    int i14 = iC33;
                    long j10 = cursorN.getLong(i14);
                    iC33 = i14;
                    int i15 = iC34;
                    String string4 = cursorN.isNull(i15) ? null : cursorN.getString(i15);
                    iC34 = i15;
                    int i16 = iC35;
                    String string5 = cursorN.isNull(i16) ? null : cursorN.getString(i16);
                    iC35 = i16;
                    int i17 = iC36;
                    String string6 = cursorN.isNull(i17) ? null : cursorN.getString(i17);
                    iC36 = i17;
                    int i18 = iC37;
                    Integer numValueOf = cursorN.isNull(i18) ? null : Integer.valueOf(cursorN.getInt(i18));
                    lq9VarD.a().getClass();
                    int iA = m73.a(numValueOf);
                    iC37 = i18;
                    int i19 = iC38;
                    long j11 = cursorN.getLong(i19);
                    iC38 = i19;
                    int i20 = iC39;
                    long j12 = cursorN.getLong(i20);
                    iC39 = i20;
                    int i21 = iC40;
                    int i22 = cursorN.getInt(i21);
                    lq9VarD.b().getClass();
                    int iE = ky9.e(i22);
                    iC40 = i21;
                    int i23 = iC41;
                    long j13 = cursorN.getLong(i23);
                    iC41 = i23;
                    int i24 = iC42;
                    int i25 = cursorN.getInt(i24);
                    iC42 = i24;
                    int i26 = iC43;
                    int i27 = cursorN.getInt(i26);
                    iC43 = i26;
                    int i28 = iC44;
                    long j14 = cursorN.getLong(i28);
                    iC44 = i28;
                    int i29 = iC45;
                    int i30 = cursorN.getInt(i29);
                    iC45 = i29;
                    int i31 = iC46;
                    long j15 = cursorN.getLong(i31);
                    iC46 = i31;
                    int i32 = iC47;
                    byte[] blob4 = cursorN.isNull(i32) ? null : cursorN.getBlob(i32);
                    lq9VarD.b().getClass();
                    List listC = ky9.c(blob4);
                    iC47 = i32;
                    int i33 = iC48;
                    if (cursorN.isNull(i33)) {
                        i = i33;
                        blob = null;
                    } else {
                        i = i33;
                        blob = cursorN.getBlob(i33);
                    }
                    xl9 xl9VarF = lq9VarD.b().f(blob);
                    int i34 = iC49;
                    Long lValueOf = cursorN.isNull(i34) ? null : Long.valueOf(cursorN.getLong(i34));
                    int i35 = iC50;
                    Integer numValueOf2 = cursorN.isNull(i35) ? null : Integer.valueOf(cursorN.getInt(i35));
                    if (numValueOf2 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    iC49 = i34;
                    int i36 = iC51;
                    iC51 = i36;
                    arrayList2.add(new gj9(j2, j3, j4, j5, j6, j7, string, xi9VarB, jm9VarD, j8, string2, string3, jdcVarA, i7, z, i11, j9, z2, j10, string4, string5, string6, iA, j11, j12, iE, j13, i25, i27, j14, i30, j15, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC50 = i35;
                    iC10 = i8;
                    i3 = i6;
                    iC48 = i;
                }
                cursorN.close();
                dsdVar.y();
                arrayList = arrayList2;
            } catch (Throwable th2) {
                th = th2;
                cursorN.close();
                dsdVar.y();
                throw th;
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            lq9 lq9VarD2 = bsdVar.d();
            lq9VarD2.getClass();
            dsd dsdVarC2 = dsd.c(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
            dsdVarC2.k(1, j);
            dsdVarC2.k(2, -1);
            lrd lrdVar2 = lq9VarD2.a;
            lrdVar2.b();
            Cursor cursorN2 = lrdVar2.n(dsdVarC2);
            try {
                iC14 = s7j.c(cursorN2, "id");
                iC15 = s7j.c(cursorN2, "server_id");
                iC16 = s7j.c(cursorN2, "time");
                iC17 = s7j.c(cursorN2, "update_time");
                iC18 = s7j.c(cursorN2, "sender");
                iC19 = s7j.c(cursorN2, "cid");
                iC20 = s7j.c(cursorN2, "text");
                iC21 = s7j.c(cursorN2, "delivery_status");
                iC22 = s7j.c(cursorN2, "status");
                iC23 = s7j.c(cursorN2, "time_local");
                iC24 = s7j.c(cursorN2, NegotiationErrorStat.KEY_ERROR);
                iC25 = s7j.c(cursorN2, "localized_error");
                iC26 = s7j.c(cursorN2, "attaches");
                iC27 = s7j.c(cursorN2, "media_type");
                dsdVar2 = dsdVarC2;
            } catch (Throwable th3) {
                th = th3;
                dsdVar2 = dsdVarC2;
            }
            try {
                int iC52 = s7j.c(cursorN2, "detect_share");
                int iC53 = s7j.c(cursorN2, "msg_link_type");
                int iC54 = s7j.c(cursorN2, "msg_link_id");
                int iC55 = s7j.c(cursorN2, "inserted_from_msg_link");
                int iC56 = s7j.c(cursorN2, "msg_link_chat_id");
                int iC57 = s7j.c(cursorN2, "msg_link_chat_name");
                int iC58 = s7j.c(cursorN2, "msg_link_chat_link");
                int iC59 = s7j.c(cursorN2, "msg_link_chat_icon_url");
                int iC60 = s7j.c(cursorN2, "msg_link_chat_access_type");
                int iC61 = s7j.c(cursorN2, "msg_link_out_chat_id");
                int iC62 = s7j.c(cursorN2, "msg_link_out_msg_id");
                int iC63 = s7j.c(cursorN2, "type");
                int iC64 = s7j.c(cursorN2, "chat_id");
                int iC65 = s7j.c(cursorN2, "channel_views");
                int iC66 = s7j.c(cursorN2, "channel_forwards");
                int iC67 = s7j.c(cursorN2, "view_time");
                int iC68 = s7j.c(cursorN2, "options");
                int iC69 = s7j.c(cursorN2, "live_until");
                int iC70 = s7j.c(cursorN2, "elements");
                int iC71 = s7j.c(cursorN2, "reactions");
                int iC72 = s7j.c(cursorN2, "delayed_attrs_time_to_fire");
                int iC73 = s7j.c(cursorN2, "delayed_attrs_notify_sender");
                int iC74 = s7j.c(cursorN2, "reactions_update_time");
                int i37 = iC27;
                arrayList = new ArrayList(cursorN2.getCount());
                while (cursorN2.moveToNext()) {
                    long j16 = cursorN2.getLong(iC14);
                    long j17 = cursorN2.getLong(iC15);
                    long j18 = cursorN2.getLong(iC16);
                    long j19 = cursorN2.getLong(iC17);
                    long j20 = cursorN2.getLong(iC18);
                    long j21 = cursorN2.getLong(iC19);
                    String string7 = cursorN2.isNull(iC20) ? null : cursorN2.getString(iC20);
                    int i38 = cursorN2.getInt(iC21);
                    lq9VarD2.b().getClass();
                    xi9 xi9VarB2 = ky9.b(i38);
                    int i39 = cursorN2.getInt(iC22);
                    lq9VarD2.b().getClass();
                    jm9 jm9VarD2 = ky9.d(i39);
                    long j22 = cursorN2.getLong(iC23);
                    String string8 = cursorN2.isNull(iC24) ? null : cursorN2.getString(iC24);
                    String string9 = cursorN2.isNull(iC25) ? null : cursorN2.getString(iC25);
                    byte[] blob5 = cursorN2.isNull(iC26) ? null : cursorN2.getBlob(iC26);
                    lq9VarD2.b().getClass();
                    jdc jdcVarA2 = ky9.a(blob5);
                    int i40 = i37;
                    int i41 = cursorN2.getInt(i40);
                    int i42 = iC14;
                    int i43 = iC52;
                    boolean z3 = cursorN2.getInt(i43) != 0;
                    iC52 = i43;
                    int i44 = iC53;
                    int i45 = cursorN2.getInt(i44);
                    iC53 = i44;
                    int i46 = iC54;
                    long j23 = cursorN2.getLong(i46);
                    iC54 = i46;
                    int i47 = iC55;
                    boolean z4 = cursorN2.getInt(i47) != 0;
                    iC55 = i47;
                    int i48 = iC56;
                    long j24 = cursorN2.getLong(i48);
                    iC56 = i48;
                    int i49 = iC57;
                    String string10 = cursorN2.isNull(i49) ? null : cursorN2.getString(i49);
                    iC57 = i49;
                    int i50 = iC58;
                    String string11 = cursorN2.isNull(i50) ? null : cursorN2.getString(i50);
                    iC58 = i50;
                    int i51 = iC59;
                    String string12 = cursorN2.isNull(i51) ? null : cursorN2.getString(i51);
                    iC59 = i51;
                    int i52 = iC60;
                    Integer numValueOf3 = cursorN2.isNull(i52) ? null : Integer.valueOf(cursorN2.getInt(i52));
                    lq9VarD2.a().getClass();
                    int iA2 = m73.a(numValueOf3);
                    iC60 = i52;
                    int i53 = iC61;
                    long j25 = cursorN2.getLong(i53);
                    iC61 = i53;
                    int i54 = iC62;
                    long j26 = cursorN2.getLong(i54);
                    iC62 = i54;
                    int i55 = iC63;
                    int i56 = cursorN2.getInt(i55);
                    lq9VarD2.b().getClass();
                    int iE2 = ky9.e(i56);
                    iC63 = i55;
                    int i57 = iC64;
                    long j27 = cursorN2.getLong(i57);
                    iC64 = i57;
                    int i58 = iC65;
                    int i59 = cursorN2.getInt(i58);
                    iC65 = i58;
                    int i60 = iC66;
                    int i61 = cursorN2.getInt(i60);
                    iC66 = i60;
                    int i62 = iC67;
                    long j28 = cursorN2.getLong(i62);
                    iC67 = i62;
                    int i63 = iC68;
                    int i64 = cursorN2.getInt(i63);
                    iC68 = i63;
                    int i65 = iC69;
                    long j29 = cursorN2.getLong(i65);
                    iC69 = i65;
                    int i66 = iC70;
                    byte[] blob6 = cursorN2.isNull(i66) ? null : cursorN2.getBlob(i66);
                    lq9VarD2.b().getClass();
                    List listC2 = ky9.c(blob6);
                    iC70 = i66;
                    int i67 = iC71;
                    if (cursorN2.isNull(i67)) {
                        i2 = i67;
                        blob2 = null;
                    } else {
                        i2 = i67;
                        blob2 = cursorN2.getBlob(i67);
                    }
                    int i68 = iC26;
                    xl9 xl9VarF2 = lq9VarD2.b().f(blob2);
                    int i69 = iC72;
                    Long lValueOf2 = cursorN2.isNull(i69) ? null : Long.valueOf(cursorN2.getLong(i69));
                    int i70 = iC73;
                    Integer numValueOf4 = cursorN2.isNull(i70) ? null : Integer.valueOf(cursorN2.getInt(i70));
                    if (numValueOf4 == null) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(numValueOf4.intValue() != 0);
                    }
                    iC72 = i69;
                    int i71 = iC74;
                    iC74 = i71;
                    arrayList.add(new gj9(j16, j17, j18, j19, j20, j21, string7, xi9VarB2, jm9VarD2, j22, string8, string9, jdcVarA2, i41, z3, i45, j23, z4, j24, string10, string11, string12, iA2, j25, j26, iE2, j27, i59, i61, j28, i64, j29, listC2, xl9VarF2, lValueOf2, boolValueOf2, cursorN2.getLong(i71)));
                    iC73 = i70;
                    iC26 = i68;
                    iC14 = i42;
                    iC71 = i2;
                    i37 = i40;
                }
                cursorN2.close();
                dsdVar2.y();
            } catch (Throwable th4) {
                th = th4;
                cursorN2.close();
                dsdVar2.y();
                throw th;
            }
        }
        ArrayList arrayList3 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(bsdVar.b((gj9) it.next()));
        }
        return arrayList3;
    }

    public final si9 i(long j, long j2) throws Throwable {
        bsd bsdVar = this.a.c;
        gj9 gj9VarC = bsdVar.d().c(j, j2);
        if (gj9VarC != null) {
            return bsdVar.b(gj9VarC);
        }
        return null;
    }

    public final ArrayList j(long j, long[] jArr) throws Throwable {
        dsd dsdVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        int i;
        byte[] blob;
        bsd bsdVar = this.a.c;
        lq9 lq9VarD = bsdVar.d();
        lrd lrdVar = lq9VarD.a;
        StringBuilder sbM = az1.m("SELECT * FROM messages WHERE chat_id = ? AND server_id in (");
        int length = jArr.length;
        lc4.a(sbM, length);
        sbM.append(")");
        dsd dsdVarC = dsd.c(length + 1, sbM.toString());
        dsdVarC.k(1, j);
        int i2 = 2;
        for (long j2 : jArr) {
            dsdVarC.k(i2, j2);
            i2++;
        }
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            iC = s7j.c(cursorN, "id");
            iC2 = s7j.c(cursorN, "server_id");
            iC3 = s7j.c(cursorN, "time");
            iC4 = s7j.c(cursorN, "update_time");
            iC5 = s7j.c(cursorN, "sender");
            iC6 = s7j.c(cursorN, "cid");
            iC7 = s7j.c(cursorN, "text");
            iC8 = s7j.c(cursorN, "delivery_status");
            iC9 = s7j.c(cursorN, "status");
            iC10 = s7j.c(cursorN, "time_local");
            iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
            iC12 = s7j.c(cursorN, "localized_error");
            iC13 = s7j.c(cursorN, "attaches");
            dsdVar = dsdVarC;
        } catch (Throwable th) {
            th = th;
            dsdVar = dsdVarC;
        }
        try {
            int iC14 = s7j.c(cursorN, "media_type");
            int iC15 = s7j.c(cursorN, "detect_share");
            int iC16 = s7j.c(cursorN, "msg_link_type");
            int iC17 = s7j.c(cursorN, "msg_link_id");
            int iC18 = s7j.c(cursorN, "inserted_from_msg_link");
            int iC19 = s7j.c(cursorN, "msg_link_chat_id");
            int iC20 = s7j.c(cursorN, "msg_link_chat_name");
            int iC21 = s7j.c(cursorN, "msg_link_chat_link");
            int iC22 = s7j.c(cursorN, "msg_link_chat_icon_url");
            int iC23 = s7j.c(cursorN, "msg_link_chat_access_type");
            int iC24 = s7j.c(cursorN, "msg_link_out_chat_id");
            int iC25 = s7j.c(cursorN, "msg_link_out_msg_id");
            int iC26 = s7j.c(cursorN, "type");
            int iC27 = s7j.c(cursorN, "chat_id");
            int iC28 = s7j.c(cursorN, "channel_views");
            int iC29 = s7j.c(cursorN, "channel_forwards");
            int iC30 = s7j.c(cursorN, "view_time");
            int iC31 = s7j.c(cursorN, "options");
            int iC32 = s7j.c(cursorN, "live_until");
            int iC33 = s7j.c(cursorN, "elements");
            int iC34 = s7j.c(cursorN, "reactions");
            int iC35 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
            int iC36 = s7j.c(cursorN, "delayed_attrs_notify_sender");
            int iC37 = s7j.c(cursorN, "reactions_update_time");
            int i3 = iC14;
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                long j3 = cursorN.getLong(iC);
                long j4 = cursorN.getLong(iC2);
                long j5 = cursorN.getLong(iC3);
                long j6 = cursorN.getLong(iC4);
                long j7 = cursorN.getLong(iC5);
                long j8 = cursorN.getLong(iC6);
                String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                int i4 = cursorN.getInt(iC8);
                lq9VarD.b().getClass();
                xi9 xi9VarB = ky9.b(i4);
                int i5 = cursorN.getInt(iC9);
                lq9VarD.b().getClass();
                jm9 jm9VarD = ky9.d(i5);
                long j9 = cursorN.getLong(iC10);
                String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                lq9VarD.b().getClass();
                jdc jdcVarA = ky9.a(blob2);
                int i6 = i3;
                int i7 = cursorN.getInt(i6);
                int i8 = iC;
                int i9 = iC15;
                boolean z = cursorN.getInt(i9) != 0;
                iC15 = i9;
                int i10 = iC16;
                int i11 = cursorN.getInt(i10);
                iC16 = i10;
                int i12 = iC17;
                long j10 = cursorN.getLong(i12);
                iC17 = i12;
                int i13 = iC18;
                boolean z2 = cursorN.getInt(i13) != 0;
                iC18 = i13;
                int i14 = iC19;
                long j11 = cursorN.getLong(i14);
                iC19 = i14;
                int i15 = iC20;
                String string4 = cursorN.isNull(i15) ? null : cursorN.getString(i15);
                iC20 = i15;
                int i16 = iC21;
                String string5 = cursorN.isNull(i16) ? null : cursorN.getString(i16);
                iC21 = i16;
                int i17 = iC22;
                String string6 = cursorN.isNull(i17) ? null : cursorN.getString(i17);
                iC22 = i17;
                int i18 = iC23;
                Integer numValueOf = cursorN.isNull(i18) ? null : Integer.valueOf(cursorN.getInt(i18));
                lq9VarD.a().getClass();
                int iA = m73.a(numValueOf);
                iC23 = i18;
                int i19 = iC24;
                long j12 = cursorN.getLong(i19);
                iC24 = i19;
                int i20 = iC25;
                long j13 = cursorN.getLong(i20);
                iC25 = i20;
                int i21 = iC26;
                int i22 = cursorN.getInt(i21);
                lq9VarD.b().getClass();
                int iE = ky9.e(i22);
                iC26 = i21;
                int i23 = iC27;
                long j14 = cursorN.getLong(i23);
                iC27 = i23;
                int i24 = iC28;
                int i25 = cursorN.getInt(i24);
                iC28 = i24;
                int i26 = iC29;
                int i27 = cursorN.getInt(i26);
                iC29 = i26;
                int i28 = iC30;
                long j15 = cursorN.getLong(i28);
                iC30 = i28;
                int i29 = iC31;
                int i30 = cursorN.getInt(i29);
                iC31 = i29;
                int i31 = iC32;
                long j16 = cursorN.getLong(i31);
                iC32 = i31;
                int i32 = iC33;
                byte[] blob3 = cursorN.isNull(i32) ? null : cursorN.getBlob(i32);
                lq9VarD.b().getClass();
                List listC = ky9.c(blob3);
                iC33 = i32;
                int i33 = iC34;
                if (cursorN.isNull(i33)) {
                    i = i33;
                    blob = null;
                } else {
                    i = i33;
                    blob = cursorN.getBlob(i33);
                }
                int i34 = iC12;
                xl9 xl9VarF = lq9VarD.b().f(blob);
                int i35 = iC35;
                Long lValueOf = cursorN.isNull(i35) ? null : Long.valueOf(cursorN.getLong(i35));
                int i36 = iC36;
                Integer numValueOf2 = cursorN.isNull(i36) ? null : Integer.valueOf(cursorN.getInt(i36));
                Boolean boolValueOf = numValueOf2 != null ? Boolean.valueOf(numValueOf2.intValue() != 0) : null;
                iC35 = i35;
                int i37 = iC37;
                iC37 = i37;
                arrayList.add(new gj9(j3, j4, j5, j6, j7, j8, string, xi9VarB, jm9VarD, j9, string2, string3, jdcVarA, i7, z, i11, j10, z2, j11, string4, string5, string6, iA, j12, j13, iE, j14, i25, i27, j15, i30, j16, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i37)));
                iC36 = i36;
                iC12 = i34;
                iC = i8;
                iC34 = i;
                i3 = i6;
            }
            cursorN.close();
            dsdVar.y();
            ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(bsdVar.b((gj9) it.next()));
            }
            return arrayList2;
        } catch (Throwable th2) {
            th = th2;
            cursorN.close();
            dsdVar.y();
            throw th;
        }
    }

    public final ArrayList k(long j, long j2) {
        dsd dsdVar;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        byte[] blob;
        pj9 pj9Var = (pj9) this.f.get();
        bsd bsdVar = this.a.c;
        lq9 lq9VarD = bsdVar.d();
        Set setSingleton = Collections.singleton(8);
        lrd lrdVar = lq9VarD.a;
        StringBuilder sbM = az1.m("SELECT * FROM messages WHERE media_type in (");
        int size = setSingleton.size();
        lc4.a(sbM, size);
        sbM.append(") AND time >= ");
        sbM.append("?");
        sbM.append(" AND time <= ");
        ho7.r(sbM, "?", " AND inserted_from_msg_link = 0 AND status <> ", "?", " ORDER BY time DESC LIMIT ");
        sbM.append("?");
        int i3 = size + 4;
        dsd dsdVarC = dsd.c(i3, sbM.toString());
        Iterator it = setSingleton.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            if (((Integer) it.next()) == null) {
                dsdVarC.S(i4);
            } else {
                dsdVarC.k(i4, r11.intValue());
            }
            i4++;
        }
        dsdVarC.k(size + 1, j);
        dsdVarC.k(size + 2, j2);
        lq9VarD.b().getClass();
        dsdVarC.k(size + 3, 10);
        dsdVarC.k(i3, 100);
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "server_id");
            int iC3 = s7j.c(cursorN, "time");
            int iC4 = s7j.c(cursorN, "update_time");
            int iC5 = s7j.c(cursorN, "sender");
            int iC6 = s7j.c(cursorN, "cid");
            int iC7 = s7j.c(cursorN, "text");
            int iC8 = s7j.c(cursorN, "delivery_status");
            int iC9 = s7j.c(cursorN, "status");
            int iC10 = s7j.c(cursorN, "time_local");
            int iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
            int iC12 = s7j.c(cursorN, "localized_error");
            dsdVar = dsdVarC;
            try {
                int iC13 = s7j.c(cursorN, "attaches");
                int iC14 = s7j.c(cursorN, "media_type");
                int iC15 = s7j.c(cursorN, "detect_share");
                int iC16 = s7j.c(cursorN, "msg_link_type");
                int iC17 = s7j.c(cursorN, "msg_link_id");
                int iC18 = s7j.c(cursorN, "inserted_from_msg_link");
                int iC19 = s7j.c(cursorN, "msg_link_chat_id");
                int iC20 = s7j.c(cursorN, "msg_link_chat_name");
                int iC21 = s7j.c(cursorN, "msg_link_chat_link");
                int iC22 = s7j.c(cursorN, "msg_link_chat_icon_url");
                int iC23 = s7j.c(cursorN, "msg_link_chat_access_type");
                int iC24 = s7j.c(cursorN, "msg_link_out_chat_id");
                int iC25 = s7j.c(cursorN, "msg_link_out_msg_id");
                int iC26 = s7j.c(cursorN, "type");
                int iC27 = s7j.c(cursorN, "chat_id");
                int iC28 = s7j.c(cursorN, "channel_views");
                int iC29 = s7j.c(cursorN, "channel_forwards");
                int iC30 = s7j.c(cursorN, "view_time");
                int iC31 = s7j.c(cursorN, "options");
                int iC32 = s7j.c(cursorN, "live_until");
                int iC33 = s7j.c(cursorN, "elements");
                int iC34 = s7j.c(cursorN, "reactions");
                int iC35 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
                int iC36 = s7j.c(cursorN, "delayed_attrs_notify_sender");
                int iC37 = s7j.c(cursorN, "reactions_update_time");
                int i5 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j3 = cursorN.getLong(iC);
                    long j4 = cursorN.getLong(iC2);
                    long j5 = cursorN.getLong(iC3);
                    long j6 = cursorN.getLong(iC4);
                    long j7 = cursorN.getLong(iC5);
                    long j8 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i6 = cursorN.getInt(iC8);
                    lq9VarD.b().getClass();
                    xi9 xi9VarB = ky9.b(i6);
                    int i7 = cursorN.getInt(iC9);
                    lq9VarD.b().getClass();
                    jm9 jm9VarD = ky9.d(i7);
                    long j9 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9VarD.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i8 = i5;
                    int i9 = cursorN.getInt(i8);
                    i5 = i8;
                    int i10 = iC15;
                    if (cursorN.getInt(i10) != 0) {
                        z2 = false;
                        z = true;
                    } else {
                        z = false;
                        z2 = false;
                    }
                    iC15 = i10;
                    int i11 = iC16;
                    int i12 = cursorN.getInt(i11);
                    iC16 = i11;
                    boolean z4 = z2;
                    int i13 = iC17;
                    long j10 = cursorN.getLong(i13);
                    iC17 = i13;
                    int i14 = iC18;
                    if (cursorN.getInt(i14) != 0) {
                        iC18 = i14;
                        i = iC19;
                        z3 = z4;
                        z4 = true;
                    } else {
                        iC18 = i14;
                        i = iC19;
                        z3 = z4;
                    }
                    long j11 = cursorN.getLong(i);
                    int i15 = i;
                    int i16 = iC20;
                    String string4 = cursorN.isNull(i16) ? null : cursorN.getString(i16);
                    iC20 = i16;
                    int i17 = iC21;
                    String string5 = cursorN.isNull(i17) ? null : cursorN.getString(i17);
                    iC21 = i17;
                    int i18 = iC22;
                    String string6 = cursorN.isNull(i18) ? null : cursorN.getString(i18);
                    iC22 = i18;
                    int i19 = iC23;
                    Integer numValueOf = cursorN.isNull(i19) ? null : Integer.valueOf(cursorN.getInt(i19));
                    lq9VarD.a().getClass();
                    int iA = m73.a(numValueOf);
                    iC23 = i19;
                    int i20 = iC24;
                    long j12 = cursorN.getLong(i20);
                    iC24 = i20;
                    int i21 = iC25;
                    long j13 = cursorN.getLong(i21);
                    iC25 = i21;
                    int i22 = iC26;
                    int i23 = cursorN.getInt(i22);
                    lq9VarD.b().getClass();
                    int iE = ky9.e(i23);
                    iC26 = i22;
                    int i24 = iC27;
                    long j14 = cursorN.getLong(i24);
                    iC27 = i24;
                    int i25 = iC28;
                    int i26 = cursorN.getInt(i25);
                    iC28 = i25;
                    int i27 = iC29;
                    int i28 = cursorN.getInt(i27);
                    iC29 = i27;
                    int i29 = iC30;
                    long j15 = cursorN.getLong(i29);
                    iC30 = i29;
                    int i30 = iC31;
                    int i31 = cursorN.getInt(i30);
                    iC31 = i30;
                    int i32 = iC32;
                    long j16 = cursorN.getLong(i32);
                    iC32 = i32;
                    int i33 = iC33;
                    byte[] blob3 = cursorN.isNull(i33) ? null : cursorN.getBlob(i33);
                    lq9VarD.b().getClass();
                    List listC = ky9.c(blob3);
                    iC33 = i33;
                    int i34 = iC34;
                    if (cursorN.isNull(i34)) {
                        i2 = i34;
                        blob = null;
                    } else {
                        i2 = i34;
                        blob = cursorN.getBlob(i34);
                    }
                    int i35 = iC11;
                    xl9 xl9VarF = lq9VarD.b().f(blob);
                    int i36 = iC35;
                    Long lValueOf = cursorN.isNull(i36) ? null : Long.valueOf(cursorN.getLong(i36));
                    int i37 = iC36;
                    Integer numValueOf2 = cursorN.isNull(i37) ? null : Integer.valueOf(cursorN.getInt(i37));
                    if (numValueOf2 != null) {
                        if (numValueOf2.intValue() != 0) {
                            z3 = true;
                        }
                        boolValueOf = Boolean.valueOf(z3);
                    }
                    iC35 = i36;
                    int i38 = iC37;
                    iC37 = i38;
                    arrayList.add(new gj9(j3, j4, j5, j6, j7, j8, string, xi9VarB, jm9VarD, j9, string2, string3, jdcVarA, i9, z, i12, j10, z4, j11, string4, string5, string6, iA, j12, j13, iE, j14, i26, i28, j15, i31, j16, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i38)));
                    iC36 = i37;
                    iC11 = i35;
                    iC19 = i15;
                    iC34 = i2;
                }
                cursorN.close();
                dsdVar.y();
                ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(bsdVar.b((gj9) it2.next()));
                }
                return pj9Var.b(arrayList2);
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

    public final ArrayList l(long j, long j2, long j3, boolean z, rs4 rs4Var) throws Throwable {
        bsd bsdVar;
        ArrayList arrayListE;
        dsd dsdVar;
        int i;
        byte[] blob;
        Boolean boolValueOf;
        Cursor cursor;
        dsd dsdVar2;
        int i2;
        byte[] blob2;
        Boolean boolValueOf2;
        StringBuilder sbL = az1.l(j, "selectFromTo chatId = ", "; timeFrom = ");
        sbL.append(j2);
        az1.r(j3, "; timeTo = ", "; backwards = ", sbL);
        sbL.append(z);
        wqi.c("qi9", sbL.toString(), new Object[0]);
        bsd bsdVar2 = this.a.c;
        bsdVar2.getClass();
        int iOrdinal = rs4Var.ordinal();
        if (iOrdinal == 0) {
            bsdVar = bsdVar2;
            arrayListE = bsdVar.d().e(j, j2, z, j3);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            lq9 lq9VarD = bsdVar2.d();
            lrd lrdVar = lq9VarD.a;
            bsdVar = bsdVar2;
            if (z) {
                dsd dsdVarC = dsd.c(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
                dsdVarC.k(1, j);
                dsdVarC.k(2, j2);
                vb9.h(dsdVarC, 3, j3, lq9VarD);
                dsdVarC.k(4, 10);
                dsdVarC.k(5, 40);
                lrdVar.b();
                Cursor cursorN = lrdVar.n(dsdVarC);
                try {
                    int iC = s7j.c(cursorN, "id");
                    int iC2 = s7j.c(cursorN, "server_id");
                    int iC3 = s7j.c(cursorN, "time");
                    int iC4 = s7j.c(cursorN, "update_time");
                    int iC5 = s7j.c(cursorN, "sender");
                    int iC6 = s7j.c(cursorN, "cid");
                    int iC7 = s7j.c(cursorN, "text");
                    int iC8 = s7j.c(cursorN, "delivery_status");
                    int iC9 = s7j.c(cursorN, "status");
                    int iC10 = s7j.c(cursorN, "time_local");
                    int iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
                    int iC12 = s7j.c(cursorN, "localized_error");
                    int iC13 = s7j.c(cursorN, "attaches");
                    dsdVar2 = dsdVarC;
                    try {
                        int iC14 = s7j.c(cursorN, "media_type");
                        int iC15 = s7j.c(cursorN, "detect_share");
                        int iC16 = s7j.c(cursorN, "msg_link_type");
                        int iC17 = s7j.c(cursorN, "msg_link_id");
                        int iC18 = s7j.c(cursorN, "inserted_from_msg_link");
                        int iC19 = s7j.c(cursorN, "msg_link_chat_id");
                        int iC20 = s7j.c(cursorN, "msg_link_chat_name");
                        int iC21 = s7j.c(cursorN, "msg_link_chat_link");
                        int iC22 = s7j.c(cursorN, "msg_link_chat_icon_url");
                        int iC23 = s7j.c(cursorN, "msg_link_chat_access_type");
                        int iC24 = s7j.c(cursorN, "msg_link_out_chat_id");
                        int iC25 = s7j.c(cursorN, "msg_link_out_msg_id");
                        int iC26 = s7j.c(cursorN, "type");
                        int iC27 = s7j.c(cursorN, "chat_id");
                        int iC28 = s7j.c(cursorN, "channel_views");
                        int iC29 = s7j.c(cursorN, "channel_forwards");
                        int iC30 = s7j.c(cursorN, "view_time");
                        int iC31 = s7j.c(cursorN, "options");
                        int iC32 = s7j.c(cursorN, "live_until");
                        int iC33 = s7j.c(cursorN, "elements");
                        int iC34 = s7j.c(cursorN, "reactions");
                        int iC35 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
                        int iC36 = s7j.c(cursorN, "delayed_attrs_notify_sender");
                        int iC37 = s7j.c(cursorN, "reactions_update_time");
                        int i3 = iC14;
                        arrayListE = new ArrayList(cursorN.getCount());
                        while (cursorN.moveToNext()) {
                            long j4 = cursorN.getLong(iC);
                            long j5 = cursorN.getLong(iC2);
                            long j6 = cursorN.getLong(iC3);
                            long j7 = cursorN.getLong(iC4);
                            long j8 = cursorN.getLong(iC5);
                            long j9 = cursorN.getLong(iC6);
                            String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                            int i4 = cursorN.getInt(iC8);
                            lq9VarD.b().getClass();
                            xi9 xi9VarB = ky9.b(i4);
                            int i5 = cursorN.getInt(iC9);
                            lq9VarD.b().getClass();
                            jm9 jm9VarD = ky9.d(i5);
                            long j10 = cursorN.getLong(iC10);
                            String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                            String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                            byte[] blob3 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                            lq9VarD.b().getClass();
                            jdc jdcVarA = ky9.a(blob3);
                            int i6 = i3;
                            int i7 = cursorN.getInt(i6);
                            int i8 = iC;
                            int i9 = iC15;
                            boolean z2 = cursorN.getInt(i9) != 0;
                            iC15 = i9;
                            int i10 = iC16;
                            int i11 = cursorN.getInt(i10);
                            iC16 = i10;
                            int i12 = iC17;
                            long j11 = cursorN.getLong(i12);
                            iC17 = i12;
                            int i13 = iC18;
                            boolean z3 = cursorN.getInt(i13) != 0;
                            iC18 = i13;
                            int i14 = iC19;
                            long j12 = cursorN.getLong(i14);
                            iC19 = i14;
                            int i15 = iC20;
                            String string4 = cursorN.isNull(i15) ? null : cursorN.getString(i15);
                            iC20 = i15;
                            int i16 = iC21;
                            String string5 = cursorN.isNull(i16) ? null : cursorN.getString(i16);
                            iC21 = i16;
                            int i17 = iC22;
                            String string6 = cursorN.isNull(i17) ? null : cursorN.getString(i17);
                            iC22 = i17;
                            int i18 = iC23;
                            Integer numValueOf = cursorN.isNull(i18) ? null : Integer.valueOf(cursorN.getInt(i18));
                            lq9VarD.a().getClass();
                            int iA = m73.a(numValueOf);
                            iC23 = i18;
                            int i19 = iC24;
                            long j13 = cursorN.getLong(i19);
                            iC24 = i19;
                            int i20 = iC25;
                            long j14 = cursorN.getLong(i20);
                            iC25 = i20;
                            int i21 = iC26;
                            int i22 = cursorN.getInt(i21);
                            lq9VarD.b().getClass();
                            int iE = ky9.e(i22);
                            iC26 = i21;
                            int i23 = iC27;
                            long j15 = cursorN.getLong(i23);
                            iC27 = i23;
                            int i24 = iC28;
                            int i25 = cursorN.getInt(i24);
                            iC28 = i24;
                            int i26 = iC29;
                            int i27 = cursorN.getInt(i26);
                            iC29 = i26;
                            int i28 = iC30;
                            long j16 = cursorN.getLong(i28);
                            iC30 = i28;
                            int i29 = iC31;
                            int i30 = cursorN.getInt(i29);
                            iC31 = i29;
                            int i31 = iC32;
                            long j17 = cursorN.getLong(i31);
                            iC32 = i31;
                            int i32 = iC33;
                            byte[] blob4 = cursorN.isNull(i32) ? null : cursorN.getBlob(i32);
                            lq9VarD.b().getClass();
                            List listC = ky9.c(blob4);
                            iC33 = i32;
                            int i33 = iC34;
                            if (cursorN.isNull(i33)) {
                                i2 = i33;
                                blob2 = null;
                            } else {
                                i2 = i33;
                                blob2 = cursorN.getBlob(i33);
                            }
                            int i34 = iC2;
                            xl9 xl9VarF = lq9VarD.b().f(blob2);
                            int i35 = iC35;
                            Long lValueOf = cursorN.isNull(i35) ? null : Long.valueOf(cursorN.getLong(i35));
                            int i36 = iC36;
                            Integer numValueOf2 = cursorN.isNull(i36) ? null : Integer.valueOf(cursorN.getInt(i36));
                            if (numValueOf2 == null) {
                                boolValueOf2 = null;
                            } else {
                                boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                            }
                            iC35 = i35;
                            int i37 = iC37;
                            cursor = cursorN;
                            try {
                                arrayListE.add(new gj9(j4, j5, j6, j7, j8, j9, string, xi9VarB, jm9VarD, j10, string2, string3, jdcVarA, i7, z2, i11, j11, z3, j12, string4, string5, string6, iA, j13, j14, iE, j15, i25, i27, j16, i30, j17, listC, xl9VarF, lValueOf, boolValueOf2, cursorN.getLong(i37)));
                                iC36 = i36;
                                cursorN = cursor;
                                iC2 = i34;
                                iC34 = i2;
                                iC37 = i37;
                                iC = i8;
                                i3 = i6;
                            } catch (Throwable th) {
                                th = th;
                                cursor.close();
                                dsdVar2.y();
                                throw th;
                            }
                        }
                        cursorN.close();
                        dsdVar2.y();
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorN;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorN;
                    dsdVar2 = dsdVarC;
                }
            } else {
                dsd dsdVarC2 = dsd.c(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
                dsdVarC2.k(1, j);
                dsdVarC2.k(2, j2);
                vb9.h(dsdVarC2, 3, j3, lq9VarD);
                dsdVarC2.k(4, 10);
                dsdVarC2.k(5, 40);
                lrdVar.b();
                Cursor cursorN2 = lrdVar.n(dsdVarC2);
                try {
                    int iC38 = s7j.c(cursorN2, "id");
                    int iC39 = s7j.c(cursorN2, "server_id");
                    int iC40 = s7j.c(cursorN2, "time");
                    int iC41 = s7j.c(cursorN2, "update_time");
                    int iC42 = s7j.c(cursorN2, "sender");
                    int iC43 = s7j.c(cursorN2, "cid");
                    int iC44 = s7j.c(cursorN2, "text");
                    int iC45 = s7j.c(cursorN2, "delivery_status");
                    int iC46 = s7j.c(cursorN2, "status");
                    int iC47 = s7j.c(cursorN2, "time_local");
                    int iC48 = s7j.c(cursorN2, NegotiationErrorStat.KEY_ERROR);
                    int iC49 = s7j.c(cursorN2, "localized_error");
                    int iC50 = s7j.c(cursorN2, "attaches");
                    int iC51 = s7j.c(cursorN2, "media_type");
                    dsdVar = dsdVarC2;
                    try {
                        int iC52 = s7j.c(cursorN2, "detect_share");
                        int iC53 = s7j.c(cursorN2, "msg_link_type");
                        int iC54 = s7j.c(cursorN2, "msg_link_id");
                        int iC55 = s7j.c(cursorN2, "inserted_from_msg_link");
                        int iC56 = s7j.c(cursorN2, "msg_link_chat_id");
                        int iC57 = s7j.c(cursorN2, "msg_link_chat_name");
                        int iC58 = s7j.c(cursorN2, "msg_link_chat_link");
                        int iC59 = s7j.c(cursorN2, "msg_link_chat_icon_url");
                        int iC60 = s7j.c(cursorN2, "msg_link_chat_access_type");
                        int iC61 = s7j.c(cursorN2, "msg_link_out_chat_id");
                        int iC62 = s7j.c(cursorN2, "msg_link_out_msg_id");
                        int iC63 = s7j.c(cursorN2, "type");
                        int iC64 = s7j.c(cursorN2, "chat_id");
                        int iC65 = s7j.c(cursorN2, "channel_views");
                        int iC66 = s7j.c(cursorN2, "channel_forwards");
                        int iC67 = s7j.c(cursorN2, "view_time");
                        int iC68 = s7j.c(cursorN2, "options");
                        int iC69 = s7j.c(cursorN2, "live_until");
                        int iC70 = s7j.c(cursorN2, "elements");
                        int iC71 = s7j.c(cursorN2, "reactions");
                        int iC72 = s7j.c(cursorN2, "delayed_attrs_time_to_fire");
                        int iC73 = s7j.c(cursorN2, "delayed_attrs_notify_sender");
                        int iC74 = s7j.c(cursorN2, "reactions_update_time");
                        int i38 = iC51;
                        ArrayList arrayList = new ArrayList(cursorN2.getCount());
                        while (cursorN2.moveToNext()) {
                            long j18 = cursorN2.getLong(iC38);
                            long j19 = cursorN2.getLong(iC39);
                            long j20 = cursorN2.getLong(iC40);
                            long j21 = cursorN2.getLong(iC41);
                            long j22 = cursorN2.getLong(iC42);
                            long j23 = cursorN2.getLong(iC43);
                            String string7 = cursorN2.isNull(iC44) ? null : cursorN2.getString(iC44);
                            int i39 = cursorN2.getInt(iC45);
                            lq9VarD.b().getClass();
                            xi9 xi9VarB2 = ky9.b(i39);
                            int i40 = cursorN2.getInt(iC46);
                            lq9VarD.b().getClass();
                            jm9 jm9VarD2 = ky9.d(i40);
                            long j24 = cursorN2.getLong(iC47);
                            String string8 = cursorN2.isNull(iC48) ? null : cursorN2.getString(iC48);
                            String string9 = cursorN2.isNull(iC49) ? null : cursorN2.getString(iC49);
                            byte[] blob5 = cursorN2.isNull(iC50) ? null : cursorN2.getBlob(iC50);
                            lq9VarD.b().getClass();
                            jdc jdcVarA2 = ky9.a(blob5);
                            int i41 = i38;
                            int i42 = cursorN2.getInt(i41);
                            int i43 = iC50;
                            int i44 = iC52;
                            boolean z4 = cursorN2.getInt(i44) != 0;
                            iC52 = i44;
                            int i45 = iC53;
                            int i46 = cursorN2.getInt(i45);
                            iC53 = i45;
                            int i47 = iC54;
                            long j25 = cursorN2.getLong(i47);
                            iC54 = i47;
                            int i48 = iC55;
                            boolean z5 = cursorN2.getInt(i48) != 0;
                            iC55 = i48;
                            int i49 = iC56;
                            long j26 = cursorN2.getLong(i49);
                            iC56 = i49;
                            int i50 = iC57;
                            String string10 = cursorN2.isNull(i50) ? null : cursorN2.getString(i50);
                            iC57 = i50;
                            int i51 = iC58;
                            String string11 = cursorN2.isNull(i51) ? null : cursorN2.getString(i51);
                            iC58 = i51;
                            int i52 = iC59;
                            String string12 = cursorN2.isNull(i52) ? null : cursorN2.getString(i52);
                            iC59 = i52;
                            int i53 = iC60;
                            Integer numValueOf3 = cursorN2.isNull(i53) ? null : Integer.valueOf(cursorN2.getInt(i53));
                            lq9VarD.a().getClass();
                            int iA2 = m73.a(numValueOf3);
                            iC60 = i53;
                            int i54 = iC61;
                            long j27 = cursorN2.getLong(i54);
                            iC61 = i54;
                            int i55 = iC62;
                            long j28 = cursorN2.getLong(i55);
                            iC62 = i55;
                            int i56 = iC63;
                            int i57 = cursorN2.getInt(i56);
                            lq9VarD.b().getClass();
                            int iE2 = ky9.e(i57);
                            iC63 = i56;
                            int i58 = iC64;
                            long j29 = cursorN2.getLong(i58);
                            iC64 = i58;
                            int i59 = iC65;
                            int i60 = cursorN2.getInt(i59);
                            iC65 = i59;
                            int i61 = iC66;
                            int i62 = cursorN2.getInt(i61);
                            iC66 = i61;
                            int i63 = iC67;
                            long j30 = cursorN2.getLong(i63);
                            iC67 = i63;
                            int i64 = iC68;
                            int i65 = cursorN2.getInt(i64);
                            iC68 = i64;
                            int i66 = iC69;
                            long j31 = cursorN2.getLong(i66);
                            iC69 = i66;
                            int i67 = iC70;
                            byte[] blob6 = cursorN2.isNull(i67) ? null : cursorN2.getBlob(i67);
                            lq9VarD.b().getClass();
                            List listC2 = ky9.c(blob6);
                            iC70 = i67;
                            int i68 = iC71;
                            if (cursorN2.isNull(i68)) {
                                i = i68;
                                blob = null;
                            } else {
                                i = i68;
                                blob = cursorN2.getBlob(i68);
                            }
                            xl9 xl9VarF2 = lq9VarD.b().f(blob);
                            int i69 = iC72;
                            Long lValueOf2 = cursorN2.isNull(i69) ? null : Long.valueOf(cursorN2.getLong(i69));
                            int i70 = iC73;
                            Integer numValueOf4 = cursorN2.isNull(i70) ? null : Integer.valueOf(cursorN2.getInt(i70));
                            if (numValueOf4 == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                            }
                            iC72 = i69;
                            int i71 = iC74;
                            iC74 = i71;
                            arrayList.add(new gj9(j18, j19, j20, j21, j22, j23, string7, xi9VarB2, jm9VarD2, j24, string8, string9, jdcVarA2, i42, z4, i46, j25, z5, j26, string10, string11, string12, iA2, j27, j28, iE2, j29, i60, i62, j30, i65, j31, listC2, xl9VarF2, lValueOf2, boolValueOf, cursorN2.getLong(i71)));
                            iC73 = i70;
                            iC50 = i43;
                            i38 = i41;
                            iC71 = i;
                        }
                        cursorN2.close();
                        dsdVar.y();
                        arrayListE = arrayList;
                    } catch (Throwable th4) {
                        th = th4;
                        cursorN2.close();
                        dsdVar.y();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dsdVar = dsdVarC2;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayListE, 10));
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            arrayList2.add(bsdVar.b((gj9) it.next()));
        }
        if (z) {
            Collections.reverse(arrayList2);
        }
        return arrayList2;
    }

    public final si9 m(long j) throws Throwable {
        bsd bsdVar = this.a.c;
        gj9 gj9VarD = bsdVar.d().d(j);
        if (gj9VarD != null) {
            return bsdVar.b(gj9VarD);
        }
        return null;
    }

    public final si9 n(long j, long j2) throws Throwable {
        dsd dsdVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        ArrayList arrayList;
        int i;
        byte[] blob;
        Boolean boolValueOf;
        dsd dsdVar2;
        int iC14;
        int iC15;
        int iC16;
        int iC17;
        int iC18;
        int iC19;
        int iC20;
        int iC21;
        int iC22;
        int iC23;
        int iC24;
        int iC25;
        int iC26;
        int iC27;
        int i2;
        byte[] blob2;
        Boolean boolValueOf2;
        rs4 rs4Var = rs4.REGULAR;
        bsd bsdVar = this.a.c;
        bsdVar.getClass();
        int iOrdinal = rs4Var.ordinal();
        if (iOrdinal == 0) {
            lq9 lq9VarD = bsdVar.d();
            lq9VarD.getClass();
            dsd dsdVarC = dsd.c(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            dsdVarC.k(1, j);
            vb9.h(dsdVarC, 2, j2, lq9VarD);
            dsdVarC.k(3, 10);
            dsdVarC.k(4, 1);
            lrd lrdVar = lq9VarD.a;
            lrdVar.b();
            Cursor cursorN = lrdVar.n(dsdVarC);
            try {
                iC = s7j.c(cursorN, "id");
                iC2 = s7j.c(cursorN, "server_id");
                iC3 = s7j.c(cursorN, "time");
                iC4 = s7j.c(cursorN, "update_time");
                iC5 = s7j.c(cursorN, "sender");
                iC6 = s7j.c(cursorN, "cid");
                iC7 = s7j.c(cursorN, "text");
                iC8 = s7j.c(cursorN, "delivery_status");
                iC9 = s7j.c(cursorN, "status");
                iC10 = s7j.c(cursorN, "time_local");
                iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
                iC12 = s7j.c(cursorN, "localized_error");
                iC13 = s7j.c(cursorN, "attaches");
                dsdVar = dsdVarC;
            } catch (Throwable th) {
                th = th;
                dsdVar = dsdVarC;
            }
            try {
                int iC28 = s7j.c(cursorN, "media_type");
                int iC29 = s7j.c(cursorN, "detect_share");
                int iC30 = s7j.c(cursorN, "msg_link_type");
                int iC31 = s7j.c(cursorN, "msg_link_id");
                int iC32 = s7j.c(cursorN, "inserted_from_msg_link");
                int iC33 = s7j.c(cursorN, "msg_link_chat_id");
                int iC34 = s7j.c(cursorN, "msg_link_chat_name");
                int iC35 = s7j.c(cursorN, "msg_link_chat_link");
                int iC36 = s7j.c(cursorN, "msg_link_chat_icon_url");
                int iC37 = s7j.c(cursorN, "msg_link_chat_access_type");
                int iC38 = s7j.c(cursorN, "msg_link_out_chat_id");
                int iC39 = s7j.c(cursorN, "msg_link_out_msg_id");
                int iC40 = s7j.c(cursorN, "type");
                int iC41 = s7j.c(cursorN, "chat_id");
                int iC42 = s7j.c(cursorN, "channel_views");
                int iC43 = s7j.c(cursorN, "channel_forwards");
                int iC44 = s7j.c(cursorN, "view_time");
                int iC45 = s7j.c(cursorN, "options");
                int iC46 = s7j.c(cursorN, "live_until");
                int iC47 = s7j.c(cursorN, "elements");
                int iC48 = s7j.c(cursorN, "reactions");
                int iC49 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
                int iC50 = s7j.c(cursorN, "delayed_attrs_notify_sender");
                int iC51 = s7j.c(cursorN, "reactions_update_time");
                int i3 = iC28;
                arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j3 = cursorN.getLong(iC);
                    long j4 = cursorN.getLong(iC2);
                    long j5 = cursorN.getLong(iC3);
                    long j6 = cursorN.getLong(iC4);
                    long j7 = cursorN.getLong(iC5);
                    long j8 = cursorN.getLong(iC6);
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9VarD.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9VarD.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j9 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob3 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9VarD.b().getClass();
                    jdc jdcVarA = ky9.a(blob3);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC;
                    int i9 = iC29;
                    boolean z = cursorN.getInt(i9) != 0;
                    iC29 = i9;
                    int i10 = iC30;
                    int i11 = cursorN.getInt(i10);
                    iC30 = i10;
                    int i12 = iC31;
                    long j10 = cursorN.getLong(i12);
                    iC31 = i12;
                    int i13 = iC32;
                    boolean z2 = cursorN.getInt(i13) != 0;
                    iC32 = i13;
                    int i14 = iC33;
                    long j11 = cursorN.getLong(i14);
                    iC33 = i14;
                    int i15 = iC34;
                    String string4 = cursorN.isNull(i15) ? null : cursorN.getString(i15);
                    iC34 = i15;
                    int i16 = iC35;
                    String string5 = cursorN.isNull(i16) ? null : cursorN.getString(i16);
                    iC35 = i16;
                    int i17 = iC36;
                    String string6 = cursorN.isNull(i17) ? null : cursorN.getString(i17);
                    iC36 = i17;
                    int i18 = iC37;
                    Integer numValueOf = cursorN.isNull(i18) ? null : Integer.valueOf(cursorN.getInt(i18));
                    lq9VarD.a().getClass();
                    int iA = m73.a(numValueOf);
                    iC37 = i18;
                    int i19 = iC38;
                    long j12 = cursorN.getLong(i19);
                    iC38 = i19;
                    int i20 = iC39;
                    long j13 = cursorN.getLong(i20);
                    iC39 = i20;
                    int i21 = iC40;
                    int i22 = cursorN.getInt(i21);
                    lq9VarD.b().getClass();
                    int iE = ky9.e(i22);
                    iC40 = i21;
                    int i23 = iC41;
                    long j14 = cursorN.getLong(i23);
                    iC41 = i23;
                    int i24 = iC42;
                    int i25 = cursorN.getInt(i24);
                    iC42 = i24;
                    int i26 = iC43;
                    int i27 = cursorN.getInt(i26);
                    iC43 = i26;
                    int i28 = iC44;
                    long j15 = cursorN.getLong(i28);
                    iC44 = i28;
                    int i29 = iC45;
                    int i30 = cursorN.getInt(i29);
                    iC45 = i29;
                    int i31 = iC46;
                    long j16 = cursorN.getLong(i31);
                    iC46 = i31;
                    int i32 = iC47;
                    byte[] blob4 = cursorN.isNull(i32) ? null : cursorN.getBlob(i32);
                    lq9VarD.b().getClass();
                    List listC = ky9.c(blob4);
                    iC47 = i32;
                    int i33 = iC48;
                    if (cursorN.isNull(i33)) {
                        i = i33;
                        blob = null;
                    } else {
                        i = i33;
                        blob = cursorN.getBlob(i33);
                    }
                    int i34 = iC2;
                    xl9 xl9VarF = lq9VarD.b().f(blob);
                    int i35 = iC49;
                    Long lValueOf = cursorN.isNull(i35) ? null : Long.valueOf(cursorN.getLong(i35));
                    int i36 = iC50;
                    Integer numValueOf2 = cursorN.isNull(i36) ? null : Integer.valueOf(cursorN.getInt(i36));
                    if (numValueOf2 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    iC49 = i35;
                    int i37 = iC51;
                    iC51 = i37;
                    arrayList.add(new gj9(j3, j4, j5, j6, j7, j8, string, xi9VarB, jm9VarD, j9, string2, string3, jdcVarA, i7, z, i11, j10, z2, j11, string4, string5, string6, iA, j12, j13, iE, j14, i25, i27, j15, i30, j16, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i37)));
                    iC50 = i36;
                    iC2 = i34;
                    iC = i8;
                    iC48 = i;
                    i3 = i6;
                }
                cursorN.close();
                dsdVar.y();
            } catch (Throwable th2) {
                th = th2;
                cursorN.close();
                dsdVar.y();
                throw th;
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            lq9 lq9VarD2 = bsdVar.d();
            lq9VarD2.getClass();
            dsd dsdVarC2 = dsd.c(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY time ASC LIMIT ?");
            dsdVarC2.k(1, j);
            vb9.h(dsdVarC2, 2, j2, lq9VarD2);
            dsdVarC2.k(3, 10);
            dsdVarC2.k(4, 1);
            lrd lrdVar2 = lq9VarD2.a;
            lrdVar2.b();
            Cursor cursorN2 = lrdVar2.n(dsdVarC2);
            try {
                iC14 = s7j.c(cursorN2, "id");
                iC15 = s7j.c(cursorN2, "server_id");
                iC16 = s7j.c(cursorN2, "time");
                iC17 = s7j.c(cursorN2, "update_time");
                iC18 = s7j.c(cursorN2, "sender");
                iC19 = s7j.c(cursorN2, "cid");
                iC20 = s7j.c(cursorN2, "text");
                iC21 = s7j.c(cursorN2, "delivery_status");
                iC22 = s7j.c(cursorN2, "status");
                iC23 = s7j.c(cursorN2, "time_local");
                iC24 = s7j.c(cursorN2, NegotiationErrorStat.KEY_ERROR);
                iC25 = s7j.c(cursorN2, "localized_error");
                iC26 = s7j.c(cursorN2, "attaches");
                iC27 = s7j.c(cursorN2, "media_type");
                dsdVar2 = dsdVarC2;
            } catch (Throwable th3) {
                th = th3;
                dsdVar2 = dsdVarC2;
            }
            try {
                int iC52 = s7j.c(cursorN2, "detect_share");
                int iC53 = s7j.c(cursorN2, "msg_link_type");
                int iC54 = s7j.c(cursorN2, "msg_link_id");
                int iC55 = s7j.c(cursorN2, "inserted_from_msg_link");
                int iC56 = s7j.c(cursorN2, "msg_link_chat_id");
                int iC57 = s7j.c(cursorN2, "msg_link_chat_name");
                int iC58 = s7j.c(cursorN2, "msg_link_chat_link");
                int iC59 = s7j.c(cursorN2, "msg_link_chat_icon_url");
                int iC60 = s7j.c(cursorN2, "msg_link_chat_access_type");
                int iC61 = s7j.c(cursorN2, "msg_link_out_chat_id");
                int iC62 = s7j.c(cursorN2, "msg_link_out_msg_id");
                int iC63 = s7j.c(cursorN2, "type");
                int iC64 = s7j.c(cursorN2, "chat_id");
                int iC65 = s7j.c(cursorN2, "channel_views");
                int iC66 = s7j.c(cursorN2, "channel_forwards");
                int iC67 = s7j.c(cursorN2, "view_time");
                int iC68 = s7j.c(cursorN2, "options");
                int iC69 = s7j.c(cursorN2, "live_until");
                int iC70 = s7j.c(cursorN2, "elements");
                int iC71 = s7j.c(cursorN2, "reactions");
                int iC72 = s7j.c(cursorN2, "delayed_attrs_time_to_fire");
                int iC73 = s7j.c(cursorN2, "delayed_attrs_notify_sender");
                int iC74 = s7j.c(cursorN2, "reactions_update_time");
                int i38 = iC27;
                arrayList = new ArrayList(cursorN2.getCount());
                while (cursorN2.moveToNext()) {
                    long j17 = cursorN2.getLong(iC14);
                    long j18 = cursorN2.getLong(iC15);
                    long j19 = cursorN2.getLong(iC16);
                    long j20 = cursorN2.getLong(iC17);
                    long j21 = cursorN2.getLong(iC18);
                    long j22 = cursorN2.getLong(iC19);
                    String string7 = cursorN2.isNull(iC20) ? null : cursorN2.getString(iC20);
                    int i39 = cursorN2.getInt(iC21);
                    lq9VarD2.b().getClass();
                    xi9 xi9VarB2 = ky9.b(i39);
                    int i40 = cursorN2.getInt(iC22);
                    lq9VarD2.b().getClass();
                    jm9 jm9VarD2 = ky9.d(i40);
                    long j23 = cursorN2.getLong(iC23);
                    String string8 = cursorN2.isNull(iC24) ? null : cursorN2.getString(iC24);
                    String string9 = cursorN2.isNull(iC25) ? null : cursorN2.getString(iC25);
                    byte[] blob5 = cursorN2.isNull(iC26) ? null : cursorN2.getBlob(iC26);
                    lq9VarD2.b().getClass();
                    jdc jdcVarA2 = ky9.a(blob5);
                    int i41 = i38;
                    int i42 = cursorN2.getInt(i41);
                    int i43 = iC14;
                    int i44 = iC52;
                    boolean z3 = cursorN2.getInt(i44) != 0;
                    iC52 = i44;
                    int i45 = iC53;
                    int i46 = cursorN2.getInt(i45);
                    iC53 = i45;
                    int i47 = iC54;
                    long j24 = cursorN2.getLong(i47);
                    iC54 = i47;
                    int i48 = iC55;
                    boolean z4 = cursorN2.getInt(i48) != 0;
                    iC55 = i48;
                    int i49 = iC56;
                    long j25 = cursorN2.getLong(i49);
                    iC56 = i49;
                    int i50 = iC57;
                    String string10 = cursorN2.isNull(i50) ? null : cursorN2.getString(i50);
                    iC57 = i50;
                    int i51 = iC58;
                    String string11 = cursorN2.isNull(i51) ? null : cursorN2.getString(i51);
                    iC58 = i51;
                    int i52 = iC59;
                    String string12 = cursorN2.isNull(i52) ? null : cursorN2.getString(i52);
                    iC59 = i52;
                    int i53 = iC60;
                    Integer numValueOf3 = cursorN2.isNull(i53) ? null : Integer.valueOf(cursorN2.getInt(i53));
                    lq9VarD2.a().getClass();
                    int iA2 = m73.a(numValueOf3);
                    iC60 = i53;
                    int i54 = iC61;
                    long j26 = cursorN2.getLong(i54);
                    iC61 = i54;
                    int i55 = iC62;
                    long j27 = cursorN2.getLong(i55);
                    iC62 = i55;
                    int i56 = iC63;
                    int i57 = cursorN2.getInt(i56);
                    lq9VarD2.b().getClass();
                    int iE2 = ky9.e(i57);
                    iC63 = i56;
                    int i58 = iC64;
                    long j28 = cursorN2.getLong(i58);
                    iC64 = i58;
                    int i59 = iC65;
                    int i60 = cursorN2.getInt(i59);
                    iC65 = i59;
                    int i61 = iC66;
                    int i62 = cursorN2.getInt(i61);
                    iC66 = i61;
                    int i63 = iC67;
                    long j29 = cursorN2.getLong(i63);
                    iC67 = i63;
                    int i64 = iC68;
                    int i65 = cursorN2.getInt(i64);
                    iC68 = i64;
                    int i66 = iC69;
                    long j30 = cursorN2.getLong(i66);
                    iC69 = i66;
                    int i67 = iC70;
                    byte[] blob6 = cursorN2.isNull(i67) ? null : cursorN2.getBlob(i67);
                    lq9VarD2.b().getClass();
                    List listC2 = ky9.c(blob6);
                    iC70 = i67;
                    int i68 = iC71;
                    if (cursorN2.isNull(i68)) {
                        i2 = i68;
                        blob2 = null;
                    } else {
                        i2 = i68;
                        blob2 = cursorN2.getBlob(i68);
                    }
                    int i69 = iC15;
                    xl9 xl9VarF2 = lq9VarD2.b().f(blob2);
                    int i70 = iC72;
                    Long lValueOf2 = cursorN2.isNull(i70) ? null : Long.valueOf(cursorN2.getLong(i70));
                    int i71 = iC73;
                    Integer numValueOf4 = cursorN2.isNull(i71) ? null : Integer.valueOf(cursorN2.getInt(i71));
                    if (numValueOf4 == null) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(numValueOf4.intValue() != 0);
                    }
                    iC72 = i70;
                    int i72 = iC74;
                    iC74 = i72;
                    arrayList.add(new gj9(j17, j18, j19, j20, j21, j22, string7, xi9VarB2, jm9VarD2, j23, string8, string9, jdcVarA2, i42, z3, i46, j24, z4, j25, string10, string11, string12, iA2, j26, j27, iE2, j28, i60, i62, j29, i65, j30, listC2, xl9VarF2, lValueOf2, boolValueOf2, cursorN2.getLong(i72)));
                    iC73 = i71;
                    iC15 = i69;
                    iC14 = i43;
                    iC71 = i2;
                    i38 = i41;
                }
                cursorN2.close();
                dsdVar2.y();
            } catch (Throwable th4) {
                th = th4;
                cursorN2.close();
                dsdVar2.y();
                throw th;
            }
        }
        gj9 gj9Var = (gj9) ue3.I(arrayList);
        if (gj9Var != null) {
            return bsdVar.b(gj9Var);
        }
        return null;
    }

    public final ArrayList o() throws Throwable {
        dsd dsdVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        int i;
        boolean z;
        int i2;
        byte[] blob;
        List list = xi9.b;
        bsd bsdVar = this.a.c;
        lq9 lq9VarD = bsdVar.d();
        lq9VarD.getClass();
        dsd dsdVarC = dsd.c(2, "SELECT * FROM messages WHERE delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
        lq9VarD.b().getClass();
        long j = 10;
        vb9.h(dsdVarC, 1, j, lq9VarD);
        dsdVarC.k(2, j);
        lrd lrdVar = lq9VarD.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            iC = s7j.c(cursorN, "id");
            iC2 = s7j.c(cursorN, "server_id");
            iC3 = s7j.c(cursorN, "time");
            iC4 = s7j.c(cursorN, "update_time");
            iC5 = s7j.c(cursorN, "sender");
            iC6 = s7j.c(cursorN, "cid");
            iC7 = s7j.c(cursorN, "text");
            iC8 = s7j.c(cursorN, "delivery_status");
            iC9 = s7j.c(cursorN, "status");
            iC10 = s7j.c(cursorN, "time_local");
            iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
            iC12 = s7j.c(cursorN, "localized_error");
            iC13 = s7j.c(cursorN, "attaches");
            dsdVar = dsdVarC;
        } catch (Throwable th) {
            th = th;
            dsdVar = dsdVarC;
        }
        try {
            int iC14 = s7j.c(cursorN, "media_type");
            int iC15 = s7j.c(cursorN, "detect_share");
            int iC16 = s7j.c(cursorN, "msg_link_type");
            int iC17 = s7j.c(cursorN, "msg_link_id");
            int iC18 = s7j.c(cursorN, "inserted_from_msg_link");
            int iC19 = s7j.c(cursorN, "msg_link_chat_id");
            int iC20 = s7j.c(cursorN, "msg_link_chat_name");
            int iC21 = s7j.c(cursorN, "msg_link_chat_link");
            int iC22 = s7j.c(cursorN, "msg_link_chat_icon_url");
            int iC23 = s7j.c(cursorN, "msg_link_chat_access_type");
            int iC24 = s7j.c(cursorN, "msg_link_out_chat_id");
            int iC25 = s7j.c(cursorN, "msg_link_out_msg_id");
            int iC26 = s7j.c(cursorN, "type");
            int iC27 = s7j.c(cursorN, "chat_id");
            int iC28 = s7j.c(cursorN, "channel_views");
            int iC29 = s7j.c(cursorN, "channel_forwards");
            int iC30 = s7j.c(cursorN, "view_time");
            int iC31 = s7j.c(cursorN, "options");
            int iC32 = s7j.c(cursorN, "live_until");
            int iC33 = s7j.c(cursorN, "elements");
            int iC34 = s7j.c(cursorN, "reactions");
            int iC35 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
            int iC36 = s7j.c(cursorN, "delayed_attrs_notify_sender");
            int iC37 = s7j.c(cursorN, "reactions_update_time");
            int i3 = iC14;
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                long j2 = cursorN.getLong(iC);
                long j3 = cursorN.getLong(iC2);
                long j4 = cursorN.getLong(iC3);
                long j5 = cursorN.getLong(iC4);
                long j6 = cursorN.getLong(iC5);
                long j7 = cursorN.getLong(iC6);
                Boolean boolValueOf = null;
                String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                int i4 = cursorN.getInt(iC8);
                lq9VarD.b().getClass();
                xi9 xi9VarB = ky9.b(i4);
                int i5 = cursorN.getInt(iC9);
                lq9VarD.b().getClass();
                jm9 jm9VarD = ky9.d(i5);
                long j8 = cursorN.getLong(iC10);
                String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                lq9VarD.b().getClass();
                jdc jdcVarA = ky9.a(blob2);
                int i6 = i3;
                int i7 = cursorN.getInt(i6);
                int i8 = iC12;
                int i9 = iC15;
                boolean z2 = false;
                if (cursorN.getInt(i9) != 0) {
                    iC15 = i9;
                    i = iC16;
                    z = false;
                    z2 = true;
                } else {
                    iC15 = i9;
                    i = iC16;
                    z = false;
                }
                int i10 = cursorN.getInt(i);
                int i11 = i;
                int i12 = iC17;
                long j9 = cursorN.getLong(i12);
                iC17 = i12;
                int i13 = iC18;
                boolean z3 = cursorN.getInt(i13) != 0 ? true : z;
                iC18 = i13;
                int i14 = iC19;
                long j10 = cursorN.getLong(i14);
                iC19 = i14;
                int i15 = iC20;
                String string4 = cursorN.isNull(i15) ? null : cursorN.getString(i15);
                iC20 = i15;
                int i16 = iC21;
                String string5 = cursorN.isNull(i16) ? null : cursorN.getString(i16);
                iC21 = i16;
                int i17 = iC22;
                String string6 = cursorN.isNull(i17) ? null : cursorN.getString(i17);
                iC22 = i17;
                int i18 = iC23;
                Integer numValueOf = cursorN.isNull(i18) ? null : Integer.valueOf(cursorN.getInt(i18));
                lq9VarD.a().getClass();
                int iA = m73.a(numValueOf);
                iC23 = i18;
                int i19 = iC24;
                long j11 = cursorN.getLong(i19);
                iC24 = i19;
                int i20 = iC25;
                long j12 = cursorN.getLong(i20);
                iC25 = i20;
                int i21 = iC26;
                int i22 = cursorN.getInt(i21);
                lq9VarD.b().getClass();
                int iE = ky9.e(i22);
                iC26 = i21;
                int i23 = iC27;
                long j13 = cursorN.getLong(i23);
                iC27 = i23;
                int i24 = iC28;
                int i25 = cursorN.getInt(i24);
                iC28 = i24;
                int i26 = iC29;
                int i27 = cursorN.getInt(i26);
                iC29 = i26;
                int i28 = iC30;
                long j14 = cursorN.getLong(i28);
                iC30 = i28;
                int i29 = iC31;
                int i30 = cursorN.getInt(i29);
                iC31 = i29;
                int i31 = iC32;
                long j15 = cursorN.getLong(i31);
                iC32 = i31;
                int i32 = iC33;
                byte[] blob3 = cursorN.isNull(i32) ? null : cursorN.getBlob(i32);
                lq9VarD.b().getClass();
                List listC = ky9.c(blob3);
                iC33 = i32;
                int i33 = iC34;
                if (cursorN.isNull(i33)) {
                    i2 = i33;
                    blob = null;
                } else {
                    i2 = i33;
                    blob = cursorN.getBlob(i33);
                }
                int i34 = iC13;
                xl9 xl9VarF = lq9VarD.b().f(blob);
                int i35 = iC35;
                Long lValueOf = cursorN.isNull(i35) ? null : Long.valueOf(cursorN.getLong(i35));
                int i36 = iC36;
                Integer numValueOf2 = cursorN.isNull(i36) ? null : Integer.valueOf(cursorN.getInt(i36));
                if (numValueOf2 != null) {
                    if (numValueOf2.intValue() != 0) {
                        z = true;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                iC35 = i35;
                int i37 = iC37;
                iC37 = i37;
                arrayList.add(new gj9(j2, j3, j4, j5, j6, j7, string, xi9VarB, jm9VarD, j8, string2, string3, jdcVarA, i7, z2, i10, j9, z3, j10, string4, string5, string6, iA, j11, j12, iE, j13, i25, i27, j14, i30, j15, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i37)));
                iC36 = i36;
                iC13 = i34;
                iC12 = i8;
                iC16 = i11;
                iC34 = i2;
                i3 = i6;
            }
            cursorN.close();
            dsdVar.y();
            ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(bsdVar.b((gj9) it.next()));
            }
            return arrayList2;
        } catch (Throwable th2) {
            th = th2;
            cursorN.close();
            dsdVar.y();
            throw th;
        }
    }

    public final si9 p(final si9 si9Var, final String str, final gu3 gu3Var) {
        bwd.a(new p6() { // from class: oi9
            @Override // defpackage.p6
            public final void run() {
                gu3 gu3Var2 = gu3Var;
                si9 si9Var2 = si9Var;
                long j = si9Var2.a;
                qi9 qi9Var = this.a;
                qi9Var.r(j, str, gu3Var2);
                qi9Var.b.c(new itg(si9Var2.Z, si9Var2.a, false));
            }
        }, new zi4(str, 1), (j0e) bwd.a.b);
        try {
            x10 x10VarD = si9Var.x0.D();
            to8.t(x10VarD, str, gu3Var);
            ri9 ri9VarO = si9Var.O();
            ri9VarO.n = x10VarD.c();
            return ri9VarO.a();
        } catch (Throwable unused) {
            wqi.e("qi9", "Can't update attach localId = " + str, null);
            return si9Var;
        }
    }

    public final void q(si9 si9Var, String str, p10 p10Var) {
        si9 si9VarP = p(si9Var, str, new dq4(this, 26, p10Var));
        pj9 pj9Var = (pj9) this.f.get();
        si9 si9VarA = si9VarP.O().a();
        pj9Var.getClass();
        pj9.a(pj9Var, si9VarA);
    }

    public final void r(long j, String str, gu3 gu3Var) {
        this.a.c.s(j, new dq4(str, 25, gu3Var));
    }

    public final void s(si9 si9Var, jdc jdcVar) {
        this.a.c.s(si9Var.a, new nl(this, si9Var, jdcVar, 15));
    }

    public final void t(si9 si9Var, xi9 xi9Var) {
        ie4 ie4Var = this.a;
        bsd bsdVar = ie4Var.c;
        bsdVar.d().n(si9Var.a, xi9Var);
        if (xi9Var == xi9.Y && si9Var.t()) {
            ie4Var.c.s(si9Var.a, new sl6(27, this));
        }
    }

    public final void u(long j, long j2, jm9 jm9Var) {
        lq9 lq9VarD = this.a.c.d();
        lrd lrdVar = lq9VarD.a;
        lrdVar.b();
        hq9 hq9Var = lq9VarD.n;
        vk6 vk6VarA = hq9Var.a();
        lq9VarD.b().getClass();
        vk6VarA.k(1, jm9Var.a);
        vk6VarA.k(2, j);
        vk6VarA.k(3, j2);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            hq9Var.r(vk6VarA);
        }
    }

    public final void v(long j, String str, List list, ve2 ve2Var, jm9 jm9Var) throws Throwable {
        lq9 lq9VarD = this.a.c.d();
        ptg ptgVar = new ptg(j, str, list, jm9Var);
        lrd lrdVar = lq9VarD.a;
        lrdVar.b();
        lrdVar.c();
        try {
            lq9VarD.g.A(ptgVar);
            lrdVar.q();
            lrdVar.k();
            si9 si9VarM = m(j);
            if (si9VarM != null) {
                this.e.b(ve2Var.M(si9VarM.Z), si9VarM);
            }
        } catch (Throwable th) {
            lrdVar.k();
            throw th;
        }
    }

    public final void w(long j, long j2) {
        lq9 lq9VarD = this.a.c.d();
        lrd lrdVar = lq9VarD.a;
        lrdVar.b();
        hq9 hq9Var = lq9VarD.m;
        vk6 vk6VarA = hq9Var.a();
        vk6VarA.k(1, j2);
        vk6VarA.k(2, j);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            hq9Var.r(vk6VarA);
        }
    }
}
