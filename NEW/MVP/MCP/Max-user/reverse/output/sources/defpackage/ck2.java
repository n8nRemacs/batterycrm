package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final class ck2 {
    public final z7c a;
    public final ur3 b;
    public final pj9 c;

    public ck2(z7c z7cVar, ur3 ur3Var, pj9 pj9Var) {
        this.a = z7cVar;
        this.b = ur3Var;
        this.c = pj9Var;
    }

    public final List a(long j, long j2, qi9 qi9Var, Set set, boolean z, int i) throws Throwable {
        dsd dsdVar;
        ArrayList arrayList;
        int i2;
        byte[] blob;
        int i3;
        Iterator it;
        Iterator it2;
        String str;
        dsd dsdVar2;
        int i4;
        byte[] blob2;
        int i5;
        int i6;
        String str2;
        bsd bsdVar = qi9Var.a.c;
        lq9 lq9VarD = bsdVar.d();
        List<Long> listSingletonList = Collections.singletonList(Long.valueOf(j));
        lrd lrdVar = lq9VarD.a;
        String str3 = "text";
        if (z) {
            StringBuilder sbM = az1.m("SELECT * FROM messages WHERE chat_id in (");
            int size = listSingletonList.size();
            lc4.a(sbM, size);
            sbM.append(") AND media_type in (");
            int size2 = set.size();
            lc4.a(sbM, size2);
            sbM.append(") AND time <= ");
            sbM.append("?");
            sbM.append(" AND inserted_from_msg_link = 0 AND status <> ");
            int i7 = size + 3 + size2;
            dsd dsdVarC = dsd.c(i7, ctd.j(sbM, "?", " ORDER BY time DESC LIMIT ", "?"));
            int i8 = 1;
            for (Long l : listSingletonList) {
                if (l == null) {
                    dsdVarC.S(i8);
                    i6 = size;
                    str2 = str3;
                } else {
                    i6 = size;
                    str2 = str3;
                    dsdVarC.k(i8, l.longValue());
                }
                i8++;
                str3 = str2;
                size = i6;
            }
            int i9 = size;
            String str4 = str3;
            int i10 = i9 + 1;
            Iterator it3 = set.iterator();
            int i11 = i10;
            while (it3.hasNext()) {
                if (((Integer) it3.next()) == null) {
                    dsdVarC.S(i11);
                    i5 = i10;
                } else {
                    i5 = i10;
                    dsdVarC.k(i11, r13.intValue());
                }
                i11++;
                i10 = i5;
            }
            dsdVarC.k(i10 + size2, j2);
            lq9VarD.b().getClass();
            dsdVarC.k(i9 + 2 + size2, 10);
            dsdVarC.k(i7, i);
            lrdVar.b();
            Cursor cursorN = lrdVar.n(dsdVarC);
            try {
                int iC = s7j.c(cursorN, "id");
                int iC2 = s7j.c(cursorN, "server_id");
                int iC3 = s7j.c(cursorN, "time");
                int iC4 = s7j.c(cursorN, "update_time");
                int iC5 = s7j.c(cursorN, "sender");
                int iC6 = s7j.c(cursorN, "cid");
                int iC7 = s7j.c(cursorN, str4);
                int iC8 = s7j.c(cursorN, "delivery_status");
                int iC9 = s7j.c(cursorN, "status");
                int iC10 = s7j.c(cursorN, "time_local");
                int iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
                int iC12 = s7j.c(cursorN, "localized_error");
                int iC13 = s7j.c(cursorN, "attaches");
                int iC14 = s7j.c(cursorN, "media_type");
                dsdVar2 = dsdVarC;
                try {
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
                    int i12 = iC14;
                    arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        long j3 = cursorN.getLong(iC);
                        long j4 = cursorN.getLong(iC2);
                        long j5 = cursorN.getLong(iC3);
                        long j6 = cursorN.getLong(iC4);
                        long j7 = cursorN.getLong(iC5);
                        long j8 = cursorN.getLong(iC6);
                        String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                        int i13 = cursorN.getInt(iC8);
                        lq9VarD.b().getClass();
                        xi9 xi9VarB = ky9.b(i13);
                        int i14 = cursorN.getInt(iC9);
                        lq9VarD.b().getClass();
                        jm9 jm9VarD = ky9.d(i14);
                        long j9 = cursorN.getLong(iC10);
                        String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                        String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                        byte[] blob3 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                        lq9VarD.b().getClass();
                        jdc jdcVarA = ky9.a(blob3);
                        int i15 = i12;
                        int i16 = cursorN.getInt(i15);
                        int i17 = iC;
                        int i18 = iC15;
                        boolean z2 = cursorN.getInt(i18) != 0;
                        iC15 = i18;
                        int i19 = iC16;
                        int i20 = cursorN.getInt(i19);
                        iC16 = i19;
                        int i21 = iC17;
                        long j10 = cursorN.getLong(i21);
                        iC17 = i21;
                        int i22 = iC18;
                        boolean z3 = cursorN.getInt(i22) != 0;
                        iC18 = i22;
                        int i23 = iC19;
                        long j11 = cursorN.getLong(i23);
                        iC19 = i23;
                        int i24 = iC20;
                        String string4 = cursorN.isNull(i24) ? null : cursorN.getString(i24);
                        iC20 = i24;
                        int i25 = iC21;
                        String string5 = cursorN.isNull(i25) ? null : cursorN.getString(i25);
                        iC21 = i25;
                        int i26 = iC22;
                        String string6 = cursorN.isNull(i26) ? null : cursorN.getString(i26);
                        iC22 = i26;
                        int i27 = iC23;
                        Integer numValueOf = cursorN.isNull(i27) ? null : Integer.valueOf(cursorN.getInt(i27));
                        lq9VarD.a().getClass();
                        int iA = m73.a(numValueOf);
                        iC23 = i27;
                        int i28 = iC24;
                        long j12 = cursorN.getLong(i28);
                        iC24 = i28;
                        int i29 = iC25;
                        long j13 = cursorN.getLong(i29);
                        iC25 = i29;
                        int i30 = iC26;
                        int i31 = cursorN.getInt(i30);
                        lq9VarD.b().getClass();
                        int iE = ky9.e(i31);
                        iC26 = i30;
                        int i32 = iC27;
                        long j14 = cursorN.getLong(i32);
                        iC27 = i32;
                        int i33 = iC28;
                        int i34 = cursorN.getInt(i33);
                        iC28 = i33;
                        int i35 = iC29;
                        int i36 = cursorN.getInt(i35);
                        iC29 = i35;
                        int i37 = iC30;
                        long j15 = cursorN.getLong(i37);
                        iC30 = i37;
                        int i38 = iC31;
                        int i39 = cursorN.getInt(i38);
                        iC31 = i38;
                        int i40 = iC32;
                        long j16 = cursorN.getLong(i40);
                        iC32 = i40;
                        int i41 = iC33;
                        byte[] blob4 = cursorN.isNull(i41) ? null : cursorN.getBlob(i41);
                        lq9VarD.b().getClass();
                        List listC = ky9.c(blob4);
                        iC33 = i41;
                        int i42 = iC34;
                        if (cursorN.isNull(i42)) {
                            i4 = i42;
                            blob2 = null;
                        } else {
                            i4 = i42;
                            blob2 = cursorN.getBlob(i42);
                        }
                        int i43 = iC2;
                        xl9 xl9VarF = lq9VarD.b().f(blob2);
                        int i44 = iC35;
                        Long lValueOf = cursorN.isNull(i44) ? null : Long.valueOf(cursorN.getLong(i44));
                        int i45 = iC36;
                        Integer numValueOf2 = cursorN.isNull(i45) ? null : Integer.valueOf(cursorN.getInt(i45));
                        iC35 = i44;
                        int i46 = iC37;
                        iC37 = i46;
                        arrayList.add(new gj9(j3, j4, j5, j6, j7, j8, string, xi9VarB, jm9VarD, j9, string2, string3, jdcVarA, i16, z2, i20, j10, z3, j11, string4, string5, string6, iA, j12, j13, iE, j14, i34, i36, j15, i39, j16, listC, xl9VarF, lValueOf, numValueOf2 == null ? null : Boolean.valueOf(numValueOf2.intValue() != 0), cursorN.getLong(i46)));
                        iC36 = i45;
                        iC2 = i43;
                        iC = i17;
                        iC34 = i4;
                        i12 = i15;
                    }
                    cursorN.close();
                    dsdVar2.y();
                } catch (Throwable th) {
                    th = th;
                    cursorN.close();
                    dsdVar2.y();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dsdVar2 = dsdVarC;
            }
        } else {
            String str5 = "text";
            StringBuilder sbM2 = az1.m("SELECT * FROM messages WHERE chat_id in (");
            int size3 = listSingletonList.size();
            lc4.a(sbM2, size3);
            sbM2.append(") AND media_type in (");
            int size4 = set.size();
            lc4.a(sbM2, size4);
            sbM2.append(") AND time >= ");
            sbM2.append("?");
            sbM2.append(" AND inserted_from_msg_link = 0 AND status <> ");
            int i47 = size3 + 3 + size4;
            dsd dsdVarC2 = dsd.c(i47, ctd.j(sbM2, "?", " ORDER BY time ASC LIMIT ", "?"));
            Iterator it4 = listSingletonList.iterator();
            int i48 = 1;
            while (it4.hasNext()) {
                Long l2 = (Long) it4.next();
                if (l2 == null) {
                    dsdVarC2.S(i48);
                    it2 = it4;
                    str = str5;
                } else {
                    it2 = it4;
                    str = str5;
                    dsdVarC2.k(i48, l2.longValue());
                }
                i48++;
                it4 = it2;
                str5 = str;
            }
            String str6 = str5;
            int i49 = size3 + 1;
            Iterator it5 = set.iterator();
            int i50 = i49;
            while (it5.hasNext()) {
                if (((Integer) it5.next()) == null) {
                    dsdVarC2.S(i50);
                    i3 = i49;
                    it = it5;
                } else {
                    i3 = i49;
                    it = it5;
                    dsdVarC2.k(i50, r45.intValue());
                }
                i50++;
                i49 = i3;
                it5 = it;
            }
            dsdVarC2.k(i49 + size4, j2);
            lq9VarD.b().getClass();
            dsdVarC2.k(size3 + 2 + size4, 10);
            dsdVarC2.k(i47, i);
            lrdVar.b();
            Cursor cursorN2 = lrdVar.n(dsdVarC2);
            try {
                int iC38 = s7j.c(cursorN2, "id");
                int iC39 = s7j.c(cursorN2, "server_id");
                int iC40 = s7j.c(cursorN2, "time");
                int iC41 = s7j.c(cursorN2, "update_time");
                int iC42 = s7j.c(cursorN2, "sender");
                int iC43 = s7j.c(cursorN2, "cid");
                int iC44 = s7j.c(cursorN2, str6);
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
                    int i51 = iC51;
                    arrayList = new ArrayList(cursorN2.getCount());
                    while (cursorN2.moveToNext()) {
                        long j17 = cursorN2.getLong(iC38);
                        long j18 = cursorN2.getLong(iC39);
                        long j19 = cursorN2.getLong(iC40);
                        long j20 = cursorN2.getLong(iC41);
                        long j21 = cursorN2.getLong(iC42);
                        long j22 = cursorN2.getLong(iC43);
                        String string7 = cursorN2.isNull(iC44) ? null : cursorN2.getString(iC44);
                        int i52 = cursorN2.getInt(iC45);
                        lq9VarD.b().getClass();
                        xi9 xi9VarB2 = ky9.b(i52);
                        int i53 = cursorN2.getInt(iC46);
                        lq9VarD.b().getClass();
                        jm9 jm9VarD2 = ky9.d(i53);
                        long j23 = cursorN2.getLong(iC47);
                        String string8 = cursorN2.isNull(iC48) ? null : cursorN2.getString(iC48);
                        String string9 = cursorN2.isNull(iC49) ? null : cursorN2.getString(iC49);
                        byte[] blob5 = cursorN2.isNull(iC50) ? null : cursorN2.getBlob(iC50);
                        lq9VarD.b().getClass();
                        jdc jdcVarA2 = ky9.a(blob5);
                        int i54 = i51;
                        int i55 = cursorN2.getInt(i54);
                        int i56 = iC38;
                        int i57 = iC52;
                        boolean z4 = cursorN2.getInt(i57) != 0;
                        iC52 = i57;
                        int i58 = iC53;
                        int i59 = cursorN2.getInt(i58);
                        iC53 = i58;
                        int i60 = iC54;
                        long j24 = cursorN2.getLong(i60);
                        iC54 = i60;
                        int i61 = iC55;
                        boolean z5 = cursorN2.getInt(i61) != 0;
                        iC55 = i61;
                        int i62 = iC56;
                        long j25 = cursorN2.getLong(i62);
                        iC56 = i62;
                        int i63 = iC57;
                        String string10 = cursorN2.isNull(i63) ? null : cursorN2.getString(i63);
                        iC57 = i63;
                        int i64 = iC58;
                        String string11 = cursorN2.isNull(i64) ? null : cursorN2.getString(i64);
                        iC58 = i64;
                        int i65 = iC59;
                        String string12 = cursorN2.isNull(i65) ? null : cursorN2.getString(i65);
                        iC59 = i65;
                        int i66 = iC60;
                        Integer numValueOf3 = cursorN2.isNull(i66) ? null : Integer.valueOf(cursorN2.getInt(i66));
                        lq9VarD.a().getClass();
                        int iA2 = m73.a(numValueOf3);
                        iC60 = i66;
                        int i67 = iC61;
                        long j26 = cursorN2.getLong(i67);
                        iC61 = i67;
                        int i68 = iC62;
                        long j27 = cursorN2.getLong(i68);
                        iC62 = i68;
                        int i69 = iC63;
                        int i70 = cursorN2.getInt(i69);
                        lq9VarD.b().getClass();
                        int iE2 = ky9.e(i70);
                        iC63 = i69;
                        int i71 = iC64;
                        long j28 = cursorN2.getLong(i71);
                        iC64 = i71;
                        int i72 = iC65;
                        int i73 = cursorN2.getInt(i72);
                        iC65 = i72;
                        int i74 = iC66;
                        int i75 = cursorN2.getInt(i74);
                        iC66 = i74;
                        int i76 = iC67;
                        long j29 = cursorN2.getLong(i76);
                        iC67 = i76;
                        int i77 = iC68;
                        int i78 = cursorN2.getInt(i77);
                        iC68 = i77;
                        int i79 = iC69;
                        long j30 = cursorN2.getLong(i79);
                        iC69 = i79;
                        int i80 = iC70;
                        byte[] blob6 = cursorN2.isNull(i80) ? null : cursorN2.getBlob(i80);
                        lq9VarD.b().getClass();
                        List listC2 = ky9.c(blob6);
                        iC70 = i80;
                        int i81 = iC71;
                        if (cursorN2.isNull(i81)) {
                            i2 = i81;
                            blob = null;
                        } else {
                            i2 = i81;
                            blob = cursorN2.getBlob(i81);
                        }
                        int i82 = iC39;
                        xl9 xl9VarF2 = lq9VarD.b().f(blob);
                        int i83 = iC72;
                        Long lValueOf2 = cursorN2.isNull(i83) ? null : Long.valueOf(cursorN2.getLong(i83));
                        int i84 = iC73;
                        Integer numValueOf4 = cursorN2.isNull(i84) ? null : Integer.valueOf(cursorN2.getInt(i84));
                        iC72 = i83;
                        int i85 = iC74;
                        iC74 = i85;
                        arrayList.add(new gj9(j17, j18, j19, j20, j21, j22, string7, xi9VarB2, jm9VarD2, j23, string8, string9, jdcVarA2, i55, z4, i59, j24, z5, j25, string10, string11, string12, iA2, j26, j27, iE2, j28, i73, i75, j29, i78, j30, listC2, xl9VarF2, lValueOf2, numValueOf4 == null ? null : Boolean.valueOf(numValueOf4.intValue() != 0), cursorN2.getLong(i85)));
                        iC73 = i84;
                        iC39 = i82;
                        iC38 = i56;
                        iC71 = i2;
                        i51 = i54;
                    }
                    cursorN2.close();
                    dsdVar.y();
                } catch (Throwable th3) {
                    th = th3;
                    cursorN2.close();
                    dsdVar.y();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                dsdVar = dsdVarC2;
            }
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(bsdVar.b((gj9) it6.next()));
        }
        return !arrayList2.isEmpty() ? this.c.b(arrayList2) : Collections.EMPTY_LIST;
    }

    public final boolean b(boolean z) {
        int i = this.a.c.g.getInt("app.media.load.gif", 0);
        return z ? c(i) : i != -1;
    }

    public final boolean c(int i) {
        ur3 ur3Var = this.b;
        boolean zG = ur3Var.g();
        os3 os3VarB = ur3Var.b();
        if (i != -1) {
            os3 os3Var = os3.c;
            if (i != 0) {
                if (os3VarB == os3Var) {
                    return true;
                }
            } else if (os3VarB == os3Var || this.a.c.g.getBoolean("app.media.load.roaming", false) || !zG) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return c(this.a.c.g.getInt("app.media.load.photo", 0));
    }
}
